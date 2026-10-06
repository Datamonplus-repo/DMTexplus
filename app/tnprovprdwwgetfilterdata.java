package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tnprovprdwwgetfilterdata extends GXProcedure
{
   public tnprovprdwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnprovprdwwgetfilterdata.class ), "" );
   }

   public tnprovprdwwgetfilterdata( int remoteHandle ,
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
      tnprovprdwwgetfilterdata.this.aP5 = new String[] {""};
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
      tnprovprdwwgetfilterdata.this.AV20DDOName = aP0;
      tnprovprdwwgetfilterdata.this.AV18SearchTxt = aP1;
      tnprovprdwwgetfilterdata.this.AV19SearchTxtTo = aP2;
      tnprovprdwwgetfilterdata.this.aP3 = aP3;
      tnprovprdwwgetfilterdata.this.aP4 = aP4;
      tnprovprdwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_EMPRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_EMPRNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNOM") == 0 )
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
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("TnPROVPRDWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TnPROVPRDWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("TnPROVPRDWWGridState"), null, null);
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV47FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV12TFEmprNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV13TFEmprNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV14TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV15TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV16TFPrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV17TFPrdNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV18SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV52Tnprovprdwwds_1_filterfulltext = AV47FilterFullText ;
      AV53Tnprovprdwwds_2_tfemprcod = AV10TFEmprCod ;
      AV54Tnprovprdwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV55Tnprovprdwwds_4_tfemprnom = AV12TFEmprNom ;
      AV56Tnprovprdwwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV57Tnprovprdwwds_6_tfprdnum = AV14TFPrdNum ;
      AV58Tnprovprdwwds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV59Tnprovprdwwds_8_tfprdnom = AV16TFPrdNom ;
      AV60Tnprovprdwwds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Tnprovprdwwds_1_filterfulltext ,
                                           AV54Tnprovprdwwds_3_tfemprcod_sel ,
                                           AV53Tnprovprdwwds_2_tfemprcod ,
                                           AV56Tnprovprdwwds_5_tfemprnom_sel ,
                                           AV55Tnprovprdwwds_4_tfemprnom ,
                                           AV58Tnprovprdwwds_7_tfprdnum_sel ,
                                           AV57Tnprovprdwwds_6_tfprdnum ,
                                           AV60Tnprovprdwwds_9_tfprdnom_sel ,
                                           AV59Tnprovprdwwds_8_tfprdnom ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV53Tnprovprdwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV53Tnprovprdwwds_2_tfemprcod), 3, "%") ;
      lV55Tnprovprdwwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV55Tnprovprdwwds_4_tfemprnom), 30, "%") ;
      lV57Tnprovprdwwds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV57Tnprovprdwwds_6_tfprdnum), 6, "%") ;
      lV59Tnprovprdwwds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Tnprovprdwwds_8_tfprdnom), 26, "%") ;
      /* Using cursor P08O02 */
      pr_default.execute(0, new Object[] {lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV53Tnprovprdwwds_2_tfemprcod, AV54Tnprovprdwwds_3_tfemprcod_sel, lV55Tnprovprdwwds_4_tfemprnom, AV56Tnprovprdwwds_5_tfemprnom_sel, lV57Tnprovprdwwds_6_tfprdnum, AV58Tnprovprdwwds_7_tfprdnum_sel, lV59Tnprovprdwwds_8_tfprdnom, AV60Tnprovprdwwds_9_tfprdnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8O02 = false ;
         A396EmprCod = P08O02_A396EmprCod[0] ;
         A718PrdNom = P08O02_A718PrdNom[0] ;
         A719PrdNum = P08O02_A719PrdNum[0] ;
         A407EmprNom = P08O02_A407EmprNom[0] ;
         n407EmprNom = P08O02_n407EmprNom[0] ;
         A407EmprNom = P08O02_A407EmprNom[0] ;
         n407EmprNom = P08O02_n407EmprNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08O02_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8O02 = false ;
            A719PrdNum = P08O02_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8O02 = true ;
            pr_default.readNext(0);
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
         if ( ! brk8O02 )
         {
            brk8O02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV18SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      AV52Tnprovprdwwds_1_filterfulltext = AV47FilterFullText ;
      AV53Tnprovprdwwds_2_tfemprcod = AV10TFEmprCod ;
      AV54Tnprovprdwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV55Tnprovprdwwds_4_tfemprnom = AV12TFEmprNom ;
      AV56Tnprovprdwwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV57Tnprovprdwwds_6_tfprdnum = AV14TFPrdNum ;
      AV58Tnprovprdwwds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV59Tnprovprdwwds_8_tfprdnom = AV16TFPrdNom ;
      AV60Tnprovprdwwds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV52Tnprovprdwwds_1_filterfulltext ,
                                           AV54Tnprovprdwwds_3_tfemprcod_sel ,
                                           AV53Tnprovprdwwds_2_tfemprcod ,
                                           AV56Tnprovprdwwds_5_tfemprnom_sel ,
                                           AV55Tnprovprdwwds_4_tfemprnom ,
                                           AV58Tnprovprdwwds_7_tfprdnum_sel ,
                                           AV57Tnprovprdwwds_6_tfprdnum ,
                                           AV60Tnprovprdwwds_9_tfprdnom_sel ,
                                           AV59Tnprovprdwwds_8_tfprdnom ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV53Tnprovprdwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV53Tnprovprdwwds_2_tfemprcod), 3, "%") ;
      lV55Tnprovprdwwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV55Tnprovprdwwds_4_tfemprnom), 30, "%") ;
      lV57Tnprovprdwwds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV57Tnprovprdwwds_6_tfprdnum), 6, "%") ;
      lV59Tnprovprdwwds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Tnprovprdwwds_8_tfprdnom), 26, "%") ;
      /* Using cursor P08O03 */
      pr_default.execute(1, new Object[] {lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV53Tnprovprdwwds_2_tfemprcod, AV54Tnprovprdwwds_3_tfemprcod_sel, lV55Tnprovprdwwds_4_tfemprnom, AV56Tnprovprdwwds_5_tfemprnom_sel, lV57Tnprovprdwwds_6_tfprdnum, AV58Tnprovprdwwds_7_tfprdnum_sel, lV59Tnprovprdwwds_8_tfprdnom, AV60Tnprovprdwwds_9_tfprdnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8O04 = false ;
         A407EmprNom = P08O03_A407EmprNom[0] ;
         n407EmprNom = P08O03_n407EmprNom[0] ;
         A718PrdNom = P08O03_A718PrdNom[0] ;
         A719PrdNum = P08O03_A719PrdNum[0] ;
         A396EmprCod = P08O03_A396EmprCod[0] ;
         A407EmprNom = P08O03_A407EmprNom[0] ;
         n407EmprNom = P08O03_n407EmprNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08O03_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk8O04 = false ;
            A719PrdNum = P08O03_A719PrdNum[0] ;
            A396EmprCod = P08O03_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8O04 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV22Option = A407EmprNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8O04 )
         {
            brk8O04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNum = AV18SearchTxt ;
      AV15TFPrdNum_Sel = "" ;
      AV52Tnprovprdwwds_1_filterfulltext = AV47FilterFullText ;
      AV53Tnprovprdwwds_2_tfemprcod = AV10TFEmprCod ;
      AV54Tnprovprdwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV55Tnprovprdwwds_4_tfemprnom = AV12TFEmprNom ;
      AV56Tnprovprdwwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV57Tnprovprdwwds_6_tfprdnum = AV14TFPrdNum ;
      AV58Tnprovprdwwds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV59Tnprovprdwwds_8_tfprdnom = AV16TFPrdNom ;
      AV60Tnprovprdwwds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV52Tnprovprdwwds_1_filterfulltext ,
                                           AV54Tnprovprdwwds_3_tfemprcod_sel ,
                                           AV53Tnprovprdwwds_2_tfemprcod ,
                                           AV56Tnprovprdwwds_5_tfemprnom_sel ,
                                           AV55Tnprovprdwwds_4_tfemprnom ,
                                           AV58Tnprovprdwwds_7_tfprdnum_sel ,
                                           AV57Tnprovprdwwds_6_tfprdnum ,
                                           AV60Tnprovprdwwds_9_tfprdnom_sel ,
                                           AV59Tnprovprdwwds_8_tfprdnom ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV53Tnprovprdwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV53Tnprovprdwwds_2_tfemprcod), 3, "%") ;
      lV55Tnprovprdwwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV55Tnprovprdwwds_4_tfemprnom), 30, "%") ;
      lV57Tnprovprdwwds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV57Tnprovprdwwds_6_tfprdnum), 6, "%") ;
      lV59Tnprovprdwwds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Tnprovprdwwds_8_tfprdnom), 26, "%") ;
      /* Using cursor P08O04 */
      pr_default.execute(2, new Object[] {lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV53Tnprovprdwwds_2_tfemprcod, AV54Tnprovprdwwds_3_tfemprcod_sel, lV55Tnprovprdwwds_4_tfemprnom, AV56Tnprovprdwwds_5_tfemprnom_sel, lV57Tnprovprdwwds_6_tfprdnum, AV58Tnprovprdwwds_7_tfprdnum_sel, lV59Tnprovprdwwds_8_tfprdnom, AV60Tnprovprdwwds_9_tfprdnom_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8O06 = false ;
         A719PrdNum = P08O04_A719PrdNum[0] ;
         A718PrdNom = P08O04_A718PrdNom[0] ;
         A407EmprNom = P08O04_A407EmprNom[0] ;
         n407EmprNom = P08O04_n407EmprNom[0] ;
         A396EmprCod = P08O04_A396EmprCod[0] ;
         A407EmprNom = P08O04_A407EmprNom[0] ;
         n407EmprNom = P08O04_n407EmprNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08O04_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8O06 = false ;
            A396EmprCod = P08O04_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8O06 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV22Option = A719PrdNum ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8O06 )
         {
            brk8O06 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdNom = AV18SearchTxt ;
      AV17TFPrdNom_Sel = "" ;
      AV52Tnprovprdwwds_1_filterfulltext = AV47FilterFullText ;
      AV53Tnprovprdwwds_2_tfemprcod = AV10TFEmprCod ;
      AV54Tnprovprdwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV55Tnprovprdwwds_4_tfemprnom = AV12TFEmprNom ;
      AV56Tnprovprdwwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV57Tnprovprdwwds_6_tfprdnum = AV14TFPrdNum ;
      AV58Tnprovprdwwds_7_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV59Tnprovprdwwds_8_tfprdnom = AV16TFPrdNom ;
      AV60Tnprovprdwwds_9_tfprdnom_sel = AV17TFPrdNom_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV52Tnprovprdwwds_1_filterfulltext ,
                                           AV54Tnprovprdwwds_3_tfemprcod_sel ,
                                           AV53Tnprovprdwwds_2_tfemprcod ,
                                           AV56Tnprovprdwwds_5_tfemprnom_sel ,
                                           AV55Tnprovprdwwds_4_tfemprnom ,
                                           AV58Tnprovprdwwds_7_tfprdnum_sel ,
                                           AV57Tnprovprdwwds_6_tfprdnum ,
                                           AV60Tnprovprdwwds_9_tfprdnom_sel ,
                                           AV59Tnprovprdwwds_8_tfprdnom ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV52Tnprovprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tnprovprdwwds_1_filterfulltext), "%", "") ;
      lV53Tnprovprdwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV53Tnprovprdwwds_2_tfemprcod), 3, "%") ;
      lV55Tnprovprdwwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV55Tnprovprdwwds_4_tfemprnom), 30, "%") ;
      lV57Tnprovprdwwds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV57Tnprovprdwwds_6_tfprdnum), 6, "%") ;
      lV59Tnprovprdwwds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Tnprovprdwwds_8_tfprdnom), 26, "%") ;
      /* Using cursor P08O05 */
      pr_default.execute(3, new Object[] {lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV52Tnprovprdwwds_1_filterfulltext, lV53Tnprovprdwwds_2_tfemprcod, AV54Tnprovprdwwds_3_tfemprcod_sel, lV55Tnprovprdwwds_4_tfemprnom, AV56Tnprovprdwwds_5_tfemprnom_sel, lV57Tnprovprdwwds_6_tfprdnum, AV58Tnprovprdwwds_7_tfprdnum_sel, lV59Tnprovprdwwds_8_tfprdnom, AV60Tnprovprdwwds_9_tfprdnom_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8O08 = false ;
         A718PrdNom = P08O05_A718PrdNom[0] ;
         A719PrdNum = P08O05_A719PrdNum[0] ;
         A407EmprNom = P08O05_A407EmprNom[0] ;
         n407EmprNom = P08O05_n407EmprNom[0] ;
         A396EmprCod = P08O05_A396EmprCod[0] ;
         A407EmprNom = P08O05_A407EmprNom[0] ;
         n407EmprNom = P08O05_n407EmprNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08O05_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8O08 = false ;
            A719PrdNum = P08O05_A719PrdNum[0] ;
            A396EmprCod = P08O05_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8O08 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV22Option = A718PrdNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8O08 )
         {
            brk8O08 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tnprovprdwwgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = tnprovprdwwgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = tnprovprdwwgetfilterdata.this.AV29OptionIndexesJson;
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
      AV47FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFEmprNom = "" ;
      AV13TFEmprNom_Sel = "" ;
      AV14TFPrdNum = "" ;
      AV15TFPrdNum_Sel = "" ;
      AV16TFPrdNom = "" ;
      AV17TFPrdNom_Sel = "" ;
      A396EmprCod = "" ;
      AV52Tnprovprdwwds_1_filterfulltext = "" ;
      AV53Tnprovprdwwds_2_tfemprcod = "" ;
      AV54Tnprovprdwwds_3_tfemprcod_sel = "" ;
      AV55Tnprovprdwwds_4_tfemprnom = "" ;
      AV56Tnprovprdwwds_5_tfemprnom_sel = "" ;
      AV57Tnprovprdwwds_6_tfprdnum = "" ;
      AV58Tnprovprdwwds_7_tfprdnum_sel = "" ;
      AV59Tnprovprdwwds_8_tfprdnom = "" ;
      AV60Tnprovprdwwds_9_tfprdnom_sel = "" ;
      scmdbuf = "" ;
      lV52Tnprovprdwwds_1_filterfulltext = "" ;
      lV53Tnprovprdwwds_2_tfemprcod = "" ;
      lV55Tnprovprdwwds_4_tfemprnom = "" ;
      lV57Tnprovprdwwds_6_tfprdnum = "" ;
      lV59Tnprovprdwwds_8_tfprdnom = "" ;
      A407EmprNom = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      P08O02_A396EmprCod = new String[] {""} ;
      P08O02_A718PrdNom = new String[] {""} ;
      P08O02_A719PrdNum = new String[] {""} ;
      P08O02_A407EmprNom = new String[] {""} ;
      P08O02_n407EmprNom = new boolean[] {false} ;
      AV22Option = "" ;
      AV25OptionDesc = "" ;
      P08O03_A407EmprNom = new String[] {""} ;
      P08O03_n407EmprNom = new boolean[] {false} ;
      P08O03_A718PrdNom = new String[] {""} ;
      P08O03_A719PrdNum = new String[] {""} ;
      P08O03_A396EmprCod = new String[] {""} ;
      P08O04_A719PrdNum = new String[] {""} ;
      P08O04_A718PrdNom = new String[] {""} ;
      P08O04_A407EmprNom = new String[] {""} ;
      P08O04_n407EmprNom = new boolean[] {false} ;
      P08O04_A396EmprCod = new String[] {""} ;
      P08O05_A718PrdNom = new String[] {""} ;
      P08O05_A719PrdNum = new String[] {""} ;
      P08O05_A407EmprNom = new String[] {""} ;
      P08O05_n407EmprNom = new boolean[] {false} ;
      P08O05_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnprovprdwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08O02_A396EmprCod, P08O02_A718PrdNom, P08O02_A719PrdNum, P08O02_A407EmprNom, P08O02_n407EmprNom
            }
            , new Object[] {
            P08O03_A407EmprNom, P08O03_n407EmprNom, P08O03_A718PrdNom, P08O03_A719PrdNum, P08O03_A396EmprCod
            }
            , new Object[] {
            P08O04_A719PrdNum, P08O04_A718PrdNom, P08O04_A407EmprNom, P08O04_n407EmprNom, P08O04_A396EmprCod
            }
            , new Object[] {
            P08O05_A718PrdNom, P08O05_A719PrdNum, P08O05_A407EmprNom, P08O05_n407EmprNom, P08O05_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV50GXV1 ;
   private long AV30count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String AV14TFPrdNum ;
   private String AV15TFPrdNum_Sel ;
   private String AV16TFPrdNom ;
   private String AV17TFPrdNom_Sel ;
   private String A396EmprCod ;
   private String AV53Tnprovprdwwds_2_tfemprcod ;
   private String AV54Tnprovprdwwds_3_tfemprcod_sel ;
   private String AV55Tnprovprdwwds_4_tfemprnom ;
   private String AV56Tnprovprdwwds_5_tfemprnom_sel ;
   private String AV57Tnprovprdwwds_6_tfprdnum ;
   private String AV58Tnprovprdwwds_7_tfprdnum_sel ;
   private String AV59Tnprovprdwwds_8_tfprdnom ;
   private String AV60Tnprovprdwwds_9_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV53Tnprovprdwwds_2_tfemprcod ;
   private String lV55Tnprovprdwwds_4_tfemprnom ;
   private String lV57Tnprovprdwwds_6_tfprdnum ;
   private String lV59Tnprovprdwwds_8_tfprdnom ;
   private String A407EmprNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private boolean returnInSub ;
   private boolean brk8O02 ;
   private boolean n407EmprNom ;
   private boolean brk8O04 ;
   private boolean brk8O06 ;
   private boolean brk8O08 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV47FilterFullText ;
   private String AV52Tnprovprdwwds_1_filterfulltext ;
   private String lV52Tnprovprdwwds_1_filterfulltext ;
   private String AV22Option ;
   private String AV25OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08O02_A396EmprCod ;
   private String[] P08O02_A718PrdNom ;
   private String[] P08O02_A719PrdNum ;
   private String[] P08O02_A407EmprNom ;
   private boolean[] P08O02_n407EmprNom ;
   private String[] P08O03_A407EmprNom ;
   private boolean[] P08O03_n407EmprNom ;
   private String[] P08O03_A718PrdNom ;
   private String[] P08O03_A719PrdNum ;
   private String[] P08O03_A396EmprCod ;
   private String[] P08O04_A719PrdNum ;
   private String[] P08O04_A718PrdNom ;
   private String[] P08O04_A407EmprNom ;
   private boolean[] P08O04_n407EmprNom ;
   private String[] P08O04_A396EmprCod ;
   private String[] P08O05_A718PrdNom ;
   private String[] P08O05_A719PrdNum ;
   private String[] P08O05_A407EmprNom ;
   private boolean[] P08O05_n407EmprNom ;
   private String[] P08O05_A396EmprCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tnprovprdwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08O02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Tnprovprdwwds_1_filterfulltext ,
                                          String AV54Tnprovprdwwds_3_tfemprcod_sel ,
                                          String AV53Tnprovprdwwds_2_tfemprcod ,
                                          String AV56Tnprovprdwwds_5_tfemprnom_sel ,
                                          String AV55Tnprovprdwwds_4_tfemprnom ,
                                          String AV58Tnprovprdwwds_7_tfprdnum_sel ,
                                          String AV57Tnprovprdwwds_6_tfprdnum ,
                                          String AV60Tnprovprdwwds_9_tfprdnom_sel ,
                                          String AV59Tnprovprdwwds_8_tfprdnom ,
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
      if ( ! (GXutil.strcmp("", AV52Tnprovprdwwds_1_filterfulltext)==0) )
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
      if ( (GXutil.strcmp("", AV54Tnprovprdwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV53Tnprovprdwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Tnprovprdwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Tnprovprdwwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Tnprovprdwwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Tnprovprdwwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tnprovprdwwds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV57Tnprovprdwwds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tnprovprdwwds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tnprovprdwwds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Tnprovprdwwds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tnprovprdwwds_9_tfprdnom_sel)==0) )
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

   protected Object[] conditional_P08O03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Tnprovprdwwds_1_filterfulltext ,
                                          String AV54Tnprovprdwwds_3_tfemprcod_sel ,
                                          String AV53Tnprovprdwwds_2_tfemprcod ,
                                          String AV56Tnprovprdwwds_5_tfemprnom_sel ,
                                          String AV55Tnprovprdwwds_4_tfemprnom ,
                                          String AV58Tnprovprdwwds_7_tfprdnum_sel ,
                                          String AV57Tnprovprdwwds_6_tfprdnum ,
                                          String AV60Tnprovprdwwds_9_tfprdnom_sel ,
                                          String AV59Tnprovprdwwds_8_tfprdnom ,
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
      if ( ! (GXutil.strcmp("", AV52Tnprovprdwwds_1_filterfulltext)==0) )
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
      if ( (GXutil.strcmp("", AV54Tnprovprdwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV53Tnprovprdwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Tnprovprdwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Tnprovprdwwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Tnprovprdwwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Tnprovprdwwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tnprovprdwwds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV57Tnprovprdwwds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tnprovprdwwds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tnprovprdwwds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Tnprovprdwwds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tnprovprdwwds_9_tfprdnom_sel)==0) )
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

   protected Object[] conditional_P08O04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Tnprovprdwwds_1_filterfulltext ,
                                          String AV54Tnprovprdwwds_3_tfemprcod_sel ,
                                          String AV53Tnprovprdwwds_2_tfemprcod ,
                                          String AV56Tnprovprdwwds_5_tfemprnom_sel ,
                                          String AV55Tnprovprdwwds_4_tfemprnom ,
                                          String AV58Tnprovprdwwds_7_tfprdnum_sel ,
                                          String AV57Tnprovprdwwds_6_tfprdnum ,
                                          String AV60Tnprovprdwwds_9_tfprdnom_sel ,
                                          String AV59Tnprovprdwwds_8_tfprdnom ,
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
      if ( ! (GXutil.strcmp("", AV52Tnprovprdwwds_1_filterfulltext)==0) )
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
      if ( (GXutil.strcmp("", AV54Tnprovprdwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV53Tnprovprdwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Tnprovprdwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Tnprovprdwwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Tnprovprdwwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Tnprovprdwwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tnprovprdwwds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV57Tnprovprdwwds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tnprovprdwwds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tnprovprdwwds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Tnprovprdwwds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tnprovprdwwds_9_tfprdnom_sel)==0) )
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

   protected Object[] conditional_P08O05( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Tnprovprdwwds_1_filterfulltext ,
                                          String AV54Tnprovprdwwds_3_tfemprcod_sel ,
                                          String AV53Tnprovprdwwds_2_tfemprcod ,
                                          String AV56Tnprovprdwwds_5_tfemprnom_sel ,
                                          String AV55Tnprovprdwwds_4_tfemprnom ,
                                          String AV58Tnprovprdwwds_7_tfprdnum_sel ,
                                          String AV57Tnprovprdwwds_6_tfprdnum ,
                                          String AV60Tnprovprdwwds_9_tfprdnom_sel ,
                                          String AV59Tnprovprdwwds_8_tfprdnom ,
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
      if ( ! (GXutil.strcmp("", AV52Tnprovprdwwds_1_filterfulltext)==0) )
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
      if ( (GXutil.strcmp("", AV54Tnprovprdwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV53Tnprovprdwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Tnprovprdwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Tnprovprdwwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Tnprovprdwwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Tnprovprdwwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tnprovprdwwds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV57Tnprovprdwwds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tnprovprdwwds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tnprovprdwwds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Tnprovprdwwds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tnprovprdwwds_9_tfprdnom_sel)==0) )
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
                  return conditional_P08O02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P08O03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P08O04(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 3 :
                  return conditional_P08O05(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08O02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08O03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08O04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08O05", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

