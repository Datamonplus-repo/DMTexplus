package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmcomprawwgetfilterdata extends GXProcedure
{
   public tmcomprawwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmcomprawwgetfilterdata.class ), "" );
   }

   public tmcomprawwgetfilterdata( int remoteHandle ,
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
      tmcomprawwgetfilterdata.this.aP5 = new String[] {""};
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
      tmcomprawwgetfilterdata.this.AV34DDOName = aP0;
      tmcomprawwgetfilterdata.this.AV32SearchTxt = aP1;
      tmcomprawwgetfilterdata.this.AV33SearchTxtTo = aP2;
      tmcomprawwgetfilterdata.this.aP3 = aP3;
      tmcomprawwgetfilterdata.this.aP4 = aP4;
      tmcomprawwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV38OptionsJson = AV37Options.toJSonString(false) ;
      AV41OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV42OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("TMCompraWWGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMCompraWWGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("TMCompraWWGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMCOD") == 0 )
         {
            AV14TFMComCod = GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV15TFMComCod_To = GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMORI_SEL") == 0 )
         {
            AV30TFMComOri_SelsJson = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV31TFMComOri_Sels.fromJSonString(AV30TFMComOri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEST_SEL") == 0 )
         {
            AV28TFMComEst_SelsJson = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV29TFMComEst_Sels.fromJSonString(AV28TFMComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMFCH") == 0 )
         {
            AV18TFMComFch = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLFCH") == 0 )
         {
            AV24TFMComSolFch = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTFCH") == 0 )
         {
            AV26TFMComEntFch = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV20TFPrvNum = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFPrvNum_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV22TFPrvNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV23TFPrvNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFPrvNom = AV32SearchTxt ;
      AV23TFPrvNom_Sel = "" ;
      AV57Tmcomprawwds_1_filterfulltext = AV50FilterFullText ;
      AV58Tmcomprawwds_2_tfmcomcod = AV14TFMComCod ;
      AV59Tmcomprawwds_3_tfmcomcod_to = AV15TFMComCod_To ;
      AV60Tmcomprawwds_4_tfmcomori_sels = AV31TFMComOri_Sels ;
      AV61Tmcomprawwds_5_tfmcomest_sels = AV29TFMComEst_Sels ;
      AV62Tmcomprawwds_6_tfmcomfch = AV18TFMComFch ;
      AV63Tmcomprawwds_7_tfmcomsolfch = AV24TFMComSolFch ;
      AV64Tmcomprawwds_8_tfmcomentfch = AV26TFMComEntFch ;
      AV65Tmcomprawwds_9_tfprvnum = AV20TFPrvNum ;
      AV66Tmcomprawwds_10_tfprvnum_to = AV21TFPrvNum_To ;
      AV67Tmcomprawwds_11_tfprvnom = AV22TFPrvNom ;
      AV68Tmcomprawwds_12_tfprvnom_sel = AV23TFPrvNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11050MComOri ,
                                           AV60Tmcomprawwds_4_tfmcomori_sels ,
                                           A11049MComEst ,
                                           AV61Tmcomprawwds_5_tfmcomest_sels ,
                                           Long.valueOf(AV58Tmcomprawwds_2_tfmcomcod) ,
                                           Long.valueOf(AV59Tmcomprawwds_3_tfmcomcod_to) ,
                                           Integer.valueOf(AV60Tmcomprawwds_4_tfmcomori_sels.size()) ,
                                           Integer.valueOf(AV61Tmcomprawwds_5_tfmcomest_sels.size()) ,
                                           AV62Tmcomprawwds_6_tfmcomfch ,
                                           AV63Tmcomprawwds_7_tfmcomsolfch ,
                                           AV64Tmcomprawwds_8_tfmcomentfch ,
                                           Integer.valueOf(AV65Tmcomprawwds_9_tfprvnum) ,
                                           Integer.valueOf(AV66Tmcomprawwds_10_tfprvnum_to) ,
                                           AV68Tmcomprawwds_12_tfprvnom_sel ,
                                           AV67Tmcomprawwds_11_tfprvnom ,
                                           Long.valueOf(A11055MComCod) ,
                                           A11046MComFch ,
                                           A11047MComSolFch ,
                                           A11048MComEntFch ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           AV57Tmcomprawwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV67Tmcomprawwds_11_tfprvnom = GXutil.padr( GXutil.rtrim( AV67Tmcomprawwds_11_tfprvnom), 30, "%") ;
      /* Using cursor P08JT2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV58Tmcomprawwds_2_tfmcomcod), Long.valueOf(AV59Tmcomprawwds_3_tfmcomcod_to), AV62Tmcomprawwds_6_tfmcomfch, AV63Tmcomprawwds_7_tfmcomsolfch, AV64Tmcomprawwds_8_tfmcomentfch, Integer.valueOf(AV65Tmcomprawwds_9_tfprvnum), Integer.valueOf(AV66Tmcomprawwds_10_tfprvnum_to), lV67Tmcomprawwds_11_tfprvnom, AV68Tmcomprawwds_12_tfprvnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8JT2 = false ;
         A795PrvNum = P08JT2_A795PrvNum[0] ;
         n795PrvNum = P08JT2_n795PrvNum[0] ;
         A396EmprCod = P08JT2_A396EmprCod[0] ;
         A794PrvNom = P08JT2_A794PrvNom[0] ;
         n794PrvNom = P08JT2_n794PrvNom[0] ;
         A11048MComEntFch = P08JT2_A11048MComEntFch[0] ;
         A11047MComSolFch = P08JT2_A11047MComSolFch[0] ;
         A11046MComFch = P08JT2_A11046MComFch[0] ;
         A11055MComCod = P08JT2_A11055MComCod[0] ;
         A11049MComEst = P08JT2_A11049MComEst[0] ;
         A11050MComOri = P08JT2_A11050MComOri[0] ;
         A794PrvNom = P08JT2_A794PrvNom[0] ;
         n794PrvNom = P08JT2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV57Tmcomprawwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A11055MComCod, 10, 0) , GXutil.padr( "%" + AV57Tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automático", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "confirmada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "enviada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "recibida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV57Tmcomprawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV57Tmcomprawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV44count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08JT2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08JT2_A795PrvNum[0] == A795PrvNum ) )
            {
               brk8JT2 = false ;
               A11055MComCod = P08JT2_A11055MComCod[0] ;
               AV44count = (long)(AV44count+1) ;
               brk8JT2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
            {
               AV36Option = A794PrvNom ;
               AV35InsertIndex = 1 ;
               while ( ( AV35InsertIndex <= AV37Options.size() ) && ( GXutil.strcmp((String)AV37Options.elementAt(-1+AV35InsertIndex), AV36Option) < 0 ) )
               {
                  AV35InsertIndex = (int)(AV35InsertIndex+1) ;
               }
               AV37Options.add(AV36Option, AV35InsertIndex);
               AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), AV35InsertIndex);
            }
            if ( AV37Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8JT2 )
         {
            brk8JT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmcomprawwgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = tmcomprawwgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = tmcomprawwgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38OptionsJson = "" ;
      AV41OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV30TFMComOri_SelsJson = "" ;
      AV31TFMComOri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28TFMComEst_SelsJson = "" ;
      AV29TFMComEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18TFMComFch = GXutil.nullDate() ;
      AV24TFMComSolFch = GXutil.nullDate() ;
      AV26TFMComEntFch = GXutil.nullDate() ;
      AV22TFPrvNom = "" ;
      AV23TFPrvNom_Sel = "" ;
      A794PrvNom = "" ;
      AV57Tmcomprawwds_1_filterfulltext = "" ;
      AV60Tmcomprawwds_4_tfmcomori_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV61Tmcomprawwds_5_tfmcomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62Tmcomprawwds_6_tfmcomfch = GXutil.nullDate() ;
      AV63Tmcomprawwds_7_tfmcomsolfch = GXutil.nullDate() ;
      AV64Tmcomprawwds_8_tfmcomentfch = GXutil.nullDate() ;
      AV67Tmcomprawwds_11_tfprvnom = "" ;
      AV68Tmcomprawwds_12_tfprvnom_sel = "" ;
      lV57Tmcomprawwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV67Tmcomprawwds_11_tfprvnom = "" ;
      A11050MComOri = "" ;
      A11049MComEst = "" ;
      A11046MComFch = GXutil.nullDate() ;
      A11047MComSolFch = GXutil.nullDate() ;
      A11048MComEntFch = GXutil.nullDate() ;
      P08JT2_A795PrvNum = new int[1] ;
      P08JT2_n795PrvNum = new boolean[] {false} ;
      P08JT2_A396EmprCod = new String[] {""} ;
      P08JT2_A794PrvNom = new String[] {""} ;
      P08JT2_n794PrvNom = new boolean[] {false} ;
      P08JT2_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08JT2_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08JT2_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08JT2_A11055MComCod = new long[1] ;
      P08JT2_A11049MComEst = new String[] {""} ;
      P08JT2_A11050MComOri = new String[] {""} ;
      A396EmprCod = "" ;
      AV36Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmcomprawwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08JT2_A795PrvNum, P08JT2_n795PrvNum, P08JT2_A396EmprCod, P08JT2_A794PrvNom, P08JT2_n794PrvNom, P08JT2_A11048MComEntFch, P08JT2_A11047MComSolFch, P08JT2_A11046MComFch, P08JT2_A11055MComCod, P08JT2_A11049MComEst,
            P08JT2_A11050MComOri
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV20TFPrvNum ;
   private int AV21TFPrvNum_To ;
   private int AV65Tmcomprawwds_9_tfprvnum ;
   private int AV66Tmcomprawwds_10_tfprvnum_to ;
   private int AV60Tmcomprawwds_4_tfmcomori_sels_size ;
   private int AV61Tmcomprawwds_5_tfmcomest_sels_size ;
   private int A795PrvNum ;
   private int AV35InsertIndex ;
   private long AV14TFMComCod ;
   private long AV15TFMComCod_To ;
   private long AV58Tmcomprawwds_2_tfmcomcod ;
   private long AV59Tmcomprawwds_3_tfmcomcod_to ;
   private long A11055MComCod ;
   private long AV44count ;
   private String AV22TFPrvNom ;
   private String AV23TFPrvNom_Sel ;
   private String A794PrvNom ;
   private String AV67Tmcomprawwds_11_tfprvnom ;
   private String AV68Tmcomprawwds_12_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV67Tmcomprawwds_11_tfprvnom ;
   private String A11050MComOri ;
   private String A11049MComEst ;
   private String A396EmprCod ;
   private java.util.Date AV18TFMComFch ;
   private java.util.Date AV24TFMComSolFch ;
   private java.util.Date AV26TFMComEntFch ;
   private java.util.Date AV62Tmcomprawwds_6_tfmcomfch ;
   private java.util.Date AV63Tmcomprawwds_7_tfmcomsolfch ;
   private java.util.Date AV64Tmcomprawwds_8_tfmcomentfch ;
   private java.util.Date A11046MComFch ;
   private java.util.Date A11047MComSolFch ;
   private java.util.Date A11048MComEntFch ;
   private boolean returnInSub ;
   private boolean brk8JT2 ;
   private boolean n795PrvNum ;
   private boolean n794PrvNom ;
   private String AV38OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV30TFMComOri_SelsJson ;
   private String AV28TFMComEst_SelsJson ;
   private String AV34DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV57Tmcomprawwds_1_filterfulltext ;
   private String lV57Tmcomprawwds_1_filterfulltext ;
   private String AV36Option ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08JT2_A795PrvNum ;
   private boolean[] P08JT2_n795PrvNum ;
   private String[] P08JT2_A396EmprCod ;
   private String[] P08JT2_A794PrvNom ;
   private boolean[] P08JT2_n794PrvNom ;
   private java.util.Date[] P08JT2_A11048MComEntFch ;
   private java.util.Date[] P08JT2_A11047MComSolFch ;
   private java.util.Date[] P08JT2_A11046MComFch ;
   private long[] P08JT2_A11055MComCod ;
   private String[] P08JT2_A11049MComEst ;
   private String[] P08JT2_A11050MComOri ;
   private GXSimpleCollection<String> AV31TFMComOri_Sels ;
   private GXSimpleCollection<String> AV29TFMComEst_Sels ;
   private GXSimpleCollection<String> AV60Tmcomprawwds_4_tfmcomori_sels ;
   private GXSimpleCollection<String> AV61Tmcomprawwds_5_tfmcomest_sels ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class tmcomprawwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11050MComOri ,
                                          GXSimpleCollection<String> AV60Tmcomprawwds_4_tfmcomori_sels ,
                                          String A11049MComEst ,
                                          GXSimpleCollection<String> AV61Tmcomprawwds_5_tfmcomest_sels ,
                                          long AV58Tmcomprawwds_2_tfmcomcod ,
                                          long AV59Tmcomprawwds_3_tfmcomcod_to ,
                                          int AV60Tmcomprawwds_4_tfmcomori_sels_size ,
                                          int AV61Tmcomprawwds_5_tfmcomest_sels_size ,
                                          java.util.Date AV62Tmcomprawwds_6_tfmcomfch ,
                                          java.util.Date AV63Tmcomprawwds_7_tfmcomsolfch ,
                                          java.util.Date AV64Tmcomprawwds_8_tfmcomentfch ,
                                          int AV65Tmcomprawwds_9_tfprvnum ,
                                          int AV66Tmcomprawwds_10_tfprvnum_to ,
                                          String AV68Tmcomprawwds_12_tfprvnom_sel ,
                                          String AV67Tmcomprawwds_11_tfprvnom ,
                                          long A11055MComCod ,
                                          java.util.Date A11046MComFch ,
                                          java.util.Date A11047MComSolFch ,
                                          java.util.Date A11048MComEntFch ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String AV57Tmcomprawwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.EmprCod, T2.PrvNom, T1.MComEntFch, T1.MComSolFch, T1.MComFch, T1.MComCod, T1.MComEst, T1.MComOri FROM (TXPMRepCo T1 LEFT JOIN TXPPRVGEN T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (0==AV58Tmcomprawwds_2_tfmcomcod) )
      {
         addWhere(sWhereString, "(T1.MComCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV59Tmcomprawwds_3_tfmcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MComCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV60Tmcomprawwds_4_tfmcomori_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV60Tmcomprawwds_4_tfmcomori_sels, "T1.MComOri IN (", ")")+")");
      }
      if ( AV61Tmcomprawwds_5_tfmcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV61Tmcomprawwds_5_tfmcomest_sels, "T1.MComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62Tmcomprawwds_6_tfmcomfch)) )
      {
         addWhere(sWhereString, "(T1.MComFch >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV63Tmcomprawwds_7_tfmcomsolfch)) )
      {
         addWhere(sWhereString, "(T1.MComSolFch >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Tmcomprawwds_8_tfmcomentfch)) )
      {
         addWhere(sWhereString, "(T1.MComEntFch >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV65Tmcomprawwds_9_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV66Tmcomprawwds_10_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tmcomprawwds_12_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Tmcomprawwds_11_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tmcomprawwds_12_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P08JT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((long[]) buf[8])[0] = rslt.getLong(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
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
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
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

