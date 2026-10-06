package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_lineas_wkpgetfilterdata extends GXProcedure
{
   public tpromd_lineas_wkpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_lineas_wkpgetfilterdata.class ), "" );
   }

   public tpromd_lineas_wkpgetfilterdata( int remoteHandle ,
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
      tpromd_lineas_wkpgetfilterdata.this.aP5 = new String[] {""};
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
      tpromd_lineas_wkpgetfilterdata.this.AV41DDOName = aP0;
      tpromd_lineas_wkpgetfilterdata.this.AV42SearchTxt = aP1;
      tpromd_lineas_wkpgetfilterdata.this.AV43SearchTxtTo = aP2;
      tpromd_lineas_wkpgetfilterdata.this.aP3 = aP3;
      tpromd_lineas_wkpgetfilterdata.this.aP4 = aP4;
      tpromd_lineas_wkpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_PMDCOLCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDCOLCLIOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_PMDCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDCOLNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV44OptionsJson = AV31Options.toJSonString(false) ;
      AV45OptionsDescJson = AV33OptionsDesc.toJSonString(false) ;
      AV46OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("Facturacion.TProMD_lineas_WKPGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TProMD_lineas_WKPGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("Facturacion.TProMD_lineas_WKPGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNUM") == 0 )
         {
            AV10TFPMDColNum = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPMDColNum_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLCLI") == 0 )
         {
            AV12TFPMDColCli = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLCLI_SEL") == 0 )
         {
            AV13TFPMDColCli_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCONCOD") == 0 )
         {
            AV14TFPMDConCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPMDConCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM") == 0 )
         {
            AV16TFPMDColNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM_SEL") == 0 )
         {
            AV17TFPMDColNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREKGM") == 0 )
         {
            AV18TFPMDPreKgm = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFPMDPreKgm_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDENTKGM") == 0 )
         {
            AV20TFPMDEntKgm = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFPMDEntKgm_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOTIN") == 0 )
         {
            AV22TFPMDDtoTin = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPMDDtoTin_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOACA") == 0 )
         {
            AV24TFPMDDtoAca = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPMDDtoAca_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREUNI") == 0 )
         {
            AV26TFPMDPreUni = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFPMDPreUni_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDVALFCH") == 0 )
         {
            AV28TFPMDValFch = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPMDCOLCLIOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPMDColCli = AV42SearchTxt ;
      AV13TFPMDColCli_Sel = "" ;
      AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum = AV10TFPMDColNum ;
      AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to = AV11TFPMDColNum_To ;
      AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = AV12TFPMDColCli ;
      AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = AV13TFPMDColCli_Sel ;
      AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod = AV14TFPMDConCod ;
      AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to = AV15TFPMDConCod_To ;
      AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = AV16TFPMDColNom ;
      AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = AV17TFPMDColNom_Sel ;
      AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = AV18TFPMDPreKgm ;
      AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = AV19TFPMDPreKgm_To ;
      AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = AV20TFPMDEntKgm ;
      AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = AV21TFPMDEntKgm_To ;
      AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = AV22TFPMDDtoTin ;
      AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = AV23TFPMDDtoTin_To ;
      AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = AV24TFPMDDtoAca ;
      AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = AV25TFPMDDtoAca_To ;
      AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = AV26TFPMDPreUni ;
      AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = AV27TFPMDPreUni_To ;
      AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = AV28TFPMDValFch ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum) ,
                                           Integer.valueOf(AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to) ,
                                           AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ,
                                           AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ,
                                           Integer.valueOf(AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod) ,
                                           Integer.valueOf(AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to) ,
                                           AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ,
                                           AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ,
                                           AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ,
                                           AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ,
                                           AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ,
                                           AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ,
                                           AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ,
                                           AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ,
                                           AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ,
                                           AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ,
                                           AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ,
                                           Integer.valueOf(A8393PMDColNum) ,
                                           A8530PMDColCli ,
                                           Integer.valueOf(A8531PMDConCod) ,
                                           A8395PMDPreKgm ,
                                           A8396PMDEntKgm ,
                                           A8397PMDDtoTin ,
                                           A8398PMDDtoAca ,
                                           A8532PMDPreUni ,
                                           A8399PMDValFch ,
                                           AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ,
                                           AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ,
                                           A8394PMDColNom ,
                                           A396EmprCod ,
                                           AV47emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV48clicod) ,
                                           Short.valueOf(A8391PMDCod) ,
                                           Short.valueOf(AV49PMDCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = GXutil.padr( GXutil.rtrim( AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli), 13, "%") ;
      /* Using cursor P0AM52 */
      pr_default.execute(0, new Object[] {AV47emprcod, Integer.valueOf(AV48clicod), Short.valueOf(AV49PMDCod), Integer.valueOf(AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum), Integer.valueOf(AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to), lV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli, AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel, Integer.valueOf(AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod), Integer.valueOf(AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to), AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm, AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to, AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm, AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to, AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin, AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to, AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca, AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to, AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni, AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to, AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAM52 = false ;
         A8391PMDCod = P0AM52_A8391PMDCod[0] ;
         A8530PMDColCli = P0AM52_A8530PMDColCli[0] ;
         A8399PMDValFch = P0AM52_A8399PMDValFch[0] ;
         A8532PMDPreUni = P0AM52_A8532PMDPreUni[0] ;
         A8398PMDDtoAca = P0AM52_A8398PMDDtoAca[0] ;
         A8397PMDDtoTin = P0AM52_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = P0AM52_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = P0AM52_A8395PMDPreKgm[0] ;
         A8393PMDColNum = P0AM52_A8393PMDColNum[0] ;
         A8531PMDConCod = P0AM52_A8531PMDConCod[0] ;
         A252CliCod = P0AM52_A252CliCod[0] ;
         A396EmprCod = P0AM52_A396EmprCod[0] ;
         GXt_char2 = A8394PMDColNom ;
         GXv_char3[0] = GXt_char2 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char3) ;
         tpromd_lineas_wkpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A8394PMDColNom = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel) == 0 ) ) )
            {
               AV35count = 0 ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AM52_A8530PMDColCli[0], A8530PMDColCli) == 0 ) )
               {
                  brkAM52 = false ;
                  A8391PMDCod = P0AM52_A8391PMDCod[0] ;
                  A8393PMDColNum = P0AM52_A8393PMDColNum[0] ;
                  A252CliCod = P0AM52_A252CliCod[0] ;
                  A396EmprCod = P0AM52_A396EmprCod[0] ;
                  AV35count = (long)(AV35count+1) ;
                  brkAM52 = true ;
                  pr_default.readNext(0);
               }
               if ( ! (GXutil.strcmp("", A8530PMDColCli)==0) )
               {
                  AV30Option = A8530PMDColCli ;
                  AV31Options.add(AV30Option, 0);
                  AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV31Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAM52 )
         {
            brkAM52 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPMDCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPMDColNom = AV42SearchTxt ;
      AV17TFPMDColNom_Sel = "" ;
      AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum = AV10TFPMDColNum ;
      AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to = AV11TFPMDColNum_To ;
      AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = AV12TFPMDColCli ;
      AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = AV13TFPMDColCli_Sel ;
      AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod = AV14TFPMDConCod ;
      AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to = AV15TFPMDConCod_To ;
      AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = AV16TFPMDColNom ;
      AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = AV17TFPMDColNom_Sel ;
      AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = AV18TFPMDPreKgm ;
      AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = AV19TFPMDPreKgm_To ;
      AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = AV20TFPMDEntKgm ;
      AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = AV21TFPMDEntKgm_To ;
      AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = AV22TFPMDDtoTin ;
      AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = AV23TFPMDDtoTin_To ;
      AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = AV24TFPMDDtoAca ;
      AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = AV25TFPMDDtoAca_To ;
      AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = AV26TFPMDPreUni ;
      AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = AV27TFPMDPreUni_To ;
      AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = AV28TFPMDValFch ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum) ,
                                           Integer.valueOf(AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to) ,
                                           AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ,
                                           AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ,
                                           Integer.valueOf(AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod) ,
                                           Integer.valueOf(AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to) ,
                                           AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ,
                                           AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ,
                                           AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ,
                                           AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ,
                                           AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ,
                                           AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ,
                                           AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ,
                                           AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ,
                                           AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ,
                                           AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ,
                                           AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ,
                                           Integer.valueOf(A8393PMDColNum) ,
                                           A8530PMDColCli ,
                                           Integer.valueOf(A8531PMDConCod) ,
                                           A8395PMDPreKgm ,
                                           A8396PMDEntKgm ,
                                           A8397PMDDtoTin ,
                                           A8398PMDDtoAca ,
                                           A8532PMDPreUni ,
                                           A8399PMDValFch ,
                                           AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ,
                                           AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ,
                                           A8394PMDColNom ,
                                           AV47emprcod ,
                                           Integer.valueOf(AV48clicod) ,
                                           Short.valueOf(AV49PMDCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(A8391PMDCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT
                                           }
      });
      lV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = GXutil.padr( GXutil.rtrim( AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli), 13, "%") ;
      /* Using cursor P0AM53 */
      pr_default.execute(1, new Object[] {AV47emprcod, Integer.valueOf(AV48clicod), Short.valueOf(AV49PMDCod), Integer.valueOf(AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum), Integer.valueOf(AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to), lV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli, AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel, Integer.valueOf(AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod), Integer.valueOf(AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to), AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm, AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to, AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm, AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to, AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin, AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to, AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca, AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to, AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni, AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to, AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A8391PMDCod = P0AM53_A8391PMDCod[0] ;
         A8399PMDValFch = P0AM53_A8399PMDValFch[0] ;
         A8532PMDPreUni = P0AM53_A8532PMDPreUni[0] ;
         A8398PMDDtoAca = P0AM53_A8398PMDDtoAca[0] ;
         A8397PMDDtoTin = P0AM53_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = P0AM53_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = P0AM53_A8395PMDPreKgm[0] ;
         A8530PMDColCli = P0AM53_A8530PMDColCli[0] ;
         A8393PMDColNum = P0AM53_A8393PMDColNum[0] ;
         A8531PMDConCod = P0AM53_A8531PMDConCod[0] ;
         A252CliCod = P0AM53_A252CliCod[0] ;
         A396EmprCod = P0AM53_A396EmprCod[0] ;
         GXt_char2 = A8394PMDColNom ;
         GXv_char3[0] = GXt_char2 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char3) ;
         tpromd_lineas_wkpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A8394PMDColNom = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel) == 0 ) ) )
            {
               if ( ! (GXutil.strcmp("", A8394PMDColNom)==0) )
               {
                  AV30Option = A8394PMDColNom ;
                  AV29InsertIndex = 1 ;
                  while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
                  {
                     AV29InsertIndex = (int)(AV29InsertIndex+1) ;
                  }
                  if ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) == 0 ) )
                  {
                     AV35count = GXutil.lval( (String)AV34OptionIndexes.elementAt(-1+AV29InsertIndex)) ;
                     AV35count = (long)(AV35count+1) ;
                     AV34OptionIndexes.removeItem(AV29InsertIndex);
                     AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
                  }
                  else
                  {
                     AV31Options.add(AV30Option, AV29InsertIndex);
                     AV34OptionIndexes.add("1", AV29InsertIndex);
                  }
               }
               if ( AV31Options.size() == 50 )
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

   protected void cleanup( )
   {
      this.aP3[0] = tpromd_lineas_wkpgetfilterdata.this.AV44OptionsJson;
      this.aP4[0] = tpromd_lineas_wkpgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = tpromd_lineas_wkpgetfilterdata.this.AV46OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV44OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV46OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFPMDColCli = "" ;
      AV13TFPMDColCli_Sel = "" ;
      AV16TFPMDColNom = "" ;
      AV17TFPMDColNom_Sel = "" ;
      AV18TFPMDPreKgm = DecimalUtil.ZERO ;
      AV19TFPMDPreKgm_To = DecimalUtil.ZERO ;
      AV20TFPMDEntKgm = DecimalUtil.ZERO ;
      AV21TFPMDEntKgm_To = DecimalUtil.ZERO ;
      AV22TFPMDDtoTin = DecimalUtil.ZERO ;
      AV23TFPMDDtoTin_To = DecimalUtil.ZERO ;
      AV24TFPMDDtoAca = DecimalUtil.ZERO ;
      AV25TFPMDDtoAca_To = DecimalUtil.ZERO ;
      AV26TFPMDPreUni = DecimalUtil.ZERO ;
      AV27TFPMDPreUni_To = DecimalUtil.ZERO ;
      AV28TFPMDValFch = GXutil.nullDate() ;
      A8530PMDColCli = "" ;
      AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = "" ;
      AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = "" ;
      AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = "" ;
      AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = "" ;
      AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = DecimalUtil.ZERO ;
      AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = DecimalUtil.ZERO ;
      AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = DecimalUtil.ZERO ;
      AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = DecimalUtil.ZERO ;
      AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = DecimalUtil.ZERO ;
      AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = DecimalUtil.ZERO ;
      AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = DecimalUtil.ZERO ;
      AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = DecimalUtil.ZERO ;
      AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = DecimalUtil.ZERO ;
      AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = DecimalUtil.ZERO ;
      AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      A8394PMDColNom = "" ;
      A396EmprCod = "" ;
      AV47emprcod = "" ;
      P0AM52_A8391PMDCod = new short[1] ;
      P0AM52_A8530PMDColCli = new String[] {""} ;
      P0AM52_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AM52_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM52_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM52_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM52_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM52_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM52_A8393PMDColNum = new int[1] ;
      P0AM52_A8531PMDConCod = new int[1] ;
      P0AM52_A252CliCod = new int[1] ;
      P0AM52_A396EmprCod = new String[] {""} ;
      AV30Option = "" ;
      P0AM53_A8391PMDCod = new short[1] ;
      P0AM53_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AM53_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM53_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM53_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM53_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM53_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM53_A8530PMDColCli = new String[] {""} ;
      P0AM53_A8393PMDColNum = new int[1] ;
      P0AM53_A8531PMDConCod = new int[1] ;
      P0AM53_A252CliCod = new int[1] ;
      P0AM53_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_wkpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AM52_A8391PMDCod, P0AM52_A8530PMDColCli, P0AM52_A8399PMDValFch, P0AM52_A8532PMDPreUni, P0AM52_A8398PMDDtoAca, P0AM52_A8397PMDDtoTin, P0AM52_A8396PMDEntKgm, P0AM52_A8395PMDPreKgm, P0AM52_A8393PMDColNum, P0AM52_A8531PMDConCod,
            P0AM52_A252CliCod, P0AM52_A396EmprCod
            }
            , new Object[] {
            P0AM53_A8391PMDCod, P0AM53_A8399PMDValFch, P0AM53_A8532PMDPreUni, P0AM53_A8398PMDDtoAca, P0AM53_A8397PMDDtoTin, P0AM53_A8396PMDEntKgm, P0AM53_A8395PMDPreKgm, P0AM53_A8530PMDColCli, P0AM53_A8393PMDColNum, P0AM53_A8531PMDConCod,
            P0AM53_A252CliCod, P0AM53_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8391PMDCod ;
   private short AV49PMDCod ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV10TFPMDColNum ;
   private int AV11TFPMDColNum_To ;
   private int AV14TFPMDConCod ;
   private int AV15TFPMDConCod_To ;
   private int AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum ;
   private int AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to ;
   private int AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod ;
   private int AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to ;
   private int A8393PMDColNum ;
   private int A8531PMDConCod ;
   private int A252CliCod ;
   private int AV48clicod ;
   private int AV29InsertIndex ;
   private long AV35count ;
   private java.math.BigDecimal AV18TFPMDPreKgm ;
   private java.math.BigDecimal AV19TFPMDPreKgm_To ;
   private java.math.BigDecimal AV20TFPMDEntKgm ;
   private java.math.BigDecimal AV21TFPMDEntKgm_To ;
   private java.math.BigDecimal AV22TFPMDDtoTin ;
   private java.math.BigDecimal AV23TFPMDDtoTin_To ;
   private java.math.BigDecimal AV24TFPMDDtoAca ;
   private java.math.BigDecimal AV25TFPMDDtoAca_To ;
   private java.math.BigDecimal AV26TFPMDPreUni ;
   private java.math.BigDecimal AV27TFPMDPreUni_To ;
   private java.math.BigDecimal AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ;
   private java.math.BigDecimal AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ;
   private java.math.BigDecimal AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ;
   private java.math.BigDecimal AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ;
   private java.math.BigDecimal AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ;
   private java.math.BigDecimal AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ;
   private java.math.BigDecimal AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ;
   private java.math.BigDecimal AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ;
   private java.math.BigDecimal AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ;
   private java.math.BigDecimal AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private String AV12TFPMDColCli ;
   private String AV13TFPMDColCli_Sel ;
   private String AV16TFPMDColNom ;
   private String AV17TFPMDColNom_Sel ;
   private String A8530PMDColCli ;
   private String AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ;
   private String AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ;
   private String AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ;
   private String AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ;
   private String scmdbuf ;
   private String lV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ;
   private String A8394PMDColNom ;
   private String A396EmprCod ;
   private String AV47emprcod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV28TFPMDValFch ;
   private java.util.Date AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ;
   private java.util.Date A8399PMDValFch ;
   private boolean returnInSub ;
   private boolean brkAM52 ;
   private String AV44OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV46OptionIndexesJson ;
   private String AV41DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AM52_A8391PMDCod ;
   private String[] P0AM52_A8530PMDColCli ;
   private java.util.Date[] P0AM52_A8399PMDValFch ;
   private java.math.BigDecimal[] P0AM52_A8532PMDPreUni ;
   private java.math.BigDecimal[] P0AM52_A8398PMDDtoAca ;
   private java.math.BigDecimal[] P0AM52_A8397PMDDtoTin ;
   private java.math.BigDecimal[] P0AM52_A8396PMDEntKgm ;
   private java.math.BigDecimal[] P0AM52_A8395PMDPreKgm ;
   private int[] P0AM52_A8393PMDColNum ;
   private int[] P0AM52_A8531PMDConCod ;
   private int[] P0AM52_A252CliCod ;
   private String[] P0AM52_A396EmprCod ;
   private short[] P0AM53_A8391PMDCod ;
   private java.util.Date[] P0AM53_A8399PMDValFch ;
   private java.math.BigDecimal[] P0AM53_A8532PMDPreUni ;
   private java.math.BigDecimal[] P0AM53_A8398PMDDtoAca ;
   private java.math.BigDecimal[] P0AM53_A8397PMDDtoTin ;
   private java.math.BigDecimal[] P0AM53_A8396PMDEntKgm ;
   private java.math.BigDecimal[] P0AM53_A8395PMDPreKgm ;
   private String[] P0AM53_A8530PMDColCli ;
   private int[] P0AM53_A8393PMDColNum ;
   private int[] P0AM53_A8531PMDConCod ;
   private int[] P0AM53_A252CliCod ;
   private String[] P0AM53_A396EmprCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV33OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class tpromd_lineas_wkpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AM52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum ,
                                          int AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to ,
                                          String AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ,
                                          String AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ,
                                          int AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod ,
                                          int AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to ,
                                          java.math.BigDecimal AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ,
                                          java.math.BigDecimal AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ,
                                          java.math.BigDecimal AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ,
                                          java.math.BigDecimal AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ,
                                          java.math.BigDecimal AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ,
                                          java.math.BigDecimal AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ,
                                          java.math.BigDecimal AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ,
                                          java.math.BigDecimal AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ,
                                          java.math.BigDecimal AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ,
                                          java.math.BigDecimal AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ,
                                          java.util.Date AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ,
                                          int A8393PMDColNum ,
                                          String A8530PMDColCli ,
                                          int A8531PMDConCod ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          String AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ,
                                          String AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ,
                                          String A8394PMDColNom ,
                                          String A396EmprCod ,
                                          String AV47emprcod ,
                                          int A252CliCod ,
                                          int AV48clicod ,
                                          short A8391PMDCod ,
                                          short AV49PMDCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[20];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT PMDCod, PMDColCli, PMDValFch, PMDPreUni, PMDDtoAca, PMDDtoTin, PMDEntKgm, PMDPreKgm, PMDColNum, PMDConCod, CliCod, EmprCod FROM TXPProMD1" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      addWhere(sWhereString, "(PMDCod = ?)");
      if ( ! (0==AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum) )
      {
         addWhere(sWhereString, "(PMDColNum >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to) )
      {
         addWhere(sWhereString, "(PMDColNum <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PMDColCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel)==0) )
      {
         addWhere(sWhereString, "(PMDColCli = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod) )
      {
         addWhere(sWhereString, "(PMDConCod >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to) )
      {
         addWhere(sWhereString, "(PMDConCod <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm)==0) )
      {
         addWhere(sWhereString, "(PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to)==0) )
      {
         addWhere(sWhereString, "(PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm)==0) )
      {
         addWhere(sWhereString, "(PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to)==0) )
      {
         addWhere(sWhereString, "(PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin)==0) )
      {
         addWhere(sWhereString, "(PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to)==0) )
      {
         addWhere(sWhereString, "(PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca)==0) )
      {
         addWhere(sWhereString, "(PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to)==0) )
      {
         addWhere(sWhereString, "(PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni)==0) )
      {
         addWhere(sWhereString, "(PMDPreUni >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to)==0) )
      {
         addWhere(sWhereString, "(PMDPreUni <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch)) )
      {
         addWhere(sWhereString, "(PMDValFch >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PMDColCli" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AM53( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum ,
                                          int AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to ,
                                          String AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ,
                                          String AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ,
                                          int AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod ,
                                          int AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to ,
                                          java.math.BigDecimal AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ,
                                          java.math.BigDecimal AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ,
                                          java.math.BigDecimal AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ,
                                          java.math.BigDecimal AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ,
                                          java.math.BigDecimal AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ,
                                          java.math.BigDecimal AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ,
                                          java.math.BigDecimal AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ,
                                          java.math.BigDecimal AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ,
                                          java.math.BigDecimal AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ,
                                          java.math.BigDecimal AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ,
                                          java.util.Date AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ,
                                          int A8393PMDColNum ,
                                          String A8530PMDColCli ,
                                          int A8531PMDConCod ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          String AV61Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ,
                                          String AV60Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ,
                                          String A8394PMDColNom ,
                                          String AV47emprcod ,
                                          int AV48clicod ,
                                          short AV49PMDCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          short A8391PMDCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT PMDCod, PMDValFch, PMDPreUni, PMDDtoAca, PMDDtoTin, PMDEntKgm, PMDPreKgm, PMDColCli, PMDColNum, PMDConCod, CliCod, EmprCod FROM TXPProMD1" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and PMDCod = ?)");
      if ( ! (0==AV54Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum) )
      {
         addWhere(sWhereString, "(PMDColNum >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV55Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to) )
      {
         addWhere(sWhereString, "(PMDColNum <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel)==0) && ( ! (GXutil.strcmp("", AV56Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PMDColCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel)==0) )
      {
         addWhere(sWhereString, "(PMDColCli = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod) )
      {
         addWhere(sWhereString, "(PMDConCod >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV59Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to) )
      {
         addWhere(sWhereString, "(PMDConCod <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm)==0) )
      {
         addWhere(sWhereString, "(PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to)==0) )
      {
         addWhere(sWhereString, "(PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm)==0) )
      {
         addWhere(sWhereString, "(PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to)==0) )
      {
         addWhere(sWhereString, "(PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin)==0) )
      {
         addWhere(sWhereString, "(PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to)==0) )
      {
         addWhere(sWhereString, "(PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca)==0) )
      {
         addWhere(sWhereString, "(PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to)==0) )
      {
         addWhere(sWhereString, "(PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni)==0) )
      {
         addWhere(sWhereString, "(PMDPreUni >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to)==0) )
      {
         addWhere(sWhereString, "(PMDPreUni <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch)) )
      {
         addWhere(sWhereString, "(PMDValFch >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, PMDCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0AM52(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() );
            case 1 :
                  return conditional_P0AM53(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AM52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AM53", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               return;
      }
   }

}

