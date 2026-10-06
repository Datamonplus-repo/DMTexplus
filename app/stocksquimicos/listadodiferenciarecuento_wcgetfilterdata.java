package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodiferenciarecuento_wcgetfilterdata extends GXProcedure
{
   public listadodiferenciarecuento_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodiferenciarecuento_wcgetfilterdata.class ), "" );
   }

   public listadodiferenciarecuento_wcgetfilterdata( int remoteHandle ,
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
      listadodiferenciarecuento_wcgetfilterdata.this.aP5 = new String[] {""};
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
      listadodiferenciarecuento_wcgetfilterdata.this.AV24DDOName = aP0;
      listadodiferenciarecuento_wcgetfilterdata.this.AV22SearchTxt = aP1;
      listadodiferenciarecuento_wcgetfilterdata.this.AV23SearchTxtTo = aP2;
      listadodiferenciarecuento_wcgetfilterdata.this.aP3 = aP3;
      listadodiferenciarecuento_wcgetfilterdata.this.aP4 = aP4;
      listadodiferenciarecuento_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
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
      if ( GXutil.strcmp(AV35Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadoDiferenciaRecuento_WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCGridState"), null, null);
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV10TFRecFec = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV12TFRechora = localUtil.ctot( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV14TFPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV15TFPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV16TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV17TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV18TFRecExiTeo = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFRecExiTeo_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV20TFRecExiRea = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFRecExiRea_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPREREC") == 0 )
         {
            AV46TFRecPreRec = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFRecPreRec_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFALMACEN") == 0 )
         {
            AV48TFDifAlmacen = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFDifAlmacen_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFALMPOR") == 0 )
         {
            AV50TFDifAlmPor = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFDifAlmPor_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV42recfec = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV43prdnumfrom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV44prdnumto = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DESVIOS") == 0 )
         {
            AV45desvios = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNum = AV22SearchTxt ;
      AV15TFPrdNum_Sel = "" ;
      AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV40FilterFullText ;
      AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV10TFRecFec ;
      AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV12TFRechora ;
      AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV14TFPrdNum ;
      AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV16TFPrdNom ;
      AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV18TFRecExiTeo ;
      AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV19TFRecExiTeo_To ;
      AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV20TFRecExiRea ;
      AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV21TFRecExiRea_To ;
      AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV46TFRecPreRec ;
      AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV47TFRecPreRec_To ;
      AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV48TFDifAlmacen ;
      AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV49TFDifAlmacen_To ;
      AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV50TFDifAlmPor ;
      AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV51TFDifAlmPor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                           AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                           AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                           AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                           AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                           AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                           AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                           AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                           AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                           AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                           AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                           AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                           AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                           AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                           AV42recfec ,
                                           AV43prdnumfrom ,
                                           AV44prdnumto ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                           A14034DifAlmacen ,
                                           A14377DifAlmPor ,
                                           AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                           AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                           AV45desvios ,
                                           AV41emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum), 6, "%") ;
      lV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor P09IY2 */
      pr_default.execute(0, new Object[] {AV41emprcod, AV45desvios, AV45desvios, AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec, AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora, lV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum, AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel, lV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom, AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel, AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo, AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to, AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea, AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to, AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec, AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to, AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen, AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to, AV42recfec, AV43prdnumfrom, AV44prdnumto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9IY2 = false ;
         A396EmprCod = P09IY2_A396EmprCod[0] ;
         A719PrdNum = P09IY2_A719PrdNum[0] ;
         A14034DifAlmacen = P09IY2_A14034DifAlmacen[0] ;
         A6573RecPreRec = P09IY2_A6573RecPreRec[0] ;
         A718PrdNom = P09IY2_A718PrdNom[0] ;
         A13455Rechora = P09IY2_A13455Rechora[0] ;
         A810RecFec = P09IY2_A810RecFec[0] ;
         A807RecExiRea = P09IY2_A807RecExiRea[0] ;
         A809RecExiTeo = P09IY2_A809RecExiTeo[0] ;
         A718PrdNom = P09IY2_A718PrdNom[0] ;
         GXt_decimal2 = A14377DifAlmPor ;
         GXv_decimal3[0] = GXt_decimal2 ;
         new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal3) ;
         listadodiferenciarecuento_wcgetfilterdata.this.GXt_decimal2 = GXv_decimal3[0] ;
         A14377DifAlmPor = GXt_decimal2 ;
         if ( (GXutil.strcmp("", AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A809RecExiTeo, 12, 4) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A807RecExiRea, 12, 4) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6573RecPreRec, 14, 5) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14034DifAlmacen, 12, 4) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14377DifAlmPor, 7, 2) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to) <= 0 ) ) )
               {
                  AV34count = 0 ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09IY2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09IY2_A719PrdNum[0], A719PrdNum) == 0 ) )
                  {
                     brk9IY2 = false ;
                     A810RecFec = P09IY2_A810RecFec[0] ;
                     AV34count = (long)(AV34count+1) ;
                     brk9IY2 = true ;
                     pr_default.readNext(0);
                  }
                  if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
                  {
                     AV26Option = A719PrdNum ;
                     AV27Options.add(AV26Option, 0);
                     AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV27Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9IY2 )
         {
            brk9IY2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdNom = AV22SearchTxt ;
      AV17TFPrdNom_Sel = "" ;
      AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV40FilterFullText ;
      AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV10TFRecFec ;
      AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV12TFRechora ;
      AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV14TFPrdNum ;
      AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV16TFPrdNom ;
      AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV18TFRecExiTeo ;
      AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV19TFRecExiTeo_To ;
      AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV20TFRecExiRea ;
      AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV21TFRecExiRea_To ;
      AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV46TFRecPreRec ;
      AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV47TFRecPreRec_To ;
      AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV48TFDifAlmacen ;
      AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV49TFDifAlmacen_To ;
      AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV50TFDifAlmPor ;
      AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV51TFDifAlmPor_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                           AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                           AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                           AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                           AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                           AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                           AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                           AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                           AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                           AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                           AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                           AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                           AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                           AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                           AV42recfec ,
                                           AV43prdnumfrom ,
                                           AV44prdnumto ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                           A14034DifAlmacen ,
                                           A14377DifAlmPor ,
                                           AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                           AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                           AV45desvios ,
                                           AV41emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum), 6, "%") ;
      lV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor P09IY3 */
      pr_default.execute(1, new Object[] {AV41emprcod, AV45desvios, AV45desvios, AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec, AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora, lV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum, AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel, lV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom, AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel, AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo, AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to, AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea, AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to, AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec, AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to, AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen, AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to, AV42recfec, AV43prdnumfrom, AV44prdnumto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9IY4 = false ;
         A719PrdNum = P09IY3_A719PrdNum[0] ;
         A396EmprCod = P09IY3_A396EmprCod[0] ;
         A14034DifAlmacen = P09IY3_A14034DifAlmacen[0] ;
         A6573RecPreRec = P09IY3_A6573RecPreRec[0] ;
         A718PrdNom = P09IY3_A718PrdNom[0] ;
         A13455Rechora = P09IY3_A13455Rechora[0] ;
         A810RecFec = P09IY3_A810RecFec[0] ;
         A807RecExiRea = P09IY3_A807RecExiRea[0] ;
         A809RecExiTeo = P09IY3_A809RecExiTeo[0] ;
         A718PrdNom = P09IY3_A718PrdNom[0] ;
         GXt_decimal2 = A14377DifAlmPor ;
         GXv_decimal3[0] = GXt_decimal2 ;
         new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal3) ;
         listadodiferenciarecuento_wcgetfilterdata.this.GXt_decimal2 = GXv_decimal3[0] ;
         A14377DifAlmPor = GXt_decimal2 ;
         if ( (GXutil.strcmp("", AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A809RecExiTeo, 12, 4) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A807RecExiRea, 12, 4) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6573RecPreRec, 14, 5) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14034DifAlmacen, 12, 4) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14377DifAlmPor, 7, 2) , GXutil.padr( "%" + AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to) <= 0 ) ) )
               {
                  AV34count = 0 ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09IY3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09IY3_A719PrdNum[0], A719PrdNum) == 0 ) )
                  {
                     brk9IY4 = false ;
                     A810RecFec = P09IY3_A810RecFec[0] ;
                     AV34count = (long)(AV34count+1) ;
                     brk9IY4 = true ;
                     pr_default.readNext(1);
                  }
                  if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
                  {
                     AV26Option = A718PrdNom ;
                     AV25InsertIndex = 1 ;
                     while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
                     {
                        AV25InsertIndex = (int)(AV25InsertIndex+1) ;
                     }
                     AV27Options.add(AV26Option, AV25InsertIndex);
                     AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
                  }
                  if ( AV27Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9IY4 )
         {
            brk9IY4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = listadodiferenciarecuento_wcgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = listadodiferenciarecuento_wcgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = listadodiferenciarecuento_wcgetfilterdata.this.AV33OptionIndexesJson;
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
      AV10TFRecFec = GXutil.nullDate() ;
      AV12TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV14TFPrdNum = "" ;
      AV15TFPrdNum_Sel = "" ;
      AV16TFPrdNom = "" ;
      AV17TFPrdNom_Sel = "" ;
      AV18TFRecExiTeo = DecimalUtil.ZERO ;
      AV19TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV20TFRecExiRea = DecimalUtil.ZERO ;
      AV21TFRecExiRea_To = DecimalUtil.ZERO ;
      AV46TFRecPreRec = DecimalUtil.ZERO ;
      AV47TFRecPreRec_To = DecimalUtil.ZERO ;
      AV48TFDifAlmacen = DecimalUtil.ZERO ;
      AV49TFDifAlmacen_To = DecimalUtil.ZERO ;
      AV50TFDifAlmPor = DecimalUtil.ZERO ;
      AV51TFDifAlmPor_To = DecimalUtil.ZERO ;
      AV41emprcod = "" ;
      AV42recfec = GXutil.nullDate() ;
      AV43prdnumfrom = "" ;
      AV44prdnumto = "" ;
      AV45desvios = "" ;
      A719PrdNum = "" ;
      AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = "" ;
      AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = GXutil.nullDate() ;
      AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = "" ;
      AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = "" ;
      AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = "" ;
      AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = "" ;
      AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = DecimalUtil.ZERO ;
      AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = DecimalUtil.ZERO ;
      AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = DecimalUtil.ZERO ;
      AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = DecimalUtil.ZERO ;
      AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = DecimalUtil.ZERO ;
      AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = DecimalUtil.ZERO ;
      AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = DecimalUtil.ZERO ;
      AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = DecimalUtil.ZERO ;
      AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = "" ;
      lV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = "" ;
      A810RecFec = GXutil.nullDate() ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A14034DifAlmacen = DecimalUtil.ZERO ;
      A14377DifAlmPor = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P09IY2_A396EmprCod = new String[] {""} ;
      P09IY2_A719PrdNum = new String[] {""} ;
      P09IY2_A14034DifAlmacen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IY2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IY2_A718PrdNom = new String[] {""} ;
      P09IY2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P09IY2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IY2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IY2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV26Option = "" ;
      P09IY3_A719PrdNum = new String[] {""} ;
      P09IY3_A396EmprCod = new String[] {""} ;
      P09IY3_A14034DifAlmacen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IY3_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IY3_A718PrdNom = new String[] {""} ;
      P09IY3_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P09IY3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IY3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IY3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXt_decimal2 = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodiferenciarecuento_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09IY2_A396EmprCod, P09IY2_A719PrdNum, P09IY2_A14034DifAlmacen, P09IY2_A6573RecPreRec, P09IY2_A718PrdNom, P09IY2_A13455Rechora, P09IY2_A810RecFec, P09IY2_A807RecExiRea, P09IY2_A809RecExiTeo
            }
            , new Object[] {
            P09IY3_A719PrdNum, P09IY3_A396EmprCod, P09IY3_A14034DifAlmacen, P09IY3_A6573RecPreRec, P09IY3_A718PrdNom, P09IY3_A13455Rechora, P09IY3_A810RecFec, P09IY3_A807RecExiRea, P09IY3_A809RecExiTeo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV54GXV1 ;
   private int AV25InsertIndex ;
   private long AV34count ;
   private java.math.BigDecimal AV18TFRecExiTeo ;
   private java.math.BigDecimal AV19TFRecExiTeo_To ;
   private java.math.BigDecimal AV20TFRecExiRea ;
   private java.math.BigDecimal AV21TFRecExiRea_To ;
   private java.math.BigDecimal AV46TFRecPreRec ;
   private java.math.BigDecimal AV47TFRecPreRec_To ;
   private java.math.BigDecimal AV48TFDifAlmacen ;
   private java.math.BigDecimal AV49TFDifAlmacen_To ;
   private java.math.BigDecimal AV50TFDifAlmPor ;
   private java.math.BigDecimal AV51TFDifAlmPor_To ;
   private java.math.BigDecimal AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ;
   private java.math.BigDecimal AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ;
   private java.math.BigDecimal AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ;
   private java.math.BigDecimal AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ;
   private java.math.BigDecimal AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ;
   private java.math.BigDecimal AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ;
   private java.math.BigDecimal AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ;
   private java.math.BigDecimal AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ;
   private java.math.BigDecimal AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ;
   private java.math.BigDecimal AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A14034DifAlmacen ;
   private java.math.BigDecimal A14377DifAlmPor ;
   private java.math.BigDecimal GXt_decimal2 ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String AV14TFPrdNum ;
   private String AV15TFPrdNum_Sel ;
   private String AV16TFPrdNom ;
   private String AV17TFPrdNom_Sel ;
   private String AV41emprcod ;
   private String AV45desvios ;
   private String A719PrdNum ;
   private String AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ;
   private String AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ;
   private String AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ;
   private String AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ;
   private String lV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private java.util.Date AV12TFRechora ;
   private java.util.Date AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV10TFRecFec ;
   private java.util.Date AV42recfec ;
   private java.util.Date AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean brk9IY2 ;
   private boolean brk9IY4 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV43prdnumfrom ;
   private String AV44prdnumto ;
   private String AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09IY2_A396EmprCod ;
   private String[] P09IY2_A719PrdNum ;
   private java.math.BigDecimal[] P09IY2_A14034DifAlmacen ;
   private java.math.BigDecimal[] P09IY2_A6573RecPreRec ;
   private String[] P09IY2_A718PrdNom ;
   private java.util.Date[] P09IY2_A13455Rechora ;
   private java.util.Date[] P09IY2_A810RecFec ;
   private java.math.BigDecimal[] P09IY2_A807RecExiRea ;
   private java.math.BigDecimal[] P09IY2_A809RecExiTeo ;
   private String[] P09IY3_A719PrdNum ;
   private String[] P09IY3_A396EmprCod ;
   private java.math.BigDecimal[] P09IY3_A14034DifAlmacen ;
   private java.math.BigDecimal[] P09IY3_A6573RecPreRec ;
   private String[] P09IY3_A718PrdNom ;
   private java.util.Date[] P09IY3_A13455Rechora ;
   private java.util.Date[] P09IY3_A810RecFec ;
   private java.math.BigDecimal[] P09IY3_A807RecExiRea ;
   private java.math.BigDecimal[] P09IY3_A809RecExiTeo ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class listadodiferenciarecuento_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09IY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                          String AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                          String AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                          String AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                          String AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                          java.math.BigDecimal AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                          java.math.BigDecimal AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                          java.math.BigDecimal AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                          java.util.Date AV42recfec ,
                                          String AV43prdnumfrom ,
                                          String AV44prdnumto ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          String AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A14034DifAlmacen ,
                                          java.math.BigDecimal A14377DifAlmPor ,
                                          java.math.BigDecimal AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                          java.math.BigDecimal AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                          String AV45desvios ,
                                          String AV41emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[20];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, ( T1.RecExiTeo - T1.RecExiRea) AS DifAlmacen, T1.RecPreRec, T2.PrdNom, T1.Rechora, T1.RecFec, T1.RecExiRea, T1.RecExiTeo FROM (TXPRECUEN" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(( ( T1.RecExiTeo - T1.RecExiRea) <> 0 and ? = 'S') or ? = 'N')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42recfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09IY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                          String AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                          String AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                          String AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                          String AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                          java.math.BigDecimal AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                          java.math.BigDecimal AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                          java.math.BigDecimal AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                          java.util.Date AV42recfec ,
                                          String AV43prdnumfrom ,
                                          String AV44prdnumto ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          String AV56Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A14034DifAlmacen ,
                                          java.math.BigDecimal A14377DifAlmPor ,
                                          java.math.BigDecimal AV71Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                          java.math.BigDecimal AV72Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                          String AV45desvios ,
                                          String AV41emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, ( T1.RecExiTeo - T1.RecExiRea) AS DifAlmacen, T1.RecPreRec, T2.PrdNom, T1.Rechora, T1.RecFec, T1.RecExiRea, T1.RecExiTeo FROM (TXPRECUEN" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(( ( T1.RecExiTeo - T1.RecExiRea) <> 0 and ? = 'S') or ? = 'N')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV58Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42recfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
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
                  return conditional_P09IY2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 1 :
                  return conditional_P09IY3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09IY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
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
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[24], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 6);
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
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[24], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 6);
               }
               return;
      }
   }

}

