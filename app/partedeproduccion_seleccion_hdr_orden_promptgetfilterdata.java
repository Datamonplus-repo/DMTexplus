package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partedeproduccion_seleccion_hdr_orden_promptgetfilterdata extends GXProcedure
{
   public partedeproduccion_seleccion_hdr_orden_promptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.class ), "" );
   }

   public partedeproduccion_seleccion_hdr_orden_promptgetfilterdata( int remoteHandle ,
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
      partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.aP5 = new String[] {""};
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
      partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.AV44DDOName = aP0;
      partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.AV45SearchTxt = aP1;
      partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.AV46SearchTxtTo = aP2;
      partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.aP3 = aP3;
      partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.aP4 = aP4;
      partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV37OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_MAQCODBIS") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODBISOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_BARFASCON") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASCONOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_BARFACTIN") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFACTINOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV47OptionsJson = AV34Options.toJSonString(false) ;
      AV48OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV49OptionIndexesJson = AV37OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("PartedeProduccion_Seleccion_HDR_Orden_PromptGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PartedeProduccion_Seleccion_HDR_Orden_PromptGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("PartedeProduccion_Seleccion_HDR_Orden_PromptGridState"), null, null);
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV10TFBarOrdLin = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarOrdLin_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV12TFMaqCodBis = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV13TFMaqCodBis_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV14TFFasCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV15TFFasCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV16TFFasDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV17TFFasDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCON") == 0 )
         {
            AV18TFBarFasCon = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCON_SEL") == 0 )
         {
            AV19TFBarFasCon_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST") == 0 )
         {
            AV20TFBarFasEst = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFBarFasEst_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFACTIN") == 0 )
         {
            AV22TFBarFacTin = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFACTIN_SEL") == 0 )
         {
            AV23TFBarFacTin_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECREA") == 0 )
         {
            AV24TFBarFecRea = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIETEO") == 0 )
         {
            AV26TFBarTieTeo = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFBarTieTeo_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV28TFBarFasDTI = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTF") == 0 )
         {
            AV30TFBarFasDTF = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INEMPRCOD") == 0 )
         {
            AV51InEmprCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCOD") == 0 )
         {
            AV52InBarCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCODREO") == 0 )
         {
            AV53InBarCodReo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCODPAR") == 0 )
         {
            AV54InBarCodPar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqCodBis = AV45SearchTxt ;
      AV13TFMaqCodBis_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50FilterFullText ,
                                           Short.valueOf(AV10TFBarOrdLin) ,
                                           Short.valueOf(AV11TFBarOrdLin_To) ,
                                           AV13TFMaqCodBis_Sel ,
                                           AV12TFMaqCodBis ,
                                           AV15TFFasCod_Sel ,
                                           AV14TFFasCod ,
                                           AV17TFFasDsc_Sel ,
                                           AV16TFFasDsc ,
                                           AV19TFBarFasCon_Sel ,
                                           AV18TFBarFasCon ,
                                           Byte.valueOf(AV20TFBarFasEst) ,
                                           Byte.valueOf(AV21TFBarFasEst_To) ,
                                           AV23TFBarFacTin_Sel ,
                                           AV22TFBarFacTin ,
                                           AV24TFBarFecRea ,
                                           AV26TFBarTieTeo ,
                                           AV27TFBarTieTeo_To ,
                                           AV28TFBarFasDTI ,
                                           AV30TFBarFasDTF ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A216BarTieTeo ,
                                           A160BarFecRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV52InBarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV53InBarCodReo) ,
                                           A130BarCodPar ,
                                           AV54InBarCodPar ,
                                           AV51InEmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV12TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV12TFMaqCodBis), 6, "%") ;
      lV14TFFasCod = GXutil.padr( GXutil.rtrim( AV14TFFasCod), 8, "%") ;
      lV16TFFasDsc = GXutil.padr( GXutil.rtrim( AV16TFFasDsc), 28, "%") ;
      lV18TFBarFasCon = GXutil.padr( GXutil.rtrim( AV18TFBarFasCon), 1, "%") ;
      lV22TFBarFacTin = GXutil.padr( GXutil.rtrim( AV22TFBarFacTin), 1, "%") ;
      /* Using cursor P09YK2 */
      pr_default.execute(0, new Object[] {AV51InEmprCod, Integer.valueOf(AV52InBarCod), Byte.valueOf(AV53InBarCodReo), AV54InBarCodPar, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, Short.valueOf(AV10TFBarOrdLin), Short.valueOf(AV11TFBarOrdLin_To), lV12TFMaqCodBis, AV13TFMaqCodBis_Sel, lV14TFFasCod, AV15TFFasCod_Sel, lV16TFFasDsc, AV17TFFasDsc_Sel, lV18TFBarFasCon, AV19TFBarFasCon_Sel, Byte.valueOf(AV20TFBarFasEst), Byte.valueOf(AV21TFBarFasEst_To), lV22TFBarFacTin, AV23TFBarFacTin_Sel, AV24TFBarFecRea, AV26TFBarTieTeo, AV27TFBarTieTeo_To, AV28TFBarFasDTI, AV30TFBarFasDTF});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9YK2 = false ;
         A396EmprCod = P09YK2_A396EmprCod[0] ;
         A603MaqCodBis = P09YK2_A603MaqCodBis[0] ;
         A130BarCodPar = P09YK2_A130BarCodPar[0] ;
         A132BarCodReo = P09YK2_A132BarCodReo[0] ;
         A129BarCod = P09YK2_A129BarCod[0] ;
         A4443BarFasDTF = P09YK2_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P09YK2_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P09YK2_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P09YK2_n4442BarFasDTI[0] ;
         A160BarFecRea = P09YK2_A160BarFecRea[0] ;
         A216BarTieTeo = P09YK2_A216BarTieTeo[0] ;
         A150BarFacTin = P09YK2_A150BarFacTin[0] ;
         A153BarFasEst = P09YK2_A153BarFasEst[0] ;
         A152BarFasCon = P09YK2_A152BarFasCon[0] ;
         A460FasDsc = P09YK2_A460FasDsc[0] ;
         A457FasCod = P09YK2_A457FasCod[0] ;
         A194BarOrdLin = P09YK2_A194BarOrdLin[0] ;
         A758ProCod = P09YK2_A758ProCod[0] ;
         A460FasDsc = P09YK2_A460FasDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09YK2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09YK2_A603MaqCodBis[0], A603MaqCodBis) == 0 ) )
         {
            brk9YK2 = false ;
            A130BarCodPar = P09YK2_A130BarCodPar[0] ;
            A132BarCodReo = P09YK2_A132BarCodReo[0] ;
            A129BarCod = P09YK2_A129BarCod[0] ;
            A194BarOrdLin = P09YK2_A194BarOrdLin[0] ;
            A758ProCod = P09YK2_A758ProCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9YK2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
         {
            AV33Option = A603MaqCodBis ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9YK2 )
         {
            brk9YK2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasCod = AV45SearchTxt ;
      AV15TFFasCod_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50FilterFullText ,
                                           Short.valueOf(AV10TFBarOrdLin) ,
                                           Short.valueOf(AV11TFBarOrdLin_To) ,
                                           AV13TFMaqCodBis_Sel ,
                                           AV12TFMaqCodBis ,
                                           AV15TFFasCod_Sel ,
                                           AV14TFFasCod ,
                                           AV17TFFasDsc_Sel ,
                                           AV16TFFasDsc ,
                                           AV19TFBarFasCon_Sel ,
                                           AV18TFBarFasCon ,
                                           Byte.valueOf(AV20TFBarFasEst) ,
                                           Byte.valueOf(AV21TFBarFasEst_To) ,
                                           AV23TFBarFacTin_Sel ,
                                           AV22TFBarFacTin ,
                                           AV24TFBarFecRea ,
                                           AV26TFBarTieTeo ,
                                           AV27TFBarTieTeo_To ,
                                           AV28TFBarFasDTI ,
                                           AV30TFBarFasDTF ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A216BarTieTeo ,
                                           A160BarFecRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV52InBarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV53InBarCodReo) ,
                                           A130BarCodPar ,
                                           AV54InBarCodPar ,
                                           AV51InEmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV12TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV12TFMaqCodBis), 6, "%") ;
      lV14TFFasCod = GXutil.padr( GXutil.rtrim( AV14TFFasCod), 8, "%") ;
      lV16TFFasDsc = GXutil.padr( GXutil.rtrim( AV16TFFasDsc), 28, "%") ;
      lV18TFBarFasCon = GXutil.padr( GXutil.rtrim( AV18TFBarFasCon), 1, "%") ;
      lV22TFBarFacTin = GXutil.padr( GXutil.rtrim( AV22TFBarFacTin), 1, "%") ;
      /* Using cursor P09YK3 */
      pr_default.execute(1, new Object[] {AV51InEmprCod, Integer.valueOf(AV52InBarCod), Byte.valueOf(AV53InBarCodReo), AV54InBarCodPar, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, Short.valueOf(AV10TFBarOrdLin), Short.valueOf(AV11TFBarOrdLin_To), lV12TFMaqCodBis, AV13TFMaqCodBis_Sel, lV14TFFasCod, AV15TFFasCod_Sel, lV16TFFasDsc, AV17TFFasDsc_Sel, lV18TFBarFasCon, AV19TFBarFasCon_Sel, Byte.valueOf(AV20TFBarFasEst), Byte.valueOf(AV21TFBarFasEst_To), lV22TFBarFacTin, AV23TFBarFacTin_Sel, AV24TFBarFecRea, AV26TFBarTieTeo, AV27TFBarTieTeo_To, AV28TFBarFasDTI, AV30TFBarFasDTF});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9YK4 = false ;
         A396EmprCod = P09YK3_A396EmprCod[0] ;
         A457FasCod = P09YK3_A457FasCod[0] ;
         A130BarCodPar = P09YK3_A130BarCodPar[0] ;
         A132BarCodReo = P09YK3_A132BarCodReo[0] ;
         A129BarCod = P09YK3_A129BarCod[0] ;
         A4443BarFasDTF = P09YK3_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P09YK3_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P09YK3_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P09YK3_n4442BarFasDTI[0] ;
         A160BarFecRea = P09YK3_A160BarFecRea[0] ;
         A216BarTieTeo = P09YK3_A216BarTieTeo[0] ;
         A150BarFacTin = P09YK3_A150BarFacTin[0] ;
         A153BarFasEst = P09YK3_A153BarFasEst[0] ;
         A152BarFasCon = P09YK3_A152BarFasCon[0] ;
         A460FasDsc = P09YK3_A460FasDsc[0] ;
         A603MaqCodBis = P09YK3_A603MaqCodBis[0] ;
         A194BarOrdLin = P09YK3_A194BarOrdLin[0] ;
         A758ProCod = P09YK3_A758ProCod[0] ;
         A460FasDsc = P09YK3_A460FasDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09YK3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09YK3_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk9YK4 = false ;
            A130BarCodPar = P09YK3_A130BarCodPar[0] ;
            A132BarCodReo = P09YK3_A132BarCodReo[0] ;
            A129BarCod = P09YK3_A129BarCod[0] ;
            A194BarOrdLin = P09YK3_A194BarOrdLin[0] ;
            A758ProCod = P09YK3_A758ProCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9YK4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV33Option = A457FasCod ;
            AV35OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV34Options.add(AV33Option, 0);
            AV36OptionsDesc.add(AV35OptionDesc, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9YK4 )
         {
            brk9YK4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFFasDsc = AV45SearchTxt ;
      AV17TFFasDsc_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV50FilterFullText ,
                                           Short.valueOf(AV10TFBarOrdLin) ,
                                           Short.valueOf(AV11TFBarOrdLin_To) ,
                                           AV13TFMaqCodBis_Sel ,
                                           AV12TFMaqCodBis ,
                                           AV15TFFasCod_Sel ,
                                           AV14TFFasCod ,
                                           AV17TFFasDsc_Sel ,
                                           AV16TFFasDsc ,
                                           AV19TFBarFasCon_Sel ,
                                           AV18TFBarFasCon ,
                                           Byte.valueOf(AV20TFBarFasEst) ,
                                           Byte.valueOf(AV21TFBarFasEst_To) ,
                                           AV23TFBarFacTin_Sel ,
                                           AV22TFBarFacTin ,
                                           AV24TFBarFecRea ,
                                           AV26TFBarTieTeo ,
                                           AV27TFBarTieTeo_To ,
                                           AV28TFBarFasDTI ,
                                           AV30TFBarFasDTF ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A216BarTieTeo ,
                                           A160BarFecRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A396EmprCod ,
                                           AV51InEmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV52InBarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV53InBarCodReo) ,
                                           A130BarCodPar ,
                                           AV54InBarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV12TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV12TFMaqCodBis), 6, "%") ;
      lV14TFFasCod = GXutil.padr( GXutil.rtrim( AV14TFFasCod), 8, "%") ;
      lV16TFFasDsc = GXutil.padr( GXutil.rtrim( AV16TFFasDsc), 28, "%") ;
      lV18TFBarFasCon = GXutil.padr( GXutil.rtrim( AV18TFBarFasCon), 1, "%") ;
      lV22TFBarFacTin = GXutil.padr( GXutil.rtrim( AV22TFBarFacTin), 1, "%") ;
      /* Using cursor P09YK4 */
      pr_default.execute(2, new Object[] {AV51InEmprCod, Integer.valueOf(AV52InBarCod), Byte.valueOf(AV53InBarCodReo), AV54InBarCodPar, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, Short.valueOf(AV10TFBarOrdLin), Short.valueOf(AV11TFBarOrdLin_To), lV12TFMaqCodBis, AV13TFMaqCodBis_Sel, lV14TFFasCod, AV15TFFasCod_Sel, lV16TFFasDsc, AV17TFFasDsc_Sel, lV18TFBarFasCon, AV19TFBarFasCon_Sel, Byte.valueOf(AV20TFBarFasEst), Byte.valueOf(AV21TFBarFasEst_To), lV22TFBarFacTin, AV23TFBarFacTin_Sel, AV24TFBarFecRea, AV26TFBarTieTeo, AV27TFBarTieTeo_To, AV28TFBarFasDTI, AV30TFBarFasDTF});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9YK6 = false ;
         A396EmprCod = P09YK4_A396EmprCod[0] ;
         A129BarCod = P09YK4_A129BarCod[0] ;
         A132BarCodReo = P09YK4_A132BarCodReo[0] ;
         A130BarCodPar = P09YK4_A130BarCodPar[0] ;
         A460FasDsc = P09YK4_A460FasDsc[0] ;
         A4443BarFasDTF = P09YK4_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P09YK4_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P09YK4_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P09YK4_n4442BarFasDTI[0] ;
         A160BarFecRea = P09YK4_A160BarFecRea[0] ;
         A216BarTieTeo = P09YK4_A216BarTieTeo[0] ;
         A150BarFacTin = P09YK4_A150BarFacTin[0] ;
         A153BarFasEst = P09YK4_A153BarFasEst[0] ;
         A152BarFasCon = P09YK4_A152BarFasCon[0] ;
         A457FasCod = P09YK4_A457FasCod[0] ;
         A603MaqCodBis = P09YK4_A603MaqCodBis[0] ;
         A194BarOrdLin = P09YK4_A194BarOrdLin[0] ;
         A758ProCod = P09YK4_A758ProCod[0] ;
         A460FasDsc = P09YK4_A460FasDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09YK4_A460FasDsc[0], A460FasDsc) == 0 ) )
         {
            brk9YK6 = false ;
            A396EmprCod = P09YK4_A396EmprCod[0] ;
            A129BarCod = P09YK4_A129BarCod[0] ;
            A132BarCodReo = P09YK4_A132BarCodReo[0] ;
            A130BarCodPar = P09YK4_A130BarCodPar[0] ;
            A457FasCod = P09YK4_A457FasCod[0] ;
            A194BarOrdLin = P09YK4_A194BarOrdLin[0] ;
            A758ProCod = P09YK4_A758ProCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9YK6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV33Option = A460FasDsc ;
            AV34Options.add(AV33Option, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9YK6 )
         {
            brk9YK6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARFASCONOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarFasCon = AV45SearchTxt ;
      AV19TFBarFasCon_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV50FilterFullText ,
                                           Short.valueOf(AV10TFBarOrdLin) ,
                                           Short.valueOf(AV11TFBarOrdLin_To) ,
                                           AV13TFMaqCodBis_Sel ,
                                           AV12TFMaqCodBis ,
                                           AV15TFFasCod_Sel ,
                                           AV14TFFasCod ,
                                           AV17TFFasDsc_Sel ,
                                           AV16TFFasDsc ,
                                           AV19TFBarFasCon_Sel ,
                                           AV18TFBarFasCon ,
                                           Byte.valueOf(AV20TFBarFasEst) ,
                                           Byte.valueOf(AV21TFBarFasEst_To) ,
                                           AV23TFBarFacTin_Sel ,
                                           AV22TFBarFacTin ,
                                           AV24TFBarFecRea ,
                                           AV26TFBarTieTeo ,
                                           AV27TFBarTieTeo_To ,
                                           AV28TFBarFasDTI ,
                                           AV30TFBarFasDTF ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A216BarTieTeo ,
                                           A160BarFecRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A396EmprCod ,
                                           AV51InEmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV52InBarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV53InBarCodReo) ,
                                           A130BarCodPar ,
                                           AV54InBarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV12TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV12TFMaqCodBis), 6, "%") ;
      lV14TFFasCod = GXutil.padr( GXutil.rtrim( AV14TFFasCod), 8, "%") ;
      lV16TFFasDsc = GXutil.padr( GXutil.rtrim( AV16TFFasDsc), 28, "%") ;
      lV18TFBarFasCon = GXutil.padr( GXutil.rtrim( AV18TFBarFasCon), 1, "%") ;
      lV22TFBarFacTin = GXutil.padr( GXutil.rtrim( AV22TFBarFacTin), 1, "%") ;
      /* Using cursor P09YK5 */
      pr_default.execute(3, new Object[] {AV51InEmprCod, Integer.valueOf(AV52InBarCod), Byte.valueOf(AV53InBarCodReo), AV54InBarCodPar, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, Short.valueOf(AV10TFBarOrdLin), Short.valueOf(AV11TFBarOrdLin_To), lV12TFMaqCodBis, AV13TFMaqCodBis_Sel, lV14TFFasCod, AV15TFFasCod_Sel, lV16TFFasDsc, AV17TFFasDsc_Sel, lV18TFBarFasCon, AV19TFBarFasCon_Sel, Byte.valueOf(AV20TFBarFasEst), Byte.valueOf(AV21TFBarFasEst_To), lV22TFBarFacTin, AV23TFBarFacTin_Sel, AV24TFBarFecRea, AV26TFBarTieTeo, AV27TFBarTieTeo_To, AV28TFBarFasDTI, AV30TFBarFasDTF});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9YK8 = false ;
         A396EmprCod = P09YK5_A396EmprCod[0] ;
         A129BarCod = P09YK5_A129BarCod[0] ;
         A132BarCodReo = P09YK5_A132BarCodReo[0] ;
         A130BarCodPar = P09YK5_A130BarCodPar[0] ;
         A152BarFasCon = P09YK5_A152BarFasCon[0] ;
         A4443BarFasDTF = P09YK5_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P09YK5_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P09YK5_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P09YK5_n4442BarFasDTI[0] ;
         A160BarFecRea = P09YK5_A160BarFecRea[0] ;
         A216BarTieTeo = P09YK5_A216BarTieTeo[0] ;
         A150BarFacTin = P09YK5_A150BarFacTin[0] ;
         A153BarFasEst = P09YK5_A153BarFasEst[0] ;
         A460FasDsc = P09YK5_A460FasDsc[0] ;
         A457FasCod = P09YK5_A457FasCod[0] ;
         A603MaqCodBis = P09YK5_A603MaqCodBis[0] ;
         A194BarOrdLin = P09YK5_A194BarOrdLin[0] ;
         A758ProCod = P09YK5_A758ProCod[0] ;
         A460FasDsc = P09YK5_A460FasDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09YK5_A152BarFasCon[0], A152BarFasCon) == 0 ) )
         {
            brk9YK8 = false ;
            A396EmprCod = P09YK5_A396EmprCod[0] ;
            A129BarCod = P09YK5_A129BarCod[0] ;
            A132BarCodReo = P09YK5_A132BarCodReo[0] ;
            A130BarCodPar = P09YK5_A130BarCodPar[0] ;
            A194BarOrdLin = P09YK5_A194BarOrdLin[0] ;
            A758ProCod = P09YK5_A758ProCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9YK8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A152BarFasCon)==0) )
         {
            AV33Option = A152BarFasCon ;
            AV35OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A152BarFasCon, "@!"))) ;
            AV34Options.add(AV33Option, 0);
            AV36OptionsDesc.add(AV35OptionDesc, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9YK8 )
         {
            brk9YK8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARFACTINOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarFacTin = AV45SearchTxt ;
      AV23TFBarFacTin_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV50FilterFullText ,
                                           Short.valueOf(AV10TFBarOrdLin) ,
                                           Short.valueOf(AV11TFBarOrdLin_To) ,
                                           AV13TFMaqCodBis_Sel ,
                                           AV12TFMaqCodBis ,
                                           AV15TFFasCod_Sel ,
                                           AV14TFFasCod ,
                                           AV17TFFasDsc_Sel ,
                                           AV16TFFasDsc ,
                                           AV19TFBarFasCon_Sel ,
                                           AV18TFBarFasCon ,
                                           Byte.valueOf(AV20TFBarFasEst) ,
                                           Byte.valueOf(AV21TFBarFasEst_To) ,
                                           AV23TFBarFacTin_Sel ,
                                           AV22TFBarFacTin ,
                                           AV24TFBarFecRea ,
                                           AV26TFBarTieTeo ,
                                           AV27TFBarTieTeo_To ,
                                           AV28TFBarFasDTI ,
                                           AV30TFBarFasDTF ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A603MaqCodBis ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A216BarTieTeo ,
                                           A160BarFecRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A396EmprCod ,
                                           AV51InEmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV52InBarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV53InBarCodReo) ,
                                           A130BarCodPar ,
                                           AV54InBarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV50FilterFullText = GXutil.concat( GXutil.rtrim( AV50FilterFullText), "%", "") ;
      lV12TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV12TFMaqCodBis), 6, "%") ;
      lV14TFFasCod = GXutil.padr( GXutil.rtrim( AV14TFFasCod), 8, "%") ;
      lV16TFFasDsc = GXutil.padr( GXutil.rtrim( AV16TFFasDsc), 28, "%") ;
      lV18TFBarFasCon = GXutil.padr( GXutil.rtrim( AV18TFBarFasCon), 1, "%") ;
      lV22TFBarFacTin = GXutil.padr( GXutil.rtrim( AV22TFBarFacTin), 1, "%") ;
      /* Using cursor P09YK6 */
      pr_default.execute(4, new Object[] {AV51InEmprCod, Integer.valueOf(AV52InBarCod), Byte.valueOf(AV53InBarCodReo), AV54InBarCodPar, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, lV50FilterFullText, Short.valueOf(AV10TFBarOrdLin), Short.valueOf(AV11TFBarOrdLin_To), lV12TFMaqCodBis, AV13TFMaqCodBis_Sel, lV14TFFasCod, AV15TFFasCod_Sel, lV16TFFasDsc, AV17TFFasDsc_Sel, lV18TFBarFasCon, AV19TFBarFasCon_Sel, Byte.valueOf(AV20TFBarFasEst), Byte.valueOf(AV21TFBarFasEst_To), lV22TFBarFacTin, AV23TFBarFacTin_Sel, AV24TFBarFecRea, AV26TFBarTieTeo, AV27TFBarTieTeo_To, AV28TFBarFasDTI, AV30TFBarFasDTF});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9YK10 = false ;
         A396EmprCod = P09YK6_A396EmprCod[0] ;
         A129BarCod = P09YK6_A129BarCod[0] ;
         A132BarCodReo = P09YK6_A132BarCodReo[0] ;
         A130BarCodPar = P09YK6_A130BarCodPar[0] ;
         A150BarFacTin = P09YK6_A150BarFacTin[0] ;
         A4443BarFasDTF = P09YK6_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P09YK6_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P09YK6_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P09YK6_n4442BarFasDTI[0] ;
         A160BarFecRea = P09YK6_A160BarFecRea[0] ;
         A216BarTieTeo = P09YK6_A216BarTieTeo[0] ;
         A153BarFasEst = P09YK6_A153BarFasEst[0] ;
         A152BarFasCon = P09YK6_A152BarFasCon[0] ;
         A460FasDsc = P09YK6_A460FasDsc[0] ;
         A457FasCod = P09YK6_A457FasCod[0] ;
         A603MaqCodBis = P09YK6_A603MaqCodBis[0] ;
         A194BarOrdLin = P09YK6_A194BarOrdLin[0] ;
         A758ProCod = P09YK6_A758ProCod[0] ;
         A460FasDsc = P09YK6_A460FasDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09YK6_A150BarFacTin[0], A150BarFacTin) == 0 ) )
         {
            brk9YK10 = false ;
            A396EmprCod = P09YK6_A396EmprCod[0] ;
            A129BarCod = P09YK6_A129BarCod[0] ;
            A132BarCodReo = P09YK6_A132BarCodReo[0] ;
            A130BarCodPar = P09YK6_A130BarCodPar[0] ;
            A194BarOrdLin = P09YK6_A194BarOrdLin[0] ;
            A758ProCod = P09YK6_A758ProCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9YK10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A150BarFacTin)==0) )
         {
            AV33Option = A150BarFacTin ;
            AV35OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A150BarFacTin, "@!"))) ;
            AV34Options.add(AV33Option, 0);
            AV36OptionsDesc.add(AV35OptionDesc, 0);
            AV37OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9YK10 )
         {
            brk9YK10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.AV47OptionsJson;
      this.aP4[0] = partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.AV48OptionsDescJson;
      this.aP5[0] = partedeproduccion_seleccion_hdr_orden_promptgetfilterdata.this.AV49OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47OptionsJson = "" ;
      AV48OptionsDescJson = "" ;
      AV49OptionIndexesJson = "" ;
      AV34Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV37OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV12TFMaqCodBis = "" ;
      AV13TFMaqCodBis_Sel = "" ;
      AV14TFFasCod = "" ;
      AV15TFFasCod_Sel = "" ;
      AV16TFFasDsc = "" ;
      AV17TFFasDsc_Sel = "" ;
      AV18TFBarFasCon = "" ;
      AV19TFBarFasCon_Sel = "" ;
      AV22TFBarFacTin = "" ;
      AV23TFBarFacTin_Sel = "" ;
      AV24TFBarFecRea = GXutil.nullDate() ;
      AV26TFBarTieTeo = DecimalUtil.ZERO ;
      AV27TFBarTieTeo_To = DecimalUtil.ZERO ;
      AV28TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV30TFBarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      AV51InEmprCod = "" ;
      AV54InBarCodPar = "" ;
      scmdbuf = "" ;
      lV50FilterFullText = "" ;
      lV12TFMaqCodBis = "" ;
      lV14TFFasCod = "" ;
      lV16TFFasDsc = "" ;
      lV18TFBarFasCon = "" ;
      lV22TFBarFacTin = "" ;
      A603MaqCodBis = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P09YK2_A396EmprCod = new String[] {""} ;
      P09YK2_A603MaqCodBis = new String[] {""} ;
      P09YK2_A130BarCodPar = new String[] {""} ;
      P09YK2_A132BarCodReo = new byte[1] ;
      P09YK2_A129BarCod = new int[1] ;
      P09YK2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK2_n4443BarFasDTF = new boolean[] {false} ;
      P09YK2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK2_n4442BarFasDTI = new boolean[] {false} ;
      P09YK2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YK2_A150BarFacTin = new String[] {""} ;
      P09YK2_A153BarFasEst = new byte[1] ;
      P09YK2_A152BarFasCon = new String[] {""} ;
      P09YK2_A460FasDsc = new String[] {""} ;
      P09YK2_A457FasCod = new String[] {""} ;
      P09YK2_A194BarOrdLin = new short[1] ;
      P09YK2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV33Option = "" ;
      P09YK3_A396EmprCod = new String[] {""} ;
      P09YK3_A457FasCod = new String[] {""} ;
      P09YK3_A130BarCodPar = new String[] {""} ;
      P09YK3_A132BarCodReo = new byte[1] ;
      P09YK3_A129BarCod = new int[1] ;
      P09YK3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK3_n4443BarFasDTF = new boolean[] {false} ;
      P09YK3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK3_n4442BarFasDTI = new boolean[] {false} ;
      P09YK3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YK3_A150BarFacTin = new String[] {""} ;
      P09YK3_A153BarFasEst = new byte[1] ;
      P09YK3_A152BarFasCon = new String[] {""} ;
      P09YK3_A460FasDsc = new String[] {""} ;
      P09YK3_A603MaqCodBis = new String[] {""} ;
      P09YK3_A194BarOrdLin = new short[1] ;
      P09YK3_A758ProCod = new String[] {""} ;
      AV35OptionDesc = "" ;
      P09YK4_A396EmprCod = new String[] {""} ;
      P09YK4_A129BarCod = new int[1] ;
      P09YK4_A132BarCodReo = new byte[1] ;
      P09YK4_A130BarCodPar = new String[] {""} ;
      P09YK4_A460FasDsc = new String[] {""} ;
      P09YK4_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK4_n4443BarFasDTF = new boolean[] {false} ;
      P09YK4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK4_n4442BarFasDTI = new boolean[] {false} ;
      P09YK4_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK4_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YK4_A150BarFacTin = new String[] {""} ;
      P09YK4_A153BarFasEst = new byte[1] ;
      P09YK4_A152BarFasCon = new String[] {""} ;
      P09YK4_A457FasCod = new String[] {""} ;
      P09YK4_A603MaqCodBis = new String[] {""} ;
      P09YK4_A194BarOrdLin = new short[1] ;
      P09YK4_A758ProCod = new String[] {""} ;
      P09YK5_A396EmprCod = new String[] {""} ;
      P09YK5_A129BarCod = new int[1] ;
      P09YK5_A132BarCodReo = new byte[1] ;
      P09YK5_A130BarCodPar = new String[] {""} ;
      P09YK5_A152BarFasCon = new String[] {""} ;
      P09YK5_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK5_n4443BarFasDTF = new boolean[] {false} ;
      P09YK5_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK5_n4442BarFasDTI = new boolean[] {false} ;
      P09YK5_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK5_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YK5_A150BarFacTin = new String[] {""} ;
      P09YK5_A153BarFasEst = new byte[1] ;
      P09YK5_A460FasDsc = new String[] {""} ;
      P09YK5_A457FasCod = new String[] {""} ;
      P09YK5_A603MaqCodBis = new String[] {""} ;
      P09YK5_A194BarOrdLin = new short[1] ;
      P09YK5_A758ProCod = new String[] {""} ;
      P09YK6_A396EmprCod = new String[] {""} ;
      P09YK6_A129BarCod = new int[1] ;
      P09YK6_A132BarCodReo = new byte[1] ;
      P09YK6_A130BarCodPar = new String[] {""} ;
      P09YK6_A150BarFacTin = new String[] {""} ;
      P09YK6_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK6_n4443BarFasDTF = new boolean[] {false} ;
      P09YK6_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK6_n4442BarFasDTI = new boolean[] {false} ;
      P09YK6_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P09YK6_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YK6_A153BarFasEst = new byte[1] ;
      P09YK6_A152BarFasCon = new String[] {""} ;
      P09YK6_A460FasDsc = new String[] {""} ;
      P09YK6_A457FasCod = new String[] {""} ;
      P09YK6_A603MaqCodBis = new String[] {""} ;
      P09YK6_A194BarOrdLin = new short[1] ;
      P09YK6_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partedeproduccion_seleccion_hdr_orden_promptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09YK2_A396EmprCod, P09YK2_A603MaqCodBis, P09YK2_A130BarCodPar, P09YK2_A132BarCodReo, P09YK2_A129BarCod, P09YK2_A4443BarFasDTF, P09YK2_n4443BarFasDTF, P09YK2_A4442BarFasDTI, P09YK2_n4442BarFasDTI, P09YK2_A160BarFecRea,
            P09YK2_A216BarTieTeo, P09YK2_A150BarFacTin, P09YK2_A153BarFasEst, P09YK2_A152BarFasCon, P09YK2_A460FasDsc, P09YK2_A457FasCod, P09YK2_A194BarOrdLin, P09YK2_A758ProCod
            }
            , new Object[] {
            P09YK3_A396EmprCod, P09YK3_A457FasCod, P09YK3_A130BarCodPar, P09YK3_A132BarCodReo, P09YK3_A129BarCod, P09YK3_A4443BarFasDTF, P09YK3_n4443BarFasDTF, P09YK3_A4442BarFasDTI, P09YK3_n4442BarFasDTI, P09YK3_A160BarFecRea,
            P09YK3_A216BarTieTeo, P09YK3_A150BarFacTin, P09YK3_A153BarFasEst, P09YK3_A152BarFasCon, P09YK3_A460FasDsc, P09YK3_A603MaqCodBis, P09YK3_A194BarOrdLin, P09YK3_A758ProCod
            }
            , new Object[] {
            P09YK4_A396EmprCod, P09YK4_A129BarCod, P09YK4_A132BarCodReo, P09YK4_A130BarCodPar, P09YK4_A460FasDsc, P09YK4_A4443BarFasDTF, P09YK4_n4443BarFasDTF, P09YK4_A4442BarFasDTI, P09YK4_n4442BarFasDTI, P09YK4_A160BarFecRea,
            P09YK4_A216BarTieTeo, P09YK4_A150BarFacTin, P09YK4_A153BarFasEst, P09YK4_A152BarFasCon, P09YK4_A457FasCod, P09YK4_A603MaqCodBis, P09YK4_A194BarOrdLin, P09YK4_A758ProCod
            }
            , new Object[] {
            P09YK5_A396EmprCod, P09YK5_A129BarCod, P09YK5_A132BarCodReo, P09YK5_A130BarCodPar, P09YK5_A152BarFasCon, P09YK5_A4443BarFasDTF, P09YK5_n4443BarFasDTF, P09YK5_A4442BarFasDTI, P09YK5_n4442BarFasDTI, P09YK5_A160BarFecRea,
            P09YK5_A216BarTieTeo, P09YK5_A150BarFacTin, P09YK5_A153BarFasEst, P09YK5_A460FasDsc, P09YK5_A457FasCod, P09YK5_A603MaqCodBis, P09YK5_A194BarOrdLin, P09YK5_A758ProCod
            }
            , new Object[] {
            P09YK6_A396EmprCod, P09YK6_A129BarCod, P09YK6_A132BarCodReo, P09YK6_A130BarCodPar, P09YK6_A150BarFacTin, P09YK6_A4443BarFasDTF, P09YK6_n4443BarFasDTF, P09YK6_A4442BarFasDTI, P09YK6_n4442BarFasDTI, P09YK6_A160BarFecRea,
            P09YK6_A216BarTieTeo, P09YK6_A153BarFasEst, P09YK6_A152BarFasCon, P09YK6_A460FasDsc, P09YK6_A457FasCod, P09YK6_A603MaqCodBis, P09YK6_A194BarOrdLin, P09YK6_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFBarFasEst ;
   private byte AV21TFBarFasEst_To ;
   private byte AV53InBarCodReo ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private short AV10TFBarOrdLin ;
   private short AV11TFBarOrdLin_To ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV58GXV1 ;
   private int AV52InBarCod ;
   private int A129BarCod ;
   private long AV38count ;
   private java.math.BigDecimal AV26TFBarTieTeo ;
   private java.math.BigDecimal AV27TFBarTieTeo_To ;
   private java.math.BigDecimal A216BarTieTeo ;
   private String AV12TFMaqCodBis ;
   private String AV13TFMaqCodBis_Sel ;
   private String AV14TFFasCod ;
   private String AV15TFFasCod_Sel ;
   private String AV16TFFasDsc ;
   private String AV17TFFasDsc_Sel ;
   private String AV18TFBarFasCon ;
   private String AV19TFBarFasCon_Sel ;
   private String AV22TFBarFacTin ;
   private String AV23TFBarFacTin_Sel ;
   private String AV51InEmprCod ;
   private String AV54InBarCodPar ;
   private String scmdbuf ;
   private String lV12TFMaqCodBis ;
   private String lV14TFFasCod ;
   private String lV16TFFasDsc ;
   private String lV18TFBarFasCon ;
   private String lV22TFBarFacTin ;
   private String A603MaqCodBis ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A152BarFasCon ;
   private String A150BarFacTin ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private java.util.Date AV28TFBarFasDTI ;
   private java.util.Date AV30TFBarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV24TFBarFecRea ;
   private java.util.Date A160BarFecRea ;
   private boolean returnInSub ;
   private boolean brk9YK2 ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean brk9YK4 ;
   private boolean brk9YK6 ;
   private boolean brk9YK8 ;
   private boolean brk9YK10 ;
   private String AV47OptionsJson ;
   private String AV48OptionsDescJson ;
   private String AV49OptionIndexesJson ;
   private String AV44DDOName ;
   private String AV45SearchTxt ;
   private String AV46SearchTxtTo ;
   private String AV50FilterFullText ;
   private String lV50FilterFullText ;
   private String AV33Option ;
   private String AV35OptionDesc ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09YK2_A396EmprCod ;
   private String[] P09YK2_A603MaqCodBis ;
   private String[] P09YK2_A130BarCodPar ;
   private byte[] P09YK2_A132BarCodReo ;
   private int[] P09YK2_A129BarCod ;
   private java.util.Date[] P09YK2_A4443BarFasDTF ;
   private boolean[] P09YK2_n4443BarFasDTF ;
   private java.util.Date[] P09YK2_A4442BarFasDTI ;
   private boolean[] P09YK2_n4442BarFasDTI ;
   private java.util.Date[] P09YK2_A160BarFecRea ;
   private java.math.BigDecimal[] P09YK2_A216BarTieTeo ;
   private String[] P09YK2_A150BarFacTin ;
   private byte[] P09YK2_A153BarFasEst ;
   private String[] P09YK2_A152BarFasCon ;
   private String[] P09YK2_A460FasDsc ;
   private String[] P09YK2_A457FasCod ;
   private short[] P09YK2_A194BarOrdLin ;
   private String[] P09YK2_A758ProCod ;
   private String[] P09YK3_A396EmprCod ;
   private String[] P09YK3_A457FasCod ;
   private String[] P09YK3_A130BarCodPar ;
   private byte[] P09YK3_A132BarCodReo ;
   private int[] P09YK3_A129BarCod ;
   private java.util.Date[] P09YK3_A4443BarFasDTF ;
   private boolean[] P09YK3_n4443BarFasDTF ;
   private java.util.Date[] P09YK3_A4442BarFasDTI ;
   private boolean[] P09YK3_n4442BarFasDTI ;
   private java.util.Date[] P09YK3_A160BarFecRea ;
   private java.math.BigDecimal[] P09YK3_A216BarTieTeo ;
   private String[] P09YK3_A150BarFacTin ;
   private byte[] P09YK3_A153BarFasEst ;
   private String[] P09YK3_A152BarFasCon ;
   private String[] P09YK3_A460FasDsc ;
   private String[] P09YK3_A603MaqCodBis ;
   private short[] P09YK3_A194BarOrdLin ;
   private String[] P09YK3_A758ProCod ;
   private String[] P09YK4_A396EmprCod ;
   private int[] P09YK4_A129BarCod ;
   private byte[] P09YK4_A132BarCodReo ;
   private String[] P09YK4_A130BarCodPar ;
   private String[] P09YK4_A460FasDsc ;
   private java.util.Date[] P09YK4_A4443BarFasDTF ;
   private boolean[] P09YK4_n4443BarFasDTF ;
   private java.util.Date[] P09YK4_A4442BarFasDTI ;
   private boolean[] P09YK4_n4442BarFasDTI ;
   private java.util.Date[] P09YK4_A160BarFecRea ;
   private java.math.BigDecimal[] P09YK4_A216BarTieTeo ;
   private String[] P09YK4_A150BarFacTin ;
   private byte[] P09YK4_A153BarFasEst ;
   private String[] P09YK4_A152BarFasCon ;
   private String[] P09YK4_A457FasCod ;
   private String[] P09YK4_A603MaqCodBis ;
   private short[] P09YK4_A194BarOrdLin ;
   private String[] P09YK4_A758ProCod ;
   private String[] P09YK5_A396EmprCod ;
   private int[] P09YK5_A129BarCod ;
   private byte[] P09YK5_A132BarCodReo ;
   private String[] P09YK5_A130BarCodPar ;
   private String[] P09YK5_A152BarFasCon ;
   private java.util.Date[] P09YK5_A4443BarFasDTF ;
   private boolean[] P09YK5_n4443BarFasDTF ;
   private java.util.Date[] P09YK5_A4442BarFasDTI ;
   private boolean[] P09YK5_n4442BarFasDTI ;
   private java.util.Date[] P09YK5_A160BarFecRea ;
   private java.math.BigDecimal[] P09YK5_A216BarTieTeo ;
   private String[] P09YK5_A150BarFacTin ;
   private byte[] P09YK5_A153BarFasEst ;
   private String[] P09YK5_A460FasDsc ;
   private String[] P09YK5_A457FasCod ;
   private String[] P09YK5_A603MaqCodBis ;
   private short[] P09YK5_A194BarOrdLin ;
   private String[] P09YK5_A758ProCod ;
   private String[] P09YK6_A396EmprCod ;
   private int[] P09YK6_A129BarCod ;
   private byte[] P09YK6_A132BarCodReo ;
   private String[] P09YK6_A130BarCodPar ;
   private String[] P09YK6_A150BarFacTin ;
   private java.util.Date[] P09YK6_A4443BarFasDTF ;
   private boolean[] P09YK6_n4443BarFasDTF ;
   private java.util.Date[] P09YK6_A4442BarFasDTI ;
   private boolean[] P09YK6_n4442BarFasDTI ;
   private java.util.Date[] P09YK6_A160BarFecRea ;
   private java.math.BigDecimal[] P09YK6_A216BarTieTeo ;
   private byte[] P09YK6_A153BarFasEst ;
   private String[] P09YK6_A152BarFasCon ;
   private String[] P09YK6_A460FasDsc ;
   private String[] P09YK6_A457FasCod ;
   private String[] P09YK6_A603MaqCodBis ;
   private short[] P09YK6_A194BarOrdLin ;
   private String[] P09YK6_A758ProCod ;
   private GXSimpleCollection<String> AV34Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV37OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class partedeproduccion_seleccion_hdr_orden_promptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09YK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50FilterFullText ,
                                          short AV10TFBarOrdLin ,
                                          short AV11TFBarOrdLin_To ,
                                          String AV13TFMaqCodBis_Sel ,
                                          String AV12TFMaqCodBis ,
                                          String AV15TFFasCod_Sel ,
                                          String AV14TFFasCod ,
                                          String AV17TFFasDsc_Sel ,
                                          String AV16TFFasDsc ,
                                          String AV19TFBarFasCon_Sel ,
                                          String AV18TFBarFasCon ,
                                          byte AV20TFBarFasEst ,
                                          byte AV21TFBarFasEst_To ,
                                          String AV23TFBarFacTin_Sel ,
                                          String AV22TFBarFacTin ,
                                          java.util.Date AV24TFBarFecRea ,
                                          java.math.BigDecimal AV26TFBarTieTeo ,
                                          java.math.BigDecimal AV27TFBarTieTeo_To ,
                                          java.util.Date AV28TFBarFasDTI ,
                                          java.util.Date AV30TFBarFasDTF ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.util.Date A160BarFecRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          int A129BarCod ,
                                          int AV52InBarCod ,
                                          byte A132BarCodReo ,
                                          byte AV53InBarCodReo ,
                                          String A130BarCodPar ,
                                          String AV54InBarCodPar ,
                                          String AV51InEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[31];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCodBis, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFasDTF, T1.BarFasDTI, T1.BarFecRea, T1.BarTieTeo, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon," ;
      scmdbuf += " T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV50FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarFasCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( UPPER(T1.BarFacTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV10TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV11TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarFasCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarFasEst) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarFasEst_To) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarFacTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24TFBarFecRea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarTieTeo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarTieTeo_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV28TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV30TFBarFasDTF) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCodBis" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09YK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50FilterFullText ,
                                          short AV10TFBarOrdLin ,
                                          short AV11TFBarOrdLin_To ,
                                          String AV13TFMaqCodBis_Sel ,
                                          String AV12TFMaqCodBis ,
                                          String AV15TFFasCod_Sel ,
                                          String AV14TFFasCod ,
                                          String AV17TFFasDsc_Sel ,
                                          String AV16TFFasDsc ,
                                          String AV19TFBarFasCon_Sel ,
                                          String AV18TFBarFasCon ,
                                          byte AV20TFBarFasEst ,
                                          byte AV21TFBarFasEst_To ,
                                          String AV23TFBarFacTin_Sel ,
                                          String AV22TFBarFacTin ,
                                          java.util.Date AV24TFBarFecRea ,
                                          java.math.BigDecimal AV26TFBarTieTeo ,
                                          java.math.BigDecimal AV27TFBarTieTeo_To ,
                                          java.util.Date AV28TFBarFasDTI ,
                                          java.util.Date AV30TFBarFasDTF ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.util.Date A160BarFecRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          int A129BarCod ,
                                          int AV52InBarCod ,
                                          byte A132BarCodReo ,
                                          byte AV53InBarCodReo ,
                                          String A130BarCodPar ,
                                          String AV54InBarCodPar ,
                                          String AV51InEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[31];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFasDTF, T1.BarFasDTI, T1.BarFecRea, T1.BarTieTeo, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon," ;
      scmdbuf += " T2.FasDsc, T1.MaqCodBis, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV50FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarFasCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( UPPER(T1.BarFacTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV10TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV11TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarFasCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarFasEst) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarFasEst_To) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarFacTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24TFBarFecRea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarTieTeo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarTieTeo_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV28TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV30TFBarFasDTF) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09YK4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50FilterFullText ,
                                          short AV10TFBarOrdLin ,
                                          short AV11TFBarOrdLin_To ,
                                          String AV13TFMaqCodBis_Sel ,
                                          String AV12TFMaqCodBis ,
                                          String AV15TFFasCod_Sel ,
                                          String AV14TFFasCod ,
                                          String AV17TFFasDsc_Sel ,
                                          String AV16TFFasDsc ,
                                          String AV19TFBarFasCon_Sel ,
                                          String AV18TFBarFasCon ,
                                          byte AV20TFBarFasEst ,
                                          byte AV21TFBarFasEst_To ,
                                          String AV23TFBarFacTin_Sel ,
                                          String AV22TFBarFacTin ,
                                          java.util.Date AV24TFBarFecRea ,
                                          java.math.BigDecimal AV26TFBarTieTeo ,
                                          java.math.BigDecimal AV27TFBarTieTeo_To ,
                                          java.util.Date AV28TFBarFasDTI ,
                                          java.util.Date AV30TFBarFasDTF ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.util.Date A160BarFecRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          String A396EmprCod ,
                                          String AV51InEmprCod ,
                                          int A129BarCod ,
                                          int AV52InBarCod ,
                                          byte A132BarCodReo ,
                                          byte AV53InBarCodReo ,
                                          String A130BarCodPar ,
                                          String AV54InBarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[31];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.BarFasDTF, T1.BarFasDTI, T1.BarFecRea, T1.BarTieTeo, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon," ;
      scmdbuf += " T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV50FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarFasCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( UPPER(T1.BarFacTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV10TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV11TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarFasCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarFasEst) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarFasEst_To) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarFacTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24TFBarFecRea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarTieTeo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarTieTeo_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV28TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV30TFBarFasDTF) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09YK5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50FilterFullText ,
                                          short AV10TFBarOrdLin ,
                                          short AV11TFBarOrdLin_To ,
                                          String AV13TFMaqCodBis_Sel ,
                                          String AV12TFMaqCodBis ,
                                          String AV15TFFasCod_Sel ,
                                          String AV14TFFasCod ,
                                          String AV17TFFasDsc_Sel ,
                                          String AV16TFFasDsc ,
                                          String AV19TFBarFasCon_Sel ,
                                          String AV18TFBarFasCon ,
                                          byte AV20TFBarFasEst ,
                                          byte AV21TFBarFasEst_To ,
                                          String AV23TFBarFacTin_Sel ,
                                          String AV22TFBarFacTin ,
                                          java.util.Date AV24TFBarFecRea ,
                                          java.math.BigDecimal AV26TFBarTieTeo ,
                                          java.math.BigDecimal AV27TFBarTieTeo_To ,
                                          java.util.Date AV28TFBarFasDTI ,
                                          java.util.Date AV30TFBarFasDTF ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.util.Date A160BarFecRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          String A396EmprCod ,
                                          String AV51InEmprCod ,
                                          int A129BarCod ,
                                          int AV52InBarCod ,
                                          byte A132BarCodReo ,
                                          byte AV53InBarCodReo ,
                                          String A130BarCodPar ,
                                          String AV54InBarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[31];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasCon, T1.BarFasDTF, T1.BarFasDTI, T1.BarFecRea, T1.BarTieTeo, T1.BarFacTin, T1.BarFasEst, T2.FasDsc," ;
      scmdbuf += " T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV50FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarFasCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( UPPER(T1.BarFacTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV10TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV11TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarFasCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarFasEst) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarFasEst_To) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarFacTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24TFBarFecRea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarTieTeo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarTieTeo_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV28TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV30TFBarFasDTF) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarFasCon" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09YK6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50FilterFullText ,
                                          short AV10TFBarOrdLin ,
                                          short AV11TFBarOrdLin_To ,
                                          String AV13TFMaqCodBis_Sel ,
                                          String AV12TFMaqCodBis ,
                                          String AV15TFFasCod_Sel ,
                                          String AV14TFFasCod ,
                                          String AV17TFFasDsc_Sel ,
                                          String AV16TFFasDsc ,
                                          String AV19TFBarFasCon_Sel ,
                                          String AV18TFBarFasCon ,
                                          byte AV20TFBarFasEst ,
                                          byte AV21TFBarFasEst_To ,
                                          String AV23TFBarFacTin_Sel ,
                                          String AV22TFBarFacTin ,
                                          java.util.Date AV24TFBarFecRea ,
                                          java.math.BigDecimal AV26TFBarTieTeo ,
                                          java.math.BigDecimal AV27TFBarTieTeo_To ,
                                          java.util.Date AV28TFBarFasDTI ,
                                          java.util.Date AV30TFBarFasDTF ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.util.Date A160BarFecRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          String A396EmprCod ,
                                          String AV51InEmprCod ,
                                          int A129BarCod ,
                                          int AV52InBarCod ,
                                          byte A132BarCodReo ,
                                          byte AV53InBarCodReo ,
                                          String A130BarCodPar ,
                                          String AV54InBarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[31];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFacTin, T1.BarFasDTF, T1.BarFasDTI, T1.BarFecRea, T1.BarTieTeo, T1.BarFasEst, T1.BarFasCon, T2.FasDsc," ;
      scmdbuf += " T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV50FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarFasCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( UPPER(T1.BarFacTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
         GXv_int10[10] = (byte)(1) ;
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV10TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV11TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarFasCon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarFasCon_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV20TFBarFasEst) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV21TFBarFasEst_To) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarFacTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarFacTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24TFBarFecRea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarTieTeo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarTieTeo_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV28TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV30TFBarFasDTF) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarFacTin" ;
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
                  return conditional_P09YK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 1 :
                  return conditional_P09YK3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 2 :
                  return conditional_P09YK4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 3 :
                  return conditional_P09YK5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 4 :
                  return conditional_P09YK6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YK4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YK5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YK6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 28);
               ((String[]) buf[15])[0] = rslt.getString(14, 8);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 28);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 8);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 28);
               ((String[]) buf[14])[0] = rslt.getString(13, 8);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((String[]) buf[13])[0] = rslt.getString(12, 28);
               ((String[]) buf[14])[0] = rslt.getString(13, 8);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 28);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[60], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 28);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[60], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 28);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[60], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 28);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[60], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 28);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[60], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               return;
      }
   }

}

