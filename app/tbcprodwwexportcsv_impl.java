package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbcprodwwexportcsv_impl extends GXWebProcedure
{
   public tbcprodwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TBCPRODWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TBCPRODWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TBCPRODWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad Compra", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Procesado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Error", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción error", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha y hora error", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pila error", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV73Tbcprodwwds_1_filterfulltext = AV69FilterFullText ;
      AV74Tbcprodwwds_2_tfbcproducto = AV49TFBCProducto ;
      AV75Tbcprodwwds_3_tfbcproducto_sel = AV50TFBCProducto_Sel ;
      AV76Tbcprodwwds_4_tfbcdescripcion = AV51TFBCDescripcion ;
      AV77Tbcprodwwds_5_tfbcdescripcion_sel = AV52TFBCDescripcion_Sel ;
      AV78Tbcprodwwds_6_tfbcprecio = AV53TFBCPrecio ;
      AV79Tbcprodwwds_7_tfbcprecio_to = AV54TFBCPrecio_To ;
      AV80Tbcprodwwds_8_tfbcundcomp_sels = AV56TFBCUndComp_Sels ;
      AV81Tbcprodwwds_9_tfbcproveedor = AV57TFBCProveedor ;
      AV82Tbcprodwwds_10_tfbcproveedor_sel = AV58TFBCProveedor_Sel ;
      AV83Tbcprodwwds_11_tfbcprocesado = AV59TFBCProcesado ;
      AV84Tbcprodwwds_12_tfbcprocesado_to = AV60TFBCProcesado_To ;
      AV85Tbcprodwwds_13_tfbcerror = AV61TFBCError ;
      AV86Tbcprodwwds_14_tfbcerror_to = AV62TFBCError_To ;
      AV87Tbcprodwwds_15_tfbcdescerror = AV63TFBCDescError ;
      AV88Tbcprodwwds_16_tfbcdescerror_sel = AV64TFBCDescError_Sel ;
      AV89Tbcprodwwds_17_tfbcfecherror = AV65TFBCFechError ;
      AV90Tbcprodwwds_18_tfbcpilaerror = AV67TFBCPilaError ;
      AV91Tbcprodwwds_19_tfbcpilaerror_sel = AV68TFBCPilaError_Sel ;
      pr_ekamat.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(A13481BCUndComp) ,
                                           AV80Tbcprodwwds_8_tfbcundcomp_sels ,
                                           AV75Tbcprodwwds_3_tfbcproducto_sel ,
                                           AV74Tbcprodwwds_2_tfbcproducto ,
                                           AV77Tbcprodwwds_5_tfbcdescripcion_sel ,
                                           AV76Tbcprodwwds_4_tfbcdescripcion ,
                                           AV78Tbcprodwwds_6_tfbcprecio ,
                                           AV79Tbcprodwwds_7_tfbcprecio_to ,
                                           Integer.valueOf(AV80Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                           AV82Tbcprodwwds_10_tfbcproveedor_sel ,
                                           AV81Tbcprodwwds_9_tfbcproveedor ,
                                           Short.valueOf(AV83Tbcprodwwds_11_tfbcprocesado) ,
                                           Short.valueOf(AV84Tbcprodwwds_12_tfbcprocesado_to) ,
                                           Short.valueOf(AV85Tbcprodwwds_13_tfbcerror) ,
                                           Short.valueOf(AV86Tbcprodwwds_14_tfbcerror_to) ,
                                           AV88Tbcprodwwds_16_tfbcdescerror_sel ,
                                           AV87Tbcprodwwds_15_tfbcdescerror ,
                                           AV89Tbcprodwwds_17_tfbcfecherror ,
                                           AV91Tbcprodwwds_19_tfbcpilaerror_sel ,
                                           AV90Tbcprodwwds_18_tfbcpilaerror ,
                                           A13478BCProducto ,
                                           A13479BCDescripc ,
                                           A13480BCPrecio ,
                                           A13482BCProveedo ,
                                           Short.valueOf(A13483BCProcesad) ,
                                           Short.valueOf(A13484BCError) ,
                                           A13485BCDescErro ,
                                           A13486BCFechErro ,
                                           A13487BCPilaErro ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV73Tbcprodwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV74Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV74Tbcprodwwds_2_tfbcproducto), 6, "%") ;
      lV76Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV76Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
      lV81Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV81Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
      lV87Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV87Tbcprodwwds_15_tfbcdescerror), "%", "") ;
      lV90Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV90Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
      /* Using cursor P07ZM2 */
      pr_ekamat.execute(0, new Object[] {lV74Tbcprodwwds_2_tfbcproducto, AV75Tbcprodwwds_3_tfbcproducto_sel, lV76Tbcprodwwds_4_tfbcdescripcion, AV77Tbcprodwwds_5_tfbcdescripcion_sel, AV78Tbcprodwwds_6_tfbcprecio, AV79Tbcprodwwds_7_tfbcprecio_to, lV81Tbcprodwwds_9_tfbcproveedor, AV82Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV83Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV84Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV85Tbcprodwwds_13_tfbcerror), Short.valueOf(AV86Tbcprodwwds_14_tfbcerror_to), lV87Tbcprodwwds_15_tfbcdescerror, AV88Tbcprodwwds_16_tfbcdescerror_sel, AV89Tbcprodwwds_17_tfbcfecherror, lV90Tbcprodwwds_18_tfbcpilaerror, AV91Tbcprodwwds_19_tfbcpilaerror_sel});
      while ( (pr_ekamat.getStatus(0) != 101) )
      {
         A13487BCPilaErro = P07ZM2_A13487BCPilaErro[0] ;
         n13487BCPilaErro = P07ZM2_n13487BCPilaErro[0] ;
         A13486BCFechErro = P07ZM2_A13486BCFechErro[0] ;
         n13486BCFechErro = P07ZM2_n13486BCFechErro[0] ;
         A13485BCDescErro = P07ZM2_A13485BCDescErro[0] ;
         n13485BCDescErro = P07ZM2_n13485BCDescErro[0] ;
         A13484BCError = P07ZM2_A13484BCError[0] ;
         n13484BCError = P07ZM2_n13484BCError[0] ;
         A13483BCProcesad = P07ZM2_A13483BCProcesad[0] ;
         n13483BCProcesad = P07ZM2_n13483BCProcesad[0] ;
         A13482BCProveedo = P07ZM2_A13482BCProveedo[0] ;
         n13482BCProveedo = P07ZM2_n13482BCProveedo[0] ;
         A13480BCPrecio = P07ZM2_A13480BCPrecio[0] ;
         n13480BCPrecio = P07ZM2_n13480BCPrecio[0] ;
         A13479BCDescripc = P07ZM2_A13479BCDescripc[0] ;
         n13479BCDescripc = P07ZM2_n13479BCDescripc[0] ;
         A13478BCProducto = P07ZM2_A13478BCProducto[0] ;
         A13481BCUndComp = P07ZM2_A13481BCUndComp[0] ;
         n13481BCUndComp = P07ZM2_n13481BCUndComp[0] ;
         A396EmprCod = P07ZM2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV73Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV73Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV73Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV73Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "kilos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "litros", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV73Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV73Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV73Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV73Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV73Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV14TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S162 ();
            if ( returnInSub )
            {
               pr_ekamat.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13478BCProducto, ";", ","), GXv_char3) ;
               tbcprodwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13479BCDescripc, ";", ","), GXv_char3) ;
               tbcprodwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13480BCPrecio, 13, 5) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( A13481BCUndComp == 1 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Kilos", "") ;
               }
               else if ( A13481BCUndComp == 2 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Litros", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13482BCProveedo, ";", ","), GXv_char3) ;
               tbcprodwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13483BCProcesad, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13484BCError, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV30NewLine = GXutil.chr( (short)(10)) ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A13485BCDescErro, ";", ","), AV30NewLine, " "), GXv_char3) ;
               tbcprodwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A13486BCFechErro, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV30NewLine = GXutil.chr( (short)(10)) ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A13487BCPilaErro, ";", ","), AV30NewLine, " "), GXv_char3) ;
               tbcprodwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_ekamat.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.len( AV14TextFileLine) > 0 )
            {
               AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
            }
         }
         pr_ekamat.readNext(0);
      }
      pr_ekamat.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TBCPRODWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCProducto", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCDescripcion", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCPrecio", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCUndComp", "", "Unidad Compra", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCProveedor", "", "Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCProcesado", "", "Procesado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCError", "", "Error", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCDescError", "", "Descripción error", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCFechError", "", "Fecha y hora error", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BCPilaError", "", "Pila error", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TBCPRODWWColumnsSelector", GXv_char3) ;
      tbcprodwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TBCPRODWWGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TBCPRODWWGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV19Session.getValue("TBCPRODWWGridState"), null, null);
      }
      AV28OrderedBy = AV47GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV47GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV92GXV1 = 1 ;
      while ( AV92GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV69FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO") == 0 )
         {
            AV49TFBCProducto = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO_SEL") == 0 )
         {
            AV50TFBCProducto_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION") == 0 )
         {
            AV51TFBCDescripcion = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION_SEL") == 0 )
         {
            AV52TFBCDescripcion_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRECIO") == 0 )
         {
            AV53TFBCPrecio = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFBCPrecio_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCUNDCOMP_SEL") == 0 )
         {
            AV55TFBCUndComp_SelsJson = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV56TFBCUndComp_Sels.fromJSonString(AV55TFBCUndComp_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR") == 0 )
         {
            AV57TFBCProveedor = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR_SEL") == 0 )
         {
            AV58TFBCProveedor_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROCESADO") == 0 )
         {
            AV59TFBCProcesado = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFBCProcesado_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCERROR") == 0 )
         {
            AV61TFBCError = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFBCError_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR") == 0 )
         {
            AV63TFBCDescError = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR_SEL") == 0 )
         {
            AV64TFBCDescError_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCFECHERROR") == 0 )
         {
            AV65TFBCFechError = localUtil.ctot( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR") == 0 )
         {
            AV67TFBCPilaError = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR_SEL") == 0 )
         {
            AV68TFBCPilaError_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV92GXV1 = (int)(AV92GXV1+1) ;
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
      A13478BCProducto = "" ;
      A13479BCDescripc = "" ;
      A13480BCPrecio = DecimalUtil.ZERO ;
      A13482BCProveedo = "" ;
      A13485BCDescErro = "" ;
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      A13487BCPilaErro = "" ;
      AV73Tbcprodwwds_1_filterfulltext = "" ;
      AV69FilterFullText = "" ;
      AV74Tbcprodwwds_2_tfbcproducto = "" ;
      AV49TFBCProducto = "" ;
      AV75Tbcprodwwds_3_tfbcproducto_sel = "" ;
      AV50TFBCProducto_Sel = "" ;
      AV76Tbcprodwwds_4_tfbcdescripcion = "" ;
      AV51TFBCDescripcion = "" ;
      AV77Tbcprodwwds_5_tfbcdescripcion_sel = "" ;
      AV52TFBCDescripcion_Sel = "" ;
      AV78Tbcprodwwds_6_tfbcprecio = DecimalUtil.ZERO ;
      AV53TFBCPrecio = DecimalUtil.ZERO ;
      AV79Tbcprodwwds_7_tfbcprecio_to = DecimalUtil.ZERO ;
      AV54TFBCPrecio_To = DecimalUtil.ZERO ;
      AV80Tbcprodwwds_8_tfbcundcomp_sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV56TFBCUndComp_Sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV81Tbcprodwwds_9_tfbcproveedor = "" ;
      AV57TFBCProveedor = "" ;
      AV82Tbcprodwwds_10_tfbcproveedor_sel = "" ;
      AV58TFBCProveedor_Sel = "" ;
      AV87Tbcprodwwds_15_tfbcdescerror = "" ;
      AV63TFBCDescError = "" ;
      AV88Tbcprodwwds_16_tfbcdescerror_sel = "" ;
      AV64TFBCDescError_Sel = "" ;
      AV89Tbcprodwwds_17_tfbcfecherror = GXutil.resetTime( GXutil.nullDate() );
      AV65TFBCFechError = GXutil.resetTime( GXutil.nullDate() );
      AV90Tbcprodwwds_18_tfbcpilaerror = "" ;
      AV67TFBCPilaError = "" ;
      AV91Tbcprodwwds_19_tfbcpilaerror_sel = "" ;
      AV68TFBCPilaError_Sel = "" ;
      lV73Tbcprodwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV74Tbcprodwwds_2_tfbcproducto = "" ;
      lV76Tbcprodwwds_4_tfbcdescripcion = "" ;
      lV81Tbcprodwwds_9_tfbcproveedor = "" ;
      lV87Tbcprodwwds_15_tfbcdescerror = "" ;
      lV90Tbcprodwwds_18_tfbcpilaerror = "" ;
      P07ZM2_A13487BCPilaErro = new String[] {""} ;
      P07ZM2_n13487BCPilaErro = new boolean[] {false} ;
      P07ZM2_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      P07ZM2_n13486BCFechErro = new boolean[] {false} ;
      P07ZM2_A13485BCDescErro = new String[] {""} ;
      P07ZM2_n13485BCDescErro = new boolean[] {false} ;
      P07ZM2_A13484BCError = new short[1] ;
      P07ZM2_n13484BCError = new boolean[] {false} ;
      P07ZM2_A13483BCProcesad = new short[1] ;
      P07ZM2_n13483BCProcesad = new boolean[] {false} ;
      P07ZM2_A13482BCProveedo = new String[] {""} ;
      P07ZM2_n13482BCProveedo = new boolean[] {false} ;
      P07ZM2_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZM2_n13480BCPrecio = new boolean[] {false} ;
      P07ZM2_A13479BCDescripc = new String[] {""} ;
      P07ZM2_n13479BCDescripc = new boolean[] {false} ;
      P07ZM2_A13478BCProducto = new String[] {""} ;
      P07ZM2_A13481BCUndComp = new short[1] ;
      P07ZM2_n13481BCUndComp = new boolean[] {false} ;
      P07ZM2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV30NewLine = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55TFBCUndComp_SelsJson = "" ;
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbcprodwwexportcsv__ekamat(),
         new Object[] {
             new Object[] {
            P07ZM2_A13487BCPilaErro, P07ZM2_n13487BCPilaErro, P07ZM2_A13486BCFechErro, P07ZM2_n13486BCFechErro, P07ZM2_A13485BCDescErro, P07ZM2_n13485BCDescErro, P07ZM2_A13484BCError, P07ZM2_n13484BCError, P07ZM2_A13483BCProcesad, P07ZM2_n13483BCProcesad,
            P07ZM2_A13482BCProveedo, P07ZM2_n13482BCProveedo, P07ZM2_A13480BCPrecio, P07ZM2_n13480BCPrecio, P07ZM2_A13479BCDescripc, P07ZM2_n13479BCDescripc, P07ZM2_A13478BCProducto, P07ZM2_A13481BCUndComp, P07ZM2_n13481BCUndComp, P07ZM2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A13481BCUndComp ;
   private short A13483BCProcesad ;
   private short A13484BCError ;
   private short AV83Tbcprodwwds_11_tfbcprocesado ;
   private short AV59TFBCProcesado ;
   private short AV84Tbcprodwwds_12_tfbcprocesado_to ;
   private short AV60TFBCProcesado_To ;
   private short AV85Tbcprodwwds_13_tfbcerror ;
   private short AV61TFBCError ;
   private short AV86Tbcprodwwds_14_tfbcerror_to ;
   private short AV62TFBCError_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV80Tbcprodwwds_8_tfbcundcomp_sels_size ;
   private int AV92GXV1 ;
   private java.math.BigDecimal A13480BCPrecio ;
   private java.math.BigDecimal AV78Tbcprodwwds_6_tfbcprecio ;
   private java.math.BigDecimal AV53TFBCPrecio ;
   private java.math.BigDecimal AV79Tbcprodwwds_7_tfbcprecio_to ;
   private java.math.BigDecimal AV54TFBCPrecio_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13478BCProducto ;
   private String A13479BCDescripc ;
   private String A13482BCProveedo ;
   private String AV74Tbcprodwwds_2_tfbcproducto ;
   private String AV49TFBCProducto ;
   private String AV75Tbcprodwwds_3_tfbcproducto_sel ;
   private String AV50TFBCProducto_Sel ;
   private String AV76Tbcprodwwds_4_tfbcdescripcion ;
   private String AV51TFBCDescripcion ;
   private String AV77Tbcprodwwds_5_tfbcdescripcion_sel ;
   private String AV52TFBCDescripcion_Sel ;
   private String AV81Tbcprodwwds_9_tfbcproveedor ;
   private String AV57TFBCProveedor ;
   private String AV82Tbcprodwwds_10_tfbcproveedor_sel ;
   private String AV58TFBCProveedor_Sel ;
   private String scmdbuf ;
   private String lV74Tbcprodwwds_2_tfbcproducto ;
   private String lV76Tbcprodwwds_4_tfbcdescripcion ;
   private String lV81Tbcprodwwds_9_tfbcproveedor ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A13486BCFechErro ;
   private java.util.Date AV89Tbcprodwwds_17_tfbcfecherror ;
   private java.util.Date AV65TFBCFechError ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13487BCPilaErro ;
   private boolean n13486BCFechErro ;
   private boolean n13485BCDescErro ;
   private boolean n13484BCError ;
   private boolean n13483BCProcesad ;
   private boolean n13482BCProveedo ;
   private boolean n13480BCPrecio ;
   private boolean n13479BCDescripc ;
   private boolean n13481BCUndComp ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV55TFBCUndComp_SelsJson ;
   private String AV11Filename ;
   private String A13485BCDescErro ;
   private String A13487BCPilaErro ;
   private String AV73Tbcprodwwds_1_filterfulltext ;
   private String AV69FilterFullText ;
   private String AV87Tbcprodwwds_15_tfbcdescerror ;
   private String AV63TFBCDescError ;
   private String AV88Tbcprodwwds_16_tfbcdescerror_sel ;
   private String AV64TFBCDescError_Sel ;
   private String AV90Tbcprodwwds_18_tfbcpilaerror ;
   private String AV67TFBCPilaError ;
   private String AV91Tbcprodwwds_19_tfbcpilaerror_sel ;
   private String AV68TFBCPilaError_Sel ;
   private String lV73Tbcprodwwds_1_filterfulltext ;
   private String lV87Tbcprodwwds_15_tfbcdescerror ;
   private String lV90Tbcprodwwds_18_tfbcpilaerror ;
   private String AV30NewLine ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Short> AV80Tbcprodwwds_8_tfbcundcomp_sels ;
   private GXSimpleCollection<Short> AV56TFBCUndComp_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_ekamat ;
   private String[] P07ZM2_A13487BCPilaErro ;
   private boolean[] P07ZM2_n13487BCPilaErro ;
   private java.util.Date[] P07ZM2_A13486BCFechErro ;
   private boolean[] P07ZM2_n13486BCFechErro ;
   private String[] P07ZM2_A13485BCDescErro ;
   private boolean[] P07ZM2_n13485BCDescErro ;
   private short[] P07ZM2_A13484BCError ;
   private boolean[] P07ZM2_n13484BCError ;
   private short[] P07ZM2_A13483BCProcesad ;
   private boolean[] P07ZM2_n13483BCProcesad ;
   private String[] P07ZM2_A13482BCProveedo ;
   private boolean[] P07ZM2_n13482BCProveedo ;
   private java.math.BigDecimal[] P07ZM2_A13480BCPrecio ;
   private boolean[] P07ZM2_n13480BCPrecio ;
   private String[] P07ZM2_A13479BCDescripc ;
   private boolean[] P07ZM2_n13479BCDescripc ;
   private String[] P07ZM2_A13478BCProducto ;
   private short[] P07ZM2_A13481BCUndComp ;
   private boolean[] P07ZM2_n13481BCUndComp ;
   private String[] P07ZM2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class tbcprodwwexportcsv__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV80Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV75Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV74Tbcprodwwds_2_tfbcproducto ,
                                          String AV77Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV76Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV78Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV79Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV80Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV82Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV81Tbcprodwwds_9_tfbcproveedor ,
                                          short AV83Tbcprodwwds_11_tfbcprocesado ,
                                          short AV84Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV85Tbcprodwwds_13_tfbcerror ,
                                          short AV86Tbcprodwwds_14_tfbcerror_to ,
                                          String AV88Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV87Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV89Tbcprodwwds_17_tfbcfecherror ,
                                          String AV91Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV90Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV73Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[17];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT [Pila error], [Fecha y hora error], [Descripción error], [Error], [Procesado], [Proveedor], [Precio], [Descripción], [Producto], [Unidad Compra], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV75Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV74Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV76Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( AV80Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV80Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV82Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV81Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV83Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV84Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV85Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV86Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV87Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV89Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV90Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción]" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción] DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Producto]" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Producto] DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Precio]" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Precio] DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Unidad Compra]" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Unidad Compra] DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Proveedor]" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Proveedor] DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Procesado]" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Procesado] DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Error]" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Error] DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Descripción error]" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Descripción error] DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Fecha y hora error]" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Fecha y hora error] DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY [Pila error]" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY [Pila error] DESC" ;
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
                  return conditional_P07ZM2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

