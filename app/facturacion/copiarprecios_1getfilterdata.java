package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class copiarprecios_1getfilterdata extends GXProcedure
{
   public copiarprecios_1getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( copiarprecios_1getfilterdata.class ), "" );
   }

   public copiarprecios_1getfilterdata( int remoteHandle ,
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
      copiarprecios_1getfilterdata.this.aP5 = new String[] {""};
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
      copiarprecios_1getfilterdata.this.AV32DDOName = aP0;
      copiarprecios_1getfilterdata.this.AV33SearchTxt = aP1;
      copiarprecios_1getfilterdata.this.AV34SearchTxtTo = aP2;
      copiarprecios_1getfilterdata.this.aP3 = aP3;
      copiarprecios_1getfilterdata.this.aP4 = aP4;
      copiarprecios_1getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADARTCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADARTDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ARTMAT") == 0 )
      {
         /* Execute user subroutine: 'LOADARTMATOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_TIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV35OptionsJson = AV22Options.toJSonString(false) ;
      AV36OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV25OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("Facturacion.CopiarPrecios_1GridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.CopiarPrecios_1GridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("Facturacion.CopiarPrecios_1GridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV10TFArtCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV11TFArtCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV12TFArtDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV13TFArtDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTMAT") == 0 )
         {
            AV14TFArtMat = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTMAT_SEL") == 0 )
         {
            AV15TFArtMat_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV16TFTipArtCod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFTipArtCod_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV18TFTipArtDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV19TFTipArtDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFArtCod = AV33SearchTxt ;
      AV11TFArtCod_Sel = "" ;
      AV50Facturacion_copiarprecios_1ds_1_tfartcod = AV10TFArtCod ;
      AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel = AV11TFArtCod_Sel ;
      AV52Facturacion_copiarprecios_1ds_3_tfartdsc = AV12TFArtDsc ;
      AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel = AV13TFArtDsc_Sel ;
      AV54Facturacion_copiarprecios_1ds_5_tfartmat = AV14TFArtMat ;
      AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel = AV15TFArtMat_Sel ;
      AV56Facturacion_copiarprecios_1ds_7_tftipartcod = AV16TFTipArtCod ;
      AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to = AV17TFTipArtCod_To ;
      AV58Facturacion_copiarprecios_1ds_9_tftipartdsc = AV18TFTipArtDsc ;
      AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel = AV19TFTipArtDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel ,
                                           AV50Facturacion_copiarprecios_1ds_1_tfartcod ,
                                           AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel ,
                                           AV52Facturacion_copiarprecios_1ds_3_tfartdsc ,
                                           AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel ,
                                           AV54Facturacion_copiarprecios_1ds_5_tfartmat ,
                                           Short.valueOf(AV56Facturacion_copiarprecios_1ds_7_tftipartcod) ,
                                           Short.valueOf(AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to) ,
                                           AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel ,
                                           AV58Facturacion_copiarprecios_1ds_9_tftipartdsc ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A87ArtMat ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           AV45ArtCod ,
                                           A14295ArtActivo ,
                                           AV43emprcod ,
                                           Integer.valueOf(AV44clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV50Facturacion_copiarprecios_1ds_1_tfartcod = GXutil.padr( GXutil.rtrim( AV50Facturacion_copiarprecios_1ds_1_tfartcod), 16, "%") ;
      lV52Facturacion_copiarprecios_1ds_3_tfartdsc = GXutil.padr( GXutil.rtrim( AV52Facturacion_copiarprecios_1ds_3_tfartdsc), 26, "%") ;
      lV54Facturacion_copiarprecios_1ds_5_tfartmat = GXutil.padr( GXutil.rtrim( AV54Facturacion_copiarprecios_1ds_5_tfartmat), 16, "%") ;
      lV58Facturacion_copiarprecios_1ds_9_tftipartdsc = GXutil.padr( GXutil.rtrim( AV58Facturacion_copiarprecios_1ds_9_tftipartdsc), 30, "%") ;
      /* Using cursor P0ALQ2 */
      pr_default.execute(0, new Object[] {AV43emprcod, Integer.valueOf(AV44clicod), AV45ArtCod, lV50Facturacion_copiarprecios_1ds_1_tfartcod, AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel, lV52Facturacion_copiarprecios_1ds_3_tfartdsc, AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel, lV54Facturacion_copiarprecios_1ds_5_tfartmat, AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel, Short.valueOf(AV56Facturacion_copiarprecios_1ds_7_tftipartcod), Short.valueOf(AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to), lV58Facturacion_copiarprecios_1ds_9_tftipartdsc, AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkALQ2 = false ;
         A252CliCod = P0ALQ2_A252CliCod[0] ;
         A396EmprCod = P0ALQ2_A396EmprCod[0] ;
         A65ArtCod = P0ALQ2_A65ArtCod[0] ;
         A14295ArtActivo = P0ALQ2_A14295ArtActivo[0] ;
         A830TipArtDsc = P0ALQ2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ALQ2_n830TipArtDsc[0] ;
         A829TipArtCod = P0ALQ2_A829TipArtCod[0] ;
         A87ArtMat = P0ALQ2_A87ArtMat[0] ;
         n87ArtMat = P0ALQ2_n87ArtMat[0] ;
         A69ArtDsc = P0ALQ2_A69ArtDsc[0] ;
         n69ArtDsc = P0ALQ2_n69ArtDsc[0] ;
         A830TipArtDsc = P0ALQ2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ALQ2_n830TipArtDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ALQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ALQ2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P0ALQ2_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brkALQ2 = false ;
            AV26count = (long)(AV26count+1) ;
            brkALQ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV21Option = A65ArtCod ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALQ2 )
         {
            brkALQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFArtDsc = AV33SearchTxt ;
      AV13TFArtDsc_Sel = "" ;
      AV50Facturacion_copiarprecios_1ds_1_tfartcod = AV10TFArtCod ;
      AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel = AV11TFArtCod_Sel ;
      AV52Facturacion_copiarprecios_1ds_3_tfartdsc = AV12TFArtDsc ;
      AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel = AV13TFArtDsc_Sel ;
      AV54Facturacion_copiarprecios_1ds_5_tfartmat = AV14TFArtMat ;
      AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel = AV15TFArtMat_Sel ;
      AV56Facturacion_copiarprecios_1ds_7_tftipartcod = AV16TFTipArtCod ;
      AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to = AV17TFTipArtCod_To ;
      AV58Facturacion_copiarprecios_1ds_9_tftipartdsc = AV18TFTipArtDsc ;
      AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel = AV19TFTipArtDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel ,
                                           AV50Facturacion_copiarprecios_1ds_1_tfartcod ,
                                           AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel ,
                                           AV52Facturacion_copiarprecios_1ds_3_tfartdsc ,
                                           AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel ,
                                           AV54Facturacion_copiarprecios_1ds_5_tfartmat ,
                                           Short.valueOf(AV56Facturacion_copiarprecios_1ds_7_tftipartcod) ,
                                           Short.valueOf(AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to) ,
                                           AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel ,
                                           AV58Facturacion_copiarprecios_1ds_9_tftipartdsc ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A87ArtMat ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           AV45ArtCod ,
                                           A396EmprCod ,
                                           AV43emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV44clicod) ,
                                           A14295ArtActivo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV50Facturacion_copiarprecios_1ds_1_tfartcod = GXutil.padr( GXutil.rtrim( AV50Facturacion_copiarprecios_1ds_1_tfartcod), 16, "%") ;
      lV52Facturacion_copiarprecios_1ds_3_tfartdsc = GXutil.padr( GXutil.rtrim( AV52Facturacion_copiarprecios_1ds_3_tfartdsc), 26, "%") ;
      lV54Facturacion_copiarprecios_1ds_5_tfartmat = GXutil.padr( GXutil.rtrim( AV54Facturacion_copiarprecios_1ds_5_tfartmat), 16, "%") ;
      lV58Facturacion_copiarprecios_1ds_9_tftipartdsc = GXutil.padr( GXutil.rtrim( AV58Facturacion_copiarprecios_1ds_9_tftipartdsc), 30, "%") ;
      /* Using cursor P0ALQ3 */
      pr_default.execute(1, new Object[] {AV45ArtCod, AV43emprcod, Integer.valueOf(AV44clicod), lV50Facturacion_copiarprecios_1ds_1_tfartcod, AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel, lV52Facturacion_copiarprecios_1ds_3_tfartdsc, AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel, lV54Facturacion_copiarprecios_1ds_5_tfartmat, AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel, Short.valueOf(AV56Facturacion_copiarprecios_1ds_7_tftipartcod), Short.valueOf(AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to), lV58Facturacion_copiarprecios_1ds_9_tftipartdsc, AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkALQ4 = false ;
         A396EmprCod = P0ALQ3_A396EmprCod[0] ;
         A252CliCod = P0ALQ3_A252CliCod[0] ;
         A14295ArtActivo = P0ALQ3_A14295ArtActivo[0] ;
         A69ArtDsc = P0ALQ3_A69ArtDsc[0] ;
         n69ArtDsc = P0ALQ3_n69ArtDsc[0] ;
         A830TipArtDsc = P0ALQ3_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ALQ3_n830TipArtDsc[0] ;
         A829TipArtCod = P0ALQ3_A829TipArtCod[0] ;
         A87ArtMat = P0ALQ3_A87ArtMat[0] ;
         n87ArtMat = P0ALQ3_n87ArtMat[0] ;
         A65ArtCod = P0ALQ3_A65ArtCod[0] ;
         A830TipArtDsc = P0ALQ3_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ALQ3_n830TipArtDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ALQ3_A69ArtDsc[0], A69ArtDsc) == 0 ) )
         {
            brkALQ4 = false ;
            A396EmprCod = P0ALQ3_A396EmprCod[0] ;
            A252CliCod = P0ALQ3_A252CliCod[0] ;
            A65ArtCod = P0ALQ3_A65ArtCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkALQ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV21Option = A69ArtDsc ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALQ4 )
         {
            brkALQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADARTMATOPTIONS' Routine */
      returnInSub = false ;
      AV14TFArtMat = AV33SearchTxt ;
      AV15TFArtMat_Sel = "" ;
      AV50Facturacion_copiarprecios_1ds_1_tfartcod = AV10TFArtCod ;
      AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel = AV11TFArtCod_Sel ;
      AV52Facturacion_copiarprecios_1ds_3_tfartdsc = AV12TFArtDsc ;
      AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel = AV13TFArtDsc_Sel ;
      AV54Facturacion_copiarprecios_1ds_5_tfartmat = AV14TFArtMat ;
      AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel = AV15TFArtMat_Sel ;
      AV56Facturacion_copiarprecios_1ds_7_tftipartcod = AV16TFTipArtCod ;
      AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to = AV17TFTipArtCod_To ;
      AV58Facturacion_copiarprecios_1ds_9_tftipartdsc = AV18TFTipArtDsc ;
      AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel = AV19TFTipArtDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel ,
                                           AV50Facturacion_copiarprecios_1ds_1_tfartcod ,
                                           AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel ,
                                           AV52Facturacion_copiarprecios_1ds_3_tfartdsc ,
                                           AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel ,
                                           AV54Facturacion_copiarprecios_1ds_5_tfartmat ,
                                           Short.valueOf(AV56Facturacion_copiarprecios_1ds_7_tftipartcod) ,
                                           Short.valueOf(AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to) ,
                                           AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel ,
                                           AV58Facturacion_copiarprecios_1ds_9_tftipartdsc ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A87ArtMat ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           AV45ArtCod ,
                                           A396EmprCod ,
                                           AV43emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV44clicod) ,
                                           A14295ArtActivo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV50Facturacion_copiarprecios_1ds_1_tfartcod = GXutil.padr( GXutil.rtrim( AV50Facturacion_copiarprecios_1ds_1_tfartcod), 16, "%") ;
      lV52Facturacion_copiarprecios_1ds_3_tfartdsc = GXutil.padr( GXutil.rtrim( AV52Facturacion_copiarprecios_1ds_3_tfartdsc), 26, "%") ;
      lV54Facturacion_copiarprecios_1ds_5_tfartmat = GXutil.padr( GXutil.rtrim( AV54Facturacion_copiarprecios_1ds_5_tfartmat), 16, "%") ;
      lV58Facturacion_copiarprecios_1ds_9_tftipartdsc = GXutil.padr( GXutil.rtrim( AV58Facturacion_copiarprecios_1ds_9_tftipartdsc), 30, "%") ;
      /* Using cursor P0ALQ4 */
      pr_default.execute(2, new Object[] {AV45ArtCod, AV43emprcod, Integer.valueOf(AV44clicod), lV50Facturacion_copiarprecios_1ds_1_tfartcod, AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel, lV52Facturacion_copiarprecios_1ds_3_tfartdsc, AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel, lV54Facturacion_copiarprecios_1ds_5_tfartmat, AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel, Short.valueOf(AV56Facturacion_copiarprecios_1ds_7_tftipartcod), Short.valueOf(AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to), lV58Facturacion_copiarprecios_1ds_9_tftipartdsc, AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkALQ6 = false ;
         A396EmprCod = P0ALQ4_A396EmprCod[0] ;
         A252CliCod = P0ALQ4_A252CliCod[0] ;
         A14295ArtActivo = P0ALQ4_A14295ArtActivo[0] ;
         A87ArtMat = P0ALQ4_A87ArtMat[0] ;
         n87ArtMat = P0ALQ4_n87ArtMat[0] ;
         A830TipArtDsc = P0ALQ4_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ALQ4_n830TipArtDsc[0] ;
         A829TipArtCod = P0ALQ4_A829TipArtCod[0] ;
         A69ArtDsc = P0ALQ4_A69ArtDsc[0] ;
         n69ArtDsc = P0ALQ4_n69ArtDsc[0] ;
         A65ArtCod = P0ALQ4_A65ArtCod[0] ;
         A830TipArtDsc = P0ALQ4_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ALQ4_n830TipArtDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ALQ4_A87ArtMat[0], A87ArtMat) == 0 ) )
         {
            brkALQ6 = false ;
            A396EmprCod = P0ALQ4_A396EmprCod[0] ;
            A252CliCod = P0ALQ4_A252CliCod[0] ;
            A65ArtCod = P0ALQ4_A65ArtCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkALQ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A87ArtMat)==0) )
         {
            AV21Option = A87ArtMat ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALQ6 )
         {
            brkALQ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFTipArtDsc = AV33SearchTxt ;
      AV19TFTipArtDsc_Sel = "" ;
      AV50Facturacion_copiarprecios_1ds_1_tfartcod = AV10TFArtCod ;
      AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel = AV11TFArtCod_Sel ;
      AV52Facturacion_copiarprecios_1ds_3_tfartdsc = AV12TFArtDsc ;
      AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel = AV13TFArtDsc_Sel ;
      AV54Facturacion_copiarprecios_1ds_5_tfartmat = AV14TFArtMat ;
      AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel = AV15TFArtMat_Sel ;
      AV56Facturacion_copiarprecios_1ds_7_tftipartcod = AV16TFTipArtCod ;
      AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to = AV17TFTipArtCod_To ;
      AV58Facturacion_copiarprecios_1ds_9_tftipartdsc = AV18TFTipArtDsc ;
      AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel = AV19TFTipArtDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel ,
                                           AV50Facturacion_copiarprecios_1ds_1_tfartcod ,
                                           AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel ,
                                           AV52Facturacion_copiarprecios_1ds_3_tfartdsc ,
                                           AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel ,
                                           AV54Facturacion_copiarprecios_1ds_5_tfartmat ,
                                           Short.valueOf(AV56Facturacion_copiarprecios_1ds_7_tftipartcod) ,
                                           Short.valueOf(AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to) ,
                                           AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel ,
                                           AV58Facturacion_copiarprecios_1ds_9_tftipartdsc ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A87ArtMat ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           AV45ArtCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV44clicod) ,
                                           A14295ArtActivo ,
                                           AV43emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Facturacion_copiarprecios_1ds_1_tfartcod = GXutil.padr( GXutil.rtrim( AV50Facturacion_copiarprecios_1ds_1_tfartcod), 16, "%") ;
      lV52Facturacion_copiarprecios_1ds_3_tfartdsc = GXutil.padr( GXutil.rtrim( AV52Facturacion_copiarprecios_1ds_3_tfartdsc), 26, "%") ;
      lV54Facturacion_copiarprecios_1ds_5_tfartmat = GXutil.padr( GXutil.rtrim( AV54Facturacion_copiarprecios_1ds_5_tfartmat), 16, "%") ;
      lV58Facturacion_copiarprecios_1ds_9_tftipartdsc = GXutil.padr( GXutil.rtrim( AV58Facturacion_copiarprecios_1ds_9_tftipartdsc), 30, "%") ;
      /* Using cursor P0ALQ5 */
      pr_default.execute(3, new Object[] {AV43emprcod, AV45ArtCod, Integer.valueOf(AV44clicod), lV50Facturacion_copiarprecios_1ds_1_tfartcod, AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel, lV52Facturacion_copiarprecios_1ds_3_tfartdsc, AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel, lV54Facturacion_copiarprecios_1ds_5_tfartmat, AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel, Short.valueOf(AV56Facturacion_copiarprecios_1ds_7_tftipartcod), Short.valueOf(AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to), lV58Facturacion_copiarprecios_1ds_9_tftipartdsc, AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkALQ8 = false ;
         A829TipArtCod = P0ALQ5_A829TipArtCod[0] ;
         A396EmprCod = P0ALQ5_A396EmprCod[0] ;
         A14295ArtActivo = P0ALQ5_A14295ArtActivo[0] ;
         A252CliCod = P0ALQ5_A252CliCod[0] ;
         A830TipArtDsc = P0ALQ5_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ALQ5_n830TipArtDsc[0] ;
         A87ArtMat = P0ALQ5_A87ArtMat[0] ;
         n87ArtMat = P0ALQ5_n87ArtMat[0] ;
         A69ArtDsc = P0ALQ5_A69ArtDsc[0] ;
         n69ArtDsc = P0ALQ5_n69ArtDsc[0] ;
         A65ArtCod = P0ALQ5_A65ArtCod[0] ;
         A830TipArtDsc = P0ALQ5_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ALQ5_n830TipArtDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0ALQ5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ALQ5_A829TipArtCod[0] == A829TipArtCod ) )
         {
            brkALQ8 = false ;
            A252CliCod = P0ALQ5_A252CliCod[0] ;
            A65ArtCod = P0ALQ5_A65ArtCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkALQ8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A830TipArtDsc)==0) )
         {
            AV21Option = A830TipArtDsc ;
            AV20InsertIndex = 1 ;
            while ( ( AV20InsertIndex <= AV22Options.size() ) && ( GXutil.strcmp((String)AV22Options.elementAt(-1+AV20InsertIndex), AV21Option) < 0 ) )
            {
               AV20InsertIndex = (int)(AV20InsertIndex+1) ;
            }
            AV22Options.add(AV21Option, AV20InsertIndex);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), AV20InsertIndex);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkALQ8 )
         {
            brkALQ8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = copiarprecios_1getfilterdata.this.AV35OptionsJson;
      this.aP4[0] = copiarprecios_1getfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = copiarprecios_1getfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35OptionsJson = "" ;
      AV36OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFArtCod = "" ;
      AV11TFArtCod_Sel = "" ;
      AV12TFArtDsc = "" ;
      AV13TFArtDsc_Sel = "" ;
      AV14TFArtMat = "" ;
      AV15TFArtMat_Sel = "" ;
      AV18TFTipArtDsc = "" ;
      AV19TFTipArtDsc_Sel = "" ;
      A65ArtCod = "" ;
      AV50Facturacion_copiarprecios_1ds_1_tfartcod = "" ;
      AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel = "" ;
      AV52Facturacion_copiarprecios_1ds_3_tfartdsc = "" ;
      AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel = "" ;
      AV54Facturacion_copiarprecios_1ds_5_tfartmat = "" ;
      AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel = "" ;
      AV58Facturacion_copiarprecios_1ds_9_tftipartdsc = "" ;
      AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel = "" ;
      scmdbuf = "" ;
      lV50Facturacion_copiarprecios_1ds_1_tfartcod = "" ;
      lV52Facturacion_copiarprecios_1ds_3_tfartdsc = "" ;
      lV54Facturacion_copiarprecios_1ds_5_tfartmat = "" ;
      lV58Facturacion_copiarprecios_1ds_9_tftipartdsc = "" ;
      A69ArtDsc = "" ;
      A87ArtMat = "" ;
      A830TipArtDsc = "" ;
      AV45ArtCod = "" ;
      A14295ArtActivo = "" ;
      AV43emprcod = "" ;
      A396EmprCod = "" ;
      P0ALQ2_A252CliCod = new int[1] ;
      P0ALQ2_A396EmprCod = new String[] {""} ;
      P0ALQ2_A65ArtCod = new String[] {""} ;
      P0ALQ2_A14295ArtActivo = new String[] {""} ;
      P0ALQ2_A830TipArtDsc = new String[] {""} ;
      P0ALQ2_n830TipArtDsc = new boolean[] {false} ;
      P0ALQ2_A829TipArtCod = new short[1] ;
      P0ALQ2_A87ArtMat = new String[] {""} ;
      P0ALQ2_n87ArtMat = new boolean[] {false} ;
      P0ALQ2_A69ArtDsc = new String[] {""} ;
      P0ALQ2_n69ArtDsc = new boolean[] {false} ;
      AV21Option = "" ;
      P0ALQ3_A396EmprCod = new String[] {""} ;
      P0ALQ3_A252CliCod = new int[1] ;
      P0ALQ3_A14295ArtActivo = new String[] {""} ;
      P0ALQ3_A69ArtDsc = new String[] {""} ;
      P0ALQ3_n69ArtDsc = new boolean[] {false} ;
      P0ALQ3_A830TipArtDsc = new String[] {""} ;
      P0ALQ3_n830TipArtDsc = new boolean[] {false} ;
      P0ALQ3_A829TipArtCod = new short[1] ;
      P0ALQ3_A87ArtMat = new String[] {""} ;
      P0ALQ3_n87ArtMat = new boolean[] {false} ;
      P0ALQ3_A65ArtCod = new String[] {""} ;
      P0ALQ4_A396EmprCod = new String[] {""} ;
      P0ALQ4_A252CliCod = new int[1] ;
      P0ALQ4_A14295ArtActivo = new String[] {""} ;
      P0ALQ4_A87ArtMat = new String[] {""} ;
      P0ALQ4_n87ArtMat = new boolean[] {false} ;
      P0ALQ4_A830TipArtDsc = new String[] {""} ;
      P0ALQ4_n830TipArtDsc = new boolean[] {false} ;
      P0ALQ4_A829TipArtCod = new short[1] ;
      P0ALQ4_A69ArtDsc = new String[] {""} ;
      P0ALQ4_n69ArtDsc = new boolean[] {false} ;
      P0ALQ4_A65ArtCod = new String[] {""} ;
      P0ALQ5_A829TipArtCod = new short[1] ;
      P0ALQ5_A396EmprCod = new String[] {""} ;
      P0ALQ5_A14295ArtActivo = new String[] {""} ;
      P0ALQ5_A252CliCod = new int[1] ;
      P0ALQ5_A830TipArtDsc = new String[] {""} ;
      P0ALQ5_n830TipArtDsc = new boolean[] {false} ;
      P0ALQ5_A87ArtMat = new String[] {""} ;
      P0ALQ5_n87ArtMat = new boolean[] {false} ;
      P0ALQ5_A69ArtDsc = new String[] {""} ;
      P0ALQ5_n69ArtDsc = new boolean[] {false} ;
      P0ALQ5_A65ArtCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.copiarprecios_1getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ALQ2_A252CliCod, P0ALQ2_A396EmprCod, P0ALQ2_A65ArtCod, P0ALQ2_A14295ArtActivo, P0ALQ2_A830TipArtDsc, P0ALQ2_n830TipArtDsc, P0ALQ2_A829TipArtCod, P0ALQ2_A87ArtMat, P0ALQ2_n87ArtMat, P0ALQ2_A69ArtDsc,
            P0ALQ2_n69ArtDsc
            }
            , new Object[] {
            P0ALQ3_A396EmprCod, P0ALQ3_A252CliCod, P0ALQ3_A14295ArtActivo, P0ALQ3_A69ArtDsc, P0ALQ3_n69ArtDsc, P0ALQ3_A830TipArtDsc, P0ALQ3_n830TipArtDsc, P0ALQ3_A829TipArtCod, P0ALQ3_A87ArtMat, P0ALQ3_n87ArtMat,
            P0ALQ3_A65ArtCod
            }
            , new Object[] {
            P0ALQ4_A396EmprCod, P0ALQ4_A252CliCod, P0ALQ4_A14295ArtActivo, P0ALQ4_A87ArtMat, P0ALQ4_n87ArtMat, P0ALQ4_A830TipArtDsc, P0ALQ4_n830TipArtDsc, P0ALQ4_A829TipArtCod, P0ALQ4_A69ArtDsc, P0ALQ4_n69ArtDsc,
            P0ALQ4_A65ArtCod
            }
            , new Object[] {
            P0ALQ5_A829TipArtCod, P0ALQ5_A396EmprCod, P0ALQ5_A14295ArtActivo, P0ALQ5_A252CliCod, P0ALQ5_A830TipArtDsc, P0ALQ5_n830TipArtDsc, P0ALQ5_A87ArtMat, P0ALQ5_n87ArtMat, P0ALQ5_A69ArtDsc, P0ALQ5_n69ArtDsc,
            P0ALQ5_A65ArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16TFTipArtCod ;
   private short AV17TFTipArtCod_To ;
   private short AV56Facturacion_copiarprecios_1ds_7_tftipartcod ;
   private short AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private int AV44clicod ;
   private int A252CliCod ;
   private int AV20InsertIndex ;
   private long AV26count ;
   private String AV10TFArtCod ;
   private String AV11TFArtCod_Sel ;
   private String AV12TFArtDsc ;
   private String AV13TFArtDsc_Sel ;
   private String AV14TFArtMat ;
   private String AV15TFArtMat_Sel ;
   private String AV18TFTipArtDsc ;
   private String AV19TFTipArtDsc_Sel ;
   private String A65ArtCod ;
   private String AV50Facturacion_copiarprecios_1ds_1_tfartcod ;
   private String AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel ;
   private String AV52Facturacion_copiarprecios_1ds_3_tfartdsc ;
   private String AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel ;
   private String AV54Facturacion_copiarprecios_1ds_5_tfartmat ;
   private String AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel ;
   private String AV58Facturacion_copiarprecios_1ds_9_tftipartdsc ;
   private String AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel ;
   private String scmdbuf ;
   private String lV50Facturacion_copiarprecios_1ds_1_tfartcod ;
   private String lV52Facturacion_copiarprecios_1ds_3_tfartdsc ;
   private String lV54Facturacion_copiarprecios_1ds_5_tfartmat ;
   private String lV58Facturacion_copiarprecios_1ds_9_tftipartdsc ;
   private String A69ArtDsc ;
   private String A87ArtMat ;
   private String A830TipArtDsc ;
   private String AV45ArtCod ;
   private String A14295ArtActivo ;
   private String AV43emprcod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkALQ2 ;
   private boolean n830TipArtDsc ;
   private boolean n87ArtMat ;
   private boolean n69ArtDsc ;
   private boolean brkALQ4 ;
   private boolean brkALQ6 ;
   private boolean brkALQ8 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV21Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0ALQ2_A252CliCod ;
   private String[] P0ALQ2_A396EmprCod ;
   private String[] P0ALQ2_A65ArtCod ;
   private String[] P0ALQ2_A14295ArtActivo ;
   private String[] P0ALQ2_A830TipArtDsc ;
   private boolean[] P0ALQ2_n830TipArtDsc ;
   private short[] P0ALQ2_A829TipArtCod ;
   private String[] P0ALQ2_A87ArtMat ;
   private boolean[] P0ALQ2_n87ArtMat ;
   private String[] P0ALQ2_A69ArtDsc ;
   private boolean[] P0ALQ2_n69ArtDsc ;
   private String[] P0ALQ3_A396EmprCod ;
   private int[] P0ALQ3_A252CliCod ;
   private String[] P0ALQ3_A14295ArtActivo ;
   private String[] P0ALQ3_A69ArtDsc ;
   private boolean[] P0ALQ3_n69ArtDsc ;
   private String[] P0ALQ3_A830TipArtDsc ;
   private boolean[] P0ALQ3_n830TipArtDsc ;
   private short[] P0ALQ3_A829TipArtCod ;
   private String[] P0ALQ3_A87ArtMat ;
   private boolean[] P0ALQ3_n87ArtMat ;
   private String[] P0ALQ3_A65ArtCod ;
   private String[] P0ALQ4_A396EmprCod ;
   private int[] P0ALQ4_A252CliCod ;
   private String[] P0ALQ4_A14295ArtActivo ;
   private String[] P0ALQ4_A87ArtMat ;
   private boolean[] P0ALQ4_n87ArtMat ;
   private String[] P0ALQ4_A830TipArtDsc ;
   private boolean[] P0ALQ4_n830TipArtDsc ;
   private short[] P0ALQ4_A829TipArtCod ;
   private String[] P0ALQ4_A69ArtDsc ;
   private boolean[] P0ALQ4_n69ArtDsc ;
   private String[] P0ALQ4_A65ArtCod ;
   private short[] P0ALQ5_A829TipArtCod ;
   private String[] P0ALQ5_A396EmprCod ;
   private String[] P0ALQ5_A14295ArtActivo ;
   private int[] P0ALQ5_A252CliCod ;
   private String[] P0ALQ5_A830TipArtDsc ;
   private boolean[] P0ALQ5_n830TipArtDsc ;
   private String[] P0ALQ5_A87ArtMat ;
   private boolean[] P0ALQ5_n87ArtMat ;
   private String[] P0ALQ5_A69ArtDsc ;
   private boolean[] P0ALQ5_n69ArtDsc ;
   private String[] P0ALQ5_A65ArtCod ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class copiarprecios_1getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ALQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel ,
                                          String AV50Facturacion_copiarprecios_1ds_1_tfartcod ,
                                          String AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel ,
                                          String AV52Facturacion_copiarprecios_1ds_3_tfartdsc ,
                                          String AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel ,
                                          String AV54Facturacion_copiarprecios_1ds_5_tfartmat ,
                                          short AV56Facturacion_copiarprecios_1ds_7_tftipartcod ,
                                          short AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to ,
                                          String AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel ,
                                          String AV58Facturacion_copiarprecios_1ds_9_tftipartdsc ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A87ArtMat ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          String AV45ArtCod ,
                                          String A14295ArtActivo ,
                                          String AV43emprcod ,
                                          int AV44clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.EmprCod, T1.ArtCod, T1.ArtActivo, T2.TipArtDsc, T1.TipArtCod, T1.ArtMat, T1.ArtDsc FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod <> ?)");
      addWhere(sWhereString, "(T1.ArtActivo = 'S')");
      if ( (GXutil.strcmp("", AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Facturacion_copiarprecios_1ds_1_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_copiarprecios_1ds_3_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_copiarprecios_1ds_5_tfartmat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtMat = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_copiarprecios_1ds_7_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_copiarprecios_1ds_9_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ALQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel ,
                                          String AV50Facturacion_copiarprecios_1ds_1_tfartcod ,
                                          String AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel ,
                                          String AV52Facturacion_copiarprecios_1ds_3_tfartdsc ,
                                          String AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel ,
                                          String AV54Facturacion_copiarprecios_1ds_5_tfartmat ,
                                          short AV56Facturacion_copiarprecios_1ds_7_tftipartcod ,
                                          short AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to ,
                                          String AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel ,
                                          String AV58Facturacion_copiarprecios_1ds_9_tftipartdsc ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A87ArtMat ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          String AV45ArtCod ,
                                          String A396EmprCod ,
                                          String AV43emprcod ,
                                          int A252CliCod ,
                                          int AV44clicod ,
                                          String A14295ArtActivo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtActivo, T1.ArtDsc, T2.TipArtDsc, T1.TipArtCod, T1.ArtMat, T1.ArtCod FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.ArtCod <> ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtActivo = 'S')");
      if ( (GXutil.strcmp("", AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Facturacion_copiarprecios_1ds_1_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_copiarprecios_1ds_3_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_copiarprecios_1ds_5_tfartmat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtMat = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_copiarprecios_1ds_7_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_copiarprecios_1ds_9_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ALQ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel ,
                                          String AV50Facturacion_copiarprecios_1ds_1_tfartcod ,
                                          String AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel ,
                                          String AV52Facturacion_copiarprecios_1ds_3_tfartdsc ,
                                          String AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel ,
                                          String AV54Facturacion_copiarprecios_1ds_5_tfartmat ,
                                          short AV56Facturacion_copiarprecios_1ds_7_tftipartcod ,
                                          short AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to ,
                                          String AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel ,
                                          String AV58Facturacion_copiarprecios_1ds_9_tftipartdsc ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A87ArtMat ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          String AV45ArtCod ,
                                          String A396EmprCod ,
                                          String AV43emprcod ,
                                          int A252CliCod ,
                                          int AV44clicod ,
                                          String A14295ArtActivo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[13];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.ArtActivo, T1.ArtMat, T2.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.ArtCod <> ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtActivo = 'S')");
      if ( (GXutil.strcmp("", AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Facturacion_copiarprecios_1ds_1_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_copiarprecios_1ds_3_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_copiarprecios_1ds_5_tfartmat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtMat = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_copiarprecios_1ds_7_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_copiarprecios_1ds_9_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtMat" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0ALQ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel ,
                                          String AV50Facturacion_copiarprecios_1ds_1_tfartcod ,
                                          String AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel ,
                                          String AV52Facturacion_copiarprecios_1ds_3_tfartdsc ,
                                          String AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel ,
                                          String AV54Facturacion_copiarprecios_1ds_5_tfartmat ,
                                          short AV56Facturacion_copiarprecios_1ds_7_tftipartcod ,
                                          short AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to ,
                                          String AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel ,
                                          String AV58Facturacion_copiarprecios_1ds_9_tftipartdsc ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A87ArtMat ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          String AV45ArtCod ,
                                          int A252CliCod ,
                                          int AV44clicod ,
                                          String A14295ArtActivo ,
                                          String AV43emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[13];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.TipArtCod, T1.EmprCod, T1.ArtActivo, T1.CliCod, T2.TipArtDsc, T1.ArtMat, T1.ArtDsc, T1.ArtCod FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod <> ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtActivo = 'S')");
      if ( (GXutil.strcmp("", AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV50Facturacion_copiarprecios_1ds_1_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Facturacion_copiarprecios_1ds_2_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Facturacion_copiarprecios_1ds_3_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Facturacion_copiarprecios_1ds_4_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel)==0) && ( ! (GXutil.strcmp("", AV54Facturacion_copiarprecios_1ds_5_tfartmat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Facturacion_copiarprecios_1ds_6_tfartmat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtMat = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV56Facturacion_copiarprecios_1ds_7_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV57Facturacion_copiarprecios_1ds_8_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Facturacion_copiarprecios_1ds_9_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Facturacion_copiarprecios_1ds_10_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipArtCod" ;
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
                  return conditional_P0ALQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() );
            case 1 :
                  return conditional_P0ALQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] );
            case 2 :
                  return conditional_P0ALQ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] );
            case 3 :
                  return conditional_P0ALQ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ALQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ALQ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ALQ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               return;
      }
   }

}

