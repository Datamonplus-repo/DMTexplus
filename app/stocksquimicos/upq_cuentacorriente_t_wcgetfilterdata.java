package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_t_wcgetfilterdata extends GXProcedure
{
   public upq_cuentacorriente_t_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_t_wcgetfilterdata.class ), "" );
   }

   public upq_cuentacorriente_t_wcgetfilterdata( int remoteHandle ,
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
      upq_cuentacorriente_t_wcgetfilterdata.this.aP5 = new String[] {""};
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
      upq_cuentacorriente_t_wcgetfilterdata.this.AV24DDOName = aP0;
      upq_cuentacorriente_t_wcgetfilterdata.this.AV22SearchTxt = aP1;
      upq_cuentacorriente_t_wcgetfilterdata.this.AV23SearchTxtTo = aP2;
      upq_cuentacorriente_t_wcgetfilterdata.this.aP3 = aP3;
      upq_cuentacorriente_t_wcgetfilterdata.this.aP4 = aP4;
      upq_cuentacorriente_t_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_TIPMOVCC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMOVCCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_CCSTKDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_CCSTKLOT") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKLOTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_CCSTKUSU") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKUSUOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_CCSTKHOR") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKHOROPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.UPQ_CuentaCorriente_t_WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_t_WCGridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV10TFCCStkLin = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFCCStkLin_To = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV12TFTipMovCc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV13TFTipMovCc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV14TFCCStkDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV15TFCCStkDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRE") == 0 )
         {
            AV16TFCCStkPre = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFCCStkPre_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLOT") == 0 )
         {
            AV18TFCCStkLot = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLOT_SEL") == 0 )
         {
            AV19TFCCStkLot_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU") == 0 )
         {
            AV20TFCCStkUsu = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU_SEL") == 0 )
         {
            AV21TFCCStkUsu_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV45TFCCStkFec = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR") == 0 )
         {
            AV47TFCCStkHor = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR_SEL") == 0 )
         {
            AV48TFCCStkHor_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV44Prdnum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFECFROM") == 0 )
         {
            AV42CCstkfecfrom = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFECTO") == 0 )
         {
            AV43CCstkfecto = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COMPRAS") == 0 )
         {
            AV49compras = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CONSUMOS") == 0 )
         {
            AV50consumos = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVOLUCIONES") == 0 )
         {
            AV51devoluciones = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALDOINICIAL") == 0 )
         {
            AV52SaldoInicial = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EXISTENCIASCUENTACORRIENTE") == 0 )
         {
            AV53Existenciascuentacorriente = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDEXIALM") == 0 )
         {
            AV54PrdExialm = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDCANRES") == 0 )
         {
            AV55PrdCanres = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNOM") == 0 )
         {
            AV56PrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPMOVCCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipMovCc = AV22SearchTxt ;
      AV13TFTipMovCc_Sel = "" ;
      AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV40FilterFullText ;
      AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV10TFCCStkLin ;
      AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV11TFCCStkLin_To ;
      AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV12TFTipMovCc ;
      AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV13TFTipMovCc_Sel ;
      AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV14TFCCStkDsc ;
      AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV15TFCCStkDsc_Sel ;
      AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV16TFCCStkPre ;
      AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV17TFCCStkPre_To ;
      AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV18TFCCStkLot ;
      AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV19TFCCStkLot_Sel ;
      AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV20TFCCStkUsu ;
      AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV21TFCCStkUsu_Sel ;
      AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV45TFCCStkFec ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV47TFCCStkHor ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV48TFCCStkHor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                           Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) ,
                                           Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) ,
                                           AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                           AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                           AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                           AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                           AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                           AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                           AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                           AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                           AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                           AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                           AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                           AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                           AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                           AV42CCstkfecfrom ,
                                           AV43CCstkfecto ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3345TipMovCc ,
                                           A3357CCStkDsc ,
                                           A3349CCStkPre ,
                                           A5722CCStkLot ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3348CCStkFec ,
                                           A719PrdNum ,
                                           AV44Prdnum ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc), 2, "%") ;
      lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc), 30, "%") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot), 26, "%") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = GXutil.padr( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu), 8, "%") ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor), 8, "%") ;
      /* Using cursor P09MR2 */
      pr_default.execute(0, new Object[] {AV41Emprcod, AV44Prdnum, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin), Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to), lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc, AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel, lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc, AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot, AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu, AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel, AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec, lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor, AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel, AV42CCstkfecfrom, AV43CCstkfecto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9MR2 = false ;
         A396EmprCod = P09MR2_A396EmprCod[0] ;
         A3345TipMovCc = P09MR2_A3345TipMovCc[0] ;
         A719PrdNum = P09MR2_A719PrdNum[0] ;
         A3356CCStkHor = P09MR2_A3356CCStkHor[0] ;
         A3348CCStkFec = P09MR2_A3348CCStkFec[0] ;
         A3355CCStkUsu = P09MR2_A3355CCStkUsu[0] ;
         A5722CCStkLot = P09MR2_A5722CCStkLot[0] ;
         A3349CCStkPre = P09MR2_A3349CCStkPre[0] ;
         A3357CCStkDsc = P09MR2_A3357CCStkDsc[0] ;
         A3342CCStkLin = P09MR2_A3342CCStkLin[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09MR2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09MR2_A3345TipMovCc[0], A3345TipMovCc) == 0 ) )
         {
            brk9MR2 = false ;
            A719PrdNum = P09MR2_A719PrdNum[0] ;
            A3342CCStkLin = P09MR2_A3342CCStkLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9MR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A3345TipMovCc)==0) )
         {
            AV26Option = A3345TipMovCc ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9MR2 )
         {
            brk9MR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCCSTKDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCCStkDsc = AV22SearchTxt ;
      AV15TFCCStkDsc_Sel = "" ;
      AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV40FilterFullText ;
      AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV10TFCCStkLin ;
      AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV11TFCCStkLin_To ;
      AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV12TFTipMovCc ;
      AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV13TFTipMovCc_Sel ;
      AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV14TFCCStkDsc ;
      AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV15TFCCStkDsc_Sel ;
      AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV16TFCCStkPre ;
      AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV17TFCCStkPre_To ;
      AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV18TFCCStkLot ;
      AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV19TFCCStkLot_Sel ;
      AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV20TFCCStkUsu ;
      AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV21TFCCStkUsu_Sel ;
      AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV45TFCCStkFec ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV47TFCCStkHor ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV48TFCCStkHor_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                           Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) ,
                                           Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) ,
                                           AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                           AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                           AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                           AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                           AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                           AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                           AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                           AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                           AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                           AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                           AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                           AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                           AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                           AV42CCstkfecfrom ,
                                           AV43CCstkfecto ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3345TipMovCc ,
                                           A3357CCStkDsc ,
                                           A3349CCStkPre ,
                                           A5722CCStkLot ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3348CCStkFec ,
                                           A396EmprCod ,
                                           AV41Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc), 2, "%") ;
      lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc), 30, "%") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot), 26, "%") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = GXutil.padr( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu), 8, "%") ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor), 8, "%") ;
      /* Using cursor P09MR3 */
      pr_default.execute(1, new Object[] {AV41Emprcod, AV44Prdnum, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin), Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to), lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc, AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel, lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc, AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot, AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu, AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel, AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec, lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor, AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel, AV42CCstkfecfrom, AV43CCstkfecto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9MR4 = false ;
         A396EmprCod = P09MR3_A396EmprCod[0] ;
         A719PrdNum = P09MR3_A719PrdNum[0] ;
         A3357CCStkDsc = P09MR3_A3357CCStkDsc[0] ;
         A3356CCStkHor = P09MR3_A3356CCStkHor[0] ;
         A3348CCStkFec = P09MR3_A3348CCStkFec[0] ;
         A3355CCStkUsu = P09MR3_A3355CCStkUsu[0] ;
         A5722CCStkLot = P09MR3_A5722CCStkLot[0] ;
         A3349CCStkPre = P09MR3_A3349CCStkPre[0] ;
         A3345TipMovCc = P09MR3_A3345TipMovCc[0] ;
         A3342CCStkLin = P09MR3_A3342CCStkLin[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09MR3_A3357CCStkDsc[0], A3357CCStkDsc) == 0 ) )
         {
            brk9MR4 = false ;
            A396EmprCod = P09MR3_A396EmprCod[0] ;
            A719PrdNum = P09MR3_A719PrdNum[0] ;
            A3342CCStkLin = P09MR3_A3342CCStkLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9MR4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A3357CCStkDsc)==0) )
         {
            AV26Option = A3357CCStkDsc ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9MR4 )
         {
            brk9MR4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCCSTKLOTOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCCStkLot = AV22SearchTxt ;
      AV19TFCCStkLot_Sel = "" ;
      AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV40FilterFullText ;
      AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV10TFCCStkLin ;
      AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV11TFCCStkLin_To ;
      AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV12TFTipMovCc ;
      AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV13TFTipMovCc_Sel ;
      AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV14TFCCStkDsc ;
      AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV15TFCCStkDsc_Sel ;
      AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV16TFCCStkPre ;
      AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV17TFCCStkPre_To ;
      AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV18TFCCStkLot ;
      AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV19TFCCStkLot_Sel ;
      AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV20TFCCStkUsu ;
      AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV21TFCCStkUsu_Sel ;
      AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV45TFCCStkFec ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV47TFCCStkHor ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV48TFCCStkHor_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                           Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) ,
                                           Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) ,
                                           AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                           AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                           AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                           AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                           AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                           AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                           AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                           AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                           AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                           AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                           AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                           AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                           AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                           AV42CCstkfecfrom ,
                                           AV43CCstkfecto ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3345TipMovCc ,
                                           A3357CCStkDsc ,
                                           A3349CCStkPre ,
                                           A5722CCStkLot ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3348CCStkFec ,
                                           A396EmprCod ,
                                           AV41Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc), 2, "%") ;
      lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc), 30, "%") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot), 26, "%") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = GXutil.padr( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu), 8, "%") ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor), 8, "%") ;
      /* Using cursor P09MR4 */
      pr_default.execute(2, new Object[] {AV41Emprcod, AV44Prdnum, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin), Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to), lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc, AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel, lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc, AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot, AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu, AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel, AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec, lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor, AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel, AV42CCstkfecfrom, AV43CCstkfecto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9MR6 = false ;
         A396EmprCod = P09MR4_A396EmprCod[0] ;
         A719PrdNum = P09MR4_A719PrdNum[0] ;
         A5722CCStkLot = P09MR4_A5722CCStkLot[0] ;
         A3356CCStkHor = P09MR4_A3356CCStkHor[0] ;
         A3348CCStkFec = P09MR4_A3348CCStkFec[0] ;
         A3355CCStkUsu = P09MR4_A3355CCStkUsu[0] ;
         A3349CCStkPre = P09MR4_A3349CCStkPre[0] ;
         A3357CCStkDsc = P09MR4_A3357CCStkDsc[0] ;
         A3345TipMovCc = P09MR4_A3345TipMovCc[0] ;
         A3342CCStkLin = P09MR4_A3342CCStkLin[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09MR4_A5722CCStkLot[0], A5722CCStkLot) == 0 ) )
         {
            brk9MR6 = false ;
            A396EmprCod = P09MR4_A396EmprCod[0] ;
            A719PrdNum = P09MR4_A719PrdNum[0] ;
            A3342CCStkLin = P09MR4_A3342CCStkLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9MR6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5722CCStkLot)==0) )
         {
            AV26Option = A5722CCStkLot ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9MR6 )
         {
            brk9MR6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCCSTKUSUOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCCStkUsu = AV22SearchTxt ;
      AV21TFCCStkUsu_Sel = "" ;
      AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV40FilterFullText ;
      AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV10TFCCStkLin ;
      AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV11TFCCStkLin_To ;
      AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV12TFTipMovCc ;
      AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV13TFTipMovCc_Sel ;
      AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV14TFCCStkDsc ;
      AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV15TFCCStkDsc_Sel ;
      AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV16TFCCStkPre ;
      AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV17TFCCStkPre_To ;
      AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV18TFCCStkLot ;
      AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV19TFCCStkLot_Sel ;
      AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV20TFCCStkUsu ;
      AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV21TFCCStkUsu_Sel ;
      AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV45TFCCStkFec ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV47TFCCStkHor ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV48TFCCStkHor_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                           Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) ,
                                           Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) ,
                                           AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                           AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                           AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                           AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                           AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                           AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                           AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                           AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                           AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                           AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                           AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                           AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                           AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                           AV42CCstkfecfrom ,
                                           AV43CCstkfecto ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3345TipMovCc ,
                                           A3357CCStkDsc ,
                                           A3349CCStkPre ,
                                           A5722CCStkLot ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3348CCStkFec ,
                                           A396EmprCod ,
                                           AV41Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc), 2, "%") ;
      lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc), 30, "%") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot), 26, "%") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = GXutil.padr( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu), 8, "%") ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor), 8, "%") ;
      /* Using cursor P09MR5 */
      pr_default.execute(3, new Object[] {AV41Emprcod, AV44Prdnum, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin), Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to), lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc, AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel, lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc, AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot, AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu, AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel, AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec, lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor, AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel, AV42CCstkfecfrom, AV43CCstkfecto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9MR8 = false ;
         A396EmprCod = P09MR5_A396EmprCod[0] ;
         A719PrdNum = P09MR5_A719PrdNum[0] ;
         A3355CCStkUsu = P09MR5_A3355CCStkUsu[0] ;
         A3356CCStkHor = P09MR5_A3356CCStkHor[0] ;
         A3348CCStkFec = P09MR5_A3348CCStkFec[0] ;
         A5722CCStkLot = P09MR5_A5722CCStkLot[0] ;
         A3349CCStkPre = P09MR5_A3349CCStkPre[0] ;
         A3357CCStkDsc = P09MR5_A3357CCStkDsc[0] ;
         A3345TipMovCc = P09MR5_A3345TipMovCc[0] ;
         A3342CCStkLin = P09MR5_A3342CCStkLin[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09MR5_A3355CCStkUsu[0], A3355CCStkUsu) == 0 ) )
         {
            brk9MR8 = false ;
            A396EmprCod = P09MR5_A396EmprCod[0] ;
            A719PrdNum = P09MR5_A719PrdNum[0] ;
            A3342CCStkLin = P09MR5_A3342CCStkLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9MR8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A3355CCStkUsu)==0) )
         {
            AV26Option = A3355CCStkUsu ;
            AV29OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A3355CCStkUsu, "@!"))) ;
            AV27Options.add(AV26Option, 0);
            AV30OptionsDesc.add(AV29OptionDesc, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9MR8 )
         {
            brk9MR8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCCSTKHOROPTIONS' Routine */
      returnInSub = false ;
      AV47TFCCStkHor = AV22SearchTxt ;
      AV48TFCCStkHor_Sel = "" ;
      AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = AV40FilterFullText ;
      AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin = AV10TFCCStkLin ;
      AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to = AV11TFCCStkLin_To ;
      AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = AV12TFTipMovCc ;
      AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = AV13TFTipMovCc_Sel ;
      AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = AV14TFCCStkDsc ;
      AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = AV15TFCCStkDsc_Sel ;
      AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = AV16TFCCStkPre ;
      AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = AV17TFCCStkPre_To ;
      AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = AV18TFCCStkLot ;
      AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = AV19TFCCStkLot_Sel ;
      AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = AV20TFCCStkUsu ;
      AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = AV21TFCCStkUsu_Sel ;
      AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = AV45TFCCStkFec ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = AV47TFCCStkHor ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = AV48TFCCStkHor_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                           Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) ,
                                           Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) ,
                                           AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                           AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                           AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                           AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                           AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                           AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                           AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                           AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                           AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                           AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                           AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                           AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                           AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                           AV42CCstkfecfrom ,
                                           AV43CCstkfecto ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3345TipMovCc ,
                                           A3357CCStkDsc ,
                                           A3349CCStkPre ,
                                           A5722CCStkLot ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3348CCStkFec ,
                                           A396EmprCod ,
                                           AV41Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext), "%", "") ;
      lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc), 2, "%") ;
      lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc), 30, "%") ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot), 26, "%") ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = GXutil.padr( GXutil.rtrim( AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu), 8, "%") ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor), 8, "%") ;
      /* Using cursor P09MR6 */
      pr_default.execute(4, new Object[] {AV41Emprcod, AV44Prdnum, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext, Long.valueOf(AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin), Long.valueOf(AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to), lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc, AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel, lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc, AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to, lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot, AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel, lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu, AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel, AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec, lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor, AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel, AV42CCstkfecfrom, AV43CCstkfecto});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9MR10 = false ;
         A396EmprCod = P09MR6_A396EmprCod[0] ;
         A719PrdNum = P09MR6_A719PrdNum[0] ;
         A3356CCStkHor = P09MR6_A3356CCStkHor[0] ;
         A3348CCStkFec = P09MR6_A3348CCStkFec[0] ;
         A3355CCStkUsu = P09MR6_A3355CCStkUsu[0] ;
         A5722CCStkLot = P09MR6_A5722CCStkLot[0] ;
         A3349CCStkPre = P09MR6_A3349CCStkPre[0] ;
         A3357CCStkDsc = P09MR6_A3357CCStkDsc[0] ;
         A3345TipMovCc = P09MR6_A3345TipMovCc[0] ;
         A3342CCStkLin = P09MR6_A3342CCStkLin[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09MR6_A3356CCStkHor[0], A3356CCStkHor) == 0 ) )
         {
            brk9MR10 = false ;
            A396EmprCod = P09MR6_A396EmprCod[0] ;
            A719PrdNum = P09MR6_A719PrdNum[0] ;
            A3342CCStkLin = P09MR6_A3342CCStkLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9MR10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A3356CCStkHor)==0) )
         {
            AV26Option = A3356CCStkHor ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9MR10 )
         {
            brk9MR10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = upq_cuentacorriente_t_wcgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = upq_cuentacorriente_t_wcgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = upq_cuentacorriente_t_wcgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV12TFTipMovCc = "" ;
      AV13TFTipMovCc_Sel = "" ;
      AV14TFCCStkDsc = "" ;
      AV15TFCCStkDsc_Sel = "" ;
      AV16TFCCStkPre = DecimalUtil.ZERO ;
      AV17TFCCStkPre_To = DecimalUtil.ZERO ;
      AV18TFCCStkLot = "" ;
      AV19TFCCStkLot_Sel = "" ;
      AV20TFCCStkUsu = "" ;
      AV21TFCCStkUsu_Sel = "" ;
      AV45TFCCStkFec = GXutil.nullDate() ;
      AV47TFCCStkHor = "" ;
      AV48TFCCStkHor_Sel = "" ;
      AV41Emprcod = "" ;
      AV44Prdnum = "" ;
      AV42CCstkfecfrom = GXutil.nullDate() ;
      AV43CCstkfecto = GXutil.nullDate() ;
      AV49compras = DecimalUtil.ZERO ;
      AV50consumos = DecimalUtil.ZERO ;
      AV51devoluciones = DecimalUtil.ZERO ;
      AV52SaldoInicial = DecimalUtil.ZERO ;
      AV53Existenciascuentacorriente = DecimalUtil.ZERO ;
      AV54PrdExialm = DecimalUtil.ZERO ;
      AV55PrdCanres = DecimalUtil.ZERO ;
      AV56PrdNom = "" ;
      A3345TipMovCc = "" ;
      AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = "" ;
      AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = "" ;
      AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel = "" ;
      AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = "" ;
      AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel = "" ;
      AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre = DecimalUtil.ZERO ;
      AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to = DecimalUtil.ZERO ;
      AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = "" ;
      AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel = "" ;
      AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = "" ;
      AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel = "" ;
      AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec = GXutil.nullDate() ;
      AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = "" ;
      AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel = "" ;
      scmdbuf = "" ;
      lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext = "" ;
      lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc = "" ;
      lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc = "" ;
      lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot = "" ;
      lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu = "" ;
      lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor = "" ;
      A3357CCStkDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      P09MR2_A396EmprCod = new String[] {""} ;
      P09MR2_A3345TipMovCc = new String[] {""} ;
      P09MR2_A719PrdNum = new String[] {""} ;
      P09MR2_A3356CCStkHor = new String[] {""} ;
      P09MR2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09MR2_A3355CCStkUsu = new String[] {""} ;
      P09MR2_A5722CCStkLot = new String[] {""} ;
      P09MR2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MR2_A3357CCStkDsc = new String[] {""} ;
      P09MR2_A3342CCStkLin = new long[1] ;
      AV26Option = "" ;
      P09MR3_A396EmprCod = new String[] {""} ;
      P09MR3_A719PrdNum = new String[] {""} ;
      P09MR3_A3357CCStkDsc = new String[] {""} ;
      P09MR3_A3356CCStkHor = new String[] {""} ;
      P09MR3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09MR3_A3355CCStkUsu = new String[] {""} ;
      P09MR3_A5722CCStkLot = new String[] {""} ;
      P09MR3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MR3_A3345TipMovCc = new String[] {""} ;
      P09MR3_A3342CCStkLin = new long[1] ;
      P09MR4_A396EmprCod = new String[] {""} ;
      P09MR4_A719PrdNum = new String[] {""} ;
      P09MR4_A5722CCStkLot = new String[] {""} ;
      P09MR4_A3356CCStkHor = new String[] {""} ;
      P09MR4_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09MR4_A3355CCStkUsu = new String[] {""} ;
      P09MR4_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MR4_A3357CCStkDsc = new String[] {""} ;
      P09MR4_A3345TipMovCc = new String[] {""} ;
      P09MR4_A3342CCStkLin = new long[1] ;
      P09MR5_A396EmprCod = new String[] {""} ;
      P09MR5_A719PrdNum = new String[] {""} ;
      P09MR5_A3355CCStkUsu = new String[] {""} ;
      P09MR5_A3356CCStkHor = new String[] {""} ;
      P09MR5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09MR5_A5722CCStkLot = new String[] {""} ;
      P09MR5_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MR5_A3357CCStkDsc = new String[] {""} ;
      P09MR5_A3345TipMovCc = new String[] {""} ;
      P09MR5_A3342CCStkLin = new long[1] ;
      AV29OptionDesc = "" ;
      P09MR6_A396EmprCod = new String[] {""} ;
      P09MR6_A719PrdNum = new String[] {""} ;
      P09MR6_A3356CCStkHor = new String[] {""} ;
      P09MR6_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09MR6_A3355CCStkUsu = new String[] {""} ;
      P09MR6_A5722CCStkLot = new String[] {""} ;
      P09MR6_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MR6_A3357CCStkDsc = new String[] {""} ;
      P09MR6_A3345TipMovCc = new String[] {""} ;
      P09MR6_A3342CCStkLin = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_t_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09MR2_A396EmprCod, P09MR2_A3345TipMovCc, P09MR2_A719PrdNum, P09MR2_A3356CCStkHor, P09MR2_A3348CCStkFec, P09MR2_A3355CCStkUsu, P09MR2_A5722CCStkLot, P09MR2_A3349CCStkPre, P09MR2_A3357CCStkDsc, P09MR2_A3342CCStkLin
            }
            , new Object[] {
            P09MR3_A396EmprCod, P09MR3_A719PrdNum, P09MR3_A3357CCStkDsc, P09MR3_A3356CCStkHor, P09MR3_A3348CCStkFec, P09MR3_A3355CCStkUsu, P09MR3_A5722CCStkLot, P09MR3_A3349CCStkPre, P09MR3_A3345TipMovCc, P09MR3_A3342CCStkLin
            }
            , new Object[] {
            P09MR4_A396EmprCod, P09MR4_A719PrdNum, P09MR4_A5722CCStkLot, P09MR4_A3356CCStkHor, P09MR4_A3348CCStkFec, P09MR4_A3355CCStkUsu, P09MR4_A3349CCStkPre, P09MR4_A3357CCStkDsc, P09MR4_A3345TipMovCc, P09MR4_A3342CCStkLin
            }
            , new Object[] {
            P09MR5_A396EmprCod, P09MR5_A719PrdNum, P09MR5_A3355CCStkUsu, P09MR5_A3356CCStkHor, P09MR5_A3348CCStkFec, P09MR5_A5722CCStkLot, P09MR5_A3349CCStkPre, P09MR5_A3357CCStkDsc, P09MR5_A3345TipMovCc, P09MR5_A3342CCStkLin
            }
            , new Object[] {
            P09MR6_A396EmprCod, P09MR6_A719PrdNum, P09MR6_A3356CCStkHor, P09MR6_A3348CCStkFec, P09MR6_A3355CCStkUsu, P09MR6_A5722CCStkLot, P09MR6_A3349CCStkPre, P09MR6_A3357CCStkDsc, P09MR6_A3345TipMovCc, P09MR6_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV59GXV1 ;
   private long AV10TFCCStkLin ;
   private long AV11TFCCStkLin_To ;
   private long AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ;
   private long AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ;
   private long A3342CCStkLin ;
   private long AV34count ;
   private java.math.BigDecimal AV16TFCCStkPre ;
   private java.math.BigDecimal AV17TFCCStkPre_To ;
   private java.math.BigDecimal AV49compras ;
   private java.math.BigDecimal AV50consumos ;
   private java.math.BigDecimal AV51devoluciones ;
   private java.math.BigDecimal AV52SaldoInicial ;
   private java.math.BigDecimal AV53Existenciascuentacorriente ;
   private java.math.BigDecimal AV54PrdExialm ;
   private java.math.BigDecimal AV55PrdCanres ;
   private java.math.BigDecimal AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ;
   private java.math.BigDecimal AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ;
   private java.math.BigDecimal A3349CCStkPre ;
   private String AV12TFTipMovCc ;
   private String AV13TFTipMovCc_Sel ;
   private String AV14TFCCStkDsc ;
   private String AV15TFCCStkDsc_Sel ;
   private String AV18TFCCStkLot ;
   private String AV19TFCCStkLot_Sel ;
   private String AV20TFCCStkUsu ;
   private String AV21TFCCStkUsu_Sel ;
   private String AV47TFCCStkHor ;
   private String AV48TFCCStkHor_Sel ;
   private String AV41Emprcod ;
   private String AV44Prdnum ;
   private String AV56PrdNom ;
   private String A3345TipMovCc ;
   private String AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ;
   private String AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ;
   private String AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ;
   private String AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ;
   private String AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ;
   private String AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ;
   private String AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ;
   private String AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ;
   private String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ;
   private String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ;
   private String scmdbuf ;
   private String lV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ;
   private String lV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ;
   private String lV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ;
   private String lV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ;
   private String lV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private java.util.Date AV45TFCCStkFec ;
   private java.util.Date AV42CCstkfecfrom ;
   private java.util.Date AV43CCstkfecto ;
   private java.util.Date AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ;
   private java.util.Date A3348CCStkFec ;
   private boolean returnInSub ;
   private boolean brk9MR2 ;
   private boolean brk9MR4 ;
   private boolean brk9MR6 ;
   private boolean brk9MR8 ;
   private boolean brk9MR10 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ;
   private String lV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ;
   private String AV26Option ;
   private String AV29OptionDesc ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09MR2_A396EmprCod ;
   private String[] P09MR2_A3345TipMovCc ;
   private String[] P09MR2_A719PrdNum ;
   private String[] P09MR2_A3356CCStkHor ;
   private java.util.Date[] P09MR2_A3348CCStkFec ;
   private String[] P09MR2_A3355CCStkUsu ;
   private String[] P09MR2_A5722CCStkLot ;
   private java.math.BigDecimal[] P09MR2_A3349CCStkPre ;
   private String[] P09MR2_A3357CCStkDsc ;
   private long[] P09MR2_A3342CCStkLin ;
   private String[] P09MR3_A396EmprCod ;
   private String[] P09MR3_A719PrdNum ;
   private String[] P09MR3_A3357CCStkDsc ;
   private String[] P09MR3_A3356CCStkHor ;
   private java.util.Date[] P09MR3_A3348CCStkFec ;
   private String[] P09MR3_A3355CCStkUsu ;
   private String[] P09MR3_A5722CCStkLot ;
   private java.math.BigDecimal[] P09MR3_A3349CCStkPre ;
   private String[] P09MR3_A3345TipMovCc ;
   private long[] P09MR3_A3342CCStkLin ;
   private String[] P09MR4_A396EmprCod ;
   private String[] P09MR4_A719PrdNum ;
   private String[] P09MR4_A5722CCStkLot ;
   private String[] P09MR4_A3356CCStkHor ;
   private java.util.Date[] P09MR4_A3348CCStkFec ;
   private String[] P09MR4_A3355CCStkUsu ;
   private java.math.BigDecimal[] P09MR4_A3349CCStkPre ;
   private String[] P09MR4_A3357CCStkDsc ;
   private String[] P09MR4_A3345TipMovCc ;
   private long[] P09MR4_A3342CCStkLin ;
   private String[] P09MR5_A396EmprCod ;
   private String[] P09MR5_A719PrdNum ;
   private String[] P09MR5_A3355CCStkUsu ;
   private String[] P09MR5_A3356CCStkHor ;
   private java.util.Date[] P09MR5_A3348CCStkFec ;
   private String[] P09MR5_A5722CCStkLot ;
   private java.math.BigDecimal[] P09MR5_A3349CCStkPre ;
   private String[] P09MR5_A3357CCStkDsc ;
   private String[] P09MR5_A3345TipMovCc ;
   private long[] P09MR5_A3342CCStkLin ;
   private String[] P09MR6_A396EmprCod ;
   private String[] P09MR6_A719PrdNum ;
   private String[] P09MR6_A3356CCStkHor ;
   private java.util.Date[] P09MR6_A3348CCStkFec ;
   private String[] P09MR6_A3355CCStkUsu ;
   private String[] P09MR6_A5722CCStkLot ;
   private java.math.BigDecimal[] P09MR6_A3349CCStkPre ;
   private String[] P09MR6_A3357CCStkDsc ;
   private String[] P09MR6_A3345TipMovCc ;
   private long[] P09MR6_A3342CCStkLin ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class upq_cuentacorriente_t_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09MR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                          long AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ,
                                          long AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ,
                                          String AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                          String AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                          String AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                          String AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                          java.math.BigDecimal AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                          java.math.BigDecimal AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                          String AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                          String AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                          String AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                          String AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                          java.util.Date AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                          String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                          String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                          java.util.Date AV42CCstkfecfrom ,
                                          java.util.Date AV43CCstkfecto ,
                                          long A3342CCStkLin ,
                                          String A3345TipMovCc ,
                                          String A3357CCStkDsc ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          String A5722CCStkLot ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          java.util.Date A3348CCStkFec ,
                                          String A719PrdNum ,
                                          String AV44Prdnum ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[26];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, TipMovCc, PrdNum, CCStkHor, CCStkFec, CCStkUsu, CCStkLot, CCStkPre, CCStkDsc, CCStkLin FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkLin,'999999999990'), 2) like '%' || ?) or ( UPPER(TipMovCc) like '%' || UPPER(?)) or ( UPPER(CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( UPPER(CCStkLot) like '%' || UPPER(?)) or ( UPPER(CCStkUsu) like '%' || UPPER(?)) or ( UPPER(CCStkHor) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) )
      {
         addWhere(sWhereString, "(CCStkLin >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) )
      {
         addWhere(sWhereString, "(CCStkLin <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(CCStkPre >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(CCStkPre <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkLot = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkUsu = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkHor = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, TipMovCc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09MR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                          long AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ,
                                          long AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ,
                                          String AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                          String AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                          String AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                          String AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                          java.math.BigDecimal AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                          java.math.BigDecimal AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                          String AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                          String AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                          String AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                          String AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                          java.util.Date AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                          String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                          String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                          java.util.Date AV42CCstkfecfrom ,
                                          java.util.Date AV43CCstkfecto ,
                                          long A3342CCStkLin ,
                                          String A3345TipMovCc ,
                                          String A3357CCStkDsc ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          String A5722CCStkLot ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          java.util.Date A3348CCStkFec ,
                                          String A396EmprCod ,
                                          String AV41Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[26];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, CCStkDsc, CCStkHor, CCStkFec, CCStkUsu, CCStkLot, CCStkPre, TipMovCc, CCStkLin FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkLin,'999999999990'), 2) like '%' || ?) or ( UPPER(TipMovCc) like '%' || UPPER(?)) or ( UPPER(CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( UPPER(CCStkLot) like '%' || UPPER(?)) or ( UPPER(CCStkUsu) like '%' || UPPER(?)) or ( UPPER(CCStkHor) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) )
      {
         addWhere(sWhereString, "(CCStkLin >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) )
      {
         addWhere(sWhereString, "(CCStkLin <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(CCStkPre >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(CCStkPre <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkLot = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkUsu = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkHor = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCStkDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09MR4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                          long AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ,
                                          long AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ,
                                          String AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                          String AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                          String AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                          String AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                          java.math.BigDecimal AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                          java.math.BigDecimal AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                          String AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                          String AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                          String AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                          String AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                          java.util.Date AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                          String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                          String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                          java.util.Date AV42CCstkfecfrom ,
                                          java.util.Date AV43CCstkfecto ,
                                          long A3342CCStkLin ,
                                          String A3345TipMovCc ,
                                          String A3357CCStkDsc ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          String A5722CCStkLot ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          java.util.Date A3348CCStkFec ,
                                          String A396EmprCod ,
                                          String AV41Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[26];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, CCStkLot, CCStkHor, CCStkFec, CCStkUsu, CCStkPre, CCStkDsc, TipMovCc, CCStkLin FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkLin,'999999999990'), 2) like '%' || ?) or ( UPPER(TipMovCc) like '%' || UPPER(?)) or ( UPPER(CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( UPPER(CCStkLot) like '%' || UPPER(?)) or ( UPPER(CCStkUsu) like '%' || UPPER(?)) or ( UPPER(CCStkHor) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) )
      {
         addWhere(sWhereString, "(CCStkLin >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) )
      {
         addWhere(sWhereString, "(CCStkLin <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(CCStkPre >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(CCStkPre <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkLot = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkUsu = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkHor = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCStkLot" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09MR5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                          long AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ,
                                          long AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ,
                                          String AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                          String AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                          String AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                          String AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                          java.math.BigDecimal AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                          java.math.BigDecimal AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                          String AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                          String AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                          String AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                          String AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                          java.util.Date AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                          String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                          String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                          java.util.Date AV42CCstkfecfrom ,
                                          java.util.Date AV43CCstkfecto ,
                                          long A3342CCStkLin ,
                                          String A3345TipMovCc ,
                                          String A3357CCStkDsc ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          String A5722CCStkLot ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          java.util.Date A3348CCStkFec ,
                                          String A396EmprCod ,
                                          String AV41Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[26];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, CCStkUsu, CCStkHor, CCStkFec, CCStkLot, CCStkPre, CCStkDsc, TipMovCc, CCStkLin FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkLin,'999999999990'), 2) like '%' || ?) or ( UPPER(TipMovCc) like '%' || UPPER(?)) or ( UPPER(CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( UPPER(CCStkLot) like '%' || UPPER(?)) or ( UPPER(CCStkUsu) like '%' || UPPER(?)) or ( UPPER(CCStkHor) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) )
      {
         addWhere(sWhereString, "(CCStkLin >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) )
      {
         addWhere(sWhereString, "(CCStkLin <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(CCStkPre >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(CCStkPre <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkLot = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkUsu = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkHor = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCStkUsu" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09MR6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext ,
                                          long AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin ,
                                          long AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to ,
                                          String AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel ,
                                          String AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc ,
                                          String AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel ,
                                          String AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc ,
                                          java.math.BigDecimal AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre ,
                                          java.math.BigDecimal AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to ,
                                          String AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel ,
                                          String AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot ,
                                          String AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel ,
                                          String AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu ,
                                          java.util.Date AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec ,
                                          String AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel ,
                                          String AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor ,
                                          java.util.Date AV42CCstkfecfrom ,
                                          java.util.Date AV43CCstkfecto ,
                                          long A3342CCStkLin ,
                                          String A3345TipMovCc ,
                                          String A3357CCStkDsc ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          String A5722CCStkLot ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          java.util.Date A3348CCStkFec ,
                                          String A396EmprCod ,
                                          String AV41Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[26];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, CCStkHor, CCStkFec, CCStkUsu, CCStkLot, CCStkPre, CCStkDsc, TipMovCc, CCStkLin FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(TipMovCc <> 'EC')");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV61Stocksquimicos_upq_cuentacorriente_t_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkLin,'999999999990'), 2) like '%' || ?) or ( UPPER(TipMovCc) like '%' || UPPER(?)) or ( UPPER(CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( UPPER(CCStkLot) like '%' || UPPER(?)) or ( UPPER(CCStkUsu) like '%' || UPPER(?)) or ( UPPER(CCStkHor) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Stocksquimicos_upq_cuentacorriente_t_wcds_2_tfccstklin) )
      {
         addWhere(sWhereString, "(CCStkLin >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV63Stocksquimicos_upq_cuentacorriente_t_wcds_3_tfccstklin_to) )
      {
         addWhere(sWhereString, "(CCStkLin <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV64Stocksquimicos_upq_cuentacorriente_t_wcds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Stocksquimicos_upq_cuentacorriente_t_wcds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Stocksquimicos_upq_cuentacorriente_t_wcds_6_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Stocksquimicos_upq_cuentacorriente_t_wcds_7_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Stocksquimicos_upq_cuentacorriente_t_wcds_8_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(CCStkPre >= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Stocksquimicos_upq_cuentacorriente_t_wcds_9_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(CCStkPre <= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_upq_cuentacorriente_t_wcds_10_tfccstklot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_upq_cuentacorriente_t_wcds_11_tfccstklot_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkLot = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV72Stocksquimicos_upq_cuentacorriente_t_wcds_12_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Stocksquimicos_upq_cuentacorriente_t_wcds_13_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkUsu = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Stocksquimicos_upq_cuentacorriente_t_wcds_14_tfccstkfec)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_upq_cuentacorriente_t_wcds_15_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_upq_cuentacorriente_t_wcds_16_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkHor = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42CCstkfecfrom)) )
      {
         addWhere(sWhereString, "(CCStkFec >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43CCstkfecto)) )
      {
         addWhere(sWhereString, "(CCStkFec <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCStkHor" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P09MR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P09MR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P09MR4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 3 :
                  return conditional_P09MR5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 4 :
                  return conditional_P09MR6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09MR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MR4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MR5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MR6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
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
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               return;
      }
   }

}

