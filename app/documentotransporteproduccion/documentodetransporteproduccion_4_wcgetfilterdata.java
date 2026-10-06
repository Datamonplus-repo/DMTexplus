package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_4_wcgetfilterdata extends GXProcedure
{
   public documentodetransporteproduccion_4_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_4_wcgetfilterdata.class ), "" );
   }

   public documentodetransporteproduccion_4_wcgetfilterdata( int remoteHandle ,
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
      documentodetransporteproduccion_4_wcgetfilterdata.this.aP5 = new String[] {""};
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
      documentodetransporteproduccion_4_wcgetfilterdata.this.AV36DDOName = aP0;
      documentodetransporteproduccion_4_wcgetfilterdata.this.AV37SearchTxt = aP1;
      documentodetransporteproduccion_4_wcgetfilterdata.this.AV38SearchTxtTo = aP2;
      documentodetransporteproduccion_4_wcgetfilterdata.this.aP3 = aP3;
      documentodetransporteproduccion_4_wcgetfilterdata.this.aP4 = aP4;
      documentodetransporteproduccion_4_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV39OptionsJson = AV26Options.toJSonString(false) ;
      AV40OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV29OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WCGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASLIN") == 0 )
         {
            AV10TFGuiFasLin = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFGuiFasLin_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGM") == 0 )
         {
            AV16TFFasKgm = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFFasKgm_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPKG") == 0 )
         {
            AV18TFGuiFasPKg = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFGuiFasPKg_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASMTR") == 0 )
         {
            AV20TFFasMtr = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFFasMtr_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPMT") == 0 )
         {
            AV22TFGuiFasPMt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFGuiFasPMt_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV43Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROCOD") == 0 )
         {
            AV44Albprocod = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV45Barcod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV46Barcodreo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV47Barcodpar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENVFTP") == 0 )
         {
            AV48AlbEnvFtp = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBLIC") == 0 )
         {
            AV49AlbLic = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROEST") == 0 )
         {
            AV50AlbProEst = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV37SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV10TFGuiFasLin ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV11TFGuiFasLin_To ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV12TFFasCod ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV14TFFasDsc ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV16TFFasKgm ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV17TFFasKgm_To ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV18TFGuiFasPKg ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV19TFGuiFasPKg_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV20TFFasMtr ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV21TFFasMtr_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV22TFGuiFasPMt ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV23TFGuiFasPMt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin) ,
                                           Short.valueOf(AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to) ,
                                           AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ,
                                           AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ,
                                           AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ,
                                           AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ,
                                           AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ,
                                           AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ,
                                           AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ,
                                           AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ,
                                           AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ,
                                           AV66Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ,
                                           AV67Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ,
                                           AV68Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A396EmprCod ,
                                           AV43Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV44Albprocod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV45Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV46Barcodreo) ,
                                           A130BarCodPar ,
                                           AV47Barcodpar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AHB2 */
      pr_default.execute(0, new Object[] {AV43Emprcod, Long.valueOf(AV44Albprocod), Integer.valueOf(AV45Barcod), Byte.valueOf(AV46Barcodreo), AV47Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAHB2 = false ;
         A396EmprCod = P0AHB2_A396EmprCod[0] ;
         A30AlbProCod = P0AHB2_A30AlbProCod[0] ;
         A129BarCod = P0AHB2_A129BarCod[0] ;
         A132BarCodReo = P0AHB2_A132BarCodReo[0] ;
         A130BarCodPar = P0AHB2_A130BarCodPar[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) )
         {
            brkAHB2 = false ;
            A396EmprCod = P0AHB2_A396EmprCod[0] ;
            A30AlbProCod = P0AHB2_A30AlbProCod[0] ;
            A129BarCod = P0AHB2_A129BarCod[0] ;
            A132BarCodReo = P0AHB2_A132BarCodReo[0] ;
            A130BarCodPar = P0AHB2_A130BarCodPar[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAHB2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV25Option = A457FasCod ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAHB2 )
         {
            brkAHB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV37SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin = AV10TFGuiFasLin ;
      AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to = AV11TFGuiFasLin_To ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = AV12TFFasCod ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = AV14TFFasDsc ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = AV16TFFasKgm ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = AV17TFFasKgm_To ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = AV18TFGuiFasPKg ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = AV19TFGuiFasPKg_To ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = AV20TFFasMtr ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = AV21TFFasMtr_To ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = AV22TFGuiFasPMt ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = AV23TFGuiFasPMt_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin) ,
                                           Short.valueOf(AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to) ,
                                           AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ,
                                           AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ,
                                           AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ,
                                           AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ,
                                           AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ,
                                           AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ,
                                           AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ,
                                           AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ,
                                           AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ,
                                           AV66Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ,
                                           AV67Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ,
                                           AV68Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV44Albprocod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV45Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV46Barcodreo) ,
                                           A130BarCodPar ,
                                           AV47Barcodpar ,
                                           AV43Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AHB3 */
      pr_default.execute(1, new Object[] {AV43Emprcod, Long.valueOf(AV44Albprocod), Integer.valueOf(AV45Barcod), Byte.valueOf(AV46Barcodreo), AV47Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAHB4 = false ;
         A396EmprCod = P0AHB3_A396EmprCod[0] ;
         A30AlbProCod = P0AHB3_A30AlbProCod[0] ;
         A129BarCod = P0AHB3_A129BarCod[0] ;
         A132BarCodReo = P0AHB3_A132BarCodReo[0] ;
         A130BarCodPar = P0AHB3_A130BarCodPar[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AHB3_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brkAHB4 = false ;
            A30AlbProCod = P0AHB3_A30AlbProCod[0] ;
            A129BarCod = P0AHB3_A129BarCod[0] ;
            A132BarCodReo = P0AHB3_A132BarCodReo[0] ;
            A130BarCodPar = P0AHB3_A130BarCodPar[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAHB4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV25Option = A460FasDsc ;
            AV24InsertIndex = 1 ;
            while ( ( AV24InsertIndex <= AV26Options.size() ) && ( GXutil.strcmp((String)AV26Options.elementAt(-1+AV24InsertIndex), AV25Option) < 0 ) )
            {
               AV24InsertIndex = (int)(AV24InsertIndex+1) ;
            }
            AV26Options.add(AV25Option, AV24InsertIndex);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV24InsertIndex);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAHB4 )
         {
            brkAHB4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentodetransporteproduccion_4_wcgetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = documentodetransporteproduccion_4_wcgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = documentodetransporteproduccion_4_wcgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39OptionsJson = "" ;
      AV40OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV16TFFasKgm = DecimalUtil.ZERO ;
      AV17TFFasKgm_To = DecimalUtil.ZERO ;
      AV18TFGuiFasPKg = DecimalUtil.ZERO ;
      AV19TFGuiFasPKg_To = DecimalUtil.ZERO ;
      AV20TFFasMtr = DecimalUtil.ZERO ;
      AV21TFFasMtr_To = DecimalUtil.ZERO ;
      AV22TFGuiFasPMt = DecimalUtil.ZERO ;
      AV23TFGuiFasPMt_To = DecimalUtil.ZERO ;
      AV43Emprcod = "" ;
      AV47Barcodpar = "" ;
      AV49AlbLic = "" ;
      A457FasCod = "" ;
      AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod = "" ;
      AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel = "" ;
      AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc = "" ;
      AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel = "" ;
      AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm = DecimalUtil.ZERO ;
      AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to = DecimalUtil.ZERO ;
      AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg = DecimalUtil.ZERO ;
      AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to = DecimalUtil.ZERO ;
      AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr = DecimalUtil.ZERO ;
      AV66Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to = DecimalUtil.ZERO ;
      AV67Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt = DecimalUtil.ZERO ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A460FasDsc = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P0AHB2_A396EmprCod = new String[] {""} ;
      P0AHB2_A30AlbProCod = new long[1] ;
      P0AHB2_A129BarCod = new int[1] ;
      P0AHB2_A132BarCodReo = new byte[1] ;
      P0AHB2_A130BarCodPar = new String[] {""} ;
      AV25Option = "" ;
      AV27OptionDesc = "" ;
      P0AHB3_A396EmprCod = new String[] {""} ;
      P0AHB3_A30AlbProCod = new long[1] ;
      P0AHB3_A129BarCod = new int[1] ;
      P0AHB3_A132BarCodReo = new byte[1] ;
      P0AHB3_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_4_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AHB2_A396EmprCod, P0AHB2_A30AlbProCod, P0AHB2_A129BarCod, P0AHB2_A132BarCodReo, P0AHB2_A130BarCodPar
            }
            , new Object[] {
            P0AHB3_A396EmprCod, P0AHB3_A30AlbProCod, P0AHB3_A129BarCod, P0AHB3_A132BarCodReo, P0AHB3_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV46Barcodreo ;
   private byte AV48AlbEnvFtp ;
   private byte AV50AlbProEst ;
   private byte A132BarCodReo ;
   private short AV10TFGuiFasLin ;
   private short AV11TFGuiFasLin_To ;
   private short AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin ;
   private short AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV45Barcod ;
   private int A129BarCod ;
   private int AV24InsertIndex ;
   private long AV44Albprocod ;
   private long A30AlbProCod ;
   private long AV30count ;
   private java.math.BigDecimal AV16TFFasKgm ;
   private java.math.BigDecimal AV17TFFasKgm_To ;
   private java.math.BigDecimal AV18TFGuiFasPKg ;
   private java.math.BigDecimal AV19TFGuiFasPKg_To ;
   private java.math.BigDecimal AV20TFFasMtr ;
   private java.math.BigDecimal AV21TFFasMtr_To ;
   private java.math.BigDecimal AV22TFGuiFasPMt ;
   private java.math.BigDecimal AV23TFGuiFasPMt_To ;
   private java.math.BigDecimal AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ;
   private java.math.BigDecimal AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ;
   private java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ;
   private java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ;
   private java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ;
   private java.math.BigDecimal AV66Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ;
   private java.math.BigDecimal AV67Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ;
   private java.math.BigDecimal AV68Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV43Emprcod ;
   private String AV47Barcodpar ;
   private String AV49AlbLic ;
   private String A457FasCod ;
   private String AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ;
   private String AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ;
   private String AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ;
   private String AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ;
   private String scmdbuf ;
   private String A460FasDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brkAHB2 ;
   private boolean brkAHB4 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV25Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHB2_A396EmprCod ;
   private long[] P0AHB2_A30AlbProCod ;
   private int[] P0AHB2_A129BarCod ;
   private byte[] P0AHB2_A132BarCodReo ;
   private String[] P0AHB2_A130BarCodPar ;
   private String[] P0AHB3_A396EmprCod ;
   private long[] P0AHB3_A30AlbProCod ;
   private int[] P0AHB3_A129BarCod ;
   private byte[] P0AHB3_A132BarCodReo ;
   private String[] P0AHB3_A130BarCodPar ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class documentodetransporteproduccion_4_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AHB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin ,
                                          short AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to ,
                                          String AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ,
                                          String AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ,
                                          String AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ,
                                          String AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ,
                                          java.math.BigDecimal AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ,
                                          java.math.BigDecimal AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ,
                                          java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ,
                                          java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ,
                                          java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ,
                                          java.math.BigDecimal AV66Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ,
                                          java.math.BigDecimal AV67Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ,
                                          java.math.BigDecimal AV68Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A396EmprCod ,
                                          String AV43Emprcod ,
                                          long A30AlbProCod ,
                                          long AV44Albprocod ,
                                          int A129BarCod ,
                                          int AV45Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV46Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV47Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[5];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      scmdbuf += sWhereString ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AHB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV55Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_1_tfguifaslin ,
                                          short AV56Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_2_tfguifaslin_to ,
                                          String AV58Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_4_tffascod_sel ,
                                          String AV57Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_3_tffascod ,
                                          String AV60Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_6_tffasdsc_sel ,
                                          String AV59Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_5_tffasdsc ,
                                          java.math.BigDecimal AV61Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_7_tffaskgm ,
                                          java.math.BigDecimal AV62Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_8_tffaskgm_to ,
                                          java.math.BigDecimal AV63Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_9_tfguifaspkg ,
                                          java.math.BigDecimal AV64Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_10_tfguifaspkg_to ,
                                          java.math.BigDecimal AV65Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_11_tffasmtr ,
                                          java.math.BigDecimal AV66Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_12_tffasmtr_to ,
                                          java.math.BigDecimal AV67Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_13_tfguifaspmt ,
                                          java.math.BigDecimal AV68Documentotransporteproduccion_documentodetransporteproduccion_4_wcds_14_tfguifaspmt_to ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          long A30AlbProCod ,
                                          long AV44Albprocod ,
                                          int A129BarCod ,
                                          int AV45Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV46Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV47Barcodpar ,
                                          String AV43Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[5];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
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
                  return conditional_P0AHB2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).longValue() , ((Number) dynConstraints[24]).longValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] );
            case 1 :
                  return conditional_P0AHB3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               return;
      }
   }

}

