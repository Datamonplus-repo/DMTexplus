package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumenhdr_wc1getfilterdata extends GXProcedure
{
   public informeproduccionresumenhdr_wc1getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenhdr_wc1getfilterdata.class ), "" );
   }

   public informeproduccionresumenhdr_wc1getfilterdata( int remoteHandle ,
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
      informeproduccionresumenhdr_wc1getfilterdata.this.aP5 = new String[] {""};
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
      informeproduccionresumenhdr_wc1getfilterdata.this.AV24DDOName = aP0;
      informeproduccionresumenhdr_wc1getfilterdata.this.AV25SearchTxt = aP1;
      informeproduccionresumenhdr_wc1getfilterdata.this.AV26SearchTxtTo = aP2;
      informeproduccionresumenhdr_wc1getfilterdata.this.aP3 = aP3;
      informeproduccionresumenhdr_wc1getfilterdata.this.aP4 = aP4;
      informeproduccionresumenhdr_wc1getfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_MAQCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_HISPROF") == 0 )
      {
         /* Execute user subroutine: 'LOADHISPROFOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_FASE") == 0 )
      {
         /* Execute user subroutine: 'LOADFASEOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_FASEDESCRIPCION") == 0 )
      {
         /* Execute user subroutine: 'LOADFASEDESCRIPCIONOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PARCODNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPARCODNOMOPTIONS' */
         S201 ();
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.InformeProduccionResumenHdr_WC1GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.InformeProduccionResumenHdr_WC1GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Produccion.InformeProduccionResumenHdr_WC1GridState"), null, null);
      }
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV36TFBarNHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV37TFBarNHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV38TFHisProFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV39TFHisProKgr = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFHisProKgr_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV41TFHisProMtr = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFHisProMtr_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV43TFHisProTur = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFHisProTur_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV45TFHisProF = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV46TFHisProF_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV47TFHisProDTI = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV48TFHisProDTF = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV49TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV50TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV51TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV52TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV53TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV54TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV55TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV59TFFase = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV60TFFase_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION") == 0 )
         {
            AV61TFFaseDescripcion = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION_SEL") == 0 )
         {
            AV62TFFaseDescripcion_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV63TFBarTipArt = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFBarTipArt_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTIP") == 0 )
         {
            AV65TFHisProTip = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFHisProTip_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTC") == 0 )
         {
            AV67TFHisProTc = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFHisProTc_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODF") == 0 )
         {
            AV69TFHisProDf = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV70TFParCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFParCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV72TFParCodNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV73TFParCodNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INEMPRCOD") == 0 )
         {
            AV30INEmprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INHISESTREO") == 0 )
         {
            AV31INHisEstReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INMAQCOD1") == 0 )
         {
            AV32INMaqCod1 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INMAQCOD2") == 0 )
         {
            AV33INMaqCod2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INHISPROFEC1") == 0 )
         {
            AV34INHisProFec1 = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INHISPROFEC2") == 0 )
         {
            AV35INHisProFec2 = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPERARIOFROM") == 0 )
         {
            AV74OperarioFrom = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPERARIOTO") == 0 )
         {
            AV75OperarioTo = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV36TFBarNHdr = AV25SearchTxt ;
      AV37TFBarNHdr_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37TFBarNHdr_Sel ,
                                           AV36TFBarNHdr ,
                                           AV11TFMaqCod_Sel ,
                                           AV10TFMaqCod ,
                                           AV38TFHisProFec ,
                                           AV39TFHisProKgr ,
                                           AV40TFHisProKgr_To ,
                                           AV41TFHisProMtr ,
                                           AV42TFHisProMtr_To ,
                                           Byte.valueOf(AV43TFHisProTur) ,
                                           Byte.valueOf(AV44TFHisProTur_To) ,
                                           AV46TFHisProF_Sel ,
                                           AV45TFHisProF ,
                                           AV47TFHisProDTI ,
                                           AV48TFHisProDTF ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV60TFFase_Sel ,
                                           AV59TFFase ,
                                           Short.valueOf(AV63TFBarTipArt) ,
                                           Short.valueOf(AV64TFBarTipArt_To) ,
                                           Short.valueOf(AV65TFHisProTip) ,
                                           Short.valueOf(AV66TFHisProTip_To) ,
                                           Byte.valueOf(AV67TFHisProTc) ,
                                           Byte.valueOf(AV68TFHisProTc_To) ,
                                           AV69TFHisProDf ,
                                           Short.valueOf(AV70TFParCod) ,
                                           Short.valueOf(AV71TFParCod_To) ,
                                           AV73TFParCodNom_Sel ,
                                           AV72TFParCodNom ,
                                           Byte.valueOf(AV31INHisEstReo) ,
                                           Integer.valueOf(AV74OperarioFrom) ,
                                           Integer.valueOf(AV75OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV62TFFaseDescripcion_Sel ,
                                           AV61TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV34INHisProFec1 ,
                                           AV35INHisProFec2 ,
                                           AV30INEmprcod ,
                                           AV32INMaqCod1 ,
                                           A396EmprCod ,
                                           AV33INMaqCod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36TFBarNHdr = GXutil.padr( GXutil.rtrim( AV36TFBarNHdr), 11, "%") ;
      lV10TFMaqCod = GXutil.padr( GXutil.rtrim( AV10TFMaqCod), 6, "%") ;
      lV45TFHisProF = GXutil.padr( GXutil.rtrim( AV45TFHisProF), 1, "%") ;
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV59TFFase = GXutil.padr( GXutil.rtrim( AV59TFFase), 8, "%") ;
      lV72TFParCodNom = GXutil.padr( GXutil.rtrim( AV72TFParCodNom), 30, "%") ;
      /* Using cursor P0A952 */
      pr_default.execute(0, new Object[] {AV30INEmprcod, AV32INMaqCod1, AV34INHisProFec1, AV35INHisProFec2, AV33INMaqCod2, lV36TFBarNHdr, AV37TFBarNHdr_Sel, lV10TFMaqCod, AV11TFMaqCod_Sel, AV38TFHisProFec, AV39TFHisProKgr, AV40TFHisProKgr_To, AV41TFHisProMtr, AV42TFHisProMtr_To, Byte.valueOf(AV43TFHisProTur), Byte.valueOf(AV44TFHisProTur_To), lV45TFHisProF, AV46TFHisProF_Sel, AV47TFHisProDTI, AV48TFHisProDTF, lV49TFCliNom, AV50TFCliNom_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV59TFFase, AV60TFFase_Sel, Short.valueOf(AV63TFBarTipArt), Short.valueOf(AV64TFBarTipArt_To), Short.valueOf(AV65TFHisProTip), Short.valueOf(AV66TFHisProTip_To), Byte.valueOf(AV67TFHisProTc), Byte.valueOf(AV68TFHisProTc_To), AV69TFHisProDf, Short.valueOf(AV70TFParCod), Short.valueOf(AV71TFParCod_To), lV72TFParCodNom, AV73TFParCodNom_Sel, Byte.valueOf(AV31INHisEstReo), Integer.valueOf(AV74OperarioFrom), Integer.valueOf(AV75OperarioTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P0A952_A252CliCod[0] ;
         n252CliCod = P0A952_n252CliCod[0] ;
         A503GruOpeCod = P0A952_A503GruOpeCod[0] ;
         A3612HisProReo = P0A952_A3612HisProReo[0] ;
         A867ParCodNom = P0A952_A867ParCodNom[0] ;
         n867ParCodNom = P0A952_n867ParCodNom[0] ;
         A656ParCod = P0A952_A656ParCod[0] ;
         n656ParCod = P0A952_n656ParCod[0] ;
         A5608HisProDf = P0A952_A5608HisProDf[0] ;
         A3611HisProTc = P0A952_A3611HisProTc[0] ;
         A2247HisProTip = P0A952_A2247HisProTip[0] ;
         A217BarTipArt = P0A952_A217BarTipArt[0] ;
         n217BarTipArt = P0A952_n217BarTipArt[0] ;
         A136BarColNum = P0A952_A136BarColNum[0] ;
         A135BarColNom = P0A952_A135BarColNom[0] ;
         A212BarSer = P0A952_A212BarSer[0] ;
         A279CliNom = P0A952_A279CliNom[0] ;
         A4441HisProDTF = P0A952_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A952_n4441HisProDTF[0] ;
         A4440HisProDTI = P0A952_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A952_n4440HisProDTI[0] ;
         A557HisProF = P0A952_A557HisProF[0] ;
         A566HisProTur = P0A952_A566HisProTur[0] ;
         A1526HisProMtr = P0A952_A1526HisProMtr[0] ;
         A1525HisProKgr = P0A952_A1525HisProKgr[0] ;
         A558HisProFec = P0A952_A558HisProFec[0] ;
         A602MaqCod = P0A952_A602MaqCod[0] ;
         A130BarCodPar = P0A952_A130BarCodPar[0] ;
         A132BarCodReo = P0A952_A132BarCodReo[0] ;
         A129BarCod = P0A952_A129BarCod[0] ;
         A461Fase = P0A952_A461Fase[0] ;
         A396EmprCod = P0A952_A396EmprCod[0] ;
         A561HisProLin = P0A952_A561HisProLin[0] ;
         A252CliCod = P0A952_A252CliCod[0] ;
         n252CliCod = P0A952_n252CliCod[0] ;
         A217BarTipArt = P0A952_A217BarTipArt[0] ;
         n217BarTipArt = P0A952_n217BarTipArt[0] ;
         A136BarColNum = P0A952_A136BarColNum[0] ;
         A135BarColNom = P0A952_A135BarColNom[0] ;
         A212BarSer = P0A952_A212BarSer[0] ;
         A279CliNom = P0A952_A279CliNom[0] ;
         A867ParCodNom = P0A952_A867ParCodNom[0] ;
         n867ParCodNom = P0A952_n867ParCodNom[0] ;
         GXt_char2 = A13893FaseDescri ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         informeproduccionresumenhdr_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13893FaseDescri = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV61TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV62TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
               {
                  AV13Option = A13696BarNHdr ;
                  AV12InsertIndex = 1 ;
                  while ( ( AV12InsertIndex <= AV14Options.size() ) && ( GXutil.strcmp((String)AV14Options.elementAt(-1+AV12InsertIndex), AV13Option) < 0 ) )
                  {
                     AV12InsertIndex = (int)(AV12InsertIndex+1) ;
                  }
                  if ( ( AV12InsertIndex <= AV14Options.size() ) && ( GXutil.strcmp((String)AV14Options.elementAt(-1+AV12InsertIndex), AV13Option) == 0 ) )
                  {
                     AV18count = GXutil.lval( (String)AV17OptionIndexes.elementAt(-1+AV12InsertIndex)) ;
                     AV18count = (long)(AV18count+1) ;
                     AV17OptionIndexes.removeItem(AV12InsertIndex);
                     AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), AV12InsertIndex);
                  }
                  else
                  {
                     AV14Options.add(AV13Option, AV12InsertIndex);
                     AV17OptionIndexes.add("1", AV12InsertIndex);
                  }
               }
               if ( AV14Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV25SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37TFBarNHdr_Sel ,
                                           AV36TFBarNHdr ,
                                           AV11TFMaqCod_Sel ,
                                           AV10TFMaqCod ,
                                           AV38TFHisProFec ,
                                           AV39TFHisProKgr ,
                                           AV40TFHisProKgr_To ,
                                           AV41TFHisProMtr ,
                                           AV42TFHisProMtr_To ,
                                           Byte.valueOf(AV43TFHisProTur) ,
                                           Byte.valueOf(AV44TFHisProTur_To) ,
                                           AV46TFHisProF_Sel ,
                                           AV45TFHisProF ,
                                           AV47TFHisProDTI ,
                                           AV48TFHisProDTF ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV60TFFase_Sel ,
                                           AV59TFFase ,
                                           Short.valueOf(AV63TFBarTipArt) ,
                                           Short.valueOf(AV64TFBarTipArt_To) ,
                                           Short.valueOf(AV65TFHisProTip) ,
                                           Short.valueOf(AV66TFHisProTip_To) ,
                                           Byte.valueOf(AV67TFHisProTc) ,
                                           Byte.valueOf(AV68TFHisProTc_To) ,
                                           AV69TFHisProDf ,
                                           Short.valueOf(AV70TFParCod) ,
                                           Short.valueOf(AV71TFParCod_To) ,
                                           AV73TFParCodNom_Sel ,
                                           AV72TFParCodNom ,
                                           Byte.valueOf(AV31INHisEstReo) ,
                                           Integer.valueOf(AV74OperarioFrom) ,
                                           Integer.valueOf(AV75OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV62TFFaseDescripcion_Sel ,
                                           AV61TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV34INHisProFec1 ,
                                           AV35INHisProFec2 ,
                                           AV30INEmprcod ,
                                           AV32INMaqCod1 ,
                                           A396EmprCod ,
                                           AV33INMaqCod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36TFBarNHdr = GXutil.padr( GXutil.rtrim( AV36TFBarNHdr), 11, "%") ;
      lV10TFMaqCod = GXutil.padr( GXutil.rtrim( AV10TFMaqCod), 6, "%") ;
      lV45TFHisProF = GXutil.padr( GXutil.rtrim( AV45TFHisProF), 1, "%") ;
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV59TFFase = GXutil.padr( GXutil.rtrim( AV59TFFase), 8, "%") ;
      lV72TFParCodNom = GXutil.padr( GXutil.rtrim( AV72TFParCodNom), 30, "%") ;
      /* Using cursor P0A953 */
      pr_default.execute(1, new Object[] {AV30INEmprcod, AV32INMaqCod1, AV34INHisProFec1, AV35INHisProFec2, AV33INMaqCod2, lV36TFBarNHdr, AV37TFBarNHdr_Sel, lV10TFMaqCod, AV11TFMaqCod_Sel, AV38TFHisProFec, AV39TFHisProKgr, AV40TFHisProKgr_To, AV41TFHisProMtr, AV42TFHisProMtr_To, Byte.valueOf(AV43TFHisProTur), Byte.valueOf(AV44TFHisProTur_To), lV45TFHisProF, AV46TFHisProF_Sel, AV47TFHisProDTI, AV48TFHisProDTF, lV49TFCliNom, AV50TFCliNom_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV59TFFase, AV60TFFase_Sel, Short.valueOf(AV63TFBarTipArt), Short.valueOf(AV64TFBarTipArt_To), Short.valueOf(AV65TFHisProTip), Short.valueOf(AV66TFHisProTip_To), Byte.valueOf(AV67TFHisProTc), Byte.valueOf(AV68TFHisProTc_To), AV69TFHisProDf, Short.valueOf(AV70TFParCod), Short.valueOf(AV71TFParCod_To), lV72TFParCodNom, AV73TFParCodNom_Sel, Byte.valueOf(AV31INHisEstReo), Integer.valueOf(AV74OperarioFrom), Integer.valueOf(AV75OperarioTo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA953 = false ;
         A252CliCod = P0A953_A252CliCod[0] ;
         n252CliCod = P0A953_n252CliCod[0] ;
         A602MaqCod = P0A953_A602MaqCod[0] ;
         A503GruOpeCod = P0A953_A503GruOpeCod[0] ;
         A3612HisProReo = P0A953_A3612HisProReo[0] ;
         A867ParCodNom = P0A953_A867ParCodNom[0] ;
         n867ParCodNom = P0A953_n867ParCodNom[0] ;
         A656ParCod = P0A953_A656ParCod[0] ;
         n656ParCod = P0A953_n656ParCod[0] ;
         A5608HisProDf = P0A953_A5608HisProDf[0] ;
         A3611HisProTc = P0A953_A3611HisProTc[0] ;
         A2247HisProTip = P0A953_A2247HisProTip[0] ;
         A217BarTipArt = P0A953_A217BarTipArt[0] ;
         n217BarTipArt = P0A953_n217BarTipArt[0] ;
         A136BarColNum = P0A953_A136BarColNum[0] ;
         A135BarColNom = P0A953_A135BarColNom[0] ;
         A212BarSer = P0A953_A212BarSer[0] ;
         A279CliNom = P0A953_A279CliNom[0] ;
         A4441HisProDTF = P0A953_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A953_n4441HisProDTF[0] ;
         A4440HisProDTI = P0A953_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A953_n4440HisProDTI[0] ;
         A557HisProF = P0A953_A557HisProF[0] ;
         A566HisProTur = P0A953_A566HisProTur[0] ;
         A1526HisProMtr = P0A953_A1526HisProMtr[0] ;
         A1525HisProKgr = P0A953_A1525HisProKgr[0] ;
         A558HisProFec = P0A953_A558HisProFec[0] ;
         A130BarCodPar = P0A953_A130BarCodPar[0] ;
         A132BarCodReo = P0A953_A132BarCodReo[0] ;
         A129BarCod = P0A953_A129BarCod[0] ;
         A461Fase = P0A953_A461Fase[0] ;
         A396EmprCod = P0A953_A396EmprCod[0] ;
         A561HisProLin = P0A953_A561HisProLin[0] ;
         A252CliCod = P0A953_A252CliCod[0] ;
         n252CliCod = P0A953_n252CliCod[0] ;
         A217BarTipArt = P0A953_A217BarTipArt[0] ;
         n217BarTipArt = P0A953_n217BarTipArt[0] ;
         A136BarColNum = P0A953_A136BarColNum[0] ;
         A135BarColNom = P0A953_A135BarColNom[0] ;
         A212BarSer = P0A953_A212BarSer[0] ;
         A279CliNom = P0A953_A279CliNom[0] ;
         A867ParCodNom = P0A953_A867ParCodNom[0] ;
         n867ParCodNom = P0A953_n867ParCodNom[0] ;
         GXt_char2 = A13893FaseDescri ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         informeproduccionresumenhdr_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13893FaseDescri = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV61TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV62TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV18count = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A953_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A953_A602MaqCod[0], A602MaqCod) == 0 ) )
               {
                  brkA953 = false ;
                  A558HisProFec = P0A953_A558HisProFec[0] ;
                  A561HisProLin = P0A953_A561HisProLin[0] ;
                  AV18count = (long)(AV18count+1) ;
                  brkA953 = true ;
                  pr_default.readNext(1);
               }
               if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
               {
                  AV13Option = A602MaqCod ;
                  AV14Options.add(AV13Option, 0);
                  AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV14Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkA953 )
         {
            brkA953 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHISPROFOPTIONS' Routine */
      returnInSub = false ;
      AV45TFHisProF = AV25SearchTxt ;
      AV46TFHisProF_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV37TFBarNHdr_Sel ,
                                           AV36TFBarNHdr ,
                                           AV11TFMaqCod_Sel ,
                                           AV10TFMaqCod ,
                                           AV38TFHisProFec ,
                                           AV39TFHisProKgr ,
                                           AV40TFHisProKgr_To ,
                                           AV41TFHisProMtr ,
                                           AV42TFHisProMtr_To ,
                                           Byte.valueOf(AV43TFHisProTur) ,
                                           Byte.valueOf(AV44TFHisProTur_To) ,
                                           AV46TFHisProF_Sel ,
                                           AV45TFHisProF ,
                                           AV47TFHisProDTI ,
                                           AV48TFHisProDTF ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV60TFFase_Sel ,
                                           AV59TFFase ,
                                           Short.valueOf(AV63TFBarTipArt) ,
                                           Short.valueOf(AV64TFBarTipArt_To) ,
                                           Short.valueOf(AV65TFHisProTip) ,
                                           Short.valueOf(AV66TFHisProTip_To) ,
                                           Byte.valueOf(AV67TFHisProTc) ,
                                           Byte.valueOf(AV68TFHisProTc_To) ,
                                           AV69TFHisProDf ,
                                           Short.valueOf(AV70TFParCod) ,
                                           Short.valueOf(AV71TFParCod_To) ,
                                           AV73TFParCodNom_Sel ,
                                           AV72TFParCodNom ,
                                           Byte.valueOf(AV31INHisEstReo) ,
                                           Integer.valueOf(AV74OperarioFrom) ,
                                           Integer.valueOf(AV75OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV62TFFaseDescripcion_Sel ,
                                           AV61TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV32INMaqCod1 ,
                                           AV33INMaqCod2 ,
                                           AV34INHisProFec1 ,
                                           AV35INHisProFec2 ,
                                           A396EmprCod ,
                                           AV30INEmprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36TFBarNHdr = GXutil.padr( GXutil.rtrim( AV36TFBarNHdr), 11, "%") ;
      lV10TFMaqCod = GXutil.padr( GXutil.rtrim( AV10TFMaqCod), 6, "%") ;
      lV45TFHisProF = GXutil.padr( GXutil.rtrim( AV45TFHisProF), 1, "%") ;
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV59TFFase = GXutil.padr( GXutil.rtrim( AV59TFFase), 8, "%") ;
      lV72TFParCodNom = GXutil.padr( GXutil.rtrim( AV72TFParCodNom), 30, "%") ;
      /* Using cursor P0A954 */
      pr_default.execute(2, new Object[] {AV32INMaqCod1, AV33INMaqCod2, AV34INHisProFec1, AV35INHisProFec2, AV30INEmprcod, lV36TFBarNHdr, AV37TFBarNHdr_Sel, lV10TFMaqCod, AV11TFMaqCod_Sel, AV38TFHisProFec, AV39TFHisProKgr, AV40TFHisProKgr_To, AV41TFHisProMtr, AV42TFHisProMtr_To, Byte.valueOf(AV43TFHisProTur), Byte.valueOf(AV44TFHisProTur_To), lV45TFHisProF, AV46TFHisProF_Sel, AV47TFHisProDTI, AV48TFHisProDTF, lV49TFCliNom, AV50TFCliNom_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV59TFFase, AV60TFFase_Sel, Short.valueOf(AV63TFBarTipArt), Short.valueOf(AV64TFBarTipArt_To), Short.valueOf(AV65TFHisProTip), Short.valueOf(AV66TFHisProTip_To), Byte.valueOf(AV67TFHisProTc), Byte.valueOf(AV68TFHisProTc_To), AV69TFHisProDf, Short.valueOf(AV70TFParCod), Short.valueOf(AV71TFParCod_To), lV72TFParCodNom, AV73TFParCodNom_Sel, Byte.valueOf(AV31INHisEstReo), Integer.valueOf(AV74OperarioFrom), Integer.valueOf(AV75OperarioTo)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA955 = false ;
         A252CliCod = P0A954_A252CliCod[0] ;
         n252CliCod = P0A954_n252CliCod[0] ;
         A557HisProF = P0A954_A557HisProF[0] ;
         A503GruOpeCod = P0A954_A503GruOpeCod[0] ;
         A3612HisProReo = P0A954_A3612HisProReo[0] ;
         A867ParCodNom = P0A954_A867ParCodNom[0] ;
         n867ParCodNom = P0A954_n867ParCodNom[0] ;
         A656ParCod = P0A954_A656ParCod[0] ;
         n656ParCod = P0A954_n656ParCod[0] ;
         A5608HisProDf = P0A954_A5608HisProDf[0] ;
         A3611HisProTc = P0A954_A3611HisProTc[0] ;
         A2247HisProTip = P0A954_A2247HisProTip[0] ;
         A217BarTipArt = P0A954_A217BarTipArt[0] ;
         n217BarTipArt = P0A954_n217BarTipArt[0] ;
         A136BarColNum = P0A954_A136BarColNum[0] ;
         A135BarColNom = P0A954_A135BarColNom[0] ;
         A212BarSer = P0A954_A212BarSer[0] ;
         A279CliNom = P0A954_A279CliNom[0] ;
         A4441HisProDTF = P0A954_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A954_n4441HisProDTF[0] ;
         A4440HisProDTI = P0A954_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A954_n4440HisProDTI[0] ;
         A566HisProTur = P0A954_A566HisProTur[0] ;
         A1526HisProMtr = P0A954_A1526HisProMtr[0] ;
         A1525HisProKgr = P0A954_A1525HisProKgr[0] ;
         A558HisProFec = P0A954_A558HisProFec[0] ;
         A602MaqCod = P0A954_A602MaqCod[0] ;
         A130BarCodPar = P0A954_A130BarCodPar[0] ;
         A132BarCodReo = P0A954_A132BarCodReo[0] ;
         A129BarCod = P0A954_A129BarCod[0] ;
         A461Fase = P0A954_A461Fase[0] ;
         A396EmprCod = P0A954_A396EmprCod[0] ;
         A561HisProLin = P0A954_A561HisProLin[0] ;
         A252CliCod = P0A954_A252CliCod[0] ;
         n252CliCod = P0A954_n252CliCod[0] ;
         A217BarTipArt = P0A954_A217BarTipArt[0] ;
         n217BarTipArt = P0A954_n217BarTipArt[0] ;
         A136BarColNum = P0A954_A136BarColNum[0] ;
         A135BarColNom = P0A954_A135BarColNom[0] ;
         A212BarSer = P0A954_A212BarSer[0] ;
         A279CliNom = P0A954_A279CliNom[0] ;
         A867ParCodNom = P0A954_A867ParCodNom[0] ;
         n867ParCodNom = P0A954_n867ParCodNom[0] ;
         GXt_char2 = A13893FaseDescri ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         informeproduccionresumenhdr_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13893FaseDescri = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV61TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV62TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV18count = 0 ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A954_A557HisProF[0], A557HisProF) == 0 ) )
               {
                  brkA955 = false ;
                  A558HisProFec = P0A954_A558HisProFec[0] ;
                  A602MaqCod = P0A954_A602MaqCod[0] ;
                  A396EmprCod = P0A954_A396EmprCod[0] ;
                  A561HisProLin = P0A954_A561HisProLin[0] ;
                  AV18count = (long)(AV18count+1) ;
                  brkA955 = true ;
                  pr_default.readNext(2);
               }
               if ( ! (GXutil.strcmp("", A557HisProF)==0) )
               {
                  AV13Option = A557HisProF ;
                  AV15OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A557HisProF, "@!"))) ;
                  AV14Options.add(AV13Option, 0);
                  AV16OptionsDesc.add(AV15OptionDesc, 0);
                  AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV14Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkA955 )
         {
            brkA955 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV49TFCliNom = AV25SearchTxt ;
      AV50TFCliNom_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV37TFBarNHdr_Sel ,
                                           AV36TFBarNHdr ,
                                           AV11TFMaqCod_Sel ,
                                           AV10TFMaqCod ,
                                           AV38TFHisProFec ,
                                           AV39TFHisProKgr ,
                                           AV40TFHisProKgr_To ,
                                           AV41TFHisProMtr ,
                                           AV42TFHisProMtr_To ,
                                           Byte.valueOf(AV43TFHisProTur) ,
                                           Byte.valueOf(AV44TFHisProTur_To) ,
                                           AV46TFHisProF_Sel ,
                                           AV45TFHisProF ,
                                           AV47TFHisProDTI ,
                                           AV48TFHisProDTF ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV60TFFase_Sel ,
                                           AV59TFFase ,
                                           Short.valueOf(AV63TFBarTipArt) ,
                                           Short.valueOf(AV64TFBarTipArt_To) ,
                                           Short.valueOf(AV65TFHisProTip) ,
                                           Short.valueOf(AV66TFHisProTip_To) ,
                                           Byte.valueOf(AV67TFHisProTc) ,
                                           Byte.valueOf(AV68TFHisProTc_To) ,
                                           AV69TFHisProDf ,
                                           Short.valueOf(AV70TFParCod) ,
                                           Short.valueOf(AV71TFParCod_To) ,
                                           AV73TFParCodNom_Sel ,
                                           AV72TFParCodNom ,
                                           Byte.valueOf(AV31INHisEstReo) ,
                                           Integer.valueOf(AV74OperarioFrom) ,
                                           Integer.valueOf(AV75OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV62TFFaseDescripcion_Sel ,
                                           AV61TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV32INMaqCod1 ,
                                           AV33INMaqCod2 ,
                                           AV34INHisProFec1 ,
                                           AV35INHisProFec2 ,
                                           A396EmprCod ,
                                           AV30INEmprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36TFBarNHdr = GXutil.padr( GXutil.rtrim( AV36TFBarNHdr), 11, "%") ;
      lV10TFMaqCod = GXutil.padr( GXutil.rtrim( AV10TFMaqCod), 6, "%") ;
      lV45TFHisProF = GXutil.padr( GXutil.rtrim( AV45TFHisProF), 1, "%") ;
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV59TFFase = GXutil.padr( GXutil.rtrim( AV59TFFase), 8, "%") ;
      lV72TFParCodNom = GXutil.padr( GXutil.rtrim( AV72TFParCodNom), 30, "%") ;
      /* Using cursor P0A955 */
      pr_default.execute(3, new Object[] {AV32INMaqCod1, AV33INMaqCod2, AV34INHisProFec1, AV35INHisProFec2, AV30INEmprcod, lV36TFBarNHdr, AV37TFBarNHdr_Sel, lV10TFMaqCod, AV11TFMaqCod_Sel, AV38TFHisProFec, AV39TFHisProKgr, AV40TFHisProKgr_To, AV41TFHisProMtr, AV42TFHisProMtr_To, Byte.valueOf(AV43TFHisProTur), Byte.valueOf(AV44TFHisProTur_To), lV45TFHisProF, AV46TFHisProF_Sel, AV47TFHisProDTI, AV48TFHisProDTF, lV49TFCliNom, AV50TFCliNom_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV59TFFase, AV60TFFase_Sel, Short.valueOf(AV63TFBarTipArt), Short.valueOf(AV64TFBarTipArt_To), Short.valueOf(AV65TFHisProTip), Short.valueOf(AV66TFHisProTip_To), Byte.valueOf(AV67TFHisProTc), Byte.valueOf(AV68TFHisProTc_To), AV69TFHisProDf, Short.valueOf(AV70TFParCod), Short.valueOf(AV71TFParCod_To), lV72TFParCodNom, AV73TFParCodNom_Sel, Byte.valueOf(AV31INHisEstReo), Integer.valueOf(AV74OperarioFrom), Integer.valueOf(AV75OperarioTo)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA957 = false ;
         A252CliCod = P0A955_A252CliCod[0] ;
         n252CliCod = P0A955_n252CliCod[0] ;
         A279CliNom = P0A955_A279CliNom[0] ;
         A503GruOpeCod = P0A955_A503GruOpeCod[0] ;
         A3612HisProReo = P0A955_A3612HisProReo[0] ;
         A867ParCodNom = P0A955_A867ParCodNom[0] ;
         n867ParCodNom = P0A955_n867ParCodNom[0] ;
         A656ParCod = P0A955_A656ParCod[0] ;
         n656ParCod = P0A955_n656ParCod[0] ;
         A5608HisProDf = P0A955_A5608HisProDf[0] ;
         A3611HisProTc = P0A955_A3611HisProTc[0] ;
         A2247HisProTip = P0A955_A2247HisProTip[0] ;
         A217BarTipArt = P0A955_A217BarTipArt[0] ;
         n217BarTipArt = P0A955_n217BarTipArt[0] ;
         A136BarColNum = P0A955_A136BarColNum[0] ;
         A135BarColNom = P0A955_A135BarColNom[0] ;
         A212BarSer = P0A955_A212BarSer[0] ;
         A4441HisProDTF = P0A955_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A955_n4441HisProDTF[0] ;
         A4440HisProDTI = P0A955_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A955_n4440HisProDTI[0] ;
         A557HisProF = P0A955_A557HisProF[0] ;
         A566HisProTur = P0A955_A566HisProTur[0] ;
         A1526HisProMtr = P0A955_A1526HisProMtr[0] ;
         A1525HisProKgr = P0A955_A1525HisProKgr[0] ;
         A558HisProFec = P0A955_A558HisProFec[0] ;
         A602MaqCod = P0A955_A602MaqCod[0] ;
         A130BarCodPar = P0A955_A130BarCodPar[0] ;
         A132BarCodReo = P0A955_A132BarCodReo[0] ;
         A129BarCod = P0A955_A129BarCod[0] ;
         A461Fase = P0A955_A461Fase[0] ;
         A396EmprCod = P0A955_A396EmprCod[0] ;
         A561HisProLin = P0A955_A561HisProLin[0] ;
         A252CliCod = P0A955_A252CliCod[0] ;
         n252CliCod = P0A955_n252CliCod[0] ;
         A217BarTipArt = P0A955_A217BarTipArt[0] ;
         n217BarTipArt = P0A955_n217BarTipArt[0] ;
         A136BarColNum = P0A955_A136BarColNum[0] ;
         A135BarColNom = P0A955_A135BarColNom[0] ;
         A212BarSer = P0A955_A212BarSer[0] ;
         A279CliNom = P0A955_A279CliNom[0] ;
         A867ParCodNom = P0A955_A867ParCodNom[0] ;
         n867ParCodNom = P0A955_n867ParCodNom[0] ;
         GXt_char2 = A13893FaseDescri ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         informeproduccionresumenhdr_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13893FaseDescri = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV61TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV62TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV18count = 0 ;
               while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A955_A279CliNom[0], A279CliNom) == 0 ) )
               {
                  brkA957 = false ;
                  A252CliCod = P0A955_A252CliCod[0] ;
                  n252CliCod = P0A955_n252CliCod[0] ;
                  A558HisProFec = P0A955_A558HisProFec[0] ;
                  A602MaqCod = P0A955_A602MaqCod[0] ;
                  A130BarCodPar = P0A955_A130BarCodPar[0] ;
                  A132BarCodReo = P0A955_A132BarCodReo[0] ;
                  A129BarCod = P0A955_A129BarCod[0] ;
                  A396EmprCod = P0A955_A396EmprCod[0] ;
                  A561HisProLin = P0A955_A561HisProLin[0] ;
                  A252CliCod = P0A955_A252CliCod[0] ;
                  n252CliCod = P0A955_n252CliCod[0] ;
                  AV18count = (long)(AV18count+1) ;
                  brkA957 = true ;
                  pr_default.readNext(3);
               }
               if ( ! (GXutil.strcmp("", A279CliNom)==0) )
               {
                  AV13Option = A279CliNom ;
                  AV14Options.add(AV13Option, 0);
                  AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV14Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkA957 )
         {
            brkA957 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV51TFBarSer = AV25SearchTxt ;
      AV52TFBarSer_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV37TFBarNHdr_Sel ,
                                           AV36TFBarNHdr ,
                                           AV11TFMaqCod_Sel ,
                                           AV10TFMaqCod ,
                                           AV38TFHisProFec ,
                                           AV39TFHisProKgr ,
                                           AV40TFHisProKgr_To ,
                                           AV41TFHisProMtr ,
                                           AV42TFHisProMtr_To ,
                                           Byte.valueOf(AV43TFHisProTur) ,
                                           Byte.valueOf(AV44TFHisProTur_To) ,
                                           AV46TFHisProF_Sel ,
                                           AV45TFHisProF ,
                                           AV47TFHisProDTI ,
                                           AV48TFHisProDTF ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV60TFFase_Sel ,
                                           AV59TFFase ,
                                           Short.valueOf(AV63TFBarTipArt) ,
                                           Short.valueOf(AV64TFBarTipArt_To) ,
                                           Short.valueOf(AV65TFHisProTip) ,
                                           Short.valueOf(AV66TFHisProTip_To) ,
                                           Byte.valueOf(AV67TFHisProTc) ,
                                           Byte.valueOf(AV68TFHisProTc_To) ,
                                           AV69TFHisProDf ,
                                           Short.valueOf(AV70TFParCod) ,
                                           Short.valueOf(AV71TFParCod_To) ,
                                           AV73TFParCodNom_Sel ,
                                           AV72TFParCodNom ,
                                           Byte.valueOf(AV31INHisEstReo) ,
                                           Integer.valueOf(AV74OperarioFrom) ,
                                           Integer.valueOf(AV75OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV62TFFaseDescripcion_Sel ,
                                           AV61TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV32INMaqCod1 ,
                                           AV33INMaqCod2 ,
                                           AV34INHisProFec1 ,
                                           AV35INHisProFec2 ,
                                           A396EmprCod ,
                                           AV30INEmprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36TFBarNHdr = GXutil.padr( GXutil.rtrim( AV36TFBarNHdr), 11, "%") ;
      lV10TFMaqCod = GXutil.padr( GXutil.rtrim( AV10TFMaqCod), 6, "%") ;
      lV45TFHisProF = GXutil.padr( GXutil.rtrim( AV45TFHisProF), 1, "%") ;
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV59TFFase = GXutil.padr( GXutil.rtrim( AV59TFFase), 8, "%") ;
      lV72TFParCodNom = GXutil.padr( GXutil.rtrim( AV72TFParCodNom), 30, "%") ;
      /* Using cursor P0A956 */
      pr_default.execute(4, new Object[] {AV32INMaqCod1, AV33INMaqCod2, AV34INHisProFec1, AV35INHisProFec2, AV30INEmprcod, lV36TFBarNHdr, AV37TFBarNHdr_Sel, lV10TFMaqCod, AV11TFMaqCod_Sel, AV38TFHisProFec, AV39TFHisProKgr, AV40TFHisProKgr_To, AV41TFHisProMtr, AV42TFHisProMtr_To, Byte.valueOf(AV43TFHisProTur), Byte.valueOf(AV44TFHisProTur_To), lV45TFHisProF, AV46TFHisProF_Sel, AV47TFHisProDTI, AV48TFHisProDTF, lV49TFCliNom, AV50TFCliNom_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV59TFFase, AV60TFFase_Sel, Short.valueOf(AV63TFBarTipArt), Short.valueOf(AV64TFBarTipArt_To), Short.valueOf(AV65TFHisProTip), Short.valueOf(AV66TFHisProTip_To), Byte.valueOf(AV67TFHisProTc), Byte.valueOf(AV68TFHisProTc_To), AV69TFHisProDf, Short.valueOf(AV70TFParCod), Short.valueOf(AV71TFParCod_To), lV72TFParCodNom, AV73TFParCodNom_Sel, Byte.valueOf(AV31INHisEstReo), Integer.valueOf(AV74OperarioFrom), Integer.valueOf(AV75OperarioTo)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkA959 = false ;
         A252CliCod = P0A956_A252CliCod[0] ;
         n252CliCod = P0A956_n252CliCod[0] ;
         A212BarSer = P0A956_A212BarSer[0] ;
         A503GruOpeCod = P0A956_A503GruOpeCod[0] ;
         A3612HisProReo = P0A956_A3612HisProReo[0] ;
         A867ParCodNom = P0A956_A867ParCodNom[0] ;
         n867ParCodNom = P0A956_n867ParCodNom[0] ;
         A656ParCod = P0A956_A656ParCod[0] ;
         n656ParCod = P0A956_n656ParCod[0] ;
         A5608HisProDf = P0A956_A5608HisProDf[0] ;
         A3611HisProTc = P0A956_A3611HisProTc[0] ;
         A2247HisProTip = P0A956_A2247HisProTip[0] ;
         A217BarTipArt = P0A956_A217BarTipArt[0] ;
         n217BarTipArt = P0A956_n217BarTipArt[0] ;
         A136BarColNum = P0A956_A136BarColNum[0] ;
         A135BarColNom = P0A956_A135BarColNom[0] ;
         A279CliNom = P0A956_A279CliNom[0] ;
         A4441HisProDTF = P0A956_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A956_n4441HisProDTF[0] ;
         A4440HisProDTI = P0A956_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A956_n4440HisProDTI[0] ;
         A557HisProF = P0A956_A557HisProF[0] ;
         A566HisProTur = P0A956_A566HisProTur[0] ;
         A1526HisProMtr = P0A956_A1526HisProMtr[0] ;
         A1525HisProKgr = P0A956_A1525HisProKgr[0] ;
         A558HisProFec = P0A956_A558HisProFec[0] ;
         A602MaqCod = P0A956_A602MaqCod[0] ;
         A130BarCodPar = P0A956_A130BarCodPar[0] ;
         A132BarCodReo = P0A956_A132BarCodReo[0] ;
         A129BarCod = P0A956_A129BarCod[0] ;
         A461Fase = P0A956_A461Fase[0] ;
         A396EmprCod = P0A956_A396EmprCod[0] ;
         A561HisProLin = P0A956_A561HisProLin[0] ;
         A252CliCod = P0A956_A252CliCod[0] ;
         n252CliCod = P0A956_n252CliCod[0] ;
         A212BarSer = P0A956_A212BarSer[0] ;
         A217BarTipArt = P0A956_A217BarTipArt[0] ;
         n217BarTipArt = P0A956_n217BarTipArt[0] ;
         A136BarColNum = P0A956_A136BarColNum[0] ;
         A135BarColNom = P0A956_A135BarColNom[0] ;
         A279CliNom = P0A956_A279CliNom[0] ;
         A867ParCodNom = P0A956_A867ParCodNom[0] ;
         n867ParCodNom = P0A956_n867ParCodNom[0] ;
         GXt_char2 = A13893FaseDescri ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         informeproduccionresumenhdr_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13893FaseDescri = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV61TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV62TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV18count = 0 ;
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0A956_A212BarSer[0], A212BarSer) == 0 ) )
               {
                  brkA959 = false ;
                  A558HisProFec = P0A956_A558HisProFec[0] ;
                  A602MaqCod = P0A956_A602MaqCod[0] ;
                  A130BarCodPar = P0A956_A130BarCodPar[0] ;
                  A132BarCodReo = P0A956_A132BarCodReo[0] ;
                  A129BarCod = P0A956_A129BarCod[0] ;
                  A396EmprCod = P0A956_A396EmprCod[0] ;
                  A561HisProLin = P0A956_A561HisProLin[0] ;
                  AV18count = (long)(AV18count+1) ;
                  brkA959 = true ;
                  pr_default.readNext(4);
               }
               if ( ! (GXutil.strcmp("", A212BarSer)==0) )
               {
                  AV13Option = A212BarSer ;
                  AV14Options.add(AV13Option, 0);
                  AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV14Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkA959 )
         {
            brkA959 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV53TFBarColNom = AV25SearchTxt ;
      AV54TFBarColNom_Sel = "" ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV37TFBarNHdr_Sel ,
                                           AV36TFBarNHdr ,
                                           AV11TFMaqCod_Sel ,
                                           AV10TFMaqCod ,
                                           AV38TFHisProFec ,
                                           AV39TFHisProKgr ,
                                           AV40TFHisProKgr_To ,
                                           AV41TFHisProMtr ,
                                           AV42TFHisProMtr_To ,
                                           Byte.valueOf(AV43TFHisProTur) ,
                                           Byte.valueOf(AV44TFHisProTur_To) ,
                                           AV46TFHisProF_Sel ,
                                           AV45TFHisProF ,
                                           AV47TFHisProDTI ,
                                           AV48TFHisProDTF ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV60TFFase_Sel ,
                                           AV59TFFase ,
                                           Short.valueOf(AV63TFBarTipArt) ,
                                           Short.valueOf(AV64TFBarTipArt_To) ,
                                           Short.valueOf(AV65TFHisProTip) ,
                                           Short.valueOf(AV66TFHisProTip_To) ,
                                           Byte.valueOf(AV67TFHisProTc) ,
                                           Byte.valueOf(AV68TFHisProTc_To) ,
                                           AV69TFHisProDf ,
                                           Short.valueOf(AV70TFParCod) ,
                                           Short.valueOf(AV71TFParCod_To) ,
                                           AV73TFParCodNom_Sel ,
                                           AV72TFParCodNom ,
                                           Byte.valueOf(AV31INHisEstReo) ,
                                           Integer.valueOf(AV74OperarioFrom) ,
                                           Integer.valueOf(AV75OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV62TFFaseDescripcion_Sel ,
                                           AV61TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV32INMaqCod1 ,
                                           AV33INMaqCod2 ,
                                           AV34INHisProFec1 ,
                                           AV35INHisProFec2 ,
                                           A396EmprCod ,
                                           AV30INEmprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36TFBarNHdr = GXutil.padr( GXutil.rtrim( AV36TFBarNHdr), 11, "%") ;
      lV10TFMaqCod = GXutil.padr( GXutil.rtrim( AV10TFMaqCod), 6, "%") ;
      lV45TFHisProF = GXutil.padr( GXutil.rtrim( AV45TFHisProF), 1, "%") ;
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV59TFFase = GXutil.padr( GXutil.rtrim( AV59TFFase), 8, "%") ;
      lV72TFParCodNom = GXutil.padr( GXutil.rtrim( AV72TFParCodNom), 30, "%") ;
      /* Using cursor P0A957 */
      pr_default.execute(5, new Object[] {AV32INMaqCod1, AV33INMaqCod2, AV34INHisProFec1, AV35INHisProFec2, AV30INEmprcod, lV36TFBarNHdr, AV37TFBarNHdr_Sel, lV10TFMaqCod, AV11TFMaqCod_Sel, AV38TFHisProFec, AV39TFHisProKgr, AV40TFHisProKgr_To, AV41TFHisProMtr, AV42TFHisProMtr_To, Byte.valueOf(AV43TFHisProTur), Byte.valueOf(AV44TFHisProTur_To), lV45TFHisProF, AV46TFHisProF_Sel, AV47TFHisProDTI, AV48TFHisProDTF, lV49TFCliNom, AV50TFCliNom_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV59TFFase, AV60TFFase_Sel, Short.valueOf(AV63TFBarTipArt), Short.valueOf(AV64TFBarTipArt_To), Short.valueOf(AV65TFHisProTip), Short.valueOf(AV66TFHisProTip_To), Byte.valueOf(AV67TFHisProTc), Byte.valueOf(AV68TFHisProTc_To), AV69TFHisProDf, Short.valueOf(AV70TFParCod), Short.valueOf(AV71TFParCod_To), lV72TFParCodNom, AV73TFParCodNom_Sel, Byte.valueOf(AV31INHisEstReo), Integer.valueOf(AV74OperarioFrom), Integer.valueOf(AV75OperarioTo)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkA9511 = false ;
         A252CliCod = P0A957_A252CliCod[0] ;
         n252CliCod = P0A957_n252CliCod[0] ;
         A135BarColNom = P0A957_A135BarColNom[0] ;
         A503GruOpeCod = P0A957_A503GruOpeCod[0] ;
         A3612HisProReo = P0A957_A3612HisProReo[0] ;
         A867ParCodNom = P0A957_A867ParCodNom[0] ;
         n867ParCodNom = P0A957_n867ParCodNom[0] ;
         A656ParCod = P0A957_A656ParCod[0] ;
         n656ParCod = P0A957_n656ParCod[0] ;
         A5608HisProDf = P0A957_A5608HisProDf[0] ;
         A3611HisProTc = P0A957_A3611HisProTc[0] ;
         A2247HisProTip = P0A957_A2247HisProTip[0] ;
         A217BarTipArt = P0A957_A217BarTipArt[0] ;
         n217BarTipArt = P0A957_n217BarTipArt[0] ;
         A136BarColNum = P0A957_A136BarColNum[0] ;
         A212BarSer = P0A957_A212BarSer[0] ;
         A279CliNom = P0A957_A279CliNom[0] ;
         A4441HisProDTF = P0A957_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A957_n4441HisProDTF[0] ;
         A4440HisProDTI = P0A957_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A957_n4440HisProDTI[0] ;
         A557HisProF = P0A957_A557HisProF[0] ;
         A566HisProTur = P0A957_A566HisProTur[0] ;
         A1526HisProMtr = P0A957_A1526HisProMtr[0] ;
         A1525HisProKgr = P0A957_A1525HisProKgr[0] ;
         A558HisProFec = P0A957_A558HisProFec[0] ;
         A602MaqCod = P0A957_A602MaqCod[0] ;
         A130BarCodPar = P0A957_A130BarCodPar[0] ;
         A132BarCodReo = P0A957_A132BarCodReo[0] ;
         A129BarCod = P0A957_A129BarCod[0] ;
         A461Fase = P0A957_A461Fase[0] ;
         A396EmprCod = P0A957_A396EmprCod[0] ;
         A561HisProLin = P0A957_A561HisProLin[0] ;
         A252CliCod = P0A957_A252CliCod[0] ;
         n252CliCod = P0A957_n252CliCod[0] ;
         A135BarColNom = P0A957_A135BarColNom[0] ;
         A217BarTipArt = P0A957_A217BarTipArt[0] ;
         n217BarTipArt = P0A957_n217BarTipArt[0] ;
         A136BarColNum = P0A957_A136BarColNum[0] ;
         A212BarSer = P0A957_A212BarSer[0] ;
         A279CliNom = P0A957_A279CliNom[0] ;
         A867ParCodNom = P0A957_A867ParCodNom[0] ;
         n867ParCodNom = P0A957_n867ParCodNom[0] ;
         GXt_char2 = A13893FaseDescri ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         informeproduccionresumenhdr_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13893FaseDescri = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV61TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV62TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV18count = 0 ;
               while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0A957_A135BarColNom[0], A135BarColNom) == 0 ) )
               {
                  brkA9511 = false ;
                  A558HisProFec = P0A957_A558HisProFec[0] ;
                  A602MaqCod = P0A957_A602MaqCod[0] ;
                  A130BarCodPar = P0A957_A130BarCodPar[0] ;
                  A132BarCodReo = P0A957_A132BarCodReo[0] ;
                  A129BarCod = P0A957_A129BarCod[0] ;
                  A396EmprCod = P0A957_A396EmprCod[0] ;
                  A561HisProLin = P0A957_A561HisProLin[0] ;
                  AV18count = (long)(AV18count+1) ;
                  brkA9511 = true ;
                  pr_default.readNext(5);
               }
               if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
               {
                  AV13Option = A135BarColNom ;
                  AV14Options.add(AV13Option, 0);
                  AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV14Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkA9511 )
         {
            brkA9511 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADFASEOPTIONS' Routine */
      returnInSub = false ;
      AV59TFFase = AV25SearchTxt ;
      AV60TFFase_Sel = "" ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV37TFBarNHdr_Sel ,
                                           AV36TFBarNHdr ,
                                           AV11TFMaqCod_Sel ,
                                           AV10TFMaqCod ,
                                           AV38TFHisProFec ,
                                           AV39TFHisProKgr ,
                                           AV40TFHisProKgr_To ,
                                           AV41TFHisProMtr ,
                                           AV42TFHisProMtr_To ,
                                           Byte.valueOf(AV43TFHisProTur) ,
                                           Byte.valueOf(AV44TFHisProTur_To) ,
                                           AV46TFHisProF_Sel ,
                                           AV45TFHisProF ,
                                           AV47TFHisProDTI ,
                                           AV48TFHisProDTF ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV60TFFase_Sel ,
                                           AV59TFFase ,
                                           Short.valueOf(AV63TFBarTipArt) ,
                                           Short.valueOf(AV64TFBarTipArt_To) ,
                                           Short.valueOf(AV65TFHisProTip) ,
                                           Short.valueOf(AV66TFHisProTip_To) ,
                                           Byte.valueOf(AV67TFHisProTc) ,
                                           Byte.valueOf(AV68TFHisProTc_To) ,
                                           AV69TFHisProDf ,
                                           Short.valueOf(AV70TFParCod) ,
                                           Short.valueOf(AV71TFParCod_To) ,
                                           AV73TFParCodNom_Sel ,
                                           AV72TFParCodNom ,
                                           Byte.valueOf(AV31INHisEstReo) ,
                                           Integer.valueOf(AV74OperarioFrom) ,
                                           Integer.valueOf(AV75OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV62TFFaseDescripcion_Sel ,
                                           AV61TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV32INMaqCod1 ,
                                           AV33INMaqCod2 ,
                                           AV34INHisProFec1 ,
                                           AV35INHisProFec2 ,
                                           AV30INEmprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36TFBarNHdr = GXutil.padr( GXutil.rtrim( AV36TFBarNHdr), 11, "%") ;
      lV10TFMaqCod = GXutil.padr( GXutil.rtrim( AV10TFMaqCod), 6, "%") ;
      lV45TFHisProF = GXutil.padr( GXutil.rtrim( AV45TFHisProF), 1, "%") ;
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV59TFFase = GXutil.padr( GXutil.rtrim( AV59TFFase), 8, "%") ;
      lV72TFParCodNom = GXutil.padr( GXutil.rtrim( AV72TFParCodNom), 30, "%") ;
      /* Using cursor P0A958 */
      pr_default.execute(6, new Object[] {AV30INEmprcod, AV32INMaqCod1, AV33INMaqCod2, AV34INHisProFec1, AV35INHisProFec2, lV36TFBarNHdr, AV37TFBarNHdr_Sel, lV10TFMaqCod, AV11TFMaqCod_Sel, AV38TFHisProFec, AV39TFHisProKgr, AV40TFHisProKgr_To, AV41TFHisProMtr, AV42TFHisProMtr_To, Byte.valueOf(AV43TFHisProTur), Byte.valueOf(AV44TFHisProTur_To), lV45TFHisProF, AV46TFHisProF_Sel, AV47TFHisProDTI, AV48TFHisProDTF, lV49TFCliNom, AV50TFCliNom_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV59TFFase, AV60TFFase_Sel, Short.valueOf(AV63TFBarTipArt), Short.valueOf(AV64TFBarTipArt_To), Short.valueOf(AV65TFHisProTip), Short.valueOf(AV66TFHisProTip_To), Byte.valueOf(AV67TFHisProTc), Byte.valueOf(AV68TFHisProTc_To), AV69TFHisProDf, Short.valueOf(AV70TFParCod), Short.valueOf(AV71TFParCod_To), lV72TFParCodNom, AV73TFParCodNom_Sel, Byte.valueOf(AV31INHisEstReo), Integer.valueOf(AV74OperarioFrom), Integer.valueOf(AV75OperarioTo)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkA9513 = false ;
         A252CliCod = P0A958_A252CliCod[0] ;
         n252CliCod = P0A958_n252CliCod[0] ;
         A503GruOpeCod = P0A958_A503GruOpeCod[0] ;
         A3612HisProReo = P0A958_A3612HisProReo[0] ;
         A867ParCodNom = P0A958_A867ParCodNom[0] ;
         n867ParCodNom = P0A958_n867ParCodNom[0] ;
         A656ParCod = P0A958_A656ParCod[0] ;
         n656ParCod = P0A958_n656ParCod[0] ;
         A5608HisProDf = P0A958_A5608HisProDf[0] ;
         A3611HisProTc = P0A958_A3611HisProTc[0] ;
         A2247HisProTip = P0A958_A2247HisProTip[0] ;
         A217BarTipArt = P0A958_A217BarTipArt[0] ;
         n217BarTipArt = P0A958_n217BarTipArt[0] ;
         A136BarColNum = P0A958_A136BarColNum[0] ;
         A135BarColNom = P0A958_A135BarColNom[0] ;
         A212BarSer = P0A958_A212BarSer[0] ;
         A279CliNom = P0A958_A279CliNom[0] ;
         A4441HisProDTF = P0A958_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A958_n4441HisProDTF[0] ;
         A4440HisProDTI = P0A958_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A958_n4440HisProDTI[0] ;
         A557HisProF = P0A958_A557HisProF[0] ;
         A566HisProTur = P0A958_A566HisProTur[0] ;
         A1526HisProMtr = P0A958_A1526HisProMtr[0] ;
         A1525HisProKgr = P0A958_A1525HisProKgr[0] ;
         A558HisProFec = P0A958_A558HisProFec[0] ;
         A602MaqCod = P0A958_A602MaqCod[0] ;
         A130BarCodPar = P0A958_A130BarCodPar[0] ;
         A132BarCodReo = P0A958_A132BarCodReo[0] ;
         A129BarCod = P0A958_A129BarCod[0] ;
         A461Fase = P0A958_A461Fase[0] ;
         A396EmprCod = P0A958_A396EmprCod[0] ;
         A561HisProLin = P0A958_A561HisProLin[0] ;
         A252CliCod = P0A958_A252CliCod[0] ;
         n252CliCod = P0A958_n252CliCod[0] ;
         A217BarTipArt = P0A958_A217BarTipArt[0] ;
         n217BarTipArt = P0A958_n217BarTipArt[0] ;
         A136BarColNum = P0A958_A136BarColNum[0] ;
         A135BarColNom = P0A958_A135BarColNom[0] ;
         A212BarSer = P0A958_A212BarSer[0] ;
         A279CliNom = P0A958_A279CliNom[0] ;
         A867ParCodNom = P0A958_A867ParCodNom[0] ;
         n867ParCodNom = P0A958_n867ParCodNom[0] ;
         GXt_char2 = A13893FaseDescri ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         informeproduccionresumenhdr_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13893FaseDescri = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV61TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV62TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV18count = 0 ;
               while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0A958_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A958_A461Fase[0], A461Fase) == 0 ) )
               {
                  brkA9513 = false ;
                  A558HisProFec = P0A958_A558HisProFec[0] ;
                  A602MaqCod = P0A958_A602MaqCod[0] ;
                  A561HisProLin = P0A958_A561HisProLin[0] ;
                  AV18count = (long)(AV18count+1) ;
                  brkA9513 = true ;
                  pr_default.readNext(6);
               }
               if ( ! (GXutil.strcmp("", A461Fase)==0) )
               {
                  AV13Option = A461Fase ;
                  AV14Options.add(AV13Option, 0);
                  AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV14Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkA9513 )
         {
            brkA9513 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADFASEDESCRIPCIONOPTIONS' Routine */
      returnInSub = false ;
      AV61TFFaseDescripcion = AV25SearchTxt ;
      AV62TFFaseDescripcion_Sel = "" ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV37TFBarNHdr_Sel ,
                                           AV36TFBarNHdr ,
                                           AV11TFMaqCod_Sel ,
                                           AV10TFMaqCod ,
                                           AV38TFHisProFec ,
                                           AV39TFHisProKgr ,
                                           AV40TFHisProKgr_To ,
                                           AV41TFHisProMtr ,
                                           AV42TFHisProMtr_To ,
                                           Byte.valueOf(AV43TFHisProTur) ,
                                           Byte.valueOf(AV44TFHisProTur_To) ,
                                           AV46TFHisProF_Sel ,
                                           AV45TFHisProF ,
                                           AV47TFHisProDTI ,
                                           AV48TFHisProDTF ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV60TFFase_Sel ,
                                           AV59TFFase ,
                                           Short.valueOf(AV63TFBarTipArt) ,
                                           Short.valueOf(AV64TFBarTipArt_To) ,
                                           Short.valueOf(AV65TFHisProTip) ,
                                           Short.valueOf(AV66TFHisProTip_To) ,
                                           Byte.valueOf(AV67TFHisProTc) ,
                                           Byte.valueOf(AV68TFHisProTc_To) ,
                                           AV69TFHisProDf ,
                                           Short.valueOf(AV70TFParCod) ,
                                           Short.valueOf(AV71TFParCod_To) ,
                                           AV73TFParCodNom_Sel ,
                                           AV72TFParCodNom ,
                                           Byte.valueOf(AV31INHisEstReo) ,
                                           Integer.valueOf(AV74OperarioFrom) ,
                                           Integer.valueOf(AV75OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV62TFFaseDescripcion_Sel ,
                                           AV61TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV34INHisProFec1 ,
                                           AV35INHisProFec2 ,
                                           AV30INEmprcod ,
                                           AV32INMaqCod1 ,
                                           A396EmprCod ,
                                           AV33INMaqCod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36TFBarNHdr = GXutil.padr( GXutil.rtrim( AV36TFBarNHdr), 11, "%") ;
      lV10TFMaqCod = GXutil.padr( GXutil.rtrim( AV10TFMaqCod), 6, "%") ;
      lV45TFHisProF = GXutil.padr( GXutil.rtrim( AV45TFHisProF), 1, "%") ;
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV59TFFase = GXutil.padr( GXutil.rtrim( AV59TFFase), 8, "%") ;
      lV72TFParCodNom = GXutil.padr( GXutil.rtrim( AV72TFParCodNom), 30, "%") ;
      /* Using cursor P0A959 */
      pr_default.execute(7, new Object[] {AV30INEmprcod, AV32INMaqCod1, AV34INHisProFec1, AV35INHisProFec2, AV33INMaqCod2, lV36TFBarNHdr, AV37TFBarNHdr_Sel, lV10TFMaqCod, AV11TFMaqCod_Sel, AV38TFHisProFec, AV39TFHisProKgr, AV40TFHisProKgr_To, AV41TFHisProMtr, AV42TFHisProMtr_To, Byte.valueOf(AV43TFHisProTur), Byte.valueOf(AV44TFHisProTur_To), lV45TFHisProF, AV46TFHisProF_Sel, AV47TFHisProDTI, AV48TFHisProDTF, lV49TFCliNom, AV50TFCliNom_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV59TFFase, AV60TFFase_Sel, Short.valueOf(AV63TFBarTipArt), Short.valueOf(AV64TFBarTipArt_To), Short.valueOf(AV65TFHisProTip), Short.valueOf(AV66TFHisProTip_To), Byte.valueOf(AV67TFHisProTc), Byte.valueOf(AV68TFHisProTc_To), AV69TFHisProDf, Short.valueOf(AV70TFParCod), Short.valueOf(AV71TFParCod_To), lV72TFParCodNom, AV73TFParCodNom_Sel, Byte.valueOf(AV31INHisEstReo), Integer.valueOf(AV74OperarioFrom), Integer.valueOf(AV75OperarioTo)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A252CliCod = P0A959_A252CliCod[0] ;
         n252CliCod = P0A959_n252CliCod[0] ;
         A503GruOpeCod = P0A959_A503GruOpeCod[0] ;
         A3612HisProReo = P0A959_A3612HisProReo[0] ;
         A867ParCodNom = P0A959_A867ParCodNom[0] ;
         n867ParCodNom = P0A959_n867ParCodNom[0] ;
         A656ParCod = P0A959_A656ParCod[0] ;
         n656ParCod = P0A959_n656ParCod[0] ;
         A5608HisProDf = P0A959_A5608HisProDf[0] ;
         A3611HisProTc = P0A959_A3611HisProTc[0] ;
         A2247HisProTip = P0A959_A2247HisProTip[0] ;
         A217BarTipArt = P0A959_A217BarTipArt[0] ;
         n217BarTipArt = P0A959_n217BarTipArt[0] ;
         A136BarColNum = P0A959_A136BarColNum[0] ;
         A135BarColNom = P0A959_A135BarColNom[0] ;
         A212BarSer = P0A959_A212BarSer[0] ;
         A279CliNom = P0A959_A279CliNom[0] ;
         A4441HisProDTF = P0A959_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A959_n4441HisProDTF[0] ;
         A4440HisProDTI = P0A959_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A959_n4440HisProDTI[0] ;
         A557HisProF = P0A959_A557HisProF[0] ;
         A566HisProTur = P0A959_A566HisProTur[0] ;
         A1526HisProMtr = P0A959_A1526HisProMtr[0] ;
         A1525HisProKgr = P0A959_A1525HisProKgr[0] ;
         A558HisProFec = P0A959_A558HisProFec[0] ;
         A602MaqCod = P0A959_A602MaqCod[0] ;
         A130BarCodPar = P0A959_A130BarCodPar[0] ;
         A132BarCodReo = P0A959_A132BarCodReo[0] ;
         A129BarCod = P0A959_A129BarCod[0] ;
         A461Fase = P0A959_A461Fase[0] ;
         A396EmprCod = P0A959_A396EmprCod[0] ;
         A561HisProLin = P0A959_A561HisProLin[0] ;
         A252CliCod = P0A959_A252CliCod[0] ;
         n252CliCod = P0A959_n252CliCod[0] ;
         A217BarTipArt = P0A959_A217BarTipArt[0] ;
         n217BarTipArt = P0A959_n217BarTipArt[0] ;
         A136BarColNum = P0A959_A136BarColNum[0] ;
         A135BarColNom = P0A959_A135BarColNom[0] ;
         A212BarSer = P0A959_A212BarSer[0] ;
         A279CliNom = P0A959_A279CliNom[0] ;
         A867ParCodNom = P0A959_A867ParCodNom[0] ;
         n867ParCodNom = P0A959_n867ParCodNom[0] ;
         GXt_char2 = A13893FaseDescri ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         informeproduccionresumenhdr_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13893FaseDescri = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV61TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV62TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( ! (GXutil.strcmp("", A13893FaseDescri)==0) )
               {
                  AV13Option = A13893FaseDescri ;
                  AV12InsertIndex = 1 ;
                  while ( ( AV12InsertIndex <= AV14Options.size() ) && ( GXutil.strcmp((String)AV14Options.elementAt(-1+AV12InsertIndex), AV13Option) < 0 ) )
                  {
                     AV12InsertIndex = (int)(AV12InsertIndex+1) ;
                  }
                  if ( ( AV12InsertIndex <= AV14Options.size() ) && ( GXutil.strcmp((String)AV14Options.elementAt(-1+AV12InsertIndex), AV13Option) == 0 ) )
                  {
                     AV18count = GXutil.lval( (String)AV17OptionIndexes.elementAt(-1+AV12InsertIndex)) ;
                     AV18count = (long)(AV18count+1) ;
                     AV17OptionIndexes.removeItem(AV12InsertIndex);
                     AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), AV12InsertIndex);
                  }
                  else
                  {
                     AV14Options.add(AV13Option, AV12InsertIndex);
                     AV17OptionIndexes.add("1", AV12InsertIndex);
                  }
               }
               if ( AV14Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADPARCODNOMOPTIONS' Routine */
      returnInSub = false ;
      AV72TFParCodNom = AV25SearchTxt ;
      AV73TFParCodNom_Sel = "" ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV37TFBarNHdr_Sel ,
                                           AV36TFBarNHdr ,
                                           AV11TFMaqCod_Sel ,
                                           AV10TFMaqCod ,
                                           AV38TFHisProFec ,
                                           AV39TFHisProKgr ,
                                           AV40TFHisProKgr_To ,
                                           AV41TFHisProMtr ,
                                           AV42TFHisProMtr_To ,
                                           Byte.valueOf(AV43TFHisProTur) ,
                                           Byte.valueOf(AV44TFHisProTur_To) ,
                                           AV46TFHisProF_Sel ,
                                           AV45TFHisProF ,
                                           AV47TFHisProDTI ,
                                           AV48TFHisProDTF ,
                                           AV50TFCliNom_Sel ,
                                           AV49TFCliNom ,
                                           AV52TFBarSer_Sel ,
                                           AV51TFBarSer ,
                                           AV54TFBarColNom_Sel ,
                                           AV53TFBarColNom ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV60TFFase_Sel ,
                                           AV59TFFase ,
                                           Short.valueOf(AV63TFBarTipArt) ,
                                           Short.valueOf(AV64TFBarTipArt_To) ,
                                           Short.valueOf(AV65TFHisProTip) ,
                                           Short.valueOf(AV66TFHisProTip_To) ,
                                           Byte.valueOf(AV67TFHisProTc) ,
                                           Byte.valueOf(AV68TFHisProTc_To) ,
                                           AV69TFHisProDf ,
                                           Short.valueOf(AV70TFParCod) ,
                                           Short.valueOf(AV71TFParCod_To) ,
                                           AV73TFParCodNom_Sel ,
                                           AV72TFParCodNom ,
                                           Byte.valueOf(AV31INHisEstReo) ,
                                           Integer.valueOf(AV74OperarioFrom) ,
                                           Integer.valueOf(AV75OperarioTo) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A461Fase ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(A2247HisProTip) ,
                                           Byte.valueOf(A3611HisProTc) ,
                                           A5608HisProDf ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV62TFFaseDescripcion_Sel ,
                                           AV61TFFaseDescripcion ,
                                           A13893FaseDescri ,
                                           AV32INMaqCod1 ,
                                           AV33INMaqCod2 ,
                                           AV34INHisProFec1 ,
                                           AV35INHisProFec2 ,
                                           A396EmprCod ,
                                           AV30INEmprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36TFBarNHdr = GXutil.padr( GXutil.rtrim( AV36TFBarNHdr), 11, "%") ;
      lV10TFMaqCod = GXutil.padr( GXutil.rtrim( AV10TFMaqCod), 6, "%") ;
      lV45TFHisProF = GXutil.padr( GXutil.rtrim( AV45TFHisProF), 1, "%") ;
      lV49TFCliNom = GXutil.padr( GXutil.rtrim( AV49TFCliNom), 30, "%") ;
      lV51TFBarSer = GXutil.padr( GXutil.rtrim( AV51TFBarSer), 16, "%") ;
      lV53TFBarColNom = GXutil.padr( GXutil.rtrim( AV53TFBarColNom), 13, "%") ;
      lV59TFFase = GXutil.padr( GXutil.rtrim( AV59TFFase), 8, "%") ;
      lV72TFParCodNom = GXutil.padr( GXutil.rtrim( AV72TFParCodNom), 30, "%") ;
      /* Using cursor P0A9510 */
      pr_default.execute(8, new Object[] {AV32INMaqCod1, AV33INMaqCod2, AV34INHisProFec1, AV35INHisProFec2, AV30INEmprcod, lV36TFBarNHdr, AV37TFBarNHdr_Sel, lV10TFMaqCod, AV11TFMaqCod_Sel, AV38TFHisProFec, AV39TFHisProKgr, AV40TFHisProKgr_To, AV41TFHisProMtr, AV42TFHisProMtr_To, Byte.valueOf(AV43TFHisProTur), Byte.valueOf(AV44TFHisProTur_To), lV45TFHisProF, AV46TFHisProF_Sel, AV47TFHisProDTI, AV48TFHisProDTF, lV49TFCliNom, AV50TFCliNom_Sel, lV51TFBarSer, AV52TFBarSer_Sel, lV53TFBarColNom, AV54TFBarColNom_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), lV59TFFase, AV60TFFase_Sel, Short.valueOf(AV63TFBarTipArt), Short.valueOf(AV64TFBarTipArt_To), Short.valueOf(AV65TFHisProTip), Short.valueOf(AV66TFHisProTip_To), Byte.valueOf(AV67TFHisProTc), Byte.valueOf(AV68TFHisProTc_To), AV69TFHisProDf, Short.valueOf(AV70TFParCod), Short.valueOf(AV71TFParCod_To), lV72TFParCodNom, AV73TFParCodNom_Sel, Byte.valueOf(AV31INHisEstReo), Integer.valueOf(AV74OperarioFrom), Integer.valueOf(AV75OperarioTo)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brkA9516 = false ;
         A252CliCod = P0A9510_A252CliCod[0] ;
         n252CliCod = P0A9510_n252CliCod[0] ;
         A867ParCodNom = P0A9510_A867ParCodNom[0] ;
         n867ParCodNom = P0A9510_n867ParCodNom[0] ;
         A503GruOpeCod = P0A9510_A503GruOpeCod[0] ;
         A3612HisProReo = P0A9510_A3612HisProReo[0] ;
         A656ParCod = P0A9510_A656ParCod[0] ;
         n656ParCod = P0A9510_n656ParCod[0] ;
         A5608HisProDf = P0A9510_A5608HisProDf[0] ;
         A3611HisProTc = P0A9510_A3611HisProTc[0] ;
         A2247HisProTip = P0A9510_A2247HisProTip[0] ;
         A217BarTipArt = P0A9510_A217BarTipArt[0] ;
         n217BarTipArt = P0A9510_n217BarTipArt[0] ;
         A136BarColNum = P0A9510_A136BarColNum[0] ;
         A135BarColNom = P0A9510_A135BarColNom[0] ;
         A212BarSer = P0A9510_A212BarSer[0] ;
         A279CliNom = P0A9510_A279CliNom[0] ;
         A4441HisProDTF = P0A9510_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A9510_n4441HisProDTF[0] ;
         A4440HisProDTI = P0A9510_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A9510_n4440HisProDTI[0] ;
         A557HisProF = P0A9510_A557HisProF[0] ;
         A566HisProTur = P0A9510_A566HisProTur[0] ;
         A1526HisProMtr = P0A9510_A1526HisProMtr[0] ;
         A1525HisProKgr = P0A9510_A1525HisProKgr[0] ;
         A558HisProFec = P0A9510_A558HisProFec[0] ;
         A602MaqCod = P0A9510_A602MaqCod[0] ;
         A130BarCodPar = P0A9510_A130BarCodPar[0] ;
         A132BarCodReo = P0A9510_A132BarCodReo[0] ;
         A129BarCod = P0A9510_A129BarCod[0] ;
         A461Fase = P0A9510_A461Fase[0] ;
         A396EmprCod = P0A9510_A396EmprCod[0] ;
         A561HisProLin = P0A9510_A561HisProLin[0] ;
         A252CliCod = P0A9510_A252CliCod[0] ;
         n252CliCod = P0A9510_n252CliCod[0] ;
         A217BarTipArt = P0A9510_A217BarTipArt[0] ;
         n217BarTipArt = P0A9510_n217BarTipArt[0] ;
         A136BarColNum = P0A9510_A136BarColNum[0] ;
         A135BarColNom = P0A9510_A135BarColNom[0] ;
         A212BarSer = P0A9510_A212BarSer[0] ;
         A279CliNom = P0A9510_A279CliNom[0] ;
         A867ParCodNom = P0A9510_A867ParCodNom[0] ;
         n867ParCodNom = P0A9510_n867ParCodNom[0] ;
         GXt_char2 = A13893FaseDescri ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         informeproduccionresumenhdr_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13893FaseDescri = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFFaseDescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV61TFFaseDescripcion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV62TFFaseDescripcion_Sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV62TFFaseDescripcion_Sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV18count = 0 ;
               while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P0A9510_A867ParCodNom[0], A867ParCodNom) == 0 ) )
               {
                  brkA9516 = false ;
                  A656ParCod = P0A9510_A656ParCod[0] ;
                  n656ParCod = P0A9510_n656ParCod[0] ;
                  A558HisProFec = P0A9510_A558HisProFec[0] ;
                  A602MaqCod = P0A9510_A602MaqCod[0] ;
                  A396EmprCod = P0A9510_A396EmprCod[0] ;
                  A561HisProLin = P0A9510_A561HisProLin[0] ;
                  AV18count = (long)(AV18count+1) ;
                  brkA9516 = true ;
                  pr_default.readNext(8);
               }
               if ( ! (GXutil.strcmp("", A867ParCodNom)==0) )
               {
                  AV13Option = A867ParCodNom ;
                  AV14Options.add(AV13Option, 0);
                  AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV14Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkA9516 )
         {
            brkA9516 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP3[0] = informeproduccionresumenhdr_wc1getfilterdata.this.AV27OptionsJson;
      this.aP4[0] = informeproduccionresumenhdr_wc1getfilterdata.this.AV28OptionsDescJson;
      this.aP5[0] = informeproduccionresumenhdr_wc1getfilterdata.this.AV29OptionIndexesJson;
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
      AV36TFBarNHdr = "" ;
      AV37TFBarNHdr_Sel = "" ;
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV38TFHisProFec = GXutil.nullDate() ;
      AV39TFHisProKgr = DecimalUtil.ZERO ;
      AV40TFHisProKgr_To = DecimalUtil.ZERO ;
      AV41TFHisProMtr = DecimalUtil.ZERO ;
      AV42TFHisProMtr_To = DecimalUtil.ZERO ;
      AV45TFHisProF = "" ;
      AV46TFHisProF_Sel = "" ;
      AV47TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV48TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV49TFCliNom = "" ;
      AV50TFCliNom_Sel = "" ;
      AV51TFBarSer = "" ;
      AV52TFBarSer_Sel = "" ;
      AV53TFBarColNom = "" ;
      AV54TFBarColNom_Sel = "" ;
      AV59TFFase = "" ;
      AV60TFFase_Sel = "" ;
      AV61TFFaseDescripcion = "" ;
      AV62TFFaseDescripcion_Sel = "" ;
      AV69TFHisProDf = GXutil.nullDate() ;
      AV72TFParCodNom = "" ;
      AV73TFParCodNom_Sel = "" ;
      AV30INEmprcod = "" ;
      AV32INMaqCod1 = "" ;
      AV33INMaqCod2 = "" ;
      AV34INHisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      AV35INHisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV36TFBarNHdr = "" ;
      lV10TFMaqCod = "" ;
      lV45TFHisProF = "" ;
      lV49TFCliNom = "" ;
      lV51TFBarSer = "" ;
      lV53TFBarColNom = "" ;
      lV59TFFase = "" ;
      lV72TFParCodNom = "" ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A557HisProF = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A461Fase = "" ;
      A5608HisProDf = GXutil.nullDate() ;
      A867ParCodNom = "" ;
      A13893FaseDescri = "" ;
      A396EmprCod = "" ;
      P0A952_A252CliCod = new int[1] ;
      P0A952_n252CliCod = new boolean[] {false} ;
      P0A952_A503GruOpeCod = new int[1] ;
      P0A952_A3612HisProReo = new byte[1] ;
      P0A952_A867ParCodNom = new String[] {""} ;
      P0A952_n867ParCodNom = new boolean[] {false} ;
      P0A952_A656ParCod = new short[1] ;
      P0A952_n656ParCod = new boolean[] {false} ;
      P0A952_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A952_A3611HisProTc = new byte[1] ;
      P0A952_A2247HisProTip = new short[1] ;
      P0A952_A217BarTipArt = new short[1] ;
      P0A952_n217BarTipArt = new boolean[] {false} ;
      P0A952_A136BarColNum = new int[1] ;
      P0A952_A135BarColNom = new String[] {""} ;
      P0A952_A212BarSer = new String[] {""} ;
      P0A952_A279CliNom = new String[] {""} ;
      P0A952_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A952_n4441HisProDTF = new boolean[] {false} ;
      P0A952_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A952_n4440HisProDTI = new boolean[] {false} ;
      P0A952_A557HisProF = new String[] {""} ;
      P0A952_A566HisProTur = new byte[1] ;
      P0A952_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A952_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A952_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A952_A602MaqCod = new String[] {""} ;
      P0A952_A130BarCodPar = new String[] {""} ;
      P0A952_A132BarCodReo = new byte[1] ;
      P0A952_A129BarCod = new int[1] ;
      P0A952_A461Fase = new String[] {""} ;
      P0A952_A396EmprCod = new String[] {""} ;
      P0A952_A561HisProLin = new int[1] ;
      A13696BarNHdr = "" ;
      AV13Option = "" ;
      P0A953_A252CliCod = new int[1] ;
      P0A953_n252CliCod = new boolean[] {false} ;
      P0A953_A602MaqCod = new String[] {""} ;
      P0A953_A503GruOpeCod = new int[1] ;
      P0A953_A3612HisProReo = new byte[1] ;
      P0A953_A867ParCodNom = new String[] {""} ;
      P0A953_n867ParCodNom = new boolean[] {false} ;
      P0A953_A656ParCod = new short[1] ;
      P0A953_n656ParCod = new boolean[] {false} ;
      P0A953_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A953_A3611HisProTc = new byte[1] ;
      P0A953_A2247HisProTip = new short[1] ;
      P0A953_A217BarTipArt = new short[1] ;
      P0A953_n217BarTipArt = new boolean[] {false} ;
      P0A953_A136BarColNum = new int[1] ;
      P0A953_A135BarColNom = new String[] {""} ;
      P0A953_A212BarSer = new String[] {""} ;
      P0A953_A279CliNom = new String[] {""} ;
      P0A953_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A953_n4441HisProDTF = new boolean[] {false} ;
      P0A953_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A953_n4440HisProDTI = new boolean[] {false} ;
      P0A953_A557HisProF = new String[] {""} ;
      P0A953_A566HisProTur = new byte[1] ;
      P0A953_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A953_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A953_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A953_A130BarCodPar = new String[] {""} ;
      P0A953_A132BarCodReo = new byte[1] ;
      P0A953_A129BarCod = new int[1] ;
      P0A953_A461Fase = new String[] {""} ;
      P0A953_A396EmprCod = new String[] {""} ;
      P0A953_A561HisProLin = new int[1] ;
      P0A954_A252CliCod = new int[1] ;
      P0A954_n252CliCod = new boolean[] {false} ;
      P0A954_A557HisProF = new String[] {""} ;
      P0A954_A503GruOpeCod = new int[1] ;
      P0A954_A3612HisProReo = new byte[1] ;
      P0A954_A867ParCodNom = new String[] {""} ;
      P0A954_n867ParCodNom = new boolean[] {false} ;
      P0A954_A656ParCod = new short[1] ;
      P0A954_n656ParCod = new boolean[] {false} ;
      P0A954_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A954_A3611HisProTc = new byte[1] ;
      P0A954_A2247HisProTip = new short[1] ;
      P0A954_A217BarTipArt = new short[1] ;
      P0A954_n217BarTipArt = new boolean[] {false} ;
      P0A954_A136BarColNum = new int[1] ;
      P0A954_A135BarColNom = new String[] {""} ;
      P0A954_A212BarSer = new String[] {""} ;
      P0A954_A279CliNom = new String[] {""} ;
      P0A954_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A954_n4441HisProDTF = new boolean[] {false} ;
      P0A954_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A954_n4440HisProDTI = new boolean[] {false} ;
      P0A954_A566HisProTur = new byte[1] ;
      P0A954_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A954_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A954_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A954_A602MaqCod = new String[] {""} ;
      P0A954_A130BarCodPar = new String[] {""} ;
      P0A954_A132BarCodReo = new byte[1] ;
      P0A954_A129BarCod = new int[1] ;
      P0A954_A461Fase = new String[] {""} ;
      P0A954_A396EmprCod = new String[] {""} ;
      P0A954_A561HisProLin = new int[1] ;
      AV15OptionDesc = "" ;
      P0A955_A252CliCod = new int[1] ;
      P0A955_n252CliCod = new boolean[] {false} ;
      P0A955_A279CliNom = new String[] {""} ;
      P0A955_A503GruOpeCod = new int[1] ;
      P0A955_A3612HisProReo = new byte[1] ;
      P0A955_A867ParCodNom = new String[] {""} ;
      P0A955_n867ParCodNom = new boolean[] {false} ;
      P0A955_A656ParCod = new short[1] ;
      P0A955_n656ParCod = new boolean[] {false} ;
      P0A955_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A955_A3611HisProTc = new byte[1] ;
      P0A955_A2247HisProTip = new short[1] ;
      P0A955_A217BarTipArt = new short[1] ;
      P0A955_n217BarTipArt = new boolean[] {false} ;
      P0A955_A136BarColNum = new int[1] ;
      P0A955_A135BarColNom = new String[] {""} ;
      P0A955_A212BarSer = new String[] {""} ;
      P0A955_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A955_n4441HisProDTF = new boolean[] {false} ;
      P0A955_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A955_n4440HisProDTI = new boolean[] {false} ;
      P0A955_A557HisProF = new String[] {""} ;
      P0A955_A566HisProTur = new byte[1] ;
      P0A955_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A955_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A955_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A955_A602MaqCod = new String[] {""} ;
      P0A955_A130BarCodPar = new String[] {""} ;
      P0A955_A132BarCodReo = new byte[1] ;
      P0A955_A129BarCod = new int[1] ;
      P0A955_A461Fase = new String[] {""} ;
      P0A955_A396EmprCod = new String[] {""} ;
      P0A955_A561HisProLin = new int[1] ;
      P0A956_A252CliCod = new int[1] ;
      P0A956_n252CliCod = new boolean[] {false} ;
      P0A956_A212BarSer = new String[] {""} ;
      P0A956_A503GruOpeCod = new int[1] ;
      P0A956_A3612HisProReo = new byte[1] ;
      P0A956_A867ParCodNom = new String[] {""} ;
      P0A956_n867ParCodNom = new boolean[] {false} ;
      P0A956_A656ParCod = new short[1] ;
      P0A956_n656ParCod = new boolean[] {false} ;
      P0A956_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A956_A3611HisProTc = new byte[1] ;
      P0A956_A2247HisProTip = new short[1] ;
      P0A956_A217BarTipArt = new short[1] ;
      P0A956_n217BarTipArt = new boolean[] {false} ;
      P0A956_A136BarColNum = new int[1] ;
      P0A956_A135BarColNom = new String[] {""} ;
      P0A956_A279CliNom = new String[] {""} ;
      P0A956_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A956_n4441HisProDTF = new boolean[] {false} ;
      P0A956_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A956_n4440HisProDTI = new boolean[] {false} ;
      P0A956_A557HisProF = new String[] {""} ;
      P0A956_A566HisProTur = new byte[1] ;
      P0A956_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A956_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A956_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A956_A602MaqCod = new String[] {""} ;
      P0A956_A130BarCodPar = new String[] {""} ;
      P0A956_A132BarCodReo = new byte[1] ;
      P0A956_A129BarCod = new int[1] ;
      P0A956_A461Fase = new String[] {""} ;
      P0A956_A396EmprCod = new String[] {""} ;
      P0A956_A561HisProLin = new int[1] ;
      P0A957_A252CliCod = new int[1] ;
      P0A957_n252CliCod = new boolean[] {false} ;
      P0A957_A135BarColNom = new String[] {""} ;
      P0A957_A503GruOpeCod = new int[1] ;
      P0A957_A3612HisProReo = new byte[1] ;
      P0A957_A867ParCodNom = new String[] {""} ;
      P0A957_n867ParCodNom = new boolean[] {false} ;
      P0A957_A656ParCod = new short[1] ;
      P0A957_n656ParCod = new boolean[] {false} ;
      P0A957_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A957_A3611HisProTc = new byte[1] ;
      P0A957_A2247HisProTip = new short[1] ;
      P0A957_A217BarTipArt = new short[1] ;
      P0A957_n217BarTipArt = new boolean[] {false} ;
      P0A957_A136BarColNum = new int[1] ;
      P0A957_A212BarSer = new String[] {""} ;
      P0A957_A279CliNom = new String[] {""} ;
      P0A957_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A957_n4441HisProDTF = new boolean[] {false} ;
      P0A957_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A957_n4440HisProDTI = new boolean[] {false} ;
      P0A957_A557HisProF = new String[] {""} ;
      P0A957_A566HisProTur = new byte[1] ;
      P0A957_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A957_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A957_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A957_A602MaqCod = new String[] {""} ;
      P0A957_A130BarCodPar = new String[] {""} ;
      P0A957_A132BarCodReo = new byte[1] ;
      P0A957_A129BarCod = new int[1] ;
      P0A957_A461Fase = new String[] {""} ;
      P0A957_A396EmprCod = new String[] {""} ;
      P0A957_A561HisProLin = new int[1] ;
      P0A958_A252CliCod = new int[1] ;
      P0A958_n252CliCod = new boolean[] {false} ;
      P0A958_A503GruOpeCod = new int[1] ;
      P0A958_A3612HisProReo = new byte[1] ;
      P0A958_A867ParCodNom = new String[] {""} ;
      P0A958_n867ParCodNom = new boolean[] {false} ;
      P0A958_A656ParCod = new short[1] ;
      P0A958_n656ParCod = new boolean[] {false} ;
      P0A958_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A958_A3611HisProTc = new byte[1] ;
      P0A958_A2247HisProTip = new short[1] ;
      P0A958_A217BarTipArt = new short[1] ;
      P0A958_n217BarTipArt = new boolean[] {false} ;
      P0A958_A136BarColNum = new int[1] ;
      P0A958_A135BarColNom = new String[] {""} ;
      P0A958_A212BarSer = new String[] {""} ;
      P0A958_A279CliNom = new String[] {""} ;
      P0A958_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A958_n4441HisProDTF = new boolean[] {false} ;
      P0A958_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A958_n4440HisProDTI = new boolean[] {false} ;
      P0A958_A557HisProF = new String[] {""} ;
      P0A958_A566HisProTur = new byte[1] ;
      P0A958_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A958_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A958_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A958_A602MaqCod = new String[] {""} ;
      P0A958_A130BarCodPar = new String[] {""} ;
      P0A958_A132BarCodReo = new byte[1] ;
      P0A958_A129BarCod = new int[1] ;
      P0A958_A461Fase = new String[] {""} ;
      P0A958_A396EmprCod = new String[] {""} ;
      P0A958_A561HisProLin = new int[1] ;
      P0A959_A252CliCod = new int[1] ;
      P0A959_n252CliCod = new boolean[] {false} ;
      P0A959_A503GruOpeCod = new int[1] ;
      P0A959_A3612HisProReo = new byte[1] ;
      P0A959_A867ParCodNom = new String[] {""} ;
      P0A959_n867ParCodNom = new boolean[] {false} ;
      P0A959_A656ParCod = new short[1] ;
      P0A959_n656ParCod = new boolean[] {false} ;
      P0A959_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A959_A3611HisProTc = new byte[1] ;
      P0A959_A2247HisProTip = new short[1] ;
      P0A959_A217BarTipArt = new short[1] ;
      P0A959_n217BarTipArt = new boolean[] {false} ;
      P0A959_A136BarColNum = new int[1] ;
      P0A959_A135BarColNom = new String[] {""} ;
      P0A959_A212BarSer = new String[] {""} ;
      P0A959_A279CliNom = new String[] {""} ;
      P0A959_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A959_n4441HisProDTF = new boolean[] {false} ;
      P0A959_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A959_n4440HisProDTI = new boolean[] {false} ;
      P0A959_A557HisProF = new String[] {""} ;
      P0A959_A566HisProTur = new byte[1] ;
      P0A959_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A959_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A959_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A959_A602MaqCod = new String[] {""} ;
      P0A959_A130BarCodPar = new String[] {""} ;
      P0A959_A132BarCodReo = new byte[1] ;
      P0A959_A129BarCod = new int[1] ;
      P0A959_A461Fase = new String[] {""} ;
      P0A959_A396EmprCod = new String[] {""} ;
      P0A959_A561HisProLin = new int[1] ;
      P0A9510_A252CliCod = new int[1] ;
      P0A9510_n252CliCod = new boolean[] {false} ;
      P0A9510_A867ParCodNom = new String[] {""} ;
      P0A9510_n867ParCodNom = new boolean[] {false} ;
      P0A9510_A503GruOpeCod = new int[1] ;
      P0A9510_A3612HisProReo = new byte[1] ;
      P0A9510_A656ParCod = new short[1] ;
      P0A9510_n656ParCod = new boolean[] {false} ;
      P0A9510_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9510_A3611HisProTc = new byte[1] ;
      P0A9510_A2247HisProTip = new short[1] ;
      P0A9510_A217BarTipArt = new short[1] ;
      P0A9510_n217BarTipArt = new boolean[] {false} ;
      P0A9510_A136BarColNum = new int[1] ;
      P0A9510_A135BarColNom = new String[] {""} ;
      P0A9510_A212BarSer = new String[] {""} ;
      P0A9510_A279CliNom = new String[] {""} ;
      P0A9510_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9510_n4441HisProDTF = new boolean[] {false} ;
      P0A9510_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9510_n4440HisProDTI = new boolean[] {false} ;
      P0A9510_A557HisProF = new String[] {""} ;
      P0A9510_A566HisProTur = new byte[1] ;
      P0A9510_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9510_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9510_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A9510_A602MaqCod = new String[] {""} ;
      P0A9510_A130BarCodPar = new String[] {""} ;
      P0A9510_A132BarCodReo = new byte[1] ;
      P0A9510_A129BarCod = new int[1] ;
      P0A9510_A461Fase = new String[] {""} ;
      P0A9510_A396EmprCod = new String[] {""} ;
      P0A9510_A561HisProLin = new int[1] ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenhdr_wc1getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A952_A252CliCod, P0A952_n252CliCod, P0A952_A503GruOpeCod, P0A952_A3612HisProReo, P0A952_A867ParCodNom, P0A952_n867ParCodNom, P0A952_A656ParCod, P0A952_n656ParCod, P0A952_A5608HisProDf, P0A952_A3611HisProTc,
            P0A952_A2247HisProTip, P0A952_A217BarTipArt, P0A952_n217BarTipArt, P0A952_A136BarColNum, P0A952_A135BarColNom, P0A952_A212BarSer, P0A952_A279CliNom, P0A952_A4441HisProDTF, P0A952_n4441HisProDTF, P0A952_A4440HisProDTI,
            P0A952_n4440HisProDTI, P0A952_A557HisProF, P0A952_A566HisProTur, P0A952_A1526HisProMtr, P0A952_A1525HisProKgr, P0A952_A558HisProFec, P0A952_A602MaqCod, P0A952_A130BarCodPar, P0A952_A132BarCodReo, P0A952_A129BarCod,
            P0A952_A461Fase, P0A952_A396EmprCod, P0A952_A561HisProLin
            }
            , new Object[] {
            P0A953_A252CliCod, P0A953_n252CliCod, P0A953_A602MaqCod, P0A953_A503GruOpeCod, P0A953_A3612HisProReo, P0A953_A867ParCodNom, P0A953_n867ParCodNom, P0A953_A656ParCod, P0A953_n656ParCod, P0A953_A5608HisProDf,
            P0A953_A3611HisProTc, P0A953_A2247HisProTip, P0A953_A217BarTipArt, P0A953_n217BarTipArt, P0A953_A136BarColNum, P0A953_A135BarColNom, P0A953_A212BarSer, P0A953_A279CliNom, P0A953_A4441HisProDTF, P0A953_n4441HisProDTF,
            P0A953_A4440HisProDTI, P0A953_n4440HisProDTI, P0A953_A557HisProF, P0A953_A566HisProTur, P0A953_A1526HisProMtr, P0A953_A1525HisProKgr, P0A953_A558HisProFec, P0A953_A130BarCodPar, P0A953_A132BarCodReo, P0A953_A129BarCod,
            P0A953_A461Fase, P0A953_A396EmprCod, P0A953_A561HisProLin
            }
            , new Object[] {
            P0A954_A252CliCod, P0A954_n252CliCod, P0A954_A557HisProF, P0A954_A503GruOpeCod, P0A954_A3612HisProReo, P0A954_A867ParCodNom, P0A954_n867ParCodNom, P0A954_A656ParCod, P0A954_n656ParCod, P0A954_A5608HisProDf,
            P0A954_A3611HisProTc, P0A954_A2247HisProTip, P0A954_A217BarTipArt, P0A954_n217BarTipArt, P0A954_A136BarColNum, P0A954_A135BarColNom, P0A954_A212BarSer, P0A954_A279CliNom, P0A954_A4441HisProDTF, P0A954_n4441HisProDTF,
            P0A954_A4440HisProDTI, P0A954_n4440HisProDTI, P0A954_A566HisProTur, P0A954_A1526HisProMtr, P0A954_A1525HisProKgr, P0A954_A558HisProFec, P0A954_A602MaqCod, P0A954_A130BarCodPar, P0A954_A132BarCodReo, P0A954_A129BarCod,
            P0A954_A461Fase, P0A954_A396EmprCod, P0A954_A561HisProLin
            }
            , new Object[] {
            P0A955_A252CliCod, P0A955_n252CliCod, P0A955_A279CliNom, P0A955_A503GruOpeCod, P0A955_A3612HisProReo, P0A955_A867ParCodNom, P0A955_n867ParCodNom, P0A955_A656ParCod, P0A955_n656ParCod, P0A955_A5608HisProDf,
            P0A955_A3611HisProTc, P0A955_A2247HisProTip, P0A955_A217BarTipArt, P0A955_n217BarTipArt, P0A955_A136BarColNum, P0A955_A135BarColNom, P0A955_A212BarSer, P0A955_A4441HisProDTF, P0A955_n4441HisProDTF, P0A955_A4440HisProDTI,
            P0A955_n4440HisProDTI, P0A955_A557HisProF, P0A955_A566HisProTur, P0A955_A1526HisProMtr, P0A955_A1525HisProKgr, P0A955_A558HisProFec, P0A955_A602MaqCod, P0A955_A130BarCodPar, P0A955_A132BarCodReo, P0A955_A129BarCod,
            P0A955_A461Fase, P0A955_A396EmprCod, P0A955_A561HisProLin
            }
            , new Object[] {
            P0A956_A252CliCod, P0A956_n252CliCod, P0A956_A212BarSer, P0A956_A503GruOpeCod, P0A956_A3612HisProReo, P0A956_A867ParCodNom, P0A956_n867ParCodNom, P0A956_A656ParCod, P0A956_n656ParCod, P0A956_A5608HisProDf,
            P0A956_A3611HisProTc, P0A956_A2247HisProTip, P0A956_A217BarTipArt, P0A956_n217BarTipArt, P0A956_A136BarColNum, P0A956_A135BarColNom, P0A956_A279CliNom, P0A956_A4441HisProDTF, P0A956_n4441HisProDTF, P0A956_A4440HisProDTI,
            P0A956_n4440HisProDTI, P0A956_A557HisProF, P0A956_A566HisProTur, P0A956_A1526HisProMtr, P0A956_A1525HisProKgr, P0A956_A558HisProFec, P0A956_A602MaqCod, P0A956_A130BarCodPar, P0A956_A132BarCodReo, P0A956_A129BarCod,
            P0A956_A461Fase, P0A956_A396EmprCod, P0A956_A561HisProLin
            }
            , new Object[] {
            P0A957_A252CliCod, P0A957_n252CliCod, P0A957_A135BarColNom, P0A957_A503GruOpeCod, P0A957_A3612HisProReo, P0A957_A867ParCodNom, P0A957_n867ParCodNom, P0A957_A656ParCod, P0A957_n656ParCod, P0A957_A5608HisProDf,
            P0A957_A3611HisProTc, P0A957_A2247HisProTip, P0A957_A217BarTipArt, P0A957_n217BarTipArt, P0A957_A136BarColNum, P0A957_A212BarSer, P0A957_A279CliNom, P0A957_A4441HisProDTF, P0A957_n4441HisProDTF, P0A957_A4440HisProDTI,
            P0A957_n4440HisProDTI, P0A957_A557HisProF, P0A957_A566HisProTur, P0A957_A1526HisProMtr, P0A957_A1525HisProKgr, P0A957_A558HisProFec, P0A957_A602MaqCod, P0A957_A130BarCodPar, P0A957_A132BarCodReo, P0A957_A129BarCod,
            P0A957_A461Fase, P0A957_A396EmprCod, P0A957_A561HisProLin
            }
            , new Object[] {
            P0A958_A252CliCod, P0A958_n252CliCod, P0A958_A503GruOpeCod, P0A958_A3612HisProReo, P0A958_A867ParCodNom, P0A958_n867ParCodNom, P0A958_A656ParCod, P0A958_n656ParCod, P0A958_A5608HisProDf, P0A958_A3611HisProTc,
            P0A958_A2247HisProTip, P0A958_A217BarTipArt, P0A958_n217BarTipArt, P0A958_A136BarColNum, P0A958_A135BarColNom, P0A958_A212BarSer, P0A958_A279CliNom, P0A958_A4441HisProDTF, P0A958_n4441HisProDTF, P0A958_A4440HisProDTI,
            P0A958_n4440HisProDTI, P0A958_A557HisProF, P0A958_A566HisProTur, P0A958_A1526HisProMtr, P0A958_A1525HisProKgr, P0A958_A558HisProFec, P0A958_A602MaqCod, P0A958_A130BarCodPar, P0A958_A132BarCodReo, P0A958_A129BarCod,
            P0A958_A461Fase, P0A958_A396EmprCod, P0A958_A561HisProLin
            }
            , new Object[] {
            P0A959_A252CliCod, P0A959_n252CliCod, P0A959_A503GruOpeCod, P0A959_A3612HisProReo, P0A959_A867ParCodNom, P0A959_n867ParCodNom, P0A959_A656ParCod, P0A959_n656ParCod, P0A959_A5608HisProDf, P0A959_A3611HisProTc,
            P0A959_A2247HisProTip, P0A959_A217BarTipArt, P0A959_n217BarTipArt, P0A959_A136BarColNum, P0A959_A135BarColNom, P0A959_A212BarSer, P0A959_A279CliNom, P0A959_A4441HisProDTF, P0A959_n4441HisProDTF, P0A959_A4440HisProDTI,
            P0A959_n4440HisProDTI, P0A959_A557HisProF, P0A959_A566HisProTur, P0A959_A1526HisProMtr, P0A959_A1525HisProKgr, P0A959_A558HisProFec, P0A959_A602MaqCod, P0A959_A130BarCodPar, P0A959_A132BarCodReo, P0A959_A129BarCod,
            P0A959_A461Fase, P0A959_A396EmprCod, P0A959_A561HisProLin
            }
            , new Object[] {
            P0A9510_A252CliCod, P0A9510_n252CliCod, P0A9510_A867ParCodNom, P0A9510_n867ParCodNom, P0A9510_A503GruOpeCod, P0A9510_A3612HisProReo, P0A9510_A656ParCod, P0A9510_n656ParCod, P0A9510_A5608HisProDf, P0A9510_A3611HisProTc,
            P0A9510_A2247HisProTip, P0A9510_A217BarTipArt, P0A9510_n217BarTipArt, P0A9510_A136BarColNum, P0A9510_A135BarColNom, P0A9510_A212BarSer, P0A9510_A279CliNom, P0A9510_A4441HisProDTF, P0A9510_n4441HisProDTF, P0A9510_A4440HisProDTI,
            P0A9510_n4440HisProDTI, P0A9510_A557HisProF, P0A9510_A566HisProTur, P0A9510_A1526HisProMtr, P0A9510_A1525HisProKgr, P0A9510_A558HisProFec, P0A9510_A602MaqCod, P0A9510_A130BarCodPar, P0A9510_A132BarCodReo, P0A9510_A129BarCod,
            P0A9510_A461Fase, P0A9510_A396EmprCod, P0A9510_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV43TFHisProTur ;
   private byte AV44TFHisProTur_To ;
   private byte AV67TFHisProTc ;
   private byte AV68TFHisProTc_To ;
   private byte AV31INHisEstReo ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte A3611HisProTc ;
   private byte A3612HisProReo ;
   private short AV63TFBarTipArt ;
   private short AV64TFBarTipArt_To ;
   private short AV65TFHisProTip ;
   private short AV66TFHisProTip_To ;
   private short AV70TFParCod ;
   private short AV71TFParCod_To ;
   private short A217BarTipArt ;
   private short A2247HisProTip ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV78GXV1 ;
   private int AV55TFBarColNum ;
   private int AV56TFBarColNum_To ;
   private int AV74OperarioFrom ;
   private int AV75OperarioTo ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
   private int AV12InsertIndex ;
   private long AV18count ;
   private java.math.BigDecimal AV39TFHisProKgr ;
   private java.math.BigDecimal AV40TFHisProKgr_To ;
   private java.math.BigDecimal AV41TFHisProMtr ;
   private java.math.BigDecimal AV42TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV36TFBarNHdr ;
   private String AV37TFBarNHdr_Sel ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV45TFHisProF ;
   private String AV46TFHisProF_Sel ;
   private String AV49TFCliNom ;
   private String AV50TFCliNom_Sel ;
   private String AV51TFBarSer ;
   private String AV52TFBarSer_Sel ;
   private String AV53TFBarColNom ;
   private String AV54TFBarColNom_Sel ;
   private String AV59TFFase ;
   private String AV60TFFase_Sel ;
   private String AV61TFFaseDescripcion ;
   private String AV62TFFaseDescripcion_Sel ;
   private String AV72TFParCodNom ;
   private String AV73TFParCodNom_Sel ;
   private String AV30INEmprcod ;
   private String AV32INMaqCod1 ;
   private String AV33INMaqCod2 ;
   private String scmdbuf ;
   private String lV36TFBarNHdr ;
   private String lV10TFMaqCod ;
   private String lV45TFHisProF ;
   private String lV49TFCliNom ;
   private String lV51TFBarSer ;
   private String lV53TFBarColNom ;
   private String lV59TFFase ;
   private String lV72TFParCodNom ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String A557HisProF ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A461Fase ;
   private String A867ParCodNom ;
   private String A13893FaseDescri ;
   private String A396EmprCod ;
   private String A13696BarNHdr ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV47TFHisProDTI ;
   private java.util.Date AV48TFHisProDTF ;
   private java.util.Date AV34INHisProFec1 ;
   private java.util.Date AV35INHisProFec2 ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV38TFHisProFec ;
   private java.util.Date AV69TFHisProDf ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A5608HisProDf ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n867ParCodNom ;
   private boolean n656ParCod ;
   private boolean n217BarTipArt ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean brkA953 ;
   private boolean brkA955 ;
   private boolean brkA957 ;
   private boolean brkA959 ;
   private boolean brkA9511 ;
   private boolean brkA9513 ;
   private boolean brkA9516 ;
   private String AV27OptionsJson ;
   private String AV28OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV25SearchTxt ;
   private String AV26SearchTxtTo ;
   private String AV13Option ;
   private String AV15OptionDesc ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0A952_A252CliCod ;
   private boolean[] P0A952_n252CliCod ;
   private int[] P0A952_A503GruOpeCod ;
   private byte[] P0A952_A3612HisProReo ;
   private String[] P0A952_A867ParCodNom ;
   private boolean[] P0A952_n867ParCodNom ;
   private short[] P0A952_A656ParCod ;
   private boolean[] P0A952_n656ParCod ;
   private java.util.Date[] P0A952_A5608HisProDf ;
   private byte[] P0A952_A3611HisProTc ;
   private short[] P0A952_A2247HisProTip ;
   private short[] P0A952_A217BarTipArt ;
   private boolean[] P0A952_n217BarTipArt ;
   private int[] P0A952_A136BarColNum ;
   private String[] P0A952_A135BarColNom ;
   private String[] P0A952_A212BarSer ;
   private String[] P0A952_A279CliNom ;
   private java.util.Date[] P0A952_A4441HisProDTF ;
   private boolean[] P0A952_n4441HisProDTF ;
   private java.util.Date[] P0A952_A4440HisProDTI ;
   private boolean[] P0A952_n4440HisProDTI ;
   private String[] P0A952_A557HisProF ;
   private byte[] P0A952_A566HisProTur ;
   private java.math.BigDecimal[] P0A952_A1526HisProMtr ;
   private java.math.BigDecimal[] P0A952_A1525HisProKgr ;
   private java.util.Date[] P0A952_A558HisProFec ;
   private String[] P0A952_A602MaqCod ;
   private String[] P0A952_A130BarCodPar ;
   private byte[] P0A952_A132BarCodReo ;
   private int[] P0A952_A129BarCod ;
   private String[] P0A952_A461Fase ;
   private String[] P0A952_A396EmprCod ;
   private int[] P0A952_A561HisProLin ;
   private int[] P0A953_A252CliCod ;
   private boolean[] P0A953_n252CliCod ;
   private String[] P0A953_A602MaqCod ;
   private int[] P0A953_A503GruOpeCod ;
   private byte[] P0A953_A3612HisProReo ;
   private String[] P0A953_A867ParCodNom ;
   private boolean[] P0A953_n867ParCodNom ;
   private short[] P0A953_A656ParCod ;
   private boolean[] P0A953_n656ParCod ;
   private java.util.Date[] P0A953_A5608HisProDf ;
   private byte[] P0A953_A3611HisProTc ;
   private short[] P0A953_A2247HisProTip ;
   private short[] P0A953_A217BarTipArt ;
   private boolean[] P0A953_n217BarTipArt ;
   private int[] P0A953_A136BarColNum ;
   private String[] P0A953_A135BarColNom ;
   private String[] P0A953_A212BarSer ;
   private String[] P0A953_A279CliNom ;
   private java.util.Date[] P0A953_A4441HisProDTF ;
   private boolean[] P0A953_n4441HisProDTF ;
   private java.util.Date[] P0A953_A4440HisProDTI ;
   private boolean[] P0A953_n4440HisProDTI ;
   private String[] P0A953_A557HisProF ;
   private byte[] P0A953_A566HisProTur ;
   private java.math.BigDecimal[] P0A953_A1526HisProMtr ;
   private java.math.BigDecimal[] P0A953_A1525HisProKgr ;
   private java.util.Date[] P0A953_A558HisProFec ;
   private String[] P0A953_A130BarCodPar ;
   private byte[] P0A953_A132BarCodReo ;
   private int[] P0A953_A129BarCod ;
   private String[] P0A953_A461Fase ;
   private String[] P0A953_A396EmprCod ;
   private int[] P0A953_A561HisProLin ;
   private int[] P0A954_A252CliCod ;
   private boolean[] P0A954_n252CliCod ;
   private String[] P0A954_A557HisProF ;
   private int[] P0A954_A503GruOpeCod ;
   private byte[] P0A954_A3612HisProReo ;
   private String[] P0A954_A867ParCodNom ;
   private boolean[] P0A954_n867ParCodNom ;
   private short[] P0A954_A656ParCod ;
   private boolean[] P0A954_n656ParCod ;
   private java.util.Date[] P0A954_A5608HisProDf ;
   private byte[] P0A954_A3611HisProTc ;
   private short[] P0A954_A2247HisProTip ;
   private short[] P0A954_A217BarTipArt ;
   private boolean[] P0A954_n217BarTipArt ;
   private int[] P0A954_A136BarColNum ;
   private String[] P0A954_A135BarColNom ;
   private String[] P0A954_A212BarSer ;
   private String[] P0A954_A279CliNom ;
   private java.util.Date[] P0A954_A4441HisProDTF ;
   private boolean[] P0A954_n4441HisProDTF ;
   private java.util.Date[] P0A954_A4440HisProDTI ;
   private boolean[] P0A954_n4440HisProDTI ;
   private byte[] P0A954_A566HisProTur ;
   private java.math.BigDecimal[] P0A954_A1526HisProMtr ;
   private java.math.BigDecimal[] P0A954_A1525HisProKgr ;
   private java.util.Date[] P0A954_A558HisProFec ;
   private String[] P0A954_A602MaqCod ;
   private String[] P0A954_A130BarCodPar ;
   private byte[] P0A954_A132BarCodReo ;
   private int[] P0A954_A129BarCod ;
   private String[] P0A954_A461Fase ;
   private String[] P0A954_A396EmprCod ;
   private int[] P0A954_A561HisProLin ;
   private int[] P0A955_A252CliCod ;
   private boolean[] P0A955_n252CliCod ;
   private String[] P0A955_A279CliNom ;
   private int[] P0A955_A503GruOpeCod ;
   private byte[] P0A955_A3612HisProReo ;
   private String[] P0A955_A867ParCodNom ;
   private boolean[] P0A955_n867ParCodNom ;
   private short[] P0A955_A656ParCod ;
   private boolean[] P0A955_n656ParCod ;
   private java.util.Date[] P0A955_A5608HisProDf ;
   private byte[] P0A955_A3611HisProTc ;
   private short[] P0A955_A2247HisProTip ;
   private short[] P0A955_A217BarTipArt ;
   private boolean[] P0A955_n217BarTipArt ;
   private int[] P0A955_A136BarColNum ;
   private String[] P0A955_A135BarColNom ;
   private String[] P0A955_A212BarSer ;
   private java.util.Date[] P0A955_A4441HisProDTF ;
   private boolean[] P0A955_n4441HisProDTF ;
   private java.util.Date[] P0A955_A4440HisProDTI ;
   private boolean[] P0A955_n4440HisProDTI ;
   private String[] P0A955_A557HisProF ;
   private byte[] P0A955_A566HisProTur ;
   private java.math.BigDecimal[] P0A955_A1526HisProMtr ;
   private java.math.BigDecimal[] P0A955_A1525HisProKgr ;
   private java.util.Date[] P0A955_A558HisProFec ;
   private String[] P0A955_A602MaqCod ;
   private String[] P0A955_A130BarCodPar ;
   private byte[] P0A955_A132BarCodReo ;
   private int[] P0A955_A129BarCod ;
   private String[] P0A955_A461Fase ;
   private String[] P0A955_A396EmprCod ;
   private int[] P0A955_A561HisProLin ;
   private int[] P0A956_A252CliCod ;
   private boolean[] P0A956_n252CliCod ;
   private String[] P0A956_A212BarSer ;
   private int[] P0A956_A503GruOpeCod ;
   private byte[] P0A956_A3612HisProReo ;
   private String[] P0A956_A867ParCodNom ;
   private boolean[] P0A956_n867ParCodNom ;
   private short[] P0A956_A656ParCod ;
   private boolean[] P0A956_n656ParCod ;
   private java.util.Date[] P0A956_A5608HisProDf ;
   private byte[] P0A956_A3611HisProTc ;
   private short[] P0A956_A2247HisProTip ;
   private short[] P0A956_A217BarTipArt ;
   private boolean[] P0A956_n217BarTipArt ;
   private int[] P0A956_A136BarColNum ;
   private String[] P0A956_A135BarColNom ;
   private String[] P0A956_A279CliNom ;
   private java.util.Date[] P0A956_A4441HisProDTF ;
   private boolean[] P0A956_n4441HisProDTF ;
   private java.util.Date[] P0A956_A4440HisProDTI ;
   private boolean[] P0A956_n4440HisProDTI ;
   private String[] P0A956_A557HisProF ;
   private byte[] P0A956_A566HisProTur ;
   private java.math.BigDecimal[] P0A956_A1526HisProMtr ;
   private java.math.BigDecimal[] P0A956_A1525HisProKgr ;
   private java.util.Date[] P0A956_A558HisProFec ;
   private String[] P0A956_A602MaqCod ;
   private String[] P0A956_A130BarCodPar ;
   private byte[] P0A956_A132BarCodReo ;
   private int[] P0A956_A129BarCod ;
   private String[] P0A956_A461Fase ;
   private String[] P0A956_A396EmprCod ;
   private int[] P0A956_A561HisProLin ;
   private int[] P0A957_A252CliCod ;
   private boolean[] P0A957_n252CliCod ;
   private String[] P0A957_A135BarColNom ;
   private int[] P0A957_A503GruOpeCod ;
   private byte[] P0A957_A3612HisProReo ;
   private String[] P0A957_A867ParCodNom ;
   private boolean[] P0A957_n867ParCodNom ;
   private short[] P0A957_A656ParCod ;
   private boolean[] P0A957_n656ParCod ;
   private java.util.Date[] P0A957_A5608HisProDf ;
   private byte[] P0A957_A3611HisProTc ;
   private short[] P0A957_A2247HisProTip ;
   private short[] P0A957_A217BarTipArt ;
   private boolean[] P0A957_n217BarTipArt ;
   private int[] P0A957_A136BarColNum ;
   private String[] P0A957_A212BarSer ;
   private String[] P0A957_A279CliNom ;
   private java.util.Date[] P0A957_A4441HisProDTF ;
   private boolean[] P0A957_n4441HisProDTF ;
   private java.util.Date[] P0A957_A4440HisProDTI ;
   private boolean[] P0A957_n4440HisProDTI ;
   private String[] P0A957_A557HisProF ;
   private byte[] P0A957_A566HisProTur ;
   private java.math.BigDecimal[] P0A957_A1526HisProMtr ;
   private java.math.BigDecimal[] P0A957_A1525HisProKgr ;
   private java.util.Date[] P0A957_A558HisProFec ;
   private String[] P0A957_A602MaqCod ;
   private String[] P0A957_A130BarCodPar ;
   private byte[] P0A957_A132BarCodReo ;
   private int[] P0A957_A129BarCod ;
   private String[] P0A957_A461Fase ;
   private String[] P0A957_A396EmprCod ;
   private int[] P0A957_A561HisProLin ;
   private int[] P0A958_A252CliCod ;
   private boolean[] P0A958_n252CliCod ;
   private int[] P0A958_A503GruOpeCod ;
   private byte[] P0A958_A3612HisProReo ;
   private String[] P0A958_A867ParCodNom ;
   private boolean[] P0A958_n867ParCodNom ;
   private short[] P0A958_A656ParCod ;
   private boolean[] P0A958_n656ParCod ;
   private java.util.Date[] P0A958_A5608HisProDf ;
   private byte[] P0A958_A3611HisProTc ;
   private short[] P0A958_A2247HisProTip ;
   private short[] P0A958_A217BarTipArt ;
   private boolean[] P0A958_n217BarTipArt ;
   private int[] P0A958_A136BarColNum ;
   private String[] P0A958_A135BarColNom ;
   private String[] P0A958_A212BarSer ;
   private String[] P0A958_A279CliNom ;
   private java.util.Date[] P0A958_A4441HisProDTF ;
   private boolean[] P0A958_n4441HisProDTF ;
   private java.util.Date[] P0A958_A4440HisProDTI ;
   private boolean[] P0A958_n4440HisProDTI ;
   private String[] P0A958_A557HisProF ;
   private byte[] P0A958_A566HisProTur ;
   private java.math.BigDecimal[] P0A958_A1526HisProMtr ;
   private java.math.BigDecimal[] P0A958_A1525HisProKgr ;
   private java.util.Date[] P0A958_A558HisProFec ;
   private String[] P0A958_A602MaqCod ;
   private String[] P0A958_A130BarCodPar ;
   private byte[] P0A958_A132BarCodReo ;
   private int[] P0A958_A129BarCod ;
   private String[] P0A958_A461Fase ;
   private String[] P0A958_A396EmprCod ;
   private int[] P0A958_A561HisProLin ;
   private int[] P0A959_A252CliCod ;
   private boolean[] P0A959_n252CliCod ;
   private int[] P0A959_A503GruOpeCod ;
   private byte[] P0A959_A3612HisProReo ;
   private String[] P0A959_A867ParCodNom ;
   private boolean[] P0A959_n867ParCodNom ;
   private short[] P0A959_A656ParCod ;
   private boolean[] P0A959_n656ParCod ;
   private java.util.Date[] P0A959_A5608HisProDf ;
   private byte[] P0A959_A3611HisProTc ;
   private short[] P0A959_A2247HisProTip ;
   private short[] P0A959_A217BarTipArt ;
   private boolean[] P0A959_n217BarTipArt ;
   private int[] P0A959_A136BarColNum ;
   private String[] P0A959_A135BarColNom ;
   private String[] P0A959_A212BarSer ;
   private String[] P0A959_A279CliNom ;
   private java.util.Date[] P0A959_A4441HisProDTF ;
   private boolean[] P0A959_n4441HisProDTF ;
   private java.util.Date[] P0A959_A4440HisProDTI ;
   private boolean[] P0A959_n4440HisProDTI ;
   private String[] P0A959_A557HisProF ;
   private byte[] P0A959_A566HisProTur ;
   private java.math.BigDecimal[] P0A959_A1526HisProMtr ;
   private java.math.BigDecimal[] P0A959_A1525HisProKgr ;
   private java.util.Date[] P0A959_A558HisProFec ;
   private String[] P0A959_A602MaqCod ;
   private String[] P0A959_A130BarCodPar ;
   private byte[] P0A959_A132BarCodReo ;
   private int[] P0A959_A129BarCod ;
   private String[] P0A959_A461Fase ;
   private String[] P0A959_A396EmprCod ;
   private int[] P0A959_A561HisProLin ;
   private int[] P0A9510_A252CliCod ;
   private boolean[] P0A9510_n252CliCod ;
   private String[] P0A9510_A867ParCodNom ;
   private boolean[] P0A9510_n867ParCodNom ;
   private int[] P0A9510_A503GruOpeCod ;
   private byte[] P0A9510_A3612HisProReo ;
   private short[] P0A9510_A656ParCod ;
   private boolean[] P0A9510_n656ParCod ;
   private java.util.Date[] P0A9510_A5608HisProDf ;
   private byte[] P0A9510_A3611HisProTc ;
   private short[] P0A9510_A2247HisProTip ;
   private short[] P0A9510_A217BarTipArt ;
   private boolean[] P0A9510_n217BarTipArt ;
   private int[] P0A9510_A136BarColNum ;
   private String[] P0A9510_A135BarColNom ;
   private String[] P0A9510_A212BarSer ;
   private String[] P0A9510_A279CliNom ;
   private java.util.Date[] P0A9510_A4441HisProDTF ;
   private boolean[] P0A9510_n4441HisProDTF ;
   private java.util.Date[] P0A9510_A4440HisProDTI ;
   private boolean[] P0A9510_n4440HisProDTI ;
   private String[] P0A9510_A557HisProF ;
   private byte[] P0A9510_A566HisProTur ;
   private java.math.BigDecimal[] P0A9510_A1526HisProMtr ;
   private java.math.BigDecimal[] P0A9510_A1525HisProKgr ;
   private java.util.Date[] P0A9510_A558HisProFec ;
   private String[] P0A9510_A602MaqCod ;
   private String[] P0A9510_A130BarCodPar ;
   private byte[] P0A9510_A132BarCodReo ;
   private int[] P0A9510_A129BarCod ;
   private String[] P0A9510_A461Fase ;
   private String[] P0A9510_A396EmprCod ;
   private int[] P0A9510_A561HisProLin ;
   private GXSimpleCollection<String> AV14Options ;
   private GXSimpleCollection<String> AV16OptionsDesc ;
   private GXSimpleCollection<String> AV17OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class informeproduccionresumenhdr_wc1getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A952( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37TFBarNHdr_Sel ,
                                          String AV36TFBarNHdr ,
                                          String AV11TFMaqCod_Sel ,
                                          String AV10TFMaqCod ,
                                          java.util.Date AV38TFHisProFec ,
                                          java.math.BigDecimal AV39TFHisProKgr ,
                                          java.math.BigDecimal AV40TFHisProKgr_To ,
                                          java.math.BigDecimal AV41TFHisProMtr ,
                                          java.math.BigDecimal AV42TFHisProMtr_To ,
                                          byte AV43TFHisProTur ,
                                          byte AV44TFHisProTur_To ,
                                          String AV46TFHisProF_Sel ,
                                          String AV45TFHisProF ,
                                          java.util.Date AV47TFHisProDTI ,
                                          java.util.Date AV48TFHisProDTF ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarColNom_Sel ,
                                          String AV53TFBarColNom ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          String AV60TFFase_Sel ,
                                          String AV59TFFase ,
                                          short AV63TFBarTipArt ,
                                          short AV64TFBarTipArt_To ,
                                          short AV65TFHisProTip ,
                                          short AV66TFHisProTip_To ,
                                          byte AV67TFHisProTc ,
                                          byte AV68TFHisProTc_To ,
                                          java.util.Date AV69TFHisProDf ,
                                          short AV70TFParCod ,
                                          short AV71TFParCod_To ,
                                          String AV73TFParCodNom_Sel ,
                                          String AV72TFParCodNom ,
                                          byte AV31INHisEstReo ,
                                          int AV74OperarioFrom ,
                                          int AV75OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          String AV62TFFaseDescripcion_Sel ,
                                          String AV61TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          java.util.Date AV34INHisProFec1 ,
                                          java.util.Date AV35INHisProFec2 ,
                                          String AV30INEmprcod ,
                                          String AV32INMaqCod1 ,
                                          String A396EmprCod ,
                                          String AV33INMaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[44];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T1.GruOpeCod, T1.HisProReo, T4.ParCodNom, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom, T2.BarSer," ;
      scmdbuf += " T3.CliNom, T1.HisProDTF, T1.HisProDTI, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase," ;
      scmdbuf += " T1.EmprCod, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV43TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV44TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV65TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV66TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV67TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV68TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (0==AV70TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV71TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! ( AV31INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (0==AV74OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (0==AV75OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A953( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37TFBarNHdr_Sel ,
                                          String AV36TFBarNHdr ,
                                          String AV11TFMaqCod_Sel ,
                                          String AV10TFMaqCod ,
                                          java.util.Date AV38TFHisProFec ,
                                          java.math.BigDecimal AV39TFHisProKgr ,
                                          java.math.BigDecimal AV40TFHisProKgr_To ,
                                          java.math.BigDecimal AV41TFHisProMtr ,
                                          java.math.BigDecimal AV42TFHisProMtr_To ,
                                          byte AV43TFHisProTur ,
                                          byte AV44TFHisProTur_To ,
                                          String AV46TFHisProF_Sel ,
                                          String AV45TFHisProF ,
                                          java.util.Date AV47TFHisProDTI ,
                                          java.util.Date AV48TFHisProDTF ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarColNom_Sel ,
                                          String AV53TFBarColNom ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          String AV60TFFase_Sel ,
                                          String AV59TFFase ,
                                          short AV63TFBarTipArt ,
                                          short AV64TFBarTipArt_To ,
                                          short AV65TFHisProTip ,
                                          short AV66TFHisProTip_To ,
                                          byte AV67TFHisProTc ,
                                          byte AV68TFHisProTc_To ,
                                          java.util.Date AV69TFHisProDf ,
                                          short AV70TFParCod ,
                                          short AV71TFParCod_To ,
                                          String AV73TFParCodNom_Sel ,
                                          String AV72TFParCodNom ,
                                          byte AV31INHisEstReo ,
                                          int AV74OperarioFrom ,
                                          int AV75OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          String AV62TFFaseDescripcion_Sel ,
                                          String AV61TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          java.util.Date AV34INHisProFec1 ,
                                          java.util.Date AV35INHisProFec2 ,
                                          String AV30INEmprcod ,
                                          String AV32INMaqCod1 ,
                                          String A396EmprCod ,
                                          String AV33INMaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[44];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T1.MaqCod, T1.GruOpeCod, T1.HisProReo, T4.ParCodNom, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSer, T3.CliNom, T1.HisProDTF, T1.HisProDTI, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase," ;
      scmdbuf += " T1.EmprCod, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV43TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV44TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV65TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV66TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV67TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV68TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV70TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV71TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! ( AV31INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (0==AV74OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (0==AV75OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0A954( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37TFBarNHdr_Sel ,
                                          String AV36TFBarNHdr ,
                                          String AV11TFMaqCod_Sel ,
                                          String AV10TFMaqCod ,
                                          java.util.Date AV38TFHisProFec ,
                                          java.math.BigDecimal AV39TFHisProKgr ,
                                          java.math.BigDecimal AV40TFHisProKgr_To ,
                                          java.math.BigDecimal AV41TFHisProMtr ,
                                          java.math.BigDecimal AV42TFHisProMtr_To ,
                                          byte AV43TFHisProTur ,
                                          byte AV44TFHisProTur_To ,
                                          String AV46TFHisProF_Sel ,
                                          String AV45TFHisProF ,
                                          java.util.Date AV47TFHisProDTI ,
                                          java.util.Date AV48TFHisProDTF ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarColNom_Sel ,
                                          String AV53TFBarColNom ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          String AV60TFFase_Sel ,
                                          String AV59TFFase ,
                                          short AV63TFBarTipArt ,
                                          short AV64TFBarTipArt_To ,
                                          short AV65TFHisProTip ,
                                          short AV66TFHisProTip_To ,
                                          byte AV67TFHisProTc ,
                                          byte AV68TFHisProTc_To ,
                                          java.util.Date AV69TFHisProDf ,
                                          short AV70TFParCod ,
                                          short AV71TFParCod_To ,
                                          String AV73TFParCodNom_Sel ,
                                          String AV72TFParCodNom ,
                                          byte AV31INHisEstReo ,
                                          int AV74OperarioFrom ,
                                          int AV75OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          String AV62TFFaseDescripcion_Sel ,
                                          String AV61TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          String AV32INMaqCod1 ,
                                          String AV33INMaqCod2 ,
                                          java.util.Date AV34INHisProFec1 ,
                                          java.util.Date AV35INHisProFec2 ,
                                          String A396EmprCod ,
                                          String AV30INEmprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[44];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T1.HisProF, T1.GruOpeCod, T1.HisProReo, T4.ParCodNom, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSer, T3.CliNom, T1.HisProDTF, T1.HisProDTI, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase," ;
      scmdbuf += " T1.EmprCod, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV43TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV44TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV65TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV66TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV67TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV68TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV70TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV71TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! ( AV31INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV74OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (0==AV75OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HisProF" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A955( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37TFBarNHdr_Sel ,
                                          String AV36TFBarNHdr ,
                                          String AV11TFMaqCod_Sel ,
                                          String AV10TFMaqCod ,
                                          java.util.Date AV38TFHisProFec ,
                                          java.math.BigDecimal AV39TFHisProKgr ,
                                          java.math.BigDecimal AV40TFHisProKgr_To ,
                                          java.math.BigDecimal AV41TFHisProMtr ,
                                          java.math.BigDecimal AV42TFHisProMtr_To ,
                                          byte AV43TFHisProTur ,
                                          byte AV44TFHisProTur_To ,
                                          String AV46TFHisProF_Sel ,
                                          String AV45TFHisProF ,
                                          java.util.Date AV47TFHisProDTI ,
                                          java.util.Date AV48TFHisProDTF ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarColNom_Sel ,
                                          String AV53TFBarColNom ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          String AV60TFFase_Sel ,
                                          String AV59TFFase ,
                                          short AV63TFBarTipArt ,
                                          short AV64TFBarTipArt_To ,
                                          short AV65TFHisProTip ,
                                          short AV66TFHisProTip_To ,
                                          byte AV67TFHisProTc ,
                                          byte AV68TFHisProTc_To ,
                                          java.util.Date AV69TFHisProDf ,
                                          short AV70TFParCod ,
                                          short AV71TFParCod_To ,
                                          String AV73TFParCodNom_Sel ,
                                          String AV72TFParCodNom ,
                                          byte AV31INHisEstReo ,
                                          int AV74OperarioFrom ,
                                          int AV75OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          String AV62TFFaseDescripcion_Sel ,
                                          String AV61TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          String AV32INMaqCod1 ,
                                          String AV33INMaqCod2 ,
                                          java.util.Date AV34INHisProFec1 ,
                                          java.util.Date AV35INHisProFec2 ,
                                          String A396EmprCod ,
                                          String AV30INEmprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[44];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T3.CliNom, T1.GruOpeCod, T1.HisProReo, T4.ParCodNom, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSer, T1.HisProDTF, T1.HisProDTI, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase," ;
      scmdbuf += " T1.EmprCod, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV43TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV44TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV65TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV66TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV67TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (0==AV68TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV70TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV71TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! ( AV31INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (0==AV74OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (0==AV75OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0A956( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37TFBarNHdr_Sel ,
                                          String AV36TFBarNHdr ,
                                          String AV11TFMaqCod_Sel ,
                                          String AV10TFMaqCod ,
                                          java.util.Date AV38TFHisProFec ,
                                          java.math.BigDecimal AV39TFHisProKgr ,
                                          java.math.BigDecimal AV40TFHisProKgr_To ,
                                          java.math.BigDecimal AV41TFHisProMtr ,
                                          java.math.BigDecimal AV42TFHisProMtr_To ,
                                          byte AV43TFHisProTur ,
                                          byte AV44TFHisProTur_To ,
                                          String AV46TFHisProF_Sel ,
                                          String AV45TFHisProF ,
                                          java.util.Date AV47TFHisProDTI ,
                                          java.util.Date AV48TFHisProDTF ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarColNom_Sel ,
                                          String AV53TFBarColNom ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          String AV60TFFase_Sel ,
                                          String AV59TFFase ,
                                          short AV63TFBarTipArt ,
                                          short AV64TFBarTipArt_To ,
                                          short AV65TFHisProTip ,
                                          short AV66TFHisProTip_To ,
                                          byte AV67TFHisProTc ,
                                          byte AV68TFHisProTc_To ,
                                          java.util.Date AV69TFHisProDf ,
                                          short AV70TFParCod ,
                                          short AV71TFParCod_To ,
                                          String AV73TFParCodNom_Sel ,
                                          String AV72TFParCodNom ,
                                          byte AV31INHisEstReo ,
                                          int AV74OperarioFrom ,
                                          int AV75OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          String AV62TFFaseDescripcion_Sel ,
                                          String AV61TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          String AV32INMaqCod1 ,
                                          String AV33INMaqCod2 ,
                                          java.util.Date AV34INHisProFec1 ,
                                          java.util.Date AV35INHisProFec2 ,
                                          String A396EmprCod ,
                                          String AV30INEmprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[44];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T2.BarSer, T1.GruOpeCod, T1.HisProReo, T4.ParCodNom, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T3.CliNom, T1.HisProDTF, T1.HisProDTI, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase," ;
      scmdbuf += " T1.EmprCod, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV43TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV44TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV65TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV66TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV67TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (0==AV68TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (0==AV70TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (0==AV71TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! ( AV31INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (0==AV74OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (0==AV75OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0A957( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37TFBarNHdr_Sel ,
                                          String AV36TFBarNHdr ,
                                          String AV11TFMaqCod_Sel ,
                                          String AV10TFMaqCod ,
                                          java.util.Date AV38TFHisProFec ,
                                          java.math.BigDecimal AV39TFHisProKgr ,
                                          java.math.BigDecimal AV40TFHisProKgr_To ,
                                          java.math.BigDecimal AV41TFHisProMtr ,
                                          java.math.BigDecimal AV42TFHisProMtr_To ,
                                          byte AV43TFHisProTur ,
                                          byte AV44TFHisProTur_To ,
                                          String AV46TFHisProF_Sel ,
                                          String AV45TFHisProF ,
                                          java.util.Date AV47TFHisProDTI ,
                                          java.util.Date AV48TFHisProDTF ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarColNom_Sel ,
                                          String AV53TFBarColNom ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          String AV60TFFase_Sel ,
                                          String AV59TFFase ,
                                          short AV63TFBarTipArt ,
                                          short AV64TFBarTipArt_To ,
                                          short AV65TFHisProTip ,
                                          short AV66TFHisProTip_To ,
                                          byte AV67TFHisProTc ,
                                          byte AV68TFHisProTc_To ,
                                          java.util.Date AV69TFHisProDf ,
                                          short AV70TFParCod ,
                                          short AV71TFParCod_To ,
                                          String AV73TFParCodNom_Sel ,
                                          String AV72TFParCodNom ,
                                          byte AV31INHisEstReo ,
                                          int AV74OperarioFrom ,
                                          int AV75OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          String AV62TFFaseDescripcion_Sel ,
                                          String AV61TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          String AV32INMaqCod1 ,
                                          String AV33INMaqCod2 ,
                                          java.util.Date AV34INHisProFec1 ,
                                          java.util.Date AV35INHisProFec2 ,
                                          String A396EmprCod ,
                                          String AV30INEmprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[44];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T2.BarColNom, T1.GruOpeCod, T1.HisProReo, T4.ParCodNom, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarSer," ;
      scmdbuf += " T3.CliNom, T1.HisProDTF, T1.HisProDTI, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase," ;
      scmdbuf += " T1.EmprCod, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV43TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV44TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV65TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV66TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV67TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV68TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV70TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV71TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! ( AV31INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (0==AV74OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (0==AV75OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0A958( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37TFBarNHdr_Sel ,
                                          String AV36TFBarNHdr ,
                                          String AV11TFMaqCod_Sel ,
                                          String AV10TFMaqCod ,
                                          java.util.Date AV38TFHisProFec ,
                                          java.math.BigDecimal AV39TFHisProKgr ,
                                          java.math.BigDecimal AV40TFHisProKgr_To ,
                                          java.math.BigDecimal AV41TFHisProMtr ,
                                          java.math.BigDecimal AV42TFHisProMtr_To ,
                                          byte AV43TFHisProTur ,
                                          byte AV44TFHisProTur_To ,
                                          String AV46TFHisProF_Sel ,
                                          String AV45TFHisProF ,
                                          java.util.Date AV47TFHisProDTI ,
                                          java.util.Date AV48TFHisProDTF ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarColNom_Sel ,
                                          String AV53TFBarColNom ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          String AV60TFFase_Sel ,
                                          String AV59TFFase ,
                                          short AV63TFBarTipArt ,
                                          short AV64TFBarTipArt_To ,
                                          short AV65TFHisProTip ,
                                          short AV66TFHisProTip_To ,
                                          byte AV67TFHisProTc ,
                                          byte AV68TFHisProTc_To ,
                                          java.util.Date AV69TFHisProDf ,
                                          short AV70TFParCod ,
                                          short AV71TFParCod_To ,
                                          String AV73TFParCodNom_Sel ,
                                          String AV72TFParCodNom ,
                                          byte AV31INHisEstReo ,
                                          int AV74OperarioFrom ,
                                          int AV75OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          String AV62TFFaseDescripcion_Sel ,
                                          String AV61TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          String AV32INMaqCod1 ,
                                          String AV33INMaqCod2 ,
                                          java.util.Date AV34INHisProFec1 ,
                                          java.util.Date AV35INHisProFec2 ,
                                          String AV30INEmprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[44];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T1.GruOpeCod, T1.HisProReo, T4.ParCodNom, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom, T2.BarSer," ;
      scmdbuf += " T3.CliNom, T1.HisProDTF, T1.HisProDTI, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase," ;
      scmdbuf += " T1.EmprCod, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      if ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (0==AV43TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (0==AV44TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (0==AV65TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (0==AV66TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV67TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (0==AV68TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (0==AV70TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (0==AV71TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! ( AV31INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (0==AV74OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (0==AV75OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Fase" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P0A959( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37TFBarNHdr_Sel ,
                                          String AV36TFBarNHdr ,
                                          String AV11TFMaqCod_Sel ,
                                          String AV10TFMaqCod ,
                                          java.util.Date AV38TFHisProFec ,
                                          java.math.BigDecimal AV39TFHisProKgr ,
                                          java.math.BigDecimal AV40TFHisProKgr_To ,
                                          java.math.BigDecimal AV41TFHisProMtr ,
                                          java.math.BigDecimal AV42TFHisProMtr_To ,
                                          byte AV43TFHisProTur ,
                                          byte AV44TFHisProTur_To ,
                                          String AV46TFHisProF_Sel ,
                                          String AV45TFHisProF ,
                                          java.util.Date AV47TFHisProDTI ,
                                          java.util.Date AV48TFHisProDTF ,
                                          String AV50TFCliNom_Sel ,
                                          String AV49TFCliNom ,
                                          String AV52TFBarSer_Sel ,
                                          String AV51TFBarSer ,
                                          String AV54TFBarColNom_Sel ,
                                          String AV53TFBarColNom ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          String AV60TFFase_Sel ,
                                          String AV59TFFase ,
                                          short AV63TFBarTipArt ,
                                          short AV64TFBarTipArt_To ,
                                          short AV65TFHisProTip ,
                                          short AV66TFHisProTip_To ,
                                          byte AV67TFHisProTc ,
                                          byte AV68TFHisProTc_To ,
                                          java.util.Date AV69TFHisProDf ,
                                          short AV70TFParCod ,
                                          short AV71TFParCod_To ,
                                          String AV73TFParCodNom_Sel ,
                                          String AV72TFParCodNom ,
                                          byte AV31INHisEstReo ,
                                          int AV74OperarioFrom ,
                                          int AV75OperarioTo ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A461Fase ,
                                          short A217BarTipArt ,
                                          short A2247HisProTip ,
                                          byte A3611HisProTc ,
                                          java.util.Date A5608HisProDf ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A3612HisProReo ,
                                          int A503GruOpeCod ,
                                          String AV62TFFaseDescripcion_Sel ,
                                          String AV61TFFaseDescripcion ,
                                          String A13893FaseDescri ,
                                          java.util.Date AV34INHisProFec1 ,
                                          java.util.Date AV35INHisProFec2 ,
                                          String AV30INEmprcod ,
                                          String AV32INMaqCod1 ,
                                          String A396EmprCod ,
                                          String AV33INMaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[44];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T1.GruOpeCod, T1.HisProReo, T4.ParCodNom, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom, T2.BarSer," ;
      scmdbuf += " T3.CliNom, T1.HisProDTF, T1.HisProDTI, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase," ;
      scmdbuf += " T1.EmprCod, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (0==AV43TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (0==AV44TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! (0==AV65TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( ! (0==AV66TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (0==AV67TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( ! (0==AV68TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (0==AV70TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( ! (0==AV71TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( ! ( AV31INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( ! (0==AV74OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      if ( ! (0==AV75OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int18[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P0A9510( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV37TFBarNHdr_Sel ,
                                           String AV36TFBarNHdr ,
                                           String AV11TFMaqCod_Sel ,
                                           String AV10TFMaqCod ,
                                           java.util.Date AV38TFHisProFec ,
                                           java.math.BigDecimal AV39TFHisProKgr ,
                                           java.math.BigDecimal AV40TFHisProKgr_To ,
                                           java.math.BigDecimal AV41TFHisProMtr ,
                                           java.math.BigDecimal AV42TFHisProMtr_To ,
                                           byte AV43TFHisProTur ,
                                           byte AV44TFHisProTur_To ,
                                           String AV46TFHisProF_Sel ,
                                           String AV45TFHisProF ,
                                           java.util.Date AV47TFHisProDTI ,
                                           java.util.Date AV48TFHisProDTF ,
                                           String AV50TFCliNom_Sel ,
                                           String AV49TFCliNom ,
                                           String AV52TFBarSer_Sel ,
                                           String AV51TFBarSer ,
                                           String AV54TFBarColNom_Sel ,
                                           String AV53TFBarColNom ,
                                           int AV55TFBarColNum ,
                                           int AV56TFBarColNum_To ,
                                           String AV60TFFase_Sel ,
                                           String AV59TFFase ,
                                           short AV63TFBarTipArt ,
                                           short AV64TFBarTipArt_To ,
                                           short AV65TFHisProTip ,
                                           short AV66TFHisProTip_To ,
                                           byte AV67TFHisProTc ,
                                           byte AV68TFHisProTc_To ,
                                           java.util.Date AV69TFHisProDf ,
                                           short AV70TFParCod ,
                                           short AV71TFParCod_To ,
                                           String AV73TFParCodNom_Sel ,
                                           String AV72TFParCodNom ,
                                           byte AV31INHisEstReo ,
                                           int AV74OperarioFrom ,
                                           int AV75OperarioTo ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A602MaqCod ,
                                           java.util.Date A558HisProFec ,
                                           java.math.BigDecimal A1525HisProKgr ,
                                           java.math.BigDecimal A1526HisProMtr ,
                                           byte A566HisProTur ,
                                           String A557HisProF ,
                                           java.util.Date A4440HisProDTI ,
                                           java.util.Date A4441HisProDTF ,
                                           String A279CliNom ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A461Fase ,
                                           short A217BarTipArt ,
                                           short A2247HisProTip ,
                                           byte A3611HisProTc ,
                                           java.util.Date A5608HisProDf ,
                                           short A656ParCod ,
                                           String A867ParCodNom ,
                                           byte A3612HisProReo ,
                                           int A503GruOpeCod ,
                                           String AV62TFFaseDescripcion_Sel ,
                                           String AV61TFFaseDescripcion ,
                                           String A13893FaseDescri ,
                                           String AV32INMaqCod1 ,
                                           String AV33INMaqCod2 ,
                                           java.util.Date AV34INHisProFec1 ,
                                           java.util.Date AV35INHisProFec2 ,
                                           String A396EmprCod ,
                                           String AV30INEmprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[44];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T4.ParCodNom, T1.GruOpeCod, T1.HisProReo, T1.ParCod, T1.HisProDf, T1.HisProTc, T1.HisProTip, T2.BarTipArt, T2.BarColNum, T2.BarColNom, T2.BarSer," ;
      scmdbuf += " T3.CliNom, T1.HisProDTF, T1.HisProDTI, T1.HisProF, T1.HisProTur, T1.HisProMtr, T1.HisProKgr, T1.HisProFec, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase," ;
      scmdbuf += " T1.EmprCod, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFHisProFec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProKgr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHisProMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (0==AV43TFHisProTur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (0==AV44TFHisProTur_To) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFHisProF_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFHisProF)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFHisProF_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47TFHisProDTI) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV48TFHisProDTF) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60TFFase_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFFase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFFase_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarTipArt) )
      {
         addWhere(sWhereString, "(T2.BarTipArt >= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (0==AV64TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T2.BarTipArt <= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (0==AV65TFHisProTip) )
      {
         addWhere(sWhereString, "(T1.HisProTip >= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (0==AV66TFHisProTip_To) )
      {
         addWhere(sWhereString, "(T1.HisProTip <= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (0==AV67TFHisProTc) )
      {
         addWhere(sWhereString, "(T1.HisProTc >= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV68TFHisProTc_To) )
      {
         addWhere(sWhereString, "(T1.HisProTc <= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFHisProDf)) )
      {
         addWhere(sWhereString, "(T1.HisProDf >= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (0==AV70TFParCod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (0==AV71TFParCod_To) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFParCodNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFParCodNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.ParCodNom = ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! ( AV31INHisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (0==AV74OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( ! (0==AV75OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.ParCodNom" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P0A952(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 1 :
                  return conditional_P0A953(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 2 :
                  return conditional_P0A954(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 3 :
                  return conditional_P0A955(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 4 :
                  return conditional_P0A956(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 5 :
                  return conditional_P0A957(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 6 :
                  return conditional_P0A958(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 7 :
                  return conditional_P0A959(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (java.util.Date)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
            case 8 :
                  return conditional_P0A9510(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).byteValue() , (java.util.Date)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A952", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A953", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A954", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A955", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A956", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A957", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A958", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A959", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9510", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 6);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 13);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(21);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 13);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 6);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 13);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 6);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 13);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 6);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 13);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 6);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 6);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 6);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 6);
               ((String[]) buf[27])[0] = rslt.getString(22, 1);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((String[]) buf[30])[0] = rslt.getString(25, 8);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
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
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[48], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
      }
   }

}

