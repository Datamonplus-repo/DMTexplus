package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcdetalleproductosgetfilterdata extends GXProcedure
{
   public wcdetalleproductosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdetalleproductosgetfilterdata.class ), "" );
   }

   public wcdetalleproductosgetfilterdata( int remoteHandle ,
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
      wcdetalleproductosgetfilterdata.this.aP5 = new String[] {""};
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
      wcdetalleproductosgetfilterdata.this.AV16DDOName = aP0;
      wcdetalleproductosgetfilterdata.this.AV14SearchTxt = aP1;
      wcdetalleproductosgetfilterdata.this.AV15SearchTxtTo = aP2;
      wcdetalleproductosgetfilterdata.this.aP3 = aP3;
      wcdetalleproductosgetfilterdata.this.aP4 = aP4;
      wcdetalleproductosgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_HREPRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADHREPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_HREPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADHREPRDDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_HREPRDUDS") == 0 )
      {
         /* Execute user subroutine: 'LOADHREPRDUDSOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_HRELINUSR") == 0 )
      {
         /* Execute user subroutine: 'LOADHRELINUSROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("WCDetalleProductosGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDetalleProductosGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WCDetalleProductosGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRERECLIN") == 0 )
         {
            AV56TFHreRecLin = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFHreRecLin_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV10TFHrePrdNum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV11TFHrePrdNum_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV12TFHrePrdDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV13TFHrePrdDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFACCON") == 0 )
         {
            AV40TFHreFacCon = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFHreFacCon_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV42TFHrePrdUDs = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV43TFHrePrdUDs_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV44TFHrePrdCant = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFHrePrdCant_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECANANY") == 0 )
         {
            AV48TFHreCanAny = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFHreCanAny_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFORNRO") == 0 )
         {
            AV50TFHreForNro = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFHreForNro_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDTNQ") == 0 )
         {
            AV52TFHrePrdTnq = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFHrePrdTnq_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINUSR") == 0 )
         {
            AV54TFHreLinUsr = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINUSR_SEL") == 0 )
         {
            AV55TFHreLinUsr_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV33EmprCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV34HreBarCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV35HreBarReo = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV36HreBarPar = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV37HreNumCie = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV38HreLinMaq = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINPRO") == 0 )
         {
            AV39HreLinPro = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFHrePrdNum = AV14SearchTxt ;
      AV11TFHrePrdNum_Sel = "" ;
      AV62Wcdetalleproductosds_1_tfhrereclin = AV56TFHreRecLin ;
      AV63Wcdetalleproductosds_2_tfhrereclin_to = AV57TFHreRecLin_To ;
      AV64Wcdetalleproductosds_3_tfhreprdnum = AV10TFHrePrdNum ;
      AV65Wcdetalleproductosds_4_tfhreprdnum_sel = AV11TFHrePrdNum_Sel ;
      AV66Wcdetalleproductosds_5_tfhreprddsc = AV12TFHrePrdDsc ;
      AV67Wcdetalleproductosds_6_tfhreprddsc_sel = AV13TFHrePrdDsc_Sel ;
      AV68Wcdetalleproductosds_7_tfhrefaccon = AV40TFHreFacCon ;
      AV69Wcdetalleproductosds_8_tfhrefaccon_to = AV41TFHreFacCon_To ;
      AV70Wcdetalleproductosds_9_tfhreprduds = AV42TFHrePrdUDs ;
      AV71Wcdetalleproductosds_10_tfhreprduds_sel = AV43TFHrePrdUDs_Sel ;
      AV72Wcdetalleproductosds_11_tfhreprdcant = AV44TFHrePrdCant ;
      AV73Wcdetalleproductosds_12_tfhreprdcant_to = AV45TFHrePrdCant_To ;
      AV74Wcdetalleproductosds_13_tfhrecanany = AV48TFHreCanAny ;
      AV75Wcdetalleproductosds_14_tfhrecanany_to = AV49TFHreCanAny_To ;
      AV76Wcdetalleproductosds_15_tfhrefornro = AV50TFHreForNro ;
      AV77Wcdetalleproductosds_16_tfhrefornro_to = AV51TFHreForNro_To ;
      AV78Wcdetalleproductosds_17_tfhreprdtnq = AV52TFHrePrdTnq ;
      AV79Wcdetalleproductosds_18_tfhreprdtnq_to = AV53TFHrePrdTnq_To ;
      AV80Wcdetalleproductosds_19_tfhrelinusr = AV54TFHreLinUsr ;
      AV81Wcdetalleproductosds_20_tfhrelinusr_sel = AV55TFHreLinUsr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Wcdetalleproductosds_1_tfhrereclin) ,
                                           Short.valueOf(AV63Wcdetalleproductosds_2_tfhrereclin_to) ,
                                           AV65Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                           AV64Wcdetalleproductosds_3_tfhreprdnum ,
                                           AV67Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                           AV66Wcdetalleproductosds_5_tfhreprddsc ,
                                           AV68Wcdetalleproductosds_7_tfhrefaccon ,
                                           AV69Wcdetalleproductosds_8_tfhrefaccon_to ,
                                           AV71Wcdetalleproductosds_10_tfhreprduds_sel ,
                                           AV70Wcdetalleproductosds_9_tfhreprduds ,
                                           AV72Wcdetalleproductosds_11_tfhreprdcant ,
                                           AV73Wcdetalleproductosds_12_tfhreprdcant_to ,
                                           AV74Wcdetalleproductosds_13_tfhrecanany ,
                                           AV75Wcdetalleproductosds_14_tfhrecanany_to ,
                                           Byte.valueOf(AV76Wcdetalleproductosds_15_tfhrefornro) ,
                                           Byte.valueOf(AV77Wcdetalleproductosds_16_tfhrefornro_to) ,
                                           Byte.valueOf(AV78Wcdetalleproductosds_17_tfhreprdtnq) ,
                                           Byte.valueOf(AV79Wcdetalleproductosds_18_tfhreprdtnq_to) ,
                                           AV81Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                           AV80Wcdetalleproductosds_19_tfhrelinusr ,
                                           Short.valueOf(A4557HreRecLin) ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4562HreFacCon ,
                                           A4561HrePrdUDs ,
                                           A4563HrePrdCant ,
                                           A4565HreCanAny ,
                                           Byte.valueOf(A4566HreForNro) ,
                                           Byte.valueOf(A4567HrePrdTnq) ,
                                           A4582HreLinUsr ,
                                           A396EmprCod ,
                                           AV33EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV34HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV35HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV36HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV37HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV38HreLinMaq) ,
                                           Byte.valueOf(A4550HreLinPro) ,
                                           Byte.valueOf(AV39HreLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV64Wcdetalleproductosds_3_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV64Wcdetalleproductosds_3_tfhreprdnum), 6, "%") ;
      lV66Wcdetalleproductosds_5_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV66Wcdetalleproductosds_5_tfhreprddsc), 26, "%") ;
      lV70Wcdetalleproductosds_9_tfhreprduds = GXutil.padr( GXutil.rtrim( AV70Wcdetalleproductosds_9_tfhreprduds), 5, "%") ;
      lV80Wcdetalleproductosds_19_tfhrelinusr = GXutil.padr( GXutil.rtrim( AV80Wcdetalleproductosds_19_tfhrelinusr), 8, "%") ;
      /* Using cursor P08ZE2 */
      pr_default.execute(0, new Object[] {AV33EmprCod, Integer.valueOf(AV34HreBarCod), Byte.valueOf(AV35HreBarReo), AV36HreBarPar, Byte.valueOf(AV37HreNumCie), Short.valueOf(AV38HreLinMaq), Byte.valueOf(AV39HreLinPro), Short.valueOf(AV62Wcdetalleproductosds_1_tfhrereclin), Short.valueOf(AV63Wcdetalleproductosds_2_tfhrereclin_to), lV64Wcdetalleproductosds_3_tfhreprdnum, AV65Wcdetalleproductosds_4_tfhreprdnum_sel, lV66Wcdetalleproductosds_5_tfhreprddsc, AV67Wcdetalleproductosds_6_tfhreprddsc_sel, AV68Wcdetalleproductosds_7_tfhrefaccon, AV69Wcdetalleproductosds_8_tfhrefaccon_to, lV70Wcdetalleproductosds_9_tfhreprduds, AV71Wcdetalleproductosds_10_tfhreprduds_sel, AV72Wcdetalleproductosds_11_tfhreprdcant, AV73Wcdetalleproductosds_12_tfhreprdcant_to, AV74Wcdetalleproductosds_13_tfhrecanany, AV75Wcdetalleproductosds_14_tfhrecanany_to, Byte.valueOf(AV76Wcdetalleproductosds_15_tfhrefornro), Byte.valueOf(AV77Wcdetalleproductosds_16_tfhrefornro_to), Byte.valueOf(AV78Wcdetalleproductosds_17_tfhreprdtnq), Byte.valueOf(AV79Wcdetalleproductosds_18_tfhreprdtnq_to), lV80Wcdetalleproductosds_19_tfhrelinusr, AV81Wcdetalleproductosds_20_tfhrelinusr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8ZE2 = false ;
         A396EmprCod = P08ZE2_A396EmprCod[0] ;
         A4492HreBarCod = P08ZE2_A4492HreBarCod[0] ;
         A4493HreBarReo = P08ZE2_A4493HreBarReo[0] ;
         A4494HreBarPar = P08ZE2_A4494HreBarPar[0] ;
         A4495HreNumCie = P08ZE2_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08ZE2_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08ZE2_A4550HreLinPro[0] ;
         A4558HrePrdNum = P08ZE2_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08ZE2_n4558HrePrdNum[0] ;
         A4582HreLinUsr = P08ZE2_A4582HreLinUsr[0] ;
         n4582HreLinUsr = P08ZE2_n4582HreLinUsr[0] ;
         A4567HrePrdTnq = P08ZE2_A4567HrePrdTnq[0] ;
         n4567HrePrdTnq = P08ZE2_n4567HrePrdTnq[0] ;
         A4566HreForNro = P08ZE2_A4566HreForNro[0] ;
         n4566HreForNro = P08ZE2_n4566HreForNro[0] ;
         A4565HreCanAny = P08ZE2_A4565HreCanAny[0] ;
         n4565HreCanAny = P08ZE2_n4565HreCanAny[0] ;
         A4563HrePrdCant = P08ZE2_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08ZE2_n4563HrePrdCant[0] ;
         A4561HrePrdUDs = P08ZE2_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08ZE2_n4561HrePrdUDs[0] ;
         A4562HreFacCon = P08ZE2_A4562HreFacCon[0] ;
         n4562HreFacCon = P08ZE2_n4562HreFacCon[0] ;
         A4559HrePrdDsc = P08ZE2_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08ZE2_n4559HrePrdDsc[0] ;
         A4557HreRecLin = P08ZE2_A4557HreRecLin[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08ZE2_A4558HrePrdNum[0], A4558HrePrdNum) == 0 ) )
         {
            brk8ZE2 = false ;
            A396EmprCod = P08ZE2_A396EmprCod[0] ;
            A4492HreBarCod = P08ZE2_A4492HreBarCod[0] ;
            A4493HreBarReo = P08ZE2_A4493HreBarReo[0] ;
            A4494HreBarPar = P08ZE2_A4494HreBarPar[0] ;
            A4495HreNumCie = P08ZE2_A4495HreNumCie[0] ;
            A4545HreLinMaq = P08ZE2_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08ZE2_A4550HreLinPro[0] ;
            A4557HreRecLin = P08ZE2_A4557HreRecLin[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8ZE2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4558HrePrdNum)==0) )
         {
            AV18Option = A4558HrePrdNum ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZE2 )
         {
            brk8ZE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHREPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFHrePrdDsc = AV14SearchTxt ;
      AV13TFHrePrdDsc_Sel = "" ;
      AV62Wcdetalleproductosds_1_tfhrereclin = AV56TFHreRecLin ;
      AV63Wcdetalleproductosds_2_tfhrereclin_to = AV57TFHreRecLin_To ;
      AV64Wcdetalleproductosds_3_tfhreprdnum = AV10TFHrePrdNum ;
      AV65Wcdetalleproductosds_4_tfhreprdnum_sel = AV11TFHrePrdNum_Sel ;
      AV66Wcdetalleproductosds_5_tfhreprddsc = AV12TFHrePrdDsc ;
      AV67Wcdetalleproductosds_6_tfhreprddsc_sel = AV13TFHrePrdDsc_Sel ;
      AV68Wcdetalleproductosds_7_tfhrefaccon = AV40TFHreFacCon ;
      AV69Wcdetalleproductosds_8_tfhrefaccon_to = AV41TFHreFacCon_To ;
      AV70Wcdetalleproductosds_9_tfhreprduds = AV42TFHrePrdUDs ;
      AV71Wcdetalleproductosds_10_tfhreprduds_sel = AV43TFHrePrdUDs_Sel ;
      AV72Wcdetalleproductosds_11_tfhreprdcant = AV44TFHrePrdCant ;
      AV73Wcdetalleproductosds_12_tfhreprdcant_to = AV45TFHrePrdCant_To ;
      AV74Wcdetalleproductosds_13_tfhrecanany = AV48TFHreCanAny ;
      AV75Wcdetalleproductosds_14_tfhrecanany_to = AV49TFHreCanAny_To ;
      AV76Wcdetalleproductosds_15_tfhrefornro = AV50TFHreForNro ;
      AV77Wcdetalleproductosds_16_tfhrefornro_to = AV51TFHreForNro_To ;
      AV78Wcdetalleproductosds_17_tfhreprdtnq = AV52TFHrePrdTnq ;
      AV79Wcdetalleproductosds_18_tfhreprdtnq_to = AV53TFHrePrdTnq_To ;
      AV80Wcdetalleproductosds_19_tfhrelinusr = AV54TFHreLinUsr ;
      AV81Wcdetalleproductosds_20_tfhrelinusr_sel = AV55TFHreLinUsr_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Wcdetalleproductosds_1_tfhrereclin) ,
                                           Short.valueOf(AV63Wcdetalleproductosds_2_tfhrereclin_to) ,
                                           AV65Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                           AV64Wcdetalleproductosds_3_tfhreprdnum ,
                                           AV67Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                           AV66Wcdetalleproductosds_5_tfhreprddsc ,
                                           AV68Wcdetalleproductosds_7_tfhrefaccon ,
                                           AV69Wcdetalleproductosds_8_tfhrefaccon_to ,
                                           AV71Wcdetalleproductosds_10_tfhreprduds_sel ,
                                           AV70Wcdetalleproductosds_9_tfhreprduds ,
                                           AV72Wcdetalleproductosds_11_tfhreprdcant ,
                                           AV73Wcdetalleproductosds_12_tfhreprdcant_to ,
                                           AV74Wcdetalleproductosds_13_tfhrecanany ,
                                           AV75Wcdetalleproductosds_14_tfhrecanany_to ,
                                           Byte.valueOf(AV76Wcdetalleproductosds_15_tfhrefornro) ,
                                           Byte.valueOf(AV77Wcdetalleproductosds_16_tfhrefornro_to) ,
                                           Byte.valueOf(AV78Wcdetalleproductosds_17_tfhreprdtnq) ,
                                           Byte.valueOf(AV79Wcdetalleproductosds_18_tfhreprdtnq_to) ,
                                           AV81Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                           AV80Wcdetalleproductosds_19_tfhrelinusr ,
                                           Short.valueOf(A4557HreRecLin) ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4562HreFacCon ,
                                           A4561HrePrdUDs ,
                                           A4563HrePrdCant ,
                                           A4565HreCanAny ,
                                           Byte.valueOf(A4566HreForNro) ,
                                           Byte.valueOf(A4567HrePrdTnq) ,
                                           A4582HreLinUsr ,
                                           A396EmprCod ,
                                           AV33EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV34HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV35HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV36HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV37HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV38HreLinMaq) ,
                                           Byte.valueOf(A4550HreLinPro) ,
                                           Byte.valueOf(AV39HreLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV64Wcdetalleproductosds_3_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV64Wcdetalleproductosds_3_tfhreprdnum), 6, "%") ;
      lV66Wcdetalleproductosds_5_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV66Wcdetalleproductosds_5_tfhreprddsc), 26, "%") ;
      lV70Wcdetalleproductosds_9_tfhreprduds = GXutil.padr( GXutil.rtrim( AV70Wcdetalleproductosds_9_tfhreprduds), 5, "%") ;
      lV80Wcdetalleproductosds_19_tfhrelinusr = GXutil.padr( GXutil.rtrim( AV80Wcdetalleproductosds_19_tfhrelinusr), 8, "%") ;
      /* Using cursor P08ZE3 */
      pr_default.execute(1, new Object[] {AV33EmprCod, Integer.valueOf(AV34HreBarCod), Byte.valueOf(AV35HreBarReo), AV36HreBarPar, Byte.valueOf(AV37HreNumCie), Short.valueOf(AV38HreLinMaq), Byte.valueOf(AV39HreLinPro), Short.valueOf(AV62Wcdetalleproductosds_1_tfhrereclin), Short.valueOf(AV63Wcdetalleproductosds_2_tfhrereclin_to), lV64Wcdetalleproductosds_3_tfhreprdnum, AV65Wcdetalleproductosds_4_tfhreprdnum_sel, lV66Wcdetalleproductosds_5_tfhreprddsc, AV67Wcdetalleproductosds_6_tfhreprddsc_sel, AV68Wcdetalleproductosds_7_tfhrefaccon, AV69Wcdetalleproductosds_8_tfhrefaccon_to, lV70Wcdetalleproductosds_9_tfhreprduds, AV71Wcdetalleproductosds_10_tfhreprduds_sel, AV72Wcdetalleproductosds_11_tfhreprdcant, AV73Wcdetalleproductosds_12_tfhreprdcant_to, AV74Wcdetalleproductosds_13_tfhrecanany, AV75Wcdetalleproductosds_14_tfhrecanany_to, Byte.valueOf(AV76Wcdetalleproductosds_15_tfhrefornro), Byte.valueOf(AV77Wcdetalleproductosds_16_tfhrefornro_to), Byte.valueOf(AV78Wcdetalleproductosds_17_tfhreprdtnq), Byte.valueOf(AV79Wcdetalleproductosds_18_tfhreprdtnq_to), lV80Wcdetalleproductosds_19_tfhrelinusr, AV81Wcdetalleproductosds_20_tfhrelinusr_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8ZE4 = false ;
         A396EmprCod = P08ZE3_A396EmprCod[0] ;
         A4492HreBarCod = P08ZE3_A4492HreBarCod[0] ;
         A4493HreBarReo = P08ZE3_A4493HreBarReo[0] ;
         A4494HreBarPar = P08ZE3_A4494HreBarPar[0] ;
         A4495HreNumCie = P08ZE3_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08ZE3_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08ZE3_A4550HreLinPro[0] ;
         A4559HrePrdDsc = P08ZE3_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08ZE3_n4559HrePrdDsc[0] ;
         A4582HreLinUsr = P08ZE3_A4582HreLinUsr[0] ;
         n4582HreLinUsr = P08ZE3_n4582HreLinUsr[0] ;
         A4567HrePrdTnq = P08ZE3_A4567HrePrdTnq[0] ;
         n4567HrePrdTnq = P08ZE3_n4567HrePrdTnq[0] ;
         A4566HreForNro = P08ZE3_A4566HreForNro[0] ;
         n4566HreForNro = P08ZE3_n4566HreForNro[0] ;
         A4565HreCanAny = P08ZE3_A4565HreCanAny[0] ;
         n4565HreCanAny = P08ZE3_n4565HreCanAny[0] ;
         A4563HrePrdCant = P08ZE3_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08ZE3_n4563HrePrdCant[0] ;
         A4561HrePrdUDs = P08ZE3_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08ZE3_n4561HrePrdUDs[0] ;
         A4562HreFacCon = P08ZE3_A4562HreFacCon[0] ;
         n4562HreFacCon = P08ZE3_n4562HreFacCon[0] ;
         A4558HrePrdNum = P08ZE3_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08ZE3_n4558HrePrdNum[0] ;
         A4557HreRecLin = P08ZE3_A4557HreRecLin[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08ZE3_A4559HrePrdDsc[0], A4559HrePrdDsc) == 0 ) )
         {
            brk8ZE4 = false ;
            A396EmprCod = P08ZE3_A396EmprCod[0] ;
            A4492HreBarCod = P08ZE3_A4492HreBarCod[0] ;
            A4493HreBarReo = P08ZE3_A4493HreBarReo[0] ;
            A4494HreBarPar = P08ZE3_A4494HreBarPar[0] ;
            A4495HreNumCie = P08ZE3_A4495HreNumCie[0] ;
            A4545HreLinMaq = P08ZE3_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08ZE3_A4550HreLinPro[0] ;
            A4557HreRecLin = P08ZE3_A4557HreRecLin[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8ZE4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4559HrePrdDsc)==0) )
         {
            AV18Option = A4559HrePrdDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZE4 )
         {
            brk8ZE4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHREPRDUDSOPTIONS' Routine */
      returnInSub = false ;
      AV42TFHrePrdUDs = AV14SearchTxt ;
      AV43TFHrePrdUDs_Sel = "" ;
      AV62Wcdetalleproductosds_1_tfhrereclin = AV56TFHreRecLin ;
      AV63Wcdetalleproductosds_2_tfhrereclin_to = AV57TFHreRecLin_To ;
      AV64Wcdetalleproductosds_3_tfhreprdnum = AV10TFHrePrdNum ;
      AV65Wcdetalleproductosds_4_tfhreprdnum_sel = AV11TFHrePrdNum_Sel ;
      AV66Wcdetalleproductosds_5_tfhreprddsc = AV12TFHrePrdDsc ;
      AV67Wcdetalleproductosds_6_tfhreprddsc_sel = AV13TFHrePrdDsc_Sel ;
      AV68Wcdetalleproductosds_7_tfhrefaccon = AV40TFHreFacCon ;
      AV69Wcdetalleproductosds_8_tfhrefaccon_to = AV41TFHreFacCon_To ;
      AV70Wcdetalleproductosds_9_tfhreprduds = AV42TFHrePrdUDs ;
      AV71Wcdetalleproductosds_10_tfhreprduds_sel = AV43TFHrePrdUDs_Sel ;
      AV72Wcdetalleproductosds_11_tfhreprdcant = AV44TFHrePrdCant ;
      AV73Wcdetalleproductosds_12_tfhreprdcant_to = AV45TFHrePrdCant_To ;
      AV74Wcdetalleproductosds_13_tfhrecanany = AV48TFHreCanAny ;
      AV75Wcdetalleproductosds_14_tfhrecanany_to = AV49TFHreCanAny_To ;
      AV76Wcdetalleproductosds_15_tfhrefornro = AV50TFHreForNro ;
      AV77Wcdetalleproductosds_16_tfhrefornro_to = AV51TFHreForNro_To ;
      AV78Wcdetalleproductosds_17_tfhreprdtnq = AV52TFHrePrdTnq ;
      AV79Wcdetalleproductosds_18_tfhreprdtnq_to = AV53TFHrePrdTnq_To ;
      AV80Wcdetalleproductosds_19_tfhrelinusr = AV54TFHreLinUsr ;
      AV81Wcdetalleproductosds_20_tfhrelinusr_sel = AV55TFHreLinUsr_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Wcdetalleproductosds_1_tfhrereclin) ,
                                           Short.valueOf(AV63Wcdetalleproductosds_2_tfhrereclin_to) ,
                                           AV65Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                           AV64Wcdetalleproductosds_3_tfhreprdnum ,
                                           AV67Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                           AV66Wcdetalleproductosds_5_tfhreprddsc ,
                                           AV68Wcdetalleproductosds_7_tfhrefaccon ,
                                           AV69Wcdetalleproductosds_8_tfhrefaccon_to ,
                                           AV71Wcdetalleproductosds_10_tfhreprduds_sel ,
                                           AV70Wcdetalleproductosds_9_tfhreprduds ,
                                           AV72Wcdetalleproductosds_11_tfhreprdcant ,
                                           AV73Wcdetalleproductosds_12_tfhreprdcant_to ,
                                           AV74Wcdetalleproductosds_13_tfhrecanany ,
                                           AV75Wcdetalleproductosds_14_tfhrecanany_to ,
                                           Byte.valueOf(AV76Wcdetalleproductosds_15_tfhrefornro) ,
                                           Byte.valueOf(AV77Wcdetalleproductosds_16_tfhrefornro_to) ,
                                           Byte.valueOf(AV78Wcdetalleproductosds_17_tfhreprdtnq) ,
                                           Byte.valueOf(AV79Wcdetalleproductosds_18_tfhreprdtnq_to) ,
                                           AV81Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                           AV80Wcdetalleproductosds_19_tfhrelinusr ,
                                           Short.valueOf(A4557HreRecLin) ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4562HreFacCon ,
                                           A4561HrePrdUDs ,
                                           A4563HrePrdCant ,
                                           A4565HreCanAny ,
                                           Byte.valueOf(A4566HreForNro) ,
                                           Byte.valueOf(A4567HrePrdTnq) ,
                                           A4582HreLinUsr ,
                                           A396EmprCod ,
                                           AV33EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV34HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV35HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV36HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV37HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV38HreLinMaq) ,
                                           Byte.valueOf(A4550HreLinPro) ,
                                           Byte.valueOf(AV39HreLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV64Wcdetalleproductosds_3_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV64Wcdetalleproductosds_3_tfhreprdnum), 6, "%") ;
      lV66Wcdetalleproductosds_5_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV66Wcdetalleproductosds_5_tfhreprddsc), 26, "%") ;
      lV70Wcdetalleproductosds_9_tfhreprduds = GXutil.padr( GXutil.rtrim( AV70Wcdetalleproductosds_9_tfhreprduds), 5, "%") ;
      lV80Wcdetalleproductosds_19_tfhrelinusr = GXutil.padr( GXutil.rtrim( AV80Wcdetalleproductosds_19_tfhrelinusr), 8, "%") ;
      /* Using cursor P08ZE4 */
      pr_default.execute(2, new Object[] {AV33EmprCod, Integer.valueOf(AV34HreBarCod), Byte.valueOf(AV35HreBarReo), AV36HreBarPar, Byte.valueOf(AV37HreNumCie), Short.valueOf(AV38HreLinMaq), Byte.valueOf(AV39HreLinPro), Short.valueOf(AV62Wcdetalleproductosds_1_tfhrereclin), Short.valueOf(AV63Wcdetalleproductosds_2_tfhrereclin_to), lV64Wcdetalleproductosds_3_tfhreprdnum, AV65Wcdetalleproductosds_4_tfhreprdnum_sel, lV66Wcdetalleproductosds_5_tfhreprddsc, AV67Wcdetalleproductosds_6_tfhreprddsc_sel, AV68Wcdetalleproductosds_7_tfhrefaccon, AV69Wcdetalleproductosds_8_tfhrefaccon_to, lV70Wcdetalleproductosds_9_tfhreprduds, AV71Wcdetalleproductosds_10_tfhreprduds_sel, AV72Wcdetalleproductosds_11_tfhreprdcant, AV73Wcdetalleproductosds_12_tfhreprdcant_to, AV74Wcdetalleproductosds_13_tfhrecanany, AV75Wcdetalleproductosds_14_tfhrecanany_to, Byte.valueOf(AV76Wcdetalleproductosds_15_tfhrefornro), Byte.valueOf(AV77Wcdetalleproductosds_16_tfhrefornro_to), Byte.valueOf(AV78Wcdetalleproductosds_17_tfhreprdtnq), Byte.valueOf(AV79Wcdetalleproductosds_18_tfhreprdtnq_to), lV80Wcdetalleproductosds_19_tfhrelinusr, AV81Wcdetalleproductosds_20_tfhrelinusr_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8ZE6 = false ;
         A396EmprCod = P08ZE4_A396EmprCod[0] ;
         A4492HreBarCod = P08ZE4_A4492HreBarCod[0] ;
         A4493HreBarReo = P08ZE4_A4493HreBarReo[0] ;
         A4494HreBarPar = P08ZE4_A4494HreBarPar[0] ;
         A4495HreNumCie = P08ZE4_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08ZE4_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08ZE4_A4550HreLinPro[0] ;
         A4561HrePrdUDs = P08ZE4_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08ZE4_n4561HrePrdUDs[0] ;
         A4582HreLinUsr = P08ZE4_A4582HreLinUsr[0] ;
         n4582HreLinUsr = P08ZE4_n4582HreLinUsr[0] ;
         A4567HrePrdTnq = P08ZE4_A4567HrePrdTnq[0] ;
         n4567HrePrdTnq = P08ZE4_n4567HrePrdTnq[0] ;
         A4566HreForNro = P08ZE4_A4566HreForNro[0] ;
         n4566HreForNro = P08ZE4_n4566HreForNro[0] ;
         A4565HreCanAny = P08ZE4_A4565HreCanAny[0] ;
         n4565HreCanAny = P08ZE4_n4565HreCanAny[0] ;
         A4563HrePrdCant = P08ZE4_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08ZE4_n4563HrePrdCant[0] ;
         A4562HreFacCon = P08ZE4_A4562HreFacCon[0] ;
         n4562HreFacCon = P08ZE4_n4562HreFacCon[0] ;
         A4559HrePrdDsc = P08ZE4_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08ZE4_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P08ZE4_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08ZE4_n4558HrePrdNum[0] ;
         A4557HreRecLin = P08ZE4_A4557HreRecLin[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08ZE4_A4561HrePrdUDs[0], A4561HrePrdUDs) == 0 ) )
         {
            brk8ZE6 = false ;
            A396EmprCod = P08ZE4_A396EmprCod[0] ;
            A4492HreBarCod = P08ZE4_A4492HreBarCod[0] ;
            A4493HreBarReo = P08ZE4_A4493HreBarReo[0] ;
            A4494HreBarPar = P08ZE4_A4494HreBarPar[0] ;
            A4495HreNumCie = P08ZE4_A4495HreNumCie[0] ;
            A4545HreLinMaq = P08ZE4_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08ZE4_A4550HreLinPro[0] ;
            A4557HreRecLin = P08ZE4_A4557HreRecLin[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8ZE6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4561HrePrdUDs)==0) )
         {
            AV18Option = A4561HrePrdUDs ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZE6 )
         {
            brk8ZE6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADHRELINUSROPTIONS' Routine */
      returnInSub = false ;
      AV54TFHreLinUsr = AV14SearchTxt ;
      AV55TFHreLinUsr_Sel = "" ;
      AV62Wcdetalleproductosds_1_tfhrereclin = AV56TFHreRecLin ;
      AV63Wcdetalleproductosds_2_tfhrereclin_to = AV57TFHreRecLin_To ;
      AV64Wcdetalleproductosds_3_tfhreprdnum = AV10TFHrePrdNum ;
      AV65Wcdetalleproductosds_4_tfhreprdnum_sel = AV11TFHrePrdNum_Sel ;
      AV66Wcdetalleproductosds_5_tfhreprddsc = AV12TFHrePrdDsc ;
      AV67Wcdetalleproductosds_6_tfhreprddsc_sel = AV13TFHrePrdDsc_Sel ;
      AV68Wcdetalleproductosds_7_tfhrefaccon = AV40TFHreFacCon ;
      AV69Wcdetalleproductosds_8_tfhrefaccon_to = AV41TFHreFacCon_To ;
      AV70Wcdetalleproductosds_9_tfhreprduds = AV42TFHrePrdUDs ;
      AV71Wcdetalleproductosds_10_tfhreprduds_sel = AV43TFHrePrdUDs_Sel ;
      AV72Wcdetalleproductosds_11_tfhreprdcant = AV44TFHrePrdCant ;
      AV73Wcdetalleproductosds_12_tfhreprdcant_to = AV45TFHrePrdCant_To ;
      AV74Wcdetalleproductosds_13_tfhrecanany = AV48TFHreCanAny ;
      AV75Wcdetalleproductosds_14_tfhrecanany_to = AV49TFHreCanAny_To ;
      AV76Wcdetalleproductosds_15_tfhrefornro = AV50TFHreForNro ;
      AV77Wcdetalleproductosds_16_tfhrefornro_to = AV51TFHreForNro_To ;
      AV78Wcdetalleproductosds_17_tfhreprdtnq = AV52TFHrePrdTnq ;
      AV79Wcdetalleproductosds_18_tfhreprdtnq_to = AV53TFHrePrdTnq_To ;
      AV80Wcdetalleproductosds_19_tfhrelinusr = AV54TFHreLinUsr ;
      AV81Wcdetalleproductosds_20_tfhrelinusr_sel = AV55TFHreLinUsr_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Wcdetalleproductosds_1_tfhrereclin) ,
                                           Short.valueOf(AV63Wcdetalleproductosds_2_tfhrereclin_to) ,
                                           AV65Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                           AV64Wcdetalleproductosds_3_tfhreprdnum ,
                                           AV67Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                           AV66Wcdetalleproductosds_5_tfhreprddsc ,
                                           AV68Wcdetalleproductosds_7_tfhrefaccon ,
                                           AV69Wcdetalleproductosds_8_tfhrefaccon_to ,
                                           AV71Wcdetalleproductosds_10_tfhreprduds_sel ,
                                           AV70Wcdetalleproductosds_9_tfhreprduds ,
                                           AV72Wcdetalleproductosds_11_tfhreprdcant ,
                                           AV73Wcdetalleproductosds_12_tfhreprdcant_to ,
                                           AV74Wcdetalleproductosds_13_tfhrecanany ,
                                           AV75Wcdetalleproductosds_14_tfhrecanany_to ,
                                           Byte.valueOf(AV76Wcdetalleproductosds_15_tfhrefornro) ,
                                           Byte.valueOf(AV77Wcdetalleproductosds_16_tfhrefornro_to) ,
                                           Byte.valueOf(AV78Wcdetalleproductosds_17_tfhreprdtnq) ,
                                           Byte.valueOf(AV79Wcdetalleproductosds_18_tfhreprdtnq_to) ,
                                           AV81Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                           AV80Wcdetalleproductosds_19_tfhrelinusr ,
                                           Short.valueOf(A4557HreRecLin) ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4562HreFacCon ,
                                           A4561HrePrdUDs ,
                                           A4563HrePrdCant ,
                                           A4565HreCanAny ,
                                           Byte.valueOf(A4566HreForNro) ,
                                           Byte.valueOf(A4567HrePrdTnq) ,
                                           A4582HreLinUsr ,
                                           A396EmprCod ,
                                           AV33EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV34HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV35HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV36HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV37HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV38HreLinMaq) ,
                                           Byte.valueOf(A4550HreLinPro) ,
                                           Byte.valueOf(AV39HreLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV64Wcdetalleproductosds_3_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV64Wcdetalleproductosds_3_tfhreprdnum), 6, "%") ;
      lV66Wcdetalleproductosds_5_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV66Wcdetalleproductosds_5_tfhreprddsc), 26, "%") ;
      lV70Wcdetalleproductosds_9_tfhreprduds = GXutil.padr( GXutil.rtrim( AV70Wcdetalleproductosds_9_tfhreprduds), 5, "%") ;
      lV80Wcdetalleproductosds_19_tfhrelinusr = GXutil.padr( GXutil.rtrim( AV80Wcdetalleproductosds_19_tfhrelinusr), 8, "%") ;
      /* Using cursor P08ZE5 */
      pr_default.execute(3, new Object[] {AV33EmprCod, Integer.valueOf(AV34HreBarCod), Byte.valueOf(AV35HreBarReo), AV36HreBarPar, Byte.valueOf(AV37HreNumCie), Short.valueOf(AV38HreLinMaq), Byte.valueOf(AV39HreLinPro), Short.valueOf(AV62Wcdetalleproductosds_1_tfhrereclin), Short.valueOf(AV63Wcdetalleproductosds_2_tfhrereclin_to), lV64Wcdetalleproductosds_3_tfhreprdnum, AV65Wcdetalleproductosds_4_tfhreprdnum_sel, lV66Wcdetalleproductosds_5_tfhreprddsc, AV67Wcdetalleproductosds_6_tfhreprddsc_sel, AV68Wcdetalleproductosds_7_tfhrefaccon, AV69Wcdetalleproductosds_8_tfhrefaccon_to, lV70Wcdetalleproductosds_9_tfhreprduds, AV71Wcdetalleproductosds_10_tfhreprduds_sel, AV72Wcdetalleproductosds_11_tfhreprdcant, AV73Wcdetalleproductosds_12_tfhreprdcant_to, AV74Wcdetalleproductosds_13_tfhrecanany, AV75Wcdetalleproductosds_14_tfhrecanany_to, Byte.valueOf(AV76Wcdetalleproductosds_15_tfhrefornro), Byte.valueOf(AV77Wcdetalleproductosds_16_tfhrefornro_to), Byte.valueOf(AV78Wcdetalleproductosds_17_tfhreprdtnq), Byte.valueOf(AV79Wcdetalleproductosds_18_tfhreprdtnq_to), lV80Wcdetalleproductosds_19_tfhrelinusr, AV81Wcdetalleproductosds_20_tfhrelinusr_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8ZE8 = false ;
         A396EmprCod = P08ZE5_A396EmprCod[0] ;
         A4492HreBarCod = P08ZE5_A4492HreBarCod[0] ;
         A4493HreBarReo = P08ZE5_A4493HreBarReo[0] ;
         A4494HreBarPar = P08ZE5_A4494HreBarPar[0] ;
         A4495HreNumCie = P08ZE5_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08ZE5_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08ZE5_A4550HreLinPro[0] ;
         A4582HreLinUsr = P08ZE5_A4582HreLinUsr[0] ;
         n4582HreLinUsr = P08ZE5_n4582HreLinUsr[0] ;
         A4567HrePrdTnq = P08ZE5_A4567HrePrdTnq[0] ;
         n4567HrePrdTnq = P08ZE5_n4567HrePrdTnq[0] ;
         A4566HreForNro = P08ZE5_A4566HreForNro[0] ;
         n4566HreForNro = P08ZE5_n4566HreForNro[0] ;
         A4565HreCanAny = P08ZE5_A4565HreCanAny[0] ;
         n4565HreCanAny = P08ZE5_n4565HreCanAny[0] ;
         A4563HrePrdCant = P08ZE5_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08ZE5_n4563HrePrdCant[0] ;
         A4561HrePrdUDs = P08ZE5_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08ZE5_n4561HrePrdUDs[0] ;
         A4562HreFacCon = P08ZE5_A4562HreFacCon[0] ;
         n4562HreFacCon = P08ZE5_n4562HreFacCon[0] ;
         A4559HrePrdDsc = P08ZE5_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08ZE5_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P08ZE5_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08ZE5_n4558HrePrdNum[0] ;
         A4557HreRecLin = P08ZE5_A4557HreRecLin[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08ZE5_A4582HreLinUsr[0], A4582HreLinUsr) == 0 ) )
         {
            brk8ZE8 = false ;
            A396EmprCod = P08ZE5_A396EmprCod[0] ;
            A4492HreBarCod = P08ZE5_A4492HreBarCod[0] ;
            A4493HreBarReo = P08ZE5_A4493HreBarReo[0] ;
            A4494HreBarPar = P08ZE5_A4494HreBarPar[0] ;
            A4495HreNumCie = P08ZE5_A4495HreNumCie[0] ;
            A4545HreLinMaq = P08ZE5_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08ZE5_A4550HreLinPro[0] ;
            A4557HreRecLin = P08ZE5_A4557HreRecLin[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8ZE8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4582HreLinUsr)==0) )
         {
            AV18Option = A4582HreLinUsr ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4582HreLinUsr, "@!"))) ;
            AV19Options.add(AV18Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZE8 )
         {
            brk8ZE8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcdetalleproductosgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = wcdetalleproductosgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = wcdetalleproductosgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFHrePrdNum = "" ;
      AV11TFHrePrdNum_Sel = "" ;
      AV12TFHrePrdDsc = "" ;
      AV13TFHrePrdDsc_Sel = "" ;
      AV40TFHreFacCon = DecimalUtil.ZERO ;
      AV41TFHreFacCon_To = DecimalUtil.ZERO ;
      AV42TFHrePrdUDs = "" ;
      AV43TFHrePrdUDs_Sel = "" ;
      AV44TFHrePrdCant = DecimalUtil.ZERO ;
      AV45TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV48TFHreCanAny = DecimalUtil.ZERO ;
      AV49TFHreCanAny_To = DecimalUtil.ZERO ;
      AV54TFHreLinUsr = "" ;
      AV55TFHreLinUsr_Sel = "" ;
      AV33EmprCod = "" ;
      AV36HreBarPar = "" ;
      A4558HrePrdNum = "" ;
      AV64Wcdetalleproductosds_3_tfhreprdnum = "" ;
      AV65Wcdetalleproductosds_4_tfhreprdnum_sel = "" ;
      AV66Wcdetalleproductosds_5_tfhreprddsc = "" ;
      AV67Wcdetalleproductosds_6_tfhreprddsc_sel = "" ;
      AV68Wcdetalleproductosds_7_tfhrefaccon = DecimalUtil.ZERO ;
      AV69Wcdetalleproductosds_8_tfhrefaccon_to = DecimalUtil.ZERO ;
      AV70Wcdetalleproductosds_9_tfhreprduds = "" ;
      AV71Wcdetalleproductosds_10_tfhreprduds_sel = "" ;
      AV72Wcdetalleproductosds_11_tfhreprdcant = DecimalUtil.ZERO ;
      AV73Wcdetalleproductosds_12_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV74Wcdetalleproductosds_13_tfhrecanany = DecimalUtil.ZERO ;
      AV75Wcdetalleproductosds_14_tfhrecanany_to = DecimalUtil.ZERO ;
      AV80Wcdetalleproductosds_19_tfhrelinusr = "" ;
      AV81Wcdetalleproductosds_20_tfhrelinusr_sel = "" ;
      scmdbuf = "" ;
      lV64Wcdetalleproductosds_3_tfhreprdnum = "" ;
      lV66Wcdetalleproductosds_5_tfhreprddsc = "" ;
      lV70Wcdetalleproductosds_9_tfhreprduds = "" ;
      lV80Wcdetalleproductosds_19_tfhrelinusr = "" ;
      A4559HrePrdDsc = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4582HreLinUsr = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08ZE2_A396EmprCod = new String[] {""} ;
      P08ZE2_A4492HreBarCod = new int[1] ;
      P08ZE2_A4493HreBarReo = new byte[1] ;
      P08ZE2_A4494HreBarPar = new String[] {""} ;
      P08ZE2_A4495HreNumCie = new byte[1] ;
      P08ZE2_A4545HreLinMaq = new short[1] ;
      P08ZE2_A4550HreLinPro = new byte[1] ;
      P08ZE2_A4558HrePrdNum = new String[] {""} ;
      P08ZE2_n4558HrePrdNum = new boolean[] {false} ;
      P08ZE2_A4582HreLinUsr = new String[] {""} ;
      P08ZE2_n4582HreLinUsr = new boolean[] {false} ;
      P08ZE2_A4567HrePrdTnq = new byte[1] ;
      P08ZE2_n4567HrePrdTnq = new boolean[] {false} ;
      P08ZE2_A4566HreForNro = new byte[1] ;
      P08ZE2_n4566HreForNro = new boolean[] {false} ;
      P08ZE2_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE2_n4565HreCanAny = new boolean[] {false} ;
      P08ZE2_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE2_n4563HrePrdCant = new boolean[] {false} ;
      P08ZE2_A4561HrePrdUDs = new String[] {""} ;
      P08ZE2_n4561HrePrdUDs = new boolean[] {false} ;
      P08ZE2_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE2_n4562HreFacCon = new boolean[] {false} ;
      P08ZE2_A4559HrePrdDsc = new String[] {""} ;
      P08ZE2_n4559HrePrdDsc = new boolean[] {false} ;
      P08ZE2_A4557HreRecLin = new short[1] ;
      AV18Option = "" ;
      P08ZE3_A396EmprCod = new String[] {""} ;
      P08ZE3_A4492HreBarCod = new int[1] ;
      P08ZE3_A4493HreBarReo = new byte[1] ;
      P08ZE3_A4494HreBarPar = new String[] {""} ;
      P08ZE3_A4495HreNumCie = new byte[1] ;
      P08ZE3_A4545HreLinMaq = new short[1] ;
      P08ZE3_A4550HreLinPro = new byte[1] ;
      P08ZE3_A4559HrePrdDsc = new String[] {""} ;
      P08ZE3_n4559HrePrdDsc = new boolean[] {false} ;
      P08ZE3_A4582HreLinUsr = new String[] {""} ;
      P08ZE3_n4582HreLinUsr = new boolean[] {false} ;
      P08ZE3_A4567HrePrdTnq = new byte[1] ;
      P08ZE3_n4567HrePrdTnq = new boolean[] {false} ;
      P08ZE3_A4566HreForNro = new byte[1] ;
      P08ZE3_n4566HreForNro = new boolean[] {false} ;
      P08ZE3_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE3_n4565HreCanAny = new boolean[] {false} ;
      P08ZE3_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE3_n4563HrePrdCant = new boolean[] {false} ;
      P08ZE3_A4561HrePrdUDs = new String[] {""} ;
      P08ZE3_n4561HrePrdUDs = new boolean[] {false} ;
      P08ZE3_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE3_n4562HreFacCon = new boolean[] {false} ;
      P08ZE3_A4558HrePrdNum = new String[] {""} ;
      P08ZE3_n4558HrePrdNum = new boolean[] {false} ;
      P08ZE3_A4557HreRecLin = new short[1] ;
      P08ZE4_A396EmprCod = new String[] {""} ;
      P08ZE4_A4492HreBarCod = new int[1] ;
      P08ZE4_A4493HreBarReo = new byte[1] ;
      P08ZE4_A4494HreBarPar = new String[] {""} ;
      P08ZE4_A4495HreNumCie = new byte[1] ;
      P08ZE4_A4545HreLinMaq = new short[1] ;
      P08ZE4_A4550HreLinPro = new byte[1] ;
      P08ZE4_A4561HrePrdUDs = new String[] {""} ;
      P08ZE4_n4561HrePrdUDs = new boolean[] {false} ;
      P08ZE4_A4582HreLinUsr = new String[] {""} ;
      P08ZE4_n4582HreLinUsr = new boolean[] {false} ;
      P08ZE4_A4567HrePrdTnq = new byte[1] ;
      P08ZE4_n4567HrePrdTnq = new boolean[] {false} ;
      P08ZE4_A4566HreForNro = new byte[1] ;
      P08ZE4_n4566HreForNro = new boolean[] {false} ;
      P08ZE4_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE4_n4565HreCanAny = new boolean[] {false} ;
      P08ZE4_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE4_n4563HrePrdCant = new boolean[] {false} ;
      P08ZE4_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE4_n4562HreFacCon = new boolean[] {false} ;
      P08ZE4_A4559HrePrdDsc = new String[] {""} ;
      P08ZE4_n4559HrePrdDsc = new boolean[] {false} ;
      P08ZE4_A4558HrePrdNum = new String[] {""} ;
      P08ZE4_n4558HrePrdNum = new boolean[] {false} ;
      P08ZE4_A4557HreRecLin = new short[1] ;
      P08ZE5_A396EmprCod = new String[] {""} ;
      P08ZE5_A4492HreBarCod = new int[1] ;
      P08ZE5_A4493HreBarReo = new byte[1] ;
      P08ZE5_A4494HreBarPar = new String[] {""} ;
      P08ZE5_A4495HreNumCie = new byte[1] ;
      P08ZE5_A4545HreLinMaq = new short[1] ;
      P08ZE5_A4550HreLinPro = new byte[1] ;
      P08ZE5_A4582HreLinUsr = new String[] {""} ;
      P08ZE5_n4582HreLinUsr = new boolean[] {false} ;
      P08ZE5_A4567HrePrdTnq = new byte[1] ;
      P08ZE5_n4567HrePrdTnq = new boolean[] {false} ;
      P08ZE5_A4566HreForNro = new byte[1] ;
      P08ZE5_n4566HreForNro = new boolean[] {false} ;
      P08ZE5_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE5_n4565HreCanAny = new boolean[] {false} ;
      P08ZE5_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE5_n4563HrePrdCant = new boolean[] {false} ;
      P08ZE5_A4561HrePrdUDs = new String[] {""} ;
      P08ZE5_n4561HrePrdUDs = new boolean[] {false} ;
      P08ZE5_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZE5_n4562HreFacCon = new boolean[] {false} ;
      P08ZE5_A4559HrePrdDsc = new String[] {""} ;
      P08ZE5_n4559HrePrdDsc = new boolean[] {false} ;
      P08ZE5_A4558HrePrdNum = new String[] {""} ;
      P08ZE5_n4558HrePrdNum = new boolean[] {false} ;
      P08ZE5_A4557HreRecLin = new short[1] ;
      AV21OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetalleproductosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08ZE2_A396EmprCod, P08ZE2_A4492HreBarCod, P08ZE2_A4493HreBarReo, P08ZE2_A4494HreBarPar, P08ZE2_A4495HreNumCie, P08ZE2_A4545HreLinMaq, P08ZE2_A4550HreLinPro, P08ZE2_A4558HrePrdNum, P08ZE2_n4558HrePrdNum, P08ZE2_A4582HreLinUsr,
            P08ZE2_n4582HreLinUsr, P08ZE2_A4567HrePrdTnq, P08ZE2_n4567HrePrdTnq, P08ZE2_A4566HreForNro, P08ZE2_n4566HreForNro, P08ZE2_A4565HreCanAny, P08ZE2_n4565HreCanAny, P08ZE2_A4563HrePrdCant, P08ZE2_n4563HrePrdCant, P08ZE2_A4561HrePrdUDs,
            P08ZE2_n4561HrePrdUDs, P08ZE2_A4562HreFacCon, P08ZE2_n4562HreFacCon, P08ZE2_A4559HrePrdDsc, P08ZE2_n4559HrePrdDsc, P08ZE2_A4557HreRecLin
            }
            , new Object[] {
            P08ZE3_A396EmprCod, P08ZE3_A4492HreBarCod, P08ZE3_A4493HreBarReo, P08ZE3_A4494HreBarPar, P08ZE3_A4495HreNumCie, P08ZE3_A4545HreLinMaq, P08ZE3_A4550HreLinPro, P08ZE3_A4559HrePrdDsc, P08ZE3_n4559HrePrdDsc, P08ZE3_A4582HreLinUsr,
            P08ZE3_n4582HreLinUsr, P08ZE3_A4567HrePrdTnq, P08ZE3_n4567HrePrdTnq, P08ZE3_A4566HreForNro, P08ZE3_n4566HreForNro, P08ZE3_A4565HreCanAny, P08ZE3_n4565HreCanAny, P08ZE3_A4563HrePrdCant, P08ZE3_n4563HrePrdCant, P08ZE3_A4561HrePrdUDs,
            P08ZE3_n4561HrePrdUDs, P08ZE3_A4562HreFacCon, P08ZE3_n4562HreFacCon, P08ZE3_A4558HrePrdNum, P08ZE3_n4558HrePrdNum, P08ZE3_A4557HreRecLin
            }
            , new Object[] {
            P08ZE4_A396EmprCod, P08ZE4_A4492HreBarCod, P08ZE4_A4493HreBarReo, P08ZE4_A4494HreBarPar, P08ZE4_A4495HreNumCie, P08ZE4_A4545HreLinMaq, P08ZE4_A4550HreLinPro, P08ZE4_A4561HrePrdUDs, P08ZE4_n4561HrePrdUDs, P08ZE4_A4582HreLinUsr,
            P08ZE4_n4582HreLinUsr, P08ZE4_A4567HrePrdTnq, P08ZE4_n4567HrePrdTnq, P08ZE4_A4566HreForNro, P08ZE4_n4566HreForNro, P08ZE4_A4565HreCanAny, P08ZE4_n4565HreCanAny, P08ZE4_A4563HrePrdCant, P08ZE4_n4563HrePrdCant, P08ZE4_A4562HreFacCon,
            P08ZE4_n4562HreFacCon, P08ZE4_A4559HrePrdDsc, P08ZE4_n4559HrePrdDsc, P08ZE4_A4558HrePrdNum, P08ZE4_n4558HrePrdNum, P08ZE4_A4557HreRecLin
            }
            , new Object[] {
            P08ZE5_A396EmprCod, P08ZE5_A4492HreBarCod, P08ZE5_A4493HreBarReo, P08ZE5_A4494HreBarPar, P08ZE5_A4495HreNumCie, P08ZE5_A4545HreLinMaq, P08ZE5_A4550HreLinPro, P08ZE5_A4582HreLinUsr, P08ZE5_n4582HreLinUsr, P08ZE5_A4567HrePrdTnq,
            P08ZE5_n4567HrePrdTnq, P08ZE5_A4566HreForNro, P08ZE5_n4566HreForNro, P08ZE5_A4565HreCanAny, P08ZE5_n4565HreCanAny, P08ZE5_A4563HrePrdCant, P08ZE5_n4563HrePrdCant, P08ZE5_A4561HrePrdUDs, P08ZE5_n4561HrePrdUDs, P08ZE5_A4562HreFacCon,
            P08ZE5_n4562HreFacCon, P08ZE5_A4559HrePrdDsc, P08ZE5_n4559HrePrdDsc, P08ZE5_A4558HrePrdNum, P08ZE5_n4558HrePrdNum, P08ZE5_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50TFHreForNro ;
   private byte AV51TFHreForNro_To ;
   private byte AV52TFHrePrdTnq ;
   private byte AV53TFHrePrdTnq_To ;
   private byte AV35HreBarReo ;
   private byte AV37HreNumCie ;
   private byte AV39HreLinPro ;
   private byte AV76Wcdetalleproductosds_15_tfhrefornro ;
   private byte AV77Wcdetalleproductosds_16_tfhrefornro_to ;
   private byte AV78Wcdetalleproductosds_17_tfhreprdtnq ;
   private byte AV79Wcdetalleproductosds_18_tfhreprdtnq_to ;
   private byte A4566HreForNro ;
   private byte A4567HrePrdTnq ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short AV56TFHreRecLin ;
   private short AV57TFHreRecLin_To ;
   private short AV38HreLinMaq ;
   private short AV62Wcdetalleproductosds_1_tfhrereclin ;
   private short AV63Wcdetalleproductosds_2_tfhrereclin_to ;
   private short A4557HreRecLin ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int AV34HreBarCod ;
   private int A4492HreBarCod ;
   private long AV26count ;
   private java.math.BigDecimal AV40TFHreFacCon ;
   private java.math.BigDecimal AV41TFHreFacCon_To ;
   private java.math.BigDecimal AV44TFHrePrdCant ;
   private java.math.BigDecimal AV45TFHrePrdCant_To ;
   private java.math.BigDecimal AV48TFHreCanAny ;
   private java.math.BigDecimal AV49TFHreCanAny_To ;
   private java.math.BigDecimal AV68Wcdetalleproductosds_7_tfhrefaccon ;
   private java.math.BigDecimal AV69Wcdetalleproductosds_8_tfhrefaccon_to ;
   private java.math.BigDecimal AV72Wcdetalleproductosds_11_tfhreprdcant ;
   private java.math.BigDecimal AV73Wcdetalleproductosds_12_tfhreprdcant_to ;
   private java.math.BigDecimal AV74Wcdetalleproductosds_13_tfhrecanany ;
   private java.math.BigDecimal AV75Wcdetalleproductosds_14_tfhrecanany_to ;
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private String AV10TFHrePrdNum ;
   private String AV11TFHrePrdNum_Sel ;
   private String AV12TFHrePrdDsc ;
   private String AV13TFHrePrdDsc_Sel ;
   private String AV42TFHrePrdUDs ;
   private String AV43TFHrePrdUDs_Sel ;
   private String AV54TFHreLinUsr ;
   private String AV55TFHreLinUsr_Sel ;
   private String AV33EmprCod ;
   private String AV36HreBarPar ;
   private String A4558HrePrdNum ;
   private String AV64Wcdetalleproductosds_3_tfhreprdnum ;
   private String AV65Wcdetalleproductosds_4_tfhreprdnum_sel ;
   private String AV66Wcdetalleproductosds_5_tfhreprddsc ;
   private String AV67Wcdetalleproductosds_6_tfhreprddsc_sel ;
   private String AV70Wcdetalleproductosds_9_tfhreprduds ;
   private String AV71Wcdetalleproductosds_10_tfhreprduds_sel ;
   private String AV80Wcdetalleproductosds_19_tfhrelinusr ;
   private String AV81Wcdetalleproductosds_20_tfhrelinusr_sel ;
   private String scmdbuf ;
   private String lV64Wcdetalleproductosds_3_tfhreprdnum ;
   private String lV66Wcdetalleproductosds_5_tfhreprddsc ;
   private String lV70Wcdetalleproductosds_9_tfhreprduds ;
   private String lV80Wcdetalleproductosds_19_tfhrelinusr ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String A4582HreLinUsr ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private boolean returnInSub ;
   private boolean brk8ZE2 ;
   private boolean n4558HrePrdNum ;
   private boolean n4582HreLinUsr ;
   private boolean n4567HrePrdTnq ;
   private boolean n4566HreForNro ;
   private boolean n4565HreCanAny ;
   private boolean n4563HrePrdCant ;
   private boolean n4561HrePrdUDs ;
   private boolean n4562HreFacCon ;
   private boolean n4559HrePrdDsc ;
   private boolean brk8ZE4 ;
   private boolean brk8ZE6 ;
   private boolean brk8ZE8 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV18Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08ZE2_A396EmprCod ;
   private int[] P08ZE2_A4492HreBarCod ;
   private byte[] P08ZE2_A4493HreBarReo ;
   private String[] P08ZE2_A4494HreBarPar ;
   private byte[] P08ZE2_A4495HreNumCie ;
   private short[] P08ZE2_A4545HreLinMaq ;
   private byte[] P08ZE2_A4550HreLinPro ;
   private String[] P08ZE2_A4558HrePrdNum ;
   private boolean[] P08ZE2_n4558HrePrdNum ;
   private String[] P08ZE2_A4582HreLinUsr ;
   private boolean[] P08ZE2_n4582HreLinUsr ;
   private byte[] P08ZE2_A4567HrePrdTnq ;
   private boolean[] P08ZE2_n4567HrePrdTnq ;
   private byte[] P08ZE2_A4566HreForNro ;
   private boolean[] P08ZE2_n4566HreForNro ;
   private java.math.BigDecimal[] P08ZE2_A4565HreCanAny ;
   private boolean[] P08ZE2_n4565HreCanAny ;
   private java.math.BigDecimal[] P08ZE2_A4563HrePrdCant ;
   private boolean[] P08ZE2_n4563HrePrdCant ;
   private String[] P08ZE2_A4561HrePrdUDs ;
   private boolean[] P08ZE2_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08ZE2_A4562HreFacCon ;
   private boolean[] P08ZE2_n4562HreFacCon ;
   private String[] P08ZE2_A4559HrePrdDsc ;
   private boolean[] P08ZE2_n4559HrePrdDsc ;
   private short[] P08ZE2_A4557HreRecLin ;
   private String[] P08ZE3_A396EmprCod ;
   private int[] P08ZE3_A4492HreBarCod ;
   private byte[] P08ZE3_A4493HreBarReo ;
   private String[] P08ZE3_A4494HreBarPar ;
   private byte[] P08ZE3_A4495HreNumCie ;
   private short[] P08ZE3_A4545HreLinMaq ;
   private byte[] P08ZE3_A4550HreLinPro ;
   private String[] P08ZE3_A4559HrePrdDsc ;
   private boolean[] P08ZE3_n4559HrePrdDsc ;
   private String[] P08ZE3_A4582HreLinUsr ;
   private boolean[] P08ZE3_n4582HreLinUsr ;
   private byte[] P08ZE3_A4567HrePrdTnq ;
   private boolean[] P08ZE3_n4567HrePrdTnq ;
   private byte[] P08ZE3_A4566HreForNro ;
   private boolean[] P08ZE3_n4566HreForNro ;
   private java.math.BigDecimal[] P08ZE3_A4565HreCanAny ;
   private boolean[] P08ZE3_n4565HreCanAny ;
   private java.math.BigDecimal[] P08ZE3_A4563HrePrdCant ;
   private boolean[] P08ZE3_n4563HrePrdCant ;
   private String[] P08ZE3_A4561HrePrdUDs ;
   private boolean[] P08ZE3_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08ZE3_A4562HreFacCon ;
   private boolean[] P08ZE3_n4562HreFacCon ;
   private String[] P08ZE3_A4558HrePrdNum ;
   private boolean[] P08ZE3_n4558HrePrdNum ;
   private short[] P08ZE3_A4557HreRecLin ;
   private String[] P08ZE4_A396EmprCod ;
   private int[] P08ZE4_A4492HreBarCod ;
   private byte[] P08ZE4_A4493HreBarReo ;
   private String[] P08ZE4_A4494HreBarPar ;
   private byte[] P08ZE4_A4495HreNumCie ;
   private short[] P08ZE4_A4545HreLinMaq ;
   private byte[] P08ZE4_A4550HreLinPro ;
   private String[] P08ZE4_A4561HrePrdUDs ;
   private boolean[] P08ZE4_n4561HrePrdUDs ;
   private String[] P08ZE4_A4582HreLinUsr ;
   private boolean[] P08ZE4_n4582HreLinUsr ;
   private byte[] P08ZE4_A4567HrePrdTnq ;
   private boolean[] P08ZE4_n4567HrePrdTnq ;
   private byte[] P08ZE4_A4566HreForNro ;
   private boolean[] P08ZE4_n4566HreForNro ;
   private java.math.BigDecimal[] P08ZE4_A4565HreCanAny ;
   private boolean[] P08ZE4_n4565HreCanAny ;
   private java.math.BigDecimal[] P08ZE4_A4563HrePrdCant ;
   private boolean[] P08ZE4_n4563HrePrdCant ;
   private java.math.BigDecimal[] P08ZE4_A4562HreFacCon ;
   private boolean[] P08ZE4_n4562HreFacCon ;
   private String[] P08ZE4_A4559HrePrdDsc ;
   private boolean[] P08ZE4_n4559HrePrdDsc ;
   private String[] P08ZE4_A4558HrePrdNum ;
   private boolean[] P08ZE4_n4558HrePrdNum ;
   private short[] P08ZE4_A4557HreRecLin ;
   private String[] P08ZE5_A396EmprCod ;
   private int[] P08ZE5_A4492HreBarCod ;
   private byte[] P08ZE5_A4493HreBarReo ;
   private String[] P08ZE5_A4494HreBarPar ;
   private byte[] P08ZE5_A4495HreNumCie ;
   private short[] P08ZE5_A4545HreLinMaq ;
   private byte[] P08ZE5_A4550HreLinPro ;
   private String[] P08ZE5_A4582HreLinUsr ;
   private boolean[] P08ZE5_n4582HreLinUsr ;
   private byte[] P08ZE5_A4567HrePrdTnq ;
   private boolean[] P08ZE5_n4567HrePrdTnq ;
   private byte[] P08ZE5_A4566HreForNro ;
   private boolean[] P08ZE5_n4566HreForNro ;
   private java.math.BigDecimal[] P08ZE5_A4565HreCanAny ;
   private boolean[] P08ZE5_n4565HreCanAny ;
   private java.math.BigDecimal[] P08ZE5_A4563HrePrdCant ;
   private boolean[] P08ZE5_n4563HrePrdCant ;
   private String[] P08ZE5_A4561HrePrdUDs ;
   private boolean[] P08ZE5_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08ZE5_A4562HreFacCon ;
   private boolean[] P08ZE5_n4562HreFacCon ;
   private String[] P08ZE5_A4559HrePrdDsc ;
   private boolean[] P08ZE5_n4559HrePrdDsc ;
   private String[] P08ZE5_A4558HrePrdNum ;
   private boolean[] P08ZE5_n4558HrePrdNum ;
   private short[] P08ZE5_A4557HreRecLin ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class wcdetalleproductosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Wcdetalleproductosds_1_tfhrereclin ,
                                          short AV63Wcdetalleproductosds_2_tfhrereclin_to ,
                                          String AV65Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                          String AV64Wcdetalleproductosds_3_tfhreprdnum ,
                                          String AV67Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                          String AV66Wcdetalleproductosds_5_tfhreprddsc ,
                                          java.math.BigDecimal AV68Wcdetalleproductosds_7_tfhrefaccon ,
                                          java.math.BigDecimal AV69Wcdetalleproductosds_8_tfhrefaccon_to ,
                                          String AV71Wcdetalleproductosds_10_tfhreprduds_sel ,
                                          String AV70Wcdetalleproductosds_9_tfhreprduds ,
                                          java.math.BigDecimal AV72Wcdetalleproductosds_11_tfhreprdcant ,
                                          java.math.BigDecimal AV73Wcdetalleproductosds_12_tfhreprdcant_to ,
                                          java.math.BigDecimal AV74Wcdetalleproductosds_13_tfhrecanany ,
                                          java.math.BigDecimal AV75Wcdetalleproductosds_14_tfhrecanany_to ,
                                          byte AV76Wcdetalleproductosds_15_tfhrefornro ,
                                          byte AV77Wcdetalleproductosds_16_tfhrefornro_to ,
                                          byte AV78Wcdetalleproductosds_17_tfhreprdtnq ,
                                          byte AV79Wcdetalleproductosds_18_tfhreprdtnq_to ,
                                          String AV81Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                          String AV80Wcdetalleproductosds_19_tfhrelinusr ,
                                          short A4557HreRecLin ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4562HreFacCon ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          java.math.BigDecimal A4565HreCanAny ,
                                          byte A4566HreForNro ,
                                          byte A4567HrePrdTnq ,
                                          String A4582HreLinUsr ,
                                          String A396EmprCod ,
                                          String AV33EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV34HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV35HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV36HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV37HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV38HreLinMaq ,
                                          byte A4550HreLinPro ,
                                          byte AV39HreLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HrePrdNum, HreLinUsr, HrePrdTnq, HreForNro, HreCanAny, HrePrdCant, HrePrdUDs, HreFacCon," ;
      scmdbuf += " HrePrdDsc, HreRecLin FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMaq = ?)");
      addWhere(sWhereString, "(HreLinPro = ?)");
      if ( ! (0==AV62Wcdetalleproductosds_1_tfhrereclin) )
      {
         addWhere(sWhereString, "(HreRecLin >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcdetalleproductosds_2_tfhrereclin_to) )
      {
         addWhere(sWhereString, "(HreRecLin <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcdetalleproductosds_4_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcdetalleproductosds_3_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcdetalleproductosds_4_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdNum = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcdetalleproductosds_6_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcdetalleproductosds_5_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcdetalleproductosds_6_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdDsc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Wcdetalleproductosds_7_tfhrefaccon)==0) )
      {
         addWhere(sWhereString, "(HreFacCon >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Wcdetalleproductosds_8_tfhrefaccon_to)==0) )
      {
         addWhere(sWhereString, "(HreFacCon <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcdetalleproductosds_10_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcdetalleproductosds_9_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcdetalleproductosds_10_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcdetalleproductosds_11_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcdetalleproductosds_12_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcdetalleproductosds_13_tfhrecanany)==0) )
      {
         addWhere(sWhereString, "(HreCanAny >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcdetalleproductosds_14_tfhrecanany_to)==0) )
      {
         addWhere(sWhereString, "(HreCanAny <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcdetalleproductosds_15_tfhrefornro) )
      {
         addWhere(sWhereString, "(HreForNro >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcdetalleproductosds_16_tfhrefornro_to) )
      {
         addWhere(sWhereString, "(HreForNro <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcdetalleproductosds_17_tfhreprdtnq) )
      {
         addWhere(sWhereString, "(HrePrdTnq >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcdetalleproductosds_18_tfhreprdtnq_to) )
      {
         addWhere(sWhereString, "(HrePrdTnq <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcdetalleproductosds_20_tfhrelinusr_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcdetalleproductosds_19_tfhrelinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcdetalleproductosds_20_tfhrelinusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLinUsr = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HrePrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08ZE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Wcdetalleproductosds_1_tfhrereclin ,
                                          short AV63Wcdetalleproductosds_2_tfhrereclin_to ,
                                          String AV65Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                          String AV64Wcdetalleproductosds_3_tfhreprdnum ,
                                          String AV67Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                          String AV66Wcdetalleproductosds_5_tfhreprddsc ,
                                          java.math.BigDecimal AV68Wcdetalleproductosds_7_tfhrefaccon ,
                                          java.math.BigDecimal AV69Wcdetalleproductosds_8_tfhrefaccon_to ,
                                          String AV71Wcdetalleproductosds_10_tfhreprduds_sel ,
                                          String AV70Wcdetalleproductosds_9_tfhreprduds ,
                                          java.math.BigDecimal AV72Wcdetalleproductosds_11_tfhreprdcant ,
                                          java.math.BigDecimal AV73Wcdetalleproductosds_12_tfhreprdcant_to ,
                                          java.math.BigDecimal AV74Wcdetalleproductosds_13_tfhrecanany ,
                                          java.math.BigDecimal AV75Wcdetalleproductosds_14_tfhrecanany_to ,
                                          byte AV76Wcdetalleproductosds_15_tfhrefornro ,
                                          byte AV77Wcdetalleproductosds_16_tfhrefornro_to ,
                                          byte AV78Wcdetalleproductosds_17_tfhreprdtnq ,
                                          byte AV79Wcdetalleproductosds_18_tfhreprdtnq_to ,
                                          String AV81Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                          String AV80Wcdetalleproductosds_19_tfhrelinusr ,
                                          short A4557HreRecLin ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4562HreFacCon ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          java.math.BigDecimal A4565HreCanAny ,
                                          byte A4566HreForNro ,
                                          byte A4567HrePrdTnq ,
                                          String A4582HreLinUsr ,
                                          String A396EmprCod ,
                                          String AV33EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV34HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV35HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV36HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV37HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV38HreLinMaq ,
                                          byte A4550HreLinPro ,
                                          byte AV39HreLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[27];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HrePrdDsc, HreLinUsr, HrePrdTnq, HreForNro, HreCanAny, HrePrdCant, HrePrdUDs, HreFacCon," ;
      scmdbuf += " HrePrdNum, HreRecLin FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMaq = ?)");
      addWhere(sWhereString, "(HreLinPro = ?)");
      if ( ! (0==AV62Wcdetalleproductosds_1_tfhrereclin) )
      {
         addWhere(sWhereString, "(HreRecLin >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcdetalleproductosds_2_tfhrereclin_to) )
      {
         addWhere(sWhereString, "(HreRecLin <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcdetalleproductosds_4_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcdetalleproductosds_3_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcdetalleproductosds_4_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdNum = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcdetalleproductosds_6_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcdetalleproductosds_5_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcdetalleproductosds_6_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdDsc = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Wcdetalleproductosds_7_tfhrefaccon)==0) )
      {
         addWhere(sWhereString, "(HreFacCon >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Wcdetalleproductosds_8_tfhrefaccon_to)==0) )
      {
         addWhere(sWhereString, "(HreFacCon <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcdetalleproductosds_10_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcdetalleproductosds_9_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcdetalleproductosds_10_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcdetalleproductosds_11_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcdetalleproductosds_12_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcdetalleproductosds_13_tfhrecanany)==0) )
      {
         addWhere(sWhereString, "(HreCanAny >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcdetalleproductosds_14_tfhrecanany_to)==0) )
      {
         addWhere(sWhereString, "(HreCanAny <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcdetalleproductosds_15_tfhrefornro) )
      {
         addWhere(sWhereString, "(HreForNro >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcdetalleproductosds_16_tfhrefornro_to) )
      {
         addWhere(sWhereString, "(HreForNro <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcdetalleproductosds_17_tfhreprdtnq) )
      {
         addWhere(sWhereString, "(HrePrdTnq >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcdetalleproductosds_18_tfhreprdtnq_to) )
      {
         addWhere(sWhereString, "(HrePrdTnq <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcdetalleproductosds_20_tfhrelinusr_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcdetalleproductosds_19_tfhrelinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcdetalleproductosds_20_tfhrelinusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLinUsr = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HrePrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08ZE4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Wcdetalleproductosds_1_tfhrereclin ,
                                          short AV63Wcdetalleproductosds_2_tfhrereclin_to ,
                                          String AV65Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                          String AV64Wcdetalleproductosds_3_tfhreprdnum ,
                                          String AV67Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                          String AV66Wcdetalleproductosds_5_tfhreprddsc ,
                                          java.math.BigDecimal AV68Wcdetalleproductosds_7_tfhrefaccon ,
                                          java.math.BigDecimal AV69Wcdetalleproductosds_8_tfhrefaccon_to ,
                                          String AV71Wcdetalleproductosds_10_tfhreprduds_sel ,
                                          String AV70Wcdetalleproductosds_9_tfhreprduds ,
                                          java.math.BigDecimal AV72Wcdetalleproductosds_11_tfhreprdcant ,
                                          java.math.BigDecimal AV73Wcdetalleproductosds_12_tfhreprdcant_to ,
                                          java.math.BigDecimal AV74Wcdetalleproductosds_13_tfhrecanany ,
                                          java.math.BigDecimal AV75Wcdetalleproductosds_14_tfhrecanany_to ,
                                          byte AV76Wcdetalleproductosds_15_tfhrefornro ,
                                          byte AV77Wcdetalleproductosds_16_tfhrefornro_to ,
                                          byte AV78Wcdetalleproductosds_17_tfhreprdtnq ,
                                          byte AV79Wcdetalleproductosds_18_tfhreprdtnq_to ,
                                          String AV81Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                          String AV80Wcdetalleproductosds_19_tfhrelinusr ,
                                          short A4557HreRecLin ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4562HreFacCon ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          java.math.BigDecimal A4565HreCanAny ,
                                          byte A4566HreForNro ,
                                          byte A4567HrePrdTnq ,
                                          String A4582HreLinUsr ,
                                          String A396EmprCod ,
                                          String AV33EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV34HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV35HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV36HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV37HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV38HreLinMaq ,
                                          byte A4550HreLinPro ,
                                          byte AV39HreLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HrePrdUDs, HreLinUsr, HrePrdTnq, HreForNro, HreCanAny, HrePrdCant, HreFacCon, HrePrdDsc," ;
      scmdbuf += " HrePrdNum, HreRecLin FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMaq = ?)");
      addWhere(sWhereString, "(HreLinPro = ?)");
      if ( ! (0==AV62Wcdetalleproductosds_1_tfhrereclin) )
      {
         addWhere(sWhereString, "(HreRecLin >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcdetalleproductosds_2_tfhrereclin_to) )
      {
         addWhere(sWhereString, "(HreRecLin <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcdetalleproductosds_4_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcdetalleproductosds_3_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcdetalleproductosds_4_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdNum = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcdetalleproductosds_6_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcdetalleproductosds_5_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcdetalleproductosds_6_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdDsc = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Wcdetalleproductosds_7_tfhrefaccon)==0) )
      {
         addWhere(sWhereString, "(HreFacCon >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Wcdetalleproductosds_8_tfhrefaccon_to)==0) )
      {
         addWhere(sWhereString, "(HreFacCon <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcdetalleproductosds_10_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcdetalleproductosds_9_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcdetalleproductosds_10_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcdetalleproductosds_11_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcdetalleproductosds_12_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcdetalleproductosds_13_tfhrecanany)==0) )
      {
         addWhere(sWhereString, "(HreCanAny >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcdetalleproductosds_14_tfhrecanany_to)==0) )
      {
         addWhere(sWhereString, "(HreCanAny <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcdetalleproductosds_15_tfhrefornro) )
      {
         addWhere(sWhereString, "(HreForNro >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcdetalleproductosds_16_tfhrefornro_to) )
      {
         addWhere(sWhereString, "(HreForNro <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcdetalleproductosds_17_tfhreprdtnq) )
      {
         addWhere(sWhereString, "(HrePrdTnq >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcdetalleproductosds_18_tfhreprdtnq_to) )
      {
         addWhere(sWhereString, "(HrePrdTnq <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcdetalleproductosds_20_tfhrelinusr_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcdetalleproductosds_19_tfhrelinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcdetalleproductosds_20_tfhrelinusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLinUsr = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HrePrdUDs" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08ZE5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Wcdetalleproductosds_1_tfhrereclin ,
                                          short AV63Wcdetalleproductosds_2_tfhrereclin_to ,
                                          String AV65Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                          String AV64Wcdetalleproductosds_3_tfhreprdnum ,
                                          String AV67Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                          String AV66Wcdetalleproductosds_5_tfhreprddsc ,
                                          java.math.BigDecimal AV68Wcdetalleproductosds_7_tfhrefaccon ,
                                          java.math.BigDecimal AV69Wcdetalleproductosds_8_tfhrefaccon_to ,
                                          String AV71Wcdetalleproductosds_10_tfhreprduds_sel ,
                                          String AV70Wcdetalleproductosds_9_tfhreprduds ,
                                          java.math.BigDecimal AV72Wcdetalleproductosds_11_tfhreprdcant ,
                                          java.math.BigDecimal AV73Wcdetalleproductosds_12_tfhreprdcant_to ,
                                          java.math.BigDecimal AV74Wcdetalleproductosds_13_tfhrecanany ,
                                          java.math.BigDecimal AV75Wcdetalleproductosds_14_tfhrecanany_to ,
                                          byte AV76Wcdetalleproductosds_15_tfhrefornro ,
                                          byte AV77Wcdetalleproductosds_16_tfhrefornro_to ,
                                          byte AV78Wcdetalleproductosds_17_tfhreprdtnq ,
                                          byte AV79Wcdetalleproductosds_18_tfhreprdtnq_to ,
                                          String AV81Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                          String AV80Wcdetalleproductosds_19_tfhrelinusr ,
                                          short A4557HreRecLin ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4562HreFacCon ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          java.math.BigDecimal A4565HreCanAny ,
                                          byte A4566HreForNro ,
                                          byte A4567HrePrdTnq ,
                                          String A4582HreLinUsr ,
                                          String A396EmprCod ,
                                          String AV33EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV34HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV35HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV36HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV37HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV38HreLinMaq ,
                                          byte A4550HreLinPro ,
                                          byte AV39HreLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreLinUsr, HrePrdTnq, HreForNro, HreCanAny, HrePrdCant, HrePrdUDs, HreFacCon, HrePrdDsc," ;
      scmdbuf += " HrePrdNum, HreRecLin FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMaq = ?)");
      addWhere(sWhereString, "(HreLinPro = ?)");
      if ( ! (0==AV62Wcdetalleproductosds_1_tfhrereclin) )
      {
         addWhere(sWhereString, "(HreRecLin >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcdetalleproductosds_2_tfhrereclin_to) )
      {
         addWhere(sWhereString, "(HreRecLin <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcdetalleproductosds_4_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcdetalleproductosds_3_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcdetalleproductosds_4_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdNum = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcdetalleproductosds_6_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcdetalleproductosds_5_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcdetalleproductosds_6_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdDsc = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Wcdetalleproductosds_7_tfhrefaccon)==0) )
      {
         addWhere(sWhereString, "(HreFacCon >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Wcdetalleproductosds_8_tfhrefaccon_to)==0) )
      {
         addWhere(sWhereString, "(HreFacCon <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcdetalleproductosds_10_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcdetalleproductosds_9_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcdetalleproductosds_10_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Wcdetalleproductosds_11_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Wcdetalleproductosds_12_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcdetalleproductosds_13_tfhrecanany)==0) )
      {
         addWhere(sWhereString, "(HreCanAny >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcdetalleproductosds_14_tfhrecanany_to)==0) )
      {
         addWhere(sWhereString, "(HreCanAny <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcdetalleproductosds_15_tfhrefornro) )
      {
         addWhere(sWhereString, "(HreForNro >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcdetalleproductosds_16_tfhrefornro_to) )
      {
         addWhere(sWhereString, "(HreForNro <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcdetalleproductosds_17_tfhreprdtnq) )
      {
         addWhere(sWhereString, "(HrePrdTnq >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcdetalleproductosds_18_tfhreprdtnq_to) )
      {
         addWhere(sWhereString, "(HrePrdTnq <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcdetalleproductosds_20_tfhrelinusr_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcdetalleproductosds_19_tfhrelinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcdetalleproductosds_20_tfhrelinusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLinUsr = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreLinUsr" ;
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
                  return conditional_P08ZE2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() );
            case 1 :
                  return conditional_P08ZE3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() );
            case 2 :
                  return conditional_P08ZE4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() );
            case 3 :
                  return conditional_P08ZE5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZE4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZE5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               return;
      }
   }

}

