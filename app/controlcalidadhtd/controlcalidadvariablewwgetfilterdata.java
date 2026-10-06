package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidadvariablewwgetfilterdata extends GXProcedure
{
   public controlcalidadvariablewwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadvariablewwgetfilterdata.class ), "" );
   }

   public controlcalidadvariablewwgetfilterdata( int remoteHandle ,
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
      controlcalidadvariablewwgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidadvariablewwgetfilterdata.this.AV60DDOName = aP0;
      controlcalidadvariablewwgetfilterdata.this.AV61SearchTxt = aP1;
      controlcalidadvariablewwgetfilterdata.this.AV62SearchTxtTo = aP2;
      controlcalidadvariablewwgetfilterdata.this.aP3 = aP3;
      controlcalidadvariablewwgetfilterdata.this.aP4 = aP4;
      controlcalidadvariablewwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV50Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV53OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV60DDOName), "DDO_CCTLINDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTLINDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV60DDOName), "DDO_CCTLINPICT") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTLINPICTOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV63OptionsJson = AV50Options.toJSonString(false) ;
      AV64OptionsDescJson = AV52OptionsDesc.toJSonString(false) ;
      AV65OptionIndexesJson = AV53OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV55Session.getValue("ControlCalidadHTD.ControlCalidadVariableWWGridState"), "") == 0 )
      {
         AV57GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidadVariableWWGridState"), null, null);
      }
      else
      {
         AV57GridState.fromxml(AV55Session.getValue("ControlCalidadHTD.ControlCalidadVariableWWGridState"), null, null);
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV58GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV66FilterFullText = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTCOD") == 0 )
         {
            AV16TFCCTCod = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCCTCod_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV10TFCCTLin = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCCTLin_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC") == 0 )
         {
            AV20TFCCTLinDsc = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC_SEL") == 0 )
         {
            AV21TFCCTLinDsc_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINLGODAT") == 0 )
         {
            AV22TFCCTLinLgoDat = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFCCTLinLgoDat_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINTPODAT_SEL") == 0 )
         {
            AV24TFCCTLinTpoDat_SelsJson = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV25TFCCTLinTpoDat_Sels.fromJSonString(AV24TFCCTLinTpoDat_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINPICT") == 0 )
         {
            AV26TFCCTLinPict = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINPICT_SEL") == 0 )
         {
            AV27TFCCTLinPict_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV67emprcod = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCTCOD") == 0 )
         {
            AV68cctcod = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTLINDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCCTLinDsc = AV61SearchTxt ;
      AV21TFCCTLinDsc_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A4044CCTLinTpoD ,
                                           AV25TFCCTLinTpoDat_Sels ,
                                           Integer.valueOf(AV16TFCCTCod) ,
                                           Integer.valueOf(AV17TFCCTCod_To) ,
                                           Short.valueOf(AV10TFCCTLin) ,
                                           Short.valueOf(AV11TFCCTLin_To) ,
                                           AV21TFCCTLinDsc_Sel ,
                                           AV20TFCCTLinDsc ,
                                           Short.valueOf(AV22TFCCTLinLgoDat) ,
                                           Short.valueOf(AV23TFCCTLinLgoDat_To) ,
                                           Integer.valueOf(AV25TFCCTLinTpoDat_Sels.size()) ,
                                           AV27TFCCTLinPict_Sel ,
                                           AV26TFCCTLinPict ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           Short.valueOf(A4045CCTLinLgoD) ,
                                           A4046CCTLinPict ,
                                           AV66FilterFullText ,
                                           A396EmprCod ,
                                           AV67emprcod ,
                                           Integer.valueOf(AV68cctcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV20TFCCTLinDsc = GXutil.padr( GXutil.rtrim( AV20TFCCTLinDsc), 30, "%") ;
      lV26TFCCTLinPict = GXutil.padr( GXutil.rtrim( AV26TFCCTLinPict), 40, "%") ;
      /* Using cursor P09PX2 */
      pr_default.execute(0, new Object[] {AV67emprcod, Integer.valueOf(AV68cctcod), Integer.valueOf(AV16TFCCTCod), Integer.valueOf(AV17TFCCTCod_To), Short.valueOf(AV10TFCCTLin), Short.valueOf(AV11TFCCTLin_To), lV20TFCCTLinDsc, AV21TFCCTLinDsc_Sel, Short.valueOf(AV22TFCCTLinLgoDat), Short.valueOf(AV23TFCCTLinLgoDat_To), lV26TFCCTLinPict, AV27TFCCTLinPict_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9PX2 = false ;
         A396EmprCod = P09PX2_A396EmprCod[0] ;
         A4031CCTCod = P09PX2_A4031CCTCod[0] ;
         A4043CCTLinDsc = P09PX2_A4043CCTLinDsc[0] ;
         A4046CCTLinPict = P09PX2_A4046CCTLinPict[0] ;
         A4044CCTLinTpoD = P09PX2_A4044CCTLinTpoD[0] ;
         A4045CCTLinLgoD = P09PX2_A4045CCTLinLgoD[0] ;
         A4034CCTLin = P09PX2_A4034CCTLin[0] ;
         if ( (GXutil.strcmp("", AV66FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A4031CCTCod, 6, 0) , GXutil.padr( "%" + AV66FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4034CCTLin, 4, 0) , GXutil.padr( "%" + AV66FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4043CCTLinDsc) , GXutil.padr( "%" + GXutil.upper( AV66FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4045CCTLinLgoD, 3, 0) , GXutil.padr( "%" + AV66FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "fecha", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "F") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "numérico", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "hora", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "H") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "caracteres", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "C") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "título", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "T") == 0 ) ) || ( GXutil.like( GXutil.upper( A4046CCTLinPict) , GXutil.padr( "%" + GXutil.upper( AV66FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            AV54count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09PX2_A4043CCTLinDsc[0], A4043CCTLinDsc) == 0 ) )
            {
               brk9PX2 = false ;
               A396EmprCod = P09PX2_A396EmprCod[0] ;
               A4031CCTCod = P09PX2_A4031CCTCod[0] ;
               A4034CCTLin = P09PX2_A4034CCTLin[0] ;
               AV54count = (long)(AV54count+1) ;
               brk9PX2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A4043CCTLinDsc)==0) )
            {
               AV49Option = A4043CCTLinDsc ;
               AV50Options.add(AV49Option, 0);
               AV53OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV50Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9PX2 )
         {
            brk9PX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCCTLINPICTOPTIONS' Routine */
      returnInSub = false ;
      AV26TFCCTLinPict = AV61SearchTxt ;
      AV27TFCCTLinPict_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A4044CCTLinTpoD ,
                                           AV25TFCCTLinTpoDat_Sels ,
                                           Integer.valueOf(AV16TFCCTCod) ,
                                           Integer.valueOf(AV17TFCCTCod_To) ,
                                           Short.valueOf(AV10TFCCTLin) ,
                                           Short.valueOf(AV11TFCCTLin_To) ,
                                           AV21TFCCTLinDsc_Sel ,
                                           AV20TFCCTLinDsc ,
                                           Short.valueOf(AV22TFCCTLinLgoDat) ,
                                           Short.valueOf(AV23TFCCTLinLgoDat_To) ,
                                           Integer.valueOf(AV25TFCCTLinTpoDat_Sels.size()) ,
                                           AV27TFCCTLinPict_Sel ,
                                           AV26TFCCTLinPict ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           Short.valueOf(A4045CCTLinLgoD) ,
                                           A4046CCTLinPict ,
                                           AV66FilterFullText ,
                                           A396EmprCod ,
                                           AV67emprcod ,
                                           Integer.valueOf(AV68cctcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV20TFCCTLinDsc = GXutil.padr( GXutil.rtrim( AV20TFCCTLinDsc), 30, "%") ;
      lV26TFCCTLinPict = GXutil.padr( GXutil.rtrim( AV26TFCCTLinPict), 40, "%") ;
      /* Using cursor P09PX3 */
      pr_default.execute(1, new Object[] {AV67emprcod, Integer.valueOf(AV68cctcod), Integer.valueOf(AV16TFCCTCod), Integer.valueOf(AV17TFCCTCod_To), Short.valueOf(AV10TFCCTLin), Short.valueOf(AV11TFCCTLin_To), lV20TFCCTLinDsc, AV21TFCCTLinDsc_Sel, Short.valueOf(AV22TFCCTLinLgoDat), Short.valueOf(AV23TFCCTLinLgoDat_To), lV26TFCCTLinPict, AV27TFCCTLinPict_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9PX4 = false ;
         A396EmprCod = P09PX3_A396EmprCod[0] ;
         A4031CCTCod = P09PX3_A4031CCTCod[0] ;
         A4046CCTLinPict = P09PX3_A4046CCTLinPict[0] ;
         A4044CCTLinTpoD = P09PX3_A4044CCTLinTpoD[0] ;
         A4045CCTLinLgoD = P09PX3_A4045CCTLinLgoD[0] ;
         A4043CCTLinDsc = P09PX3_A4043CCTLinDsc[0] ;
         A4034CCTLin = P09PX3_A4034CCTLin[0] ;
         if ( (GXutil.strcmp("", AV66FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A4031CCTCod, 6, 0) , GXutil.padr( "%" + AV66FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4034CCTLin, 4, 0) , GXutil.padr( "%" + AV66FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4043CCTLinDsc) , GXutil.padr( "%" + GXutil.upper( AV66FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4045CCTLinLgoD, 3, 0) , GXutil.padr( "%" + AV66FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "fecha", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "F") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "numérico", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "hora", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "H") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "caracteres", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "C") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "título", "") , GXutil.padr( "%" + GXutil.lower( AV66FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A4044CCTLinTpoD, "T") == 0 ) ) || ( GXutil.like( GXutil.upper( A4046CCTLinPict) , GXutil.padr( "%" + GXutil.upper( AV66FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            AV54count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09PX3_A4046CCTLinPict[0], A4046CCTLinPict) == 0 ) )
            {
               brk9PX4 = false ;
               A396EmprCod = P09PX3_A396EmprCod[0] ;
               A4031CCTCod = P09PX3_A4031CCTCod[0] ;
               A4034CCTLin = P09PX3_A4034CCTLin[0] ;
               AV54count = (long)(AV54count+1) ;
               brk9PX4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A4046CCTLinPict)==0) )
            {
               AV49Option = A4046CCTLinPict ;
               AV50Options.add(AV49Option, 0);
               AV53OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV50Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9PX4 )
         {
            brk9PX4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidadvariablewwgetfilterdata.this.AV63OptionsJson;
      this.aP4[0] = controlcalidadvariablewwgetfilterdata.this.AV64OptionsDescJson;
      this.aP5[0] = controlcalidadvariablewwgetfilterdata.this.AV65OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV63OptionsJson = "" ;
      AV64OptionsDescJson = "" ;
      AV65OptionIndexesJson = "" ;
      AV50Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV53OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV55Session = httpContext.getWebSession();
      AV57GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV58GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV66FilterFullText = "" ;
      AV20TFCCTLinDsc = "" ;
      AV21TFCCTLinDsc_Sel = "" ;
      AV24TFCCTLinTpoDat_SelsJson = "" ;
      AV25TFCCTLinTpoDat_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26TFCCTLinPict = "" ;
      AV27TFCCTLinPict_Sel = "" ;
      AV67emprcod = "" ;
      lV66FilterFullText = "" ;
      scmdbuf = "" ;
      lV20TFCCTLinDsc = "" ;
      lV26TFCCTLinPict = "" ;
      A4044CCTLinTpoD = "" ;
      A4043CCTLinDsc = "" ;
      A4046CCTLinPict = "" ;
      A396EmprCod = "" ;
      P09PX2_A396EmprCod = new String[] {""} ;
      P09PX2_A4031CCTCod = new int[1] ;
      P09PX2_A4043CCTLinDsc = new String[] {""} ;
      P09PX2_A4046CCTLinPict = new String[] {""} ;
      P09PX2_A4044CCTLinTpoD = new String[] {""} ;
      P09PX2_A4045CCTLinLgoD = new short[1] ;
      P09PX2_A4034CCTLin = new short[1] ;
      AV49Option = "" ;
      P09PX3_A396EmprCod = new String[] {""} ;
      P09PX3_A4031CCTCod = new int[1] ;
      P09PX3_A4046CCTLinPict = new String[] {""} ;
      P09PX3_A4044CCTLinTpoD = new String[] {""} ;
      P09PX3_A4045CCTLinLgoD = new short[1] ;
      P09PX3_A4043CCTLinDsc = new String[] {""} ;
      P09PX3_A4034CCTLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariablewwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09PX2_A396EmprCod, P09PX2_A4031CCTCod, P09PX2_A4043CCTLinDsc, P09PX2_A4046CCTLinPict, P09PX2_A4044CCTLinTpoD, P09PX2_A4045CCTLinLgoD, P09PX2_A4034CCTLin
            }
            , new Object[] {
            P09PX3_A396EmprCod, P09PX3_A4031CCTCod, P09PX3_A4046CCTLinPict, P09PX3_A4044CCTLinTpoD, P09PX3_A4045CCTLinLgoD, P09PX3_A4043CCTLinDsc, P09PX3_A4034CCTLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFCCTLin ;
   private short AV11TFCCTLin_To ;
   private short AV22TFCCTLinLgoDat ;
   private short AV23TFCCTLinLgoDat_To ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short Gx_err ;
   private int AV74GXV1 ;
   private int AV16TFCCTCod ;
   private int AV17TFCCTCod_To ;
   private int AV68cctcod ;
   private int AV25TFCCTLinTpoDat_Sels_size ;
   private int A4031CCTCod ;
   private long AV54count ;
   private String AV20TFCCTLinDsc ;
   private String AV21TFCCTLinDsc_Sel ;
   private String AV26TFCCTLinPict ;
   private String AV27TFCCTLinPict_Sel ;
   private String AV67emprcod ;
   private String scmdbuf ;
   private String lV20TFCCTLinDsc ;
   private String lV26TFCCTLinPict ;
   private String A4044CCTLinTpoD ;
   private String A4043CCTLinDsc ;
   private String A4046CCTLinPict ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9PX2 ;
   private boolean brk9PX4 ;
   private String AV63OptionsJson ;
   private String AV64OptionsDescJson ;
   private String AV65OptionIndexesJson ;
   private String AV24TFCCTLinTpoDat_SelsJson ;
   private String AV60DDOName ;
   private String AV61SearchTxt ;
   private String AV62SearchTxtTo ;
   private String AV66FilterFullText ;
   private String lV66FilterFullText ;
   private String AV49Option ;
   private com.genexus.webpanels.WebSession AV55Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PX2_A396EmprCod ;
   private int[] P09PX2_A4031CCTCod ;
   private String[] P09PX2_A4043CCTLinDsc ;
   private String[] P09PX2_A4046CCTLinPict ;
   private String[] P09PX2_A4044CCTLinTpoD ;
   private short[] P09PX2_A4045CCTLinLgoD ;
   private short[] P09PX2_A4034CCTLin ;
   private String[] P09PX3_A396EmprCod ;
   private int[] P09PX3_A4031CCTCod ;
   private String[] P09PX3_A4046CCTLinPict ;
   private String[] P09PX3_A4044CCTLinTpoD ;
   private short[] P09PX3_A4045CCTLinLgoD ;
   private String[] P09PX3_A4043CCTLinDsc ;
   private short[] P09PX3_A4034CCTLin ;
   private GXSimpleCollection<String> AV25TFCCTLinTpoDat_Sels ;
   private GXSimpleCollection<String> AV50Options ;
   private GXSimpleCollection<String> AV52OptionsDesc ;
   private GXSimpleCollection<String> AV53OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV57GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV58GridStateFilterValue ;
}

final  class controlcalidadvariablewwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4044CCTLinTpoD ,
                                          GXSimpleCollection<String> AV25TFCCTLinTpoDat_Sels ,
                                          int AV16TFCCTCod ,
                                          int AV17TFCCTCod_To ,
                                          short AV10TFCCTLin ,
                                          short AV11TFCCTLin_To ,
                                          String AV21TFCCTLinDsc_Sel ,
                                          String AV20TFCCTLinDsc ,
                                          short AV22TFCCTLinLgoDat ,
                                          short AV23TFCCTLinLgoDat_To ,
                                          int AV25TFCCTLinTpoDat_Sels_size ,
                                          String AV27TFCCTLinPict_Sel ,
                                          String AV26TFCCTLinPict ,
                                          int A4031CCTCod ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          short A4045CCTLinLgoD ,
                                          String A4046CCTLinPict ,
                                          String AV66FilterFullText ,
                                          String A396EmprCod ,
                                          String AV67emprcod ,
                                          int AV68cctcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTCod, CCTLinDsc, CCTLinPict, CCTLinTpoD, CCTLinLgoD, CCTLin FROM TXPCCDef1" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      if ( ! (0==AV16TFCCTCod) )
      {
         addWhere(sWhereString, "(CCTCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV17TFCCTCod_To) )
      {
         addWhere(sWhereString, "(CCTCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV10TFCCTLin) )
      {
         addWhere(sWhereString, "(CCTLin >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV11TFCCTLin_To) )
      {
         addWhere(sWhereString, "(CCTLin <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCCTLinDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCCTLinDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCCTLinDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV22TFCCTLinLgoDat) )
      {
         addWhere(sWhereString, "(CCTLinLgoD >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV23TFCCTLinLgoDat_To) )
      {
         addWhere(sWhereString, "(CCTLinLgoD <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( AV25TFCCTLinTpoDat_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV25TFCCTLinTpoDat_Sels, "CCTLinTpoD IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV27TFCCTLinPict_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCCTLinPict)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinPict) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCCTLinPict_Sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinPict = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCTLinDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09PX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4044CCTLinTpoD ,
                                          GXSimpleCollection<String> AV25TFCCTLinTpoDat_Sels ,
                                          int AV16TFCCTCod ,
                                          int AV17TFCCTCod_To ,
                                          short AV10TFCCTLin ,
                                          short AV11TFCCTLin_To ,
                                          String AV21TFCCTLinDsc_Sel ,
                                          String AV20TFCCTLinDsc ,
                                          short AV22TFCCTLinLgoDat ,
                                          short AV23TFCCTLinLgoDat_To ,
                                          int AV25TFCCTLinTpoDat_Sels_size ,
                                          String AV27TFCCTLinPict_Sel ,
                                          String AV26TFCCTLinPict ,
                                          int A4031CCTCod ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          short A4045CCTLinLgoD ,
                                          String A4046CCTLinPict ,
                                          String AV66FilterFullText ,
                                          String A396EmprCod ,
                                          String AV67emprcod ,
                                          int AV68cctcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[12];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTCod, CCTLinPict, CCTLinTpoD, CCTLinLgoD, CCTLinDsc, CCTLin FROM TXPCCDef1" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      if ( ! (0==AV16TFCCTCod) )
      {
         addWhere(sWhereString, "(CCTCod >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV17TFCCTCod_To) )
      {
         addWhere(sWhereString, "(CCTCod <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV10TFCCTLin) )
      {
         addWhere(sWhereString, "(CCTLin >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV11TFCCTLin_To) )
      {
         addWhere(sWhereString, "(CCTLin <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFCCTLinDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFCCTLinDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCCTLinDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDsc = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV22TFCCTLinLgoDat) )
      {
         addWhere(sWhereString, "(CCTLinLgoD >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV23TFCCTLinLgoDat_To) )
      {
         addWhere(sWhereString, "(CCTLinLgoD <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( AV25TFCCTLinTpoDat_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV25TFCCTLinTpoDat_Sels, "CCTLinTpoD IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV27TFCCTLinPict_Sel)==0) && ( ! (GXutil.strcmp("", AV26TFCCTLinPict)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinPict) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFCCTLinPict_Sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinPict = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCTLinPict" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P09PX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() );
            case 1 :
                  return conditional_P09PX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
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
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 40);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
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
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 40);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 40);
               }
               return;
      }
   }

}

