package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordmrwwgetfilterdata extends GXProcedure
{
   public tmordmrwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordmrwwgetfilterdata.class ), "" );
   }

   public tmordmrwwgetfilterdata( int remoteHandle ,
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
      tmordmrwwgetfilterdata.this.aP5 = new String[] {""};
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
      tmordmrwwgetfilterdata.this.AV26DDOName = aP0;
      tmordmrwwgetfilterdata.this.AV24SearchTxt = aP1;
      tmordmrwwgetfilterdata.this.AV25SearchTxtTo = aP2;
      tmordmrwwgetfilterdata.this.aP3 = aP3;
      tmordmrwwgetfilterdata.this.aP4 = aP4;
      tmordmrwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_OMMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADOMMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_OMMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADOMMAQDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("TMOrdMRWWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMOrdMRWWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TMOrdMRWWGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV14TFOMCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFOMCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD") == 0 )
         {
            AV16TFOMMaqCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD_SEL") == 0 )
         {
            AV17TFOMMaqCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC") == 0 )
         {
            AV18TFOMMaqDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC_SEL") == 0 )
         {
            AV19TFOMMaqDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMRCOST") == 0 )
         {
            AV20TFOMMRCosT = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFOMMRCosT_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMEST_SEL") == 0 )
         {
            AV22TFOMEst_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV23TFOMEst_Sels.fromJSonString(AV22TFOMEst_SelsJson, null);
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADOMMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFOMMaqCod = AV24SearchTxt ;
      AV17TFOMMaqCod_Sel = "" ;
      AV47Tmordmrwwds_1_filterfulltext = AV42FilterFullText ;
      AV48Tmordmrwwds_2_tfomcod = AV14TFOMCod ;
      AV49Tmordmrwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV50Tmordmrwwds_4_tfommaqcod = AV16TFOMMaqCod ;
      AV51Tmordmrwwds_5_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV52Tmordmrwwds_6_tfommaqdsc = AV18TFOMMaqDsc ;
      AV53Tmordmrwwds_7_tfommaqdsc_sel = AV19TFOMMaqDsc_Sel ;
      AV54Tmordmrwwds_8_tfommrcost = AV20TFOMMRCosT ;
      AV55Tmordmrwwds_9_tfommrcost_to = AV21TFOMMRCosT_To ;
      AV56Tmordmrwwds_10_tfomest_sels = AV23TFOMEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV56Tmordmrwwds_10_tfomest_sels ,
                                           Integer.valueOf(AV48Tmordmrwwds_2_tfomcod) ,
                                           Integer.valueOf(AV49Tmordmrwwds_3_tfomcod_to) ,
                                           AV51Tmordmrwwds_5_tfommaqcod_sel ,
                                           AV50Tmordmrwwds_4_tfommaqcod ,
                                           AV53Tmordmrwwds_7_tfommaqdsc_sel ,
                                           AV52Tmordmrwwds_6_tfommaqdsc ,
                                           AV54Tmordmrwwds_8_tfommrcost ,
                                           AV55Tmordmrwwds_9_tfommrcost_to ,
                                           Integer.valueOf(AV56Tmordmrwwds_10_tfomest_sels.size()) ,
                                           Integer.valueOf(A9425OMCod) ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           A9442OMMRCosT ,
                                           AV47Tmordmrwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV50Tmordmrwwds_4_tfommaqcod = GXutil.padr( GXutil.rtrim( AV50Tmordmrwwds_4_tfommaqcod), 6, "%") ;
      lV52Tmordmrwwds_6_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV52Tmordmrwwds_6_tfommaqdsc), 16, "%") ;
      /* Using cursor P08PX3 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV48Tmordmrwwds_2_tfomcod), Integer.valueOf(AV49Tmordmrwwds_3_tfomcod_to), lV50Tmordmrwwds_4_tfommaqcod, AV51Tmordmrwwds_5_tfommaqcod_sel, lV52Tmordmrwwds_6_tfommaqdsc, AV53Tmordmrwwds_7_tfommaqdsc_sel, AV54Tmordmrwwds_8_tfommrcost, AV55Tmordmrwwds_9_tfommrcost_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8PX2 = false ;
         A396EmprCod = P08PX3_A396EmprCod[0] ;
         A9426OMMaqCod = P08PX3_A9426OMMaqCod[0] ;
         A9427OMMaqDsc = P08PX3_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PX3_n9427OMMaqDsc[0] ;
         A9425OMCod = P08PX3_A9425OMCod[0] ;
         A9445OMEst = P08PX3_A9445OMEst[0] ;
         A9442OMMRCosT = P08PX3_A9442OMMRCosT[0] ;
         n9442OMMRCosT = P08PX3_n9442OMMRCosT[0] ;
         A9427OMMaqDsc = P08PX3_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PX3_n9427OMMaqDsc[0] ;
         A9442OMMRCosT = P08PX3_A9442OMMRCosT[0] ;
         n9442OMMRCosT = P08PX3_n9442OMMRCosT[0] ;
         if ( (GXutil.strcmp("", AV47Tmordmrwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV47Tmordmrwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV47Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV47Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV47Tmordmrwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV47Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV47Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08PX3_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
            {
               brk8PX2 = false ;
               A396EmprCod = P08PX3_A396EmprCod[0] ;
               A9425OMCod = P08PX3_A9425OMCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk8PX2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A9426OMMaqCod)==0) )
            {
               AV28Option = A9426OMMaqCod ;
               AV29Options.add(AV28Option, 0);
               AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV29Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8PX2 )
         {
            brk8PX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADOMMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFOMMaqDsc = AV24SearchTxt ;
      AV19TFOMMaqDsc_Sel = "" ;
      AV47Tmordmrwwds_1_filterfulltext = AV42FilterFullText ;
      AV48Tmordmrwwds_2_tfomcod = AV14TFOMCod ;
      AV49Tmordmrwwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV50Tmordmrwwds_4_tfommaqcod = AV16TFOMMaqCod ;
      AV51Tmordmrwwds_5_tfommaqcod_sel = AV17TFOMMaqCod_Sel ;
      AV52Tmordmrwwds_6_tfommaqdsc = AV18TFOMMaqDsc ;
      AV53Tmordmrwwds_7_tfommaqdsc_sel = AV19TFOMMaqDsc_Sel ;
      AV54Tmordmrwwds_8_tfommrcost = AV20TFOMMRCosT ;
      AV55Tmordmrwwds_9_tfommrcost_to = AV21TFOMMRCosT_To ;
      AV56Tmordmrwwds_10_tfomest_sels = AV23TFOMEst_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV56Tmordmrwwds_10_tfomest_sels ,
                                           Integer.valueOf(AV48Tmordmrwwds_2_tfomcod) ,
                                           Integer.valueOf(AV49Tmordmrwwds_3_tfomcod_to) ,
                                           AV51Tmordmrwwds_5_tfommaqcod_sel ,
                                           AV50Tmordmrwwds_4_tfommaqcod ,
                                           AV53Tmordmrwwds_7_tfommaqdsc_sel ,
                                           AV52Tmordmrwwds_6_tfommaqdsc ,
                                           AV54Tmordmrwwds_8_tfommrcost ,
                                           AV55Tmordmrwwds_9_tfommrcost_to ,
                                           Integer.valueOf(AV56Tmordmrwwds_10_tfomest_sels.size()) ,
                                           Integer.valueOf(A9425OMCod) ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           A9442OMMRCosT ,
                                           AV47Tmordmrwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV50Tmordmrwwds_4_tfommaqcod = GXutil.padr( GXutil.rtrim( AV50Tmordmrwwds_4_tfommaqcod), 6, "%") ;
      lV52Tmordmrwwds_6_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV52Tmordmrwwds_6_tfommaqdsc), 16, "%") ;
      /* Using cursor P08PX5 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV48Tmordmrwwds_2_tfomcod), Integer.valueOf(AV49Tmordmrwwds_3_tfomcod_to), lV50Tmordmrwwds_4_tfommaqcod, AV51Tmordmrwwds_5_tfommaqcod_sel, lV52Tmordmrwwds_6_tfommaqdsc, AV53Tmordmrwwds_7_tfommaqdsc_sel, AV54Tmordmrwwds_8_tfommrcost, AV55Tmordmrwwds_9_tfommrcost_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8PX4 = false ;
         A9426OMMaqCod = P08PX5_A9426OMMaqCod[0] ;
         A396EmprCod = P08PX5_A396EmprCod[0] ;
         A9427OMMaqDsc = P08PX5_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PX5_n9427OMMaqDsc[0] ;
         A9425OMCod = P08PX5_A9425OMCod[0] ;
         A9445OMEst = P08PX5_A9445OMEst[0] ;
         A9442OMMRCosT = P08PX5_A9442OMMRCosT[0] ;
         n9442OMMRCosT = P08PX5_n9442OMMRCosT[0] ;
         A9427OMMaqDsc = P08PX5_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08PX5_n9427OMMaqDsc[0] ;
         A9442OMMRCosT = P08PX5_A9442OMMRCosT[0] ;
         n9442OMMRCosT = P08PX5_n9442OMMRCosT[0] ;
         if ( (GXutil.strcmp("", AV47Tmordmrwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV47Tmordmrwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV47Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV47Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV47Tmordmrwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV47Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV47Tmordmrwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) ) )
         {
            AV36count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08PX5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08PX5_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
            {
               brk8PX4 = false ;
               A9425OMCod = P08PX5_A9425OMCod[0] ;
               AV36count = (long)(AV36count+1) ;
               brk8PX4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A9427OMMaqDsc)==0) )
            {
               AV28Option = A9427OMMaqDsc ;
               AV27InsertIndex = 1 ;
               while ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) < 0 ) )
               {
                  AV27InsertIndex = (int)(AV27InsertIndex+1) ;
               }
               AV29Options.add(AV28Option, AV27InsertIndex);
               AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), AV27InsertIndex);
            }
            if ( AV29Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8PX4 )
         {
            brk8PX4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmordmrwwgetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = tmordmrwwgetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = tmordmrwwgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FilterFullText = "" ;
      AV16TFOMMaqCod = "" ;
      AV17TFOMMaqCod_Sel = "" ;
      AV18TFOMMaqDsc = "" ;
      AV19TFOMMaqDsc_Sel = "" ;
      AV20TFOMMRCosT = DecimalUtil.ZERO ;
      AV21TFOMMRCosT_To = DecimalUtil.ZERO ;
      AV22TFOMEst_SelsJson = "" ;
      AV23TFOMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A9426OMMaqCod = "" ;
      AV47Tmordmrwwds_1_filterfulltext = "" ;
      AV50Tmordmrwwds_4_tfommaqcod = "" ;
      AV51Tmordmrwwds_5_tfommaqcod_sel = "" ;
      AV52Tmordmrwwds_6_tfommaqdsc = "" ;
      AV53Tmordmrwwds_7_tfommaqdsc_sel = "" ;
      AV54Tmordmrwwds_8_tfommrcost = DecimalUtil.ZERO ;
      AV55Tmordmrwwds_9_tfommrcost_to = DecimalUtil.ZERO ;
      AV56Tmordmrwwds_10_tfomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV50Tmordmrwwds_4_tfommaqcod = "" ;
      lV52Tmordmrwwds_6_tfommaqdsc = "" ;
      A9445OMEst = "" ;
      A9427OMMaqDsc = "" ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      P08PX3_A396EmprCod = new String[] {""} ;
      P08PX3_A9426OMMaqCod = new String[] {""} ;
      P08PX3_A9427OMMaqDsc = new String[] {""} ;
      P08PX3_n9427OMMaqDsc = new boolean[] {false} ;
      P08PX3_A9425OMCod = new int[1] ;
      P08PX3_A9445OMEst = new String[] {""} ;
      P08PX3_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PX3_n9442OMMRCosT = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV28Option = "" ;
      P08PX5_A9426OMMaqCod = new String[] {""} ;
      P08PX5_A396EmprCod = new String[] {""} ;
      P08PX5_A9427OMMaqDsc = new String[] {""} ;
      P08PX5_n9427OMMaqDsc = new boolean[] {false} ;
      P08PX5_A9425OMCod = new int[1] ;
      P08PX5_A9445OMEst = new String[] {""} ;
      P08PX5_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PX5_n9442OMMRCosT = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordmrwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08PX3_A396EmprCod, P08PX3_A9426OMMaqCod, P08PX3_A9427OMMaqDsc, P08PX3_n9427OMMaqDsc, P08PX3_A9425OMCod, P08PX3_A9445OMEst, P08PX3_A9442OMMRCosT, P08PX3_n9442OMMRCosT
            }
            , new Object[] {
            P08PX5_A9426OMMaqCod, P08PX5_A396EmprCod, P08PX5_A9427OMMaqDsc, P08PX5_n9427OMMaqDsc, P08PX5_A9425OMCod, P08PX5_A9445OMEst, P08PX5_A9442OMMRCosT, P08PX5_n9442OMMRCosT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV14TFOMCod ;
   private int AV15TFOMCod_To ;
   private int AV48Tmordmrwwds_2_tfomcod ;
   private int AV49Tmordmrwwds_3_tfomcod_to ;
   private int AV56Tmordmrwwds_10_tfomest_sels_size ;
   private int A9425OMCod ;
   private int AV27InsertIndex ;
   private long AV36count ;
   private java.math.BigDecimal AV20TFOMMRCosT ;
   private java.math.BigDecimal AV21TFOMMRCosT_To ;
   private java.math.BigDecimal AV54Tmordmrwwds_8_tfommrcost ;
   private java.math.BigDecimal AV55Tmordmrwwds_9_tfommrcost_to ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private String AV16TFOMMaqCod ;
   private String AV17TFOMMaqCod_Sel ;
   private String AV18TFOMMaqDsc ;
   private String AV19TFOMMaqDsc_Sel ;
   private String A9426OMMaqCod ;
   private String AV50Tmordmrwwds_4_tfommaqcod ;
   private String AV51Tmordmrwwds_5_tfommaqcod_sel ;
   private String AV52Tmordmrwwds_6_tfommaqdsc ;
   private String AV53Tmordmrwwds_7_tfommaqdsc_sel ;
   private String scmdbuf ;
   private String lV50Tmordmrwwds_4_tfommaqcod ;
   private String lV52Tmordmrwwds_6_tfommaqdsc ;
   private String A9445OMEst ;
   private String A9427OMMaqDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8PX2 ;
   private boolean n9427OMMaqDsc ;
   private boolean n9442OMMRCosT ;
   private boolean brk8PX4 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV22TFOMEst_SelsJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV47Tmordmrwwds_1_filterfulltext ;
   private String AV28Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08PX3_A396EmprCod ;
   private String[] P08PX3_A9426OMMaqCod ;
   private String[] P08PX3_A9427OMMaqDsc ;
   private boolean[] P08PX3_n9427OMMaqDsc ;
   private int[] P08PX3_A9425OMCod ;
   private String[] P08PX3_A9445OMEst ;
   private java.math.BigDecimal[] P08PX3_A9442OMMRCosT ;
   private boolean[] P08PX3_n9442OMMRCosT ;
   private String[] P08PX5_A9426OMMaqCod ;
   private String[] P08PX5_A396EmprCod ;
   private String[] P08PX5_A9427OMMaqDsc ;
   private boolean[] P08PX5_n9427OMMaqDsc ;
   private int[] P08PX5_A9425OMCod ;
   private String[] P08PX5_A9445OMEst ;
   private java.math.BigDecimal[] P08PX5_A9442OMMRCosT ;
   private boolean[] P08PX5_n9442OMMRCosT ;
   private GXSimpleCollection<String> AV23TFOMEst_Sels ;
   private GXSimpleCollection<String> AV56Tmordmrwwds_10_tfomest_sels ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class tmordmrwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV56Tmordmrwwds_10_tfomest_sels ,
                                          int AV48Tmordmrwwds_2_tfomcod ,
                                          int AV49Tmordmrwwds_3_tfomcod_to ,
                                          String AV51Tmordmrwwds_5_tfommaqcod_sel ,
                                          String AV50Tmordmrwwds_4_tfommaqcod ,
                                          String AV53Tmordmrwwds_7_tfommaqdsc_sel ,
                                          String AV52Tmordmrwwds_6_tfommaqdsc ,
                                          java.math.BigDecimal AV54Tmordmrwwds_8_tfommrcost ,
                                          java.math.BigDecimal AV55Tmordmrwwds_9_tfommrcost_to ,
                                          int AV56Tmordmrwwds_10_tfomest_sels_size ,
                                          int A9425OMCod ,
                                          String A9426OMMaqCod ,
                                          String A9427OMMaqDsc ,
                                          java.math.BigDecimal A9442OMMRCosT ,
                                          String AV47Tmordmrwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMMaqCod AS OMMaqCod, T2.MaqDsc AS OMMaqDsc, T1.OMCod, T1.OMEst, COALESCE( T3.OMMRCosT, 0) AS OMMRCosT FROM ((TXPMORDEN T1 INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod FROM TXPMOrMO" ;
      scmdbuf += " GROUP BY EmprCod, OMCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.OMCod = T1.OMCod)" ;
      if ( ! (0==AV48Tmordmrwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV49Tmordmrwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Tmordmrwwds_5_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Tmordmrwwds_4_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Tmordmrwwds_5_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Tmordmrwwds_7_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Tmordmrwwds_6_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tmordmrwwds_7_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Tmordmrwwds_8_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Tmordmrwwds_9_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV56Tmordmrwwds_10_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV56Tmordmrwwds_10_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.OMMaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08PX5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV56Tmordmrwwds_10_tfomest_sels ,
                                          int AV48Tmordmrwwds_2_tfomcod ,
                                          int AV49Tmordmrwwds_3_tfomcod_to ,
                                          String AV51Tmordmrwwds_5_tfommaqcod_sel ,
                                          String AV50Tmordmrwwds_4_tfommaqcod ,
                                          String AV53Tmordmrwwds_7_tfommaqdsc_sel ,
                                          String AV52Tmordmrwwds_6_tfommaqdsc ,
                                          java.math.BigDecimal AV54Tmordmrwwds_8_tfommrcost ,
                                          java.math.BigDecimal AV55Tmordmrwwds_9_tfommrcost_to ,
                                          int AV56Tmordmrwwds_10_tfomest_sels_size ,
                                          int A9425OMCod ,
                                          String A9426OMMaqCod ,
                                          String A9427OMMaqDsc ,
                                          java.math.BigDecimal A9442OMMRCosT ,
                                          String AV47Tmordmrwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[8];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.OMMaqCod AS OMMaqCod, T1.EmprCod, T2.MaqDsc AS OMMaqDsc, T1.OMCod, T1.OMEst, COALESCE( T3.OMMRCosT, 0) AS OMMRCosT FROM ((TXPMORDEN T1 INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod FROM TXPMOrMO" ;
      scmdbuf += " GROUP BY EmprCod, OMCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.OMCod = T1.OMCod)" ;
      if ( ! (0==AV48Tmordmrwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV49Tmordmrwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Tmordmrwwds_5_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Tmordmrwwds_4_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Tmordmrwwds_5_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Tmordmrwwds_7_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Tmordmrwwds_6_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tmordmrwwds_7_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Tmordmrwwds_8_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Tmordmrwwds_9_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV56Tmordmrwwds_10_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV56Tmordmrwwds_10_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.OMMaqCod" ;
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
                  return conditional_P08PX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P08PX5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PX5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 3);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 3);
               }
               return;
      }
   }

}

