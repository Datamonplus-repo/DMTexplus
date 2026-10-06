package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwinslingetfilterdata extends GXProcedure
{
   public webwinslingetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwinslingetfilterdata.class ), "" );
   }

   public webwinslingetfilterdata( int remoteHandle ,
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
      webwinslingetfilterdata.this.aP5 = new String[] {""};
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
      webwinslingetfilterdata.this.AV18DDOName = aP0;
      webwinslingetfilterdata.this.AV16SearchTxt = aP1;
      webwinslingetfilterdata.this.AV17SearchTxtTo = aP2;
      webwinslingetfilterdata.this.aP3 = aP3;
      webwinslingetfilterdata.this.aP4 = aP4;
      webwinslingetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PROFORCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PROFORDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("WebWINSLINGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWINSLINGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WebWINSLINGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV10TFRecLinPro = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLinPro_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV12TFProForCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV13TFProForCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV14TFProForDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV15TFProForDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForCod = AV16SearchTxt ;
      AV13TFProForCod_Sel = "" ;
      AV39Webwinslinds_1_filterfulltext = AV34FilterFullText ;
      AV40Webwinslinds_2_tfreclinpro = AV10TFRecLinPro ;
      AV41Webwinslinds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV42Webwinslinds_4_tfproforcod = AV12TFProForCod ;
      AV43Webwinslinds_5_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV44Webwinslinds_6_tfprofordsc = AV14TFProForDsc ;
      AV45Webwinslinds_7_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Webwinslinds_1_filterfulltext ,
                                           Byte.valueOf(AV40Webwinslinds_2_tfreclinpro) ,
                                           Byte.valueOf(AV41Webwinslinds_3_tfreclinpro_to) ,
                                           AV43Webwinslinds_5_tfproforcod_sel ,
                                           AV42Webwinslinds_4_tfproforcod ,
                                           AV45Webwinslinds_7_tfprofordsc_sel ,
                                           AV44Webwinslinds_6_tfprofordsc ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV39Webwinslinds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Webwinslinds_1_filterfulltext), "%", "") ;
      lV39Webwinslinds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Webwinslinds_1_filterfulltext), "%", "") ;
      lV39Webwinslinds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Webwinslinds_1_filterfulltext), "%", "") ;
      lV42Webwinslinds_4_tfproforcod = GXutil.padr( GXutil.rtrim( AV42Webwinslinds_4_tfproforcod), 6, "%") ;
      lV44Webwinslinds_6_tfprofordsc = GXutil.padr( GXutil.rtrim( AV44Webwinslinds_6_tfprofordsc), 30, "%") ;
      /* Using cursor P08SM2 */
      pr_default.execute(0, new Object[] {lV39Webwinslinds_1_filterfulltext, lV39Webwinslinds_1_filterfulltext, lV39Webwinslinds_1_filterfulltext, Byte.valueOf(AV40Webwinslinds_2_tfreclinpro), Byte.valueOf(AV41Webwinslinds_3_tfreclinpro_to), lV42Webwinslinds_4_tfproforcod, AV43Webwinslinds_5_tfproforcod_sel, lV44Webwinslinds_6_tfprofordsc, AV45Webwinslinds_7_tfprofordsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8SM2 = false ;
         A396EmprCod = P08SM2_A396EmprCod[0] ;
         A764ProForCod = P08SM2_A764ProForCod[0] ;
         A766ProForDsc = P08SM2_A766ProForDsc[0] ;
         A1273RecLinPro = P08SM2_A1273RecLinPro[0] ;
         A129BarCod = P08SM2_A129BarCod[0] ;
         A132BarCodReo = P08SM2_A132BarCodReo[0] ;
         A130BarCodPar = P08SM2_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SM2_A2804RecLinMaq[0] ;
         A766ProForDsc = P08SM2_A766ProForDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08SM2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk8SM2 = false ;
            A396EmprCod = P08SM2_A396EmprCod[0] ;
            A1273RecLinPro = P08SM2_A1273RecLinPro[0] ;
            A129BarCod = P08SM2_A129BarCod[0] ;
            A132BarCodReo = P08SM2_A132BarCodReo[0] ;
            A130BarCodPar = P08SM2_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SM2_A2804RecLinMaq[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8SM2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV20Option = A764ProForCod ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SM2 )
         {
            brk8SM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProForDsc = AV16SearchTxt ;
      AV15TFProForDsc_Sel = "" ;
      AV39Webwinslinds_1_filterfulltext = AV34FilterFullText ;
      AV40Webwinslinds_2_tfreclinpro = AV10TFRecLinPro ;
      AV41Webwinslinds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV42Webwinslinds_4_tfproforcod = AV12TFProForCod ;
      AV43Webwinslinds_5_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV44Webwinslinds_6_tfprofordsc = AV14TFProForDsc ;
      AV45Webwinslinds_7_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV39Webwinslinds_1_filterfulltext ,
                                           Byte.valueOf(AV40Webwinslinds_2_tfreclinpro) ,
                                           Byte.valueOf(AV41Webwinslinds_3_tfreclinpro_to) ,
                                           AV43Webwinslinds_5_tfproforcod_sel ,
                                           AV42Webwinslinds_4_tfproforcod ,
                                           AV45Webwinslinds_7_tfprofordsc_sel ,
                                           AV44Webwinslinds_6_tfprofordsc ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV39Webwinslinds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Webwinslinds_1_filterfulltext), "%", "") ;
      lV39Webwinslinds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Webwinslinds_1_filterfulltext), "%", "") ;
      lV39Webwinslinds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Webwinslinds_1_filterfulltext), "%", "") ;
      lV42Webwinslinds_4_tfproforcod = GXutil.padr( GXutil.rtrim( AV42Webwinslinds_4_tfproforcod), 6, "%") ;
      lV44Webwinslinds_6_tfprofordsc = GXutil.padr( GXutil.rtrim( AV44Webwinslinds_6_tfprofordsc), 30, "%") ;
      /* Using cursor P08SM3 */
      pr_default.execute(1, new Object[] {lV39Webwinslinds_1_filterfulltext, lV39Webwinslinds_1_filterfulltext, lV39Webwinslinds_1_filterfulltext, Byte.valueOf(AV40Webwinslinds_2_tfreclinpro), Byte.valueOf(AV41Webwinslinds_3_tfreclinpro_to), lV42Webwinslinds_4_tfproforcod, AV43Webwinslinds_5_tfproforcod_sel, lV44Webwinslinds_6_tfprofordsc, AV45Webwinslinds_7_tfprofordsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8SM4 = false ;
         A764ProForCod = P08SM3_A764ProForCod[0] ;
         A396EmprCod = P08SM3_A396EmprCod[0] ;
         A766ProForDsc = P08SM3_A766ProForDsc[0] ;
         A1273RecLinPro = P08SM3_A1273RecLinPro[0] ;
         A129BarCod = P08SM3_A129BarCod[0] ;
         A132BarCodReo = P08SM3_A132BarCodReo[0] ;
         A130BarCodPar = P08SM3_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SM3_A2804RecLinMaq[0] ;
         A766ProForDsc = P08SM3_A766ProForDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08SM3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08SM3_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk8SM4 = false ;
            A1273RecLinPro = P08SM3_A1273RecLinPro[0] ;
            A129BarCod = P08SM3_A129BarCod[0] ;
            A132BarCodReo = P08SM3_A132BarCodReo[0] ;
            A130BarCodPar = P08SM3_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SM3_A2804RecLinMaq[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8SM4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV20Option = A766ProForDsc ;
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
         if ( ! brk8SM4 )
         {
            brk8SM4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwinslingetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = webwinslingetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = webwinslingetfilterdata.this.AV27OptionIndexesJson;
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
      AV12TFProForCod = "" ;
      AV13TFProForCod_Sel = "" ;
      AV14TFProForDsc = "" ;
      AV15TFProForDsc_Sel = "" ;
      A764ProForCod = "" ;
      AV39Webwinslinds_1_filterfulltext = "" ;
      AV42Webwinslinds_4_tfproforcod = "" ;
      AV43Webwinslinds_5_tfproforcod_sel = "" ;
      AV44Webwinslinds_6_tfprofordsc = "" ;
      AV45Webwinslinds_7_tfprofordsc_sel = "" ;
      scmdbuf = "" ;
      lV39Webwinslinds_1_filterfulltext = "" ;
      lV42Webwinslinds_4_tfproforcod = "" ;
      lV44Webwinslinds_6_tfprofordsc = "" ;
      A766ProForDsc = "" ;
      P08SM2_A396EmprCod = new String[] {""} ;
      P08SM2_A764ProForCod = new String[] {""} ;
      P08SM2_A766ProForDsc = new String[] {""} ;
      P08SM2_A1273RecLinPro = new byte[1] ;
      P08SM2_A129BarCod = new int[1] ;
      P08SM2_A132BarCodReo = new byte[1] ;
      P08SM2_A130BarCodPar = new String[] {""} ;
      P08SM2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV20Option = "" ;
      P08SM3_A764ProForCod = new String[] {""} ;
      P08SM3_A396EmprCod = new String[] {""} ;
      P08SM3_A766ProForDsc = new String[] {""} ;
      P08SM3_A1273RecLinPro = new byte[1] ;
      P08SM3_A129BarCod = new int[1] ;
      P08SM3_A132BarCodReo = new byte[1] ;
      P08SM3_A130BarCodPar = new String[] {""} ;
      P08SM3_A2804RecLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwinslingetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08SM2_A396EmprCod, P08SM2_A764ProForCod, P08SM2_A766ProForDsc, P08SM2_A1273RecLinPro, P08SM2_A129BarCod, P08SM2_A132BarCodReo, P08SM2_A130BarCodPar, P08SM2_A2804RecLinMaq
            }
            , new Object[] {
            P08SM3_A764ProForCod, P08SM3_A396EmprCod, P08SM3_A766ProForDsc, P08SM3_A1273RecLinPro, P08SM3_A129BarCod, P08SM3_A132BarCodReo, P08SM3_A130BarCodPar, P08SM3_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFRecLinPro ;
   private byte AV11TFRecLinPro_To ;
   private byte AV40Webwinslinds_2_tfreclinpro ;
   private byte AV41Webwinslinds_3_tfreclinpro_to ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private int A129BarCod ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private String AV12TFProForCod ;
   private String AV13TFProForCod_Sel ;
   private String AV14TFProForDsc ;
   private String AV15TFProForDsc_Sel ;
   private String A764ProForCod ;
   private String AV42Webwinslinds_4_tfproforcod ;
   private String AV43Webwinslinds_5_tfproforcod_sel ;
   private String AV44Webwinslinds_6_tfprofordsc ;
   private String AV45Webwinslinds_7_tfprofordsc_sel ;
   private String scmdbuf ;
   private String lV42Webwinslinds_4_tfproforcod ;
   private String lV44Webwinslinds_6_tfprofordsc ;
   private String A766ProForDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk8SM2 ;
   private boolean brk8SM4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV39Webwinslinds_1_filterfulltext ;
   private String lV39Webwinslinds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08SM2_A396EmprCod ;
   private String[] P08SM2_A764ProForCod ;
   private String[] P08SM2_A766ProForDsc ;
   private byte[] P08SM2_A1273RecLinPro ;
   private int[] P08SM2_A129BarCod ;
   private byte[] P08SM2_A132BarCodReo ;
   private String[] P08SM2_A130BarCodPar ;
   private short[] P08SM2_A2804RecLinMaq ;
   private String[] P08SM3_A764ProForCod ;
   private String[] P08SM3_A396EmprCod ;
   private String[] P08SM3_A766ProForDsc ;
   private byte[] P08SM3_A1273RecLinPro ;
   private int[] P08SM3_A129BarCod ;
   private byte[] P08SM3_A132BarCodReo ;
   private String[] P08SM3_A130BarCodPar ;
   private short[] P08SM3_A2804RecLinMaq ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class webwinslingetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08SM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Webwinslinds_1_filterfulltext ,
                                          byte AV40Webwinslinds_2_tfreclinpro ,
                                          byte AV41Webwinslinds_3_tfreclinpro_to ,
                                          String AV43Webwinslinds_5_tfproforcod_sel ,
                                          String AV42Webwinslinds_4_tfproforcod ,
                                          String AV45Webwinslinds_7_tfprofordsc_sel ,
                                          String AV44Webwinslinds_6_tfprofordsc ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T2.ProForDsc, T1.RecLinPro, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      if ( ! (GXutil.strcmp("", AV39Webwinslinds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( UPPER(T1.ProForCod) like '%' || UPPER(?)) or ( UPPER(T2.ProForDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV40Webwinslinds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV41Webwinslinds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Webwinslinds_5_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV42Webwinslinds_4_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Webwinslinds_5_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Webwinslinds_7_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV44Webwinslinds_6_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Webwinslinds_7_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08SM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Webwinslinds_1_filterfulltext ,
                                          byte AV40Webwinslinds_2_tfreclinpro ,
                                          byte AV41Webwinslinds_3_tfreclinpro_to ,
                                          String AV43Webwinslinds_5_tfproforcod_sel ,
                                          String AV42Webwinslinds_4_tfproforcod ,
                                          String AV45Webwinslinds_7_tfprofordsc_sel ,
                                          String AV44Webwinslinds_6_tfprofordsc ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T2.ProForDsc, T1.RecLinPro, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      if ( ! (GXutil.strcmp("", AV39Webwinslinds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( UPPER(T1.ProForCod) like '%' || UPPER(?)) or ( UPPER(T2.ProForDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV40Webwinslinds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV41Webwinslinds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Webwinslinds_5_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV42Webwinslinds_4_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Webwinslinds_5_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Webwinslinds_7_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV44Webwinslinds_6_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Webwinslinds_7_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
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
                  return conditional_P08SM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P08SM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08SM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08SM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
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
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
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

