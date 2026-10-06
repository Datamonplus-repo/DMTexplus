package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class historicoderecetas_procesosquimicos_wcgetfilterdata extends GXProcedure
{
   public historicoderecetas_procesosquimicos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_procesosquimicos_wcgetfilterdata.class ), "" );
   }

   public historicoderecetas_procesosquimicos_wcgetfilterdata( int remoteHandle ,
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
      historicoderecetas_procesosquimicos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      historicoderecetas_procesosquimicos_wcgetfilterdata.this.AV20DDOName = aP0;
      historicoderecetas_procesosquimicos_wcgetfilterdata.this.AV18SearchTxt = aP1;
      historicoderecetas_procesosquimicos_wcgetfilterdata.this.AV19SearchTxtTo = aP2;
      historicoderecetas_procesosquimicos_wcgetfilterdata.this.aP3 = aP3;
      historicoderecetas_procesosquimicos_wcgetfilterdata.this.aP4 = aP4;
      historicoderecetas_procesosquimicos_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_HREPROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADHREPROCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_HREPRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADHREPRODSCOPTIONS' */
         S131 ();
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
      if ( GXutil.strcmp(AV31Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "HistoricodeRecetas_ProcesosQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINPRO") == 0 )
         {
            AV10TFHreLinPro = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFHreLinPro_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROCOD") == 0 )
         {
            AV12TFHreProCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROCOD_SEL") == 0 )
         {
            AV13TFHreProCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRODSC") == 0 )
         {
            AV14TFHreProDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRODSC_SEL") == 0 )
         {
            AV15TFHreProDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROTIE") == 0 )
         {
            AV16TFHreProTie = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFHreProTie_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV41HreNumCie = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV42HreLinMaq = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFHreProCod = AV18SearchTxt ;
      AV13TFHreProCod_Sel = "" ;
      AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = AV36FilterFullText ;
      AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro = AV10TFHreLinPro ;
      AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to = AV11TFHreLinPro_To ;
      AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = AV12TFHreProCod ;
      AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel = AV13TFHreProCod_Sel ;
      AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = AV14TFHreProDsc ;
      AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel = AV15TFHreProDsc_Sel ;
      AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie = AV16TFHreProTie ;
      AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to = AV17TFHreProTie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ,
                                           Byte.valueOf(AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro) ,
                                           Byte.valueOf(AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to) ,
                                           AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ,
                                           AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ,
                                           AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ,
                                           AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ,
                                           Short.valueOf(AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie) ,
                                           Short.valueOf(AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to) ,
                                           Byte.valueOf(A4550HreLinPro) ,
                                           A4551HreProCod ,
                                           A4552HreProDsc ,
                                           Short.valueOf(A4553HreProTie) ,
                                           A396EmprCod ,
                                           AV37EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV38HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV39HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV40HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV41HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV42HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = GXutil.padr( GXutil.rtrim( AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod), 6, "%") ;
      lV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = GXutil.padr( GXutil.rtrim( AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc), 30, "%") ;
      /* Using cursor P09A32 */
      pr_default.execute(0, new Object[] {AV37EmprCod, Integer.valueOf(AV38HreBarCod), Byte.valueOf(AV39HreBarReo), AV40HreBarPar, Byte.valueOf(AV41HreNumCie), Short.valueOf(AV42HreLinMaq), lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, Byte.valueOf(AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro), Byte.valueOf(AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to), lV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod, AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel, lV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc, AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel, Short.valueOf(AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie), Short.valueOf(AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9A32 = false ;
         A396EmprCod = P09A32_A396EmprCod[0] ;
         A4492HreBarCod = P09A32_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A32_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A32_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A32_A4495HreNumCie[0] ;
         A4545HreLinMaq = P09A32_A4545HreLinMaq[0] ;
         A4551HreProCod = P09A32_A4551HreProCod[0] ;
         A4553HreProTie = P09A32_A4553HreProTie[0] ;
         A4552HreProDsc = P09A32_A4552HreProDsc[0] ;
         A4550HreLinPro = P09A32_A4550HreLinPro[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09A32_A4551HreProCod[0], A4551HreProCod) == 0 ) )
         {
            brk9A32 = false ;
            A396EmprCod = P09A32_A396EmprCod[0] ;
            A4492HreBarCod = P09A32_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A32_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A32_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A32_A4495HreNumCie[0] ;
            A4545HreLinMaq = P09A32_A4545HreLinMaq[0] ;
            A4550HreLinPro = P09A32_A4550HreLinPro[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9A32 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4551HreProCod)==0) )
         {
            AV22Option = A4551HreProCod ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A32 )
         {
            brk9A32 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHREPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFHreProDsc = AV18SearchTxt ;
      AV15TFHreProDsc_Sel = "" ;
      AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = AV36FilterFullText ;
      AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro = AV10TFHreLinPro ;
      AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to = AV11TFHreLinPro_To ;
      AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = AV12TFHreProCod ;
      AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel = AV13TFHreProCod_Sel ;
      AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = AV14TFHreProDsc ;
      AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel = AV15TFHreProDsc_Sel ;
      AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie = AV16TFHreProTie ;
      AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to = AV17TFHreProTie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ,
                                           Byte.valueOf(AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro) ,
                                           Byte.valueOf(AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to) ,
                                           AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ,
                                           AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ,
                                           AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ,
                                           AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ,
                                           Short.valueOf(AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie) ,
                                           Short.valueOf(AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to) ,
                                           Byte.valueOf(A4550HreLinPro) ,
                                           A4551HreProCod ,
                                           A4552HreProDsc ,
                                           Short.valueOf(A4553HreProTie) ,
                                           A396EmprCod ,
                                           AV37EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV38HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV39HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV40HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV41HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV42HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = GXutil.padr( GXutil.rtrim( AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod), 6, "%") ;
      lV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = GXutil.padr( GXutil.rtrim( AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc), 30, "%") ;
      /* Using cursor P09A33 */
      pr_default.execute(1, new Object[] {AV37EmprCod, Integer.valueOf(AV38HreBarCod), Byte.valueOf(AV39HreBarReo), AV40HreBarPar, Byte.valueOf(AV41HreNumCie), Short.valueOf(AV42HreLinMaq), lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, Byte.valueOf(AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro), Byte.valueOf(AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to), lV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod, AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel, lV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc, AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel, Short.valueOf(AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie), Short.valueOf(AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9A34 = false ;
         A396EmprCod = P09A33_A396EmprCod[0] ;
         A4492HreBarCod = P09A33_A4492HreBarCod[0] ;
         A4493HreBarReo = P09A33_A4493HreBarReo[0] ;
         A4494HreBarPar = P09A33_A4494HreBarPar[0] ;
         A4495HreNumCie = P09A33_A4495HreNumCie[0] ;
         A4545HreLinMaq = P09A33_A4545HreLinMaq[0] ;
         A4552HreProDsc = P09A33_A4552HreProDsc[0] ;
         A4553HreProTie = P09A33_A4553HreProTie[0] ;
         A4551HreProCod = P09A33_A4551HreProCod[0] ;
         A4550HreLinPro = P09A33_A4550HreLinPro[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09A33_A4552HreProDsc[0], A4552HreProDsc) == 0 ) )
         {
            brk9A34 = false ;
            A396EmprCod = P09A33_A396EmprCod[0] ;
            A4492HreBarCod = P09A33_A4492HreBarCod[0] ;
            A4493HreBarReo = P09A33_A4493HreBarReo[0] ;
            A4494HreBarPar = P09A33_A4494HreBarPar[0] ;
            A4495HreNumCie = P09A33_A4495HreNumCie[0] ;
            A4545HreLinMaq = P09A33_A4545HreLinMaq[0] ;
            A4550HreLinPro = P09A33_A4550HreLinPro[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9A34 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4552HreProDsc)==0) )
         {
            AV22Option = A4552HreProDsc ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9A34 )
         {
            brk9A34 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = historicoderecetas_procesosquimicos_wcgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = historicoderecetas_procesosquimicos_wcgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = historicoderecetas_procesosquimicos_wcgetfilterdata.this.AV29OptionIndexesJson;
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
      AV12TFHreProCod = "" ;
      AV13TFHreProCod_Sel = "" ;
      AV14TFHreProDsc = "" ;
      AV15TFHreProDsc_Sel = "" ;
      AV37EmprCod = "" ;
      AV40HreBarPar = "" ;
      A4551HreProCod = "" ;
      AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = "" ;
      AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = "" ;
      AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel = "" ;
      AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = "" ;
      AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel = "" ;
      scmdbuf = "" ;
      lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = "" ;
      lV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = "" ;
      lV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = "" ;
      A4552HreProDsc = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P09A32_A396EmprCod = new String[] {""} ;
      P09A32_A4492HreBarCod = new int[1] ;
      P09A32_A4493HreBarReo = new byte[1] ;
      P09A32_A4494HreBarPar = new String[] {""} ;
      P09A32_A4495HreNumCie = new byte[1] ;
      P09A32_A4545HreLinMaq = new short[1] ;
      P09A32_A4551HreProCod = new String[] {""} ;
      P09A32_A4553HreProTie = new short[1] ;
      P09A32_A4552HreProDsc = new String[] {""} ;
      P09A32_A4550HreLinPro = new byte[1] ;
      AV22Option = "" ;
      P09A33_A396EmprCod = new String[] {""} ;
      P09A33_A4492HreBarCod = new int[1] ;
      P09A33_A4493HreBarReo = new byte[1] ;
      P09A33_A4494HreBarPar = new String[] {""} ;
      P09A33_A4495HreNumCie = new byte[1] ;
      P09A33_A4545HreLinMaq = new short[1] ;
      P09A33_A4552HreProDsc = new String[] {""} ;
      P09A33_A4553HreProTie = new short[1] ;
      P09A33_A4551HreProCod = new String[] {""} ;
      P09A33_A4550HreLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_procesosquimicos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09A32_A396EmprCod, P09A32_A4492HreBarCod, P09A32_A4493HreBarReo, P09A32_A4494HreBarPar, P09A32_A4495HreNumCie, P09A32_A4545HreLinMaq, P09A32_A4551HreProCod, P09A32_A4553HreProTie, P09A32_A4552HreProDsc, P09A32_A4550HreLinPro
            }
            , new Object[] {
            P09A33_A396EmprCod, P09A33_A4492HreBarCod, P09A33_A4493HreBarReo, P09A33_A4494HreBarPar, P09A33_A4495HreNumCie, P09A33_A4545HreLinMaq, P09A33_A4552HreProDsc, P09A33_A4553HreProTie, P09A33_A4551HreProCod, P09A33_A4550HreLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFHreLinPro ;
   private byte AV11TFHreLinPro_To ;
   private byte AV39HreBarReo ;
   private byte AV41HreNumCie ;
   private byte AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro ;
   private byte AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to ;
   private byte A4550HreLinPro ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short AV16TFHreProTie ;
   private short AV17TFHreProTie_To ;
   private short AV42HreLinMaq ;
   private short AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie ;
   private short AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to ;
   private short A4553HreProTie ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private int AV38HreBarCod ;
   private int A4492HreBarCod ;
   private long AV30count ;
   private String AV12TFHreProCod ;
   private String AV13TFHreProCod_Sel ;
   private String AV14TFHreProDsc ;
   private String AV15TFHreProDsc_Sel ;
   private String AV37EmprCod ;
   private String AV40HreBarPar ;
   private String A4551HreProCod ;
   private String AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ;
   private String AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ;
   private String AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ;
   private String AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ;
   private String scmdbuf ;
   private String lV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ;
   private String lV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ;
   private String A4552HreProDsc ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private boolean returnInSub ;
   private boolean brk9A32 ;
   private boolean brk9A34 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ;
   private String lV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09A32_A396EmprCod ;
   private int[] P09A32_A4492HreBarCod ;
   private byte[] P09A32_A4493HreBarReo ;
   private String[] P09A32_A4494HreBarPar ;
   private byte[] P09A32_A4495HreNumCie ;
   private short[] P09A32_A4545HreLinMaq ;
   private String[] P09A32_A4551HreProCod ;
   private short[] P09A32_A4553HreProTie ;
   private String[] P09A32_A4552HreProDsc ;
   private byte[] P09A32_A4550HreLinPro ;
   private String[] P09A33_A396EmprCod ;
   private int[] P09A33_A4492HreBarCod ;
   private byte[] P09A33_A4493HreBarReo ;
   private String[] P09A33_A4494HreBarPar ;
   private byte[] P09A33_A4495HreNumCie ;
   private short[] P09A33_A4545HreLinMaq ;
   private String[] P09A33_A4552HreProDsc ;
   private short[] P09A33_A4553HreProTie ;
   private String[] P09A33_A4551HreProCod ;
   private byte[] P09A33_A4550HreLinPro ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class historicoderecetas_procesosquimicos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09A32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ,
                                          byte AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro ,
                                          byte AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to ,
                                          String AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ,
                                          String AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ,
                                          String AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ,
                                          String AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ,
                                          short AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie ,
                                          short AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to ,
                                          byte A4550HreLinPro ,
                                          String A4551HreProCod ,
                                          String A4552HreProDsc ,
                                          short A4553HreProTie ,
                                          String A396EmprCod ,
                                          String AV37EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV38HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV39HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV40HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV41HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV42HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreProCod, HreProTie, HreProDsc, HreLinPro FROM TXPHISREC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(HreLinPro,'90'), 2) like '%' || ?) or ( UPPER(HreProCod) like '%' || UPPER(?)) or ( UPPER(HreProDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreProTie,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro) )
      {
         addWhere(sWhereString, "(HreLinPro >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to) )
      {
         addWhere(sWhereString, "(HreLinPro <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel)==0) && ( ! (GXutil.strcmp("", AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel)==0) )
      {
         addWhere(sWhereString, "(HreProCod = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreProDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie) )
      {
         addWhere(sWhereString, "(HreProTie >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to) )
      {
         addWhere(sWhereString, "(HreProTie <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09A33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ,
                                          byte AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro ,
                                          byte AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to ,
                                          String AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ,
                                          String AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ,
                                          String AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ,
                                          String AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ,
                                          short AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie ,
                                          short AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to ,
                                          byte A4550HreLinPro ,
                                          String A4551HreProCod ,
                                          String A4552HreProDsc ,
                                          short A4553HreProTie ,
                                          String A396EmprCod ,
                                          String AV37EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV38HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV39HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV40HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV41HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV42HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreProDsc, HreProTie, HreProCod, HreLinPro FROM TXPHISREC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV48Historicoderecetas_procesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(HreLinPro,'90'), 2) like '%' || ?) or ( UPPER(HreProCod) like '%' || UPPER(?)) or ( UPPER(HreProDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreProTie,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV49Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro) )
      {
         addWhere(sWhereString, "(HreLinPro >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV50Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to) )
      {
         addWhere(sWhereString, "(HreLinPro <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel)==0) && ( ! (GXutil.strcmp("", AV51Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel)==0) )
      {
         addWhere(sWhereString, "(HreProCod = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreProDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV55Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie) )
      {
         addWhere(sWhereString, "(HreProTie >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV56Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to) )
      {
         addWhere(sWhereString, "(HreProTie <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreProDsc" ;
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
                  return conditional_P09A32(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() );
            case 1 :
                  return conditional_P09A33(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09A33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               return;
      }
   }

}

