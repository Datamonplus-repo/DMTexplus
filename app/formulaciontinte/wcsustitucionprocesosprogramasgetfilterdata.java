package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcsustitucionprocesosprogramasgetfilterdata extends GXProcedure
{
   public wcsustitucionprocesosprogramasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcsustitucionprocesosprogramasgetfilterdata.class ), "" );
   }

   public wcsustitucionprocesosprogramasgetfilterdata( int remoteHandle ,
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
      wcsustitucionprocesosprogramasgetfilterdata.this.aP5 = new String[] {""};
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
      wcsustitucionprocesosprogramasgetfilterdata.this.AV18DDOName = aP0;
      wcsustitucionprocesosprogramasgetfilterdata.this.AV16SearchTxt = aP1;
      wcsustitucionprocesosprogramasgetfilterdata.this.AV17SearchTxtTo = aP2;
      wcsustitucionprocesosprogramasgetfilterdata.this.aP3 = aP3;
      wcsustitucionprocesosprogramasgetfilterdata.this.aP4 = aP4;
      wcsustitucionprocesosprogramasgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_MACPROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMACPROCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_MACPRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMACPRODSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_MACPRODSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADMACPRODSC2OPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV29Session.getValue("FormulacionTinte.WCSustitucionProcesosProgramasGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSustitucionProcesosProgramasGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FormulacionTinte.WCSustitucionProcesosProgramasGridState"), null, null);
      }
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD") == 0 )
         {
            AV10TFMacProCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD_SEL") == 0 )
         {
            AV11TFMacProCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC") == 0 )
         {
            AV12TFMacProDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC_SEL") == 0 )
         {
            AV13TFMacProDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2") == 0 )
         {
            AV14TFMacProDsc2 = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2_SEL") == 0 )
         {
            AV15TFMacProDsc2_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV35ProForCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORDSC") == 0 )
         {
            AV39ProforDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMACPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMacProCod = AV16SearchTxt ;
      AV11TFMacProCod_Sel = "" ;
      AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod = AV10TFMacProCod ;
      AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel = AV11TFMacProCod_Sel ;
      AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc = AV12TFMacProDsc ;
      AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel = AV13TFMacProDsc_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 = AV14TFMacProDsc2 ;
      AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel = AV15TFMacProDsc2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel ,
                                           AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod ,
                                           AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel ,
                                           AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc ,
                                           AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel ,
                                           AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 ,
                                           A1514MacProCod ,
                                           A1515MacProDsc ,
                                           A6231MacProDsc2 ,
                                           A764ProForCod ,
                                           AV35ProForCod ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod), 6, "%") ;
      lV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc), 20, "%") ;
      lV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2), 60, "%") ;
      /* Using cursor P08J42 */
      pr_default.execute(0, new Object[] {AV34Emprcod, AV35ProForCod, lV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod, AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel, lV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc, AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel, lV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2, AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8J42 = false ;
         A396EmprCod = P08J42_A396EmprCod[0] ;
         A1514MacProCod = P08J42_A1514MacProCod[0] ;
         A764ProForCod = P08J42_A764ProForCod[0] ;
         A6231MacProDsc2 = P08J42_A6231MacProDsc2[0] ;
         A1515MacProDsc = P08J42_A1515MacProDsc[0] ;
         A1517MacProLin = P08J42_A1517MacProLin[0] ;
         A6231MacProDsc2 = P08J42_A6231MacProDsc2[0] ;
         A1515MacProDsc = P08J42_A1515MacProDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08J42_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08J42_A1514MacProCod[0], A1514MacProCod) == 0 ) )
         {
            brk8J42 = false ;
            A1517MacProLin = P08J42_A1517MacProLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8J42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1514MacProCod)==0) )
         {
            AV20Option = A1514MacProCod ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8J42 )
         {
            brk8J42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMACPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMacProDsc = AV16SearchTxt ;
      AV13TFMacProDsc_Sel = "" ;
      AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod = AV10TFMacProCod ;
      AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel = AV11TFMacProCod_Sel ;
      AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc = AV12TFMacProDsc ;
      AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel = AV13TFMacProDsc_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 = AV14TFMacProDsc2 ;
      AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel = AV15TFMacProDsc2_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel ,
                                           AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod ,
                                           AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel ,
                                           AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc ,
                                           AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel ,
                                           AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 ,
                                           A1514MacProCod ,
                                           A1515MacProDsc ,
                                           A6231MacProDsc2 ,
                                           A764ProForCod ,
                                           AV35ProForCod ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod), 6, "%") ;
      lV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc), 20, "%") ;
      lV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2), 60, "%") ;
      /* Using cursor P08J43 */
      pr_default.execute(1, new Object[] {AV34Emprcod, AV35ProForCod, lV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod, AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel, lV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc, AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel, lV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2, AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8J44 = false ;
         A1514MacProCod = P08J43_A1514MacProCod[0] ;
         A396EmprCod = P08J43_A396EmprCod[0] ;
         A764ProForCod = P08J43_A764ProForCod[0] ;
         A6231MacProDsc2 = P08J43_A6231MacProDsc2[0] ;
         A1515MacProDsc = P08J43_A1515MacProDsc[0] ;
         A1517MacProLin = P08J43_A1517MacProLin[0] ;
         A6231MacProDsc2 = P08J43_A6231MacProDsc2[0] ;
         A1515MacProDsc = P08J43_A1515MacProDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08J43_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08J43_A1514MacProCod[0], A1514MacProCod) == 0 ) )
         {
            brk8J44 = false ;
            A1517MacProLin = P08J43_A1517MacProLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8J44 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A1515MacProDsc)==0) )
         {
            AV20Option = A1515MacProDsc ;
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
         if ( ! brk8J44 )
         {
            brk8J44 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMACPRODSC2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFMacProDsc2 = AV16SearchTxt ;
      AV15TFMacProDsc2_Sel = "" ;
      AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod = AV10TFMacProCod ;
      AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel = AV11TFMacProCod_Sel ;
      AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc = AV12TFMacProDsc ;
      AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel = AV13TFMacProDsc_Sel ;
      AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 = AV14TFMacProDsc2 ;
      AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel = AV15TFMacProDsc2_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel ,
                                           AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod ,
                                           AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel ,
                                           AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc ,
                                           AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel ,
                                           AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 ,
                                           A1514MacProCod ,
                                           A1515MacProDsc ,
                                           A6231MacProDsc2 ,
                                           A396EmprCod ,
                                           AV34Emprcod ,
                                           A764ProForCod ,
                                           AV35ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod), 6, "%") ;
      lV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc), 20, "%") ;
      lV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2), 60, "%") ;
      /* Using cursor P08J44 */
      pr_default.execute(2, new Object[] {AV34Emprcod, AV35ProForCod, lV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod, AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel, lV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc, AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel, lV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2, AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8J46 = false ;
         A396EmprCod = P08J44_A396EmprCod[0] ;
         A764ProForCod = P08J44_A764ProForCod[0] ;
         A6231MacProDsc2 = P08J44_A6231MacProDsc2[0] ;
         A1515MacProDsc = P08J44_A1515MacProDsc[0] ;
         A1514MacProCod = P08J44_A1514MacProCod[0] ;
         A1517MacProLin = P08J44_A1517MacProLin[0] ;
         A6231MacProDsc2 = P08J44_A6231MacProDsc2[0] ;
         A1515MacProDsc = P08J44_A1515MacProDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08J44_A6231MacProDsc2[0], A6231MacProDsc2) == 0 ) )
         {
            brk8J46 = false ;
            A396EmprCod = P08J44_A396EmprCod[0] ;
            A1514MacProCod = P08J44_A1514MacProCod[0] ;
            A1517MacProLin = P08J44_A1517MacProLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8J46 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A6231MacProDsc2)==0) )
         {
            AV20Option = A6231MacProDsc2 ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8J46 )
         {
            brk8J46 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcsustitucionprocesosprogramasgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcsustitucionprocesosprogramasgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcsustitucionprocesosprogramasgetfilterdata.this.AV27OptionIndexesJson;
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
      AV10TFMacProCod = "" ;
      AV11TFMacProCod_Sel = "" ;
      AV12TFMacProDsc = "" ;
      AV13TFMacProDsc_Sel = "" ;
      AV14TFMacProDsc2 = "" ;
      AV15TFMacProDsc2_Sel = "" ;
      AV34Emprcod = "" ;
      AV35ProForCod = "" ;
      AV39ProforDsc = "" ;
      A1514MacProCod = "" ;
      AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod = "" ;
      AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel = "" ;
      AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc = "" ;
      AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel = "" ;
      AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 = "" ;
      AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel = "" ;
      scmdbuf = "" ;
      lV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod = "" ;
      lV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc = "" ;
      lV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 = "" ;
      A1515MacProDsc = "" ;
      A6231MacProDsc2 = "" ;
      A764ProForCod = "" ;
      A396EmprCod = "" ;
      P08J42_A396EmprCod = new String[] {""} ;
      P08J42_A1514MacProCod = new String[] {""} ;
      P08J42_A764ProForCod = new String[] {""} ;
      P08J42_A6231MacProDsc2 = new String[] {""} ;
      P08J42_A1515MacProDsc = new String[] {""} ;
      P08J42_A1517MacProLin = new short[1] ;
      AV20Option = "" ;
      P08J43_A1514MacProCod = new String[] {""} ;
      P08J43_A396EmprCod = new String[] {""} ;
      P08J43_A764ProForCod = new String[] {""} ;
      P08J43_A6231MacProDsc2 = new String[] {""} ;
      P08J43_A1515MacProDsc = new String[] {""} ;
      P08J43_A1517MacProLin = new short[1] ;
      P08J44_A396EmprCod = new String[] {""} ;
      P08J44_A764ProForCod = new String[] {""} ;
      P08J44_A6231MacProDsc2 = new String[] {""} ;
      P08J44_A1515MacProDsc = new String[] {""} ;
      P08J44_A1514MacProCod = new String[] {""} ;
      P08J44_A1517MacProLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsustitucionprocesosprogramasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08J42_A396EmprCod, P08J42_A1514MacProCod, P08J42_A764ProForCod, P08J42_A6231MacProDsc2, P08J42_A1515MacProDsc, P08J42_A1517MacProLin
            }
            , new Object[] {
            P08J43_A1514MacProCod, P08J43_A396EmprCod, P08J43_A764ProForCod, P08J43_A6231MacProDsc2, P08J43_A1515MacProDsc, P08J43_A1517MacProLin
            }
            , new Object[] {
            P08J44_A396EmprCod, P08J44_A764ProForCod, P08J44_A6231MacProDsc2, P08J44_A1515MacProDsc, P08J44_A1514MacProCod, P08J44_A1517MacProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1517MacProLin ;
   private short Gx_err ;
   private int AV78GXV1 ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private String AV10TFMacProCod ;
   private String AV11TFMacProCod_Sel ;
   private String AV12TFMacProDsc ;
   private String AV13TFMacProDsc_Sel ;
   private String AV14TFMacProDsc2 ;
   private String AV15TFMacProDsc2_Sel ;
   private String AV34Emprcod ;
   private String AV35ProForCod ;
   private String AV39ProforDsc ;
   private String A1514MacProCod ;
   private String AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod ;
   private String AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel ;
   private String AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc ;
   private String AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel ;
   private String AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 ;
   private String AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel ;
   private String scmdbuf ;
   private String lV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod ;
   private String lV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc ;
   private String lV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 ;
   private String A1515MacProDsc ;
   private String A6231MacProDsc2 ;
   private String A764ProForCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8J42 ;
   private boolean brk8J44 ;
   private boolean brk8J46 ;
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
   private String[] P08J42_A396EmprCod ;
   private String[] P08J42_A1514MacProCod ;
   private String[] P08J42_A764ProForCod ;
   private String[] P08J42_A6231MacProDsc2 ;
   private String[] P08J42_A1515MacProDsc ;
   private short[] P08J42_A1517MacProLin ;
   private String[] P08J43_A1514MacProCod ;
   private String[] P08J43_A396EmprCod ;
   private String[] P08J43_A764ProForCod ;
   private String[] P08J43_A6231MacProDsc2 ;
   private String[] P08J43_A1515MacProDsc ;
   private short[] P08J43_A1517MacProLin ;
   private String[] P08J44_A396EmprCod ;
   private String[] P08J44_A764ProForCod ;
   private String[] P08J44_A6231MacProDsc2 ;
   private String[] P08J44_A1515MacProDsc ;
   private String[] P08J44_A1514MacProCod ;
   private short[] P08J44_A1517MacProLin ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcsustitucionprocesosprogramasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08J42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel ,
                                          String AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod ,
                                          String AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc ,
                                          String AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel ,
                                          String AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 ,
                                          String A1514MacProCod ,
                                          String A1515MacProDsc ,
                                          String A6231MacProDsc2 ,
                                          String A764ProForCod ,
                                          String AV35ProForCod ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MacProCod, T1.ProForCod, T2.MacProDsc2, T2.MacProDsc, T1.MacProLin FROM (TXPLMACPR T1 INNER JOIN TXPCMACPR T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.MacProCod = T1.MacProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( (GXutil.strcmp("", AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MacProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MacProCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MacProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MacProDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MacProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MacProDsc2 = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MacProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08J43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel ,
                                          String AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod ,
                                          String AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc ,
                                          String AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel ,
                                          String AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 ,
                                          String A1514MacProCod ,
                                          String A1515MacProDsc ,
                                          String A6231MacProDsc2 ,
                                          String A764ProForCod ,
                                          String AV35ProForCod ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[8];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.MacProCod, T1.EmprCod, T1.ProForCod, T2.MacProDsc2, T2.MacProDsc, T1.MacProLin FROM (TXPLMACPR T1 INNER JOIN TXPCMACPR T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.MacProCod = T1.MacProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( (GXutil.strcmp("", AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MacProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MacProCod = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MacProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MacProDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MacProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MacProDsc2 = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MacProCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08J44( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel ,
                                          String AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod ,
                                          String AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel ,
                                          String AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc ,
                                          String AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel ,
                                          String AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2 ,
                                          String A1514MacProCod ,
                                          String A1515MacProDsc ,
                                          String A6231MacProDsc2 ,
                                          String A396EmprCod ,
                                          String AV34Emprcod ,
                                          String A764ProForCod ,
                                          String AV35ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[8];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProForCod, T2.MacProDsc2, T2.MacProDsc, T1.MacProCod, T1.MacProLin FROM (TXPLMACPR T1 INNER JOIN TXPCMACPR T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.MacProCod = T1.MacProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProForCod = ?)");
      if ( (GXutil.strcmp("", AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcsustitucionprocesosprogramasds_1_tfmacprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MacProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcsustitucionprocesosprogramasds_2_tfmacprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MacProCod = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsustitucionprocesosprogramasds_3_tfmacprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MacProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsustitucionprocesosprogramasds_4_tfmacprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MacProDsc = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcsustitucionprocesosprogramasds_5_tfmacprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MacProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcsustitucionprocesosprogramasds_6_tfmacprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MacProDsc2 = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.MacProDsc2" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P08J42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P08J43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P08J44(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08J42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08J43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08J44", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 60);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 60);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 60);
               }
               return;
      }
   }

}

