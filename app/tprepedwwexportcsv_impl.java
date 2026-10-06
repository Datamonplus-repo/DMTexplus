package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprepedwwexportcsv_impl extends GXWebProcedure
{
   public tprepedwwexportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "TPREPEDWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("TPREPEDWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TPREPEDWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "PrePrvNum", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Prepedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Confirmado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descuento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Prioridad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio Actual", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descuento", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV73Tprepedwwds_1_filterfulltext = AV63FilterFullText ;
      AV74Tprepedwwds_2_tfemprcod = AV45TFEmprCod ;
      AV75Tprepedwwds_3_tfemprcod_sel = AV46TFEmprCod_Sel ;
      AV76Tprepedwwds_4_tfpreprvnum = AV47TFPrePrvNum ;
      AV77Tprepedwwds_5_tfpreprvnum_to = AV48TFPrePrvNum_To ;
      AV78Tprepedwwds_6_tfpreprvdsc = AV64TFPrePrvDsc ;
      AV79Tprepedwwds_7_tfpreprvdsc_sel = AV65TFPrePrvDsc_Sel ;
      AV80Tprepedwwds_8_tfprdnum = AV49TFPrdNum ;
      AV81Tprepedwwds_9_tfprdnum_sel = AV50TFPrdNum_Sel ;
      AV82Tprepedwwds_10_tfpedcod = AV51TFPedCod ;
      AV83Tprepedwwds_11_tfpedcod_to = AV52TFPedCod_To ;
      AV84Tprepedwwds_12_tfprepeduni = AV53TFPrePedUni ;
      AV85Tprepedwwds_13_tfprepeduni_to = AV54TFPrePedUni_To ;
      AV86Tprepedwwds_14_tfprepedcon = AV55TFPrePedCon ;
      AV87Tprepedwwds_15_tfprepedcon_sel = AV56TFPrePedCon_Sel ;
      AV88Tprepedwwds_16_tfprepedpre = AV57TFPrePedPre ;
      AV89Tprepedwwds_17_tfprepedpre_to = AV58TFPrePedPre_To ;
      AV90Tprepedwwds_18_tfprepeddto = AV59TFPrePedDto ;
      AV91Tprepedwwds_19_tfprepeddto_to = AV60TFPrePedDto_To ;
      AV92Tprepedwwds_20_tfprepedpri = AV61TFPrePedPri ;
      AV93Tprepedwwds_21_tfprepedpri_sel = AV62TFPrePedPri_Sel ;
      AV94Tprepedwwds_22_tfprdpreact = AV66TFPrdPreAct ;
      AV95Tprepedwwds_23_tfprdpreact_to = AV67TFPrdPreAct_To ;
      AV96Tprepedwwds_24_tftipdtodto = AV68TFTipDtoDto ;
      AV97Tprepedwwds_25_tftipdtodto_to = AV69TFTipDtoDto_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV75Tprepedwwds_3_tfemprcod_sel ,
                                           AV74Tprepedwwds_2_tfemprcod ,
                                           Integer.valueOf(AV76Tprepedwwds_4_tfpreprvnum) ,
                                           Integer.valueOf(AV77Tprepedwwds_5_tfpreprvnum_to) ,
                                           AV81Tprepedwwds_9_tfprdnum_sel ,
                                           AV80Tprepedwwds_8_tfprdnum ,
                                           Integer.valueOf(AV82Tprepedwwds_10_tfpedcod) ,
                                           Integer.valueOf(AV83Tprepedwwds_11_tfpedcod_to) ,
                                           AV84Tprepedwwds_12_tfprepeduni ,
                                           AV85Tprepedwwds_13_tfprepeduni_to ,
                                           AV87Tprepedwwds_15_tfprepedcon_sel ,
                                           AV86Tprepedwwds_14_tfprepedcon ,
                                           AV88Tprepedwwds_16_tfprepedpre ,
                                           AV89Tprepedwwds_17_tfprepedpre_to ,
                                           AV90Tprepedwwds_18_tfprepeddto ,
                                           AV91Tprepedwwds_19_tfprepeddto_to ,
                                           AV93Tprepedwwds_21_tfprepedpri_sel ,
                                           AV92Tprepedwwds_20_tfprepedpri ,
                                           AV94Tprepedwwds_22_tfprdpreact ,
                                           AV95Tprepedwwds_23_tfprdpreact_to ,
                                           AV96Tprepedwwds_24_tftipdtodto ,
                                           AV97Tprepedwwds_25_tftipdtodto_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A658PedCod) ,
                                           A755PrePedUni ,
                                           A751PrePedCon ,
                                           A753PrePedPre ,
                                           A752PrePedDto ,
                                           A754PrePedPri ,
                                           A724PrdPreAct ,
                                           A837TipDtoDto ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV73Tprepedwwds_1_filterfulltext ,
                                           A13791PrePrvDsc ,
                                           AV79Tprepedwwds_7_tfpreprvdsc_sel ,
                                           AV78Tprepedwwds_6_tfpreprvdsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV73Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Tprepedwwds_1_filterfulltext), "%", "") ;
      lV78Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV78Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
      lV74Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV74Tprepedwwds_2_tfemprcod), 3, "%") ;
      lV80Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV80Tprepedwwds_8_tfprdnum), 6, "%") ;
      lV86Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV86Tprepedwwds_14_tfprepedcon), 1, "%") ;
      lV92Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV92Tprepedwwds_20_tfprepedpri), 1, "%") ;
      /* Using cursor P08RK2 */
      pr_default.execute(0, new Object[] {AV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, lV73Tprepedwwds_1_filterfulltext, AV79Tprepedwwds_7_tfpreprvdsc_sel, AV78Tprepedwwds_6_tfpreprvdsc, lV78Tprepedwwds_6_tfpreprvdsc, AV79Tprepedwwds_7_tfpreprvdsc_sel, AV79Tprepedwwds_7_tfpreprvdsc_sel, lV74Tprepedwwds_2_tfemprcod, AV75Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV76Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV77Tprepedwwds_5_tfpreprvnum_to), lV80Tprepedwwds_8_tfprdnum, AV81Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV82Tprepedwwds_10_tfpedcod), Integer.valueOf(AV83Tprepedwwds_11_tfpedcod_to), AV84Tprepedwwds_12_tfprepeduni, AV85Tprepedwwds_13_tfprepeduni_to, lV86Tprepedwwds_14_tfprepedcon, AV87Tprepedwwds_15_tfprepedcon_sel, AV88Tprepedwwds_16_tfprepedpre, AV89Tprepedwwds_17_tfprepedpre_to, AV90Tprepedwwds_18_tfprepeddto, AV91Tprepedwwds_19_tfprepeddto_to, lV92Tprepedwwds_20_tfprepedpri, AV93Tprepedwwds_21_tfprepedpri_sel, AV94Tprepedwwds_22_tfprdpreact, AV95Tprepedwwds_23_tfprdpreact_to, AV96Tprepedwwds_24_tftipdtodto, AV97Tprepedwwds_25_tftipdtodto_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A835TipDtoCod = P08RK2_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RK2_n835TipDtoCod[0] ;
         A837TipDtoDto = P08RK2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RK2_n837TipDtoDto[0] ;
         A724PrdPreAct = P08RK2_A724PrdPreAct[0] ;
         A754PrePedPri = P08RK2_A754PrePedPri[0] ;
         n754PrePedPri = P08RK2_n754PrePedPri[0] ;
         A752PrePedDto = P08RK2_A752PrePedDto[0] ;
         n752PrePedDto = P08RK2_n752PrePedDto[0] ;
         A753PrePedPre = P08RK2_A753PrePedPre[0] ;
         n753PrePedPre = P08RK2_n753PrePedPre[0] ;
         A751PrePedCon = P08RK2_A751PrePedCon[0] ;
         n751PrePedCon = P08RK2_n751PrePedCon[0] ;
         A755PrePedUni = P08RK2_A755PrePedUni[0] ;
         n755PrePedUni = P08RK2_n755PrePedUni[0] ;
         A658PedCod = P08RK2_A658PedCod[0] ;
         n658PedCod = P08RK2_n658PedCod[0] ;
         A719PrdNum = P08RK2_A719PrdNum[0] ;
         A756PrePrvNum = P08RK2_A756PrePrvNum[0] ;
         A396EmprCod = P08RK2_A396EmprCod[0] ;
         A13791PrePrvDsc = P08RK2_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RK2_n13791PrePrvDsc[0] ;
         A835TipDtoCod = P08RK2_A835TipDtoCod[0] ;
         n835TipDtoCod = P08RK2_n835TipDtoCod[0] ;
         A724PrdPreAct = P08RK2_A724PrdPreAct[0] ;
         A837TipDtoDto = P08RK2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08RK2_n837TipDtoDto[0] ;
         A13791PrePrvDsc = P08RK2_A13791PrePrvDsc[0] ;
         n13791PrePrvDsc = P08RK2_n13791PrePrvDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
            tprepedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A756PrePrvNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13791PrePrvDsc, ";", ","), GXv_char3) ;
            tprepedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            tprepedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A658PedCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A755PrePedUni, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A751PrePedCon, ";", ","), GXv_char3) ;
            tprepedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A753PrePedPre, 12, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A752PrePedDto, 5, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A754PrePedPri, ";", ","), GXv_char3) ;
            tprepedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A724PrdPreAct, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A837TipDtoDto, 5, 2) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TPREPEDWWExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCod", "", "Código Empresa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrePrvNum", "", "PrePrvNum", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrePrvDsc", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PedCod", "", "Nº Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrePedUni", "", "Unidades Prepedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrePedCon", "", "Confirmado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrePedPre", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrePedDto", "", "Descuento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrePedPri", "", "Prioridad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipDtoDto", "", "Descuento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPREPEDWWColumnsSelector", GXv_char3) ;
      tprepedwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("TPREPEDWWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPREPEDWWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV19Session.getValue("TPREPEDWWGridState"), null, null);
      }
      AV28OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV63FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV45TFEmprCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV46TFEmprCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVNUM") == 0 )
         {
            AV47TFPrePrvNum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFPrePrvNum_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC") == 0 )
         {
            AV64TFPrePrvDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC_SEL") == 0 )
         {
            AV65TFPrePrvDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV49TFPrdNum = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV50TFPrdNum_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV51TFPedCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFPedCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDUNI") == 0 )
         {
            AV53TFPrePedUni = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFPrePedUni_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON") == 0 )
         {
            AV55TFPrePedCon = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON_SEL") == 0 )
         {
            AV56TFPrePedCon_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRE") == 0 )
         {
            AV57TFPrePedPre = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFPrePedPre_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDDTO") == 0 )
         {
            AV59TFPrePedDto = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFPrePedDto_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI") == 0 )
         {
            AV61TFPrePedPri = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI_SEL") == 0 )
         {
            AV62TFPrePedPri_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV66TFPrdPreAct = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV67TFPrdPreAct_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODTO") == 0 )
         {
            AV68TFTipDtoDto = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV69TFTipDtoDto_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A396EmprCod = "" ;
      A13791PrePrvDsc = "" ;
      A719PrdNum = "" ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A751PrePedCon = "" ;
      A753PrePedPre = DecimalUtil.ZERO ;
      A752PrePedDto = DecimalUtil.ZERO ;
      A754PrePedPri = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      AV73Tprepedwwds_1_filterfulltext = "" ;
      AV63FilterFullText = "" ;
      AV74Tprepedwwds_2_tfemprcod = "" ;
      AV45TFEmprCod = "" ;
      AV75Tprepedwwds_3_tfemprcod_sel = "" ;
      AV46TFEmprCod_Sel = "" ;
      AV78Tprepedwwds_6_tfpreprvdsc = "" ;
      AV64TFPrePrvDsc = "" ;
      AV79Tprepedwwds_7_tfpreprvdsc_sel = "" ;
      AV65TFPrePrvDsc_Sel = "" ;
      AV80Tprepedwwds_8_tfprdnum = "" ;
      AV49TFPrdNum = "" ;
      AV81Tprepedwwds_9_tfprdnum_sel = "" ;
      AV50TFPrdNum_Sel = "" ;
      AV84Tprepedwwds_12_tfprepeduni = DecimalUtil.ZERO ;
      AV53TFPrePedUni = DecimalUtil.ZERO ;
      AV85Tprepedwwds_13_tfprepeduni_to = DecimalUtil.ZERO ;
      AV54TFPrePedUni_To = DecimalUtil.ZERO ;
      AV86Tprepedwwds_14_tfprepedcon = "" ;
      AV55TFPrePedCon = "" ;
      AV87Tprepedwwds_15_tfprepedcon_sel = "" ;
      AV56TFPrePedCon_Sel = "" ;
      AV88Tprepedwwds_16_tfprepedpre = DecimalUtil.ZERO ;
      AV57TFPrePedPre = DecimalUtil.ZERO ;
      AV89Tprepedwwds_17_tfprepedpre_to = DecimalUtil.ZERO ;
      AV58TFPrePedPre_To = DecimalUtil.ZERO ;
      AV90Tprepedwwds_18_tfprepeddto = DecimalUtil.ZERO ;
      AV59TFPrePedDto = DecimalUtil.ZERO ;
      AV91Tprepedwwds_19_tfprepeddto_to = DecimalUtil.ZERO ;
      AV60TFPrePedDto_To = DecimalUtil.ZERO ;
      AV92Tprepedwwds_20_tfprepedpri = "" ;
      AV61TFPrePedPri = "" ;
      AV93Tprepedwwds_21_tfprepedpri_sel = "" ;
      AV62TFPrePedPri_Sel = "" ;
      AV94Tprepedwwds_22_tfprdpreact = DecimalUtil.ZERO ;
      AV66TFPrdPreAct = DecimalUtil.ZERO ;
      AV95Tprepedwwds_23_tfprdpreact_to = DecimalUtil.ZERO ;
      AV67TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV96Tprepedwwds_24_tftipdtodto = DecimalUtil.ZERO ;
      AV68TFTipDtoDto = DecimalUtil.ZERO ;
      AV97Tprepedwwds_25_tftipdtodto_to = DecimalUtil.ZERO ;
      AV69TFTipDtoDto_To = DecimalUtil.ZERO ;
      lV73Tprepedwwds_1_filterfulltext = "" ;
      lV78Tprepedwwds_6_tfpreprvdsc = "" ;
      scmdbuf = "" ;
      lV74Tprepedwwds_2_tfemprcod = "" ;
      lV80Tprepedwwds_8_tfprdnum = "" ;
      lV86Tprepedwwds_14_tfprepedcon = "" ;
      lV92Tprepedwwds_20_tfprepedpri = "" ;
      P08RK2_A795PrvNum = new int[1] ;
      P08RK2_A835TipDtoCod = new byte[1] ;
      P08RK2_n835TipDtoCod = new boolean[] {false} ;
      P08RK2_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RK2_n837TipDtoDto = new boolean[] {false} ;
      P08RK2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RK2_A754PrePedPri = new String[] {""} ;
      P08RK2_n754PrePedPri = new boolean[] {false} ;
      P08RK2_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RK2_n752PrePedDto = new boolean[] {false} ;
      P08RK2_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RK2_n753PrePedPre = new boolean[] {false} ;
      P08RK2_A751PrePedCon = new String[] {""} ;
      P08RK2_n751PrePedCon = new boolean[] {false} ;
      P08RK2_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RK2_n755PrePedUni = new boolean[] {false} ;
      P08RK2_A658PedCod = new int[1] ;
      P08RK2_n658PedCod = new boolean[] {false} ;
      P08RK2_A719PrdNum = new String[] {""} ;
      P08RK2_A756PrePrvNum = new int[1] ;
      P08RK2_A396EmprCod = new String[] {""} ;
      P08RK2_A13791PrePrvDsc = new String[] {""} ;
      P08RK2_n13791PrePrvDsc = new boolean[] {false} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprepedwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08RK2_A795PrvNum, P08RK2_A835TipDtoCod, P08RK2_n835TipDtoCod, P08RK2_A837TipDtoDto, P08RK2_n837TipDtoDto, P08RK2_A724PrdPreAct, P08RK2_A754PrePedPri, P08RK2_n754PrePedPri, P08RK2_A752PrePedDto, P08RK2_n752PrePedDto,
            P08RK2_A753PrePedPre, P08RK2_n753PrePedPre, P08RK2_A751PrePedCon, P08RK2_n751PrePedCon, P08RK2_A755PrePedUni, P08RK2_n755PrePedUni, P08RK2_A658PedCod, P08RK2_n658PedCod, P08RK2_A719PrdNum, P08RK2_A756PrePrvNum,
            P08RK2_A396EmprCod, P08RK2_A13791PrePrvDsc, P08RK2_n13791PrePrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A835TipDtoCod ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A756PrePrvNum ;
   private int A658PedCod ;
   private int AV76Tprepedwwds_4_tfpreprvnum ;
   private int AV47TFPrePrvNum ;
   private int AV77Tprepedwwds_5_tfpreprvnum_to ;
   private int AV48TFPrePrvNum_To ;
   private int AV82Tprepedwwds_10_tfpedcod ;
   private int AV51TFPedCod ;
   private int AV83Tprepedwwds_11_tfpedcod_to ;
   private int AV52TFPedCod_To ;
   private int AV98GXV1 ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A753PrePedPre ;
   private java.math.BigDecimal A752PrePedDto ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal AV84Tprepedwwds_12_tfprepeduni ;
   private java.math.BigDecimal AV53TFPrePedUni ;
   private java.math.BigDecimal AV85Tprepedwwds_13_tfprepeduni_to ;
   private java.math.BigDecimal AV54TFPrePedUni_To ;
   private java.math.BigDecimal AV88Tprepedwwds_16_tfprepedpre ;
   private java.math.BigDecimal AV57TFPrePedPre ;
   private java.math.BigDecimal AV89Tprepedwwds_17_tfprepedpre_to ;
   private java.math.BigDecimal AV58TFPrePedPre_To ;
   private java.math.BigDecimal AV90Tprepedwwds_18_tfprepeddto ;
   private java.math.BigDecimal AV59TFPrePedDto ;
   private java.math.BigDecimal AV91Tprepedwwds_19_tfprepeddto_to ;
   private java.math.BigDecimal AV60TFPrePedDto_To ;
   private java.math.BigDecimal AV94Tprepedwwds_22_tfprdpreact ;
   private java.math.BigDecimal AV66TFPrdPreAct ;
   private java.math.BigDecimal AV95Tprepedwwds_23_tfprdpreact_to ;
   private java.math.BigDecimal AV67TFPrdPreAct_To ;
   private java.math.BigDecimal AV96Tprepedwwds_24_tftipdtodto ;
   private java.math.BigDecimal AV68TFTipDtoDto ;
   private java.math.BigDecimal AV97Tprepedwwds_25_tftipdtodto_to ;
   private java.math.BigDecimal AV69TFTipDtoDto_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A13791PrePrvDsc ;
   private String A719PrdNum ;
   private String A751PrePedCon ;
   private String A754PrePedPri ;
   private String AV74Tprepedwwds_2_tfemprcod ;
   private String AV45TFEmprCod ;
   private String AV75Tprepedwwds_3_tfemprcod_sel ;
   private String AV46TFEmprCod_Sel ;
   private String AV78Tprepedwwds_6_tfpreprvdsc ;
   private String AV64TFPrePrvDsc ;
   private String AV79Tprepedwwds_7_tfpreprvdsc_sel ;
   private String AV65TFPrePrvDsc_Sel ;
   private String AV80Tprepedwwds_8_tfprdnum ;
   private String AV49TFPrdNum ;
   private String AV81Tprepedwwds_9_tfprdnum_sel ;
   private String AV50TFPrdNum_Sel ;
   private String AV86Tprepedwwds_14_tfprepedcon ;
   private String AV55TFPrePedCon ;
   private String AV87Tprepedwwds_15_tfprepedcon_sel ;
   private String AV56TFPrePedCon_Sel ;
   private String AV92Tprepedwwds_20_tfprepedpri ;
   private String AV61TFPrePedPri ;
   private String AV93Tprepedwwds_21_tfprepedpri_sel ;
   private String AV62TFPrePedPri_Sel ;
   private String lV78Tprepedwwds_6_tfpreprvdsc ;
   private String scmdbuf ;
   private String lV74Tprepedwwds_2_tfemprcod ;
   private String lV80Tprepedwwds_8_tfprdnum ;
   private String lV86Tprepedwwds_14_tfprepedcon ;
   private String lV92Tprepedwwds_20_tfprepedpri ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n835TipDtoCod ;
   private boolean n837TipDtoDto ;
   private boolean n754PrePedPri ;
   private boolean n752PrePedDto ;
   private boolean n753PrePedPre ;
   private boolean n751PrePedCon ;
   private boolean n755PrePedUni ;
   private boolean n658PedCod ;
   private boolean n13791PrePrvDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV73Tprepedwwds_1_filterfulltext ;
   private String AV63FilterFullText ;
   private String lV73Tprepedwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P08RK2_A795PrvNum ;
   private byte[] P08RK2_A835TipDtoCod ;
   private boolean[] P08RK2_n835TipDtoCod ;
   private java.math.BigDecimal[] P08RK2_A837TipDtoDto ;
   private boolean[] P08RK2_n837TipDtoDto ;
   private java.math.BigDecimal[] P08RK2_A724PrdPreAct ;
   private String[] P08RK2_A754PrePedPri ;
   private boolean[] P08RK2_n754PrePedPri ;
   private java.math.BigDecimal[] P08RK2_A752PrePedDto ;
   private boolean[] P08RK2_n752PrePedDto ;
   private java.math.BigDecimal[] P08RK2_A753PrePedPre ;
   private boolean[] P08RK2_n753PrePedPre ;
   private String[] P08RK2_A751PrePedCon ;
   private boolean[] P08RK2_n751PrePedCon ;
   private java.math.BigDecimal[] P08RK2_A755PrePedUni ;
   private boolean[] P08RK2_n755PrePedUni ;
   private int[] P08RK2_A658PedCod ;
   private boolean[] P08RK2_n658PedCod ;
   private String[] P08RK2_A719PrdNum ;
   private int[] P08RK2_A756PrePrvNum ;
   private String[] P08RK2_A396EmprCod ;
   private String[] P08RK2_A13791PrePrvDsc ;
   private boolean[] P08RK2_n13791PrePrvDsc ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class tprepedwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08RK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Tprepedwwds_3_tfemprcod_sel ,
                                          String AV74Tprepedwwds_2_tfemprcod ,
                                          int AV76Tprepedwwds_4_tfpreprvnum ,
                                          int AV77Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV81Tprepedwwds_9_tfprdnum_sel ,
                                          String AV80Tprepedwwds_8_tfprdnum ,
                                          int AV82Tprepedwwds_10_tfpedcod ,
                                          int AV83Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV84Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV85Tprepedwwds_13_tfprepeduni_to ,
                                          String AV87Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV86Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV88Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV89Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV90Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV91Tprepedwwds_19_tfprepeddto_to ,
                                          String AV93Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV92Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV94Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV95Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV96Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV97Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV73Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV79Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV78Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[40];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T4.PrvNum, T2.TipDtoCod, T3.TipDtoDto, T2.PrdPreAct, T1.PrePedPri, T1.PrePedDto, T1.PrePedPre, T1.PrePedCon, T1.PrePedUni, T1.PedCod, T1.PrdNum, T1.PrePrvNum," ;
      scmdbuf += " T1.EmprCod, COALESCE( T4.PrvNom, 'Error') AS PrePrvDsc FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN" ;
      scmdbuf += " TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDtoCod = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV75Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV76Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV77Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV80Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV86Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV92Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePrvNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedUni" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedCon" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedCon DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedPre" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedPre DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedDto" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedDto DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrePedPri" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrePedPri DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdPreAct" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdPreAct DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipDtoDto" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipDtoDto DESC" ;
      }
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
                  return conditional_P08RK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 6);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
      }
   }

}

