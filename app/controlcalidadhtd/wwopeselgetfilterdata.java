package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wwopeselgetfilterdata extends GXProcedure
{
   public wwopeselgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwopeselgetfilterdata.class ), "" );
   }

   public wwopeselgetfilterdata( int remoteHandle ,
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
      wwopeselgetfilterdata.this.aP5 = new String[] {""};
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
      wwopeselgetfilterdata.this.AV34DDOName = aP0;
      wwopeselgetfilterdata.this.AV35SearchTxt = aP1;
      wwopeselgetfilterdata.this.AV36SearchTxtTo = aP2;
      wwopeselgetfilterdata.this.aP3 = aP3;
      wwopeselgetfilterdata.this.aP4 = aP4;
      wwopeselgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_OPENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADOPENOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_OPENOM2") == 0 )
      {
         /* Execute user subroutine: 'LOADOPENOM2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_OPEACT") == 0 )
      {
         /* Execute user subroutine: 'LOADOPEACTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_OPESECC") == 0 )
      {
         /* Execute user subroutine: 'LOADOPESECCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("ControlCalidadHTD.WWOPESELGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.WWOPESELGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("ControlCalidadHTD.WWOPESELGridState"), null, null);
      }
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV44GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPECOD") == 0 )
         {
            AV10TFOpeCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFOpeCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM") == 0 )
         {
            AV12TFOpeNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM_SEL") == 0 )
         {
            AV13TFOpeNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2") == 0 )
         {
            AV14TFOpeNom2 = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2_SEL") == 0 )
         {
            AV15TFOpeNom2_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPECEDULA") == 0 )
         {
            AV16TFOpeCedula = GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV17TFOpeCedula_To = GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT") == 0 )
         {
            AV18TFOpeAct = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT_SEL") == 0 )
         {
            AV19TFOpeAct_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPESECC") == 0 )
         {
            AV20TFOpeSecc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPESECC_SEL") == 0 )
         {
            AV21TFOpeSecc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADOPENOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFOpeNom = AV35SearchTxt ;
      AV13TFOpeNom_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV40FilterFullText ,
                                           Integer.valueOf(AV10TFOpeCod) ,
                                           Integer.valueOf(AV11TFOpeCod_To) ,
                                           AV13TFOpeNom_Sel ,
                                           AV12TFOpeNom ,
                                           AV15TFOpeNom2_Sel ,
                                           AV14TFOpeNom2 ,
                                           Long.valueOf(AV16TFOpeCedula) ,
                                           Long.valueOf(AV17TFOpeCedula_To) ,
                                           AV19TFOpeAct_Sel ,
                                           AV18TFOpeAct ,
                                           AV21TFOpeSecc_Sel ,
                                           AV20TFOpeSecc ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           Long.valueOf(A6868OpeCedula) ,
                                           A8482OpeAct ,
                                           A8422OpeSecc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV12TFOpeNom = GXutil.padr( GXutil.rtrim( AV12TFOpeNom), 30, "%") ;
      lV14TFOpeNom2 = GXutil.padr( GXutil.rtrim( AV14TFOpeNom2), 30, "%") ;
      lV18TFOpeAct = GXutil.padr( GXutil.rtrim( AV18TFOpeAct), 1, "%") ;
      lV20TFOpeSecc = GXutil.padr( GXutil.rtrim( AV20TFOpeSecc), 6, "%") ;
      /* Using cursor P09UJ2 */
      pr_default.execute(0, new Object[] {lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, Integer.valueOf(AV10TFOpeCod), Integer.valueOf(AV11TFOpeCod_To), lV12TFOpeNom, AV13TFOpeNom_Sel, lV14TFOpeNom2, AV15TFOpeNom2_Sel, Long.valueOf(AV16TFOpeCedula), Long.valueOf(AV17TFOpeCedula_To), lV18TFOpeAct, AV19TFOpeAct_Sel, lV20TFOpeSecc, AV21TFOpeSecc_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9UJ2 = false ;
         A653OpeNom = P09UJ2_A653OpeNom[0] ;
         n653OpeNom = P09UJ2_n653OpeNom[0] ;
         A8422OpeSecc = P09UJ2_A8422OpeSecc[0] ;
         n8422OpeSecc = P09UJ2_n8422OpeSecc[0] ;
         A8482OpeAct = P09UJ2_A8482OpeAct[0] ;
         n8482OpeAct = P09UJ2_n8482OpeAct[0] ;
         A6868OpeCedula = P09UJ2_A6868OpeCedula[0] ;
         n6868OpeCedula = P09UJ2_n6868OpeCedula[0] ;
         A6869OpeNom2 = P09UJ2_A6869OpeNom2[0] ;
         n6869OpeNom2 = P09UJ2_n6869OpeNom2[0] ;
         A652OpeCod = P09UJ2_A652OpeCod[0] ;
         A396EmprCod = P09UJ2_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09UJ2_A653OpeNom[0], A653OpeNom) == 0 ) )
         {
            brk9UJ2 = false ;
            A652OpeCod = P09UJ2_A652OpeCod[0] ;
            A396EmprCod = P09UJ2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9UJ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A653OpeNom)==0) )
         {
            AV23Option = A653OpeNom ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UJ2 )
         {
            brk9UJ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADOPENOM2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFOpeNom2 = AV35SearchTxt ;
      AV15TFOpeNom2_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV40FilterFullText ,
                                           Integer.valueOf(AV10TFOpeCod) ,
                                           Integer.valueOf(AV11TFOpeCod_To) ,
                                           AV13TFOpeNom_Sel ,
                                           AV12TFOpeNom ,
                                           AV15TFOpeNom2_Sel ,
                                           AV14TFOpeNom2 ,
                                           Long.valueOf(AV16TFOpeCedula) ,
                                           Long.valueOf(AV17TFOpeCedula_To) ,
                                           AV19TFOpeAct_Sel ,
                                           AV18TFOpeAct ,
                                           AV21TFOpeSecc_Sel ,
                                           AV20TFOpeSecc ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           Long.valueOf(A6868OpeCedula) ,
                                           A8482OpeAct ,
                                           A8422OpeSecc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV12TFOpeNom = GXutil.padr( GXutil.rtrim( AV12TFOpeNom), 30, "%") ;
      lV14TFOpeNom2 = GXutil.padr( GXutil.rtrim( AV14TFOpeNom2), 30, "%") ;
      lV18TFOpeAct = GXutil.padr( GXutil.rtrim( AV18TFOpeAct), 1, "%") ;
      lV20TFOpeSecc = GXutil.padr( GXutil.rtrim( AV20TFOpeSecc), 6, "%") ;
      /* Using cursor P09UJ3 */
      pr_default.execute(1, new Object[] {lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, Integer.valueOf(AV10TFOpeCod), Integer.valueOf(AV11TFOpeCod_To), lV12TFOpeNom, AV13TFOpeNom_Sel, lV14TFOpeNom2, AV15TFOpeNom2_Sel, Long.valueOf(AV16TFOpeCedula), Long.valueOf(AV17TFOpeCedula_To), lV18TFOpeAct, AV19TFOpeAct_Sel, lV20TFOpeSecc, AV21TFOpeSecc_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9UJ4 = false ;
         A6869OpeNom2 = P09UJ3_A6869OpeNom2[0] ;
         n6869OpeNom2 = P09UJ3_n6869OpeNom2[0] ;
         A8422OpeSecc = P09UJ3_A8422OpeSecc[0] ;
         n8422OpeSecc = P09UJ3_n8422OpeSecc[0] ;
         A8482OpeAct = P09UJ3_A8482OpeAct[0] ;
         n8482OpeAct = P09UJ3_n8482OpeAct[0] ;
         A6868OpeCedula = P09UJ3_A6868OpeCedula[0] ;
         n6868OpeCedula = P09UJ3_n6868OpeCedula[0] ;
         A653OpeNom = P09UJ3_A653OpeNom[0] ;
         n653OpeNom = P09UJ3_n653OpeNom[0] ;
         A652OpeCod = P09UJ3_A652OpeCod[0] ;
         A396EmprCod = P09UJ3_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09UJ3_A6869OpeNom2[0], A6869OpeNom2) == 0 ) )
         {
            brk9UJ4 = false ;
            A652OpeCod = P09UJ3_A652OpeCod[0] ;
            A396EmprCod = P09UJ3_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9UJ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A6869OpeNom2)==0) )
         {
            AV23Option = A6869OpeNom2 ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UJ4 )
         {
            brk9UJ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADOPEACTOPTIONS' Routine */
      returnInSub = false ;
      AV18TFOpeAct = AV35SearchTxt ;
      AV19TFOpeAct_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV40FilterFullText ,
                                           Integer.valueOf(AV10TFOpeCod) ,
                                           Integer.valueOf(AV11TFOpeCod_To) ,
                                           AV13TFOpeNom_Sel ,
                                           AV12TFOpeNom ,
                                           AV15TFOpeNom2_Sel ,
                                           AV14TFOpeNom2 ,
                                           Long.valueOf(AV16TFOpeCedula) ,
                                           Long.valueOf(AV17TFOpeCedula_To) ,
                                           AV19TFOpeAct_Sel ,
                                           AV18TFOpeAct ,
                                           AV21TFOpeSecc_Sel ,
                                           AV20TFOpeSecc ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           Long.valueOf(A6868OpeCedula) ,
                                           A8482OpeAct ,
                                           A8422OpeSecc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV12TFOpeNom = GXutil.padr( GXutil.rtrim( AV12TFOpeNom), 30, "%") ;
      lV14TFOpeNom2 = GXutil.padr( GXutil.rtrim( AV14TFOpeNom2), 30, "%") ;
      lV18TFOpeAct = GXutil.padr( GXutil.rtrim( AV18TFOpeAct), 1, "%") ;
      lV20TFOpeSecc = GXutil.padr( GXutil.rtrim( AV20TFOpeSecc), 6, "%") ;
      /* Using cursor P09UJ4 */
      pr_default.execute(2, new Object[] {lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, Integer.valueOf(AV10TFOpeCod), Integer.valueOf(AV11TFOpeCod_To), lV12TFOpeNom, AV13TFOpeNom_Sel, lV14TFOpeNom2, AV15TFOpeNom2_Sel, Long.valueOf(AV16TFOpeCedula), Long.valueOf(AV17TFOpeCedula_To), lV18TFOpeAct, AV19TFOpeAct_Sel, lV20TFOpeSecc, AV21TFOpeSecc_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9UJ6 = false ;
         A8482OpeAct = P09UJ4_A8482OpeAct[0] ;
         n8482OpeAct = P09UJ4_n8482OpeAct[0] ;
         A8422OpeSecc = P09UJ4_A8422OpeSecc[0] ;
         n8422OpeSecc = P09UJ4_n8422OpeSecc[0] ;
         A6868OpeCedula = P09UJ4_A6868OpeCedula[0] ;
         n6868OpeCedula = P09UJ4_n6868OpeCedula[0] ;
         A6869OpeNom2 = P09UJ4_A6869OpeNom2[0] ;
         n6869OpeNom2 = P09UJ4_n6869OpeNom2[0] ;
         A653OpeNom = P09UJ4_A653OpeNom[0] ;
         n653OpeNom = P09UJ4_n653OpeNom[0] ;
         A652OpeCod = P09UJ4_A652OpeCod[0] ;
         A396EmprCod = P09UJ4_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09UJ4_A8482OpeAct[0], A8482OpeAct) == 0 ) )
         {
            brk9UJ6 = false ;
            A652OpeCod = P09UJ4_A652OpeCod[0] ;
            A396EmprCod = P09UJ4_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9UJ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A8482OpeAct)==0) )
         {
            AV23Option = A8482OpeAct ;
            AV25OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A8482OpeAct, "@!"))) ;
            AV24Options.add(AV23Option, 0);
            AV26OptionsDesc.add(AV25OptionDesc, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UJ6 )
         {
            brk9UJ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADOPESECCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFOpeSecc = AV35SearchTxt ;
      AV21TFOpeSecc_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV40FilterFullText ,
                                           Integer.valueOf(AV10TFOpeCod) ,
                                           Integer.valueOf(AV11TFOpeCod_To) ,
                                           AV13TFOpeNom_Sel ,
                                           AV12TFOpeNom ,
                                           AV15TFOpeNom2_Sel ,
                                           AV14TFOpeNom2 ,
                                           Long.valueOf(AV16TFOpeCedula) ,
                                           Long.valueOf(AV17TFOpeCedula_To) ,
                                           AV19TFOpeAct_Sel ,
                                           AV18TFOpeAct ,
                                           AV21TFOpeSecc_Sel ,
                                           AV20TFOpeSecc ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           Long.valueOf(A6868OpeCedula) ,
                                           A8482OpeAct ,
                                           A8422OpeSecc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV12TFOpeNom = GXutil.padr( GXutil.rtrim( AV12TFOpeNom), 30, "%") ;
      lV14TFOpeNom2 = GXutil.padr( GXutil.rtrim( AV14TFOpeNom2), 30, "%") ;
      lV18TFOpeAct = GXutil.padr( GXutil.rtrim( AV18TFOpeAct), 1, "%") ;
      lV20TFOpeSecc = GXutil.padr( GXutil.rtrim( AV20TFOpeSecc), 6, "%") ;
      /* Using cursor P09UJ5 */
      pr_default.execute(3, new Object[] {lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, Integer.valueOf(AV10TFOpeCod), Integer.valueOf(AV11TFOpeCod_To), lV12TFOpeNom, AV13TFOpeNom_Sel, lV14TFOpeNom2, AV15TFOpeNom2_Sel, Long.valueOf(AV16TFOpeCedula), Long.valueOf(AV17TFOpeCedula_To), lV18TFOpeAct, AV19TFOpeAct_Sel, lV20TFOpeSecc, AV21TFOpeSecc_Sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9UJ8 = false ;
         A8422OpeSecc = P09UJ5_A8422OpeSecc[0] ;
         n8422OpeSecc = P09UJ5_n8422OpeSecc[0] ;
         A8482OpeAct = P09UJ5_A8482OpeAct[0] ;
         n8482OpeAct = P09UJ5_n8482OpeAct[0] ;
         A6868OpeCedula = P09UJ5_A6868OpeCedula[0] ;
         n6868OpeCedula = P09UJ5_n6868OpeCedula[0] ;
         A6869OpeNom2 = P09UJ5_A6869OpeNom2[0] ;
         n6869OpeNom2 = P09UJ5_n6869OpeNom2[0] ;
         A653OpeNom = P09UJ5_A653OpeNom[0] ;
         n653OpeNom = P09UJ5_n653OpeNom[0] ;
         A652OpeCod = P09UJ5_A652OpeCod[0] ;
         A396EmprCod = P09UJ5_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09UJ5_A8422OpeSecc[0], A8422OpeSecc) == 0 ) )
         {
            brk9UJ8 = false ;
            A652OpeCod = P09UJ5_A652OpeCod[0] ;
            A396EmprCod = P09UJ5_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9UJ8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A8422OpeSecc)==0) )
         {
            AV23Option = A8422OpeSecc ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9UJ8 )
         {
            brk9UJ8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wwopeselgetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = wwopeselgetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = wwopeselgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV12TFOpeNom = "" ;
      AV13TFOpeNom_Sel = "" ;
      AV14TFOpeNom2 = "" ;
      AV15TFOpeNom2_Sel = "" ;
      AV18TFOpeAct = "" ;
      AV19TFOpeAct_Sel = "" ;
      AV20TFOpeSecc = "" ;
      AV21TFOpeSecc_Sel = "" ;
      scmdbuf = "" ;
      lV40FilterFullText = "" ;
      lV12TFOpeNom = "" ;
      lV14TFOpeNom2 = "" ;
      lV18TFOpeAct = "" ;
      lV20TFOpeSecc = "" ;
      A653OpeNom = "" ;
      A6869OpeNom2 = "" ;
      A8482OpeAct = "" ;
      A8422OpeSecc = "" ;
      P09UJ2_A653OpeNom = new String[] {""} ;
      P09UJ2_n653OpeNom = new boolean[] {false} ;
      P09UJ2_A8422OpeSecc = new String[] {""} ;
      P09UJ2_n8422OpeSecc = new boolean[] {false} ;
      P09UJ2_A8482OpeAct = new String[] {""} ;
      P09UJ2_n8482OpeAct = new boolean[] {false} ;
      P09UJ2_A6868OpeCedula = new long[1] ;
      P09UJ2_n6868OpeCedula = new boolean[] {false} ;
      P09UJ2_A6869OpeNom2 = new String[] {""} ;
      P09UJ2_n6869OpeNom2 = new boolean[] {false} ;
      P09UJ2_A652OpeCod = new int[1] ;
      P09UJ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV23Option = "" ;
      P09UJ3_A6869OpeNom2 = new String[] {""} ;
      P09UJ3_n6869OpeNom2 = new boolean[] {false} ;
      P09UJ3_A8422OpeSecc = new String[] {""} ;
      P09UJ3_n8422OpeSecc = new boolean[] {false} ;
      P09UJ3_A8482OpeAct = new String[] {""} ;
      P09UJ3_n8482OpeAct = new boolean[] {false} ;
      P09UJ3_A6868OpeCedula = new long[1] ;
      P09UJ3_n6868OpeCedula = new boolean[] {false} ;
      P09UJ3_A653OpeNom = new String[] {""} ;
      P09UJ3_n653OpeNom = new boolean[] {false} ;
      P09UJ3_A652OpeCod = new int[1] ;
      P09UJ3_A396EmprCod = new String[] {""} ;
      P09UJ4_A8482OpeAct = new String[] {""} ;
      P09UJ4_n8482OpeAct = new boolean[] {false} ;
      P09UJ4_A8422OpeSecc = new String[] {""} ;
      P09UJ4_n8422OpeSecc = new boolean[] {false} ;
      P09UJ4_A6868OpeCedula = new long[1] ;
      P09UJ4_n6868OpeCedula = new boolean[] {false} ;
      P09UJ4_A6869OpeNom2 = new String[] {""} ;
      P09UJ4_n6869OpeNom2 = new boolean[] {false} ;
      P09UJ4_A653OpeNom = new String[] {""} ;
      P09UJ4_n653OpeNom = new boolean[] {false} ;
      P09UJ4_A652OpeCod = new int[1] ;
      P09UJ4_A396EmprCod = new String[] {""} ;
      AV25OptionDesc = "" ;
      P09UJ5_A8422OpeSecc = new String[] {""} ;
      P09UJ5_n8422OpeSecc = new boolean[] {false} ;
      P09UJ5_A8482OpeAct = new String[] {""} ;
      P09UJ5_n8482OpeAct = new boolean[] {false} ;
      P09UJ5_A6868OpeCedula = new long[1] ;
      P09UJ5_n6868OpeCedula = new boolean[] {false} ;
      P09UJ5_A6869OpeNom2 = new String[] {""} ;
      P09UJ5_n6869OpeNom2 = new boolean[] {false} ;
      P09UJ5_A653OpeNom = new String[] {""} ;
      P09UJ5_n653OpeNom = new boolean[] {false} ;
      P09UJ5_A652OpeCod = new int[1] ;
      P09UJ5_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wwopeselgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09UJ2_A653OpeNom, P09UJ2_n653OpeNom, P09UJ2_A8422OpeSecc, P09UJ2_n8422OpeSecc, P09UJ2_A8482OpeAct, P09UJ2_n8482OpeAct, P09UJ2_A6868OpeCedula, P09UJ2_n6868OpeCedula, P09UJ2_A6869OpeNom2, P09UJ2_n6869OpeNom2,
            P09UJ2_A652OpeCod, P09UJ2_A396EmprCod
            }
            , new Object[] {
            P09UJ3_A6869OpeNom2, P09UJ3_n6869OpeNom2, P09UJ3_A8422OpeSecc, P09UJ3_n8422OpeSecc, P09UJ3_A8482OpeAct, P09UJ3_n8482OpeAct, P09UJ3_A6868OpeCedula, P09UJ3_n6868OpeCedula, P09UJ3_A653OpeNom, P09UJ3_n653OpeNom,
            P09UJ3_A652OpeCod, P09UJ3_A396EmprCod
            }
            , new Object[] {
            P09UJ4_A8482OpeAct, P09UJ4_n8482OpeAct, P09UJ4_A8422OpeSecc, P09UJ4_n8422OpeSecc, P09UJ4_A6868OpeCedula, P09UJ4_n6868OpeCedula, P09UJ4_A6869OpeNom2, P09UJ4_n6869OpeNom2, P09UJ4_A653OpeNom, P09UJ4_n653OpeNom,
            P09UJ4_A652OpeCod, P09UJ4_A396EmprCod
            }
            , new Object[] {
            P09UJ5_A8422OpeSecc, P09UJ5_n8422OpeSecc, P09UJ5_A8482OpeAct, P09UJ5_n8482OpeAct, P09UJ5_A6868OpeCedula, P09UJ5_n6868OpeCedula, P09UJ5_A6869OpeNom2, P09UJ5_n6869OpeNom2, P09UJ5_A653OpeNom, P09UJ5_n653OpeNom,
            P09UJ5_A652OpeCod, P09UJ5_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV44GXV1 ;
   private int AV10TFOpeCod ;
   private int AV11TFOpeCod_To ;
   private int A652OpeCod ;
   private long AV16TFOpeCedula ;
   private long AV17TFOpeCedula_To ;
   private long A6868OpeCedula ;
   private long AV28count ;
   private String AV12TFOpeNom ;
   private String AV13TFOpeNom_Sel ;
   private String AV14TFOpeNom2 ;
   private String AV15TFOpeNom2_Sel ;
   private String AV18TFOpeAct ;
   private String AV19TFOpeAct_Sel ;
   private String AV20TFOpeSecc ;
   private String AV21TFOpeSecc_Sel ;
   private String scmdbuf ;
   private String lV12TFOpeNom ;
   private String lV14TFOpeNom2 ;
   private String lV18TFOpeAct ;
   private String lV20TFOpeSecc ;
   private String A653OpeNom ;
   private String A6869OpeNom2 ;
   private String A8482OpeAct ;
   private String A8422OpeSecc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9UJ2 ;
   private boolean n653OpeNom ;
   private boolean n8422OpeSecc ;
   private boolean n8482OpeAct ;
   private boolean n6868OpeCedula ;
   private boolean n6869OpeNom2 ;
   private boolean brk9UJ4 ;
   private boolean brk9UJ6 ;
   private boolean brk9UJ8 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV40FilterFullText ;
   private String lV40FilterFullText ;
   private String AV23Option ;
   private String AV25OptionDesc ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09UJ2_A653OpeNom ;
   private boolean[] P09UJ2_n653OpeNom ;
   private String[] P09UJ2_A8422OpeSecc ;
   private boolean[] P09UJ2_n8422OpeSecc ;
   private String[] P09UJ2_A8482OpeAct ;
   private boolean[] P09UJ2_n8482OpeAct ;
   private long[] P09UJ2_A6868OpeCedula ;
   private boolean[] P09UJ2_n6868OpeCedula ;
   private String[] P09UJ2_A6869OpeNom2 ;
   private boolean[] P09UJ2_n6869OpeNom2 ;
   private int[] P09UJ2_A652OpeCod ;
   private String[] P09UJ2_A396EmprCod ;
   private String[] P09UJ3_A6869OpeNom2 ;
   private boolean[] P09UJ3_n6869OpeNom2 ;
   private String[] P09UJ3_A8422OpeSecc ;
   private boolean[] P09UJ3_n8422OpeSecc ;
   private String[] P09UJ3_A8482OpeAct ;
   private boolean[] P09UJ3_n8482OpeAct ;
   private long[] P09UJ3_A6868OpeCedula ;
   private boolean[] P09UJ3_n6868OpeCedula ;
   private String[] P09UJ3_A653OpeNom ;
   private boolean[] P09UJ3_n653OpeNom ;
   private int[] P09UJ3_A652OpeCod ;
   private String[] P09UJ3_A396EmprCod ;
   private String[] P09UJ4_A8482OpeAct ;
   private boolean[] P09UJ4_n8482OpeAct ;
   private String[] P09UJ4_A8422OpeSecc ;
   private boolean[] P09UJ4_n8422OpeSecc ;
   private long[] P09UJ4_A6868OpeCedula ;
   private boolean[] P09UJ4_n6868OpeCedula ;
   private String[] P09UJ4_A6869OpeNom2 ;
   private boolean[] P09UJ4_n6869OpeNom2 ;
   private String[] P09UJ4_A653OpeNom ;
   private boolean[] P09UJ4_n653OpeNom ;
   private int[] P09UJ4_A652OpeCod ;
   private String[] P09UJ4_A396EmprCod ;
   private String[] P09UJ5_A8422OpeSecc ;
   private boolean[] P09UJ5_n8422OpeSecc ;
   private String[] P09UJ5_A8482OpeAct ;
   private boolean[] P09UJ5_n8482OpeAct ;
   private long[] P09UJ5_A6868OpeCedula ;
   private boolean[] P09UJ5_n6868OpeCedula ;
   private String[] P09UJ5_A6869OpeNom2 ;
   private boolean[] P09UJ5_n6869OpeNom2 ;
   private String[] P09UJ5_A653OpeNom ;
   private boolean[] P09UJ5_n653OpeNom ;
   private int[] P09UJ5_A652OpeCod ;
   private String[] P09UJ5_A396EmprCod ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wwopeselgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40FilterFullText ,
                                          int AV10TFOpeCod ,
                                          int AV11TFOpeCod_To ,
                                          String AV13TFOpeNom_Sel ,
                                          String AV12TFOpeNom ,
                                          String AV15TFOpeNom2_Sel ,
                                          String AV14TFOpeNom2 ,
                                          long AV16TFOpeCedula ,
                                          long AV17TFOpeCedula_To ,
                                          String AV19TFOpeAct_Sel ,
                                          String AV18TFOpeAct ,
                                          String AV21TFOpeSecc_Sel ,
                                          String AV20TFOpeSecc ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          long A6868OpeCedula ,
                                          String A8482OpeAct ,
                                          String A8422OpeSecc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT OpeNom, OpeSecc, OpeAct, OpeCedula, OpeNom2, OpeCod, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV40FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(OpeCedula,'999999999999999990'), 2) like '%' || ?) or ( UPPER(OpeAct) like '%' || UPPER(?)) or ( UPPER(OpeSecc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV10TFOpeCod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV11TFOpeCod_To) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFOpeNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFOpeNom_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFOpeNom2_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFOpeNom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFOpeNom2_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV16TFOpeCedula) )
      {
         addWhere(sWhereString, "(OpeCedula >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV17TFOpeCedula_To) )
      {
         addWhere(sWhereString, "(OpeCedula <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFOpeAct_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFOpeAct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFOpeAct_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFOpeSecc_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFOpeSecc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeSecc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFOpeSecc_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeSecc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09UJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40FilterFullText ,
                                          int AV10TFOpeCod ,
                                          int AV11TFOpeCod_To ,
                                          String AV13TFOpeNom_Sel ,
                                          String AV12TFOpeNom ,
                                          String AV15TFOpeNom2_Sel ,
                                          String AV14TFOpeNom2 ,
                                          long AV16TFOpeCedula ,
                                          long AV17TFOpeCedula_To ,
                                          String AV19TFOpeAct_Sel ,
                                          String AV18TFOpeAct ,
                                          String AV21TFOpeSecc_Sel ,
                                          String AV20TFOpeSecc ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          long A6868OpeCedula ,
                                          String A8482OpeAct ,
                                          String A8422OpeSecc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT OpeNom2, OpeSecc, OpeAct, OpeCedula, OpeNom, OpeCod, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV40FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(OpeCedula,'999999999999999990'), 2) like '%' || ?) or ( UPPER(OpeAct) like '%' || UPPER(?)) or ( UPPER(OpeSecc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV10TFOpeCod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV11TFOpeCod_To) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFOpeNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFOpeNom_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFOpeNom2_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFOpeNom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFOpeNom2_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV16TFOpeCedula) )
      {
         addWhere(sWhereString, "(OpeCedula >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV17TFOpeCedula_To) )
      {
         addWhere(sWhereString, "(OpeCedula <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFOpeAct_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFOpeAct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFOpeAct_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFOpeSecc_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFOpeSecc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeSecc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFOpeSecc_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeSecc = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeNom2" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09UJ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40FilterFullText ,
                                          int AV10TFOpeCod ,
                                          int AV11TFOpeCod_To ,
                                          String AV13TFOpeNom_Sel ,
                                          String AV12TFOpeNom ,
                                          String AV15TFOpeNom2_Sel ,
                                          String AV14TFOpeNom2 ,
                                          long AV16TFOpeCedula ,
                                          long AV17TFOpeCedula_To ,
                                          String AV19TFOpeAct_Sel ,
                                          String AV18TFOpeAct ,
                                          String AV21TFOpeSecc_Sel ,
                                          String AV20TFOpeSecc ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          long A6868OpeCedula ,
                                          String A8482OpeAct ,
                                          String A8422OpeSecc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT OpeAct, OpeSecc, OpeCedula, OpeNom2, OpeNom, OpeCod, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV40FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(OpeCedula,'999999999999999990'), 2) like '%' || ?) or ( UPPER(OpeAct) like '%' || UPPER(?)) or ( UPPER(OpeSecc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV10TFOpeCod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV11TFOpeCod_To) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFOpeNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFOpeNom_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFOpeNom2_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFOpeNom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFOpeNom2_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV16TFOpeCedula) )
      {
         addWhere(sWhereString, "(OpeCedula >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV17TFOpeCedula_To) )
      {
         addWhere(sWhereString, "(OpeCedula <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFOpeAct_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFOpeAct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFOpeAct_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFOpeSecc_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFOpeSecc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeSecc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFOpeSecc_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeSecc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeAct" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09UJ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40FilterFullText ,
                                          int AV10TFOpeCod ,
                                          int AV11TFOpeCod_To ,
                                          String AV13TFOpeNom_Sel ,
                                          String AV12TFOpeNom ,
                                          String AV15TFOpeNom2_Sel ,
                                          String AV14TFOpeNom2 ,
                                          long AV16TFOpeCedula ,
                                          long AV17TFOpeCedula_To ,
                                          String AV19TFOpeAct_Sel ,
                                          String AV18TFOpeAct ,
                                          String AV21TFOpeSecc_Sel ,
                                          String AV20TFOpeSecc ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          long A6868OpeCedula ,
                                          String A8482OpeAct ,
                                          String A8422OpeSecc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT OpeSecc, OpeAct, OpeCedula, OpeNom2, OpeNom, OpeCod, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV40FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(OpeCedula,'999999999999999990'), 2) like '%' || ?) or ( UPPER(OpeAct) like '%' || UPPER(?)) or ( UPPER(OpeSecc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV10TFOpeCod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV11TFOpeCod_To) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFOpeNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFOpeNom_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFOpeNom2_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFOpeNom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFOpeNom2_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV16TFOpeCedula) )
      {
         addWhere(sWhereString, "(OpeCedula >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV17TFOpeCedula_To) )
      {
         addWhere(sWhereString, "(OpeCedula <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFOpeAct_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFOpeAct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFOpeAct_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFOpeSecc_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFOpeSecc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeSecc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFOpeSecc_Sel)==0) )
      {
         addWhere(sWhereString, "(OpeSecc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY OpeSecc" ;
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
                  return conditional_P09UJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P09UJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 2 :
                  return conditional_P09UJ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 3 :
                  return conditional_P09UJ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UJ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UJ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6);
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6);
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6);
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6);
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
      }
   }

}

