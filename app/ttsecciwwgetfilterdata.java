package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttsecciwwgetfilterdata extends GXProcedure
{
   public ttsecciwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttsecciwwgetfilterdata.class ), "" );
   }

   public ttsecciwwgetfilterdata( int remoteHandle ,
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
      ttsecciwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttsecciwwgetfilterdata.this.AV16DDOName = aP0;
      ttsecciwwgetfilterdata.this.AV14SearchTxt = aP1;
      ttsecciwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttsecciwwgetfilterdata.this.aP3 = aP3;
      ttsecciwwgetfilterdata.this.aP4 = aP4;
      ttsecciwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_SECCODF") == 0 )
      {
         /* Execute user subroutine: 'LOADSECCODFOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_SECNOMF") == 0 )
      {
         /* Execute user subroutine: 'LOADSECNOMFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("TTSECCIWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTSECCIWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TTSECCIWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSECCODF") == 0 )
         {
            AV10TFSecCodF = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSECCODF_SEL") == 0 )
         {
            AV11TFSecCodF_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSECNOMF") == 0 )
         {
            AV12TFSecNomF = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSECNOMF_SEL") == 0 )
         {
            AV13TFSecNomF_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSECCODFOPTIONS' Routine */
      returnInSub = false ;
      AV10TFSecCodF = AV14SearchTxt ;
      AV11TFSecCodF_Sel = "" ;
      AV37Ttsecciwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Ttsecciwwds_2_tfseccodf = AV10TFSecCodF ;
      AV39Ttsecciwwds_3_tfseccodf_sel = AV11TFSecCodF_Sel ;
      AV40Ttsecciwwds_4_tfsecnomf = AV12TFSecNomF ;
      AV41Ttsecciwwds_5_tfsecnomf_sel = AV13TFSecNomF_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Ttsecciwwds_1_filterfulltext ,
                                           AV39Ttsecciwwds_3_tfseccodf_sel ,
                                           AV38Ttsecciwwds_2_tfseccodf ,
                                           AV41Ttsecciwwds_5_tfsecnomf_sel ,
                                           AV40Ttsecciwwds_4_tfsecnomf ,
                                           A6162SecCodF ,
                                           A6163SecNomF } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Ttsecciwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ttsecciwwds_1_filterfulltext), "%", "") ;
      lV37Ttsecciwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ttsecciwwds_1_filterfulltext), "%", "") ;
      lV38Ttsecciwwds_2_tfseccodf = GXutil.padr( GXutil.rtrim( AV38Ttsecciwwds_2_tfseccodf), 2, "%") ;
      lV40Ttsecciwwds_4_tfsecnomf = GXutil.padr( GXutil.rtrim( AV40Ttsecciwwds_4_tfsecnomf), 30, "%") ;
      /* Using cursor P08T92 */
      pr_default.execute(0, new Object[] {lV37Ttsecciwwds_1_filterfulltext, lV37Ttsecciwwds_1_filterfulltext, lV38Ttsecciwwds_2_tfseccodf, AV39Ttsecciwwds_3_tfseccodf_sel, lV40Ttsecciwwds_4_tfsecnomf, AV41Ttsecciwwds_5_tfsecnomf_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8T92 = false ;
         A6162SecCodF = P08T92_A6162SecCodF[0] ;
         A6163SecNomF = P08T92_A6163SecNomF[0] ;
         n6163SecNomF = P08T92_n6163SecNomF[0] ;
         A396EmprCod = P08T92_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08T92_A6162SecCodF[0], A6162SecCodF) == 0 ) )
         {
            brk8T92 = false ;
            A396EmprCod = P08T92_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8T92 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A6162SecCodF)==0) )
         {
            AV18Option = A6162SecCodF ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8T92 )
         {
            brk8T92 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADSECNOMFOPTIONS' Routine */
      returnInSub = false ;
      AV12TFSecNomF = AV14SearchTxt ;
      AV13TFSecNomF_Sel = "" ;
      AV37Ttsecciwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Ttsecciwwds_2_tfseccodf = AV10TFSecCodF ;
      AV39Ttsecciwwds_3_tfseccodf_sel = AV11TFSecCodF_Sel ;
      AV40Ttsecciwwds_4_tfsecnomf = AV12TFSecNomF ;
      AV41Ttsecciwwds_5_tfsecnomf_sel = AV13TFSecNomF_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Ttsecciwwds_1_filterfulltext ,
                                           AV39Ttsecciwwds_3_tfseccodf_sel ,
                                           AV38Ttsecciwwds_2_tfseccodf ,
                                           AV41Ttsecciwwds_5_tfsecnomf_sel ,
                                           AV40Ttsecciwwds_4_tfsecnomf ,
                                           A6162SecCodF ,
                                           A6163SecNomF } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Ttsecciwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ttsecciwwds_1_filterfulltext), "%", "") ;
      lV37Ttsecciwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ttsecciwwds_1_filterfulltext), "%", "") ;
      lV38Ttsecciwwds_2_tfseccodf = GXutil.padr( GXutil.rtrim( AV38Ttsecciwwds_2_tfseccodf), 2, "%") ;
      lV40Ttsecciwwds_4_tfsecnomf = GXutil.padr( GXutil.rtrim( AV40Ttsecciwwds_4_tfsecnomf), 30, "%") ;
      /* Using cursor P08T93 */
      pr_default.execute(1, new Object[] {lV37Ttsecciwwds_1_filterfulltext, lV37Ttsecciwwds_1_filterfulltext, lV38Ttsecciwwds_2_tfseccodf, AV39Ttsecciwwds_3_tfseccodf_sel, lV40Ttsecciwwds_4_tfsecnomf, AV41Ttsecciwwds_5_tfsecnomf_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8T94 = false ;
         A6163SecNomF = P08T93_A6163SecNomF[0] ;
         n6163SecNomF = P08T93_n6163SecNomF[0] ;
         A6162SecCodF = P08T93_A6162SecCodF[0] ;
         A396EmprCod = P08T93_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08T93_A6163SecNomF[0], A6163SecNomF) == 0 ) )
         {
            brk8T94 = false ;
            A6162SecCodF = P08T93_A6162SecCodF[0] ;
            A396EmprCod = P08T93_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8T94 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A6163SecNomF)==0) )
         {
            AV18Option = A6163SecNomF ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8T94 )
         {
            brk8T94 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttsecciwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttsecciwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttsecciwwgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFSecCodF = "" ;
      AV11TFSecCodF_Sel = "" ;
      AV12TFSecNomF = "" ;
      AV13TFSecNomF_Sel = "" ;
      A6162SecCodF = "" ;
      AV37Ttsecciwwds_1_filterfulltext = "" ;
      AV38Ttsecciwwds_2_tfseccodf = "" ;
      AV39Ttsecciwwds_3_tfseccodf_sel = "" ;
      AV40Ttsecciwwds_4_tfsecnomf = "" ;
      AV41Ttsecciwwds_5_tfsecnomf_sel = "" ;
      scmdbuf = "" ;
      lV37Ttsecciwwds_1_filterfulltext = "" ;
      lV38Ttsecciwwds_2_tfseccodf = "" ;
      lV40Ttsecciwwds_4_tfsecnomf = "" ;
      A6163SecNomF = "" ;
      P08T92_A6162SecCodF = new String[] {""} ;
      P08T92_A6163SecNomF = new String[] {""} ;
      P08T92_n6163SecNomF = new boolean[] {false} ;
      P08T92_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P08T93_A6163SecNomF = new String[] {""} ;
      P08T93_n6163SecNomF = new boolean[] {false} ;
      P08T93_A6162SecCodF = new String[] {""} ;
      P08T93_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttsecciwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08T92_A6162SecCodF, P08T92_A6163SecNomF, P08T92_n6163SecNomF, P08T92_A396EmprCod
            }
            , new Object[] {
            P08T93_A6163SecNomF, P08T93_n6163SecNomF, P08T93_A6162SecCodF, P08T93_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV10TFSecCodF ;
   private String AV11TFSecCodF_Sel ;
   private String AV12TFSecNomF ;
   private String AV13TFSecNomF_Sel ;
   private String A6162SecCodF ;
   private String AV38Ttsecciwwds_2_tfseccodf ;
   private String AV39Ttsecciwwds_3_tfseccodf_sel ;
   private String AV40Ttsecciwwds_4_tfsecnomf ;
   private String AV41Ttsecciwwds_5_tfsecnomf_sel ;
   private String scmdbuf ;
   private String lV38Ttsecciwwds_2_tfseccodf ;
   private String lV40Ttsecciwwds_4_tfsecnomf ;
   private String A6163SecNomF ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8T92 ;
   private boolean n6163SecNomF ;
   private boolean brk8T94 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Ttsecciwwds_1_filterfulltext ;
   private String lV37Ttsecciwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08T92_A6162SecCodF ;
   private String[] P08T92_A6163SecNomF ;
   private boolean[] P08T92_n6163SecNomF ;
   private String[] P08T92_A396EmprCod ;
   private String[] P08T93_A6163SecNomF ;
   private boolean[] P08T93_n6163SecNomF ;
   private String[] P08T93_A6162SecCodF ;
   private String[] P08T93_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttsecciwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08T92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Ttsecciwwds_1_filterfulltext ,
                                          String AV39Ttsecciwwds_3_tfseccodf_sel ,
                                          String AV38Ttsecciwwds_2_tfseccodf ,
                                          String AV41Ttsecciwwds_5_tfsecnomf_sel ,
                                          String AV40Ttsecciwwds_4_tfsecnomf ,
                                          String A6162SecCodF ,
                                          String A6163SecNomF )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT SecCodF, SecNomF, EmprCod FROM TXPTSECCI" ;
      if ( ! (GXutil.strcmp("", AV37Ttsecciwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SecCodF) like '%' || UPPER(?)) or ( UPPER(SecNomF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Ttsecciwwds_3_tfseccodf_sel)==0) && ( ! (GXutil.strcmp("", AV38Ttsecciwwds_2_tfseccodf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SecCodF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Ttsecciwwds_3_tfseccodf_sel)==0) )
      {
         addWhere(sWhereString, "(SecCodF = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Ttsecciwwds_5_tfsecnomf_sel)==0) && ( ! (GXutil.strcmp("", AV40Ttsecciwwds_4_tfsecnomf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SecNomF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Ttsecciwwds_5_tfsecnomf_sel)==0) )
      {
         addWhere(sWhereString, "(SecNomF = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY SecCodF" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08T93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Ttsecciwwds_1_filterfulltext ,
                                          String AV39Ttsecciwwds_3_tfseccodf_sel ,
                                          String AV38Ttsecciwwds_2_tfseccodf ,
                                          String AV41Ttsecciwwds_5_tfsecnomf_sel ,
                                          String AV40Ttsecciwwds_4_tfsecnomf ,
                                          String A6162SecCodF ,
                                          String A6163SecNomF )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT SecNomF, SecCodF, EmprCod FROM TXPTSECCI" ;
      if ( ! (GXutil.strcmp("", AV37Ttsecciwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SecCodF) like '%' || UPPER(?)) or ( UPPER(SecNomF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Ttsecciwwds_3_tfseccodf_sel)==0) && ( ! (GXutil.strcmp("", AV38Ttsecciwwds_2_tfseccodf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SecCodF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Ttsecciwwds_3_tfseccodf_sel)==0) )
      {
         addWhere(sWhereString, "(SecCodF = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Ttsecciwwds_5_tfsecnomf_sel)==0) && ( ! (GXutil.strcmp("", AV40Ttsecciwwds_4_tfsecnomf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SecNomF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Ttsecciwwds_5_tfsecnomf_sel)==0) )
      {
         addWhere(sWhereString, "(SecNomF = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY SecNomF" ;
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
                  return conditional_P08T92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P08T93(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08T92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08T93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 2);
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
                  stmt.setString(sIdx, (String)parms[8], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
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
                  stmt.setString(sIdx, (String)parms[8], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               return;
      }
   }

}

