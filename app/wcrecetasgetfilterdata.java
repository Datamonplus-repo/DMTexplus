package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcrecetasgetfilterdata extends GXProcedure
{
   public wcrecetasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrecetasgetfilterdata.class ), "" );
   }

   public wcrecetasgetfilterdata( int remoteHandle ,
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
      wcrecetasgetfilterdata.this.aP5 = new String[] {""};
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
      wcrecetasgetfilterdata.this.AV20DDOName = aP0;
      wcrecetasgetfilterdata.this.AV18SearchTxt = aP1;
      wcrecetasgetfilterdata.this.AV19SearchTxtTo = aP2;
      wcrecetasgetfilterdata.this.aP3 = aP3;
      wcrecetasgetfilterdata.this.aP4 = aP4;
      wcrecetasgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_RECLINUSR") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLINUSROPTIONS' */
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
      if ( GXutil.strcmp(AV31Session.getValue("WCRecetasGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRecetasGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WCRecetasGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV12TFRecFecAlt = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV13TFRecFecAlt_To = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR") == 0 )
         {
            AV14TFRecLinUsr = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR_SEL") == 0 )
         {
            AV15TFRecLinUsr_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPESFEC") == 0 )
         {
            AV16TFRecPesFec = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV17TFRecPesFec_To = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV37Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV38Prdnum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV18SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV45Core_wcrecetasds_1_filterfulltext = AV36FilterFullText ;
      AV46Core_wcrecetasds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV47Core_wcrecetasds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV48Core_wcrecetasds_4_tfrecfecalt = AV12TFRecFecAlt ;
      AV49Core_wcrecetasds_5_tfrecfecalt_to = AV13TFRecFecAlt_To ;
      AV50Core_wcrecetasds_6_tfreclinusr = AV14TFRecLinUsr ;
      AV51Core_wcrecetasds_7_tfreclinusr_sel = AV15TFRecLinUsr_Sel ;
      AV52Core_wcrecetasds_8_tfrecpesfec = AV16TFRecPesFec ;
      AV53Core_wcrecetasds_9_tfrecpesfec_to = AV17TFRecPesFec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV45Core_wcrecetasds_1_filterfulltext ,
                                           AV47Core_wcrecetasds_3_tfbarnhdr_sel ,
                                           AV46Core_wcrecetasds_2_tfbarnhdr ,
                                           AV48Core_wcrecetasds_4_tfrecfecalt ,
                                           AV49Core_wcrecetasds_5_tfrecfecalt_to ,
                                           AV51Core_wcrecetasds_7_tfreclinusr_sel ,
                                           AV50Core_wcrecetasds_6_tfreclinusr ,
                                           AV52Core_wcrecetasds_8_tfrecpesfec ,
                                           AV53Core_wcrecetasds_9_tfrecpesfec_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4576RecLinUsr ,
                                           A4866RecFecAlt ,
                                           AV38Prdnum ,
                                           AV37Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV46Core_wcrecetasds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV46Core_wcrecetasds_2_tfbarnhdr), 11, "%") ;
      /* Using cursor P08WK2 */
      pr_default.execute(0, new Object[] {AV37Emprcod, lV46Core_wcrecetasds_2_tfbarnhdr, AV47Core_wcrecetasds_3_tfbarnhdr_sel, AV48Core_wcrecetasds_4_tfrecfecalt, AV49Core_wcrecetasds_5_tfrecfecalt_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P08WK2_A2804RecLinMaq[0] ;
         A396EmprCod = P08WK2_A396EmprCod[0] ;
         A4866RecFecAlt = P08WK2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P08WK2_n4866RecFecAlt[0] ;
         A130BarCodPar = P08WK2_A130BarCodPar[0] ;
         A132BarCodReo = P08WK2_A132BarCodReo[0] ;
         A129BarCod = P08WK2_A129BarCod[0] ;
         A1273RecLinPro = P08WK2_A1273RecLinPro[0] ;
         A4866RecFecAlt = P08WK2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P08WK2_n4866RecFecAlt[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV22Option = A13696BarNHdr ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECLINUSROPTIONS' Routine */
      returnInSub = false ;
      AV14TFRecLinUsr = AV18SearchTxt ;
      AV15TFRecLinUsr_Sel = "" ;
      AV45Core_wcrecetasds_1_filterfulltext = AV36FilterFullText ;
      AV46Core_wcrecetasds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV47Core_wcrecetasds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV48Core_wcrecetasds_4_tfrecfecalt = AV12TFRecFecAlt ;
      AV49Core_wcrecetasds_5_tfrecfecalt_to = AV13TFRecFecAlt_To ;
      AV50Core_wcrecetasds_6_tfreclinusr = AV14TFRecLinUsr ;
      AV51Core_wcrecetasds_7_tfreclinusr_sel = AV15TFRecLinUsr_Sel ;
      AV52Core_wcrecetasds_8_tfrecpesfec = AV16TFRecPesFec ;
      AV53Core_wcrecetasds_9_tfrecpesfec_to = AV17TFRecPesFec_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV45Core_wcrecetasds_1_filterfulltext ,
                                           AV47Core_wcrecetasds_3_tfbarnhdr_sel ,
                                           AV46Core_wcrecetasds_2_tfbarnhdr ,
                                           AV48Core_wcrecetasds_4_tfrecfecalt ,
                                           AV49Core_wcrecetasds_5_tfrecfecalt_to ,
                                           AV51Core_wcrecetasds_7_tfreclinusr_sel ,
                                           AV50Core_wcrecetasds_6_tfreclinusr ,
                                           AV52Core_wcrecetasds_8_tfrecpesfec ,
                                           AV53Core_wcrecetasds_9_tfrecpesfec_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4576RecLinUsr ,
                                           A4866RecFecAlt ,
                                           A396EmprCod ,
                                           AV37Emprcod ,
                                           AV38Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV46Core_wcrecetasds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV46Core_wcrecetasds_2_tfbarnhdr), 11, "%") ;
      /* Using cursor P08WK3 */
      pr_default.execute(1, new Object[] {AV37Emprcod, lV46Core_wcrecetasds_2_tfbarnhdr, AV47Core_wcrecetasds_3_tfbarnhdr_sel, AV48Core_wcrecetasds_4_tfrecfecalt, AV49Core_wcrecetasds_5_tfrecfecalt_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8WK3 = false ;
         A2804RecLinMaq = P08WK3_A2804RecLinMaq[0] ;
         A396EmprCod = P08WK3_A396EmprCod[0] ;
         A4866RecFecAlt = P08WK3_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P08WK3_n4866RecFecAlt[0] ;
         A130BarCodPar = P08WK3_A130BarCodPar[0] ;
         A132BarCodReo = P08WK3_A132BarCodReo[0] ;
         A129BarCod = P08WK3_A129BarCod[0] ;
         A1273RecLinPro = P08WK3_A1273RecLinPro[0] ;
         A4866RecFecAlt = P08WK3_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P08WK3_n4866RecFecAlt[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk8WK3 = false ;
            A2804RecLinMaq = P08WK3_A2804RecLinMaq[0] ;
            A396EmprCod = P08WK3_A396EmprCod[0] ;
            A130BarCodPar = P08WK3_A130BarCodPar[0] ;
            A132BarCodReo = P08WK3_A132BarCodReo[0] ;
            A129BarCod = P08WK3_A129BarCod[0] ;
            A1273RecLinPro = P08WK3_A1273RecLinPro[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8WK3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4576RecLinUsr)==0) )
         {
            AV22Option = A4576RecLinUsr ;
            AV25OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!"))) ;
            AV23Options.add(AV22Option, 0);
            AV26OptionsDesc.add(AV25OptionDesc, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WK3 )
         {
            brk8WK3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcrecetasgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = wcrecetasgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = wcrecetasgetfilterdata.this.AV29OptionIndexesJson;
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
      AV36FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV12TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV13TFRecFecAlt_To = GXutil.resetTime( GXutil.nullDate() );
      AV14TFRecLinUsr = "" ;
      AV15TFRecLinUsr_Sel = "" ;
      AV16TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      AV17TFRecPesFec_To = GXutil.resetTime( GXutil.nullDate() );
      AV37Emprcod = "" ;
      AV38Prdnum = "" ;
      A13696BarNHdr = "" ;
      AV45Core_wcrecetasds_1_filterfulltext = "" ;
      AV46Core_wcrecetasds_2_tfbarnhdr = "" ;
      AV47Core_wcrecetasds_3_tfbarnhdr_sel = "" ;
      AV48Core_wcrecetasds_4_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV49Core_wcrecetasds_5_tfrecfecalt_to = GXutil.resetTime( GXutil.nullDate() );
      AV50Core_wcrecetasds_6_tfreclinusr = "" ;
      AV51Core_wcrecetasds_7_tfreclinusr_sel = "" ;
      AV52Core_wcrecetasds_8_tfrecpesfec = GXutil.resetTime( GXutil.nullDate() );
      AV53Core_wcrecetasds_9_tfrecpesfec_to = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV46Core_wcrecetasds_2_tfbarnhdr = "" ;
      A130BarCodPar = "" ;
      A4576RecLinUsr = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P08WK2_A2804RecLinMaq = new short[1] ;
      P08WK2_A396EmprCod = new String[] {""} ;
      P08WK2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08WK2_n4866RecFecAlt = new boolean[] {false} ;
      P08WK2_A130BarCodPar = new String[] {""} ;
      P08WK2_A132BarCodReo = new byte[1] ;
      P08WK2_A129BarCod = new int[1] ;
      P08WK2_A1273RecLinPro = new byte[1] ;
      AV22Option = "" ;
      P08WK3_A2804RecLinMaq = new short[1] ;
      P08WK3_A396EmprCod = new String[] {""} ;
      P08WK3_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08WK3_n4866RecFecAlt = new boolean[] {false} ;
      P08WK3_A130BarCodPar = new String[] {""} ;
      P08WK3_A132BarCodReo = new byte[1] ;
      P08WK3_A129BarCod = new int[1] ;
      P08WK3_A1273RecLinPro = new byte[1] ;
      AV25OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrecetasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08WK2_A2804RecLinMaq, P08WK2_A396EmprCod, P08WK2_A4866RecFecAlt, P08WK2_n4866RecFecAlt, P08WK2_A130BarCodPar, P08WK2_A132BarCodReo, P08WK2_A129BarCod, P08WK2_A1273RecLinPro
            }
            , new Object[] {
            P08WK3_A2804RecLinMaq, P08WK3_A396EmprCod, P08WK3_A4866RecFecAlt, P08WK3_n4866RecFecAlt, P08WK3_A130BarCodPar, P08WK3_A132BarCodReo, P08WK3_A129BarCod, P08WK3_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV43GXV1 ;
   private int A129BarCod ;
   private int AV21InsertIndex ;
   private long AV30count ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV14TFRecLinUsr ;
   private String AV15TFRecLinUsr_Sel ;
   private String AV37Emprcod ;
   private String AV38Prdnum ;
   private String A13696BarNHdr ;
   private String AV46Core_wcrecetasds_2_tfbarnhdr ;
   private String AV47Core_wcrecetasds_3_tfbarnhdr_sel ;
   private String AV50Core_wcrecetasds_6_tfreclinusr ;
   private String AV51Core_wcrecetasds_7_tfreclinusr_sel ;
   private String scmdbuf ;
   private String lV46Core_wcrecetasds_2_tfbarnhdr ;
   private String A130BarCodPar ;
   private String A4576RecLinUsr ;
   private String A396EmprCod ;
   private java.util.Date AV12TFRecFecAlt ;
   private java.util.Date AV13TFRecFecAlt_To ;
   private java.util.Date AV16TFRecPesFec ;
   private java.util.Date AV17TFRecPesFec_To ;
   private java.util.Date AV48Core_wcrecetasds_4_tfrecfecalt ;
   private java.util.Date AV49Core_wcrecetasds_5_tfrecfecalt_to ;
   private java.util.Date AV52Core_wcrecetasds_8_tfrecpesfec ;
   private java.util.Date AV53Core_wcrecetasds_9_tfrecpesfec_to ;
   private java.util.Date A4866RecFecAlt ;
   private boolean returnInSub ;
   private boolean n4866RecFecAlt ;
   private boolean brk8WK3 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV45Core_wcrecetasds_1_filterfulltext ;
   private String AV22Option ;
   private String AV25OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P08WK2_A2804RecLinMaq ;
   private String[] P08WK2_A396EmprCod ;
   private java.util.Date[] P08WK2_A4866RecFecAlt ;
   private boolean[] P08WK2_n4866RecFecAlt ;
   private String[] P08WK2_A130BarCodPar ;
   private byte[] P08WK2_A132BarCodReo ;
   private int[] P08WK2_A129BarCod ;
   private byte[] P08WK2_A1273RecLinPro ;
   private short[] P08WK3_A2804RecLinMaq ;
   private String[] P08WK3_A396EmprCod ;
   private java.util.Date[] P08WK3_A4866RecFecAlt ;
   private boolean[] P08WK3_n4866RecFecAlt ;
   private String[] P08WK3_A130BarCodPar ;
   private byte[] P08WK3_A132BarCodReo ;
   private int[] P08WK3_A129BarCod ;
   private byte[] P08WK3_A1273RecLinPro ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcrecetasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Core_wcrecetasds_1_filterfulltext ,
                                          String AV47Core_wcrecetasds_3_tfbarnhdr_sel ,
                                          String AV46Core_wcrecetasds_2_tfbarnhdr ,
                                          java.util.Date AV48Core_wcrecetasds_4_tfrecfecalt ,
                                          java.util.Date AV49Core_wcrecetasds_5_tfrecfecalt_to ,
                                          String AV51Core_wcrecetasds_7_tfreclinusr_sel ,
                                          String AV50Core_wcrecetasds_6_tfreclinusr ,
                                          java.util.Date AV52Core_wcrecetasds_8_tfrecpesfec ,
                                          java.util.Date AV53Core_wcrecetasds_9_tfrecpesfec_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4866RecFecAlt ,
                                          String AV38Prdnum ,
                                          String AV37Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[5];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T2.RecFecAlt, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPRECMAQ T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV47Core_wcrecetasds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV46Core_wcrecetasds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Core_wcrecetasds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48Core_wcrecetasds_4_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T2.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV49Core_wcrecetasds_5_tfrecfecalt_to) )
      {
         addWhere(sWhereString, "(T2.RecFecAlt <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08WK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Core_wcrecetasds_1_filterfulltext ,
                                          String AV47Core_wcrecetasds_3_tfbarnhdr_sel ,
                                          String AV46Core_wcrecetasds_2_tfbarnhdr ,
                                          java.util.Date AV48Core_wcrecetasds_4_tfrecfecalt ,
                                          java.util.Date AV49Core_wcrecetasds_5_tfrecfecalt_to ,
                                          String AV51Core_wcrecetasds_7_tfreclinusr_sel ,
                                          String AV50Core_wcrecetasds_6_tfreclinusr ,
                                          java.util.Date AV52Core_wcrecetasds_8_tfrecpesfec ,
                                          java.util.Date AV53Core_wcrecetasds_9_tfrecpesfec_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4866RecFecAlt ,
                                          String A396EmprCod ,
                                          String AV37Emprcod ,
                                          String AV38Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[5];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T2.RecFecAlt, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPRECMAQ T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV47Core_wcrecetasds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV46Core_wcrecetasds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Core_wcrecetasds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48Core_wcrecetasds_4_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T2.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV49Core_wcrecetasds_5_tfrecfecalt_to) )
      {
         addWhere(sWhereString, "(T2.RecFecAlt <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
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
                  return conditional_P08WK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P08WK3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               return;
      }
   }

}

