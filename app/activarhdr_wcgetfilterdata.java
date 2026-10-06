package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class activarhdr_wcgetfilterdata extends GXProcedure
{
   public activarhdr_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( activarhdr_wcgetfilterdata.class ), "" );
   }

   public activarhdr_wcgetfilterdata( int remoteHandle ,
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
      activarhdr_wcgetfilterdata.this.aP5 = new String[] {""};
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
      activarhdr_wcgetfilterdata.this.AV30DDOName = aP0;
      activarhdr_wcgetfilterdata.this.AV28SearchTxt = aP1;
      activarhdr_wcgetfilterdata.this.AV29SearchTxtTo = aP2;
      activarhdr_wcgetfilterdata.this.aP3 = aP3;
      activarhdr_wcgetfilterdata.this.aP4 = aP4;
      activarhdr_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_STP_MOT") == 0 )
      {
         /* Execute user subroutine: 'LOADSTP_MOTOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_STPHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_STPCLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPCLINOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_STPBARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPBARSEROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_STPBARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPBARSERDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_STPCOLOR") == 0 )
      {
         /* Execute user subroutine: 'LOADSTPCOLOROPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("ActivarHdr_WCGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ActivarHdr_WCGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("ActivarHdr_WCGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_LIN") == 0 )
         {
            AV10TFStp_Lin = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFStp_Lin_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV12TFStp_Dia = localUtil.ctot( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV14TFStp_Mot = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV15TFStp_Mot_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV16TFStpHdr = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV17TFStpHdr_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV18TFStpClicod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFStpClicod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV20TFStpCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV21TFStpCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV22TFStpBarser = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV23TFStpBarser_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV24TFStpBarserDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV25TFStpBarserDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV26TFStpColor = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV27TFStpColor_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAINICIAL") == 0 )
         {
            AV48DiaInicial = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAINICIAL_TO") == 0 )
         {
            AV49DiaInicial_to = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSTP_MOTOPTIONS' Routine */
      returnInSub = false ;
      AV14TFStp_Mot = AV28SearchTxt ;
      AV15TFStp_Mot_Sel = "" ;
      AV54Activarhdr_wcds_1_filterfulltext = AV46FilterFullText ;
      AV55Activarhdr_wcds_2_tfstp_lin = AV10TFStp_Lin ;
      AV56Activarhdr_wcds_3_tfstp_lin_to = AV11TFStp_Lin_To ;
      AV57Activarhdr_wcds_4_tfstp_dia = AV12TFStp_Dia ;
      AV58Activarhdr_wcds_5_tfstp_mot = AV14TFStp_Mot ;
      AV59Activarhdr_wcds_6_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV60Activarhdr_wcds_7_tfstphdr = AV16TFStpHdr ;
      AV61Activarhdr_wcds_8_tfstphdr_sel = AV17TFStpHdr_Sel ;
      AV62Activarhdr_wcds_9_tfstpclicod = AV18TFStpClicod ;
      AV63Activarhdr_wcds_10_tfstpclicod_to = AV19TFStpClicod_To ;
      AV64Activarhdr_wcds_11_tfstpclinom = AV20TFStpCliNom ;
      AV65Activarhdr_wcds_12_tfstpclinom_sel = AV21TFStpCliNom_Sel ;
      AV66Activarhdr_wcds_13_tfstpbarser = AV22TFStpBarser ;
      AV67Activarhdr_wcds_14_tfstpbarser_sel = AV23TFStpBarser_Sel ;
      AV68Activarhdr_wcds_15_tfstpbarserdsc = AV24TFStpBarserDsc ;
      AV69Activarhdr_wcds_16_tfstpbarserdsc_sel = AV25TFStpBarserDsc_Sel ;
      AV70Activarhdr_wcds_17_tfstpcolor = AV26TFStpColor ;
      AV71Activarhdr_wcds_18_tfstpcolor_sel = AV27TFStpColor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin) ,
                                           Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to) ,
                                           AV57Activarhdr_wcds_4_tfstp_dia ,
                                           AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                           AV58Activarhdr_wcds_5_tfstp_mot ,
                                           AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                           AV60Activarhdr_wcds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV54Activarhdr_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod) ,
                                           Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to) ,
                                           AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                           AV64Activarhdr_wcds_11_tfstpclinom ,
                                           AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                           AV66Activarhdr_wcds_13_tfstpbarser ,
                                           AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                           AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                           AV70Activarhdr_wcds_17_tfstpcolor ,
                                           AV48DiaInicial ,
                                           AV49DiaInicial_to ,
                                           A396EmprCod ,
                                           AV47Emprcod ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV64Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
      lV66Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
      lV68Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
      lV70Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
      lV58Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV58Activarhdr_wcds_5_tfstp_mot), "%", "") ;
      lV60Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Activarhdr_wcds_7_tfstphdr), 11, "%") ;
      /* Using cursor P09613 */
      pr_default.execute(0, new Object[] {AV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), AV65Activarhdr_wcds_12_tfstpclinom_sel, AV64Activarhdr_wcds_11_tfstpclinom, lV64Activarhdr_wcds_11_tfstpclinom, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV66Activarhdr_wcds_13_tfstpbarser, lV66Activarhdr_wcds_13_tfstpbarser, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV68Activarhdr_wcds_15_tfstpbarserdsc, lV68Activarhdr_wcds_15_tfstpbarserdsc, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV70Activarhdr_wcds_17_tfstpcolor, lV70Activarhdr_wcds_17_tfstpcolor, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV47Emprcod, Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to), AV57Activarhdr_wcds_4_tfstp_dia, lV58Activarhdr_wcds_5_tfstp_mot, AV59Activarhdr_wcds_6_tfstp_mot_sel, lV60Activarhdr_wcds_7_tfstphdr, AV61Activarhdr_wcds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9612 = false ;
         A396EmprCod = P09613_A396EmprCod[0] ;
         A10755Stp_Est = P09613_A10755Stp_Est[0] ;
         A10752Stp_Mot = P09613_A10752Stp_Mot[0] ;
         A13723StpHdr = P09613_A13723StpHdr[0] ;
         A10751Stp_Dia = P09613_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P09613_A10750Stp_Lin[0] ;
         A13728StpColor = P09613_A13728StpColor[0] ;
         n13728StpColor = P09613_n13728StpColor[0] ;
         A13725StpBarserD = P09613_A13725StpBarserD[0] ;
         n13725StpBarserD = P09613_n13725StpBarserD[0] ;
         A13724StpBarser = P09613_A13724StpBarser[0] ;
         n13724StpBarser = P09613_n13724StpBarser[0] ;
         A13727StpCliNom = P09613_A13727StpCliNom[0] ;
         n13727StpCliNom = P09613_n13727StpCliNom[0] ;
         A13726StpClicod = P09613_A13726StpClicod[0] ;
         n13726StpClicod = P09613_n13726StpClicod[0] ;
         A10746Stp_hdr = P09613_A10746Stp_hdr[0] ;
         A10747Stp_r = P09613_A10747Stp_r[0] ;
         A10748Stp_p = P09613_A10748Stp_p[0] ;
         A13723StpHdr = P09613_A13723StpHdr[0] ;
         A13728StpColor = P09613_A13728StpColor[0] ;
         n13728StpColor = P09613_n13728StpColor[0] ;
         A13725StpBarserD = P09613_A13725StpBarserD[0] ;
         n13725StpBarserD = P09613_n13725StpBarserD[0] ;
         A13724StpBarser = P09613_A13724StpBarser[0] ;
         n13724StpBarser = P09613_n13724StpBarser[0] ;
         A13726StpClicod = P09613_A13726StpClicod[0] ;
         n13726StpClicod = P09613_n13726StpClicod[0] ;
         A13727StpCliNom = P09613_A13727StpCliNom[0] ;
         n13727StpCliNom = P09613_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV48DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV48DiaInicial)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV49DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV49DiaInicial_to)) )) )
            {
               AV40count = 0 ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09613_A10752Stp_Mot[0], A10752Stp_Mot) == 0 ) )
               {
                  brk9612 = false ;
                  A396EmprCod = P09613_A396EmprCod[0] ;
                  A10750Stp_Lin = P09613_A10750Stp_Lin[0] ;
                  A10746Stp_hdr = P09613_A10746Stp_hdr[0] ;
                  A10747Stp_r = P09613_A10747Stp_r[0] ;
                  A10748Stp_p = P09613_A10748Stp_p[0] ;
                  AV40count = (long)(AV40count+1) ;
                  brk9612 = true ;
                  pr_default.readNext(0);
               }
               if ( ! (GXutil.strcmp("", A10752Stp_Mot)==0) )
               {
                  AV32Option = A10752Stp_Mot ;
                  AV33Options.add(AV32Option, 0);
                  AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV33Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brk9612 )
         {
            brk9612 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADSTPHDROPTIONS' Routine */
      returnInSub = false ;
      AV16TFStpHdr = AV28SearchTxt ;
      AV17TFStpHdr_Sel = "" ;
      AV54Activarhdr_wcds_1_filterfulltext = AV46FilterFullText ;
      AV55Activarhdr_wcds_2_tfstp_lin = AV10TFStp_Lin ;
      AV56Activarhdr_wcds_3_tfstp_lin_to = AV11TFStp_Lin_To ;
      AV57Activarhdr_wcds_4_tfstp_dia = AV12TFStp_Dia ;
      AV58Activarhdr_wcds_5_tfstp_mot = AV14TFStp_Mot ;
      AV59Activarhdr_wcds_6_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV60Activarhdr_wcds_7_tfstphdr = AV16TFStpHdr ;
      AV61Activarhdr_wcds_8_tfstphdr_sel = AV17TFStpHdr_Sel ;
      AV62Activarhdr_wcds_9_tfstpclicod = AV18TFStpClicod ;
      AV63Activarhdr_wcds_10_tfstpclicod_to = AV19TFStpClicod_To ;
      AV64Activarhdr_wcds_11_tfstpclinom = AV20TFStpCliNom ;
      AV65Activarhdr_wcds_12_tfstpclinom_sel = AV21TFStpCliNom_Sel ;
      AV66Activarhdr_wcds_13_tfstpbarser = AV22TFStpBarser ;
      AV67Activarhdr_wcds_14_tfstpbarser_sel = AV23TFStpBarser_Sel ;
      AV68Activarhdr_wcds_15_tfstpbarserdsc = AV24TFStpBarserDsc ;
      AV69Activarhdr_wcds_16_tfstpbarserdsc_sel = AV25TFStpBarserDsc_Sel ;
      AV70Activarhdr_wcds_17_tfstpcolor = AV26TFStpColor ;
      AV71Activarhdr_wcds_18_tfstpcolor_sel = AV27TFStpColor_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin) ,
                                           Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to) ,
                                           AV57Activarhdr_wcds_4_tfstp_dia ,
                                           AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                           AV58Activarhdr_wcds_5_tfstp_mot ,
                                           AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                           AV60Activarhdr_wcds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV54Activarhdr_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod) ,
                                           Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to) ,
                                           AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                           AV64Activarhdr_wcds_11_tfstpclinom ,
                                           AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                           AV66Activarhdr_wcds_13_tfstpbarser ,
                                           AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                           AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                           AV70Activarhdr_wcds_17_tfstpcolor ,
                                           AV48DiaInicial ,
                                           AV49DiaInicial_to ,
                                           Byte.valueOf(A10755Stp_Est) ,
                                           AV47Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV64Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
      lV66Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
      lV68Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
      lV70Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
      lV58Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV58Activarhdr_wcds_5_tfstp_mot), "%", "") ;
      lV60Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Activarhdr_wcds_7_tfstphdr), 11, "%") ;
      /* Using cursor P09615 */
      pr_default.execute(1, new Object[] {AV47Emprcod, AV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), AV65Activarhdr_wcds_12_tfstpclinom_sel, AV64Activarhdr_wcds_11_tfstpclinom, lV64Activarhdr_wcds_11_tfstpclinom, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV66Activarhdr_wcds_13_tfstpbarser, lV66Activarhdr_wcds_13_tfstpbarser, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV68Activarhdr_wcds_15_tfstpbarserdsc, lV68Activarhdr_wcds_15_tfstpbarserdsc, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV70Activarhdr_wcds_17_tfstpcolor, lV70Activarhdr_wcds_17_tfstpcolor, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to), AV57Activarhdr_wcds_4_tfstp_dia, lV58Activarhdr_wcds_5_tfstp_mot, AV59Activarhdr_wcds_6_tfstp_mot_sel, lV60Activarhdr_wcds_7_tfstphdr, AV61Activarhdr_wcds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10755Stp_Est = P09615_A10755Stp_Est[0] ;
         A396EmprCod = P09615_A396EmprCod[0] ;
         A13723StpHdr = P09615_A13723StpHdr[0] ;
         A10752Stp_Mot = P09615_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09615_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P09615_A10750Stp_Lin[0] ;
         A13728StpColor = P09615_A13728StpColor[0] ;
         n13728StpColor = P09615_n13728StpColor[0] ;
         A13725StpBarserD = P09615_A13725StpBarserD[0] ;
         n13725StpBarserD = P09615_n13725StpBarserD[0] ;
         A13724StpBarser = P09615_A13724StpBarser[0] ;
         n13724StpBarser = P09615_n13724StpBarser[0] ;
         A13727StpCliNom = P09615_A13727StpCliNom[0] ;
         n13727StpCliNom = P09615_n13727StpCliNom[0] ;
         A13726StpClicod = P09615_A13726StpClicod[0] ;
         n13726StpClicod = P09615_n13726StpClicod[0] ;
         A10746Stp_hdr = P09615_A10746Stp_hdr[0] ;
         A10747Stp_r = P09615_A10747Stp_r[0] ;
         A10748Stp_p = P09615_A10748Stp_p[0] ;
         A13723StpHdr = P09615_A13723StpHdr[0] ;
         A13728StpColor = P09615_A13728StpColor[0] ;
         n13728StpColor = P09615_n13728StpColor[0] ;
         A13725StpBarserD = P09615_A13725StpBarserD[0] ;
         n13725StpBarserD = P09615_n13725StpBarserD[0] ;
         A13724StpBarser = P09615_A13724StpBarser[0] ;
         n13724StpBarser = P09615_n13724StpBarser[0] ;
         A13726StpClicod = P09615_A13726StpClicod[0] ;
         n13726StpClicod = P09615_n13726StpClicod[0] ;
         A13727StpCliNom = P09615_A13727StpCliNom[0] ;
         n13727StpCliNom = P09615_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV48DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV48DiaInicial)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV49DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV49DiaInicial_to)) )) )
            {
               if ( ! (GXutil.strcmp("", A13723StpHdr)==0) )
               {
                  AV32Option = A13723StpHdr ;
                  AV31InsertIndex = 1 ;
                  while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
                  {
                     AV31InsertIndex = (int)(AV31InsertIndex+1) ;
                  }
                  if ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) == 0 ) )
                  {
                     AV40count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV31InsertIndex)) ;
                     AV40count = (long)(AV40count+1) ;
                     AV38OptionIndexes.removeItem(AV31InsertIndex);
                     AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
                  }
                  else
                  {
                     AV33Options.add(AV32Option, AV31InsertIndex);
                     AV38OptionIndexes.add("1", AV31InsertIndex);
                  }
               }
               if ( AV33Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADSTPCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFStpCliNom = AV28SearchTxt ;
      AV21TFStpCliNom_Sel = "" ;
      AV54Activarhdr_wcds_1_filterfulltext = AV46FilterFullText ;
      AV55Activarhdr_wcds_2_tfstp_lin = AV10TFStp_Lin ;
      AV56Activarhdr_wcds_3_tfstp_lin_to = AV11TFStp_Lin_To ;
      AV57Activarhdr_wcds_4_tfstp_dia = AV12TFStp_Dia ;
      AV58Activarhdr_wcds_5_tfstp_mot = AV14TFStp_Mot ;
      AV59Activarhdr_wcds_6_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV60Activarhdr_wcds_7_tfstphdr = AV16TFStpHdr ;
      AV61Activarhdr_wcds_8_tfstphdr_sel = AV17TFStpHdr_Sel ;
      AV62Activarhdr_wcds_9_tfstpclicod = AV18TFStpClicod ;
      AV63Activarhdr_wcds_10_tfstpclicod_to = AV19TFStpClicod_To ;
      AV64Activarhdr_wcds_11_tfstpclinom = AV20TFStpCliNom ;
      AV65Activarhdr_wcds_12_tfstpclinom_sel = AV21TFStpCliNom_Sel ;
      AV66Activarhdr_wcds_13_tfstpbarser = AV22TFStpBarser ;
      AV67Activarhdr_wcds_14_tfstpbarser_sel = AV23TFStpBarser_Sel ;
      AV68Activarhdr_wcds_15_tfstpbarserdsc = AV24TFStpBarserDsc ;
      AV69Activarhdr_wcds_16_tfstpbarserdsc_sel = AV25TFStpBarserDsc_Sel ;
      AV70Activarhdr_wcds_17_tfstpcolor = AV26TFStpColor ;
      AV71Activarhdr_wcds_18_tfstpcolor_sel = AV27TFStpColor_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin) ,
                                           Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to) ,
                                           AV57Activarhdr_wcds_4_tfstp_dia ,
                                           AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                           AV58Activarhdr_wcds_5_tfstp_mot ,
                                           AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                           AV60Activarhdr_wcds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV54Activarhdr_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod) ,
                                           Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to) ,
                                           AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                           AV64Activarhdr_wcds_11_tfstpclinom ,
                                           AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                           AV66Activarhdr_wcds_13_tfstpbarser ,
                                           AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                           AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                           AV70Activarhdr_wcds_17_tfstpcolor ,
                                           AV48DiaInicial ,
                                           AV49DiaInicial_to ,
                                           Byte.valueOf(A10755Stp_Est) ,
                                           AV47Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV64Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
      lV66Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
      lV68Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
      lV70Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
      lV58Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV58Activarhdr_wcds_5_tfstp_mot), "%", "") ;
      lV60Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Activarhdr_wcds_7_tfstphdr), 11, "%") ;
      /* Using cursor P09617 */
      pr_default.execute(2, new Object[] {AV47Emprcod, AV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), AV65Activarhdr_wcds_12_tfstpclinom_sel, AV64Activarhdr_wcds_11_tfstpclinom, lV64Activarhdr_wcds_11_tfstpclinom, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV66Activarhdr_wcds_13_tfstpbarser, lV66Activarhdr_wcds_13_tfstpbarser, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV68Activarhdr_wcds_15_tfstpbarserdsc, lV68Activarhdr_wcds_15_tfstpbarserdsc, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV70Activarhdr_wcds_17_tfstpcolor, lV70Activarhdr_wcds_17_tfstpcolor, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to), AV57Activarhdr_wcds_4_tfstp_dia, lV58Activarhdr_wcds_5_tfstp_mot, AV59Activarhdr_wcds_6_tfstp_mot_sel, lV60Activarhdr_wcds_7_tfstphdr, AV61Activarhdr_wcds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10755Stp_Est = P09617_A10755Stp_Est[0] ;
         A396EmprCod = P09617_A396EmprCod[0] ;
         A13723StpHdr = P09617_A13723StpHdr[0] ;
         A10752Stp_Mot = P09617_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09617_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P09617_A10750Stp_Lin[0] ;
         A13728StpColor = P09617_A13728StpColor[0] ;
         n13728StpColor = P09617_n13728StpColor[0] ;
         A13725StpBarserD = P09617_A13725StpBarserD[0] ;
         n13725StpBarserD = P09617_n13725StpBarserD[0] ;
         A13724StpBarser = P09617_A13724StpBarser[0] ;
         n13724StpBarser = P09617_n13724StpBarser[0] ;
         A13727StpCliNom = P09617_A13727StpCliNom[0] ;
         n13727StpCliNom = P09617_n13727StpCliNom[0] ;
         A13726StpClicod = P09617_A13726StpClicod[0] ;
         n13726StpClicod = P09617_n13726StpClicod[0] ;
         A10746Stp_hdr = P09617_A10746Stp_hdr[0] ;
         A10747Stp_r = P09617_A10747Stp_r[0] ;
         A10748Stp_p = P09617_A10748Stp_p[0] ;
         A13723StpHdr = P09617_A13723StpHdr[0] ;
         A13728StpColor = P09617_A13728StpColor[0] ;
         n13728StpColor = P09617_n13728StpColor[0] ;
         A13725StpBarserD = P09617_A13725StpBarserD[0] ;
         n13725StpBarserD = P09617_n13725StpBarserD[0] ;
         A13724StpBarser = P09617_A13724StpBarser[0] ;
         n13724StpBarser = P09617_n13724StpBarser[0] ;
         A13726StpClicod = P09617_A13726StpClicod[0] ;
         n13726StpClicod = P09617_n13726StpClicod[0] ;
         A13727StpCliNom = P09617_A13727StpCliNom[0] ;
         n13727StpCliNom = P09617_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV48DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV48DiaInicial)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV49DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV49DiaInicial_to)) )) )
            {
               if ( ! (GXutil.strcmp("", A13727StpCliNom)==0) )
               {
                  AV32Option = A13727StpCliNom ;
                  AV31InsertIndex = 1 ;
                  while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
                  {
                     AV31InsertIndex = (int)(AV31InsertIndex+1) ;
                  }
                  if ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) == 0 ) )
                  {
                     AV40count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV31InsertIndex)) ;
                     AV40count = (long)(AV40count+1) ;
                     AV38OptionIndexes.removeItem(AV31InsertIndex);
                     AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
                  }
                  else
                  {
                     AV33Options.add(AV32Option, AV31InsertIndex);
                     AV38OptionIndexes.add("1", AV31InsertIndex);
                  }
               }
               if ( AV33Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADSTPBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV22TFStpBarser = AV28SearchTxt ;
      AV23TFStpBarser_Sel = "" ;
      AV54Activarhdr_wcds_1_filterfulltext = AV46FilterFullText ;
      AV55Activarhdr_wcds_2_tfstp_lin = AV10TFStp_Lin ;
      AV56Activarhdr_wcds_3_tfstp_lin_to = AV11TFStp_Lin_To ;
      AV57Activarhdr_wcds_4_tfstp_dia = AV12TFStp_Dia ;
      AV58Activarhdr_wcds_5_tfstp_mot = AV14TFStp_Mot ;
      AV59Activarhdr_wcds_6_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV60Activarhdr_wcds_7_tfstphdr = AV16TFStpHdr ;
      AV61Activarhdr_wcds_8_tfstphdr_sel = AV17TFStpHdr_Sel ;
      AV62Activarhdr_wcds_9_tfstpclicod = AV18TFStpClicod ;
      AV63Activarhdr_wcds_10_tfstpclicod_to = AV19TFStpClicod_To ;
      AV64Activarhdr_wcds_11_tfstpclinom = AV20TFStpCliNom ;
      AV65Activarhdr_wcds_12_tfstpclinom_sel = AV21TFStpCliNom_Sel ;
      AV66Activarhdr_wcds_13_tfstpbarser = AV22TFStpBarser ;
      AV67Activarhdr_wcds_14_tfstpbarser_sel = AV23TFStpBarser_Sel ;
      AV68Activarhdr_wcds_15_tfstpbarserdsc = AV24TFStpBarserDsc ;
      AV69Activarhdr_wcds_16_tfstpbarserdsc_sel = AV25TFStpBarserDsc_Sel ;
      AV70Activarhdr_wcds_17_tfstpcolor = AV26TFStpColor ;
      AV71Activarhdr_wcds_18_tfstpcolor_sel = AV27TFStpColor_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin) ,
                                           Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to) ,
                                           AV57Activarhdr_wcds_4_tfstp_dia ,
                                           AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                           AV58Activarhdr_wcds_5_tfstp_mot ,
                                           AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                           AV60Activarhdr_wcds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV54Activarhdr_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod) ,
                                           Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to) ,
                                           AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                           AV64Activarhdr_wcds_11_tfstpclinom ,
                                           AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                           AV66Activarhdr_wcds_13_tfstpbarser ,
                                           AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                           AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                           AV70Activarhdr_wcds_17_tfstpcolor ,
                                           AV48DiaInicial ,
                                           AV49DiaInicial_to ,
                                           Byte.valueOf(A10755Stp_Est) ,
                                           AV47Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV64Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
      lV66Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
      lV68Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
      lV70Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
      lV58Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV58Activarhdr_wcds_5_tfstp_mot), "%", "") ;
      lV60Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Activarhdr_wcds_7_tfstphdr), 11, "%") ;
      /* Using cursor P09619 */
      pr_default.execute(3, new Object[] {AV47Emprcod, AV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), AV65Activarhdr_wcds_12_tfstpclinom_sel, AV64Activarhdr_wcds_11_tfstpclinom, lV64Activarhdr_wcds_11_tfstpclinom, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV66Activarhdr_wcds_13_tfstpbarser, lV66Activarhdr_wcds_13_tfstpbarser, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV68Activarhdr_wcds_15_tfstpbarserdsc, lV68Activarhdr_wcds_15_tfstpbarserdsc, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV70Activarhdr_wcds_17_tfstpcolor, lV70Activarhdr_wcds_17_tfstpcolor, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to), AV57Activarhdr_wcds_4_tfstp_dia, lV58Activarhdr_wcds_5_tfstp_mot, AV59Activarhdr_wcds_6_tfstp_mot_sel, lV60Activarhdr_wcds_7_tfstphdr, AV61Activarhdr_wcds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A10755Stp_Est = P09619_A10755Stp_Est[0] ;
         A396EmprCod = P09619_A396EmprCod[0] ;
         A13723StpHdr = P09619_A13723StpHdr[0] ;
         A10752Stp_Mot = P09619_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P09619_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P09619_A10750Stp_Lin[0] ;
         A13728StpColor = P09619_A13728StpColor[0] ;
         n13728StpColor = P09619_n13728StpColor[0] ;
         A13725StpBarserD = P09619_A13725StpBarserD[0] ;
         n13725StpBarserD = P09619_n13725StpBarserD[0] ;
         A13724StpBarser = P09619_A13724StpBarser[0] ;
         n13724StpBarser = P09619_n13724StpBarser[0] ;
         A13727StpCliNom = P09619_A13727StpCliNom[0] ;
         n13727StpCliNom = P09619_n13727StpCliNom[0] ;
         A13726StpClicod = P09619_A13726StpClicod[0] ;
         n13726StpClicod = P09619_n13726StpClicod[0] ;
         A10746Stp_hdr = P09619_A10746Stp_hdr[0] ;
         A10747Stp_r = P09619_A10747Stp_r[0] ;
         A10748Stp_p = P09619_A10748Stp_p[0] ;
         A13723StpHdr = P09619_A13723StpHdr[0] ;
         A13728StpColor = P09619_A13728StpColor[0] ;
         n13728StpColor = P09619_n13728StpColor[0] ;
         A13725StpBarserD = P09619_A13725StpBarserD[0] ;
         n13725StpBarserD = P09619_n13725StpBarserD[0] ;
         A13724StpBarser = P09619_A13724StpBarser[0] ;
         n13724StpBarser = P09619_n13724StpBarser[0] ;
         A13726StpClicod = P09619_A13726StpClicod[0] ;
         n13726StpClicod = P09619_n13726StpClicod[0] ;
         A13727StpCliNom = P09619_A13727StpCliNom[0] ;
         n13727StpCliNom = P09619_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV48DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV48DiaInicial)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV49DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV49DiaInicial_to)) )) )
            {
               if ( ! (GXutil.strcmp("", A13724StpBarser)==0) )
               {
                  AV32Option = A13724StpBarser ;
                  AV31InsertIndex = 1 ;
                  while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
                  {
                     AV31InsertIndex = (int)(AV31InsertIndex+1) ;
                  }
                  if ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) == 0 ) )
                  {
                     AV40count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV31InsertIndex)) ;
                     AV40count = (long)(AV40count+1) ;
                     AV38OptionIndexes.removeItem(AV31InsertIndex);
                     AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
                  }
                  else
                  {
                     AV33Options.add(AV32Option, AV31InsertIndex);
                     AV38OptionIndexes.add("1", AV31InsertIndex);
                  }
               }
               if ( AV33Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADSTPBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFStpBarserDsc = AV28SearchTxt ;
      AV25TFStpBarserDsc_Sel = "" ;
      AV54Activarhdr_wcds_1_filterfulltext = AV46FilterFullText ;
      AV55Activarhdr_wcds_2_tfstp_lin = AV10TFStp_Lin ;
      AV56Activarhdr_wcds_3_tfstp_lin_to = AV11TFStp_Lin_To ;
      AV57Activarhdr_wcds_4_tfstp_dia = AV12TFStp_Dia ;
      AV58Activarhdr_wcds_5_tfstp_mot = AV14TFStp_Mot ;
      AV59Activarhdr_wcds_6_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV60Activarhdr_wcds_7_tfstphdr = AV16TFStpHdr ;
      AV61Activarhdr_wcds_8_tfstphdr_sel = AV17TFStpHdr_Sel ;
      AV62Activarhdr_wcds_9_tfstpclicod = AV18TFStpClicod ;
      AV63Activarhdr_wcds_10_tfstpclicod_to = AV19TFStpClicod_To ;
      AV64Activarhdr_wcds_11_tfstpclinom = AV20TFStpCliNom ;
      AV65Activarhdr_wcds_12_tfstpclinom_sel = AV21TFStpCliNom_Sel ;
      AV66Activarhdr_wcds_13_tfstpbarser = AV22TFStpBarser ;
      AV67Activarhdr_wcds_14_tfstpbarser_sel = AV23TFStpBarser_Sel ;
      AV68Activarhdr_wcds_15_tfstpbarserdsc = AV24TFStpBarserDsc ;
      AV69Activarhdr_wcds_16_tfstpbarserdsc_sel = AV25TFStpBarserDsc_Sel ;
      AV70Activarhdr_wcds_17_tfstpcolor = AV26TFStpColor ;
      AV71Activarhdr_wcds_18_tfstpcolor_sel = AV27TFStpColor_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin) ,
                                           Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to) ,
                                           AV57Activarhdr_wcds_4_tfstp_dia ,
                                           AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                           AV58Activarhdr_wcds_5_tfstp_mot ,
                                           AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                           AV60Activarhdr_wcds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV54Activarhdr_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod) ,
                                           Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to) ,
                                           AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                           AV64Activarhdr_wcds_11_tfstpclinom ,
                                           AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                           AV66Activarhdr_wcds_13_tfstpbarser ,
                                           AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                           AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                           AV70Activarhdr_wcds_17_tfstpcolor ,
                                           AV48DiaInicial ,
                                           AV49DiaInicial_to ,
                                           Byte.valueOf(A10755Stp_Est) ,
                                           AV47Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV64Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
      lV66Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
      lV68Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
      lV70Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
      lV58Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV58Activarhdr_wcds_5_tfstp_mot), "%", "") ;
      lV60Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Activarhdr_wcds_7_tfstphdr), 11, "%") ;
      /* Using cursor P096111 */
      pr_default.execute(4, new Object[] {AV47Emprcod, AV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), AV65Activarhdr_wcds_12_tfstpclinom_sel, AV64Activarhdr_wcds_11_tfstpclinom, lV64Activarhdr_wcds_11_tfstpclinom, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV66Activarhdr_wcds_13_tfstpbarser, lV66Activarhdr_wcds_13_tfstpbarser, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV68Activarhdr_wcds_15_tfstpbarserdsc, lV68Activarhdr_wcds_15_tfstpbarserdsc, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV70Activarhdr_wcds_17_tfstpcolor, lV70Activarhdr_wcds_17_tfstpcolor, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to), AV57Activarhdr_wcds_4_tfstp_dia, lV58Activarhdr_wcds_5_tfstp_mot, AV59Activarhdr_wcds_6_tfstp_mot_sel, lV60Activarhdr_wcds_7_tfstphdr, AV61Activarhdr_wcds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A10755Stp_Est = P096111_A10755Stp_Est[0] ;
         A396EmprCod = P096111_A396EmprCod[0] ;
         A13723StpHdr = P096111_A13723StpHdr[0] ;
         A10752Stp_Mot = P096111_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P096111_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P096111_A10750Stp_Lin[0] ;
         A13728StpColor = P096111_A13728StpColor[0] ;
         n13728StpColor = P096111_n13728StpColor[0] ;
         A13725StpBarserD = P096111_A13725StpBarserD[0] ;
         n13725StpBarserD = P096111_n13725StpBarserD[0] ;
         A13724StpBarser = P096111_A13724StpBarser[0] ;
         n13724StpBarser = P096111_n13724StpBarser[0] ;
         A13727StpCliNom = P096111_A13727StpCliNom[0] ;
         n13727StpCliNom = P096111_n13727StpCliNom[0] ;
         A13726StpClicod = P096111_A13726StpClicod[0] ;
         n13726StpClicod = P096111_n13726StpClicod[0] ;
         A10746Stp_hdr = P096111_A10746Stp_hdr[0] ;
         A10747Stp_r = P096111_A10747Stp_r[0] ;
         A10748Stp_p = P096111_A10748Stp_p[0] ;
         A13723StpHdr = P096111_A13723StpHdr[0] ;
         A13728StpColor = P096111_A13728StpColor[0] ;
         n13728StpColor = P096111_n13728StpColor[0] ;
         A13725StpBarserD = P096111_A13725StpBarserD[0] ;
         n13725StpBarserD = P096111_n13725StpBarserD[0] ;
         A13724StpBarser = P096111_A13724StpBarser[0] ;
         n13724StpBarser = P096111_n13724StpBarser[0] ;
         A13726StpClicod = P096111_A13726StpClicod[0] ;
         n13726StpClicod = P096111_n13726StpClicod[0] ;
         A13727StpCliNom = P096111_A13727StpCliNom[0] ;
         n13727StpCliNom = P096111_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV48DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV48DiaInicial)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV49DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV49DiaInicial_to)) )) )
            {
               if ( ! (GXutil.strcmp("", A13725StpBarserD)==0) )
               {
                  AV32Option = A13725StpBarserD ;
                  AV31InsertIndex = 1 ;
                  while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
                  {
                     AV31InsertIndex = (int)(AV31InsertIndex+1) ;
                  }
                  if ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) == 0 ) )
                  {
                     AV40count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV31InsertIndex)) ;
                     AV40count = (long)(AV40count+1) ;
                     AV38OptionIndexes.removeItem(AV31InsertIndex);
                     AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
                  }
                  else
                  {
                     AV33Options.add(AV32Option, AV31InsertIndex);
                     AV38OptionIndexes.add("1", AV31InsertIndex);
                  }
               }
               if ( AV33Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADSTPCOLOROPTIONS' Routine */
      returnInSub = false ;
      AV26TFStpColor = AV28SearchTxt ;
      AV27TFStpColor_Sel = "" ;
      AV54Activarhdr_wcds_1_filterfulltext = AV46FilterFullText ;
      AV55Activarhdr_wcds_2_tfstp_lin = AV10TFStp_Lin ;
      AV56Activarhdr_wcds_3_tfstp_lin_to = AV11TFStp_Lin_To ;
      AV57Activarhdr_wcds_4_tfstp_dia = AV12TFStp_Dia ;
      AV58Activarhdr_wcds_5_tfstp_mot = AV14TFStp_Mot ;
      AV59Activarhdr_wcds_6_tfstp_mot_sel = AV15TFStp_Mot_Sel ;
      AV60Activarhdr_wcds_7_tfstphdr = AV16TFStpHdr ;
      AV61Activarhdr_wcds_8_tfstphdr_sel = AV17TFStpHdr_Sel ;
      AV62Activarhdr_wcds_9_tfstpclicod = AV18TFStpClicod ;
      AV63Activarhdr_wcds_10_tfstpclicod_to = AV19TFStpClicod_To ;
      AV64Activarhdr_wcds_11_tfstpclinom = AV20TFStpCliNom ;
      AV65Activarhdr_wcds_12_tfstpclinom_sel = AV21TFStpCliNom_Sel ;
      AV66Activarhdr_wcds_13_tfstpbarser = AV22TFStpBarser ;
      AV67Activarhdr_wcds_14_tfstpbarser_sel = AV23TFStpBarser_Sel ;
      AV68Activarhdr_wcds_15_tfstpbarserdsc = AV24TFStpBarserDsc ;
      AV69Activarhdr_wcds_16_tfstpbarserdsc_sel = AV25TFStpBarserDsc_Sel ;
      AV70Activarhdr_wcds_17_tfstpcolor = AV26TFStpColor ;
      AV71Activarhdr_wcds_18_tfstpcolor_sel = AV27TFStpColor_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin) ,
                                           Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to) ,
                                           AV57Activarhdr_wcds_4_tfstp_dia ,
                                           AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                           AV58Activarhdr_wcds_5_tfstp_mot ,
                                           AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                           AV60Activarhdr_wcds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           AV54Activarhdr_wcds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod) ,
                                           Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to) ,
                                           AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                           AV64Activarhdr_wcds_11_tfstpclinom ,
                                           AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                           AV66Activarhdr_wcds_13_tfstpbarser ,
                                           AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                           AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                           AV70Activarhdr_wcds_17_tfstpcolor ,
                                           AV48DiaInicial ,
                                           AV49DiaInicial_to ,
                                           Byte.valueOf(A10755Stp_Est) ,
                                           AV47Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV54Activarhdr_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Activarhdr_wcds_1_filterfulltext), "%", "") ;
      lV64Activarhdr_wcds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV64Activarhdr_wcds_11_tfstpclinom), 30, "%") ;
      lV66Activarhdr_wcds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV66Activarhdr_wcds_13_tfstpbarser), 16, "%") ;
      lV68Activarhdr_wcds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV68Activarhdr_wcds_15_tfstpbarserdsc), 26, "%") ;
      lV70Activarhdr_wcds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV70Activarhdr_wcds_17_tfstpcolor), 13, "%") ;
      lV58Activarhdr_wcds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV58Activarhdr_wcds_5_tfstp_mot), "%", "") ;
      lV60Activarhdr_wcds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV60Activarhdr_wcds_7_tfstphdr), 11, "%") ;
      /* Using cursor P096113 */
      pr_default.execute(5, new Object[] {AV47Emprcod, AV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, lV54Activarhdr_wcds_1_filterfulltext, Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV62Activarhdr_wcds_9_tfstpclicod), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), Integer.valueOf(AV63Activarhdr_wcds_10_tfstpclicod_to), AV65Activarhdr_wcds_12_tfstpclinom_sel, AV64Activarhdr_wcds_11_tfstpclinom, lV64Activarhdr_wcds_11_tfstpclinom, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV65Activarhdr_wcds_12_tfstpclinom_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV66Activarhdr_wcds_13_tfstpbarser, lV66Activarhdr_wcds_13_tfstpbarser, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV67Activarhdr_wcds_14_tfstpbarser_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV68Activarhdr_wcds_15_tfstpbarserdsc, lV68Activarhdr_wcds_15_tfstpbarserdsc, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV69Activarhdr_wcds_16_tfstpbarserdsc_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV70Activarhdr_wcds_17_tfstpcolor, lV70Activarhdr_wcds_17_tfstpcolor, AV71Activarhdr_wcds_18_tfstpcolor_sel, AV71Activarhdr_wcds_18_tfstpcolor_sel, Short.valueOf(AV55Activarhdr_wcds_2_tfstp_lin), Short.valueOf(AV56Activarhdr_wcds_3_tfstp_lin_to), AV57Activarhdr_wcds_4_tfstp_dia, lV58Activarhdr_wcds_5_tfstp_mot, AV59Activarhdr_wcds_6_tfstp_mot_sel, lV60Activarhdr_wcds_7_tfstphdr, AV61Activarhdr_wcds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A10755Stp_Est = P096113_A10755Stp_Est[0] ;
         A396EmprCod = P096113_A396EmprCod[0] ;
         A13723StpHdr = P096113_A13723StpHdr[0] ;
         A10752Stp_Mot = P096113_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P096113_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P096113_A10750Stp_Lin[0] ;
         A13728StpColor = P096113_A13728StpColor[0] ;
         n13728StpColor = P096113_n13728StpColor[0] ;
         A13725StpBarserD = P096113_A13725StpBarserD[0] ;
         n13725StpBarserD = P096113_n13725StpBarserD[0] ;
         A13724StpBarser = P096113_A13724StpBarser[0] ;
         n13724StpBarser = P096113_n13724StpBarser[0] ;
         A13727StpCliNom = P096113_A13727StpCliNom[0] ;
         n13727StpCliNom = P096113_n13727StpCliNom[0] ;
         A13726StpClicod = P096113_A13726StpClicod[0] ;
         n13726StpClicod = P096113_n13726StpClicod[0] ;
         A10746Stp_hdr = P096113_A10746Stp_hdr[0] ;
         A10747Stp_r = P096113_A10747Stp_r[0] ;
         A10748Stp_p = P096113_A10748Stp_p[0] ;
         A13723StpHdr = P096113_A13723StpHdr[0] ;
         A13728StpColor = P096113_A13728StpColor[0] ;
         n13728StpColor = P096113_n13728StpColor[0] ;
         A13725StpBarserD = P096113_A13725StpBarserD[0] ;
         n13725StpBarserD = P096113_n13725StpBarserD[0] ;
         A13724StpBarser = P096113_A13724StpBarser[0] ;
         n13724StpBarser = P096113_n13724StpBarser[0] ;
         A13726StpClicod = P096113_A13726StpClicod[0] ;
         n13726StpClicod = P096113_n13726StpClicod[0] ;
         A13727StpCliNom = P096113_A13727StpCliNom[0] ;
         n13727StpCliNom = P096113_n13727StpCliNom[0] ;
         if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).after( GXutil.resetTime( AV48DiaInicial )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV48DiaInicial)) )) )
         {
            if ( (( GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))).before( GXutil.resetTime( AV49DiaInicial_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( localUtil.ttoc( A10751Stp_Dia, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV49DiaInicial_to)) )) )
            {
               if ( ! (GXutil.strcmp("", A13728StpColor)==0) )
               {
                  AV32Option = A13728StpColor ;
                  AV31InsertIndex = 1 ;
                  while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
                  {
                     AV31InsertIndex = (int)(AV31InsertIndex+1) ;
                  }
                  if ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) == 0 ) )
                  {
                     AV40count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV31InsertIndex)) ;
                     AV40count = (long)(AV40count+1) ;
                     AV38OptionIndexes.removeItem(AV31InsertIndex);
                     AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
                  }
                  else
                  {
                     AV33Options.add(AV32Option, AV31InsertIndex);
                     AV38OptionIndexes.add("1", AV31InsertIndex);
                  }
               }
               if ( AV33Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = activarhdr_wcgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = activarhdr_wcgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = activarhdr_wcgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46FilterFullText = "" ;
      AV12TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV14TFStp_Mot = "" ;
      AV15TFStp_Mot_Sel = "" ;
      AV16TFStpHdr = "" ;
      AV17TFStpHdr_Sel = "" ;
      AV20TFStpCliNom = "" ;
      AV21TFStpCliNom_Sel = "" ;
      AV22TFStpBarser = "" ;
      AV23TFStpBarser_Sel = "" ;
      AV24TFStpBarserDsc = "" ;
      AV25TFStpBarserDsc_Sel = "" ;
      AV26TFStpColor = "" ;
      AV27TFStpColor_Sel = "" ;
      AV47Emprcod = "" ;
      AV48DiaInicial = GXutil.nullDate() ;
      AV49DiaInicial_to = GXutil.nullDate() ;
      A10752Stp_Mot = "" ;
      AV54Activarhdr_wcds_1_filterfulltext = "" ;
      AV57Activarhdr_wcds_4_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV58Activarhdr_wcds_5_tfstp_mot = "" ;
      AV59Activarhdr_wcds_6_tfstp_mot_sel = "" ;
      AV60Activarhdr_wcds_7_tfstphdr = "" ;
      AV61Activarhdr_wcds_8_tfstphdr_sel = "" ;
      AV64Activarhdr_wcds_11_tfstpclinom = "" ;
      AV65Activarhdr_wcds_12_tfstpclinom_sel = "" ;
      AV66Activarhdr_wcds_13_tfstpbarser = "" ;
      AV67Activarhdr_wcds_14_tfstpbarser_sel = "" ;
      AV68Activarhdr_wcds_15_tfstpbarserdsc = "" ;
      AV69Activarhdr_wcds_16_tfstpbarserdsc_sel = "" ;
      AV70Activarhdr_wcds_17_tfstpcolor = "" ;
      AV71Activarhdr_wcds_18_tfstpcolor_sel = "" ;
      lV54Activarhdr_wcds_1_filterfulltext = "" ;
      lV64Activarhdr_wcds_11_tfstpclinom = "" ;
      lV66Activarhdr_wcds_13_tfstpbarser = "" ;
      lV68Activarhdr_wcds_15_tfstpbarserdsc = "" ;
      lV70Activarhdr_wcds_17_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV58Activarhdr_wcds_5_tfstp_mot = "" ;
      lV60Activarhdr_wcds_7_tfstphdr = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10748Stp_p = "" ;
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      A396EmprCod = "" ;
      P09613_A129BarCod = new int[1] ;
      P09613_A132BarCodReo = new byte[1] ;
      P09613_A130BarCodPar = new String[] {""} ;
      P09613_A396EmprCod = new String[] {""} ;
      P09613_A10755Stp_Est = new byte[1] ;
      P09613_A10752Stp_Mot = new String[] {""} ;
      P09613_A13723StpHdr = new String[] {""} ;
      P09613_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09613_A10750Stp_Lin = new short[1] ;
      P09613_A13728StpColor = new String[] {""} ;
      P09613_n13728StpColor = new boolean[] {false} ;
      P09613_A13725StpBarserD = new String[] {""} ;
      P09613_n13725StpBarserD = new boolean[] {false} ;
      P09613_A13724StpBarser = new String[] {""} ;
      P09613_n13724StpBarser = new boolean[] {false} ;
      P09613_A13727StpCliNom = new String[] {""} ;
      P09613_n13727StpCliNom = new boolean[] {false} ;
      P09613_A13726StpClicod = new int[1] ;
      P09613_n13726StpClicod = new boolean[] {false} ;
      P09613_A10746Stp_hdr = new int[1] ;
      P09613_A10747Stp_r = new byte[1] ;
      P09613_A10748Stp_p = new String[] {""} ;
      AV32Option = "" ;
      P09615_A129BarCod = new int[1] ;
      P09615_A132BarCodReo = new byte[1] ;
      P09615_A130BarCodPar = new String[] {""} ;
      P09615_A10755Stp_Est = new byte[1] ;
      P09615_A396EmprCod = new String[] {""} ;
      P09615_A13723StpHdr = new String[] {""} ;
      P09615_A10752Stp_Mot = new String[] {""} ;
      P09615_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09615_A10750Stp_Lin = new short[1] ;
      P09615_A13728StpColor = new String[] {""} ;
      P09615_n13728StpColor = new boolean[] {false} ;
      P09615_A13725StpBarserD = new String[] {""} ;
      P09615_n13725StpBarserD = new boolean[] {false} ;
      P09615_A13724StpBarser = new String[] {""} ;
      P09615_n13724StpBarser = new boolean[] {false} ;
      P09615_A13727StpCliNom = new String[] {""} ;
      P09615_n13727StpCliNom = new boolean[] {false} ;
      P09615_A13726StpClicod = new int[1] ;
      P09615_n13726StpClicod = new boolean[] {false} ;
      P09615_A10746Stp_hdr = new int[1] ;
      P09615_A10747Stp_r = new byte[1] ;
      P09615_A10748Stp_p = new String[] {""} ;
      P09617_A129BarCod = new int[1] ;
      P09617_A132BarCodReo = new byte[1] ;
      P09617_A130BarCodPar = new String[] {""} ;
      P09617_A10755Stp_Est = new byte[1] ;
      P09617_A396EmprCod = new String[] {""} ;
      P09617_A13723StpHdr = new String[] {""} ;
      P09617_A10752Stp_Mot = new String[] {""} ;
      P09617_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09617_A10750Stp_Lin = new short[1] ;
      P09617_A13728StpColor = new String[] {""} ;
      P09617_n13728StpColor = new boolean[] {false} ;
      P09617_A13725StpBarserD = new String[] {""} ;
      P09617_n13725StpBarserD = new boolean[] {false} ;
      P09617_A13724StpBarser = new String[] {""} ;
      P09617_n13724StpBarser = new boolean[] {false} ;
      P09617_A13727StpCliNom = new String[] {""} ;
      P09617_n13727StpCliNom = new boolean[] {false} ;
      P09617_A13726StpClicod = new int[1] ;
      P09617_n13726StpClicod = new boolean[] {false} ;
      P09617_A10746Stp_hdr = new int[1] ;
      P09617_A10747Stp_r = new byte[1] ;
      P09617_A10748Stp_p = new String[] {""} ;
      P09619_A129BarCod = new int[1] ;
      P09619_A132BarCodReo = new byte[1] ;
      P09619_A130BarCodPar = new String[] {""} ;
      P09619_A10755Stp_Est = new byte[1] ;
      P09619_A396EmprCod = new String[] {""} ;
      P09619_A13723StpHdr = new String[] {""} ;
      P09619_A10752Stp_Mot = new String[] {""} ;
      P09619_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09619_A10750Stp_Lin = new short[1] ;
      P09619_A13728StpColor = new String[] {""} ;
      P09619_n13728StpColor = new boolean[] {false} ;
      P09619_A13725StpBarserD = new String[] {""} ;
      P09619_n13725StpBarserD = new boolean[] {false} ;
      P09619_A13724StpBarser = new String[] {""} ;
      P09619_n13724StpBarser = new boolean[] {false} ;
      P09619_A13727StpCliNom = new String[] {""} ;
      P09619_n13727StpCliNom = new boolean[] {false} ;
      P09619_A13726StpClicod = new int[1] ;
      P09619_n13726StpClicod = new boolean[] {false} ;
      P09619_A10746Stp_hdr = new int[1] ;
      P09619_A10747Stp_r = new byte[1] ;
      P09619_A10748Stp_p = new String[] {""} ;
      P096111_A129BarCod = new int[1] ;
      P096111_A132BarCodReo = new byte[1] ;
      P096111_A130BarCodPar = new String[] {""} ;
      P096111_A10755Stp_Est = new byte[1] ;
      P096111_A396EmprCod = new String[] {""} ;
      P096111_A13723StpHdr = new String[] {""} ;
      P096111_A10752Stp_Mot = new String[] {""} ;
      P096111_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P096111_A10750Stp_Lin = new short[1] ;
      P096111_A13728StpColor = new String[] {""} ;
      P096111_n13728StpColor = new boolean[] {false} ;
      P096111_A13725StpBarserD = new String[] {""} ;
      P096111_n13725StpBarserD = new boolean[] {false} ;
      P096111_A13724StpBarser = new String[] {""} ;
      P096111_n13724StpBarser = new boolean[] {false} ;
      P096111_A13727StpCliNom = new String[] {""} ;
      P096111_n13727StpCliNom = new boolean[] {false} ;
      P096111_A13726StpClicod = new int[1] ;
      P096111_n13726StpClicod = new boolean[] {false} ;
      P096111_A10746Stp_hdr = new int[1] ;
      P096111_A10747Stp_r = new byte[1] ;
      P096111_A10748Stp_p = new String[] {""} ;
      P096113_A129BarCod = new int[1] ;
      P096113_A132BarCodReo = new byte[1] ;
      P096113_A130BarCodPar = new String[] {""} ;
      P096113_A10755Stp_Est = new byte[1] ;
      P096113_A396EmprCod = new String[] {""} ;
      P096113_A13723StpHdr = new String[] {""} ;
      P096113_A10752Stp_Mot = new String[] {""} ;
      P096113_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P096113_A10750Stp_Lin = new short[1] ;
      P096113_A13728StpColor = new String[] {""} ;
      P096113_n13728StpColor = new boolean[] {false} ;
      P096113_A13725StpBarserD = new String[] {""} ;
      P096113_n13725StpBarserD = new boolean[] {false} ;
      P096113_A13724StpBarser = new String[] {""} ;
      P096113_n13724StpBarser = new boolean[] {false} ;
      P096113_A13727StpCliNom = new String[] {""} ;
      P096113_n13727StpCliNom = new boolean[] {false} ;
      P096113_A13726StpClicod = new int[1] ;
      P096113_n13726StpClicod = new boolean[] {false} ;
      P096113_A10746Stp_hdr = new int[1] ;
      P096113_A10747Stp_r = new byte[1] ;
      P096113_A10748Stp_p = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.activarhdr_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09613_A129BarCod, P09613_A132BarCodReo, P09613_A130BarCodPar, P09613_A396EmprCod, P09613_A10755Stp_Est, P09613_A10752Stp_Mot, P09613_A13723StpHdr, P09613_A10751Stp_Dia, P09613_A10750Stp_Lin, P09613_A13728StpColor,
            P09613_n13728StpColor, P09613_A13725StpBarserD, P09613_n13725StpBarserD, P09613_A13724StpBarser, P09613_n13724StpBarser, P09613_A13727StpCliNom, P09613_n13727StpCliNom, P09613_A13726StpClicod, P09613_n13726StpClicod, P09613_A10746Stp_hdr,
            P09613_A10747Stp_r, P09613_A10748Stp_p
            }
            , new Object[] {
            P09615_A129BarCod, P09615_A132BarCodReo, P09615_A130BarCodPar, P09615_A10755Stp_Est, P09615_A396EmprCod, P09615_A13723StpHdr, P09615_A10752Stp_Mot, P09615_A10751Stp_Dia, P09615_A10750Stp_Lin, P09615_A13728StpColor,
            P09615_n13728StpColor, P09615_A13725StpBarserD, P09615_n13725StpBarserD, P09615_A13724StpBarser, P09615_n13724StpBarser, P09615_A13727StpCliNom, P09615_n13727StpCliNom, P09615_A13726StpClicod, P09615_n13726StpClicod, P09615_A10746Stp_hdr,
            P09615_A10747Stp_r, P09615_A10748Stp_p
            }
            , new Object[] {
            P09617_A129BarCod, P09617_A132BarCodReo, P09617_A130BarCodPar, P09617_A10755Stp_Est, P09617_A396EmprCod, P09617_A13723StpHdr, P09617_A10752Stp_Mot, P09617_A10751Stp_Dia, P09617_A10750Stp_Lin, P09617_A13728StpColor,
            P09617_n13728StpColor, P09617_A13725StpBarserD, P09617_n13725StpBarserD, P09617_A13724StpBarser, P09617_n13724StpBarser, P09617_A13727StpCliNom, P09617_n13727StpCliNom, P09617_A13726StpClicod, P09617_n13726StpClicod, P09617_A10746Stp_hdr,
            P09617_A10747Stp_r, P09617_A10748Stp_p
            }
            , new Object[] {
            P09619_A129BarCod, P09619_A132BarCodReo, P09619_A130BarCodPar, P09619_A10755Stp_Est, P09619_A396EmprCod, P09619_A13723StpHdr, P09619_A10752Stp_Mot, P09619_A10751Stp_Dia, P09619_A10750Stp_Lin, P09619_A13728StpColor,
            P09619_n13728StpColor, P09619_A13725StpBarserD, P09619_n13725StpBarserD, P09619_A13724StpBarser, P09619_n13724StpBarser, P09619_A13727StpCliNom, P09619_n13727StpCliNom, P09619_A13726StpClicod, P09619_n13726StpClicod, P09619_A10746Stp_hdr,
            P09619_A10747Stp_r, P09619_A10748Stp_p
            }
            , new Object[] {
            P096111_A129BarCod, P096111_A132BarCodReo, P096111_A130BarCodPar, P096111_A10755Stp_Est, P096111_A396EmprCod, P096111_A13723StpHdr, P096111_A10752Stp_Mot, P096111_A10751Stp_Dia, P096111_A10750Stp_Lin, P096111_A13728StpColor,
            P096111_n13728StpColor, P096111_A13725StpBarserD, P096111_n13725StpBarserD, P096111_A13724StpBarser, P096111_n13724StpBarser, P096111_A13727StpCliNom, P096111_n13727StpCliNom, P096111_A13726StpClicod, P096111_n13726StpClicod, P096111_A10746Stp_hdr,
            P096111_A10747Stp_r, P096111_A10748Stp_p
            }
            , new Object[] {
            P096113_A129BarCod, P096113_A132BarCodReo, P096113_A130BarCodPar, P096113_A10755Stp_Est, P096113_A396EmprCod, P096113_A13723StpHdr, P096113_A10752Stp_Mot, P096113_A10751Stp_Dia, P096113_A10750Stp_Lin, P096113_A13728StpColor,
            P096113_n13728StpColor, P096113_A13725StpBarserD, P096113_n13725StpBarserD, P096113_A13724StpBarser, P096113_n13724StpBarser, P096113_A13727StpCliNom, P096113_n13727StpCliNom, P096113_A13726StpClicod, P096113_n13726StpClicod, P096113_A10746Stp_hdr,
            P096113_A10747Stp_r, P096113_A10748Stp_p
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10747Stp_r ;
   private byte A10755Stp_Est ;
   private short AV10TFStp_Lin ;
   private short AV11TFStp_Lin_To ;
   private short AV55Activarhdr_wcds_2_tfstp_lin ;
   private short AV56Activarhdr_wcds_3_tfstp_lin_to ;
   private short A10750Stp_Lin ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV18TFStpClicod ;
   private int AV19TFStpClicod_To ;
   private int AV62Activarhdr_wcds_9_tfstpclicod ;
   private int AV63Activarhdr_wcds_10_tfstpclicod_to ;
   private int A10746Stp_hdr ;
   private int A13726StpClicod ;
   private int AV31InsertIndex ;
   private long AV40count ;
   private String AV16TFStpHdr ;
   private String AV17TFStpHdr_Sel ;
   private String AV20TFStpCliNom ;
   private String AV21TFStpCliNom_Sel ;
   private String AV22TFStpBarser ;
   private String AV23TFStpBarser_Sel ;
   private String AV24TFStpBarserDsc ;
   private String AV25TFStpBarserDsc_Sel ;
   private String AV26TFStpColor ;
   private String AV27TFStpColor_Sel ;
   private String AV47Emprcod ;
   private String AV60Activarhdr_wcds_7_tfstphdr ;
   private String AV61Activarhdr_wcds_8_tfstphdr_sel ;
   private String AV64Activarhdr_wcds_11_tfstpclinom ;
   private String AV65Activarhdr_wcds_12_tfstpclinom_sel ;
   private String AV66Activarhdr_wcds_13_tfstpbarser ;
   private String AV67Activarhdr_wcds_14_tfstpbarser_sel ;
   private String AV68Activarhdr_wcds_15_tfstpbarserdsc ;
   private String AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ;
   private String AV70Activarhdr_wcds_17_tfstpcolor ;
   private String AV71Activarhdr_wcds_18_tfstpcolor_sel ;
   private String lV64Activarhdr_wcds_11_tfstpclinom ;
   private String lV66Activarhdr_wcds_13_tfstpbarser ;
   private String lV68Activarhdr_wcds_15_tfstpbarserdsc ;
   private String lV70Activarhdr_wcds_17_tfstpcolor ;
   private String scmdbuf ;
   private String lV60Activarhdr_wcds_7_tfstphdr ;
   private String A10748Stp_p ;
   private String A13723StpHdr ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String A396EmprCod ;
   private java.util.Date AV12TFStp_Dia ;
   private java.util.Date AV57Activarhdr_wcds_4_tfstp_dia ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date AV48DiaInicial ;
   private java.util.Date AV49DiaInicial_to ;
   private boolean returnInSub ;
   private boolean brk9612 ;
   private boolean n13728StpColor ;
   private boolean n13725StpBarserD ;
   private boolean n13724StpBarser ;
   private boolean n13727StpCliNom ;
   private boolean n13726StpClicod ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV14TFStp_Mot ;
   private String AV15TFStp_Mot_Sel ;
   private String A10752Stp_Mot ;
   private String AV54Activarhdr_wcds_1_filterfulltext ;
   private String AV58Activarhdr_wcds_5_tfstp_mot ;
   private String AV59Activarhdr_wcds_6_tfstp_mot_sel ;
   private String lV54Activarhdr_wcds_1_filterfulltext ;
   private String lV58Activarhdr_wcds_5_tfstp_mot ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09613_A129BarCod ;
   private byte[] P09613_A132BarCodReo ;
   private String[] P09613_A130BarCodPar ;
   private String[] P09613_A396EmprCod ;
   private byte[] P09613_A10755Stp_Est ;
   private String[] P09613_A10752Stp_Mot ;
   private String[] P09613_A13723StpHdr ;
   private java.util.Date[] P09613_A10751Stp_Dia ;
   private short[] P09613_A10750Stp_Lin ;
   private String[] P09613_A13728StpColor ;
   private boolean[] P09613_n13728StpColor ;
   private String[] P09613_A13725StpBarserD ;
   private boolean[] P09613_n13725StpBarserD ;
   private String[] P09613_A13724StpBarser ;
   private boolean[] P09613_n13724StpBarser ;
   private String[] P09613_A13727StpCliNom ;
   private boolean[] P09613_n13727StpCliNom ;
   private int[] P09613_A13726StpClicod ;
   private boolean[] P09613_n13726StpClicod ;
   private int[] P09613_A10746Stp_hdr ;
   private byte[] P09613_A10747Stp_r ;
   private String[] P09613_A10748Stp_p ;
   private int[] P09615_A129BarCod ;
   private byte[] P09615_A132BarCodReo ;
   private String[] P09615_A130BarCodPar ;
   private byte[] P09615_A10755Stp_Est ;
   private String[] P09615_A396EmprCod ;
   private String[] P09615_A13723StpHdr ;
   private String[] P09615_A10752Stp_Mot ;
   private java.util.Date[] P09615_A10751Stp_Dia ;
   private short[] P09615_A10750Stp_Lin ;
   private String[] P09615_A13728StpColor ;
   private boolean[] P09615_n13728StpColor ;
   private String[] P09615_A13725StpBarserD ;
   private boolean[] P09615_n13725StpBarserD ;
   private String[] P09615_A13724StpBarser ;
   private boolean[] P09615_n13724StpBarser ;
   private String[] P09615_A13727StpCliNom ;
   private boolean[] P09615_n13727StpCliNom ;
   private int[] P09615_A13726StpClicod ;
   private boolean[] P09615_n13726StpClicod ;
   private int[] P09615_A10746Stp_hdr ;
   private byte[] P09615_A10747Stp_r ;
   private String[] P09615_A10748Stp_p ;
   private int[] P09617_A129BarCod ;
   private byte[] P09617_A132BarCodReo ;
   private String[] P09617_A130BarCodPar ;
   private byte[] P09617_A10755Stp_Est ;
   private String[] P09617_A396EmprCod ;
   private String[] P09617_A13723StpHdr ;
   private String[] P09617_A10752Stp_Mot ;
   private java.util.Date[] P09617_A10751Stp_Dia ;
   private short[] P09617_A10750Stp_Lin ;
   private String[] P09617_A13728StpColor ;
   private boolean[] P09617_n13728StpColor ;
   private String[] P09617_A13725StpBarserD ;
   private boolean[] P09617_n13725StpBarserD ;
   private String[] P09617_A13724StpBarser ;
   private boolean[] P09617_n13724StpBarser ;
   private String[] P09617_A13727StpCliNom ;
   private boolean[] P09617_n13727StpCliNom ;
   private int[] P09617_A13726StpClicod ;
   private boolean[] P09617_n13726StpClicod ;
   private int[] P09617_A10746Stp_hdr ;
   private byte[] P09617_A10747Stp_r ;
   private String[] P09617_A10748Stp_p ;
   private int[] P09619_A129BarCod ;
   private byte[] P09619_A132BarCodReo ;
   private String[] P09619_A130BarCodPar ;
   private byte[] P09619_A10755Stp_Est ;
   private String[] P09619_A396EmprCod ;
   private String[] P09619_A13723StpHdr ;
   private String[] P09619_A10752Stp_Mot ;
   private java.util.Date[] P09619_A10751Stp_Dia ;
   private short[] P09619_A10750Stp_Lin ;
   private String[] P09619_A13728StpColor ;
   private boolean[] P09619_n13728StpColor ;
   private String[] P09619_A13725StpBarserD ;
   private boolean[] P09619_n13725StpBarserD ;
   private String[] P09619_A13724StpBarser ;
   private boolean[] P09619_n13724StpBarser ;
   private String[] P09619_A13727StpCliNom ;
   private boolean[] P09619_n13727StpCliNom ;
   private int[] P09619_A13726StpClicod ;
   private boolean[] P09619_n13726StpClicod ;
   private int[] P09619_A10746Stp_hdr ;
   private byte[] P09619_A10747Stp_r ;
   private String[] P09619_A10748Stp_p ;
   private int[] P096111_A129BarCod ;
   private byte[] P096111_A132BarCodReo ;
   private String[] P096111_A130BarCodPar ;
   private byte[] P096111_A10755Stp_Est ;
   private String[] P096111_A396EmprCod ;
   private String[] P096111_A13723StpHdr ;
   private String[] P096111_A10752Stp_Mot ;
   private java.util.Date[] P096111_A10751Stp_Dia ;
   private short[] P096111_A10750Stp_Lin ;
   private String[] P096111_A13728StpColor ;
   private boolean[] P096111_n13728StpColor ;
   private String[] P096111_A13725StpBarserD ;
   private boolean[] P096111_n13725StpBarserD ;
   private String[] P096111_A13724StpBarser ;
   private boolean[] P096111_n13724StpBarser ;
   private String[] P096111_A13727StpCliNom ;
   private boolean[] P096111_n13727StpCliNom ;
   private int[] P096111_A13726StpClicod ;
   private boolean[] P096111_n13726StpClicod ;
   private int[] P096111_A10746Stp_hdr ;
   private byte[] P096111_A10747Stp_r ;
   private String[] P096111_A10748Stp_p ;
   private int[] P096113_A129BarCod ;
   private byte[] P096113_A132BarCodReo ;
   private String[] P096113_A130BarCodPar ;
   private byte[] P096113_A10755Stp_Est ;
   private String[] P096113_A396EmprCod ;
   private String[] P096113_A13723StpHdr ;
   private String[] P096113_A10752Stp_Mot ;
   private java.util.Date[] P096113_A10751Stp_Dia ;
   private short[] P096113_A10750Stp_Lin ;
   private String[] P096113_A13728StpColor ;
   private boolean[] P096113_n13728StpColor ;
   private String[] P096113_A13725StpBarserD ;
   private boolean[] P096113_n13725StpBarserD ;
   private String[] P096113_A13724StpBarser ;
   private boolean[] P096113_n13724StpBarser ;
   private String[] P096113_A13727StpCliNom ;
   private boolean[] P096113_n13727StpCliNom ;
   private int[] P096113_A13726StpClicod ;
   private boolean[] P096113_n13726StpClicod ;
   private int[] P096113_A10746Stp_hdr ;
   private byte[] P096113_A10747Stp_r ;
   private String[] P096113_A10748Stp_p ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class activarhdr_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09613( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Activarhdr_wcds_2_tfstp_lin ,
                                          short AV56Activarhdr_wcds_3_tfstp_lin_to ,
                                          java.util.Date AV57Activarhdr_wcds_4_tfstp_dia ,
                                          String AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                          String AV58Activarhdr_wcds_5_tfstp_mot ,
                                          String AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                          String AV60Activarhdr_wcds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          String AV54Activarhdr_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV62Activarhdr_wcds_9_tfstpclicod ,
                                          int AV63Activarhdr_wcds_10_tfstpclicod_to ,
                                          String AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                          String AV64Activarhdr_wcds_11_tfstpclinom ,
                                          String AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                          String AV66Activarhdr_wcds_13_tfstpbarser ,
                                          String AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                          String AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                          String AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                          String AV70Activarhdr_wcds_17_tfstpcolor ,
                                          java.util.Date AV48DiaInicial ,
                                          java.util.Date AV49DiaInicial_to ,
                                          String A396EmprCod ,
                                          String AV47Emprcod ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[41];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, T1.Stp_Mot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer, ' ')" ;
      scmdbuf += " AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr, T5.BarCodReo," ;
      scmdbuf += " T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP T7 ON T7.EmprCod" ;
      scmdbuf += " = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr = T1.Stp_hdr AND" ;
      scmdbuf += " T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV55Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV56Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV57Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV58Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Stp_Mot" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09615( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Activarhdr_wcds_2_tfstp_lin ,
                                          short AV56Activarhdr_wcds_3_tfstp_lin_to ,
                                          java.util.Date AV57Activarhdr_wcds_4_tfstp_dia ,
                                          String AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                          String AV58Activarhdr_wcds_5_tfstp_mot ,
                                          String AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                          String AV60Activarhdr_wcds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          String AV54Activarhdr_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV62Activarhdr_wcds_9_tfstpclicod ,
                                          int AV63Activarhdr_wcds_10_tfstpclicod_to ,
                                          String AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                          String AV64Activarhdr_wcds_11_tfstpclinom ,
                                          String AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                          String AV66Activarhdr_wcds_13_tfstpbarser ,
                                          String AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                          String AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                          String AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                          String AV70Activarhdr_wcds_17_tfstpcolor ,
                                          java.util.Date AV48DiaInicial ,
                                          java.util.Date AV49DiaInicial_to ,
                                          byte A10755Stp_Est ,
                                          String AV47Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[41];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.Stp_Est, T1.EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV55Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV56Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV57Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV58Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09617( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Activarhdr_wcds_2_tfstp_lin ,
                                          short AV56Activarhdr_wcds_3_tfstp_lin_to ,
                                          java.util.Date AV57Activarhdr_wcds_4_tfstp_dia ,
                                          String AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                          String AV58Activarhdr_wcds_5_tfstp_mot ,
                                          String AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                          String AV60Activarhdr_wcds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          String AV54Activarhdr_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV62Activarhdr_wcds_9_tfstpclicod ,
                                          int AV63Activarhdr_wcds_10_tfstpclicod_to ,
                                          String AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                          String AV64Activarhdr_wcds_11_tfstpclinom ,
                                          String AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                          String AV66Activarhdr_wcds_13_tfstpbarser ,
                                          String AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                          String AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                          String AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                          String AV70Activarhdr_wcds_17_tfstpcolor ,
                                          java.util.Date AV48DiaInicial ,
                                          java.util.Date AV49DiaInicial_to ,
                                          byte A10755Stp_Est ,
                                          String AV47Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[41];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.Stp_Est, T1.EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV55Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV56Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV57Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV58Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09619( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Activarhdr_wcds_2_tfstp_lin ,
                                          short AV56Activarhdr_wcds_3_tfstp_lin_to ,
                                          java.util.Date AV57Activarhdr_wcds_4_tfstp_dia ,
                                          String AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                          String AV58Activarhdr_wcds_5_tfstp_mot ,
                                          String AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                          String AV60Activarhdr_wcds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          String AV54Activarhdr_wcds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV62Activarhdr_wcds_9_tfstpclicod ,
                                          int AV63Activarhdr_wcds_10_tfstpclicod_to ,
                                          String AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                          String AV64Activarhdr_wcds_11_tfstpclinom ,
                                          String AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                          String AV66Activarhdr_wcds_13_tfstpbarser ,
                                          String AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                          String AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                          String AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                          String AV70Activarhdr_wcds_17_tfstpcolor ,
                                          java.util.Date AV48DiaInicial ,
                                          java.util.Date AV49DiaInicial_to ,
                                          byte A10755Stp_Est ,
                                          String AV47Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.Stp_Est, T1.EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV55Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV56Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV57Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV58Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P096111( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           short AV55Activarhdr_wcds_2_tfstp_lin ,
                                           short AV56Activarhdr_wcds_3_tfstp_lin_to ,
                                           java.util.Date AV57Activarhdr_wcds_4_tfstp_dia ,
                                           String AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                           String AV58Activarhdr_wcds_5_tfstp_mot ,
                                           String AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                           String AV60Activarhdr_wcds_7_tfstphdr ,
                                           short A10750Stp_Lin ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           String AV54Activarhdr_wcds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV62Activarhdr_wcds_9_tfstpclicod ,
                                           int AV63Activarhdr_wcds_10_tfstpclicod_to ,
                                           String AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                           String AV64Activarhdr_wcds_11_tfstpclinom ,
                                           String AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                           String AV66Activarhdr_wcds_13_tfstpbarser ,
                                           String AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           String AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                           String AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                           String AV70Activarhdr_wcds_17_tfstpcolor ,
                                           java.util.Date AV48DiaInicial ,
                                           java.util.Date AV49DiaInicial_to ,
                                           byte A10755Stp_Est ,
                                           String AV47Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[41];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.Stp_Est, T1.EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV55Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (0==AV56Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV57Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV58Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P096113( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           short AV55Activarhdr_wcds_2_tfstp_lin ,
                                           short AV56Activarhdr_wcds_3_tfstp_lin_to ,
                                           java.util.Date AV57Activarhdr_wcds_4_tfstp_dia ,
                                           String AV59Activarhdr_wcds_6_tfstp_mot_sel ,
                                           String AV58Activarhdr_wcds_5_tfstp_mot ,
                                           String AV61Activarhdr_wcds_8_tfstphdr_sel ,
                                           String AV60Activarhdr_wcds_7_tfstphdr ,
                                           short A10750Stp_Lin ,
                                           java.util.Date A10751Stp_Dia ,
                                           String A10752Stp_Mot ,
                                           int A10746Stp_hdr ,
                                           byte A10747Stp_r ,
                                           String A10748Stp_p ,
                                           String AV54Activarhdr_wcds_1_filterfulltext ,
                                           String A13723StpHdr ,
                                           int A13726StpClicod ,
                                           String A13727StpCliNom ,
                                           String A13724StpBarser ,
                                           String A13725StpBarserD ,
                                           String A13728StpColor ,
                                           int AV62Activarhdr_wcds_9_tfstpclicod ,
                                           int AV63Activarhdr_wcds_10_tfstpclicod_to ,
                                           String AV65Activarhdr_wcds_12_tfstpclinom_sel ,
                                           String AV64Activarhdr_wcds_11_tfstpclinom ,
                                           String AV67Activarhdr_wcds_14_tfstpbarser_sel ,
                                           String AV66Activarhdr_wcds_13_tfstpbarser ,
                                           String AV69Activarhdr_wcds_16_tfstpbarserdsc_sel ,
                                           String AV68Activarhdr_wcds_15_tfstpbarserdsc ,
                                           String AV71Activarhdr_wcds_18_tfstpcolor_sel ,
                                           String AV70Activarhdr_wcds_17_tfstpcolor ,
                                           java.util.Date AV48DiaInicial ,
                                           java.util.Date AV49DiaInicial_to ,
                                           byte A10755Stp_Est ,
                                           String AV47Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[41];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.Stp_Est, T1.EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
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
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV55Activarhdr_wcds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (0==AV56Activarhdr_wcds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV57Activarhdr_wcds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV58Activarhdr_wcds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Activarhdr_wcds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Activarhdr_wcds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Activarhdr_wcds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P09613(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() );
            case 1 :
                  return conditional_P09615(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 2 :
                  return conditional_P09617(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 3 :
                  return conditional_P09619(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 4 :
                  return conditional_P096111(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 5 :
                  return conditional_P096113(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09613", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09615", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09617", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09619", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096111", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096113", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               return;
      }
   }

}

