package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_fase_unagetfilterdata extends GXProcedure
{
   public trabajoexterno_fase_unagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_fase_unagetfilterdata.class ), "" );
   }

   public trabajoexterno_fase_unagetfilterdata( int remoteHandle ,
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
      trabajoexterno_fase_unagetfilterdata.this.aP5 = new String[] {""};
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
      trabajoexterno_fase_unagetfilterdata.this.AV32DDOName = aP0;
      trabajoexterno_fase_unagetfilterdata.this.AV33SearchTxt = aP1;
      trabajoexterno_fase_unagetfilterdata.this.AV34SearchTxtTo = aP2;
      trabajoexterno_fase_unagetfilterdata.this.aP3 = aP3;
      trabajoexterno_fase_unagetfilterdata.this.aP4 = aP4;
      trabajoexterno_fase_unagetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FASCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_FASDSC") == 0 )
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
      AV35OptionsJson = AV22Options.toJSonString(false) ;
      AV36OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV25OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("TrabajosExternos.TrabajoExterno_Fase_unaGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternos.TrabajoExterno_Fase_unaGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TrabajosExternos.TrabajoExterno_Fase_unaGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV10TFProCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV11TFProCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV12TFBarOrdLin = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFBarOrdLin_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV14TFFasCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV15TFFasCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV16TFFasDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV17TFFasDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV18TFBarFasEst_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV19TFBarFasEst_Sels.fromJSonString(AV18TFBarFasEst_SelsJson, null);
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFProCod = AV33SearchTxt ;
      AV11TFProCod_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV19TFBarFasEst_Sels ,
                                           AV38FilterFullText ,
                                           AV11TFProCod_Sel ,
                                           AV10TFProCod ,
                                           Short.valueOf(AV12TFBarOrdLin) ,
                                           Short.valueOf(AV13TFBarOrdLin_To) ,
                                           AV15TFFasCod_Sel ,
                                           AV14TFFasCod ,
                                           AV17TFFasDsc_Sel ,
                                           AV16TFFasDsc ,
                                           Integer.valueOf(AV19TFBarFasEst_Sels.size()) ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           AV39InOutEmprCod ,
                                           Integer.valueOf(AV40InOutBarCod) ,
                                           Byte.valueOf(AV41InOutBarCodreo) ,
                                           AV42InOutBarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV10TFProCod = GXutil.padr( GXutil.rtrim( AV10TFProCod), 8, "%") ;
      lV14TFFasCod = GXutil.padr( GXutil.rtrim( AV14TFFasCod), 8, "%") ;
      lV16TFFasDsc = GXutil.padr( GXutil.rtrim( AV16TFFasDsc), 28, "%") ;
      /* Using cursor P0ABR2 */
      pr_default.execute(0, new Object[] {AV39InOutEmprCod, Integer.valueOf(AV40InOutBarCod), Byte.valueOf(AV41InOutBarCodreo), AV42InOutBarCodPar, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV10TFProCod, AV11TFProCod_Sel, Short.valueOf(AV12TFBarOrdLin), Short.valueOf(AV13TFBarOrdLin_To), lV14TFFasCod, AV15TFFasCod_Sel, lV16TFFasDsc, AV17TFFasDsc_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkABR2 = false ;
         A130BarCodPar = P0ABR2_A130BarCodPar[0] ;
         A132BarCodReo = P0ABR2_A132BarCodReo[0] ;
         A129BarCod = P0ABR2_A129BarCod[0] ;
         A396EmprCod = P0ABR2_A396EmprCod[0] ;
         A758ProCod = P0ABR2_A758ProCod[0] ;
         A153BarFasEst = P0ABR2_A153BarFasEst[0] ;
         A460FasDsc = P0ABR2_A460FasDsc[0] ;
         A457FasCod = P0ABR2_A457FasCod[0] ;
         A194BarOrdLin = P0ABR2_A194BarOrdLin[0] ;
         A460FasDsc = P0ABR2_A460FasDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ABR2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ABR2_A129BarCod[0] == A129BarCod ) && ( P0ABR2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0ABR2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0ABR2_A758ProCod[0], A758ProCod) == 0 ) ) )
            {
               if (true) break;
            }
            brkABR2 = false ;
            A194BarOrdLin = P0ABR2_A194BarOrdLin[0] ;
            AV26count = (long)(AV26count+1) ;
            brkABR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV21Option = A758ProCod ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABR2 )
         {
            brkABR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasCod = AV33SearchTxt ;
      AV15TFFasCod_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV19TFBarFasEst_Sels ,
                                           AV38FilterFullText ,
                                           AV11TFProCod_Sel ,
                                           AV10TFProCod ,
                                           Short.valueOf(AV12TFBarOrdLin) ,
                                           Short.valueOf(AV13TFBarOrdLin_To) ,
                                           AV15TFFasCod_Sel ,
                                           AV14TFFasCod ,
                                           AV17TFFasDsc_Sel ,
                                           AV16TFFasDsc ,
                                           Integer.valueOf(AV19TFBarFasEst_Sels.size()) ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV40InOutBarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV41InOutBarCodreo) ,
                                           A130BarCodPar ,
                                           AV42InOutBarCodPar ,
                                           AV39InOutEmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV10TFProCod = GXutil.padr( GXutil.rtrim( AV10TFProCod), 8, "%") ;
      lV14TFFasCod = GXutil.padr( GXutil.rtrim( AV14TFFasCod), 8, "%") ;
      lV16TFFasDsc = GXutil.padr( GXutil.rtrim( AV16TFFasDsc), 28, "%") ;
      /* Using cursor P0ABR3 */
      pr_default.execute(1, new Object[] {AV39InOutEmprCod, Integer.valueOf(AV40InOutBarCod), Byte.valueOf(AV41InOutBarCodreo), AV42InOutBarCodPar, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV10TFProCod, AV11TFProCod_Sel, Short.valueOf(AV12TFBarOrdLin), Short.valueOf(AV13TFBarOrdLin_To), lV14TFFasCod, AV15TFFasCod_Sel, lV16TFFasDsc, AV17TFFasDsc_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkABR4 = false ;
         A396EmprCod = P0ABR3_A396EmprCod[0] ;
         A457FasCod = P0ABR3_A457FasCod[0] ;
         A130BarCodPar = P0ABR3_A130BarCodPar[0] ;
         A132BarCodReo = P0ABR3_A132BarCodReo[0] ;
         A129BarCod = P0ABR3_A129BarCod[0] ;
         A153BarFasEst = P0ABR3_A153BarFasEst[0] ;
         A460FasDsc = P0ABR3_A460FasDsc[0] ;
         A194BarOrdLin = P0ABR3_A194BarOrdLin[0] ;
         A758ProCod = P0ABR3_A758ProCod[0] ;
         A460FasDsc = P0ABR3_A460FasDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ABR3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ABR3_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkABR4 = false ;
            A130BarCodPar = P0ABR3_A130BarCodPar[0] ;
            A132BarCodReo = P0ABR3_A132BarCodReo[0] ;
            A129BarCod = P0ABR3_A129BarCod[0] ;
            A194BarOrdLin = P0ABR3_A194BarOrdLin[0] ;
            A758ProCod = P0ABR3_A758ProCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkABR4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV21Option = A457FasCod ;
            AV23OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV22Options.add(AV21Option, 0);
            AV24OptionsDesc.add(AV23OptionDesc, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABR4 )
         {
            brkABR4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFFasDsc = AV33SearchTxt ;
      AV17TFFasDsc_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV19TFBarFasEst_Sels ,
                                           AV38FilterFullText ,
                                           AV11TFProCod_Sel ,
                                           AV10TFProCod ,
                                           Short.valueOf(AV12TFBarOrdLin) ,
                                           Short.valueOf(AV13TFBarOrdLin_To) ,
                                           AV15TFFasCod_Sel ,
                                           AV14TFFasCod ,
                                           AV17TFFasDsc_Sel ,
                                           AV16TFFasDsc ,
                                           Integer.valueOf(AV19TFBarFasEst_Sels.size()) ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A396EmprCod ,
                                           AV39InOutEmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV40InOutBarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV41InOutBarCodreo) ,
                                           A130BarCodPar ,
                                           AV42InOutBarCodPar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV10TFProCod = GXutil.padr( GXutil.rtrim( AV10TFProCod), 8, "%") ;
      lV14TFFasCod = GXutil.padr( GXutil.rtrim( AV14TFFasCod), 8, "%") ;
      lV16TFFasDsc = GXutil.padr( GXutil.rtrim( AV16TFFasDsc), 28, "%") ;
      /* Using cursor P0ABR4 */
      pr_default.execute(2, new Object[] {AV39InOutEmprCod, Integer.valueOf(AV40InOutBarCod), Byte.valueOf(AV41InOutBarCodreo), AV42InOutBarCodPar, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV10TFProCod, AV11TFProCod_Sel, Short.valueOf(AV12TFBarOrdLin), Short.valueOf(AV13TFBarOrdLin_To), lV14TFFasCod, AV15TFFasCod_Sel, lV16TFFasDsc, AV17TFFasDsc_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkABR6 = false ;
         A396EmprCod = P0ABR4_A396EmprCod[0] ;
         A129BarCod = P0ABR4_A129BarCod[0] ;
         A132BarCodReo = P0ABR4_A132BarCodReo[0] ;
         A130BarCodPar = P0ABR4_A130BarCodPar[0] ;
         A460FasDsc = P0ABR4_A460FasDsc[0] ;
         A153BarFasEst = P0ABR4_A153BarFasEst[0] ;
         A457FasCod = P0ABR4_A457FasCod[0] ;
         A194BarOrdLin = P0ABR4_A194BarOrdLin[0] ;
         A758ProCod = P0ABR4_A758ProCod[0] ;
         A460FasDsc = P0ABR4_A460FasDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ABR4_A460FasDsc[0], A460FasDsc) == 0 ) )
         {
            brkABR6 = false ;
            A396EmprCod = P0ABR4_A396EmprCod[0] ;
            A129BarCod = P0ABR4_A129BarCod[0] ;
            A132BarCodReo = P0ABR4_A132BarCodReo[0] ;
            A130BarCodPar = P0ABR4_A130BarCodPar[0] ;
            A457FasCod = P0ABR4_A457FasCod[0] ;
            A194BarOrdLin = P0ABR4_A194BarOrdLin[0] ;
            A758ProCod = P0ABR4_A758ProCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkABR6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV21Option = A460FasDsc ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkABR6 )
         {
            brkABR6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = trabajoexterno_fase_unagetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = trabajoexterno_fase_unagetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = trabajoexterno_fase_unagetfilterdata.this.AV37OptionIndexesJson;
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
      AV38FilterFullText = "" ;
      AV10TFProCod = "" ;
      AV11TFProCod_Sel = "" ;
      AV14TFFasCod = "" ;
      AV15TFFasCod_Sel = "" ;
      AV16TFFasDsc = "" ;
      AV17TFFasDsc_Sel = "" ;
      AV18TFBarFasEst_SelsJson = "" ;
      AV19TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV38FilterFullText = "" ;
      lV10TFProCod = "" ;
      lV14TFFasCod = "" ;
      lV16TFFasDsc = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV39InOutEmprCod = "" ;
      AV42InOutBarCodPar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P0ABR2_A130BarCodPar = new String[] {""} ;
      P0ABR2_A132BarCodReo = new byte[1] ;
      P0ABR2_A129BarCod = new int[1] ;
      P0ABR2_A396EmprCod = new String[] {""} ;
      P0ABR2_A758ProCod = new String[] {""} ;
      P0ABR2_A153BarFasEst = new byte[1] ;
      P0ABR2_A460FasDsc = new String[] {""} ;
      P0ABR2_A457FasCod = new String[] {""} ;
      P0ABR2_A194BarOrdLin = new short[1] ;
      AV21Option = "" ;
      P0ABR3_A396EmprCod = new String[] {""} ;
      P0ABR3_A457FasCod = new String[] {""} ;
      P0ABR3_A130BarCodPar = new String[] {""} ;
      P0ABR3_A132BarCodReo = new byte[1] ;
      P0ABR3_A129BarCod = new int[1] ;
      P0ABR3_A153BarFasEst = new byte[1] ;
      P0ABR3_A460FasDsc = new String[] {""} ;
      P0ABR3_A194BarOrdLin = new short[1] ;
      P0ABR3_A758ProCod = new String[] {""} ;
      AV23OptionDesc = "" ;
      P0ABR4_A396EmprCod = new String[] {""} ;
      P0ABR4_A129BarCod = new int[1] ;
      P0ABR4_A132BarCodReo = new byte[1] ;
      P0ABR4_A130BarCodPar = new String[] {""} ;
      P0ABR4_A460FasDsc = new String[] {""} ;
      P0ABR4_A153BarFasEst = new byte[1] ;
      P0ABR4_A457FasCod = new String[] {""} ;
      P0ABR4_A194BarOrdLin = new short[1] ;
      P0ABR4_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_fase_unagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ABR2_A130BarCodPar, P0ABR2_A132BarCodReo, P0ABR2_A129BarCod, P0ABR2_A396EmprCod, P0ABR2_A758ProCod, P0ABR2_A153BarFasEst, P0ABR2_A460FasDsc, P0ABR2_A457FasCod, P0ABR2_A194BarOrdLin
            }
            , new Object[] {
            P0ABR3_A396EmprCod, P0ABR3_A457FasCod, P0ABR3_A130BarCodPar, P0ABR3_A132BarCodReo, P0ABR3_A129BarCod, P0ABR3_A153BarFasEst, P0ABR3_A460FasDsc, P0ABR3_A194BarOrdLin, P0ABR3_A758ProCod
            }
            , new Object[] {
            P0ABR4_A396EmprCod, P0ABR4_A129BarCod, P0ABR4_A132BarCodReo, P0ABR4_A130BarCodPar, P0ABR4_A460FasDsc, P0ABR4_A153BarFasEst, P0ABR4_A457FasCod, P0ABR4_A194BarOrdLin, P0ABR4_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A153BarFasEst ;
   private byte AV41InOutBarCodreo ;
   private byte A132BarCodReo ;
   private short AV12TFBarOrdLin ;
   private short AV13TFBarOrdLin_To ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV19TFBarFasEst_Sels_size ;
   private int AV40InOutBarCod ;
   private int A129BarCod ;
   private long AV26count ;
   private String AV10TFProCod ;
   private String AV11TFProCod_Sel ;
   private String AV14TFFasCod ;
   private String AV15TFFasCod_Sel ;
   private String AV16TFFasDsc ;
   private String AV17TFFasDsc_Sel ;
   private String scmdbuf ;
   private String lV10TFProCod ;
   private String lV14TFFasCod ;
   private String lV16TFFasDsc ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV39InOutEmprCod ;
   private String AV42InOutBarCodPar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brkABR2 ;
   private boolean brkABR4 ;
   private boolean brkABR6 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV18TFBarFasEst_SelsJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV38FilterFullText ;
   private String lV38FilterFullText ;
   private String AV21Option ;
   private String AV23OptionDesc ;
   private GXSimpleCollection<Byte> AV19TFBarFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ABR2_A130BarCodPar ;
   private byte[] P0ABR2_A132BarCodReo ;
   private int[] P0ABR2_A129BarCod ;
   private String[] P0ABR2_A396EmprCod ;
   private String[] P0ABR2_A758ProCod ;
   private byte[] P0ABR2_A153BarFasEst ;
   private String[] P0ABR2_A460FasDsc ;
   private String[] P0ABR2_A457FasCod ;
   private short[] P0ABR2_A194BarOrdLin ;
   private String[] P0ABR3_A396EmprCod ;
   private String[] P0ABR3_A457FasCod ;
   private String[] P0ABR3_A130BarCodPar ;
   private byte[] P0ABR3_A132BarCodReo ;
   private int[] P0ABR3_A129BarCod ;
   private byte[] P0ABR3_A153BarFasEst ;
   private String[] P0ABR3_A460FasDsc ;
   private short[] P0ABR3_A194BarOrdLin ;
   private String[] P0ABR3_A758ProCod ;
   private String[] P0ABR4_A396EmprCod ;
   private int[] P0ABR4_A129BarCod ;
   private byte[] P0ABR4_A132BarCodReo ;
   private String[] P0ABR4_A130BarCodPar ;
   private String[] P0ABR4_A460FasDsc ;
   private byte[] P0ABR4_A153BarFasEst ;
   private String[] P0ABR4_A457FasCod ;
   private short[] P0ABR4_A194BarOrdLin ;
   private String[] P0ABR4_A758ProCod ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class trabajoexterno_fase_unagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ABR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV19TFBarFasEst_Sels ,
                                          String AV38FilterFullText ,
                                          String AV11TFProCod_Sel ,
                                          String AV10TFProCod ,
                                          short AV12TFBarOrdLin ,
                                          short AV13TFBarOrdLin_To ,
                                          String AV15TFFasCod_Sel ,
                                          String AV14TFFasCod ,
                                          String AV17TFFasDsc_Sel ,
                                          String AV16TFFasDsc ,
                                          int AV19TFBarFasEst_Sels_size ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String AV39InOutEmprCod ,
                                          int AV40InOutBarCod ,
                                          byte AV41InOutBarCodreo ,
                                          String AV42InOutBarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.ProCod, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV38FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV12TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV13TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( AV19TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV19TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ABR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV19TFBarFasEst_Sels ,
                                          String AV38FilterFullText ,
                                          String AV11TFProCod_Sel ,
                                          String AV10TFProCod ,
                                          short AV12TFBarOrdLin ,
                                          short AV13TFBarOrdLin_To ,
                                          String AV15TFFasCod_Sel ,
                                          String AV14TFFasCod ,
                                          String AV17TFFasDsc_Sel ,
                                          String AV16TFFasDsc ,
                                          int AV19TFBarFasEst_Sels_size ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          int A129BarCod ,
                                          int AV40InOutBarCod ,
                                          byte A132BarCodReo ,
                                          byte AV41InOutBarCodreo ,
                                          String A130BarCodPar ,
                                          String AV42InOutBarCodPar ,
                                          String AV39InOutEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[17];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFasEst, T2.FasDsc, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV38FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV12TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV13TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( AV19TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV19TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0ABR4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV19TFBarFasEst_Sels ,
                                          String AV38FilterFullText ,
                                          String AV11TFProCod_Sel ,
                                          String AV10TFProCod ,
                                          short AV12TFBarOrdLin ,
                                          short AV13TFBarOrdLin_To ,
                                          String AV15TFFasCod_Sel ,
                                          String AV14TFFasCod ,
                                          String AV17TFFasDsc_Sel ,
                                          String AV16TFFasDsc ,
                                          int AV19TFBarFasEst_Sels_size ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A396EmprCod ,
                                          String AV39InOutEmprCod ,
                                          int A129BarCod ,
                                          int AV40InOutBarCod ,
                                          byte A132BarCodReo ,
                                          byte AV41InOutBarCodreo ,
                                          String A130BarCodPar ,
                                          String AV42InOutBarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.BarFasEst, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV38FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV12TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV13TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( AV19TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV19TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasDsc" ;
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
                  return conditional_P0ABR2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] );
            case 1 :
                  return conditional_P0ABR3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
            case 2 :
                  return conditional_P0ABR4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ABR4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 28);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 28);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 28);
               }
               return;
      }
   }

}

