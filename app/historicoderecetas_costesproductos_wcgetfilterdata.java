package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class historicoderecetas_costesproductos_wcgetfilterdata extends GXProcedure
{
   public historicoderecetas_costesproductos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_costesproductos_wcgetfilterdata.class ), "" );
   }

   public historicoderecetas_costesproductos_wcgetfilterdata( int remoteHandle ,
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
      historicoderecetas_costesproductos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      historicoderecetas_costesproductos_wcgetfilterdata.this.AV24DDOName = aP0;
      historicoderecetas_costesproductos_wcgetfilterdata.this.AV22SearchTxt = aP1;
      historicoderecetas_costesproductos_wcgetfilterdata.this.AV23SearchTxtTo = aP2;
      historicoderecetas_costesproductos_wcgetfilterdata.this.aP3 = aP3;
      historicoderecetas_costesproductos_wcgetfilterdata.this.aP4 = aP4;
      historicoderecetas_costesproductos_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_HREPRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_HREPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_HREPRDUDS") == 0 )
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
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("HistoricodeRecetas_CostesProductos_WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "HistoricodeRecetas_CostesProductos_WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("HistoricodeRecetas_CostesProductos_WCGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV10TFHrePrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV11TFHrePrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV12TFHrePrdDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV13TFHrePrdDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV14TFHrePrdCant = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFHrePrdCant_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV16TFHrePrdUDs = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV17TFHrePrdUDs_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPREPRD") == 0 )
         {
            AV18TFHrePrePrd = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFHrePrePrd_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV20TFPrdFacCon = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFPrdFacCon_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV42HreBarCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV43HreBarReo = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV44HreBarpar = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV45HreNumCie = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV46HreLinMaq = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFHrePrdNum = AV22SearchTxt ;
      AV11TFHrePrdNum_Sel = "" ;
      AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = AV40FilterFullText ;
      AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = AV10TFHrePrdNum ;
      AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel = AV11TFHrePrdNum_Sel ;
      AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = AV12TFHrePrdDsc ;
      AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel = AV13TFHrePrdDsc_Sel ;
      AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant = AV14TFHrePrdCant ;
      AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to = AV15TFHrePrdCant_To ;
      AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds = AV16TFHrePrdUDs ;
      AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel = AV17TFHrePrdUDs_Sel ;
      AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd = AV18TFHrePrePrd ;
      AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to = AV19TFHrePrePrd_To ;
      AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon = AV20TFPrdFacCon ;
      AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to = AV21TFPrdFacCon_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                           AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                           AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                           AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                           AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                           AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                           AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                           AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                           AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                           AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                           AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                           AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                           AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           A719PrdNum ,
                                           A396EmprCod ,
                                           AV41Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV42HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV43HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV44HreBarpar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV45HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV46HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum), 6, "%") ;
      lV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc), 26, "%") ;
      lV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds = GXutil.padr( GXutil.rtrim( AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds), 5, "%") ;
      /* Using cursor P09A62 */
      pr_default.execute(0, new Object[] {AV41Emprcod, Integer.valueOf(AV42HreBarCod), Byte.valueOf(AV43HreBarReo), AV44HreBarpar, Byte.valueOf(AV45HreNumCie), Short.valueOf(AV46HreLinMaq), lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum, AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel, lV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc, AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel, AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant, AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to, lV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds, AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel, AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd, AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to, AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon, AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9A62 = false ;
         A396EmprCod = P09A62_A396EmprCod[0] ;
         A4492HreBarCod = P09A62_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A62_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A62_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A62_A4495HreNumCie[0] ;
         A4545HreLinMaq = P09A62_A4545HreLinMaq[0] ;
         A4558HrePrdNum = P09A62_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P09A62_n4558HrePrdNum[0] ;
         A719PrdNum = P09A62_A719PrdNum[0] ;
         n719PrdNum = P09A62_n719PrdNum[0] ;
         A707PrdFacCon = P09A62_A707PrdFacCon[0] ;
         A4967HrePrePrd = P09A62_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P09A62_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = P09A62_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P09A62_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P09A62_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P09A62_n4563HrePrdCant[0] ;
         A4559HrePrdDsc = P09A62_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P09A62_n4559HrePrdDsc[0] ;
         A4550HreLinPro = P09A62_A4550HreLinPro[0] ;
         A4557HreRecLin = P09A62_A4557HreRecLin[0] ;
         A707PrdFacCon = P09A62_A707PrdFacCon[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09A62_A4558HrePrdNum[0], A4558HrePrdNum) == 0 ) )
         {
            brk9A62 = false ;
            A396EmprCod = P09A62_A396EmprCod[0] ;
            A4492HreBarCod = P09A62_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A62_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A62_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A62_A4495HreNumCie[0] ;
            A4545HreLinMaq = P09A62_A4545HreLinMaq[0] ;
            A4550HreLinPro = P09A62_A4550HreLinPro[0] ;
            A4557HreRecLin = P09A62_A4557HreRecLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9A62 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4558HrePrdNum)==0) )
         {
            AV26Option = A4558HrePrdNum ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A62 )
         {
            brk9A62 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHREPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFHrePrdDsc = AV22SearchTxt ;
      AV13TFHrePrdDsc_Sel = "" ;
      AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = AV40FilterFullText ;
      AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = AV10TFHrePrdNum ;
      AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel = AV11TFHrePrdNum_Sel ;
      AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = AV12TFHrePrdDsc ;
      AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel = AV13TFHrePrdDsc_Sel ;
      AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant = AV14TFHrePrdCant ;
      AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to = AV15TFHrePrdCant_To ;
      AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds = AV16TFHrePrdUDs ;
      AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel = AV17TFHrePrdUDs_Sel ;
      AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd = AV18TFHrePrePrd ;
      AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to = AV19TFHrePrePrd_To ;
      AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon = AV20TFPrdFacCon ;
      AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to = AV21TFPrdFacCon_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                           AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                           AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                           AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                           AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                           AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                           AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                           AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                           AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                           AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                           AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                           AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                           AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           A719PrdNum ,
                                           A396EmprCod ,
                                           AV41Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV42HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV43HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV44HreBarpar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV45HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV46HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum), 6, "%") ;
      lV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc), 26, "%") ;
      lV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds = GXutil.padr( GXutil.rtrim( AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds), 5, "%") ;
      /* Using cursor P09A63 */
      pr_default.execute(1, new Object[] {AV41Emprcod, Integer.valueOf(AV42HreBarCod), Byte.valueOf(AV43HreBarReo), AV44HreBarpar, Byte.valueOf(AV45HreNumCie), Short.valueOf(AV46HreLinMaq), lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum, AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel, lV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc, AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel, AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant, AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to, lV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds, AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel, AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd, AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to, AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon, AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9A64 = false ;
         A396EmprCod = P09A63_A396EmprCod[0] ;
         A4492HreBarCod = P09A63_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A63_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A63_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A63_A4495HreNumCie[0] ;
         A4545HreLinMaq = P09A63_A4545HreLinMaq[0] ;
         A4559HrePrdDsc = P09A63_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P09A63_n4559HrePrdDsc[0] ;
         A719PrdNum = P09A63_A719PrdNum[0] ;
         n719PrdNum = P09A63_n719PrdNum[0] ;
         A707PrdFacCon = P09A63_A707PrdFacCon[0] ;
         A4967HrePrePrd = P09A63_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P09A63_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = P09A63_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P09A63_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P09A63_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P09A63_n4563HrePrdCant[0] ;
         A4558HrePrdNum = P09A63_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P09A63_n4558HrePrdNum[0] ;
         A4550HreLinPro = P09A63_A4550HreLinPro[0] ;
         A4557HreRecLin = P09A63_A4557HreRecLin[0] ;
         A707PrdFacCon = P09A63_A707PrdFacCon[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09A63_A4559HrePrdDsc[0], A4559HrePrdDsc) == 0 ) )
         {
            brk9A64 = false ;
            A396EmprCod = P09A63_A396EmprCod[0] ;
            A4492HreBarCod = P09A63_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A63_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A63_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A63_A4495HreNumCie[0] ;
            A4545HreLinMaq = P09A63_A4545HreLinMaq[0] ;
            A4550HreLinPro = P09A63_A4550HreLinPro[0] ;
            A4557HreRecLin = P09A63_A4557HreRecLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9A64 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4559HrePrdDsc)==0) )
         {
            AV26Option = A4559HrePrdDsc ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A64 )
         {
            brk9A64 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHREPRDUDSOPTIONS' Routine */
      returnInSub = false ;
      AV16TFHrePrdUDs = AV22SearchTxt ;
      AV17TFHrePrdUDs_Sel = "" ;
      AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = AV40FilterFullText ;
      AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = AV10TFHrePrdNum ;
      AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel = AV11TFHrePrdNum_Sel ;
      AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = AV12TFHrePrdDsc ;
      AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel = AV13TFHrePrdDsc_Sel ;
      AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant = AV14TFHrePrdCant ;
      AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to = AV15TFHrePrdCant_To ;
      AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds = AV16TFHrePrdUDs ;
      AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel = AV17TFHrePrdUDs_Sel ;
      AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd = AV18TFHrePrePrd ;
      AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to = AV19TFHrePrePrd_To ;
      AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon = AV20TFPrdFacCon ;
      AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to = AV21TFPrdFacCon_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                           AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                           AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                           AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                           AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                           AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                           AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                           AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                           AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                           AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                           AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                           AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                           AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           A719PrdNum ,
                                           A396EmprCod ,
                                           AV41Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV42HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV43HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV44HreBarpar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV45HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV46HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum), 6, "%") ;
      lV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc), 26, "%") ;
      lV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds = GXutil.padr( GXutil.rtrim( AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds), 5, "%") ;
      /* Using cursor P09A64 */
      pr_default.execute(2, new Object[] {AV41Emprcod, Integer.valueOf(AV42HreBarCod), Byte.valueOf(AV43HreBarReo), AV44HreBarpar, Byte.valueOf(AV45HreNumCie), Short.valueOf(AV46HreLinMaq), lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum, AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel, lV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc, AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel, AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant, AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to, lV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds, AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel, AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd, AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to, AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon, AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9A66 = false ;
         A396EmprCod = P09A64_A396EmprCod[0] ;
         A4492HreBarCod = P09A64_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A64_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A64_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A64_A4495HreNumCie[0] ;
         A4545HreLinMaq = P09A64_A4545HreLinMaq[0] ;
         A4561HrePrdUDs = P09A64_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P09A64_n4561HrePrdUDs[0] ;
         A719PrdNum = P09A64_A719PrdNum[0] ;
         n719PrdNum = P09A64_n719PrdNum[0] ;
         A707PrdFacCon = P09A64_A707PrdFacCon[0] ;
         A4967HrePrePrd = P09A64_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P09A64_n4967HrePrePrd[0] ;
         A4563HrePrdCant = P09A64_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P09A64_n4563HrePrdCant[0] ;
         A4559HrePrdDsc = P09A64_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P09A64_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P09A64_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P09A64_n4558HrePrdNum[0] ;
         A4550HreLinPro = P09A64_A4550HreLinPro[0] ;
         A4557HreRecLin = P09A64_A4557HreRecLin[0] ;
         A707PrdFacCon = P09A64_A707PrdFacCon[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09A64_A4561HrePrdUDs[0], A4561HrePrdUDs) == 0 ) )
         {
            brk9A66 = false ;
            A396EmprCod = P09A64_A396EmprCod[0] ;
            A4492HreBarCod = P09A64_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A64_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A64_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A64_A4495HreNumCie[0] ;
            A4545HreLinMaq = P09A64_A4545HreLinMaq[0] ;
            A4550HreLinPro = P09A64_A4550HreLinPro[0] ;
            A4557HreRecLin = P09A64_A4557HreRecLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9A66 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4561HrePrdUDs)==0) )
         {
            AV26Option = A4561HrePrdUDs ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A66 )
         {
            brk9A66 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = historicoderecetas_costesproductos_wcgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = historicoderecetas_costesproductos_wcgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = historicoderecetas_costesproductos_wcgetfilterdata.this.AV33OptionIndexesJson;
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
      AV10TFHrePrdNum = "" ;
      AV11TFHrePrdNum_Sel = "" ;
      AV12TFHrePrdDsc = "" ;
      AV13TFHrePrdDsc_Sel = "" ;
      AV14TFHrePrdCant = DecimalUtil.ZERO ;
      AV15TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV16TFHrePrdUDs = "" ;
      AV17TFHrePrdUDs_Sel = "" ;
      AV18TFHrePrePrd = DecimalUtil.ZERO ;
      AV19TFHrePrePrd_To = DecimalUtil.ZERO ;
      AV20TFPrdFacCon = DecimalUtil.ZERO ;
      AV21TFPrdFacCon_To = DecimalUtil.ZERO ;
      AV41Emprcod = "" ;
      AV44HreBarpar = "" ;
      A4558HrePrdNum = "" ;
      AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = "" ;
      AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = "" ;
      AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel = "" ;
      AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = "" ;
      AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel = "" ;
      AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant = DecimalUtil.ZERO ;
      AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds = "" ;
      AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel = "" ;
      AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd = DecimalUtil.ZERO ;
      AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to = DecimalUtil.ZERO ;
      AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon = DecimalUtil.ZERO ;
      AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext = "" ;
      lV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = "" ;
      lV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = "" ;
      lV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds = "" ;
      A4559HrePrdDsc = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P09A62_A396EmprCod = new String[] {""} ;
      P09A62_A4492HreBarCod = new int[1] ;
      P09A62_A4493HreBarReo = new byte[1] ;
      P09A62_A4494HreBarPar = new String[] {""} ;
      P09A62_A4495HreNumCie = new byte[1] ;
      P09A62_A4545HreLinMaq = new short[1] ;
      P09A62_A4558HrePrdNum = new String[] {""} ;
      P09A62_n4558HrePrdNum = new boolean[] {false} ;
      P09A62_A719PrdNum = new String[] {""} ;
      P09A62_n719PrdNum = new boolean[] {false} ;
      P09A62_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A62_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A62_n4967HrePrePrd = new boolean[] {false} ;
      P09A62_A4561HrePrdUDs = new String[] {""} ;
      P09A62_n4561HrePrdUDs = new boolean[] {false} ;
      P09A62_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A62_n4563HrePrdCant = new boolean[] {false} ;
      P09A62_A4559HrePrdDsc = new String[] {""} ;
      P09A62_n4559HrePrdDsc = new boolean[] {false} ;
      P09A62_A4550HreLinPro = new byte[1] ;
      P09A62_A4557HreRecLin = new short[1] ;
      AV26Option = "" ;
      P09A63_A396EmprCod = new String[] {""} ;
      P09A63_A4492HreBarCod = new int[1] ;
      P09A63_A4493HreBarReo = new byte[1] ;
      P09A63_A4494HreBarPar = new String[] {""} ;
      P09A63_A4495HreNumCie = new byte[1] ;
      P09A63_A4545HreLinMaq = new short[1] ;
      P09A63_A4559HrePrdDsc = new String[] {""} ;
      P09A63_n4559HrePrdDsc = new boolean[] {false} ;
      P09A63_A719PrdNum = new String[] {""} ;
      P09A63_n719PrdNum = new boolean[] {false} ;
      P09A63_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A63_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A63_n4967HrePrePrd = new boolean[] {false} ;
      P09A63_A4561HrePrdUDs = new String[] {""} ;
      P09A63_n4561HrePrdUDs = new boolean[] {false} ;
      P09A63_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A63_n4563HrePrdCant = new boolean[] {false} ;
      P09A63_A4558HrePrdNum = new String[] {""} ;
      P09A63_n4558HrePrdNum = new boolean[] {false} ;
      P09A63_A4550HreLinPro = new byte[1] ;
      P09A63_A4557HreRecLin = new short[1] ;
      P09A64_A396EmprCod = new String[] {""} ;
      P09A64_A4492HreBarCod = new int[1] ;
      P09A64_A4493HreBarReo = new byte[1] ;
      P09A64_A4494HreBarPar = new String[] {""} ;
      P09A64_A4495HreNumCie = new byte[1] ;
      P09A64_A4545HreLinMaq = new short[1] ;
      P09A64_A4561HrePrdUDs = new String[] {""} ;
      P09A64_n4561HrePrdUDs = new boolean[] {false} ;
      P09A64_A719PrdNum = new String[] {""} ;
      P09A64_n719PrdNum = new boolean[] {false} ;
      P09A64_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A64_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A64_n4967HrePrePrd = new boolean[] {false} ;
      P09A64_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A64_n4563HrePrdCant = new boolean[] {false} ;
      P09A64_A4559HrePrdDsc = new String[] {""} ;
      P09A64_n4559HrePrdDsc = new boolean[] {false} ;
      P09A64_A4558HrePrdNum = new String[] {""} ;
      P09A64_n4558HrePrdNum = new boolean[] {false} ;
      P09A64_A4550HreLinPro = new byte[1] ;
      P09A64_A4557HreRecLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_costesproductos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09A62_A396EmprCod, P09A62_A4492HreBarCod, P09A62_A4493HreBarReo, P09A62_A4494HreBarPar, P09A62_A4495HreNumCie, P09A62_A4545HreLinMaq, P09A62_A4558HrePrdNum, P09A62_n4558HrePrdNum, P09A62_A719PrdNum, P09A62_n719PrdNum,
            P09A62_A707PrdFacCon, P09A62_A4967HrePrePrd, P09A62_n4967HrePrePrd, P09A62_A4561HrePrdUDs, P09A62_n4561HrePrdUDs, P09A62_A4563HrePrdCant, P09A62_n4563HrePrdCant, P09A62_A4559HrePrdDsc, P09A62_n4559HrePrdDsc, P09A62_A4550HreLinPro,
            P09A62_A4557HreRecLin
            }
            , new Object[] {
            P09A63_A396EmprCod, P09A63_A4492HreBarCod, P09A63_A4493HreBarReo, P09A63_A4494HreBarPar, P09A63_A4495HreNumCie, P09A63_A4545HreLinMaq, P09A63_A4559HrePrdDsc, P09A63_n4559HrePrdDsc, P09A63_A719PrdNum, P09A63_n719PrdNum,
            P09A63_A707PrdFacCon, P09A63_A4967HrePrePrd, P09A63_n4967HrePrePrd, P09A63_A4561HrePrdUDs, P09A63_n4561HrePrdUDs, P09A63_A4563HrePrdCant, P09A63_n4563HrePrdCant, P09A63_A4558HrePrdNum, P09A63_n4558HrePrdNum, P09A63_A4550HreLinPro,
            P09A63_A4557HreRecLin
            }
            , new Object[] {
            P09A64_A396EmprCod, P09A64_A4492HreBarCod, P09A64_A4493HreBarReo, P09A64_A4494HreBarPar, P09A64_A4495HreNumCie, P09A64_A4545HreLinMaq, P09A64_A4561HrePrdUDs, P09A64_n4561HrePrdUDs, P09A64_A719PrdNum, P09A64_n719PrdNum,
            P09A64_A707PrdFacCon, P09A64_A4967HrePrePrd, P09A64_n4967HrePrePrd, P09A64_A4563HrePrdCant, P09A64_n4563HrePrdCant, P09A64_A4559HrePrdDsc, P09A64_n4559HrePrdDsc, P09A64_A4558HrePrdNum, P09A64_n4558HrePrdNum, P09A64_A4550HreLinPro,
            P09A64_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV43HreBarReo ;
   private byte AV45HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short AV46HreLinMaq ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV42HreBarCod ;
   private int A4492HreBarCod ;
   private long AV34count ;
   private java.math.BigDecimal AV14TFHrePrdCant ;
   private java.math.BigDecimal AV15TFHrePrdCant_To ;
   private java.math.BigDecimal AV18TFHrePrePrd ;
   private java.math.BigDecimal AV19TFHrePrePrd_To ;
   private java.math.BigDecimal AV20TFPrdFacCon ;
   private java.math.BigDecimal AV21TFPrdFacCon_To ;
   private java.math.BigDecimal AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ;
   private java.math.BigDecimal AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ;
   private java.math.BigDecimal AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ;
   private java.math.BigDecimal AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ;
   private java.math.BigDecimal AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ;
   private java.math.BigDecimal AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal A707PrdFacCon ;
   private String AV10TFHrePrdNum ;
   private String AV11TFHrePrdNum_Sel ;
   private String AV12TFHrePrdDsc ;
   private String AV13TFHrePrdDsc_Sel ;
   private String AV16TFHrePrdUDs ;
   private String AV17TFHrePrdUDs_Sel ;
   private String AV41Emprcod ;
   private String AV44HreBarpar ;
   private String A4558HrePrdNum ;
   private String AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ;
   private String AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ;
   private String AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ;
   private String AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ;
   private String AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds ;
   private String AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ;
   private String scmdbuf ;
   private String lV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ;
   private String lV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ;
   private String lV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private boolean returnInSub ;
   private boolean brk9A62 ;
   private boolean n4558HrePrdNum ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private boolean n4561HrePrdUDs ;
   private boolean n4563HrePrdCant ;
   private boolean n4559HrePrdDsc ;
   private boolean brk9A64 ;
   private boolean brk9A66 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext ;
   private String lV51Historicoderecetas_costesproductos_wcds_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09A62_A396EmprCod ;
   private int[] P09A62_A4492HreBarCod ;
   private byte[] P09A62_A4493HreBarReo ;
   private String[] P09A62_A4494HreBarPar ;
   private byte[] P09A62_A4495HreNumCie ;
   private short[] P09A62_A4545HreLinMaq ;
   private String[] P09A62_A4558HrePrdNum ;
   private boolean[] P09A62_n4558HrePrdNum ;
   private String[] P09A62_A719PrdNum ;
   private boolean[] P09A62_n719PrdNum ;
   private java.math.BigDecimal[] P09A62_A707PrdFacCon ;
   private java.math.BigDecimal[] P09A62_A4967HrePrePrd ;
   private boolean[] P09A62_n4967HrePrePrd ;
   private String[] P09A62_A4561HrePrdUDs ;
   private boolean[] P09A62_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P09A62_A4563HrePrdCant ;
   private boolean[] P09A62_n4563HrePrdCant ;
   private String[] P09A62_A4559HrePrdDsc ;
   private boolean[] P09A62_n4559HrePrdDsc ;
   private byte[] P09A62_A4550HreLinPro ;
   private short[] P09A62_A4557HreRecLin ;
   private String[] P09A63_A396EmprCod ;
   private int[] P09A63_A4492HreBarCod ;
   private byte[] P09A63_A4493HreBarReo ;
   private String[] P09A63_A4494HreBarPar ;
   private byte[] P09A63_A4495HreNumCie ;
   private short[] P09A63_A4545HreLinMaq ;
   private String[] P09A63_A4559HrePrdDsc ;
   private boolean[] P09A63_n4559HrePrdDsc ;
   private String[] P09A63_A719PrdNum ;
   private boolean[] P09A63_n719PrdNum ;
   private java.math.BigDecimal[] P09A63_A707PrdFacCon ;
   private java.math.BigDecimal[] P09A63_A4967HrePrePrd ;
   private boolean[] P09A63_n4967HrePrePrd ;
   private String[] P09A63_A4561HrePrdUDs ;
   private boolean[] P09A63_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P09A63_A4563HrePrdCant ;
   private boolean[] P09A63_n4563HrePrdCant ;
   private String[] P09A63_A4558HrePrdNum ;
   private boolean[] P09A63_n4558HrePrdNum ;
   private byte[] P09A63_A4550HreLinPro ;
   private short[] P09A63_A4557HreRecLin ;
   private String[] P09A64_A396EmprCod ;
   private int[] P09A64_A4492HreBarCod ;
   private byte[] P09A64_A4493HreBarReo ;
   private String[] P09A64_A4494HreBarPar ;
   private byte[] P09A64_A4495HreNumCie ;
   private short[] P09A64_A4545HreLinMaq ;
   private String[] P09A64_A4561HrePrdUDs ;
   private boolean[] P09A64_n4561HrePrdUDs ;
   private String[] P09A64_A719PrdNum ;
   private boolean[] P09A64_n719PrdNum ;
   private java.math.BigDecimal[] P09A64_A707PrdFacCon ;
   private java.math.BigDecimal[] P09A64_A4967HrePrePrd ;
   private boolean[] P09A64_n4967HrePrePrd ;
   private java.math.BigDecimal[] P09A64_A4563HrePrdCant ;
   private boolean[] P09A64_n4563HrePrdCant ;
   private String[] P09A64_A4559HrePrdDsc ;
   private boolean[] P09A64_n4559HrePrdDsc ;
   private String[] P09A64_A4558HrePrdNum ;
   private boolean[] P09A64_n4558HrePrdNum ;
   private byte[] P09A64_A4550HreLinPro ;
   private short[] P09A64_A4557HreRecLin ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class historicoderecetas_costesproductos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09A62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                          String AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                          String AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                          String AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                          String AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                          java.math.BigDecimal AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                          java.math.BigDecimal AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                          String AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                          String AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                          java.math.BigDecimal AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                          java.math.BigDecimal AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                          java.math.BigDecimal AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A719PrdNum ,
                                          String A396EmprCod ,
                                          String AV41Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV42HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV43HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV44HreBarpar ,
                                          byte A4495HreNumCie ,
                                          byte AV45HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV46HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HrePrdNum, T1.PrdNum, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant," ;
      scmdbuf += " T1.HrePrdDsc, T1.HreLinPro, T1.HreRecLin FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ?)");
      addWhere(sWhereString, "(T1.HreBarReo = ?)");
      addWhere(sWhereString, "(T1.HreBarPar = ?)");
      addWhere(sWhereString, "(T1.HreNumCie = ?)");
      addWhere(sWhereString, "(T1.HreLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.HrePrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrePrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrdCant,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.HrePrdUDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrePrd,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdFacCon,'90.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HrePrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09A63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                          String AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                          String AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                          String AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                          String AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                          java.math.BigDecimal AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                          java.math.BigDecimal AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                          String AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                          String AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                          java.math.BigDecimal AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                          java.math.BigDecimal AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                          java.math.BigDecimal AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A719PrdNum ,
                                          String A396EmprCod ,
                                          String AV41Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV42HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV43HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV44HreBarpar ,
                                          byte A4495HreNumCie ,
                                          byte AV45HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV46HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HrePrdDsc, T1.PrdNum, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant," ;
      scmdbuf += " T1.HrePrdNum, T1.HreLinPro, T1.HreRecLin FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ?)");
      addWhere(sWhereString, "(T1.HreBarReo = ?)");
      addWhere(sWhereString, "(T1.HreBarPar = ?)");
      addWhere(sWhereString, "(T1.HreNumCie = ?)");
      addWhere(sWhereString, "(T1.HreLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.HrePrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrePrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrdCant,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.HrePrdUDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrePrd,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdFacCon,'90.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HrePrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09A64( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                          String AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                          String AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                          String AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                          String AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                          java.math.BigDecimal AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                          java.math.BigDecimal AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                          String AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                          String AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                          java.math.BigDecimal AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                          java.math.BigDecimal AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                          java.math.BigDecimal AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A719PrdNum ,
                                          String A396EmprCod ,
                                          String AV41Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV42HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV43HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV44HreBarpar ,
                                          byte A4495HreNumCie ,
                                          byte AV45HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV46HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HrePrdUDs, T1.PrdNum, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdCant, T1.HrePrdDsc," ;
      scmdbuf += " T1.HrePrdNum, T1.HreLinPro, T1.HreRecLin FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ?)");
      addWhere(sWhereString, "(T1.HreBarReo = ?)");
      addWhere(sWhereString, "(T1.HreBarPar = ?)");
      addWhere(sWhereString, "(T1.HreNumCie = ?)");
      addWhere(sWhereString, "(T1.HreLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV51Historicoderecetas_costesproductos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.HrePrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrePrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrdCant,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.HrePrdUDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrePrd,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdFacCon,'90.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV52Historicoderecetas_costesproductos_wcds_2_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Historicoderecetas_costesproductos_wcds_4_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Historicoderecetas_costesproductos_wcds_6_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV58Historicoderecetas_costesproductos_wcds_8_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Historicoderecetas_costesproductos_wcds_10_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Historicoderecetas_costesproductos_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HrePrdUDs" ;
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
                  return conditional_P09A62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() );
            case 1 :
                  return conditional_P09A63(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() );
            case 2 :
                  return conditional_P09A64(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A64", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(14);
               ((short[]) buf[20])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(14);
               ((short[]) buf[20])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(14);
               ((short[]) buf[20])[0] = rslt.getShort(15);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 4);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 4);
               }
               return;
      }
   }

}

