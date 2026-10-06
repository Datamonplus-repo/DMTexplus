package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precioporarticulo_wkpgetfilterdata extends GXProcedure
{
   public precioporarticulo_wkpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporarticulo_wkpgetfilterdata.class ), "" );
   }

   public precioporarticulo_wkpgetfilterdata( int remoteHandle ,
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
      precioporarticulo_wkpgetfilterdata.this.aP5 = new String[] {""};
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
      precioporarticulo_wkpgetfilterdata.this.AV33DDOName = aP0;
      precioporarticulo_wkpgetfilterdata.this.AV34SearchTxt = aP1;
      precioporarticulo_wkpgetfilterdata.this.AV35SearchTxtTo = aP2;
      precioporarticulo_wkpgetfilterdata.this.aP3 = aP3;
      precioporarticulo_wkpgetfilterdata.this.aP4 = aP4;
      precioporarticulo_wkpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV25OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV33DDOName), "DDO_INTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADINTDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV33DDOName), "DDO_INTPREDEF") == 0 )
      {
         /* Execute user subroutine: 'LOADINTPREDEFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV23Options.toJSonString(false) ;
      AV37OptionsDescJson = AV25OptionsDesc.toJSonString(false) ;
      AV38OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue("Facturacion.PrecioporArticulo_WKPGridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.PrecioporArticulo_WKPGridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV28Session.getValue("Facturacion.PrecioporArticulo_WKPGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV10TFIntCod = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFIntCod_To = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV12TFIntDsc = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV13TFIntDsc_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTACT_SEL") == 0 )
         {
            AV14TFIntAct_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTPREKGM") == 0 )
         {
            AV15TFIntPreKgm = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV16TFIntPreKgm_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTPREMTR") == 0 )
         {
            AV17TFIntPreMtr = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV18TFIntPreMtr_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTPREDEF") == 0 )
         {
            AV19TFIntPreDef = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTPREDEF_SEL") == 0 )
         {
            AV20TFIntPreDef_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADINTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFIntDsc = AV34SearchTxt ;
      AV13TFIntDsc_Sel = "" ;
      AV47Facturacion_precioporarticulo_wkpds_1_tfintcod = AV10TFIntCod ;
      AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to = AV11TFIntCod_To ;
      AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc = AV12TFIntDsc ;
      AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = AV13TFIntDsc_Sel ;
      AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel = AV14TFIntAct_Sel ;
      AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm = AV15TFIntPreKgm ;
      AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = AV16TFIntPreKgm_To ;
      AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr = AV17TFIntPreMtr ;
      AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = AV18TFIntPreMtr_To ;
      AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef = AV19TFIntPreDef ;
      AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = AV20TFIntPreDef_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV47Facturacion_precioporarticulo_wkpds_1_tfintcod) ,
                                           Byte.valueOf(AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to) ,
                                           AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ,
                                           AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc ,
                                           AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel ,
                                           AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm ,
                                           AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ,
                                           AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr ,
                                           AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ,
                                           AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ,
                                           AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           A14255IntAct ,
                                           A586IntPreKgm ,
                                           A587IntPreMtr ,
                                           A585IntPreDef ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV40clicod) ,
                                           A65ArtCod ,
                                           AV41artcod ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Byte.valueOf(AV42Tipcolcod) ,
                                           AV39emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Facturacion_precioporarticulo_wkpds_3_tfintdsc = GXutil.padr( GXutil.rtrim( AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc), 30, "%") ;
      lV56Facturacion_precioporarticulo_wkpds_10_tfintpredef = GXutil.padr( GXutil.rtrim( AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef), 1, "%") ;
      /* Using cursor P0APE2 */
      pr_default.execute(0, new Object[] {AV39emprcod, Integer.valueOf(AV40clicod), AV41artcod, Byte.valueOf(AV42Tipcolcod), Byte.valueOf(AV47Facturacion_precioporarticulo_wkpds_1_tfintcod), Byte.valueOf(AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to), lV49Facturacion_precioporarticulo_wkpds_3_tfintdsc, AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel, AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel, AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm, AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to, AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr, AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to, lV56Facturacion_precioporarticulo_wkpds_10_tfintpredef, AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAPE2 = false ;
         A583IntCod = P0APE2_A583IntCod[0] ;
         A396EmprCod = P0APE2_A396EmprCod[0] ;
         A831TipColCod = P0APE2_A831TipColCod[0] ;
         A65ArtCod = P0APE2_A65ArtCod[0] ;
         A252CliCod = P0APE2_A252CliCod[0] ;
         A585IntPreDef = P0APE2_A585IntPreDef[0] ;
         n585IntPreDef = P0APE2_n585IntPreDef[0] ;
         A587IntPreMtr = P0APE2_A587IntPreMtr[0] ;
         n587IntPreMtr = P0APE2_n587IntPreMtr[0] ;
         A586IntPreKgm = P0APE2_A586IntPreKgm[0] ;
         n586IntPreKgm = P0APE2_n586IntPreKgm[0] ;
         A14255IntAct = P0APE2_A14255IntAct[0] ;
         A584IntDsc = P0APE2_A584IntDsc[0] ;
         n584IntDsc = P0APE2_n584IntDsc[0] ;
         A14255IntAct = P0APE2_A14255IntAct[0] ;
         A584IntDsc = P0APE2_A584IntDsc[0] ;
         n584IntDsc = P0APE2_n584IntDsc[0] ;
         AV27count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0APE2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0APE2_A583IntCod[0] == A583IntCod ) )
         {
            brkAPE2 = false ;
            A831TipColCod = P0APE2_A831TipColCod[0] ;
            A65ArtCod = P0APE2_A65ArtCod[0] ;
            A252CliCod = P0APE2_A252CliCod[0] ;
            AV27count = (long)(AV27count+1) ;
            brkAPE2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A584IntDsc)==0) )
         {
            AV22Option = A584IntDsc ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            AV23Options.add(AV22Option, AV21InsertIndex);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV27count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAPE2 )
         {
            brkAPE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADINTPREDEFOPTIONS' Routine */
      returnInSub = false ;
      AV19TFIntPreDef = AV34SearchTxt ;
      AV20TFIntPreDef_Sel = "" ;
      AV47Facturacion_precioporarticulo_wkpds_1_tfintcod = AV10TFIntCod ;
      AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to = AV11TFIntCod_To ;
      AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc = AV12TFIntDsc ;
      AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = AV13TFIntDsc_Sel ;
      AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel = AV14TFIntAct_Sel ;
      AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm = AV15TFIntPreKgm ;
      AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = AV16TFIntPreKgm_To ;
      AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr = AV17TFIntPreMtr ;
      AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = AV18TFIntPreMtr_To ;
      AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef = AV19TFIntPreDef ;
      AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = AV20TFIntPreDef_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV47Facturacion_precioporarticulo_wkpds_1_tfintcod) ,
                                           Byte.valueOf(AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to) ,
                                           AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ,
                                           AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc ,
                                           AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel ,
                                           AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm ,
                                           AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ,
                                           AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr ,
                                           AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ,
                                           AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ,
                                           AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           A14255IntAct ,
                                           A586IntPreKgm ,
                                           A587IntPreMtr ,
                                           A585IntPreDef ,
                                           A396EmprCod ,
                                           AV39emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV40clicod) ,
                                           A65ArtCod ,
                                           AV41artcod ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Byte.valueOf(AV42Tipcolcod) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV49Facturacion_precioporarticulo_wkpds_3_tfintdsc = GXutil.padr( GXutil.rtrim( AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc), 30, "%") ;
      lV56Facturacion_precioporarticulo_wkpds_10_tfintpredef = GXutil.padr( GXutil.rtrim( AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef), 1, "%") ;
      /* Using cursor P0APE3 */
      pr_default.execute(1, new Object[] {AV39emprcod, Integer.valueOf(AV40clicod), AV41artcod, Byte.valueOf(AV42Tipcolcod), Byte.valueOf(AV47Facturacion_precioporarticulo_wkpds_1_tfintcod), Byte.valueOf(AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to), lV49Facturacion_precioporarticulo_wkpds_3_tfintdsc, AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel, AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel, AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm, AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to, AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr, AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to, lV56Facturacion_precioporarticulo_wkpds_10_tfintpredef, AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAPE4 = false ;
         A396EmprCod = P0APE3_A396EmprCod[0] ;
         A252CliCod = P0APE3_A252CliCod[0] ;
         A65ArtCod = P0APE3_A65ArtCod[0] ;
         A831TipColCod = P0APE3_A831TipColCod[0] ;
         A585IntPreDef = P0APE3_A585IntPreDef[0] ;
         n585IntPreDef = P0APE3_n585IntPreDef[0] ;
         A587IntPreMtr = P0APE3_A587IntPreMtr[0] ;
         n587IntPreMtr = P0APE3_n587IntPreMtr[0] ;
         A586IntPreKgm = P0APE3_A586IntPreKgm[0] ;
         n586IntPreKgm = P0APE3_n586IntPreKgm[0] ;
         A14255IntAct = P0APE3_A14255IntAct[0] ;
         A584IntDsc = P0APE3_A584IntDsc[0] ;
         n584IntDsc = P0APE3_n584IntDsc[0] ;
         A583IntCod = P0APE3_A583IntCod[0] ;
         A14255IntAct = P0APE3_A14255IntAct[0] ;
         A584IntDsc = P0APE3_A584IntDsc[0] ;
         n584IntDsc = P0APE3_n584IntDsc[0] ;
         AV27count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0APE3_A585IntPreDef[0], A585IntPreDef) == 0 ) )
         {
            brkAPE4 = false ;
            A396EmprCod = P0APE3_A396EmprCod[0] ;
            A252CliCod = P0APE3_A252CliCod[0] ;
            A65ArtCod = P0APE3_A65ArtCod[0] ;
            A831TipColCod = P0APE3_A831TipColCod[0] ;
            A583IntCod = P0APE3_A583IntCod[0] ;
            AV27count = (long)(AV27count+1) ;
            brkAPE4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A585IntPreDef)==0) )
         {
            AV22Option = A585IntPreDef ;
            AV24OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A585IntPreDef, "@!"))) ;
            AV23Options.add(AV22Option, 0);
            AV25OptionsDesc.add(AV24OptionDesc, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV27count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAPE4 )
         {
            brkAPE4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = precioporarticulo_wkpgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = precioporarticulo_wkpgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = precioporarticulo_wkpgetfilterdata.this.AV38OptionIndexesJson;
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
      AV37OptionsDescJson = "" ;
      AV38OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28Session = httpContext.getWebSession();
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFIntDsc = "" ;
      AV13TFIntDsc_Sel = "" ;
      AV14TFIntAct_Sel = "" ;
      AV15TFIntPreKgm = DecimalUtil.ZERO ;
      AV16TFIntPreKgm_To = DecimalUtil.ZERO ;
      AV17TFIntPreMtr = DecimalUtil.ZERO ;
      AV18TFIntPreMtr_To = DecimalUtil.ZERO ;
      AV19TFIntPreDef = "" ;
      AV20TFIntPreDef_Sel = "" ;
      A584IntDsc = "" ;
      AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc = "" ;
      AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel = "" ;
      AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel = "" ;
      AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm = DecimalUtil.ZERO ;
      AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to = DecimalUtil.ZERO ;
      AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr = DecimalUtil.ZERO ;
      AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to = DecimalUtil.ZERO ;
      AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef = "" ;
      AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel = "" ;
      scmdbuf = "" ;
      lV49Facturacion_precioporarticulo_wkpds_3_tfintdsc = "" ;
      lV56Facturacion_precioporarticulo_wkpds_10_tfintpredef = "" ;
      A14255IntAct = "" ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      A65ArtCod = "" ;
      AV41artcod = "" ;
      AV39emprcod = "" ;
      A396EmprCod = "" ;
      P0APE2_A583IntCod = new byte[1] ;
      P0APE2_A396EmprCod = new String[] {""} ;
      P0APE2_A831TipColCod = new byte[1] ;
      P0APE2_A65ArtCod = new String[] {""} ;
      P0APE2_A252CliCod = new int[1] ;
      P0APE2_A585IntPreDef = new String[] {""} ;
      P0APE2_n585IntPreDef = new boolean[] {false} ;
      P0APE2_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APE2_n587IntPreMtr = new boolean[] {false} ;
      P0APE2_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APE2_n586IntPreKgm = new boolean[] {false} ;
      P0APE2_A14255IntAct = new String[] {""} ;
      P0APE2_A584IntDsc = new String[] {""} ;
      P0APE2_n584IntDsc = new boolean[] {false} ;
      AV22Option = "" ;
      P0APE3_A396EmprCod = new String[] {""} ;
      P0APE3_A252CliCod = new int[1] ;
      P0APE3_A65ArtCod = new String[] {""} ;
      P0APE3_A831TipColCod = new byte[1] ;
      P0APE3_A585IntPreDef = new String[] {""} ;
      P0APE3_n585IntPreDef = new boolean[] {false} ;
      P0APE3_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APE3_n587IntPreMtr = new boolean[] {false} ;
      P0APE3_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APE3_n586IntPreKgm = new boolean[] {false} ;
      P0APE3_A14255IntAct = new String[] {""} ;
      P0APE3_A584IntDsc = new String[] {""} ;
      P0APE3_n584IntDsc = new boolean[] {false} ;
      P0APE3_A583IntCod = new byte[1] ;
      AV24OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo_wkpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0APE2_A583IntCod, P0APE2_A396EmprCod, P0APE2_A831TipColCod, P0APE2_A65ArtCod, P0APE2_A252CliCod, P0APE2_A585IntPreDef, P0APE2_n585IntPreDef, P0APE2_A587IntPreMtr, P0APE2_n587IntPreMtr, P0APE2_A586IntPreKgm,
            P0APE2_n586IntPreKgm, P0APE2_A14255IntAct, P0APE2_A584IntDsc, P0APE2_n584IntDsc
            }
            , new Object[] {
            P0APE3_A396EmprCod, P0APE3_A252CliCod, P0APE3_A65ArtCod, P0APE3_A831TipColCod, P0APE3_A585IntPreDef, P0APE3_n585IntPreDef, P0APE3_A587IntPreMtr, P0APE3_n587IntPreMtr, P0APE3_A586IntPreKgm, P0APE3_n586IntPreKgm,
            P0APE3_A14255IntAct, P0APE3_A584IntDsc, P0APE3_n584IntDsc, P0APE3_A583IntCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFIntCod ;
   private byte AV11TFIntCod_To ;
   private byte AV47Facturacion_precioporarticulo_wkpds_1_tfintcod ;
   private byte AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV42Tipcolcod ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int A252CliCod ;
   private int AV40clicod ;
   private int AV21InsertIndex ;
   private long AV27count ;
   private java.math.BigDecimal AV15TFIntPreKgm ;
   private java.math.BigDecimal AV16TFIntPreKgm_To ;
   private java.math.BigDecimal AV17TFIntPreMtr ;
   private java.math.BigDecimal AV18TFIntPreMtr_To ;
   private java.math.BigDecimal AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm ;
   private java.math.BigDecimal AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ;
   private java.math.BigDecimal AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr ;
   private java.math.BigDecimal AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private String AV12TFIntDsc ;
   private String AV13TFIntDsc_Sel ;
   private String AV14TFIntAct_Sel ;
   private String AV19TFIntPreDef ;
   private String AV20TFIntPreDef_Sel ;
   private String A584IntDsc ;
   private String AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc ;
   private String AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ;
   private String AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel ;
   private String AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef ;
   private String AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ;
   private String scmdbuf ;
   private String lV49Facturacion_precioporarticulo_wkpds_3_tfintdsc ;
   private String lV56Facturacion_precioporarticulo_wkpds_10_tfintpredef ;
   private String A14255IntAct ;
   private String A585IntPreDef ;
   private String A65ArtCod ;
   private String AV41artcod ;
   private String AV39emprcod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAPE2 ;
   private boolean n585IntPreDef ;
   private boolean n587IntPreMtr ;
   private boolean n586IntPreKgm ;
   private boolean n584IntDsc ;
   private boolean brkAPE4 ;
   private String AV36OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV38OptionIndexesJson ;
   private String AV33DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV22Option ;
   private String AV24OptionDesc ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0APE2_A583IntCod ;
   private String[] P0APE2_A396EmprCod ;
   private byte[] P0APE2_A831TipColCod ;
   private String[] P0APE2_A65ArtCod ;
   private int[] P0APE2_A252CliCod ;
   private String[] P0APE2_A585IntPreDef ;
   private boolean[] P0APE2_n585IntPreDef ;
   private java.math.BigDecimal[] P0APE2_A587IntPreMtr ;
   private boolean[] P0APE2_n587IntPreMtr ;
   private java.math.BigDecimal[] P0APE2_A586IntPreKgm ;
   private boolean[] P0APE2_n586IntPreKgm ;
   private String[] P0APE2_A14255IntAct ;
   private String[] P0APE2_A584IntDsc ;
   private boolean[] P0APE2_n584IntDsc ;
   private String[] P0APE3_A396EmprCod ;
   private int[] P0APE3_A252CliCod ;
   private String[] P0APE3_A65ArtCod ;
   private byte[] P0APE3_A831TipColCod ;
   private String[] P0APE3_A585IntPreDef ;
   private boolean[] P0APE3_n585IntPreDef ;
   private java.math.BigDecimal[] P0APE3_A587IntPreMtr ;
   private boolean[] P0APE3_n587IntPreMtr ;
   private java.math.BigDecimal[] P0APE3_A586IntPreKgm ;
   private boolean[] P0APE3_n586IntPreKgm ;
   private String[] P0APE3_A14255IntAct ;
   private String[] P0APE3_A584IntDsc ;
   private boolean[] P0APE3_n584IntDsc ;
   private byte[] P0APE3_A583IntCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV25OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
}

