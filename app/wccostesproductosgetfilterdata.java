package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wccostesproductosgetfilterdata extends GXProcedure
{
   public wccostesproductosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccostesproductosgetfilterdata.class ), "" );
   }

   public wccostesproductosgetfilterdata( int remoteHandle ,
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
      wccostesproductosgetfilterdata.this.aP5 = new String[] {""};
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
      wccostesproductosgetfilterdata.this.AV28DDOName = aP0;
      wccostesproductosgetfilterdata.this.AV26SearchTxt = aP1;
      wccostesproductosgetfilterdata.this.AV27SearchTxtTo = aP2;
      wccostesproductosgetfilterdata.this.aP3 = aP3;
      wccostesproductosgetfilterdata.this.aP4 = aP4;
      wccostesproductosgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_HREPRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_HREPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_HREPRDUDS") == 0 )
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
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("WCCostesProductosGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCCostesProductosGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("WCCostesProductosGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV14TFHrePrdNum = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV15TFHrePrdNum_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV16TFHrePrdDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV17TFHrePrdDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV18TFHrePrdCant = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFHrePrdCant_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV20TFHrePrdUDs = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV21TFHrePrdUDs_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPREPRD") == 0 )
         {
            AV22TFHrePrePrd = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFHrePrePrd_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV24TFPrdFacCon = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPrdFacCon_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV44Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV45HreBarCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV46HreBarReo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV47HreBarpar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV48HreNumCie = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV49HreLinMaq = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFHrePrdNum = AV26SearchTxt ;
      AV15TFHrePrdNum_Sel = "" ;
      AV55Wccostesproductosds_1_tfhreprdnum = AV14TFHrePrdNum ;
      AV56Wccostesproductosds_2_tfhreprdnum_sel = AV15TFHrePrdNum_Sel ;
      AV57Wccostesproductosds_3_tfhreprddsc = AV16TFHrePrdDsc ;
      AV58Wccostesproductosds_4_tfhreprddsc_sel = AV17TFHrePrdDsc_Sel ;
      AV59Wccostesproductosds_5_tfhreprdcant = AV18TFHrePrdCant ;
      AV60Wccostesproductosds_6_tfhreprdcant_to = AV19TFHrePrdCant_To ;
      AV61Wccostesproductosds_7_tfhreprduds = AV20TFHrePrdUDs ;
      AV62Wccostesproductosds_8_tfhreprduds_sel = AV21TFHrePrdUDs_Sel ;
      AV63Wccostesproductosds_9_tfhrepreprd = AV22TFHrePrePrd ;
      AV64Wccostesproductosds_10_tfhrepreprd_to = AV23TFHrePrePrd_To ;
      AV65Wccostesproductosds_11_tfprdfaccon = AV24TFPrdFacCon ;
      AV66Wccostesproductosds_12_tfprdfaccon_to = AV25TFPrdFacCon_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Wccostesproductosds_2_tfhreprdnum_sel ,
                                           AV55Wccostesproductosds_1_tfhreprdnum ,
                                           AV58Wccostesproductosds_4_tfhreprddsc_sel ,
                                           AV57Wccostesproductosds_3_tfhreprddsc ,
                                           AV59Wccostesproductosds_5_tfhreprdcant ,
                                           AV60Wccostesproductosds_6_tfhreprdcant_to ,
                                           AV62Wccostesproductosds_8_tfhreprduds_sel ,
                                           AV61Wccostesproductosds_7_tfhreprduds ,
                                           AV63Wccostesproductosds_9_tfhrepreprd ,
                                           AV64Wccostesproductosds_10_tfhrepreprd_to ,
                                           AV65Wccostesproductosds_11_tfprdfaccon ,
                                           AV66Wccostesproductosds_12_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           A719PrdNum ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV45HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV46HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV47HreBarpar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV48HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV49HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV55Wccostesproductosds_1_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV55Wccostesproductosds_1_tfhreprdnum), 6, "%") ;
      lV57Wccostesproductosds_3_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV57Wccostesproductosds_3_tfhreprddsc), 26, "%") ;
      lV61Wccostesproductosds_7_tfhreprduds = GXutil.padr( GXutil.rtrim( AV61Wccostesproductosds_7_tfhreprduds), 5, "%") ;
      /* Using cursor P08L72 */
      pr_default.execute(0, new Object[] {AV44Emprcod, Integer.valueOf(AV45HreBarCod), Byte.valueOf(AV46HreBarReo), AV47HreBarpar, Byte.valueOf(AV48HreNumCie), Short.valueOf(AV49HreLinMaq), lV55Wccostesproductosds_1_tfhreprdnum, AV56Wccostesproductosds_2_tfhreprdnum_sel, lV57Wccostesproductosds_3_tfhreprddsc, AV58Wccostesproductosds_4_tfhreprddsc_sel, AV59Wccostesproductosds_5_tfhreprdcant, AV60Wccostesproductosds_6_tfhreprdcant_to, lV61Wccostesproductosds_7_tfhreprduds, AV62Wccostesproductosds_8_tfhreprduds_sel, AV63Wccostesproductosds_9_tfhrepreprd, AV64Wccostesproductosds_10_tfhrepreprd_to, AV65Wccostesproductosds_11_tfprdfaccon, AV66Wccostesproductosds_12_tfprdfaccon_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8L72 = false ;
         A396EmprCod = P08L72_A396EmprCod[0] ;
         A4492HreBarCod = P08L72_A4492HreBarCod[0] ;
         A4493HreBarReo = P08L72_A4493HreBarReo[0] ;
         A4494HreBarPar = P08L72_A4494HreBarPar[0] ;
         A4495HreNumCie = P08L72_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08L72_A4545HreLinMaq[0] ;
         A4558HrePrdNum = P08L72_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08L72_n4558HrePrdNum[0] ;
         A719PrdNum = P08L72_A719PrdNum[0] ;
         n719PrdNum = P08L72_n719PrdNum[0] ;
         A707PrdFacCon = P08L72_A707PrdFacCon[0] ;
         A4967HrePrePrd = P08L72_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P08L72_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = P08L72_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08L72_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P08L72_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08L72_n4563HrePrdCant[0] ;
         A4559HrePrdDsc = P08L72_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08L72_n4559HrePrdDsc[0] ;
         A4550HreLinPro = P08L72_A4550HreLinPro[0] ;
         A4557HreRecLin = P08L72_A4557HreRecLin[0] ;
         A707PrdFacCon = P08L72_A707PrdFacCon[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08L72_A4558HrePrdNum[0], A4558HrePrdNum) == 0 ) )
         {
            brk8L72 = false ;
            A396EmprCod = P08L72_A396EmprCod[0] ;
            A4492HreBarCod = P08L72_A4492HreBarCod[0] ;
            A4493HreBarReo = P08L72_A4493HreBarReo[0] ;
            A4494HreBarPar = P08L72_A4494HreBarPar[0] ;
            A4495HreNumCie = P08L72_A4495HreNumCie[0] ;
            A4545HreLinMaq = P08L72_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08L72_A4550HreLinPro[0] ;
            A4557HreRecLin = P08L72_A4557HreRecLin[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8L72 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4558HrePrdNum)==0) )
         {
            AV30Option = A4558HrePrdNum ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8L72 )
         {
            brk8L72 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHREPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFHrePrdDsc = AV26SearchTxt ;
      AV17TFHrePrdDsc_Sel = "" ;
      AV55Wccostesproductosds_1_tfhreprdnum = AV14TFHrePrdNum ;
      AV56Wccostesproductosds_2_tfhreprdnum_sel = AV15TFHrePrdNum_Sel ;
      AV57Wccostesproductosds_3_tfhreprddsc = AV16TFHrePrdDsc ;
      AV58Wccostesproductosds_4_tfhreprddsc_sel = AV17TFHrePrdDsc_Sel ;
      AV59Wccostesproductosds_5_tfhreprdcant = AV18TFHrePrdCant ;
      AV60Wccostesproductosds_6_tfhreprdcant_to = AV19TFHrePrdCant_To ;
      AV61Wccostesproductosds_7_tfhreprduds = AV20TFHrePrdUDs ;
      AV62Wccostesproductosds_8_tfhreprduds_sel = AV21TFHrePrdUDs_Sel ;
      AV63Wccostesproductosds_9_tfhrepreprd = AV22TFHrePrePrd ;
      AV64Wccostesproductosds_10_tfhrepreprd_to = AV23TFHrePrePrd_To ;
      AV65Wccostesproductosds_11_tfprdfaccon = AV24TFPrdFacCon ;
      AV66Wccostesproductosds_12_tfprdfaccon_to = AV25TFPrdFacCon_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV56Wccostesproductosds_2_tfhreprdnum_sel ,
                                           AV55Wccostesproductosds_1_tfhreprdnum ,
                                           AV58Wccostesproductosds_4_tfhreprddsc_sel ,
                                           AV57Wccostesproductosds_3_tfhreprddsc ,
                                           AV59Wccostesproductosds_5_tfhreprdcant ,
                                           AV60Wccostesproductosds_6_tfhreprdcant_to ,
                                           AV62Wccostesproductosds_8_tfhreprduds_sel ,
                                           AV61Wccostesproductosds_7_tfhreprduds ,
                                           AV63Wccostesproductosds_9_tfhrepreprd ,
                                           AV64Wccostesproductosds_10_tfhrepreprd_to ,
                                           AV65Wccostesproductosds_11_tfprdfaccon ,
                                           AV66Wccostesproductosds_12_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           A719PrdNum ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV45HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV46HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV47HreBarpar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV48HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV49HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV55Wccostesproductosds_1_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV55Wccostesproductosds_1_tfhreprdnum), 6, "%") ;
      lV57Wccostesproductosds_3_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV57Wccostesproductosds_3_tfhreprddsc), 26, "%") ;
      lV61Wccostesproductosds_7_tfhreprduds = GXutil.padr( GXutil.rtrim( AV61Wccostesproductosds_7_tfhreprduds), 5, "%") ;
      /* Using cursor P08L73 */
      pr_default.execute(1, new Object[] {AV44Emprcod, Integer.valueOf(AV45HreBarCod), Byte.valueOf(AV46HreBarReo), AV47HreBarpar, Byte.valueOf(AV48HreNumCie), Short.valueOf(AV49HreLinMaq), lV55Wccostesproductosds_1_tfhreprdnum, AV56Wccostesproductosds_2_tfhreprdnum_sel, lV57Wccostesproductosds_3_tfhreprddsc, AV58Wccostesproductosds_4_tfhreprddsc_sel, AV59Wccostesproductosds_5_tfhreprdcant, AV60Wccostesproductosds_6_tfhreprdcant_to, lV61Wccostesproductosds_7_tfhreprduds, AV62Wccostesproductosds_8_tfhreprduds_sel, AV63Wccostesproductosds_9_tfhrepreprd, AV64Wccostesproductosds_10_tfhrepreprd_to, AV65Wccostesproductosds_11_tfprdfaccon, AV66Wccostesproductosds_12_tfprdfaccon_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8L74 = false ;
         A396EmprCod = P08L73_A396EmprCod[0] ;
         A4492HreBarCod = P08L73_A4492HreBarCod[0] ;
         A4493HreBarReo = P08L73_A4493HreBarReo[0] ;
         A4494HreBarPar = P08L73_A4494HreBarPar[0] ;
         A4495HreNumCie = P08L73_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08L73_A4545HreLinMaq[0] ;
         A4559HrePrdDsc = P08L73_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08L73_n4559HrePrdDsc[0] ;
         A719PrdNum = P08L73_A719PrdNum[0] ;
         n719PrdNum = P08L73_n719PrdNum[0] ;
         A707PrdFacCon = P08L73_A707PrdFacCon[0] ;
         A4967HrePrePrd = P08L73_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P08L73_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = P08L73_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08L73_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P08L73_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08L73_n4563HrePrdCant[0] ;
         A4558HrePrdNum = P08L73_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08L73_n4558HrePrdNum[0] ;
         A4550HreLinPro = P08L73_A4550HreLinPro[0] ;
         A4557HreRecLin = P08L73_A4557HreRecLin[0] ;
         A707PrdFacCon = P08L73_A707PrdFacCon[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08L73_A4559HrePrdDsc[0], A4559HrePrdDsc) == 0 ) )
         {
            brk8L74 = false ;
            A396EmprCod = P08L73_A396EmprCod[0] ;
            A4492HreBarCod = P08L73_A4492HreBarCod[0] ;
            A4493HreBarReo = P08L73_A4493HreBarReo[0] ;
            A4494HreBarPar = P08L73_A4494HreBarPar[0] ;
            A4495HreNumCie = P08L73_A4495HreNumCie[0] ;
            A4545HreLinMaq = P08L73_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08L73_A4550HreLinPro[0] ;
            A4557HreRecLin = P08L73_A4557HreRecLin[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8L74 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4559HrePrdDsc)==0) )
         {
            AV30Option = A4559HrePrdDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8L74 )
         {
            brk8L74 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHREPRDUDSOPTIONS' Routine */
      returnInSub = false ;
      AV20TFHrePrdUDs = AV26SearchTxt ;
      AV21TFHrePrdUDs_Sel = "" ;
      AV55Wccostesproductosds_1_tfhreprdnum = AV14TFHrePrdNum ;
      AV56Wccostesproductosds_2_tfhreprdnum_sel = AV15TFHrePrdNum_Sel ;
      AV57Wccostesproductosds_3_tfhreprddsc = AV16TFHrePrdDsc ;
      AV58Wccostesproductosds_4_tfhreprddsc_sel = AV17TFHrePrdDsc_Sel ;
      AV59Wccostesproductosds_5_tfhreprdcant = AV18TFHrePrdCant ;
      AV60Wccostesproductosds_6_tfhreprdcant_to = AV19TFHrePrdCant_To ;
      AV61Wccostesproductosds_7_tfhreprduds = AV20TFHrePrdUDs ;
      AV62Wccostesproductosds_8_tfhreprduds_sel = AV21TFHrePrdUDs_Sel ;
      AV63Wccostesproductosds_9_tfhrepreprd = AV22TFHrePrePrd ;
      AV64Wccostesproductosds_10_tfhrepreprd_to = AV23TFHrePrePrd_To ;
      AV65Wccostesproductosds_11_tfprdfaccon = AV24TFPrdFacCon ;
      AV66Wccostesproductosds_12_tfprdfaccon_to = AV25TFPrdFacCon_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV56Wccostesproductosds_2_tfhreprdnum_sel ,
                                           AV55Wccostesproductosds_1_tfhreprdnum ,
                                           AV58Wccostesproductosds_4_tfhreprddsc_sel ,
                                           AV57Wccostesproductosds_3_tfhreprddsc ,
                                           AV59Wccostesproductosds_5_tfhreprdcant ,
                                           AV60Wccostesproductosds_6_tfhreprdcant_to ,
                                           AV62Wccostesproductosds_8_tfhreprduds_sel ,
                                           AV61Wccostesproductosds_7_tfhreprduds ,
                                           AV63Wccostesproductosds_9_tfhrepreprd ,
                                           AV64Wccostesproductosds_10_tfhrepreprd_to ,
                                           AV65Wccostesproductosds_11_tfprdfaccon ,
                                           AV66Wccostesproductosds_12_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           A719PrdNum ,
                                           A396EmprCod ,
                                           AV44Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV45HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV46HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV47HreBarpar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV48HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV49HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV55Wccostesproductosds_1_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV55Wccostesproductosds_1_tfhreprdnum), 6, "%") ;
      lV57Wccostesproductosds_3_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV57Wccostesproductosds_3_tfhreprddsc), 26, "%") ;
      lV61Wccostesproductosds_7_tfhreprduds = GXutil.padr( GXutil.rtrim( AV61Wccostesproductosds_7_tfhreprduds), 5, "%") ;
      /* Using cursor P08L74 */
      pr_default.execute(2, new Object[] {AV44Emprcod, Integer.valueOf(AV45HreBarCod), Byte.valueOf(AV46HreBarReo), AV47HreBarpar, Byte.valueOf(AV48HreNumCie), Short.valueOf(AV49HreLinMaq), lV55Wccostesproductosds_1_tfhreprdnum, AV56Wccostesproductosds_2_tfhreprdnum_sel, lV57Wccostesproductosds_3_tfhreprddsc, AV58Wccostesproductosds_4_tfhreprddsc_sel, AV59Wccostesproductosds_5_tfhreprdcant, AV60Wccostesproductosds_6_tfhreprdcant_to, lV61Wccostesproductosds_7_tfhreprduds, AV62Wccostesproductosds_8_tfhreprduds_sel, AV63Wccostesproductosds_9_tfhrepreprd, AV64Wccostesproductosds_10_tfhrepreprd_to, AV65Wccostesproductosds_11_tfprdfaccon, AV66Wccostesproductosds_12_tfprdfaccon_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8L76 = false ;
         A396EmprCod = P08L74_A396EmprCod[0] ;
         A4492HreBarCod = P08L74_A4492HreBarCod[0] ;
         A4493HreBarReo = P08L74_A4493HreBarReo[0] ;
         A4494HreBarPar = P08L74_A4494HreBarPar[0] ;
         A4495HreNumCie = P08L74_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08L74_A4545HreLinMaq[0] ;
         A4561HrePrdUDs = P08L74_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08L74_n4561HrePrdUDs[0] ;
         A719PrdNum = P08L74_A719PrdNum[0] ;
         n719PrdNum = P08L74_n719PrdNum[0] ;
         A707PrdFacCon = P08L74_A707PrdFacCon[0] ;
         A4967HrePrePrd = P08L74_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P08L74_n4967HrePrePrd[0] ;
         A4563HrePrdCant = P08L74_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08L74_n4563HrePrdCant[0] ;
         A4559HrePrdDsc = P08L74_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08L74_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P08L74_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08L74_n4558HrePrdNum[0] ;
         A4550HreLinPro = P08L74_A4550HreLinPro[0] ;
         A4557HreRecLin = P08L74_A4557HreRecLin[0] ;
         A707PrdFacCon = P08L74_A707PrdFacCon[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08L74_A4561HrePrdUDs[0], A4561HrePrdUDs) == 0 ) )
         {
            brk8L76 = false ;
            A396EmprCod = P08L74_A396EmprCod[0] ;
            A4492HreBarCod = P08L74_A4492HreBarCod[0] ;
            A4493HreBarReo = P08L74_A4493HreBarReo[0] ;
            A4494HreBarPar = P08L74_A4494HreBarPar[0] ;
            A4495HreNumCie = P08L74_A4495HreNumCie[0] ;
            A4545HreLinMaq = P08L74_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08L74_A4550HreLinPro[0] ;
            A4557HreRecLin = P08L74_A4557HreRecLin[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8L76 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4561HrePrdUDs)==0) )
         {
            AV30Option = A4561HrePrdUDs ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8L76 )
         {
            brk8L76 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wccostesproductosgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = wccostesproductosgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = wccostesproductosgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV14TFHrePrdNum = "" ;
      AV15TFHrePrdNum_Sel = "" ;
      AV16TFHrePrdDsc = "" ;
      AV17TFHrePrdDsc_Sel = "" ;
      AV18TFHrePrdCant = DecimalUtil.ZERO ;
      AV19TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV20TFHrePrdUDs = "" ;
      AV21TFHrePrdUDs_Sel = "" ;
      AV22TFHrePrePrd = DecimalUtil.ZERO ;
      AV23TFHrePrePrd_To = DecimalUtil.ZERO ;
      AV24TFPrdFacCon = DecimalUtil.ZERO ;
      AV25TFPrdFacCon_To = DecimalUtil.ZERO ;
      AV44Emprcod = "" ;
      AV47HreBarpar = "" ;
      A4558HrePrdNum = "" ;
      AV55Wccostesproductosds_1_tfhreprdnum = "" ;
      AV56Wccostesproductosds_2_tfhreprdnum_sel = "" ;
      AV57Wccostesproductosds_3_tfhreprddsc = "" ;
      AV58Wccostesproductosds_4_tfhreprddsc_sel = "" ;
      AV59Wccostesproductosds_5_tfhreprdcant = DecimalUtil.ZERO ;
      AV60Wccostesproductosds_6_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV61Wccostesproductosds_7_tfhreprduds = "" ;
      AV62Wccostesproductosds_8_tfhreprduds_sel = "" ;
      AV63Wccostesproductosds_9_tfhrepreprd = DecimalUtil.ZERO ;
      AV64Wccostesproductosds_10_tfhrepreprd_to = DecimalUtil.ZERO ;
      AV65Wccostesproductosds_11_tfprdfaccon = DecimalUtil.ZERO ;
      AV66Wccostesproductosds_12_tfprdfaccon_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV55Wccostesproductosds_1_tfhreprdnum = "" ;
      lV57Wccostesproductosds_3_tfhreprddsc = "" ;
      lV61Wccostesproductosds_7_tfhreprduds = "" ;
      A4559HrePrdDsc = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08L72_A396EmprCod = new String[] {""} ;
      P08L72_A4492HreBarCod = new int[1] ;
      P08L72_A4493HreBarReo = new byte[1] ;
      P08L72_A4494HreBarPar = new String[] {""} ;
      P08L72_A4495HreNumCie = new byte[1] ;
      P08L72_A4545HreLinMaq = new short[1] ;
      P08L72_A4558HrePrdNum = new String[] {""} ;
      P08L72_n4558HrePrdNum = new boolean[] {false} ;
      P08L72_A719PrdNum = new String[] {""} ;
      P08L72_n719PrdNum = new boolean[] {false} ;
      P08L72_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L72_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L72_n4967HrePrePrd = new boolean[] {false} ;
      P08L72_A4561HrePrdUDs = new String[] {""} ;
      P08L72_n4561HrePrdUDs = new boolean[] {false} ;
      P08L72_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L72_n4563HrePrdCant = new boolean[] {false} ;
      P08L72_A4559HrePrdDsc = new String[] {""} ;
      P08L72_n4559HrePrdDsc = new boolean[] {false} ;
      P08L72_A4550HreLinPro = new byte[1] ;
      P08L72_A4557HreRecLin = new short[1] ;
      AV30Option = "" ;
      P08L73_A396EmprCod = new String[] {""} ;
      P08L73_A4492HreBarCod = new int[1] ;
      P08L73_A4493HreBarReo = new byte[1] ;
      P08L73_A4494HreBarPar = new String[] {""} ;
      P08L73_A4495HreNumCie = new byte[1] ;
      P08L73_A4545HreLinMaq = new short[1] ;
      P08L73_A4559HrePrdDsc = new String[] {""} ;
      P08L73_n4559HrePrdDsc = new boolean[] {false} ;
      P08L73_A719PrdNum = new String[] {""} ;
      P08L73_n719PrdNum = new boolean[] {false} ;
      P08L73_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L73_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L73_n4967HrePrePrd = new boolean[] {false} ;
      P08L73_A4561HrePrdUDs = new String[] {""} ;
      P08L73_n4561HrePrdUDs = new boolean[] {false} ;
      P08L73_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L73_n4563HrePrdCant = new boolean[] {false} ;
      P08L73_A4558HrePrdNum = new String[] {""} ;
      P08L73_n4558HrePrdNum = new boolean[] {false} ;
      P08L73_A4550HreLinPro = new byte[1] ;
      P08L73_A4557HreRecLin = new short[1] ;
      P08L74_A396EmprCod = new String[] {""} ;
      P08L74_A4492HreBarCod = new int[1] ;
      P08L74_A4493HreBarReo = new byte[1] ;
      P08L74_A4494HreBarPar = new String[] {""} ;
      P08L74_A4495HreNumCie = new byte[1] ;
      P08L74_A4545HreLinMaq = new short[1] ;
      P08L74_A4561HrePrdUDs = new String[] {""} ;
      P08L74_n4561HrePrdUDs = new boolean[] {false} ;
      P08L74_A719PrdNum = new String[] {""} ;
      P08L74_n719PrdNum = new boolean[] {false} ;
      P08L74_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L74_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L74_n4967HrePrePrd = new boolean[] {false} ;
      P08L74_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L74_n4563HrePrdCant = new boolean[] {false} ;
      P08L74_A4559HrePrdDsc = new String[] {""} ;
      P08L74_n4559HrePrdDsc = new boolean[] {false} ;
      P08L74_A4558HrePrdNum = new String[] {""} ;
      P08L74_n4558HrePrdNum = new boolean[] {false} ;
      P08L74_A4550HreLinPro = new byte[1] ;
      P08L74_A4557HreRecLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccostesproductosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08L72_A396EmprCod, P08L72_A4492HreBarCod, P08L72_A4493HreBarReo, P08L72_A4494HreBarPar, P08L72_A4495HreNumCie, P08L72_A4545HreLinMaq, P08L72_A4558HrePrdNum, P08L72_n4558HrePrdNum, P08L72_A719PrdNum, P08L72_n719PrdNum,
            P08L72_A707PrdFacCon, P08L72_A4967HrePrePrd, P08L72_n4967HrePrePrd, P08L72_A4561HrePrdUDs, P08L72_n4561HrePrdUDs, P08L72_A4563HrePrdCant, P08L72_n4563HrePrdCant, P08L72_A4559HrePrdDsc, P08L72_n4559HrePrdDsc, P08L72_A4550HreLinPro,
            P08L72_A4557HreRecLin
            }
            , new Object[] {
            P08L73_A396EmprCod, P08L73_A4492HreBarCod, P08L73_A4493HreBarReo, P08L73_A4494HreBarPar, P08L73_A4495HreNumCie, P08L73_A4545HreLinMaq, P08L73_A4559HrePrdDsc, P08L73_n4559HrePrdDsc, P08L73_A719PrdNum, P08L73_n719PrdNum,
            P08L73_A707PrdFacCon, P08L73_A4967HrePrePrd, P08L73_n4967HrePrePrd, P08L73_A4561HrePrdUDs, P08L73_n4561HrePrdUDs, P08L73_A4563HrePrdCant, P08L73_n4563HrePrdCant, P08L73_A4558HrePrdNum, P08L73_n4558HrePrdNum, P08L73_A4550HreLinPro,
            P08L73_A4557HreRecLin
            }
            , new Object[] {
            P08L74_A396EmprCod, P08L74_A4492HreBarCod, P08L74_A4493HreBarReo, P08L74_A4494HreBarPar, P08L74_A4495HreNumCie, P08L74_A4545HreLinMaq, P08L74_A4561HrePrdUDs, P08L74_n4561HrePrdUDs, P08L74_A719PrdNum, P08L74_n719PrdNum,
            P08L74_A707PrdFacCon, P08L74_A4967HrePrePrd, P08L74_n4967HrePrePrd, P08L74_A4563HrePrdCant, P08L74_n4563HrePrdCant, P08L74_A4559HrePrdDsc, P08L74_n4559HrePrdDsc, P08L74_A4558HrePrdNum, P08L74_n4558HrePrdNum, P08L74_A4550HreLinPro,
            P08L74_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV46HreBarReo ;
   private byte AV48HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short AV49HreLinMaq ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV45HreBarCod ;
   private int A4492HreBarCod ;
   private long AV38count ;
   private java.math.BigDecimal AV18TFHrePrdCant ;
   private java.math.BigDecimal AV19TFHrePrdCant_To ;
   private java.math.BigDecimal AV22TFHrePrePrd ;
   private java.math.BigDecimal AV23TFHrePrePrd_To ;
   private java.math.BigDecimal AV24TFPrdFacCon ;
   private java.math.BigDecimal AV25TFPrdFacCon_To ;
   private java.math.BigDecimal AV59Wccostesproductosds_5_tfhreprdcant ;
   private java.math.BigDecimal AV60Wccostesproductosds_6_tfhreprdcant_to ;
   private java.math.BigDecimal AV63Wccostesproductosds_9_tfhrepreprd ;
   private java.math.BigDecimal AV64Wccostesproductosds_10_tfhrepreprd_to ;
   private java.math.BigDecimal AV65Wccostesproductosds_11_tfprdfaccon ;
   private java.math.BigDecimal AV66Wccostesproductosds_12_tfprdfaccon_to ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal A707PrdFacCon ;
   private String AV14TFHrePrdNum ;
   private String AV15TFHrePrdNum_Sel ;
   private String AV16TFHrePrdDsc ;
   private String AV17TFHrePrdDsc_Sel ;
   private String AV20TFHrePrdUDs ;
   private String AV21TFHrePrdUDs_Sel ;
   private String AV44Emprcod ;
   private String AV47HreBarpar ;
   private String A4558HrePrdNum ;
   private String AV55Wccostesproductosds_1_tfhreprdnum ;
   private String AV56Wccostesproductosds_2_tfhreprdnum_sel ;
   private String AV57Wccostesproductosds_3_tfhreprddsc ;
   private String AV58Wccostesproductosds_4_tfhreprddsc_sel ;
   private String AV61Wccostesproductosds_7_tfhreprduds ;
   private String AV62Wccostesproductosds_8_tfhreprduds_sel ;
   private String scmdbuf ;
   private String lV55Wccostesproductosds_1_tfhreprdnum ;
   private String lV57Wccostesproductosds_3_tfhreprddsc ;
   private String lV61Wccostesproductosds_7_tfhreprduds ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private boolean returnInSub ;
   private boolean brk8L72 ;
   private boolean n4558HrePrdNum ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private boolean n4561HrePrdUDs ;
   private boolean n4563HrePrdCant ;
   private boolean n4559HrePrdDsc ;
   private boolean brk8L74 ;
   private boolean brk8L76 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08L72_A396EmprCod ;
   private int[] P08L72_A4492HreBarCod ;
   private byte[] P08L72_A4493HreBarReo ;
   private String[] P08L72_A4494HreBarPar ;
   private byte[] P08L72_A4495HreNumCie ;
   private short[] P08L72_A4545HreLinMaq ;
   private String[] P08L72_A4558HrePrdNum ;
   private boolean[] P08L72_n4558HrePrdNum ;
   private String[] P08L72_A719PrdNum ;
   private boolean[] P08L72_n719PrdNum ;
   private java.math.BigDecimal[] P08L72_A707PrdFacCon ;
   private java.math.BigDecimal[] P08L72_A4967HrePrePrd ;
   private boolean[] P08L72_n4967HrePrePrd ;
   private String[] P08L72_A4561HrePrdUDs ;
   private boolean[] P08L72_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08L72_A4563HrePrdCant ;
   private boolean[] P08L72_n4563HrePrdCant ;
   private String[] P08L72_A4559HrePrdDsc ;
   private boolean[] P08L72_n4559HrePrdDsc ;
   private byte[] P08L72_A4550HreLinPro ;
   private short[] P08L72_A4557HreRecLin ;
   private String[] P08L73_A396EmprCod ;
   private int[] P08L73_A4492HreBarCod ;
   private byte[] P08L73_A4493HreBarReo ;
   private String[] P08L73_A4494HreBarPar ;
   private byte[] P08L73_A4495HreNumCie ;
   private short[] P08L73_A4545HreLinMaq ;
   private String[] P08L73_A4559HrePrdDsc ;
   private boolean[] P08L73_n4559HrePrdDsc ;
   private String[] P08L73_A719PrdNum ;
   private boolean[] P08L73_n719PrdNum ;
   private java.math.BigDecimal[] P08L73_A707PrdFacCon ;
   private java.math.BigDecimal[] P08L73_A4967HrePrePrd ;
   private boolean[] P08L73_n4967HrePrePrd ;
   private String[] P08L73_A4561HrePrdUDs ;
   private boolean[] P08L73_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08L73_A4563HrePrdCant ;
   private boolean[] P08L73_n4563HrePrdCant ;
   private String[] P08L73_A4558HrePrdNum ;
   private boolean[] P08L73_n4558HrePrdNum ;
   private byte[] P08L73_A4550HreLinPro ;
   private short[] P08L73_A4557HreRecLin ;
   private String[] P08L74_A396EmprCod ;
   private int[] P08L74_A4492HreBarCod ;
   private byte[] P08L74_A4493HreBarReo ;
   private String[] P08L74_A4494HreBarPar ;
   private byte[] P08L74_A4495HreNumCie ;
   private short[] P08L74_A4545HreLinMaq ;
   private String[] P08L74_A4561HrePrdUDs ;
   private boolean[] P08L74_n4561HrePrdUDs ;
   private String[] P08L74_A719PrdNum ;
   private boolean[] P08L74_n719PrdNum ;
   private java.math.BigDecimal[] P08L74_A707PrdFacCon ;
   private java.math.BigDecimal[] P08L74_A4967HrePrePrd ;
   private boolean[] P08L74_n4967HrePrePrd ;
   private java.math.BigDecimal[] P08L74_A4563HrePrdCant ;
   private boolean[] P08L74_n4563HrePrdCant ;
   private String[] P08L74_A4559HrePrdDsc ;
   private boolean[] P08L74_n4559HrePrdDsc ;
   private String[] P08L74_A4558HrePrdNum ;
   private boolean[] P08L74_n4558HrePrdNum ;
   private byte[] P08L74_A4550HreLinPro ;
   private short[] P08L74_A4557HreRecLin ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class wccostesproductosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08L72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Wccostesproductosds_2_tfhreprdnum_sel ,
                                          String AV55Wccostesproductosds_1_tfhreprdnum ,
                                          String AV58Wccostesproductosds_4_tfhreprddsc_sel ,
                                          String AV57Wccostesproductosds_3_tfhreprddsc ,
                                          java.math.BigDecimal AV59Wccostesproductosds_5_tfhreprdcant ,
                                          java.math.BigDecimal AV60Wccostesproductosds_6_tfhreprdcant_to ,
                                          String AV62Wccostesproductosds_8_tfhreprduds_sel ,
                                          String AV61Wccostesproductosds_7_tfhreprduds ,
                                          java.math.BigDecimal AV63Wccostesproductosds_9_tfhrepreprd ,
                                          java.math.BigDecimal AV64Wccostesproductosds_10_tfhrepreprd_to ,
                                          java.math.BigDecimal AV65Wccostesproductosds_11_tfprdfaccon ,
                                          java.math.BigDecimal AV66Wccostesproductosds_12_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A719PrdNum ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV45HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV46HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV47HreBarpar ,
                                          byte A4495HreNumCie ,
                                          byte AV48HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV49HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HrePrdNum, T1.PrdNum, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant," ;
      scmdbuf += " T1.HrePrdDsc, T1.HreLinPro, T1.HreRecLin FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL)))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> 'C')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ?)");
      addWhere(sWhereString, "(T1.HreBarReo = ?)");
      addWhere(sWhereString, "(T1.HreBarPar = ?)");
      addWhere(sWhereString, "(T1.HreNumCie = ?)");
      addWhere(sWhereString, "(T1.HreLinMaq = ?)");
      if ( (GXutil.strcmp("", AV56Wccostesproductosds_2_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Wccostesproductosds_1_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wccostesproductosds_2_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wccostesproductosds_4_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wccostesproductosds_3_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wccostesproductosds_4_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wccostesproductosds_5_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wccostesproductosds_6_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wccostesproductosds_8_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV61Wccostesproductosds_7_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wccostesproductosds_8_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wccostesproductosds_9_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wccostesproductosds_10_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wccostesproductosds_11_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wccostesproductosds_12_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HrePrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08L73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Wccostesproductosds_2_tfhreprdnum_sel ,
                                          String AV55Wccostesproductosds_1_tfhreprdnum ,
                                          String AV58Wccostesproductosds_4_tfhreprddsc_sel ,
                                          String AV57Wccostesproductosds_3_tfhreprddsc ,
                                          java.math.BigDecimal AV59Wccostesproductosds_5_tfhreprdcant ,
                                          java.math.BigDecimal AV60Wccostesproductosds_6_tfhreprdcant_to ,
                                          String AV62Wccostesproductosds_8_tfhreprduds_sel ,
                                          String AV61Wccostesproductosds_7_tfhreprduds ,
                                          java.math.BigDecimal AV63Wccostesproductosds_9_tfhrepreprd ,
                                          java.math.BigDecimal AV64Wccostesproductosds_10_tfhrepreprd_to ,
                                          java.math.BigDecimal AV65Wccostesproductosds_11_tfprdfaccon ,
                                          java.math.BigDecimal AV66Wccostesproductosds_12_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A719PrdNum ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV45HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV46HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV47HreBarpar ,
                                          byte A4495HreNumCie ,
                                          byte AV48HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV49HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HrePrdDsc, T1.PrdNum, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant," ;
      scmdbuf += " T1.HrePrdNum, T1.HreLinPro, T1.HreRecLin FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL)))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> 'C')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ?)");
      addWhere(sWhereString, "(T1.HreBarReo = ?)");
      addWhere(sWhereString, "(T1.HreBarPar = ?)");
      addWhere(sWhereString, "(T1.HreNumCie = ?)");
      addWhere(sWhereString, "(T1.HreLinMaq = ?)");
      if ( (GXutil.strcmp("", AV56Wccostesproductosds_2_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Wccostesproductosds_1_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wccostesproductosds_2_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wccostesproductosds_4_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wccostesproductosds_3_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wccostesproductosds_4_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wccostesproductosds_5_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wccostesproductosds_6_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wccostesproductosds_8_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV61Wccostesproductosds_7_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wccostesproductosds_8_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wccostesproductosds_9_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wccostesproductosds_10_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wccostesproductosds_11_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wccostesproductosds_12_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HrePrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08L74( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Wccostesproductosds_2_tfhreprdnum_sel ,
                                          String AV55Wccostesproductosds_1_tfhreprdnum ,
                                          String AV58Wccostesproductosds_4_tfhreprddsc_sel ,
                                          String AV57Wccostesproductosds_3_tfhreprddsc ,
                                          java.math.BigDecimal AV59Wccostesproductosds_5_tfhreprdcant ,
                                          java.math.BigDecimal AV60Wccostesproductosds_6_tfhreprdcant_to ,
                                          String AV62Wccostesproductosds_8_tfhreprduds_sel ,
                                          String AV61Wccostesproductosds_7_tfhreprduds ,
                                          java.math.BigDecimal AV63Wccostesproductosds_9_tfhrepreprd ,
                                          java.math.BigDecimal AV64Wccostesproductosds_10_tfhrepreprd_to ,
                                          java.math.BigDecimal AV65Wccostesproductosds_11_tfprdfaccon ,
                                          java.math.BigDecimal AV66Wccostesproductosds_12_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A719PrdNum ,
                                          String A396EmprCod ,
                                          String AV44Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV45HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV46HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV47HreBarpar ,
                                          byte A4495HreNumCie ,
                                          byte AV48HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV49HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HrePrdUDs, T1.PrdNum, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdCant, T1.HrePrdDsc," ;
      scmdbuf += " T1.HrePrdNum, T1.HreLinPro, T1.HreRecLin FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL)))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> 'C')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ?)");
      addWhere(sWhereString, "(T1.HreBarReo = ?)");
      addWhere(sWhereString, "(T1.HreBarPar = ?)");
      addWhere(sWhereString, "(T1.HreNumCie = ?)");
      addWhere(sWhereString, "(T1.HreLinMaq = ?)");
      if ( (GXutil.strcmp("", AV56Wccostesproductosds_2_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Wccostesproductosds_1_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wccostesproductosds_2_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wccostesproductosds_4_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wccostesproductosds_3_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wccostesproductosds_4_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wccostesproductosds_5_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wccostesproductosds_6_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wccostesproductosds_8_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV61Wccostesproductosds_7_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wccostesproductosds_8_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wccostesproductosds_9_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wccostesproductosds_10_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wccostesproductosds_11_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wccostesproductosds_12_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
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
                  return conditional_P08L72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() );
            case 1 :
                  return conditional_P08L73(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() );
            case 2 :
                  return conditional_P08L74(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08L72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L74", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
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
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
            case 2 :
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
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
      }
   }

}

