package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class seleccionloteproductogetfilterdata extends GXProcedure
{
   public seleccionloteproductogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seleccionloteproductogetfilterdata.class ), "" );
   }

   public seleccionloteproductogetfilterdata( int remoteHandle ,
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
      seleccionloteproductogetfilterdata.this.aP5 = new String[] {""};
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
      seleccionloteproductogetfilterdata.this.AV36DDOName = aP0;
      seleccionloteproductogetfilterdata.this.AV37SearchTxt = aP1;
      seleccionloteproductogetfilterdata.this.AV38SearchTxtTo = aP2;
      seleccionloteproductogetfilterdata.this.aP3 = aP3;
      seleccionloteproductogetfilterdata.this.aP4 = aP4;
      seleccionloteproductogetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTEID") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTEIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTECTF") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTECTFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTECON") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTECONOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTECTFNM") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTECTFNMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_LOTECTFNF") == 0 )
      {
         /* Execute user subroutine: 'LOADLOTECTFNFOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV39OptionsJson = AV26Options.toJSonString(false) ;
      AV40OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV29OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("SeleccionLoteProductoGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "SeleccionLoteProductoGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("SeleccionLoteProductoGridState"), null, null);
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID") == 0 )
         {
            AV12TFLoteID = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID_SEL") == 0 )
         {
            AV13TFLoteID_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEFEC") == 0 )
         {
            AV10TFLoteFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEPED") == 0 )
         {
            AV14TFLotePed = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFLotePed_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTF") == 0 )
         {
            AV16TFLoteCtf = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTF_SEL") == 0 )
         {
            AV17TFLoteCtf_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECON") == 0 )
         {
            AV18TFLoteCon = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECON_SEL") == 0 )
         {
            AV19TFLoteCon_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM") == 0 )
         {
            AV20TFLoteCtfNm = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM_SEL") == 0 )
         {
            AV21TFLoteCtfNm_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF") == 0 )
         {
            AV22TFLoteCtfNF = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF_SEL") == 0 )
         {
            AV23TFLoteCtfNF_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV43Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV44Prdnum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLOTEIDOPTIONS' Routine */
      returnInSub = false ;
      AV12TFLoteID = AV37SearchTxt ;
      AV13TFLoteID_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV42FilterFullText ,
                                           AV13TFLoteID_Sel ,
                                           AV12TFLoteID ,
                                           AV10TFLoteFec ,
                                           Integer.valueOf(AV14TFLotePed) ,
                                           Integer.valueOf(AV15TFLotePed_To) ,
                                           AV17TFLoteCtf_Sel ,
                                           AV16TFLoteCtf ,
                                           AV19TFLoteCon_Sel ,
                                           AV18TFLoteCon ,
                                           AV21TFLoteCtfNm_Sel ,
                                           AV20TFLoteCtfNm ,
                                           AV23TFLoteCtfNF_Sel ,
                                           AV22TFLoteCtfNF ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           AV43Emprcod ,
                                           AV44Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV12TFLoteID = GXutil.padr( GXutil.rtrim( AV12TFLoteID), 26, "%") ;
      lV16TFLoteCtf = GXutil.padr( GXutil.rtrim( AV16TFLoteCtf), 1, "%") ;
      lV18TFLoteCon = GXutil.padr( GXutil.rtrim( AV18TFLoteCon), 1, "%") ;
      lV20TFLoteCtfNm = GXutil.padr( GXutil.rtrim( AV20TFLoteCtfNm), 50, "%") ;
      lV22TFLoteCtfNF = GXutil.padr( GXutil.rtrim( AV22TFLoteCtfNF), 50, "%") ;
      /* Using cursor P09RA2 */
      pr_default.execute(0, new Object[] {AV43Emprcod, AV44Prdnum, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV12TFLoteID, AV13TFLoteID_Sel, AV10TFLoteFec, Integer.valueOf(AV14TFLotePed), Integer.valueOf(AV15TFLotePed_To), lV16TFLoteCtf, AV17TFLoteCtf_Sel, lV18TFLoteCon, AV19TFLoteCon_Sel, lV20TFLoteCtfNm, AV21TFLoteCtfNm_Sel, lV22TFLoteCtfNF, AV23TFLoteCtfNF_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9RA2 = false ;
         A719PrdNum = P09RA2_A719PrdNum[0] ;
         A396EmprCod = P09RA2_A396EmprCod[0] ;
         A11664LoteID = P09RA2_A11664LoteID[0] ;
         A11665LoteFec = P09RA2_A11665LoteFec[0] ;
         A12352LoteCtfNF = P09RA2_A12352LoteCtfNF[0] ;
         A11711LoteCtfNm = P09RA2_A11711LoteCtfNm[0] ;
         A11668LoteCon = P09RA2_A11668LoteCon[0] ;
         A11667LoteCtf = P09RA2_A11667LoteCtf[0] ;
         A11666LotePed = P09RA2_A11666LotePed[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09RA2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09RA2_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(P09RA2_A11664LoteID[0], A11664LoteID) == 0 ) )
         {
            brk9RA2 = false ;
            A11665LoteFec = P09RA2_A11665LoteFec[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9RA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11664LoteID)==0) )
         {
            AV25Option = A11664LoteID ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RA2 )
         {
            brk9RA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLOTECTFOPTIONS' Routine */
      returnInSub = false ;
      AV16TFLoteCtf = AV37SearchTxt ;
      AV17TFLoteCtf_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV42FilterFullText ,
                                           AV13TFLoteID_Sel ,
                                           AV12TFLoteID ,
                                           AV10TFLoteFec ,
                                           Integer.valueOf(AV14TFLotePed) ,
                                           Integer.valueOf(AV15TFLotePed_To) ,
                                           AV17TFLoteCtf_Sel ,
                                           AV16TFLoteCtf ,
                                           AV19TFLoteCon_Sel ,
                                           AV18TFLoteCon ,
                                           AV21TFLoteCtfNm_Sel ,
                                           AV20TFLoteCtfNm ,
                                           AV23TFLoteCtfNF_Sel ,
                                           AV22TFLoteCtfNF ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           A396EmprCod ,
                                           AV43Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV12TFLoteID = GXutil.padr( GXutil.rtrim( AV12TFLoteID), 26, "%") ;
      lV16TFLoteCtf = GXutil.padr( GXutil.rtrim( AV16TFLoteCtf), 1, "%") ;
      lV18TFLoteCon = GXutil.padr( GXutil.rtrim( AV18TFLoteCon), 1, "%") ;
      lV20TFLoteCtfNm = GXutil.padr( GXutil.rtrim( AV20TFLoteCtfNm), 50, "%") ;
      lV22TFLoteCtfNF = GXutil.padr( GXutil.rtrim( AV22TFLoteCtfNF), 50, "%") ;
      /* Using cursor P09RA3 */
      pr_default.execute(1, new Object[] {AV43Emprcod, AV44Prdnum, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV12TFLoteID, AV13TFLoteID_Sel, AV10TFLoteFec, Integer.valueOf(AV14TFLotePed), Integer.valueOf(AV15TFLotePed_To), lV16TFLoteCtf, AV17TFLoteCtf_Sel, lV18TFLoteCon, AV19TFLoteCon_Sel, lV20TFLoteCtfNm, AV21TFLoteCtfNm_Sel, lV22TFLoteCtfNF, AV23TFLoteCtfNF_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9RA4 = false ;
         A396EmprCod = P09RA3_A396EmprCod[0] ;
         A719PrdNum = P09RA3_A719PrdNum[0] ;
         A11668LoteCon = P09RA3_A11668LoteCon[0] ;
         A11667LoteCtf = P09RA3_A11667LoteCtf[0] ;
         A11665LoteFec = P09RA3_A11665LoteFec[0] ;
         A12352LoteCtfNF = P09RA3_A12352LoteCtfNF[0] ;
         A11711LoteCtfNm = P09RA3_A11711LoteCtfNm[0] ;
         A11666LotePed = P09RA3_A11666LotePed[0] ;
         A11664LoteID = P09RA3_A11664LoteID[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09RA3_A11667LoteCtf[0], A11667LoteCtf) == 0 ) )
         {
            brk9RA4 = false ;
            A396EmprCod = P09RA3_A396EmprCod[0] ;
            A719PrdNum = P09RA3_A719PrdNum[0] ;
            A11665LoteFec = P09RA3_A11665LoteFec[0] ;
            A11664LoteID = P09RA3_A11664LoteID[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9RA4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A11667LoteCtf)==0) )
         {
            AV25Option = A11667LoteCtf ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A11667LoteCtf, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RA4 )
         {
            brk9RA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLOTECONOPTIONS' Routine */
      returnInSub = false ;
      AV18TFLoteCon = AV37SearchTxt ;
      AV19TFLoteCon_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV42FilterFullText ,
                                           AV13TFLoteID_Sel ,
                                           AV12TFLoteID ,
                                           AV10TFLoteFec ,
                                           Integer.valueOf(AV14TFLotePed) ,
                                           Integer.valueOf(AV15TFLotePed_To) ,
                                           AV17TFLoteCtf_Sel ,
                                           AV16TFLoteCtf ,
                                           AV19TFLoteCon_Sel ,
                                           AV18TFLoteCon ,
                                           AV21TFLoteCtfNm_Sel ,
                                           AV20TFLoteCtfNm ,
                                           AV23TFLoteCtfNF_Sel ,
                                           AV22TFLoteCtfNF ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           A396EmprCod ,
                                           AV43Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV12TFLoteID = GXutil.padr( GXutil.rtrim( AV12TFLoteID), 26, "%") ;
      lV16TFLoteCtf = GXutil.padr( GXutil.rtrim( AV16TFLoteCtf), 1, "%") ;
      lV18TFLoteCon = GXutil.padr( GXutil.rtrim( AV18TFLoteCon), 1, "%") ;
      lV20TFLoteCtfNm = GXutil.padr( GXutil.rtrim( AV20TFLoteCtfNm), 50, "%") ;
      lV22TFLoteCtfNF = GXutil.padr( GXutil.rtrim( AV22TFLoteCtfNF), 50, "%") ;
      /* Using cursor P09RA4 */
      pr_default.execute(2, new Object[] {AV43Emprcod, AV44Prdnum, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV12TFLoteID, AV13TFLoteID_Sel, AV10TFLoteFec, Integer.valueOf(AV14TFLotePed), Integer.valueOf(AV15TFLotePed_To), lV16TFLoteCtf, AV17TFLoteCtf_Sel, lV18TFLoteCon, AV19TFLoteCon_Sel, lV20TFLoteCtfNm, AV21TFLoteCtfNm_Sel, lV22TFLoteCtfNF, AV23TFLoteCtfNF_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9RA6 = false ;
         A396EmprCod = P09RA4_A396EmprCod[0] ;
         A719PrdNum = P09RA4_A719PrdNum[0] ;
         A11668LoteCon = P09RA4_A11668LoteCon[0] ;
         A11665LoteFec = P09RA4_A11665LoteFec[0] ;
         A12352LoteCtfNF = P09RA4_A12352LoteCtfNF[0] ;
         A11711LoteCtfNm = P09RA4_A11711LoteCtfNm[0] ;
         A11667LoteCtf = P09RA4_A11667LoteCtf[0] ;
         A11666LotePed = P09RA4_A11666LotePed[0] ;
         A11664LoteID = P09RA4_A11664LoteID[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09RA4_A11668LoteCon[0], A11668LoteCon) == 0 ) )
         {
            brk9RA6 = false ;
            A396EmprCod = P09RA4_A396EmprCod[0] ;
            A719PrdNum = P09RA4_A719PrdNum[0] ;
            A11665LoteFec = P09RA4_A11665LoteFec[0] ;
            A11664LoteID = P09RA4_A11664LoteID[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9RA6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11668LoteCon)==0) )
         {
            AV25Option = A11668LoteCon ;
            AV27OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A11668LoteCon, "@!"))) ;
            AV26Options.add(AV25Option, 0);
            AV28OptionsDesc.add(AV27OptionDesc, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RA6 )
         {
            brk9RA6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLOTECTFNMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFLoteCtfNm = AV37SearchTxt ;
      AV21TFLoteCtfNm_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV42FilterFullText ,
                                           AV13TFLoteID_Sel ,
                                           AV12TFLoteID ,
                                           AV10TFLoteFec ,
                                           Integer.valueOf(AV14TFLotePed) ,
                                           Integer.valueOf(AV15TFLotePed_To) ,
                                           AV17TFLoteCtf_Sel ,
                                           AV16TFLoteCtf ,
                                           AV19TFLoteCon_Sel ,
                                           AV18TFLoteCon ,
                                           AV21TFLoteCtfNm_Sel ,
                                           AV20TFLoteCtfNm ,
                                           AV23TFLoteCtfNF_Sel ,
                                           AV22TFLoteCtfNF ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           A396EmprCod ,
                                           AV43Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV12TFLoteID = GXutil.padr( GXutil.rtrim( AV12TFLoteID), 26, "%") ;
      lV16TFLoteCtf = GXutil.padr( GXutil.rtrim( AV16TFLoteCtf), 1, "%") ;
      lV18TFLoteCon = GXutil.padr( GXutil.rtrim( AV18TFLoteCon), 1, "%") ;
      lV20TFLoteCtfNm = GXutil.padr( GXutil.rtrim( AV20TFLoteCtfNm), 50, "%") ;
      lV22TFLoteCtfNF = GXutil.padr( GXutil.rtrim( AV22TFLoteCtfNF), 50, "%") ;
      /* Using cursor P09RA5 */
      pr_default.execute(3, new Object[] {AV43Emprcod, AV44Prdnum, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV12TFLoteID, AV13TFLoteID_Sel, AV10TFLoteFec, Integer.valueOf(AV14TFLotePed), Integer.valueOf(AV15TFLotePed_To), lV16TFLoteCtf, AV17TFLoteCtf_Sel, lV18TFLoteCon, AV19TFLoteCon_Sel, lV20TFLoteCtfNm, AV21TFLoteCtfNm_Sel, lV22TFLoteCtfNF, AV23TFLoteCtfNF_Sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9RA8 = false ;
         A396EmprCod = P09RA5_A396EmprCod[0] ;
         A719PrdNum = P09RA5_A719PrdNum[0] ;
         A11668LoteCon = P09RA5_A11668LoteCon[0] ;
         A11711LoteCtfNm = P09RA5_A11711LoteCtfNm[0] ;
         A11665LoteFec = P09RA5_A11665LoteFec[0] ;
         A12352LoteCtfNF = P09RA5_A12352LoteCtfNF[0] ;
         A11667LoteCtf = P09RA5_A11667LoteCtf[0] ;
         A11666LotePed = P09RA5_A11666LotePed[0] ;
         A11664LoteID = P09RA5_A11664LoteID[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09RA5_A11711LoteCtfNm[0], A11711LoteCtfNm) == 0 ) )
         {
            brk9RA8 = false ;
            A396EmprCod = P09RA5_A396EmprCod[0] ;
            A719PrdNum = P09RA5_A719PrdNum[0] ;
            A11665LoteFec = P09RA5_A11665LoteFec[0] ;
            A11664LoteID = P09RA5_A11664LoteID[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9RA8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A11711LoteCtfNm)==0) )
         {
            AV25Option = A11711LoteCtfNm ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RA8 )
         {
            brk9RA8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLOTECTFNFOPTIONS' Routine */
      returnInSub = false ;
      AV22TFLoteCtfNF = AV37SearchTxt ;
      AV23TFLoteCtfNF_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV42FilterFullText ,
                                           AV13TFLoteID_Sel ,
                                           AV12TFLoteID ,
                                           AV10TFLoteFec ,
                                           Integer.valueOf(AV14TFLotePed) ,
                                           Integer.valueOf(AV15TFLotePed_To) ,
                                           AV17TFLoteCtf_Sel ,
                                           AV16TFLoteCtf ,
                                           AV19TFLoteCon_Sel ,
                                           AV18TFLoteCon ,
                                           AV21TFLoteCtfNm_Sel ,
                                           AV20TFLoteCtfNm ,
                                           AV23TFLoteCtfNF_Sel ,
                                           AV22TFLoteCtfNF ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           A396EmprCod ,
                                           AV43Emprcod ,
                                           A719PrdNum ,
                                           AV44Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV42FilterFullText = GXutil.concat( GXutil.rtrim( AV42FilterFullText), "%", "") ;
      lV12TFLoteID = GXutil.padr( GXutil.rtrim( AV12TFLoteID), 26, "%") ;
      lV16TFLoteCtf = GXutil.padr( GXutil.rtrim( AV16TFLoteCtf), 1, "%") ;
      lV18TFLoteCon = GXutil.padr( GXutil.rtrim( AV18TFLoteCon), 1, "%") ;
      lV20TFLoteCtfNm = GXutil.padr( GXutil.rtrim( AV20TFLoteCtfNm), 50, "%") ;
      lV22TFLoteCtfNF = GXutil.padr( GXutil.rtrim( AV22TFLoteCtfNF), 50, "%") ;
      /* Using cursor P09RA6 */
      pr_default.execute(4, new Object[] {AV43Emprcod, AV44Prdnum, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV42FilterFullText, lV12TFLoteID, AV13TFLoteID_Sel, AV10TFLoteFec, Integer.valueOf(AV14TFLotePed), Integer.valueOf(AV15TFLotePed_To), lV16TFLoteCtf, AV17TFLoteCtf_Sel, lV18TFLoteCon, AV19TFLoteCon_Sel, lV20TFLoteCtfNm, AV21TFLoteCtfNm_Sel, lV22TFLoteCtfNF, AV23TFLoteCtfNF_Sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9RA10 = false ;
         A396EmprCod = P09RA6_A396EmprCod[0] ;
         A719PrdNum = P09RA6_A719PrdNum[0] ;
         A11668LoteCon = P09RA6_A11668LoteCon[0] ;
         A12352LoteCtfNF = P09RA6_A12352LoteCtfNF[0] ;
         A11665LoteFec = P09RA6_A11665LoteFec[0] ;
         A11711LoteCtfNm = P09RA6_A11711LoteCtfNm[0] ;
         A11667LoteCtf = P09RA6_A11667LoteCtf[0] ;
         A11666LotePed = P09RA6_A11666LotePed[0] ;
         A11664LoteID = P09RA6_A11664LoteID[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09RA6_A12352LoteCtfNF[0], A12352LoteCtfNF) == 0 ) )
         {
            brk9RA10 = false ;
            A396EmprCod = P09RA6_A396EmprCod[0] ;
            A719PrdNum = P09RA6_A719PrdNum[0] ;
            A11665LoteFec = P09RA6_A11665LoteFec[0] ;
            A11664LoteID = P09RA6_A11664LoteID[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9RA10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A12352LoteCtfNF)==0) )
         {
            AV25Option = A12352LoteCtfNF ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RA10 )
         {
            brk9RA10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = seleccionloteproductogetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = seleccionloteproductogetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = seleccionloteproductogetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39OptionsJson = "" ;
      AV40OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FilterFullText = "" ;
      AV12TFLoteID = "" ;
      AV13TFLoteID_Sel = "" ;
      AV10TFLoteFec = GXutil.nullDate() ;
      AV16TFLoteCtf = "" ;
      AV17TFLoteCtf_Sel = "" ;
      AV18TFLoteCon = "" ;
      AV19TFLoteCon_Sel = "" ;
      AV20TFLoteCtfNm = "" ;
      AV21TFLoteCtfNm_Sel = "" ;
      AV22TFLoteCtfNF = "" ;
      AV23TFLoteCtfNF_Sel = "" ;
      AV43Emprcod = "" ;
      AV44Prdnum = "" ;
      scmdbuf = "" ;
      lV42FilterFullText = "" ;
      lV12TFLoteID = "" ;
      lV16TFLoteCtf = "" ;
      lV18TFLoteCon = "" ;
      lV20TFLoteCtfNm = "" ;
      lV22TFLoteCtfNF = "" ;
      A11664LoteID = "" ;
      A11667LoteCtf = "" ;
      A11668LoteCon = "" ;
      A11711LoteCtfNm = "" ;
      A12352LoteCtfNF = "" ;
      A11665LoteFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09RA2_A719PrdNum = new String[] {""} ;
      P09RA2_A396EmprCod = new String[] {""} ;
      P09RA2_A11664LoteID = new String[] {""} ;
      P09RA2_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09RA2_A12352LoteCtfNF = new String[] {""} ;
      P09RA2_A11711LoteCtfNm = new String[] {""} ;
      P09RA2_A11668LoteCon = new String[] {""} ;
      P09RA2_A11667LoteCtf = new String[] {""} ;
      P09RA2_A11666LotePed = new int[1] ;
      AV25Option = "" ;
      P09RA3_A396EmprCod = new String[] {""} ;
      P09RA3_A719PrdNum = new String[] {""} ;
      P09RA3_A11668LoteCon = new String[] {""} ;
      P09RA3_A11667LoteCtf = new String[] {""} ;
      P09RA3_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09RA3_A12352LoteCtfNF = new String[] {""} ;
      P09RA3_A11711LoteCtfNm = new String[] {""} ;
      P09RA3_A11666LotePed = new int[1] ;
      P09RA3_A11664LoteID = new String[] {""} ;
      AV27OptionDesc = "" ;
      P09RA4_A396EmprCod = new String[] {""} ;
      P09RA4_A719PrdNum = new String[] {""} ;
      P09RA4_A11668LoteCon = new String[] {""} ;
      P09RA4_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09RA4_A12352LoteCtfNF = new String[] {""} ;
      P09RA4_A11711LoteCtfNm = new String[] {""} ;
      P09RA4_A11667LoteCtf = new String[] {""} ;
      P09RA4_A11666LotePed = new int[1] ;
      P09RA4_A11664LoteID = new String[] {""} ;
      P09RA5_A396EmprCod = new String[] {""} ;
      P09RA5_A719PrdNum = new String[] {""} ;
      P09RA5_A11668LoteCon = new String[] {""} ;
      P09RA5_A11711LoteCtfNm = new String[] {""} ;
      P09RA5_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09RA5_A12352LoteCtfNF = new String[] {""} ;
      P09RA5_A11667LoteCtf = new String[] {""} ;
      P09RA5_A11666LotePed = new int[1] ;
      P09RA5_A11664LoteID = new String[] {""} ;
      P09RA6_A396EmprCod = new String[] {""} ;
      P09RA6_A719PrdNum = new String[] {""} ;
      P09RA6_A11668LoteCon = new String[] {""} ;
      P09RA6_A12352LoteCtfNF = new String[] {""} ;
      P09RA6_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09RA6_A11711LoteCtfNm = new String[] {""} ;
      P09RA6_A11667LoteCtf = new String[] {""} ;
      P09RA6_A11666LotePed = new int[1] ;
      P09RA6_A11664LoteID = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.seleccionloteproductogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09RA2_A719PrdNum, P09RA2_A396EmprCod, P09RA2_A11664LoteID, P09RA2_A11665LoteFec, P09RA2_A12352LoteCtfNF, P09RA2_A11711LoteCtfNm, P09RA2_A11668LoteCon, P09RA2_A11667LoteCtf, P09RA2_A11666LotePed
            }
            , new Object[] {
            P09RA3_A396EmprCod, P09RA3_A719PrdNum, P09RA3_A11668LoteCon, P09RA3_A11667LoteCtf, P09RA3_A11665LoteFec, P09RA3_A12352LoteCtfNF, P09RA3_A11711LoteCtfNm, P09RA3_A11666LotePed, P09RA3_A11664LoteID
            }
            , new Object[] {
            P09RA4_A396EmprCod, P09RA4_A719PrdNum, P09RA4_A11668LoteCon, P09RA4_A11665LoteFec, P09RA4_A12352LoteCtfNF, P09RA4_A11711LoteCtfNm, P09RA4_A11667LoteCtf, P09RA4_A11666LotePed, P09RA4_A11664LoteID
            }
            , new Object[] {
            P09RA5_A396EmprCod, P09RA5_A719PrdNum, P09RA5_A11668LoteCon, P09RA5_A11711LoteCtfNm, P09RA5_A11665LoteFec, P09RA5_A12352LoteCtfNF, P09RA5_A11667LoteCtf, P09RA5_A11666LotePed, P09RA5_A11664LoteID
            }
            , new Object[] {
            P09RA6_A396EmprCod, P09RA6_A719PrdNum, P09RA6_A11668LoteCon, P09RA6_A12352LoteCtfNF, P09RA6_A11665LoteFec, P09RA6_A11711LoteCtfNm, P09RA6_A11667LoteCtf, P09RA6_A11666LotePed, P09RA6_A11664LoteID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV50GXV1 ;
   private int AV14TFLotePed ;
   private int AV15TFLotePed_To ;
   private int A11666LotePed ;
   private long AV30count ;
   private String AV12TFLoteID ;
   private String AV13TFLoteID_Sel ;
   private String AV16TFLoteCtf ;
   private String AV17TFLoteCtf_Sel ;
   private String AV18TFLoteCon ;
   private String AV19TFLoteCon_Sel ;
   private String AV20TFLoteCtfNm ;
   private String AV21TFLoteCtfNm_Sel ;
   private String AV22TFLoteCtfNF ;
   private String AV23TFLoteCtfNF_Sel ;
   private String AV43Emprcod ;
   private String AV44Prdnum ;
   private String scmdbuf ;
   private String lV12TFLoteID ;
   private String lV16TFLoteCtf ;
   private String lV18TFLoteCon ;
   private String lV20TFLoteCtfNm ;
   private String lV22TFLoteCtfNF ;
   private String A11664LoteID ;
   private String A11667LoteCtf ;
   private String A11668LoteCon ;
   private String A11711LoteCtfNm ;
   private String A12352LoteCtfNF ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.util.Date AV10TFLoteFec ;
   private java.util.Date A11665LoteFec ;
   private boolean returnInSub ;
   private boolean brk9RA2 ;
   private boolean brk9RA4 ;
   private boolean brk9RA6 ;
   private boolean brk9RA8 ;
   private boolean brk9RA10 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV42FilterFullText ;
   private String lV42FilterFullText ;
   private String AV25Option ;
   private String AV27OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09RA2_A719PrdNum ;
   private String[] P09RA2_A396EmprCod ;
   private String[] P09RA2_A11664LoteID ;
   private java.util.Date[] P09RA2_A11665LoteFec ;
   private String[] P09RA2_A12352LoteCtfNF ;
   private String[] P09RA2_A11711LoteCtfNm ;
   private String[] P09RA2_A11668LoteCon ;
   private String[] P09RA2_A11667LoteCtf ;
   private int[] P09RA2_A11666LotePed ;
   private String[] P09RA3_A396EmprCod ;
   private String[] P09RA3_A719PrdNum ;
   private String[] P09RA3_A11668LoteCon ;
   private String[] P09RA3_A11667LoteCtf ;
   private java.util.Date[] P09RA3_A11665LoteFec ;
   private String[] P09RA3_A12352LoteCtfNF ;
   private String[] P09RA3_A11711LoteCtfNm ;
   private int[] P09RA3_A11666LotePed ;
   private String[] P09RA3_A11664LoteID ;
   private String[] P09RA4_A396EmprCod ;
   private String[] P09RA4_A719PrdNum ;
   private String[] P09RA4_A11668LoteCon ;
   private java.util.Date[] P09RA4_A11665LoteFec ;
   private String[] P09RA4_A12352LoteCtfNF ;
   private String[] P09RA4_A11711LoteCtfNm ;
   private String[] P09RA4_A11667LoteCtf ;
   private int[] P09RA4_A11666LotePed ;
   private String[] P09RA4_A11664LoteID ;
   private String[] P09RA5_A396EmprCod ;
   private String[] P09RA5_A719PrdNum ;
   private String[] P09RA5_A11668LoteCon ;
   private String[] P09RA5_A11711LoteCtfNm ;
   private java.util.Date[] P09RA5_A11665LoteFec ;
   private String[] P09RA5_A12352LoteCtfNF ;
   private String[] P09RA5_A11667LoteCtf ;
   private int[] P09RA5_A11666LotePed ;
   private String[] P09RA5_A11664LoteID ;
   private String[] P09RA6_A396EmprCod ;
   private String[] P09RA6_A719PrdNum ;
   private String[] P09RA6_A11668LoteCon ;
   private String[] P09RA6_A12352LoteCtfNF ;
   private java.util.Date[] P09RA6_A11665LoteFec ;
   private String[] P09RA6_A11711LoteCtfNm ;
   private String[] P09RA6_A11667LoteCtf ;
   private int[] P09RA6_A11666LotePed ;
   private String[] P09RA6_A11664LoteID ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class seleccionloteproductogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42FilterFullText ,
                                          String AV13TFLoteID_Sel ,
                                          String AV12TFLoteID ,
                                          java.util.Date AV10TFLoteFec ,
                                          int AV14TFLotePed ,
                                          int AV15TFLotePed_To ,
                                          String AV17TFLoteCtf_Sel ,
                                          String AV16TFLoteCtf ,
                                          String AV19TFLoteCon_Sel ,
                                          String AV18TFLoteCon ,
                                          String AV21TFLoteCtfNm_Sel ,
                                          String AV20TFLoteCtfNm ,
                                          String AV23TFLoteCtfNF_Sel ,
                                          String AV22TFLoteCtfNF ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String AV43Emprcod ,
                                          String AV44Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdNum, EmprCod, LoteID, LoteFec, LoteCtfNF, LoteCtfNm, LoteCon, LoteCtf, LotePed FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(LoteCon = 'N')");
      if ( ! (GXutil.strcmp("", AV42FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFLoteID_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFLoteID)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFLoteID_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFLoteFec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV14TFLotePed) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV15TFLotePed_To) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFLoteCtf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFLoteCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFLoteCtfNm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFLoteCtfNF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum, LoteID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09RA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42FilterFullText ,
                                          String AV13TFLoteID_Sel ,
                                          String AV12TFLoteID ,
                                          java.util.Date AV10TFLoteFec ,
                                          int AV14TFLotePed ,
                                          int AV15TFLotePed_To ,
                                          String AV17TFLoteCtf_Sel ,
                                          String AV16TFLoteCtf ,
                                          String AV19TFLoteCon_Sel ,
                                          String AV18TFLoteCon ,
                                          String AV21TFLoteCtfNm_Sel ,
                                          String AV20TFLoteCtfNm ,
                                          String AV23TFLoteCtfNF_Sel ,
                                          String AV22TFLoteCtfNF ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String A396EmprCod ,
                                          String AV43Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[21];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, LoteCon, LoteCtf, LoteFec, LoteCtfNF, LoteCtfNm, LotePed, LoteID FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(LoteCon = 'N')");
      if ( ! (GXutil.strcmp("", AV42FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFLoteID_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFLoteID)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFLoteID_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFLoteFec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV14TFLotePed) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV15TFLotePed_To) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFLoteCtf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFLoteCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFLoteCtfNm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFLoteCtfNF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCtf" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09RA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42FilterFullText ,
                                          String AV13TFLoteID_Sel ,
                                          String AV12TFLoteID ,
                                          java.util.Date AV10TFLoteFec ,
                                          int AV14TFLotePed ,
                                          int AV15TFLotePed_To ,
                                          String AV17TFLoteCtf_Sel ,
                                          String AV16TFLoteCtf ,
                                          String AV19TFLoteCon_Sel ,
                                          String AV18TFLoteCon ,
                                          String AV21TFLoteCtfNm_Sel ,
                                          String AV20TFLoteCtfNm ,
                                          String AV23TFLoteCtfNF_Sel ,
                                          String AV22TFLoteCtfNF ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String A396EmprCod ,
                                          String AV43Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, LoteCon, LoteFec, LoteCtfNF, LoteCtfNm, LoteCtf, LotePed, LoteID FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(LoteCon = 'N')");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV42FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFLoteID_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFLoteID)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFLoteID_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFLoteFec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV14TFLotePed) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV15TFLotePed_To) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFLoteCtf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFLoteCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFLoteCtfNm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFLoteCtfNF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCon" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09RA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42FilterFullText ,
                                          String AV13TFLoteID_Sel ,
                                          String AV12TFLoteID ,
                                          java.util.Date AV10TFLoteFec ,
                                          int AV14TFLotePed ,
                                          int AV15TFLotePed_To ,
                                          String AV17TFLoteCtf_Sel ,
                                          String AV16TFLoteCtf ,
                                          String AV19TFLoteCon_Sel ,
                                          String AV18TFLoteCon ,
                                          String AV21TFLoteCtfNm_Sel ,
                                          String AV20TFLoteCtfNm ,
                                          String AV23TFLoteCtfNF_Sel ,
                                          String AV22TFLoteCtfNF ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String A396EmprCod ,
                                          String AV43Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[21];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, LoteCon, LoteCtfNm, LoteFec, LoteCtfNF, LoteCtf, LotePed, LoteID FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(LoteCon = 'N')");
      if ( ! (GXutil.strcmp("", AV42FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFLoteID_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFLoteID)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFLoteID_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFLoteFec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV14TFLotePed) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV15TFLotePed_To) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFLoteCtf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFLoteCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFLoteCtfNm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFLoteCtfNF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCtfNm" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09RA6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42FilterFullText ,
                                          String AV13TFLoteID_Sel ,
                                          String AV12TFLoteID ,
                                          java.util.Date AV10TFLoteFec ,
                                          int AV14TFLotePed ,
                                          int AV15TFLotePed_To ,
                                          String AV17TFLoteCtf_Sel ,
                                          String AV16TFLoteCtf ,
                                          String AV19TFLoteCon_Sel ,
                                          String AV18TFLoteCon ,
                                          String AV21TFLoteCtfNm_Sel ,
                                          String AV20TFLoteCtfNm ,
                                          String AV23TFLoteCtfNF_Sel ,
                                          String AV22TFLoteCtfNF ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          String A396EmprCod ,
                                          String AV43Emprcod ,
                                          String A719PrdNum ,
                                          String AV44Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[21];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, LoteCon, LoteCtfNF, LoteFec, LoteCtfNm, LoteCtf, LotePed, LoteID FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(LoteCon = 'N')");
      if ( ! (GXutil.strcmp("", AV42FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFLoteID_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFLoteID)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFLoteID_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFLoteFec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV14TFLotePed) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV15TFLotePed_To) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFLoteCtf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFLoteCtf_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFLoteCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFLoteCon_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFLoteCtfNm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFLoteCtfNm_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFLoteCtfNF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFLoteCtfNF_Sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LoteCtfNF" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P09RA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P09RA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P09RA4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 3 :
                  return conditional_P09RA5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 4 :
                  return conditional_P09RA6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RA6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 50);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 50);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
      }
   }

}

