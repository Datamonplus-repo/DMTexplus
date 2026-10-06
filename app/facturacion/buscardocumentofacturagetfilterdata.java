package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class buscardocumentofacturagetfilterdata extends GXProcedure
{
   public buscardocumentofacturagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( buscardocumentofacturagetfilterdata.class ), "" );
   }

   public buscardocumentofacturagetfilterdata( int remoteHandle ,
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
      buscardocumentofacturagetfilterdata.this.aP5 = new String[] {""};
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
      buscardocumentofacturagetfilterdata.this.AV38DDOName = aP0;
      buscardocumentofacturagetfilterdata.this.AV39SearchTxt = aP1;
      buscardocumentofacturagetfilterdata.this.AV40SearchTxtTo = aP2;
      buscardocumentofacturagetfilterdata.this.aP3 = aP3;
      buscardocumentofacturagetfilterdata.this.aP4 = aP4;
      buscardocumentofacturagetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV31OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FACDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFACDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FACBARPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADFACBARPAROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FACSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFACSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FACCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFACCOLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV41OptionsJson = AV28Options.toJSonString(false) ;
      AV42OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV31OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("Facturacion.BuscarDocumentoFacturaGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.BuscarDocumentoFacturaGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("Facturacion.BuscarDocumentoFacturaGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACLIN") == 0 )
         {
            AV10TFFacLin = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFFacLin_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDSC") == 0 )
         {
            AV12TFFacDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACDSC_SEL") == 0 )
         {
            AV13TFFacDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBARCOD") == 0 )
         {
            AV14TFFacBarCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFFacBarCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBARREO") == 0 )
         {
            AV16TFFacBarReo = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFFacBarReo_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBARPAR") == 0 )
         {
            AV18TFFacBarPar = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBARPAR_SEL") == 0 )
         {
            AV19TFFacBarPar_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACSER") == 0 )
         {
            AV20TFFacSer = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACSER_SEL") == 0 )
         {
            AV21TFFacSer_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOLNOM") == 0 )
         {
            AV22TFFacColNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOLNOM_SEL") == 0 )
         {
            AV23TFFacColNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOCCOLNUM") == 0 )
         {
            AV24TFFocColNum = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFFocColNum_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFACDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFacDsc = AV39SearchTxt ;
      AV13TFFacDsc_Sel = "" ;
      AV51Facturacion_buscardocumentofacturads_1_tffaclin = AV10TFFacLin ;
      AV52Facturacion_buscardocumentofacturads_2_tffaclin_to = AV11TFFacLin_To ;
      AV53Facturacion_buscardocumentofacturads_3_tffacdsc = AV12TFFacDsc ;
      AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV13TFFacDsc_Sel ;
      AV55Facturacion_buscardocumentofacturads_5_tffacbarcod = AV14TFFacBarCod ;
      AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV15TFFacBarCod_To ;
      AV57Facturacion_buscardocumentofacturads_7_tffacbarreo = AV16TFFacBarReo ;
      AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV17TFFacBarReo_To ;
      AV59Facturacion_buscardocumentofacturads_9_tffacbarpar = AV18TFFacBarPar ;
      AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV19TFFacBarPar_Sel ;
      AV61Facturacion_buscardocumentofacturads_11_tffacser = AV20TFFacSer ;
      AV62Facturacion_buscardocumentofacturads_12_tffacser_sel = AV21TFFacSer_Sel ;
      AV63Facturacion_buscardocumentofacturads_13_tffaccolnom = AV22TFFacColNom ;
      AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV23TFFacColNom_Sel ;
      AV65Facturacion_buscardocumentofacturads_15_tffoccolnum = AV24TFFocColNum ;
      AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV25TFFocColNum_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV51Facturacion_buscardocumentofacturads_1_tffaclin) ,
                                           Integer.valueOf(AV52Facturacion_buscardocumentofacturads_2_tffaclin_to) ,
                                           AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                           AV53Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                           Integer.valueOf(AV55Facturacion_buscardocumentofacturads_5_tffacbarcod) ,
                                           Integer.valueOf(AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to) ,
                                           Byte.valueOf(AV57Facturacion_buscardocumentofacturads_7_tffacbarreo) ,
                                           Byte.valueOf(AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to) ,
                                           AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                           AV59Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                           AV62Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                           AV61Facturacion_buscardocumentofacturads_11_tffacser ,
                                           AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                           AV63Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                           Integer.valueOf(AV65Facturacion_buscardocumentofacturads_15_tffoccolnum) ,
                                           Integer.valueOf(AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to) ,
                                           Integer.valueOf(A446FacLin) ,
                                           A432FacDsc ,
                                           Integer.valueOf(A1294FacBarCod) ,
                                           Byte.valueOf(A1295FacBarReo) ,
                                           A1296FacBarPar ,
                                           A454FacSer ,
                                           A3878FacColNom ,
                                           Integer.valueOf(A3879FocColNum) ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(AV45Faccod) ,
                                           Long.valueOf(A427FacAlbCod) ,
                                           Long.valueOf(AV46FacALbCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV53Facturacion_buscardocumentofacturads_3_tffacdsc = GXutil.padr( GXutil.rtrim( AV53Facturacion_buscardocumentofacturads_3_tffacdsc), 40, "%") ;
      lV59Facturacion_buscardocumentofacturads_9_tffacbarpar = GXutil.padr( GXutil.rtrim( AV59Facturacion_buscardocumentofacturads_9_tffacbarpar), 1, "%") ;
      lV61Facturacion_buscardocumentofacturads_11_tffacser = GXutil.padr( GXutil.rtrim( AV61Facturacion_buscardocumentofacturads_11_tffacser), 16, "%") ;
      lV63Facturacion_buscardocumentofacturads_13_tffaccolnom = GXutil.padr( GXutil.rtrim( AV63Facturacion_buscardocumentofacturads_13_tffaccolnom), 13, "%") ;
      /* Using cursor P0AQA2 */
      pr_default.execute(0, new Object[] {AV44Emprcod, Integer.valueOf(AV45Faccod), Long.valueOf(AV46FacALbCod), Integer.valueOf(AV51Facturacion_buscardocumentofacturads_1_tffaclin), Integer.valueOf(AV52Facturacion_buscardocumentofacturads_2_tffaclin_to), lV53Facturacion_buscardocumentofacturads_3_tffacdsc, AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel, Integer.valueOf(AV55Facturacion_buscardocumentofacturads_5_tffacbarcod), Integer.valueOf(AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to), Byte.valueOf(AV57Facturacion_buscardocumentofacturads_7_tffacbarreo), Byte.valueOf(AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to), lV59Facturacion_buscardocumentofacturads_9_tffacbarpar, AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel, lV61Facturacion_buscardocumentofacturads_11_tffacser, AV62Facturacion_buscardocumentofacturads_12_tffacser_sel, lV63Facturacion_buscardocumentofacturads_13_tffaccolnom, AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel, Integer.valueOf(AV65Facturacion_buscardocumentofacturads_15_tffoccolnum), Integer.valueOf(AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAQA2 = false ;
         A396EmprCod = P0AQA2_A396EmprCod[0] ;
         A430FacCod = P0AQA2_A430FacCod[0] ;
         A427FacAlbCod = P0AQA2_A427FacAlbCod[0] ;
         A432FacDsc = P0AQA2_A432FacDsc[0] ;
         A3879FocColNum = P0AQA2_A3879FocColNum[0] ;
         A3878FacColNom = P0AQA2_A3878FacColNom[0] ;
         A454FacSer = P0AQA2_A454FacSer[0] ;
         A1296FacBarPar = P0AQA2_A1296FacBarPar[0] ;
         A1295FacBarReo = P0AQA2_A1295FacBarReo[0] ;
         A1294FacBarCod = P0AQA2_A1294FacBarCod[0] ;
         A446FacLin = P0AQA2_A446FacLin[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AQA2_A432FacDsc[0], A432FacDsc) == 0 ) )
         {
            brkAQA2 = false ;
            A396EmprCod = P0AQA2_A396EmprCod[0] ;
            A430FacCod = P0AQA2_A430FacCod[0] ;
            A446FacLin = P0AQA2_A446FacLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brkAQA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A432FacDsc)==0) )
         {
            AV27Option = A432FacDsc ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAQA2 )
         {
            brkAQA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFACBARPAROPTIONS' Routine */
      returnInSub = false ;
      AV18TFFacBarPar = AV39SearchTxt ;
      AV19TFFacBarPar_Sel = "" ;
      AV51Facturacion_buscardocumentofacturads_1_tffaclin = AV10TFFacLin ;
      AV52Facturacion_buscardocumentofacturads_2_tffaclin_to = AV11TFFacLin_To ;
      AV53Facturacion_buscardocumentofacturads_3_tffacdsc = AV12TFFacDsc ;
      AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV13TFFacDsc_Sel ;
      AV55Facturacion_buscardocumentofacturads_5_tffacbarcod = AV14TFFacBarCod ;
      AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV15TFFacBarCod_To ;
      AV57Facturacion_buscardocumentofacturads_7_tffacbarreo = AV16TFFacBarReo ;
      AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV17TFFacBarReo_To ;
      AV59Facturacion_buscardocumentofacturads_9_tffacbarpar = AV18TFFacBarPar ;
      AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV19TFFacBarPar_Sel ;
      AV61Facturacion_buscardocumentofacturads_11_tffacser = AV20TFFacSer ;
      AV62Facturacion_buscardocumentofacturads_12_tffacser_sel = AV21TFFacSer_Sel ;
      AV63Facturacion_buscardocumentofacturads_13_tffaccolnom = AV22TFFacColNom ;
      AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV23TFFacColNom_Sel ;
      AV65Facturacion_buscardocumentofacturads_15_tffoccolnum = AV24TFFocColNum ;
      AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV25TFFocColNum_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV51Facturacion_buscardocumentofacturads_1_tffaclin) ,
                                           Integer.valueOf(AV52Facturacion_buscardocumentofacturads_2_tffaclin_to) ,
                                           AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                           AV53Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                           Integer.valueOf(AV55Facturacion_buscardocumentofacturads_5_tffacbarcod) ,
                                           Integer.valueOf(AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to) ,
                                           Byte.valueOf(AV57Facturacion_buscardocumentofacturads_7_tffacbarreo) ,
                                           Byte.valueOf(AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to) ,
                                           AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                           AV59Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                           AV62Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                           AV61Facturacion_buscardocumentofacturads_11_tffacser ,
                                           AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                           AV63Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                           Integer.valueOf(AV65Facturacion_buscardocumentofacturads_15_tffoccolnum) ,
                                           Integer.valueOf(AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to) ,
                                           Integer.valueOf(A446FacLin) ,
                                           A432FacDsc ,
                                           Integer.valueOf(A1294FacBarCod) ,
                                           Byte.valueOf(A1295FacBarReo) ,
                                           A1296FacBarPar ,
                                           A454FacSer ,
                                           A3878FacColNom ,
                                           Integer.valueOf(A3879FocColNum) ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(AV45Faccod) ,
                                           Long.valueOf(A427FacAlbCod) ,
                                           Long.valueOf(AV46FacALbCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV53Facturacion_buscardocumentofacturads_3_tffacdsc = GXutil.padr( GXutil.rtrim( AV53Facturacion_buscardocumentofacturads_3_tffacdsc), 40, "%") ;
      lV59Facturacion_buscardocumentofacturads_9_tffacbarpar = GXutil.padr( GXutil.rtrim( AV59Facturacion_buscardocumentofacturads_9_tffacbarpar), 1, "%") ;
      lV61Facturacion_buscardocumentofacturads_11_tffacser = GXutil.padr( GXutil.rtrim( AV61Facturacion_buscardocumentofacturads_11_tffacser), 16, "%") ;
      lV63Facturacion_buscardocumentofacturads_13_tffaccolnom = GXutil.padr( GXutil.rtrim( AV63Facturacion_buscardocumentofacturads_13_tffaccolnom), 13, "%") ;
      /* Using cursor P0AQA3 */
      pr_default.execute(1, new Object[] {AV44Emprcod, Integer.valueOf(AV45Faccod), Long.valueOf(AV46FacALbCod), Integer.valueOf(AV51Facturacion_buscardocumentofacturads_1_tffaclin), Integer.valueOf(AV52Facturacion_buscardocumentofacturads_2_tffaclin_to), lV53Facturacion_buscardocumentofacturads_3_tffacdsc, AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel, Integer.valueOf(AV55Facturacion_buscardocumentofacturads_5_tffacbarcod), Integer.valueOf(AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to), Byte.valueOf(AV57Facturacion_buscardocumentofacturads_7_tffacbarreo), Byte.valueOf(AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to), lV59Facturacion_buscardocumentofacturads_9_tffacbarpar, AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel, lV61Facturacion_buscardocumentofacturads_11_tffacser, AV62Facturacion_buscardocumentofacturads_12_tffacser_sel, lV63Facturacion_buscardocumentofacturads_13_tffaccolnom, AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel, Integer.valueOf(AV65Facturacion_buscardocumentofacturads_15_tffoccolnum), Integer.valueOf(AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAQA4 = false ;
         A396EmprCod = P0AQA3_A396EmprCod[0] ;
         A430FacCod = P0AQA3_A430FacCod[0] ;
         A427FacAlbCod = P0AQA3_A427FacAlbCod[0] ;
         A1296FacBarPar = P0AQA3_A1296FacBarPar[0] ;
         A3879FocColNum = P0AQA3_A3879FocColNum[0] ;
         A3878FacColNom = P0AQA3_A3878FacColNom[0] ;
         A454FacSer = P0AQA3_A454FacSer[0] ;
         A1295FacBarReo = P0AQA3_A1295FacBarReo[0] ;
         A1294FacBarCod = P0AQA3_A1294FacBarCod[0] ;
         A432FacDsc = P0AQA3_A432FacDsc[0] ;
         A446FacLin = P0AQA3_A446FacLin[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AQA3_A1296FacBarPar[0], A1296FacBarPar) == 0 ) )
         {
            brkAQA4 = false ;
            A396EmprCod = P0AQA3_A396EmprCod[0] ;
            A430FacCod = P0AQA3_A430FacCod[0] ;
            A446FacLin = P0AQA3_A446FacLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brkAQA4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A1296FacBarPar)==0) )
         {
            AV27Option = A1296FacBarPar ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAQA4 )
         {
            brkAQA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFACSEROPTIONS' Routine */
      returnInSub = false ;
      AV20TFFacSer = AV39SearchTxt ;
      AV21TFFacSer_Sel = "" ;
      AV51Facturacion_buscardocumentofacturads_1_tffaclin = AV10TFFacLin ;
      AV52Facturacion_buscardocumentofacturads_2_tffaclin_to = AV11TFFacLin_To ;
      AV53Facturacion_buscardocumentofacturads_3_tffacdsc = AV12TFFacDsc ;
      AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV13TFFacDsc_Sel ;
      AV55Facturacion_buscardocumentofacturads_5_tffacbarcod = AV14TFFacBarCod ;
      AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV15TFFacBarCod_To ;
      AV57Facturacion_buscardocumentofacturads_7_tffacbarreo = AV16TFFacBarReo ;
      AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV17TFFacBarReo_To ;
      AV59Facturacion_buscardocumentofacturads_9_tffacbarpar = AV18TFFacBarPar ;
      AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV19TFFacBarPar_Sel ;
      AV61Facturacion_buscardocumentofacturads_11_tffacser = AV20TFFacSer ;
      AV62Facturacion_buscardocumentofacturads_12_tffacser_sel = AV21TFFacSer_Sel ;
      AV63Facturacion_buscardocumentofacturads_13_tffaccolnom = AV22TFFacColNom ;
      AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV23TFFacColNom_Sel ;
      AV65Facturacion_buscardocumentofacturads_15_tffoccolnum = AV24TFFocColNum ;
      AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV25TFFocColNum_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV51Facturacion_buscardocumentofacturads_1_tffaclin) ,
                                           Integer.valueOf(AV52Facturacion_buscardocumentofacturads_2_tffaclin_to) ,
                                           AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                           AV53Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                           Integer.valueOf(AV55Facturacion_buscardocumentofacturads_5_tffacbarcod) ,
                                           Integer.valueOf(AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to) ,
                                           Byte.valueOf(AV57Facturacion_buscardocumentofacturads_7_tffacbarreo) ,
                                           Byte.valueOf(AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to) ,
                                           AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                           AV59Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                           AV62Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                           AV61Facturacion_buscardocumentofacturads_11_tffacser ,
                                           AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                           AV63Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                           Integer.valueOf(AV65Facturacion_buscardocumentofacturads_15_tffoccolnum) ,
                                           Integer.valueOf(AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to) ,
                                           Integer.valueOf(A446FacLin) ,
                                           A432FacDsc ,
                                           Integer.valueOf(A1294FacBarCod) ,
                                           Byte.valueOf(A1295FacBarReo) ,
                                           A1296FacBarPar ,
                                           A454FacSer ,
                                           A3878FacColNom ,
                                           Integer.valueOf(A3879FocColNum) ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(AV45Faccod) ,
                                           Long.valueOf(A427FacAlbCod) ,
                                           Long.valueOf(AV46FacALbCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV53Facturacion_buscardocumentofacturads_3_tffacdsc = GXutil.padr( GXutil.rtrim( AV53Facturacion_buscardocumentofacturads_3_tffacdsc), 40, "%") ;
      lV59Facturacion_buscardocumentofacturads_9_tffacbarpar = GXutil.padr( GXutil.rtrim( AV59Facturacion_buscardocumentofacturads_9_tffacbarpar), 1, "%") ;
      lV61Facturacion_buscardocumentofacturads_11_tffacser = GXutil.padr( GXutil.rtrim( AV61Facturacion_buscardocumentofacturads_11_tffacser), 16, "%") ;
      lV63Facturacion_buscardocumentofacturads_13_tffaccolnom = GXutil.padr( GXutil.rtrim( AV63Facturacion_buscardocumentofacturads_13_tffaccolnom), 13, "%") ;
      /* Using cursor P0AQA4 */
      pr_default.execute(2, new Object[] {AV44Emprcod, Integer.valueOf(AV45Faccod), Long.valueOf(AV46FacALbCod), Integer.valueOf(AV51Facturacion_buscardocumentofacturads_1_tffaclin), Integer.valueOf(AV52Facturacion_buscardocumentofacturads_2_tffaclin_to), lV53Facturacion_buscardocumentofacturads_3_tffacdsc, AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel, Integer.valueOf(AV55Facturacion_buscardocumentofacturads_5_tffacbarcod), Integer.valueOf(AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to), Byte.valueOf(AV57Facturacion_buscardocumentofacturads_7_tffacbarreo), Byte.valueOf(AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to), lV59Facturacion_buscardocumentofacturads_9_tffacbarpar, AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel, lV61Facturacion_buscardocumentofacturads_11_tffacser, AV62Facturacion_buscardocumentofacturads_12_tffacser_sel, lV63Facturacion_buscardocumentofacturads_13_tffaccolnom, AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel, Integer.valueOf(AV65Facturacion_buscardocumentofacturads_15_tffoccolnum), Integer.valueOf(AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAQA6 = false ;
         A396EmprCod = P0AQA4_A396EmprCod[0] ;
         A430FacCod = P0AQA4_A430FacCod[0] ;
         A427FacAlbCod = P0AQA4_A427FacAlbCod[0] ;
         A454FacSer = P0AQA4_A454FacSer[0] ;
         A3879FocColNum = P0AQA4_A3879FocColNum[0] ;
         A3878FacColNom = P0AQA4_A3878FacColNom[0] ;
         A1296FacBarPar = P0AQA4_A1296FacBarPar[0] ;
         A1295FacBarReo = P0AQA4_A1295FacBarReo[0] ;
         A1294FacBarCod = P0AQA4_A1294FacBarCod[0] ;
         A432FacDsc = P0AQA4_A432FacDsc[0] ;
         A446FacLin = P0AQA4_A446FacLin[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AQA4_A454FacSer[0], A454FacSer) == 0 ) )
         {
            brkAQA6 = false ;
            A396EmprCod = P0AQA4_A396EmprCod[0] ;
            A430FacCod = P0AQA4_A430FacCod[0] ;
            A446FacLin = P0AQA4_A446FacLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brkAQA6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A454FacSer)==0) )
         {
            AV27Option = A454FacSer ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAQA6 )
         {
            brkAQA6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFACCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFFacColNom = AV39SearchTxt ;
      AV23TFFacColNom_Sel = "" ;
      AV51Facturacion_buscardocumentofacturads_1_tffaclin = AV10TFFacLin ;
      AV52Facturacion_buscardocumentofacturads_2_tffaclin_to = AV11TFFacLin_To ;
      AV53Facturacion_buscardocumentofacturads_3_tffacdsc = AV12TFFacDsc ;
      AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel = AV13TFFacDsc_Sel ;
      AV55Facturacion_buscardocumentofacturads_5_tffacbarcod = AV14TFFacBarCod ;
      AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to = AV15TFFacBarCod_To ;
      AV57Facturacion_buscardocumentofacturads_7_tffacbarreo = AV16TFFacBarReo ;
      AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to = AV17TFFacBarReo_To ;
      AV59Facturacion_buscardocumentofacturads_9_tffacbarpar = AV18TFFacBarPar ;
      AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = AV19TFFacBarPar_Sel ;
      AV61Facturacion_buscardocumentofacturads_11_tffacser = AV20TFFacSer ;
      AV62Facturacion_buscardocumentofacturads_12_tffacser_sel = AV21TFFacSer_Sel ;
      AV63Facturacion_buscardocumentofacturads_13_tffaccolnom = AV22TFFacColNom ;
      AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = AV23TFFacColNom_Sel ;
      AV65Facturacion_buscardocumentofacturads_15_tffoccolnum = AV24TFFocColNum ;
      AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to = AV25TFFocColNum_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV51Facturacion_buscardocumentofacturads_1_tffaclin) ,
                                           Integer.valueOf(AV52Facturacion_buscardocumentofacturads_2_tffaclin_to) ,
                                           AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                           AV53Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                           Integer.valueOf(AV55Facturacion_buscardocumentofacturads_5_tffacbarcod) ,
                                           Integer.valueOf(AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to) ,
                                           Byte.valueOf(AV57Facturacion_buscardocumentofacturads_7_tffacbarreo) ,
                                           Byte.valueOf(AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to) ,
                                           AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                           AV59Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                           AV62Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                           AV61Facturacion_buscardocumentofacturads_11_tffacser ,
                                           AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                           AV63Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                           Integer.valueOf(AV65Facturacion_buscardocumentofacturads_15_tffoccolnum) ,
                                           Integer.valueOf(AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to) ,
                                           Integer.valueOf(A446FacLin) ,
                                           A432FacDsc ,
                                           Integer.valueOf(A1294FacBarCod) ,
                                           Byte.valueOf(A1295FacBarReo) ,
                                           A1296FacBarPar ,
                                           A454FacSer ,
                                           A3878FacColNom ,
                                           Integer.valueOf(A3879FocColNum) ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(AV45Faccod) ,
                                           Long.valueOf(A427FacAlbCod) ,
                                           Long.valueOf(AV46FacALbCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV53Facturacion_buscardocumentofacturads_3_tffacdsc = GXutil.padr( GXutil.rtrim( AV53Facturacion_buscardocumentofacturads_3_tffacdsc), 40, "%") ;
      lV59Facturacion_buscardocumentofacturads_9_tffacbarpar = GXutil.padr( GXutil.rtrim( AV59Facturacion_buscardocumentofacturads_9_tffacbarpar), 1, "%") ;
      lV61Facturacion_buscardocumentofacturads_11_tffacser = GXutil.padr( GXutil.rtrim( AV61Facturacion_buscardocumentofacturads_11_tffacser), 16, "%") ;
      lV63Facturacion_buscardocumentofacturads_13_tffaccolnom = GXutil.padr( GXutil.rtrim( AV63Facturacion_buscardocumentofacturads_13_tffaccolnom), 13, "%") ;
      /* Using cursor P0AQA5 */
      pr_default.execute(3, new Object[] {AV44Emprcod, Integer.valueOf(AV45Faccod), Long.valueOf(AV46FacALbCod), Integer.valueOf(AV51Facturacion_buscardocumentofacturads_1_tffaclin), Integer.valueOf(AV52Facturacion_buscardocumentofacturads_2_tffaclin_to), lV53Facturacion_buscardocumentofacturads_3_tffacdsc, AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel, Integer.valueOf(AV55Facturacion_buscardocumentofacturads_5_tffacbarcod), Integer.valueOf(AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to), Byte.valueOf(AV57Facturacion_buscardocumentofacturads_7_tffacbarreo), Byte.valueOf(AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to), lV59Facturacion_buscardocumentofacturads_9_tffacbarpar, AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel, lV61Facturacion_buscardocumentofacturads_11_tffacser, AV62Facturacion_buscardocumentofacturads_12_tffacser_sel, lV63Facturacion_buscardocumentofacturads_13_tffaccolnom, AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel, Integer.valueOf(AV65Facturacion_buscardocumentofacturads_15_tffoccolnum), Integer.valueOf(AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAQA8 = false ;
         A396EmprCod = P0AQA5_A396EmprCod[0] ;
         A430FacCod = P0AQA5_A430FacCod[0] ;
         A427FacAlbCod = P0AQA5_A427FacAlbCod[0] ;
         A3878FacColNom = P0AQA5_A3878FacColNom[0] ;
         A3879FocColNum = P0AQA5_A3879FocColNum[0] ;
         A454FacSer = P0AQA5_A454FacSer[0] ;
         A1296FacBarPar = P0AQA5_A1296FacBarPar[0] ;
         A1295FacBarReo = P0AQA5_A1295FacBarReo[0] ;
         A1294FacBarCod = P0AQA5_A1294FacBarCod[0] ;
         A432FacDsc = P0AQA5_A432FacDsc[0] ;
         A446FacLin = P0AQA5_A446FacLin[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AQA5_A3878FacColNom[0], A3878FacColNom) == 0 ) )
         {
            brkAQA8 = false ;
            A396EmprCod = P0AQA5_A396EmprCod[0] ;
            A430FacCod = P0AQA5_A430FacCod[0] ;
            A446FacLin = P0AQA5_A446FacLin[0] ;
            AV32count = (long)(AV32count+1) ;
            brkAQA8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A3878FacColNom)==0) )
         {
            AV27Option = A3878FacColNom ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAQA8 )
         {
            brkAQA8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = buscardocumentofacturagetfilterdata.this.AV41OptionsJson;
      this.aP4[0] = buscardocumentofacturagetfilterdata.this.AV42OptionsDescJson;
      this.aP5[0] = buscardocumentofacturagetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV41OptionsJson = "" ;
      AV42OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV28Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV31OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFFacDsc = "" ;
      AV13TFFacDsc_Sel = "" ;
      AV18TFFacBarPar = "" ;
      AV19TFFacBarPar_Sel = "" ;
      AV20TFFacSer = "" ;
      AV21TFFacSer_Sel = "" ;
      AV22TFFacColNom = "" ;
      AV23TFFacColNom_Sel = "" ;
      A432FacDsc = "" ;
      AV53Facturacion_buscardocumentofacturads_3_tffacdsc = "" ;
      AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel = "" ;
      AV59Facturacion_buscardocumentofacturads_9_tffacbarpar = "" ;
      AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel = "" ;
      AV61Facturacion_buscardocumentofacturads_11_tffacser = "" ;
      AV62Facturacion_buscardocumentofacturads_12_tffacser_sel = "" ;
      AV63Facturacion_buscardocumentofacturads_13_tffaccolnom = "" ;
      AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel = "" ;
      scmdbuf = "" ;
      lV53Facturacion_buscardocumentofacturads_3_tffacdsc = "" ;
      lV59Facturacion_buscardocumentofacturads_9_tffacbarpar = "" ;
      lV61Facturacion_buscardocumentofacturads_11_tffacser = "" ;
      lV63Facturacion_buscardocumentofacturads_13_tffaccolnom = "" ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A3878FacColNom = "" ;
      A396EmprCod = "" ;
      AV44Emprcod = "" ;
      P0AQA2_A396EmprCod = new String[] {""} ;
      P0AQA2_A430FacCod = new int[1] ;
      P0AQA2_A427FacAlbCod = new long[1] ;
      P0AQA2_A432FacDsc = new String[] {""} ;
      P0AQA2_A3879FocColNum = new int[1] ;
      P0AQA2_A3878FacColNom = new String[] {""} ;
      P0AQA2_A454FacSer = new String[] {""} ;
      P0AQA2_A1296FacBarPar = new String[] {""} ;
      P0AQA2_A1295FacBarReo = new byte[1] ;
      P0AQA2_A1294FacBarCod = new int[1] ;
      P0AQA2_A446FacLin = new int[1] ;
      AV27Option = "" ;
      P0AQA3_A396EmprCod = new String[] {""} ;
      P0AQA3_A430FacCod = new int[1] ;
      P0AQA3_A427FacAlbCod = new long[1] ;
      P0AQA3_A1296FacBarPar = new String[] {""} ;
      P0AQA3_A3879FocColNum = new int[1] ;
      P0AQA3_A3878FacColNom = new String[] {""} ;
      P0AQA3_A454FacSer = new String[] {""} ;
      P0AQA3_A1295FacBarReo = new byte[1] ;
      P0AQA3_A1294FacBarCod = new int[1] ;
      P0AQA3_A432FacDsc = new String[] {""} ;
      P0AQA3_A446FacLin = new int[1] ;
      P0AQA4_A396EmprCod = new String[] {""} ;
      P0AQA4_A430FacCod = new int[1] ;
      P0AQA4_A427FacAlbCod = new long[1] ;
      P0AQA4_A454FacSer = new String[] {""} ;
      P0AQA4_A3879FocColNum = new int[1] ;
      P0AQA4_A3878FacColNom = new String[] {""} ;
      P0AQA4_A1296FacBarPar = new String[] {""} ;
      P0AQA4_A1295FacBarReo = new byte[1] ;
      P0AQA4_A1294FacBarCod = new int[1] ;
      P0AQA4_A432FacDsc = new String[] {""} ;
      P0AQA4_A446FacLin = new int[1] ;
      P0AQA5_A396EmprCod = new String[] {""} ;
      P0AQA5_A430FacCod = new int[1] ;
      P0AQA5_A427FacAlbCod = new long[1] ;
      P0AQA5_A3878FacColNom = new String[] {""} ;
      P0AQA5_A3879FocColNum = new int[1] ;
      P0AQA5_A454FacSer = new String[] {""} ;
      P0AQA5_A1296FacBarPar = new String[] {""} ;
      P0AQA5_A1295FacBarReo = new byte[1] ;
      P0AQA5_A1294FacBarCod = new int[1] ;
      P0AQA5_A432FacDsc = new String[] {""} ;
      P0AQA5_A446FacLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.buscardocumentofacturagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AQA2_A396EmprCod, P0AQA2_A430FacCod, P0AQA2_A427FacAlbCod, P0AQA2_A432FacDsc, P0AQA2_A3879FocColNum, P0AQA2_A3878FacColNom, P0AQA2_A454FacSer, P0AQA2_A1296FacBarPar, P0AQA2_A1295FacBarReo, P0AQA2_A1294FacBarCod,
            P0AQA2_A446FacLin
            }
            , new Object[] {
            P0AQA3_A396EmprCod, P0AQA3_A430FacCod, P0AQA3_A427FacAlbCod, P0AQA3_A1296FacBarPar, P0AQA3_A3879FocColNum, P0AQA3_A3878FacColNom, P0AQA3_A454FacSer, P0AQA3_A1295FacBarReo, P0AQA3_A1294FacBarCod, P0AQA3_A432FacDsc,
            P0AQA3_A446FacLin
            }
            , new Object[] {
            P0AQA4_A396EmprCod, P0AQA4_A430FacCod, P0AQA4_A427FacAlbCod, P0AQA4_A454FacSer, P0AQA4_A3879FocColNum, P0AQA4_A3878FacColNom, P0AQA4_A1296FacBarPar, P0AQA4_A1295FacBarReo, P0AQA4_A1294FacBarCod, P0AQA4_A432FacDsc,
            P0AQA4_A446FacLin
            }
            , new Object[] {
            P0AQA5_A396EmprCod, P0AQA5_A430FacCod, P0AQA5_A427FacAlbCod, P0AQA5_A3878FacColNom, P0AQA5_A3879FocColNum, P0AQA5_A454FacSer, P0AQA5_A1296FacBarPar, P0AQA5_A1295FacBarReo, P0AQA5_A1294FacBarCod, P0AQA5_A432FacDsc,
            P0AQA5_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFFacBarReo ;
   private byte AV17TFFacBarReo_To ;
   private byte AV57Facturacion_buscardocumentofacturads_7_tffacbarreo ;
   private byte AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to ;
   private byte A1295FacBarReo ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV10TFFacLin ;
   private int AV11TFFacLin_To ;
   private int AV14TFFacBarCod ;
   private int AV15TFFacBarCod_To ;
   private int AV24TFFocColNum ;
   private int AV25TFFocColNum_To ;
   private int AV51Facturacion_buscardocumentofacturads_1_tffaclin ;
   private int AV52Facturacion_buscardocumentofacturads_2_tffaclin_to ;
   private int AV55Facturacion_buscardocumentofacturads_5_tffacbarcod ;
   private int AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to ;
   private int AV65Facturacion_buscardocumentofacturads_15_tffoccolnum ;
   private int AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A3879FocColNum ;
   private int A430FacCod ;
   private int AV45Faccod ;
   private long A427FacAlbCod ;
   private long AV46FacALbCod ;
   private long AV32count ;
   private String AV12TFFacDsc ;
   private String AV13TFFacDsc_Sel ;
   private String AV18TFFacBarPar ;
   private String AV19TFFacBarPar_Sel ;
   private String AV20TFFacSer ;
   private String AV21TFFacSer_Sel ;
   private String AV22TFFacColNom ;
   private String AV23TFFacColNom_Sel ;
   private String A432FacDsc ;
   private String AV53Facturacion_buscardocumentofacturads_3_tffacdsc ;
   private String AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel ;
   private String AV59Facturacion_buscardocumentofacturads_9_tffacbarpar ;
   private String AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ;
   private String AV61Facturacion_buscardocumentofacturads_11_tffacser ;
   private String AV62Facturacion_buscardocumentofacturads_12_tffacser_sel ;
   private String AV63Facturacion_buscardocumentofacturads_13_tffaccolnom ;
   private String AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ;
   private String scmdbuf ;
   private String lV53Facturacion_buscardocumentofacturads_3_tffacdsc ;
   private String lV59Facturacion_buscardocumentofacturads_9_tffacbarpar ;
   private String lV61Facturacion_buscardocumentofacturads_11_tffacser ;
   private String lV63Facturacion_buscardocumentofacturads_13_tffaccolnom ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A3878FacColNom ;
   private String A396EmprCod ;
   private String AV44Emprcod ;
   private boolean returnInSub ;
   private boolean brkAQA2 ;
   private boolean brkAQA4 ;
   private boolean brkAQA6 ;
   private boolean brkAQA8 ;
   private String AV41OptionsJson ;
   private String AV42OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV39SearchTxt ;
   private String AV40SearchTxtTo ;
   private String AV27Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQA2_A396EmprCod ;
   private int[] P0AQA2_A430FacCod ;
   private long[] P0AQA2_A427FacAlbCod ;
   private String[] P0AQA2_A432FacDsc ;
   private int[] P0AQA2_A3879FocColNum ;
   private String[] P0AQA2_A3878FacColNom ;
   private String[] P0AQA2_A454FacSer ;
   private String[] P0AQA2_A1296FacBarPar ;
   private byte[] P0AQA2_A1295FacBarReo ;
   private int[] P0AQA2_A1294FacBarCod ;
   private int[] P0AQA2_A446FacLin ;
   private String[] P0AQA3_A396EmprCod ;
   private int[] P0AQA3_A430FacCod ;
   private long[] P0AQA3_A427FacAlbCod ;
   private String[] P0AQA3_A1296FacBarPar ;
   private int[] P0AQA3_A3879FocColNum ;
   private String[] P0AQA3_A3878FacColNom ;
   private String[] P0AQA3_A454FacSer ;
   private byte[] P0AQA3_A1295FacBarReo ;
   private int[] P0AQA3_A1294FacBarCod ;
   private String[] P0AQA3_A432FacDsc ;
   private int[] P0AQA3_A446FacLin ;
   private String[] P0AQA4_A396EmprCod ;
   private int[] P0AQA4_A430FacCod ;
   private long[] P0AQA4_A427FacAlbCod ;
   private String[] P0AQA4_A454FacSer ;
   private int[] P0AQA4_A3879FocColNum ;
   private String[] P0AQA4_A3878FacColNom ;
   private String[] P0AQA4_A1296FacBarPar ;
   private byte[] P0AQA4_A1295FacBarReo ;
   private int[] P0AQA4_A1294FacBarCod ;
   private String[] P0AQA4_A432FacDsc ;
   private int[] P0AQA4_A446FacLin ;
   private String[] P0AQA5_A396EmprCod ;
   private int[] P0AQA5_A430FacCod ;
   private long[] P0AQA5_A427FacAlbCod ;
   private String[] P0AQA5_A3878FacColNom ;
   private int[] P0AQA5_A3879FocColNum ;
   private String[] P0AQA5_A454FacSer ;
   private String[] P0AQA5_A1296FacBarPar ;
   private byte[] P0AQA5_A1295FacBarReo ;
   private int[] P0AQA5_A1294FacBarCod ;
   private String[] P0AQA5_A432FacDsc ;
   private int[] P0AQA5_A446FacLin ;
   private GXSimpleCollection<String> AV28Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV31OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class buscardocumentofacturagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AQA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV51Facturacion_buscardocumentofacturads_1_tffaclin ,
                                          int AV52Facturacion_buscardocumentofacturads_2_tffaclin_to ,
                                          String AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                          String AV53Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                          int AV55Facturacion_buscardocumentofacturads_5_tffacbarcod ,
                                          int AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to ,
                                          byte AV57Facturacion_buscardocumentofacturads_7_tffacbarreo ,
                                          byte AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to ,
                                          String AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                          String AV59Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                          String AV62Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                          String AV61Facturacion_buscardocumentofacturads_11_tffacser ,
                                          String AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                          String AV63Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                          int AV65Facturacion_buscardocumentofacturads_15_tffoccolnum ,
                                          int AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to ,
                                          int A446FacLin ,
                                          String A432FacDsc ,
                                          int A1294FacBarCod ,
                                          byte A1295FacBarReo ,
                                          String A1296FacBarPar ,
                                          String A454FacSer ,
                                          String A3878FacColNom ,
                                          int A3879FocColNum ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          int A430FacCod ,
                                          int AV45Faccod ,
                                          long A427FacAlbCod ,
                                          long AV46FacALbCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[19];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, FacCod, FacAlbCod, FacDsc, FocColNum, FacColNom, FacSer, FacBarPar, FacBarReo, FacBarCod, FacLin FROM TXPLFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(FacCod = ?)");
      addWhere(sWhereString, "(FacAlbCod = ?)");
      if ( ! (0==AV51Facturacion_buscardocumentofacturads_1_tffaclin) )
      {
         addWhere(sWhereString, "(FacLin >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Facturacion_buscardocumentofacturads_2_tffaclin_to) )
      {
         addWhere(sWhereString, "(FacLin <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Facturacion_buscardocumentofacturads_3_tffacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FacDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV55Facturacion_buscardocumentofacturads_5_tffacbarcod) )
      {
         addWhere(sWhereString, "(FacBarCod >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to) )
      {
         addWhere(sWhereString, "(FacBarCod <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_buscardocumentofacturads_7_tffacbarreo) )
      {
         addWhere(sWhereString, "(FacBarReo >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to) )
      {
         addWhere(sWhereString, "(FacBarReo <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_buscardocumentofacturads_9_tffacbarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) )
      {
         addWhere(sWhereString, "(FacBarPar = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) && ( ! (GXutil.strcmp("", AV61Facturacion_buscardocumentofacturads_11_tffacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) )
      {
         addWhere(sWhereString, "(FacSer = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_buscardocumentofacturads_13_tffaccolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) )
      {
         addWhere(sWhereString, "(FacColNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV65Facturacion_buscardocumentofacturads_15_tffoccolnum) )
      {
         addWhere(sWhereString, "(FocColNum >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to) )
      {
         addWhere(sWhereString, "(FocColNum <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FacDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AQA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV51Facturacion_buscardocumentofacturads_1_tffaclin ,
                                          int AV52Facturacion_buscardocumentofacturads_2_tffaclin_to ,
                                          String AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                          String AV53Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                          int AV55Facturacion_buscardocumentofacturads_5_tffacbarcod ,
                                          int AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to ,
                                          byte AV57Facturacion_buscardocumentofacturads_7_tffacbarreo ,
                                          byte AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to ,
                                          String AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                          String AV59Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                          String AV62Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                          String AV61Facturacion_buscardocumentofacturads_11_tffacser ,
                                          String AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                          String AV63Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                          int AV65Facturacion_buscardocumentofacturads_15_tffoccolnum ,
                                          int AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to ,
                                          int A446FacLin ,
                                          String A432FacDsc ,
                                          int A1294FacBarCod ,
                                          byte A1295FacBarReo ,
                                          String A1296FacBarPar ,
                                          String A454FacSer ,
                                          String A3878FacColNom ,
                                          int A3879FocColNum ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          int A430FacCod ,
                                          int AV45Faccod ,
                                          long A427FacAlbCod ,
                                          long AV46FacALbCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[19];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, FacCod, FacAlbCod, FacBarPar, FocColNum, FacColNom, FacSer, FacBarReo, FacBarCod, FacDsc, FacLin FROM TXPLFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(FacCod = ?)");
      addWhere(sWhereString, "(FacAlbCod = ?)");
      if ( ! (0==AV51Facturacion_buscardocumentofacturads_1_tffaclin) )
      {
         addWhere(sWhereString, "(FacLin >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Facturacion_buscardocumentofacturads_2_tffaclin_to) )
      {
         addWhere(sWhereString, "(FacLin <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Facturacion_buscardocumentofacturads_3_tffacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FacDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV55Facturacion_buscardocumentofacturads_5_tffacbarcod) )
      {
         addWhere(sWhereString, "(FacBarCod >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to) )
      {
         addWhere(sWhereString, "(FacBarCod <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_buscardocumentofacturads_7_tffacbarreo) )
      {
         addWhere(sWhereString, "(FacBarReo >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to) )
      {
         addWhere(sWhereString, "(FacBarReo <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_buscardocumentofacturads_9_tffacbarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) )
      {
         addWhere(sWhereString, "(FacBarPar = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) && ( ! (GXutil.strcmp("", AV61Facturacion_buscardocumentofacturads_11_tffacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) )
      {
         addWhere(sWhereString, "(FacSer = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_buscardocumentofacturads_13_tffaccolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) )
      {
         addWhere(sWhereString, "(FacColNom = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV65Facturacion_buscardocumentofacturads_15_tffoccolnum) )
      {
         addWhere(sWhereString, "(FocColNum >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to) )
      {
         addWhere(sWhereString, "(FocColNum <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FacBarPar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AQA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV51Facturacion_buscardocumentofacturads_1_tffaclin ,
                                          int AV52Facturacion_buscardocumentofacturads_2_tffaclin_to ,
                                          String AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                          String AV53Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                          int AV55Facturacion_buscardocumentofacturads_5_tffacbarcod ,
                                          int AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to ,
                                          byte AV57Facturacion_buscardocumentofacturads_7_tffacbarreo ,
                                          byte AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to ,
                                          String AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                          String AV59Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                          String AV62Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                          String AV61Facturacion_buscardocumentofacturads_11_tffacser ,
                                          String AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                          String AV63Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                          int AV65Facturacion_buscardocumentofacturads_15_tffoccolnum ,
                                          int AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to ,
                                          int A446FacLin ,
                                          String A432FacDsc ,
                                          int A1294FacBarCod ,
                                          byte A1295FacBarReo ,
                                          String A1296FacBarPar ,
                                          String A454FacSer ,
                                          String A3878FacColNom ,
                                          int A3879FocColNum ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          int A430FacCod ,
                                          int AV45Faccod ,
                                          long A427FacAlbCod ,
                                          long AV46FacALbCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[19];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, FacCod, FacAlbCod, FacSer, FocColNum, FacColNom, FacBarPar, FacBarReo, FacBarCod, FacDsc, FacLin FROM TXPLFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(FacCod = ?)");
      addWhere(sWhereString, "(FacAlbCod = ?)");
      if ( ! (0==AV51Facturacion_buscardocumentofacturads_1_tffaclin) )
      {
         addWhere(sWhereString, "(FacLin >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Facturacion_buscardocumentofacturads_2_tffaclin_to) )
      {
         addWhere(sWhereString, "(FacLin <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Facturacion_buscardocumentofacturads_3_tffacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FacDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV55Facturacion_buscardocumentofacturads_5_tffacbarcod) )
      {
         addWhere(sWhereString, "(FacBarCod >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to) )
      {
         addWhere(sWhereString, "(FacBarCod <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_buscardocumentofacturads_7_tffacbarreo) )
      {
         addWhere(sWhereString, "(FacBarReo >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to) )
      {
         addWhere(sWhereString, "(FacBarReo <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_buscardocumentofacturads_9_tffacbarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) )
      {
         addWhere(sWhereString, "(FacBarPar = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) && ( ! (GXutil.strcmp("", AV61Facturacion_buscardocumentofacturads_11_tffacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) )
      {
         addWhere(sWhereString, "(FacSer = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_buscardocumentofacturads_13_tffaccolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) )
      {
         addWhere(sWhereString, "(FacColNom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV65Facturacion_buscardocumentofacturads_15_tffoccolnum) )
      {
         addWhere(sWhereString, "(FocColNum >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to) )
      {
         addWhere(sWhereString, "(FocColNum <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FacSer" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AQA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV51Facturacion_buscardocumentofacturads_1_tffaclin ,
                                          int AV52Facturacion_buscardocumentofacturads_2_tffaclin_to ,
                                          String AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel ,
                                          String AV53Facturacion_buscardocumentofacturads_3_tffacdsc ,
                                          int AV55Facturacion_buscardocumentofacturads_5_tffacbarcod ,
                                          int AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to ,
                                          byte AV57Facturacion_buscardocumentofacturads_7_tffacbarreo ,
                                          byte AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to ,
                                          String AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel ,
                                          String AV59Facturacion_buscardocumentofacturads_9_tffacbarpar ,
                                          String AV62Facturacion_buscardocumentofacturads_12_tffacser_sel ,
                                          String AV61Facturacion_buscardocumentofacturads_11_tffacser ,
                                          String AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel ,
                                          String AV63Facturacion_buscardocumentofacturads_13_tffaccolnom ,
                                          int AV65Facturacion_buscardocumentofacturads_15_tffoccolnum ,
                                          int AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to ,
                                          int A446FacLin ,
                                          String A432FacDsc ,
                                          int A1294FacBarCod ,
                                          byte A1295FacBarReo ,
                                          String A1296FacBarPar ,
                                          String A454FacSer ,
                                          String A3878FacColNom ,
                                          int A3879FocColNum ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          int A430FacCod ,
                                          int AV45Faccod ,
                                          long A427FacAlbCod ,
                                          long AV46FacALbCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[19];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, FacCod, FacAlbCod, FacColNom, FocColNum, FacSer, FacBarPar, FacBarReo, FacBarCod, FacDsc, FacLin FROM TXPLFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(FacCod = ?)");
      addWhere(sWhereString, "(FacAlbCod = ?)");
      if ( ! (0==AV51Facturacion_buscardocumentofacturads_1_tffaclin) )
      {
         addWhere(sWhereString, "(FacLin >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Facturacion_buscardocumentofacturads_2_tffaclin_to) )
      {
         addWhere(sWhereString, "(FacLin <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Facturacion_buscardocumentofacturads_3_tffacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Facturacion_buscardocumentofacturads_4_tffacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FacDsc = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV55Facturacion_buscardocumentofacturads_5_tffacbarcod) )
      {
         addWhere(sWhereString, "(FacBarCod >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_buscardocumentofacturads_6_tffacbarcod_to) )
      {
         addWhere(sWhereString, "(FacBarCod <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_buscardocumentofacturads_7_tffacbarreo) )
      {
         addWhere(sWhereString, "(FacBarReo >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV58Facturacion_buscardocumentofacturads_8_tffacbarreo_to) )
      {
         addWhere(sWhereString, "(FacBarReo <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) && ( ! (GXutil.strcmp("", AV59Facturacion_buscardocumentofacturads_9_tffacbarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_buscardocumentofacturads_10_tffacbarpar_sel)==0) )
      {
         addWhere(sWhereString, "(FacBarPar = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) && ( ! (GXutil.strcmp("", AV61Facturacion_buscardocumentofacturads_11_tffacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Facturacion_buscardocumentofacturads_12_tffacser_sel)==0) )
      {
         addWhere(sWhereString, "(FacSer = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_buscardocumentofacturads_13_tffaccolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FacColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_buscardocumentofacturads_14_tffaccolnom_sel)==0) )
      {
         addWhere(sWhereString, "(FacColNom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV65Facturacion_buscardocumentofacturads_15_tffoccolnum) )
      {
         addWhere(sWhereString, "(FocColNum >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Facturacion_buscardocumentofacturads_16_tffoccolnum_to) )
      {
         addWhere(sWhereString, "(FocColNum <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FacColNom" ;
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
                  return conditional_P0AQA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).longValue() , ((Number) dynConstraints[29]).longValue() );
            case 1 :
                  return conditional_P0AQA3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).longValue() , ((Number) dynConstraints[29]).longValue() );
            case 2 :
                  return conditional_P0AQA4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).longValue() , ((Number) dynConstraints[29]).longValue() );
            case 3 :
                  return conditional_P0AQA5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).longValue() , ((Number) dynConstraints[29]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((int[]) buf[10])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
      }
   }

}

