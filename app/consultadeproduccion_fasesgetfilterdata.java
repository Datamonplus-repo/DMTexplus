package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_fasesgetfilterdata extends GXProcedure
{
   public consultadeproduccion_fasesgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_fasesgetfilterdata.class ), "" );
   }

   public consultadeproduccion_fasesgetfilterdata( int remoteHandle ,
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
      consultadeproduccion_fasesgetfilterdata.this.aP5 = new String[] {""};
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
      consultadeproduccion_fasesgetfilterdata.this.AV32DDOName = aP0;
      consultadeproduccion_fasesgetfilterdata.this.AV30SearchTxt = aP1;
      consultadeproduccion_fasesgetfilterdata.this.AV31SearchTxtTo = aP2;
      consultadeproduccion_fasesgetfilterdata.this.aP3 = aP3;
      consultadeproduccion_fasesgetfilterdata.this.aP4 = aP4;
      consultadeproduccion_fasesgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_MAQCODBIS") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODBISOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("ConsultadeProduccion_FasesGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultadeProduccion_FasesGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("ConsultadeProduccion_FasesGridState"), null, null);
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV10TFBarOrdLin = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarOrdLin_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV16TFMaqCodBis = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV17TFMaqCodBis_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV18TFBarFasDTI = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV22TFBarTieRea = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFBarTieRea_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV24TFBarFasEst_SelsJson = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV25TFBarFasEst_Sels.fromJSonString(AV24TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV26TFBarFasKgm = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFBarFasKgm_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV28TFBarFasMtr = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarFasMtr_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASPRI") == 0 )
         {
            AV55TFBarFasPri = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFBarFasPri_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49EmprCod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV50BarCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV51BarCodReo = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV52BarCodPar = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV57Clicod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV58CliNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV59PedidoCliente = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV60Barser = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV61BarSerDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV62Barcolnom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV63Barcolnum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV30SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV25TFBarFasEst_Sels ,
                                           Short.valueOf(AV10TFBarOrdLin) ,
                                           Short.valueOf(AV11TFBarOrdLin_To) ,
                                           AV13TFFasCod_Sel ,
                                           AV12TFFasCod ,
                                           AV15TFFasDsc_Sel ,
                                           AV14TFFasDsc ,
                                           AV17TFMaqCodBis_Sel ,
                                           AV16TFMaqCodBis ,
                                           AV18TFBarFasDTI ,
                                           AV22TFBarTieRea ,
                                           AV23TFBarTieRea_To ,
                                           Integer.valueOf(AV25TFBarFasEst_Sels.size()) ,
                                           AV26TFBarFasKgm ,
                                           AV27TFBarFasKgm_To ,
                                           AV28TFBarFasMtr ,
                                           AV29TFBarFasMtr_To ,
                                           Byte.valueOf(AV55TFBarFasPri) ,
                                           Byte.valueOf(AV56TFBarFasPri_To) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           AV49EmprCod ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           AV52BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV12TFFasCod = GXutil.padr( GXutil.rtrim( AV12TFFasCod), 8, "%") ;
      lV14TFFasDsc = GXutil.padr( GXutil.rtrim( AV14TFFasDsc), 28, "%") ;
      lV16TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV16TFMaqCodBis), 6, "%") ;
      /* Using cursor P092D2 */
      pr_default.execute(0, new Object[] {AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, Short.valueOf(AV10TFBarOrdLin), Short.valueOf(AV11TFBarOrdLin_To), lV12TFFasCod, AV13TFFasCod_Sel, lV14TFFasDsc, AV15TFFasDsc_Sel, lV16TFMaqCodBis, AV17TFMaqCodBis_Sel, AV18TFBarFasDTI, AV22TFBarTieRea, AV23TFBarTieRea_To, AV26TFBarFasKgm, AV27TFBarFasKgm_To, AV28TFBarFasMtr, AV29TFBarFasMtr_To, Byte.valueOf(AV55TFBarFasPri), Byte.valueOf(AV56TFBarFasPri_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk92D2 = false ;
         A396EmprCod = P092D2_A396EmprCod[0] ;
         A129BarCod = P092D2_A129BarCod[0] ;
         A132BarCodReo = P092D2_A132BarCodReo[0] ;
         A130BarCodPar = P092D2_A130BarCodPar[0] ;
         A457FasCod = P092D2_A457FasCod[0] ;
         A3836BarFasPri = P092D2_A3836BarFasPri[0] ;
         A3838BarFasMtr = P092D2_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P092D2_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P092D2_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P092D2_n3837BarFasKgm[0] ;
         A153BarFasEst = P092D2_A153BarFasEst[0] ;
         A215BarTieRea = P092D2_A215BarTieRea[0] ;
         A4442BarFasDTI = P092D2_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P092D2_n4442BarFasDTI[0] ;
         A603MaqCodBis = P092D2_A603MaqCodBis[0] ;
         A460FasDsc = P092D2_A460FasDsc[0] ;
         A194BarOrdLin = P092D2_A194BarOrdLin[0] ;
         A758ProCod = P092D2_A758ProCod[0] ;
         A460FasDsc = P092D2_A460FasDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P092D2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P092D2_A129BarCod[0] == A129BarCod ) && ( P092D2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P092D2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P092D2_A457FasCod[0], A457FasCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk92D2 = false ;
            A194BarOrdLin = P092D2_A194BarOrdLin[0] ;
            A758ProCod = P092D2_A758ProCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk92D2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV34Option = A457FasCod ;
            AV37OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV35Options.add(AV34Option, 0);
            AV38OptionsDesc.add(AV37OptionDesc, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk92D2 )
         {
            brk92D2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV30SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV25TFBarFasEst_Sels ,
                                           Short.valueOf(AV10TFBarOrdLin) ,
                                           Short.valueOf(AV11TFBarOrdLin_To) ,
                                           AV13TFFasCod_Sel ,
                                           AV12TFFasCod ,
                                           AV15TFFasDsc_Sel ,
                                           AV14TFFasDsc ,
                                           AV17TFMaqCodBis_Sel ,
                                           AV16TFMaqCodBis ,
                                           AV18TFBarFasDTI ,
                                           AV22TFBarTieRea ,
                                           AV23TFBarTieRea_To ,
                                           Integer.valueOf(AV25TFBarFasEst_Sels.size()) ,
                                           AV26TFBarFasKgm ,
                                           AV27TFBarFasKgm_To ,
                                           AV28TFBarFasMtr ,
                                           AV29TFBarFasMtr_To ,
                                           Byte.valueOf(AV55TFBarFasPri) ,
                                           Byte.valueOf(AV56TFBarFasPri_To) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           AV49EmprCod ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           AV52BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV12TFFasCod = GXutil.padr( GXutil.rtrim( AV12TFFasCod), 8, "%") ;
      lV14TFFasDsc = GXutil.padr( GXutil.rtrim( AV14TFFasDsc), 28, "%") ;
      lV16TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV16TFMaqCodBis), 6, "%") ;
      /* Using cursor P092D3 */
      pr_default.execute(1, new Object[] {AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, Short.valueOf(AV10TFBarOrdLin), Short.valueOf(AV11TFBarOrdLin_To), lV12TFFasCod, AV13TFFasCod_Sel, lV14TFFasDsc, AV15TFFasDsc_Sel, lV16TFMaqCodBis, AV17TFMaqCodBis_Sel, AV18TFBarFasDTI, AV22TFBarTieRea, AV23TFBarTieRea_To, AV26TFBarFasKgm, AV27TFBarFasKgm_To, AV28TFBarFasMtr, AV29TFBarFasMtr_To, Byte.valueOf(AV55TFBarFasPri), Byte.valueOf(AV56TFBarFasPri_To)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk92D4 = false ;
         A396EmprCod = P092D3_A396EmprCod[0] ;
         A129BarCod = P092D3_A129BarCod[0] ;
         A132BarCodReo = P092D3_A132BarCodReo[0] ;
         A130BarCodPar = P092D3_A130BarCodPar[0] ;
         A460FasDsc = P092D3_A460FasDsc[0] ;
         A3836BarFasPri = P092D3_A3836BarFasPri[0] ;
         A3838BarFasMtr = P092D3_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P092D3_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P092D3_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P092D3_n3837BarFasKgm[0] ;
         A153BarFasEst = P092D3_A153BarFasEst[0] ;
         A215BarTieRea = P092D3_A215BarTieRea[0] ;
         A4442BarFasDTI = P092D3_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P092D3_n4442BarFasDTI[0] ;
         A603MaqCodBis = P092D3_A603MaqCodBis[0] ;
         A457FasCod = P092D3_A457FasCod[0] ;
         A194BarOrdLin = P092D3_A194BarOrdLin[0] ;
         A758ProCod = P092D3_A758ProCod[0] ;
         A460FasDsc = P092D3_A460FasDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P092D3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P092D3_A129BarCod[0] == A129BarCod ) && ( P092D3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P092D3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P092D3_A460FasDsc[0], A460FasDsc) == 0 ) ) )
            {
               if (true) break;
            }
            brk92D4 = false ;
            A457FasCod = P092D3_A457FasCod[0] ;
            A194BarOrdLin = P092D3_A194BarOrdLin[0] ;
            A758ProCod = P092D3_A758ProCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk92D4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV34Option = A460FasDsc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk92D4 )
         {
            brk92D4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqCodBis = AV30SearchTxt ;
      AV17TFMaqCodBis_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV25TFBarFasEst_Sels ,
                                           Short.valueOf(AV10TFBarOrdLin) ,
                                           Short.valueOf(AV11TFBarOrdLin_To) ,
                                           AV13TFFasCod_Sel ,
                                           AV12TFFasCod ,
                                           AV15TFFasDsc_Sel ,
                                           AV14TFFasDsc ,
                                           AV17TFMaqCodBis_Sel ,
                                           AV16TFMaqCodBis ,
                                           AV18TFBarFasDTI ,
                                           AV22TFBarTieRea ,
                                           AV23TFBarTieRea_To ,
                                           Integer.valueOf(AV25TFBarFasEst_Sels.size()) ,
                                           AV26TFBarFasKgm ,
                                           AV27TFBarFasKgm_To ,
                                           AV28TFBarFasMtr ,
                                           AV29TFBarFasMtr_To ,
                                           Byte.valueOf(AV55TFBarFasPri) ,
                                           Byte.valueOf(AV56TFBarFasPri_To) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           AV49EmprCod ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           AV52BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV12TFFasCod = GXutil.padr( GXutil.rtrim( AV12TFFasCod), 8, "%") ;
      lV14TFFasDsc = GXutil.padr( GXutil.rtrim( AV14TFFasDsc), 28, "%") ;
      lV16TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV16TFMaqCodBis), 6, "%") ;
      /* Using cursor P092D4 */
      pr_default.execute(2, new Object[] {AV49EmprCod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV52BarCodPar, Short.valueOf(AV10TFBarOrdLin), Short.valueOf(AV11TFBarOrdLin_To), lV12TFFasCod, AV13TFFasCod_Sel, lV14TFFasDsc, AV15TFFasDsc_Sel, lV16TFMaqCodBis, AV17TFMaqCodBis_Sel, AV18TFBarFasDTI, AV22TFBarTieRea, AV23TFBarTieRea_To, AV26TFBarFasKgm, AV27TFBarFasKgm_To, AV28TFBarFasMtr, AV29TFBarFasMtr_To, Byte.valueOf(AV55TFBarFasPri), Byte.valueOf(AV56TFBarFasPri_To)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk92D6 = false ;
         A396EmprCod = P092D4_A396EmprCod[0] ;
         A129BarCod = P092D4_A129BarCod[0] ;
         A132BarCodReo = P092D4_A132BarCodReo[0] ;
         A130BarCodPar = P092D4_A130BarCodPar[0] ;
         A603MaqCodBis = P092D4_A603MaqCodBis[0] ;
         A3836BarFasPri = P092D4_A3836BarFasPri[0] ;
         A3838BarFasMtr = P092D4_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P092D4_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P092D4_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P092D4_n3837BarFasKgm[0] ;
         A153BarFasEst = P092D4_A153BarFasEst[0] ;
         A215BarTieRea = P092D4_A215BarTieRea[0] ;
         A4442BarFasDTI = P092D4_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P092D4_n4442BarFasDTI[0] ;
         A460FasDsc = P092D4_A460FasDsc[0] ;
         A457FasCod = P092D4_A457FasCod[0] ;
         A194BarOrdLin = P092D4_A194BarOrdLin[0] ;
         A758ProCod = P092D4_A758ProCod[0] ;
         A460FasDsc = P092D4_A460FasDsc[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P092D4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P092D4_A129BarCod[0] == A129BarCod ) && ( P092D4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P092D4_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P092D4_A603MaqCodBis[0], A603MaqCodBis) == 0 ) ) )
            {
               if (true) break;
            }
            brk92D6 = false ;
            A194BarOrdLin = P092D4_A194BarOrdLin[0] ;
            A758ProCod = P092D4_A758ProCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk92D6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
         {
            AV34Option = A603MaqCodBis ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk92D6 )
         {
            brk92D6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadeproduccion_fasesgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = consultadeproduccion_fasesgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = consultadeproduccion_fasesgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV16TFMaqCodBis = "" ;
      AV17TFMaqCodBis_Sel = "" ;
      AV18TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV22TFBarTieRea = DecimalUtil.ZERO ;
      AV23TFBarTieRea_To = DecimalUtil.ZERO ;
      AV24TFBarFasEst_SelsJson = "" ;
      AV25TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV26TFBarFasKgm = DecimalUtil.ZERO ;
      AV27TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV28TFBarFasMtr = DecimalUtil.ZERO ;
      AV29TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV49EmprCod = "" ;
      AV52BarCodPar = "" ;
      AV58CliNom = "" ;
      AV59PedidoCliente = "" ;
      AV60Barser = "" ;
      AV61BarSerDsc = "" ;
      AV62Barcolnom = "" ;
      scmdbuf = "" ;
      lV12TFFasCod = "" ;
      lV14TFFasDsc = "" ;
      lV16TFMaqCodBis = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P092D2_A396EmprCod = new String[] {""} ;
      P092D2_A129BarCod = new int[1] ;
      P092D2_A132BarCodReo = new byte[1] ;
      P092D2_A130BarCodPar = new String[] {""} ;
      P092D2_A457FasCod = new String[] {""} ;
      P092D2_A3836BarFasPri = new byte[1] ;
      P092D2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092D2_n3838BarFasMtr = new boolean[] {false} ;
      P092D2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092D2_n3837BarFasKgm = new boolean[] {false} ;
      P092D2_A153BarFasEst = new byte[1] ;
      P092D2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092D2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P092D2_n4442BarFasDTI = new boolean[] {false} ;
      P092D2_A603MaqCodBis = new String[] {""} ;
      P092D2_A460FasDsc = new String[] {""} ;
      P092D2_A194BarOrdLin = new short[1] ;
      P092D2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV34Option = "" ;
      AV37OptionDesc = "" ;
      P092D3_A396EmprCod = new String[] {""} ;
      P092D3_A129BarCod = new int[1] ;
      P092D3_A132BarCodReo = new byte[1] ;
      P092D3_A130BarCodPar = new String[] {""} ;
      P092D3_A460FasDsc = new String[] {""} ;
      P092D3_A3836BarFasPri = new byte[1] ;
      P092D3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092D3_n3838BarFasMtr = new boolean[] {false} ;
      P092D3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092D3_n3837BarFasKgm = new boolean[] {false} ;
      P092D3_A153BarFasEst = new byte[1] ;
      P092D3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092D3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P092D3_n4442BarFasDTI = new boolean[] {false} ;
      P092D3_A603MaqCodBis = new String[] {""} ;
      P092D3_A457FasCod = new String[] {""} ;
      P092D3_A194BarOrdLin = new short[1] ;
      P092D3_A758ProCod = new String[] {""} ;
      P092D4_A396EmprCod = new String[] {""} ;
      P092D4_A129BarCod = new int[1] ;
      P092D4_A132BarCodReo = new byte[1] ;
      P092D4_A130BarCodPar = new String[] {""} ;
      P092D4_A603MaqCodBis = new String[] {""} ;
      P092D4_A3836BarFasPri = new byte[1] ;
      P092D4_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092D4_n3838BarFasMtr = new boolean[] {false} ;
      P092D4_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092D4_n3837BarFasKgm = new boolean[] {false} ;
      P092D4_A153BarFasEst = new byte[1] ;
      P092D4_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092D4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P092D4_n4442BarFasDTI = new boolean[] {false} ;
      P092D4_A460FasDsc = new String[] {""} ;
      P092D4_A457FasCod = new String[] {""} ;
      P092D4_A194BarOrdLin = new short[1] ;
      P092D4_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_fasesgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P092D2_A396EmprCod, P092D2_A129BarCod, P092D2_A132BarCodReo, P092D2_A130BarCodPar, P092D2_A457FasCod, P092D2_A3836BarFasPri, P092D2_A3838BarFasMtr, P092D2_n3838BarFasMtr, P092D2_A3837BarFasKgm, P092D2_n3837BarFasKgm,
            P092D2_A153BarFasEst, P092D2_A215BarTieRea, P092D2_A4442BarFasDTI, P092D2_n4442BarFasDTI, P092D2_A603MaqCodBis, P092D2_A460FasDsc, P092D2_A194BarOrdLin, P092D2_A758ProCod
            }
            , new Object[] {
            P092D3_A396EmprCod, P092D3_A129BarCod, P092D3_A132BarCodReo, P092D3_A130BarCodPar, P092D3_A460FasDsc, P092D3_A3836BarFasPri, P092D3_A3838BarFasMtr, P092D3_n3838BarFasMtr, P092D3_A3837BarFasKgm, P092D3_n3837BarFasKgm,
            P092D3_A153BarFasEst, P092D3_A215BarTieRea, P092D3_A4442BarFasDTI, P092D3_n4442BarFasDTI, P092D3_A603MaqCodBis, P092D3_A457FasCod, P092D3_A194BarOrdLin, P092D3_A758ProCod
            }
            , new Object[] {
            P092D4_A396EmprCod, P092D4_A129BarCod, P092D4_A132BarCodReo, P092D4_A130BarCodPar, P092D4_A603MaqCodBis, P092D4_A3836BarFasPri, P092D4_A3838BarFasMtr, P092D4_n3838BarFasMtr, P092D4_A3837BarFasKgm, P092D4_n3837BarFasKgm,
            P092D4_A153BarFasEst, P092D4_A215BarTieRea, P092D4_A4442BarFasDTI, P092D4_n4442BarFasDTI, P092D4_A460FasDsc, P092D4_A457FasCod, P092D4_A194BarOrdLin, P092D4_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV55TFBarFasPri ;
   private byte AV56TFBarFasPri_To ;
   private byte AV51BarCodReo ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte A132BarCodReo ;
   private short AV10TFBarOrdLin ;
   private short AV11TFBarOrdLin_To ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV66GXV1 ;
   private int AV50BarCod ;
   private int AV57Clicod ;
   private int AV63Barcolnum ;
   private int AV25TFBarFasEst_Sels_size ;
   private int A129BarCod ;
   private long AV42count ;
   private java.math.BigDecimal AV22TFBarTieRea ;
   private java.math.BigDecimal AV23TFBarTieRea_To ;
   private java.math.BigDecimal AV26TFBarFasKgm ;
   private java.math.BigDecimal AV27TFBarFasKgm_To ;
   private java.math.BigDecimal AV28TFBarFasMtr ;
   private java.math.BigDecimal AV29TFBarFasMtr_To ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV16TFMaqCodBis ;
   private String AV17TFMaqCodBis_Sel ;
   private String AV49EmprCod ;
   private String AV52BarCodPar ;
   private String AV58CliNom ;
   private String AV59PedidoCliente ;
   private String AV60Barser ;
   private String AV61BarSerDsc ;
   private String AV62Barcolnom ;
   private String scmdbuf ;
   private String lV12TFFasCod ;
   private String lV14TFFasDsc ;
   private String lV16TFMaqCodBis ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private java.util.Date AV18TFBarFasDTI ;
   private java.util.Date A4442BarFasDTI ;
   private boolean returnInSub ;
   private boolean brk92D2 ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4442BarFasDTI ;
   private boolean brk92D4 ;
   private boolean brk92D6 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV24TFBarFasEst_SelsJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV34Option ;
   private String AV37OptionDesc ;
   private GXSimpleCollection<Byte> AV25TFBarFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P092D2_A396EmprCod ;
   private int[] P092D2_A129BarCod ;
   private byte[] P092D2_A132BarCodReo ;
   private String[] P092D2_A130BarCodPar ;
   private String[] P092D2_A457FasCod ;
   private byte[] P092D2_A3836BarFasPri ;
   private java.math.BigDecimal[] P092D2_A3838BarFasMtr ;
   private boolean[] P092D2_n3838BarFasMtr ;
   private java.math.BigDecimal[] P092D2_A3837BarFasKgm ;
   private boolean[] P092D2_n3837BarFasKgm ;
   private byte[] P092D2_A153BarFasEst ;
   private java.math.BigDecimal[] P092D2_A215BarTieRea ;
   private java.util.Date[] P092D2_A4442BarFasDTI ;
   private boolean[] P092D2_n4442BarFasDTI ;
   private String[] P092D2_A603MaqCodBis ;
   private String[] P092D2_A460FasDsc ;
   private short[] P092D2_A194BarOrdLin ;
   private String[] P092D2_A758ProCod ;
   private String[] P092D3_A396EmprCod ;
   private int[] P092D3_A129BarCod ;
   private byte[] P092D3_A132BarCodReo ;
   private String[] P092D3_A130BarCodPar ;
   private String[] P092D3_A460FasDsc ;
   private byte[] P092D3_A3836BarFasPri ;
   private java.math.BigDecimal[] P092D3_A3838BarFasMtr ;
   private boolean[] P092D3_n3838BarFasMtr ;
   private java.math.BigDecimal[] P092D3_A3837BarFasKgm ;
   private boolean[] P092D3_n3837BarFasKgm ;
   private byte[] P092D3_A153BarFasEst ;
   private java.math.BigDecimal[] P092D3_A215BarTieRea ;
   private java.util.Date[] P092D3_A4442BarFasDTI ;
   private boolean[] P092D3_n4442BarFasDTI ;
   private String[] P092D3_A603MaqCodBis ;
   private String[] P092D3_A457FasCod ;
   private short[] P092D3_A194BarOrdLin ;
   private String[] P092D3_A758ProCod ;
   private String[] P092D4_A396EmprCod ;
   private int[] P092D4_A129BarCod ;
   private byte[] P092D4_A132BarCodReo ;
   private String[] P092D4_A130BarCodPar ;
   private String[] P092D4_A603MaqCodBis ;
   private byte[] P092D4_A3836BarFasPri ;
   private java.math.BigDecimal[] P092D4_A3838BarFasMtr ;
   private boolean[] P092D4_n3838BarFasMtr ;
   private java.math.BigDecimal[] P092D4_A3837BarFasKgm ;
   private boolean[] P092D4_n3837BarFasKgm ;
   private byte[] P092D4_A153BarFasEst ;
   private java.math.BigDecimal[] P092D4_A215BarTieRea ;
   private java.util.Date[] P092D4_A4442BarFasDTI ;
   private boolean[] P092D4_n4442BarFasDTI ;
   private String[] P092D4_A460FasDsc ;
   private String[] P092D4_A457FasCod ;
   private short[] P092D4_A194BarOrdLin ;
   private String[] P092D4_A758ProCod ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class consultadeproduccion_fasesgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P092D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV25TFBarFasEst_Sels ,
                                          short AV10TFBarOrdLin ,
                                          short AV11TFBarOrdLin_To ,
                                          String AV13TFFasCod_Sel ,
                                          String AV12TFFasCod ,
                                          String AV15TFFasDsc_Sel ,
                                          String AV14TFFasDsc ,
                                          String AV17TFMaqCodBis_Sel ,
                                          String AV16TFMaqCodBis ,
                                          java.util.Date AV18TFBarFasDTI ,
                                          java.math.BigDecimal AV22TFBarTieRea ,
                                          java.math.BigDecimal AV23TFBarTieRea_To ,
                                          int AV25TFBarFasEst_Sels_size ,
                                          java.math.BigDecimal AV26TFBarFasKgm ,
                                          java.math.BigDecimal AV27TFBarFasKgm_To ,
                                          java.math.BigDecimal AV28TFBarFasMtr ,
                                          java.math.BigDecimal AV29TFBarFasMtr_To ,
                                          byte AV55TFBarFasPri ,
                                          byte AV56TFBarFasPri_To ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          String AV49EmprCod ,
                                          int AV50BarCod ,
                                          byte AV51BarCodReo ,
                                          String AV52BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis," ;
      scmdbuf += " T2.FasDsc, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV10TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV11TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV18TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFBarTieRea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFBarTieRea_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( AV25TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV25TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarFasKgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarFasKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarFasMtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarFasMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarFasPri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarFasPri_To) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P092D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV25TFBarFasEst_Sels ,
                                          short AV10TFBarOrdLin ,
                                          short AV11TFBarOrdLin_To ,
                                          String AV13TFFasCod_Sel ,
                                          String AV12TFFasCod ,
                                          String AV15TFFasDsc_Sel ,
                                          String AV14TFFasDsc ,
                                          String AV17TFMaqCodBis_Sel ,
                                          String AV16TFMaqCodBis ,
                                          java.util.Date AV18TFBarFasDTI ,
                                          java.math.BigDecimal AV22TFBarTieRea ,
                                          java.math.BigDecimal AV23TFBarTieRea_To ,
                                          int AV25TFBarFasEst_Sels_size ,
                                          java.math.BigDecimal AV26TFBarFasKgm ,
                                          java.math.BigDecimal AV27TFBarFasKgm_To ,
                                          java.math.BigDecimal AV28TFBarFasMtr ,
                                          java.math.BigDecimal AV29TFBarFasMtr_To ,
                                          byte AV55TFBarFasPri ,
                                          byte AV56TFBarFasPri_To ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          String AV49EmprCod ,
                                          int AV50BarCod ,
                                          byte AV51BarCodReo ,
                                          String AV52BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[21];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis," ;
      scmdbuf += " T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV10TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV11TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV18TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFBarTieRea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFBarTieRea_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( AV25TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV25TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarFasKgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarFasKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarFasMtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarFasMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarFasPri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarFasPri_To) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P092D4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV25TFBarFasEst_Sels ,
                                          short AV10TFBarOrdLin ,
                                          short AV11TFBarOrdLin_To ,
                                          String AV13TFFasCod_Sel ,
                                          String AV12TFFasCod ,
                                          String AV15TFFasDsc_Sel ,
                                          String AV14TFFasDsc ,
                                          String AV17TFMaqCodBis_Sel ,
                                          String AV16TFMaqCodBis ,
                                          java.util.Date AV18TFBarFasDTI ,
                                          java.math.BigDecimal AV22TFBarTieRea ,
                                          java.math.BigDecimal AV23TFBarTieRea_To ,
                                          int AV25TFBarFasEst_Sels_size ,
                                          java.math.BigDecimal AV26TFBarFasKgm ,
                                          java.math.BigDecimal AV27TFBarFasKgm_To ,
                                          java.math.BigDecimal AV28TFBarFasMtr ,
                                          java.math.BigDecimal AV29TFBarFasMtr_To ,
                                          byte AV55TFBarFasPri ,
                                          byte AV56TFBarFasPri_To ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          String AV49EmprCod ,
                                          int AV50BarCod ,
                                          byte AV51BarCodReo ,
                                          String AV52BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[21];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T2.FasDsc," ;
      scmdbuf += " T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV10TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV11TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV18TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFBarTieRea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFBarTieRea_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( AV25TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV25TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFBarFasKgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFBarFasKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarFasMtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarFasMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarFasPri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarFasPri_To) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
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
                  return conditional_P092D2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] );
            case 1 :
                  return conditional_P092D3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] );
            case 2 :
                  return conditional_P092D4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P092D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092D4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               ((String[]) buf[15])[0] = rslt.getString(13, 28);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 28);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
      }
   }

}

