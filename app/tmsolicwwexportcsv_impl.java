package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmsolicwwexportcsv_impl extends GXWebProcedure
{
   public tmsolicwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "PrivateTempStorage" + "TMSolicWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMSolicWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TMSolicWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nro.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Creación", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario Creación", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód. Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Prioridad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV63Tmsolicwwds_1_filterfulltext = AV30FilterFullText ;
      AV64Tmsolicwwds_2_tfsmcod = AV35TFSMCod ;
      AV65Tmsolicwwds_3_tfsmcod_to = AV36TFSMCod_To ;
      AV66Tmsolicwwds_4_tfsmest_sels = AV48TFSMEst_Sels ;
      AV67Tmsolicwwds_5_tfsmfchcre = AV39TFSMFchCre ;
      AV68Tmsolicwwds_6_tfsmusucre = AV41TFSMUsuCre ;
      AV69Tmsolicwwds_7_tfsmusucre_sel = AV42TFSMUsuCre_Sel ;
      AV70Tmsolicwwds_8_tfsmmaqcod = AV43TFSMMaqCod ;
      AV71Tmsolicwwds_9_tfsmmaqcod_sel = AV44TFSMMaqCod_Sel ;
      AV72Tmsolicwwds_10_tfsmpri = AV53TFSMPri ;
      AV73Tmsolicwwds_11_tfsmpri_to = AV54TFSMPri_To ;
      AV74Tmsolicwwds_12_tfsmdsc = AV37TFSMDsc ;
      AV75Tmsolicwwds_13_tfsmdsc_sel = AV38TFSMDsc_Sel ;
      AV76Tmsolicwwds_14_tfsmmaqdsc = AV45TFSMMaqDsc ;
      AV77Tmsolicwwds_15_tfsmmaqdsc_sel = AV46TFSMMaqDsc_Sel ;
      AV78Tmsolicwwds_16_tfsmcal_sels = AV52TFSMCal_Sels ;
      AV79Tmsolicwwds_17_tfsmtxt = AV49TFSMTxt ;
      AV80Tmsolicwwds_18_tfsmtxt_sel = AV50TFSMTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV66Tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV78Tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV64Tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV65Tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV66Tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV67Tmsolicwwds_5_tfsmfchcre ,
                                           AV69Tmsolicwwds_7_tfsmusucre_sel ,
                                           AV68Tmsolicwwds_6_tfsmusucre ,
                                           AV71Tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV70Tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV72Tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV73Tmsolicwwds_11_tfsmpri_to) ,
                                           AV75Tmsolicwwds_13_tfsmdsc_sel ,
                                           AV74Tmsolicwwds_12_tfsmdsc ,
                                           AV77Tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV76Tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV78Tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV80Tmsolicwwds_18_tfsmtxt_sel ,
                                           AV79Tmsolicwwds_17_tfsmtxt ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV63Tmsolicwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV68Tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV68Tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV70Tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV70Tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV74Tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV74Tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV76Tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV76Tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV79Tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV79Tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor P08EI2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV64Tmsolicwwds_2_tfsmcod), Integer.valueOf(AV65Tmsolicwwds_3_tfsmcod_to), AV67Tmsolicwwds_5_tfsmfchcre, lV68Tmsolicwwds_6_tfsmusucre, AV69Tmsolicwwds_7_tfsmusucre_sel, lV70Tmsolicwwds_8_tfsmmaqcod, AV71Tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV72Tmsolicwwds_10_tfsmpri), Byte.valueOf(AV73Tmsolicwwds_11_tfsmpri_to), lV74Tmsolicwwds_12_tfsmdsc, AV75Tmsolicwwds_13_tfsmdsc_sel, lV76Tmsolicwwds_14_tfsmmaqdsc, AV77Tmsolicwwds_15_tfsmmaqdsc_sel, lV79Tmsolicwwds_17_tfsmtxt, AV80Tmsolicwwds_18_tfsmtxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9428SMCod = P08EI2_A9428SMCod[0] ;
         n9428SMCod = P08EI2_n9428SMCod[0] ;
         A396EmprCod = P08EI2_A396EmprCod[0] ;
         A9523SMTxt = P08EI2_A9523SMTxt[0] ;
         n9523SMTxt = P08EI2_n9523SMTxt[0] ;
         A9521SMMaqDsc = P08EI2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EI2_n9521SMMaqDsc[0] ;
         A9517SMDsc = P08EI2_A9517SMDsc[0] ;
         n9517SMDsc = P08EI2_n9517SMDsc[0] ;
         A11534SMPri = P08EI2_A11534SMPri[0] ;
         A9520SMMaqCod = P08EI2_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P08EI2_n9520SMMaqCod[0] ;
         A9519SMUsuCre = P08EI2_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P08EI2_n9519SMUsuCre[0] ;
         A9518SMFchCre = P08EI2_A9518SMFchCre[0] ;
         n9518SMFchCre = P08EI2_n9518SMFchCre[0] ;
         A9524SMCal = P08EI2_A9524SMCal[0] ;
         n9524SMCal = P08EI2_n9524SMCal[0] ;
         A9522SMEst = P08EI2_A9522SMEst[0] ;
         n9522SMEst = P08EI2_n9522SMEst[0] ;
         A9521SMMaqDsc = P08EI2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EI2_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV63Tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV63Tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente generación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "generada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "G", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente calificacion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "terminada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV63Tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pesima", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mala", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aceptable", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "satisfactorio", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "excelente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV63Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
            {
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
                  AV14TextFileLine += GXutil.str( A9428SMCod, 8, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "P") == 0 )
                  {
                     AV14TextFileLine += httpContext.getMessage( "Pendiente Generación", "") ;
                  }
                  else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "G") == 0 )
                  {
                     AV14TextFileLine += httpContext.getMessage( "Generada", "") ;
                  }
                  else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "A") == 0 )
                  {
                     AV14TextFileLine += httpContext.getMessage( "Anulada", "") ;
                  }
                  else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "C") == 0 )
                  {
                     AV14TextFileLine += httpContext.getMessage( "Pendiente Calificacion", "") ;
                  }
                  else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "T") == 0 )
                  {
                     AV14TextFileLine += httpContext.getMessage( "Terminada", "") ;
                  }
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += localUtil.ttoc( A9518SMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9519SMUsuCre, ";", ","), GXv_char3) ;
                  tmsolicwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9520SMMaqCod, ";", ","), GXv_char3) ;
                  tmsolicwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A11534SMPri, 1, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9517SMDsc, ";", ","), GXv_char3) ;
                  tmsolicwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  /* Using cursor P08EI3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A9425OMCod = P08EI3_A9425OMCod[0] ;
                     AV57OMCod = A9425OMCod ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( AV57OMCod, 8, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  /* Using cursor P08EI4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A9445OMEst = P08EI4_A9445OMEst[0] ;
                     A9425OMCod = P08EI4_A9425OMCod[0] ;
                     AV58OMEst = A9445OMEst ;
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
                  AV14TextFileLine += ";" ;
                  if ( GXutil.strcmp(GXutil.trim( AV58OMEst), "P") == 0 )
                  {
                     AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
                  }
                  else if ( GXutil.strcmp(GXutil.trim( AV58OMEst), "R") == 0 )
                  {
                     AV14TextFileLine += httpContext.getMessage( "Realizada", "") ;
                  }
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
            }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TMSolicWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMCod", "", "Nro.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMFchCre", "", "Fecha Creación", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMUsuCre", "", "Usuario Creación", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMMaqCod", "", "Cód. Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMPri", "", "Prioridad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMMaqDsc", "", "Descripción Máquina", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&SMCal", "", "Calificación", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMCal", "", "Calificación", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SMTxt", "", "Texto", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&OMCod", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&OMEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMSolicWWColumnsSelector", GXv_char3) ;
      tmsolicwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMSolicWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMSolicWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("TMSolicWWGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV35TFSMCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFSMCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMEST_SEL") == 0 )
         {
            AV47TFSMEst_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV48TFSMEst_Sels.fromJSonString(AV47TFSMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMFCHCRE") == 0 )
         {
            AV39TFSMFchCre = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE") == 0 )
         {
            AV41TFSMUsuCre = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE_SEL") == 0 )
         {
            AV42TFSMUsuCre_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD") == 0 )
         {
            AV43TFSMMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD_SEL") == 0 )
         {
            AV44TFSMMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMPRI") == 0 )
         {
            AV53TFSMPri = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFSMPri_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC") == 0 )
         {
            AV37TFSMDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC_SEL") == 0 )
         {
            AV38TFSMDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC") == 0 )
         {
            AV45TFSMMaqDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC_SEL") == 0 )
         {
            AV46TFSMMaqDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCAL_SEL") == 0 )
         {
            AV51TFSMCal_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV52TFSMCal_Sels.fromJSonString(AV51TFSMCal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT") == 0 )
         {
            AV49TFSMTxt = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT_SEL") == 0 )
         {
            AV50TFSMTxt_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MODO") == 0 )
         {
            AV55Modo = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
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
      A9522SMEst = "" ;
      A9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9519SMUsuCre = "" ;
      A9520SMMaqCod = "" ;
      A9517SMDsc = "" ;
      AV63Tmsolicwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV66Tmsolicwwds_4_tfsmest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48TFSMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV67Tmsolicwwds_5_tfsmfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV39TFSMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV68Tmsolicwwds_6_tfsmusucre = "" ;
      AV41TFSMUsuCre = "" ;
      AV69Tmsolicwwds_7_tfsmusucre_sel = "" ;
      AV42TFSMUsuCre_Sel = "" ;
      AV70Tmsolicwwds_8_tfsmmaqcod = "" ;
      AV43TFSMMaqCod = "" ;
      AV71Tmsolicwwds_9_tfsmmaqcod_sel = "" ;
      AV44TFSMMaqCod_Sel = "" ;
      AV74Tmsolicwwds_12_tfsmdsc = "" ;
      AV37TFSMDsc = "" ;
      AV75Tmsolicwwds_13_tfsmdsc_sel = "" ;
      AV38TFSMDsc_Sel = "" ;
      AV76Tmsolicwwds_14_tfsmmaqdsc = "" ;
      AV45TFSMMaqDsc = "" ;
      AV77Tmsolicwwds_15_tfsmmaqdsc_sel = "" ;
      AV46TFSMMaqDsc_Sel = "" ;
      AV78Tmsolicwwds_16_tfsmcal_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV52TFSMCal_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV79Tmsolicwwds_17_tfsmtxt = "" ;
      AV49TFSMTxt = "" ;
      AV80Tmsolicwwds_18_tfsmtxt_sel = "" ;
      AV50TFSMTxt_Sel = "" ;
      scmdbuf = "" ;
      lV63Tmsolicwwds_1_filterfulltext = "" ;
      lV68Tmsolicwwds_6_tfsmusucre = "" ;
      lV70Tmsolicwwds_8_tfsmmaqcod = "" ;
      lV74Tmsolicwwds_12_tfsmdsc = "" ;
      lV76Tmsolicwwds_14_tfsmmaqdsc = "" ;
      lV79Tmsolicwwds_17_tfsmtxt = "" ;
      A9521SMMaqDsc = "" ;
      A9523SMTxt = "" ;
      P08EI2_A9428SMCod = new int[1] ;
      P08EI2_n9428SMCod = new boolean[] {false} ;
      P08EI2_A396EmprCod = new String[] {""} ;
      P08EI2_A9523SMTxt = new String[] {""} ;
      P08EI2_n9523SMTxt = new boolean[] {false} ;
      P08EI2_A9521SMMaqDsc = new String[] {""} ;
      P08EI2_n9521SMMaqDsc = new boolean[] {false} ;
      P08EI2_A9517SMDsc = new String[] {""} ;
      P08EI2_n9517SMDsc = new boolean[] {false} ;
      P08EI2_A11534SMPri = new byte[1] ;
      P08EI2_A9520SMMaqCod = new String[] {""} ;
      P08EI2_n9520SMMaqCod = new boolean[] {false} ;
      P08EI2_A9519SMUsuCre = new String[] {""} ;
      P08EI2_n9519SMUsuCre = new boolean[] {false} ;
      P08EI2_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EI2_n9518SMFchCre = new boolean[] {false} ;
      P08EI2_A9524SMCal = new byte[1] ;
      P08EI2_n9524SMCal = new boolean[] {false} ;
      P08EI2_A9522SMEst = new String[] {""} ;
      P08EI2_n9522SMEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      P08EI3_A396EmprCod = new String[] {""} ;
      P08EI3_A9428SMCod = new int[1] ;
      P08EI3_n9428SMCod = new boolean[] {false} ;
      P08EI3_A9425OMCod = new int[1] ;
      P08EI4_A396EmprCod = new String[] {""} ;
      P08EI4_A9428SMCod = new int[1] ;
      P08EI4_n9428SMCod = new boolean[] {false} ;
      P08EI4_A9445OMEst = new String[] {""} ;
      P08EI4_A9425OMCod = new int[1] ;
      A9445OMEst = "" ;
      AV58OMEst = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV47TFSMEst_SelsJson = "" ;
      AV51TFSMCal_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmsolicwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08EI2_A9428SMCod, P08EI2_A396EmprCod, P08EI2_A9523SMTxt, P08EI2_n9523SMTxt, P08EI2_A9521SMMaqDsc, P08EI2_n9521SMMaqDsc, P08EI2_A9517SMDsc, P08EI2_n9517SMDsc, P08EI2_A11534SMPri, P08EI2_A9520SMMaqCod,
            P08EI2_n9520SMMaqCod, P08EI2_A9519SMUsuCre, P08EI2_n9519SMUsuCre, P08EI2_A9518SMFchCre, P08EI2_n9518SMFchCre, P08EI2_A9524SMCal, P08EI2_n9524SMCal, P08EI2_A9522SMEst, P08EI2_n9522SMEst
            }
            , new Object[] {
            P08EI3_A396EmprCod, P08EI3_A9428SMCod, P08EI3_n9428SMCod, P08EI3_A9425OMCod
            }
            , new Object[] {
            P08EI4_A396EmprCod, P08EI4_A9428SMCod, P08EI4_n9428SMCod, P08EI4_A9445OMEst, P08EI4_A9425OMCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11534SMPri ;
   private byte AV72Tmsolicwwds_10_tfsmpri ;
   private byte AV53TFSMPri ;
   private byte AV73Tmsolicwwds_11_tfsmpri_to ;
   private byte AV54TFSMPri_To ;
   private byte A9524SMCal ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV55Modo ;
   private short Gx_err ;
   private int AV13Random ;
   private int A9428SMCod ;
   private int AV64Tmsolicwwds_2_tfsmcod ;
   private int AV35TFSMCod ;
   private int AV65Tmsolicwwds_3_tfsmcod_to ;
   private int AV36TFSMCod_To ;
   private int AV66Tmsolicwwds_4_tfsmest_sels_size ;
   private int AV78Tmsolicwwds_16_tfsmcal_sels_size ;
   private int A9425OMCod ;
   private int AV57OMCod ;
   private int AV83GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9522SMEst ;
   private String A9519SMUsuCre ;
   private String A9520SMMaqCod ;
   private String A9517SMDsc ;
   private String AV68Tmsolicwwds_6_tfsmusucre ;
   private String AV41TFSMUsuCre ;
   private String AV69Tmsolicwwds_7_tfsmusucre_sel ;
   private String AV42TFSMUsuCre_Sel ;
   private String AV70Tmsolicwwds_8_tfsmmaqcod ;
   private String AV43TFSMMaqCod ;
   private String AV71Tmsolicwwds_9_tfsmmaqcod_sel ;
   private String AV44TFSMMaqCod_Sel ;
   private String AV74Tmsolicwwds_12_tfsmdsc ;
   private String AV37TFSMDsc ;
   private String AV75Tmsolicwwds_13_tfsmdsc_sel ;
   private String AV38TFSMDsc_Sel ;
   private String AV76Tmsolicwwds_14_tfsmmaqdsc ;
   private String AV45TFSMMaqDsc ;
   private String AV77Tmsolicwwds_15_tfsmmaqdsc_sel ;
   private String AV46TFSMMaqDsc_Sel ;
   private String scmdbuf ;
   private String lV68Tmsolicwwds_6_tfsmusucre ;
   private String lV70Tmsolicwwds_8_tfsmmaqcod ;
   private String lV74Tmsolicwwds_12_tfsmdsc ;
   private String lV76Tmsolicwwds_14_tfsmmaqdsc ;
   private String A9521SMMaqDsc ;
   private String A396EmprCod ;
   private String A9445OMEst ;
   private String AV58OMEst ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9518SMFchCre ;
   private java.util.Date AV67Tmsolicwwds_5_tfsmfchcre ;
   private java.util.Date AV39TFSMFchCre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n9428SMCod ;
   private boolean n9523SMTxt ;
   private boolean n9521SMMaqDsc ;
   private boolean n9517SMDsc ;
   private boolean n9520SMMaqCod ;
   private boolean n9519SMUsuCre ;
   private boolean n9518SMFchCre ;
   private boolean n9524SMCal ;
   private boolean n9522SMEst ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV47TFSMEst_SelsJson ;
   private String AV51TFSMCal_SelsJson ;
   private String AV11Filename ;
   private String AV63Tmsolicwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV79Tmsolicwwds_17_tfsmtxt ;
   private String AV49TFSMTxt ;
   private String AV80Tmsolicwwds_18_tfsmtxt_sel ;
   private String AV50TFSMTxt_Sel ;
   private String lV63Tmsolicwwds_1_filterfulltext ;
   private String lV79Tmsolicwwds_17_tfsmtxt ;
   private String A9523SMTxt ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV78Tmsolicwwds_16_tfsmcal_sels ;
   private GXSimpleCollection<Byte> AV52TFSMCal_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P08EI2_A9428SMCod ;
   private boolean[] P08EI2_n9428SMCod ;
   private String[] P08EI2_A396EmprCod ;
   private String[] P08EI2_A9523SMTxt ;
   private boolean[] P08EI2_n9523SMTxt ;
   private String[] P08EI2_A9521SMMaqDsc ;
   private boolean[] P08EI2_n9521SMMaqDsc ;
   private String[] P08EI2_A9517SMDsc ;
   private boolean[] P08EI2_n9517SMDsc ;
   private byte[] P08EI2_A11534SMPri ;
   private String[] P08EI2_A9520SMMaqCod ;
   private boolean[] P08EI2_n9520SMMaqCod ;
   private String[] P08EI2_A9519SMUsuCre ;
   private boolean[] P08EI2_n9519SMUsuCre ;
   private java.util.Date[] P08EI2_A9518SMFchCre ;
   private boolean[] P08EI2_n9518SMFchCre ;
   private byte[] P08EI2_A9524SMCal ;
   private boolean[] P08EI2_n9524SMCal ;
   private String[] P08EI2_A9522SMEst ;
   private boolean[] P08EI2_n9522SMEst ;
   private String[] P08EI3_A396EmprCod ;
   private int[] P08EI3_A9428SMCod ;
   private boolean[] P08EI3_n9428SMCod ;
   private int[] P08EI3_A9425OMCod ;
   private String[] P08EI4_A396EmprCod ;
   private int[] P08EI4_A9428SMCod ;
   private boolean[] P08EI4_n9428SMCod ;
   private String[] P08EI4_A9445OMEst ;
   private int[] P08EI4_A9425OMCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV66Tmsolicwwds_4_tfsmest_sels ;
   private GXSimpleCollection<String> AV48TFSMEst_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tmsolicwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV66Tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV78Tmsolicwwds_16_tfsmcal_sels ,
                                          int AV64Tmsolicwwds_2_tfsmcod ,
                                          int AV65Tmsolicwwds_3_tfsmcod_to ,
                                          int AV66Tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV67Tmsolicwwds_5_tfsmfchcre ,
                                          String AV69Tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV68Tmsolicwwds_6_tfsmusucre ,
                                          String AV71Tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV70Tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV72Tmsolicwwds_10_tfsmpri ,
                                          byte AV73Tmsolicwwds_11_tfsmpri_to ,
                                          String AV75Tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV74Tmsolicwwds_12_tfsmdsc ,
                                          String AV77Tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV76Tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV78Tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV80Tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV79Tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV63Tmsolicwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.SMCod, T1.EmprCod, T1.SMTxt, T2.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMMaqCod AS SMMaqCod, T1.SMUsuCre, T1.SMFchCre, T1.SMCal, T1.SMEst FROM (TXPMSOLIC" ;
      scmdbuf += " T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV64Tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV65Tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( AV66Tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV66Tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV67Tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV68Tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV73Tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( AV78Tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV80Tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV79Tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMEst" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMFchCre" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMFchCre DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMPri" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMPri DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCal" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCal DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMTxt" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMTxt DESC" ;
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
                  return conditional_P08EI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EI3", "SELECT EmprCod, SMCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EI4", "SELECT EmprCod, SMCod, OMEst, OMCod FROM TXPMORDEN WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((int[]) buf[4])[0] = rslt.getInt(4);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 2000);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

