package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidadnotificacionwwgetfilterdata extends GXProcedure
{
   public controlcalidadnotificacionwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadnotificacionwwgetfilterdata.class ), "" );
   }

   public controlcalidadnotificacionwwgetfilterdata( int remoteHandle ,
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
      controlcalidadnotificacionwwgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidadnotificacionwwgetfilterdata.this.AV30DDOName = aP0;
      controlcalidadnotificacionwwgetfilterdata.this.AV31SearchTxt = aP1;
      controlcalidadnotificacionwwgetfilterdata.this.AV32SearchTxtTo = aP2;
      controlcalidadnotificacionwwgetfilterdata.this.aP3 = aP3;
      controlcalidadnotificacionwwgetfilterdata.this.aP4 = aP4;
      controlcalidadnotificacionwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CCTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CCTNOTEML") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTNOTEMLOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV33OptionsJson = AV20Options.toJSonString(false) ;
      AV34OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV23OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("ControlCalidadHTD.ControlCalidadNotificacionWWGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidadNotificacionWWGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("ControlCalidadHTD.ControlCalidadNotificacionWWGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV10TFCCTDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV11TFCCTDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTNOTEVT_SEL") == 0 )
         {
            AV12TFCCTNotEvt_SelsJson = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV13TFCCTNotEvt_Sels.fromJSonString(AV12TFCCTNotEvt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTNOTDST_SEL") == 0 )
         {
            AV14TFCCTNotDst_SelsJson = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV15TFCCTNotDst_Sels.fromJSonString(AV14TFCCTNotDst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTNOTEML") == 0 )
         {
            AV16TFCCTNotEml = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTNOTEML_SEL") == 0 )
         {
            AV17TFCCTNotEml_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV37emprcod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCTCOD") == 0 )
         {
            AV38cctcod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV10TFCCTDsc = AV31SearchTxt ;
      AV11TFCCTDsc_Sel = "" ;
      AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext = AV36FilterFullText ;
      AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc = AV10TFCCTDsc ;
      AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel = AV11TFCCTDsc_Sel ;
      AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels = AV13TFCCTNotEvt_Sels ;
      AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels = AV15TFCCTNotDst_Sels ;
      AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml = AV16TFCCTNotEml ;
      AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel = AV17TFCCTNotEml_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11477CCTNotEvt ,
                                           AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels ,
                                           A11478CCTNotDst ,
                                           AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels ,
                                           AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel ,
                                           AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc ,
                                           Integer.valueOf(AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels.size()) ,
                                           Integer.valueOf(AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels.size()) ,
                                           AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel ,
                                           AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml ,
                                           A4036CCTDsc ,
                                           A11480CCTNotEml ,
                                           AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext ,
                                           AV37emprcod ,
                                           Integer.valueOf(AV38cctcod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4031CCTCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc = GXutil.padr( GXutil.rtrim( AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc), 30, "%") ;
      lV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml = GXutil.padr( GXutil.rtrim( AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml), 120, "%") ;
      /* Using cursor P09S22 */
      pr_default.execute(0, new Object[] {AV37emprcod, Integer.valueOf(AV38cctcod), lV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc, AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel, lV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml, AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9S22 = false ;
         A4031CCTCod = P09S22_A4031CCTCod[0] ;
         A396EmprCod = P09S22_A396EmprCod[0] ;
         A11480CCTNotEml = P09S22_A11480CCTNotEml[0] ;
         A4036CCTDsc = P09S22_A4036CCTDsc[0] ;
         A11478CCTNotDst = P09S22_A11478CCTNotDst[0] ;
         A11477CCTNotEvt = P09S22_A11477CCTNotEvt[0] ;
         A11481CCTNotId = P09S22_A11481CCTNotId[0] ;
         A4036CCTDsc = P09S22_A4036CCTDsc[0] ;
         if ( (GXutil.strcmp("", AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4036CCTDsc) , GXutil.padr( "%" + GXutil.upper( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si falla validación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11477CCTNotEvt, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si esta todo ok", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11477CCTNotEvt, httpContext.getMessage( "O", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "siempre", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11477CCTNotEvt, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "vendedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( "V", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "usuario", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( "U", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "email específico", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11480CCTNotEml) , GXutil.padr( "%" + GXutil.upper( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV24count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09S22_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09S22_A4031CCTCod[0] == A4031CCTCod ) )
            {
               brk9S22 = false ;
               A11481CCTNotId = P09S22_A11481CCTNotId[0] ;
               AV24count = (long)(AV24count+1) ;
               brk9S22 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A4036CCTDsc)==0) )
            {
               AV19Option = A4036CCTDsc ;
               AV18InsertIndex = 1 ;
               while ( ( AV18InsertIndex <= AV20Options.size() ) && ( GXutil.strcmp((String)AV20Options.elementAt(-1+AV18InsertIndex), AV19Option) < 0 ) )
               {
                  AV18InsertIndex = (int)(AV18InsertIndex+1) ;
               }
               AV20Options.add(AV19Option, AV18InsertIndex);
               AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), AV18InsertIndex);
            }
            if ( AV20Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9S22 )
         {
            brk9S22 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCCTNOTEMLOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCCTNotEml = AV31SearchTxt ;
      AV17TFCCTNotEml_Sel = "" ;
      AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext = AV36FilterFullText ;
      AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc = AV10TFCCTDsc ;
      AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel = AV11TFCCTDsc_Sel ;
      AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels = AV13TFCCTNotEvt_Sels ;
      AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels = AV15TFCCTNotDst_Sels ;
      AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml = AV16TFCCTNotEml ;
      AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel = AV17TFCCTNotEml_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A11477CCTNotEvt ,
                                           AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels ,
                                           A11478CCTNotDst ,
                                           AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels ,
                                           AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel ,
                                           AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc ,
                                           Integer.valueOf(AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels.size()) ,
                                           Integer.valueOf(AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels.size()) ,
                                           AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel ,
                                           AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml ,
                                           A4036CCTDsc ,
                                           A11480CCTNotEml ,
                                           AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV37emprcod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV38cctcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc = GXutil.padr( GXutil.rtrim( AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc), 30, "%") ;
      lV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml = GXutil.padr( GXutil.rtrim( AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml), 120, "%") ;
      /* Using cursor P09S23 */
      pr_default.execute(1, new Object[] {AV37emprcod, Integer.valueOf(AV38cctcod), lV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc, AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel, lV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml, AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9S24 = false ;
         A396EmprCod = P09S23_A396EmprCod[0] ;
         A4031CCTCod = P09S23_A4031CCTCod[0] ;
         A11480CCTNotEml = P09S23_A11480CCTNotEml[0] ;
         A4036CCTDsc = P09S23_A4036CCTDsc[0] ;
         A11478CCTNotDst = P09S23_A11478CCTNotDst[0] ;
         A11477CCTNotEvt = P09S23_A11477CCTNotEvt[0] ;
         A11481CCTNotId = P09S23_A11481CCTNotId[0] ;
         A4036CCTDsc = P09S23_A4036CCTDsc[0] ;
         if ( (GXutil.strcmp("", AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4036CCTDsc) , GXutil.padr( "%" + GXutil.upper( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si falla validación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11477CCTNotEvt, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si esta todo ok", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11477CCTNotEvt, httpContext.getMessage( "O", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "siempre", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11477CCTNotEvt, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "vendedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( "V", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "usuario", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( "U", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "email específico", ""), "") , GXutil.padr( "%" + GXutil.lower( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11480CCTNotEml) , GXutil.padr( "%" + GXutil.upper( AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV24count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09S23_A11480CCTNotEml[0], A11480CCTNotEml) == 0 ) )
            {
               brk9S24 = false ;
               A396EmprCod = P09S23_A396EmprCod[0] ;
               A4031CCTCod = P09S23_A4031CCTCod[0] ;
               A11481CCTNotId = P09S23_A11481CCTNotId[0] ;
               AV24count = (long)(AV24count+1) ;
               brk9S24 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A11480CCTNotEml)==0) )
            {
               AV19Option = A11480CCTNotEml ;
               AV20Options.add(AV19Option, 0);
               AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV20Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9S24 )
         {
            brk9S24 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidadnotificacionwwgetfilterdata.this.AV33OptionsJson;
      this.aP4[0] = controlcalidadnotificacionwwgetfilterdata.this.AV34OptionsDescJson;
      this.aP5[0] = controlcalidadnotificacionwwgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33OptionsJson = "" ;
      AV34OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV36FilterFullText = "" ;
      AV10TFCCTDsc = "" ;
      AV11TFCCTDsc_Sel = "" ;
      AV12TFCCTNotEvt_SelsJson = "" ;
      AV13TFCCTNotEvt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV14TFCCTNotDst_SelsJson = "" ;
      AV15TFCCTNotDst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16TFCCTNotEml = "" ;
      AV17TFCCTNotEml_Sel = "" ;
      AV37emprcod = "" ;
      A4036CCTDsc = "" ;
      AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext = "" ;
      AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc = "" ;
      AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel = "" ;
      AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml = "" ;
      AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel = "" ;
      lV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc = "" ;
      lV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml = "" ;
      A11477CCTNotEvt = "" ;
      A11478CCTNotDst = "" ;
      A11480CCTNotEml = "" ;
      A396EmprCod = "" ;
      P09S22_A4031CCTCod = new int[1] ;
      P09S22_A396EmprCod = new String[] {""} ;
      P09S22_A11480CCTNotEml = new String[] {""} ;
      P09S22_A4036CCTDsc = new String[] {""} ;
      P09S22_A11478CCTNotDst = new String[] {""} ;
      P09S22_A11477CCTNotEvt = new String[] {""} ;
      P09S22_A11481CCTNotId = new short[1] ;
      AV19Option = "" ;
      P09S23_A396EmprCod = new String[] {""} ;
      P09S23_A4031CCTCod = new int[1] ;
      P09S23_A11480CCTNotEml = new String[] {""} ;
      P09S23_A4036CCTDsc = new String[] {""} ;
      P09S23_A11478CCTNotDst = new String[] {""} ;
      P09S23_A11477CCTNotEvt = new String[] {""} ;
      P09S23_A11481CCTNotId = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadnotificacionwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09S22_A4031CCTCod, P09S22_A396EmprCod, P09S22_A11480CCTNotEml, P09S22_A4036CCTDsc, P09S22_A11478CCTNotDst, P09S22_A11477CCTNotEvt, P09S22_A11481CCTNotId
            }
            , new Object[] {
            P09S23_A396EmprCod, P09S23_A4031CCTCod, P09S23_A11480CCTNotEml, P09S23_A4036CCTDsc, P09S23_A11478CCTNotDst, P09S23_A11477CCTNotEvt, P09S23_A11481CCTNotId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A11481CCTNotId ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private int AV38cctcod ;
   private int AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels_size ;
   private int AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels_size ;
   private int A4031CCTCod ;
   private int AV18InsertIndex ;
   private long AV24count ;
   private String AV10TFCCTDsc ;
   private String AV11TFCCTDsc_Sel ;
   private String AV16TFCCTNotEml ;
   private String AV17TFCCTNotEml_Sel ;
   private String AV37emprcod ;
   private String A4036CCTDsc ;
   private String AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc ;
   private String AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel ;
   private String AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml ;
   private String AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel ;
   private String scmdbuf ;
   private String lV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc ;
   private String lV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml ;
   private String A11477CCTNotEvt ;
   private String A11478CCTNotDst ;
   private String A11480CCTNotEml ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9S22 ;
   private boolean brk9S24 ;
   private String AV33OptionsJson ;
   private String AV34OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV12TFCCTNotEvt_SelsJson ;
   private String AV14TFCCTNotDst_SelsJson ;
   private String AV30DDOName ;
   private String AV31SearchTxt ;
   private String AV32SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext ;
   private String lV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext ;
   private String AV19Option ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09S22_A4031CCTCod ;
   private String[] P09S22_A396EmprCod ;
   private String[] P09S22_A11480CCTNotEml ;
   private String[] P09S22_A4036CCTDsc ;
   private String[] P09S22_A11478CCTNotDst ;
   private String[] P09S22_A11477CCTNotEvt ;
   private short[] P09S22_A11481CCTNotId ;
   private String[] P09S23_A396EmprCod ;
   private int[] P09S23_A4031CCTCod ;
   private String[] P09S23_A11480CCTNotEml ;
   private String[] P09S23_A4036CCTDsc ;
   private String[] P09S23_A11478CCTNotDst ;
   private String[] P09S23_A11477CCTNotEvt ;
   private short[] P09S23_A11481CCTNotId ;
   private GXSimpleCollection<String> AV13TFCCTNotEvt_Sels ;
   private GXSimpleCollection<String> AV15TFCCTNotDst_Sels ;
   private GXSimpleCollection<String> AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels ;
   private GXSimpleCollection<String> AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels ;
   private GXSimpleCollection<String> AV20Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV23OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class controlcalidadnotificacionwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09S22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11477CCTNotEvt ,
                                          GXSimpleCollection<String> AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels ,
                                          String A11478CCTNotDst ,
                                          GXSimpleCollection<String> AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels ,
                                          String AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel ,
                                          String AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc ,
                                          int AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels_size ,
                                          int AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels_size ,
                                          String AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel ,
                                          String AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml ,
                                          String A4036CCTDsc ,
                                          String A11480CCTNotEml ,
                                          String AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext ,
                                          String AV37emprcod ,
                                          int AV38cctcod ,
                                          String A396EmprCod ,
                                          int A4031CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CCTCod, T1.EmprCod, T1.CCTNotEml, T2.CCTDsc, T1.CCTNotDst, T1.CCTNotEvt, T1.CCTNotId FROM (TXPCCDefN T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CCTCod = T1.CCTCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CCTCod = ?)");
      if ( (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels, "T1.CCTNotEvt IN (", ")")+")");
      }
      if ( AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels, "T1.CCTNotDst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel)==0) && ( ! (GXutil.strcmp("", AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTNotEml) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTNotEml = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CCTCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09S23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11477CCTNotEvt ,
                                          GXSimpleCollection<String> AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels ,
                                          String A11478CCTNotDst ,
                                          GXSimpleCollection<String> AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels ,
                                          String AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel ,
                                          String AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc ,
                                          int AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels_size ,
                                          int AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels_size ,
                                          String AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel ,
                                          String AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml ,
                                          String A4036CCTDsc ,
                                          String A11480CCTNotEml ,
                                          String AV43Controlcalidadhtd_controlcalidadnotificacionwwds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV37emprcod ,
                                          int A4031CCTCod ,
                                          int AV38cctcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[6];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCTCod, T1.CCTNotEml, T2.CCTDsc, T1.CCTNotDst, T1.CCTNotEvt, T1.CCTNotId FROM (TXPCCDefN T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CCTCod = T1.CCTCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV44Controlcalidadhtd_controlcalidadnotificacionwwds_2_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Controlcalidadhtd_controlcalidadnotificacionwwds_3_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTDsc = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV46Controlcalidadhtd_controlcalidadnotificacionwwds_4_tfcctnotevt_sels, "T1.CCTNotEvt IN (", ")")+")");
      }
      if ( AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV47Controlcalidadhtd_controlcalidadnotificacionwwds_5_tfcctnotdst_sels, "T1.CCTNotDst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel)==0) && ( ! (GXutil.strcmp("", AV48Controlcalidadhtd_controlcalidadnotificacionwwds_6_tfcctnoteml)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTNotEml) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidadnotificacionwwds_7_tfcctnoteml_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTNotEml = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCTNotEml" ;
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
                  return conditional_P09S22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() );
            case 1 :
                  return conditional_P09S23(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09S22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09S23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 120);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 120);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 120);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 120);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 120);
               }
               return;
      }
   }

}

