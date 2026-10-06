package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class testmenugetfilterdata extends GXProcedure
{
   public testmenugetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testmenugetfilterdata.class ), "" );
   }

   public testmenugetfilterdata( int remoteHandle ,
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
      testmenugetfilterdata.this.aP5 = new String[] {""};
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
      testmenugetfilterdata.this.AV36DDOName = aP0;
      testmenugetfilterdata.this.AV37SearchTxt = aP1;
      testmenugetfilterdata.this.AV38SearchTxtTo = aP2;
      testmenugetfilterdata.this.aP3 = aP3;
      testmenugetfilterdata.this.aP4 = aP4;
      testmenugetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MNUID") == 0 )
      {
         /* Execute user subroutine: 'LOADMNUIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MNUPGMTPO") == 0 )
      {
         /* Execute user subroutine: 'LOADMNUPGMTPOOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MNUTXT") == 0 )
      {
         /* Execute user subroutine: 'LOADMNUTXTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MNUPGMTXT") == 0 )
      {
         /* Execute user subroutine: 'LOADMNUPGMTXTOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MNUPGM") == 0 )
      {
         /* Execute user subroutine: 'LOADMNUPGMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MNUPGMWEB") == 0 )
      {
         /* Execute user subroutine: 'LOADMNUPGMWEBOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV39OptionsJson = AV26Options.toJSonString(false) ;
      AV40OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV29OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("TestMenuGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TestMenuGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("TestMenuGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUID") == 0 )
         {
            AV10TFMnuId = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUID_SEL") == 0 )
         {
            AV11TFMnuId_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUOP") == 0 )
         {
            AV12TFMnuOp = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFMnuOp_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMTPO") == 0 )
         {
            AV14TFMnuPgmTpo = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMTPO_SEL") == 0 )
         {
            AV15TFMnuPgmTpo_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUTXT") == 0 )
         {
            AV18TFMnuTxt = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUTXT_SEL") == 0 )
         {
            AV19TFMnuTxt_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMTXT") == 0 )
         {
            AV16TFMnuPgmTxt = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMTXT_SEL") == 0 )
         {
            AV17TFMnuPgmTxt_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGM") == 0 )
         {
            AV20TFMnuPgm = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGM_SEL") == 0 )
         {
            AV21TFMnuPgm_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMWEB") == 0 )
         {
            AV22TFMnuPgmWeb = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMWEB_SEL") == 0 )
         {
            AV23TFMnuPgmWeb_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMNUIDOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMnuId = AV37SearchTxt ;
      AV11TFMnuId_Sel = "" ;
      AV48Testmenuds_1_tfmnuid = AV10TFMnuId ;
      AV49Testmenuds_2_tfmnuid_sel = AV11TFMnuId_Sel ;
      AV50Testmenuds_3_tfmnuop = AV12TFMnuOp ;
      AV51Testmenuds_4_tfmnuop_to = AV13TFMnuOp_To ;
      AV52Testmenuds_5_tfmnupgmtpo = AV14TFMnuPgmTpo ;
      AV53Testmenuds_6_tfmnupgmtpo_sel = AV15TFMnuPgmTpo_Sel ;
      AV54Testmenuds_7_tfmnutxt = AV18TFMnuTxt ;
      AV55Testmenuds_8_tfmnutxt_sel = AV19TFMnuTxt_Sel ;
      AV56Testmenuds_9_tfmnupgmtxt = AV16TFMnuPgmTxt ;
      AV57Testmenuds_10_tfmnupgmtxt_sel = AV17TFMnuPgmTxt_Sel ;
      AV58Testmenuds_11_tfmnupgm = AV20TFMnuPgm ;
      AV59Testmenuds_12_tfmnupgm_sel = AV21TFMnuPgm_Sel ;
      AV60Testmenuds_13_tfmnupgmweb = AV22TFMnuPgmWeb ;
      AV61Testmenuds_14_tfmnupgmweb_sel = AV23TFMnuPgmWeb_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Testmenuds_2_tfmnuid_sel ,
                                           AV48Testmenuds_1_tfmnuid ,
                                           Byte.valueOf(AV50Testmenuds_3_tfmnuop) ,
                                           Byte.valueOf(AV51Testmenuds_4_tfmnuop_to) ,
                                           AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                           AV52Testmenuds_5_tfmnupgmtpo ,
                                           AV55Testmenuds_8_tfmnutxt_sel ,
                                           AV54Testmenuds_7_tfmnutxt ,
                                           AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                           AV56Testmenuds_9_tfmnupgmtxt ,
                                           AV59Testmenuds_12_tfmnupgm_sel ,
                                           AV58Testmenuds_11_tfmnupgm ,
                                           AV61Testmenuds_14_tfmnupgmweb_sel ,
                                           AV60Testmenuds_13_tfmnupgmweb ,
                                           A945MnuId ,
                                           Byte.valueOf(A946MnuOp) ,
                                           A948MnuPgmTpo ,
                                           A951MnuTxt ,
                                           A949MnuPgmTxt ,
                                           A947MnuPgm ,
                                           A14286MnuPgmWeb } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV48Testmenuds_1_tfmnuid = GXutil.padr( GXutil.rtrim( AV48Testmenuds_1_tfmnuid), 8, "%") ;
      lV52Testmenuds_5_tfmnupgmtpo = GXutil.padr( GXutil.rtrim( AV52Testmenuds_5_tfmnupgmtpo), 1, "%") ;
      lV54Testmenuds_7_tfmnutxt = GXutil.padr( GXutil.rtrim( AV54Testmenuds_7_tfmnutxt), 30, "%") ;
      lV56Testmenuds_9_tfmnupgmtxt = GXutil.padr( GXutil.rtrim( AV56Testmenuds_9_tfmnupgmtxt), 30, "%") ;
      lV58Testmenuds_11_tfmnupgm = GXutil.padr( GXutil.rtrim( AV58Testmenuds_11_tfmnupgm), 8, "%") ;
      lV60Testmenuds_13_tfmnupgmweb = GXutil.concat( GXutil.rtrim( AV60Testmenuds_13_tfmnupgmweb), "%", "") ;
      /* Using cursor P0A872 */
      pr_default.execute(0, new Object[] {lV48Testmenuds_1_tfmnuid, AV49Testmenuds_2_tfmnuid_sel, Byte.valueOf(AV50Testmenuds_3_tfmnuop), Byte.valueOf(AV51Testmenuds_4_tfmnuop_to), lV52Testmenuds_5_tfmnupgmtpo, AV53Testmenuds_6_tfmnupgmtpo_sel, lV54Testmenuds_7_tfmnutxt, AV55Testmenuds_8_tfmnutxt_sel, lV56Testmenuds_9_tfmnupgmtxt, AV57Testmenuds_10_tfmnupgmtxt_sel, lV58Testmenuds_11_tfmnupgm, AV59Testmenuds_12_tfmnupgm_sel, lV60Testmenuds_13_tfmnupgmweb, AV61Testmenuds_14_tfmnupgmweb_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA872 = false ;
         A945MnuId = P0A872_A945MnuId[0] ;
         A14286MnuPgmWeb = P0A872_A14286MnuPgmWeb[0] ;
         A947MnuPgm = P0A872_A947MnuPgm[0] ;
         A949MnuPgmTxt = P0A872_A949MnuPgmTxt[0] ;
         A951MnuTxt = P0A872_A951MnuTxt[0] ;
         n951MnuTxt = P0A872_n951MnuTxt[0] ;
         A948MnuPgmTpo = P0A872_A948MnuPgmTpo[0] ;
         A946MnuOp = P0A872_A946MnuOp[0] ;
         A951MnuTxt = P0A872_A951MnuTxt[0] ;
         n951MnuTxt = P0A872_n951MnuTxt[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A872_A945MnuId[0], A945MnuId) == 0 ) )
         {
            brkA872 = false ;
            A946MnuOp = P0A872_A946MnuOp[0] ;
            AV30count = (long)(AV30count+1) ;
            brkA872 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A945MnuId)==0) )
         {
            AV25Option = A945MnuId ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A945MnuId, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA872 )
         {
            brkA872 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMNUPGMTPOOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMnuPgmTpo = AV37SearchTxt ;
      AV15TFMnuPgmTpo_Sel = "" ;
      AV48Testmenuds_1_tfmnuid = AV10TFMnuId ;
      AV49Testmenuds_2_tfmnuid_sel = AV11TFMnuId_Sel ;
      AV50Testmenuds_3_tfmnuop = AV12TFMnuOp ;
      AV51Testmenuds_4_tfmnuop_to = AV13TFMnuOp_To ;
      AV52Testmenuds_5_tfmnupgmtpo = AV14TFMnuPgmTpo ;
      AV53Testmenuds_6_tfmnupgmtpo_sel = AV15TFMnuPgmTpo_Sel ;
      AV54Testmenuds_7_tfmnutxt = AV18TFMnuTxt ;
      AV55Testmenuds_8_tfmnutxt_sel = AV19TFMnuTxt_Sel ;
      AV56Testmenuds_9_tfmnupgmtxt = AV16TFMnuPgmTxt ;
      AV57Testmenuds_10_tfmnupgmtxt_sel = AV17TFMnuPgmTxt_Sel ;
      AV58Testmenuds_11_tfmnupgm = AV20TFMnuPgm ;
      AV59Testmenuds_12_tfmnupgm_sel = AV21TFMnuPgm_Sel ;
      AV60Testmenuds_13_tfmnupgmweb = AV22TFMnuPgmWeb ;
      AV61Testmenuds_14_tfmnupgmweb_sel = AV23TFMnuPgmWeb_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV49Testmenuds_2_tfmnuid_sel ,
                                           AV48Testmenuds_1_tfmnuid ,
                                           Byte.valueOf(AV50Testmenuds_3_tfmnuop) ,
                                           Byte.valueOf(AV51Testmenuds_4_tfmnuop_to) ,
                                           AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                           AV52Testmenuds_5_tfmnupgmtpo ,
                                           AV55Testmenuds_8_tfmnutxt_sel ,
                                           AV54Testmenuds_7_tfmnutxt ,
                                           AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                           AV56Testmenuds_9_tfmnupgmtxt ,
                                           AV59Testmenuds_12_tfmnupgm_sel ,
                                           AV58Testmenuds_11_tfmnupgm ,
                                           AV61Testmenuds_14_tfmnupgmweb_sel ,
                                           AV60Testmenuds_13_tfmnupgmweb ,
                                           A945MnuId ,
                                           Byte.valueOf(A946MnuOp) ,
                                           A948MnuPgmTpo ,
                                           A951MnuTxt ,
                                           A949MnuPgmTxt ,
                                           A947MnuPgm ,
                                           A14286MnuPgmWeb } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV48Testmenuds_1_tfmnuid = GXutil.padr( GXutil.rtrim( AV48Testmenuds_1_tfmnuid), 8, "%") ;
      lV52Testmenuds_5_tfmnupgmtpo = GXutil.padr( GXutil.rtrim( AV52Testmenuds_5_tfmnupgmtpo), 1, "%") ;
      lV54Testmenuds_7_tfmnutxt = GXutil.padr( GXutil.rtrim( AV54Testmenuds_7_tfmnutxt), 30, "%") ;
      lV56Testmenuds_9_tfmnupgmtxt = GXutil.padr( GXutil.rtrim( AV56Testmenuds_9_tfmnupgmtxt), 30, "%") ;
      lV58Testmenuds_11_tfmnupgm = GXutil.padr( GXutil.rtrim( AV58Testmenuds_11_tfmnupgm), 8, "%") ;
      lV60Testmenuds_13_tfmnupgmweb = GXutil.concat( GXutil.rtrim( AV60Testmenuds_13_tfmnupgmweb), "%", "") ;
      /* Using cursor P0A873 */
      pr_default.execute(1, new Object[] {lV48Testmenuds_1_tfmnuid, AV49Testmenuds_2_tfmnuid_sel, Byte.valueOf(AV50Testmenuds_3_tfmnuop), Byte.valueOf(AV51Testmenuds_4_tfmnuop_to), lV52Testmenuds_5_tfmnupgmtpo, AV53Testmenuds_6_tfmnupgmtpo_sel, lV54Testmenuds_7_tfmnutxt, AV55Testmenuds_8_tfmnutxt_sel, lV56Testmenuds_9_tfmnupgmtxt, AV57Testmenuds_10_tfmnupgmtxt_sel, lV58Testmenuds_11_tfmnupgm, AV59Testmenuds_12_tfmnupgm_sel, lV60Testmenuds_13_tfmnupgmweb, AV61Testmenuds_14_tfmnupgmweb_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA874 = false ;
         A948MnuPgmTpo = P0A873_A948MnuPgmTpo[0] ;
         A14286MnuPgmWeb = P0A873_A14286MnuPgmWeb[0] ;
         A947MnuPgm = P0A873_A947MnuPgm[0] ;
         A949MnuPgmTxt = P0A873_A949MnuPgmTxt[0] ;
         A951MnuTxt = P0A873_A951MnuTxt[0] ;
         n951MnuTxt = P0A873_n951MnuTxt[0] ;
         A946MnuOp = P0A873_A946MnuOp[0] ;
         A945MnuId = P0A873_A945MnuId[0] ;
         A951MnuTxt = P0A873_A951MnuTxt[0] ;
         n951MnuTxt = P0A873_n951MnuTxt[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A873_A948MnuPgmTpo[0], A948MnuPgmTpo) == 0 ) )
         {
            brkA874 = false ;
            A946MnuOp = P0A873_A946MnuOp[0] ;
            A945MnuId = P0A873_A945MnuId[0] ;
            AV30count = (long)(AV30count+1) ;
            brkA874 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A948MnuPgmTpo)==0) )
         {
            AV25Option = A948MnuPgmTpo ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A948MnuPgmTpo, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA874 )
         {
            brkA874 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMNUTXTOPTIONS' Routine */
      returnInSub = false ;
      AV18TFMnuTxt = AV37SearchTxt ;
      AV19TFMnuTxt_Sel = "" ;
      AV48Testmenuds_1_tfmnuid = AV10TFMnuId ;
      AV49Testmenuds_2_tfmnuid_sel = AV11TFMnuId_Sel ;
      AV50Testmenuds_3_tfmnuop = AV12TFMnuOp ;
      AV51Testmenuds_4_tfmnuop_to = AV13TFMnuOp_To ;
      AV52Testmenuds_5_tfmnupgmtpo = AV14TFMnuPgmTpo ;
      AV53Testmenuds_6_tfmnupgmtpo_sel = AV15TFMnuPgmTpo_Sel ;
      AV54Testmenuds_7_tfmnutxt = AV18TFMnuTxt ;
      AV55Testmenuds_8_tfmnutxt_sel = AV19TFMnuTxt_Sel ;
      AV56Testmenuds_9_tfmnupgmtxt = AV16TFMnuPgmTxt ;
      AV57Testmenuds_10_tfmnupgmtxt_sel = AV17TFMnuPgmTxt_Sel ;
      AV58Testmenuds_11_tfmnupgm = AV20TFMnuPgm ;
      AV59Testmenuds_12_tfmnupgm_sel = AV21TFMnuPgm_Sel ;
      AV60Testmenuds_13_tfmnupgmweb = AV22TFMnuPgmWeb ;
      AV61Testmenuds_14_tfmnupgmweb_sel = AV23TFMnuPgmWeb_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV49Testmenuds_2_tfmnuid_sel ,
                                           AV48Testmenuds_1_tfmnuid ,
                                           Byte.valueOf(AV50Testmenuds_3_tfmnuop) ,
                                           Byte.valueOf(AV51Testmenuds_4_tfmnuop_to) ,
                                           AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                           AV52Testmenuds_5_tfmnupgmtpo ,
                                           AV55Testmenuds_8_tfmnutxt_sel ,
                                           AV54Testmenuds_7_tfmnutxt ,
                                           AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                           AV56Testmenuds_9_tfmnupgmtxt ,
                                           AV59Testmenuds_12_tfmnupgm_sel ,
                                           AV58Testmenuds_11_tfmnupgm ,
                                           AV61Testmenuds_14_tfmnupgmweb_sel ,
                                           AV60Testmenuds_13_tfmnupgmweb ,
                                           A945MnuId ,
                                           Byte.valueOf(A946MnuOp) ,
                                           A948MnuPgmTpo ,
                                           A951MnuTxt ,
                                           A949MnuPgmTxt ,
                                           A947MnuPgm ,
                                           A14286MnuPgmWeb } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV48Testmenuds_1_tfmnuid = GXutil.padr( GXutil.rtrim( AV48Testmenuds_1_tfmnuid), 8, "%") ;
      lV52Testmenuds_5_tfmnupgmtpo = GXutil.padr( GXutil.rtrim( AV52Testmenuds_5_tfmnupgmtpo), 1, "%") ;
      lV54Testmenuds_7_tfmnutxt = GXutil.padr( GXutil.rtrim( AV54Testmenuds_7_tfmnutxt), 30, "%") ;
      lV56Testmenuds_9_tfmnupgmtxt = GXutil.padr( GXutil.rtrim( AV56Testmenuds_9_tfmnupgmtxt), 30, "%") ;
      lV58Testmenuds_11_tfmnupgm = GXutil.padr( GXutil.rtrim( AV58Testmenuds_11_tfmnupgm), 8, "%") ;
      lV60Testmenuds_13_tfmnupgmweb = GXutil.concat( GXutil.rtrim( AV60Testmenuds_13_tfmnupgmweb), "%", "") ;
      /* Using cursor P0A874 */
      pr_default.execute(2, new Object[] {lV48Testmenuds_1_tfmnuid, AV49Testmenuds_2_tfmnuid_sel, Byte.valueOf(AV50Testmenuds_3_tfmnuop), Byte.valueOf(AV51Testmenuds_4_tfmnuop_to), lV52Testmenuds_5_tfmnupgmtpo, AV53Testmenuds_6_tfmnupgmtpo_sel, lV54Testmenuds_7_tfmnutxt, AV55Testmenuds_8_tfmnutxt_sel, lV56Testmenuds_9_tfmnupgmtxt, AV57Testmenuds_10_tfmnupgmtxt_sel, lV58Testmenuds_11_tfmnupgm, AV59Testmenuds_12_tfmnupgm_sel, lV60Testmenuds_13_tfmnupgmweb, AV61Testmenuds_14_tfmnupgmweb_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA876 = false ;
         A945MnuId = P0A874_A945MnuId[0] ;
         A14286MnuPgmWeb = P0A874_A14286MnuPgmWeb[0] ;
         A947MnuPgm = P0A874_A947MnuPgm[0] ;
         A949MnuPgmTxt = P0A874_A949MnuPgmTxt[0] ;
         A951MnuTxt = P0A874_A951MnuTxt[0] ;
         n951MnuTxt = P0A874_n951MnuTxt[0] ;
         A948MnuPgmTpo = P0A874_A948MnuPgmTpo[0] ;
         A946MnuOp = P0A874_A946MnuOp[0] ;
         A951MnuTxt = P0A874_A951MnuTxt[0] ;
         n951MnuTxt = P0A874_n951MnuTxt[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A874_A945MnuId[0], A945MnuId) == 0 ) )
         {
            brkA876 = false ;
            A946MnuOp = P0A874_A946MnuOp[0] ;
            AV30count = (long)(AV30count+1) ;
            brkA876 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A951MnuTxt)==0) )
         {
            AV25Option = A951MnuTxt ;
            AV24InsertIndex = 1 ;
            while ( ( AV24InsertIndex <= AV26Options.size() ) && ( GXutil.strcmp((String)AV26Options.elementAt(-1+AV24InsertIndex), AV25Option) < 0 ) )
            {
               AV24InsertIndex = (int)(AV24InsertIndex+1) ;
            }
            AV26Options.add(AV25Option, AV24InsertIndex);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV24InsertIndex);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA876 )
         {
            brkA876 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMNUPGMTXTOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMnuPgmTxt = AV37SearchTxt ;
      AV17TFMnuPgmTxt_Sel = "" ;
      AV48Testmenuds_1_tfmnuid = AV10TFMnuId ;
      AV49Testmenuds_2_tfmnuid_sel = AV11TFMnuId_Sel ;
      AV50Testmenuds_3_tfmnuop = AV12TFMnuOp ;
      AV51Testmenuds_4_tfmnuop_to = AV13TFMnuOp_To ;
      AV52Testmenuds_5_tfmnupgmtpo = AV14TFMnuPgmTpo ;
      AV53Testmenuds_6_tfmnupgmtpo_sel = AV15TFMnuPgmTpo_Sel ;
      AV54Testmenuds_7_tfmnutxt = AV18TFMnuTxt ;
      AV55Testmenuds_8_tfmnutxt_sel = AV19TFMnuTxt_Sel ;
      AV56Testmenuds_9_tfmnupgmtxt = AV16TFMnuPgmTxt ;
      AV57Testmenuds_10_tfmnupgmtxt_sel = AV17TFMnuPgmTxt_Sel ;
      AV58Testmenuds_11_tfmnupgm = AV20TFMnuPgm ;
      AV59Testmenuds_12_tfmnupgm_sel = AV21TFMnuPgm_Sel ;
      AV60Testmenuds_13_tfmnupgmweb = AV22TFMnuPgmWeb ;
      AV61Testmenuds_14_tfmnupgmweb_sel = AV23TFMnuPgmWeb_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV49Testmenuds_2_tfmnuid_sel ,
                                           AV48Testmenuds_1_tfmnuid ,
                                           Byte.valueOf(AV50Testmenuds_3_tfmnuop) ,
                                           Byte.valueOf(AV51Testmenuds_4_tfmnuop_to) ,
                                           AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                           AV52Testmenuds_5_tfmnupgmtpo ,
                                           AV55Testmenuds_8_tfmnutxt_sel ,
                                           AV54Testmenuds_7_tfmnutxt ,
                                           AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                           AV56Testmenuds_9_tfmnupgmtxt ,
                                           AV59Testmenuds_12_tfmnupgm_sel ,
                                           AV58Testmenuds_11_tfmnupgm ,
                                           AV61Testmenuds_14_tfmnupgmweb_sel ,
                                           AV60Testmenuds_13_tfmnupgmweb ,
                                           A945MnuId ,
                                           Byte.valueOf(A946MnuOp) ,
                                           A948MnuPgmTpo ,
                                           A951MnuTxt ,
                                           A949MnuPgmTxt ,
                                           A947MnuPgm ,
                                           A14286MnuPgmWeb } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV48Testmenuds_1_tfmnuid = GXutil.padr( GXutil.rtrim( AV48Testmenuds_1_tfmnuid), 8, "%") ;
      lV52Testmenuds_5_tfmnupgmtpo = GXutil.padr( GXutil.rtrim( AV52Testmenuds_5_tfmnupgmtpo), 1, "%") ;
      lV54Testmenuds_7_tfmnutxt = GXutil.padr( GXutil.rtrim( AV54Testmenuds_7_tfmnutxt), 30, "%") ;
      lV56Testmenuds_9_tfmnupgmtxt = GXutil.padr( GXutil.rtrim( AV56Testmenuds_9_tfmnupgmtxt), 30, "%") ;
      lV58Testmenuds_11_tfmnupgm = GXutil.padr( GXutil.rtrim( AV58Testmenuds_11_tfmnupgm), 8, "%") ;
      lV60Testmenuds_13_tfmnupgmweb = GXutil.concat( GXutil.rtrim( AV60Testmenuds_13_tfmnupgmweb), "%", "") ;
      /* Using cursor P0A875 */
      pr_default.execute(3, new Object[] {lV48Testmenuds_1_tfmnuid, AV49Testmenuds_2_tfmnuid_sel, Byte.valueOf(AV50Testmenuds_3_tfmnuop), Byte.valueOf(AV51Testmenuds_4_tfmnuop_to), lV52Testmenuds_5_tfmnupgmtpo, AV53Testmenuds_6_tfmnupgmtpo_sel, lV54Testmenuds_7_tfmnutxt, AV55Testmenuds_8_tfmnutxt_sel, lV56Testmenuds_9_tfmnupgmtxt, AV57Testmenuds_10_tfmnupgmtxt_sel, lV58Testmenuds_11_tfmnupgm, AV59Testmenuds_12_tfmnupgm_sel, lV60Testmenuds_13_tfmnupgmweb, AV61Testmenuds_14_tfmnupgmweb_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA878 = false ;
         A949MnuPgmTxt = P0A875_A949MnuPgmTxt[0] ;
         A14286MnuPgmWeb = P0A875_A14286MnuPgmWeb[0] ;
         A947MnuPgm = P0A875_A947MnuPgm[0] ;
         A951MnuTxt = P0A875_A951MnuTxt[0] ;
         n951MnuTxt = P0A875_n951MnuTxt[0] ;
         A948MnuPgmTpo = P0A875_A948MnuPgmTpo[0] ;
         A946MnuOp = P0A875_A946MnuOp[0] ;
         A945MnuId = P0A875_A945MnuId[0] ;
         A951MnuTxt = P0A875_A951MnuTxt[0] ;
         n951MnuTxt = P0A875_n951MnuTxt[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A875_A949MnuPgmTxt[0], A949MnuPgmTxt) == 0 ) )
         {
            brkA878 = false ;
            A946MnuOp = P0A875_A946MnuOp[0] ;
            A945MnuId = P0A875_A945MnuId[0] ;
            AV30count = (long)(AV30count+1) ;
            brkA878 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A949MnuPgmTxt)==0) )
         {
            AV25Option = A949MnuPgmTxt ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA878 )
         {
            brkA878 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADMNUPGMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFMnuPgm = AV37SearchTxt ;
      AV21TFMnuPgm_Sel = "" ;
      AV48Testmenuds_1_tfmnuid = AV10TFMnuId ;
      AV49Testmenuds_2_tfmnuid_sel = AV11TFMnuId_Sel ;
      AV50Testmenuds_3_tfmnuop = AV12TFMnuOp ;
      AV51Testmenuds_4_tfmnuop_to = AV13TFMnuOp_To ;
      AV52Testmenuds_5_tfmnupgmtpo = AV14TFMnuPgmTpo ;
      AV53Testmenuds_6_tfmnupgmtpo_sel = AV15TFMnuPgmTpo_Sel ;
      AV54Testmenuds_7_tfmnutxt = AV18TFMnuTxt ;
      AV55Testmenuds_8_tfmnutxt_sel = AV19TFMnuTxt_Sel ;
      AV56Testmenuds_9_tfmnupgmtxt = AV16TFMnuPgmTxt ;
      AV57Testmenuds_10_tfmnupgmtxt_sel = AV17TFMnuPgmTxt_Sel ;
      AV58Testmenuds_11_tfmnupgm = AV20TFMnuPgm ;
      AV59Testmenuds_12_tfmnupgm_sel = AV21TFMnuPgm_Sel ;
      AV60Testmenuds_13_tfmnupgmweb = AV22TFMnuPgmWeb ;
      AV61Testmenuds_14_tfmnupgmweb_sel = AV23TFMnuPgmWeb_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV49Testmenuds_2_tfmnuid_sel ,
                                           AV48Testmenuds_1_tfmnuid ,
                                           Byte.valueOf(AV50Testmenuds_3_tfmnuop) ,
                                           Byte.valueOf(AV51Testmenuds_4_tfmnuop_to) ,
                                           AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                           AV52Testmenuds_5_tfmnupgmtpo ,
                                           AV55Testmenuds_8_tfmnutxt_sel ,
                                           AV54Testmenuds_7_tfmnutxt ,
                                           AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                           AV56Testmenuds_9_tfmnupgmtxt ,
                                           AV59Testmenuds_12_tfmnupgm_sel ,
                                           AV58Testmenuds_11_tfmnupgm ,
                                           AV61Testmenuds_14_tfmnupgmweb_sel ,
                                           AV60Testmenuds_13_tfmnupgmweb ,
                                           A945MnuId ,
                                           Byte.valueOf(A946MnuOp) ,
                                           A948MnuPgmTpo ,
                                           A951MnuTxt ,
                                           A949MnuPgmTxt ,
                                           A947MnuPgm ,
                                           A14286MnuPgmWeb } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV48Testmenuds_1_tfmnuid = GXutil.padr( GXutil.rtrim( AV48Testmenuds_1_tfmnuid), 8, "%") ;
      lV52Testmenuds_5_tfmnupgmtpo = GXutil.padr( GXutil.rtrim( AV52Testmenuds_5_tfmnupgmtpo), 1, "%") ;
      lV54Testmenuds_7_tfmnutxt = GXutil.padr( GXutil.rtrim( AV54Testmenuds_7_tfmnutxt), 30, "%") ;
      lV56Testmenuds_9_tfmnupgmtxt = GXutil.padr( GXutil.rtrim( AV56Testmenuds_9_tfmnupgmtxt), 30, "%") ;
      lV58Testmenuds_11_tfmnupgm = GXutil.padr( GXutil.rtrim( AV58Testmenuds_11_tfmnupgm), 8, "%") ;
      lV60Testmenuds_13_tfmnupgmweb = GXutil.concat( GXutil.rtrim( AV60Testmenuds_13_tfmnupgmweb), "%", "") ;
      /* Using cursor P0A876 */
      pr_default.execute(4, new Object[] {lV48Testmenuds_1_tfmnuid, AV49Testmenuds_2_tfmnuid_sel, Byte.valueOf(AV50Testmenuds_3_tfmnuop), Byte.valueOf(AV51Testmenuds_4_tfmnuop_to), lV52Testmenuds_5_tfmnupgmtpo, AV53Testmenuds_6_tfmnupgmtpo_sel, lV54Testmenuds_7_tfmnutxt, AV55Testmenuds_8_tfmnutxt_sel, lV56Testmenuds_9_tfmnupgmtxt, AV57Testmenuds_10_tfmnupgmtxt_sel, lV58Testmenuds_11_tfmnupgm, AV59Testmenuds_12_tfmnupgm_sel, lV60Testmenuds_13_tfmnupgmweb, AV61Testmenuds_14_tfmnupgmweb_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkA8710 = false ;
         A947MnuPgm = P0A876_A947MnuPgm[0] ;
         A14286MnuPgmWeb = P0A876_A14286MnuPgmWeb[0] ;
         A949MnuPgmTxt = P0A876_A949MnuPgmTxt[0] ;
         A951MnuTxt = P0A876_A951MnuTxt[0] ;
         n951MnuTxt = P0A876_n951MnuTxt[0] ;
         A948MnuPgmTpo = P0A876_A948MnuPgmTpo[0] ;
         A946MnuOp = P0A876_A946MnuOp[0] ;
         A945MnuId = P0A876_A945MnuId[0] ;
         A951MnuTxt = P0A876_A951MnuTxt[0] ;
         n951MnuTxt = P0A876_n951MnuTxt[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0A876_A947MnuPgm[0], A947MnuPgm) == 0 ) )
         {
            brkA8710 = false ;
            A946MnuOp = P0A876_A946MnuOp[0] ;
            A945MnuId = P0A876_A945MnuId[0] ;
            AV30count = (long)(AV30count+1) ;
            brkA8710 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A947MnuPgm)==0) )
         {
            AV25Option = A947MnuPgm ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A947MnuPgm, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA8710 )
         {
            brkA8710 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADMNUPGMWEBOPTIONS' Routine */
      returnInSub = false ;
      AV22TFMnuPgmWeb = AV37SearchTxt ;
      AV23TFMnuPgmWeb_Sel = "" ;
      AV48Testmenuds_1_tfmnuid = AV10TFMnuId ;
      AV49Testmenuds_2_tfmnuid_sel = AV11TFMnuId_Sel ;
      AV50Testmenuds_3_tfmnuop = AV12TFMnuOp ;
      AV51Testmenuds_4_tfmnuop_to = AV13TFMnuOp_To ;
      AV52Testmenuds_5_tfmnupgmtpo = AV14TFMnuPgmTpo ;
      AV53Testmenuds_6_tfmnupgmtpo_sel = AV15TFMnuPgmTpo_Sel ;
      AV54Testmenuds_7_tfmnutxt = AV18TFMnuTxt ;
      AV55Testmenuds_8_tfmnutxt_sel = AV19TFMnuTxt_Sel ;
      AV56Testmenuds_9_tfmnupgmtxt = AV16TFMnuPgmTxt ;
      AV57Testmenuds_10_tfmnupgmtxt_sel = AV17TFMnuPgmTxt_Sel ;
      AV58Testmenuds_11_tfmnupgm = AV20TFMnuPgm ;
      AV59Testmenuds_12_tfmnupgm_sel = AV21TFMnuPgm_Sel ;
      AV60Testmenuds_13_tfmnupgmweb = AV22TFMnuPgmWeb ;
      AV61Testmenuds_14_tfmnupgmweb_sel = AV23TFMnuPgmWeb_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV49Testmenuds_2_tfmnuid_sel ,
                                           AV48Testmenuds_1_tfmnuid ,
                                           Byte.valueOf(AV50Testmenuds_3_tfmnuop) ,
                                           Byte.valueOf(AV51Testmenuds_4_tfmnuop_to) ,
                                           AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                           AV52Testmenuds_5_tfmnupgmtpo ,
                                           AV55Testmenuds_8_tfmnutxt_sel ,
                                           AV54Testmenuds_7_tfmnutxt ,
                                           AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                           AV56Testmenuds_9_tfmnupgmtxt ,
                                           AV59Testmenuds_12_tfmnupgm_sel ,
                                           AV58Testmenuds_11_tfmnupgm ,
                                           AV61Testmenuds_14_tfmnupgmweb_sel ,
                                           AV60Testmenuds_13_tfmnupgmweb ,
                                           A945MnuId ,
                                           Byte.valueOf(A946MnuOp) ,
                                           A948MnuPgmTpo ,
                                           A951MnuTxt ,
                                           A949MnuPgmTxt ,
                                           A947MnuPgm ,
                                           A14286MnuPgmWeb } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV48Testmenuds_1_tfmnuid = GXutil.padr( GXutil.rtrim( AV48Testmenuds_1_tfmnuid), 8, "%") ;
      lV52Testmenuds_5_tfmnupgmtpo = GXutil.padr( GXutil.rtrim( AV52Testmenuds_5_tfmnupgmtpo), 1, "%") ;
      lV54Testmenuds_7_tfmnutxt = GXutil.padr( GXutil.rtrim( AV54Testmenuds_7_tfmnutxt), 30, "%") ;
      lV56Testmenuds_9_tfmnupgmtxt = GXutil.padr( GXutil.rtrim( AV56Testmenuds_9_tfmnupgmtxt), 30, "%") ;
      lV58Testmenuds_11_tfmnupgm = GXutil.padr( GXutil.rtrim( AV58Testmenuds_11_tfmnupgm), 8, "%") ;
      lV60Testmenuds_13_tfmnupgmweb = GXutil.concat( GXutil.rtrim( AV60Testmenuds_13_tfmnupgmweb), "%", "") ;
      /* Using cursor P0A877 */
      pr_default.execute(5, new Object[] {lV48Testmenuds_1_tfmnuid, AV49Testmenuds_2_tfmnuid_sel, Byte.valueOf(AV50Testmenuds_3_tfmnuop), Byte.valueOf(AV51Testmenuds_4_tfmnuop_to), lV52Testmenuds_5_tfmnupgmtpo, AV53Testmenuds_6_tfmnupgmtpo_sel, lV54Testmenuds_7_tfmnutxt, AV55Testmenuds_8_tfmnutxt_sel, lV56Testmenuds_9_tfmnupgmtxt, AV57Testmenuds_10_tfmnupgmtxt_sel, lV58Testmenuds_11_tfmnupgm, AV59Testmenuds_12_tfmnupgm_sel, lV60Testmenuds_13_tfmnupgmweb, AV61Testmenuds_14_tfmnupgmweb_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkA8712 = false ;
         A14286MnuPgmWeb = P0A877_A14286MnuPgmWeb[0] ;
         A947MnuPgm = P0A877_A947MnuPgm[0] ;
         A949MnuPgmTxt = P0A877_A949MnuPgmTxt[0] ;
         A951MnuTxt = P0A877_A951MnuTxt[0] ;
         n951MnuTxt = P0A877_n951MnuTxt[0] ;
         A948MnuPgmTpo = P0A877_A948MnuPgmTpo[0] ;
         A946MnuOp = P0A877_A946MnuOp[0] ;
         A945MnuId = P0A877_A945MnuId[0] ;
         A951MnuTxt = P0A877_A951MnuTxt[0] ;
         n951MnuTxt = P0A877_n951MnuTxt[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0A877_A14286MnuPgmWeb[0], A14286MnuPgmWeb) == 0 ) )
         {
            brkA8712 = false ;
            A946MnuOp = P0A877_A946MnuOp[0] ;
            A945MnuId = P0A877_A945MnuId[0] ;
            AV30count = (long)(AV30count+1) ;
            brkA8712 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A14286MnuPgmWeb)==0) )
         {
            AV25Option = A14286MnuPgmWeb ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA8712 )
         {
            brkA8712 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = testmenugetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = testmenugetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = testmenugetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39OptionsJson = "" ;
      AV40OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFMnuId = "" ;
      AV11TFMnuId_Sel = "" ;
      AV14TFMnuPgmTpo = "" ;
      AV15TFMnuPgmTpo_Sel = "" ;
      AV18TFMnuTxt = "" ;
      AV19TFMnuTxt_Sel = "" ;
      AV16TFMnuPgmTxt = "" ;
      AV17TFMnuPgmTxt_Sel = "" ;
      AV20TFMnuPgm = "" ;
      AV21TFMnuPgm_Sel = "" ;
      AV22TFMnuPgmWeb = "" ;
      AV23TFMnuPgmWeb_Sel = "" ;
      A945MnuId = "" ;
      AV48Testmenuds_1_tfmnuid = "" ;
      AV49Testmenuds_2_tfmnuid_sel = "" ;
      AV52Testmenuds_5_tfmnupgmtpo = "" ;
      AV53Testmenuds_6_tfmnupgmtpo_sel = "" ;
      AV54Testmenuds_7_tfmnutxt = "" ;
      AV55Testmenuds_8_tfmnutxt_sel = "" ;
      AV56Testmenuds_9_tfmnupgmtxt = "" ;
      AV57Testmenuds_10_tfmnupgmtxt_sel = "" ;
      AV58Testmenuds_11_tfmnupgm = "" ;
      AV59Testmenuds_12_tfmnupgm_sel = "" ;
      AV60Testmenuds_13_tfmnupgmweb = "" ;
      AV61Testmenuds_14_tfmnupgmweb_sel = "" ;
      scmdbuf = "" ;
      lV48Testmenuds_1_tfmnuid = "" ;
      lV52Testmenuds_5_tfmnupgmtpo = "" ;
      lV54Testmenuds_7_tfmnutxt = "" ;
      lV56Testmenuds_9_tfmnupgmtxt = "" ;
      lV58Testmenuds_11_tfmnupgm = "" ;
      lV60Testmenuds_13_tfmnupgmweb = "" ;
      A948MnuPgmTpo = "" ;
      A951MnuTxt = "" ;
      A949MnuPgmTxt = "" ;
      A947MnuPgm = "" ;
      A14286MnuPgmWeb = "" ;
      P0A872_A945MnuId = new String[] {""} ;
      P0A872_A14286MnuPgmWeb = new String[] {""} ;
      P0A872_A947MnuPgm = new String[] {""} ;
      P0A872_A949MnuPgmTxt = new String[] {""} ;
      P0A872_A951MnuTxt = new String[] {""} ;
      P0A872_n951MnuTxt = new boolean[] {false} ;
      P0A872_A948MnuPgmTpo = new String[] {""} ;
      P0A872_A946MnuOp = new byte[1] ;
      AV25Option = "" ;
      AV27OptionDesc = "" ;
      P0A873_A948MnuPgmTpo = new String[] {""} ;
      P0A873_A14286MnuPgmWeb = new String[] {""} ;
      P0A873_A947MnuPgm = new String[] {""} ;
      P0A873_A949MnuPgmTxt = new String[] {""} ;
      P0A873_A951MnuTxt = new String[] {""} ;
      P0A873_n951MnuTxt = new boolean[] {false} ;
      P0A873_A946MnuOp = new byte[1] ;
      P0A873_A945MnuId = new String[] {""} ;
      P0A874_A945MnuId = new String[] {""} ;
      P0A874_A14286MnuPgmWeb = new String[] {""} ;
      P0A874_A947MnuPgm = new String[] {""} ;
      P0A874_A949MnuPgmTxt = new String[] {""} ;
      P0A874_A951MnuTxt = new String[] {""} ;
      P0A874_n951MnuTxt = new boolean[] {false} ;
      P0A874_A948MnuPgmTpo = new String[] {""} ;
      P0A874_A946MnuOp = new byte[1] ;
      P0A875_A949MnuPgmTxt = new String[] {""} ;
      P0A875_A14286MnuPgmWeb = new String[] {""} ;
      P0A875_A947MnuPgm = new String[] {""} ;
      P0A875_A951MnuTxt = new String[] {""} ;
      P0A875_n951MnuTxt = new boolean[] {false} ;
      P0A875_A948MnuPgmTpo = new String[] {""} ;
      P0A875_A946MnuOp = new byte[1] ;
      P0A875_A945MnuId = new String[] {""} ;
      P0A876_A947MnuPgm = new String[] {""} ;
      P0A876_A14286MnuPgmWeb = new String[] {""} ;
      P0A876_A949MnuPgmTxt = new String[] {""} ;
      P0A876_A951MnuTxt = new String[] {""} ;
      P0A876_n951MnuTxt = new boolean[] {false} ;
      P0A876_A948MnuPgmTpo = new String[] {""} ;
      P0A876_A946MnuOp = new byte[1] ;
      P0A876_A945MnuId = new String[] {""} ;
      P0A877_A14286MnuPgmWeb = new String[] {""} ;
      P0A877_A947MnuPgm = new String[] {""} ;
      P0A877_A949MnuPgmTxt = new String[] {""} ;
      P0A877_A951MnuTxt = new String[] {""} ;
      P0A877_n951MnuTxt = new boolean[] {false} ;
      P0A877_A948MnuPgmTpo = new String[] {""} ;
      P0A877_A946MnuOp = new byte[1] ;
      P0A877_A945MnuId = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testmenugetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A872_A945MnuId, P0A872_A14286MnuPgmWeb, P0A872_A947MnuPgm, P0A872_A949MnuPgmTxt, P0A872_A951MnuTxt, P0A872_n951MnuTxt, P0A872_A948MnuPgmTpo, P0A872_A946MnuOp
            }
            , new Object[] {
            P0A873_A948MnuPgmTpo, P0A873_A14286MnuPgmWeb, P0A873_A947MnuPgm, P0A873_A949MnuPgmTxt, P0A873_A951MnuTxt, P0A873_n951MnuTxt, P0A873_A946MnuOp, P0A873_A945MnuId
            }
            , new Object[] {
            P0A874_A945MnuId, P0A874_A14286MnuPgmWeb, P0A874_A947MnuPgm, P0A874_A949MnuPgmTxt, P0A874_A951MnuTxt, P0A874_n951MnuTxt, P0A874_A948MnuPgmTpo, P0A874_A946MnuOp
            }
            , new Object[] {
            P0A875_A949MnuPgmTxt, P0A875_A14286MnuPgmWeb, P0A875_A947MnuPgm, P0A875_A951MnuTxt, P0A875_n951MnuTxt, P0A875_A948MnuPgmTpo, P0A875_A946MnuOp, P0A875_A945MnuId
            }
            , new Object[] {
            P0A876_A947MnuPgm, P0A876_A14286MnuPgmWeb, P0A876_A949MnuPgmTxt, P0A876_A951MnuTxt, P0A876_n951MnuTxt, P0A876_A948MnuPgmTpo, P0A876_A946MnuOp, P0A876_A945MnuId
            }
            , new Object[] {
            P0A877_A14286MnuPgmWeb, P0A877_A947MnuPgm, P0A877_A949MnuPgmTxt, P0A877_A951MnuTxt, P0A877_n951MnuTxt, P0A877_A948MnuPgmTpo, P0A877_A946MnuOp, P0A877_A945MnuId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TFMnuOp ;
   private byte AV13TFMnuOp_To ;
   private byte AV50Testmenuds_3_tfmnuop ;
   private byte AV51Testmenuds_4_tfmnuop_to ;
   private byte A946MnuOp ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private int AV24InsertIndex ;
   private long AV30count ;
   private String AV10TFMnuId ;
   private String AV11TFMnuId_Sel ;
   private String AV14TFMnuPgmTpo ;
   private String AV15TFMnuPgmTpo_Sel ;
   private String AV18TFMnuTxt ;
   private String AV19TFMnuTxt_Sel ;
   private String AV16TFMnuPgmTxt ;
   private String AV17TFMnuPgmTxt_Sel ;
   private String AV20TFMnuPgm ;
   private String AV21TFMnuPgm_Sel ;
   private String A945MnuId ;
   private String AV48Testmenuds_1_tfmnuid ;
   private String AV49Testmenuds_2_tfmnuid_sel ;
   private String AV52Testmenuds_5_tfmnupgmtpo ;
   private String AV53Testmenuds_6_tfmnupgmtpo_sel ;
   private String AV54Testmenuds_7_tfmnutxt ;
   private String AV55Testmenuds_8_tfmnutxt_sel ;
   private String AV56Testmenuds_9_tfmnupgmtxt ;
   private String AV57Testmenuds_10_tfmnupgmtxt_sel ;
   private String AV58Testmenuds_11_tfmnupgm ;
   private String AV59Testmenuds_12_tfmnupgm_sel ;
   private String scmdbuf ;
   private String lV48Testmenuds_1_tfmnuid ;
   private String lV52Testmenuds_5_tfmnupgmtpo ;
   private String lV54Testmenuds_7_tfmnutxt ;
   private String lV56Testmenuds_9_tfmnupgmtxt ;
   private String lV58Testmenuds_11_tfmnupgm ;
   private String A948MnuPgmTpo ;
   private String A951MnuTxt ;
   private String A949MnuPgmTxt ;
   private String A947MnuPgm ;
   private boolean returnInSub ;
   private boolean brkA872 ;
   private boolean n951MnuTxt ;
   private boolean brkA874 ;
   private boolean brkA876 ;
   private boolean brkA878 ;
   private boolean brkA8710 ;
   private boolean brkA8712 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV22TFMnuPgmWeb ;
   private String AV23TFMnuPgmWeb_Sel ;
   private String AV60Testmenuds_13_tfmnupgmweb ;
   private String AV61Testmenuds_14_tfmnupgmweb_sel ;
   private String lV60Testmenuds_13_tfmnupgmweb ;
   private String A14286MnuPgmWeb ;
   private String AV25Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A872_A945MnuId ;
   private String[] P0A872_A14286MnuPgmWeb ;
   private String[] P0A872_A947MnuPgm ;
   private String[] P0A872_A949MnuPgmTxt ;
   private String[] P0A872_A951MnuTxt ;
   private boolean[] P0A872_n951MnuTxt ;
   private String[] P0A872_A948MnuPgmTpo ;
   private byte[] P0A872_A946MnuOp ;
   private String[] P0A873_A948MnuPgmTpo ;
   private String[] P0A873_A14286MnuPgmWeb ;
   private String[] P0A873_A947MnuPgm ;
   private String[] P0A873_A949MnuPgmTxt ;
   private String[] P0A873_A951MnuTxt ;
   private boolean[] P0A873_n951MnuTxt ;
   private byte[] P0A873_A946MnuOp ;
   private String[] P0A873_A945MnuId ;
   private String[] P0A874_A945MnuId ;
   private String[] P0A874_A14286MnuPgmWeb ;
   private String[] P0A874_A947MnuPgm ;
   private String[] P0A874_A949MnuPgmTxt ;
   private String[] P0A874_A951MnuTxt ;
   private boolean[] P0A874_n951MnuTxt ;
   private String[] P0A874_A948MnuPgmTpo ;
   private byte[] P0A874_A946MnuOp ;
   private String[] P0A875_A949MnuPgmTxt ;
   private String[] P0A875_A14286MnuPgmWeb ;
   private String[] P0A875_A947MnuPgm ;
   private String[] P0A875_A951MnuTxt ;
   private boolean[] P0A875_n951MnuTxt ;
   private String[] P0A875_A948MnuPgmTpo ;
   private byte[] P0A875_A946MnuOp ;
   private String[] P0A875_A945MnuId ;
   private String[] P0A876_A947MnuPgm ;
   private String[] P0A876_A14286MnuPgmWeb ;
   private String[] P0A876_A949MnuPgmTxt ;
   private String[] P0A876_A951MnuTxt ;
   private boolean[] P0A876_n951MnuTxt ;
   private String[] P0A876_A948MnuPgmTpo ;
   private byte[] P0A876_A946MnuOp ;
   private String[] P0A876_A945MnuId ;
   private String[] P0A877_A14286MnuPgmWeb ;
   private String[] P0A877_A947MnuPgm ;
   private String[] P0A877_A949MnuPgmTxt ;
   private String[] P0A877_A951MnuTxt ;
   private boolean[] P0A877_n951MnuTxt ;
   private String[] P0A877_A948MnuPgmTpo ;
   private byte[] P0A877_A946MnuOp ;
   private String[] P0A877_A945MnuId ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class testmenugetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A872( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Testmenuds_2_tfmnuid_sel ,
                                          String AV48Testmenuds_1_tfmnuid ,
                                          byte AV50Testmenuds_3_tfmnuop ,
                                          byte AV51Testmenuds_4_tfmnuop_to ,
                                          String AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                          String AV52Testmenuds_5_tfmnupgmtpo ,
                                          String AV55Testmenuds_8_tfmnutxt_sel ,
                                          String AV54Testmenuds_7_tfmnutxt ,
                                          String AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                          String AV56Testmenuds_9_tfmnupgmtxt ,
                                          String AV59Testmenuds_12_tfmnupgm_sel ,
                                          String AV58Testmenuds_11_tfmnupgm ,
                                          String AV61Testmenuds_14_tfmnupgmweb_sel ,
                                          String AV60Testmenuds_13_tfmnupgmweb ,
                                          String A945MnuId ,
                                          byte A946MnuOp ,
                                          String A948MnuPgmTpo ,
                                          String A951MnuTxt ,
                                          String A949MnuPgmTxt ,
                                          String A947MnuPgm ,
                                          String A14286MnuPgmWeb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MnuId, T1.MnuPgmWeb, T1.MnuPgm, T1.MnuPgmTxt, T2.MnuTxt, T1.MnuPgmTpo, T1.MnuOp FROM (TXPMNUOP T1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = T1.MnuId)" ;
      if ( (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) && ( ! (GXutil.strcmp("", AV48Testmenuds_1_tfmnuid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuId = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV50Testmenuds_3_tfmnuop) )
      {
         addWhere(sWhereString, "(T1.MnuOp >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Testmenuds_4_tfmnuop_to) )
      {
         addWhere(sWhereString, "(T1.MnuOp <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) && ( ! (GXutil.strcmp("", AV52Testmenuds_5_tfmnupgmtpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTpo = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) && ( ! (GXutil.strcmp("", AV54Testmenuds_7_tfmnutxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MnuTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MnuTxt = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV56Testmenuds_9_tfmnupgmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTxt = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) && ( ! (GXutil.strcmp("", AV58Testmenuds_11_tfmnupgm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgm = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) && ( ! (GXutil.strcmp("", AV60Testmenuds_13_tfmnupgmweb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmWeb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmWeb = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MnuId" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A873( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Testmenuds_2_tfmnuid_sel ,
                                          String AV48Testmenuds_1_tfmnuid ,
                                          byte AV50Testmenuds_3_tfmnuop ,
                                          byte AV51Testmenuds_4_tfmnuop_to ,
                                          String AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                          String AV52Testmenuds_5_tfmnupgmtpo ,
                                          String AV55Testmenuds_8_tfmnutxt_sel ,
                                          String AV54Testmenuds_7_tfmnutxt ,
                                          String AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                          String AV56Testmenuds_9_tfmnupgmtxt ,
                                          String AV59Testmenuds_12_tfmnupgm_sel ,
                                          String AV58Testmenuds_11_tfmnupgm ,
                                          String AV61Testmenuds_14_tfmnupgmweb_sel ,
                                          String AV60Testmenuds_13_tfmnupgmweb ,
                                          String A945MnuId ,
                                          byte A946MnuOp ,
                                          String A948MnuPgmTpo ,
                                          String A951MnuTxt ,
                                          String A949MnuPgmTxt ,
                                          String A947MnuPgm ,
                                          String A14286MnuPgmWeb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[14];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.MnuPgmTpo, T1.MnuPgmWeb, T1.MnuPgm, T1.MnuPgmTxt, T2.MnuTxt, T1.MnuOp, T1.MnuId FROM (TXPMNUOP T1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = T1.MnuId)" ;
      if ( (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) && ( ! (GXutil.strcmp("", AV48Testmenuds_1_tfmnuid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuId = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (0==AV50Testmenuds_3_tfmnuop) )
      {
         addWhere(sWhereString, "(T1.MnuOp >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Testmenuds_4_tfmnuop_to) )
      {
         addWhere(sWhereString, "(T1.MnuOp <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) && ( ! (GXutil.strcmp("", AV52Testmenuds_5_tfmnupgmtpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTpo = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) && ( ! (GXutil.strcmp("", AV54Testmenuds_7_tfmnutxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MnuTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MnuTxt = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV56Testmenuds_9_tfmnupgmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTxt = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) && ( ! (GXutil.strcmp("", AV58Testmenuds_11_tfmnupgm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgm = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) && ( ! (GXutil.strcmp("", AV60Testmenuds_13_tfmnupgmweb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmWeb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmWeb = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MnuPgmTpo" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A874( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Testmenuds_2_tfmnuid_sel ,
                                          String AV48Testmenuds_1_tfmnuid ,
                                          byte AV50Testmenuds_3_tfmnuop ,
                                          byte AV51Testmenuds_4_tfmnuop_to ,
                                          String AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                          String AV52Testmenuds_5_tfmnupgmtpo ,
                                          String AV55Testmenuds_8_tfmnutxt_sel ,
                                          String AV54Testmenuds_7_tfmnutxt ,
                                          String AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                          String AV56Testmenuds_9_tfmnupgmtxt ,
                                          String AV59Testmenuds_12_tfmnupgm_sel ,
                                          String AV58Testmenuds_11_tfmnupgm ,
                                          String AV61Testmenuds_14_tfmnupgmweb_sel ,
                                          String AV60Testmenuds_13_tfmnupgmweb ,
                                          String A945MnuId ,
                                          byte A946MnuOp ,
                                          String A948MnuPgmTpo ,
                                          String A951MnuTxt ,
                                          String A949MnuPgmTxt ,
                                          String A947MnuPgm ,
                                          String A14286MnuPgmWeb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[14];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.MnuId, T1.MnuPgmWeb, T1.MnuPgm, T1.MnuPgmTxt, T2.MnuTxt, T1.MnuPgmTpo, T1.MnuOp FROM (TXPMNUOP T1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = T1.MnuId)" ;
      if ( (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) && ( ! (GXutil.strcmp("", AV48Testmenuds_1_tfmnuid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuId = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV50Testmenuds_3_tfmnuop) )
      {
         addWhere(sWhereString, "(T1.MnuOp >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Testmenuds_4_tfmnuop_to) )
      {
         addWhere(sWhereString, "(T1.MnuOp <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) && ( ! (GXutil.strcmp("", AV52Testmenuds_5_tfmnupgmtpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTpo = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) && ( ! (GXutil.strcmp("", AV54Testmenuds_7_tfmnutxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MnuTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MnuTxt = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV56Testmenuds_9_tfmnupgmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTxt = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) && ( ! (GXutil.strcmp("", AV58Testmenuds_11_tfmnupgm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgm = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) && ( ! (GXutil.strcmp("", AV60Testmenuds_13_tfmnupgmweb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmWeb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmWeb = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MnuId" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0A875( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Testmenuds_2_tfmnuid_sel ,
                                          String AV48Testmenuds_1_tfmnuid ,
                                          byte AV50Testmenuds_3_tfmnuop ,
                                          byte AV51Testmenuds_4_tfmnuop_to ,
                                          String AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                          String AV52Testmenuds_5_tfmnupgmtpo ,
                                          String AV55Testmenuds_8_tfmnutxt_sel ,
                                          String AV54Testmenuds_7_tfmnutxt ,
                                          String AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                          String AV56Testmenuds_9_tfmnupgmtxt ,
                                          String AV59Testmenuds_12_tfmnupgm_sel ,
                                          String AV58Testmenuds_11_tfmnupgm ,
                                          String AV61Testmenuds_14_tfmnupgmweb_sel ,
                                          String AV60Testmenuds_13_tfmnupgmweb ,
                                          String A945MnuId ,
                                          byte A946MnuOp ,
                                          String A948MnuPgmTpo ,
                                          String A951MnuTxt ,
                                          String A949MnuPgmTxt ,
                                          String A947MnuPgm ,
                                          String A14286MnuPgmWeb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[14];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MnuPgmTxt, T1.MnuPgmWeb, T1.MnuPgm, T2.MnuTxt, T1.MnuPgmTpo, T1.MnuOp, T1.MnuId FROM (TXPMNUOP T1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = T1.MnuId)" ;
      if ( (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) && ( ! (GXutil.strcmp("", AV48Testmenuds_1_tfmnuid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuId = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV50Testmenuds_3_tfmnuop) )
      {
         addWhere(sWhereString, "(T1.MnuOp >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Testmenuds_4_tfmnuop_to) )
      {
         addWhere(sWhereString, "(T1.MnuOp <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) && ( ! (GXutil.strcmp("", AV52Testmenuds_5_tfmnupgmtpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTpo = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) && ( ! (GXutil.strcmp("", AV54Testmenuds_7_tfmnutxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MnuTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MnuTxt = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV56Testmenuds_9_tfmnupgmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTxt = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) && ( ! (GXutil.strcmp("", AV58Testmenuds_11_tfmnupgm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgm = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) && ( ! (GXutil.strcmp("", AV60Testmenuds_13_tfmnupgmweb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmWeb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmWeb = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MnuPgmTxt" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A876( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Testmenuds_2_tfmnuid_sel ,
                                          String AV48Testmenuds_1_tfmnuid ,
                                          byte AV50Testmenuds_3_tfmnuop ,
                                          byte AV51Testmenuds_4_tfmnuop_to ,
                                          String AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                          String AV52Testmenuds_5_tfmnupgmtpo ,
                                          String AV55Testmenuds_8_tfmnutxt_sel ,
                                          String AV54Testmenuds_7_tfmnutxt ,
                                          String AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                          String AV56Testmenuds_9_tfmnupgmtxt ,
                                          String AV59Testmenuds_12_tfmnupgm_sel ,
                                          String AV58Testmenuds_11_tfmnupgm ,
                                          String AV61Testmenuds_14_tfmnupgmweb_sel ,
                                          String AV60Testmenuds_13_tfmnupgmweb ,
                                          String A945MnuId ,
                                          byte A946MnuOp ,
                                          String A948MnuPgmTpo ,
                                          String A951MnuTxt ,
                                          String A949MnuPgmTxt ,
                                          String A947MnuPgm ,
                                          String A14286MnuPgmWeb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[14];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.MnuPgm, T1.MnuPgmWeb, T1.MnuPgmTxt, T2.MnuTxt, T1.MnuPgmTpo, T1.MnuOp, T1.MnuId FROM (TXPMNUOP T1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = T1.MnuId)" ;
      if ( (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) && ( ! (GXutil.strcmp("", AV48Testmenuds_1_tfmnuid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuId = ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (0==AV50Testmenuds_3_tfmnuop) )
      {
         addWhere(sWhereString, "(T1.MnuOp >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Testmenuds_4_tfmnuop_to) )
      {
         addWhere(sWhereString, "(T1.MnuOp <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) && ( ! (GXutil.strcmp("", AV52Testmenuds_5_tfmnupgmtpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTpo = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) && ( ! (GXutil.strcmp("", AV54Testmenuds_7_tfmnutxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MnuTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MnuTxt = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV56Testmenuds_9_tfmnupgmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTxt = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) && ( ! (GXutil.strcmp("", AV58Testmenuds_11_tfmnupgm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgm = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) && ( ! (GXutil.strcmp("", AV60Testmenuds_13_tfmnupgmweb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmWeb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmWeb = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MnuPgm" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0A877( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Testmenuds_2_tfmnuid_sel ,
                                          String AV48Testmenuds_1_tfmnuid ,
                                          byte AV50Testmenuds_3_tfmnuop ,
                                          byte AV51Testmenuds_4_tfmnuop_to ,
                                          String AV53Testmenuds_6_tfmnupgmtpo_sel ,
                                          String AV52Testmenuds_5_tfmnupgmtpo ,
                                          String AV55Testmenuds_8_tfmnutxt_sel ,
                                          String AV54Testmenuds_7_tfmnutxt ,
                                          String AV57Testmenuds_10_tfmnupgmtxt_sel ,
                                          String AV56Testmenuds_9_tfmnupgmtxt ,
                                          String AV59Testmenuds_12_tfmnupgm_sel ,
                                          String AV58Testmenuds_11_tfmnupgm ,
                                          String AV61Testmenuds_14_tfmnupgmweb_sel ,
                                          String AV60Testmenuds_13_tfmnupgmweb ,
                                          String A945MnuId ,
                                          byte A946MnuOp ,
                                          String A948MnuPgmTpo ,
                                          String A951MnuTxt ,
                                          String A949MnuPgmTxt ,
                                          String A947MnuPgm ,
                                          String A14286MnuPgmWeb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[14];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.MnuPgmWeb, T1.MnuPgm, T1.MnuPgmTxt, T2.MnuTxt, T1.MnuPgmTpo, T1.MnuOp, T1.MnuId FROM (TXPMNUOP T1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = T1.MnuId)" ;
      if ( (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) && ( ! (GXutil.strcmp("", AV48Testmenuds_1_tfmnuid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Testmenuds_2_tfmnuid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuId = ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (0==AV50Testmenuds_3_tfmnuop) )
      {
         addWhere(sWhereString, "(T1.MnuOp >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Testmenuds_4_tfmnuop_to) )
      {
         addWhere(sWhereString, "(T1.MnuOp <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) && ( ! (GXutil.strcmp("", AV52Testmenuds_5_tfmnupgmtpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Testmenuds_6_tfmnupgmtpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTpo = ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) && ( ! (GXutil.strcmp("", AV54Testmenuds_7_tfmnutxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MnuTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testmenuds_8_tfmnutxt_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MnuTxt = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV56Testmenuds_9_tfmnupgmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Testmenuds_10_tfmnupgmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTxt = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) && ( ! (GXutil.strcmp("", AV58Testmenuds_11_tfmnupgm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testmenuds_12_tfmnupgm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgm = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) && ( ! (GXutil.strcmp("", AV60Testmenuds_13_tfmnupgmweb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmWeb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Testmenuds_14_tfmnupgmweb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmWeb = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MnuPgmWeb" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P0A872(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] );
            case 1 :
                  return conditional_P0A873(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] );
            case 2 :
                  return conditional_P0A874(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] );
            case 3 :
                  return conditional_P0A875(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] );
            case 4 :
                  return conditional_P0A876(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] );
            case 5 :
                  return conditional_P0A877(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A872", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A873", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A874", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A875", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A876", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A877", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
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
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 200);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 200);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 200);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 200);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 200);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 200);
               }
               return;
      }
   }

}

