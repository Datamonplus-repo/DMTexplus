package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tccdefpromptgetfilterdata extends GXProcedure
{
   public tccdefpromptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tccdefpromptgetfilterdata.class ), "" );
   }

   public tccdefpromptgetfilterdata( int remoteHandle ,
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
      tccdefpromptgetfilterdata.this.aP5 = new String[] {""};
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
      tccdefpromptgetfilterdata.this.AV32DDOName = aP0;
      tccdefpromptgetfilterdata.this.AV33SearchTxt = aP1;
      tccdefpromptgetfilterdata.this.AV34SearchTxtTo = aP2;
      tccdefpromptgetfilterdata.this.aP3 = aP3;
      tccdefpromptgetfilterdata.this.aP4 = aP4;
      tccdefpromptgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S131 ();
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
      if ( GXutil.strcmp(AV27Session.getValue("ControlCalidadHTD.TCCDefPromptGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.TCCDefPromptGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("ControlCalidadHTD.TCCDefPromptGridState"), null, null);
      }
      AV42GXV1 = 1 ;
      while ( AV42GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV42GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV12TFEmprNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV13TFEmprNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTCOD") == 0 )
         {
            AV14TFCCTCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCCTCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV16TFCCTDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV17TFCCTDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTTPOCTR_SEL") == 0 )
         {
            AV18TFCCTTpoCtr_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV19TFCCTTpoCtr_Sels.fromJSonString(AV18TFCCTTpoCtr_SelsJson, null);
         }
         AV42GXV1 = (int)(AV42GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV33SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A4037CCTTpoCtr ,
                                           AV19TFCCTTpoCtr_Sels ,
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           AV13TFEmprNom_Sel ,
                                           AV12TFEmprNom ,
                                           Integer.valueOf(AV14TFCCTCod) ,
                                           Integer.valueOf(AV15TFCCTCod_To) ,
                                           AV17TFCCTDsc_Sel ,
                                           AV16TFCCTDsc ,
                                           Integer.valueOf(AV19TFCCTTpoCtr_Sels.size()) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           AV38FilterFullText } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV12TFEmprNom = GXutil.padr( GXutil.rtrim( AV12TFEmprNom), 30, "%") ;
      lV16TFCCTDsc = GXutil.padr( GXutil.rtrim( AV16TFCCTDsc), 30, "%") ;
      /* Using cursor P09OW2 */
      pr_default.execute(0, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, lV12TFEmprNom, AV13TFEmprNom_Sel, Integer.valueOf(AV14TFCCTCod), Integer.valueOf(AV15TFCCTCod_To), lV16TFCCTDsc, AV17TFCCTDsc_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9OW2 = false ;
         A396EmprCod = P09OW2_A396EmprCod[0] ;
         A4037CCTTpoCtr = P09OW2_A4037CCTTpoCtr[0] ;
         A4036CCTDsc = P09OW2_A4036CCTDsc[0] ;
         A4031CCTCod = P09OW2_A4031CCTCod[0] ;
         A407EmprNom = P09OW2_A407EmprNom[0] ;
         n407EmprNom = P09OW2_n407EmprNom[0] ;
         A407EmprNom = P09OW2_A407EmprNom[0] ;
         n407EmprNom = P09OW2_n407EmprNom[0] ;
         if ( (GXutil.strcmp("", AV38FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4031CCTCod, 6, 0) , GXutil.padr( "%" + AV38FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4036CCTDsc) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "iso (externo)", "") , GXutil.padr( "%" + GXutil.lower( AV38FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "interno", "") , GXutil.padr( "%" + GXutil.lower( AV38FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, "I") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "defectos", "") , GXutil.padr( "%" + GXutil.lower( AV38FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, "D") == 0 ) ) ) )
         {
            AV26count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09OW2_A396EmprCod[0], A396EmprCod) == 0 ) )
            {
               brk9OW2 = false ;
               A4031CCTCod = P09OW2_A4031CCTCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk9OW2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
            {
               AV21Option = A396EmprCod ;
               AV23OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
               AV22Options.add(AV21Option, 0);
               AV24OptionsDesc.add(AV23OptionDesc, 0);
               AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV22Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9OW2 )
         {
            brk9OW2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV33SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A4037CCTTpoCtr ,
                                           AV19TFCCTTpoCtr_Sels ,
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           AV13TFEmprNom_Sel ,
                                           AV12TFEmprNom ,
                                           Integer.valueOf(AV14TFCCTCod) ,
                                           Integer.valueOf(AV15TFCCTCod_To) ,
                                           AV17TFCCTDsc_Sel ,
                                           AV16TFCCTDsc ,
                                           Integer.valueOf(AV19TFCCTTpoCtr_Sels.size()) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           AV38FilterFullText } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV12TFEmprNom = GXutil.padr( GXutil.rtrim( AV12TFEmprNom), 30, "%") ;
      lV16TFCCTDsc = GXutil.padr( GXutil.rtrim( AV16TFCCTDsc), 30, "%") ;
      /* Using cursor P09OW3 */
      pr_default.execute(1, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, lV12TFEmprNom, AV13TFEmprNom_Sel, Integer.valueOf(AV14TFCCTCod), Integer.valueOf(AV15TFCCTCod_To), lV16TFCCTDsc, AV17TFCCTDsc_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9OW4 = false ;
         A396EmprCod = P09OW3_A396EmprCod[0] ;
         A4037CCTTpoCtr = P09OW3_A4037CCTTpoCtr[0] ;
         A4036CCTDsc = P09OW3_A4036CCTDsc[0] ;
         A4031CCTCod = P09OW3_A4031CCTCod[0] ;
         A407EmprNom = P09OW3_A407EmprNom[0] ;
         n407EmprNom = P09OW3_n407EmprNom[0] ;
         A407EmprNom = P09OW3_A407EmprNom[0] ;
         n407EmprNom = P09OW3_n407EmprNom[0] ;
         if ( (GXutil.strcmp("", AV38FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4031CCTCod, 6, 0) , GXutil.padr( "%" + AV38FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4036CCTDsc) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "iso (externo)", "") , GXutil.padr( "%" + GXutil.lower( AV38FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "interno", "") , GXutil.padr( "%" + GXutil.lower( AV38FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, "I") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "defectos", "") , GXutil.padr( "%" + GXutil.lower( AV38FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, "D") == 0 ) ) ) )
         {
            AV26count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09OW3_A396EmprCod[0], A396EmprCod) == 0 ) )
            {
               brk9OW4 = false ;
               A4031CCTCod = P09OW3_A4031CCTCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk9OW4 = true ;
               pr_default.readNext(1);
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
         }
         if ( ! brk9OW4 )
         {
            brk9OW4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCCTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCCTDsc = AV33SearchTxt ;
      AV17TFCCTDsc_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A4037CCTTpoCtr ,
                                           AV19TFCCTTpoCtr_Sels ,
                                           AV11TFEmprCod_Sel ,
                                           AV10TFEmprCod ,
                                           AV13TFEmprNom_Sel ,
                                           AV12TFEmprNom ,
                                           Integer.valueOf(AV14TFCCTCod) ,
                                           Integer.valueOf(AV15TFCCTCod_To) ,
                                           AV17TFCCTDsc_Sel ,
                                           AV16TFCCTDsc ,
                                           Integer.valueOf(AV19TFCCTTpoCtr_Sels.size()) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           AV38FilterFullText } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFEmprCod = GXutil.padr( GXutil.rtrim( AV10TFEmprCod), 3, "%") ;
      lV12TFEmprNom = GXutil.padr( GXutil.rtrim( AV12TFEmprNom), 30, "%") ;
      lV16TFCCTDsc = GXutil.padr( GXutil.rtrim( AV16TFCCTDsc), 30, "%") ;
      /* Using cursor P09OW4 */
      pr_default.execute(2, new Object[] {lV10TFEmprCod, AV11TFEmprCod_Sel, lV12TFEmprNom, AV13TFEmprNom_Sel, Integer.valueOf(AV14TFCCTCod), Integer.valueOf(AV15TFCCTCod_To), lV16TFCCTDsc, AV17TFCCTDsc_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9OW6 = false ;
         A4036CCTDsc = P09OW4_A4036CCTDsc[0] ;
         A4037CCTTpoCtr = P09OW4_A4037CCTTpoCtr[0] ;
         A4031CCTCod = P09OW4_A4031CCTCod[0] ;
         A407EmprNom = P09OW4_A407EmprNom[0] ;
         n407EmprNom = P09OW4_n407EmprNom[0] ;
         A396EmprCod = P09OW4_A396EmprCod[0] ;
         A407EmprNom = P09OW4_A407EmprNom[0] ;
         n407EmprNom = P09OW4_n407EmprNom[0] ;
         if ( (GXutil.strcmp("", AV38FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A396EmprCod) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A407EmprNom) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4031CCTCod, 6, 0) , GXutil.padr( "%" + AV38FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4036CCTDsc) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "iso (externo)", "") , GXutil.padr( "%" + GXutil.lower( AV38FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "interno", "") , GXutil.padr( "%" + GXutil.lower( AV38FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, "I") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "defectos", "") , GXutil.padr( "%" + GXutil.lower( AV38FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4037CCTTpoCtr, "D") == 0 ) ) ) )
         {
            AV26count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09OW4_A4036CCTDsc[0], A4036CCTDsc) == 0 ) )
            {
               brk9OW6 = false ;
               A4031CCTCod = P09OW4_A4031CCTCod[0] ;
               A396EmprCod = P09OW4_A396EmprCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk9OW6 = true ;
               pr_default.readNext(2);
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
         }
         if ( ! brk9OW6 )
         {
            brk9OW6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tccdefpromptgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = tccdefpromptgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = tccdefpromptgetfilterdata.this.AV37OptionIndexesJson;
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
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFEmprNom = "" ;
      AV13TFEmprNom_Sel = "" ;
      AV16TFCCTDsc = "" ;
      AV17TFCCTDsc_Sel = "" ;
      AV18TFCCTTpoCtr_SelsJson = "" ;
      AV19TFCCTTpoCtr_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV10TFEmprCod = "" ;
      lV12TFEmprNom = "" ;
      lV16TFCCTDsc = "" ;
      A4037CCTTpoCtr = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A4036CCTDsc = "" ;
      P09OW2_A396EmprCod = new String[] {""} ;
      P09OW2_A4037CCTTpoCtr = new String[] {""} ;
      P09OW2_A4036CCTDsc = new String[] {""} ;
      P09OW2_A4031CCTCod = new int[1] ;
      P09OW2_A407EmprNom = new String[] {""} ;
      P09OW2_n407EmprNom = new boolean[] {false} ;
      AV21Option = "" ;
      AV23OptionDesc = "" ;
      P09OW3_A396EmprCod = new String[] {""} ;
      P09OW3_A4037CCTTpoCtr = new String[] {""} ;
      P09OW3_A4036CCTDsc = new String[] {""} ;
      P09OW3_A4031CCTCod = new int[1] ;
      P09OW3_A407EmprNom = new String[] {""} ;
      P09OW3_n407EmprNom = new boolean[] {false} ;
      P09OW4_A4036CCTDsc = new String[] {""} ;
      P09OW4_A4037CCTTpoCtr = new String[] {""} ;
      P09OW4_A4031CCTCod = new int[1] ;
      P09OW4_A407EmprNom = new String[] {""} ;
      P09OW4_n407EmprNom = new boolean[] {false} ;
      P09OW4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccdefpromptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09OW2_A396EmprCod, P09OW2_A4037CCTTpoCtr, P09OW2_A4036CCTDsc, P09OW2_A4031CCTCod, P09OW2_A407EmprNom, P09OW2_n407EmprNom
            }
            , new Object[] {
            P09OW3_A396EmprCod, P09OW3_A4037CCTTpoCtr, P09OW3_A4036CCTDsc, P09OW3_A4031CCTCod, P09OW3_A407EmprNom, P09OW3_n407EmprNom
            }
            , new Object[] {
            P09OW4_A4036CCTDsc, P09OW4_A4037CCTTpoCtr, P09OW4_A4031CCTCod, P09OW4_A407EmprNom, P09OW4_n407EmprNom, P09OW4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV42GXV1 ;
   private int AV14TFCCTCod ;
   private int AV15TFCCTCod_To ;
   private int AV19TFCCTTpoCtr_Sels_size ;
   private int A4031CCTCod ;
   private int AV20InsertIndex ;
   private long AV26count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String AV16TFCCTDsc ;
   private String AV17TFCCTDsc_Sel ;
   private String scmdbuf ;
   private String lV10TFEmprCod ;
   private String lV12TFEmprNom ;
   private String lV16TFCCTDsc ;
   private String A4037CCTTpoCtr ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A4036CCTDsc ;
   private boolean returnInSub ;
   private boolean brk9OW2 ;
   private boolean n407EmprNom ;
   private boolean brk9OW4 ;
   private boolean brk9OW6 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV18TFCCTTpoCtr_SelsJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV21Option ;
   private String AV23OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09OW2_A396EmprCod ;
   private String[] P09OW2_A4037CCTTpoCtr ;
   private String[] P09OW2_A4036CCTDsc ;
   private int[] P09OW2_A4031CCTCod ;
   private String[] P09OW2_A407EmprNom ;
   private boolean[] P09OW2_n407EmprNom ;
   private String[] P09OW3_A396EmprCod ;
   private String[] P09OW3_A4037CCTTpoCtr ;
   private String[] P09OW3_A4036CCTDsc ;
   private int[] P09OW3_A4031CCTCod ;
   private String[] P09OW3_A407EmprNom ;
   private boolean[] P09OW3_n407EmprNom ;
   private String[] P09OW4_A4036CCTDsc ;
   private String[] P09OW4_A4037CCTTpoCtr ;
   private int[] P09OW4_A4031CCTCod ;
   private String[] P09OW4_A407EmprNom ;
   private boolean[] P09OW4_n407EmprNom ;
   private String[] P09OW4_A396EmprCod ;
   private GXSimpleCollection<String> AV19TFCCTTpoCtr_Sels ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tccdefpromptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4037CCTTpoCtr ,
                                          GXSimpleCollection<String> AV19TFCCTTpoCtr_Sels ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          String AV13TFEmprNom_Sel ,
                                          String AV12TFEmprNom ,
                                          int AV14TFCCTCod ,
                                          int AV15TFCCTCod_To ,
                                          String AV17TFCCTDsc_Sel ,
                                          String AV16TFCCTDsc ,
                                          int AV19TFCCTTpoCtr_Sels_size ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          String AV38FilterFullText )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCTTpoCtr, T1.CCTDsc, T1.CCTCod, T2.EmprNom FROM (TXPCCDef T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFEmprNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCCTCod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCCTCod_To) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCCTDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV19TFCCTTpoCtr_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV19TFCCTTpoCtr_Sels, "T1.CCTTpoCtr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09OW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4037CCTTpoCtr ,
                                          GXSimpleCollection<String> AV19TFCCTTpoCtr_Sels ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          String AV13TFEmprNom_Sel ,
                                          String AV12TFEmprNom ,
                                          int AV14TFCCTCod ,
                                          int AV15TFCCTCod_To ,
                                          String AV17TFCCTDsc_Sel ,
                                          String AV16TFCCTDsc ,
                                          int AV19TFCCTTpoCtr_Sels_size ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          String AV38FilterFullText )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[8];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCTTpoCtr, T1.CCTDsc, T1.CCTCod, T2.EmprNom FROM (TXPCCDef T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFEmprNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCCTCod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCCTCod_To) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCCTDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTDsc = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV19TFCCTTpoCtr_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV19TFCCTTpoCtr_Sels, "T1.CCTTpoCtr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09OW4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4037CCTTpoCtr ,
                                          GXSimpleCollection<String> AV19TFCCTTpoCtr_Sels ,
                                          String AV11TFEmprCod_Sel ,
                                          String AV10TFEmprCod ,
                                          String AV13TFEmprNom_Sel ,
                                          String AV12TFEmprNom ,
                                          int AV14TFCCTCod ,
                                          int AV15TFCCTCod_To ,
                                          String AV17TFCCTDsc_Sel ,
                                          String AV16TFCCTDsc ,
                                          int AV19TFCCTTpoCtr_Sels_size ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          String AV38FilterFullText )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[8];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.CCTDsc, T1.CCTTpoCtr, T1.CCTCod, T2.EmprNom, T1.EmprCod FROM (TXPCCDef T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFEmprCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFEmprCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFEmprNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFEmprNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCCTCod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCCTCod_To) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCCTDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCCTDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV19TFCCTTpoCtr_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV19TFCCTTpoCtr_Sels, "T1.CCTTpoCtr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCTDsc" ;
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
                  return conditional_P09OW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P09OW3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 2 :
                  return conditional_P09OW4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OW4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               return;
      }
   }

}

