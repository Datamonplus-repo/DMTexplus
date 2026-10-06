package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfasobswwgetfilterdata extends GXProcedure
{
   public tfasobswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasobswwgetfilterdata.class ), "" );
   }

   public tfasobswwgetfilterdata( int remoteHandle ,
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
      tfasobswwgetfilterdata.this.aP5 = new String[] {""};
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
      tfasobswwgetfilterdata.this.AV30DDOName = aP0;
      tfasobswwgetfilterdata.this.AV31SearchTxt = aP1;
      tfasobswwgetfilterdata.this.AV32SearchTxtTo = aP2;
      tfasobswwgetfilterdata.this.aP3 = aP3;
      tfasobswwgetfilterdata.this.aP4 = aP4;
      tfasobswwgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S131 ();
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
         S141 ();
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
      if ( GXutil.strcmp(AV25Session.getValue("TFASOBSWWGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TFASOBSWWGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("TFASOBSWWGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
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
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV14TFEmprNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV15TFEmprNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV31SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV45Tfasobswwds_1_filterfulltext = AV36FilterFullText ;
      AV46Tfasobswwds_2_tfemprcod = AV10TFEmprCod ;
      AV47Tfasobswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV48Tfasobswwds_4_tffascod = AV12TFFasCod ;
      AV49Tfasobswwds_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV50Tfasobswwds_6_tfemprnom = AV14TFEmprNom ;
      AV51Tfasobswwds_7_tfemprnom_sel = AV15TFEmprNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV45Tfasobswwds_1_filterfulltext ,
                                           AV47Tfasobswwds_3_tfemprcod_sel ,
                                           AV46Tfasobswwds_2_tfemprcod ,
                                           AV49Tfasobswwds_5_tffascod_sel ,
                                           AV48Tfasobswwds_4_tffascod ,
                                           AV51Tfasobswwds_7_tfemprnom_sel ,
                                           AV50Tfasobswwds_6_tfemprnom ,
                                           A396EmprCod ,
                                           A457FasCod ,
                                           A407EmprNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV45Tfasobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tfasobswwds_1_filterfulltext), "%", "") ;
      lV45Tfasobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tfasobswwds_1_filterfulltext), "%", "") ;
      lV45Tfasobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tfasobswwds_1_filterfulltext), "%", "") ;
      lV46Tfasobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV46Tfasobswwds_2_tfemprcod), 3, "%") ;
      lV48Tfasobswwds_4_tffascod = GXutil.padr( GXutil.rtrim( AV48Tfasobswwds_4_tffascod), 8, "%") ;
      lV50Tfasobswwds_6_tfemprnom = GXutil.padr( GXutil.rtrim( AV50Tfasobswwds_6_tfemprnom), 30, "%") ;
      /* Using cursor P0A8X2 */
      pr_default.execute(0, new Object[] {lV45Tfasobswwds_1_filterfulltext, lV45Tfasobswwds_1_filterfulltext, lV45Tfasobswwds_1_filterfulltext, lV46Tfasobswwds_2_tfemprcod, AV47Tfasobswwds_3_tfemprcod_sel, lV48Tfasobswwds_4_tffascod, AV49Tfasobswwds_5_tffascod_sel, lV50Tfasobswwds_6_tfemprnom, AV51Tfasobswwds_7_tfemprnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA8X2 = false ;
         A396EmprCod = P0A8X2_A396EmprCod[0] ;
         A407EmprNom = P0A8X2_A407EmprNom[0] ;
         n407EmprNom = P0A8X2_n407EmprNom[0] ;
         A457FasCod = P0A8X2_A457FasCod[0] ;
         A407EmprNom = P0A8X2_A407EmprNom[0] ;
         n407EmprNom = P0A8X2_n407EmprNom[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A8X2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brkA8X2 = false ;
            A457FasCod = P0A8X2_A457FasCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brkA8X2 = true ;
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
         if ( ! brkA8X2 )
         {
            brkA8X2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV31SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV45Tfasobswwds_1_filterfulltext = AV36FilterFullText ;
      AV46Tfasobswwds_2_tfemprcod = AV10TFEmprCod ;
      AV47Tfasobswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV48Tfasobswwds_4_tffascod = AV12TFFasCod ;
      AV49Tfasobswwds_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV50Tfasobswwds_6_tfemprnom = AV14TFEmprNom ;
      AV51Tfasobswwds_7_tfemprnom_sel = AV15TFEmprNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV45Tfasobswwds_1_filterfulltext ,
                                           AV47Tfasobswwds_3_tfemprcod_sel ,
                                           AV46Tfasobswwds_2_tfemprcod ,
                                           AV49Tfasobswwds_5_tffascod_sel ,
                                           AV48Tfasobswwds_4_tffascod ,
                                           AV51Tfasobswwds_7_tfemprnom_sel ,
                                           AV50Tfasobswwds_6_tfemprnom ,
                                           A396EmprCod ,
                                           A457FasCod ,
                                           A407EmprNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV45Tfasobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tfasobswwds_1_filterfulltext), "%", "") ;
      lV45Tfasobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tfasobswwds_1_filterfulltext), "%", "") ;
      lV45Tfasobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tfasobswwds_1_filterfulltext), "%", "") ;
      lV46Tfasobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV46Tfasobswwds_2_tfemprcod), 3, "%") ;
      lV48Tfasobswwds_4_tffascod = GXutil.padr( GXutil.rtrim( AV48Tfasobswwds_4_tffascod), 8, "%") ;
      lV50Tfasobswwds_6_tfemprnom = GXutil.padr( GXutil.rtrim( AV50Tfasobswwds_6_tfemprnom), 30, "%") ;
      /* Using cursor P0A8X3 */
      pr_default.execute(1, new Object[] {lV45Tfasobswwds_1_filterfulltext, lV45Tfasobswwds_1_filterfulltext, lV45Tfasobswwds_1_filterfulltext, lV46Tfasobswwds_2_tfemprcod, AV47Tfasobswwds_3_tfemprcod_sel, lV48Tfasobswwds_4_tffascod, AV49Tfasobswwds_5_tffascod_sel, lV50Tfasobswwds_6_tfemprnom, AV51Tfasobswwds_7_tfemprnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA8X4 = false ;
         A457FasCod = P0A8X3_A457FasCod[0] ;
         A407EmprNom = P0A8X3_A407EmprNom[0] ;
         n407EmprNom = P0A8X3_n407EmprNom[0] ;
         A396EmprCod = P0A8X3_A396EmprCod[0] ;
         A407EmprNom = P0A8X3_A407EmprNom[0] ;
         n407EmprNom = P0A8X3_n407EmprNom[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A8X3_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkA8X4 = false ;
            A396EmprCod = P0A8X3_A396EmprCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brkA8X4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV19Option = A457FasCod ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV20Options.add(AV19Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA8X4 )
         {
            brkA8X4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFEmprNom = AV31SearchTxt ;
      AV15TFEmprNom_Sel = "" ;
      AV45Tfasobswwds_1_filterfulltext = AV36FilterFullText ;
      AV46Tfasobswwds_2_tfemprcod = AV10TFEmprCod ;
      AV47Tfasobswwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV48Tfasobswwds_4_tffascod = AV12TFFasCod ;
      AV49Tfasobswwds_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV50Tfasobswwds_6_tfemprnom = AV14TFEmprNom ;
      AV51Tfasobswwds_7_tfemprnom_sel = AV15TFEmprNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV45Tfasobswwds_1_filterfulltext ,
                                           AV47Tfasobswwds_3_tfemprcod_sel ,
                                           AV46Tfasobswwds_2_tfemprcod ,
                                           AV49Tfasobswwds_5_tffascod_sel ,
                                           AV48Tfasobswwds_4_tffascod ,
                                           AV51Tfasobswwds_7_tfemprnom_sel ,
                                           AV50Tfasobswwds_6_tfemprnom ,
                                           A396EmprCod ,
                                           A457FasCod ,
                                           A407EmprNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV45Tfasobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tfasobswwds_1_filterfulltext), "%", "") ;
      lV45Tfasobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tfasobswwds_1_filterfulltext), "%", "") ;
      lV45Tfasobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tfasobswwds_1_filterfulltext), "%", "") ;
      lV46Tfasobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV46Tfasobswwds_2_tfemprcod), 3, "%") ;
      lV48Tfasobswwds_4_tffascod = GXutil.padr( GXutil.rtrim( AV48Tfasobswwds_4_tffascod), 8, "%") ;
      lV50Tfasobswwds_6_tfemprnom = GXutil.padr( GXutil.rtrim( AV50Tfasobswwds_6_tfemprnom), 30, "%") ;
      /* Using cursor P0A8X4 */
      pr_default.execute(2, new Object[] {lV45Tfasobswwds_1_filterfulltext, lV45Tfasobswwds_1_filterfulltext, lV45Tfasobswwds_1_filterfulltext, lV46Tfasobswwds_2_tfemprcod, AV47Tfasobswwds_3_tfemprcod_sel, lV48Tfasobswwds_4_tffascod, AV49Tfasobswwds_5_tffascod_sel, lV50Tfasobswwds_6_tfemprnom, AV51Tfasobswwds_7_tfemprnom_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA8X6 = false ;
         A407EmprNom = P0A8X4_A407EmprNom[0] ;
         n407EmprNom = P0A8X4_n407EmprNom[0] ;
         A457FasCod = P0A8X4_A457FasCod[0] ;
         A396EmprCod = P0A8X4_A396EmprCod[0] ;
         A407EmprNom = P0A8X4_A407EmprNom[0] ;
         n407EmprNom = P0A8X4_n407EmprNom[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A8X4_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brkA8X6 = false ;
            A457FasCod = P0A8X4_A457FasCod[0] ;
            A396EmprCod = P0A8X4_A396EmprCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brkA8X6 = true ;
            pr_default.readNext(2);
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
         if ( ! brkA8X6 )
         {
            brkA8X6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tfasobswwgetfilterdata.this.AV33OptionsJson;
      this.aP4[0] = tfasobswwgetfilterdata.this.AV34OptionsDescJson;
      this.aP5[0] = tfasobswwgetfilterdata.this.AV35OptionIndexesJson;
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
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFEmprNom = "" ;
      AV15TFEmprNom_Sel = "" ;
      A396EmprCod = "" ;
      AV45Tfasobswwds_1_filterfulltext = "" ;
      AV46Tfasobswwds_2_tfemprcod = "" ;
      AV47Tfasobswwds_3_tfemprcod_sel = "" ;
      AV48Tfasobswwds_4_tffascod = "" ;
      AV49Tfasobswwds_5_tffascod_sel = "" ;
      AV50Tfasobswwds_6_tfemprnom = "" ;
      AV51Tfasobswwds_7_tfemprnom_sel = "" ;
      scmdbuf = "" ;
      lV45Tfasobswwds_1_filterfulltext = "" ;
      lV46Tfasobswwds_2_tfemprcod = "" ;
      lV48Tfasobswwds_4_tffascod = "" ;
      lV50Tfasobswwds_6_tfemprnom = "" ;
      A457FasCod = "" ;
      A407EmprNom = "" ;
      P0A8X2_A396EmprCod = new String[] {""} ;
      P0A8X2_A407EmprNom = new String[] {""} ;
      P0A8X2_n407EmprNom = new boolean[] {false} ;
      P0A8X2_A457FasCod = new String[] {""} ;
      AV19Option = "" ;
      AV21OptionDesc = "" ;
      P0A8X3_A457FasCod = new String[] {""} ;
      P0A8X3_A407EmprNom = new String[] {""} ;
      P0A8X3_n407EmprNom = new boolean[] {false} ;
      P0A8X3_A396EmprCod = new String[] {""} ;
      P0A8X4_A407EmprNom = new String[] {""} ;
      P0A8X4_n407EmprNom = new boolean[] {false} ;
      P0A8X4_A457FasCod = new String[] {""} ;
      P0A8X4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasobswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A8X2_A396EmprCod, P0A8X2_A407EmprNom, P0A8X2_n407EmprNom, P0A8X2_A457FasCod
            }
            , new Object[] {
            P0A8X3_A457FasCod, P0A8X3_A407EmprNom, P0A8X3_n407EmprNom, P0A8X3_A396EmprCod
            }
            , new Object[] {
            P0A8X4_A407EmprNom, P0A8X4_n407EmprNom, P0A8X4_A457FasCod, P0A8X4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV43GXV1 ;
   private long AV24count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFEmprNom ;
   private String AV15TFEmprNom_Sel ;
   private String A396EmprCod ;
   private String AV46Tfasobswwds_2_tfemprcod ;
   private String AV47Tfasobswwds_3_tfemprcod_sel ;
   private String AV48Tfasobswwds_4_tffascod ;
   private String AV49Tfasobswwds_5_tffascod_sel ;
   private String AV50Tfasobswwds_6_tfemprnom ;
   private String AV51Tfasobswwds_7_tfemprnom_sel ;
   private String scmdbuf ;
   private String lV46Tfasobswwds_2_tfemprcod ;
   private String lV48Tfasobswwds_4_tffascod ;
   private String lV50Tfasobswwds_6_tfemprnom ;
   private String A457FasCod ;
   private String A407EmprNom ;
   private boolean returnInSub ;
   private boolean brkA8X2 ;
   private boolean n407EmprNom ;
   private boolean brkA8X4 ;
   private boolean brkA8X6 ;
   private String AV33OptionsJson ;
   private String AV34OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV31SearchTxt ;
   private String AV32SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV45Tfasobswwds_1_filterfulltext ;
   private String lV45Tfasobswwds_1_filterfulltext ;
   private String AV19Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A8X2_A396EmprCod ;
   private String[] P0A8X2_A407EmprNom ;
   private boolean[] P0A8X2_n407EmprNom ;
   private String[] P0A8X2_A457FasCod ;
   private String[] P0A8X3_A457FasCod ;
   private String[] P0A8X3_A407EmprNom ;
   private boolean[] P0A8X3_n407EmprNom ;
   private String[] P0A8X3_A396EmprCod ;
   private String[] P0A8X4_A407EmprNom ;
   private boolean[] P0A8X4_n407EmprNom ;
   private String[] P0A8X4_A457FasCod ;
   private String[] P0A8X4_A396EmprCod ;
   private GXSimpleCollection<String> AV20Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV23OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class tfasobswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A8X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Tfasobswwds_1_filterfulltext ,
                                          String AV47Tfasobswwds_3_tfemprcod_sel ,
                                          String AV46Tfasobswwds_2_tfemprcod ,
                                          String AV49Tfasobswwds_5_tffascod_sel ,
                                          String AV48Tfasobswwds_4_tffascod ,
                                          String AV51Tfasobswwds_7_tfemprnom_sel ,
                                          String AV50Tfasobswwds_6_tfemprnom ,
                                          String A396EmprCod ,
                                          String A457FasCod ,
                                          String A407EmprNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.EmprNom, T1.FasCod FROM (TXPFASPRO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV45Tfasobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Tfasobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV46Tfasobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Tfasobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Tfasobswwds_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV48Tfasobswwds_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Tfasobswwds_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Tfasobswwds_7_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Tfasobswwds_6_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Tfasobswwds_7_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A8X3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Tfasobswwds_1_filterfulltext ,
                                          String AV47Tfasobswwds_3_tfemprcod_sel ,
                                          String AV46Tfasobswwds_2_tfemprcod ,
                                          String AV49Tfasobswwds_5_tffascod_sel ,
                                          String AV48Tfasobswwds_4_tffascod ,
                                          String AV51Tfasobswwds_7_tfemprnom_sel ,
                                          String AV50Tfasobswwds_6_tfemprnom ,
                                          String A396EmprCod ,
                                          String A457FasCod ,
                                          String A407EmprNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.FasCod, T2.EmprNom, T1.EmprCod FROM (TXPFASPRO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV45Tfasobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Tfasobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV46Tfasobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Tfasobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Tfasobswwds_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV48Tfasobswwds_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Tfasobswwds_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Tfasobswwds_7_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Tfasobswwds_6_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Tfasobswwds_7_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A8X4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Tfasobswwds_1_filterfulltext ,
                                          String AV47Tfasobswwds_3_tfemprcod_sel ,
                                          String AV46Tfasobswwds_2_tfemprcod ,
                                          String AV49Tfasobswwds_5_tffascod_sel ,
                                          String AV48Tfasobswwds_4_tffascod ,
                                          String AV51Tfasobswwds_7_tfemprnom_sel ,
                                          String AV50Tfasobswwds_6_tfemprnom ,
                                          String A396EmprCod ,
                                          String A457FasCod ,
                                          String A407EmprNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[9];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T1.FasCod, T1.EmprCod FROM (TXPFASPRO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV45Tfasobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Tfasobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV46Tfasobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Tfasobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Tfasobswwds_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV48Tfasobswwds_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Tfasobswwds_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Tfasobswwds_7_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Tfasobswwds_6_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Tfasobswwds_7_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
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
                  return conditional_P0A8X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P0A8X3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 2 :
                  return conditional_P0A8X4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A8X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8X3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8X4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
      }
   }

}

