package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preciofase__wpgetfilterdata extends GXProcedure
{
   public preciofase__wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preciofase__wpgetfilterdata.class ), "" );
   }

   public preciofase__wpgetfilterdata( int remoteHandle ,
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
      preciofase__wpgetfilterdata.this.aP5 = new String[] {""};
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
      preciofase__wpgetfilterdata.this.AV38DDOName = aP0;
      preciofase__wpgetfilterdata.this.AV39SearchTxt = aP1;
      preciofase__wpgetfilterdata.this.AV40SearchTxtTo = aP2;
      preciofase__wpgetfilterdata.this.aP3 = aP3;
      preciofase__wpgetfilterdata.this.aP4 = aP4;
      preciofase__wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FASCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FASDSC") == 0 )
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
      AV41OptionsJson = AV28Options.toJSonString(false) ;
      AV42OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV31OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("Facturacion.PrecioFase__WPGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.PrecioFase__WPGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("Facturacion.PrecioFase__WPGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV10TFFasCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV11TFFasCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV12TFFasDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV13TFFasDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREMTR") == 0 )
         {
            AV14TFFasPreMtr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFFasPreMtr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREMT2") == 0 )
         {
            AV16TFFasPreMt2 = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFFasPreMt2_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREKGM") == 0 )
         {
            AV18TFFasPreKgm = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFFasPreKgm_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREFAC") == 0 )
         {
            AV20TFFasPreFAc = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREU_SEL") == 0 )
         {
            AV21TFFasPreU_Sel = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASPREKGF_SEL") == 0 )
         {
            AV22TFFasPreKgF_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGSENT_SEL") == 0 )
         {
            AV23TFFasKgsEnt_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGSMN") == 0 )
         {
            AV24TFFasKgsMn = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFFasKgsMn_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFFasCod = AV39SearchTxt ;
      AV11TFFasCod_Sel = "" ;
      AV48Facturacion_preciofase__wpds_1_tffascod = AV10TFFasCod ;
      AV49Facturacion_preciofase__wpds_2_tffascod_sel = AV11TFFasCod_Sel ;
      AV50Facturacion_preciofase__wpds_3_tffasdsc = AV12TFFasDsc ;
      AV51Facturacion_preciofase__wpds_4_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV52Facturacion_preciofase__wpds_5_tffaspremtr = AV14TFFasPreMtr ;
      AV53Facturacion_preciofase__wpds_6_tffaspremtr_to = AV15TFFasPreMtr_To ;
      AV54Facturacion_preciofase__wpds_7_tffaspremt2 = AV16TFFasPreMt2 ;
      AV55Facturacion_preciofase__wpds_8_tffaspremt2_to = AV17TFFasPreMt2_To ;
      AV56Facturacion_preciofase__wpds_9_tffasprekgm = AV18TFFasPreKgm ;
      AV57Facturacion_preciofase__wpds_10_tffasprekgm_to = AV19TFFasPreKgm_To ;
      AV58Facturacion_preciofase__wpds_11_tffasprefac = AV20TFFasPreFAc ;
      AV59Facturacion_preciofase__wpds_12_tffaspreu_sel = AV21TFFasPreU_Sel ;
      AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel = AV22TFFasPreKgF_Sel ;
      AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel = AV23TFFasKgsEnt_Sel ;
      AV62Facturacion_preciofase__wpds_15_tffaskgsmn = AV24TFFasKgsMn ;
      AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to = AV25TFFasKgsMn_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Facturacion_preciofase__wpds_2_tffascod_sel ,
                                           AV48Facturacion_preciofase__wpds_1_tffascod ,
                                           AV51Facturacion_preciofase__wpds_4_tffasdsc_sel ,
                                           AV50Facturacion_preciofase__wpds_3_tffasdsc ,
                                           AV52Facturacion_preciofase__wpds_5_tffaspremtr ,
                                           AV53Facturacion_preciofase__wpds_6_tffaspremtr_to ,
                                           AV54Facturacion_preciofase__wpds_7_tffaspremt2 ,
                                           AV55Facturacion_preciofase__wpds_8_tffaspremt2_to ,
                                           AV56Facturacion_preciofase__wpds_9_tffasprekgm ,
                                           AV57Facturacion_preciofase__wpds_10_tffasprekgm_to ,
                                           AV58Facturacion_preciofase__wpds_11_tffasprefac ,
                                           Byte.valueOf(AV59Facturacion_preciofase__wpds_12_tffaspreu_sel) ,
                                           AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel ,
                                           AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel ,
                                           AV62Facturacion_preciofase__wpds_15_tffaskgsmn ,
                                           AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A467FasPreMtr ,
                                           A12576FasPreMt2 ,
                                           A466FasPreKgm ,
                                           A4385FasPreFAc ,
                                           Byte.valueOf(A10882FasPreU) ,
                                           A12577FasPreKgF ,
                                           A13587FasKgsEnt ,
                                           A12704FasKgsMn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV48Facturacion_preciofase__wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV48Facturacion_preciofase__wpds_1_tffascod), 8, "%") ;
      lV50Facturacion_preciofase__wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV50Facturacion_preciofase__wpds_3_tffasdsc), 28, "%") ;
      /* Using cursor P0ALZ2 */
      pr_default.execute(0, new Object[] {lV48Facturacion_preciofase__wpds_1_tffascod, AV49Facturacion_preciofase__wpds_2_tffascod_sel, lV50Facturacion_preciofase__wpds_3_tffasdsc, AV51Facturacion_preciofase__wpds_4_tffasdsc_sel, AV52Facturacion_preciofase__wpds_5_tffaspremtr, AV53Facturacion_preciofase__wpds_6_tffaspremtr_to, AV54Facturacion_preciofase__wpds_7_tffaspremt2, AV55Facturacion_preciofase__wpds_8_tffaspremt2_to, AV56Facturacion_preciofase__wpds_9_tffasprekgm, AV57Facturacion_preciofase__wpds_10_tffasprekgm_to, AV58Facturacion_preciofase__wpds_11_tffasprefac, AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel, AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel, AV62Facturacion_preciofase__wpds_15_tffaskgsmn, AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkALZ2 = false ;
         A396EmprCod = P0ALZ2_A396EmprCod[0] ;
         A457FasCod = P0ALZ2_A457FasCod[0] ;
         A12704FasKgsMn = P0ALZ2_A12704FasKgsMn[0] ;
         n12704FasKgsMn = P0ALZ2_n12704FasKgsMn[0] ;
         A13587FasKgsEnt = P0ALZ2_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = P0ALZ2_n13587FasKgsEnt[0] ;
         A12577FasPreKgF = P0ALZ2_A12577FasPreKgF[0] ;
         n12577FasPreKgF = P0ALZ2_n12577FasPreKgF[0] ;
         A10882FasPreU = P0ALZ2_A10882FasPreU[0] ;
         n10882FasPreU = P0ALZ2_n10882FasPreU[0] ;
         A4385FasPreFAc = P0ALZ2_A4385FasPreFAc[0] ;
         n4385FasPreFAc = P0ALZ2_n4385FasPreFAc[0] ;
         A466FasPreKgm = P0ALZ2_A466FasPreKgm[0] ;
         n466FasPreKgm = P0ALZ2_n466FasPreKgm[0] ;
         A12576FasPreMt2 = P0ALZ2_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = P0ALZ2_n12576FasPreMt2[0] ;
         A467FasPreMtr = P0ALZ2_A467FasPreMtr[0] ;
         n467FasPreMtr = P0ALZ2_n467FasPreMtr[0] ;
         A460FasDsc = P0ALZ2_A460FasDsc[0] ;
         A252CliCod = P0ALZ2_A252CliCod[0] ;
         A460FasDsc = P0ALZ2_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ALZ2_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkALZ2 = false ;
            A396EmprCod = P0ALZ2_A396EmprCod[0] ;
            A252CliCod = P0ALZ2_A252CliCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brkALZ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV27Option = A457FasCod ;
            AV29OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV28Options.add(AV27Option, 0);
            AV30OptionsDesc.add(AV29OptionDesc, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALZ2 )
         {
            brkALZ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasDsc = AV39SearchTxt ;
      AV13TFFasDsc_Sel = "" ;
      AV48Facturacion_preciofase__wpds_1_tffascod = AV10TFFasCod ;
      AV49Facturacion_preciofase__wpds_2_tffascod_sel = AV11TFFasCod_Sel ;
      AV50Facturacion_preciofase__wpds_3_tffasdsc = AV12TFFasDsc ;
      AV51Facturacion_preciofase__wpds_4_tffasdsc_sel = AV13TFFasDsc_Sel ;
      AV52Facturacion_preciofase__wpds_5_tffaspremtr = AV14TFFasPreMtr ;
      AV53Facturacion_preciofase__wpds_6_tffaspremtr_to = AV15TFFasPreMtr_To ;
      AV54Facturacion_preciofase__wpds_7_tffaspremt2 = AV16TFFasPreMt2 ;
      AV55Facturacion_preciofase__wpds_8_tffaspremt2_to = AV17TFFasPreMt2_To ;
      AV56Facturacion_preciofase__wpds_9_tffasprekgm = AV18TFFasPreKgm ;
      AV57Facturacion_preciofase__wpds_10_tffasprekgm_to = AV19TFFasPreKgm_To ;
      AV58Facturacion_preciofase__wpds_11_tffasprefac = AV20TFFasPreFAc ;
      AV59Facturacion_preciofase__wpds_12_tffaspreu_sel = AV21TFFasPreU_Sel ;
      AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel = AV22TFFasPreKgF_Sel ;
      AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel = AV23TFFasKgsEnt_Sel ;
      AV62Facturacion_preciofase__wpds_15_tffaskgsmn = AV24TFFasKgsMn ;
      AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to = AV25TFFasKgsMn_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV49Facturacion_preciofase__wpds_2_tffascod_sel ,
                                           AV48Facturacion_preciofase__wpds_1_tffascod ,
                                           AV51Facturacion_preciofase__wpds_4_tffasdsc_sel ,
                                           AV50Facturacion_preciofase__wpds_3_tffasdsc ,
                                           AV52Facturacion_preciofase__wpds_5_tffaspremtr ,
                                           AV53Facturacion_preciofase__wpds_6_tffaspremtr_to ,
                                           AV54Facturacion_preciofase__wpds_7_tffaspremt2 ,
                                           AV55Facturacion_preciofase__wpds_8_tffaspremt2_to ,
                                           AV56Facturacion_preciofase__wpds_9_tffasprekgm ,
                                           AV57Facturacion_preciofase__wpds_10_tffasprekgm_to ,
                                           AV58Facturacion_preciofase__wpds_11_tffasprefac ,
                                           Byte.valueOf(AV59Facturacion_preciofase__wpds_12_tffaspreu_sel) ,
                                           AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel ,
                                           AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel ,
                                           AV62Facturacion_preciofase__wpds_15_tffaskgsmn ,
                                           AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A467FasPreMtr ,
                                           A12576FasPreMt2 ,
                                           A466FasPreKgm ,
                                           A4385FasPreFAc ,
                                           Byte.valueOf(A10882FasPreU) ,
                                           A12577FasPreKgF ,
                                           A13587FasKgsEnt ,
                                           A12704FasKgsMn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV48Facturacion_preciofase__wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV48Facturacion_preciofase__wpds_1_tffascod), 8, "%") ;
      lV50Facturacion_preciofase__wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV50Facturacion_preciofase__wpds_3_tffasdsc), 28, "%") ;
      /* Using cursor P0ALZ3 */
      pr_default.execute(1, new Object[] {lV48Facturacion_preciofase__wpds_1_tffascod, AV49Facturacion_preciofase__wpds_2_tffascod_sel, lV50Facturacion_preciofase__wpds_3_tffasdsc, AV51Facturacion_preciofase__wpds_4_tffasdsc_sel, AV52Facturacion_preciofase__wpds_5_tffaspremtr, AV53Facturacion_preciofase__wpds_6_tffaspremtr_to, AV54Facturacion_preciofase__wpds_7_tffaspremt2, AV55Facturacion_preciofase__wpds_8_tffaspremt2_to, AV56Facturacion_preciofase__wpds_9_tffasprekgm, AV57Facturacion_preciofase__wpds_10_tffasprekgm_to, AV58Facturacion_preciofase__wpds_11_tffasprefac, AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel, AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel, AV62Facturacion_preciofase__wpds_15_tffaskgsmn, AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkALZ4 = false ;
         A457FasCod = P0ALZ3_A457FasCod[0] ;
         A396EmprCod = P0ALZ3_A396EmprCod[0] ;
         A12704FasKgsMn = P0ALZ3_A12704FasKgsMn[0] ;
         n12704FasKgsMn = P0ALZ3_n12704FasKgsMn[0] ;
         A13587FasKgsEnt = P0ALZ3_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = P0ALZ3_n13587FasKgsEnt[0] ;
         A12577FasPreKgF = P0ALZ3_A12577FasPreKgF[0] ;
         n12577FasPreKgF = P0ALZ3_n12577FasPreKgF[0] ;
         A10882FasPreU = P0ALZ3_A10882FasPreU[0] ;
         n10882FasPreU = P0ALZ3_n10882FasPreU[0] ;
         A4385FasPreFAc = P0ALZ3_A4385FasPreFAc[0] ;
         n4385FasPreFAc = P0ALZ3_n4385FasPreFAc[0] ;
         A466FasPreKgm = P0ALZ3_A466FasPreKgm[0] ;
         n466FasPreKgm = P0ALZ3_n466FasPreKgm[0] ;
         A12576FasPreMt2 = P0ALZ3_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = P0ALZ3_n12576FasPreMt2[0] ;
         A467FasPreMtr = P0ALZ3_A467FasPreMtr[0] ;
         n467FasPreMtr = P0ALZ3_n467FasPreMtr[0] ;
         A460FasDsc = P0ALZ3_A460FasDsc[0] ;
         A252CliCod = P0ALZ3_A252CliCod[0] ;
         A460FasDsc = P0ALZ3_A460FasDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ALZ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ALZ3_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkALZ4 = false ;
            A252CliCod = P0ALZ3_A252CliCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brkALZ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV27Option = A460FasDsc ;
            AV26InsertIndex = 1 ;
            while ( ( AV26InsertIndex <= AV28Options.size() ) && ( GXutil.strcmp((String)AV28Options.elementAt(-1+AV26InsertIndex), AV27Option) < 0 ) )
            {
               AV26InsertIndex = (int)(AV26InsertIndex+1) ;
            }
            AV28Options.add(AV27Option, AV26InsertIndex);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV26InsertIndex);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALZ4 )
         {
            brkALZ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = preciofase__wpgetfilterdata.this.AV41OptionsJson;
      this.aP4[0] = preciofase__wpgetfilterdata.this.AV42OptionsDescJson;
      this.aP5[0] = preciofase__wpgetfilterdata.this.AV43OptionIndexesJson;
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
      AV10TFFasCod = "" ;
      AV11TFFasCod_Sel = "" ;
      AV12TFFasDsc = "" ;
      AV13TFFasDsc_Sel = "" ;
      AV14TFFasPreMtr = DecimalUtil.ZERO ;
      AV15TFFasPreMtr_To = DecimalUtil.ZERO ;
      AV16TFFasPreMt2 = DecimalUtil.ZERO ;
      AV17TFFasPreMt2_To = DecimalUtil.ZERO ;
      AV18TFFasPreKgm = DecimalUtil.ZERO ;
      AV19TFFasPreKgm_To = DecimalUtil.ZERO ;
      AV20TFFasPreFAc = GXutil.nullDate() ;
      AV22TFFasPreKgF_Sel = "" ;
      AV23TFFasKgsEnt_Sel = "" ;
      AV24TFFasKgsMn = DecimalUtil.ZERO ;
      AV25TFFasKgsMn_To = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      AV48Facturacion_preciofase__wpds_1_tffascod = "" ;
      AV49Facturacion_preciofase__wpds_2_tffascod_sel = "" ;
      AV50Facturacion_preciofase__wpds_3_tffasdsc = "" ;
      AV51Facturacion_preciofase__wpds_4_tffasdsc_sel = "" ;
      AV52Facturacion_preciofase__wpds_5_tffaspremtr = DecimalUtil.ZERO ;
      AV53Facturacion_preciofase__wpds_6_tffaspremtr_to = DecimalUtil.ZERO ;
      AV54Facturacion_preciofase__wpds_7_tffaspremt2 = DecimalUtil.ZERO ;
      AV55Facturacion_preciofase__wpds_8_tffaspremt2_to = DecimalUtil.ZERO ;
      AV56Facturacion_preciofase__wpds_9_tffasprekgm = DecimalUtil.ZERO ;
      AV57Facturacion_preciofase__wpds_10_tffasprekgm_to = DecimalUtil.ZERO ;
      AV58Facturacion_preciofase__wpds_11_tffasprefac = GXutil.nullDate() ;
      AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel = "" ;
      AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel = "" ;
      AV62Facturacion_preciofase__wpds_15_tffaskgsmn = DecimalUtil.ZERO ;
      AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV48Facturacion_preciofase__wpds_1_tffascod = "" ;
      lV50Facturacion_preciofase__wpds_3_tffasdsc = "" ;
      A460FasDsc = "" ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A12577FasPreKgF = "" ;
      A13587FasKgsEnt = "" ;
      A12704FasKgsMn = DecimalUtil.ZERO ;
      P0ALZ2_A396EmprCod = new String[] {""} ;
      P0ALZ2_A457FasCod = new String[] {""} ;
      P0ALZ2_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALZ2_n12704FasKgsMn = new boolean[] {false} ;
      P0ALZ2_A13587FasKgsEnt = new String[] {""} ;
      P0ALZ2_n13587FasKgsEnt = new boolean[] {false} ;
      P0ALZ2_A12577FasPreKgF = new String[] {""} ;
      P0ALZ2_n12577FasPreKgF = new boolean[] {false} ;
      P0ALZ2_A10882FasPreU = new byte[1] ;
      P0ALZ2_n10882FasPreU = new boolean[] {false} ;
      P0ALZ2_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      P0ALZ2_n4385FasPreFAc = new boolean[] {false} ;
      P0ALZ2_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALZ2_n466FasPreKgm = new boolean[] {false} ;
      P0ALZ2_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALZ2_n12576FasPreMt2 = new boolean[] {false} ;
      P0ALZ2_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALZ2_n467FasPreMtr = new boolean[] {false} ;
      P0ALZ2_A460FasDsc = new String[] {""} ;
      P0ALZ2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV27Option = "" ;
      AV29OptionDesc = "" ;
      P0ALZ3_A457FasCod = new String[] {""} ;
      P0ALZ3_A396EmprCod = new String[] {""} ;
      P0ALZ3_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALZ3_n12704FasKgsMn = new boolean[] {false} ;
      P0ALZ3_A13587FasKgsEnt = new String[] {""} ;
      P0ALZ3_n13587FasKgsEnt = new boolean[] {false} ;
      P0ALZ3_A12577FasPreKgF = new String[] {""} ;
      P0ALZ3_n12577FasPreKgF = new boolean[] {false} ;
      P0ALZ3_A10882FasPreU = new byte[1] ;
      P0ALZ3_n10882FasPreU = new boolean[] {false} ;
      P0ALZ3_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      P0ALZ3_n4385FasPreFAc = new boolean[] {false} ;
      P0ALZ3_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALZ3_n466FasPreKgm = new boolean[] {false} ;
      P0ALZ3_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALZ3_n12576FasPreMt2 = new boolean[] {false} ;
      P0ALZ3_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALZ3_n467FasPreMtr = new boolean[] {false} ;
      P0ALZ3_A460FasDsc = new String[] {""} ;
      P0ALZ3_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.preciofase__wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ALZ2_A396EmprCod, P0ALZ2_A457FasCod, P0ALZ2_A12704FasKgsMn, P0ALZ2_n12704FasKgsMn, P0ALZ2_A13587FasKgsEnt, P0ALZ2_n13587FasKgsEnt, P0ALZ2_A12577FasPreKgF, P0ALZ2_n12577FasPreKgF, P0ALZ2_A10882FasPreU, P0ALZ2_n10882FasPreU,
            P0ALZ2_A4385FasPreFAc, P0ALZ2_n4385FasPreFAc, P0ALZ2_A466FasPreKgm, P0ALZ2_n466FasPreKgm, P0ALZ2_A12576FasPreMt2, P0ALZ2_n12576FasPreMt2, P0ALZ2_A467FasPreMtr, P0ALZ2_n467FasPreMtr, P0ALZ2_A460FasDsc, P0ALZ2_A252CliCod
            }
            , new Object[] {
            P0ALZ3_A457FasCod, P0ALZ3_A396EmprCod, P0ALZ3_A12704FasKgsMn, P0ALZ3_n12704FasKgsMn, P0ALZ3_A13587FasKgsEnt, P0ALZ3_n13587FasKgsEnt, P0ALZ3_A12577FasPreKgF, P0ALZ3_n12577FasPreKgF, P0ALZ3_A10882FasPreU, P0ALZ3_n10882FasPreU,
            P0ALZ3_A4385FasPreFAc, P0ALZ3_n4385FasPreFAc, P0ALZ3_A466FasPreKgm, P0ALZ3_n466FasPreKgm, P0ALZ3_A12576FasPreMt2, P0ALZ3_n12576FasPreMt2, P0ALZ3_A467FasPreMtr, P0ALZ3_n467FasPreMtr, P0ALZ3_A460FasDsc, P0ALZ3_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21TFFasPreU_Sel ;
   private byte AV59Facturacion_preciofase__wpds_12_tffaspreu_sel ;
   private byte A10882FasPreU ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private int A252CliCod ;
   private int AV26InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV14TFFasPreMtr ;
   private java.math.BigDecimal AV15TFFasPreMtr_To ;
   private java.math.BigDecimal AV16TFFasPreMt2 ;
   private java.math.BigDecimal AV17TFFasPreMt2_To ;
   private java.math.BigDecimal AV18TFFasPreKgm ;
   private java.math.BigDecimal AV19TFFasPreKgm_To ;
   private java.math.BigDecimal AV24TFFasKgsMn ;
   private java.math.BigDecimal AV25TFFasKgsMn_To ;
   private java.math.BigDecimal AV52Facturacion_preciofase__wpds_5_tffaspremtr ;
   private java.math.BigDecimal AV53Facturacion_preciofase__wpds_6_tffaspremtr_to ;
   private java.math.BigDecimal AV54Facturacion_preciofase__wpds_7_tffaspremt2 ;
   private java.math.BigDecimal AV55Facturacion_preciofase__wpds_8_tffaspremt2_to ;
   private java.math.BigDecimal AV56Facturacion_preciofase__wpds_9_tffasprekgm ;
   private java.math.BigDecimal AV57Facturacion_preciofase__wpds_10_tffasprekgm_to ;
   private java.math.BigDecimal AV62Facturacion_preciofase__wpds_15_tffaskgsmn ;
   private java.math.BigDecimal AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A12704FasKgsMn ;
   private String AV10TFFasCod ;
   private String AV11TFFasCod_Sel ;
   private String AV12TFFasDsc ;
   private String AV13TFFasDsc_Sel ;
   private String AV22TFFasPreKgF_Sel ;
   private String AV23TFFasKgsEnt_Sel ;
   private String A457FasCod ;
   private String AV48Facturacion_preciofase__wpds_1_tffascod ;
   private String AV49Facturacion_preciofase__wpds_2_tffascod_sel ;
   private String AV50Facturacion_preciofase__wpds_3_tffasdsc ;
   private String AV51Facturacion_preciofase__wpds_4_tffasdsc_sel ;
   private String AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel ;
   private String AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel ;
   private String scmdbuf ;
   private String lV48Facturacion_preciofase__wpds_1_tffascod ;
   private String lV50Facturacion_preciofase__wpds_3_tffasdsc ;
   private String A460FasDsc ;
   private String A12577FasPreKgF ;
   private String A13587FasKgsEnt ;
   private String A396EmprCod ;
   private java.util.Date AV20TFFasPreFAc ;
   private java.util.Date AV58Facturacion_preciofase__wpds_11_tffasprefac ;
   private java.util.Date A4385FasPreFAc ;
   private boolean returnInSub ;
   private boolean brkALZ2 ;
   private boolean n12704FasKgsMn ;
   private boolean n13587FasKgsEnt ;
   private boolean n12577FasPreKgF ;
   private boolean n10882FasPreU ;
   private boolean n4385FasPreFAc ;
   private boolean n466FasPreKgm ;
   private boolean n12576FasPreMt2 ;
   private boolean n467FasPreMtr ;
   private boolean brkALZ4 ;
   private String AV41OptionsJson ;
   private String AV42OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV39SearchTxt ;
   private String AV40SearchTxtTo ;
   private String AV27Option ;
   private String AV29OptionDesc ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALZ2_A396EmprCod ;
   private String[] P0ALZ2_A457FasCod ;
   private java.math.BigDecimal[] P0ALZ2_A12704FasKgsMn ;
   private boolean[] P0ALZ2_n12704FasKgsMn ;
   private String[] P0ALZ2_A13587FasKgsEnt ;
   private boolean[] P0ALZ2_n13587FasKgsEnt ;
   private String[] P0ALZ2_A12577FasPreKgF ;
   private boolean[] P0ALZ2_n12577FasPreKgF ;
   private byte[] P0ALZ2_A10882FasPreU ;
   private boolean[] P0ALZ2_n10882FasPreU ;
   private java.util.Date[] P0ALZ2_A4385FasPreFAc ;
   private boolean[] P0ALZ2_n4385FasPreFAc ;
   private java.math.BigDecimal[] P0ALZ2_A466FasPreKgm ;
   private boolean[] P0ALZ2_n466FasPreKgm ;
   private java.math.BigDecimal[] P0ALZ2_A12576FasPreMt2 ;
   private boolean[] P0ALZ2_n12576FasPreMt2 ;
   private java.math.BigDecimal[] P0ALZ2_A467FasPreMtr ;
   private boolean[] P0ALZ2_n467FasPreMtr ;
   private String[] P0ALZ2_A460FasDsc ;
   private int[] P0ALZ2_A252CliCod ;
   private String[] P0ALZ3_A457FasCod ;
   private String[] P0ALZ3_A396EmprCod ;
   private java.math.BigDecimal[] P0ALZ3_A12704FasKgsMn ;
   private boolean[] P0ALZ3_n12704FasKgsMn ;
   private String[] P0ALZ3_A13587FasKgsEnt ;
   private boolean[] P0ALZ3_n13587FasKgsEnt ;
   private String[] P0ALZ3_A12577FasPreKgF ;
   private boolean[] P0ALZ3_n12577FasPreKgF ;
   private byte[] P0ALZ3_A10882FasPreU ;
   private boolean[] P0ALZ3_n10882FasPreU ;
   private java.util.Date[] P0ALZ3_A4385FasPreFAc ;
   private boolean[] P0ALZ3_n4385FasPreFAc ;
   private java.math.BigDecimal[] P0ALZ3_A466FasPreKgm ;
   private boolean[] P0ALZ3_n466FasPreKgm ;
   private java.math.BigDecimal[] P0ALZ3_A12576FasPreMt2 ;
   private boolean[] P0ALZ3_n12576FasPreMt2 ;
   private java.math.BigDecimal[] P0ALZ3_A467FasPreMtr ;
   private boolean[] P0ALZ3_n467FasPreMtr ;
   private String[] P0ALZ3_A460FasDsc ;
   private int[] P0ALZ3_A252CliCod ;
   private GXSimpleCollection<String> AV28Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV31OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class preciofase__wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ALZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Facturacion_preciofase__wpds_2_tffascod_sel ,
                                          String AV48Facturacion_preciofase__wpds_1_tffascod ,
                                          String AV51Facturacion_preciofase__wpds_4_tffasdsc_sel ,
                                          String AV50Facturacion_preciofase__wpds_3_tffasdsc ,
                                          java.math.BigDecimal AV52Facturacion_preciofase__wpds_5_tffaspremtr ,
                                          java.math.BigDecimal AV53Facturacion_preciofase__wpds_6_tffaspremtr_to ,
                                          java.math.BigDecimal AV54Facturacion_preciofase__wpds_7_tffaspremt2 ,
                                          java.math.BigDecimal AV55Facturacion_preciofase__wpds_8_tffaspremt2_to ,
                                          java.math.BigDecimal AV56Facturacion_preciofase__wpds_9_tffasprekgm ,
                                          java.math.BigDecimal AV57Facturacion_preciofase__wpds_10_tffasprekgm_to ,
                                          java.util.Date AV58Facturacion_preciofase__wpds_11_tffasprefac ,
                                          byte AV59Facturacion_preciofase__wpds_12_tffaspreu_sel ,
                                          String AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel ,
                                          String AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel ,
                                          java.math.BigDecimal AV62Facturacion_preciofase__wpds_15_tffaskgsmn ,
                                          java.math.BigDecimal AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A467FasPreMtr ,
                                          java.math.BigDecimal A12576FasPreMt2 ,
                                          java.math.BigDecimal A466FasPreKgm ,
                                          java.util.Date A4385FasPreFAc ,
                                          byte A10882FasPreU ,
                                          String A12577FasPreKgF ,
                                          String A13587FasKgsEnt ,
                                          java.math.BigDecimal A12704FasKgsMn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.FasKgsMn, T1.FasKgsEnt, T1.FasPreKgF, T1.FasPreU, T1.FasPreFAc, T1.FasPreKgm, T1.FasPreMt2, T1.FasPreMtr, T2.FasDsc, T1.CliCod FROM" ;
      scmdbuf += " (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      if ( (GXutil.strcmp("", AV49Facturacion_preciofase__wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV48Facturacion_preciofase__wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Facturacion_preciofase__wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Facturacion_preciofase__wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Facturacion_preciofase__wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Facturacion_preciofase__wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Facturacion_preciofase__wpds_5_tffaspremtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMtr >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Facturacion_preciofase__wpds_6_tffaspremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMtr <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Facturacion_preciofase__wpds_7_tffaspremt2)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMt2 >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Facturacion_preciofase__wpds_8_tffaspremt2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMt2 <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Facturacion_preciofase__wpds_9_tffasprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgm >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Facturacion_preciofase__wpds_10_tffasprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgm <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Facturacion_preciofase__wpds_11_tffasprefac)) )
      {
         addWhere(sWhereString, "(T1.FasPreFAc >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( AV59Facturacion_preciofase__wpds_12_tffaspreu_sel == 1 )
      {
         addWhere(sWhereString, "(T1.FasPreU = 1)");
      }
      if ( AV59Facturacion_preciofase__wpds_12_tffaspreu_sel == 2 )
      {
         addWhere(sWhereString, "(T1.FasPreU = 0)");
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgF = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsEnt = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Facturacion_preciofase__wpds_15_tffaskgsmn)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsMn >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsMn <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ALZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Facturacion_preciofase__wpds_2_tffascod_sel ,
                                          String AV48Facturacion_preciofase__wpds_1_tffascod ,
                                          String AV51Facturacion_preciofase__wpds_4_tffasdsc_sel ,
                                          String AV50Facturacion_preciofase__wpds_3_tffasdsc ,
                                          java.math.BigDecimal AV52Facturacion_preciofase__wpds_5_tffaspremtr ,
                                          java.math.BigDecimal AV53Facturacion_preciofase__wpds_6_tffaspremtr_to ,
                                          java.math.BigDecimal AV54Facturacion_preciofase__wpds_7_tffaspremt2 ,
                                          java.math.BigDecimal AV55Facturacion_preciofase__wpds_8_tffaspremt2_to ,
                                          java.math.BigDecimal AV56Facturacion_preciofase__wpds_9_tffasprekgm ,
                                          java.math.BigDecimal AV57Facturacion_preciofase__wpds_10_tffasprekgm_to ,
                                          java.util.Date AV58Facturacion_preciofase__wpds_11_tffasprefac ,
                                          byte AV59Facturacion_preciofase__wpds_12_tffaspreu_sel ,
                                          String AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel ,
                                          String AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel ,
                                          java.math.BigDecimal AV62Facturacion_preciofase__wpds_15_tffaskgsmn ,
                                          java.math.BigDecimal AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A467FasPreMtr ,
                                          java.math.BigDecimal A12576FasPreMt2 ,
                                          java.math.BigDecimal A466FasPreKgm ,
                                          java.util.Date A4385FasPreFAc ,
                                          byte A10882FasPreU ,
                                          String A12577FasPreKgF ,
                                          String A13587FasKgsEnt ,
                                          java.math.BigDecimal A12704FasKgsMn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[15];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.FasCod, T1.EmprCod, T1.FasKgsMn, T1.FasKgsEnt, T1.FasPreKgF, T1.FasPreU, T1.FasPreFAc, T1.FasPreKgm, T1.FasPreMt2, T1.FasPreMtr, T2.FasDsc, T1.CliCod FROM" ;
      scmdbuf += " (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      if ( (GXutil.strcmp("", AV49Facturacion_preciofase__wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV48Facturacion_preciofase__wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Facturacion_preciofase__wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Facturacion_preciofase__wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Facturacion_preciofase__wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Facturacion_preciofase__wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Facturacion_preciofase__wpds_5_tffaspremtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMtr >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Facturacion_preciofase__wpds_6_tffaspremtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMtr <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Facturacion_preciofase__wpds_7_tffaspremt2)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMt2 >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Facturacion_preciofase__wpds_8_tffaspremt2_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreMt2 <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Facturacion_preciofase__wpds_9_tffasprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgm >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Facturacion_preciofase__wpds_10_tffasprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgm <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Facturacion_preciofase__wpds_11_tffasprefac)) )
      {
         addWhere(sWhereString, "(T1.FasPreFAc >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( AV59Facturacion_preciofase__wpds_12_tffaspreu_sel == 1 )
      {
         addWhere(sWhereString, "(T1.FasPreU = 1)");
      }
      if ( AV59Facturacion_preciofase__wpds_12_tffaspreu_sel == 2 )
      {
         addWhere(sWhereString, "(T1.FasPreU = 0)");
      }
      if ( ! (GXutil.strcmp("", AV60Facturacion_preciofase__wpds_13_tffasprekgf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasPreKgF = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Facturacion_preciofase__wpds_14_tffaskgsent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsEnt = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Facturacion_preciofase__wpds_15_tffaskgsmn)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsMn >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Facturacion_preciofase__wpds_16_tffaskgsmn_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgsMn <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
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
                  return conditional_P0ALZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] );
            case 1 :
                  return conditional_P0ALZ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ALZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 28);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 28);
               ((int[]) buf[19])[0] = rslt.getInt(12);
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
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 28);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 28);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 28);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 28);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               return;
      }
   }

}

