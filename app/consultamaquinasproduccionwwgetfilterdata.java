package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultamaquinasproduccionwwgetfilterdata extends GXProcedure
{
   public consultamaquinasproduccionwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultamaquinasproduccionwwgetfilterdata.class ), "" );
   }

   public consultamaquinasproduccionwwgetfilterdata( int remoteHandle ,
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
      consultamaquinasproduccionwwgetfilterdata.this.aP5 = new String[] {""};
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
      consultamaquinasproduccionwwgetfilterdata.this.AV24DDOName = aP0;
      consultamaquinasproduccionwwgetfilterdata.this.AV25SearchTxt = aP1;
      consultamaquinasproduccionwwgetfilterdata.this.AV26SearchTxtTo = aP2;
      consultamaquinasproduccionwwgetfilterdata.this.aP3 = aP3;
      consultamaquinasproduccionwwgetfilterdata.this.aP4 = aP4;
      consultamaquinasproduccionwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_LECMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADLECMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_LECHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADLECHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_LECOPENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADLECOPENOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_LECFASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADLECFASDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_LECPARNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADLECPARNOMOPTIONS' */
         S161 ();
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultaMaquinasProduccionWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultaMaquinasProduccionWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ConsultaMaquinasProduccionWWGridState"), null, null);
      }
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "LECESTADO") == 0 )
         {
            AV30LecEstado = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV35TFLecMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD_SEL") == 0 )
         {
            AV36TFLecMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV37TFLecFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV39TFLecOpeCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFLecOpeCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR") == 0 )
         {
            AV10TFLecHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR_SEL") == 0 )
         {
            AV11TFLecHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV63TFLecEstado_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV43TFLecParCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFLecParCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV64TFlecOpeNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM_SEL") == 0 )
         {
            AV65TFlecOpeNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV66TFLecFasDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC_SEL") == 0 )
         {
            AV67TFLecFasDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV68TFLecParNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM_SEL") == 0 )
         {
            AV69TFLecParNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLECMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV35TFLecMaqCod = AV25SearchTxt ;
      AV36TFLecMaqCod_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV36TFLecMaqCod_Sel ,
                                           AV35TFLecMaqCod ,
                                           AV37TFLecFec ,
                                           Integer.valueOf(AV39TFLecOpeCod) ,
                                           Integer.valueOf(AV40TFLecOpeCod_To) ,
                                           AV11TFLecHdr_Sel ,
                                           AV10TFLecHdr ,
                                           Short.valueOf(AV43TFLecParCod) ,
                                           Short.valueOf(AV44TFLecParCod_To) ,
                                           AV33LecMaqCod ,
                                           AV34LecMaqCod_To ,
                                           A1166LecMaqCod ,
                                           A1174LecFec ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Short.valueOf(A1172LecParCod) ,
                                           AV30LecEstado ,
                                           A13722LecEstado ,
                                           AV63TFLecEstado_Sel ,
                                           AV65TFlecOpeNom_Sel ,
                                           AV64TFlecOpeNom ,
                                           A14259lecOpeNom ,
                                           AV67TFLecFasDsc_Sel ,
                                           AV66TFLecFasDsc ,
                                           A14260LecFasDsc ,
                                           AV69TFLecParNom_Sel ,
                                           AV68TFLecParNom ,
                                           A14261LecParNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV35TFLecMaqCod = GXutil.padr( GXutil.rtrim( AV35TFLecMaqCod), 6, "%") ;
      lV10TFLecHdr = GXutil.padr( GXutil.rtrim( AV10TFLecHdr), 11, "%") ;
      /* Using cursor P0A6G2 */
      pr_default.execute(0, new Object[] {lV35TFLecMaqCod, AV36TFLecMaqCod_Sel, AV37TFLecFec, Integer.valueOf(AV39TFLecOpeCod), Integer.valueOf(AV40TFLecOpeCod_To), lV10TFLecHdr, AV11TFLecHdr_Sel, Short.valueOf(AV43TFLecParCod), Short.valueOf(AV44TFLecParCod_To), AV33LecMaqCod, AV34LecMaqCod_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA6G2 = false ;
         A1166LecMaqCod = P0A6G2_A1166LecMaqCod[0] ;
         A1174LecFec = P0A6G2_A1174LecFec[0] ;
         n1174LecFec = P0A6G2_n1174LecFec[0] ;
         A1188LecFasOrd = P0A6G2_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P0A6G2_n1188LecFasOrd[0] ;
         A1169LecBarPar = P0A6G2_A1169LecBarPar[0] ;
         n1169LecBarPar = P0A6G2_n1169LecBarPar[0] ;
         A1168LecBarReo = P0A6G2_A1168LecBarReo[0] ;
         n1168LecBarReo = P0A6G2_n1168LecBarReo[0] ;
         A1167LecBarCod = P0A6G2_A1167LecBarCod[0] ;
         n1167LecBarCod = P0A6G2_n1167LecBarCod[0] ;
         A1170LecOpeCod = P0A6G2_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P0A6G2_n1170LecOpeCod[0] ;
         A1171LecFasCod = P0A6G2_A1171LecFasCod[0] ;
         n1171LecFasCod = P0A6G2_n1171LecFasCod[0] ;
         A1172LecParCod = P0A6G2_A1172LecParCod[0] ;
         n1172LecParCod = P0A6G2_n1172LecParCod[0] ;
         A396EmprCod = P0A6G2_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( (GXutil.strcmp("", AV30LecEstado)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV30LecEstado) == 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV63TFLecEstado_Sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV63TFLecEstado_Sel) == 0 ) ) )
            {
               GXt_char2 = A14259lecOpeNom ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
               consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14259lecOpeNom = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV64TFlecOpeNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV64TFlecOpeNom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV65TFlecOpeNom_Sel) == 0 ) ) )
                  {
                     GXt_char2 = A14260LecFasDsc ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                     consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A14260LecFasDsc = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFLecFasDsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV66TFLecFasDsc) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV67TFLecFasDsc_Sel) == 0 ) ) )
                        {
                           GXt_char2 = A14261LecParNom ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                           consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A14261LecParNom = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFLecParNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV68TFLecParNom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV69TFLecParNom_Sel) == 0 ) ) )
                              {
                                 A13721LecHdr = GXutil.str( A1167LecBarCod, 8, 0) + "-" + GXutil.str( A1168LecBarReo, 1, 0) + A1169LecBarPar ;
                                 AV18count = 0 ;
                                 while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A6G2_A1166LecMaqCod[0], A1166LecMaqCod) == 0 ) )
                                 {
                                    brkA6G2 = false ;
                                    A396EmprCod = P0A6G2_A396EmprCod[0] ;
                                    AV18count = (long)(AV18count+1) ;
                                    brkA6G2 = true ;
                                    pr_default.readNext(0);
                                 }
                                 if ( ! (GXutil.strcmp("", A1166LecMaqCod)==0) )
                                 {
                                    AV13Option = A1166LecMaqCod ;
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
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkA6G2 )
         {
            brkA6G2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLECHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFLecHdr = AV25SearchTxt ;
      AV11TFLecHdr_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV36TFLecMaqCod_Sel ,
                                           AV35TFLecMaqCod ,
                                           AV37TFLecFec ,
                                           Integer.valueOf(AV39TFLecOpeCod) ,
                                           Integer.valueOf(AV40TFLecOpeCod_To) ,
                                           AV11TFLecHdr_Sel ,
                                           AV10TFLecHdr ,
                                           Short.valueOf(AV43TFLecParCod) ,
                                           Short.valueOf(AV44TFLecParCod_To) ,
                                           AV33LecMaqCod ,
                                           AV34LecMaqCod_To ,
                                           A1166LecMaqCod ,
                                           A1174LecFec ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Short.valueOf(A1172LecParCod) ,
                                           AV30LecEstado ,
                                           A13722LecEstado ,
                                           AV63TFLecEstado_Sel ,
                                           AV65TFlecOpeNom_Sel ,
                                           AV64TFlecOpeNom ,
                                           A14259lecOpeNom ,
                                           AV67TFLecFasDsc_Sel ,
                                           AV66TFLecFasDsc ,
                                           A14260LecFasDsc ,
                                           AV69TFLecParNom_Sel ,
                                           AV68TFLecParNom ,
                                           A14261LecParNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV35TFLecMaqCod = GXutil.padr( GXutil.rtrim( AV35TFLecMaqCod), 6, "%") ;
      lV10TFLecHdr = GXutil.padr( GXutil.rtrim( AV10TFLecHdr), 11, "%") ;
      /* Using cursor P0A6G3 */
      pr_default.execute(1, new Object[] {lV35TFLecMaqCod, AV36TFLecMaqCod_Sel, AV37TFLecFec, Integer.valueOf(AV39TFLecOpeCod), Integer.valueOf(AV40TFLecOpeCod_To), lV10TFLecHdr, AV11TFLecHdr_Sel, Short.valueOf(AV43TFLecParCod), Short.valueOf(AV44TFLecParCod_To), AV33LecMaqCod, AV34LecMaqCod_To});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA6G4 = false ;
         A13721LecHdr = P0A6G3_A13721LecHdr[0] ;
         A1174LecFec = P0A6G3_A1174LecFec[0] ;
         n1174LecFec = P0A6G3_n1174LecFec[0] ;
         A1166LecMaqCod = P0A6G3_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P0A6G3_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P0A6G3_n1188LecFasOrd[0] ;
         A1169LecBarPar = P0A6G3_A1169LecBarPar[0] ;
         n1169LecBarPar = P0A6G3_n1169LecBarPar[0] ;
         A1168LecBarReo = P0A6G3_A1168LecBarReo[0] ;
         n1168LecBarReo = P0A6G3_n1168LecBarReo[0] ;
         A1167LecBarCod = P0A6G3_A1167LecBarCod[0] ;
         n1167LecBarCod = P0A6G3_n1167LecBarCod[0] ;
         A1170LecOpeCod = P0A6G3_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P0A6G3_n1170LecOpeCod[0] ;
         A1171LecFasCod = P0A6G3_A1171LecFasCod[0] ;
         n1171LecFasCod = P0A6G3_n1171LecFasCod[0] ;
         A1172LecParCod = P0A6G3_A1172LecParCod[0] ;
         n1172LecParCod = P0A6G3_n1172LecParCod[0] ;
         A396EmprCod = P0A6G3_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( (GXutil.strcmp("", AV30LecEstado)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV30LecEstado) == 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV63TFLecEstado_Sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV63TFLecEstado_Sel) == 0 ) ) )
            {
               GXt_char2 = A14259lecOpeNom ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
               consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14259lecOpeNom = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV64TFlecOpeNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV64TFlecOpeNom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV65TFlecOpeNom_Sel) == 0 ) ) )
                  {
                     GXt_char2 = A14260LecFasDsc ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                     consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A14260LecFasDsc = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFLecFasDsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV66TFLecFasDsc) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV67TFLecFasDsc_Sel) == 0 ) ) )
                        {
                           GXt_char2 = A14261LecParNom ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                           consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A14261LecParNom = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFLecParNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV68TFLecParNom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV69TFLecParNom_Sel) == 0 ) ) )
                              {
                                 AV18count = 0 ;
                                 while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A6G3_A13721LecHdr[0], A13721LecHdr) == 0 ) )
                                 {
                                    brkA6G4 = false ;
                                    A1166LecMaqCod = P0A6G3_A1166LecMaqCod[0] ;
                                    A1169LecBarPar = P0A6G3_A1169LecBarPar[0] ;
                                    n1169LecBarPar = P0A6G3_n1169LecBarPar[0] ;
                                    A1168LecBarReo = P0A6G3_A1168LecBarReo[0] ;
                                    n1168LecBarReo = P0A6G3_n1168LecBarReo[0] ;
                                    A1167LecBarCod = P0A6G3_A1167LecBarCod[0] ;
                                    n1167LecBarCod = P0A6G3_n1167LecBarCod[0] ;
                                    A396EmprCod = P0A6G3_A396EmprCod[0] ;
                                    AV18count = (long)(AV18count+1) ;
                                    brkA6G4 = true ;
                                    pr_default.readNext(1);
                                 }
                                 if ( ! (GXutil.strcmp("", A13721LecHdr)==0) )
                                 {
                                    AV13Option = A13721LecHdr ;
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
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkA6G4 )
         {
            brkA6G4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLECOPENOMOPTIONS' Routine */
      returnInSub = false ;
      AV64TFlecOpeNom = AV25SearchTxt ;
      AV65TFlecOpeNom_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV36TFLecMaqCod_Sel ,
                                           AV35TFLecMaqCod ,
                                           AV37TFLecFec ,
                                           Integer.valueOf(AV39TFLecOpeCod) ,
                                           Integer.valueOf(AV40TFLecOpeCod_To) ,
                                           AV11TFLecHdr_Sel ,
                                           AV10TFLecHdr ,
                                           Short.valueOf(AV43TFLecParCod) ,
                                           Short.valueOf(AV44TFLecParCod_To) ,
                                           AV33LecMaqCod ,
                                           AV34LecMaqCod_To ,
                                           A1166LecMaqCod ,
                                           A1174LecFec ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Short.valueOf(A1172LecParCod) ,
                                           AV30LecEstado ,
                                           A13722LecEstado ,
                                           AV63TFLecEstado_Sel ,
                                           AV65TFlecOpeNom_Sel ,
                                           AV64TFlecOpeNom ,
                                           A14259lecOpeNom ,
                                           AV67TFLecFasDsc_Sel ,
                                           AV66TFLecFasDsc ,
                                           A14260LecFasDsc ,
                                           AV69TFLecParNom_Sel ,
                                           AV68TFLecParNom ,
                                           A14261LecParNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV35TFLecMaqCod = GXutil.padr( GXutil.rtrim( AV35TFLecMaqCod), 6, "%") ;
      lV10TFLecHdr = GXutil.padr( GXutil.rtrim( AV10TFLecHdr), 11, "%") ;
      /* Using cursor P0A6G4 */
      pr_default.execute(2, new Object[] {lV35TFLecMaqCod, AV36TFLecMaqCod_Sel, AV37TFLecFec, Integer.valueOf(AV39TFLecOpeCod), Integer.valueOf(AV40TFLecOpeCod_To), lV10TFLecHdr, AV11TFLecHdr_Sel, Short.valueOf(AV43TFLecParCod), Short.valueOf(AV44TFLecParCod_To), AV33LecMaqCod, AV34LecMaqCod_To});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1174LecFec = P0A6G4_A1174LecFec[0] ;
         n1174LecFec = P0A6G4_n1174LecFec[0] ;
         A1166LecMaqCod = P0A6G4_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P0A6G4_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P0A6G4_n1188LecFasOrd[0] ;
         A1169LecBarPar = P0A6G4_A1169LecBarPar[0] ;
         n1169LecBarPar = P0A6G4_n1169LecBarPar[0] ;
         A1168LecBarReo = P0A6G4_A1168LecBarReo[0] ;
         n1168LecBarReo = P0A6G4_n1168LecBarReo[0] ;
         A1167LecBarCod = P0A6G4_A1167LecBarCod[0] ;
         n1167LecBarCod = P0A6G4_n1167LecBarCod[0] ;
         A1170LecOpeCod = P0A6G4_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P0A6G4_n1170LecOpeCod[0] ;
         A1171LecFasCod = P0A6G4_A1171LecFasCod[0] ;
         n1171LecFasCod = P0A6G4_n1171LecFasCod[0] ;
         A1172LecParCod = P0A6G4_A1172LecParCod[0] ;
         n1172LecParCod = P0A6G4_n1172LecParCod[0] ;
         A396EmprCod = P0A6G4_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( (GXutil.strcmp("", AV30LecEstado)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV30LecEstado) == 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV63TFLecEstado_Sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV63TFLecEstado_Sel) == 0 ) ) )
            {
               GXt_char2 = A14259lecOpeNom ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
               consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14259lecOpeNom = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV64TFlecOpeNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV64TFlecOpeNom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV65TFlecOpeNom_Sel) == 0 ) ) )
                  {
                     GXt_char2 = A14260LecFasDsc ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                     consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A14260LecFasDsc = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFLecFasDsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV66TFLecFasDsc) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV67TFLecFasDsc_Sel) == 0 ) ) )
                        {
                           GXt_char2 = A14261LecParNom ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                           consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A14261LecParNom = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFLecParNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV68TFLecParNom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV69TFLecParNom_Sel) == 0 ) ) )
                              {
                                 A13721LecHdr = GXutil.str( A1167LecBarCod, 8, 0) + "-" + GXutil.str( A1168LecBarReo, 1, 0) + A1169LecBarPar ;
                                 if ( ! (GXutil.strcmp("", A14259lecOpeNom)==0) )
                                 {
                                    AV13Option = A14259lecOpeNom ;
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
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLECFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV66TFLecFasDsc = AV25SearchTxt ;
      AV67TFLecFasDsc_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV36TFLecMaqCod_Sel ,
                                           AV35TFLecMaqCod ,
                                           AV37TFLecFec ,
                                           Integer.valueOf(AV39TFLecOpeCod) ,
                                           Integer.valueOf(AV40TFLecOpeCod_To) ,
                                           AV11TFLecHdr_Sel ,
                                           AV10TFLecHdr ,
                                           Short.valueOf(AV43TFLecParCod) ,
                                           Short.valueOf(AV44TFLecParCod_To) ,
                                           AV33LecMaqCod ,
                                           AV34LecMaqCod_To ,
                                           A1166LecMaqCod ,
                                           A1174LecFec ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Short.valueOf(A1172LecParCod) ,
                                           AV30LecEstado ,
                                           A13722LecEstado ,
                                           AV63TFLecEstado_Sel ,
                                           AV65TFlecOpeNom_Sel ,
                                           AV64TFlecOpeNom ,
                                           A14259lecOpeNom ,
                                           AV67TFLecFasDsc_Sel ,
                                           AV66TFLecFasDsc ,
                                           A14260LecFasDsc ,
                                           AV69TFLecParNom_Sel ,
                                           AV68TFLecParNom ,
                                           A14261LecParNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV35TFLecMaqCod = GXutil.padr( GXutil.rtrim( AV35TFLecMaqCod), 6, "%") ;
      lV10TFLecHdr = GXutil.padr( GXutil.rtrim( AV10TFLecHdr), 11, "%") ;
      /* Using cursor P0A6G5 */
      pr_default.execute(3, new Object[] {lV35TFLecMaqCod, AV36TFLecMaqCod_Sel, AV37TFLecFec, Integer.valueOf(AV39TFLecOpeCod), Integer.valueOf(AV40TFLecOpeCod_To), lV10TFLecHdr, AV11TFLecHdr_Sel, Short.valueOf(AV43TFLecParCod), Short.valueOf(AV44TFLecParCod_To), AV33LecMaqCod, AV34LecMaqCod_To});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A1174LecFec = P0A6G5_A1174LecFec[0] ;
         n1174LecFec = P0A6G5_n1174LecFec[0] ;
         A1166LecMaqCod = P0A6G5_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P0A6G5_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P0A6G5_n1188LecFasOrd[0] ;
         A1169LecBarPar = P0A6G5_A1169LecBarPar[0] ;
         n1169LecBarPar = P0A6G5_n1169LecBarPar[0] ;
         A1168LecBarReo = P0A6G5_A1168LecBarReo[0] ;
         n1168LecBarReo = P0A6G5_n1168LecBarReo[0] ;
         A1167LecBarCod = P0A6G5_A1167LecBarCod[0] ;
         n1167LecBarCod = P0A6G5_n1167LecBarCod[0] ;
         A1170LecOpeCod = P0A6G5_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P0A6G5_n1170LecOpeCod[0] ;
         A1171LecFasCod = P0A6G5_A1171LecFasCod[0] ;
         n1171LecFasCod = P0A6G5_n1171LecFasCod[0] ;
         A1172LecParCod = P0A6G5_A1172LecParCod[0] ;
         n1172LecParCod = P0A6G5_n1172LecParCod[0] ;
         A396EmprCod = P0A6G5_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( (GXutil.strcmp("", AV30LecEstado)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV30LecEstado) == 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV63TFLecEstado_Sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV63TFLecEstado_Sel) == 0 ) ) )
            {
               GXt_char2 = A14259lecOpeNom ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
               consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14259lecOpeNom = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV64TFlecOpeNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV64TFlecOpeNom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV65TFlecOpeNom_Sel) == 0 ) ) )
                  {
                     GXt_char2 = A14260LecFasDsc ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                     consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A14260LecFasDsc = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFLecFasDsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV66TFLecFasDsc) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV67TFLecFasDsc_Sel) == 0 ) ) )
                        {
                           GXt_char2 = A14261LecParNom ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                           consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A14261LecParNom = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFLecParNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV68TFLecParNom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV69TFLecParNom_Sel) == 0 ) ) )
                              {
                                 A13721LecHdr = GXutil.str( A1167LecBarCod, 8, 0) + "-" + GXutil.str( A1168LecBarReo, 1, 0) + A1169LecBarPar ;
                                 if ( ! (GXutil.strcmp("", A14260LecFasDsc)==0) )
                                 {
                                    AV13Option = A14260LecFasDsc ;
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
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLECPARNOMOPTIONS' Routine */
      returnInSub = false ;
      AV68TFLecParNom = AV25SearchTxt ;
      AV69TFLecParNom_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV36TFLecMaqCod_Sel ,
                                           AV35TFLecMaqCod ,
                                           AV37TFLecFec ,
                                           Integer.valueOf(AV39TFLecOpeCod) ,
                                           Integer.valueOf(AV40TFLecOpeCod_To) ,
                                           AV11TFLecHdr_Sel ,
                                           AV10TFLecHdr ,
                                           Short.valueOf(AV43TFLecParCod) ,
                                           Short.valueOf(AV44TFLecParCod_To) ,
                                           AV33LecMaqCod ,
                                           AV34LecMaqCod_To ,
                                           A1166LecMaqCod ,
                                           A1174LecFec ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Short.valueOf(A1172LecParCod) ,
                                           AV30LecEstado ,
                                           A13722LecEstado ,
                                           AV63TFLecEstado_Sel ,
                                           AV65TFlecOpeNom_Sel ,
                                           AV64TFlecOpeNom ,
                                           A14259lecOpeNom ,
                                           AV67TFLecFasDsc_Sel ,
                                           AV66TFLecFasDsc ,
                                           A14260LecFasDsc ,
                                           AV69TFLecParNom_Sel ,
                                           AV68TFLecParNom ,
                                           A14261LecParNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV35TFLecMaqCod = GXutil.padr( GXutil.rtrim( AV35TFLecMaqCod), 6, "%") ;
      lV10TFLecHdr = GXutil.padr( GXutil.rtrim( AV10TFLecHdr), 11, "%") ;
      /* Using cursor P0A6G6 */
      pr_default.execute(4, new Object[] {lV35TFLecMaqCod, AV36TFLecMaqCod_Sel, AV37TFLecFec, Integer.valueOf(AV39TFLecOpeCod), Integer.valueOf(AV40TFLecOpeCod_To), lV10TFLecHdr, AV11TFLecHdr_Sel, Short.valueOf(AV43TFLecParCod), Short.valueOf(AV44TFLecParCod_To), AV33LecMaqCod, AV34LecMaqCod_To});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1174LecFec = P0A6G6_A1174LecFec[0] ;
         n1174LecFec = P0A6G6_n1174LecFec[0] ;
         A1166LecMaqCod = P0A6G6_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P0A6G6_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P0A6G6_n1188LecFasOrd[0] ;
         A1169LecBarPar = P0A6G6_A1169LecBarPar[0] ;
         n1169LecBarPar = P0A6G6_n1169LecBarPar[0] ;
         A1168LecBarReo = P0A6G6_A1168LecBarReo[0] ;
         n1168LecBarReo = P0A6G6_n1168LecBarReo[0] ;
         A1167LecBarCod = P0A6G6_A1167LecBarCod[0] ;
         n1167LecBarCod = P0A6G6_n1167LecBarCod[0] ;
         A1170LecOpeCod = P0A6G6_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P0A6G6_n1170LecOpeCod[0] ;
         A1171LecFasCod = P0A6G6_A1171LecFasCod[0] ;
         n1171LecFasCod = P0A6G6_n1171LecFasCod[0] ;
         A1172LecParCod = P0A6G6_A1172LecParCod[0] ;
         n1172LecParCod = P0A6G6_n1172LecParCod[0] ;
         A396EmprCod = P0A6G6_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( (GXutil.strcmp("", AV30LecEstado)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV30LecEstado) == 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV63TFLecEstado_Sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV63TFLecEstado_Sel) == 0 ) ) )
            {
               GXt_char2 = A14259lecOpeNom ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
               consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
               A14259lecOpeNom = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV64TFlecOpeNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV64TFlecOpeNom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV65TFlecOpeNom_Sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV65TFlecOpeNom_Sel) == 0 ) ) )
                  {
                     GXt_char2 = A14260LecFasDsc ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                     consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                     A14260LecFasDsc = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFLecFasDsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV66TFLecFasDsc) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV67TFLecFasDsc_Sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV67TFLecFasDsc_Sel) == 0 ) ) )
                        {
                           GXt_char2 = A14261LecParNom ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                           consultamaquinasproduccionwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                           A14261LecParNom = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFLecParNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV68TFLecParNom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV69TFLecParNom_Sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV69TFLecParNom_Sel) == 0 ) ) )
                              {
                                 A13721LecHdr = GXutil.str( A1167LecBarCod, 8, 0) + "-" + GXutil.str( A1168LecBarReo, 1, 0) + A1169LecBarPar ;
                                 if ( ! (GXutil.strcmp("", A14261LecParNom)==0) )
                                 {
                                    AV13Option = A14261LecParNom ;
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
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultamaquinasproduccionwwgetfilterdata.this.AV27OptionsJson;
      this.aP4[0] = consultamaquinasproduccionwwgetfilterdata.this.AV28OptionsDescJson;
      this.aP5[0] = consultamaquinasproduccionwwgetfilterdata.this.AV29OptionIndexesJson;
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
      AV30LecEstado = "" ;
      AV35TFLecMaqCod = "" ;
      AV36TFLecMaqCod_Sel = "" ;
      AV37TFLecFec = GXutil.nullDate() ;
      AV10TFLecHdr = "" ;
      AV11TFLecHdr_Sel = "" ;
      AV63TFLecEstado_Sel = "" ;
      AV64TFlecOpeNom = "" ;
      AV65TFlecOpeNom_Sel = "" ;
      AV66TFLecFasDsc = "" ;
      AV67TFLecFasDsc_Sel = "" ;
      AV68TFLecParNom = "" ;
      AV69TFLecParNom_Sel = "" ;
      scmdbuf = "" ;
      lV35TFLecMaqCod = "" ;
      lV10TFLecHdr = "" ;
      AV33LecMaqCod = "" ;
      AV34LecMaqCod_To = "" ;
      A1166LecMaqCod = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1169LecBarPar = "" ;
      A13722LecEstado = "" ;
      A14259lecOpeNom = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      P0A6G2_A1166LecMaqCod = new String[] {""} ;
      P0A6G2_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6G2_n1174LecFec = new boolean[] {false} ;
      P0A6G2_A1188LecFasOrd = new short[1] ;
      P0A6G2_n1188LecFasOrd = new boolean[] {false} ;
      P0A6G2_A1169LecBarPar = new String[] {""} ;
      P0A6G2_n1169LecBarPar = new boolean[] {false} ;
      P0A6G2_A1168LecBarReo = new byte[1] ;
      P0A6G2_n1168LecBarReo = new boolean[] {false} ;
      P0A6G2_A1167LecBarCod = new int[1] ;
      P0A6G2_n1167LecBarCod = new boolean[] {false} ;
      P0A6G2_A1170LecOpeCod = new int[1] ;
      P0A6G2_n1170LecOpeCod = new boolean[] {false} ;
      P0A6G2_A1171LecFasCod = new String[] {""} ;
      P0A6G2_n1171LecFasCod = new boolean[] {false} ;
      P0A6G2_A1172LecParCod = new short[1] ;
      P0A6G2_n1172LecParCod = new boolean[] {false} ;
      P0A6G2_A396EmprCod = new String[] {""} ;
      A1171LecFasCod = "" ;
      A396EmprCod = "" ;
      A13721LecHdr = "" ;
      AV13Option = "" ;
      P0A6G3_A13721LecHdr = new String[] {""} ;
      P0A6G3_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6G3_n1174LecFec = new boolean[] {false} ;
      P0A6G3_A1166LecMaqCod = new String[] {""} ;
      P0A6G3_A1188LecFasOrd = new short[1] ;
      P0A6G3_n1188LecFasOrd = new boolean[] {false} ;
      P0A6G3_A1169LecBarPar = new String[] {""} ;
      P0A6G3_n1169LecBarPar = new boolean[] {false} ;
      P0A6G3_A1168LecBarReo = new byte[1] ;
      P0A6G3_n1168LecBarReo = new boolean[] {false} ;
      P0A6G3_A1167LecBarCod = new int[1] ;
      P0A6G3_n1167LecBarCod = new boolean[] {false} ;
      P0A6G3_A1170LecOpeCod = new int[1] ;
      P0A6G3_n1170LecOpeCod = new boolean[] {false} ;
      P0A6G3_A1171LecFasCod = new String[] {""} ;
      P0A6G3_n1171LecFasCod = new boolean[] {false} ;
      P0A6G3_A1172LecParCod = new short[1] ;
      P0A6G3_n1172LecParCod = new boolean[] {false} ;
      P0A6G3_A396EmprCod = new String[] {""} ;
      P0A6G4_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6G4_n1174LecFec = new boolean[] {false} ;
      P0A6G4_A1166LecMaqCod = new String[] {""} ;
      P0A6G4_A1188LecFasOrd = new short[1] ;
      P0A6G4_n1188LecFasOrd = new boolean[] {false} ;
      P0A6G4_A1169LecBarPar = new String[] {""} ;
      P0A6G4_n1169LecBarPar = new boolean[] {false} ;
      P0A6G4_A1168LecBarReo = new byte[1] ;
      P0A6G4_n1168LecBarReo = new boolean[] {false} ;
      P0A6G4_A1167LecBarCod = new int[1] ;
      P0A6G4_n1167LecBarCod = new boolean[] {false} ;
      P0A6G4_A1170LecOpeCod = new int[1] ;
      P0A6G4_n1170LecOpeCod = new boolean[] {false} ;
      P0A6G4_A1171LecFasCod = new String[] {""} ;
      P0A6G4_n1171LecFasCod = new boolean[] {false} ;
      P0A6G4_A1172LecParCod = new short[1] ;
      P0A6G4_n1172LecParCod = new boolean[] {false} ;
      P0A6G4_A396EmprCod = new String[] {""} ;
      P0A6G5_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6G5_n1174LecFec = new boolean[] {false} ;
      P0A6G5_A1166LecMaqCod = new String[] {""} ;
      P0A6G5_A1188LecFasOrd = new short[1] ;
      P0A6G5_n1188LecFasOrd = new boolean[] {false} ;
      P0A6G5_A1169LecBarPar = new String[] {""} ;
      P0A6G5_n1169LecBarPar = new boolean[] {false} ;
      P0A6G5_A1168LecBarReo = new byte[1] ;
      P0A6G5_n1168LecBarReo = new boolean[] {false} ;
      P0A6G5_A1167LecBarCod = new int[1] ;
      P0A6G5_n1167LecBarCod = new boolean[] {false} ;
      P0A6G5_A1170LecOpeCod = new int[1] ;
      P0A6G5_n1170LecOpeCod = new boolean[] {false} ;
      P0A6G5_A1171LecFasCod = new String[] {""} ;
      P0A6G5_n1171LecFasCod = new boolean[] {false} ;
      P0A6G5_A1172LecParCod = new short[1] ;
      P0A6G5_n1172LecParCod = new boolean[] {false} ;
      P0A6G5_A396EmprCod = new String[] {""} ;
      P0A6G6_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6G6_n1174LecFec = new boolean[] {false} ;
      P0A6G6_A1166LecMaqCod = new String[] {""} ;
      P0A6G6_A1188LecFasOrd = new short[1] ;
      P0A6G6_n1188LecFasOrd = new boolean[] {false} ;
      P0A6G6_A1169LecBarPar = new String[] {""} ;
      P0A6G6_n1169LecBarPar = new boolean[] {false} ;
      P0A6G6_A1168LecBarReo = new byte[1] ;
      P0A6G6_n1168LecBarReo = new boolean[] {false} ;
      P0A6G6_A1167LecBarCod = new int[1] ;
      P0A6G6_n1167LecBarCod = new boolean[] {false} ;
      P0A6G6_A1170LecOpeCod = new int[1] ;
      P0A6G6_n1170LecOpeCod = new boolean[] {false} ;
      P0A6G6_A1171LecFasCod = new String[] {""} ;
      P0A6G6_n1171LecFasCod = new boolean[] {false} ;
      P0A6G6_A1172LecParCod = new short[1] ;
      P0A6G6_n1172LecParCod = new boolean[] {false} ;
      P0A6G6_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultamaquinasproduccionwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A6G2_A1166LecMaqCod, P0A6G2_A1174LecFec, P0A6G2_n1174LecFec, P0A6G2_A1188LecFasOrd, P0A6G2_n1188LecFasOrd, P0A6G2_A1169LecBarPar, P0A6G2_n1169LecBarPar, P0A6G2_A1168LecBarReo, P0A6G2_n1168LecBarReo, P0A6G2_A1167LecBarCod,
            P0A6G2_n1167LecBarCod, P0A6G2_A1170LecOpeCod, P0A6G2_n1170LecOpeCod, P0A6G2_A1171LecFasCod, P0A6G2_n1171LecFasCod, P0A6G2_A1172LecParCod, P0A6G2_n1172LecParCod, P0A6G2_A396EmprCod
            }
            , new Object[] {
            P0A6G3_A13721LecHdr, P0A6G3_A1174LecFec, P0A6G3_n1174LecFec, P0A6G3_A1166LecMaqCod, P0A6G3_A1188LecFasOrd, P0A6G3_n1188LecFasOrd, P0A6G3_A1169LecBarPar, P0A6G3_n1169LecBarPar, P0A6G3_A1168LecBarReo, P0A6G3_n1168LecBarReo,
            P0A6G3_A1167LecBarCod, P0A6G3_n1167LecBarCod, P0A6G3_A1170LecOpeCod, P0A6G3_n1170LecOpeCod, P0A6G3_A1171LecFasCod, P0A6G3_n1171LecFasCod, P0A6G3_A1172LecParCod, P0A6G3_n1172LecParCod, P0A6G3_A396EmprCod
            }
            , new Object[] {
            P0A6G4_A1174LecFec, P0A6G4_n1174LecFec, P0A6G4_A1166LecMaqCod, P0A6G4_A1188LecFasOrd, P0A6G4_n1188LecFasOrd, P0A6G4_A1169LecBarPar, P0A6G4_n1169LecBarPar, P0A6G4_A1168LecBarReo, P0A6G4_n1168LecBarReo, P0A6G4_A1167LecBarCod,
            P0A6G4_n1167LecBarCod, P0A6G4_A1170LecOpeCod, P0A6G4_n1170LecOpeCod, P0A6G4_A1171LecFasCod, P0A6G4_n1171LecFasCod, P0A6G4_A1172LecParCod, P0A6G4_n1172LecParCod, P0A6G4_A396EmprCod
            }
            , new Object[] {
            P0A6G5_A1174LecFec, P0A6G5_n1174LecFec, P0A6G5_A1166LecMaqCod, P0A6G5_A1188LecFasOrd, P0A6G5_n1188LecFasOrd, P0A6G5_A1169LecBarPar, P0A6G5_n1169LecBarPar, P0A6G5_A1168LecBarReo, P0A6G5_n1168LecBarReo, P0A6G5_A1167LecBarCod,
            P0A6G5_n1167LecBarCod, P0A6G5_A1170LecOpeCod, P0A6G5_n1170LecOpeCod, P0A6G5_A1171LecFasCod, P0A6G5_n1171LecFasCod, P0A6G5_A1172LecParCod, P0A6G5_n1172LecParCod, P0A6G5_A396EmprCod
            }
            , new Object[] {
            P0A6G6_A1174LecFec, P0A6G6_n1174LecFec, P0A6G6_A1166LecMaqCod, P0A6G6_A1188LecFasOrd, P0A6G6_n1188LecFasOrd, P0A6G6_A1169LecBarPar, P0A6G6_n1169LecBarPar, P0A6G6_A1168LecBarReo, P0A6G6_n1168LecBarReo, P0A6G6_A1167LecBarCod,
            P0A6G6_n1167LecBarCod, P0A6G6_A1170LecOpeCod, P0A6G6_n1170LecOpeCod, P0A6G6_A1171LecFasCod, P0A6G6_n1171LecFasCod, P0A6G6_A1172LecParCod, P0A6G6_n1172LecParCod, P0A6G6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private short AV43TFLecParCod ;
   private short AV44TFLecParCod_To ;
   private short A1172LecParCod ;
   private short A1188LecFasOrd ;
   private short Gx_err ;
   private int AV72GXV1 ;
   private int AV39TFLecOpeCod ;
   private int AV40TFLecOpeCod_To ;
   private int A1170LecOpeCod ;
   private int A1167LecBarCod ;
   private int AV12InsertIndex ;
   private long AV18count ;
   private String AV30LecEstado ;
   private String AV35TFLecMaqCod ;
   private String AV36TFLecMaqCod_Sel ;
   private String AV10TFLecHdr ;
   private String AV11TFLecHdr_Sel ;
   private String AV63TFLecEstado_Sel ;
   private String AV64TFlecOpeNom ;
   private String AV65TFlecOpeNom_Sel ;
   private String AV66TFLecFasDsc ;
   private String AV67TFLecFasDsc_Sel ;
   private String AV68TFLecParNom ;
   private String AV69TFLecParNom_Sel ;
   private String scmdbuf ;
   private String lV35TFLecMaqCod ;
   private String lV10TFLecHdr ;
   private String AV33LecMaqCod ;
   private String AV34LecMaqCod_To ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A13722LecEstado ;
   private String A14259lecOpeNom ;
   private String A14260LecFasDsc ;
   private String A14261LecParNom ;
   private String A1171LecFasCod ;
   private String A396EmprCod ;
   private String A13721LecHdr ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV37TFLecFec ;
   private java.util.Date A1174LecFec ;
   private boolean returnInSub ;
   private boolean brkA6G2 ;
   private boolean n1174LecFec ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private boolean brkA6G4 ;
   private String AV27OptionsJson ;
   private String AV28OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV25SearchTxt ;
   private String AV26SearchTxtTo ;
   private String AV13Option ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A6G2_A1166LecMaqCod ;
   private java.util.Date[] P0A6G2_A1174LecFec ;
   private boolean[] P0A6G2_n1174LecFec ;
   private short[] P0A6G2_A1188LecFasOrd ;
   private boolean[] P0A6G2_n1188LecFasOrd ;
   private String[] P0A6G2_A1169LecBarPar ;
   private boolean[] P0A6G2_n1169LecBarPar ;
   private byte[] P0A6G2_A1168LecBarReo ;
   private boolean[] P0A6G2_n1168LecBarReo ;
   private int[] P0A6G2_A1167LecBarCod ;
   private boolean[] P0A6G2_n1167LecBarCod ;
   private int[] P0A6G2_A1170LecOpeCod ;
   private boolean[] P0A6G2_n1170LecOpeCod ;
   private String[] P0A6G2_A1171LecFasCod ;
   private boolean[] P0A6G2_n1171LecFasCod ;
   private short[] P0A6G2_A1172LecParCod ;
   private boolean[] P0A6G2_n1172LecParCod ;
   private String[] P0A6G2_A396EmprCod ;
   private String[] P0A6G3_A13721LecHdr ;
   private java.util.Date[] P0A6G3_A1174LecFec ;
   private boolean[] P0A6G3_n1174LecFec ;
   private String[] P0A6G3_A1166LecMaqCod ;
   private short[] P0A6G3_A1188LecFasOrd ;
   private boolean[] P0A6G3_n1188LecFasOrd ;
   private String[] P0A6G3_A1169LecBarPar ;
   private boolean[] P0A6G3_n1169LecBarPar ;
   private byte[] P0A6G3_A1168LecBarReo ;
   private boolean[] P0A6G3_n1168LecBarReo ;
   private int[] P0A6G3_A1167LecBarCod ;
   private boolean[] P0A6G3_n1167LecBarCod ;
   private int[] P0A6G3_A1170LecOpeCod ;
   private boolean[] P0A6G3_n1170LecOpeCod ;
   private String[] P0A6G3_A1171LecFasCod ;
   private boolean[] P0A6G3_n1171LecFasCod ;
   private short[] P0A6G3_A1172LecParCod ;
   private boolean[] P0A6G3_n1172LecParCod ;
   private String[] P0A6G3_A396EmprCod ;
   private java.util.Date[] P0A6G4_A1174LecFec ;
   private boolean[] P0A6G4_n1174LecFec ;
   private String[] P0A6G4_A1166LecMaqCod ;
   private short[] P0A6G4_A1188LecFasOrd ;
   private boolean[] P0A6G4_n1188LecFasOrd ;
   private String[] P0A6G4_A1169LecBarPar ;
   private boolean[] P0A6G4_n1169LecBarPar ;
   private byte[] P0A6G4_A1168LecBarReo ;
   private boolean[] P0A6G4_n1168LecBarReo ;
   private int[] P0A6G4_A1167LecBarCod ;
   private boolean[] P0A6G4_n1167LecBarCod ;
   private int[] P0A6G4_A1170LecOpeCod ;
   private boolean[] P0A6G4_n1170LecOpeCod ;
   private String[] P0A6G4_A1171LecFasCod ;
   private boolean[] P0A6G4_n1171LecFasCod ;
   private short[] P0A6G4_A1172LecParCod ;
   private boolean[] P0A6G4_n1172LecParCod ;
   private String[] P0A6G4_A396EmprCod ;
   private java.util.Date[] P0A6G5_A1174LecFec ;
   private boolean[] P0A6G5_n1174LecFec ;
   private String[] P0A6G5_A1166LecMaqCod ;
   private short[] P0A6G5_A1188LecFasOrd ;
   private boolean[] P0A6G5_n1188LecFasOrd ;
   private String[] P0A6G5_A1169LecBarPar ;
   private boolean[] P0A6G5_n1169LecBarPar ;
   private byte[] P0A6G5_A1168LecBarReo ;
   private boolean[] P0A6G5_n1168LecBarReo ;
   private int[] P0A6G5_A1167LecBarCod ;
   private boolean[] P0A6G5_n1167LecBarCod ;
   private int[] P0A6G5_A1170LecOpeCod ;
   private boolean[] P0A6G5_n1170LecOpeCod ;
   private String[] P0A6G5_A1171LecFasCod ;
   private boolean[] P0A6G5_n1171LecFasCod ;
   private short[] P0A6G5_A1172LecParCod ;
   private boolean[] P0A6G5_n1172LecParCod ;
   private String[] P0A6G5_A396EmprCod ;
   private java.util.Date[] P0A6G6_A1174LecFec ;
   private boolean[] P0A6G6_n1174LecFec ;
   private String[] P0A6G6_A1166LecMaqCod ;
   private short[] P0A6G6_A1188LecFasOrd ;
   private boolean[] P0A6G6_n1188LecFasOrd ;
   private String[] P0A6G6_A1169LecBarPar ;
   private boolean[] P0A6G6_n1169LecBarPar ;
   private byte[] P0A6G6_A1168LecBarReo ;
   private boolean[] P0A6G6_n1168LecBarReo ;
   private int[] P0A6G6_A1167LecBarCod ;
   private boolean[] P0A6G6_n1167LecBarCod ;
   private int[] P0A6G6_A1170LecOpeCod ;
   private boolean[] P0A6G6_n1170LecOpeCod ;
   private String[] P0A6G6_A1171LecFasCod ;
   private boolean[] P0A6G6_n1171LecFasCod ;
   private short[] P0A6G6_A1172LecParCod ;
   private boolean[] P0A6G6_n1172LecParCod ;
   private String[] P0A6G6_A396EmprCod ;
   private GXSimpleCollection<String> AV14Options ;
   private GXSimpleCollection<String> AV16OptionsDesc ;
   private GXSimpleCollection<String> AV17OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class consultamaquinasproduccionwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A6G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV36TFLecMaqCod_Sel ,
                                          String AV35TFLecMaqCod ,
                                          java.util.Date AV37TFLecFec ,
                                          int AV39TFLecOpeCod ,
                                          int AV40TFLecOpeCod_To ,
                                          String AV11TFLecHdr_Sel ,
                                          String AV10TFLecHdr ,
                                          short AV43TFLecParCod ,
                                          short AV44TFLecParCod_To ,
                                          String AV33LecMaqCod ,
                                          String AV34LecMaqCod_To ,
                                          String A1166LecMaqCod ,
                                          java.util.Date A1174LecFec ,
                                          int A1170LecOpeCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          short A1172LecParCod ,
                                          String AV30LecEstado ,
                                          String A13722LecEstado ,
                                          String AV63TFLecEstado_Sel ,
                                          String AV65TFlecOpeNom_Sel ,
                                          String AV64TFlecOpeNom ,
                                          String A14259lecOpeNom ,
                                          String AV67TFLecFasDsc_Sel ,
                                          String AV66TFLecFasDsc ,
                                          String A14260LecFasDsc ,
                                          String AV69TFLecParNom_Sel ,
                                          String AV68TFLecParNom ,
                                          String A14261LecParNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[11];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT LecMaqCod, LecFec, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFLecMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFLecFec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV39TFLecOpeCod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV40TFLecOpeCod_To) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFLecHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV43TFLecParCod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV44TFLecParCod_To) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33LecMaqCod)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34LecMaqCod_To)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LecMaqCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A6G3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV36TFLecMaqCod_Sel ,
                                          String AV35TFLecMaqCod ,
                                          java.util.Date AV37TFLecFec ,
                                          int AV39TFLecOpeCod ,
                                          int AV40TFLecOpeCod_To ,
                                          String AV11TFLecHdr_Sel ,
                                          String AV10TFLecHdr ,
                                          short AV43TFLecParCod ,
                                          short AV44TFLecParCod_To ,
                                          String AV33LecMaqCod ,
                                          String AV34LecMaqCod_To ,
                                          String A1166LecMaqCod ,
                                          java.util.Date A1174LecFec ,
                                          int A1170LecOpeCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          short A1172LecParCod ,
                                          String AV30LecEstado ,
                                          String A13722LecEstado ,
                                          String AV63TFLecEstado_Sel ,
                                          String AV65TFlecOpeNom_Sel ,
                                          String AV64TFlecOpeNom ,
                                          String A14259lecOpeNom ,
                                          String AV67TFLecFasDsc_Sel ,
                                          String AV66TFLecFasDsc ,
                                          String A14260LecFasDsc ,
                                          String AV69TFLecParNom_Sel ,
                                          String AV68TFLecParNom ,
                                          String A14261LecParNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[11];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE( LecBarPar, '') AS LecHdr, LecFec," ;
      scmdbuf += " LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFLecMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFLecFec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV39TFLecOpeCod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV40TFLecOpeCod_To) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFLecHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV43TFLecParCod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV44TFLecParCod_To) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33LecMaqCod)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34LecMaqCod_To)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LecHdr" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0A6G4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV36TFLecMaqCod_Sel ,
                                          String AV35TFLecMaqCod ,
                                          java.util.Date AV37TFLecFec ,
                                          int AV39TFLecOpeCod ,
                                          int AV40TFLecOpeCod_To ,
                                          String AV11TFLecHdr_Sel ,
                                          String AV10TFLecHdr ,
                                          short AV43TFLecParCod ,
                                          short AV44TFLecParCod_To ,
                                          String AV33LecMaqCod ,
                                          String AV34LecMaqCod_To ,
                                          String A1166LecMaqCod ,
                                          java.util.Date A1174LecFec ,
                                          int A1170LecOpeCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          short A1172LecParCod ,
                                          String AV30LecEstado ,
                                          String A13722LecEstado ,
                                          String AV63TFLecEstado_Sel ,
                                          String AV65TFlecOpeNom_Sel ,
                                          String AV64TFlecOpeNom ,
                                          String A14259lecOpeNom ,
                                          String AV67TFLecFasDsc_Sel ,
                                          String AV66TFLecFasDsc ,
                                          String A14260LecFasDsc ,
                                          String AV69TFLecParNom_Sel ,
                                          String AV68TFLecParNom ,
                                          String A14261LecParNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[11];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT LecFec, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFLecMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFLecFec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV39TFLecOpeCod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV40TFLecOpeCod_To) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFLecHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV43TFLecParCod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV44TFLecParCod_To) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33LecMaqCod)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34LecMaqCod_To)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, LecMaqCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A6G5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV36TFLecMaqCod_Sel ,
                                          String AV35TFLecMaqCod ,
                                          java.util.Date AV37TFLecFec ,
                                          int AV39TFLecOpeCod ,
                                          int AV40TFLecOpeCod_To ,
                                          String AV11TFLecHdr_Sel ,
                                          String AV10TFLecHdr ,
                                          short AV43TFLecParCod ,
                                          short AV44TFLecParCod_To ,
                                          String AV33LecMaqCod ,
                                          String AV34LecMaqCod_To ,
                                          String A1166LecMaqCod ,
                                          java.util.Date A1174LecFec ,
                                          int A1170LecOpeCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          short A1172LecParCod ,
                                          String AV30LecEstado ,
                                          String A13722LecEstado ,
                                          String AV63TFLecEstado_Sel ,
                                          String AV65TFlecOpeNom_Sel ,
                                          String AV64TFlecOpeNom ,
                                          String A14259lecOpeNom ,
                                          String AV67TFLecFasDsc_Sel ,
                                          String AV66TFLecFasDsc ,
                                          String A14260LecFasDsc ,
                                          String AV69TFLecParNom_Sel ,
                                          String AV68TFLecParNom ,
                                          String A14261LecParNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[11];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT LecFec, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFLecMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFLecFec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV39TFLecOpeCod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV40TFLecOpeCod_To) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFLecHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV43TFLecParCod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (0==AV44TFLecParCod_To) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33LecMaqCod)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34LecMaqCod_To)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, LecMaqCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0A6G6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV36TFLecMaqCod_Sel ,
                                          String AV35TFLecMaqCod ,
                                          java.util.Date AV37TFLecFec ,
                                          int AV39TFLecOpeCod ,
                                          int AV40TFLecOpeCod_To ,
                                          String AV11TFLecHdr_Sel ,
                                          String AV10TFLecHdr ,
                                          short AV43TFLecParCod ,
                                          short AV44TFLecParCod_To ,
                                          String AV33LecMaqCod ,
                                          String AV34LecMaqCod_To ,
                                          String A1166LecMaqCod ,
                                          java.util.Date A1174LecFec ,
                                          int A1170LecOpeCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          short A1172LecParCod ,
                                          String AV30LecEstado ,
                                          String A13722LecEstado ,
                                          String AV63TFLecEstado_Sel ,
                                          String AV65TFlecOpeNom_Sel ,
                                          String AV64TFlecOpeNom ,
                                          String A14259lecOpeNom ,
                                          String AV67TFLecFasDsc_Sel ,
                                          String AV66TFLecFasDsc ,
                                          String A14260LecFasDsc ,
                                          String AV69TFLecParNom_Sel ,
                                          String AV68TFLecParNom ,
                                          String A14261LecParNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[11];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT LecFec, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFLecMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFLecFec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV39TFLecOpeCod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV40TFLecOpeCod_To) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFLecHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFLecHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV43TFLecParCod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (0==AV44TFLecParCod_To) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33LecMaqCod)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34LecMaqCod_To)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, LecMaqCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P0A6G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P0A6G3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P0A6G4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 3 :
                  return conditional_P0A6G5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 4 :
                  return conditional_P0A6G6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6G3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6G4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6G5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6G6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 11);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
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
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               return;
      }
   }

}

