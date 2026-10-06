package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcdupfasesgetfilterdata extends GXProcedure
{
   public wcdupfasesgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdupfasesgetfilterdata.class ), "" );
   }

   public wcdupfasesgetfilterdata( int remoteHandle ,
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
      wcdupfasesgetfilterdata.this.aP5 = new String[] {""};
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
      wcdupfasesgetfilterdata.this.AV20DDOName = aP0;
      wcdupfasesgetfilterdata.this.AV18SearchTxt = aP1;
      wcdupfasesgetfilterdata.this.AV19SearchTxtTo = aP2;
      wcdupfasesgetfilterdata.this.aP3 = aP3;
      wcdupfasesgetfilterdata.this.aP4 = aP4;
      wcdupfasesgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MAQFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQFDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MAQFFIND") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQFFINDOPTIONS' */
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
      if ( GXutil.strcmp(AV31Session.getValue("WCDupFasesGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDupFasesGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WCDupFasesGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV49FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFDSC") == 0 )
         {
            AV16TFMaqFDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFDSC_SEL") == 0 )
         {
            AV17TFMaqFDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFFIND") == 0 )
         {
            AV50TFMaqFFind = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFFIND_SEL") == 0 )
         {
            AV51TFMaqFFind_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47EmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV48MaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqFDsc = AV18SearchTxt ;
      AV17TFMaqFDsc_Sel = "" ;
      AV57Wcdupfasesds_1_filterfulltext = AV49FilterFullText ;
      AV58Wcdupfasesds_2_tfmaqfdsc = AV16TFMaqFDsc ;
      AV59Wcdupfasesds_3_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      AV60Wcdupfasesds_4_tfmaqffind = AV50TFMaqFFind ;
      AV61Wcdupfasesds_5_tfmaqffind_sel = AV51TFMaqFFind_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Wcdupfasesds_3_tfmaqfdsc_sel ,
                                           AV58Wcdupfasesds_2_tfmaqfdsc ,
                                           A1143MaqFDsc ,
                                           AV57Wcdupfasesds_1_filterfulltext ,
                                           A1144MaqFFind ,
                                           AV61Wcdupfasesds_5_tfmaqffind_sel ,
                                           AV60Wcdupfasesds_4_tfmaqffind ,
                                           A396EmprCod ,
                                           AV47EmprCod ,
                                           A602MaqCod ,
                                           AV48MaqCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Wcdupfasesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcdupfasesds_1_filterfulltext), "%", "") ;
      lV57Wcdupfasesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcdupfasesds_1_filterfulltext), "%", "") ;
      lV60Wcdupfasesds_4_tfmaqffind = GXutil.padr( GXutil.rtrim( AV60Wcdupfasesds_4_tfmaqffind), 8, "%") ;
      lV58Wcdupfasesds_2_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV58Wcdupfasesds_2_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08CR2 */
      pr_default.execute(0, new Object[] {AV57Wcdupfasesds_1_filterfulltext, lV57Wcdupfasesds_1_filterfulltext, lV57Wcdupfasesds_1_filterfulltext, AV61Wcdupfasesds_5_tfmaqffind_sel, AV60Wcdupfasesds_4_tfmaqffind, lV60Wcdupfasesds_4_tfmaqffind, AV61Wcdupfasesds_5_tfmaqffind_sel, AV61Wcdupfasesds_5_tfmaqffind_sel, AV47EmprCod, AV48MaqCod, lV58Wcdupfasesds_2_tfmaqfdsc, AV59Wcdupfasesds_3_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8CR2 = false ;
         A1142MaqFCod = P08CR2_A1142MaqFCod[0] ;
         A396EmprCod = P08CR2_A396EmprCod[0] ;
         A602MaqCod = P08CR2_A602MaqCod[0] ;
         A1143MaqFDsc = P08CR2_A1143MaqFDsc[0] ;
         A1144MaqFFind = P08CR2_A1144MaqFFind[0] ;
         n1144MaqFFind = P08CR2_n1144MaqFFind[0] ;
         A1144MaqFFind = P08CR2_A1144MaqFFind[0] ;
         n1144MaqFFind = P08CR2_n1144MaqFFind[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08CR2_A1143MaqFDsc[0], A1143MaqFDsc) == 0 ) )
         {
            brk8CR2 = false ;
            A1142MaqFCod = P08CR2_A1142MaqFCod[0] ;
            A396EmprCod = P08CR2_A396EmprCod[0] ;
            A602MaqCod = P08CR2_A602MaqCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8CR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1143MaqFDsc)==0) )
         {
            AV22Option = A1143MaqFDsc ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8CR2 )
         {
            brk8CR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQFFINDOPTIONS' Routine */
      returnInSub = false ;
      AV50TFMaqFFind = AV18SearchTxt ;
      AV51TFMaqFFind_Sel = "" ;
      AV57Wcdupfasesds_1_filterfulltext = AV49FilterFullText ;
      AV58Wcdupfasesds_2_tfmaqfdsc = AV16TFMaqFDsc ;
      AV59Wcdupfasesds_3_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      AV60Wcdupfasesds_4_tfmaqffind = AV50TFMaqFFind ;
      AV61Wcdupfasesds_5_tfmaqffind_sel = AV51TFMaqFFind_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV59Wcdupfasesds_3_tfmaqfdsc_sel ,
                                           AV58Wcdupfasesds_2_tfmaqfdsc ,
                                           A1143MaqFDsc ,
                                           AV57Wcdupfasesds_1_filterfulltext ,
                                           A1144MaqFFind ,
                                           AV61Wcdupfasesds_5_tfmaqffind_sel ,
                                           AV60Wcdupfasesds_4_tfmaqffind ,
                                           AV47EmprCod ,
                                           AV48MaqCod ,
                                           A396EmprCod ,
                                           A602MaqCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Wcdupfasesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcdupfasesds_1_filterfulltext), "%", "") ;
      lV57Wcdupfasesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Wcdupfasesds_1_filterfulltext), "%", "") ;
      lV60Wcdupfasesds_4_tfmaqffind = GXutil.padr( GXutil.rtrim( AV60Wcdupfasesds_4_tfmaqffind), 8, "%") ;
      lV58Wcdupfasesds_2_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV58Wcdupfasesds_2_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08CR3 */
      pr_default.execute(1, new Object[] {AV47EmprCod, AV48MaqCod, AV57Wcdupfasesds_1_filterfulltext, lV57Wcdupfasesds_1_filterfulltext, lV57Wcdupfasesds_1_filterfulltext, AV61Wcdupfasesds_5_tfmaqffind_sel, AV60Wcdupfasesds_4_tfmaqffind, lV60Wcdupfasesds_4_tfmaqffind, AV61Wcdupfasesds_5_tfmaqffind_sel, AV61Wcdupfasesds_5_tfmaqffind_sel, lV58Wcdupfasesds_2_tfmaqfdsc, AV59Wcdupfasesds_3_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1142MaqFCod = P08CR3_A1142MaqFCod[0] ;
         A602MaqCod = P08CR3_A602MaqCod[0] ;
         A396EmprCod = P08CR3_A396EmprCod[0] ;
         A1143MaqFDsc = P08CR3_A1143MaqFDsc[0] ;
         A1144MaqFFind = P08CR3_A1144MaqFFind[0] ;
         n1144MaqFFind = P08CR3_n1144MaqFFind[0] ;
         A1144MaqFFind = P08CR3_A1144MaqFFind[0] ;
         n1144MaqFFind = P08CR3_n1144MaqFFind[0] ;
         if ( ! (GXutil.strcmp("", A1144MaqFFind)==0) )
         {
            AV22Option = A1144MaqFFind ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            if ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) == 0 ) )
            {
               AV30count = GXutil.lval( (String)AV28OptionIndexes.elementAt(-1+AV21InsertIndex)) ;
               AV30count = (long)(AV30count+1) ;
               AV28OptionIndexes.removeItem(AV21InsertIndex);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
            }
            else
            {
               AV23Options.add(AV22Option, AV21InsertIndex);
               AV28OptionIndexes.add("1", AV21InsertIndex);
            }
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcdupfasesgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = wcdupfasesgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = wcdupfasesgetfilterdata.this.AV29OptionIndexesJson;
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
      AV49FilterFullText = "" ;
      AV16TFMaqFDsc = "" ;
      AV17TFMaqFDsc_Sel = "" ;
      AV50TFMaqFFind = "" ;
      AV51TFMaqFFind_Sel = "" ;
      AV47EmprCod = "" ;
      AV48MaqCod = "" ;
      A1143MaqFDsc = "" ;
      AV57Wcdupfasesds_1_filterfulltext = "" ;
      AV58Wcdupfasesds_2_tfmaqfdsc = "" ;
      AV59Wcdupfasesds_3_tfmaqfdsc_sel = "" ;
      AV60Wcdupfasesds_4_tfmaqffind = "" ;
      AV61Wcdupfasesds_5_tfmaqffind_sel = "" ;
      lV57Wcdupfasesds_1_filterfulltext = "" ;
      lV60Wcdupfasesds_4_tfmaqffind = "" ;
      scmdbuf = "" ;
      lV58Wcdupfasesds_2_tfmaqfdsc = "" ;
      A1144MaqFFind = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P08CR2_A457FasCod = new String[] {""} ;
      P08CR2_A1142MaqFCod = new String[] {""} ;
      P08CR2_A396EmprCod = new String[] {""} ;
      P08CR2_A602MaqCod = new String[] {""} ;
      P08CR2_A1143MaqFDsc = new String[] {""} ;
      P08CR2_A1144MaqFFind = new String[] {""} ;
      P08CR2_n1144MaqFFind = new boolean[] {false} ;
      A1142MaqFCod = "" ;
      AV22Option = "" ;
      P08CR3_A457FasCod = new String[] {""} ;
      P08CR3_A1142MaqFCod = new String[] {""} ;
      P08CR3_A602MaqCod = new String[] {""} ;
      P08CR3_A396EmprCod = new String[] {""} ;
      P08CR3_A1143MaqFDsc = new String[] {""} ;
      P08CR3_A1144MaqFFind = new String[] {""} ;
      P08CR3_n1144MaqFFind = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdupfasesgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08CR2_A457FasCod, P08CR2_A1142MaqFCod, P08CR2_A396EmprCod, P08CR2_A602MaqCod, P08CR2_A1143MaqFDsc, P08CR2_A1144MaqFFind, P08CR2_n1144MaqFFind
            }
            , new Object[] {
            P08CR3_A457FasCod, P08CR3_A1142MaqFCod, P08CR3_A602MaqCod, P08CR3_A396EmprCod, P08CR3_A1143MaqFDsc, P08CR3_A1144MaqFFind, P08CR3_n1144MaqFFind
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV21InsertIndex ;
   private long AV30count ;
   private String AV16TFMaqFDsc ;
   private String AV17TFMaqFDsc_Sel ;
   private String AV50TFMaqFFind ;
   private String AV51TFMaqFFind_Sel ;
   private String AV47EmprCod ;
   private String AV48MaqCod ;
   private String A1143MaqFDsc ;
   private String AV58Wcdupfasesds_2_tfmaqfdsc ;
   private String AV59Wcdupfasesds_3_tfmaqfdsc_sel ;
   private String AV60Wcdupfasesds_4_tfmaqffind ;
   private String AV61Wcdupfasesds_5_tfmaqffind_sel ;
   private String lV60Wcdupfasesds_4_tfmaqffind ;
   private String scmdbuf ;
   private String lV58Wcdupfasesds_2_tfmaqfdsc ;
   private String A1144MaqFFind ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A1142MaqFCod ;
   private boolean returnInSub ;
   private boolean brk8CR2 ;
   private boolean n1144MaqFFind ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV49FilterFullText ;
   private String AV57Wcdupfasesds_1_filterfulltext ;
   private String lV57Wcdupfasesds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08CR2_A457FasCod ;
   private String[] P08CR2_A1142MaqFCod ;
   private String[] P08CR2_A396EmprCod ;
   private String[] P08CR2_A602MaqCod ;
   private String[] P08CR2_A1143MaqFDsc ;
   private String[] P08CR2_A1144MaqFFind ;
   private boolean[] P08CR2_n1144MaqFFind ;
   private String[] P08CR3_A457FasCod ;
   private String[] P08CR3_A1142MaqFCod ;
   private String[] P08CR3_A602MaqCod ;
   private String[] P08CR3_A396EmprCod ;
   private String[] P08CR3_A1143MaqFDsc ;
   private String[] P08CR3_A1144MaqFFind ;
   private boolean[] P08CR3_n1144MaqFFind ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcdupfasesgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08CR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Wcdupfasesds_3_tfmaqfdsc_sel ,
                                          String AV58Wcdupfasesds_2_tfmaqfdsc ,
                                          String A1143MaqFDsc ,
                                          String AV57Wcdupfasesds_1_filterfulltext ,
                                          String A1144MaqFFind ,
                                          String AV61Wcdupfasesds_5_tfmaqffind_sel ,
                                          String AV60Wcdupfasesds_4_tfmaqffind ,
                                          String A396EmprCod ,
                                          String AV47EmprCod ,
                                          String A602MaqCod ,
                                          String AV48MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T2.FasCod, T1.MaqFCod, T1.EmprCod, T1.MaqCod, T1.MaqFDsc, COALESCE( T2.FasCod, 'xxxxxxxx') AS MaqFFind FROM (TXPMAQFAS T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.MaqFCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)) or ( UPPER(COALESCE( T2.FasCod, 'xxxxxxxx')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.FasCod, 'xxxxxxxx')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.FasCod, 'xxxxxxxx') = ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MaqCod = ?)");
      if ( (GXutil.strcmp("", AV59Wcdupfasesds_3_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcdupfasesds_2_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcdupfasesds_3_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqFDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08CR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Wcdupfasesds_3_tfmaqfdsc_sel ,
                                          String AV58Wcdupfasesds_2_tfmaqfdsc ,
                                          String A1143MaqFDsc ,
                                          String AV57Wcdupfasesds_1_filterfulltext ,
                                          String A1144MaqFFind ,
                                          String AV61Wcdupfasesds_5_tfmaqffind_sel ,
                                          String AV60Wcdupfasesds_4_tfmaqffind ,
                                          String AV47EmprCod ,
                                          String AV48MaqCod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.FasCod, T1.MaqFCod, T1.MaqCod, T1.EmprCod, T1.MaqFDsc, COALESCE( T2.FasCod, 'xxxxxxxx') AS MaqFFind FROM (TXPMAQFAS T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.MaqFCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)) or ( UPPER(COALESCE( T2.FasCod, 'xxxxxxxx')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.FasCod, 'xxxxxxxx')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.FasCod, 'xxxxxxxx') = ?))");
      if ( (GXutil.strcmp("", AV59Wcdupfasesds_3_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcdupfasesds_2_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcdupfasesds_3_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
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
                  return conditional_P08CR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] );
            case 1 :
                  return conditional_P08CR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08CR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 28);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 28);
               }
               return;
      }
   }

}

