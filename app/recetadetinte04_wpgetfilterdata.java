package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte04_wpgetfilterdata extends GXProcedure
{
   public recetadetinte04_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte04_wpgetfilterdata.class ), "" );
   }

   public recetadetinte04_wpgetfilterdata( int remoteHandle ,
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
      recetadetinte04_wpgetfilterdata.this.aP5 = new String[] {""};
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
      recetadetinte04_wpgetfilterdata.this.AV18DDOName = aP0;
      recetadetinte04_wpgetfilterdata.this.AV16SearchTxt = aP1;
      recetadetinte04_wpgetfilterdata.this.AV17SearchTxtTo = aP2;
      recetadetinte04_wpgetfilterdata.this.aP3 = aP3;
      recetadetinte04_wpgetfilterdata.this.aP4 = aP4;
      recetadetinte04_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV29Session.getValue("RecetadeTinte04_WPGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetadeTinte04_WPGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("RecetadeTinte04_WPGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
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
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForCod = AV16SearchTxt ;
      AV13TFProForCod_Sel = "" ;
      AV45Recetadetinte04_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV46Recetadetinte04_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV47Recetadetinte04_wpds_3_tfproforcod = AV12TFProForCod ;
      AV48Recetadetinte04_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV49Recetadetinte04_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV50Recetadetinte04_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV45Recetadetinte04_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV46Recetadetinte04_wpds_2_tfreclinpro_to) ,
                                           AV48Recetadetinte04_wpds_4_tfproforcod_sel ,
                                           AV47Recetadetinte04_wpds_3_tfproforcod ,
                                           AV50Recetadetinte04_wpds_6_tfprofordsc_sel ,
                                           AV49Recetadetinte04_wpds_5_tfprofordsc ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV36Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV37Barcodreo) ,
                                           A130BarCodPar ,
                                           AV38Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV39Reclinmaq) ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Recetadetinte04_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV47Recetadetinte04_wpds_3_tfproforcod), 6, "%") ;
      lV49Recetadetinte04_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV49Recetadetinte04_wpds_5_tfprofordsc), 30, "%") ;
      /* Using cursor P09AW2 */
      pr_default.execute(0, new Object[] {AV35Emprcod, Integer.valueOf(AV36Barcod), Byte.valueOf(AV37Barcodreo), AV38Barcodpar, Short.valueOf(AV39Reclinmaq), Byte.valueOf(AV45Recetadetinte04_wpds_1_tfreclinpro), Byte.valueOf(AV46Recetadetinte04_wpds_2_tfreclinpro_to), lV47Recetadetinte04_wpds_3_tfproforcod, AV48Recetadetinte04_wpds_4_tfproforcod_sel, lV49Recetadetinte04_wpds_5_tfprofordsc, AV50Recetadetinte04_wpds_6_tfprofordsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9AW2 = false ;
         A396EmprCod = P09AW2_A396EmprCod[0] ;
         A764ProForCod = P09AW2_A764ProForCod[0] ;
         A2804RecLinMaq = P09AW2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09AW2_A130BarCodPar[0] ;
         A132BarCodReo = P09AW2_A132BarCodReo[0] ;
         A129BarCod = P09AW2_A129BarCod[0] ;
         A766ProForDsc = P09AW2_A766ProForDsc[0] ;
         A1273RecLinPro = P09AW2_A1273RecLinPro[0] ;
         A766ProForDsc = P09AW2_A766ProForDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09AW2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09AW2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk9AW2 = false ;
            A2804RecLinMaq = P09AW2_A2804RecLinMaq[0] ;
            A130BarCodPar = P09AW2_A130BarCodPar[0] ;
            A132BarCodReo = P09AW2_A132BarCodReo[0] ;
            A129BarCod = P09AW2_A129BarCod[0] ;
            A1273RecLinPro = P09AW2_A1273RecLinPro[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9AW2 = true ;
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
         if ( ! brk9AW2 )
         {
            brk9AW2 = true ;
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
      AV45Recetadetinte04_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV46Recetadetinte04_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV47Recetadetinte04_wpds_3_tfproforcod = AV12TFProForCod ;
      AV48Recetadetinte04_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV49Recetadetinte04_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV50Recetadetinte04_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV45Recetadetinte04_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV46Recetadetinte04_wpds_2_tfreclinpro_to) ,
                                           AV48Recetadetinte04_wpds_4_tfproforcod_sel ,
                                           AV47Recetadetinte04_wpds_3_tfproforcod ,
                                           AV50Recetadetinte04_wpds_6_tfprofordsc_sel ,
                                           AV49Recetadetinte04_wpds_5_tfprofordsc ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV36Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV37Barcodreo) ,
                                           A130BarCodPar ,
                                           AV38Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV39Reclinmaq) ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Recetadetinte04_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV47Recetadetinte04_wpds_3_tfproforcod), 6, "%") ;
      lV49Recetadetinte04_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV49Recetadetinte04_wpds_5_tfprofordsc), 30, "%") ;
      /* Using cursor P09AW3 */
      pr_default.execute(1, new Object[] {AV35Emprcod, Integer.valueOf(AV36Barcod), Byte.valueOf(AV37Barcodreo), AV38Barcodpar, Short.valueOf(AV39Reclinmaq), Byte.valueOf(AV45Recetadetinte04_wpds_1_tfreclinpro), Byte.valueOf(AV46Recetadetinte04_wpds_2_tfreclinpro_to), lV47Recetadetinte04_wpds_3_tfproforcod, AV48Recetadetinte04_wpds_4_tfproforcod_sel, lV49Recetadetinte04_wpds_5_tfprofordsc, AV50Recetadetinte04_wpds_6_tfprofordsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9AW4 = false ;
         A764ProForCod = P09AW3_A764ProForCod[0] ;
         A396EmprCod = P09AW3_A396EmprCod[0] ;
         A2804RecLinMaq = P09AW3_A2804RecLinMaq[0] ;
         A130BarCodPar = P09AW3_A130BarCodPar[0] ;
         A132BarCodReo = P09AW3_A132BarCodReo[0] ;
         A129BarCod = P09AW3_A129BarCod[0] ;
         A766ProForDsc = P09AW3_A766ProForDsc[0] ;
         A1273RecLinPro = P09AW3_A1273RecLinPro[0] ;
         A766ProForDsc = P09AW3_A766ProForDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09AW3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09AW3_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk9AW4 = false ;
            A2804RecLinMaq = P09AW3_A2804RecLinMaq[0] ;
            A130BarCodPar = P09AW3_A130BarCodPar[0] ;
            A132BarCodReo = P09AW3_A132BarCodReo[0] ;
            A129BarCod = P09AW3_A129BarCod[0] ;
            A1273RecLinPro = P09AW3_A1273RecLinPro[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9AW4 = true ;
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
         if ( ! brk9AW4 )
         {
            brk9AW4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadetinte04_wpgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = recetadetinte04_wpgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = recetadetinte04_wpgetfilterdata.this.AV27OptionIndexesJson;
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
      AV12TFProForCod = "" ;
      AV13TFProForCod_Sel = "" ;
      AV14TFProForDsc = "" ;
      AV15TFProForDsc_Sel = "" ;
      A764ProForCod = "" ;
      AV47Recetadetinte04_wpds_3_tfproforcod = "" ;
      AV48Recetadetinte04_wpds_4_tfproforcod_sel = "" ;
      AV49Recetadetinte04_wpds_5_tfprofordsc = "" ;
      AV50Recetadetinte04_wpds_6_tfprofordsc_sel = "" ;
      scmdbuf = "" ;
      lV47Recetadetinte04_wpds_3_tfproforcod = "" ;
      lV49Recetadetinte04_wpds_5_tfprofordsc = "" ;
      A766ProForDsc = "" ;
      A130BarCodPar = "" ;
      AV38Barcodpar = "" ;
      AV35Emprcod = "" ;
      A396EmprCod = "" ;
      P09AW2_A396EmprCod = new String[] {""} ;
      P09AW2_A764ProForCod = new String[] {""} ;
      P09AW2_A2804RecLinMaq = new short[1] ;
      P09AW2_A130BarCodPar = new String[] {""} ;
      P09AW2_A132BarCodReo = new byte[1] ;
      P09AW2_A129BarCod = new int[1] ;
      P09AW2_A766ProForDsc = new String[] {""} ;
      P09AW2_A1273RecLinPro = new byte[1] ;
      AV20Option = "" ;
      P09AW3_A764ProForCod = new String[] {""} ;
      P09AW3_A396EmprCod = new String[] {""} ;
      P09AW3_A2804RecLinMaq = new short[1] ;
      P09AW3_A130BarCodPar = new String[] {""} ;
      P09AW3_A132BarCodReo = new byte[1] ;
      P09AW3_A129BarCod = new int[1] ;
      P09AW3_A766ProForDsc = new String[] {""} ;
      P09AW3_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte04_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09AW2_A396EmprCod, P09AW2_A764ProForCod, P09AW2_A2804RecLinMaq, P09AW2_A130BarCodPar, P09AW2_A132BarCodReo, P09AW2_A129BarCod, P09AW2_A766ProForDsc, P09AW2_A1273RecLinPro
            }
            , new Object[] {
            P09AW3_A764ProForCod, P09AW3_A396EmprCod, P09AW3_A2804RecLinMaq, P09AW3_A130BarCodPar, P09AW3_A132BarCodReo, P09AW3_A129BarCod, P09AW3_A766ProForDsc, P09AW3_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFRecLinPro ;
   private byte AV11TFRecLinPro_To ;
   private byte AV45Recetadetinte04_wpds_1_tfreclinpro ;
   private byte AV46Recetadetinte04_wpds_2_tfreclinpro_to ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte AV37Barcodreo ;
   private short A2804RecLinMaq ;
   private short AV39Reclinmaq ;
   private short Gx_err ;
   private int AV43GXV1 ;
   private int A129BarCod ;
   private int AV36Barcod ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private String AV12TFProForCod ;
   private String AV13TFProForCod_Sel ;
   private String AV14TFProForDsc ;
   private String AV15TFProForDsc_Sel ;
   private String A764ProForCod ;
   private String AV47Recetadetinte04_wpds_3_tfproforcod ;
   private String AV48Recetadetinte04_wpds_4_tfproforcod_sel ;
   private String AV49Recetadetinte04_wpds_5_tfprofordsc ;
   private String AV50Recetadetinte04_wpds_6_tfprofordsc_sel ;
   private String scmdbuf ;
   private String lV47Recetadetinte04_wpds_3_tfproforcod ;
   private String lV49Recetadetinte04_wpds_5_tfprofordsc ;
   private String A766ProForDsc ;
   private String A130BarCodPar ;
   private String AV38Barcodpar ;
   private String AV35Emprcod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9AW2 ;
   private boolean brk9AW4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09AW2_A396EmprCod ;
   private String[] P09AW2_A764ProForCod ;
   private short[] P09AW2_A2804RecLinMaq ;
   private String[] P09AW2_A130BarCodPar ;
   private byte[] P09AW2_A132BarCodReo ;
   private int[] P09AW2_A129BarCod ;
   private String[] P09AW2_A766ProForDsc ;
   private byte[] P09AW2_A1273RecLinPro ;
   private String[] P09AW3_A764ProForCod ;
   private String[] P09AW3_A396EmprCod ;
   private short[] P09AW3_A2804RecLinMaq ;
   private String[] P09AW3_A130BarCodPar ;
   private byte[] P09AW3_A132BarCodReo ;
   private int[] P09AW3_A129BarCod ;
   private String[] P09AW3_A766ProForDsc ;
   private byte[] P09AW3_A1273RecLinPro ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class recetadetinte04_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09AW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV45Recetadetinte04_wpds_1_tfreclinpro ,
                                          byte AV46Recetadetinte04_wpds_2_tfreclinpro_to ,
                                          String AV48Recetadetinte04_wpds_4_tfproforcod_sel ,
                                          String AV47Recetadetinte04_wpds_3_tfproforcod ,
                                          String AV50Recetadetinte04_wpds_6_tfprofordsc_sel ,
                                          String AV49Recetadetinte04_wpds_5_tfprofordsc ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          int A129BarCod ,
                                          int AV36Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV37Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV38Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV39Reclinmaq ,
                                          String AV35Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ProForDsc, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV45Recetadetinte04_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV46Recetadetinte04_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Recetadetinte04_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV47Recetadetinte04_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Recetadetinte04_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Recetadetinte04_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Recetadetinte04_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Recetadetinte04_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09AW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV45Recetadetinte04_wpds_1_tfreclinpro ,
                                          byte AV46Recetadetinte04_wpds_2_tfreclinpro_to ,
                                          String AV48Recetadetinte04_wpds_4_tfproforcod_sel ,
                                          String AV47Recetadetinte04_wpds_3_tfproforcod ,
                                          String AV50Recetadetinte04_wpds_6_tfprofordsc_sel ,
                                          String AV49Recetadetinte04_wpds_5_tfprofordsc ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          int A129BarCod ,
                                          int AV36Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV37Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV38Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV39Reclinmaq ,
                                          String AV35Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[11];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ProForDsc, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV45Recetadetinte04_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV46Recetadetinte04_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Recetadetinte04_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV47Recetadetinte04_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Recetadetinte04_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Recetadetinte04_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Recetadetinte04_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Recetadetinte04_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
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
                  return conditional_P09AW2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P09AW3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09AW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               return;
      }
   }

}

