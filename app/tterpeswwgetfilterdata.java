package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tterpeswwgetfilterdata extends GXProcedure
{
   public tterpeswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tterpeswwgetfilterdata.class ), "" );
   }

   public tterpeswwgetfilterdata( int remoteHandle ,
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
      tterpeswwgetfilterdata.this.aP5 = new String[] {""};
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
      tterpeswwgetfilterdata.this.AV22DDOName = aP0;
      tterpeswwgetfilterdata.this.AV20SearchTxt = aP1;
      tterpeswwgetfilterdata.this.AV21SearchTxtTo = aP2;
      tterpeswwgetfilterdata.this.aP3 = aP3;
      tterpeswwgetfilterdata.this.aP4 = aP4;
      tterpeswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_TERMCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADTERMCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_TERMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTERMDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_TERMPESPRO") == 0 )
      {
         /* Execute user subroutine: 'LOADTERMPESPROOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV33Session.getValue("TTERPESWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTERPESWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("TTERPESWWGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMCOD") == 0 )
         {
            AV10TFTermCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMCOD_SEL") == 0 )
         {
            AV11TFTermCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMDSC") == 0 )
         {
            AV12TFTermDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMDSC_SEL") == 0 )
         {
            AV13TFTermDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESTPO_SEL") == 0 )
         {
            AV18TFTermPesTpo_SelsJson = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV19TFTermPesTpo_Sels.fromJSonString(AV18TFTermPesTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESULT") == 0 )
         {
            AV40TFTermPesUlt = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV41TFTermPesUlt_To = GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESPRO") == 0 )
         {
            AV42TFTermPesPro = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPESPRO_SEL") == 0 )
         {
            AV43TFTermPesPro_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTERMPES_SEL") == 0 )
         {
            AV44TFTermPes_Sel = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTERMCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFTermCod = AV20SearchTxt ;
      AV11TFTermCod_Sel = "" ;
      AV49Tterpeswwds_1_filterfulltext = AV38FilterFullText ;
      AV50Tterpeswwds_2_tftermcod = AV10TFTermCod ;
      AV51Tterpeswwds_3_tftermcod_sel = AV11TFTermCod_Sel ;
      AV52Tterpeswwds_4_tftermdsc = AV12TFTermDsc ;
      AV53Tterpeswwds_5_tftermdsc_sel = AV13TFTermDsc_Sel ;
      AV54Tterpeswwds_6_tftermpestpo_sels = AV19TFTermPesTpo_Sels ;
      AV55Tterpeswwds_7_tftermpesult = AV40TFTermPesUlt ;
      AV56Tterpeswwds_8_tftermpesult_to = AV41TFTermPesUlt_To ;
      AV57Tterpeswwds_9_tftermpespro = AV42TFTermPesPro ;
      AV58Tterpeswwds_10_tftermpespro_sel = AV43TFTermPesPro_Sel ;
      AV59Tterpeswwds_11_tftermpes_sel = AV44TFTermPes_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A10177TermPesTpo ,
                                           AV54Tterpeswwds_6_tftermpestpo_sels ,
                                           AV51Tterpeswwds_3_tftermcod_sel ,
                                           AV50Tterpeswwds_2_tftermcod ,
                                           AV53Tterpeswwds_5_tftermdsc_sel ,
                                           AV52Tterpeswwds_4_tftermdsc ,
                                           Integer.valueOf(AV54Tterpeswwds_6_tftermpestpo_sels.size()) ,
                                           Long.valueOf(AV55Tterpeswwds_7_tftermpesult) ,
                                           Long.valueOf(AV56Tterpeswwds_8_tftermpesult_to) ,
                                           AV58Tterpeswwds_10_tftermpespro_sel ,
                                           AV57Tterpeswwds_9_tftermpespro ,
                                           Byte.valueOf(AV59Tterpeswwds_11_tftermpes_sel) ,
                                           A942TermCod ,
                                           A8898TermDsc ,
                                           Long.valueOf(A8901TermPesUlt) ,
                                           A8900TermPesPro ,
                                           Byte.valueOf(A8899TermPes) ,
                                           AV49Tterpeswwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV50Tterpeswwds_2_tftermcod = GXutil.padr( GXutil.rtrim( AV50Tterpeswwds_2_tftermcod), 10, "%") ;
      lV52Tterpeswwds_4_tftermdsc = GXutil.padr( GXutil.rtrim( AV52Tterpeswwds_4_tftermdsc), 30, "%") ;
      lV57Tterpeswwds_9_tftermpespro = GXutil.padr( GXutil.rtrim( AV57Tterpeswwds_9_tftermpespro), 20, "%") ;
      /* Using cursor P097I2 */
      pr_default.execute(0, new Object[] {lV50Tterpeswwds_2_tftermcod, AV51Tterpeswwds_3_tftermcod_sel, lV52Tterpeswwds_4_tftermdsc, AV53Tterpeswwds_5_tftermdsc_sel, Long.valueOf(AV55Tterpeswwds_7_tftermpesult), Long.valueOf(AV56Tterpeswwds_8_tftermpesult_to), lV57Tterpeswwds_9_tftermpespro, AV58Tterpeswwds_10_tftermpespro_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk97I2 = false ;
         A942TermCod = P097I2_A942TermCod[0] ;
         A8899TermPes = P097I2_A8899TermPes[0] ;
         n8899TermPes = P097I2_n8899TermPes[0] ;
         A8900TermPesPro = P097I2_A8900TermPesPro[0] ;
         A8901TermPesUlt = P097I2_A8901TermPesUlt[0] ;
         n8901TermPesUlt = P097I2_n8901TermPesUlt[0] ;
         A8898TermDsc = P097I2_A8898TermDsc[0] ;
         n8898TermDsc = P097I2_n8898TermDsc[0] ;
         A10177TermPesTpo = P097I2_A10177TermPesTpo[0] ;
         n10177TermPesTpo = P097I2_n10177TermPesTpo[0] ;
         A8899TermPes = P097I2_A8899TermPes[0] ;
         n8899TermPes = P097I2_n8899TermPes[0] ;
         A8898TermDsc = P097I2_A8898TermDsc[0] ;
         n8898TermDsc = P097I2_n8898TermDsc[0] ;
         if ( (GXutil.strcmp("", AV49Tterpeswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A942TermCod) , GXutil.padr( "%" + GXutil.upper( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8898TermDsc) , GXutil.padr( "%" + GXutil.upper( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "colorantes", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "auxiliares", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "todos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A8901TermPesUlt, 10, 0) , GXutil.padr( "%" + AV49Tterpeswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8900TermPesPro) , GXutil.padr( "%" + GXutil.upper( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P097I2_A942TermCod[0], A942TermCod) == 0 ) )
            {
               brk97I2 = false ;
               A8900TermPesPro = P097I2_A8900TermPesPro[0] ;
               AV32count = (long)(AV32count+1) ;
               brk97I2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A942TermCod)==0) )
            {
               AV24Option = A942TermCod ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk97I2 )
         {
            brk97I2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTERMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTermDsc = AV20SearchTxt ;
      AV13TFTermDsc_Sel = "" ;
      AV49Tterpeswwds_1_filterfulltext = AV38FilterFullText ;
      AV50Tterpeswwds_2_tftermcod = AV10TFTermCod ;
      AV51Tterpeswwds_3_tftermcod_sel = AV11TFTermCod_Sel ;
      AV52Tterpeswwds_4_tftermdsc = AV12TFTermDsc ;
      AV53Tterpeswwds_5_tftermdsc_sel = AV13TFTermDsc_Sel ;
      AV54Tterpeswwds_6_tftermpestpo_sels = AV19TFTermPesTpo_Sels ;
      AV55Tterpeswwds_7_tftermpesult = AV40TFTermPesUlt ;
      AV56Tterpeswwds_8_tftermpesult_to = AV41TFTermPesUlt_To ;
      AV57Tterpeswwds_9_tftermpespro = AV42TFTermPesPro ;
      AV58Tterpeswwds_10_tftermpespro_sel = AV43TFTermPesPro_Sel ;
      AV59Tterpeswwds_11_tftermpes_sel = AV44TFTermPes_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A10177TermPesTpo ,
                                           AV54Tterpeswwds_6_tftermpestpo_sels ,
                                           AV51Tterpeswwds_3_tftermcod_sel ,
                                           AV50Tterpeswwds_2_tftermcod ,
                                           AV53Tterpeswwds_5_tftermdsc_sel ,
                                           AV52Tterpeswwds_4_tftermdsc ,
                                           Integer.valueOf(AV54Tterpeswwds_6_tftermpestpo_sels.size()) ,
                                           Long.valueOf(AV55Tterpeswwds_7_tftermpesult) ,
                                           Long.valueOf(AV56Tterpeswwds_8_tftermpesult_to) ,
                                           AV58Tterpeswwds_10_tftermpespro_sel ,
                                           AV57Tterpeswwds_9_tftermpespro ,
                                           Byte.valueOf(AV59Tterpeswwds_11_tftermpes_sel) ,
                                           A942TermCod ,
                                           A8898TermDsc ,
                                           Long.valueOf(A8901TermPesUlt) ,
                                           A8900TermPesPro ,
                                           Byte.valueOf(A8899TermPes) ,
                                           AV49Tterpeswwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV50Tterpeswwds_2_tftermcod = GXutil.padr( GXutil.rtrim( AV50Tterpeswwds_2_tftermcod), 10, "%") ;
      lV52Tterpeswwds_4_tftermdsc = GXutil.padr( GXutil.rtrim( AV52Tterpeswwds_4_tftermdsc), 30, "%") ;
      lV57Tterpeswwds_9_tftermpespro = GXutil.padr( GXutil.rtrim( AV57Tterpeswwds_9_tftermpespro), 20, "%") ;
      /* Using cursor P097I3 */
      pr_default.execute(1, new Object[] {lV50Tterpeswwds_2_tftermcod, AV51Tterpeswwds_3_tftermcod_sel, lV52Tterpeswwds_4_tftermdsc, AV53Tterpeswwds_5_tftermdsc_sel, Long.valueOf(AV55Tterpeswwds_7_tftermpesult), Long.valueOf(AV56Tterpeswwds_8_tftermpesult_to), lV57Tterpeswwds_9_tftermpespro, AV58Tterpeswwds_10_tftermpespro_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk97I4 = false ;
         A942TermCod = P097I3_A942TermCod[0] ;
         A8899TermPes = P097I3_A8899TermPes[0] ;
         n8899TermPes = P097I3_n8899TermPes[0] ;
         A8900TermPesPro = P097I3_A8900TermPesPro[0] ;
         A8901TermPesUlt = P097I3_A8901TermPesUlt[0] ;
         n8901TermPesUlt = P097I3_n8901TermPesUlt[0] ;
         A8898TermDsc = P097I3_A8898TermDsc[0] ;
         n8898TermDsc = P097I3_n8898TermDsc[0] ;
         A10177TermPesTpo = P097I3_A10177TermPesTpo[0] ;
         n10177TermPesTpo = P097I3_n10177TermPesTpo[0] ;
         A8899TermPes = P097I3_A8899TermPes[0] ;
         n8899TermPes = P097I3_n8899TermPes[0] ;
         A8898TermDsc = P097I3_A8898TermDsc[0] ;
         n8898TermDsc = P097I3_n8898TermDsc[0] ;
         if ( (GXutil.strcmp("", AV49Tterpeswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A942TermCod) , GXutil.padr( "%" + GXutil.upper( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8898TermDsc) , GXutil.padr( "%" + GXutil.upper( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "colorantes", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "auxiliares", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "todos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A8901TermPesUlt, 10, 0) , GXutil.padr( "%" + AV49Tterpeswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8900TermPesPro) , GXutil.padr( "%" + GXutil.upper( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P097I3_A942TermCod[0], A942TermCod) == 0 ) )
            {
               brk97I4 = false ;
               A8900TermPesPro = P097I3_A8900TermPesPro[0] ;
               AV32count = (long)(AV32count+1) ;
               brk97I4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A8898TermDsc)==0) )
            {
               AV24Option = A8898TermDsc ;
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
         }
         if ( ! brk97I4 )
         {
            brk97I4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADTERMPESPROOPTIONS' Routine */
      returnInSub = false ;
      AV42TFTermPesPro = AV20SearchTxt ;
      AV43TFTermPesPro_Sel = "" ;
      AV49Tterpeswwds_1_filterfulltext = AV38FilterFullText ;
      AV50Tterpeswwds_2_tftermcod = AV10TFTermCod ;
      AV51Tterpeswwds_3_tftermcod_sel = AV11TFTermCod_Sel ;
      AV52Tterpeswwds_4_tftermdsc = AV12TFTermDsc ;
      AV53Tterpeswwds_5_tftermdsc_sel = AV13TFTermDsc_Sel ;
      AV54Tterpeswwds_6_tftermpestpo_sels = AV19TFTermPesTpo_Sels ;
      AV55Tterpeswwds_7_tftermpesult = AV40TFTermPesUlt ;
      AV56Tterpeswwds_8_tftermpesult_to = AV41TFTermPesUlt_To ;
      AV57Tterpeswwds_9_tftermpespro = AV42TFTermPesPro ;
      AV58Tterpeswwds_10_tftermpespro_sel = AV43TFTermPesPro_Sel ;
      AV59Tterpeswwds_11_tftermpes_sel = AV44TFTermPes_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A10177TermPesTpo ,
                                           AV54Tterpeswwds_6_tftermpestpo_sels ,
                                           AV51Tterpeswwds_3_tftermcod_sel ,
                                           AV50Tterpeswwds_2_tftermcod ,
                                           AV53Tterpeswwds_5_tftermdsc_sel ,
                                           AV52Tterpeswwds_4_tftermdsc ,
                                           Integer.valueOf(AV54Tterpeswwds_6_tftermpestpo_sels.size()) ,
                                           Long.valueOf(AV55Tterpeswwds_7_tftermpesult) ,
                                           Long.valueOf(AV56Tterpeswwds_8_tftermpesult_to) ,
                                           AV58Tterpeswwds_10_tftermpespro_sel ,
                                           AV57Tterpeswwds_9_tftermpespro ,
                                           Byte.valueOf(AV59Tterpeswwds_11_tftermpes_sel) ,
                                           A942TermCod ,
                                           A8898TermDsc ,
                                           Long.valueOf(A8901TermPesUlt) ,
                                           A8900TermPesPro ,
                                           Byte.valueOf(A8899TermPes) ,
                                           AV49Tterpeswwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV50Tterpeswwds_2_tftermcod = GXutil.padr( GXutil.rtrim( AV50Tterpeswwds_2_tftermcod), 10, "%") ;
      lV52Tterpeswwds_4_tftermdsc = GXutil.padr( GXutil.rtrim( AV52Tterpeswwds_4_tftermdsc), 30, "%") ;
      lV57Tterpeswwds_9_tftermpespro = GXutil.padr( GXutil.rtrim( AV57Tterpeswwds_9_tftermpespro), 20, "%") ;
      /* Using cursor P097I4 */
      pr_default.execute(2, new Object[] {lV50Tterpeswwds_2_tftermcod, AV51Tterpeswwds_3_tftermcod_sel, lV52Tterpeswwds_4_tftermdsc, AV53Tterpeswwds_5_tftermdsc_sel, Long.valueOf(AV55Tterpeswwds_7_tftermpesult), Long.valueOf(AV56Tterpeswwds_8_tftermpesult_to), lV57Tterpeswwds_9_tftermpespro, AV58Tterpeswwds_10_tftermpespro_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk97I6 = false ;
         A8900TermPesPro = P097I4_A8900TermPesPro[0] ;
         A8899TermPes = P097I4_A8899TermPes[0] ;
         n8899TermPes = P097I4_n8899TermPes[0] ;
         A8901TermPesUlt = P097I4_A8901TermPesUlt[0] ;
         n8901TermPesUlt = P097I4_n8901TermPesUlt[0] ;
         A8898TermDsc = P097I4_A8898TermDsc[0] ;
         n8898TermDsc = P097I4_n8898TermDsc[0] ;
         A942TermCod = P097I4_A942TermCod[0] ;
         A10177TermPesTpo = P097I4_A10177TermPesTpo[0] ;
         n10177TermPesTpo = P097I4_n10177TermPesTpo[0] ;
         A8899TermPes = P097I4_A8899TermPes[0] ;
         n8899TermPes = P097I4_n8899TermPes[0] ;
         A8898TermDsc = P097I4_A8898TermDsc[0] ;
         n8898TermDsc = P097I4_n8898TermDsc[0] ;
         if ( (GXutil.strcmp("", AV49Tterpeswwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A942TermCod) , GXutil.padr( "%" + GXutil.upper( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8898TermDsc) , GXutil.padr( "%" + GXutil.upper( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "colorantes", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "auxiliares", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "todos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A10177TermPesTpo, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A8901TermPesUlt, 10, 0) , GXutil.padr( "%" + AV49Tterpeswwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8900TermPesPro) , GXutil.padr( "%" + GXutil.upper( AV49Tterpeswwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P097I4_A8900TermPesPro[0], A8900TermPesPro) == 0 ) )
            {
               brk97I6 = false ;
               A942TermCod = P097I4_A942TermCod[0] ;
               AV32count = (long)(AV32count+1) ;
               brk97I6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A8900TermPesPro)==0) )
            {
               AV24Option = A8900TermPesPro ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk97I6 )
         {
            brk97I6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tterpeswwgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = tterpeswwgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = tterpeswwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV38FilterFullText = "" ;
      AV10TFTermCod = "" ;
      AV11TFTermCod_Sel = "" ;
      AV12TFTermDsc = "" ;
      AV13TFTermDsc_Sel = "" ;
      AV18TFTermPesTpo_SelsJson = "" ;
      AV19TFTermPesTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42TFTermPesPro = "" ;
      AV43TFTermPesPro_Sel = "" ;
      A942TermCod = "" ;
      AV49Tterpeswwds_1_filterfulltext = "" ;
      AV50Tterpeswwds_2_tftermcod = "" ;
      AV51Tterpeswwds_3_tftermcod_sel = "" ;
      AV52Tterpeswwds_4_tftermdsc = "" ;
      AV53Tterpeswwds_5_tftermdsc_sel = "" ;
      AV54Tterpeswwds_6_tftermpestpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV57Tterpeswwds_9_tftermpespro = "" ;
      AV58Tterpeswwds_10_tftermpespro_sel = "" ;
      lV49Tterpeswwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV50Tterpeswwds_2_tftermcod = "" ;
      lV52Tterpeswwds_4_tftermdsc = "" ;
      lV57Tterpeswwds_9_tftermpespro = "" ;
      A10177TermPesTpo = "" ;
      A8898TermDsc = "" ;
      A8900TermPesPro = "" ;
      P097I2_A942TermCod = new String[] {""} ;
      P097I2_A8899TermPes = new byte[1] ;
      P097I2_n8899TermPes = new boolean[] {false} ;
      P097I2_A8900TermPesPro = new String[] {""} ;
      P097I2_A8901TermPesUlt = new long[1] ;
      P097I2_n8901TermPesUlt = new boolean[] {false} ;
      P097I2_A8898TermDsc = new String[] {""} ;
      P097I2_n8898TermDsc = new boolean[] {false} ;
      P097I2_A10177TermPesTpo = new String[] {""} ;
      P097I2_n10177TermPesTpo = new boolean[] {false} ;
      AV24Option = "" ;
      P097I3_A942TermCod = new String[] {""} ;
      P097I3_A8899TermPes = new byte[1] ;
      P097I3_n8899TermPes = new boolean[] {false} ;
      P097I3_A8900TermPesPro = new String[] {""} ;
      P097I3_A8901TermPesUlt = new long[1] ;
      P097I3_n8901TermPesUlt = new boolean[] {false} ;
      P097I3_A8898TermDsc = new String[] {""} ;
      P097I3_n8898TermDsc = new boolean[] {false} ;
      P097I3_A10177TermPesTpo = new String[] {""} ;
      P097I3_n10177TermPesTpo = new boolean[] {false} ;
      P097I4_A8900TermPesPro = new String[] {""} ;
      P097I4_A8899TermPes = new byte[1] ;
      P097I4_n8899TermPes = new boolean[] {false} ;
      P097I4_A8901TermPesUlt = new long[1] ;
      P097I4_n8901TermPesUlt = new boolean[] {false} ;
      P097I4_A8898TermDsc = new String[] {""} ;
      P097I4_n8898TermDsc = new boolean[] {false} ;
      P097I4_A942TermCod = new String[] {""} ;
      P097I4_A10177TermPesTpo = new String[] {""} ;
      P097I4_n10177TermPesTpo = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tterpeswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P097I2_A942TermCod, P097I2_A8899TermPes, P097I2_n8899TermPes, P097I2_A8900TermPesPro, P097I2_A8901TermPesUlt, P097I2_n8901TermPesUlt, P097I2_A8898TermDsc, P097I2_n8898TermDsc, P097I2_A10177TermPesTpo, P097I2_n10177TermPesTpo
            }
            , new Object[] {
            P097I3_A942TermCod, P097I3_A8899TermPes, P097I3_n8899TermPes, P097I3_A8900TermPesPro, P097I3_A8901TermPesUlt, P097I3_n8901TermPesUlt, P097I3_A8898TermDsc, P097I3_n8898TermDsc, P097I3_A10177TermPesTpo, P097I3_n10177TermPesTpo
            }
            , new Object[] {
            P097I4_A8900TermPesPro, P097I4_A8899TermPes, P097I4_n8899TermPes, P097I4_A8901TermPesUlt, P097I4_n8901TermPesUlt, P097I4_A8898TermDsc, P097I4_n8898TermDsc, P097I4_A942TermCod, P097I4_A10177TermPesTpo, P097I4_n10177TermPesTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44TFTermPes_Sel ;
   private byte AV59Tterpeswwds_11_tftermpes_sel ;
   private byte A8899TermPes ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV54Tterpeswwds_6_tftermpestpo_sels_size ;
   private int AV23InsertIndex ;
   private long AV40TFTermPesUlt ;
   private long AV41TFTermPesUlt_To ;
   private long AV55Tterpeswwds_7_tftermpesult ;
   private long AV56Tterpeswwds_8_tftermpesult_to ;
   private long A8901TermPesUlt ;
   private long AV32count ;
   private String AV10TFTermCod ;
   private String AV11TFTermCod_Sel ;
   private String AV12TFTermDsc ;
   private String AV13TFTermDsc_Sel ;
   private String AV42TFTermPesPro ;
   private String AV43TFTermPesPro_Sel ;
   private String A942TermCod ;
   private String AV50Tterpeswwds_2_tftermcod ;
   private String AV51Tterpeswwds_3_tftermcod_sel ;
   private String AV52Tterpeswwds_4_tftermdsc ;
   private String AV53Tterpeswwds_5_tftermdsc_sel ;
   private String AV57Tterpeswwds_9_tftermpespro ;
   private String AV58Tterpeswwds_10_tftermpespro_sel ;
   private String scmdbuf ;
   private String lV50Tterpeswwds_2_tftermcod ;
   private String lV52Tterpeswwds_4_tftermdsc ;
   private String lV57Tterpeswwds_9_tftermpespro ;
   private String A10177TermPesTpo ;
   private String A8898TermDsc ;
   private String A8900TermPesPro ;
   private boolean returnInSub ;
   private boolean brk97I2 ;
   private boolean n8899TermPes ;
   private boolean n8901TermPesUlt ;
   private boolean n8898TermDsc ;
   private boolean n10177TermPesTpo ;
   private boolean brk97I4 ;
   private boolean brk97I6 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV18TFTermPesTpo_SelsJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV49Tterpeswwds_1_filterfulltext ;
   private String lV49Tterpeswwds_1_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P097I2_A942TermCod ;
   private byte[] P097I2_A8899TermPes ;
   private boolean[] P097I2_n8899TermPes ;
   private String[] P097I2_A8900TermPesPro ;
   private long[] P097I2_A8901TermPesUlt ;
   private boolean[] P097I2_n8901TermPesUlt ;
   private String[] P097I2_A8898TermDsc ;
   private boolean[] P097I2_n8898TermDsc ;
   private String[] P097I2_A10177TermPesTpo ;
   private boolean[] P097I2_n10177TermPesTpo ;
   private String[] P097I3_A942TermCod ;
   private byte[] P097I3_A8899TermPes ;
   private boolean[] P097I3_n8899TermPes ;
   private String[] P097I3_A8900TermPesPro ;
   private long[] P097I3_A8901TermPesUlt ;
   private boolean[] P097I3_n8901TermPesUlt ;
   private String[] P097I3_A8898TermDsc ;
   private boolean[] P097I3_n8898TermDsc ;
   private String[] P097I3_A10177TermPesTpo ;
   private boolean[] P097I3_n10177TermPesTpo ;
   private String[] P097I4_A8900TermPesPro ;
   private byte[] P097I4_A8899TermPes ;
   private boolean[] P097I4_n8899TermPes ;
   private long[] P097I4_A8901TermPesUlt ;
   private boolean[] P097I4_n8901TermPesUlt ;
   private String[] P097I4_A8898TermDsc ;
   private boolean[] P097I4_n8898TermDsc ;
   private String[] P097I4_A942TermCod ;
   private String[] P097I4_A10177TermPesTpo ;
   private boolean[] P097I4_n10177TermPesTpo ;
   private GXSimpleCollection<String> AV19TFTermPesTpo_Sels ;
   private GXSimpleCollection<String> AV54Tterpeswwds_6_tftermpestpo_sels ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class tterpeswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A10177TermPesTpo ,
                                          GXSimpleCollection<String> AV54Tterpeswwds_6_tftermpestpo_sels ,
                                          String AV51Tterpeswwds_3_tftermcod_sel ,
                                          String AV50Tterpeswwds_2_tftermcod ,
                                          String AV53Tterpeswwds_5_tftermdsc_sel ,
                                          String AV52Tterpeswwds_4_tftermdsc ,
                                          int AV54Tterpeswwds_6_tftermpestpo_sels_size ,
                                          long AV55Tterpeswwds_7_tftermpesult ,
                                          long AV56Tterpeswwds_8_tftermpesult_to ,
                                          String AV58Tterpeswwds_10_tftermpespro_sel ,
                                          String AV57Tterpeswwds_9_tftermpespro ,
                                          byte AV59Tterpeswwds_11_tftermpes_sel ,
                                          String A942TermCod ,
                                          String A8898TermDsc ,
                                          long A8901TermPesUlt ,
                                          String A8900TermPesPro ,
                                          byte A8899TermPes ,
                                          String AV49Tterpeswwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.TermCod, T2.TermPes, T1.TermPesPro, T1.TermPesUlt, T2.TermDsc, T1.TermPesTpo FROM (TXPTERMI1 T1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = T1.TermCod)" ;
      if ( (GXutil.strcmp("", AV51Tterpeswwds_3_tftermcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Tterpeswwds_2_tftermcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Tterpeswwds_3_tftermcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Tterpeswwds_5_tftermdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Tterpeswwds_4_tftermdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TermDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tterpeswwds_5_tftermdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TermDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV54Tterpeswwds_6_tftermpestpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Tterpeswwds_6_tftermpestpo_sels, "T1.TermPesTpo IN (", ")")+")");
      }
      if ( ! (0==AV55Tterpeswwds_7_tftermpesult) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV56Tterpeswwds_8_tftermpesult_to) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tterpeswwds_10_tftermpespro_sel)==0) && ( ! (GXutil.strcmp("", AV57Tterpeswwds_9_tftermpespro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermPesPro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tterpeswwds_10_tftermpespro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermPesPro = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV59Tterpeswwds_11_tftermpes_sel == 1 )
      {
         addWhere(sWhereString, "(T2.TermPes = 1)");
      }
      if ( AV59Tterpeswwds_11_tftermpes_sel == 2 )
      {
         addWhere(sWhereString, "(T2.TermPes = 0)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.TermCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P097I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A10177TermPesTpo ,
                                          GXSimpleCollection<String> AV54Tterpeswwds_6_tftermpestpo_sels ,
                                          String AV51Tterpeswwds_3_tftermcod_sel ,
                                          String AV50Tterpeswwds_2_tftermcod ,
                                          String AV53Tterpeswwds_5_tftermdsc_sel ,
                                          String AV52Tterpeswwds_4_tftermdsc ,
                                          int AV54Tterpeswwds_6_tftermpestpo_sels_size ,
                                          long AV55Tterpeswwds_7_tftermpesult ,
                                          long AV56Tterpeswwds_8_tftermpesult_to ,
                                          String AV58Tterpeswwds_10_tftermpespro_sel ,
                                          String AV57Tterpeswwds_9_tftermpespro ,
                                          byte AV59Tterpeswwds_11_tftermpes_sel ,
                                          String A942TermCod ,
                                          String A8898TermDsc ,
                                          long A8901TermPesUlt ,
                                          String A8900TermPesPro ,
                                          byte A8899TermPes ,
                                          String AV49Tterpeswwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[8];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.TermCod, T2.TermPes, T1.TermPesPro, T1.TermPesUlt, T2.TermDsc, T1.TermPesTpo FROM (TXPTERMI1 T1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = T1.TermCod)" ;
      if ( (GXutil.strcmp("", AV51Tterpeswwds_3_tftermcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Tterpeswwds_2_tftermcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Tterpeswwds_3_tftermcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermCod = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Tterpeswwds_5_tftermdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Tterpeswwds_4_tftermdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TermDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tterpeswwds_5_tftermdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TermDsc = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( AV54Tterpeswwds_6_tftermpestpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Tterpeswwds_6_tftermpestpo_sels, "T1.TermPesTpo IN (", ")")+")");
      }
      if ( ! (0==AV55Tterpeswwds_7_tftermpesult) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV56Tterpeswwds_8_tftermpesult_to) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tterpeswwds_10_tftermpespro_sel)==0) && ( ! (GXutil.strcmp("", AV57Tterpeswwds_9_tftermpespro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermPesPro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tterpeswwds_10_tftermpespro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermPesPro = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV59Tterpeswwds_11_tftermpes_sel == 1 )
      {
         addWhere(sWhereString, "(T2.TermPes = 1)");
      }
      if ( AV59Tterpeswwds_11_tftermpes_sel == 2 )
      {
         addWhere(sWhereString, "(T2.TermPes = 0)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.TermCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P097I4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A10177TermPesTpo ,
                                          GXSimpleCollection<String> AV54Tterpeswwds_6_tftermpestpo_sels ,
                                          String AV51Tterpeswwds_3_tftermcod_sel ,
                                          String AV50Tterpeswwds_2_tftermcod ,
                                          String AV53Tterpeswwds_5_tftermdsc_sel ,
                                          String AV52Tterpeswwds_4_tftermdsc ,
                                          int AV54Tterpeswwds_6_tftermpestpo_sels_size ,
                                          long AV55Tterpeswwds_7_tftermpesult ,
                                          long AV56Tterpeswwds_8_tftermpesult_to ,
                                          String AV58Tterpeswwds_10_tftermpespro_sel ,
                                          String AV57Tterpeswwds_9_tftermpespro ,
                                          byte AV59Tterpeswwds_11_tftermpes_sel ,
                                          String A942TermCod ,
                                          String A8898TermDsc ,
                                          long A8901TermPesUlt ,
                                          String A8900TermPesPro ,
                                          byte A8899TermPes ,
                                          String AV49Tterpeswwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[8];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.TermPesPro, T2.TermPes, T1.TermPesUlt, T2.TermDsc, T1.TermCod, T1.TermPesTpo FROM (TXPTERMI1 T1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = T1.TermCod)" ;
      if ( (GXutil.strcmp("", AV51Tterpeswwds_3_tftermcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Tterpeswwds_2_tftermcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Tterpeswwds_3_tftermcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Tterpeswwds_5_tftermdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Tterpeswwds_4_tftermdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TermDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tterpeswwds_5_tftermdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TermDsc = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( AV54Tterpeswwds_6_tftermpestpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Tterpeswwds_6_tftermpestpo_sels, "T1.TermPesTpo IN (", ")")+")");
      }
      if ( ! (0==AV55Tterpeswwds_7_tftermpesult) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV56Tterpeswwds_8_tftermpesult_to) )
      {
         addWhere(sWhereString, "(T1.TermPesUlt <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tterpeswwds_10_tftermpespro_sel)==0) && ( ! (GXutil.strcmp("", AV57Tterpeswwds_9_tftermpespro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TermPesPro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tterpeswwds_10_tftermpespro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TermPesPro = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV59Tterpeswwds_11_tftermpes_sel == 1 )
      {
         addWhere(sWhereString, "(T2.TermPes = 1)");
      }
      if ( AV59Tterpeswwds_11_tftermpes_sel == 2 )
      {
         addWhere(sWhereString, "(T2.TermPes = 0)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.TermPesPro" ;
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
                  return conditional_P097I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] );
            case 1 :
                  return conditional_P097I3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] );
            case 2 :
                  return conditional_P097I4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097I4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[8], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               return;
      }
   }

}

