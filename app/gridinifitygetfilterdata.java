package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gridinifitygetfilterdata extends GXProcedure
{
   public gridinifitygetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gridinifitygetfilterdata.class ), "" );
   }

   public gridinifitygetfilterdata( int remoteHandle ,
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
      gridinifitygetfilterdata.this.aP5 = new String[] {""};
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
      gridinifitygetfilterdata.this.AV30DDOName = aP0;
      gridinifitygetfilterdata.this.AV31SearchTxt = aP1;
      gridinifitygetfilterdata.this.AV32SearchTxtTo = aP2;
      gridinifitygetfilterdata.this.aP3 = aP3;
      gridinifitygetfilterdata.this.aP4 = aP4;
      gridinifitygetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV33OptionsJson = AV20Options.toJSonString(false) ;
      AV34OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV23OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("GridInifityGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GridInifityGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("GridInifityGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV12TFEmprNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV13TFEmprNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV14TFPrdNum = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV15TFPrdNum_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV16TFPrdNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV17TFPrdNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV31SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV41Gridinifityds_1_filterfulltext = AV36FilterFullText ;
      AV42Gridinifityds_2_tfemprcod = AV10TFEmprCod ;
      AV43Gridinifityds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV44Gridinifityds_4_tfemprnom = AV12TFEmprNom ;
      AV45Gridinifityds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV46Gridinifityds_6_tfprdnum = AV14TFPrdNum ;
      AV47Gridinifityds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV48Gridinifityds_8_tfprdnom = AV16TFPrdNom ;
      AV49Gridinifityds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Gridinifityds_1_filterfulltext ,
                                           AV43Gridinifityds_3_tfemprcod_sel ,
                                           AV42Gridinifityds_2_tfemprcod ,
                                           AV45Gridinifityds_5_tfemprnom_sel ,
                                           AV44Gridinifityds_4_tfemprnom ,
                                           AV47Gridinifityds_7_tfprdnum_sel ,
                                           AV46Gridinifityds_6_tfprdnum ,
                                           AV49Gridinifityds_9_tfprdnom_sel ,
                                           AV48Gridinifityds_8_tfprdnom ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV42Gridinifityds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV42Gridinifityds_2_tfemprcod), 3, "%") ;
      lV44Gridinifityds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV44Gridinifityds_4_tfemprnom), 30, "%") ;
      lV46Gridinifityds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Gridinifityds_6_tfprdnum), 6, "%") ;
      lV48Gridinifityds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Gridinifityds_8_tfprdnom), 26, "%") ;
      /* Using cursor P09W52 */
      pr_default.execute(0, new Object[] {lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV42Gridinifityds_2_tfemprcod, AV43Gridinifityds_3_tfemprcod_sel, lV44Gridinifityds_4_tfemprnom, AV45Gridinifityds_5_tfemprnom_sel, lV46Gridinifityds_6_tfprdnum, AV47Gridinifityds_7_tfprdnum_sel, lV48Gridinifityds_8_tfprdnom, AV49Gridinifityds_9_tfprdnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9W52 = false ;
         A396EmprCod = P09W52_A396EmprCod[0] ;
         A718PrdNom = P09W52_A718PrdNom[0] ;
         A719PrdNum = P09W52_A719PrdNum[0] ;
         A407EmprNom = P09W52_A407EmprNom[0] ;
         n407EmprNom = P09W52_n407EmprNom[0] ;
         A407EmprNom = P09W52_A407EmprNom[0] ;
         n407EmprNom = P09W52_n407EmprNom[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09W52_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk9W52 = false ;
            A719PrdNum = P09W52_A719PrdNum[0] ;
            AV24count = (long)(AV24count+1) ;
            brk9W52 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV19Option = A396EmprCod ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV20Options.add(AV19Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9W52 )
         {
            brk9W52 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV31SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      AV41Gridinifityds_1_filterfulltext = AV36FilterFullText ;
      AV42Gridinifityds_2_tfemprcod = AV10TFEmprCod ;
      AV43Gridinifityds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV44Gridinifityds_4_tfemprnom = AV12TFEmprNom ;
      AV45Gridinifityds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV46Gridinifityds_6_tfprdnum = AV14TFPrdNum ;
      AV47Gridinifityds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV48Gridinifityds_8_tfprdnom = AV16TFPrdNom ;
      AV49Gridinifityds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV41Gridinifityds_1_filterfulltext ,
                                           AV43Gridinifityds_3_tfemprcod_sel ,
                                           AV42Gridinifityds_2_tfemprcod ,
                                           AV45Gridinifityds_5_tfemprnom_sel ,
                                           AV44Gridinifityds_4_tfemprnom ,
                                           AV47Gridinifityds_7_tfprdnum_sel ,
                                           AV46Gridinifityds_6_tfprdnum ,
                                           AV49Gridinifityds_9_tfprdnom_sel ,
                                           AV48Gridinifityds_8_tfprdnom ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV42Gridinifityds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV42Gridinifityds_2_tfemprcod), 3, "%") ;
      lV44Gridinifityds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV44Gridinifityds_4_tfemprnom), 30, "%") ;
      lV46Gridinifityds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Gridinifityds_6_tfprdnum), 6, "%") ;
      lV48Gridinifityds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Gridinifityds_8_tfprdnom), 26, "%") ;
      /* Using cursor P09W53 */
      pr_default.execute(1, new Object[] {lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV42Gridinifityds_2_tfemprcod, AV43Gridinifityds_3_tfemprcod_sel, lV44Gridinifityds_4_tfemprnom, AV45Gridinifityds_5_tfemprnom_sel, lV46Gridinifityds_6_tfprdnum, AV47Gridinifityds_7_tfprdnum_sel, lV48Gridinifityds_8_tfprdnom, AV49Gridinifityds_9_tfprdnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9W54 = false ;
         A407EmprNom = P09W53_A407EmprNom[0] ;
         n407EmprNom = P09W53_n407EmprNom[0] ;
         A718PrdNom = P09W53_A718PrdNom[0] ;
         A719PrdNum = P09W53_A719PrdNum[0] ;
         A396EmprCod = P09W53_A396EmprCod[0] ;
         A407EmprNom = P09W53_A407EmprNom[0] ;
         n407EmprNom = P09W53_n407EmprNom[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09W53_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk9W54 = false ;
            A719PrdNum = P09W53_A719PrdNum[0] ;
            A396EmprCod = P09W53_A396EmprCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk9W54 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV19Option = A407EmprNom ;
            AV20Options.add(AV19Option, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9W54 )
         {
            brk9W54 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNum = AV31SearchTxt ;
      AV15TFPrdNum_Sel = "" ;
      AV41Gridinifityds_1_filterfulltext = AV36FilterFullText ;
      AV42Gridinifityds_2_tfemprcod = AV10TFEmprCod ;
      AV43Gridinifityds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV44Gridinifityds_4_tfemprnom = AV12TFEmprNom ;
      AV45Gridinifityds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV46Gridinifityds_6_tfprdnum = AV14TFPrdNum ;
      AV47Gridinifityds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV48Gridinifityds_8_tfprdnom = AV16TFPrdNom ;
      AV49Gridinifityds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV41Gridinifityds_1_filterfulltext ,
                                           AV43Gridinifityds_3_tfemprcod_sel ,
                                           AV42Gridinifityds_2_tfemprcod ,
                                           AV45Gridinifityds_5_tfemprnom_sel ,
                                           AV44Gridinifityds_4_tfemprnom ,
                                           AV47Gridinifityds_7_tfprdnum_sel ,
                                           AV46Gridinifityds_6_tfprdnum ,
                                           AV49Gridinifityds_9_tfprdnom_sel ,
                                           AV48Gridinifityds_8_tfprdnom ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV42Gridinifityds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV42Gridinifityds_2_tfemprcod), 3, "%") ;
      lV44Gridinifityds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV44Gridinifityds_4_tfemprnom), 30, "%") ;
      lV46Gridinifityds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Gridinifityds_6_tfprdnum), 6, "%") ;
      lV48Gridinifityds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Gridinifityds_8_tfprdnom), 26, "%") ;
      /* Using cursor P09W54 */
      pr_default.execute(2, new Object[] {lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV42Gridinifityds_2_tfemprcod, AV43Gridinifityds_3_tfemprcod_sel, lV44Gridinifityds_4_tfemprnom, AV45Gridinifityds_5_tfemprnom_sel, lV46Gridinifityds_6_tfprdnum, AV47Gridinifityds_7_tfprdnum_sel, lV48Gridinifityds_8_tfprdnom, AV49Gridinifityds_9_tfprdnom_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9W56 = false ;
         A719PrdNum = P09W54_A719PrdNum[0] ;
         A718PrdNom = P09W54_A718PrdNom[0] ;
         A407EmprNom = P09W54_A407EmprNom[0] ;
         n407EmprNom = P09W54_n407EmprNom[0] ;
         A396EmprCod = P09W54_A396EmprCod[0] ;
         A407EmprNom = P09W54_A407EmprNom[0] ;
         n407EmprNom = P09W54_n407EmprNom[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09W54_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9W56 = false ;
            A396EmprCod = P09W54_A396EmprCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk9W56 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV19Option = A719PrdNum ;
            AV20Options.add(AV19Option, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9W56 )
         {
            brk9W56 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdNom = AV31SearchTxt ;
      AV17TFPrdNom_Sel = "" ;
      AV41Gridinifityds_1_filterfulltext = AV36FilterFullText ;
      AV42Gridinifityds_2_tfemprcod = AV10TFEmprCod ;
      AV43Gridinifityds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV44Gridinifityds_4_tfemprnom = AV12TFEmprNom ;
      AV45Gridinifityds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV46Gridinifityds_6_tfprdnum = AV14TFPrdNum ;
      AV47Gridinifityds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV48Gridinifityds_8_tfprdnom = AV16TFPrdNom ;
      AV49Gridinifityds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV41Gridinifityds_1_filterfulltext ,
                                           AV43Gridinifityds_3_tfemprcod_sel ,
                                           AV42Gridinifityds_2_tfemprcod ,
                                           AV45Gridinifityds_5_tfemprnom_sel ,
                                           AV44Gridinifityds_4_tfemprnom ,
                                           AV47Gridinifityds_7_tfprdnum_sel ,
                                           AV46Gridinifityds_6_tfprdnum ,
                                           AV49Gridinifityds_9_tfprdnom_sel ,
                                           AV48Gridinifityds_8_tfprdnom ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV41Gridinifityds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Gridinifityds_1_filterfulltext), "%", "") ;
      lV42Gridinifityds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV42Gridinifityds_2_tfemprcod), 3, "%") ;
      lV44Gridinifityds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV44Gridinifityds_4_tfemprnom), 30, "%") ;
      lV46Gridinifityds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Gridinifityds_6_tfprdnum), 6, "%") ;
      lV48Gridinifityds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Gridinifityds_8_tfprdnom), 26, "%") ;
      /* Using cursor P09W55 */
      pr_default.execute(3, new Object[] {lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV41Gridinifityds_1_filterfulltext, lV42Gridinifityds_2_tfemprcod, AV43Gridinifityds_3_tfemprcod_sel, lV44Gridinifityds_4_tfemprnom, AV45Gridinifityds_5_tfemprnom_sel, lV46Gridinifityds_6_tfprdnum, AV47Gridinifityds_7_tfprdnum_sel, lV48Gridinifityds_8_tfprdnom, AV49Gridinifityds_9_tfprdnom_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9W58 = false ;
         A718PrdNom = P09W55_A718PrdNom[0] ;
         A719PrdNum = P09W55_A719PrdNum[0] ;
         A407EmprNom = P09W55_A407EmprNom[0] ;
         n407EmprNom = P09W55_n407EmprNom[0] ;
         A396EmprCod = P09W55_A396EmprCod[0] ;
         A407EmprNom = P09W55_A407EmprNom[0] ;
         n407EmprNom = P09W55_n407EmprNom[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09W55_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk9W58 = false ;
            A719PrdNum = P09W55_A719PrdNum[0] ;
            A396EmprCod = P09W55_A396EmprCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk9W58 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV19Option = A718PrdNom ;
            AV20Options.add(AV19Option, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9W58 )
         {
            brk9W58 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = gridinifitygetfilterdata.this.AV33OptionsJson;
      this.aP4[0] = gridinifitygetfilterdata.this.AV34OptionsDescJson;
      this.aP5[0] = gridinifitygetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33OptionsJson = "" ;
      AV34OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV36FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFEmprNom = "" ;
      AV13TFEmprNom_Sel = "" ;
      AV14TFPrdNum = "" ;
      AV15TFPrdNum_Sel = "" ;
      AV16TFPrdNom = "" ;
      AV17TFPrdNom_Sel = "" ;
      A396EmprCod = "" ;
      AV41Gridinifityds_1_filterfulltext = "" ;
      AV42Gridinifityds_2_tfemprcod = "" ;
      AV43Gridinifityds_3_tfemprcod_sel = "" ;
      AV44Gridinifityds_4_tfemprnom = "" ;
      AV45Gridinifityds_5_tfemprnom_sel = "" ;
      AV46Gridinifityds_6_tfprdnum = "" ;
      AV47Gridinifityds_7_tfprdnum_sel = "" ;
      AV48Gridinifityds_8_tfprdnom = "" ;
      AV49Gridinifityds_9_tfprdnom_sel = "" ;
      scmdbuf = "" ;
      lV41Gridinifityds_1_filterfulltext = "" ;
      lV42Gridinifityds_2_tfemprcod = "" ;
      lV44Gridinifityds_4_tfemprnom = "" ;
      lV46Gridinifityds_6_tfprdnum = "" ;
      lV48Gridinifityds_8_tfprdnom = "" ;
      A407EmprNom = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      P09W52_A396EmprCod = new String[] {""} ;
      P09W52_A718PrdNom = new String[] {""} ;
      P09W52_A719PrdNum = new String[] {""} ;
      P09W52_A407EmprNom = new String[] {""} ;
      P09W52_n407EmprNom = new boolean[] {false} ;
      AV19Option = "" ;
      AV21OptionDesc = "" ;
      P09W53_A407EmprNom = new String[] {""} ;
      P09W53_n407EmprNom = new boolean[] {false} ;
      P09W53_A718PrdNom = new String[] {""} ;
      P09W53_A719PrdNum = new String[] {""} ;
      P09W53_A396EmprCod = new String[] {""} ;
      P09W54_A719PrdNum = new String[] {""} ;
      P09W54_A718PrdNom = new String[] {""} ;
      P09W54_A407EmprNom = new String[] {""} ;
      P09W54_n407EmprNom = new boolean[] {false} ;
      P09W54_A396EmprCod = new String[] {""} ;
      P09W55_A718PrdNom = new String[] {""} ;
      P09W55_A719PrdNum = new String[] {""} ;
      P09W55_A407EmprNom = new String[] {""} ;
      P09W55_n407EmprNom = new boolean[] {false} ;
      P09W55_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gridinifitygetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09W52_A396EmprCod, P09W52_A718PrdNom, P09W52_A719PrdNum, P09W52_A407EmprNom, P09W52_n407EmprNom
            }
            , new Object[] {
            P09W53_A407EmprNom, P09W53_n407EmprNom, P09W53_A718PrdNom, P09W53_A719PrdNum, P09W53_A396EmprCod
            }
            , new Object[] {
            P09W54_A719PrdNum, P09W54_A718PrdNom, P09W54_A407EmprNom, P09W54_n407EmprNom, P09W54_A396EmprCod
            }
            , new Object[] {
            P09W55_A718PrdNom, P09W55_A719PrdNum, P09W55_A407EmprNom, P09W55_n407EmprNom, P09W55_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV39GXV1 ;
   private long AV24count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String AV14TFPrdNum ;
   private String AV15TFPrdNum_Sel ;
   private String AV16TFPrdNom ;
   private String AV17TFPrdNom_Sel ;
   private String A396EmprCod ;
   private String AV42Gridinifityds_2_tfemprcod ;
   private String AV43Gridinifityds_3_tfemprcod_sel ;
   private String AV44Gridinifityds_4_tfemprnom ;
   private String AV45Gridinifityds_5_tfemprnom_sel ;
   private String AV46Gridinifityds_6_tfprdnum ;
   private String AV47Gridinifityds_7_tfprdnum_sel ;
   private String AV48Gridinifityds_8_tfprdnom ;
   private String AV49Gridinifityds_9_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV42Gridinifityds_2_tfemprcod ;
   private String lV44Gridinifityds_4_tfemprnom ;
   private String lV46Gridinifityds_6_tfprdnum ;
   private String lV48Gridinifityds_8_tfprdnom ;
   private String A407EmprNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private boolean returnInSub ;
   private boolean brk9W52 ;
   private boolean n407EmprNom ;
   private boolean brk9W54 ;
   private boolean brk9W56 ;
   private boolean brk9W58 ;
   private String AV33OptionsJson ;
   private String AV34OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV31SearchTxt ;
   private String AV32SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV41Gridinifityds_1_filterfulltext ;
   private String lV41Gridinifityds_1_filterfulltext ;
   private String AV19Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09W52_A396EmprCod ;
   private String[] P09W52_A718PrdNom ;
   private String[] P09W52_A719PrdNum ;
   private String[] P09W52_A407EmprNom ;
   private boolean[] P09W52_n407EmprNom ;
   private String[] P09W53_A407EmprNom ;
   private boolean[] P09W53_n407EmprNom ;
   private String[] P09W53_A718PrdNom ;
   private String[] P09W53_A719PrdNum ;
   private String[] P09W53_A396EmprCod ;
   private String[] P09W54_A719PrdNum ;
   private String[] P09W54_A718PrdNom ;
   private String[] P09W54_A407EmprNom ;
   private boolean[] P09W54_n407EmprNom ;
   private String[] P09W54_A396EmprCod ;
   private String[] P09W55_A718PrdNom ;
   private String[] P09W55_A719PrdNum ;
   private String[] P09W55_A407EmprNom ;
   private boolean[] P09W55_n407EmprNom ;
   private String[] P09W55_A396EmprCod ;
   private GXSimpleCollection<String> AV20Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV23OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class gridinifitygetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09W52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Gridinifityds_1_filterfulltext ,
                                          String AV43Gridinifityds_3_tfemprcod_sel ,
                                          String AV42Gridinifityds_2_tfemprcod ,
                                          String AV45Gridinifityds_5_tfemprnom_sel ,
                                          String AV44Gridinifityds_4_tfemprnom ,
                                          String AV47Gridinifityds_7_tfprdnum_sel ,
                                          String AV46Gridinifityds_6_tfprdnum ,
                                          String AV49Gridinifityds_9_tfprdnom_sel ,
                                          String AV48Gridinifityds_8_tfprdnom ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A719PrdNum ,
                                          String A718PrdNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNom, T1.PrdNum, T2.EmprNom FROM (TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV41Gridinifityds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Gridinifityds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV42Gridinifityds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Gridinifityds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Gridinifityds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV44Gridinifityds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Gridinifityds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Gridinifityds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Gridinifityds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Gridinifityds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Gridinifityds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Gridinifityds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Gridinifityds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09W53( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Gridinifityds_1_filterfulltext ,
                                          String AV43Gridinifityds_3_tfemprcod_sel ,
                                          String AV42Gridinifityds_2_tfemprcod ,
                                          String AV45Gridinifityds_5_tfemprnom_sel ,
                                          String AV44Gridinifityds_4_tfemprnom ,
                                          String AV47Gridinifityds_7_tfprdnum_sel ,
                                          String AV46Gridinifityds_6_tfprdnum ,
                                          String AV49Gridinifityds_9_tfprdnom_sel ,
                                          String AV48Gridinifityds_8_tfprdnom ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A719PrdNum ,
                                          String A718PrdNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T1.PrdNom, T1.PrdNum, T1.EmprCod FROM (TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV41Gridinifityds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Gridinifityds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV42Gridinifityds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Gridinifityds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Gridinifityds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV44Gridinifityds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Gridinifityds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Gridinifityds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Gridinifityds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Gridinifityds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Gridinifityds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Gridinifityds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Gridinifityds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09W54( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Gridinifityds_1_filterfulltext ,
                                          String AV43Gridinifityds_3_tfemprcod_sel ,
                                          String AV42Gridinifityds_2_tfemprcod ,
                                          String AV45Gridinifityds_5_tfemprnom_sel ,
                                          String AV44Gridinifityds_4_tfemprnom ,
                                          String AV47Gridinifityds_7_tfprdnum_sel ,
                                          String AV46Gridinifityds_6_tfprdnum ,
                                          String AV49Gridinifityds_9_tfprdnom_sel ,
                                          String AV48Gridinifityds_8_tfprdnom ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A719PrdNum ,
                                          String A718PrdNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.PrdNom, T2.EmprNom, T1.EmprCod FROM (TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV41Gridinifityds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Gridinifityds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV42Gridinifityds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Gridinifityds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Gridinifityds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV44Gridinifityds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Gridinifityds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Gridinifityds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Gridinifityds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Gridinifityds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Gridinifityds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Gridinifityds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Gridinifityds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09W55( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Gridinifityds_1_filterfulltext ,
                                          String AV43Gridinifityds_3_tfemprcod_sel ,
                                          String AV42Gridinifityds_2_tfemprcod ,
                                          String AV45Gridinifityds_5_tfemprnom_sel ,
                                          String AV44Gridinifityds_4_tfemprnom ,
                                          String AV47Gridinifityds_7_tfprdnum_sel ,
                                          String AV46Gridinifityds_6_tfprdnum ,
                                          String AV49Gridinifityds_9_tfprdnom_sel ,
                                          String AV48Gridinifityds_8_tfprdnom ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A719PrdNum ,
                                          String A718PrdNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[12];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrdNom, T1.PrdNum, T2.EmprNom, T1.EmprCod FROM (TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV41Gridinifityds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Gridinifityds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV42Gridinifityds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Gridinifityds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Gridinifityds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV44Gridinifityds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Gridinifityds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Gridinifityds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Gridinifityds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Gridinifityds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Gridinifityds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Gridinifityds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Gridinifityds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNom" ;
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
                  return conditional_P09W52(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P09W53(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P09W54(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 3 :
                  return conditional_P09W55(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09W52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09W53", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09W54", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09W55", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               return;
      }
   }

}

