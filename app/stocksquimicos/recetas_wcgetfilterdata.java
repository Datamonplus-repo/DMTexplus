package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetas_wcgetfilterdata extends GXProcedure
{
   public recetas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetas_wcgetfilterdata.class ), "" );
   }

   public recetas_wcgetfilterdata( int remoteHandle ,
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
      recetas_wcgetfilterdata.this.aP5 = new String[] {""};
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
      recetas_wcgetfilterdata.this.AV24DDOName = aP0;
      recetas_wcgetfilterdata.this.AV22SearchTxt = aP1;
      recetas_wcgetfilterdata.this.AV23SearchTxtTo = aP2;
      recetas_wcgetfilterdata.this.aP3 = aP3;
      recetas_wcgetfilterdata.this.aP4 = aP4;
      recetas_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_RECLINUSR") == 0 )
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
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("StocksQuimicos.Recetas_WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.Recetas_WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("StocksQuimicos.Recetas_WCGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV41TFBarNHdr = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV42TFBarNHdr_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR") == 0 )
         {
            AV45TFRecLinUsr = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR_SEL") == 0 )
         {
            AV46TFRecLinUsr_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPESFEC") == 0 )
         {
            AV47TFRecPesFec = localUtil.ctot( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV49TFRecFecAlt = localUtil.ctot( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV43emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV44prdnum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV41TFBarNHdr = AV22SearchTxt ;
      AV42TFBarNHdr_Sel = "" ;
      AV55Stocksquimicos_recetas_wcds_1_filterfulltext = AV40FilterFullText ;
      AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV41TFBarNHdr ;
      AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV42TFBarNHdr_Sel ;
      AV58Stocksquimicos_recetas_wcds_4_tfreclinusr = AV45TFRecLinUsr ;
      AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV46TFRecLinUsr_Sel ;
      AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV47TFRecPesFec ;
      AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV49TFRecFecAlt ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                           AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                           AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                           AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                           AV58Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                           AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                           AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec ,
                                           A4866RecFecAlt ,
                                           AV43emprcod ,
                                           AV44prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV55Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV55Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV56Stocksquimicos_recetas_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr), 11, "%") ;
      lV58Stocksquimicos_recetas_wcds_4_tfreclinusr = GXutil.padr( GXutil.rtrim( AV58Stocksquimicos_recetas_wcds_4_tfreclinusr), 8, "%") ;
      /* Using cursor P09IB2 */
      pr_default.execute(0, new Object[] {AV43emprcod, AV44prdnum, lV55Stocksquimicos_recetas_wcds_1_filterfulltext, lV55Stocksquimicos_recetas_wcds_1_filterfulltext, lV56Stocksquimicos_recetas_wcds_2_tfbarnhdr, AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel, lV58Stocksquimicos_recetas_wcds_4_tfreclinusr, AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel, AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec, AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09IB2_A2804RecLinMaq[0] ;
         A719PrdNum = P09IB2_A719PrdNum[0] ;
         n719PrdNum = P09IB2_n719PrdNum[0] ;
         A396EmprCod = P09IB2_A396EmprCod[0] ;
         A4866RecFecAlt = P09IB2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09IB2_n4866RecFecAlt[0] ;
         A4577RecPesFec = P09IB2_A4577RecPesFec[0] ;
         A4576RecLinUsr = P09IB2_A4576RecLinUsr[0] ;
         A130BarCodPar = P09IB2_A130BarCodPar[0] ;
         A132BarCodReo = P09IB2_A132BarCodReo[0] ;
         A129BarCod = P09IB2_A129BarCod[0] ;
         A1273RecLinPro = P09IB2_A1273RecLinPro[0] ;
         A811RecLin = P09IB2_A811RecLin[0] ;
         A4866RecFecAlt = P09IB2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09IB2_n4866RecFecAlt[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV26Option = A13696BarNHdr ;
            AV25InsertIndex = 1 ;
            while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
            {
               AV25InsertIndex = (int)(AV25InsertIndex+1) ;
            }
            if ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) == 0 ) )
            {
               AV34count = GXutil.lval( (String)AV32OptionIndexes.elementAt(-1+AV25InsertIndex)) ;
               AV34count = (long)(AV34count+1) ;
               AV32OptionIndexes.removeItem(AV25InsertIndex);
               AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
            }
            else
            {
               AV27Options.add(AV26Option, AV25InsertIndex);
               AV32OptionIndexes.add("1", AV25InsertIndex);
            }
         }
         if ( AV27Options.size() == 50 )
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
      AV45TFRecLinUsr = AV22SearchTxt ;
      AV46TFRecLinUsr_Sel = "" ;
      AV55Stocksquimicos_recetas_wcds_1_filterfulltext = AV40FilterFullText ;
      AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV41TFBarNHdr ;
      AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV42TFBarNHdr_Sel ;
      AV58Stocksquimicos_recetas_wcds_4_tfreclinusr = AV45TFRecLinUsr ;
      AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV46TFRecLinUsr_Sel ;
      AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV47TFRecPesFec ;
      AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV49TFRecFecAlt ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV55Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                           AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                           AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                           AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                           AV58Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                           AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                           AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec ,
                                           A4866RecFecAlt ,
                                           A396EmprCod ,
                                           AV43emprcod ,
                                           A719PrdNum ,
                                           AV44prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV55Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV55Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV56Stocksquimicos_recetas_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr), 11, "%") ;
      lV58Stocksquimicos_recetas_wcds_4_tfreclinusr = GXutil.padr( GXutil.rtrim( AV58Stocksquimicos_recetas_wcds_4_tfreclinusr), 8, "%") ;
      /* Using cursor P09IB3 */
      pr_default.execute(1, new Object[] {AV43emprcod, AV44prdnum, lV55Stocksquimicos_recetas_wcds_1_filterfulltext, lV55Stocksquimicos_recetas_wcds_1_filterfulltext, lV56Stocksquimicos_recetas_wcds_2_tfbarnhdr, AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel, lV58Stocksquimicos_recetas_wcds_4_tfreclinusr, AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel, AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec, AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9IB3 = false ;
         A2804RecLinMaq = P09IB3_A2804RecLinMaq[0] ;
         A396EmprCod = P09IB3_A396EmprCod[0] ;
         A719PrdNum = P09IB3_A719PrdNum[0] ;
         n719PrdNum = P09IB3_n719PrdNum[0] ;
         A4576RecLinUsr = P09IB3_A4576RecLinUsr[0] ;
         A4866RecFecAlt = P09IB3_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09IB3_n4866RecFecAlt[0] ;
         A4577RecPesFec = P09IB3_A4577RecPesFec[0] ;
         A130BarCodPar = P09IB3_A130BarCodPar[0] ;
         A132BarCodReo = P09IB3_A132BarCodReo[0] ;
         A129BarCod = P09IB3_A129BarCod[0] ;
         A1273RecLinPro = P09IB3_A1273RecLinPro[0] ;
         A811RecLin = P09IB3_A811RecLin[0] ;
         A4866RecFecAlt = P09IB3_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09IB3_n4866RecFecAlt[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09IB3_A4576RecLinUsr[0], A4576RecLinUsr) == 0 ) )
         {
            brk9IB3 = false ;
            A2804RecLinMaq = P09IB3_A2804RecLinMaq[0] ;
            A396EmprCod = P09IB3_A396EmprCod[0] ;
            A130BarCodPar = P09IB3_A130BarCodPar[0] ;
            A132BarCodReo = P09IB3_A132BarCodReo[0] ;
            A129BarCod = P09IB3_A129BarCod[0] ;
            A1273RecLinPro = P09IB3_A1273RecLinPro[0] ;
            A811RecLin = P09IB3_A811RecLin[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9IB3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4576RecLinUsr)==0) )
         {
            AV26Option = A4576RecLinUsr ;
            AV29OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!"))) ;
            AV27Options.add(AV26Option, 0);
            AV30OptionsDesc.add(AV29OptionDesc, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9IB3 )
         {
            brk9IB3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetas_wcgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = recetas_wcgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = recetas_wcgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV41TFBarNHdr = "" ;
      AV42TFBarNHdr_Sel = "" ;
      AV45TFRecLinUsr = "" ;
      AV46TFRecLinUsr_Sel = "" ;
      AV47TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      AV49TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV43emprcod = "" ;
      AV44prdnum = "" ;
      A13696BarNHdr = "" ;
      AV55Stocksquimicos_recetas_wcds_1_filterfulltext = "" ;
      AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr = "" ;
      AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = "" ;
      AV58Stocksquimicos_recetas_wcds_4_tfreclinusr = "" ;
      AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = "" ;
      AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec = GXutil.resetTime( GXutil.nullDate() );
      AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV55Stocksquimicos_recetas_wcds_1_filterfulltext = "" ;
      lV56Stocksquimicos_recetas_wcds_2_tfbarnhdr = "" ;
      lV58Stocksquimicos_recetas_wcds_4_tfreclinusr = "" ;
      A130BarCodPar = "" ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09IB2_A2804RecLinMaq = new short[1] ;
      P09IB2_A719PrdNum = new String[] {""} ;
      P09IB2_n719PrdNum = new boolean[] {false} ;
      P09IB2_A396EmprCod = new String[] {""} ;
      P09IB2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09IB2_n4866RecFecAlt = new boolean[] {false} ;
      P09IB2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IB2_A4576RecLinUsr = new String[] {""} ;
      P09IB2_A130BarCodPar = new String[] {""} ;
      P09IB2_A132BarCodReo = new byte[1] ;
      P09IB2_A129BarCod = new int[1] ;
      P09IB2_A1273RecLinPro = new byte[1] ;
      P09IB2_A811RecLin = new short[1] ;
      AV26Option = "" ;
      P09IB3_A2804RecLinMaq = new short[1] ;
      P09IB3_A396EmprCod = new String[] {""} ;
      P09IB3_A719PrdNum = new String[] {""} ;
      P09IB3_n719PrdNum = new boolean[] {false} ;
      P09IB3_A4576RecLinUsr = new String[] {""} ;
      P09IB3_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09IB3_n4866RecFecAlt = new boolean[] {false} ;
      P09IB3_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IB3_A130BarCodPar = new String[] {""} ;
      P09IB3_A132BarCodReo = new byte[1] ;
      P09IB3_A129BarCod = new int[1] ;
      P09IB3_A1273RecLinPro = new byte[1] ;
      P09IB3_A811RecLin = new short[1] ;
      AV29OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.recetas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09IB2_A2804RecLinMaq, P09IB2_A719PrdNum, P09IB2_n719PrdNum, P09IB2_A396EmprCod, P09IB2_A4866RecFecAlt, P09IB2_n4866RecFecAlt, P09IB2_A4577RecPesFec, P09IB2_A4576RecLinUsr, P09IB2_A130BarCodPar, P09IB2_A132BarCodReo,
            P09IB2_A129BarCod, P09IB2_A1273RecLinPro, P09IB2_A811RecLin
            }
            , new Object[] {
            P09IB3_A2804RecLinMaq, P09IB3_A396EmprCod, P09IB3_A719PrdNum, P09IB3_n719PrdNum, P09IB3_A4576RecLinUsr, P09IB3_A4866RecFecAlt, P09IB3_n4866RecFecAlt, P09IB3_A4577RecPesFec, P09IB3_A130BarCodPar, P09IB3_A132BarCodReo,
            P09IB3_A129BarCod, P09IB3_A1273RecLinPro, P09IB3_A811RecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int A129BarCod ;
   private int AV25InsertIndex ;
   private long AV34count ;
   private String AV41TFBarNHdr ;
   private String AV42TFBarNHdr_Sel ;
   private String AV45TFRecLinUsr ;
   private String AV46TFRecLinUsr_Sel ;
   private String AV43emprcod ;
   private String AV44prdnum ;
   private String A13696BarNHdr ;
   private String AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr ;
   private String AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ;
   private String AV58Stocksquimicos_recetas_wcds_4_tfreclinusr ;
   private String AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ;
   private String scmdbuf ;
   private String lV56Stocksquimicos_recetas_wcds_2_tfbarnhdr ;
   private String lV58Stocksquimicos_recetas_wcds_4_tfreclinusr ;
   private String A130BarCodPar ;
   private String A4576RecLinUsr ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.util.Date AV47TFRecPesFec ;
   private java.util.Date AV49TFRecFecAlt ;
   private java.util.Date AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec ;
   private java.util.Date AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date A4866RecFecAlt ;
   private boolean returnInSub ;
   private boolean n719PrdNum ;
   private boolean n4866RecFecAlt ;
   private boolean brk9IB3 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV55Stocksquimicos_recetas_wcds_1_filterfulltext ;
   private String lV55Stocksquimicos_recetas_wcds_1_filterfulltext ;
   private String AV26Option ;
   private String AV29OptionDesc ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09IB2_A2804RecLinMaq ;
   private String[] P09IB2_A719PrdNum ;
   private boolean[] P09IB2_n719PrdNum ;
   private String[] P09IB2_A396EmprCod ;
   private java.util.Date[] P09IB2_A4866RecFecAlt ;
   private boolean[] P09IB2_n4866RecFecAlt ;
   private java.util.Date[] P09IB2_A4577RecPesFec ;
   private String[] P09IB2_A4576RecLinUsr ;
   private String[] P09IB2_A130BarCodPar ;
   private byte[] P09IB2_A132BarCodReo ;
   private int[] P09IB2_A129BarCod ;
   private byte[] P09IB2_A1273RecLinPro ;
   private short[] P09IB2_A811RecLin ;
   private short[] P09IB3_A2804RecLinMaq ;
   private String[] P09IB3_A396EmprCod ;
   private String[] P09IB3_A719PrdNum ;
   private boolean[] P09IB3_n719PrdNum ;
   private String[] P09IB3_A4576RecLinUsr ;
   private java.util.Date[] P09IB3_A4866RecFecAlt ;
   private boolean[] P09IB3_n4866RecFecAlt ;
   private java.util.Date[] P09IB3_A4577RecPesFec ;
   private String[] P09IB3_A130BarCodPar ;
   private byte[] P09IB3_A132BarCodReo ;
   private int[] P09IB3_A129BarCod ;
   private byte[] P09IB3_A1273RecLinPro ;
   private short[] P09IB3_A811RecLin ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class recetas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09IB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                          String AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                          String AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                          String AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                          String AV58Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                          java.util.Date AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                          java.util.Date AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec ,
                                          java.util.Date A4866RecFecAlt ,
                                          String AV43emprcod ,
                                          String AV44prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.PrdNum, T1.EmprCod, T2.RecFecAlt, T1.RecPesFec, T1.RecLinUsr, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLinPro, T1.RecLin FROM (TXPLRECET" ;
      scmdbuf += " T1 INNER JOIN TXPRECMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.RecLinMaq" ;
      scmdbuf += " = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV55Stocksquimicos_recetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV58Stocksquimicos_recetas_wcds_4_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T2.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09IB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                          String AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                          String AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                          String AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                          String AV58Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                          java.util.Date AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                          java.util.Date AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec ,
                                          java.util.Date A4866RecFecAlt ,
                                          String A396EmprCod ,
                                          String AV43emprcod ,
                                          String A719PrdNum ,
                                          String AV44prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.EmprCod, T1.PrdNum, T1.RecLinUsr, T2.RecFecAlt, T1.RecPesFec, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLinPro, T1.RecLin FROM (TXPLRECET" ;
      scmdbuf += " T1 INNER JOIN TXPRECMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.RecLinMaq" ;
      scmdbuf += " = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV55Stocksquimicos_recetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV56Stocksquimicos_recetas_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV58Stocksquimicos_recetas_wcds_4_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV60Stocksquimicos_recetas_wcds_6_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV61Stocksquimicos_recetas_wcds_7_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T2.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecLinUsr" ;
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
                  return conditional_P09IB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] );
            case 1 :
                  return conditional_P09IB3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09IB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], false);
               }
               return;
      }
   }

}

