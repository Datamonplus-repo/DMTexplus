package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class promptproductosvariablesgetfilterdata extends GXProcedure
{
   public promptproductosvariablesgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( promptproductosvariablesgetfilterdata.class ), "" );
   }

   public promptproductosvariablesgetfilterdata( int remoteHandle ,
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
      promptproductosvariablesgetfilterdata.this.aP5 = new String[] {""};
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
      promptproductosvariablesgetfilterdata.this.AV26DDOName = aP0;
      promptproductosvariablesgetfilterdata.this.AV27SearchTxt = aP1;
      promptproductosvariablesgetfilterdata.this.AV28SearchTxtTo = aP2;
      promptproductosvariablesgetfilterdata.this.aP3 = aP3;
      promptproductosvariablesgetfilterdata.this.aP4 = aP4;
      promptproductosvariablesgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_VALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADVALDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("FormulacionTinte.PromptProductosVariablesGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.PromptProductosVariablesGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("FormulacionTinte.PromptProductosVariablesGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV35TFValDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV36TFValDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV27SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV11TFPrdNum_Sel ,
                                           AV10TFPrdNum ,
                                           AV13TFPrdNom_Sel ,
                                           AV12TFPrdNom ,
                                           AV36TFValDsc_Sel ,
                                           AV35TFValDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A857ValDsc ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV33InOutEmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV10TFPrdNum = GXutil.padr( GXutil.rtrim( AV10TFPrdNum), 6, "%") ;
      lV12TFPrdNom = GXutil.padr( GXutil.rtrim( AV12TFPrdNom), 26, "%") ;
      lV35TFValDsc = GXutil.padr( GXutil.rtrim( AV35TFValDsc), 16, "%") ;
      /* Using cursor P0ADQ2 */
      pr_default.execute(0, new Object[] {AV33InOutEmprCod, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV10TFPrdNum, AV11TFPrdNum_Sel, lV12TFPrdNom, AV13TFPrdNom_Sel, lV35TFValDsc, AV36TFValDsc_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkADQ2 = false ;
         A396EmprCod = P0ADQ2_A396EmprCod[0] ;
         A719PrdNum = P0ADQ2_A719PrdNum[0] ;
         A856ValCod = P0ADQ2_A856ValCod[0] ;
         A857ValDsc = P0ADQ2_A857ValDsc[0] ;
         n857ValDsc = P0ADQ2_n857ValDsc[0] ;
         A718PrdNom = P0ADQ2_A718PrdNom[0] ;
         A857ValDsc = P0ADQ2_A857ValDsc[0] ;
         n857ValDsc = P0ADQ2_n857ValDsc[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ADQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ADQ2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brkADQ2 = false ;
            AV20count = (long)(AV20count+1) ;
            brkADQ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV15Option = A719PrdNum ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADQ2 )
         {
            brkADQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV27SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV11TFPrdNum_Sel ,
                                           AV10TFPrdNum ,
                                           AV13TFPrdNom_Sel ,
                                           AV12TFPrdNom ,
                                           AV36TFValDsc_Sel ,
                                           AV35TFValDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A857ValDsc ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV33InOutEmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV10TFPrdNum = GXutil.padr( GXutil.rtrim( AV10TFPrdNum), 6, "%") ;
      lV12TFPrdNom = GXutil.padr( GXutil.rtrim( AV12TFPrdNom), 26, "%") ;
      lV35TFValDsc = GXutil.padr( GXutil.rtrim( AV35TFValDsc), 16, "%") ;
      /* Using cursor P0ADQ3 */
      pr_default.execute(1, new Object[] {AV33InOutEmprCod, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV10TFPrdNum, AV11TFPrdNum_Sel, lV12TFPrdNom, AV13TFPrdNom_Sel, lV35TFValDsc, AV36TFValDsc_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkADQ4 = false ;
         A396EmprCod = P0ADQ3_A396EmprCod[0] ;
         A718PrdNom = P0ADQ3_A718PrdNom[0] ;
         A856ValCod = P0ADQ3_A856ValCod[0] ;
         A857ValDsc = P0ADQ3_A857ValDsc[0] ;
         n857ValDsc = P0ADQ3_n857ValDsc[0] ;
         A719PrdNum = P0ADQ3_A719PrdNum[0] ;
         A857ValDsc = P0ADQ3_A857ValDsc[0] ;
         n857ValDsc = P0ADQ3_n857ValDsc[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ADQ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ADQ3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brkADQ4 = false ;
            A719PrdNum = P0ADQ3_A719PrdNum[0] ;
            AV20count = (long)(AV20count+1) ;
            brkADQ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV15Option = A718PrdNom ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADQ4 )
         {
            brkADQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV35TFValDsc = AV27SearchTxt ;
      AV36TFValDsc_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV11TFPrdNum_Sel ,
                                           AV10TFPrdNum ,
                                           AV13TFPrdNom_Sel ,
                                           AV12TFPrdNom ,
                                           AV36TFValDsc_Sel ,
                                           AV35TFValDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A857ValDsc ,
                                           AV33InOutEmprCod ,
                                           A396EmprCod ,
                                           Byte.valueOf(A856ValCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV10TFPrdNum = GXutil.padr( GXutil.rtrim( AV10TFPrdNum), 6, "%") ;
      lV12TFPrdNom = GXutil.padr( GXutil.rtrim( AV12TFPrdNom), 26, "%") ;
      lV35TFValDsc = GXutil.padr( GXutil.rtrim( AV35TFValDsc), 16, "%") ;
      /* Using cursor P0ADQ4 */
      pr_default.execute(2, new Object[] {AV33InOutEmprCod, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV10TFPrdNum, AV11TFPrdNum_Sel, lV12TFPrdNom, AV13TFPrdNom_Sel, lV35TFValDsc, AV36TFValDsc_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkADQ6 = false ;
         A856ValCod = P0ADQ4_A856ValCod[0] ;
         A396EmprCod = P0ADQ4_A396EmprCod[0] ;
         A857ValDsc = P0ADQ4_A857ValDsc[0] ;
         n857ValDsc = P0ADQ4_n857ValDsc[0] ;
         A718PrdNom = P0ADQ4_A718PrdNom[0] ;
         A719PrdNum = P0ADQ4_A719PrdNum[0] ;
         A857ValDsc = P0ADQ4_A857ValDsc[0] ;
         n857ValDsc = P0ADQ4_n857ValDsc[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ADQ4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ADQ4_A856ValCod[0] == A856ValCod ) )
         {
            brkADQ6 = false ;
            A719PrdNum = P0ADQ4_A719PrdNum[0] ;
            AV20count = (long)(AV20count+1) ;
            brkADQ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
         {
            AV15Option = A857ValDsc ;
            AV14InsertIndex = 1 ;
            while ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) < 0 ) )
            {
               AV14InsertIndex = (int)(AV14InsertIndex+1) ;
            }
            AV16Options.add(AV15Option, AV14InsertIndex);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), AV14InsertIndex);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADQ6 )
         {
            brkADQ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = promptproductosvariablesgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = promptproductosvariablesgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = promptproductosvariablesgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV35TFValDsc = "" ;
      AV36TFValDsc_Sel = "" ;
      scmdbuf = "" ;
      lV32FilterFullText = "" ;
      lV10TFPrdNum = "" ;
      lV12TFPrdNom = "" ;
      lV35TFValDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A857ValDsc = "" ;
      AV33InOutEmprCod = "" ;
      A396EmprCod = "" ;
      P0ADQ2_A396EmprCod = new String[] {""} ;
      P0ADQ2_A719PrdNum = new String[] {""} ;
      P0ADQ2_A856ValCod = new byte[1] ;
      P0ADQ2_A857ValDsc = new String[] {""} ;
      P0ADQ2_n857ValDsc = new boolean[] {false} ;
      P0ADQ2_A718PrdNom = new String[] {""} ;
      AV15Option = "" ;
      P0ADQ3_A396EmprCod = new String[] {""} ;
      P0ADQ3_A718PrdNom = new String[] {""} ;
      P0ADQ3_A856ValCod = new byte[1] ;
      P0ADQ3_A857ValDsc = new String[] {""} ;
      P0ADQ3_n857ValDsc = new boolean[] {false} ;
      P0ADQ3_A719PrdNum = new String[] {""} ;
      P0ADQ4_A856ValCod = new byte[1] ;
      P0ADQ4_A396EmprCod = new String[] {""} ;
      P0ADQ4_A857ValDsc = new String[] {""} ;
      P0ADQ4_n857ValDsc = new boolean[] {false} ;
      P0ADQ4_A718PrdNom = new String[] {""} ;
      P0ADQ4_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.promptproductosvariablesgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ADQ2_A396EmprCod, P0ADQ2_A719PrdNum, P0ADQ2_A856ValCod, P0ADQ2_A857ValDsc, P0ADQ2_n857ValDsc, P0ADQ2_A718PrdNom
            }
            , new Object[] {
            P0ADQ3_A396EmprCod, P0ADQ3_A718PrdNom, P0ADQ3_A856ValCod, P0ADQ3_A857ValDsc, P0ADQ3_n857ValDsc, P0ADQ3_A719PrdNum
            }
            , new Object[] {
            P0ADQ4_A856ValCod, P0ADQ4_A396EmprCod, P0ADQ4_A857ValDsc, P0ADQ4_n857ValDsc, P0ADQ4_A718PrdNom, P0ADQ4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV14InsertIndex ;
   private long AV20count ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV35TFValDsc ;
   private String AV36TFValDsc_Sel ;
   private String scmdbuf ;
   private String lV10TFPrdNum ;
   private String lV12TFPrdNom ;
   private String lV35TFValDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A857ValDsc ;
   private String AV33InOutEmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkADQ2 ;
   private boolean n857ValDsc ;
   private boolean brkADQ4 ;
   private boolean brkADQ6 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String lV32FilterFullText ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADQ2_A396EmprCod ;
   private String[] P0ADQ2_A719PrdNum ;
   private byte[] P0ADQ2_A856ValCod ;
   private String[] P0ADQ2_A857ValDsc ;
   private boolean[] P0ADQ2_n857ValDsc ;
   private String[] P0ADQ2_A718PrdNom ;
   private String[] P0ADQ3_A396EmprCod ;
   private String[] P0ADQ3_A718PrdNom ;
   private byte[] P0ADQ3_A856ValCod ;
   private String[] P0ADQ3_A857ValDsc ;
   private boolean[] P0ADQ3_n857ValDsc ;
   private String[] P0ADQ3_A719PrdNum ;
   private byte[] P0ADQ4_A856ValCod ;
   private String[] P0ADQ4_A396EmprCod ;
   private String[] P0ADQ4_A857ValDsc ;
   private boolean[] P0ADQ4_n857ValDsc ;
   private String[] P0ADQ4_A718PrdNom ;
   private String[] P0ADQ4_A719PrdNum ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class promptproductosvariablesgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ADQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV11TFPrdNum_Sel ,
                                          String AV10TFPrdNum ,
                                          String AV13TFPrdNom_Sel ,
                                          String AV12TFPrdNom ,
                                          String AV36TFValDsc_Sel ,
                                          String AV35TFValDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A857ValDsc ,
                                          byte A856ValCod ,
                                          String AV33InOutEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.ValCod, T2.ValDsc, T1.PrdNom FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) = '#')");
      addWhere(sWhereString, "(T1.ValCod >= 1 and T1.ValCod <= 2)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV36TFValDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFValDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFValDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ADQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV11TFPrdNum_Sel ,
                                          String AV10TFPrdNum ,
                                          String AV13TFPrdNom_Sel ,
                                          String AV12TFPrdNom ,
                                          String AV36TFValDsc_Sel ,
                                          String AV35TFValDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A857ValDsc ,
                                          byte A856ValCod ,
                                          String AV33InOutEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNom, T1.ValCod, T2.ValDsc, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) = '#')");
      addWhere(sWhereString, "(T1.ValCod >= 1 and T1.ValCod <= 2)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV36TFValDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFValDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFValDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ADQ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV11TFPrdNum_Sel ,
                                          String AV10TFPrdNum ,
                                          String AV13TFPrdNom_Sel ,
                                          String AV12TFPrdNom ,
                                          String AV36TFValDsc_Sel ,
                                          String AV35TFValDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A857ValDsc ,
                                          String AV33InOutEmprCod ,
                                          String A396EmprCod ,
                                          byte A856ValCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[10];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T2.ValDsc, T1.PrdNom, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ValCod >= 1)");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) = '#')");
      addWhere(sWhereString, "(T1.ValCod <= 2)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV36TFValDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFValDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFValDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ValCod" ;
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
                  return conditional_P0ADQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P0ADQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P0ADQ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADQ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               return;
      }
   }

}

