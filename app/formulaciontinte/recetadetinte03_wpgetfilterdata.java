package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte03_wpgetfilterdata extends GXProcedure
{
   public recetadetinte03_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte03_wpgetfilterdata.class ), "" );
   }

   public recetadetinte03_wpgetfilterdata( int remoteHandle ,
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
      recetadetinte03_wpgetfilterdata.this.aP5 = new String[] {""};
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
      recetadetinte03_wpgetfilterdata.this.AV24DDOName = aP0;
      recetadetinte03_wpgetfilterdata.this.AV25SearchTxt = aP1;
      recetadetinte03_wpgetfilterdata.this.AV26SearchTxtTo = aP2;
      recetadetinte03_wpgetfilterdata.this.aP3 = aP3;
      recetadetinte03_wpgetfilterdata.this.aP4 = aP4;
      recetadetinte03_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV16OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV17OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARAGREST") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRESTOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV27OptionsJson = AV14Options.toJSonString(false) ;
      AV28OptionsDescJson = AV16OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV17OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.RecetadeTinte03_WPGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeTinte03_WPGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.RecetadeTinte03_WPGridState"), null, null);
      }
      AV40GXV1 = 1 ;
      while ( AV40GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV40GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV10TFBarAgrEst = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV11TFBarAgrEst_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGM") == 0 )
         {
            AV36TFRecTotKgm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFRecTotKgm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV40GXV1 = (int)(AV40GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARAGRESTOPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarAgrEst = AV25SearchTxt ;
      AV11TFBarAgrEst_Sel = "" ;
      AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = AV30FilterFullText ;
      AV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest = AV10TFBarAgrEst ;
      AV44Formulaciontinte_recetadetinte03_wpds_3_tfbaragrest_sel = AV11TFBarAgrEst_Sel ;
      AV45Formulaciontinte_recetadetinte03_wpds_4_tfrectotkgm = AV36TFRecTotKgm ;
      AV46Formulaciontinte_recetadetinte03_wpds_5_tfrectotkgm_to = AV37TFRecTotKgm_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Formulaciontinte_recetadetinte03_wpds_3_tfbaragrest_sel ,
                                           AV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest ,
                                           AV35MaqCod ,
                                           Integer.valueOf(AV32BarCodIN) ,
                                           Byte.valueOf(AV33BarCodreoIN) ,
                                           AV34BarCodparIN ,
                                           A120BarAgrEst ,
                                           A602MaqCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A812RecTotKgm ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV45Formulaciontinte_recetadetinte03_wpds_4_tfrectotkgm ,
                                           AV46Formulaciontinte_recetadetinte03_wpds_5_tfrectotkgm_to ,
                                           A6039RecAcab ,
                                           A396EmprCod ,
                                           AV31EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest = GXutil.padr( GXutil.rtrim( AV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest), 1, "%") ;
      /* Using cursor P0ALC5 */
      pr_default.execute(0, new Object[] {AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext, AV45Formulaciontinte_recetadetinte03_wpds_4_tfrectotkgm, AV45Formulaciontinte_recetadetinte03_wpds_4_tfrectotkgm, AV46Formulaciontinte_recetadetinte03_wpds_5_tfrectotkgm_to, AV46Formulaciontinte_recetadetinte03_wpds_5_tfrectotkgm_to, AV31EmprCod, lV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest, AV44Formulaciontinte_recetadetinte03_wpds_3_tfbaragrest_sel, AV35MaqCod, Integer.valueOf(AV32BarCodIN), Byte.valueOf(AV33BarCodreoIN), AV34BarCodparIN});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkALC2 = false ;
         A396EmprCod = P0ALC5_A396EmprCod[0] ;
         A120BarAgrEst = P0ALC5_A120BarAgrEst[0] ;
         A6039RecAcab = P0ALC5_A6039RecAcab[0] ;
         n6039RecAcab = P0ALC5_n6039RecAcab[0] ;
         A4868RecUsrMod = P0ALC5_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P0ALC5_n4868RecUsrMod[0] ;
         A4402RecUsrCod = P0ALC5_A4402RecUsrCod[0] ;
         A2805RecVolPrd = P0ALC5_A2805RecVolPrd[0] ;
         A602MaqCod = P0ALC5_A602MaqCod[0] ;
         A1235BarNumCli = P0ALC5_A1235BarNumCli[0] ;
         A1234BarNomCli = P0ALC5_A1234BarNomCli[0] ;
         A218BarTipCol = P0ALC5_A218BarTipCol[0] ;
         A136BarColNum = P0ALC5_A136BarColNum[0] ;
         A135BarColNom = P0ALC5_A135BarColNom[0] ;
         A1652BarSerDsc = P0ALC5_A1652BarSerDsc[0] ;
         A212BarSer = P0ALC5_A212BarSer[0] ;
         A2804RecLinMaq = P0ALC5_A2804RecLinMaq[0] ;
         A130BarCodPar = P0ALC5_A130BarCodPar[0] ;
         A132BarCodReo = P0ALC5_A132BarCodReo[0] ;
         A129BarCod = P0ALC5_A129BarCod[0] ;
         A812RecTotKgm = P0ALC5_A812RecTotKgm[0] ;
         n812RecTotKgm = P0ALC5_n812RecTotKgm[0] ;
         A120BarAgrEst = P0ALC5_A120BarAgrEst[0] ;
         A1235BarNumCli = P0ALC5_A1235BarNumCli[0] ;
         A1234BarNomCli = P0ALC5_A1234BarNomCli[0] ;
         A218BarTipCol = P0ALC5_A218BarTipCol[0] ;
         A136BarColNum = P0ALC5_A136BarColNum[0] ;
         A135BarColNom = P0ALC5_A135BarColNom[0] ;
         A1652BarSerDsc = P0ALC5_A1652BarSerDsc[0] ;
         A212BarSer = P0ALC5_A212BarSer[0] ;
         A812RecTotKgm = P0ALC5_A812RecTotKgm[0] ;
         n812RecTotKgm = P0ALC5_n812RecTotKgm[0] ;
         AV18count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ALC5_A120BarAgrEst[0], A120BarAgrEst) == 0 ) )
         {
            brkALC2 = false ;
            A396EmprCod = P0ALC5_A396EmprCod[0] ;
            A2804RecLinMaq = P0ALC5_A2804RecLinMaq[0] ;
            A130BarCodPar = P0ALC5_A130BarCodPar[0] ;
            A132BarCodReo = P0ALC5_A132BarCodReo[0] ;
            A129BarCod = P0ALC5_A129BarCod[0] ;
            AV18count = (long)(AV18count+1) ;
            brkALC2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A120BarAgrEst)==0) )
         {
            AV13Option = A120BarAgrEst ;
            AV15OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))) ;
            AV14Options.add(AV13Option, 0);
            AV16OptionsDesc.add(AV15OptionDesc, 0);
            AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV14Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALC2 )
         {
            brkALC2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadetinte03_wpgetfilterdata.this.AV27OptionsJson;
      this.aP4[0] = recetadetinte03_wpgetfilterdata.this.AV28OptionsDescJson;
      this.aP5[0] = recetadetinte03_wpgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27OptionsJson = "" ;
      AV28OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV14Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV30FilterFullText = "" ;
      AV10TFBarAgrEst = "" ;
      AV11TFBarAgrEst_Sel = "" ;
      AV36TFRecTotKgm = DecimalUtil.ZERO ;
      AV37TFRecTotKgm_To = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = "" ;
      AV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest = "" ;
      AV44Formulaciontinte_recetadetinte03_wpds_3_tfbaragrest_sel = "" ;
      AV45Formulaciontinte_recetadetinte03_wpds_4_tfrectotkgm = DecimalUtil.ZERO ;
      AV46Formulaciontinte_recetadetinte03_wpds_5_tfrectotkgm_to = DecimalUtil.ZERO ;
      lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest = "" ;
      AV35MaqCod = "" ;
      AV34BarCodparIN = "" ;
      A602MaqCod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A4402RecUsrCod = "" ;
      A4868RecUsrMod = "" ;
      A6039RecAcab = "" ;
      A396EmprCod = "" ;
      AV31EmprCod = "" ;
      P0ALC5_A396EmprCod = new String[] {""} ;
      P0ALC5_A120BarAgrEst = new String[] {""} ;
      P0ALC5_A6039RecAcab = new String[] {""} ;
      P0ALC5_n6039RecAcab = new boolean[] {false} ;
      P0ALC5_A4868RecUsrMod = new String[] {""} ;
      P0ALC5_n4868RecUsrMod = new boolean[] {false} ;
      P0ALC5_A4402RecUsrCod = new String[] {""} ;
      P0ALC5_A2805RecVolPrd = new int[1] ;
      P0ALC5_A602MaqCod = new String[] {""} ;
      P0ALC5_A1235BarNumCli = new int[1] ;
      P0ALC5_A1234BarNomCli = new String[] {""} ;
      P0ALC5_A218BarTipCol = new byte[1] ;
      P0ALC5_A136BarColNum = new int[1] ;
      P0ALC5_A135BarColNom = new String[] {""} ;
      P0ALC5_A1652BarSerDsc = new String[] {""} ;
      P0ALC5_A212BarSer = new String[] {""} ;
      P0ALC5_A2804RecLinMaq = new short[1] ;
      P0ALC5_A130BarCodPar = new String[] {""} ;
      P0ALC5_A132BarCodReo = new byte[1] ;
      P0ALC5_A129BarCod = new int[1] ;
      P0ALC5_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALC5_n812RecTotKgm = new boolean[] {false} ;
      AV13Option = "" ;
      AV15OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte03_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ALC5_A396EmprCod, P0ALC5_A120BarAgrEst, P0ALC5_A6039RecAcab, P0ALC5_n6039RecAcab, P0ALC5_A4868RecUsrMod, P0ALC5_n4868RecUsrMod, P0ALC5_A4402RecUsrCod, P0ALC5_A2805RecVolPrd, P0ALC5_A602MaqCod, P0ALC5_A1235BarNumCli,
            P0ALC5_A1234BarNomCli, P0ALC5_A218BarTipCol, P0ALC5_A136BarColNum, P0ALC5_A135BarColNom, P0ALC5_A1652BarSerDsc, P0ALC5_A212BarSer, P0ALC5_A2804RecLinMaq, P0ALC5_A130BarCodPar, P0ALC5_A132BarCodReo, P0ALC5_A129BarCod,
            P0ALC5_A812RecTotKgm, P0ALC5_n812RecTotKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33BarCodreoIN ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV40GXV1 ;
   private int AV32BarCodIN ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private long AV18count ;
   private java.math.BigDecimal AV36TFRecTotKgm ;
   private java.math.BigDecimal AV37TFRecTotKgm_To ;
   private java.math.BigDecimal AV45Formulaciontinte_recetadetinte03_wpds_4_tfrectotkgm ;
   private java.math.BigDecimal AV46Formulaciontinte_recetadetinte03_wpds_5_tfrectotkgm_to ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String AV10TFBarAgrEst ;
   private String AV11TFBarAgrEst_Sel ;
   private String A120BarAgrEst ;
   private String AV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest ;
   private String AV44Formulaciontinte_recetadetinte03_wpds_3_tfbaragrest_sel ;
   private String scmdbuf ;
   private String lV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest ;
   private String AV35MaqCod ;
   private String AV34BarCodparIN ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A4402RecUsrCod ;
   private String A4868RecUsrMod ;
   private String A6039RecAcab ;
   private String A396EmprCod ;
   private String AV31EmprCod ;
   private boolean returnInSub ;
   private boolean brkALC2 ;
   private boolean n6039RecAcab ;
   private boolean n4868RecUsrMod ;
   private boolean n812RecTotKgm ;
   private String AV27OptionsJson ;
   private String AV28OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV25SearchTxt ;
   private String AV26SearchTxtTo ;
   private String AV30FilterFullText ;
   private String AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext ;
   private String lV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext ;
   private String AV13Option ;
   private String AV15OptionDesc ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALC5_A396EmprCod ;
   private String[] P0ALC5_A120BarAgrEst ;
   private String[] P0ALC5_A6039RecAcab ;
   private boolean[] P0ALC5_n6039RecAcab ;
   private String[] P0ALC5_A4868RecUsrMod ;
   private boolean[] P0ALC5_n4868RecUsrMod ;
   private String[] P0ALC5_A4402RecUsrCod ;
   private int[] P0ALC5_A2805RecVolPrd ;
   private String[] P0ALC5_A602MaqCod ;
   private int[] P0ALC5_A1235BarNumCli ;
   private String[] P0ALC5_A1234BarNomCli ;
   private byte[] P0ALC5_A218BarTipCol ;
   private int[] P0ALC5_A136BarColNum ;
   private String[] P0ALC5_A135BarColNom ;
   private String[] P0ALC5_A1652BarSerDsc ;
   private String[] P0ALC5_A212BarSer ;
   private short[] P0ALC5_A2804RecLinMaq ;
   private String[] P0ALC5_A130BarCodPar ;
   private byte[] P0ALC5_A132BarCodReo ;
   private int[] P0ALC5_A129BarCod ;
   private java.math.BigDecimal[] P0ALC5_A812RecTotKgm ;
   private boolean[] P0ALC5_n812RecTotKgm ;
   private GXSimpleCollection<String> AV14Options ;
   private GXSimpleCollection<String> AV16OptionsDesc ;
   private GXSimpleCollection<String> AV17OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class recetadetinte03_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ALC5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Formulaciontinte_recetadetinte03_wpds_3_tfbaragrest_sel ,
                                          String AV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest ,
                                          String AV35MaqCod ,
                                          int AV32BarCodIN ,
                                          byte AV33BarCodreoIN ,
                                          String AV34BarCodparIN ,
                                          String A120BarAgrEst ,
                                          String A602MaqCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV42Formulaciontinte_recetadetinte03_wpds_1_filterfulltext ,
                                          short A2804RecLinMaq ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          int A2805RecVolPrd ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.math.BigDecimal AV45Formulaciontinte_recetadetinte03_wpds_4_tfrectotkgm ,
                                          java.math.BigDecimal AV46Formulaciontinte_recetadetinte03_wpds_5_tfrectotkgm_to ,
                                          String A6039RecAcab ,
                                          String A396EmprCod ,
                                          String AV31EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.BarAgrEst, T1.RecAcab, T1.RecUsrMod, T1.RecUsrCod, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSerDsc, T2.BarSer, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr," ;
      scmdbuf += " 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV44Formulaciontinte_recetadetinte03_wpds_3_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV43Formulaciontinte_recetadetinte03_wpds_2_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Formulaciontinte_recetadetinte03_wpds_3_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35MaqCod)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV32BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV33BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarAgrEst" ;
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
                  return conditional_P0ALC5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALC5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               return;
      }
   }

}

