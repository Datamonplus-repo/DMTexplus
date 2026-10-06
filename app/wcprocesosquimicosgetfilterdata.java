package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcprocesosquimicosgetfilterdata extends GXProcedure
{
   public wcprocesosquimicosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcprocesosquimicosgetfilterdata.class ), "" );
   }

   public wcprocesosquimicosgetfilterdata( int remoteHandle ,
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
      wcprocesosquimicosgetfilterdata.this.aP5 = new String[] {""};
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
      wcprocesosquimicosgetfilterdata.this.AV20DDOName = aP0;
      wcprocesosquimicosgetfilterdata.this.AV18SearchTxt = aP1;
      wcprocesosquimicosgetfilterdata.this.AV19SearchTxtTo = aP2;
      wcprocesosquimicosgetfilterdata.this.aP3 = aP3;
      wcprocesosquimicosgetfilterdata.this.aP4 = aP4;
      wcprocesosquimicosgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV31Session.getValue("WCProcesosQuimicosGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCProcesosQuimicosGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WCProcesosQuimicosGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINPRO") == 0 )
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
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFHreProCod = AV18SearchTxt ;
      AV13TFHreProCod_Sel = "" ;
      AV55Wcprocesosquimicosds_1_tfhrelinpro = AV10TFHreLinPro ;
      AV56Wcprocesosquimicosds_2_tfhrelinpro_to = AV11TFHreLinPro_To ;
      AV57Wcprocesosquimicosds_3_tfhreprocod = AV12TFHreProCod ;
      AV58Wcprocesosquimicosds_4_tfhreprocod_sel = AV13TFHreProCod_Sel ;
      AV59Wcprocesosquimicosds_5_tfhreprodsc = AV14TFHreProDsc ;
      AV60Wcprocesosquimicosds_6_tfhreprodsc_sel = AV15TFHreProDsc_Sel ;
      AV61Wcprocesosquimicosds_7_tfhreprotie = AV16TFHreProTie ;
      AV62Wcprocesosquimicosds_8_tfhreprotie_to = AV17TFHreProTie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV55Wcprocesosquimicosds_1_tfhrelinpro) ,
                                           Byte.valueOf(AV56Wcprocesosquimicosds_2_tfhrelinpro_to) ,
                                           AV58Wcprocesosquimicosds_4_tfhreprocod_sel ,
                                           AV57Wcprocesosquimicosds_3_tfhreprocod ,
                                           AV60Wcprocesosquimicosds_6_tfhreprodsc_sel ,
                                           AV59Wcprocesosquimicosds_5_tfhreprodsc ,
                                           Short.valueOf(AV61Wcprocesosquimicosds_7_tfhreprotie) ,
                                           Short.valueOf(AV62Wcprocesosquimicosds_8_tfhreprotie_to) ,
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
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV57Wcprocesosquimicosds_3_tfhreprocod = GXutil.padr( GXutil.rtrim( AV57Wcprocesosquimicosds_3_tfhreprocod), 6, "%") ;
      lV59Wcprocesosquimicosds_5_tfhreprodsc = GXutil.padr( GXutil.rtrim( AV59Wcprocesosquimicosds_5_tfhreprodsc), 30, "%") ;
      /* Using cursor P08Z42 */
      pr_default.execute(0, new Object[] {AV37EmprCod, Integer.valueOf(AV38HreBarCod), Byte.valueOf(AV39HreBarReo), AV40HreBarPar, Byte.valueOf(AV41HreNumCie), Short.valueOf(AV42HreLinMaq), Byte.valueOf(AV55Wcprocesosquimicosds_1_tfhrelinpro), Byte.valueOf(AV56Wcprocesosquimicosds_2_tfhrelinpro_to), lV57Wcprocesosquimicosds_3_tfhreprocod, AV58Wcprocesosquimicosds_4_tfhreprocod_sel, lV59Wcprocesosquimicosds_5_tfhreprodsc, AV60Wcprocesosquimicosds_6_tfhreprodsc_sel, Short.valueOf(AV61Wcprocesosquimicosds_7_tfhreprotie), Short.valueOf(AV62Wcprocesosquimicosds_8_tfhreprotie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8Z42 = false ;
         A396EmprCod = P08Z42_A396EmprCod[0] ;
         A4492HreBarCod = P08Z42_A4492HreBarCod[0] ;
         A4493HreBarReo = P08Z42_A4493HreBarReo[0] ;
         A4494HreBarPar = P08Z42_A4494HreBarPar[0] ;
         A4495HreNumCie = P08Z42_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08Z42_A4545HreLinMaq[0] ;
         A4551HreProCod = P08Z42_A4551HreProCod[0] ;
         A4553HreProTie = P08Z42_A4553HreProTie[0] ;
         A4552HreProDsc = P08Z42_A4552HreProDsc[0] ;
         A4550HreLinPro = P08Z42_A4550HreLinPro[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08Z42_A4551HreProCod[0], A4551HreProCod) == 0 ) )
         {
            brk8Z42 = false ;
            A396EmprCod = P08Z42_A396EmprCod[0] ;
            A4492HreBarCod = P08Z42_A4492HreBarCod[0] ;
            A4493HreBarReo = P08Z42_A4493HreBarReo[0] ;
            A4494HreBarPar = P08Z42_A4494HreBarPar[0] ;
            A4495HreNumCie = P08Z42_A4495HreNumCie[0] ;
            A4545HreLinMaq = P08Z42_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08Z42_A4550HreLinPro[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8Z42 = true ;
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
         if ( ! brk8Z42 )
         {
            brk8Z42 = true ;
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
      AV55Wcprocesosquimicosds_1_tfhrelinpro = AV10TFHreLinPro ;
      AV56Wcprocesosquimicosds_2_tfhrelinpro_to = AV11TFHreLinPro_To ;
      AV57Wcprocesosquimicosds_3_tfhreprocod = AV12TFHreProCod ;
      AV58Wcprocesosquimicosds_4_tfhreprocod_sel = AV13TFHreProCod_Sel ;
      AV59Wcprocesosquimicosds_5_tfhreprodsc = AV14TFHreProDsc ;
      AV60Wcprocesosquimicosds_6_tfhreprodsc_sel = AV15TFHreProDsc_Sel ;
      AV61Wcprocesosquimicosds_7_tfhreprotie = AV16TFHreProTie ;
      AV62Wcprocesosquimicosds_8_tfhreprotie_to = AV17TFHreProTie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV55Wcprocesosquimicosds_1_tfhrelinpro) ,
                                           Byte.valueOf(AV56Wcprocesosquimicosds_2_tfhrelinpro_to) ,
                                           AV58Wcprocesosquimicosds_4_tfhreprocod_sel ,
                                           AV57Wcprocesosquimicosds_3_tfhreprocod ,
                                           AV60Wcprocesosquimicosds_6_tfhreprodsc_sel ,
                                           AV59Wcprocesosquimicosds_5_tfhreprodsc ,
                                           Short.valueOf(AV61Wcprocesosquimicosds_7_tfhreprotie) ,
                                           Short.valueOf(AV62Wcprocesosquimicosds_8_tfhreprotie_to) ,
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
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV57Wcprocesosquimicosds_3_tfhreprocod = GXutil.padr( GXutil.rtrim( AV57Wcprocesosquimicosds_3_tfhreprocod), 6, "%") ;
      lV59Wcprocesosquimicosds_5_tfhreprodsc = GXutil.padr( GXutil.rtrim( AV59Wcprocesosquimicosds_5_tfhreprodsc), 30, "%") ;
      /* Using cursor P08Z43 */
      pr_default.execute(1, new Object[] {AV37EmprCod, Integer.valueOf(AV38HreBarCod), Byte.valueOf(AV39HreBarReo), AV40HreBarPar, Byte.valueOf(AV41HreNumCie), Short.valueOf(AV42HreLinMaq), Byte.valueOf(AV55Wcprocesosquimicosds_1_tfhrelinpro), Byte.valueOf(AV56Wcprocesosquimicosds_2_tfhrelinpro_to), lV57Wcprocesosquimicosds_3_tfhreprocod, AV58Wcprocesosquimicosds_4_tfhreprocod_sel, lV59Wcprocesosquimicosds_5_tfhreprodsc, AV60Wcprocesosquimicosds_6_tfhreprodsc_sel, Short.valueOf(AV61Wcprocesosquimicosds_7_tfhreprotie), Short.valueOf(AV62Wcprocesosquimicosds_8_tfhreprotie_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8Z44 = false ;
         A396EmprCod = P08Z43_A396EmprCod[0] ;
         A4492HreBarCod = P08Z43_A4492HreBarCod[0] ;
         A4493HreBarReo = P08Z43_A4493HreBarReo[0] ;
         A4494HreBarPar = P08Z43_A4494HreBarPar[0] ;
         A4495HreNumCie = P08Z43_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08Z43_A4545HreLinMaq[0] ;
         A4552HreProDsc = P08Z43_A4552HreProDsc[0] ;
         A4553HreProTie = P08Z43_A4553HreProTie[0] ;
         A4551HreProCod = P08Z43_A4551HreProCod[0] ;
         A4550HreLinPro = P08Z43_A4550HreLinPro[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08Z43_A4552HreProDsc[0], A4552HreProDsc) == 0 ) )
         {
            brk8Z44 = false ;
            A396EmprCod = P08Z43_A396EmprCod[0] ;
            A4492HreBarCod = P08Z43_A4492HreBarCod[0] ;
            A4493HreBarReo = P08Z43_A4493HreBarReo[0] ;
            A4494HreBarPar = P08Z43_A4494HreBarPar[0] ;
            A4495HreNumCie = P08Z43_A4495HreNumCie[0] ;
            A4545HreLinMaq = P08Z43_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08Z43_A4550HreLinPro[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8Z44 = true ;
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
         if ( ! brk8Z44 )
         {
            brk8Z44 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcprocesosquimicosgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = wcprocesosquimicosgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = wcprocesosquimicosgetfilterdata.this.AV29OptionIndexesJson;
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
      AV12TFHreProCod = "" ;
      AV13TFHreProCod_Sel = "" ;
      AV14TFHreProDsc = "" ;
      AV15TFHreProDsc_Sel = "" ;
      AV37EmprCod = "" ;
      AV40HreBarPar = "" ;
      A4551HreProCod = "" ;
      AV57Wcprocesosquimicosds_3_tfhreprocod = "" ;
      AV58Wcprocesosquimicosds_4_tfhreprocod_sel = "" ;
      AV59Wcprocesosquimicosds_5_tfhreprodsc = "" ;
      AV60Wcprocesosquimicosds_6_tfhreprodsc_sel = "" ;
      scmdbuf = "" ;
      lV57Wcprocesosquimicosds_3_tfhreprocod = "" ;
      lV59Wcprocesosquimicosds_5_tfhreprodsc = "" ;
      A4552HreProDsc = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08Z42_A396EmprCod = new String[] {""} ;
      P08Z42_A4492HreBarCod = new int[1] ;
      P08Z42_A4493HreBarReo = new byte[1] ;
      P08Z42_A4494HreBarPar = new String[] {""} ;
      P08Z42_A4495HreNumCie = new byte[1] ;
      P08Z42_A4545HreLinMaq = new short[1] ;
      P08Z42_A4551HreProCod = new String[] {""} ;
      P08Z42_A4553HreProTie = new short[1] ;
      P08Z42_A4552HreProDsc = new String[] {""} ;
      P08Z42_A4550HreLinPro = new byte[1] ;
      AV22Option = "" ;
      P08Z43_A396EmprCod = new String[] {""} ;
      P08Z43_A4492HreBarCod = new int[1] ;
      P08Z43_A4493HreBarReo = new byte[1] ;
      P08Z43_A4494HreBarPar = new String[] {""} ;
      P08Z43_A4495HreNumCie = new byte[1] ;
      P08Z43_A4545HreLinMaq = new short[1] ;
      P08Z43_A4552HreProDsc = new String[] {""} ;
      P08Z43_A4553HreProTie = new short[1] ;
      P08Z43_A4551HreProCod = new String[] {""} ;
      P08Z43_A4550HreLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcprocesosquimicosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08Z42_A396EmprCod, P08Z42_A4492HreBarCod, P08Z42_A4493HreBarReo, P08Z42_A4494HreBarPar, P08Z42_A4495HreNumCie, P08Z42_A4545HreLinMaq, P08Z42_A4551HreProCod, P08Z42_A4553HreProTie, P08Z42_A4552HreProDsc, P08Z42_A4550HreLinPro
            }
            , new Object[] {
            P08Z43_A396EmprCod, P08Z43_A4492HreBarCod, P08Z43_A4493HreBarReo, P08Z43_A4494HreBarPar, P08Z43_A4495HreNumCie, P08Z43_A4545HreLinMaq, P08Z43_A4552HreProDsc, P08Z43_A4553HreProTie, P08Z43_A4551HreProCod, P08Z43_A4550HreLinPro
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
   private byte AV55Wcprocesosquimicosds_1_tfhrelinpro ;
   private byte AV56Wcprocesosquimicosds_2_tfhrelinpro_to ;
   private byte A4550HreLinPro ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short AV16TFHreProTie ;
   private short AV17TFHreProTie_To ;
   private short AV42HreLinMaq ;
   private short AV61Wcprocesosquimicosds_7_tfhreprotie ;
   private short AV62Wcprocesosquimicosds_8_tfhreprotie_to ;
   private short A4553HreProTie ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV53GXV1 ;
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
   private String AV57Wcprocesosquimicosds_3_tfhreprocod ;
   private String AV58Wcprocesosquimicosds_4_tfhreprocod_sel ;
   private String AV59Wcprocesosquimicosds_5_tfhreprodsc ;
   private String AV60Wcprocesosquimicosds_6_tfhreprodsc_sel ;
   private String scmdbuf ;
   private String lV57Wcprocesosquimicosds_3_tfhreprocod ;
   private String lV59Wcprocesosquimicosds_5_tfhreprodsc ;
   private String A4552HreProDsc ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private boolean returnInSub ;
   private boolean brk8Z42 ;
   private boolean brk8Z44 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08Z42_A396EmprCod ;
   private int[] P08Z42_A4492HreBarCod ;
   private byte[] P08Z42_A4493HreBarReo ;
   private String[] P08Z42_A4494HreBarPar ;
   private byte[] P08Z42_A4495HreNumCie ;
   private short[] P08Z42_A4545HreLinMaq ;
   private String[] P08Z42_A4551HreProCod ;
   private short[] P08Z42_A4553HreProTie ;
   private String[] P08Z42_A4552HreProDsc ;
   private byte[] P08Z42_A4550HreLinPro ;
   private String[] P08Z43_A396EmprCod ;
   private int[] P08Z43_A4492HreBarCod ;
   private byte[] P08Z43_A4493HreBarReo ;
   private String[] P08Z43_A4494HreBarPar ;
   private byte[] P08Z43_A4495HreNumCie ;
   private short[] P08Z43_A4545HreLinMaq ;
   private String[] P08Z43_A4552HreProDsc ;
   private short[] P08Z43_A4553HreProTie ;
   private String[] P08Z43_A4551HreProCod ;
   private byte[] P08Z43_A4550HreLinPro ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcprocesosquimicosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Z42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV55Wcprocesosquimicosds_1_tfhrelinpro ,
                                          byte AV56Wcprocesosquimicosds_2_tfhrelinpro_to ,
                                          String AV58Wcprocesosquimicosds_4_tfhreprocod_sel ,
                                          String AV57Wcprocesosquimicosds_3_tfhreprocod ,
                                          String AV60Wcprocesosquimicosds_6_tfhreprodsc_sel ,
                                          String AV59Wcprocesosquimicosds_5_tfhreprodsc ,
                                          short AV61Wcprocesosquimicosds_7_tfhreprotie ,
                                          short AV62Wcprocesosquimicosds_8_tfhreprotie_to ,
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
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreProCod, HreProTie, HreProDsc, HreLinPro FROM TXPHISREC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMaq = ?)");
      if ( ! (0==AV55Wcprocesosquimicosds_1_tfhrelinpro) )
      {
         addWhere(sWhereString, "(HreLinPro >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV56Wcprocesosquimicosds_2_tfhrelinpro_to) )
      {
         addWhere(sWhereString, "(HreLinPro <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcprocesosquimicosds_4_tfhreprocod_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcprocesosquimicosds_3_tfhreprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcprocesosquimicosds_4_tfhreprocod_sel)==0) )
      {
         addWhere(sWhereString, "(HreProCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcprocesosquimicosds_6_tfhreprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcprocesosquimicosds_5_tfhreprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcprocesosquimicosds_6_tfhreprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreProDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV61Wcprocesosquimicosds_7_tfhreprotie) )
      {
         addWhere(sWhereString, "(HreProTie >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV62Wcprocesosquimicosds_8_tfhreprotie_to) )
      {
         addWhere(sWhereString, "(HreProTie <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08Z43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV55Wcprocesosquimicosds_1_tfhrelinpro ,
                                          byte AV56Wcprocesosquimicosds_2_tfhrelinpro_to ,
                                          String AV58Wcprocesosquimicosds_4_tfhreprocod_sel ,
                                          String AV57Wcprocesosquimicosds_3_tfhreprocod ,
                                          String AV60Wcprocesosquimicosds_6_tfhreprodsc_sel ,
                                          String AV59Wcprocesosquimicosds_5_tfhreprodsc ,
                                          short AV61Wcprocesosquimicosds_7_tfhreprotie ,
                                          short AV62Wcprocesosquimicosds_8_tfhreprotie_to ,
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
      byte[] GXv_int4 = new byte[14];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreProDsc, HreProTie, HreProCod, HreLinPro FROM TXPHISREC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMaq = ?)");
      if ( ! (0==AV55Wcprocesosquimicosds_1_tfhrelinpro) )
      {
         addWhere(sWhereString, "(HreLinPro >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV56Wcprocesosquimicosds_2_tfhrelinpro_to) )
      {
         addWhere(sWhereString, "(HreLinPro <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcprocesosquimicosds_4_tfhreprocod_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcprocesosquimicosds_3_tfhreprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcprocesosquimicosds_4_tfhreprocod_sel)==0) )
      {
         addWhere(sWhereString, "(HreProCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcprocesosquimicosds_6_tfhreprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcprocesosquimicosds_5_tfhreprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcprocesosquimicosds_6_tfhreprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreProDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV61Wcprocesosquimicosds_7_tfhreprotie) )
      {
         addWhere(sWhereString, "(HreProTie >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV62Wcprocesosquimicosds_8_tfhreprotie_to) )
      {
         addWhere(sWhereString, "(HreProTie <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
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
                  return conditional_P08Z42(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() );
            case 1 :
                  return conditional_P08Z43(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Z42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Z43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               return;
      }
   }

}

