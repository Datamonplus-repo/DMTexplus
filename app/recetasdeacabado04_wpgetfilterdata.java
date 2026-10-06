package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetasdeacabado04_wpgetfilterdata extends GXProcedure
{
   public recetasdeacabado04_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado04_wpgetfilterdata.class ), "" );
   }

   public recetasdeacabado04_wpgetfilterdata( int remoteHandle ,
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
      recetasdeacabado04_wpgetfilterdata.this.aP5 = new String[] {""};
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
      recetasdeacabado04_wpgetfilterdata.this.AV22DDOName = aP0;
      recetasdeacabado04_wpgetfilterdata.this.AV20SearchTxt = aP1;
      recetasdeacabado04_wpgetfilterdata.this.AV21SearchTxtTo = aP2;
      recetasdeacabado04_wpgetfilterdata.this.aP3 = aP3;
      recetasdeacabado04_wpgetfilterdata.this.aP4 = aP4;
      recetasdeacabado04_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
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
      if ( GXutil.strcmp(AV33Session.getValue("RecetasdeAcabado04_WPGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasdeAcabado04_WPGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("RecetasdeAcabado04_WPGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV12TFRecLinMaq = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFRecLinMaq_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV14TFMaqCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV15TFMaqCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV16TFRecVolPrd = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFRecVolPrd_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFA") == 0 )
         {
            AV18TFRecFA = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFRecFA_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV20SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV47Recetasdeacabado04_wpds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV49Recetasdeacabado04_wpds_3_tfreclinmaq = AV12TFRecLinMaq ;
      AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV51Recetasdeacabado04_wpds_5_tfmaqcod = AV14TFMaqCod ;
      AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel = AV15TFMaqCod_Sel ;
      AV53Recetasdeacabado04_wpds_7_tfrecvolprd = AV16TFRecVolPrd ;
      AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to = AV17TFRecVolPrd_To ;
      AV55Recetasdeacabado04_wpds_9_tfrecfa = AV18TFRecFA ;
      AV56Recetasdeacabado04_wpds_10_tfrecfa_to = AV19TFRecFA_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel ,
                                           AV47Recetasdeacabado04_wpds_1_tfbarnhdr ,
                                           Short.valueOf(AV49Recetasdeacabado04_wpds_3_tfreclinmaq) ,
                                           Short.valueOf(AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to) ,
                                           AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel ,
                                           AV51Recetasdeacabado04_wpds_5_tfmaqcod ,
                                           Integer.valueOf(AV53Recetasdeacabado04_wpds_7_tfrecvolprd) ,
                                           Integer.valueOf(AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to) ,
                                           AV55Recetasdeacabado04_wpds_9_tfrecfa ,
                                           AV56Recetasdeacabado04_wpds_10_tfrecfa_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A2806RecFA ,
                                           A6039RecAcab ,
                                           AV39Emprcod ,
                                           Integer.valueOf(AV40Barcod) ,
                                           Byte.valueOf(AV41Barcodreo) ,
                                           AV42Barcodpar ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Recetasdeacabado04_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV47Recetasdeacabado04_wpds_1_tfbarnhdr), 11, "%") ;
      lV51Recetasdeacabado04_wpds_5_tfmaqcod = GXutil.padr( GXutil.rtrim( AV51Recetasdeacabado04_wpds_5_tfmaqcod), 6, "%") ;
      /* Using cursor P09BL2 */
      pr_default.execute(0, new Object[] {AV39Emprcod, Integer.valueOf(AV40Barcod), Byte.valueOf(AV41Barcodreo), AV42Barcodpar, lV47Recetasdeacabado04_wpds_1_tfbarnhdr, AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel, Short.valueOf(AV49Recetasdeacabado04_wpds_3_tfreclinmaq), Short.valueOf(AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to), lV51Recetasdeacabado04_wpds_5_tfmaqcod, AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel, Integer.valueOf(AV53Recetasdeacabado04_wpds_7_tfrecvolprd), Integer.valueOf(AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to), AV55Recetasdeacabado04_wpds_9_tfrecfa, AV56Recetasdeacabado04_wpds_10_tfrecfa_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P09BL2_A6039RecAcab[0] ;
         n6039RecAcab = P09BL2_n6039RecAcab[0] ;
         A396EmprCod = P09BL2_A396EmprCod[0] ;
         A2806RecFA = P09BL2_A2806RecFA[0] ;
         A2805RecVolPrd = P09BL2_A2805RecVolPrd[0] ;
         A602MaqCod = P09BL2_A602MaqCod[0] ;
         A2804RecLinMaq = P09BL2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BL2_A130BarCodPar[0] ;
         A132BarCodReo = P09BL2_A132BarCodReo[0] ;
         A129BarCod = P09BL2_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV24Option = A13696BarNHdr ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
            {
               AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
               AV32count = (long)(AV32count+1) ;
               AV30OptionIndexes.removeItem(AV23InsertIndex);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
            }
            else
            {
               AV25Options.add(AV24Option, AV23InsertIndex);
               AV30OptionIndexes.add("1", AV23InsertIndex);
            }
         }
         if ( AV25Options.size() == 50 )
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
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMaqCod = AV20SearchTxt ;
      AV15TFMaqCod_Sel = "" ;
      AV47Recetasdeacabado04_wpds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV49Recetasdeacabado04_wpds_3_tfreclinmaq = AV12TFRecLinMaq ;
      AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV51Recetasdeacabado04_wpds_5_tfmaqcod = AV14TFMaqCod ;
      AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel = AV15TFMaqCod_Sel ;
      AV53Recetasdeacabado04_wpds_7_tfrecvolprd = AV16TFRecVolPrd ;
      AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to = AV17TFRecVolPrd_To ;
      AV55Recetasdeacabado04_wpds_9_tfrecfa = AV18TFRecFA ;
      AV56Recetasdeacabado04_wpds_10_tfrecfa_to = AV19TFRecFA_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel ,
                                           AV47Recetasdeacabado04_wpds_1_tfbarnhdr ,
                                           Short.valueOf(AV49Recetasdeacabado04_wpds_3_tfreclinmaq) ,
                                           Short.valueOf(AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to) ,
                                           AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel ,
                                           AV51Recetasdeacabado04_wpds_5_tfmaqcod ,
                                           Integer.valueOf(AV53Recetasdeacabado04_wpds_7_tfrecvolprd) ,
                                           Integer.valueOf(AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to) ,
                                           AV55Recetasdeacabado04_wpds_9_tfrecfa ,
                                           AV56Recetasdeacabado04_wpds_10_tfrecfa_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A2806RecFA ,
                                           Integer.valueOf(AV40Barcod) ,
                                           Byte.valueOf(AV41Barcodreo) ,
                                           AV42Barcodpar ,
                                           A6039RecAcab ,
                                           AV39Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Recetasdeacabado04_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV47Recetasdeacabado04_wpds_1_tfbarnhdr), 11, "%") ;
      lV51Recetasdeacabado04_wpds_5_tfmaqcod = GXutil.padr( GXutil.rtrim( AV51Recetasdeacabado04_wpds_5_tfmaqcod), 6, "%") ;
      /* Using cursor P09BL3 */
      pr_default.execute(1, new Object[] {AV39Emprcod, Integer.valueOf(AV40Barcod), Byte.valueOf(AV41Barcodreo), AV42Barcodpar, lV47Recetasdeacabado04_wpds_1_tfbarnhdr, AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel, Short.valueOf(AV49Recetasdeacabado04_wpds_3_tfreclinmaq), Short.valueOf(AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to), lV51Recetasdeacabado04_wpds_5_tfmaqcod, AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel, Integer.valueOf(AV53Recetasdeacabado04_wpds_7_tfrecvolprd), Integer.valueOf(AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to), AV55Recetasdeacabado04_wpds_9_tfrecfa, AV56Recetasdeacabado04_wpds_10_tfrecfa_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9BL3 = false ;
         A396EmprCod = P09BL3_A396EmprCod[0] ;
         A602MaqCod = P09BL3_A602MaqCod[0] ;
         A6039RecAcab = P09BL3_A6039RecAcab[0] ;
         n6039RecAcab = P09BL3_n6039RecAcab[0] ;
         A2806RecFA = P09BL3_A2806RecFA[0] ;
         A2805RecVolPrd = P09BL3_A2805RecVolPrd[0] ;
         A2804RecLinMaq = P09BL3_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BL3_A130BarCodPar[0] ;
         A132BarCodReo = P09BL3_A132BarCodReo[0] ;
         A129BarCod = P09BL3_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09BL3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09BL3_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk9BL3 = false ;
            A2804RecLinMaq = P09BL3_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BL3_A130BarCodPar[0] ;
            A132BarCodReo = P09BL3_A132BarCodReo[0] ;
            A129BarCod = P09BL3_A129BarCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9BL3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV24Option = A602MaqCod ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BL3 )
         {
            brk9BL3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetasdeacabado04_wpgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = recetasdeacabado04_wpgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = recetasdeacabado04_wpgetfilterdata.this.AV31OptionIndexesJson;
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
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV14TFMaqCod = "" ;
      AV15TFMaqCod_Sel = "" ;
      AV18TFRecFA = DecimalUtil.ZERO ;
      AV19TFRecFA_To = DecimalUtil.ZERO ;
      A13696BarNHdr = "" ;
      AV47Recetasdeacabado04_wpds_1_tfbarnhdr = "" ;
      AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel = "" ;
      AV51Recetasdeacabado04_wpds_5_tfmaqcod = "" ;
      AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel = "" ;
      AV55Recetasdeacabado04_wpds_9_tfrecfa = DecimalUtil.ZERO ;
      AV56Recetasdeacabado04_wpds_10_tfrecfa_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV47Recetasdeacabado04_wpds_1_tfbarnhdr = "" ;
      lV51Recetasdeacabado04_wpds_5_tfmaqcod = "" ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A6039RecAcab = "" ;
      AV39Emprcod = "" ;
      AV42Barcodpar = "" ;
      A396EmprCod = "" ;
      P09BL2_A6039RecAcab = new String[] {""} ;
      P09BL2_n6039RecAcab = new boolean[] {false} ;
      P09BL2_A396EmprCod = new String[] {""} ;
      P09BL2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BL2_A2805RecVolPrd = new int[1] ;
      P09BL2_A602MaqCod = new String[] {""} ;
      P09BL2_A2804RecLinMaq = new short[1] ;
      P09BL2_A130BarCodPar = new String[] {""} ;
      P09BL2_A132BarCodReo = new byte[1] ;
      P09BL2_A129BarCod = new int[1] ;
      AV24Option = "" ;
      P09BL3_A396EmprCod = new String[] {""} ;
      P09BL3_A602MaqCod = new String[] {""} ;
      P09BL3_A6039RecAcab = new String[] {""} ;
      P09BL3_n6039RecAcab = new boolean[] {false} ;
      P09BL3_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BL3_A2805RecVolPrd = new int[1] ;
      P09BL3_A2804RecLinMaq = new short[1] ;
      P09BL3_A130BarCodPar = new String[] {""} ;
      P09BL3_A132BarCodReo = new byte[1] ;
      P09BL3_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado04_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09BL2_A6039RecAcab, P09BL2_n6039RecAcab, P09BL2_A396EmprCod, P09BL2_A2806RecFA, P09BL2_A2805RecVolPrd, P09BL2_A602MaqCod, P09BL2_A2804RecLinMaq, P09BL2_A130BarCodPar, P09BL2_A132BarCodReo, P09BL2_A129BarCod
            }
            , new Object[] {
            P09BL3_A396EmprCod, P09BL3_A602MaqCod, P09BL3_A6039RecAcab, P09BL3_n6039RecAcab, P09BL3_A2806RecFA, P09BL3_A2805RecVolPrd, P09BL3_A2804RecLinMaq, P09BL3_A130BarCodPar, P09BL3_A132BarCodReo, P09BL3_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV41Barcodreo ;
   private short AV12TFRecLinMaq ;
   private short AV13TFRecLinMaq_To ;
   private short AV49Recetasdeacabado04_wpds_3_tfreclinmaq ;
   private short AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV16TFRecVolPrd ;
   private int AV17TFRecVolPrd_To ;
   private int AV53Recetasdeacabado04_wpds_7_tfrecvolprd ;
   private int AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int AV40Barcod ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV18TFRecFA ;
   private java.math.BigDecimal AV19TFRecFA_To ;
   private java.math.BigDecimal AV55Recetasdeacabado04_wpds_9_tfrecfa ;
   private java.math.BigDecimal AV56Recetasdeacabado04_wpds_10_tfrecfa_to ;
   private java.math.BigDecimal A2806RecFA ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV14TFMaqCod ;
   private String AV15TFMaqCod_Sel ;
   private String A13696BarNHdr ;
   private String AV47Recetasdeacabado04_wpds_1_tfbarnhdr ;
   private String AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel ;
   private String AV51Recetasdeacabado04_wpds_5_tfmaqcod ;
   private String AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV47Recetasdeacabado04_wpds_1_tfbarnhdr ;
   private String lV51Recetasdeacabado04_wpds_5_tfmaqcod ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private String AV39Emprcod ;
   private String AV42Barcodpar ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean brk9BL3 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09BL2_A6039RecAcab ;
   private boolean[] P09BL2_n6039RecAcab ;
   private String[] P09BL2_A396EmprCod ;
   private java.math.BigDecimal[] P09BL2_A2806RecFA ;
   private int[] P09BL2_A2805RecVolPrd ;
   private String[] P09BL2_A602MaqCod ;
   private short[] P09BL2_A2804RecLinMaq ;
   private String[] P09BL2_A130BarCodPar ;
   private byte[] P09BL2_A132BarCodReo ;
   private int[] P09BL2_A129BarCod ;
   private String[] P09BL3_A396EmprCod ;
   private String[] P09BL3_A602MaqCod ;
   private String[] P09BL3_A6039RecAcab ;
   private boolean[] P09BL3_n6039RecAcab ;
   private java.math.BigDecimal[] P09BL3_A2806RecFA ;
   private int[] P09BL3_A2805RecVolPrd ;
   private short[] P09BL3_A2804RecLinMaq ;
   private String[] P09BL3_A130BarCodPar ;
   private byte[] P09BL3_A132BarCodReo ;
   private int[] P09BL3_A129BarCod ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class recetasdeacabado04_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09BL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel ,
                                          String AV47Recetasdeacabado04_wpds_1_tfbarnhdr ,
                                          short AV49Recetasdeacabado04_wpds_3_tfreclinmaq ,
                                          short AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to ,
                                          String AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel ,
                                          String AV51Recetasdeacabado04_wpds_5_tfmaqcod ,
                                          int AV53Recetasdeacabado04_wpds_7_tfrecvolprd ,
                                          int AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to ,
                                          java.math.BigDecimal AV55Recetasdeacabado04_wpds_9_tfrecfa ,
                                          java.math.BigDecimal AV56Recetasdeacabado04_wpds_10_tfrecfa_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.math.BigDecimal A2806RecFA ,
                                          String A6039RecAcab ,
                                          String AV39Emprcod ,
                                          int AV40Barcod ,
                                          byte AV41Barcodreo ,
                                          String AV42Barcodpar ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT RecAcab, EmprCod, RecFA, RecVolPrd, MaqCod, RecLinMaq, BarCodPar, BarCodReo, BarCod FROM TXPRECMAQ" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(RecAcab = 'S')");
      if ( (GXutil.strcmp("", AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV47Recetasdeacabado04_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV49Recetasdeacabado04_wpds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(RecLinMaq >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(RecLinMaq <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV51Recetasdeacabado04_wpds_5_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV53Recetasdeacabado04_wpds_7_tfrecvolprd) )
      {
         addWhere(sWhereString, "(RecVolPrd >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(RecVolPrd <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Recetasdeacabado04_wpds_9_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(RecFA >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Recetasdeacabado04_wpds_10_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(RecFA <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09BL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel ,
                                          String AV47Recetasdeacabado04_wpds_1_tfbarnhdr ,
                                          short AV49Recetasdeacabado04_wpds_3_tfreclinmaq ,
                                          short AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to ,
                                          String AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel ,
                                          String AV51Recetasdeacabado04_wpds_5_tfmaqcod ,
                                          int AV53Recetasdeacabado04_wpds_7_tfrecvolprd ,
                                          int AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to ,
                                          java.math.BigDecimal AV55Recetasdeacabado04_wpds_9_tfrecfa ,
                                          java.math.BigDecimal AV56Recetasdeacabado04_wpds_10_tfrecfa_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int AV40Barcod ,
                                          byte AV41Barcodreo ,
                                          String AV42Barcodpar ,
                                          String A6039RecAcab ,
                                          String AV39Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[14];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, MaqCod, RecAcab, RecFA, RecVolPrd, RecLinMaq, BarCodPar, BarCodReo, BarCod FROM TXPRECMAQ" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      addWhere(sWhereString, "(RecAcab = 'S')");
      if ( (GXutil.strcmp("", AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV47Recetasdeacabado04_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Recetasdeacabado04_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV49Recetasdeacabado04_wpds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(RecLinMaq >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV50Recetasdeacabado04_wpds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(RecLinMaq <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV51Recetasdeacabado04_wpds_5_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Recetasdeacabado04_wpds_6_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV53Recetasdeacabado04_wpds_7_tfrecvolprd) )
      {
         addWhere(sWhereString, "(RecVolPrd >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Recetasdeacabado04_wpds_8_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(RecVolPrd <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Recetasdeacabado04_wpds_9_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(RecFA >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Recetasdeacabado04_wpds_10_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(RecFA <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod" ;
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
                  return conditional_P09BL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] );
            case 1 :
                  return conditional_P09BL3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               return;
      }
   }

}

