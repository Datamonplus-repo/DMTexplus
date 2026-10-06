package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tcatsuswwgetfilterdata extends GXProcedure
{
   public tcatsuswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcatsuswwgetfilterdata.class ), "" );
   }

   public tcatsuswwgetfilterdata( int remoteHandle ,
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
      tcatsuswwgetfilterdata.this.aP5 = new String[] {""};
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
      tcatsuswwgetfilterdata.this.AV22DDOName = aP0;
      tcatsuswwgetfilterdata.this.AV20SearchTxt = aP1;
      tcatsuswwgetfilterdata.this.AV21SearchTxtTo = aP2;
      tcatsuswwgetfilterdata.this.aP3 = aP3;
      tcatsuswwgetfilterdata.this.aP4 = aP4;
      tcatsuswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_EMPRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_EMPRNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_THELIST") == 0 )
      {
         /* Execute user subroutine: 'LOADTHELISTOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("TCATSUSWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCATSUSWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("TCATSUSWWGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV12TFEmprNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV13TFEmprNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV14TFPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV15TFPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV16TFPrdNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV17TFPrdNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTHELIST") == 0 )
         {
            AV18TFTheList = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTHELIST_SEL") == 0 )
         {
            AV19TFTheList_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV20SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV57Tcatsuswwds_1_filterfulltext = AV52FilterFullText ;
      AV58Tcatsuswwds_2_tfemprcod = AV10TFEmprCod ;
      AV59Tcatsuswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV60Tcatsuswwds_4_tfemprnom = AV12TFEmprNom ;
      AV61Tcatsuswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV62Tcatsuswwds_6_tfprdnum = AV14TFPrdNum ;
      AV63Tcatsuswwds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV64Tcatsuswwds_8_tfprdnom = AV16TFPrdNom ;
      AV65Tcatsuswwds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV66Tcatsuswwds_10_tfthelist = AV18TFTheList ;
      AV67Tcatsuswwds_11_tfthelist_sel = AV19TFTheList_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Tcatsuswwds_1_filterfulltext ,
                                           AV59Tcatsuswwds_3_tfemprcod_sel ,
                                           AV58Tcatsuswwds_2_tfemprcod ,
                                           AV61Tcatsuswwds_5_tfemprnom_sel ,
                                           AV60Tcatsuswwds_4_tfemprnom ,
                                           AV63Tcatsuswwds_7_tfprdnum_sel ,
                                           AV62Tcatsuswwds_6_tfprdnum ,
                                           AV65Tcatsuswwds_9_tfprdnom_sel ,
                                           AV64Tcatsuswwds_8_tfprdnom ,
                                           AV67Tcatsuswwds_11_tfthelist_sel ,
                                           AV66Tcatsuswwds_10_tfthelist ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A13586TheList } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV58Tcatsuswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Tcatsuswwds_2_tfemprcod), 3, "%") ;
      lV60Tcatsuswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tcatsuswwds_4_tfemprnom), 30, "%") ;
      lV62Tcatsuswwds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Tcatsuswwds_6_tfprdnum), 6, "%") ;
      lV64Tcatsuswwds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Tcatsuswwds_8_tfprdnom), 26, "%") ;
      lV66Tcatsuswwds_10_tfthelist = GXutil.padr( GXutil.rtrim( AV66Tcatsuswwds_10_tfthelist), 4, "%") ;
      /* Using cursor P08O82 */
      pr_default.execute(0, new Object[] {lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV58Tcatsuswwds_2_tfemprcod, AV59Tcatsuswwds_3_tfemprcod_sel, lV60Tcatsuswwds_4_tfemprnom, AV61Tcatsuswwds_5_tfemprnom_sel, lV62Tcatsuswwds_6_tfprdnum, AV63Tcatsuswwds_7_tfprdnum_sel, lV64Tcatsuswwds_8_tfprdnom, AV65Tcatsuswwds_9_tfprdnom_sel, lV66Tcatsuswwds_10_tfthelist, AV67Tcatsuswwds_11_tfthelist_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8O82 = false ;
         A396EmprCod = P08O82_A396EmprCod[0] ;
         A13586TheList = P08O82_A13586TheList[0] ;
         A718PrdNom = P08O82_A718PrdNom[0] ;
         A719PrdNum = P08O82_A719PrdNum[0] ;
         A407EmprNom = P08O82_A407EmprNom[0] ;
         n407EmprNom = P08O82_n407EmprNom[0] ;
         A407EmprNom = P08O82_A407EmprNom[0] ;
         n407EmprNom = P08O82_n407EmprNom[0] ;
         A718PrdNom = P08O82_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08O82_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8O82 = false ;
            A13586TheList = P08O82_A13586TheList[0] ;
            A719PrdNum = P08O82_A719PrdNum[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8O82 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV24Option = A396EmprCod ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV25Options.add(AV24Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8O82 )
         {
            brk8O82 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV20SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      AV57Tcatsuswwds_1_filterfulltext = AV52FilterFullText ;
      AV58Tcatsuswwds_2_tfemprcod = AV10TFEmprCod ;
      AV59Tcatsuswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV60Tcatsuswwds_4_tfemprnom = AV12TFEmprNom ;
      AV61Tcatsuswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV62Tcatsuswwds_6_tfprdnum = AV14TFPrdNum ;
      AV63Tcatsuswwds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV64Tcatsuswwds_8_tfprdnom = AV16TFPrdNom ;
      AV65Tcatsuswwds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV66Tcatsuswwds_10_tfthelist = AV18TFTheList ;
      AV67Tcatsuswwds_11_tfthelist_sel = AV19TFTheList_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV57Tcatsuswwds_1_filterfulltext ,
                                           AV59Tcatsuswwds_3_tfemprcod_sel ,
                                           AV58Tcatsuswwds_2_tfemprcod ,
                                           AV61Tcatsuswwds_5_tfemprnom_sel ,
                                           AV60Tcatsuswwds_4_tfemprnom ,
                                           AV63Tcatsuswwds_7_tfprdnum_sel ,
                                           AV62Tcatsuswwds_6_tfprdnum ,
                                           AV65Tcatsuswwds_9_tfprdnom_sel ,
                                           AV64Tcatsuswwds_8_tfprdnom ,
                                           AV67Tcatsuswwds_11_tfthelist_sel ,
                                           AV66Tcatsuswwds_10_tfthelist ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A13586TheList } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV58Tcatsuswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Tcatsuswwds_2_tfemprcod), 3, "%") ;
      lV60Tcatsuswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tcatsuswwds_4_tfemprnom), 30, "%") ;
      lV62Tcatsuswwds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Tcatsuswwds_6_tfprdnum), 6, "%") ;
      lV64Tcatsuswwds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Tcatsuswwds_8_tfprdnom), 26, "%") ;
      lV66Tcatsuswwds_10_tfthelist = GXutil.padr( GXutil.rtrim( AV66Tcatsuswwds_10_tfthelist), 4, "%") ;
      /* Using cursor P08O83 */
      pr_default.execute(1, new Object[] {lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV58Tcatsuswwds_2_tfemprcod, AV59Tcatsuswwds_3_tfemprcod_sel, lV60Tcatsuswwds_4_tfemprnom, AV61Tcatsuswwds_5_tfemprnom_sel, lV62Tcatsuswwds_6_tfprdnum, AV63Tcatsuswwds_7_tfprdnum_sel, lV64Tcatsuswwds_8_tfprdnom, AV65Tcatsuswwds_9_tfprdnom_sel, lV66Tcatsuswwds_10_tfthelist, AV67Tcatsuswwds_11_tfthelist_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8O84 = false ;
         A407EmprNom = P08O83_A407EmprNom[0] ;
         n407EmprNom = P08O83_n407EmprNom[0] ;
         A13586TheList = P08O83_A13586TheList[0] ;
         A718PrdNom = P08O83_A718PrdNom[0] ;
         A719PrdNum = P08O83_A719PrdNum[0] ;
         A396EmprCod = P08O83_A396EmprCod[0] ;
         A407EmprNom = P08O83_A407EmprNom[0] ;
         n407EmprNom = P08O83_n407EmprNom[0] ;
         A718PrdNom = P08O83_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08O83_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk8O84 = false ;
            A13586TheList = P08O83_A13586TheList[0] ;
            A719PrdNum = P08O83_A719PrdNum[0] ;
            A396EmprCod = P08O83_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8O84 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV24Option = A407EmprNom ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8O84 )
         {
            brk8O84 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNum = AV20SearchTxt ;
      AV15TFPrdNum_Sel = "" ;
      AV57Tcatsuswwds_1_filterfulltext = AV52FilterFullText ;
      AV58Tcatsuswwds_2_tfemprcod = AV10TFEmprCod ;
      AV59Tcatsuswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV60Tcatsuswwds_4_tfemprnom = AV12TFEmprNom ;
      AV61Tcatsuswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV62Tcatsuswwds_6_tfprdnum = AV14TFPrdNum ;
      AV63Tcatsuswwds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV64Tcatsuswwds_8_tfprdnom = AV16TFPrdNom ;
      AV65Tcatsuswwds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV66Tcatsuswwds_10_tfthelist = AV18TFTheList ;
      AV67Tcatsuswwds_11_tfthelist_sel = AV19TFTheList_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV57Tcatsuswwds_1_filterfulltext ,
                                           AV59Tcatsuswwds_3_tfemprcod_sel ,
                                           AV58Tcatsuswwds_2_tfemprcod ,
                                           AV61Tcatsuswwds_5_tfemprnom_sel ,
                                           AV60Tcatsuswwds_4_tfemprnom ,
                                           AV63Tcatsuswwds_7_tfprdnum_sel ,
                                           AV62Tcatsuswwds_6_tfprdnum ,
                                           AV65Tcatsuswwds_9_tfprdnom_sel ,
                                           AV64Tcatsuswwds_8_tfprdnom ,
                                           AV67Tcatsuswwds_11_tfthelist_sel ,
                                           AV66Tcatsuswwds_10_tfthelist ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A13586TheList } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV58Tcatsuswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Tcatsuswwds_2_tfemprcod), 3, "%") ;
      lV60Tcatsuswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tcatsuswwds_4_tfemprnom), 30, "%") ;
      lV62Tcatsuswwds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Tcatsuswwds_6_tfprdnum), 6, "%") ;
      lV64Tcatsuswwds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Tcatsuswwds_8_tfprdnom), 26, "%") ;
      lV66Tcatsuswwds_10_tfthelist = GXutil.padr( GXutil.rtrim( AV66Tcatsuswwds_10_tfthelist), 4, "%") ;
      /* Using cursor P08O84 */
      pr_default.execute(2, new Object[] {lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV58Tcatsuswwds_2_tfemprcod, AV59Tcatsuswwds_3_tfemprcod_sel, lV60Tcatsuswwds_4_tfemprnom, AV61Tcatsuswwds_5_tfemprnom_sel, lV62Tcatsuswwds_6_tfprdnum, AV63Tcatsuswwds_7_tfprdnum_sel, lV64Tcatsuswwds_8_tfprdnom, AV65Tcatsuswwds_9_tfprdnom_sel, lV66Tcatsuswwds_10_tfthelist, AV67Tcatsuswwds_11_tfthelist_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8O86 = false ;
         A719PrdNum = P08O84_A719PrdNum[0] ;
         A13586TheList = P08O84_A13586TheList[0] ;
         A718PrdNom = P08O84_A718PrdNom[0] ;
         A407EmprNom = P08O84_A407EmprNom[0] ;
         n407EmprNom = P08O84_n407EmprNom[0] ;
         A396EmprCod = P08O84_A396EmprCod[0] ;
         A407EmprNom = P08O84_A407EmprNom[0] ;
         n407EmprNom = P08O84_n407EmprNom[0] ;
         A718PrdNom = P08O84_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08O84_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8O86 = false ;
            A13586TheList = P08O84_A13586TheList[0] ;
            A396EmprCod = P08O84_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8O86 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV24Option = A719PrdNum ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8O86 )
         {
            brk8O86 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdNom = AV20SearchTxt ;
      AV17TFPrdNom_Sel = "" ;
      AV57Tcatsuswwds_1_filterfulltext = AV52FilterFullText ;
      AV58Tcatsuswwds_2_tfemprcod = AV10TFEmprCod ;
      AV59Tcatsuswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV60Tcatsuswwds_4_tfemprnom = AV12TFEmprNom ;
      AV61Tcatsuswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV62Tcatsuswwds_6_tfprdnum = AV14TFPrdNum ;
      AV63Tcatsuswwds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV64Tcatsuswwds_8_tfprdnom = AV16TFPrdNom ;
      AV65Tcatsuswwds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV66Tcatsuswwds_10_tfthelist = AV18TFTheList ;
      AV67Tcatsuswwds_11_tfthelist_sel = AV19TFTheList_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV57Tcatsuswwds_1_filterfulltext ,
                                           AV59Tcatsuswwds_3_tfemprcod_sel ,
                                           AV58Tcatsuswwds_2_tfemprcod ,
                                           AV61Tcatsuswwds_5_tfemprnom_sel ,
                                           AV60Tcatsuswwds_4_tfemprnom ,
                                           AV63Tcatsuswwds_7_tfprdnum_sel ,
                                           AV62Tcatsuswwds_6_tfprdnum ,
                                           AV65Tcatsuswwds_9_tfprdnom_sel ,
                                           AV64Tcatsuswwds_8_tfprdnom ,
                                           AV67Tcatsuswwds_11_tfthelist_sel ,
                                           AV66Tcatsuswwds_10_tfthelist ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A13586TheList } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV58Tcatsuswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Tcatsuswwds_2_tfemprcod), 3, "%") ;
      lV60Tcatsuswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tcatsuswwds_4_tfemprnom), 30, "%") ;
      lV62Tcatsuswwds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Tcatsuswwds_6_tfprdnum), 6, "%") ;
      lV64Tcatsuswwds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Tcatsuswwds_8_tfprdnom), 26, "%") ;
      lV66Tcatsuswwds_10_tfthelist = GXutil.padr( GXutil.rtrim( AV66Tcatsuswwds_10_tfthelist), 4, "%") ;
      /* Using cursor P08O85 */
      pr_default.execute(3, new Object[] {lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV58Tcatsuswwds_2_tfemprcod, AV59Tcatsuswwds_3_tfemprcod_sel, lV60Tcatsuswwds_4_tfemprnom, AV61Tcatsuswwds_5_tfemprnom_sel, lV62Tcatsuswwds_6_tfprdnum, AV63Tcatsuswwds_7_tfprdnum_sel, lV64Tcatsuswwds_8_tfprdnom, AV65Tcatsuswwds_9_tfprdnom_sel, lV66Tcatsuswwds_10_tfthelist, AV67Tcatsuswwds_11_tfthelist_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8O88 = false ;
         A719PrdNum = P08O85_A719PrdNum[0] ;
         A396EmprCod = P08O85_A396EmprCod[0] ;
         A13586TheList = P08O85_A13586TheList[0] ;
         A718PrdNom = P08O85_A718PrdNom[0] ;
         A407EmprNom = P08O85_A407EmprNom[0] ;
         n407EmprNom = P08O85_n407EmprNom[0] ;
         A407EmprNom = P08O85_A407EmprNom[0] ;
         n407EmprNom = P08O85_n407EmprNom[0] ;
         A718PrdNom = P08O85_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08O85_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08O85_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8O88 = false ;
            A13586TheList = P08O85_A13586TheList[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8O88 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV24Option = A718PrdNom ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            AV25Options.add(AV24Option, AV23InsertIndex);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8O88 )
         {
            brk8O88 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADTHELISTOPTIONS' Routine */
      returnInSub = false ;
      AV18TFTheList = AV20SearchTxt ;
      AV19TFTheList_Sel = "" ;
      AV57Tcatsuswwds_1_filterfulltext = AV52FilterFullText ;
      AV58Tcatsuswwds_2_tfemprcod = AV10TFEmprCod ;
      AV59Tcatsuswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV60Tcatsuswwds_4_tfemprnom = AV12TFEmprNom ;
      AV61Tcatsuswwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV62Tcatsuswwds_6_tfprdnum = AV14TFPrdNum ;
      AV63Tcatsuswwds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV64Tcatsuswwds_8_tfprdnom = AV16TFPrdNom ;
      AV65Tcatsuswwds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV66Tcatsuswwds_10_tfthelist = AV18TFTheList ;
      AV67Tcatsuswwds_11_tfthelist_sel = AV19TFTheList_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV57Tcatsuswwds_1_filterfulltext ,
                                           AV59Tcatsuswwds_3_tfemprcod_sel ,
                                           AV58Tcatsuswwds_2_tfemprcod ,
                                           AV61Tcatsuswwds_5_tfemprnom_sel ,
                                           AV60Tcatsuswwds_4_tfemprnom ,
                                           AV63Tcatsuswwds_7_tfprdnum_sel ,
                                           AV62Tcatsuswwds_6_tfprdnum ,
                                           AV65Tcatsuswwds_9_tfprdnom_sel ,
                                           AV64Tcatsuswwds_8_tfprdnom ,
                                           AV67Tcatsuswwds_11_tfthelist_sel ,
                                           AV66Tcatsuswwds_10_tfthelist ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A13586TheList } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV57Tcatsuswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tcatsuswwds_1_filterfulltext), "%", "") ;
      lV58Tcatsuswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Tcatsuswwds_2_tfemprcod), 3, "%") ;
      lV60Tcatsuswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV60Tcatsuswwds_4_tfemprnom), 30, "%") ;
      lV62Tcatsuswwds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV62Tcatsuswwds_6_tfprdnum), 6, "%") ;
      lV64Tcatsuswwds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV64Tcatsuswwds_8_tfprdnom), 26, "%") ;
      lV66Tcatsuswwds_10_tfthelist = GXutil.padr( GXutil.rtrim( AV66Tcatsuswwds_10_tfthelist), 4, "%") ;
      /* Using cursor P08O86 */
      pr_default.execute(4, new Object[] {lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV57Tcatsuswwds_1_filterfulltext, lV58Tcatsuswwds_2_tfemprcod, AV59Tcatsuswwds_3_tfemprcod_sel, lV60Tcatsuswwds_4_tfemprnom, AV61Tcatsuswwds_5_tfemprnom_sel, lV62Tcatsuswwds_6_tfprdnum, AV63Tcatsuswwds_7_tfprdnum_sel, lV64Tcatsuswwds_8_tfprdnom, AV65Tcatsuswwds_9_tfprdnom_sel, lV66Tcatsuswwds_10_tfthelist, AV67Tcatsuswwds_11_tfthelist_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8O810 = false ;
         A13586TheList = P08O86_A13586TheList[0] ;
         A718PrdNom = P08O86_A718PrdNom[0] ;
         A719PrdNum = P08O86_A719PrdNum[0] ;
         A407EmprNom = P08O86_A407EmprNom[0] ;
         n407EmprNom = P08O86_n407EmprNom[0] ;
         A396EmprCod = P08O86_A396EmprCod[0] ;
         A407EmprNom = P08O86_A407EmprNom[0] ;
         n407EmprNom = P08O86_n407EmprNom[0] ;
         A718PrdNom = P08O86_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08O86_A13586TheList[0], A13586TheList) == 0 ) )
         {
            brk8O810 = false ;
            A719PrdNum = P08O86_A719PrdNum[0] ;
            A396EmprCod = P08O86_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8O810 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A13586TheList)==0) )
         {
            AV24Option = A13586TheList ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8O810 )
         {
            brk8O810 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tcatsuswwgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = tcatsuswwgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = tcatsuswwgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFEmprNom = "" ;
      AV13TFEmprNom_Sel = "" ;
      AV14TFPrdNum = "" ;
      AV15TFPrdNum_Sel = "" ;
      AV16TFPrdNom = "" ;
      AV17TFPrdNom_Sel = "" ;
      AV18TFTheList = "" ;
      AV19TFTheList_Sel = "" ;
      A396EmprCod = "" ;
      AV57Tcatsuswwds_1_filterfulltext = "" ;
      AV58Tcatsuswwds_2_tfemprcod = "" ;
      AV59Tcatsuswwds_3_tfemprcod_sel = "" ;
      AV60Tcatsuswwds_4_tfemprnom = "" ;
      AV61Tcatsuswwds_5_tfemprnom_sel = "" ;
      AV62Tcatsuswwds_6_tfprdnum = "" ;
      AV63Tcatsuswwds_7_tfprdnum_sel = "" ;
      AV64Tcatsuswwds_8_tfprdnom = "" ;
      AV65Tcatsuswwds_9_tfprdnom_sel = "" ;
      AV66Tcatsuswwds_10_tfthelist = "" ;
      AV67Tcatsuswwds_11_tfthelist_sel = "" ;
      scmdbuf = "" ;
      lV57Tcatsuswwds_1_filterfulltext = "" ;
      lV58Tcatsuswwds_2_tfemprcod = "" ;
      lV60Tcatsuswwds_4_tfemprnom = "" ;
      lV62Tcatsuswwds_6_tfprdnum = "" ;
      lV64Tcatsuswwds_8_tfprdnom = "" ;
      lV66Tcatsuswwds_10_tfthelist = "" ;
      A407EmprNom = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A13586TheList = "" ;
      P08O82_A396EmprCod = new String[] {""} ;
      P08O82_A13586TheList = new String[] {""} ;
      P08O82_A718PrdNom = new String[] {""} ;
      P08O82_A719PrdNum = new String[] {""} ;
      P08O82_A407EmprNom = new String[] {""} ;
      P08O82_n407EmprNom = new boolean[] {false} ;
      AV24Option = "" ;
      AV27OptionDesc = "" ;
      P08O83_A407EmprNom = new String[] {""} ;
      P08O83_n407EmprNom = new boolean[] {false} ;
      P08O83_A13586TheList = new String[] {""} ;
      P08O83_A718PrdNom = new String[] {""} ;
      P08O83_A719PrdNum = new String[] {""} ;
      P08O83_A396EmprCod = new String[] {""} ;
      P08O84_A719PrdNum = new String[] {""} ;
      P08O84_A13586TheList = new String[] {""} ;
      P08O84_A718PrdNom = new String[] {""} ;
      P08O84_A407EmprNom = new String[] {""} ;
      P08O84_n407EmprNom = new boolean[] {false} ;
      P08O84_A396EmprCod = new String[] {""} ;
      P08O85_A719PrdNum = new String[] {""} ;
      P08O85_A396EmprCod = new String[] {""} ;
      P08O85_A13586TheList = new String[] {""} ;
      P08O85_A718PrdNom = new String[] {""} ;
      P08O85_A407EmprNom = new String[] {""} ;
      P08O85_n407EmprNom = new boolean[] {false} ;
      P08O86_A13586TheList = new String[] {""} ;
      P08O86_A718PrdNom = new String[] {""} ;
      P08O86_A719PrdNum = new String[] {""} ;
      P08O86_A407EmprNom = new String[] {""} ;
      P08O86_n407EmprNom = new boolean[] {false} ;
      P08O86_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcatsuswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08O82_A396EmprCod, P08O82_A13586TheList, P08O82_A718PrdNom, P08O82_A719PrdNum, P08O82_A407EmprNom, P08O82_n407EmprNom
            }
            , new Object[] {
            P08O83_A407EmprNom, P08O83_n407EmprNom, P08O83_A13586TheList, P08O83_A718PrdNom, P08O83_A719PrdNum, P08O83_A396EmprCod
            }
            , new Object[] {
            P08O84_A719PrdNum, P08O84_A13586TheList, P08O84_A718PrdNom, P08O84_A407EmprNom, P08O84_n407EmprNom, P08O84_A396EmprCod
            }
            , new Object[] {
            P08O85_A719PrdNum, P08O85_A396EmprCod, P08O85_A13586TheList, P08O85_A718PrdNom, P08O85_A407EmprNom, P08O85_n407EmprNom
            }
            , new Object[] {
            P08O86_A13586TheList, P08O86_A718PrdNom, P08O86_A719PrdNum, P08O86_A407EmprNom, P08O86_n407EmprNom, P08O86_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String AV14TFPrdNum ;
   private String AV15TFPrdNum_Sel ;
   private String AV16TFPrdNom ;
   private String AV17TFPrdNom_Sel ;
   private String AV18TFTheList ;
   private String AV19TFTheList_Sel ;
   private String A396EmprCod ;
   private String AV58Tcatsuswwds_2_tfemprcod ;
   private String AV59Tcatsuswwds_3_tfemprcod_sel ;
   private String AV60Tcatsuswwds_4_tfemprnom ;
   private String AV61Tcatsuswwds_5_tfemprnom_sel ;
   private String AV62Tcatsuswwds_6_tfprdnum ;
   private String AV63Tcatsuswwds_7_tfprdnum_sel ;
   private String AV64Tcatsuswwds_8_tfprdnom ;
   private String AV65Tcatsuswwds_9_tfprdnom_sel ;
   private String AV66Tcatsuswwds_10_tfthelist ;
   private String AV67Tcatsuswwds_11_tfthelist_sel ;
   private String scmdbuf ;
   private String lV58Tcatsuswwds_2_tfemprcod ;
   private String lV60Tcatsuswwds_4_tfemprnom ;
   private String lV62Tcatsuswwds_6_tfprdnum ;
   private String lV64Tcatsuswwds_8_tfprdnom ;
   private String lV66Tcatsuswwds_10_tfthelist ;
   private String A407EmprNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A13586TheList ;
   private boolean returnInSub ;
   private boolean brk8O82 ;
   private boolean n407EmprNom ;
   private boolean brk8O84 ;
   private boolean brk8O86 ;
   private boolean brk8O88 ;
   private boolean brk8O810 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV57Tcatsuswwds_1_filterfulltext ;
   private String lV57Tcatsuswwds_1_filterfulltext ;
   private String AV24Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08O82_A396EmprCod ;
   private String[] P08O82_A13586TheList ;
   private String[] P08O82_A718PrdNom ;
   private String[] P08O82_A719PrdNum ;
   private String[] P08O82_A407EmprNom ;
   private boolean[] P08O82_n407EmprNom ;
   private String[] P08O83_A407EmprNom ;
   private boolean[] P08O83_n407EmprNom ;
   private String[] P08O83_A13586TheList ;
   private String[] P08O83_A718PrdNom ;
   private String[] P08O83_A719PrdNum ;
   private String[] P08O83_A396EmprCod ;
   private String[] P08O84_A719PrdNum ;
   private String[] P08O84_A13586TheList ;
   private String[] P08O84_A718PrdNom ;
   private String[] P08O84_A407EmprNom ;
   private boolean[] P08O84_n407EmprNom ;
   private String[] P08O84_A396EmprCod ;
   private String[] P08O85_A719PrdNum ;
   private String[] P08O85_A396EmprCod ;
   private String[] P08O85_A13586TheList ;
   private String[] P08O85_A718PrdNom ;
   private String[] P08O85_A407EmprNom ;
   private boolean[] P08O85_n407EmprNom ;
   private String[] P08O86_A13586TheList ;
   private String[] P08O86_A718PrdNom ;
   private String[] P08O86_A719PrdNum ;
   private String[] P08O86_A407EmprNom ;
   private boolean[] P08O86_n407EmprNom ;
   private String[] P08O86_A396EmprCod ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class tcatsuswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08O82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Tcatsuswwds_1_filterfulltext ,
                                          String AV59Tcatsuswwds_3_tfemprcod_sel ,
                                          String AV58Tcatsuswwds_2_tfemprcod ,
                                          String AV61Tcatsuswwds_5_tfemprnom_sel ,
                                          String AV60Tcatsuswwds_4_tfemprnom ,
                                          String AV63Tcatsuswwds_7_tfprdnum_sel ,
                                          String AV62Tcatsuswwds_6_tfprdnum ,
                                          String AV65Tcatsuswwds_9_tfprdnom_sel ,
                                          String AV64Tcatsuswwds_8_tfprdnom ,
                                          String AV67Tcatsuswwds_11_tfthelist_sel ,
                                          String AV66Tcatsuswwds_10_tfthelist ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A13586TheList )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.TheList, T3.PrdNom, T1.PrdNum, T2.EmprNom FROM ((TXPCATSUS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      if ( ! (GXutil.strcmp("", AV57Tcatsuswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T3.PrdNom) like '%' || UPPER(?)) or ( UPPER(T1.TheList) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Tcatsuswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tcatsuswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Tcatsuswwds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Tcatsuswwds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) && ( ! (GXutil.strcmp("", AV66Tcatsuswwds_10_tfthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TheList) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TheList = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08O83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Tcatsuswwds_1_filterfulltext ,
                                          String AV59Tcatsuswwds_3_tfemprcod_sel ,
                                          String AV58Tcatsuswwds_2_tfemprcod ,
                                          String AV61Tcatsuswwds_5_tfemprnom_sel ,
                                          String AV60Tcatsuswwds_4_tfemprnom ,
                                          String AV63Tcatsuswwds_7_tfprdnum_sel ,
                                          String AV62Tcatsuswwds_6_tfprdnum ,
                                          String AV65Tcatsuswwds_9_tfprdnom_sel ,
                                          String AV64Tcatsuswwds_8_tfprdnom ,
                                          String AV67Tcatsuswwds_11_tfthelist_sel ,
                                          String AV66Tcatsuswwds_10_tfthelist ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A13586TheList )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[15];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T1.TheList, T3.PrdNom, T1.PrdNum, T1.EmprCod FROM ((TXPCATSUS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      if ( ! (GXutil.strcmp("", AV57Tcatsuswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T3.PrdNom) like '%' || UPPER(?)) or ( UPPER(T1.TheList) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Tcatsuswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tcatsuswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Tcatsuswwds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Tcatsuswwds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) && ( ! (GXutil.strcmp("", AV66Tcatsuswwds_10_tfthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TheList) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TheList = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08O84( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Tcatsuswwds_1_filterfulltext ,
                                          String AV59Tcatsuswwds_3_tfemprcod_sel ,
                                          String AV58Tcatsuswwds_2_tfemprcod ,
                                          String AV61Tcatsuswwds_5_tfemprnom_sel ,
                                          String AV60Tcatsuswwds_4_tfemprnom ,
                                          String AV63Tcatsuswwds_7_tfprdnum_sel ,
                                          String AV62Tcatsuswwds_6_tfprdnum ,
                                          String AV65Tcatsuswwds_9_tfprdnom_sel ,
                                          String AV64Tcatsuswwds_8_tfprdnom ,
                                          String AV67Tcatsuswwds_11_tfthelist_sel ,
                                          String AV66Tcatsuswwds_10_tfthelist ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A13586TheList )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.TheList, T3.PrdNom, T2.EmprNom, T1.EmprCod FROM ((TXPCATSUS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      if ( ! (GXutil.strcmp("", AV57Tcatsuswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T3.PrdNom) like '%' || UPPER(?)) or ( UPPER(T1.TheList) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Tcatsuswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tcatsuswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Tcatsuswwds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Tcatsuswwds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) && ( ! (GXutil.strcmp("", AV66Tcatsuswwds_10_tfthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TheList) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TheList = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08O85( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Tcatsuswwds_1_filterfulltext ,
                                          String AV59Tcatsuswwds_3_tfemprcod_sel ,
                                          String AV58Tcatsuswwds_2_tfemprcod ,
                                          String AV61Tcatsuswwds_5_tfemprnom_sel ,
                                          String AV60Tcatsuswwds_4_tfemprnom ,
                                          String AV63Tcatsuswwds_7_tfprdnum_sel ,
                                          String AV62Tcatsuswwds_6_tfprdnum ,
                                          String AV65Tcatsuswwds_9_tfprdnom_sel ,
                                          String AV64Tcatsuswwds_8_tfprdnom ,
                                          String AV67Tcatsuswwds_11_tfthelist_sel ,
                                          String AV66Tcatsuswwds_10_tfthelist ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A13586TheList )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.TheList, T3.PrdNom, T2.EmprNom FROM ((TXPCATSUS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      if ( ! (GXutil.strcmp("", AV57Tcatsuswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T3.PrdNom) like '%' || UPPER(?)) or ( UPPER(T1.TheList) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Tcatsuswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tcatsuswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Tcatsuswwds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Tcatsuswwds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) && ( ! (GXutil.strcmp("", AV66Tcatsuswwds_10_tfthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TheList) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TheList = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08O86( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Tcatsuswwds_1_filterfulltext ,
                                          String AV59Tcatsuswwds_3_tfemprcod_sel ,
                                          String AV58Tcatsuswwds_2_tfemprcod ,
                                          String AV61Tcatsuswwds_5_tfemprnom_sel ,
                                          String AV60Tcatsuswwds_4_tfemprnom ,
                                          String AV63Tcatsuswwds_7_tfprdnum_sel ,
                                          String AV62Tcatsuswwds_6_tfprdnum ,
                                          String AV65Tcatsuswwds_9_tfprdnom_sel ,
                                          String AV64Tcatsuswwds_8_tfprdnom ,
                                          String AV67Tcatsuswwds_11_tfthelist_sel ,
                                          String AV66Tcatsuswwds_10_tfthelist ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A13586TheList )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[15];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.TheList, T3.PrdNom, T1.PrdNum, T2.EmprNom, T1.EmprCod FROM ((TXPCATSUS T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      if ( ! (GXutil.strcmp("", AV57Tcatsuswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T3.PrdNom) like '%' || UPPER(?)) or ( UPPER(T1.TheList) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Tcatsuswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tcatsuswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Tcatsuswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tcatsuswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV62Tcatsuswwds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tcatsuswwds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Tcatsuswwds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tcatsuswwds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) && ( ! (GXutil.strcmp("", AV66Tcatsuswwds_10_tfthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TheList) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tcatsuswwds_11_tfthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TheList = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.TheList" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P08O82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P08O83(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 2 :
                  return conditional_P08O84(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 3 :
                  return conditional_P08O85(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 4 :
                  return conditional_P08O86(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08O82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08O83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08O84", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08O85", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08O86", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               return;
      }
   }

}

