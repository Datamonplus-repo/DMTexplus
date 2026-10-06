package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_verproductospesadosgetfilterdata extends GXProcedure
{
   public cierrerecetastinte_verproductospesadosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_verproductospesadosgetfilterdata.class ), "" );
   }

   public cierrerecetastinte_verproductospesadosgetfilterdata( int remoteHandle ,
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
      cierrerecetastinte_verproductospesadosgetfilterdata.this.aP5 = new String[] {""};
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
      cierrerecetastinte_verproductospesadosgetfilterdata.this.AV32DDOName = aP0;
      cierrerecetastinte_verproductospesadosgetfilterdata.this.AV30SearchTxt = aP1;
      cierrerecetastinte_verproductospesadosgetfilterdata.this.AV31SearchTxtTo = aP2;
      cierrerecetastinte_verproductospesadosgetfilterdata.this.aP3 = aP3;
      cierrerecetastinte_verproductospesadosgetfilterdata.this.aP4 = aP4;
      cierrerecetastinte_verproductospesadosgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_RECPRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_RECPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_RECLINUSR") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLINUSROPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV43Session.getValue("CierreRecetasTinte_VerProductosPesadosGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CierreRecetasTinte_VerProductosPesadosGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("CierreRecetasTinte_VerProductosPesadosGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV10TFRecLinPro = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLinPro_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV12TFRecLin = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFRecLin_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV14TFRecPrdNum = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV15TFRecPrdNum_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV16TFRecPrdDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV17TFRecPrdDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV18TFForPrdUMe = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFForPrdUMe_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV20TFForPrdDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV21TFForPrdDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV22TFPrdCant = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPrdCant_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANFIN") == 0 )
         {
            AV24TFPrdCanFin = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPrdCanFin_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR") == 0 )
         {
            AV26TFRecLinUsr = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR_SEL") == 0 )
         {
            AV27TFRecLinUsr_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPESFEC") == 0 )
         {
            AV28TFRecPesFec = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFRecPrdNum = AV30SearchTxt ;
      AV15TFRecPrdNum_Sel = "" ;
      AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = AV48FilterFullText ;
      AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro = AV10TFRecLinPro ;
      AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin = AV12TFRecLin ;
      AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to = AV13TFRecLin_To ;
      AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = AV14TFRecPrdNum ;
      AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = AV16TFRecPrdDsc ;
      AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume = AV18TFForPrdUMe ;
      AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = AV20TFForPrdDsc ;
      AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant = AV22TFPrdCant ;
      AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = AV23TFPrdCant_To ;
      AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = AV24TFPrdCanFin ;
      AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = AV25TFPrdCanFin_To ;
      AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = AV26TFRecLinUsr ;
      AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = AV27TFRecLinUsr_Sel ;
      AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = AV28TFRecPesFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                           Byte.valueOf(AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) ,
                                           Byte.valueOf(AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin) ,
                                           Short.valueOf(AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) ,
                                           AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                           AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                           AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                           AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                           Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume) ,
                                           Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) ,
                                           AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                           AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                           AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                           AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                           AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                           AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                           AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                           AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                           AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum), 6, "%") ;
      lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc), 26, "%") ;
      lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc), 5, "%") ;
      lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = GXutil.padr( GXutil.rtrim( AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr), 8, "%") ;
      /* Using cursor P094X2 */
      pr_default.execute(0, new Object[] {lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, Byte.valueOf(AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro), Byte.valueOf(AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to), Short.valueOf(AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin), Short.valueOf(AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to), lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum, AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel, lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc, AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel, Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume), Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to), lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc, AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel, AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant, AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to, AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin, AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to, lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr, AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel, AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk94X2 = false ;
         A396EmprCod = P094X2_A396EmprCod[0] ;
         A872RecPrdNum = P094X2_A872RecPrdNum[0] ;
         A4577RecPesFec = P094X2_A4577RecPesFec[0] ;
         A4576RecLinUsr = P094X2_A4576RecLinUsr[0] ;
         A683PrdCanFin = P094X2_A683PrdCanFin[0] ;
         A686PrdCant = P094X2_A686PrdCant[0] ;
         A488ForPrdDsc = P094X2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094X2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P094X2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P094X2_n490ForPrdUMe[0] ;
         A875RecPrdDsc = P094X2_A875RecPrdDsc[0] ;
         A811RecLin = P094X2_A811RecLin[0] ;
         A1273RecLinPro = P094X2_A1273RecLinPro[0] ;
         A129BarCod = P094X2_A129BarCod[0] ;
         A132BarCodReo = P094X2_A132BarCodReo[0] ;
         A130BarCodPar = P094X2_A130BarCodPar[0] ;
         A2804RecLinMaq = P094X2_A2804RecLinMaq[0] ;
         A488ForPrdDsc = P094X2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094X2_n488ForPrdDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P094X2_A872RecPrdNum[0], A872RecPrdNum) == 0 ) )
         {
            brk94X2 = false ;
            A396EmprCod = P094X2_A396EmprCod[0] ;
            A811RecLin = P094X2_A811RecLin[0] ;
            A1273RecLinPro = P094X2_A1273RecLinPro[0] ;
            A129BarCod = P094X2_A129BarCod[0] ;
            A132BarCodReo = P094X2_A132BarCodReo[0] ;
            A130BarCodPar = P094X2_A130BarCodPar[0] ;
            A2804RecLinMaq = P094X2_A2804RecLinMaq[0] ;
            AV42count = (long)(AV42count+1) ;
            brk94X2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV34Option = A872RecPrdNum ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94X2 )
         {
            brk94X2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFRecPrdDsc = AV30SearchTxt ;
      AV17TFRecPrdDsc_Sel = "" ;
      AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = AV48FilterFullText ;
      AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro = AV10TFRecLinPro ;
      AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin = AV12TFRecLin ;
      AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to = AV13TFRecLin_To ;
      AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = AV14TFRecPrdNum ;
      AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = AV16TFRecPrdDsc ;
      AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume = AV18TFForPrdUMe ;
      AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = AV20TFForPrdDsc ;
      AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant = AV22TFPrdCant ;
      AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = AV23TFPrdCant_To ;
      AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = AV24TFPrdCanFin ;
      AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = AV25TFPrdCanFin_To ;
      AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = AV26TFRecLinUsr ;
      AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = AV27TFRecLinUsr_Sel ;
      AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = AV28TFRecPesFec ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                           Byte.valueOf(AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) ,
                                           Byte.valueOf(AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin) ,
                                           Short.valueOf(AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) ,
                                           AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                           AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                           AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                           AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                           Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume) ,
                                           Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) ,
                                           AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                           AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                           AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                           AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                           AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                           AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                           AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                           AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                           AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum), 6, "%") ;
      lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc), 26, "%") ;
      lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc), 5, "%") ;
      lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = GXutil.padr( GXutil.rtrim( AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr), 8, "%") ;
      /* Using cursor P094X3 */
      pr_default.execute(1, new Object[] {lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, Byte.valueOf(AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro), Byte.valueOf(AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to), Short.valueOf(AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin), Short.valueOf(AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to), lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum, AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel, lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc, AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel, Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume), Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to), lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc, AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel, AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant, AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to, AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin, AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to, lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr, AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel, AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk94X4 = false ;
         A396EmprCod = P094X3_A396EmprCod[0] ;
         A875RecPrdDsc = P094X3_A875RecPrdDsc[0] ;
         A4577RecPesFec = P094X3_A4577RecPesFec[0] ;
         A4576RecLinUsr = P094X3_A4576RecLinUsr[0] ;
         A683PrdCanFin = P094X3_A683PrdCanFin[0] ;
         A686PrdCant = P094X3_A686PrdCant[0] ;
         A488ForPrdDsc = P094X3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094X3_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P094X3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P094X3_n490ForPrdUMe[0] ;
         A872RecPrdNum = P094X3_A872RecPrdNum[0] ;
         A811RecLin = P094X3_A811RecLin[0] ;
         A1273RecLinPro = P094X3_A1273RecLinPro[0] ;
         A129BarCod = P094X3_A129BarCod[0] ;
         A132BarCodReo = P094X3_A132BarCodReo[0] ;
         A130BarCodPar = P094X3_A130BarCodPar[0] ;
         A2804RecLinMaq = P094X3_A2804RecLinMaq[0] ;
         A488ForPrdDsc = P094X3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094X3_n488ForPrdDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P094X3_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) )
         {
            brk94X4 = false ;
            A396EmprCod = P094X3_A396EmprCod[0] ;
            A811RecLin = P094X3_A811RecLin[0] ;
            A1273RecLinPro = P094X3_A1273RecLinPro[0] ;
            A129BarCod = P094X3_A129BarCod[0] ;
            A132BarCodReo = P094X3_A132BarCodReo[0] ;
            A130BarCodPar = P094X3_A130BarCodPar[0] ;
            A2804RecLinMaq = P094X3_A2804RecLinMaq[0] ;
            AV42count = (long)(AV42count+1) ;
            brk94X4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV34Option = A875RecPrdDsc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94X4 )
         {
            brk94X4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFForPrdDsc = AV30SearchTxt ;
      AV21TFForPrdDsc_Sel = "" ;
      AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = AV48FilterFullText ;
      AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro = AV10TFRecLinPro ;
      AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin = AV12TFRecLin ;
      AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to = AV13TFRecLin_To ;
      AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = AV14TFRecPrdNum ;
      AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = AV16TFRecPrdDsc ;
      AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume = AV18TFForPrdUMe ;
      AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = AV20TFForPrdDsc ;
      AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant = AV22TFPrdCant ;
      AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = AV23TFPrdCant_To ;
      AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = AV24TFPrdCanFin ;
      AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = AV25TFPrdCanFin_To ;
      AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = AV26TFRecLinUsr ;
      AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = AV27TFRecLinUsr_Sel ;
      AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = AV28TFRecPesFec ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                           Byte.valueOf(AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) ,
                                           Byte.valueOf(AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin) ,
                                           Short.valueOf(AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) ,
                                           AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                           AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                           AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                           AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                           Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume) ,
                                           Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) ,
                                           AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                           AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                           AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                           AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                           AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                           AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                           AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                           AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                           AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum), 6, "%") ;
      lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc), 26, "%") ;
      lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc), 5, "%") ;
      lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = GXutil.padr( GXutil.rtrim( AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr), 8, "%") ;
      /* Using cursor P094X4 */
      pr_default.execute(2, new Object[] {lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, Byte.valueOf(AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro), Byte.valueOf(AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to), Short.valueOf(AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin), Short.valueOf(AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to), lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum, AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel, lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc, AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel, Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume), Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to), lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc, AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel, AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant, AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to, AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin, AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to, lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr, AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel, AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk94X6 = false ;
         A490ForPrdUMe = P094X4_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P094X4_n490ForPrdUMe[0] ;
         A396EmprCod = P094X4_A396EmprCod[0] ;
         A4577RecPesFec = P094X4_A4577RecPesFec[0] ;
         A4576RecLinUsr = P094X4_A4576RecLinUsr[0] ;
         A683PrdCanFin = P094X4_A683PrdCanFin[0] ;
         A686PrdCant = P094X4_A686PrdCant[0] ;
         A488ForPrdDsc = P094X4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094X4_n488ForPrdDsc[0] ;
         A875RecPrdDsc = P094X4_A875RecPrdDsc[0] ;
         A872RecPrdNum = P094X4_A872RecPrdNum[0] ;
         A811RecLin = P094X4_A811RecLin[0] ;
         A1273RecLinPro = P094X4_A1273RecLinPro[0] ;
         A129BarCod = P094X4_A129BarCod[0] ;
         A132BarCodReo = P094X4_A132BarCodReo[0] ;
         A130BarCodPar = P094X4_A130BarCodPar[0] ;
         A2804RecLinMaq = P094X4_A2804RecLinMaq[0] ;
         A488ForPrdDsc = P094X4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094X4_n488ForPrdDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P094X4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P094X4_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk94X6 = false ;
            A811RecLin = P094X4_A811RecLin[0] ;
            A1273RecLinPro = P094X4_A1273RecLinPro[0] ;
            A129BarCod = P094X4_A129BarCod[0] ;
            A132BarCodReo = P094X4_A132BarCodReo[0] ;
            A130BarCodPar = P094X4_A130BarCodPar[0] ;
            A2804RecLinMaq = P094X4_A2804RecLinMaq[0] ;
            AV42count = (long)(AV42count+1) ;
            brk94X6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV34Option = A488ForPrdDsc ;
            AV33InsertIndex = 1 ;
            while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
            {
               AV33InsertIndex = (int)(AV33InsertIndex+1) ;
            }
            AV35Options.add(AV34Option, AV33InsertIndex);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94X6 )
         {
            brk94X6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADRECLINUSROPTIONS' Routine */
      returnInSub = false ;
      AV26TFRecLinUsr = AV30SearchTxt ;
      AV27TFRecLinUsr_Sel = "" ;
      AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = AV48FilterFullText ;
      AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro = AV10TFRecLinPro ;
      AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin = AV12TFRecLin ;
      AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to = AV13TFRecLin_To ;
      AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = AV14TFRecPrdNum ;
      AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = AV16TFRecPrdDsc ;
      AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume = AV18TFForPrdUMe ;
      AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = AV20TFForPrdDsc ;
      AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant = AV22TFPrdCant ;
      AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = AV23TFPrdCant_To ;
      AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = AV24TFPrdCanFin ;
      AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = AV25TFPrdCanFin_To ;
      AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = AV26TFRecLinUsr ;
      AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = AV27TFRecLinUsr_Sel ;
      AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = AV28TFRecPesFec ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                           Byte.valueOf(AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) ,
                                           Byte.valueOf(AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin) ,
                                           Short.valueOf(AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) ,
                                           AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                           AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                           AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                           AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                           Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume) ,
                                           Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) ,
                                           AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                           AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                           AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                           AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                           AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                           AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                           AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                           AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                           AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext), "%", "") ;
      lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum), 6, "%") ;
      lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc), 26, "%") ;
      lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc), 5, "%") ;
      lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = GXutil.padr( GXutil.rtrim( AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr), 8, "%") ;
      /* Using cursor P094X5 */
      pr_default.execute(3, new Object[] {lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext, Byte.valueOf(AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro), Byte.valueOf(AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to), Short.valueOf(AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin), Short.valueOf(AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to), lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum, AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel, lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc, AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel, Byte.valueOf(AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume), Byte.valueOf(AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to), lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc, AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel, AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant, AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to, AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin, AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to, lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr, AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel, AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk94X8 = false ;
         A396EmprCod = P094X5_A396EmprCod[0] ;
         A4576RecLinUsr = P094X5_A4576RecLinUsr[0] ;
         A4577RecPesFec = P094X5_A4577RecPesFec[0] ;
         A683PrdCanFin = P094X5_A683PrdCanFin[0] ;
         A686PrdCant = P094X5_A686PrdCant[0] ;
         A488ForPrdDsc = P094X5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094X5_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P094X5_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P094X5_n490ForPrdUMe[0] ;
         A875RecPrdDsc = P094X5_A875RecPrdDsc[0] ;
         A872RecPrdNum = P094X5_A872RecPrdNum[0] ;
         A811RecLin = P094X5_A811RecLin[0] ;
         A1273RecLinPro = P094X5_A1273RecLinPro[0] ;
         A129BarCod = P094X5_A129BarCod[0] ;
         A132BarCodReo = P094X5_A132BarCodReo[0] ;
         A130BarCodPar = P094X5_A130BarCodPar[0] ;
         A2804RecLinMaq = P094X5_A2804RecLinMaq[0] ;
         A488ForPrdDsc = P094X5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P094X5_n488ForPrdDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P094X5_A4576RecLinUsr[0], A4576RecLinUsr) == 0 ) )
         {
            brk94X8 = false ;
            A396EmprCod = P094X5_A396EmprCod[0] ;
            A811RecLin = P094X5_A811RecLin[0] ;
            A1273RecLinPro = P094X5_A1273RecLinPro[0] ;
            A129BarCod = P094X5_A129BarCod[0] ;
            A132BarCodReo = P094X5_A132BarCodReo[0] ;
            A130BarCodPar = P094X5_A130BarCodPar[0] ;
            A2804RecLinMaq = P094X5_A2804RecLinMaq[0] ;
            AV42count = (long)(AV42count+1) ;
            brk94X8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4576RecLinUsr)==0) )
         {
            AV34Option = A4576RecLinUsr ;
            AV37OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!"))) ;
            AV35Options.add(AV34Option, 0);
            AV38OptionsDesc.add(AV37OptionDesc, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94X8 )
         {
            brk94X8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cierrerecetastinte_verproductospesadosgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = cierrerecetastinte_verproductospesadosgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = cierrerecetastinte_verproductospesadosgetfilterdata.this.AV41OptionIndexesJson;
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
      AV14TFRecPrdNum = "" ;
      AV15TFRecPrdNum_Sel = "" ;
      AV16TFRecPrdDsc = "" ;
      AV17TFRecPrdDsc_Sel = "" ;
      AV20TFForPrdDsc = "" ;
      AV21TFForPrdDsc_Sel = "" ;
      AV22TFPrdCant = DecimalUtil.ZERO ;
      AV23TFPrdCant_To = DecimalUtil.ZERO ;
      AV24TFPrdCanFin = DecimalUtil.ZERO ;
      AV25TFPrdCanFin_To = DecimalUtil.ZERO ;
      AV26TFRecLinUsr = "" ;
      AV27TFRecLinUsr_Sel = "" ;
      AV28TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A872RecPrdNum = "" ;
      AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = "" ;
      AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = "" ;
      AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel = "" ;
      AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = "" ;
      AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel = "" ;
      AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = "" ;
      AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel = "" ;
      AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant = DecimalUtil.ZERO ;
      AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to = DecimalUtil.ZERO ;
      AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin = DecimalUtil.ZERO ;
      AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to = DecimalUtil.ZERO ;
      AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = "" ;
      AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel = "" ;
      AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext = "" ;
      lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum = "" ;
      lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc = "" ;
      lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc = "" ;
      lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      P094X2_A396EmprCod = new String[] {""} ;
      P094X2_A872RecPrdNum = new String[] {""} ;
      P094X2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094X2_A4576RecLinUsr = new String[] {""} ;
      P094X2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094X2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094X2_A488ForPrdDsc = new String[] {""} ;
      P094X2_n488ForPrdDsc = new boolean[] {false} ;
      P094X2_A490ForPrdUMe = new byte[1] ;
      P094X2_n490ForPrdUMe = new boolean[] {false} ;
      P094X2_A875RecPrdDsc = new String[] {""} ;
      P094X2_A811RecLin = new short[1] ;
      P094X2_A1273RecLinPro = new byte[1] ;
      P094X2_A129BarCod = new int[1] ;
      P094X2_A132BarCodReo = new byte[1] ;
      P094X2_A130BarCodPar = new String[] {""} ;
      P094X2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV34Option = "" ;
      P094X3_A396EmprCod = new String[] {""} ;
      P094X3_A875RecPrdDsc = new String[] {""} ;
      P094X3_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094X3_A4576RecLinUsr = new String[] {""} ;
      P094X3_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094X3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094X3_A488ForPrdDsc = new String[] {""} ;
      P094X3_n488ForPrdDsc = new boolean[] {false} ;
      P094X3_A490ForPrdUMe = new byte[1] ;
      P094X3_n490ForPrdUMe = new boolean[] {false} ;
      P094X3_A872RecPrdNum = new String[] {""} ;
      P094X3_A811RecLin = new short[1] ;
      P094X3_A1273RecLinPro = new byte[1] ;
      P094X3_A129BarCod = new int[1] ;
      P094X3_A132BarCodReo = new byte[1] ;
      P094X3_A130BarCodPar = new String[] {""} ;
      P094X3_A2804RecLinMaq = new short[1] ;
      P094X4_A490ForPrdUMe = new byte[1] ;
      P094X4_n490ForPrdUMe = new boolean[] {false} ;
      P094X4_A396EmprCod = new String[] {""} ;
      P094X4_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094X4_A4576RecLinUsr = new String[] {""} ;
      P094X4_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094X4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094X4_A488ForPrdDsc = new String[] {""} ;
      P094X4_n488ForPrdDsc = new boolean[] {false} ;
      P094X4_A875RecPrdDsc = new String[] {""} ;
      P094X4_A872RecPrdNum = new String[] {""} ;
      P094X4_A811RecLin = new short[1] ;
      P094X4_A1273RecLinPro = new byte[1] ;
      P094X4_A129BarCod = new int[1] ;
      P094X4_A132BarCodReo = new byte[1] ;
      P094X4_A130BarCodPar = new String[] {""} ;
      P094X4_A2804RecLinMaq = new short[1] ;
      P094X5_A396EmprCod = new String[] {""} ;
      P094X5_A4576RecLinUsr = new String[] {""} ;
      P094X5_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094X5_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094X5_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094X5_A488ForPrdDsc = new String[] {""} ;
      P094X5_n488ForPrdDsc = new boolean[] {false} ;
      P094X5_A490ForPrdUMe = new byte[1] ;
      P094X5_n490ForPrdUMe = new boolean[] {false} ;
      P094X5_A875RecPrdDsc = new String[] {""} ;
      P094X5_A872RecPrdNum = new String[] {""} ;
      P094X5_A811RecLin = new short[1] ;
      P094X5_A1273RecLinPro = new byte[1] ;
      P094X5_A129BarCod = new int[1] ;
      P094X5_A132BarCodReo = new byte[1] ;
      P094X5_A130BarCodPar = new String[] {""} ;
      P094X5_A2804RecLinMaq = new short[1] ;
      AV37OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_verproductospesadosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P094X2_A396EmprCod, P094X2_A872RecPrdNum, P094X2_A4577RecPesFec, P094X2_A4576RecLinUsr, P094X2_A683PrdCanFin, P094X2_A686PrdCant, P094X2_A488ForPrdDsc, P094X2_n488ForPrdDsc, P094X2_A490ForPrdUMe, P094X2_n490ForPrdUMe,
            P094X2_A875RecPrdDsc, P094X2_A811RecLin, P094X2_A1273RecLinPro, P094X2_A129BarCod, P094X2_A132BarCodReo, P094X2_A130BarCodPar, P094X2_A2804RecLinMaq
            }
            , new Object[] {
            P094X3_A396EmprCod, P094X3_A875RecPrdDsc, P094X3_A4577RecPesFec, P094X3_A4576RecLinUsr, P094X3_A683PrdCanFin, P094X3_A686PrdCant, P094X3_A488ForPrdDsc, P094X3_n488ForPrdDsc, P094X3_A490ForPrdUMe, P094X3_n490ForPrdUMe,
            P094X3_A872RecPrdNum, P094X3_A811RecLin, P094X3_A1273RecLinPro, P094X3_A129BarCod, P094X3_A132BarCodReo, P094X3_A130BarCodPar, P094X3_A2804RecLinMaq
            }
            , new Object[] {
            P094X4_A490ForPrdUMe, P094X4_n490ForPrdUMe, P094X4_A396EmprCod, P094X4_A4577RecPesFec, P094X4_A4576RecLinUsr, P094X4_A683PrdCanFin, P094X4_A686PrdCant, P094X4_A488ForPrdDsc, P094X4_n488ForPrdDsc, P094X4_A875RecPrdDsc,
            P094X4_A872RecPrdNum, P094X4_A811RecLin, P094X4_A1273RecLinPro, P094X4_A129BarCod, P094X4_A132BarCodReo, P094X4_A130BarCodPar, P094X4_A2804RecLinMaq
            }
            , new Object[] {
            P094X5_A396EmprCod, P094X5_A4576RecLinUsr, P094X5_A4577RecPesFec, P094X5_A683PrdCanFin, P094X5_A686PrdCant, P094X5_A488ForPrdDsc, P094X5_n488ForPrdDsc, P094X5_A490ForPrdUMe, P094X5_n490ForPrdUMe, P094X5_A875RecPrdDsc,
            P094X5_A872RecPrdNum, P094X5_A811RecLin, P094X5_A1273RecLinPro, P094X5_A129BarCod, P094X5_A132BarCodReo, P094X5_A130BarCodPar, P094X5_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFRecLinPro ;
   private byte AV11TFRecLinPro_To ;
   private byte AV18TFForPrdUMe ;
   private byte AV19TFForPrdUMe_To ;
   private byte AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ;
   private byte AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ;
   private byte AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume ;
   private byte AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A132BarCodReo ;
   private short AV12TFRecLin ;
   private short AV13TFRecLin_To ;
   private short AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin ;
   private short AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int A129BarCod ;
   private int AV33InsertIndex ;
   private long AV42count ;
   private java.math.BigDecimal AV22TFPrdCant ;
   private java.math.BigDecimal AV23TFPrdCant_To ;
   private java.math.BigDecimal AV24TFPrdCanFin ;
   private java.math.BigDecimal AV25TFPrdCanFin_To ;
   private java.math.BigDecimal AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant ;
   private java.math.BigDecimal AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ;
   private java.math.BigDecimal AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ;
   private java.math.BigDecimal AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private String AV14TFRecPrdNum ;
   private String AV15TFRecPrdNum_Sel ;
   private String AV16TFRecPrdDsc ;
   private String AV17TFRecPrdDsc_Sel ;
   private String AV20TFForPrdDsc ;
   private String AV21TFForPrdDsc_Sel ;
   private String AV26TFRecLinUsr ;
   private String AV27TFRecLinUsr_Sel ;
   private String A872RecPrdNum ;
   private String AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ;
   private String AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ;
   private String AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ;
   private String AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ;
   private String AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ;
   private String AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ;
   private String AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ;
   private String AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ;
   private String scmdbuf ;
   private String lV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ;
   private String lV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ;
   private String lV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ;
   private String lV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A4576RecLinUsr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.util.Date AV28TFRecPesFec ;
   private java.util.Date AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ;
   private java.util.Date A4577RecPesFec ;
   private boolean returnInSub ;
   private boolean brk94X2 ;
   private boolean n488ForPrdDsc ;
   private boolean n490ForPrdUMe ;
   private boolean brk94X4 ;
   private boolean brk94X6 ;
   private boolean brk94X8 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ;
   private String lV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ;
   private String AV34Option ;
   private String AV37OptionDesc ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P094X2_A396EmprCod ;
   private String[] P094X2_A872RecPrdNum ;
   private java.util.Date[] P094X2_A4577RecPesFec ;
   private String[] P094X2_A4576RecLinUsr ;
   private java.math.BigDecimal[] P094X2_A683PrdCanFin ;
   private java.math.BigDecimal[] P094X2_A686PrdCant ;
   private String[] P094X2_A488ForPrdDsc ;
   private boolean[] P094X2_n488ForPrdDsc ;
   private byte[] P094X2_A490ForPrdUMe ;
   private boolean[] P094X2_n490ForPrdUMe ;
   private String[] P094X2_A875RecPrdDsc ;
   private short[] P094X2_A811RecLin ;
   private byte[] P094X2_A1273RecLinPro ;
   private int[] P094X2_A129BarCod ;
   private byte[] P094X2_A132BarCodReo ;
   private String[] P094X2_A130BarCodPar ;
   private short[] P094X2_A2804RecLinMaq ;
   private String[] P094X3_A396EmprCod ;
   private String[] P094X3_A875RecPrdDsc ;
   private java.util.Date[] P094X3_A4577RecPesFec ;
   private String[] P094X3_A4576RecLinUsr ;
   private java.math.BigDecimal[] P094X3_A683PrdCanFin ;
   private java.math.BigDecimal[] P094X3_A686PrdCant ;
   private String[] P094X3_A488ForPrdDsc ;
   private boolean[] P094X3_n488ForPrdDsc ;
   private byte[] P094X3_A490ForPrdUMe ;
   private boolean[] P094X3_n490ForPrdUMe ;
   private String[] P094X3_A872RecPrdNum ;
   private short[] P094X3_A811RecLin ;
   private byte[] P094X3_A1273RecLinPro ;
   private int[] P094X3_A129BarCod ;
   private byte[] P094X3_A132BarCodReo ;
   private String[] P094X3_A130BarCodPar ;
   private short[] P094X3_A2804RecLinMaq ;
   private byte[] P094X4_A490ForPrdUMe ;
   private boolean[] P094X4_n490ForPrdUMe ;
   private String[] P094X4_A396EmprCod ;
   private java.util.Date[] P094X4_A4577RecPesFec ;
   private String[] P094X4_A4576RecLinUsr ;
   private java.math.BigDecimal[] P094X4_A683PrdCanFin ;
   private java.math.BigDecimal[] P094X4_A686PrdCant ;
   private String[] P094X4_A488ForPrdDsc ;
   private boolean[] P094X4_n488ForPrdDsc ;
   private String[] P094X4_A875RecPrdDsc ;
   private String[] P094X4_A872RecPrdNum ;
   private short[] P094X4_A811RecLin ;
   private byte[] P094X4_A1273RecLinPro ;
   private int[] P094X4_A129BarCod ;
   private byte[] P094X4_A132BarCodReo ;
   private String[] P094X4_A130BarCodPar ;
   private short[] P094X4_A2804RecLinMaq ;
   private String[] P094X5_A396EmprCod ;
   private String[] P094X5_A4576RecLinUsr ;
   private java.util.Date[] P094X5_A4577RecPesFec ;
   private java.math.BigDecimal[] P094X5_A683PrdCanFin ;
   private java.math.BigDecimal[] P094X5_A686PrdCant ;
   private String[] P094X5_A488ForPrdDsc ;
   private boolean[] P094X5_n488ForPrdDsc ;
   private byte[] P094X5_A490ForPrdUMe ;
   private boolean[] P094X5_n490ForPrdUMe ;
   private String[] P094X5_A875RecPrdDsc ;
   private String[] P094X5_A872RecPrdNum ;
   private short[] P094X5_A811RecLin ;
   private byte[] P094X5_A1273RecLinPro ;
   private int[] P094X5_A129BarCod ;
   private byte[] P094X5_A132BarCodReo ;
   private String[] P094X5_A130BarCodPar ;
   private short[] P094X5_A2804RecLinMaq ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class cierrerecetastinte_verproductospesadosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                          byte AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ,
                                          byte AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ,
                                          short AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin ,
                                          short AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ,
                                          String AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                          String AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                          String AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                          String AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                          byte AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume ,
                                          byte AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ,
                                          String AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                          String AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                          java.math.BigDecimal AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                          java.math.BigDecimal AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                          String AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                          String AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                          java.util.Date AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[28];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecPrdNum, T1.RecPesFec, T1.RecLinUsr, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe, T1.RecPrdDsc, T1.RecLin, T1.RecLinPro, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecLinUsr) IS NULL AND NOT(T1.RecLinUsr IS NULL)))");
      if ( ! (GXutil.strcmp("", AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P094X3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                          byte AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ,
                                          byte AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ,
                                          short AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin ,
                                          short AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ,
                                          String AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                          String AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                          String AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                          String AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                          byte AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume ,
                                          byte AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ,
                                          String AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                          String AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                          java.math.BigDecimal AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                          java.math.BigDecimal AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                          String AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                          String AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                          java.util.Date AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[28];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecPrdDsc, T1.RecPesFec, T1.RecLinUsr, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe, T1.RecPrdNum, T1.RecLin, T1.RecLinPro, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecLinUsr) IS NULL AND NOT(T1.RecLinUsr IS NULL)))");
      if ( ! (GXutil.strcmp("", AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P094X4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                          byte AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ,
                                          byte AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ,
                                          short AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin ,
                                          short AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ,
                                          String AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                          String AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                          String AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                          String AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                          byte AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume ,
                                          byte AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ,
                                          String AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                          String AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                          java.math.BigDecimal AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                          java.math.BigDecimal AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                          String AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                          String AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                          java.util.Date AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[28];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.RecPesFec, T1.RecLinUsr, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinPro, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecLinUsr) IS NULL AND NOT(T1.RecLinUsr IS NULL)))");
      if ( ! (GXutil.strcmp("", AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P094X5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext ,
                                          byte AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro ,
                                          byte AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to ,
                                          short AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin ,
                                          short AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to ,
                                          String AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel ,
                                          String AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum ,
                                          String AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel ,
                                          String AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc ,
                                          byte AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume ,
                                          byte AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to ,
                                          String AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel ,
                                          String AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc ,
                                          java.math.BigDecimal AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant ,
                                          java.math.BigDecimal AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to ,
                                          String AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel ,
                                          String AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr ,
                                          java.util.Date AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[28];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecLinUsr, T1.RecPesFec, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T1.RecLinPro, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecLinUsr) IS NULL AND NOT(T1.RecLinUsr IS NULL)))");
      if ( ! (GXutil.strcmp("", AV53Cierrerecetastinte_verproductospesadosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV54Cierrerecetastinte_verproductospesadosds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Cierrerecetastinte_verproductospesadosds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Cierrerecetastinte_verproductospesadosds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV57Cierrerecetastinte_verproductospesadosds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Cierrerecetastinte_verproductospesadosds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Cierrerecetastinte_verproductospesadosds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Cierrerecetastinte_verproductospesadosds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Cierrerecetastinte_verproductospesadosds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV62Cierrerecetastinte_verproductospesadosds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV63Cierrerecetastinte_verproductospesadosds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Cierrerecetastinte_verproductospesadosds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Cierrerecetastinte_verproductospesadosds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Cierrerecetastinte_verproductospesadosds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Cierrerecetastinte_verproductospesadosds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Cierrerecetastinte_verproductospesadosds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Cierrerecetastinte_verproductospesadosds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV70Cierrerecetastinte_verproductospesadosds_18_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Cierrerecetastinte_verproductospesadosds_19_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Cierrerecetastinte_verproductospesadosds_20_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecLinUsr" ;
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
                  return conditional_P094X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (java.util.Date)dynConstraints[29] );
            case 1 :
                  return conditional_P094X3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (java.util.Date)dynConstraints[29] );
            case 2 :
                  return conditional_P094X4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (java.util.Date)dynConstraints[29] );
            case 3 :
                  return conditional_P094X5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (java.util.Date)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094X3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094X4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094X5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[7])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((short[]) buf[16])[0] = rslt.getShort(15);
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
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[55], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[55], false);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[55], false);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[55], false);
               }
               return;
      }
   }

}

