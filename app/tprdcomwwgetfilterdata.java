package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprdcomwwgetfilterdata extends GXProcedure
{
   public tprdcomwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprdcomwwgetfilterdata.class ), "" );
   }

   public tprdcomwwgetfilterdata( int remoteHandle ,
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
      tprdcomwwgetfilterdata.this.aP5 = new String[] {""};
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
      tprdcomwwgetfilterdata.this.AV18DDOName = aP0;
      tprdcomwwgetfilterdata.this.AV16SearchTxt = aP1;
      tprdcomwwgetfilterdata.this.AV17SearchTxtTo = aP2;
      tprdcomwwgetfilterdata.this.aP3 = aP3;
      tprdcomwwgetfilterdata.this.aP4 = aP4;
      tprdcomwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("TPRDCOMWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPRDCOMWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("TPRDCOMWWGridState"), null, null);
      }
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV44GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV38TFPrdNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV39TFPrdNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV40TFPrdNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV41TFPrdNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV38TFPrdNum = AV16SearchTxt ;
      AV39TFPrdNum_Sel = "" ;
      AV46Tprdcomwwds_1_filterfulltext = AV34FilterFullText ;
      AV47Tprdcomwwds_2_tfprdnum = AV38TFPrdNum ;
      AV48Tprdcomwwds_3_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV49Tprdcomwwds_4_tfprdnom = AV40TFPrdNom ;
      AV50Tprdcomwwds_5_tfprdnom_sel = AV41TFPrdNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV46Tprdcomwwds_1_filterfulltext ,
                                           AV48Tprdcomwwds_3_tfprdnum_sel ,
                                           AV47Tprdcomwwds_2_tfprdnum ,
                                           AV50Tprdcomwwds_5_tfprdnom_sel ,
                                           AV49Tprdcomwwds_4_tfprdnom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV46Tprdcomwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Tprdcomwwds_1_filterfulltext), "%", "") ;
      lV46Tprdcomwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Tprdcomwwds_1_filterfulltext), "%", "") ;
      lV47Tprdcomwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV47Tprdcomwwds_2_tfprdnum), 6, "%") ;
      lV49Tprdcomwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV49Tprdcomwwds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08N82 */
      pr_default.execute(0, new Object[] {lV46Tprdcomwwds_1_filterfulltext, lV46Tprdcomwwds_1_filterfulltext, lV47Tprdcomwwds_2_tfprdnum, AV48Tprdcomwwds_3_tfprdnum_sel, lV49Tprdcomwwds_4_tfprdnom, AV50Tprdcomwwds_5_tfprdnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8N82 = false ;
         A719PrdNum = P08N82_A719PrdNum[0] ;
         A718PrdNom = P08N82_A718PrdNom[0] ;
         A396EmprCod = P08N82_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08N82_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8N82 = false ;
            A396EmprCod = P08N82_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8N82 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV20Option = A719PrdNum ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8N82 )
         {
            brk8N82 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV40TFPrdNom = AV16SearchTxt ;
      AV41TFPrdNom_Sel = "" ;
      AV46Tprdcomwwds_1_filterfulltext = AV34FilterFullText ;
      AV47Tprdcomwwds_2_tfprdnum = AV38TFPrdNum ;
      AV48Tprdcomwwds_3_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV49Tprdcomwwds_4_tfprdnom = AV40TFPrdNom ;
      AV50Tprdcomwwds_5_tfprdnom_sel = AV41TFPrdNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV46Tprdcomwwds_1_filterfulltext ,
                                           AV48Tprdcomwwds_3_tfprdnum_sel ,
                                           AV47Tprdcomwwds_2_tfprdnum ,
                                           AV50Tprdcomwwds_5_tfprdnom_sel ,
                                           AV49Tprdcomwwds_4_tfprdnom ,
                                           A719PrdNum ,
                                           A718PrdNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV46Tprdcomwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Tprdcomwwds_1_filterfulltext), "%", "") ;
      lV46Tprdcomwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Tprdcomwwds_1_filterfulltext), "%", "") ;
      lV47Tprdcomwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV47Tprdcomwwds_2_tfprdnum), 6, "%") ;
      lV49Tprdcomwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV49Tprdcomwwds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08N83 */
      pr_default.execute(1, new Object[] {lV46Tprdcomwwds_1_filterfulltext, lV46Tprdcomwwds_1_filterfulltext, lV47Tprdcomwwds_2_tfprdnum, AV48Tprdcomwwds_3_tfprdnum_sel, lV49Tprdcomwwds_4_tfprdnom, AV50Tprdcomwwds_5_tfprdnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8N84 = false ;
         A719PrdNum = P08N83_A719PrdNum[0] ;
         A396EmprCod = P08N83_A396EmprCod[0] ;
         A718PrdNom = P08N83_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08N83_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08N83_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8N84 = false ;
            AV28count = (long)(AV28count+1) ;
            brk8N84 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV20Option = A718PrdNom ;
            AV19InsertIndex = 1 ;
            while ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) < 0 ) )
            {
               AV19InsertIndex = (int)(AV19InsertIndex+1) ;
            }
            AV21Options.add(AV20Option, AV19InsertIndex);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV19InsertIndex);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8N84 )
         {
            brk8N84 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprdcomwwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = tprdcomwwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = tprdcomwwgetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34FilterFullText = "" ;
      AV38TFPrdNum = "" ;
      AV39TFPrdNum_Sel = "" ;
      AV40TFPrdNom = "" ;
      AV41TFPrdNom_Sel = "" ;
      A719PrdNum = "" ;
      AV46Tprdcomwwds_1_filterfulltext = "" ;
      AV47Tprdcomwwds_2_tfprdnum = "" ;
      AV48Tprdcomwwds_3_tfprdnum_sel = "" ;
      AV49Tprdcomwwds_4_tfprdnom = "" ;
      AV50Tprdcomwwds_5_tfprdnom_sel = "" ;
      scmdbuf = "" ;
      lV46Tprdcomwwds_1_filterfulltext = "" ;
      lV47Tprdcomwwds_2_tfprdnum = "" ;
      lV49Tprdcomwwds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      P08N82_A719PrdNum = new String[] {""} ;
      P08N82_A718PrdNom = new String[] {""} ;
      P08N82_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      P08N83_A719PrdNum = new String[] {""} ;
      P08N83_A396EmprCod = new String[] {""} ;
      P08N83_A718PrdNom = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprdcomwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08N82_A719PrdNum, P08N82_A718PrdNom, P08N82_A396EmprCod
            }
            , new Object[] {
            P08N83_A719PrdNum, P08N83_A396EmprCod, P08N83_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV44GXV1 ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private String AV38TFPrdNum ;
   private String AV39TFPrdNum_Sel ;
   private String AV40TFPrdNom ;
   private String AV41TFPrdNom_Sel ;
   private String A719PrdNum ;
   private String AV47Tprdcomwwds_2_tfprdnum ;
   private String AV48Tprdcomwwds_3_tfprdnum_sel ;
   private String AV49Tprdcomwwds_4_tfprdnom ;
   private String AV50Tprdcomwwds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV47Tprdcomwwds_2_tfprdnum ;
   private String lV49Tprdcomwwds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8N82 ;
   private boolean brk8N84 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV46Tprdcomwwds_1_filterfulltext ;
   private String lV46Tprdcomwwds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08N82_A719PrdNum ;
   private String[] P08N82_A718PrdNom ;
   private String[] P08N82_A396EmprCod ;
   private String[] P08N83_A719PrdNum ;
   private String[] P08N83_A396EmprCod ;
   private String[] P08N83_A718PrdNom ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class tprdcomwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08N82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Tprdcomwwds_1_filterfulltext ,
                                          String AV48Tprdcomwwds_3_tfprdnum_sel ,
                                          String AV47Tprdcomwwds_2_tfprdnum ,
                                          String AV50Tprdcomwwds_5_tfprdnom_sel ,
                                          String AV49Tprdcomwwds_4_tfprdnom ,
                                          String A719PrdNum ,
                                          String A718PrdNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC" ;
      addWhere(sWhereString, "(SUBSTR(PrdNum, 1, 2) = '00')");
      if ( ! (GXutil.strcmp("", AV46Tprdcomwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Tprdcomwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV47Tprdcomwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Tprdcomwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Tprdcomwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV49Tprdcomwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Tprdcomwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08N83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Tprdcomwwds_1_filterfulltext ,
                                          String AV48Tprdcomwwds_3_tfprdnum_sel ,
                                          String AV47Tprdcomwwds_2_tfprdnum ,
                                          String AV50Tprdcomwwds_5_tfprdnom_sel ,
                                          String AV49Tprdcomwwds_4_tfprdnom ,
                                          String A719PrdNum ,
                                          String A718PrdNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT PrdNum, EmprCod, PrdNom FROM TXPPRODUC" ;
      addWhere(sWhereString, "(SUBSTR(PrdNum, 1, 2) = '00')");
      if ( ! (GXutil.strcmp("", AV46Tprdcomwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Tprdcomwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV47Tprdcomwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Tprdcomwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Tprdcomwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV49Tprdcomwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Tprdcomwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum" ;
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
                  return conditional_P08N82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P08N83(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08N82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08N83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
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
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 26);
               }
               return;
      }
   }

}

