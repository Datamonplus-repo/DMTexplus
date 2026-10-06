package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tinditexwwgetfilterdata extends GXProcedure
{
   public tinditexwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tinditexwwgetfilterdata.class ), "" );
   }

   public tinditexwwgetfilterdata( int remoteHandle ,
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
      tinditexwwgetfilterdata.this.aP5 = new String[] {""};
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
      tinditexwwgetfilterdata.this.AV22DDOName = aP0;
      tinditexwwgetfilterdata.this.AV20SearchTxt = aP1;
      tinditexwwgetfilterdata.this.AV21SearchTxtTo = aP2;
      tinditexwwgetfilterdata.this.aP3 = aP3;
      tinditexwwgetfilterdata.this.aP4 = aP4;
      tinditexwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_COD_IDTX") == 0 )
      {
         /* Execute user subroutine: 'LOADCOD_IDTXOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_DSC_IDTX") == 0 )
      {
         /* Execute user subroutine: 'LOADDSC_IDTXOPTIONS' */
         S131 ();
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
      if ( GXutil.strcmp(AV33Session.getValue("FicherosBasicos.TINDITEXWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TINDITEXWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("FicherosBasicos.TINDITEXWWGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOD_IDTX") == 0 )
         {
            AV14TFCod_Idtx = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOD_IDTX_SEL") == 0 )
         {
            AV15TFCod_Idtx_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSC_IDTX") == 0 )
         {
            AV16TFDsc_Idtx = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSC_IDTX_SEL") == 0 )
         {
            AV17TFDsc_Idtx_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIMP_IDTX_SEL") == 0 )
         {
            AV18TFImp_Idtx_SelsJson = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV19TFImp_Idtx_Sels.fromJSonString(AV18TFImp_Idtx_SelsJson, null);
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCOD_IDTXOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCod_Idtx = AV20SearchTxt ;
      AV15TFCod_Idtx_Sel = "" ;
      AV57Ficherosbasicos_tinditexwwds_1_filterfulltext = AV52FilterFullText ;
      AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx = AV14TFCod_Idtx ;
      AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel = AV15TFCod_Idtx_Sel ;
      AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = AV16TFDsc_Idtx ;
      AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel = AV17TFDsc_Idtx_Sel ;
      AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels = AV19TFImp_Idtx_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A12703Imp_Idtx ,
                                           AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ,
                                           AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ,
                                           AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx ,
                                           AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ,
                                           AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ,
                                           Integer.valueOf(AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels.size()) ,
                                           A10887Cod_Idtx ,
                                           A10888Dsc_Idtx ,
                                           AV57Ficherosbasicos_tinditexwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx = GXutil.padr( GXutil.rtrim( AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx), 4, "%") ;
      lV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = GXutil.padr( GXutil.rtrim( AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx), 60, "%") ;
      /* Using cursor P07XF2 */
      pr_default.execute(0, new Object[] {lV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx, AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel, lV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx, AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7XF2 = false ;
         A10887Cod_Idtx = P07XF2_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P07XF2_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P07XF2_n10888Dsc_Idtx[0] ;
         A12703Imp_Idtx = P07XF2_A12703Imp_Idtx[0] ;
         n12703Imp_Idtx = P07XF2_n12703Imp_Idtx[0] ;
         A396EmprCod = P07XF2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV57Ficherosbasicos_tinditexwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A10887Cod_Idtx) , GXutil.padr( "%" + GXutil.upper( AV57Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10888Dsc_Idtx) , GXutil.padr( "%" + GXutil.upper( AV57Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07XF2_A10887Cod_Idtx[0], A10887Cod_Idtx) == 0 ) )
            {
               brk7XF2 = false ;
               A396EmprCod = P07XF2_A396EmprCod[0] ;
               AV32count = (long)(AV32count+1) ;
               brk7XF2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A10887Cod_Idtx)==0) )
            {
               AV24Option = A10887Cod_Idtx ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7XF2 )
         {
            brk7XF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDSC_IDTXOPTIONS' Routine */
      returnInSub = false ;
      AV16TFDsc_Idtx = AV20SearchTxt ;
      AV17TFDsc_Idtx_Sel = "" ;
      AV57Ficherosbasicos_tinditexwwds_1_filterfulltext = AV52FilterFullText ;
      AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx = AV14TFCod_Idtx ;
      AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel = AV15TFCod_Idtx_Sel ;
      AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = AV16TFDsc_Idtx ;
      AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel = AV17TFDsc_Idtx_Sel ;
      AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels = AV19TFImp_Idtx_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A12703Imp_Idtx ,
                                           AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ,
                                           AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ,
                                           AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx ,
                                           AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ,
                                           AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ,
                                           Integer.valueOf(AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels.size()) ,
                                           A10887Cod_Idtx ,
                                           A10888Dsc_Idtx ,
                                           AV57Ficherosbasicos_tinditexwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx = GXutil.padr( GXutil.rtrim( AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx), 4, "%") ;
      lV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = GXutil.padr( GXutil.rtrim( AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx), 60, "%") ;
      /* Using cursor P07XF3 */
      pr_default.execute(1, new Object[] {lV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx, AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel, lV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx, AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk7XF4 = false ;
         A10888Dsc_Idtx = P07XF3_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P07XF3_n10888Dsc_Idtx[0] ;
         A10887Cod_Idtx = P07XF3_A10887Cod_Idtx[0] ;
         A12703Imp_Idtx = P07XF3_A12703Imp_Idtx[0] ;
         n12703Imp_Idtx = P07XF3_n12703Imp_Idtx[0] ;
         A396EmprCod = P07XF3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV57Ficherosbasicos_tinditexwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A10887Cod_Idtx) , GXutil.padr( "%" + GXutil.upper( AV57Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10888Dsc_Idtx) , GXutil.padr( "%" + GXutil.upper( AV57Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV57Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07XF3_A10888Dsc_Idtx[0], A10888Dsc_Idtx) == 0 ) )
            {
               brk7XF4 = false ;
               A10887Cod_Idtx = P07XF3_A10887Cod_Idtx[0] ;
               A396EmprCod = P07XF3_A396EmprCod[0] ;
               AV32count = (long)(AV32count+1) ;
               brk7XF4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A10888Dsc_Idtx)==0) )
            {
               AV24Option = A10888Dsc_Idtx ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7XF4 )
         {
            brk7XF4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tinditexwwgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = tinditexwwgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = tinditexwwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV14TFCod_Idtx = "" ;
      AV15TFCod_Idtx_Sel = "" ;
      AV16TFDsc_Idtx = "" ;
      AV17TFDsc_Idtx_Sel = "" ;
      AV18TFImp_Idtx_SelsJson = "" ;
      AV19TFImp_Idtx_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A10887Cod_Idtx = "" ;
      AV57Ficherosbasicos_tinditexwwds_1_filterfulltext = "" ;
      AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx = "" ;
      AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel = "" ;
      AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = "" ;
      AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel = "" ;
      AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx = "" ;
      lV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = "" ;
      A12703Imp_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      P07XF2_A10887Cod_Idtx = new String[] {""} ;
      P07XF2_A10888Dsc_Idtx = new String[] {""} ;
      P07XF2_n10888Dsc_Idtx = new boolean[] {false} ;
      P07XF2_A12703Imp_Idtx = new String[] {""} ;
      P07XF2_n12703Imp_Idtx = new boolean[] {false} ;
      P07XF2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV24Option = "" ;
      P07XF3_A10888Dsc_Idtx = new String[] {""} ;
      P07XF3_n10888Dsc_Idtx = new boolean[] {false} ;
      P07XF3_A10887Cod_Idtx = new String[] {""} ;
      P07XF3_A12703Imp_Idtx = new String[] {""} ;
      P07XF3_n12703Imp_Idtx = new boolean[] {false} ;
      P07XF3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tinditexwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07XF2_A10887Cod_Idtx, P07XF2_A10888Dsc_Idtx, P07XF2_n10888Dsc_Idtx, P07XF2_A12703Imp_Idtx, P07XF2_n12703Imp_Idtx, P07XF2_A396EmprCod
            }
            , new Object[] {
            P07XF3_A10888Dsc_Idtx, P07XF3_n10888Dsc_Idtx, P07XF3_A10887Cod_Idtx, P07XF3_A12703Imp_Idtx, P07XF3_n12703Imp_Idtx, P07XF3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size ;
   private long AV32count ;
   private String AV14TFCod_Idtx ;
   private String AV15TFCod_Idtx_Sel ;
   private String AV16TFDsc_Idtx ;
   private String AV17TFDsc_Idtx_Sel ;
   private String A10887Cod_Idtx ;
   private String AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx ;
   private String AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ;
   private String AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ;
   private String AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ;
   private String scmdbuf ;
   private String lV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx ;
   private String lV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ;
   private String A12703Imp_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk7XF2 ;
   private boolean n10888Dsc_Idtx ;
   private boolean n12703Imp_Idtx ;
   private boolean brk7XF4 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV18TFImp_Idtx_SelsJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV57Ficherosbasicos_tinditexwwds_1_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07XF2_A10887Cod_Idtx ;
   private String[] P07XF2_A10888Dsc_Idtx ;
   private boolean[] P07XF2_n10888Dsc_Idtx ;
   private String[] P07XF2_A12703Imp_Idtx ;
   private boolean[] P07XF2_n12703Imp_Idtx ;
   private String[] P07XF2_A396EmprCod ;
   private String[] P07XF3_A10888Dsc_Idtx ;
   private boolean[] P07XF3_n10888Dsc_Idtx ;
   private String[] P07XF3_A10887Cod_Idtx ;
   private String[] P07XF3_A12703Imp_Idtx ;
   private boolean[] P07XF3_n12703Imp_Idtx ;
   private String[] P07XF3_A396EmprCod ;
   private GXSimpleCollection<String> AV19TFImp_Idtx_Sels ;
   private GXSimpleCollection<String> AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class tinditexwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07XF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A12703Imp_Idtx ,
                                          GXSimpleCollection<String> AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ,
                                          String AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ,
                                          String AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx ,
                                          String AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ,
                                          String AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ,
                                          int AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size ,
                                          String A10887Cod_Idtx ,
                                          String A10888Dsc_Idtx ,
                                          String AV57Ficherosbasicos_tinditexwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[4];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Cod_Idtx, Dsc_Idtx, Imp_Idtx, EmprCod FROM TXPINDITE" ;
      if ( (GXutil.strcmp("", AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel)==0) && ( ! (GXutil.strcmp("", AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Cod_Idtx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel)==0) )
      {
         addWhere(sWhereString, "(Cod_Idtx = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel)==0) && ( ! (GXutil.strcmp("", AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Dsc_Idtx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel)==0) )
      {
         addWhere(sWhereString, "(Dsc_Idtx = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels, "Imp_Idtx IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Cod_Idtx" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P07XF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A12703Imp_Idtx ,
                                          GXSimpleCollection<String> AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ,
                                          String AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ,
                                          String AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx ,
                                          String AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ,
                                          String AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ,
                                          int AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size ,
                                          String A10887Cod_Idtx ,
                                          String A10888Dsc_Idtx ,
                                          String AV57Ficherosbasicos_tinditexwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[4];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT Dsc_Idtx, Cod_Idtx, Imp_Idtx, EmprCod FROM TXPINDITE" ;
      if ( (GXutil.strcmp("", AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel)==0) && ( ! (GXutil.strcmp("", AV58Ficherosbasicos_tinditexwwds_2_tfcod_idtx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Cod_Idtx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel)==0) )
      {
         addWhere(sWhereString, "(Cod_Idtx = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel)==0) && ( ! (GXutil.strcmp("", AV60Ficherosbasicos_tinditexwwds_4_tfdsc_idtx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Dsc_Idtx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel)==0) )
      {
         addWhere(sWhereString, "(Dsc_Idtx = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV62Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels, "Imp_Idtx IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Dsc_Idtx" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P07XF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P07XF3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07XF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07XF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setString(sIdx, (String)parms[4], 4);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 4);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 60);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 60);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 4);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 4);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 60);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 60);
               }
               return;
      }
   }

}

