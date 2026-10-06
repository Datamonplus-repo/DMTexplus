package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprocespromptgetfilterdata extends GXProcedure
{
   public tprocespromptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprocespromptgetfilterdata.class ), "" );
   }

   public tprocespromptgetfilterdata( int remoteHandle ,
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
      tprocespromptgetfilterdata.this.aP5 = new String[] {""};
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
      tprocespromptgetfilterdata.this.AV31DDOName = aP0;
      tprocespromptgetfilterdata.this.AV32SearchTxt = aP1;
      tprocespromptgetfilterdata.this.AV33SearchTxtTo = aP2;
      tprocespromptgetfilterdata.this.aP3 = aP3;
      tprocespromptgetfilterdata.this.aP4 = aP4;
      tprocespromptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV23OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_PROCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_PRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_PRODSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSC2OPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV21Options.toJSonString(false) ;
      AV35OptionsDescJson = AV23OptionsDesc.toJSonString(false) ;
      AV36OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue("FicherosBasicos.TPROCESPromptGridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TPROCESPromptGridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV26Session.getValue("FicherosBasicos.TPROCESPromptGridState"), null, null);
      }
      AV42GXV1 = 1 ;
      while ( AV42GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV42GXV1));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV37FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV10TFProCod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV11TFProCod_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV12TFProDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV13TFProDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2") == 0 )
         {
            AV14TFProDsc2 = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2_SEL") == 0 )
         {
            AV15TFProDsc2_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPROVI_SEL") == 0 )
         {
            AV16TFProProvi_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV42GXV1 = (int)(AV42GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFProCod = AV32SearchTxt ;
      AV11TFProCod_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV11TFProCod_Sel ,
                                           AV10TFProCod ,
                                           AV13TFProDsc_Sel ,
                                           AV12TFProDsc ,
                                           AV15TFProDsc2_Sel ,
                                           AV14TFProDsc2 ,
                                           AV16TFProProvi_Sel ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A5289ProProvi ,
                                           AV37FilterFullText ,
                                           A14284ProEst ,
                                           AV39Var_estado } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFProCod = GXutil.padr( GXutil.rtrim( AV10TFProCod), 8, "%") ;
      lV12TFProDsc = GXutil.padr( GXutil.rtrim( AV12TFProDsc), 40, "%") ;
      lV14TFProDsc2 = GXutil.padr( GXutil.rtrim( AV14TFProDsc2), 100, "%") ;
      /* Using cursor P0AGL2 */
      pr_default.execute(0, new Object[] {AV39Var_estado, AV39Var_estado, lV10TFProCod, AV11TFProCod_Sel, lV12TFProDsc, AV13TFProDsc_Sel, lV14TFProDsc2, AV15TFProDsc2_Sel, AV16TFProProvi_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAGL2 = false ;
         A758ProCod = P0AGL2_A758ProCod[0] ;
         A5289ProProvi = P0AGL2_A5289ProProvi[0] ;
         A14284ProEst = P0AGL2_A14284ProEst[0] ;
         A4628ProDsc2 = P0AGL2_A4628ProDsc2[0] ;
         A759ProDsc = P0AGL2_A759ProDsc[0] ;
         A396EmprCod = P0AGL2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV37FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV37FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV37FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV37FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activo", "") , GXutil.padr( "%" + GXutil.lower( AV37FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "inactivo", "") , GXutil.padr( "%" + GXutil.lower( AV37FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, "I") == 0 ) ) ) )
         {
            AV25count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AGL2_A758ProCod[0], A758ProCod) == 0 ) )
            {
               brkAGL2 = false ;
               A396EmprCod = P0AGL2_A396EmprCod[0] ;
               AV25count = (long)(AV25count+1) ;
               brkAGL2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A758ProCod)==0) )
            {
               AV20Option = A758ProCod ;
               AV21Options.add(AV20Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV25count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV21Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkAGL2 )
         {
            brkAGL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProDsc = AV32SearchTxt ;
      AV13TFProDsc_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV11TFProCod_Sel ,
                                           AV10TFProCod ,
                                           AV13TFProDsc_Sel ,
                                           AV12TFProDsc ,
                                           AV15TFProDsc2_Sel ,
                                           AV14TFProDsc2 ,
                                           AV16TFProProvi_Sel ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A5289ProProvi ,
                                           AV37FilterFullText ,
                                           A14284ProEst ,
                                           AV39Var_estado } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFProCod = GXutil.padr( GXutil.rtrim( AV10TFProCod), 8, "%") ;
      lV12TFProDsc = GXutil.padr( GXutil.rtrim( AV12TFProDsc), 40, "%") ;
      lV14TFProDsc2 = GXutil.padr( GXutil.rtrim( AV14TFProDsc2), 100, "%") ;
      /* Using cursor P0AGL3 */
      pr_default.execute(1, new Object[] {AV39Var_estado, AV39Var_estado, lV10TFProCod, AV11TFProCod_Sel, lV12TFProDsc, AV13TFProDsc_Sel, lV14TFProDsc2, AV15TFProDsc2_Sel, AV16TFProProvi_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAGL4 = false ;
         A759ProDsc = P0AGL3_A759ProDsc[0] ;
         A5289ProProvi = P0AGL3_A5289ProProvi[0] ;
         A14284ProEst = P0AGL3_A14284ProEst[0] ;
         A4628ProDsc2 = P0AGL3_A4628ProDsc2[0] ;
         A758ProCod = P0AGL3_A758ProCod[0] ;
         A396EmprCod = P0AGL3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV37FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV37FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV37FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV37FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activo", "") , GXutil.padr( "%" + GXutil.lower( AV37FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "inactivo", "") , GXutil.padr( "%" + GXutil.lower( AV37FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, "I") == 0 ) ) ) )
         {
            AV25count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AGL3_A759ProDsc[0], A759ProDsc) == 0 ) )
            {
               brkAGL4 = false ;
               A758ProCod = P0AGL3_A758ProCod[0] ;
               A396EmprCod = P0AGL3_A396EmprCod[0] ;
               AV25count = (long)(AV25count+1) ;
               brkAGL4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
            {
               AV20Option = A759ProDsc ;
               AV21Options.add(AV20Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV25count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV21Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkAGL4 )
         {
            brkAGL4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRODSC2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFProDsc2 = AV32SearchTxt ;
      AV15TFProDsc2_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV11TFProCod_Sel ,
                                           AV10TFProCod ,
                                           AV13TFProDsc_Sel ,
                                           AV12TFProDsc ,
                                           AV15TFProDsc2_Sel ,
                                           AV14TFProDsc2 ,
                                           AV16TFProProvi_Sel ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A5289ProProvi ,
                                           AV37FilterFullText ,
                                           A14284ProEst ,
                                           AV39Var_estado } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFProCod = GXutil.padr( GXutil.rtrim( AV10TFProCod), 8, "%") ;
      lV12TFProDsc = GXutil.padr( GXutil.rtrim( AV12TFProDsc), 40, "%") ;
      lV14TFProDsc2 = GXutil.padr( GXutil.rtrim( AV14TFProDsc2), 100, "%") ;
      /* Using cursor P0AGL4 */
      pr_default.execute(2, new Object[] {AV39Var_estado, AV39Var_estado, lV10TFProCod, AV11TFProCod_Sel, lV12TFProDsc, AV13TFProDsc_Sel, lV14TFProDsc2, AV15TFProDsc2_Sel, AV16TFProProvi_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAGL6 = false ;
         A4628ProDsc2 = P0AGL4_A4628ProDsc2[0] ;
         A5289ProProvi = P0AGL4_A5289ProProvi[0] ;
         A14284ProEst = P0AGL4_A14284ProEst[0] ;
         A759ProDsc = P0AGL4_A759ProDsc[0] ;
         A758ProCod = P0AGL4_A758ProCod[0] ;
         A396EmprCod = P0AGL4_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV37FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A758ProCod) , GXutil.padr( "%" + GXutil.upper( AV37FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A759ProDsc) , GXutil.padr( "%" + GXutil.upper( AV37FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4628ProDsc2) , GXutil.padr( "%" + GXutil.upper( AV37FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activo", "") , GXutil.padr( "%" + GXutil.lower( AV37FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "inactivo", "") , GXutil.padr( "%" + GXutil.lower( AV37FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14284ProEst, "I") == 0 ) ) ) )
         {
            AV25count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AGL4_A4628ProDsc2[0], A4628ProDsc2) == 0 ) )
            {
               brkAGL6 = false ;
               A758ProCod = P0AGL4_A758ProCod[0] ;
               A396EmprCod = P0AGL4_A396EmprCod[0] ;
               AV25count = (long)(AV25count+1) ;
               brkAGL6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A4628ProDsc2)==0) )
            {
               AV20Option = A4628ProDsc2 ;
               AV21Options.add(AV20Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV25count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV21Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brkAGL6 )
         {
            brkAGL6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprocespromptgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = tprocespromptgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = tprocespromptgetfilterdata.this.AV36OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV36OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV37FilterFullText = "" ;
      AV10TFProCod = "" ;
      AV11TFProCod_Sel = "" ;
      AV12TFProDsc = "" ;
      AV13TFProDsc_Sel = "" ;
      AV14TFProDsc2 = "" ;
      AV15TFProDsc2_Sel = "" ;
      AV16TFProProvi_Sel = "" ;
      scmdbuf = "" ;
      lV10TFProCod = "" ;
      lV12TFProDsc = "" ;
      lV14TFProDsc2 = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      A5289ProProvi = "" ;
      A14284ProEst = "" ;
      AV39Var_estado = "" ;
      P0AGL2_A758ProCod = new String[] {""} ;
      P0AGL2_A5289ProProvi = new String[] {""} ;
      P0AGL2_A14284ProEst = new String[] {""} ;
      P0AGL2_A4628ProDsc2 = new String[] {""} ;
      P0AGL2_A759ProDsc = new String[] {""} ;
      P0AGL2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      P0AGL3_A759ProDsc = new String[] {""} ;
      P0AGL3_A5289ProProvi = new String[] {""} ;
      P0AGL3_A14284ProEst = new String[] {""} ;
      P0AGL3_A4628ProDsc2 = new String[] {""} ;
      P0AGL3_A758ProCod = new String[] {""} ;
      P0AGL3_A396EmprCod = new String[] {""} ;
      P0AGL4_A4628ProDsc2 = new String[] {""} ;
      P0AGL4_A5289ProProvi = new String[] {""} ;
      P0AGL4_A14284ProEst = new String[] {""} ;
      P0AGL4_A759ProDsc = new String[] {""} ;
      P0AGL4_A758ProCod = new String[] {""} ;
      P0AGL4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tprocespromptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AGL2_A758ProCod, P0AGL2_A5289ProProvi, P0AGL2_A14284ProEst, P0AGL2_A4628ProDsc2, P0AGL2_A759ProDsc, P0AGL2_A396EmprCod
            }
            , new Object[] {
            P0AGL3_A759ProDsc, P0AGL3_A5289ProProvi, P0AGL3_A14284ProEst, P0AGL3_A4628ProDsc2, P0AGL3_A758ProCod, P0AGL3_A396EmprCod
            }
            , new Object[] {
            P0AGL4_A4628ProDsc2, P0AGL4_A5289ProProvi, P0AGL4_A14284ProEst, P0AGL4_A759ProDsc, P0AGL4_A758ProCod, P0AGL4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV42GXV1 ;
   private long AV25count ;
   private String AV10TFProCod ;
   private String AV11TFProCod_Sel ;
   private String AV12TFProDsc ;
   private String AV13TFProDsc_Sel ;
   private String AV14TFProDsc2 ;
   private String AV15TFProDsc2_Sel ;
   private String AV16TFProProvi_Sel ;
   private String scmdbuf ;
   private String lV10TFProCod ;
   private String lV12TFProDsc ;
   private String lV14TFProDsc2 ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A4628ProDsc2 ;
   private String A5289ProProvi ;
   private String A14284ProEst ;
   private String AV39Var_estado ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAGL2 ;
   private boolean brkAGL4 ;
   private boolean brkAGL6 ;
   private String AV34OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV36OptionIndexesJson ;
   private String AV31DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV37FilterFullText ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGL2_A758ProCod ;
   private String[] P0AGL2_A5289ProProvi ;
   private String[] P0AGL2_A14284ProEst ;
   private String[] P0AGL2_A4628ProDsc2 ;
   private String[] P0AGL2_A759ProDsc ;
   private String[] P0AGL2_A396EmprCod ;
   private String[] P0AGL3_A759ProDsc ;
   private String[] P0AGL3_A5289ProProvi ;
   private String[] P0AGL3_A14284ProEst ;
   private String[] P0AGL3_A4628ProDsc2 ;
   private String[] P0AGL3_A758ProCod ;
   private String[] P0AGL3_A396EmprCod ;
   private String[] P0AGL4_A4628ProDsc2 ;
   private String[] P0AGL4_A5289ProProvi ;
   private String[] P0AGL4_A14284ProEst ;
   private String[] P0AGL4_A759ProDsc ;
   private String[] P0AGL4_A758ProCod ;
   private String[] P0AGL4_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV23OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
}

final  class tprocespromptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AGL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFProCod_Sel ,
                                          String AV10TFProCod ,
                                          String AV13TFProDsc_Sel ,
                                          String AV12TFProDsc ,
                                          String AV15TFProDsc2_Sel ,
                                          String AV14TFProDsc2 ,
                                          String AV16TFProProvi_Sel ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A5289ProProvi ,
                                          String AV37FilterFullText ,
                                          String A14284ProEst ,
                                          String AV39Var_estado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ProCod, ProProvi, ProEst, ProDsc2, ProDsc, EmprCod FROM TXPPROCES" ;
      addWhere(sWhereString, "(ProEst = ? or ? = 'X')");
      if ( (GXutil.strcmp("", AV11TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFProDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFProDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFProDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFProDsc2_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFProDsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFProDsc2_Sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16TFProProvi_Sel)==0) )
      {
         addWhere(sWhereString, "(ProProvi = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AGL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFProCod_Sel ,
                                          String AV10TFProCod ,
                                          String AV13TFProDsc_Sel ,
                                          String AV12TFProDsc ,
                                          String AV15TFProDsc2_Sel ,
                                          String AV14TFProDsc2 ,
                                          String AV16TFProProvi_Sel ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A5289ProProvi ,
                                          String AV37FilterFullText ,
                                          String A14284ProEst ,
                                          String AV39Var_estado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT ProDsc, ProProvi, ProEst, ProDsc2, ProCod, EmprCod FROM TXPPROCES" ;
      addWhere(sWhereString, "(ProEst = ? or ? = 'X')");
      if ( (GXutil.strcmp("", AV11TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFProDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFProDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFProDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFProDsc2_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFProDsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFProDsc2_Sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16TFProProvi_Sel)==0) )
      {
         addWhere(sWhereString, "(ProProvi = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AGL4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFProCod_Sel ,
                                          String AV10TFProCod ,
                                          String AV13TFProDsc_Sel ,
                                          String AV12TFProDsc ,
                                          String AV15TFProDsc2_Sel ,
                                          String AV14TFProDsc2 ,
                                          String AV16TFProProvi_Sel ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A5289ProProvi ,
                                          String AV37FilterFullText ,
                                          String A14284ProEst ,
                                          String AV39Var_estado )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[9];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ProDsc2, ProProvi, ProEst, ProDsc, ProCod, EmprCod FROM TXPPROCES" ;
      addWhere(sWhereString, "(ProEst = ? or ? = 'X')");
      if ( (GXutil.strcmp("", AV11TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFProDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFProDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFProDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFProDsc2_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFProDsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFProDsc2_Sel)==0) )
      {
         addWhere(sWhereString, "(ProDsc2 = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16TFProProvi_Sel)==0) )
      {
         addWhere(sWhereString, "(ProProvi = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProDsc2" ;
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
                  return conditional_P0AGL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_P0AGL3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 2 :
                  return conditional_P0AGL4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGL4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               return;
      }
   }

}