final  class precioporarticulo_wkpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0APE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV47Facturacion_precioporarticulo_wkpds_1_tfintcod ,
                                          byte AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to ,
                                          String AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ,
                                          String AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc ,
                                          String AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel ,
                                          java.math.BigDecimal AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm ,
                                          java.math.BigDecimal AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ,
                                          java.math.BigDecimal AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr ,
                                          java.math.BigDecimal AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ,
                                          String AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ,
                                          String AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          String A14255IntAct ,
                                          java.math.BigDecimal A586IntPreKgm ,
                                          java.math.BigDecimal A587IntPreMtr ,
                                          String A585IntPreDef ,
                                          int A252CliCod ,
                                          int AV40clicod ,
                                          String A65ArtCod ,
                                          String AV41artcod ,
                                          byte A831TipColCod ,
                                          byte AV42Tipcolcod ,
                                          String AV39emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.IntCod, T1.EmprCod, T1.TipColCod, T1.ArtCod, T1.CliCod, T1.IntPreDef, T1.IntPreMtr, T1.IntPreKgm, T2.IntAct, T2.IntDsc FROM (TXPPRETIN T1 INNER JOIN TXPINTENS" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      addWhere(sWhereString, "(T1.TipColCod = ?)");
      if ( ! (0==AV47Facturacion_precioporarticulo_wkpds_1_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntAct = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreKgm >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreKgm <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreMtr >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreMtr <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IntPreDef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreDef = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.IntCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0APE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV47Facturacion_precioporarticulo_wkpds_1_tfintcod ,
                                          byte AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to ,
                                          String AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel ,
                                          String AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc ,
                                          String AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel ,
                                          java.math.BigDecimal AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm ,
                                          java.math.BigDecimal AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to ,
                                          java.math.BigDecimal AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr ,
                                          java.math.BigDecimal AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to ,
                                          String AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel ,
                                          String AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          String A14255IntAct ,
                                          java.math.BigDecimal A586IntPreKgm ,
                                          java.math.BigDecimal A587IntPreMtr ,
                                          String A585IntPreDef ,
                                          String A396EmprCod ,
                                          String AV39emprcod ,
                                          int A252CliCod ,
                                          int AV40clicod ,
                                          String A65ArtCod ,
                                          String AV41artcod ,
                                          byte A831TipColCod ,
                                          byte AV42Tipcolcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[15];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T1.IntPreDef, T1.IntPreMtr, T1.IntPreKgm, T2.IntAct, T2.IntDsc, T1.IntCod FROM (TXPPRETIN T1 INNER JOIN TXPINTENS" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      addWhere(sWhereString, "(T1.TipColCod = ?)");
      if ( ! (0==AV47Facturacion_precioporarticulo_wkpds_1_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV48Facturacion_precioporarticulo_wkpds_2_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Facturacion_precioporarticulo_wkpds_3_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Facturacion_precioporarticulo_wkpds_4_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Facturacion_precioporarticulo_wkpds_5_tfintact_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntAct = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Facturacion_precioporarticulo_wkpds_6_tfintprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreKgm >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Facturacion_precioporarticulo_wkpds_7_tfintprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreKgm <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Facturacion_precioporarticulo_wkpds_8_tfintpremtr)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreMtr >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Facturacion_precioporarticulo_wkpds_9_tfintpremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreMtr <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_precioporarticulo_wkpds_10_tfintpredef)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IntPreDef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_precioporarticulo_wkpds_11_tfintpredef_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IntPreDef = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.IntPreDef" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P0APE2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P0APE3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0APE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
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
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               return;
      }
   }

}

