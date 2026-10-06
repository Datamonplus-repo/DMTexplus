package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultahdrssuspendidas_wcgetfilterdata extends GXProcedure
{
   public consultahdrssuspendidas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultahdrssuspendidas_wcgetfilterdata.class ), "" );
   }

   public consultahdrssuspendidas_wcgetfilterdata( int remoteHandle ,
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
      consultahdrssuspendidas_wcgetfilterdata.this.aP5 = new String[] {""};
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
      consultahdrssuspendidas_wcgetfilterdata.this.AV32DDOName = aP0;
      consultahdrssuspendidas_wcgetfilterdata.this.AV30SearchTxt = aP1;
      consultahdrssuspendidas_wcgetfilterdata.this.AV31SearchTxtTo = aP2;
      consultahdrssuspendidas_wcgetfilterdata.this.aP3 = aP3;
      consultahdrssuspendidas_wcgetfilterdata.this.aP4 = aP4;
      consultahdrssuspendidas_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_STPHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_STPCLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_STPBARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_STPBARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPBARSERDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_STPCOLOR") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPCOLOROPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_STP_MOT") == 0 )
      {
         /* Execute user subroutine: 'LOADSTP_MOTOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_STP_MOTA") == 0 )
      {
         /* Execute user subroutine: 'LOADSTP_MOTAOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("ConsultaHdrsSuspendidas_WCGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultaHdrsSuspendidas_WCGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("ConsultaHdrsSuspendidas_WCGridState"), null, null);
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV10TFStpHdr = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV11TFStpHdr_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV12TFStpClicod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFStpClicod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV14TFStpCliNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV15TFStpCliNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV16TFStpBarser = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV17TFStpBarser_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV18TFStpBarserDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV19TFStpBarserDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV20TFStpColor = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV21TFStpColor_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV22TFStp_Dia = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV24TFStp_Mot = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV25TFStp_Mot_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIAA") == 0 )
         {
            AV26TFStp_DiaA = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA") == 0 )
         {
            AV28TFStp_MotA = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOTA_SEL") == 0 )
         {
            AV29TFStp_MotA_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49Emprcod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIASUSPENSION") == 0 )
         {
            AV50DiaSuspension = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIASUSPENSION_TO") == 0 )
         {
            AV51DiaSuspension_to = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAACTIVACION") == 0 )
         {
            AV52DiaActivacion = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAACTIVACION_TO") == 0 )
         {
            AV53DiaActivacion_to = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSTPHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFStpHdr = AV30SearchTxt ;
      AV11TFStpHdr_Sel = "" ;
      AV59Consultahdrssuspendidas_wcds_1_filterfulltext = AV48FilterFullText ;
      AV60Consultahdrssuspendidas_wcds_2_tfstphdr = AV10TFStpHdr ;
      AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV62Consultahdrssuspendidas_wcds_4_tfstpclicod = AV12TFStpClicod ;
      AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV13TFStpClicod_To ;
      AV64Consultahdrssuspendidas_wcds_6_tfstpclinom = AV14TFStpCliNom ;
      AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV15TFStpCliNom_Sel ;
      AV66Consultahdrssuspendidas_wcds_8_tfstpbarser = AV16TFStpBarser ;
      AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV17TFStpBarser_Sel ;
      AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV18TFStpBarserDsc ;
      AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV19TFStpBarserDsc_Sel ;
      AV70Consultahdrssuspendidas_wcds_12_tfstpcolor = AV20TFStpColor ;
      AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV21TFStpColor_Sel ;
      AV72Consultahdrssuspendidas_wcds_14_tfstp_dia = AV22TFStp_Dia ;
      AV73Consultahdrssuspendidas_wcds_15_tfstp_mot = AV24TFStp_Mot ;
      AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV25TFStp_Mot_Sel ;
      AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV26TFStp_DiaA ;
      AV76Consultahdrssuspendidas_wcds_18_tfstp_mota = AV28TFStp_MotA ;
      AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV29TFStp_MotA_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV50DiaSuspension ,
                                           AV51DiaSuspension_to ,
                                           AV52DiaActivacion ,
                                           AV53DiaActivacion_to ,
                                           AV49Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV66Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV70Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV60Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV73Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV73Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV76Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor P09643 */
      pr_default.execute(0, new Object[] {AV49Emprcod, AV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV64Consultahdrssuspendidas_wcds_6_tfstpclinom, lV64Consultahdrssuspendidas_wcds_6_tfstpclinom, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV66Consultahdrssuspendidas_wcds_8_tfstpbarser, lV66Consultahdrssuspendidas_wcds_8_tfstpbarser, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV70Consultahdrssuspendidas_wcds_12_tfstpcolor, lV70Consultahdrssuspendidas_wcds_12_tfstpcolor, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, lV60Consultahdrssuspendidas_wcds_2_tfstphdr, AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV72Consultahdrssuspendidas_wcds_14_tfstp_dia, lV73Consultahdrssuspendidas_wcds_15_tfstp_mot, AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV76Consultahdrssuspendidas_wcds_18_tfstp_mota, AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09643_A396EmprCod[0] ;
         A10757Stp_MotA = P09643_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P09643_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P09643_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09643_A10751Stp_Dia[0] ;
         A13723StpHdr = P09643_A13723StpHdr[0] ;
         A13728StpColor = P09643_A13728StpColor[0] ;
         n13728StpColor = P09643_n13728StpColor[0] ;
         A13725StpBarserD = P09643_A13725StpBarserD[0] ;
         n13725StpBarserD = P09643_n13725StpBarserD[0] ;
         A13724StpBarser = P09643_A13724StpBarser[0] ;
         n13724StpBarser = P09643_n13724StpBarser[0] ;
         A13727StpCliNom = P09643_A13727StpCliNom[0] ;
         n13727StpCliNom = P09643_n13727StpCliNom[0] ;
         A13726StpClicod = P09643_A13726StpClicod[0] ;
         n13726StpClicod = P09643_n13726StpClicod[0] ;
         A10746Stp_hdr = P09643_A10746Stp_hdr[0] ;
         A10747Stp_r = P09643_A10747Stp_r[0] ;
         A10748Stp_p = P09643_A10748Stp_p[0] ;
         A10750Stp_Lin = P09643_A10750Stp_Lin[0] ;
         A13723StpHdr = P09643_A13723StpHdr[0] ;
         A13728StpColor = P09643_A13728StpColor[0] ;
         n13728StpColor = P09643_n13728StpColor[0] ;
         A13725StpBarserD = P09643_A13725StpBarserD[0] ;
         n13725StpBarserD = P09643_n13725StpBarserD[0] ;
         A13724StpBarser = P09643_A13724StpBarser[0] ;
         n13724StpBarser = P09643_n13724StpBarser[0] ;
         A13726StpClicod = P09643_A13726StpClicod[0] ;
         n13726StpClicod = P09643_n13726StpClicod[0] ;
         A13727StpCliNom = P09643_A13727StpCliNom[0] ;
         n13727StpCliNom = P09643_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV50DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV50DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV51DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV51DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV52DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV52DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV53DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV53DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53DiaActivacion_to)) )
                  {
                     if ( ! (GXutil.strcmp("", A13723StpHdr)==0) )
                     {
                        AV34Option = A13723StpHdr ;
                        AV33InsertIndex = 1 ;
                        while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
                        {
                           AV33InsertIndex = (int)(AV33InsertIndex+1) ;
                        }
                        if ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) == 0 ) )
                        {
                           AV42count = GXutil.lval( (String)AV40OptionIndexes.elementAt(-1+AV33InsertIndex)) ;
                           AV42count = (long)(AV42count+1) ;
                           AV40OptionIndexes.removeItem(AV33InsertIndex);
                           AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
                        }
                        else
                        {
                           AV35Options.add(AV34Option, AV33InsertIndex);
                           AV40OptionIndexes.add("1", AV33InsertIndex);
                        }
                     }
                     if ( AV35Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADSTPCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFStpCliNom = AV30SearchTxt ;
      AV15TFStpCliNom_Sel = "" ;
      AV59Consultahdrssuspendidas_wcds_1_filterfulltext = AV48FilterFullText ;
      AV60Consultahdrssuspendidas_wcds_2_tfstphdr = AV10TFStpHdr ;
      AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV62Consultahdrssuspendidas_wcds_4_tfstpclicod = AV12TFStpClicod ;
      AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV13TFStpClicod_To ;
      AV64Consultahdrssuspendidas_wcds_6_tfstpclinom = AV14TFStpCliNom ;
      AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV15TFStpCliNom_Sel ;
      AV66Consultahdrssuspendidas_wcds_8_tfstpbarser = AV16TFStpBarser ;
      AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV17TFStpBarser_Sel ;
      AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV18TFStpBarserDsc ;
      AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV19TFStpBarserDsc_Sel ;
      AV70Consultahdrssuspendidas_wcds_12_tfstpcolor = AV20TFStpColor ;
      AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV21TFStpColor_Sel ;
      AV72Consultahdrssuspendidas_wcds_14_tfstp_dia = AV22TFStp_Dia ;
      AV73Consultahdrssuspendidas_wcds_15_tfstp_mot = AV24TFStp_Mot ;
      AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV25TFStp_Mot_Sel ;
      AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV26TFStp_DiaA ;
      AV76Consultahdrssuspendidas_wcds_18_tfstp_mota = AV28TFStp_MotA ;
      AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV29TFStp_MotA_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV50DiaSuspension ,
                                           AV51DiaSuspension_to ,
                                           AV52DiaActivacion ,
                                           AV53DiaActivacion_to ,
                                           AV49Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV66Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV70Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV60Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV73Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV73Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV76Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor P09645 */
      pr_default.execute(1, new Object[] {AV49Emprcod, AV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV64Consultahdrssuspendidas_wcds_6_tfstpclinom, lV64Consultahdrssuspendidas_wcds_6_tfstpclinom, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV66Consultahdrssuspendidas_wcds_8_tfstpbarser, lV66Consultahdrssuspendidas_wcds_8_tfstpbarser, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV70Consultahdrssuspendidas_wcds_12_tfstpcolor, lV70Consultahdrssuspendidas_wcds_12_tfstpcolor, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, lV60Consultahdrssuspendidas_wcds_2_tfstphdr, AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV72Consultahdrssuspendidas_wcds_14_tfstp_dia, lV73Consultahdrssuspendidas_wcds_15_tfstp_mot, AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV76Consultahdrssuspendidas_wcds_18_tfstp_mota, AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P09645_A396EmprCod[0] ;
         A10757Stp_MotA = P09645_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P09645_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P09645_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09645_A10751Stp_Dia[0] ;
         A13723StpHdr = P09645_A13723StpHdr[0] ;
         A13728StpColor = P09645_A13728StpColor[0] ;
         n13728StpColor = P09645_n13728StpColor[0] ;
         A13725StpBarserD = P09645_A13725StpBarserD[0] ;
         n13725StpBarserD = P09645_n13725StpBarserD[0] ;
         A13724StpBarser = P09645_A13724StpBarser[0] ;
         n13724StpBarser = P09645_n13724StpBarser[0] ;
         A13727StpCliNom = P09645_A13727StpCliNom[0] ;
         n13727StpCliNom = P09645_n13727StpCliNom[0] ;
         A13726StpClicod = P09645_A13726StpClicod[0] ;
         n13726StpClicod = P09645_n13726StpClicod[0] ;
         A10746Stp_hdr = P09645_A10746Stp_hdr[0] ;
         A10747Stp_r = P09645_A10747Stp_r[0] ;
         A10748Stp_p = P09645_A10748Stp_p[0] ;
         A10750Stp_Lin = P09645_A10750Stp_Lin[0] ;
         A13723StpHdr = P09645_A13723StpHdr[0] ;
         A13728StpColor = P09645_A13728StpColor[0] ;
         n13728StpColor = P09645_n13728StpColor[0] ;
         A13725StpBarserD = P09645_A13725StpBarserD[0] ;
         n13725StpBarserD = P09645_n13725StpBarserD[0] ;
         A13724StpBarser = P09645_A13724StpBarser[0] ;
         n13724StpBarser = P09645_n13724StpBarser[0] ;
         A13726StpClicod = P09645_A13726StpClicod[0] ;
         n13726StpClicod = P09645_n13726StpClicod[0] ;
         A13727StpCliNom = P09645_A13727StpCliNom[0] ;
         n13727StpCliNom = P09645_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV50DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV50DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV51DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV51DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV52DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV52DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV53DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV53DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53DiaActivacion_to)) )
                  {
                     if ( ! (GXutil.strcmp("", A13727StpCliNom)==0) )
                     {
                        AV34Option = A13727StpCliNom ;
                        AV33InsertIndex = 1 ;
                        while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
                        {
                           AV33InsertIndex = (int)(AV33InsertIndex+1) ;
                        }
                        if ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) == 0 ) )
                        {
                           AV42count = GXutil.lval( (String)AV40OptionIndexes.elementAt(-1+AV33InsertIndex)) ;
                           AV42count = (long)(AV42count+1) ;
                           AV40OptionIndexes.removeItem(AV33InsertIndex);
                           AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
                        }
                        else
                        {
                           AV35Options.add(AV34Option, AV33InsertIndex);
                           AV40OptionIndexes.add("1", AV33InsertIndex);
                        }
                     }
                     if ( AV35Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
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
      /* 'LOADSTPBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV16TFStpBarser = AV30SearchTxt ;
      AV17TFStpBarser_Sel = "" ;
      AV59Consultahdrssuspendidas_wcds_1_filterfulltext = AV48FilterFullText ;
      AV60Consultahdrssuspendidas_wcds_2_tfstphdr = AV10TFStpHdr ;
      AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV62Consultahdrssuspendidas_wcds_4_tfstpclicod = AV12TFStpClicod ;
      AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV13TFStpClicod_To ;
      AV64Consultahdrssuspendidas_wcds_6_tfstpclinom = AV14TFStpCliNom ;
      AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV15TFStpCliNom_Sel ;
      AV66Consultahdrssuspendidas_wcds_8_tfstpbarser = AV16TFStpBarser ;
      AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV17TFStpBarser_Sel ;
      AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV18TFStpBarserDsc ;
      AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV19TFStpBarserDsc_Sel ;
      AV70Consultahdrssuspendidas_wcds_12_tfstpcolor = AV20TFStpColor ;
      AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV21TFStpColor_Sel ;
      AV72Consultahdrssuspendidas_wcds_14_tfstp_dia = AV22TFStp_Dia ;
      AV73Consultahdrssuspendidas_wcds_15_tfstp_mot = AV24TFStp_Mot ;
      AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV25TFStp_Mot_Sel ;
      AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV26TFStp_DiaA ;
      AV76Consultahdrssuspendidas_wcds_18_tfstp_mota = AV28TFStp_MotA ;
      AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV29TFStp_MotA_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV50DiaSuspension ,
                                           AV51DiaSuspension_to ,
                                           AV52DiaActivacion ,
                                           AV53DiaActivacion_to ,
                                           AV49Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV66Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV70Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV60Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV73Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV73Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV76Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor P09647 */
      pr_default.execute(2, new Object[] {AV49Emprcod, AV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV64Consultahdrssuspendidas_wcds_6_tfstpclinom, lV64Consultahdrssuspendidas_wcds_6_tfstpclinom, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV66Consultahdrssuspendidas_wcds_8_tfstpbarser, lV66Consultahdrssuspendidas_wcds_8_tfstpbarser, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV70Consultahdrssuspendidas_wcds_12_tfstpcolor, lV70Consultahdrssuspendidas_wcds_12_tfstpcolor, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, lV60Consultahdrssuspendidas_wcds_2_tfstphdr, AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV72Consultahdrssuspendidas_wcds_14_tfstp_dia, lV73Consultahdrssuspendidas_wcds_15_tfstp_mot, AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV76Consultahdrssuspendidas_wcds_18_tfstp_mota, AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P09647_A396EmprCod[0] ;
         A10757Stp_MotA = P09647_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P09647_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P09647_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09647_A10751Stp_Dia[0] ;
         A13723StpHdr = P09647_A13723StpHdr[0] ;
         A13728StpColor = P09647_A13728StpColor[0] ;
         n13728StpColor = P09647_n13728StpColor[0] ;
         A13725StpBarserD = P09647_A13725StpBarserD[0] ;
         n13725StpBarserD = P09647_n13725StpBarserD[0] ;
         A13724StpBarser = P09647_A13724StpBarser[0] ;
         n13724StpBarser = P09647_n13724StpBarser[0] ;
         A13727StpCliNom = P09647_A13727StpCliNom[0] ;
         n13727StpCliNom = P09647_n13727StpCliNom[0] ;
         A13726StpClicod = P09647_A13726StpClicod[0] ;
         n13726StpClicod = P09647_n13726StpClicod[0] ;
         A10746Stp_hdr = P09647_A10746Stp_hdr[0] ;
         A10747Stp_r = P09647_A10747Stp_r[0] ;
         A10748Stp_p = P09647_A10748Stp_p[0] ;
         A10750Stp_Lin = P09647_A10750Stp_Lin[0] ;
         A13723StpHdr = P09647_A13723StpHdr[0] ;
         A13728StpColor = P09647_A13728StpColor[0] ;
         n13728StpColor = P09647_n13728StpColor[0] ;
         A13725StpBarserD = P09647_A13725StpBarserD[0] ;
         n13725StpBarserD = P09647_n13725StpBarserD[0] ;
         A13724StpBarser = P09647_A13724StpBarser[0] ;
         n13724StpBarser = P09647_n13724StpBarser[0] ;
         A13726StpClicod = P09647_A13726StpClicod[0] ;
         n13726StpClicod = P09647_n13726StpClicod[0] ;
         A13727StpCliNom = P09647_A13727StpCliNom[0] ;
         n13727StpCliNom = P09647_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV50DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV50DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV51DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV51DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV52DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV52DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV53DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV53DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53DiaActivacion_to)) )
                  {
                     if ( ! (GXutil.strcmp("", A13724StpBarser)==0) )
                     {
                        AV34Option = A13724StpBarser ;
                        AV33InsertIndex = 1 ;
                        while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
                        {
                           AV33InsertIndex = (int)(AV33InsertIndex+1) ;
                        }
                        if ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) == 0 ) )
                        {
                           AV42count = GXutil.lval( (String)AV40OptionIndexes.elementAt(-1+AV33InsertIndex)) ;
                           AV42count = (long)(AV42count+1) ;
                           AV40OptionIndexes.removeItem(AV33InsertIndex);
                           AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
                        }
                        else
                        {
                           AV35Options.add(AV34Option, AV33InsertIndex);
                           AV40OptionIndexes.add("1", AV33InsertIndex);
                        }
                     }
                     if ( AV35Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADSTPBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFStpBarserDsc = AV30SearchTxt ;
      AV19TFStpBarserDsc_Sel = "" ;
      AV59Consultahdrssuspendidas_wcds_1_filterfulltext = AV48FilterFullText ;
      AV60Consultahdrssuspendidas_wcds_2_tfstphdr = AV10TFStpHdr ;
      AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV62Consultahdrssuspendidas_wcds_4_tfstpclicod = AV12TFStpClicod ;
      AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV13TFStpClicod_To ;
      AV64Consultahdrssuspendidas_wcds_6_tfstpclinom = AV14TFStpCliNom ;
      AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV15TFStpCliNom_Sel ;
      AV66Consultahdrssuspendidas_wcds_8_tfstpbarser = AV16TFStpBarser ;
      AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV17TFStpBarser_Sel ;
      AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV18TFStpBarserDsc ;
      AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV19TFStpBarserDsc_Sel ;
      AV70Consultahdrssuspendidas_wcds_12_tfstpcolor = AV20TFStpColor ;
      AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV21TFStpColor_Sel ;
      AV72Consultahdrssuspendidas_wcds_14_tfstp_dia = AV22TFStp_Dia ;
      AV73Consultahdrssuspendidas_wcds_15_tfstp_mot = AV24TFStp_Mot ;
      AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV25TFStp_Mot_Sel ;
      AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV26TFStp_DiaA ;
      AV76Consultahdrssuspendidas_wcds_18_tfstp_mota = AV28TFStp_MotA ;
      AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV29TFStp_MotA_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV50DiaSuspension ,
                                           AV51DiaSuspension_to ,
                                           AV52DiaActivacion ,
                                           AV53DiaActivacion_to ,
                                           AV49Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV66Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV70Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV60Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV73Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV73Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV76Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor P09649 */
      pr_default.execute(3, new Object[] {AV49Emprcod, AV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV64Consultahdrssuspendidas_wcds_6_tfstpclinom, lV64Consultahdrssuspendidas_wcds_6_tfstpclinom, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV66Consultahdrssuspendidas_wcds_8_tfstpbarser, lV66Consultahdrssuspendidas_wcds_8_tfstpbarser, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV70Consultahdrssuspendidas_wcds_12_tfstpcolor, lV70Consultahdrssuspendidas_wcds_12_tfstpcolor, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, lV60Consultahdrssuspendidas_wcds_2_tfstphdr, AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV72Consultahdrssuspendidas_wcds_14_tfstp_dia, lV73Consultahdrssuspendidas_wcds_15_tfstp_mot, AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV76Consultahdrssuspendidas_wcds_18_tfstp_mota, AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P09649_A396EmprCod[0] ;
         A10757Stp_MotA = P09649_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P09649_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P09649_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09649_A10751Stp_Dia[0] ;
         A13723StpHdr = P09649_A13723StpHdr[0] ;
         A13728StpColor = P09649_A13728StpColor[0] ;
         n13728StpColor = P09649_n13728StpColor[0] ;
         A13725StpBarserD = P09649_A13725StpBarserD[0] ;
         n13725StpBarserD = P09649_n13725StpBarserD[0] ;
         A13724StpBarser = P09649_A13724StpBarser[0] ;
         n13724StpBarser = P09649_n13724StpBarser[0] ;
         A13727StpCliNom = P09649_A13727StpCliNom[0] ;
         n13727StpCliNom = P09649_n13727StpCliNom[0] ;
         A13726StpClicod = P09649_A13726StpClicod[0] ;
         n13726StpClicod = P09649_n13726StpClicod[0] ;
         A10746Stp_hdr = P09649_A10746Stp_hdr[0] ;
         A10747Stp_r = P09649_A10747Stp_r[0] ;
         A10748Stp_p = P09649_A10748Stp_p[0] ;
         A10750Stp_Lin = P09649_A10750Stp_Lin[0] ;
         A13723StpHdr = P09649_A13723StpHdr[0] ;
         A13728StpColor = P09649_A13728StpColor[0] ;
         n13728StpColor = P09649_n13728StpColor[0] ;
         A13725StpBarserD = P09649_A13725StpBarserD[0] ;
         n13725StpBarserD = P09649_n13725StpBarserD[0] ;
         A13724StpBarser = P09649_A13724StpBarser[0] ;
         n13724StpBarser = P09649_n13724StpBarser[0] ;
         A13726StpClicod = P09649_A13726StpClicod[0] ;
         n13726StpClicod = P09649_n13726StpClicod[0] ;
         A13727StpCliNom = P09649_A13727StpCliNom[0] ;
         n13727StpCliNom = P09649_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV50DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV50DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV51DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV51DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV52DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV52DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV53DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV53DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53DiaActivacion_to)) )
                  {
                     if ( ! (GXutil.strcmp("", A13725StpBarserD)==0) )
                     {
                        AV34Option = A13725StpBarserD ;
                        AV33InsertIndex = 1 ;
                        while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
                        {
                           AV33InsertIndex = (int)(AV33InsertIndex+1) ;
                        }
                        if ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) == 0 ) )
                        {
                           AV42count = GXutil.lval( (String)AV40OptionIndexes.elementAt(-1+AV33InsertIndex)) ;
                           AV42count = (long)(AV42count+1) ;
                           AV40OptionIndexes.removeItem(AV33InsertIndex);
                           AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
                        }
                        else
                        {
                           AV35Options.add(AV34Option, AV33InsertIndex);
                           AV40OptionIndexes.add("1", AV33InsertIndex);
                        }
                     }
                     if ( AV35Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADSTPCOLOROPTIONS' Routine */
      returnInSub = false ;
      AV20TFStpColor = AV30SearchTxt ;
      AV21TFStpColor_Sel = "" ;
      AV59Consultahdrssuspendidas_wcds_1_filterfulltext = AV48FilterFullText ;
      AV60Consultahdrssuspendidas_wcds_2_tfstphdr = AV10TFStpHdr ;
      AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV62Consultahdrssuspendidas_wcds_4_tfstpclicod = AV12TFStpClicod ;
      AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV13TFStpClicod_To ;
      AV64Consultahdrssuspendidas_wcds_6_tfstpclinom = AV14TFStpCliNom ;
      AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV15TFStpCliNom_Sel ;
      AV66Consultahdrssuspendidas_wcds_8_tfstpbarser = AV16TFStpBarser ;
      AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV17TFStpBarser_Sel ;
      AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV18TFStpBarserDsc ;
      AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV19TFStpBarserDsc_Sel ;
      AV70Consultahdrssuspendidas_wcds_12_tfstpcolor = AV20TFStpColor ;
      AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV21TFStpColor_Sel ;
      AV72Consultahdrssuspendidas_wcds_14_tfstp_dia = AV22TFStp_Dia ;
      AV73Consultahdrssuspendidas_wcds_15_tfstp_mot = AV24TFStp_Mot ;
      AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV25TFStp_Mot_Sel ;
      AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV26TFStp_DiaA ;
      AV76Consultahdrssuspendidas_wcds_18_tfstp_mota = AV28TFStp_MotA ;
      AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV29TFStp_MotA_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV50DiaSuspension ,
                                           AV51DiaSuspension_to ,
                                           AV52DiaActivacion ,
                                           AV53DiaActivacion_to ,
                                           AV49Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV66Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV70Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV60Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV73Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV73Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV76Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor P096411 */
      pr_default.execute(4, new Object[] {AV49Emprcod, AV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV64Consultahdrssuspendidas_wcds_6_tfstpclinom, lV64Consultahdrssuspendidas_wcds_6_tfstpclinom, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV66Consultahdrssuspendidas_wcds_8_tfstpbarser, lV66Consultahdrssuspendidas_wcds_8_tfstpbarser, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV70Consultahdrssuspendidas_wcds_12_tfstpcolor, lV70Consultahdrssuspendidas_wcds_12_tfstpcolor, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, lV60Consultahdrssuspendidas_wcds_2_tfstphdr, AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV72Consultahdrssuspendidas_wcds_14_tfstp_dia, lV73Consultahdrssuspendidas_wcds_15_tfstp_mot, AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV76Consultahdrssuspendidas_wcds_18_tfstp_mota, AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P096411_A396EmprCod[0] ;
         A10757Stp_MotA = P096411_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P096411_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P096411_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P096411_A10751Stp_Dia[0] ;
         A13723StpHdr = P096411_A13723StpHdr[0] ;
         A13728StpColor = P096411_A13728StpColor[0] ;
         n13728StpColor = P096411_n13728StpColor[0] ;
         A13725StpBarserD = P096411_A13725StpBarserD[0] ;
         n13725StpBarserD = P096411_n13725StpBarserD[0] ;
         A13724StpBarser = P096411_A13724StpBarser[0] ;
         n13724StpBarser = P096411_n13724StpBarser[0] ;
         A13727StpCliNom = P096411_A13727StpCliNom[0] ;
         n13727StpCliNom = P096411_n13727StpCliNom[0] ;
         A13726StpClicod = P096411_A13726StpClicod[0] ;
         n13726StpClicod = P096411_n13726StpClicod[0] ;
         A10746Stp_hdr = P096411_A10746Stp_hdr[0] ;
         A10747Stp_r = P096411_A10747Stp_r[0] ;
         A10748Stp_p = P096411_A10748Stp_p[0] ;
         A10750Stp_Lin = P096411_A10750Stp_Lin[0] ;
         A13723StpHdr = P096411_A13723StpHdr[0] ;
         A13728StpColor = P096411_A13728StpColor[0] ;
         n13728StpColor = P096411_n13728StpColor[0] ;
         A13725StpBarserD = P096411_A13725StpBarserD[0] ;
         n13725StpBarserD = P096411_n13725StpBarserD[0] ;
         A13724StpBarser = P096411_A13724StpBarser[0] ;
         n13724StpBarser = P096411_n13724StpBarser[0] ;
         A13726StpClicod = P096411_A13726StpClicod[0] ;
         n13726StpClicod = P096411_n13726StpClicod[0] ;
         A13727StpCliNom = P096411_A13727StpCliNom[0] ;
         n13727StpCliNom = P096411_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV50DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV50DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV51DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV51DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV52DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV52DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV53DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV53DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53DiaActivacion_to)) )
                  {
                     if ( ! (GXutil.strcmp("", A13728StpColor)==0) )
                     {
                        AV34Option = A13728StpColor ;
                        AV33InsertIndex = 1 ;
                        while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
                        {
                           AV33InsertIndex = (int)(AV33InsertIndex+1) ;
                        }
                        if ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) == 0 ) )
                        {
                           AV42count = GXutil.lval( (String)AV40OptionIndexes.elementAt(-1+AV33InsertIndex)) ;
                           AV42count = (long)(AV42count+1) ;
                           AV40OptionIndexes.removeItem(AV33InsertIndex);
                           AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
                        }
                        else
                        {
                           AV35Options.add(AV34Option, AV33InsertIndex);
                           AV40OptionIndexes.add("1", AV33InsertIndex);
                        }
                     }
                     if ( AV35Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADSTP_MOTOPTIONS' Routine */
      returnInSub = false ;
      AV24TFStp_Mot = AV30SearchTxt ;
      AV25TFStp_Mot_Sel = "" ;
      AV59Consultahdrssuspendidas_wcds_1_filterfulltext = AV48FilterFullText ;
      AV60Consultahdrssuspendidas_wcds_2_tfstphdr = AV10TFStpHdr ;
      AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV62Consultahdrssuspendidas_wcds_4_tfstpclicod = AV12TFStpClicod ;
      AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV13TFStpClicod_To ;
      AV64Consultahdrssuspendidas_wcds_6_tfstpclinom = AV14TFStpCliNom ;
      AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV15TFStpCliNom_Sel ;
      AV66Consultahdrssuspendidas_wcds_8_tfstpbarser = AV16TFStpBarser ;
      AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV17TFStpBarser_Sel ;
      AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV18TFStpBarserDsc ;
      AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV19TFStpBarserDsc_Sel ;
      AV70Consultahdrssuspendidas_wcds_12_tfstpcolor = AV20TFStpColor ;
      AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV21TFStpColor_Sel ;
      AV72Consultahdrssuspendidas_wcds_14_tfstp_dia = AV22TFStp_Dia ;
      AV73Consultahdrssuspendidas_wcds_15_tfstp_mot = AV24TFStp_Mot ;
      AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV25TFStp_Mot_Sel ;
      AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV26TFStp_DiaA ;
      AV76Consultahdrssuspendidas_wcds_18_tfstp_mota = AV28TFStp_MotA ;
      AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV29TFStp_MotA_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV50DiaSuspension ,
                                           AV51DiaSuspension_to ,
                                           AV52DiaActivacion ,
                                           AV53DiaActivacion_to ,
                                           A396EmprCod ,
                                           AV49Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV66Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV70Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV60Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV73Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV73Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV76Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor P096413 */
      pr_default.execute(5, new Object[] {AV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV64Consultahdrssuspendidas_wcds_6_tfstpclinom, lV64Consultahdrssuspendidas_wcds_6_tfstpclinom, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV66Consultahdrssuspendidas_wcds_8_tfstpbarser, lV66Consultahdrssuspendidas_wcds_8_tfstpbarser, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV70Consultahdrssuspendidas_wcds_12_tfstpcolor, lV70Consultahdrssuspendidas_wcds_12_tfstpcolor, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV49Emprcod, lV60Consultahdrssuspendidas_wcds_2_tfstphdr, AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV72Consultahdrssuspendidas_wcds_14_tfstp_dia, lV73Consultahdrssuspendidas_wcds_15_tfstp_mot, AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV76Consultahdrssuspendidas_wcds_18_tfstp_mota, AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9647 = false ;
         A396EmprCod = P096413_A396EmprCod[0] ;
         A10752Stp_Mot = P096413_A10752Stp_Mot[0] ;
         A10757Stp_MotA = P096413_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P096413_A10756Stp_DiaA[0] ;
         A10751Stp_Dia = P096413_A10751Stp_Dia[0] ;
         A13723StpHdr = P096413_A13723StpHdr[0] ;
         A13728StpColor = P096413_A13728StpColor[0] ;
         n13728StpColor = P096413_n13728StpColor[0] ;
         A13725StpBarserD = P096413_A13725StpBarserD[0] ;
         n13725StpBarserD = P096413_n13725StpBarserD[0] ;
         A13724StpBarser = P096413_A13724StpBarser[0] ;
         n13724StpBarser = P096413_n13724StpBarser[0] ;
         A13727StpCliNom = P096413_A13727StpCliNom[0] ;
         n13727StpCliNom = P096413_n13727StpCliNom[0] ;
         A13726StpClicod = P096413_A13726StpClicod[0] ;
         n13726StpClicod = P096413_n13726StpClicod[0] ;
         A10746Stp_hdr = P096413_A10746Stp_hdr[0] ;
         A10747Stp_r = P096413_A10747Stp_r[0] ;
         A10748Stp_p = P096413_A10748Stp_p[0] ;
         A10750Stp_Lin = P096413_A10750Stp_Lin[0] ;
         A13723StpHdr = P096413_A13723StpHdr[0] ;
         A13728StpColor = P096413_A13728StpColor[0] ;
         n13728StpColor = P096413_n13728StpColor[0] ;
         A13725StpBarserD = P096413_A13725StpBarserD[0] ;
         n13725StpBarserD = P096413_n13725StpBarserD[0] ;
         A13724StpBarser = P096413_A13724StpBarser[0] ;
         n13724StpBarser = P096413_n13724StpBarser[0] ;
         A13726StpClicod = P096413_A13726StpClicod[0] ;
         n13726StpClicod = P096413_n13726StpClicod[0] ;
         A13727StpCliNom = P096413_A13727StpCliNom[0] ;
         n13727StpCliNom = P096413_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV50DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV50DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV51DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV51DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV52DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV52DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV53DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV53DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53DiaActivacion_to)) )
                  {
                     AV42count = 0 ;
                     while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P096413_A10752Stp_Mot[0], A10752Stp_Mot) == 0 ) )
                     {
                        brk9647 = false ;
                        A396EmprCod = P096413_A396EmprCod[0] ;
                        A10746Stp_hdr = P096413_A10746Stp_hdr[0] ;
                        A10747Stp_r = P096413_A10747Stp_r[0] ;
                        A10748Stp_p = P096413_A10748Stp_p[0] ;
                        A10750Stp_Lin = P096413_A10750Stp_Lin[0] ;
                        AV42count = (long)(AV42count+1) ;
                        brk9647 = true ;
                        pr_default.readNext(5);
                     }
                     if ( ! (GXutil.strcmp("", A10752Stp_Mot)==0) )
                     {
                        AV34Option = A10752Stp_Mot ;
                        AV35Options.add(AV34Option, 0);
                        AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV35Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9647 )
         {
            brk9647 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADSTP_MOTAOPTIONS' Routine */
      returnInSub = false ;
      AV28TFStp_MotA = AV30SearchTxt ;
      AV29TFStp_MotA_Sel = "" ;
      AV59Consultahdrssuspendidas_wcds_1_filterfulltext = AV48FilterFullText ;
      AV60Consultahdrssuspendidas_wcds_2_tfstphdr = AV10TFStpHdr ;
      AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel = AV11TFStpHdr_Sel ;
      AV62Consultahdrssuspendidas_wcds_4_tfstpclicod = AV12TFStpClicod ;
      AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to = AV13TFStpClicod_To ;
      AV64Consultahdrssuspendidas_wcds_6_tfstpclinom = AV14TFStpCliNom ;
      AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = AV15TFStpCliNom_Sel ;
      AV66Consultahdrssuspendidas_wcds_8_tfstpbarser = AV16TFStpBarser ;
      AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = AV17TFStpBarser_Sel ;
      AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = AV18TFStpBarserDsc ;
      AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = AV19TFStpBarserDsc_Sel ;
      AV70Consultahdrssuspendidas_wcds_12_tfstpcolor = AV20TFStpColor ;
      AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = AV21TFStpColor_Sel ;
      AV72Consultahdrssuspendidas_wcds_14_tfstp_dia = AV22TFStp_Dia ;
      AV73Consultahdrssuspendidas_wcds_15_tfstp_mot = AV24TFStp_Mot ;
      AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = AV25TFStp_Mot_Sel ;
      AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa = AV26TFStp_DiaA ;
      AV76Consultahdrssuspendidas_wcds_18_tfstp_mota = AV28TFStp_MotA ;
      AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = AV29TFStp_MotA_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           A10756Stp_DiaA ,
                                           A10757Stp_MotA ,
                                           AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod) ,
                                           Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to) ,
                                           AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           AV50DiaSuspension ,
                                           AV51DiaSuspension_to ,
                                           AV52DiaActivacion ,
                                           AV53DiaActivacion_to ,
                                           A396EmprCod ,
                                           AV49Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Consultahdrssuspendidas_wcds_1_filterfulltext), "%", "") ;
      lV64Consultahdrssuspendidas_wcds_6_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Consultahdrssuspendidas_wcds_6_tfstpclinom), 30, "%") ;
      lV66Consultahdrssuspendidas_wcds_8_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Consultahdrssuspendidas_wcds_8_tfstpbarser), 16, "%") ;
      lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc), 26, "%") ;
      lV70Consultahdrssuspendidas_wcds_12_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Consultahdrssuspendidas_wcds_12_tfstpcolor), 13, "%") ;
      lV60Consultahdrssuspendidas_wcds_2_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Consultahdrssuspendidas_wcds_2_tfstphdr), 11, "%") ;
      lV73Consultahdrssuspendidas_wcds_15_tfstp_mot = GXutil.concat( GXutil.rtrim( AV73Consultahdrssuspendidas_wcds_15_tfstp_mot), "%", "") ;
      lV76Consultahdrssuspendidas_wcds_18_tfstp_mota = GXutil.concat( GXutil.rtrim( AV76Consultahdrssuspendidas_wcds_18_tfstp_mota), "%", "") ;
      /* Using cursor P096415 */
      pr_default.execute(6, new Object[] {AV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, lV59Consultahdrssuspendidas_wcds_1_filterfulltext, Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV62Consultahdrssuspendidas_wcds_4_tfstpclicod), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), Integer.valueOf(AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to), AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV64Consultahdrssuspendidas_wcds_6_tfstpclinom, lV64Consultahdrssuspendidas_wcds_6_tfstpclinom, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV66Consultahdrssuspendidas_wcds_8_tfstpbarser, lV66Consultahdrssuspendidas_wcds_8_tfstpbarser, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV70Consultahdrssuspendidas_wcds_12_tfstpcolor, lV70Consultahdrssuspendidas_wcds_12_tfstpcolor, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel, AV49Emprcod, lV60Consultahdrssuspendidas_wcds_2_tfstphdr, AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel, AV72Consultahdrssuspendidas_wcds_14_tfstp_dia, lV73Consultahdrssuspendidas_wcds_15_tfstp_mot, AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel, AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa, lV76Consultahdrssuspendidas_wcds_18_tfstp_mota, AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9649 = false ;
         A396EmprCod = P096415_A396EmprCod[0] ;
         A10757Stp_MotA = P096415_A10757Stp_MotA[0] ;
         A10756Stp_DiaA = P096415_A10756Stp_DiaA[0] ;
         A10752Stp_Mot = P096415_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P096415_A10751Stp_Dia[0] ;
         A13723StpHdr = P096415_A13723StpHdr[0] ;
         A13728StpColor = P096415_A13728StpColor[0] ;
         n13728StpColor = P096415_n13728StpColor[0] ;
         A13725StpBarserD = P096415_A13725StpBarserD[0] ;
         n13725StpBarserD = P096415_n13725StpBarserD[0] ;
         A13724StpBarser = P096415_A13724StpBarser[0] ;
         n13724StpBarser = P096415_n13724StpBarser[0] ;
         A13727StpCliNom = P096415_A13727StpCliNom[0] ;
         n13727StpCliNom = P096415_n13727StpCliNom[0] ;
         A13726StpClicod = P096415_A13726StpClicod[0] ;
         n13726StpClicod = P096415_n13726StpClicod[0] ;
         A10746Stp_hdr = P096415_A10746Stp_hdr[0] ;
         A10747Stp_r = P096415_A10747Stp_r[0] ;
         A10748Stp_p = P096415_A10748Stp_p[0] ;
         A10750Stp_Lin = P096415_A10750Stp_Lin[0] ;
         A13723StpHdr = P096415_A13723StpHdr[0] ;
         A13728StpColor = P096415_A13728StpColor[0] ;
         n13728StpColor = P096415_n13728StpColor[0] ;
         A13725StpBarserD = P096415_A13725StpBarserD[0] ;
         n13725StpBarserD = P096415_n13725StpBarserD[0] ;
         A13724StpBarser = P096415_A13724StpBarser[0] ;
         n13724StpBarser = P096415_n13724StpBarser[0] ;
         A13726StpClicod = P096415_A13726StpClicod[0] ;
         n13726StpClicod = P096415_n13726StpClicod[0] ;
         A13727StpCliNom = P096415_A13727StpCliNom[0] ;
         n13727StpCliNom = P096415_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV50DiaSuspension )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV50DiaSuspension)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV51DiaSuspension_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV51DiaSuspension_to)) )) )
            {
               if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV52DiaActivacion )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV52DiaActivacion)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52DiaActivacion)) )
               {
                  if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV53DiaActivacion_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10756Stp_DiaA, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV53DiaActivacion_to)) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53DiaActivacion_to)) )
                  {
                     AV42count = 0 ;
                     while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P096415_A10757Stp_MotA[0], A10757Stp_MotA) == 0 ) )
                     {
                        brk9649 = false ;
                        A396EmprCod = P096415_A396EmprCod[0] ;
                        A10746Stp_hdr = P096415_A10746Stp_hdr[0] ;
                        A10747Stp_r = P096415_A10747Stp_r[0] ;
                        A10748Stp_p = P096415_A10748Stp_p[0] ;
                        A10750Stp_Lin = P096415_A10750Stp_Lin[0] ;
                        AV42count = (long)(AV42count+1) ;
                        brk9649 = true ;
                        pr_default.readNext(6);
                     }
                     if ( ! (GXutil.strcmp("", A10757Stp_MotA)==0) )
                     {
                        AV34Option = A10757Stp_MotA ;
                        AV35Options.add(AV34Option, 0);
                        AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV35Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk9649 )
         {
            brk9649 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultahdrssuspendidas_wcgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = consultahdrssuspendidas_wcgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = consultahdrssuspendidas_wcgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV10TFStpHdr = "" ;
      AV11TFStpHdr_Sel = "" ;
      AV14TFStpCliNom = "" ;
      AV15TFStpCliNom_Sel = "" ;
      AV16TFStpBarser = "" ;
      AV17TFStpBarser_Sel = "" ;
      AV18TFStpBarserDsc = "" ;
      AV19TFStpBarserDsc_Sel = "" ;
      AV20TFStpColor = "" ;
      AV21TFStpColor_Sel = "" ;
      AV22TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV24TFStp_Mot = "" ;
      AV25TFStp_Mot_Sel = "" ;
      AV26TFStp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      AV28TFStp_MotA = "" ;
      AV29TFStp_MotA_Sel = "" ;
      AV49Emprcod = "" ;
      AV50DiaSuspension = GXutil.nullDate() ;
      AV51DiaSuspension_to = GXutil.nullDate() ;
      AV52DiaActivacion = GXutil.nullDate() ;
      AV53DiaActivacion_to = GXutil.nullDate() ;
      A13723StpHdr = "" ;
      AV59Consultahdrssuspendidas_wcds_1_filterfulltext = "" ;
      AV60Consultahdrssuspendidas_wcds_2_tfstphdr = "" ;
      AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel = "" ;
      AV64Consultahdrssuspendidas_wcds_6_tfstpclinom = "" ;
      AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel = "" ;
      AV66Consultahdrssuspendidas_wcds_8_tfstpbarser = "" ;
      AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel = "" ;
      AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = "" ;
      AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel = "" ;
      AV70Consultahdrssuspendidas_wcds_12_tfstpcolor = "" ;
      AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel = "" ;
      AV72Consultahdrssuspendidas_wcds_14_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV73Consultahdrssuspendidas_wcds_15_tfstp_mot = "" ;
      AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel = "" ;
      AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa = GXutil.resetTime( GXutil.nullDate() );
      AV76Consultahdrssuspendidas_wcds_18_tfstp_mota = "" ;
      AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel = "" ;
      lV59Consultahdrssuspendidas_wcds_1_filterfulltext = "" ;
      lV64Consultahdrssuspendidas_wcds_6_tfstpclinom = "" ;
      lV66Consultahdrssuspendidas_wcds_8_tfstpbarser = "" ;
      lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc = "" ;
      lV70Consultahdrssuspendidas_wcds_12_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV60Consultahdrssuspendidas_wcds_2_tfstphdr = "" ;
      lV73Consultahdrssuspendidas_wcds_15_tfstp_mot = "" ;
      lV76Consultahdrssuspendidas_wcds_18_tfstp_mota = "" ;
      A10748Stp_p = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      A396EmprCod = "" ;
      P09643_A129BarCod = new int[1] ;
      P09643_A132BarCodReo = new byte[1] ;
      P09643_A130BarCodPar = new String[] {""} ;
      P09643_A396EmprCod = new String[] {""} ;
      P09643_A10757Stp_MotA = new String[] {""} ;
      P09643_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P09643_A10752Stp_Mot = new String[] {""} ;
      P09643_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09643_A13723StpHdr = new String[] {""} ;
      P09643_A13728StpColor = new String[] {""} ;
      P09643_n13728StpColor = new boolean[] {false} ;
      P09643_A13725StpBarserD = new String[] {""} ;
      P09643_n13725StpBarserD = new boolean[] {false} ;
      P09643_A13724StpBarser = new String[] {""} ;
      P09643_n13724StpBarser = new boolean[] {false} ;
      P09643_A13727StpCliNom = new String[] {""} ;
      P09643_n13727StpCliNom = new boolean[] {false} ;
      P09643_A13726StpClicod = new int[1] ;
      P09643_n13726StpClicod = new boolean[] {false} ;
      P09643_A10746Stp_hdr = new int[1] ;
      P09643_A10747Stp_r = new byte[1] ;
      P09643_A10748Stp_p = new String[] {""} ;
      P09643_A10750Stp_Lin = new short[1] ;
      AV34Option = "" ;
      P09645_A129BarCod = new int[1] ;
      P09645_A132BarCodReo = new byte[1] ;
      P09645_A130BarCodPar = new String[] {""} ;
      P09645_A396EmprCod = new String[] {""} ;
      P09645_A10757Stp_MotA = new String[] {""} ;
      P09645_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P09645_A10752Stp_Mot = new String[] {""} ;
      P09645_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09645_A13723StpHdr = new String[] {""} ;
      P09645_A13728StpColor = new String[] {""} ;
      P09645_n13728StpColor = new boolean[] {false} ;
      P09645_A13725StpBarserD = new String[] {""} ;
      P09645_n13725StpBarserD = new boolean[] {false} ;
      P09645_A13724StpBarser = new String[] {""} ;
      P09645_n13724StpBarser = new boolean[] {false} ;
      P09645_A13727StpCliNom = new String[] {""} ;
      P09645_n13727StpCliNom = new boolean[] {false} ;
      P09645_A13726StpClicod = new int[1] ;
      P09645_n13726StpClicod = new boolean[] {false} ;
      P09645_A10746Stp_hdr = new int[1] ;
      P09645_A10747Stp_r = new byte[1] ;
      P09645_A10748Stp_p = new String[] {""} ;
      P09645_A10750Stp_Lin = new short[1] ;
      P09647_A129BarCod = new int[1] ;
      P09647_A132BarCodReo = new byte[1] ;
      P09647_A130BarCodPar = new String[] {""} ;
      P09647_A396EmprCod = new String[] {""} ;
      P09647_A10757Stp_MotA = new String[] {""} ;
      P09647_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P09647_A10752Stp_Mot = new String[] {""} ;
      P09647_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09647_A13723StpHdr = new String[] {""} ;
      P09647_A13728StpColor = new String[] {""} ;
      P09647_n13728StpColor = new boolean[] {false} ;
      P09647_A13725StpBarserD = new String[] {""} ;
      P09647_n13725StpBarserD = new boolean[] {false} ;
      P09647_A13724StpBarser = new String[] {""} ;
      P09647_n13724StpBarser = new boolean[] {false} ;
      P09647_A13727StpCliNom = new String[] {""} ;
      P09647_n13727StpCliNom = new boolean[] {false} ;
      P09647_A13726StpClicod = new int[1] ;
      P09647_n13726StpClicod = new boolean[] {false} ;
      P09647_A10746Stp_hdr = new int[1] ;
      P09647_A10747Stp_r = new byte[1] ;
      P09647_A10748Stp_p = new String[] {""} ;
      P09647_A10750Stp_Lin = new short[1] ;
      P09649_A129BarCod = new int[1] ;
      P09649_A132BarCodReo = new byte[1] ;
      P09649_A130BarCodPar = new String[] {""} ;
      P09649_A396EmprCod = new String[] {""} ;
      P09649_A10757Stp_MotA = new String[] {""} ;
      P09649_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P09649_A10752Stp_Mot = new String[] {""} ;
      P09649_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09649_A13723StpHdr = new String[] {""} ;
      P09649_A13728StpColor = new String[] {""} ;
      P09649_n13728StpColor = new boolean[] {false} ;
      P09649_A13725StpBarserD = new String[] {""} ;
      P09649_n13725StpBarserD = new boolean[] {false} ;
      P09649_A13724StpBarser = new String[] {""} ;
      P09649_n13724StpBarser = new boolean[] {false} ;
      P09649_A13727StpCliNom = new String[] {""} ;
      P09649_n13727StpCliNom = new boolean[] {false} ;
      P09649_A13726StpClicod = new int[1] ;
      P09649_n13726StpClicod = new boolean[] {false} ;
      P09649_A10746Stp_hdr = new int[1] ;
      P09649_A10747Stp_r = new byte[1] ;
      P09649_A10748Stp_p = new String[] {""} ;
      P09649_A10750Stp_Lin = new short[1] ;
      P096411_A129BarCod = new int[1] ;
      P096411_A132BarCodReo = new byte[1] ;
      P096411_A130BarCodPar = new String[] {""} ;
      P096411_A396EmprCod = new String[] {""} ;
      P096411_A10757Stp_MotA = new String[] {""} ;
      P096411_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P096411_A10752Stp_Mot = new String[] {""} ;
      P096411_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P096411_A13723StpHdr = new String[] {""} ;
      P096411_A13728StpColor = new String[] {""} ;
      P096411_n13728StpColor = new boolean[] {false} ;
      P096411_A13725StpBarserD = new String[] {""} ;
      P096411_n13725StpBarserD = new boolean[] {false} ;
      P096411_A13724StpBarser = new String[] {""} ;
      P096411_n13724StpBarser = new boolean[] {false} ;
      P096411_A13727StpCliNom = new String[] {""} ;
      P096411_n13727StpCliNom = new boolean[] {false} ;
      P096411_A13726StpClicod = new int[1] ;
      P096411_n13726StpClicod = new boolean[] {false} ;
      P096411_A10746Stp_hdr = new int[1] ;
      P096411_A10747Stp_r = new byte[1] ;
      P096411_A10748Stp_p = new String[] {""} ;
      P096411_A10750Stp_Lin = new short[1] ;
      P096413_A129BarCod = new int[1] ;
      P096413_A132BarCodReo = new byte[1] ;
      P096413_A130BarCodPar = new String[] {""} ;
      P096413_A396EmprCod = new String[] {""} ;
      P096413_A10752Stp_Mot = new String[] {""} ;
      P096413_A10757Stp_MotA = new String[] {""} ;
      P096413_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P096413_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P096413_A13723StpHdr = new String[] {""} ;
      P096413_A13728StpColor = new String[] {""} ;
      P096413_n13728StpColor = new boolean[] {false} ;
      P096413_A13725StpBarserD = new String[] {""} ;
      P096413_n13725StpBarserD = new boolean[] {false} ;
      P096413_A13724StpBarser = new String[] {""} ;
      P096413_n13724StpBarser = new boolean[] {false} ;
      P096413_A13727StpCliNom = new String[] {""} ;
      P096413_n13727StpCliNom = new boolean[] {false} ;
      P096413_A13726StpClicod = new int[1] ;
      P096413_n13726StpClicod = new boolean[] {false} ;
      P096413_A10746Stp_hdr = new int[1] ;
      P096413_A10747Stp_r = new byte[1] ;
      P096413_A10748Stp_p = new String[] {""} ;
      P096413_A10750Stp_Lin = new short[1] ;
      P096415_A129BarCod = new int[1] ;
      P096415_A132BarCodReo = new byte[1] ;
      P096415_A130BarCodPar = new String[] {""} ;
      P096415_A396EmprCod = new String[] {""} ;
      P096415_A10757Stp_MotA = new String[] {""} ;
      P096415_A10756Stp_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      P096415_A10752Stp_Mot = new String[] {""} ;
      P096415_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P096415_A13723StpHdr = new String[] {""} ;
      P096415_A13728StpColor = new String[] {""} ;
      P096415_n13728StpColor = new boolean[] {false} ;
      P096415_A13725StpBarserD = new String[] {""} ;
      P096415_n13725StpBarserD = new boolean[] {false} ;
      P096415_A13724StpBarser = new String[] {""} ;
      P096415_n13724StpBarser = new boolean[] {false} ;
      P096415_A13727StpCliNom = new String[] {""} ;
      P096415_n13727StpCliNom = new boolean[] {false} ;
      P096415_A13726StpClicod = new int[1] ;
      P096415_n13726StpClicod = new boolean[] {false} ;
      P096415_A10746Stp_hdr = new int[1] ;
      P096415_A10747Stp_r = new byte[1] ;
      P096415_A10748Stp_p = new String[] {""} ;
      P096415_A10750Stp_Lin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultahdrssuspendidas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09643_A129BarCod, P09643_A132BarCodReo, P09643_A130BarCodPar, P09643_A396EmprCod, P09643_A10757Stp_MotA, P09643_A10756Stp_DiaA, P09643_A10752Stp_Mot, P09643_A10751Stp_Dia, P09643_A13723StpHdr, P09643_A13728StpColor,
            P09643_n13728StpColor, P09643_A13725StpBarserD, P09643_n13725StpBarserD, P09643_A13724StpBarser, P09643_n13724StpBarser, P09643_A13727StpCliNom, P09643_n13727StpCliNom, P09643_A13726StpClicod, P09643_n13726StpClicod, P09643_A10746Stp_hdr,
            P09643_A10747Stp_r, P09643_A10748Stp_p, P09643_A10750Stp_Lin
            }
            , new Object[] {
            P09645_A129BarCod, P09645_A132BarCodReo, P09645_A130BarCodPar, P09645_A396EmprCod, P09645_A10757Stp_MotA, P09645_A10756Stp_DiaA, P09645_A10752Stp_Mot, P09645_A10751Stp_Dia, P09645_A13723StpHdr, P09645_A13728StpColor,
            P09645_n13728StpColor, P09645_A13725StpBarserD, P09645_n13725StpBarserD, P09645_A13724StpBarser, P09645_n13724StpBarser, P09645_A13727StpCliNom, P09645_n13727StpCliNom, P09645_A13726StpClicod, P09645_n13726StpClicod, P09645_A10746Stp_hdr,
            P09645_A10747Stp_r, P09645_A10748Stp_p, P09645_A10750Stp_Lin
            }
            , new Object[] {
            P09647_A129BarCod, P09647_A132BarCodReo, P09647_A130BarCodPar, P09647_A396EmprCod, P09647_A10757Stp_MotA, P09647_A10756Stp_DiaA, P09647_A10752Stp_Mot, P09647_A10751Stp_Dia, P09647_A13723StpHdr, P09647_A13728StpColor,
            P09647_n13728StpColor, P09647_A13725StpBarserD, P09647_n13725StpBarserD, P09647_A13724StpBarser, P09647_n13724StpBarser, P09647_A13727StpCliNom, P09647_n13727StpCliNom, P09647_A13726StpClicod, P09647_n13726StpClicod, P09647_A10746Stp_hdr,
            P09647_A10747Stp_r, P09647_A10748Stp_p, P09647_A10750Stp_Lin
            }
            , new Object[] {
            P09649_A129BarCod, P09649_A132BarCodReo, P09649_A130BarCodPar, P09649_A396EmprCod, P09649_A10757Stp_MotA, P09649_A10756Stp_DiaA, P09649_A10752Stp_Mot, P09649_A10751Stp_Dia, P09649_A13723StpHdr, P09649_A13728StpColor,
            P09649_n13728StpColor, P09649_A13725StpBarserD, P09649_n13725StpBarserD, P09649_A13724StpBarser, P09649_n13724StpBarser, P09649_A13727StpCliNom, P09649_n13727StpCliNom, P09649_A13726StpClicod, P09649_n13726StpClicod, P09649_A10746Stp_hdr,
            P09649_A10747Stp_r, P09649_A10748Stp_p, P09649_A10750Stp_Lin
            }
            , new Object[] {
            P096411_A129BarCod, P096411_A132BarCodReo, P096411_A130BarCodPar, P096411_A396EmprCod, P096411_A10757Stp_MotA, P096411_A10756Stp_DiaA, P096411_A10752Stp_Mot, P096411_A10751Stp_Dia, P096411_A13723StpHdr, P096411_A13728StpColor,
            P096411_n13728StpColor, P096411_A13725StpBarserD, P096411_n13725StpBarserD, P096411_A13724StpBarser, P096411_n13724StpBarser, P096411_A13727StpCliNom, P096411_n13727StpCliNom, P096411_A13726StpClicod, P096411_n13726StpClicod, P096411_A10746Stp_hdr,
            P096411_A10747Stp_r, P096411_A10748Stp_p, P096411_A10750Stp_Lin
            }
            , new Object[] {
            P096413_A129BarCod, P096413_A132BarCodReo, P096413_A130BarCodPar, P096413_A396EmprCod, P096413_A10752Stp_Mot, P096413_A10757Stp_MotA, P096413_A10756Stp_DiaA, P096413_A10751Stp_Dia, P096413_A13723StpHdr, P096413_A13728StpColor,
            P096413_n13728StpColor, P096413_A13725StpBarserD, P096413_n13725StpBarserD, P096413_A13724StpBarser, P096413_n13724StpBarser, P096413_A13727StpCliNom, P096413_n13727StpCliNom, P096413_A13726StpClicod, P096413_n13726StpClicod, P096413_A10746Stp_hdr,
            P096413_A10747Stp_r, P096413_A10748Stp_p, P096413_A10750Stp_Lin
            }
            , new Object[] {
            P096415_A129BarCod, P096415_A132BarCodReo, P096415_A130BarCodPar, P096415_A396EmprCod, P096415_A10757Stp_MotA, P096415_A10756Stp_DiaA, P096415_A10752Stp_Mot, P096415_A10751Stp_Dia, P096415_A13723StpHdr, P096415_A13728StpColor,
            P096415_n13728StpColor, P096415_A13725StpBarserD, P096415_n13725StpBarserD, P096415_A13724StpBarser, P096415_n13724StpBarser, P096415_A13727StpCliNom, P096415_n13727StpCliNom, P096415_A13726StpClicod, P096415_n13726StpClicod, P096415_A10746Stp_hdr,
            P096415_A10747Stp_r, P096415_A10748Stp_p, P096415_A10750Stp_Lin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10747Stp_r ;
   private short A10750Stp_Lin ;
   private short Gx_err ;
   private int AV57GXV1 ;
   private int AV12TFStpClicod ;
   private int AV13TFStpClicod_To ;
   private int AV62Consultahdrssuspendidas_wcds_4_tfstpclicod ;
   private int AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to ;
   private int A10746Stp_hdr ;
   private int A13726StpClicod ;
   private int AV33InsertIndex ;
   private long AV42count ;
   private String AV10TFStpHdr ;
   private String AV11TFStpHdr_Sel ;
   private String AV14TFStpCliNom ;
   private String AV15TFStpCliNom_Sel ;
   private String AV16TFStpBarser ;
   private String AV17TFStpBarser_Sel ;
   private String AV18TFStpBarserDsc ;
   private String AV19TFStpBarserDsc_Sel ;
   private String AV20TFStpColor ;
   private String AV21TFStpColor_Sel ;
   private String AV49Emprcod ;
   private String A13723StpHdr ;
   private String AV60Consultahdrssuspendidas_wcds_2_tfstphdr ;
   private String AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ;
   private String AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ;
   private String AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ;
   private String AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ;
   private String AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ;
   private String AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ;
   private String AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ;
   private String AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ;
   private String AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ;
   private String lV64Consultahdrssuspendidas_wcds_6_tfstpclinom ;
   private String lV66Consultahdrssuspendidas_wcds_8_tfstpbarser ;
   private String lV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ;
   private String lV70Consultahdrssuspendidas_wcds_12_tfstpcolor ;
   private String scmdbuf ;
   private String lV60Consultahdrssuspendidas_wcds_2_tfstphdr ;
   private String A10748Stp_p ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String A396EmprCod ;
   private java.util.Date AV22TFStp_Dia ;
   private java.util.Date AV26TFStp_DiaA ;
   private java.util.Date AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ;
   private java.util.Date AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date A10756Stp_DiaA ;
   private java.util.Date AV50DiaSuspension ;
   private java.util.Date AV51DiaSuspension_to ;
   private java.util.Date AV52DiaActivacion ;
   private java.util.Date AV53DiaActivacion_to ;
   private boolean returnInSub ;
   private boolean n13728StpColor ;
   private boolean n13725StpBarserD ;
   private boolean n13724StpBarser ;
   private boolean n13727StpCliNom ;
   private boolean n13726StpClicod ;
   private boolean brk9647 ;
   private boolean brk9649 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV24TFStp_Mot ;
   private String AV25TFStp_Mot_Sel ;
   private String AV28TFStp_MotA ;
   private String AV29TFStp_MotA_Sel ;
   private String AV59Consultahdrssuspendidas_wcds_1_filterfulltext ;
   private String AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ;
   private String AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ;
   private String AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ;
   private String AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ;
   private String lV59Consultahdrssuspendidas_wcds_1_filterfulltext ;
   private String lV73Consultahdrssuspendidas_wcds_15_tfstp_mot ;
   private String lV76Consultahdrssuspendidas_wcds_18_tfstp_mota ;
   private String A10752Stp_Mot ;
   private String A10757Stp_MotA ;
   private String AV34Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09643_A129BarCod ;
   private byte[] P09643_A132BarCodReo ;
   private String[] P09643_A130BarCodPar ;
   private String[] P09643_A396EmprCod ;
   private String[] P09643_A10757Stp_MotA ;
   private java.util.Date[] P09643_A10756Stp_DiaA ;
   private String[] P09643_A10752Stp_Mot ;
   private java.util.Date[] P09643_A10751Stp_Dia ;
   private String[] P09643_A13723StpHdr ;
   private String[] P09643_A13728StpColor ;
   private boolean[] P09643_n13728StpColor ;
   private String[] P09643_A13725StpBarserD ;
   private boolean[] P09643_n13725StpBarserD ;
   private String[] P09643_A13724StpBarser ;
   private boolean[] P09643_n13724StpBarser ;
   private String[] P09643_A13727StpCliNom ;
   private boolean[] P09643_n13727StpCliNom ;
   private int[] P09643_A13726StpClicod ;
   private boolean[] P09643_n13726StpClicod ;
   private int[] P09643_A10746Stp_hdr ;
   private byte[] P09643_A10747Stp_r ;
   private String[] P09643_A10748Stp_p ;
   private short[] P09643_A10750Stp_Lin ;
   private int[] P09645_A129BarCod ;
   private byte[] P09645_A132BarCodReo ;
   private String[] P09645_A130BarCodPar ;
   private String[] P09645_A396EmprCod ;
   private String[] P09645_A10757Stp_MotA ;
   private java.util.Date[] P09645_A10756Stp_DiaA ;
   private String[] P09645_A10752Stp_Mot ;
   private java.util.Date[] P09645_A10751Stp_Dia ;
   private String[] P09645_A13723StpHdr ;
   private String[] P09645_A13728StpColor ;
   private boolean[] P09645_n13728StpColor ;
   private String[] P09645_A13725StpBarserD ;
   private boolean[] P09645_n13725StpBarserD ;
   private String[] P09645_A13724StpBarser ;
   private boolean[] P09645_n13724StpBarser ;
   private String[] P09645_A13727StpCliNom ;
   private boolean[] P09645_n13727StpCliNom ;
   private int[] P09645_A13726StpClicod ;
   private boolean[] P09645_n13726StpClicod ;
   private int[] P09645_A10746Stp_hdr ;
   private byte[] P09645_A10747Stp_r ;
   private String[] P09645_A10748Stp_p ;
   private short[] P09645_A10750Stp_Lin ;
   private int[] P09647_A129BarCod ;
   private byte[] P09647_A132BarCodReo ;
   private String[] P09647_A130BarCodPar ;
   private String[] P09647_A396EmprCod ;
   private String[] P09647_A10757Stp_MotA ;
   private java.util.Date[] P09647_A10756Stp_DiaA ;
   private String[] P09647_A10752Stp_Mot ;
   private java.util.Date[] P09647_A10751Stp_Dia ;
   private String[] P09647_A13723StpHdr ;
   private String[] P09647_A13728StpColor ;
   private boolean[] P09647_n13728StpColor ;
   private String[] P09647_A13725StpBarserD ;
   private boolean[] P09647_n13725StpBarserD ;
   private String[] P09647_A13724StpBarser ;
   private boolean[] P09647_n13724StpBarser ;
   private String[] P09647_A13727StpCliNom ;
   private boolean[] P09647_n13727StpCliNom ;
   private int[] P09647_A13726StpClicod ;
   private boolean[] P09647_n13726StpClicod ;
   private int[] P09647_A10746Stp_hdr ;
   private byte[] P09647_A10747Stp_r ;
   private String[] P09647_A10748Stp_p ;
   private short[] P09647_A10750Stp_Lin ;
   private int[] P09649_A129BarCod ;
   private byte[] P09649_A132BarCodReo ;
   private String[] P09649_A130BarCodPar ;
   private String[] P09649_A396EmprCod ;
   private String[] P09649_A10757Stp_MotA ;
   private java.util.Date[] P09649_A10756Stp_DiaA ;
   private String[] P09649_A10752Stp_Mot ;
   private java.util.Date[] P09649_A10751Stp_Dia ;
   private String[] P09649_A13723StpHdr ;
   private String[] P09649_A13728StpColor ;
   private boolean[] P09649_n13728StpColor ;
   private String[] P09649_A13725StpBarserD ;
   private boolean[] P09649_n13725StpBarserD ;
   private String[] P09649_A13724StpBarser ;
   private boolean[] P09649_n13724StpBarser ;
   private String[] P09649_A13727StpCliNom ;
   private boolean[] P09649_n13727StpCliNom ;
   private int[] P09649_A13726StpClicod ;
   private boolean[] P09649_n13726StpClicod ;
   private int[] P09649_A10746Stp_hdr ;
   private byte[] P09649_A10747Stp_r ;
   private String[] P09649_A10748Stp_p ;
   private short[] P09649_A10750Stp_Lin ;
   private int[] P096411_A129BarCod ;
   private byte[] P096411_A132BarCodReo ;
   private String[] P096411_A130BarCodPar ;
   private String[] P096411_A396EmprCod ;
   private String[] P096411_A10757Stp_MotA ;
   private java.util.Date[] P096411_A10756Stp_DiaA ;
   private String[] P096411_A10752Stp_Mot ;
   private java.util.Date[] P096411_A10751Stp_Dia ;
   private String[] P096411_A13723StpHdr ;
   private String[] P096411_A13728StpColor ;
   private boolean[] P096411_n13728StpColor ;
   private String[] P096411_A13725StpBarserD ;
   private boolean[] P096411_n13725StpBarserD ;
   private String[] P096411_A13724StpBarser ;
   private boolean[] P096411_n13724StpBarser ;
   private String[] P096411_A13727StpCliNom ;
   private boolean[] P096411_n13727StpCliNom ;
   private int[] P096411_A13726StpClicod ;
   private boolean[] P096411_n13726StpClicod ;
   private int[] P096411_A10746Stp_hdr ;
   private byte[] P096411_A10747Stp_r ;
   private String[] P096411_A10748Stp_p ;
   private short[] P096411_A10750Stp_Lin ;
   private int[] P096413_A129BarCod ;
   private byte[] P096413_A132BarCodReo ;
   private String[] P096413_A130BarCodPar ;
   private String[] P096413_A396EmprCod ;
   private String[] P096413_A10752Stp_Mot ;
   private String[] P096413_A10757Stp_MotA ;
   private java.util.Date[] P096413_A10756Stp_DiaA ;
   private java.util.Date[] P096413_A10751Stp_Dia ;
   private String[] P096413_A13723StpHdr ;
   private String[] P096413_A13728StpColor ;
   private boolean[] P096413_n13728StpColor ;
   private String[] P096413_A13725StpBarserD ;
   private boolean[] P096413_n13725StpBarserD ;
   private String[] P096413_A13724StpBarser ;
   private boolean[] P096413_n13724StpBarser ;
   private String[] P096413_A13727StpCliNom ;
   private boolean[] P096413_n13727StpCliNom ;
   private int[] P096413_A13726StpClicod ;
   private boolean[] P096413_n13726StpClicod ;
   private int[] P096413_A10746Stp_hdr ;
   private byte[] P096413_A10747Stp_r ;
   private String[] P096413_A10748Stp_p ;
   private short[] P096413_A10750Stp_Lin ;
   private int[] P096415_A129BarCod ;
   private byte[] P096415_A132BarCodReo ;
   private String[] P096415_A130BarCodPar ;
   private String[] P096415_A396EmprCod ;
   private String[] P096415_A10757Stp_MotA ;
   private java.util.Date[] P096415_A10756Stp_DiaA ;
   private String[] P096415_A10752Stp_Mot ;
   private java.util.Date[] P096415_A10751Stp_Dia ;
   private String[] P096415_A13723StpHdr ;
   private String[] P096415_A13728StpColor ;
   private boolean[] P096415_n13728StpColor ;
   private String[] P096415_A13725StpBarserD ;
   private boolean[] P096415_n13725StpBarserD ;
   private String[] P096415_A13724StpBarser ;
   private boolean[] P096415_n13724StpBarser ;
   private String[] P096415_A13727StpCliNom ;
   private boolean[] P096415_n13727StpCliNom ;
   private int[] P096415_A13726StpClicod ;
   private boolean[] P096415_n13726StpClicod ;
   private int[] P096415_A10746Stp_hdr ;
   private byte[] P096415_A10747Stp_r ;
   private String[] P096415_A10748Stp_p ;
   private short[] P096415_A10750Stp_Lin ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class consultahdrssuspendidas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09643( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                          String AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                          java.util.Date AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                          String AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                          String AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                          java.util.Date AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                          String AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                          String AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          String AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV62Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                          int AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                          String AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                          String AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                          String AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                          String AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                          String AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                          String AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                          String AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                          String AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                          java.util.Date AV50DiaSuspension ,
                                          java.util.Date AV51DiaSuspension_to ,
                                          java.util.Date AV52DiaActivacion ,
                                          java.util.Date AV53DiaActivacion_to ,
                                          String AV49Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[42];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV73Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV76Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09645( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                          String AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                          java.util.Date AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                          String AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                          String AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                          java.util.Date AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                          String AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                          String AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          String AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV62Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                          int AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                          String AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                          String AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                          String AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                          String AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                          String AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                          String AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                          String AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                          String AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                          java.util.Date AV50DiaSuspension ,
                                          java.util.Date AV51DiaSuspension_to ,
                                          java.util.Date AV52DiaActivacion ,
                                          java.util.Date AV53DiaActivacion_to ,
                                          String AV49Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[42];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV73Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV76Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09647( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                          String AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                          java.util.Date AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                          String AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                          String AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                          java.util.Date AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                          String AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                          String AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          String AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV62Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                          int AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                          String AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                          String AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                          String AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                          String AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                          String AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                          String AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                          String AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                          String AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                          java.util.Date AV50DiaSuspension ,
                                          java.util.Date AV51DiaSuspension_to ,
                                          java.util.Date AV52DiaActivacion ,
                                          java.util.Date AV53DiaActivacion_to ,
                                          String AV49Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[42];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV73Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV76Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09649( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                          String AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                          java.util.Date AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                          String AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                          String AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                          java.util.Date AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                          String AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                          String AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          java.util.Date A10756Stp_DiaA ,
                                          String A10757Stp_MotA ,
                                          String AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV62Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                          int AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                          String AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                          String AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                          String AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                          String AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                          String AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                          String AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                          String AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                          String AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                          java.util.Date AV50DiaSuspension ,
                                          java.util.Date AV51DiaSuspension_to ,
                                          java.util.Date AV52DiaActivacion ,
                                          java.util.Date AV53DiaActivacion_to ,
                                          String AV49Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[42];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV73Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV76Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P096411( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           String AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           java.util.Date AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           String AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           String AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           java.util.Date AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           String AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           String AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           java.util.Date A10756Stp_DiaA ,
                                           String A10757Stp_MotA ,
                                           String AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV62Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                           int AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                           String AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           String AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           String AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           String AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           String AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           String AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           String AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           String AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           java.util.Date AV50DiaSuspension ,
                                           java.util.Date AV51DiaSuspension_to ,
                                           java.util.Date AV52DiaActivacion ,
                                           java.util.Date AV53DiaActivacion_to ,
                                           String AV49Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[42];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      if ( (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV73Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV76Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P096413( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           String AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           java.util.Date AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           String AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           String AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           java.util.Date AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           String AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           String AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           java.util.Date A10756Stp_DiaA ,
                                           String A10757Stp_MotA ,
                                           String AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV62Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                           int AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                           String AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           String AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           String AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           String AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           String AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           String AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           String AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           String AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           java.util.Date AV50DiaSuspension ,
                                           java.util.Date AV51DiaSuspension_to ,
                                           java.util.Date AV52DiaActivacion ,
                                           java.util.Date AV53DiaActivacion_to ,
                                           String A396EmprCod ,
                                           String AV49Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[42];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Mot, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV73Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV76Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Stp_Mot" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P096415( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel ,
                                           String AV60Consultahdrssuspendidas_wcds_2_tfstphdr ,
                                           java.util.Date AV72Consultahdrssuspendidas_wcds_14_tfstp_dia ,
                                           String AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel ,
                                           String AV73Consultahdrssuspendidas_wcds_15_tfstp_mot ,
                                           java.util.Date AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa ,
                                           String AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel ,
                                           String AV76Consultahdrssuspendidas_wcds_18_tfstp_mota ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           java.util.Date A10756Stp_DiaA ,
                                           String A10757Stp_MotA ,
                                           String AV59Consultahdrssuspendidas_wcds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV62Consultahdrssuspendidas_wcds_4_tfstpclicod ,
                                           int AV63Consultahdrssuspendidas_wcds_5_tfstpclicod_to ,
                                           String AV65Consultahdrssuspendidas_wcds_7_tfstpclinom_sel ,
                                           String AV64Consultahdrssuspendidas_wcds_6_tfstpclinom ,
                                           String AV67Consultahdrssuspendidas_wcds_9_tfstpbarser_sel ,
                                           String AV66Consultahdrssuspendidas_wcds_8_tfstpbarser ,
                                           String AV69Consultahdrssuspendidas_wcds_11_tfstpbarserdsc_sel ,
                                           String AV68Consultahdrssuspendidas_wcds_10_tfstpbarserdsc ,
                                           String AV71Consultahdrssuspendidas_wcds_13_tfstpcolor_sel ,
                                           String AV70Consultahdrssuspendidas_wcds_12_tfstpcolor ,
                                           java.util.Date AV50DiaSuspension ,
                                           java.util.Date AV51DiaSuspension_to ,
                                           java.util.Date AV52DiaActivacion ,
                                           java.util.Date AV53DiaActivacion_to ,
                                           String A396EmprCod ,
                                           String AV49Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[42];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_MotA, T1.Stp_DiaA, T1.Stp_Mot, T1.Stp_Dia, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2)))" ;
      scmdbuf += " || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p AS StpHdr, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE(" ;
      scmdbuf += " T3.BarSer, ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin FROM (((TXPHDSTO1" ;
      scmdbuf += " T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER" ;
      scmdbuf += " JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(T1.Stp_MotA) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultahdrssuspendidas_wcds_2_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultahdrssuspendidas_wcds_3_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Consultahdrssuspendidas_wcds_14_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV73Consultahdrssuspendidas_wcds_15_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Consultahdrssuspendidas_wcds_16_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Consultahdrssuspendidas_wcds_17_tfstp_diaa) )
      {
         addWhere(sWhereString, "(T1.Stp_DiaA >= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) && ( ! (GXutil.strcmp("", AV76Consultahdrssuspendidas_wcds_18_tfstp_mota)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_MotA) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Consultahdrssuspendidas_wcds_19_tfstp_mota_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_MotA = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Stp_MotA" ;
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
                  return conditional_P09643(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 1 :
                  return conditional_P09645(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 2 :
                  return conditional_P09647(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 3 :
                  return conditional_P09649(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 4 :
                  return conditional_P096411(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 5 :
                  return conditional_P096413(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 6 :
                  return conditional_P096415(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09643", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09645", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09647", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09649", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096411", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096413", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096415", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
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
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 11);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 11);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 300);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               return;
      }
   }

}

