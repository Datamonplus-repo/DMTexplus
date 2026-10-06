package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcpartesproduccionexportcsv_impl extends GXWebProcedure
{
   public wcpartesproduccionexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCPartesProduccionExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCPartesProduccionColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCPartesProduccionColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "F?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pcs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV75Wcpartesproduccionds_1_emprcod = AV69EmprCod ;
      AV76Wcpartesproduccionds_2_maqcod = AV70MaqCod ;
      AV77Wcpartesproduccionds_3_hisprofec = AV71HisProFec ;
      AV78Wcpartesproduccionds_4_tfmaqcod = AV33TFMaqCod ;
      AV79Wcpartesproduccionds_5_tfmaqcod_sel = AV34TFMaqCod_Sel ;
      AV80Wcpartesproduccionds_6_tfmaqdsc = AV39TFMaqDsc ;
      AV81Wcpartesproduccionds_7_tfmaqdsc_sel = AV40TFMaqDsc_Sel ;
      AV82Wcpartesproduccionds_8_tfhisprofec = AV35TFHisProFec ;
      AV83Wcpartesproduccionds_9_tfhisprolin = AV37TFHisProLin ;
      AV84Wcpartesproduccionds_10_tfhisprolin_to = AV38TFHisProLin_To ;
      AV85Wcpartesproduccionds_11_tfbarnhdr = AV41TFBarNHdr ;
      AV86Wcpartesproduccionds_12_tfbarnhdr_sel = AV42TFBarNHdr_Sel ;
      AV87Wcpartesproduccionds_13_tfgruopecod = AV43TFGruOpeCod ;
      AV88Wcpartesproduccionds_14_tfgruopecod_to = AV44TFGruOpeCod_To ;
      AV89Wcpartesproduccionds_15_tfbarordlin = AV45TFBarOrdLin ;
      AV90Wcpartesproduccionds_16_tfbarordlin_to = AV46TFBarOrdLin_To ;
      AV91Wcpartesproduccionds_17_tffase = AV47TFFase ;
      AV92Wcpartesproduccionds_18_tffase_sel = AV48TFFase_Sel ;
      AV93Wcpartesproduccionds_19_tfhisprodti = AV51TFHisProDTI ;
      AV94Wcpartesproduccionds_20_tfhisprodtf = AV53TFHisProDTF ;
      AV95Wcpartesproduccionds_21_tfhisprof = AV55TFHisProF ;
      AV96Wcpartesproduccionds_22_tfhisprof_sel = AV56TFHisProF_Sel ;
      AV97Wcpartesproduccionds_23_tfhisprotur = AV57TFHisProTur ;
      AV98Wcpartesproduccionds_24_tfhisprotur_to = AV58TFHisProTur_To ;
      AV99Wcpartesproduccionds_25_tfhisprokgr = AV59TFHisProKgr ;
      AV100Wcpartesproduccionds_26_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV101Wcpartesproduccionds_27_tfhispromtr = AV61TFHisProMtr ;
      AV102Wcpartesproduccionds_28_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV103Wcpartesproduccionds_29_tfhispronpzs = AV63TFHisProNpzs ;
      AV104Wcpartesproduccionds_30_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV105Wcpartesproduccionds_31_tfparcod = AV65TFParCod ;
      AV106Wcpartesproduccionds_32_tfparcod_to = AV66TFParCod_To ;
      AV107Wcpartesproduccionds_33_tfparcodnom = AV67TFParCodNom ;
      AV108Wcpartesproduccionds_34_tfparcodnom_sel = AV68TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV79Wcpartesproduccionds_5_tfmaqcod_sel ,
                                           AV78Wcpartesproduccionds_4_tfmaqcod ,
                                           AV81Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                           AV80Wcpartesproduccionds_6_tfmaqdsc ,
                                           AV82Wcpartesproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV83Wcpartesproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV84Wcpartesproduccionds_10_tfhisprolin_to) ,
                                           AV86Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                           AV85Wcpartesproduccionds_11_tfbarnhdr ,
                                           Integer.valueOf(AV87Wcpartesproduccionds_13_tfgruopecod) ,
                                           Integer.valueOf(AV88Wcpartesproduccionds_14_tfgruopecod_to) ,
                                           Short.valueOf(AV89Wcpartesproduccionds_15_tfbarordlin) ,
                                           Short.valueOf(AV90Wcpartesproduccionds_16_tfbarordlin_to) ,
                                           AV92Wcpartesproduccionds_18_tffase_sel ,
                                           AV91Wcpartesproduccionds_17_tffase ,
                                           AV93Wcpartesproduccionds_19_tfhisprodti ,
                                           AV94Wcpartesproduccionds_20_tfhisprodtf ,
                                           AV96Wcpartesproduccionds_22_tfhisprof_sel ,
                                           AV95Wcpartesproduccionds_21_tfhisprof ,
                                           Byte.valueOf(AV97Wcpartesproduccionds_23_tfhisprotur) ,
                                           Byte.valueOf(AV98Wcpartesproduccionds_24_tfhisprotur_to) ,
                                           AV99Wcpartesproduccionds_25_tfhisprokgr ,
                                           AV100Wcpartesproduccionds_26_tfhisprokgr_to ,
                                           AV101Wcpartesproduccionds_27_tfhispromtr ,
                                           AV102Wcpartesproduccionds_28_tfhispromtr_to ,
                                           Short.valueOf(AV103Wcpartesproduccionds_29_tfhispronpzs) ,
                                           Short.valueOf(AV104Wcpartesproduccionds_30_tfhispronpzs_to) ,
                                           Short.valueOf(AV105Wcpartesproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV106Wcpartesproduccionds_32_tfparcod_to) ,
                                           AV108Wcpartesproduccionds_34_tfparcodnom_sel ,
                                           AV107Wcpartesproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV75Wcpartesproduccionds_1_emprcod ,
                                           AV76Wcpartesproduccionds_2_maqcod ,
                                           AV77Wcpartesproduccionds_3_hisprofec ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV78Wcpartesproduccionds_4_tfmaqcod = GXutil.padr( GXutil.rtrim( AV78Wcpartesproduccionds_4_tfmaqcod), 6, "%") ;
      lV80Wcpartesproduccionds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV80Wcpartesproduccionds_6_tfmaqdsc), 16, "%") ;
      /* Using cursor P08BG2 */
      pr_default.execute(0, new Object[] {AV75Wcpartesproduccionds_1_emprcod, AV76Wcpartesproduccionds_2_maqcod, AV77Wcpartesproduccionds_3_hisprofec, lV78Wcpartesproduccionds_4_tfmaqcod, AV79Wcpartesproduccionds_5_tfmaqcod_sel, lV80Wcpartesproduccionds_6_tfmaqdsc, AV81Wcpartesproduccionds_7_tfmaqdsc_sel, AV82Wcpartesproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A606MaqDsc = P08BG2_A606MaqDsc[0] ;
         n606MaqDsc = P08BG2_n606MaqDsc[0] ;
         A558HisProFec = P08BG2_A558HisProFec[0] ;
         A602MaqCod = P08BG2_A602MaqCod[0] ;
         A396EmprCod = P08BG2_A396EmprCod[0] ;
         A606MaqDsc = P08BG2_A606MaqDsc[0] ;
         n606MaqDsc = P08BG2_n606MaqDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
            wcpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A606MaqDsc, ";", ","), GXv_char3) ;
            wcpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A558HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A561HisProLin, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            wcpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A503GruOpeCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A194BarOrdLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A461Fase, ";", ","), GXv_char3) ;
            wcpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4440HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4441HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A557HisProF, ";", ","), GXv_char3) ;
            wcpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A566HisProTur, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1525HisProKgr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1526HisProMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4714HisProNpzs, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A656ParCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A867ParCodNom, ";", ","), GXv_char3) ;
            wcpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         /* Exiting from a For First loop. */
         if (true) break;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCPartesProduccionExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCod", "", "Código Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqDsc", "", "Descripcion Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProLin", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNHdr", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GruOpeCod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarOrdLin", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Fase", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTI", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTF", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProF", "", "F?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProTur", "", "T", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProKgr", "", "Kgs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProMtr", "", "Mts", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProNpzs", "", "Pcs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParCod", "", "Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParCodNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCPartesProduccionColumnsSelector", GXv_char3) ;
      wcpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCPartesProduccionGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCPartesProduccionGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("WCPartesProduccionGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV109GXV1 = 1 ;
      while ( AV109GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV109GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV33TFMaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV34TFMaqCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV39TFMaqDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV40TFMaqDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV35TFHisProFec = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV37TFHisProLin = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFHisProLin_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV41TFBarNHdr = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV42TFBarNHdr_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV43TFGruOpeCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFGruOpeCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV45TFBarOrdLin = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFBarOrdLin_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV47TFFase = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV48TFFase_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV51TFHisProDTI = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV53TFHisProDTF = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV55TFHisProF = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV56TFHisProF_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV57TFHisProTur = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFHisProTur_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV59TFHisProKgr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFHisProKgr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV61TFHisProMtr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFHisProMtr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV63TFHisProNpzs = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFHisProNpzs_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV65TFParCod = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFParCod_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV67TFParCodNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV68TFParCodNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV69EmprCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV70MaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC") == 0 )
         {
            AV71HisProFec = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV109GXV1 = (int)(AV109GXV1+1) ;
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
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A461Fase = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      AV75Wcpartesproduccionds_1_emprcod = "" ;
      AV69EmprCod = "" ;
      AV76Wcpartesproduccionds_2_maqcod = "" ;
      AV70MaqCod = "" ;
      AV77Wcpartesproduccionds_3_hisprofec = GXutil.nullDate() ;
      AV71HisProFec = GXutil.nullDate() ;
      AV78Wcpartesproduccionds_4_tfmaqcod = "" ;
      AV33TFMaqCod = "" ;
      AV79Wcpartesproduccionds_5_tfmaqcod_sel = "" ;
      AV34TFMaqCod_Sel = "" ;
      AV80Wcpartesproduccionds_6_tfmaqdsc = "" ;
      AV39TFMaqDsc = "" ;
      AV81Wcpartesproduccionds_7_tfmaqdsc_sel = "" ;
      AV40TFMaqDsc_Sel = "" ;
      AV82Wcpartesproduccionds_8_tfhisprofec = GXutil.nullDate() ;
      AV35TFHisProFec = GXutil.nullDate() ;
      AV85Wcpartesproduccionds_11_tfbarnhdr = "" ;
      AV41TFBarNHdr = "" ;
      AV86Wcpartesproduccionds_12_tfbarnhdr_sel = "" ;
      AV42TFBarNHdr_Sel = "" ;
      AV91Wcpartesproduccionds_17_tffase = "" ;
      AV47TFFase = "" ;
      AV92Wcpartesproduccionds_18_tffase_sel = "" ;
      AV48TFFase_Sel = "" ;
      AV93Wcpartesproduccionds_19_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV51TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV94Wcpartesproduccionds_20_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV53TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV95Wcpartesproduccionds_21_tfhisprof = "" ;
      AV55TFHisProF = "" ;
      AV96Wcpartesproduccionds_22_tfhisprof_sel = "" ;
      AV56TFHisProF_Sel = "" ;
      AV99Wcpartesproduccionds_25_tfhisprokgr = DecimalUtil.ZERO ;
      AV59TFHisProKgr = DecimalUtil.ZERO ;
      AV100Wcpartesproduccionds_26_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV60TFHisProKgr_To = DecimalUtil.ZERO ;
      AV101Wcpartesproduccionds_27_tfhispromtr = DecimalUtil.ZERO ;
      AV61TFHisProMtr = DecimalUtil.ZERO ;
      AV102Wcpartesproduccionds_28_tfhispromtr_to = DecimalUtil.ZERO ;
      AV62TFHisProMtr_To = DecimalUtil.ZERO ;
      AV107Wcpartesproduccionds_33_tfparcodnom = "" ;
      AV67TFParCodNom = "" ;
      AV108Wcpartesproduccionds_34_tfparcodnom_sel = "" ;
      AV68TFParCodNom_Sel = "" ;
      scmdbuf = "" ;
      lV78Wcpartesproduccionds_4_tfmaqcod = "" ;
      lV80Wcpartesproduccionds_6_tfmaqdsc = "" ;
      A396EmprCod = "" ;
      P08BG2_A606MaqDsc = new String[] {""} ;
      P08BG2_n606MaqDsc = new boolean[] {false} ;
      P08BG2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BG2_A602MaqCod = new String[] {""} ;
      P08BG2_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcpartesproduccionexportcsv__default(),
         new Object[] {
             new Object[] {
            P08BG2_A606MaqDsc, P08BG2_n606MaqDsc, P08BG2_A558HisProFec, P08BG2_A602MaqCod, P08BG2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A566HisProTur ;
   private byte AV97Wcpartesproduccionds_23_tfhisprotur ;
   private byte AV57TFHisProTur ;
   private byte AV98Wcpartesproduccionds_24_tfhisprotur_to ;
   private byte AV58TFHisProTur_To ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A656ParCod ;
   private short AV89Wcpartesproduccionds_15_tfbarordlin ;
   private short AV45TFBarOrdLin ;
   private short AV90Wcpartesproduccionds_16_tfbarordlin_to ;
   private short AV46TFBarOrdLin_To ;
   private short AV103Wcpartesproduccionds_29_tfhispronpzs ;
   private short AV63TFHisProNpzs ;
   private short AV104Wcpartesproduccionds_30_tfhispronpzs_to ;
   private short AV64TFHisProNpzs_To ;
   private short AV105Wcpartesproduccionds_31_tfparcod ;
   private short AV65TFParCod ;
   private short AV106Wcpartesproduccionds_32_tfparcod_to ;
   private short AV66TFParCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int AV83Wcpartesproduccionds_9_tfhisprolin ;
   private int AV37TFHisProLin ;
   private int AV84Wcpartesproduccionds_10_tfhisprolin_to ;
   private int AV38TFHisProLin_To ;
   private int AV87Wcpartesproduccionds_13_tfgruopecod ;
   private int AV43TFGruOpeCod ;
   private int AV88Wcpartesproduccionds_14_tfgruopecod_to ;
   private int AV44TFGruOpeCod_To ;
   private int AV109GXV1 ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV99Wcpartesproduccionds_25_tfhisprokgr ;
   private java.math.BigDecimal AV59TFHisProKgr ;
   private java.math.BigDecimal AV100Wcpartesproduccionds_26_tfhisprokgr_to ;
   private java.math.BigDecimal AV60TFHisProKgr_To ;
   private java.math.BigDecimal AV101Wcpartesproduccionds_27_tfhispromtr ;
   private java.math.BigDecimal AV61TFHisProMtr ;
   private java.math.BigDecimal AV102Wcpartesproduccionds_28_tfhispromtr_to ;
   private java.math.BigDecimal AV62TFHisProMtr_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A13696BarNHdr ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A867ParCodNom ;
   private String AV75Wcpartesproduccionds_1_emprcod ;
   private String AV69EmprCod ;
   private String AV76Wcpartesproduccionds_2_maqcod ;
   private String AV70MaqCod ;
   private String AV78Wcpartesproduccionds_4_tfmaqcod ;
   private String AV33TFMaqCod ;
   private String AV79Wcpartesproduccionds_5_tfmaqcod_sel ;
   private String AV34TFMaqCod_Sel ;
   private String AV80Wcpartesproduccionds_6_tfmaqdsc ;
   private String AV39TFMaqDsc ;
   private String AV81Wcpartesproduccionds_7_tfmaqdsc_sel ;
   private String AV40TFMaqDsc_Sel ;
   private String AV85Wcpartesproduccionds_11_tfbarnhdr ;
   private String AV41TFBarNHdr ;
   private String AV86Wcpartesproduccionds_12_tfbarnhdr_sel ;
   private String AV42TFBarNHdr_Sel ;
   private String AV91Wcpartesproduccionds_17_tffase ;
   private String AV47TFFase ;
   private String AV92Wcpartesproduccionds_18_tffase_sel ;
   private String AV48TFFase_Sel ;
   private String AV95Wcpartesproduccionds_21_tfhisprof ;
   private String AV55TFHisProF ;
   private String AV96Wcpartesproduccionds_22_tfhisprof_sel ;
   private String AV56TFHisProF_Sel ;
   private String AV107Wcpartesproduccionds_33_tfparcodnom ;
   private String AV67TFParCodNom ;
   private String AV108Wcpartesproduccionds_34_tfparcodnom_sel ;
   private String AV68TFParCodNom_Sel ;
   private String scmdbuf ;
   private String lV78Wcpartesproduccionds_4_tfmaqcod ;
   private String lV80Wcpartesproduccionds_6_tfmaqdsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV93Wcpartesproduccionds_19_tfhisprodti ;
   private java.util.Date AV51TFHisProDTI ;
   private java.util.Date AV94Wcpartesproduccionds_20_tfhisprodtf ;
   private java.util.Date AV53TFHisProDTF ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV77Wcpartesproduccionds_3_hisprofec ;
   private java.util.Date AV71HisProFec ;
   private java.util.Date AV82Wcpartesproduccionds_8_tfhisprofec ;
   private java.util.Date AV35TFHisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n606MaqDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08BG2_A606MaqDsc ;
   private boolean[] P08BG2_n606MaqDsc ;
   private java.util.Date[] P08BG2_A558HisProFec ;
   private String[] P08BG2_A602MaqCod ;
   private String[] P08BG2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcpartesproduccionexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV79Wcpartesproduccionds_5_tfmaqcod_sel ,
                                          String AV78Wcpartesproduccionds_4_tfmaqcod ,
                                          String AV81Wcpartesproduccionds_7_tfmaqdsc_sel ,
                                          String AV80Wcpartesproduccionds_6_tfmaqdsc ,
                                          java.util.Date AV82Wcpartesproduccionds_8_tfhisprofec ,
                                          int AV83Wcpartesproduccionds_9_tfhisprolin ,
                                          int AV84Wcpartesproduccionds_10_tfhisprolin_to ,
                                          String AV86Wcpartesproduccionds_12_tfbarnhdr_sel ,
                                          String AV85Wcpartesproduccionds_11_tfbarnhdr ,
                                          int AV87Wcpartesproduccionds_13_tfgruopecod ,
                                          int AV88Wcpartesproduccionds_14_tfgruopecod_to ,
                                          short AV89Wcpartesproduccionds_15_tfbarordlin ,
                                          short AV90Wcpartesproduccionds_16_tfbarordlin_to ,
                                          String AV92Wcpartesproduccionds_18_tffase_sel ,
                                          String AV91Wcpartesproduccionds_17_tffase ,
                                          java.util.Date AV93Wcpartesproduccionds_19_tfhisprodti ,
                                          java.util.Date AV94Wcpartesproduccionds_20_tfhisprodtf ,
                                          String AV96Wcpartesproduccionds_22_tfhisprof_sel ,
                                          String AV95Wcpartesproduccionds_21_tfhisprof ,
                                          byte AV97Wcpartesproduccionds_23_tfhisprotur ,
                                          byte AV98Wcpartesproduccionds_24_tfhisprotur_to ,
                                          java.math.BigDecimal AV99Wcpartesproduccionds_25_tfhisprokgr ,
                                          java.math.BigDecimal AV100Wcpartesproduccionds_26_tfhisprokgr_to ,
                                          java.math.BigDecimal AV101Wcpartesproduccionds_27_tfhispromtr ,
                                          java.math.BigDecimal AV102Wcpartesproduccionds_28_tfhispromtr_to ,
                                          short AV103Wcpartesproduccionds_29_tfhispronpzs ,
                                          short AV104Wcpartesproduccionds_30_tfhispronpzs_to ,
                                          short AV105Wcpartesproduccionds_31_tfparcod ,
                                          short AV106Wcpartesproduccionds_32_tfparcod_to ,
                                          String AV108Wcpartesproduccionds_34_tfparcodnom_sel ,
                                          String AV107Wcpartesproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV75Wcpartesproduccionds_1_emprcod ,
                                          String AV76Wcpartesproduccionds_2_maqcod ,
                                          java.util.Date AV77Wcpartesproduccionds_3_hisprofec ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[8];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.MaqDsc, T1.HisProFec, T1.MaqCod, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( (GXutil.strcmp("", AV79Wcpartesproduccionds_5_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcpartesproduccionds_4_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcpartesproduccionds_5_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcpartesproduccionds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcpartesproduccionds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcpartesproduccionds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Wcpartesproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T1.HisProFec DESC" ;
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
                  return conditional_P08BG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).byteValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , ((Boolean) dynConstraints[51]).booleanValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
      }
   }

}

