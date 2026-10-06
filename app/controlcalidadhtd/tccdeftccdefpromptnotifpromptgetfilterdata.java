package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tccdeftccdefpromptnotifpromptgetfilterdata extends GXProcedure
{
   public tccdeftccdefpromptnotifpromptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tccdeftccdefpromptnotifpromptgetfilterdata.class ), "" );
   }

   public tccdeftccdefpromptnotifpromptgetfilterdata( int remoteHandle ,
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
      tccdeftccdefpromptnotifpromptgetfilterdata.this.aP5 = new String[] {""};
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
      tccdeftccdefpromptnotifpromptgetfilterdata.this.AV32DDOName = aP0;
      tccdeftccdefpromptnotifpromptgetfilterdata.this.AV33SearchTxt = aP1;
      tccdeftccdefpromptnotifpromptgetfilterdata.this.AV34SearchTxtTo = aP2;
      tccdeftccdefpromptnotifpromptgetfilterdata.this.aP3 = aP3;
      tccdeftccdefpromptnotifpromptgetfilterdata.this.aP4 = aP4;
      tccdeftccdefpromptnotifpromptgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_CCTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_CCTNOTEML") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTNOTEMLOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("ControlCalidadHTD.TCCDefTCCDEFPromptNotifPromptGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.TCCDefTCCDEFPromptNotifPromptGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("ControlCalidadHTD.TCCDefTCCDEFPromptNotifPromptGridState"), null, null);
      }
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTNOTID") == 0 )
         {
            AV40TFCCTNotId = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFCCTNotId_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV12TFEmprNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV13TFEmprNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV16TFCCTDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV17TFCCTDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTNOTEML") == 0 )
         {
            AV42TFCCTNotEml = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTNOTEML_SEL") == 0 )
         {
            AV43TFCCTNotEml_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV33SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV38FilterFullText ,
                                           Short.valueOf(AV40TFCCTNotId) ,
                                           Short.valueOf(AV41TFCCTNotId_To) ,
                                           AV13TFEmprNom_Sel ,
                                           AV12TFEmprNom ,
                                           AV17TFCCTDsc_Sel ,
                                           AV16TFCCTDsc ,
                                           AV43TFCCTNotEml_Sel ,
                                           AV42TFCCTNotEml ,
                                           Short.valueOf(A11481CCTNotId) ,
                                           A407EmprNom ,
                                           A4036CCTDsc ,
                                           A11480CCTNotEml } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV12TFEmprNom = GXutil.padr( GXutil.rtrim( AV12TFEmprNom), 30, "%") ;
      lV16TFCCTDsc = GXutil.padr( GXutil.rtrim( AV16TFCCTDsc), 30, "%") ;
      lV42TFCCTNotEml = GXutil.padr( GXutil.rtrim( AV42TFCCTNotEml), 120, "%") ;
      /* Using cursor P09OV2 */
      pr_default.execute(0, new Object[] {lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, Short.valueOf(AV40TFCCTNotId), Short.valueOf(AV41TFCCTNotId_To), lV12TFEmprNom, AV13TFEmprNom_Sel, lV16TFCCTDsc, AV17TFCCTDsc_Sel, lV42TFCCTNotEml, AV43TFCCTNotEml_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9OV2 = false ;
         A4031CCTCod = P09OV2_A4031CCTCod[0] ;
         A396EmprCod = P09OV2_A396EmprCod[0] ;
         A11480CCTNotEml = P09OV2_A11480CCTNotEml[0] ;
         A4036CCTDsc = P09OV2_A4036CCTDsc[0] ;
         A407EmprNom = P09OV2_A407EmprNom[0] ;
         n407EmprNom = P09OV2_n407EmprNom[0] ;
         A11481CCTNotId = P09OV2_A11481CCTNotId[0] ;
         A407EmprNom = P09OV2_A407EmprNom[0] ;
         n407EmprNom = P09OV2_n407EmprNom[0] ;
         A4036CCTDsc = P09OV2_A4036CCTDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09OV2_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk9OV2 = false ;
            A4031CCTCod = P09OV2_A4031CCTCod[0] ;
            A11481CCTNotId = P09OV2_A11481CCTNotId[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9OV2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV21Option = A407EmprNom ;
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
         if ( ! brk9OV2 )
         {
            brk9OV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCCTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCCTDsc = AV33SearchTxt ;
      AV17TFCCTDsc_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV38FilterFullText ,
                                           Short.valueOf(AV40TFCCTNotId) ,
                                           Short.valueOf(AV41TFCCTNotId_To) ,
                                           AV13TFEmprNom_Sel ,
                                           AV12TFEmprNom ,
                                           AV17TFCCTDsc_Sel ,
                                           AV16TFCCTDsc ,
                                           AV43TFCCTNotEml_Sel ,
                                           AV42TFCCTNotEml ,
                                           Short.valueOf(A11481CCTNotId) ,
                                           A407EmprNom ,
                                           A4036CCTDsc ,
                                           A11480CCTNotEml } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV12TFEmprNom = GXutil.padr( GXutil.rtrim( AV12TFEmprNom), 30, "%") ;
      lV16TFCCTDsc = GXutil.padr( GXutil.rtrim( AV16TFCCTDsc), 30, "%") ;
      lV42TFCCTNotEml = GXutil.padr( GXutil.rtrim( AV42TFCCTNotEml), 120, "%") ;
      /* Using cursor P09OV3 */
      pr_default.execute(1, new Object[] {lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, Short.valueOf(AV40TFCCTNotId), Short.valueOf(AV41TFCCTNotId_To), lV12TFEmprNom, AV13TFEmprNom_Sel, lV16TFCCTDsc, AV17TFCCTDsc_Sel, lV42TFCCTNotEml, AV43TFCCTNotEml_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9OV4 = false ;
         A396EmprCod = P09OV3_A396EmprCod[0] ;
         A4031CCTCod = P09OV3_A4031CCTCod[0] ;
         A4036CCTDsc = P09OV3_A4036CCTDsc[0] ;
         A11480CCTNotEml = P09OV3_A11480CCTNotEml[0] ;
         A407EmprNom = P09OV3_A407EmprNom[0] ;
         n407EmprNom = P09OV3_n407EmprNom[0] ;
         A11481CCTNotId = P09OV3_A11481CCTNotId[0] ;
         A407EmprNom = P09OV3_A407EmprNom[0] ;
         n407EmprNom = P09OV3_n407EmprNom[0] ;
         A4036CCTDsc = P09OV3_A4036CCTDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09OV3_A4036CCTDsc[0], A4036CCTDsc) == 0 ) )
         {
            brk9OV4 = false ;
            A396EmprCod = P09OV3_A396EmprCod[0] ;
            A4031CCTCod = P09OV3_A4031CCTCod[0] ;
            A11481CCTNotId = P09OV3_A11481CCTNotId[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9OV4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4036CCTDsc)==0) )
         {
            AV21Option = A4036CCTDsc ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OV4 )
         {
            brk9OV4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCCTNOTEMLOPTIONS' Routine */
      returnInSub = false ;
      AV42TFCCTNotEml = AV33SearchTxt ;
      AV43TFCCTNotEml_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV38FilterFullText ,
                                           Short.valueOf(AV40TFCCTNotId) ,
                                           Short.valueOf(AV41TFCCTNotId_To) ,
                                           AV13TFEmprNom_Sel ,
                                           AV12TFEmprNom ,
                                           AV17TFCCTDsc_Sel ,
                                           AV16TFCCTDsc ,
                                           AV43TFCCTNotEml_Sel ,
                                           AV42TFCCTNotEml ,
                                           Short.valueOf(A11481CCTNotId) ,
                                           A407EmprNom ,
                                           A4036CCTDsc ,
                                           A11480CCTNotEml } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV12TFEmprNom = GXutil.padr( GXutil.rtrim( AV12TFEmprNom), 30, "%") ;
      lV16TFCCTDsc = GXutil.padr( GXutil.rtrim( AV16TFCCTDsc), 30, "%") ;
      lV42TFCCTNotEml = GXutil.padr( GXutil.rtrim( AV42TFCCTNotEml), 120, "%") ;
      /* Using cursor P09OV4 */
      pr_default.execute(2, new Object[] {lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, Short.valueOf(AV40TFCCTNotId), Short.valueOf(AV41TFCCTNotId_To), lV12TFEmprNom, AV13TFEmprNom_Sel, lV16TFCCTDsc, AV17TFCCTDsc_Sel, lV42TFCCTNotEml, AV43TFCCTNotEml_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9OV6 = false ;
         A396EmprCod = P09OV4_A396EmprCod[0] ;
         A4031CCTCod = P09OV4_A4031CCTCod[0] ;
         A11480CCTNotEml = P09OV4_A11480CCTNotEml[0] ;
         A4036CCTDsc = P09OV4_A4036CCTDsc[0] ;
         A407EmprNom = P09OV4_A407EmprNom[0] ;
         n407EmprNom = P09OV4_n407EmprNom[0] ;
         A11481CCTNotId = P09OV4_A11481CCTNotId[0] ;
         A407EmprNom = P09OV4_A407EmprNom[0] ;
         n407EmprNom = P09OV4_n407EmprNom[0] ;
         A4036CCTDsc = P09OV4_A4036CCTDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09OV4_A11480CCTNotEml[0], A11480CCTNotEml) == 0 ) )
         {
            brk9OV6 = false ;
            A396EmprCod = P09OV4_A396EmprCod[0] ;
            A4031CCTCod = P09OV4_A4031CCTCod[0] ;
            A11481CCTNotId = P09OV4_A11481CCTNotId[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9OV6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11480CCTNotEml)==0) )
         {
            AV21Option = A11480CCTNotEml ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9OV6 )
         {
            brk9OV6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tccdeftccdefpromptnotifpromptgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = tccdeftccdefpromptnotifpromptgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = tccdeftccdefpromptnotifpromptgetfilterdata.this.AV37OptionIndexesJson;
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
      AV12TFEmprNom = "" ;
      AV13TFEmprNom_Sel = "" ;
      AV16TFCCTDsc = "" ;
      AV17TFCCTDsc_Sel = "" ;
      AV42TFCCTNotEml = "" ;
      AV43TFCCTNotEml_Sel = "" ;
      scmdbuf = "" ;
      lV38FilterFullText = "" ;
      lV12TFEmprNom = "" ;
      lV16TFCCTDsc = "" ;
      lV42TFCCTNotEml = "" ;
      A407EmprNom = "" ;
      A4036CCTDsc = "" ;
      A11480CCTNotEml = "" ;
      P09OV2_A4031CCTCod = new int[1] ;
      P09OV2_A396EmprCod = new String[] {""} ;
      P09OV2_A11480CCTNotEml = new String[] {""} ;
      P09OV2_A4036CCTDsc = new String[] {""} ;
      P09OV2_A407EmprNom = new String[] {""} ;
      P09OV2_n407EmprNom = new boolean[] {false} ;
      P09OV2_A11481CCTNotId = new short[1] ;
      A396EmprCod = "" ;
      AV21Option = "" ;
      P09OV3_A396EmprCod = new String[] {""} ;
      P09OV3_A4031CCTCod = new int[1] ;
      P09OV3_A4036CCTDsc = new String[] {""} ;
      P09OV3_A11480CCTNotEml = new String[] {""} ;
      P09OV3_A407EmprNom = new String[] {""} ;
      P09OV3_n407EmprNom = new boolean[] {false} ;
      P09OV3_A11481CCTNotId = new short[1] ;
      P09OV4_A396EmprCod = new String[] {""} ;
      P09OV4_A4031CCTCod = new int[1] ;
      P09OV4_A11480CCTNotEml = new String[] {""} ;
      P09OV4_A4036CCTDsc = new String[] {""} ;
      P09OV4_A407EmprNom = new String[] {""} ;
      P09OV4_n407EmprNom = new boolean[] {false} ;
      P09OV4_A11481CCTNotId = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdeftccdefpromptnotifpromptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09OV2_A4031CCTCod, P09OV2_A396EmprCod, P09OV2_A11480CCTNotEml, P09OV2_A4036CCTDsc, P09OV2_A407EmprNom, P09OV2_n407EmprNom, P09OV2_A11481CCTNotId
            }
            , new Object[] {
            P09OV3_A396EmprCod, P09OV3_A4031CCTCod, P09OV3_A4036CCTDsc, P09OV3_A11480CCTNotEml, P09OV3_A407EmprNom, P09OV3_n407EmprNom, P09OV3_A11481CCTNotId
            }
            , new Object[] {
            P09OV4_A396EmprCod, P09OV4_A4031CCTCod, P09OV4_A11480CCTNotEml, P09OV4_A4036CCTDsc, P09OV4_A407EmprNom, P09OV4_n407EmprNom, P09OV4_A11481CCTNotId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV40TFCCTNotId ;
   private short AV41TFCCTNotId_To ;
   private short A11481CCTNotId ;
   private short Gx_err ;
   private int AV62GXV1 ;
   private int A4031CCTCod ;
   private int AV20InsertIndex ;
   private long AV26count ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String AV16TFCCTDsc ;
   private String AV17TFCCTDsc_Sel ;
   private String AV42TFCCTNotEml ;
   private String AV43TFCCTNotEml_Sel ;
   private String scmdbuf ;
   private String lV12TFEmprNom ;
   private String lV16TFCCTDsc ;
   private String lV42TFCCTNotEml ;
   private String A407EmprNom ;
   private String A4036CCTDsc ;
   private String A11480CCTNotEml ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9OV2 ;
   private boolean n407EmprNom ;
   private boolean brk9OV4 ;
   private boolean brk9OV6 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV38FilterFullText ;
   private String lV38FilterFullText ;
   private String AV21Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09OV2_A4031CCTCod ;
   private String[] P09OV2_A396EmprCod ;
   private String[] P09OV2_A11480CCTNotEml ;
   private String[] P09OV2_A4036CCTDsc ;
   private String[] P09OV2_A407EmprNom ;
   private boolean[] P09OV2_n407EmprNom ;
   private short[] P09OV2_A11481CCTNotId ;
   private String[] P09OV3_A396EmprCod ;
   private int[] P09OV3_A4031CCTCod ;
   private String[] P09OV3_A4036CCTDsc ;
   private String[] P09OV3_A11480CCTNotEml ;
   private String[] P09OV3_A407EmprNom ;
   private boolean[] P09OV3_n407EmprNom ;
   private short[] P09OV3_A11481CCTNotId ;
   private String[] P09OV4_A396EmprCod ;
   private int[] P09OV4_A4031CCTCod ;
   private String[] P09OV4_A11480CCTNotEml ;
   private String[] P09OV4_A4036CCTDsc ;
   private String[] P09OV4_A407EmprNom ;
   private boolean[] P09OV4_n407EmprNom ;
   private short[] P09OV4_A11481CCTNotId ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tccdeftccdefpromptnotifpromptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV38FilterFullText ,
                                          short AV40TFCCTNotId ,
                                          short AV41TFCCTNotId_To ,
                                          String AV13TFEmprNom_Sel ,
                                          String AV12TFEmprNom ,
                                          String AV17TFCCTDsc_Sel ,
                                          String AV16TFCCTDsc ,
                                          String AV43TFCCTNotEml_Sel ,
                                          String AV42TFCCTNotEml ,
                                          short A11481CCTNotId ,
                                          String A407EmprNom ,
                                          String A4036CCTDsc ,
                                          String A11480CCTNotEml )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CCTCod, T1.EmprCod, T1.CCTNotEml, T3.CCTDsc, T2.EmprNom, T1.CCTNotId FROM ((TXPCCDefN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN" ;
      scmdbuf += " TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV38FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CCTNotId,'9990'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTNotEml) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCCTNotId) )
      {
         addWhere(sWhereString, "(T1.CCTNotId >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV41TFCCTNotId_To) )
      {
         addWhere(sWhereString, "(T1.CCTNotId <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFEmprNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCCTDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCCTNotEml_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCCTNotEml)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTNotEml) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCCTNotEml_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTNotEml = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09OV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV38FilterFullText ,
                                          short AV40TFCCTNotId ,
                                          short AV41TFCCTNotId_To ,
                                          String AV13TFEmprNom_Sel ,
                                          String AV12TFEmprNom ,
                                          String AV17TFCCTDsc_Sel ,
                                          String AV16TFCCTDsc ,
                                          String AV43TFCCTNotEml_Sel ,
                                          String AV42TFCCTNotEml ,
                                          short A11481CCTNotId ,
                                          String A407EmprNom ,
                                          String A4036CCTDsc ,
                                          String A11480CCTNotEml )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCTCod, T3.CCTDsc, T1.CCTNotEml, T2.EmprNom, T1.CCTNotId FROM ((TXPCCDefN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN" ;
      scmdbuf += " TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV38FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CCTNotId,'9990'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTNotEml) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCCTNotId) )
      {
         addWhere(sWhereString, "(T1.CCTNotId >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV41TFCCTNotId_To) )
      {
         addWhere(sWhereString, "(T1.CCTNotId <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFEmprNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCCTDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCCTNotEml_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCCTNotEml)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTNotEml) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCCTNotEml_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTNotEml = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CCTDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09OV4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV38FilterFullText ,
                                          short AV40TFCCTNotId ,
                                          short AV41TFCCTNotId_To ,
                                          String AV13TFEmprNom_Sel ,
                                          String AV12TFEmprNom ,
                                          String AV17TFCCTDsc_Sel ,
                                          String AV16TFCCTDsc ,
                                          String AV43TFCCTNotEml_Sel ,
                                          String AV42TFCCTNotEml ,
                                          short A11481CCTNotId ,
                                          String A407EmprNom ,
                                          String A4036CCTDsc ,
                                          String A11480CCTNotEml )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCTCod, T1.CCTNotEml, T3.CCTDsc, T2.EmprNom, T1.CCTNotId FROM ((TXPCCDefN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN" ;
      scmdbuf += " TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV38FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CCTNotId,'9990'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTNotEml) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV40TFCCTNotId) )
      {
         addWhere(sWhereString, "(T1.CCTNotId >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV41TFCCTNotId_To) )
      {
         addWhere(sWhereString, "(T1.CCTNotId <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFEmprNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCCTDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43TFCCTNotEml_Sel)==0) && ( ! (GXutil.strcmp("", AV42TFCCTNotEml)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTNotEml) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFCCTNotEml_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTNotEml = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCTNotEml" ;
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
                  return conditional_P09OV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P09OV3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P09OV4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OV4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 120);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 120);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 120);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 120);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 120);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 120);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 120);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 120);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 120);
               }
               return;
      }
   }

}

