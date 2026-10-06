package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn09tablafasespromptgetfilterdata extends GXProcedure
{
   public ttrn09tablafasespromptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn09tablafasespromptgetfilterdata.class ), "" );
   }

   public ttrn09tablafasespromptgetfilterdata( int remoteHandle ,
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
      ttrn09tablafasespromptgetfilterdata.this.aP5 = new String[] {""};
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
      ttrn09tablafasespromptgetfilterdata.this.AV16DDOName = aP0;
      ttrn09tablafasespromptgetfilterdata.this.AV14SearchTxt = aP1;
      ttrn09tablafasespromptgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttrn09tablafasespromptgetfilterdata.this.aP3 = aP3;
      ttrn09tablafasespromptgetfilterdata.this.aP4 = aP4;
      ttrn09tablafasespromptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_FASTIP") == 0 )
      {
         /* Execute user subroutine: 'LOADFASTIPOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_FASFORMUL") == 0 )
      {
         /* Execute user subroutine: 'LOADFASFORMULOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("TTrn09TablaFasesPromptGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn09TablaFasesPromptGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TTrn09TablaFasesPromptGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASTIP") == 0 )
         {
            AV10TFFasTip = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASTIP_SEL") == 0 )
         {
            AV11TFFasTip_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV12TFFasForMul = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV13TFFasForMul_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INEMPRCOD") == 0 )
         {
            AV33InEmprCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INALBPROCOD") == 0 )
         {
            AV34InAlbProCod = GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCOD") == 0 )
         {
            AV35InBarCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCODREO") == 0 )
         {
            AV36InBarCodReo = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCODPAR") == 0 )
         {
            AV37InBarCodPar = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASTIPOPTIONS' Routine */
      returnInSub = false ;
      AV10TFFasTip = AV14SearchTxt ;
      AV11TFFasTip_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV11TFFasTip_Sel ,
                                           AV10TFFasTip ,
                                           AV13TFFasForMul_Sel ,
                                           AV12TFFasForMul ,
                                           A6011FasTip ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           A396EmprCod ,
                                           AV33InEmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV34InAlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV35InBarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV36InBarCodReo) ,
                                           A130BarCodPar ,
                                           AV37InBarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV10TFFasTip = GXutil.padr( GXutil.rtrim( AV10TFFasTip), 1, "%") ;
      lV12TFFasForMul = GXutil.padr( GXutil.rtrim( AV12TFFasForMul), 1, "%") ;
      /* Using cursor P09NB2 */
      pr_default.execute(0, new Object[] {AV33InEmprCod, Long.valueOf(AV34InAlbProCod), Integer.valueOf(AV35InBarCod), Byte.valueOf(AV36InBarCodReo), AV37InBarCodPar, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV10TFFasTip, AV11TFFasTip_Sel, lV12TFFasForMul, AV13TFFasForMul_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9NB2 = false ;
         A396EmprCod = P09NB2_A396EmprCod[0] ;
         A30AlbProCod = P09NB2_A30AlbProCod[0] ;
         A129BarCod = P09NB2_A129BarCod[0] ;
         A132BarCodReo = P09NB2_A132BarCodReo[0] ;
         A130BarCodPar = P09NB2_A130BarCodPar[0] ;
         A6011FasTip = P09NB2_A6011FasTip[0] ;
         n6011FasTip = P09NB2_n6011FasTip[0] ;
         A4286FasForMul = P09NB2_A4286FasForMul[0] ;
         n4286FasForMul = P09NB2_n4286FasForMul[0] ;
         A460FasDsc = P09NB2_A460FasDsc[0] ;
         A457FasCod = P09NB2_A457FasCod[0] ;
         A1240GuiFasLin = P09NB2_A1240GuiFasLin[0] ;
         A6011FasTip = P09NB2_A6011FasTip[0] ;
         n6011FasTip = P09NB2_n6011FasTip[0] ;
         A4286FasForMul = P09NB2_A4286FasForMul[0] ;
         n4286FasForMul = P09NB2_n4286FasForMul[0] ;
         A460FasDsc = P09NB2_A460FasDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09NB2_A6011FasTip[0], A6011FasTip) == 0 ) )
         {
            brk9NB2 = false ;
            A396EmprCod = P09NB2_A396EmprCod[0] ;
            A30AlbProCod = P09NB2_A30AlbProCod[0] ;
            A129BarCod = P09NB2_A129BarCod[0] ;
            A132BarCodReo = P09NB2_A132BarCodReo[0] ;
            A130BarCodPar = P09NB2_A130BarCodPar[0] ;
            A457FasCod = P09NB2_A457FasCod[0] ;
            A1240GuiFasLin = P09NB2_A1240GuiFasLin[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9NB2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A6011FasTip)==0) )
         {
            AV18Option = A6011FasTip ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9NB2 )
         {
            brk9NB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASFORMULOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasForMul = AV14SearchTxt ;
      AV13TFFasForMul_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV11TFFasTip_Sel ,
                                           AV10TFFasTip ,
                                           AV13TFFasForMul_Sel ,
                                           AV12TFFasForMul ,
                                           A6011FasTip ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           A396EmprCod ,
                                           AV33InEmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV34InAlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV35InBarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV36InBarCodReo) ,
                                           A130BarCodPar ,
                                           AV37InBarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV10TFFasTip = GXutil.padr( GXutil.rtrim( AV10TFFasTip), 1, "%") ;
      lV12TFFasForMul = GXutil.padr( GXutil.rtrim( AV12TFFasForMul), 1, "%") ;
      /* Using cursor P09NB3 */
      pr_default.execute(1, new Object[] {AV33InEmprCod, Long.valueOf(AV34InAlbProCod), Integer.valueOf(AV35InBarCod), Byte.valueOf(AV36InBarCodReo), AV37InBarCodPar, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV10TFFasTip, AV11TFFasTip_Sel, lV12TFFasForMul, AV13TFFasForMul_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9NB4 = false ;
         A396EmprCod = P09NB3_A396EmprCod[0] ;
         A30AlbProCod = P09NB3_A30AlbProCod[0] ;
         A129BarCod = P09NB3_A129BarCod[0] ;
         A132BarCodReo = P09NB3_A132BarCodReo[0] ;
         A130BarCodPar = P09NB3_A130BarCodPar[0] ;
         A4286FasForMul = P09NB3_A4286FasForMul[0] ;
         n4286FasForMul = P09NB3_n4286FasForMul[0] ;
         A460FasDsc = P09NB3_A460FasDsc[0] ;
         A457FasCod = P09NB3_A457FasCod[0] ;
         A6011FasTip = P09NB3_A6011FasTip[0] ;
         n6011FasTip = P09NB3_n6011FasTip[0] ;
         A1240GuiFasLin = P09NB3_A1240GuiFasLin[0] ;
         A4286FasForMul = P09NB3_A4286FasForMul[0] ;
         n4286FasForMul = P09NB3_n4286FasForMul[0] ;
         A460FasDsc = P09NB3_A460FasDsc[0] ;
         A6011FasTip = P09NB3_A6011FasTip[0] ;
         n6011FasTip = P09NB3_n6011FasTip[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09NB3_A4286FasForMul[0], A4286FasForMul) == 0 ) )
         {
            brk9NB4 = false ;
            A396EmprCod = P09NB3_A396EmprCod[0] ;
            A30AlbProCod = P09NB3_A30AlbProCod[0] ;
            A129BarCod = P09NB3_A129BarCod[0] ;
            A132BarCodReo = P09NB3_A132BarCodReo[0] ;
            A130BarCodPar = P09NB3_A130BarCodPar[0] ;
            A457FasCod = P09NB3_A457FasCod[0] ;
            A1240GuiFasLin = P09NB3_A1240GuiFasLin[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9NB4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4286FasForMul)==0) )
         {
            AV18Option = A4286FasForMul ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4286FasForMul, "@!"))) ;
            AV19Options.add(AV18Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9NB4 )
         {
            brk9NB4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttrn09tablafasespromptgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttrn09tablafasespromptgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttrn09tablafasespromptgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFFasTip = "" ;
      AV11TFFasTip_Sel = "" ;
      AV12TFFasForMul = "" ;
      AV13TFFasForMul_Sel = "" ;
      AV33InEmprCod = "" ;
      AV37InBarCodPar = "" ;
      scmdbuf = "" ;
      lV32FilterFullText = "" ;
      lV10TFFasTip = "" ;
      lV12TFFasForMul = "" ;
      A6011FasTip = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4286FasForMul = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09NB2_A396EmprCod = new String[] {""} ;
      P09NB2_A30AlbProCod = new long[1] ;
      P09NB2_A129BarCod = new int[1] ;
      P09NB2_A132BarCodReo = new byte[1] ;
      P09NB2_A130BarCodPar = new String[] {""} ;
      P09NB2_A6011FasTip = new String[] {""} ;
      P09NB2_n6011FasTip = new boolean[] {false} ;
      P09NB2_A4286FasForMul = new String[] {""} ;
      P09NB2_n4286FasForMul = new boolean[] {false} ;
      P09NB2_A460FasDsc = new String[] {""} ;
      P09NB2_A457FasCod = new String[] {""} ;
      P09NB2_A1240GuiFasLin = new short[1] ;
      AV18Option = "" ;
      P09NB3_A396EmprCod = new String[] {""} ;
      P09NB3_A30AlbProCod = new long[1] ;
      P09NB3_A129BarCod = new int[1] ;
      P09NB3_A132BarCodReo = new byte[1] ;
      P09NB3_A130BarCodPar = new String[] {""} ;
      P09NB3_A4286FasForMul = new String[] {""} ;
      P09NB3_n4286FasForMul = new boolean[] {false} ;
      P09NB3_A460FasDsc = new String[] {""} ;
      P09NB3_A457FasCod = new String[] {""} ;
      P09NB3_A6011FasTip = new String[] {""} ;
      P09NB3_n6011FasTip = new boolean[] {false} ;
      P09NB3_A1240GuiFasLin = new short[1] ;
      AV21OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn09tablafasespromptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09NB2_A396EmprCod, P09NB2_A30AlbProCod, P09NB2_A129BarCod, P09NB2_A132BarCodReo, P09NB2_A130BarCodPar, P09NB2_A6011FasTip, P09NB2_n6011FasTip, P09NB2_A4286FasForMul, P09NB2_n4286FasForMul, P09NB2_A460FasDsc,
            P09NB2_A457FasCod, P09NB2_A1240GuiFasLin
            }
            , new Object[] {
            P09NB3_A396EmprCod, P09NB3_A30AlbProCod, P09NB3_A129BarCod, P09NB3_A132BarCodReo, P09NB3_A130BarCodPar, P09NB3_A4286FasForMul, P09NB3_n4286FasForMul, P09NB3_A460FasDsc, P09NB3_A457FasCod, P09NB3_A6011FasTip,
            P09NB3_n6011FasTip, P09NB3_A1240GuiFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV36InBarCodReo ;
   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private int AV35InBarCod ;
   private int A129BarCod ;
   private long AV34InAlbProCod ;
   private long A30AlbProCod ;
   private long AV26count ;
   private String AV10TFFasTip ;
   private String AV11TFFasTip_Sel ;
   private String AV12TFFasForMul ;
   private String AV13TFFasForMul_Sel ;
   private String AV33InEmprCod ;
   private String AV37InBarCodPar ;
   private String scmdbuf ;
   private String lV10TFFasTip ;
   private String lV12TFFasForMul ;
   private String A6011FasTip ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A4286FasForMul ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9NB2 ;
   private boolean n6011FasTip ;
   private boolean n4286FasForMul ;
   private boolean brk9NB4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String lV32FilterFullText ;
   private String AV18Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09NB2_A396EmprCod ;
   private long[] P09NB2_A30AlbProCod ;
   private int[] P09NB2_A129BarCod ;
   private byte[] P09NB2_A132BarCodReo ;
   private String[] P09NB2_A130BarCodPar ;
   private String[] P09NB2_A6011FasTip ;
   private boolean[] P09NB2_n6011FasTip ;
   private String[] P09NB2_A4286FasForMul ;
   private boolean[] P09NB2_n4286FasForMul ;
   private String[] P09NB2_A460FasDsc ;
   private String[] P09NB2_A457FasCod ;
   private short[] P09NB2_A1240GuiFasLin ;
   private String[] P09NB3_A396EmprCod ;
   private long[] P09NB3_A30AlbProCod ;
   private int[] P09NB3_A129BarCod ;
   private byte[] P09NB3_A132BarCodReo ;
   private String[] P09NB3_A130BarCodPar ;
   private String[] P09NB3_A4286FasForMul ;
   private boolean[] P09NB3_n4286FasForMul ;
   private String[] P09NB3_A460FasDsc ;
   private String[] P09NB3_A457FasCod ;
   private String[] P09NB3_A6011FasTip ;
   private boolean[] P09NB3_n6011FasTip ;
   private short[] P09NB3_A1240GuiFasLin ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttrn09tablafasespromptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09NB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV11TFFasTip_Sel ,
                                          String AV10TFFasTip ,
                                          String AV13TFFasForMul_Sel ,
                                          String AV12TFFasForMul ,
                                          String A6011FasTip ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          String A396EmprCod ,
                                          String AV33InEmprCod ,
                                          long A30AlbProCod ,
                                          long AV34InAlbProCod ,
                                          int A129BarCod ,
                                          int AV35InBarCod ,
                                          byte A132BarCodReo ,
                                          byte AV36InBarCodReo ,
                                          String A130BarCodPar ,
                                          String AV37InBarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasTip, T2.FasForMul, T2.FasDsc, T1.FasCod, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN" ;
      scmdbuf += " TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.FasTip) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFFasTip_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFFasTip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFFasTip_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasTip = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFFasForMul_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFFasForMul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFFasForMul_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasTip" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09NB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV11TFFasTip_Sel ,
                                          String AV10TFFasTip ,
                                          String AV13TFFasForMul_Sel ,
                                          String AV12TFFasForMul ,
                                          String A6011FasTip ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          String A396EmprCod ,
                                          String AV33InEmprCod ,
                                          long A30AlbProCod ,
                                          long AV34InAlbProCod ,
                                          int A129BarCod ,
                                          int AV35InBarCod ,
                                          byte A132BarCodReo ,
                                          byte AV36InBarCodReo ,
                                          String A130BarCodPar ,
                                          String AV37InBarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasForMul, T2.FasDsc, T1.FasCod, T2.FasTip, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN" ;
      scmdbuf += " TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.FasTip) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFFasTip_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFFasTip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFFasTip_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasTip = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFFasForMul_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFFasForMul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFFasForMul_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasForMul" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P09NB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P09NB3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09NB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 28);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 28);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[14]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[14]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               return;
      }
   }

}

