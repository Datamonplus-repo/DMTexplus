package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class historicoderecetas_wcgetfilterdata extends GXProcedure
{
   public historicoderecetas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_wcgetfilterdata.class ), "" );
   }

   public historicoderecetas_wcgetfilterdata( int remoteHandle ,
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
      historicoderecetas_wcgetfilterdata.this.aP5 = new String[] {""};
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
      historicoderecetas_wcgetfilterdata.this.AV20DDOName = aP0;
      historicoderecetas_wcgetfilterdata.this.AV18SearchTxt = aP1;
      historicoderecetas_wcgetfilterdata.this.AV19SearchTxtTo = aP2;
      historicoderecetas_wcgetfilterdata.this.aP3 = aP3;
      historicoderecetas_wcgetfilterdata.this.aP4 = aP4;
      historicoderecetas_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_HREMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADHREMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_HREBARPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADHREBARPAROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("HistoricodeRecetas_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "HistoricodeRecetas_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("HistoricodeRecetas_WCGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV10TFHreMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV11TFHreMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV12TFHreVolPrd = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFHreVolPrd_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRENUMCIE") == 0 )
         {
            AV14TFHreNumCie = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFHreNumCie_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINMAQ") == 0 )
         {
            AV16TFHreLinMaq = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFHreLinMaq_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARCOD") == 0 )
         {
            AV42TFHreBarCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFHreBarCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARREO") == 0 )
         {
            AV44TFHreBarReo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFHreBarReo_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARPAR") == 0 )
         {
            AV46TFHreBarPar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARPAR_SEL") == 0 )
         {
            AV47TFHreBarPar_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV48TFEmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV49TFEmprCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV37EmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV38HreBarCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV39HreBarReo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV40HreBarPar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREMAQCOD") == 0 )
         {
            AV41Hremaqcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFHreMaqCod = AV18SearchTxt ;
      AV11TFHreMaqCod_Sel = "" ;
      AV54Historicoderecetas_wcds_1_filterfulltext = AV36FilterFullText ;
      AV55Historicoderecetas_wcds_2_tfhremaqcod = AV10TFHreMaqCod ;
      AV56Historicoderecetas_wcds_3_tfhremaqcod_sel = AV11TFHreMaqCod_Sel ;
      AV57Historicoderecetas_wcds_4_tfhrevolprd = AV12TFHreVolPrd ;
      AV58Historicoderecetas_wcds_5_tfhrevolprd_to = AV13TFHreVolPrd_To ;
      AV59Historicoderecetas_wcds_6_tfhrenumcie = AV14TFHreNumCie ;
      AV60Historicoderecetas_wcds_7_tfhrenumcie_to = AV15TFHreNumCie_To ;
      AV61Historicoderecetas_wcds_8_tfhrelinmaq = AV16TFHreLinMaq ;
      AV62Historicoderecetas_wcds_9_tfhrelinmaq_to = AV17TFHreLinMaq_To ;
      AV63Historicoderecetas_wcds_10_tfhrebarcod = AV42TFHreBarCod ;
      AV64Historicoderecetas_wcds_11_tfhrebarcod_to = AV43TFHreBarCod_To ;
      AV65Historicoderecetas_wcds_12_tfhrebarreo = AV44TFHreBarReo ;
      AV66Historicoderecetas_wcds_13_tfhrebarreo_to = AV45TFHreBarReo_To ;
      AV67Historicoderecetas_wcds_14_tfhrebarpar = AV46TFHreBarPar ;
      AV68Historicoderecetas_wcds_15_tfhrebarpar_sel = AV47TFHreBarPar_Sel ;
      AV69Historicoderecetas_wcds_16_tfemprcod = AV48TFEmprCod ;
      AV70Historicoderecetas_wcds_17_tfemprcod_sel = AV49TFEmprCod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Historicoderecetas_wcds_1_filterfulltext ,
                                           AV56Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                           AV55Historicoderecetas_wcds_2_tfhremaqcod ,
                                           Integer.valueOf(AV57Historicoderecetas_wcds_4_tfhrevolprd) ,
                                           Integer.valueOf(AV58Historicoderecetas_wcds_5_tfhrevolprd_to) ,
                                           Byte.valueOf(AV59Historicoderecetas_wcds_6_tfhrenumcie) ,
                                           Byte.valueOf(AV60Historicoderecetas_wcds_7_tfhrenumcie_to) ,
                                           Short.valueOf(AV61Historicoderecetas_wcds_8_tfhrelinmaq) ,
                                           Short.valueOf(AV62Historicoderecetas_wcds_9_tfhrelinmaq_to) ,
                                           Integer.valueOf(AV63Historicoderecetas_wcds_10_tfhrebarcod) ,
                                           Integer.valueOf(AV64Historicoderecetas_wcds_11_tfhrebarcod_to) ,
                                           Byte.valueOf(AV65Historicoderecetas_wcds_12_tfhrebarreo) ,
                                           Byte.valueOf(AV66Historicoderecetas_wcds_13_tfhrebarreo_to) ,
                                           AV68Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                           AV67Historicoderecetas_wcds_14_tfhrebarpar ,
                                           AV70Historicoderecetas_wcds_17_tfemprcod_sel ,
                                           AV69Historicoderecetas_wcds_16_tfemprcod ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           A396EmprCod ,
                                           AV37EmprCod ,
                                           Integer.valueOf(AV38HreBarCod) ,
                                           Byte.valueOf(AV39HreBarReo) ,
                                           AV40HreBarPar ,
                                           AV41Hremaqcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV55Historicoderecetas_wcds_2_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV55Historicoderecetas_wcds_2_tfhremaqcod), 6, "%") ;
      lV67Historicoderecetas_wcds_14_tfhrebarpar = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_wcds_14_tfhrebarpar), 1, "%") ;
      lV69Historicoderecetas_wcds_16_tfemprcod = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_wcds_16_tfemprcod), 3, "%") ;
      /* Using cursor P09A02 */
      pr_default.execute(0, new Object[] {AV41Hremaqcod, AV37EmprCod, Integer.valueOf(AV38HreBarCod), Byte.valueOf(AV39HreBarReo), AV40HreBarPar, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV55Historicoderecetas_wcds_2_tfhremaqcod, AV56Historicoderecetas_wcds_3_tfhremaqcod_sel, Integer.valueOf(AV57Historicoderecetas_wcds_4_tfhrevolprd), Integer.valueOf(AV58Historicoderecetas_wcds_5_tfhrevolprd_to), Byte.valueOf(AV59Historicoderecetas_wcds_6_tfhrenumcie), Byte.valueOf(AV60Historicoderecetas_wcds_7_tfhrenumcie_to), Short.valueOf(AV61Historicoderecetas_wcds_8_tfhrelinmaq), Short.valueOf(AV62Historicoderecetas_wcds_9_tfhrelinmaq_to), Integer.valueOf(AV63Historicoderecetas_wcds_10_tfhrebarcod), Integer.valueOf(AV64Historicoderecetas_wcds_11_tfhrebarcod_to), Byte.valueOf(AV65Historicoderecetas_wcds_12_tfhrebarreo), Byte.valueOf(AV66Historicoderecetas_wcds_13_tfhrebarreo_to), lV67Historicoderecetas_wcds_14_tfhrebarpar, AV68Historicoderecetas_wcds_15_tfhrebarpar_sel, lV69Historicoderecetas_wcds_16_tfemprcod, AV70Historicoderecetas_wcds_17_tfemprcod_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9A02 = false ;
         A396EmprCod = P09A02_A396EmprCod[0] ;
         A4492HreBarCod = P09A02_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A02_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A02_A4494HreBarPar[0] ;
         A4546HreMaqCod = P09A02_A4546HreMaqCod[0] ;
         n4546HreMaqCod = P09A02_n4546HreMaqCod[0] ;
         A4545HreLinMaq = P09A02_A4545HreLinMaq[0] ;
         A4495HreNumCie = P09A02_A4495HreNumCie[0] ;
         A4547HreVolPrd = P09A02_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P09A02_n4547HreVolPrd[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09A02_A4546HreMaqCod[0], A4546HreMaqCod) == 0 ) )
         {
            brk9A02 = false ;
            A396EmprCod = P09A02_A396EmprCod[0] ;
            A4492HreBarCod = P09A02_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A02_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A02_A4494HreBarPar[0] ;
            A4545HreLinMaq = P09A02_A4545HreLinMaq[0] ;
            A4495HreNumCie = P09A02_A4495HreNumCie[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9A02 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4546HreMaqCod)==0) )
         {
            AV22Option = A4546HreMaqCod ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A02 )
         {
            brk9A02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHREBARPAROPTIONS' Routine */
      returnInSub = false ;
      AV46TFHreBarPar = AV18SearchTxt ;
      AV47TFHreBarPar_Sel = "" ;
      AV54Historicoderecetas_wcds_1_filterfulltext = AV36FilterFullText ;
      AV55Historicoderecetas_wcds_2_tfhremaqcod = AV10TFHreMaqCod ;
      AV56Historicoderecetas_wcds_3_tfhremaqcod_sel = AV11TFHreMaqCod_Sel ;
      AV57Historicoderecetas_wcds_4_tfhrevolprd = AV12TFHreVolPrd ;
      AV58Historicoderecetas_wcds_5_tfhrevolprd_to = AV13TFHreVolPrd_To ;
      AV59Historicoderecetas_wcds_6_tfhrenumcie = AV14TFHreNumCie ;
      AV60Historicoderecetas_wcds_7_tfhrenumcie_to = AV15TFHreNumCie_To ;
      AV61Historicoderecetas_wcds_8_tfhrelinmaq = AV16TFHreLinMaq ;
      AV62Historicoderecetas_wcds_9_tfhrelinmaq_to = AV17TFHreLinMaq_To ;
      AV63Historicoderecetas_wcds_10_tfhrebarcod = AV42TFHreBarCod ;
      AV64Historicoderecetas_wcds_11_tfhrebarcod_to = AV43TFHreBarCod_To ;
      AV65Historicoderecetas_wcds_12_tfhrebarreo = AV44TFHreBarReo ;
      AV66Historicoderecetas_wcds_13_tfhrebarreo_to = AV45TFHreBarReo_To ;
      AV67Historicoderecetas_wcds_14_tfhrebarpar = AV46TFHreBarPar ;
      AV68Historicoderecetas_wcds_15_tfhrebarpar_sel = AV47TFHreBarPar_Sel ;
      AV69Historicoderecetas_wcds_16_tfemprcod = AV48TFEmprCod ;
      AV70Historicoderecetas_wcds_17_tfemprcod_sel = AV49TFEmprCod_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV54Historicoderecetas_wcds_1_filterfulltext ,
                                           AV56Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                           AV55Historicoderecetas_wcds_2_tfhremaqcod ,
                                           Integer.valueOf(AV57Historicoderecetas_wcds_4_tfhrevolprd) ,
                                           Integer.valueOf(AV58Historicoderecetas_wcds_5_tfhrevolprd_to) ,
                                           Byte.valueOf(AV59Historicoderecetas_wcds_6_tfhrenumcie) ,
                                           Byte.valueOf(AV60Historicoderecetas_wcds_7_tfhrenumcie_to) ,
                                           Short.valueOf(AV61Historicoderecetas_wcds_8_tfhrelinmaq) ,
                                           Short.valueOf(AV62Historicoderecetas_wcds_9_tfhrelinmaq_to) ,
                                           Integer.valueOf(AV63Historicoderecetas_wcds_10_tfhrebarcod) ,
                                           Integer.valueOf(AV64Historicoderecetas_wcds_11_tfhrebarcod_to) ,
                                           Byte.valueOf(AV65Historicoderecetas_wcds_12_tfhrebarreo) ,
                                           Byte.valueOf(AV66Historicoderecetas_wcds_13_tfhrebarreo_to) ,
                                           AV68Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                           AV67Historicoderecetas_wcds_14_tfhrebarpar ,
                                           AV70Historicoderecetas_wcds_17_tfemprcod_sel ,
                                           AV69Historicoderecetas_wcds_16_tfemprcod ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           A396EmprCod ,
                                           AV41Hremaqcod ,
                                           AV37EmprCod ,
                                           Integer.valueOf(AV38HreBarCod) ,
                                           Byte.valueOf(AV39HreBarReo) ,
                                           AV40HreBarPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV55Historicoderecetas_wcds_2_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV55Historicoderecetas_wcds_2_tfhremaqcod), 6, "%") ;
      lV67Historicoderecetas_wcds_14_tfhrebarpar = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_wcds_14_tfhrebarpar), 1, "%") ;
      lV69Historicoderecetas_wcds_16_tfemprcod = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_wcds_16_tfemprcod), 3, "%") ;
      /* Using cursor P09A03 */
      pr_default.execute(1, new Object[] {AV37EmprCod, Integer.valueOf(AV38HreBarCod), Byte.valueOf(AV39HreBarReo), AV40HreBarPar, AV41Hremaqcod, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV55Historicoderecetas_wcds_2_tfhremaqcod, AV56Historicoderecetas_wcds_3_tfhremaqcod_sel, Integer.valueOf(AV57Historicoderecetas_wcds_4_tfhrevolprd), Integer.valueOf(AV58Historicoderecetas_wcds_5_tfhrevolprd_to), Byte.valueOf(AV59Historicoderecetas_wcds_6_tfhrenumcie), Byte.valueOf(AV60Historicoderecetas_wcds_7_tfhrenumcie_to), Short.valueOf(AV61Historicoderecetas_wcds_8_tfhrelinmaq), Short.valueOf(AV62Historicoderecetas_wcds_9_tfhrelinmaq_to), Integer.valueOf(AV63Historicoderecetas_wcds_10_tfhrebarcod), Integer.valueOf(AV64Historicoderecetas_wcds_11_tfhrebarcod_to), Byte.valueOf(AV65Historicoderecetas_wcds_12_tfhrebarreo), Byte.valueOf(AV66Historicoderecetas_wcds_13_tfhrebarreo_to), lV67Historicoderecetas_wcds_14_tfhrebarpar, AV68Historicoderecetas_wcds_15_tfhrebarpar_sel, lV69Historicoderecetas_wcds_16_tfemprcod, AV70Historicoderecetas_wcds_17_tfemprcod_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9A04 = false ;
         A4493HreBarReo = P09A03_A4493HreBarReo[0] ;
         A4492HreBarCod = P09A03_A4492HreBarCod[0] ;
         A396EmprCod = P09A03_A396EmprCod[0] ;
         A4494HreBarPar = P09A03_A4494HreBarPar[0] ;
         A4545HreLinMaq = P09A03_A4545HreLinMaq[0] ;
         A4495HreNumCie = P09A03_A4495HreNumCie[0] ;
         A4547HreVolPrd = P09A03_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P09A03_n4547HreVolPrd[0] ;
         A4546HreMaqCod = P09A03_A4546HreMaqCod[0] ;
         n4546HreMaqCod = P09A03_n4546HreMaqCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09A03_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09A03_A4492HreBarCod[0] == A4492HreBarCod ) && ( P09A03_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(P09A03_A4494HreBarPar[0], A4494HreBarPar) == 0 ) )
         {
            brk9A04 = false ;
            A4545HreLinMaq = P09A03_A4545HreLinMaq[0] ;
            A4495HreNumCie = P09A03_A4495HreNumCie[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9A04 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4494HreBarPar)==0) )
         {
            AV22Option = A4494HreBarPar ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A04 )
         {
            brk9A04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV48TFEmprCod = AV18SearchTxt ;
      AV49TFEmprCod_Sel = "" ;
      AV54Historicoderecetas_wcds_1_filterfulltext = AV36FilterFullText ;
      AV55Historicoderecetas_wcds_2_tfhremaqcod = AV10TFHreMaqCod ;
      AV56Historicoderecetas_wcds_3_tfhremaqcod_sel = AV11TFHreMaqCod_Sel ;
      AV57Historicoderecetas_wcds_4_tfhrevolprd = AV12TFHreVolPrd ;
      AV58Historicoderecetas_wcds_5_tfhrevolprd_to = AV13TFHreVolPrd_To ;
      AV59Historicoderecetas_wcds_6_tfhrenumcie = AV14TFHreNumCie ;
      AV60Historicoderecetas_wcds_7_tfhrenumcie_to = AV15TFHreNumCie_To ;
      AV61Historicoderecetas_wcds_8_tfhrelinmaq = AV16TFHreLinMaq ;
      AV62Historicoderecetas_wcds_9_tfhrelinmaq_to = AV17TFHreLinMaq_To ;
      AV63Historicoderecetas_wcds_10_tfhrebarcod = AV42TFHreBarCod ;
      AV64Historicoderecetas_wcds_11_tfhrebarcod_to = AV43TFHreBarCod_To ;
      AV65Historicoderecetas_wcds_12_tfhrebarreo = AV44TFHreBarReo ;
      AV66Historicoderecetas_wcds_13_tfhrebarreo_to = AV45TFHreBarReo_To ;
      AV67Historicoderecetas_wcds_14_tfhrebarpar = AV46TFHreBarPar ;
      AV68Historicoderecetas_wcds_15_tfhrebarpar_sel = AV47TFHreBarPar_Sel ;
      AV69Historicoderecetas_wcds_16_tfemprcod = AV48TFEmprCod ;
      AV70Historicoderecetas_wcds_17_tfemprcod_sel = AV49TFEmprCod_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV54Historicoderecetas_wcds_1_filterfulltext ,
                                           AV56Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                           AV55Historicoderecetas_wcds_2_tfhremaqcod ,
                                           Integer.valueOf(AV57Historicoderecetas_wcds_4_tfhrevolprd) ,
                                           Integer.valueOf(AV58Historicoderecetas_wcds_5_tfhrevolprd_to) ,
                                           Byte.valueOf(AV59Historicoderecetas_wcds_6_tfhrenumcie) ,
                                           Byte.valueOf(AV60Historicoderecetas_wcds_7_tfhrenumcie_to) ,
                                           Short.valueOf(AV61Historicoderecetas_wcds_8_tfhrelinmaq) ,
                                           Short.valueOf(AV62Historicoderecetas_wcds_9_tfhrelinmaq_to) ,
                                           Integer.valueOf(AV63Historicoderecetas_wcds_10_tfhrebarcod) ,
                                           Integer.valueOf(AV64Historicoderecetas_wcds_11_tfhrebarcod_to) ,
                                           Byte.valueOf(AV65Historicoderecetas_wcds_12_tfhrebarreo) ,
                                           Byte.valueOf(AV66Historicoderecetas_wcds_13_tfhrebarreo_to) ,
                                           AV68Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                           AV67Historicoderecetas_wcds_14_tfhrebarpar ,
                                           AV70Historicoderecetas_wcds_17_tfemprcod_sel ,
                                           AV69Historicoderecetas_wcds_16_tfemprcod ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           A396EmprCod ,
                                           AV41Hremaqcod ,
                                           AV37EmprCod ,
                                           Integer.valueOf(AV38HreBarCod) ,
                                           Byte.valueOf(AV39HreBarReo) ,
                                           AV40HreBarPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV55Historicoderecetas_wcds_2_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV55Historicoderecetas_wcds_2_tfhremaqcod), 6, "%") ;
      lV67Historicoderecetas_wcds_14_tfhrebarpar = GXutil.padr( GXutil.rtrim( AV67Historicoderecetas_wcds_14_tfhrebarpar), 1, "%") ;
      lV69Historicoderecetas_wcds_16_tfemprcod = GXutil.padr( GXutil.rtrim( AV69Historicoderecetas_wcds_16_tfemprcod), 3, "%") ;
      /* Using cursor P09A04 */
      pr_default.execute(2, new Object[] {AV37EmprCod, Integer.valueOf(AV38HreBarCod), Byte.valueOf(AV39HreBarReo), AV40HreBarPar, AV41Hremaqcod, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV54Historicoderecetas_wcds_1_filterfulltext, lV55Historicoderecetas_wcds_2_tfhremaqcod, AV56Historicoderecetas_wcds_3_tfhremaqcod_sel, Integer.valueOf(AV57Historicoderecetas_wcds_4_tfhrevolprd), Integer.valueOf(AV58Historicoderecetas_wcds_5_tfhrevolprd_to), Byte.valueOf(AV59Historicoderecetas_wcds_6_tfhrenumcie), Byte.valueOf(AV60Historicoderecetas_wcds_7_tfhrenumcie_to), Short.valueOf(AV61Historicoderecetas_wcds_8_tfhrelinmaq), Short.valueOf(AV62Historicoderecetas_wcds_9_tfhrelinmaq_to), Integer.valueOf(AV63Historicoderecetas_wcds_10_tfhrebarcod), Integer.valueOf(AV64Historicoderecetas_wcds_11_tfhrebarcod_to), Byte.valueOf(AV65Historicoderecetas_wcds_12_tfhrebarreo), Byte.valueOf(AV66Historicoderecetas_wcds_13_tfhrebarreo_to), lV67Historicoderecetas_wcds_14_tfhrebarpar, AV68Historicoderecetas_wcds_15_tfhrebarpar_sel, lV69Historicoderecetas_wcds_16_tfemprcod, AV70Historicoderecetas_wcds_17_tfemprcod_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9A06 = false ;
         A396EmprCod = P09A04_A396EmprCod[0] ;
         A4494HreBarPar = P09A04_A4494HreBarPar[0] ;
         A4493HreBarReo = P09A04_A4493HreBarReo[0] ;
         A4492HreBarCod = P09A04_A4492HreBarCod[0] ;
         A4545HreLinMaq = P09A04_A4545HreLinMaq[0] ;
         A4495HreNumCie = P09A04_A4495HreNumCie[0] ;
         A4547HreVolPrd = P09A04_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P09A04_n4547HreVolPrd[0] ;
         A4546HreMaqCod = P09A04_A4546HreMaqCod[0] ;
         n4546HreMaqCod = P09A04_n4546HreMaqCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09A04_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk9A06 = false ;
            A4494HreBarPar = P09A04_A4494HreBarPar[0] ;
            A4493HreBarReo = P09A04_A4493HreBarReo[0] ;
            A4492HreBarCod = P09A04_A4492HreBarCod[0] ;
            A4545HreLinMaq = P09A04_A4545HreLinMaq[0] ;
            A4495HreNumCie = P09A04_A4495HreNumCie[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9A06 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV22Option = A396EmprCod ;
            AV25OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV23Options.add(AV22Option, 0);
            AV26OptionsDesc.add(AV25OptionDesc, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A06 )
         {
            brk9A06 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = historicoderecetas_wcgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = historicoderecetas_wcgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = historicoderecetas_wcgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV36FilterFullText = "" ;
      AV10TFHreMaqCod = "" ;
      AV11TFHreMaqCod_Sel = "" ;
      AV46TFHreBarPar = "" ;
      AV47TFHreBarPar_Sel = "" ;
      AV48TFEmprCod = "" ;
      AV49TFEmprCod_Sel = "" ;
      AV37EmprCod = "" ;
      AV40HreBarPar = "" ;
      AV41Hremaqcod = "" ;
      A4546HreMaqCod = "" ;
      AV54Historicoderecetas_wcds_1_filterfulltext = "" ;
      AV55Historicoderecetas_wcds_2_tfhremaqcod = "" ;
      AV56Historicoderecetas_wcds_3_tfhremaqcod_sel = "" ;
      AV67Historicoderecetas_wcds_14_tfhrebarpar = "" ;
      AV68Historicoderecetas_wcds_15_tfhrebarpar_sel = "" ;
      AV69Historicoderecetas_wcds_16_tfemprcod = "" ;
      AV70Historicoderecetas_wcds_17_tfemprcod_sel = "" ;
      scmdbuf = "" ;
      lV54Historicoderecetas_wcds_1_filterfulltext = "" ;
      lV55Historicoderecetas_wcds_2_tfhremaqcod = "" ;
      lV67Historicoderecetas_wcds_14_tfhrebarpar = "" ;
      lV69Historicoderecetas_wcds_16_tfemprcod = "" ;
      A4494HreBarPar = "" ;
      A396EmprCod = "" ;
      P09A02_A396EmprCod = new String[] {""} ;
      P09A02_A4492HreBarCod = new int[1] ;
      P09A02_A4493HreBarReo = new byte[1] ;
      P09A02_A4494HreBarPar = new String[] {""} ;
      P09A02_A4546HreMaqCod = new String[] {""} ;
      P09A02_n4546HreMaqCod = new boolean[] {false} ;
      P09A02_A4545HreLinMaq = new short[1] ;
      P09A02_A4495HreNumCie = new byte[1] ;
      P09A02_A4547HreVolPrd = new int[1] ;
      P09A02_n4547HreVolPrd = new boolean[] {false} ;
      AV22Option = "" ;
      P09A03_A4493HreBarReo = new byte[1] ;
      P09A03_A4492HreBarCod = new int[1] ;
      P09A03_A396EmprCod = new String[] {""} ;
      P09A03_A4494HreBarPar = new String[] {""} ;
      P09A03_A4545HreLinMaq = new short[1] ;
      P09A03_A4495HreNumCie = new byte[1] ;
      P09A03_A4547HreVolPrd = new int[1] ;
      P09A03_n4547HreVolPrd = new boolean[] {false} ;
      P09A03_A4546HreMaqCod = new String[] {""} ;
      P09A03_n4546HreMaqCod = new boolean[] {false} ;
      P09A04_A396EmprCod = new String[] {""} ;
      P09A04_A4494HreBarPar = new String[] {""} ;
      P09A04_A4493HreBarReo = new byte[1] ;
      P09A04_A4492HreBarCod = new int[1] ;
      P09A04_A4545HreLinMaq = new short[1] ;
      P09A04_A4495HreNumCie = new byte[1] ;
      P09A04_A4547HreVolPrd = new int[1] ;
      P09A04_n4547HreVolPrd = new boolean[] {false} ;
      P09A04_A4546HreMaqCod = new String[] {""} ;
      P09A04_n4546HreMaqCod = new boolean[] {false} ;
      AV25OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09A02_A396EmprCod, P09A02_A4492HreBarCod, P09A02_A4493HreBarReo, P09A02_A4494HreBarPar, P09A02_A4546HreMaqCod, P09A02_n4546HreMaqCod, P09A02_A4545HreLinMaq, P09A02_A4495HreNumCie, P09A02_A4547HreVolPrd, P09A02_n4547HreVolPrd
            }
            , new Object[] {
            P09A03_A4493HreBarReo, P09A03_A4492HreBarCod, P09A03_A396EmprCod, P09A03_A4494HreBarPar, P09A03_A4545HreLinMaq, P09A03_A4495HreNumCie, P09A03_A4547HreVolPrd, P09A03_n4547HreVolPrd, P09A03_A4546HreMaqCod, P09A03_n4546HreMaqCod
            }
            , new Object[] {
            P09A04_A396EmprCod, P09A04_A4494HreBarPar, P09A04_A4493HreBarReo, P09A04_A4492HreBarCod, P09A04_A4545HreLinMaq, P09A04_A4495HreNumCie, P09A04_A4547HreVolPrd, P09A04_n4547HreVolPrd, P09A04_A4546HreMaqCod, P09A04_n4546HreMaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFHreNumCie ;
   private byte AV15TFHreNumCie_To ;
   private byte AV44TFHreBarReo ;
   private byte AV45TFHreBarReo_To ;
   private byte AV39HreBarReo ;
   private byte AV59Historicoderecetas_wcds_6_tfhrenumcie ;
   private byte AV60Historicoderecetas_wcds_7_tfhrenumcie_to ;
   private byte AV65Historicoderecetas_wcds_12_tfhrebarreo ;
   private byte AV66Historicoderecetas_wcds_13_tfhrebarreo_to ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private short AV16TFHreLinMaq ;
   private short AV17TFHreLinMaq_To ;
   private short AV61Historicoderecetas_wcds_8_tfhrelinmaq ;
   private short AV62Historicoderecetas_wcds_9_tfhrelinmaq_to ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV12TFHreVolPrd ;
   private int AV13TFHreVolPrd_To ;
   private int AV42TFHreBarCod ;
   private int AV43TFHreBarCod_To ;
   private int AV38HreBarCod ;
   private int AV57Historicoderecetas_wcds_4_tfhrevolprd ;
   private int AV58Historicoderecetas_wcds_5_tfhrevolprd_to ;
   private int AV63Historicoderecetas_wcds_10_tfhrebarcod ;
   private int AV64Historicoderecetas_wcds_11_tfhrebarcod_to ;
   private int A4547HreVolPrd ;
   private int A4492HreBarCod ;
   private long AV30count ;
   private String AV10TFHreMaqCod ;
   private String AV11TFHreMaqCod_Sel ;
   private String AV46TFHreBarPar ;
   private String AV47TFHreBarPar_Sel ;
   private String AV48TFEmprCod ;
   private String AV49TFEmprCod_Sel ;
   private String AV37EmprCod ;
   private String AV40HreBarPar ;
   private String AV41Hremaqcod ;
   private String A4546HreMaqCod ;
   private String AV55Historicoderecetas_wcds_2_tfhremaqcod ;
   private String AV56Historicoderecetas_wcds_3_tfhremaqcod_sel ;
   private String AV67Historicoderecetas_wcds_14_tfhrebarpar ;
   private String AV68Historicoderecetas_wcds_15_tfhrebarpar_sel ;
   private String AV69Historicoderecetas_wcds_16_tfemprcod ;
   private String AV70Historicoderecetas_wcds_17_tfemprcod_sel ;
   private String scmdbuf ;
   private String lV55Historicoderecetas_wcds_2_tfhremaqcod ;
   private String lV67Historicoderecetas_wcds_14_tfhrebarpar ;
   private String lV69Historicoderecetas_wcds_16_tfemprcod ;
   private String A4494HreBarPar ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9A02 ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private boolean brk9A04 ;
   private boolean brk9A06 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV54Historicoderecetas_wcds_1_filterfulltext ;
   private String lV54Historicoderecetas_wcds_1_filterfulltext ;
   private String AV22Option ;
   private String AV25OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09A02_A396EmprCod ;
   private int[] P09A02_A4492HreBarCod ;
   private byte[] P09A02_A4493HreBarReo ;
   private String[] P09A02_A4494HreBarPar ;
   private String[] P09A02_A4546HreMaqCod ;
   private boolean[] P09A02_n4546HreMaqCod ;
   private short[] P09A02_A4545HreLinMaq ;
   private byte[] P09A02_A4495HreNumCie ;
   private int[] P09A02_A4547HreVolPrd ;
   private boolean[] P09A02_n4547HreVolPrd ;
   private byte[] P09A03_A4493HreBarReo ;
   private int[] P09A03_A4492HreBarCod ;
   private String[] P09A03_A396EmprCod ;
   private String[] P09A03_A4494HreBarPar ;
   private short[] P09A03_A4545HreLinMaq ;
   private byte[] P09A03_A4495HreNumCie ;
   private int[] P09A03_A4547HreVolPrd ;
   private boolean[] P09A03_n4547HreVolPrd ;
   private String[] P09A03_A4546HreMaqCod ;
   private boolean[] P09A03_n4546HreMaqCod ;
   private String[] P09A04_A396EmprCod ;
   private String[] P09A04_A4494HreBarPar ;
   private byte[] P09A04_A4493HreBarReo ;
   private int[] P09A04_A4492HreBarCod ;
   private short[] P09A04_A4545HreLinMaq ;
   private byte[] P09A04_A4495HreNumCie ;
   private int[] P09A04_A4547HreVolPrd ;
   private boolean[] P09A04_n4547HreVolPrd ;
   private String[] P09A04_A4546HreMaqCod ;
   private boolean[] P09A04_n4546HreMaqCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class historicoderecetas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09A02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Historicoderecetas_wcds_1_filterfulltext ,
                                          String AV56Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                          String AV55Historicoderecetas_wcds_2_tfhremaqcod ,
                                          int AV57Historicoderecetas_wcds_4_tfhrevolprd ,
                                          int AV58Historicoderecetas_wcds_5_tfhrevolprd_to ,
                                          byte AV59Historicoderecetas_wcds_6_tfhrenumcie ,
                                          byte AV60Historicoderecetas_wcds_7_tfhrenumcie_to ,
                                          short AV61Historicoderecetas_wcds_8_tfhrelinmaq ,
                                          short AV62Historicoderecetas_wcds_9_tfhrelinmaq_to ,
                                          int AV63Historicoderecetas_wcds_10_tfhrebarcod ,
                                          int AV64Historicoderecetas_wcds_11_tfhrebarcod_to ,
                                          byte AV65Historicoderecetas_wcds_12_tfhrebarreo ,
                                          byte AV66Historicoderecetas_wcds_13_tfhrebarreo_to ,
                                          String AV68Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                          String AV67Historicoderecetas_wcds_14_tfhrebarpar ,
                                          String AV70Historicoderecetas_wcds_17_tfemprcod_sel ,
                                          String AV69Historicoderecetas_wcds_16_tfemprcod ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          String A396EmprCod ,
                                          String AV37EmprCod ,
                                          int AV38HreBarCod ,
                                          byte AV39HreBarReo ,
                                          String AV40HreBarPar ,
                                          String AV41Hremaqcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreMaqCod, HreLinMaq, HreNumCie, HreVolPrd FROM TXPHISREM" ;
      addWhere(sWhereString, "(HreMaqCod = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      if ( ! (GXutil.strcmp("", AV54Historicoderecetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(HreMaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreNumCie,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarReo,'90'), 2) like '%' || ?) or ( UPPER(HreBarPar) like '%' || UPPER(?)) or ( UPPER(EmprCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV55Historicoderecetas_wcds_2_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(HreMaqCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV57Historicoderecetas_wcds_4_tfhrevolprd) )
      {
         addWhere(sWhereString, "(HreVolPrd >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV58Historicoderecetas_wcds_5_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(HreVolPrd <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV59Historicoderecetas_wcds_6_tfhrenumcie) )
      {
         addWhere(sWhereString, "(HreNumCie >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Historicoderecetas_wcds_7_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(HreNumCie <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV61Historicoderecetas_wcds_8_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(HreLinMaq >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV62Historicoderecetas_wcds_9_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(HreLinMaq <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV63Historicoderecetas_wcds_10_tfhrebarcod) )
      {
         addWhere(sWhereString, "(HreBarCod >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV64Historicoderecetas_wcds_11_tfhrebarcod_to) )
      {
         addWhere(sWhereString, "(HreBarCod <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV65Historicoderecetas_wcds_12_tfhrebarreo) )
      {
         addWhere(sWhereString, "(HreBarReo >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV66Historicoderecetas_wcds_13_tfhrebarreo_to) )
      {
         addWhere(sWhereString, "(HreBarReo <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_wcds_14_tfhrebarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreBarPar = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_wcds_17_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_wcds_16_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_wcds_17_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreMaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09A03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Historicoderecetas_wcds_1_filterfulltext ,
                                          String AV56Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                          String AV55Historicoderecetas_wcds_2_tfhremaqcod ,
                                          int AV57Historicoderecetas_wcds_4_tfhrevolprd ,
                                          int AV58Historicoderecetas_wcds_5_tfhrevolprd_to ,
                                          byte AV59Historicoderecetas_wcds_6_tfhrenumcie ,
                                          byte AV60Historicoderecetas_wcds_7_tfhrenumcie_to ,
                                          short AV61Historicoderecetas_wcds_8_tfhrelinmaq ,
                                          short AV62Historicoderecetas_wcds_9_tfhrelinmaq_to ,
                                          int AV63Historicoderecetas_wcds_10_tfhrebarcod ,
                                          int AV64Historicoderecetas_wcds_11_tfhrebarcod_to ,
                                          byte AV65Historicoderecetas_wcds_12_tfhrebarreo ,
                                          byte AV66Historicoderecetas_wcds_13_tfhrebarreo_to ,
                                          String AV68Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                          String AV67Historicoderecetas_wcds_14_tfhrebarpar ,
                                          String AV70Historicoderecetas_wcds_17_tfemprcod_sel ,
                                          String AV69Historicoderecetas_wcds_16_tfemprcod ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          String A396EmprCod ,
                                          String AV41Hremaqcod ,
                                          String AV37EmprCod ,
                                          int AV38HreBarCod ,
                                          byte AV39HreBarReo ,
                                          String AV40HreBarPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[29];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT HreBarReo, HreBarCod, EmprCod, HreBarPar, HreLinMaq, HreNumCie, HreVolPrd, HreMaqCod FROM TXPHISREM" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?)");
      addWhere(sWhereString, "(HreMaqCod = ?)");
      if ( ! (GXutil.strcmp("", AV54Historicoderecetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(HreMaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreNumCie,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarReo,'90'), 2) like '%' || ?) or ( UPPER(HreBarPar) like '%' || UPPER(?)) or ( UPPER(EmprCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV55Historicoderecetas_wcds_2_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(HreMaqCod = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV57Historicoderecetas_wcds_4_tfhrevolprd) )
      {
         addWhere(sWhereString, "(HreVolPrd >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV58Historicoderecetas_wcds_5_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(HreVolPrd <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV59Historicoderecetas_wcds_6_tfhrenumcie) )
      {
         addWhere(sWhereString, "(HreNumCie >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Historicoderecetas_wcds_7_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(HreNumCie <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV61Historicoderecetas_wcds_8_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(HreLinMaq >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV62Historicoderecetas_wcds_9_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(HreLinMaq <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV63Historicoderecetas_wcds_10_tfhrebarcod) )
      {
         addWhere(sWhereString, "(HreBarCod >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV64Historicoderecetas_wcds_11_tfhrebarcod_to) )
      {
         addWhere(sWhereString, "(HreBarCod <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV65Historicoderecetas_wcds_12_tfhrebarreo) )
      {
         addWhere(sWhereString, "(HreBarReo >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV66Historicoderecetas_wcds_13_tfhrebarreo_to) )
      {
         addWhere(sWhereString, "(HreBarReo <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_wcds_14_tfhrebarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreBarPar = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_wcds_17_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_wcds_16_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_wcds_17_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09A04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Historicoderecetas_wcds_1_filterfulltext ,
                                          String AV56Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                          String AV55Historicoderecetas_wcds_2_tfhremaqcod ,
                                          int AV57Historicoderecetas_wcds_4_tfhrevolprd ,
                                          int AV58Historicoderecetas_wcds_5_tfhrevolprd_to ,
                                          byte AV59Historicoderecetas_wcds_6_tfhrenumcie ,
                                          byte AV60Historicoderecetas_wcds_7_tfhrenumcie_to ,
                                          short AV61Historicoderecetas_wcds_8_tfhrelinmaq ,
                                          short AV62Historicoderecetas_wcds_9_tfhrelinmaq_to ,
                                          int AV63Historicoderecetas_wcds_10_tfhrebarcod ,
                                          int AV64Historicoderecetas_wcds_11_tfhrebarcod_to ,
                                          byte AV65Historicoderecetas_wcds_12_tfhrebarreo ,
                                          byte AV66Historicoderecetas_wcds_13_tfhrebarreo_to ,
                                          String AV68Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                          String AV67Historicoderecetas_wcds_14_tfhrebarpar ,
                                          String AV70Historicoderecetas_wcds_17_tfemprcod_sel ,
                                          String AV69Historicoderecetas_wcds_16_tfemprcod ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          String A396EmprCod ,
                                          String AV41Hremaqcod ,
                                          String AV37EmprCod ,
                                          int AV38HreBarCod ,
                                          byte AV39HreBarReo ,
                                          String AV40HreBarPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[29];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreLinMaq, HreNumCie, HreVolPrd, HreMaqCod FROM TXPHISREM" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?)");
      addWhere(sWhereString, "(HreMaqCod = ?)");
      if ( ! (GXutil.strcmp("", AV54Historicoderecetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(HreMaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreNumCie,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarReo,'90'), 2) like '%' || ?) or ( UPPER(HreBarPar) like '%' || UPPER(?)) or ( UPPER(EmprCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV55Historicoderecetas_wcds_2_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(HreMaqCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV57Historicoderecetas_wcds_4_tfhrevolprd) )
      {
         addWhere(sWhereString, "(HreVolPrd >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV58Historicoderecetas_wcds_5_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(HreVolPrd <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV59Historicoderecetas_wcds_6_tfhrenumcie) )
      {
         addWhere(sWhereString, "(HreNumCie >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Historicoderecetas_wcds_7_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(HreNumCie <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV61Historicoderecetas_wcds_8_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(HreLinMaq >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV62Historicoderecetas_wcds_9_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(HreLinMaq <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV63Historicoderecetas_wcds_10_tfhrebarcod) )
      {
         addWhere(sWhereString, "(HreBarCod >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV64Historicoderecetas_wcds_11_tfhrebarcod_to) )
      {
         addWhere(sWhereString, "(HreBarCod <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV65Historicoderecetas_wcds_12_tfhrebarreo) )
      {
         addWhere(sWhereString, "(HreBarReo >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV66Historicoderecetas_wcds_13_tfhrebarreo_to) )
      {
         addWhere(sWhereString, "(HreBarReo <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) && ( ! (GXutil.strcmp("", AV67Historicoderecetas_wcds_14_tfhrebarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreBarPar = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Historicoderecetas_wcds_17_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV69Historicoderecetas_wcds_16_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_wcds_17_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar" ;
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
                  return conditional_P09A02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P09A03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P09A04(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               return;
      }
   }

}

