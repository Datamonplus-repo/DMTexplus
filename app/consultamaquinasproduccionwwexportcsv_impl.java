package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultamaquinasproduccionwwexportcsv_impl extends GXWebProcedure
{
   public consultamaquinasproduccionwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      if ( 1 == 0 )
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
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
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
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S211 ();
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultaMaquinasProduccionWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultaMaquinasProduccionWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ConsultaMaquinasProduccionWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descrip.Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Observación", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descrip.Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Número", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV36TFLecMaqCod_Sel ,
                                           AV35TFLecMaqCod ,
                                           AV53TFLecFec ,
                                           Integer.valueOf(AV43TFLecOpeCod) ,
                                           Integer.valueOf(AV44TFLecOpeCod_To) ,
                                           AV69TFLecHdr_Sel ,
                                           AV68TFLecHdr ,
                                           Short.valueOf(AV49TFLecParCod) ,
                                           Short.valueOf(AV50TFLecParCod_To) ,
                                           AV31LecMaqCod ,
                                           AV77LecMaqCod_To ,
                                           A1166LecMaqCod ,
                                           A1174LecFec ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Short.valueOf(A1172LecParCod) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV72LecEstado ,
                                           A13722LecEstado ,
                                           AV71TFLecEstado_Sel ,
                                           AV108TFlecOpeNom_Sel ,
                                           AV107TFlecOpeNom ,
                                           A14259lecOpeNom ,
                                           AV110TFLecFasDsc_Sel ,
                                           AV109TFLecFasDsc ,
                                           A14260LecFasDsc ,
                                           AV112TFLecParNom_Sel ,
                                           AV111TFLecParNom ,
                                           A14261LecParNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV35TFLecMaqCod = GXutil.padr( GXutil.rtrim( AV35TFLecMaqCod), 6, "%") ;
      lV68TFLecHdr = GXutil.padr( GXutil.rtrim( AV68TFLecHdr), 11, "%") ;
      /* Using cursor P08DE2 */
      pr_default.execute(0, new Object[] {lV35TFLecMaqCod, AV36TFLecMaqCod_Sel, AV53TFLecFec, Integer.valueOf(AV43TFLecOpeCod), Integer.valueOf(AV44TFLecOpeCod_To), lV68TFLecHdr, AV69TFLecHdr_Sel, Short.valueOf(AV49TFLecParCod), Short.valueOf(AV50TFLecParCod_To), AV31LecMaqCod, AV77LecMaqCod_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13721LecHdr = P08DE2_A13721LecHdr[0] ;
         A1174LecFec = P08DE2_A1174LecFec[0] ;
         n1174LecFec = P08DE2_n1174LecFec[0] ;
         A1166LecMaqCod = P08DE2_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08DE2_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08DE2_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08DE2_A1169LecBarPar[0] ;
         n1169LecBarPar = P08DE2_n1169LecBarPar[0] ;
         A1168LecBarReo = P08DE2_A1168LecBarReo[0] ;
         n1168LecBarReo = P08DE2_n1168LecBarReo[0] ;
         A1167LecBarCod = P08DE2_A1167LecBarCod[0] ;
         n1167LecBarCod = P08DE2_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08DE2_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08DE2_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08DE2_A1171LecFasCod[0] ;
         n1171LecFasCod = P08DE2_n1171LecFasCod[0] ;
         A1172LecParCod = P08DE2_A1172LecParCod[0] ;
         n1172LecParCod = P08DE2_n1172LecParCod[0] ;
         A396EmprCod = P08DE2_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( (GXutil.strcmp("", AV72LecEstado)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV72LecEstado) == 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV71TFLecEstado_Sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV71TFLecEstado_Sel) == 0 ) ) )
            {
               GXt_char2 = A14259lecOpeNom ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
               consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               A14259lecOpeNom = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV108TFlecOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV107TFlecOpeNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV107TFlecOpeNom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV108TFlecOpeNom_Sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV108TFlecOpeNom_Sel) == 0 ) ) )
                  {
                     GXt_char2 = A14260LecFasDsc ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                     consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                     A14260LecFasDsc = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV110TFLecFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV109TFLecFasDsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV109TFLecFasDsc) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV110TFLecFasDsc_Sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV110TFLecFasDsc_Sel) == 0 ) ) )
                        {
                           GXt_char2 = A14261LecParNom ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                           consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           A14261LecParNom = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV112TFLecParNom_Sel)==0) && ( ! (GXutil.strcmp("", AV111TFLecParNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV111TFLecParNom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV112TFLecParNom_Sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV112TFLecParNom_Sel) == 0 ) ) )
                              {
                                 AV14TextFileLine = "" ;
                                 /* Execute user subroutine: 'BEFOREWRITELINE' */
                                 S162 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    returnInSub = true;
                                    if (true) return;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1166LecMaqCod, ";", ","), GXv_char3) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char2 = AV75MaqDsc ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A1166LecMaqCod, GXv_char3) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV75MaqDsc = GXt_char2 ;
                                    /* * Property Tooltiptext not supported in */
                                    /* * Property Tooltiptext not supported in */
                                    /* * Property Tooltiptext not supported in */
                                    /* * Property Tooltiptext not supported in */
                                    /*
                                       Assignment error:
                                       ================
                                       Expression: [ t('format(',1),t('"%1-%2%3"',3),t(',',7),t('trim(',1),t('str(',1),t(1167,2),t(',',7),t(8,3),t(',',7),t(0,3),t(')',4),t(')',4),t(',',7),t('trim(',1),t('str(',1),t(1168,2),t(',',7),t(1,3),t(',',7),t(0,3),t(')',4),t(')',4),t(',',7),t('trim(',1),t(1169,2),t(')',4),t(')',4) ]
                                       Target    : [ t('Maqdsc',23),t('Tooltiptext',3) ]
                                       ForType   : 29
                                       Type      : []
                                    */
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV75MaqDsc, ";", ","), GXv_char3) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += localUtil.dtoc( A1174LecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += GXutil.str( A1170LecOpeCod, 6, 0) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char2 = AV64OpeNom ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV64OpeNom = GXt_char2 ;
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV64OpeNom, ";", ","), GXv_char3) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13721LecHdr, ";", ","), GXv_char3) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), "P") == 0 )
                                    {
                                       AV14TextFileLine += httpContext.getMessage( "Proceso", "") ;
                                    }
                                    else if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), "F") == 0 )
                                    {
                                       AV14TextFileLine += httpContext.getMessage( "Finalizadas", "") ;
                                    }
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += GXutil.str( A1172LecParCod, 4, 0) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV117GXLvl194 = (byte)(0) ;
                                    /* Using cursor P08DE3 */
                                    pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod)});
                                    while ( (pr_default.getStatus(1) != 101) )
                                    {
                                       A656ParCod = P08DE3_A656ParCod[0] ;
                                       A867ParCodNom = P08DE3_A867ParCodNom[0] ;
                                       n867ParCodNom = P08DE3_n867ParCodNom[0] ;
                                       AV117GXLvl194 = (byte)(1) ;
                                       AV66ParCodNom = A867ParCodNom ;
                                       /* Exiting from a For First loop. */
                                       if (true) break;
                                    }
                                    pr_default.close(1);
                                    if ( AV117GXLvl194 == 0 )
                                    {
                                       AV66ParCodNom = " " ;
                                    }
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char3[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV66ParCodNom, ";", ","), GXv_char3) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char2 = AV67Texto1 ;
                                    GXv_char3[0] = A396EmprCod ;
                                    GXv_int4[0] = A1167LecBarCod ;
                                    GXv_int5[0] = A1168LecBarReo ;
                                    GXv_char6[0] = A1169LecBarPar ;
                                    GXv_int7[0] = A1188LecFasOrd ;
                                    GXv_char8[0] = A1171LecFasCod ;
                                    GXv_char9[0] = A1166LecMaqCod ;
                                    GXv_char10[0] = A13721LecHdr ;
                                    GXv_int11[0] = A1172LecParCod ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.procedure3(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char6, GXv_int7, GXv_char8, GXv_char9, GXv_char10, GXv_int11, GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.A1167LecBarCod = GXv_int4[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.A1168LecBarReo = GXv_int5[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.A1169LecBarPar = GXv_char6[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.A1188LecFasOrd = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.A1171LecFasCod = GXv_char8[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.A1166LecMaqCod = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.A13721LecHdr = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.A1172LecParCod = GXv_int11[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV67Texto1 = GXt_char2 ;
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV67Texto1, ";", ","), GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int4[0] = AV86CliCod ;
                                    GXv_char12[0] = AV87CliNom ;
                                    GXv_char10[0] = AV88BarSer ;
                                    GXv_char9[0] = AV89BarSerDsc ;
                                    GXv_char8[0] = AV90BarColNom ;
                                    GXv_int13[0] = AV91BarColNum ;
                                    GXv_dtime14[0] = AV92HisProdti ;
                                    GXv_dtime15[0] = AV93HisProdtf ;
                                    GXv_char6[0] = AV94HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV81EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int4, GXv_char12, GXv_char10, GXv_char9, GXv_char8, GXv_int13, GXv_dtime14, GXv_dtime15, GXv_char6) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV86CliCod = GXv_int4[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV87CliNom = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV88BarSer = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV89BarSerDsc = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV90BarColNom = GXv_char8[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV91BarColNum = GXv_int13[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV92HisProdti = GXv_dtime14[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV93HisProdtf = GXv_dtime15[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV94HisProF = GXv_char6[0] ;
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += GXutil.str( AV86CliCod, 6, 0) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int13[0] = AV86CliCod ;
                                    GXv_char12[0] = AV87CliNom ;
                                    GXv_char10[0] = AV88BarSer ;
                                    GXv_char9[0] = AV89BarSerDsc ;
                                    GXv_char8[0] = AV90BarColNom ;
                                    GXv_int4[0] = AV91BarColNum ;
                                    GXv_dtime15[0] = AV92HisProdti ;
                                    GXv_dtime14[0] = AV93HisProdtf ;
                                    GXv_char6[0] = AV94HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV81EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int13, GXv_char12, GXv_char10, GXv_char9, GXv_char8, GXv_int4, GXv_dtime15, GXv_dtime14, GXv_char6) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV86CliCod = GXv_int13[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV87CliNom = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV88BarSer = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV89BarSerDsc = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV90BarColNom = GXv_char8[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV91BarColNum = GXv_int4[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV92HisProdti = GXv_dtime15[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV93HisProdtf = GXv_dtime14[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV94HisProF = GXv_char6[0] ;
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV87CliNom, ";", ","), GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int13[0] = AV86CliCod ;
                                    GXv_char12[0] = AV87CliNom ;
                                    GXv_char10[0] = AV88BarSer ;
                                    GXv_char9[0] = AV89BarSerDsc ;
                                    GXv_char8[0] = AV90BarColNom ;
                                    GXv_int4[0] = AV91BarColNum ;
                                    GXv_dtime15[0] = AV92HisProdti ;
                                    GXv_dtime14[0] = AV93HisProdtf ;
                                    GXv_char6[0] = AV94HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV81EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int13, GXv_char12, GXv_char10, GXv_char9, GXv_char8, GXv_int4, GXv_dtime15, GXv_dtime14, GXv_char6) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV86CliCod = GXv_int13[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV87CliNom = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV88BarSer = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV89BarSerDsc = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV90BarColNom = GXv_char8[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV91BarColNum = GXv_int4[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV92HisProdti = GXv_dtime15[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV93HisProdtf = GXv_dtime14[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV94HisProF = GXv_char6[0] ;
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV88BarSer, ";", ","), GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int13[0] = AV86CliCod ;
                                    GXv_char12[0] = AV87CliNom ;
                                    GXv_char10[0] = AV88BarSer ;
                                    GXv_char9[0] = AV89BarSerDsc ;
                                    GXv_char8[0] = AV90BarColNom ;
                                    GXv_int4[0] = AV91BarColNum ;
                                    GXv_dtime15[0] = AV92HisProdti ;
                                    GXv_dtime14[0] = AV93HisProdtf ;
                                    GXv_char6[0] = AV94HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV81EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int13, GXv_char12, GXv_char10, GXv_char9, GXv_char8, GXv_int4, GXv_dtime15, GXv_dtime14, GXv_char6) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV86CliCod = GXv_int13[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV87CliNom = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV88BarSer = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV89BarSerDsc = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV90BarColNom = GXv_char8[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV91BarColNum = GXv_int4[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV92HisProdti = GXv_dtime15[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV93HisProdtf = GXv_dtime14[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV94HisProF = GXv_char6[0] ;
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV89BarSerDsc, ";", ","), GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int13[0] = AV86CliCod ;
                                    GXv_char12[0] = AV87CliNom ;
                                    GXv_char10[0] = AV88BarSer ;
                                    GXv_char9[0] = AV89BarSerDsc ;
                                    GXv_char8[0] = AV90BarColNom ;
                                    GXv_int4[0] = AV91BarColNum ;
                                    GXv_dtime15[0] = AV92HisProdti ;
                                    GXv_dtime14[0] = AV93HisProdtf ;
                                    GXv_char6[0] = AV94HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV81EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int13, GXv_char12, GXv_char10, GXv_char9, GXv_char8, GXv_int4, GXv_dtime15, GXv_dtime14, GXv_char6) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV86CliCod = GXv_int13[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV87CliNom = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV88BarSer = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV89BarSerDsc = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV90BarColNom = GXv_char8[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV91BarColNum = GXv_int4[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV92HisProdti = GXv_dtime15[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV93HisProdtf = GXv_dtime14[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV94HisProF = GXv_char6[0] ;
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV90BarColNom, ";", ","), GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int13[0] = AV86CliCod ;
                                    GXv_char12[0] = AV87CliNom ;
                                    GXv_char10[0] = AV88BarSer ;
                                    GXv_char9[0] = AV89BarSerDsc ;
                                    GXv_char8[0] = AV90BarColNom ;
                                    GXv_int4[0] = AV91BarColNum ;
                                    GXv_dtime15[0] = AV92HisProdti ;
                                    GXv_dtime14[0] = AV93HisProdtf ;
                                    GXv_char6[0] = AV94HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV81EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int13, GXv_char12, GXv_char10, GXv_char9, GXv_char8, GXv_int4, GXv_dtime15, GXv_dtime14, GXv_char6) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV86CliCod = GXv_int13[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV87CliNom = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV88BarSer = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV89BarSerDsc = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV90BarColNom = GXv_char8[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV91BarColNum = GXv_int4[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV92HisProdti = GXv_dtime15[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV93HisProdtf = GXv_dtime14[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV94HisProF = GXv_char6[0] ;
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += GXutil.str( AV91BarColNum, 6, 0) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int13[0] = AV86CliCod ;
                                    GXv_char12[0] = AV87CliNom ;
                                    GXv_char10[0] = AV88BarSer ;
                                    GXv_char9[0] = AV89BarSerDsc ;
                                    GXv_char8[0] = AV90BarColNom ;
                                    GXv_int4[0] = AV91BarColNum ;
                                    GXv_dtime15[0] = AV92HisProdti ;
                                    GXv_dtime14[0] = AV93HisProdtf ;
                                    GXv_char6[0] = AV94HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV81EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int13, GXv_char12, GXv_char10, GXv_char9, GXv_char8, GXv_int4, GXv_dtime15, GXv_dtime14, GXv_char6) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV86CliCod = GXv_int13[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV87CliNom = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV88BarSer = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV89BarSerDsc = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV90BarColNom = GXv_char8[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV91BarColNum = GXv_int4[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV92HisProdti = GXv_dtime15[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV93HisProdtf = GXv_dtime14[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV94HisProF = GXv_char6[0] ;
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += localUtil.ttoc( AV92HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int13[0] = AV86CliCod ;
                                    GXv_char12[0] = AV87CliNom ;
                                    GXv_char10[0] = AV88BarSer ;
                                    GXv_char9[0] = AV89BarSerDsc ;
                                    GXv_char8[0] = AV90BarColNom ;
                                    GXv_int4[0] = AV91BarColNum ;
                                    GXv_dtime15[0] = AV92HisProdti ;
                                    GXv_dtime14[0] = AV93HisProdtf ;
                                    GXv_char6[0] = AV94HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV81EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int13, GXv_char12, GXv_char10, GXv_char9, GXv_char8, GXv_int4, GXv_dtime15, GXv_dtime14, GXv_char6) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV86CliCod = GXv_int13[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV87CliNom = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV88BarSer = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV89BarSerDsc = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV90BarColNom = GXv_char8[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV91BarColNum = GXv_int4[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV92HisProdti = GXv_dtime15[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV93HisProdtf = GXv_dtime14[0] ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.AV94HisProF = GXv_char6[0] ;
                                    AV14TextFileLine += ";" ;
                                    AV14TextFileLine += localUtil.ttoc( AV93HisProdtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14259lecOpeNom, ";", ","), GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14260LecFasDsc, ";", ","), GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14261LecParNom, ";", ","), GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char2 = AV113PedidoCliente ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.produccion.pedidocliente_pr(remoteHandle, context).execute( AV81EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV113PedidoCliente = GXt_char2 ;
                                    AV14TextFileLine += ";" ;
                                    GXt_char2 = AV14TextFileLine ;
                                    GXv_char12[0] = GXt_char2 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV113PedidoCliente, ";", ","), GXv_char12) ;
                                    consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
                                    AV14TextFileLine += GXt_char2 ;
                                 }
                                 /* Execute user subroutine: 'AFTERWRITELINE' */
                                 S172 ();
                                 if ( returnInSub )
                                 {
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
                        }
                     }
                  }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultaMaquinasProduccionWWExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "LecMaqCod", "", "Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&MaqDsc", "", "Descrip.Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "LecFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "LecOpeCod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&OpeNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "LecHdr", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "LecEstado", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "LecParCod", "", "Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&ParCodNom", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&Texto1", "", "Observación", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&BarSer", "", "Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&BarSerDsc", "", "Descrip.Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&BarColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&BarColNum", "", "Número", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&HisProdti", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&HisProdtf", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&HisProF", "", "Fin?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "lecOpeNom", "", "Nombre", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "LecFasDsc", "", "Descripcion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "LecParNom", "", "Descripcion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "&PedidoCliente", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char12[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultaMaquinasProduccionWWColumnsSelector", GXv_char12) ;
      consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector16[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector17[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, GXv_SdtWWPColumnsSelector17) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector16[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ConsultaMaquinasProduccionWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultaMaquinasProduccionWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("ConsultaMaquinasProduccionWWGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV118GXV1 = 1 ;
      while ( AV118GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV118GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "LECESTADO") == 0 )
         {
            AV72LecEstado = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV35TFLecMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD_SEL") == 0 )
         {
            AV36TFLecMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV53TFLecFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV43TFLecOpeCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFLecOpeCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR") == 0 )
         {
            AV68TFLecHdr = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR_SEL") == 0 )
         {
            AV69TFLecHdr_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV71TFLecEstado_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV49TFLecParCod = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFLecParCod_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV107TFlecOpeNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM_SEL") == 0 )
         {
            AV108TFlecOpeNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV109TFLecFasDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC_SEL") == 0 )
         {
            AV110TFLecFasDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV111TFLecParNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM_SEL") == 0 )
         {
            AV112TFLecParNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV118GXV1 = (int)(AV118GXV1+1) ;
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

   public void S201( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char2 = AV80Station ;
      GXv_char12[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char12) ;
      consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
      AV80Station = GXt_char2 ;
      GXv_char12[0] = AV81EmprCod ;
      GXv_char10[0] = AV79EmprNom ;
      GXv_char9[0] = AV82UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV80Station, GXv_char12, GXv_char10, GXv_char9) ;
      consultamaquinasproduccionwwexportcsv_impl.this.AV81EmprCod = GXv_char12[0] ;
      consultamaquinasproduccionwwexportcsv_impl.this.AV79EmprNom = GXv_char10[0] ;
      consultamaquinasproduccionwwexportcsv_impl.this.AV82UsurCod = GXv_char9[0] ;
      AV31LecMaqCod = GXutil.upper( GXutil.trim( AV83WebSession.getValue("FiltroConsultaMaquinasProduccion_LecMaqCod"))) ;
      AV83WebSession.remove("FiltroConsultaMaquinasProduccion_LecMaqCod");
      GXt_char2 = AV84MaqDscInicial ;
      GXv_char12[0] = GXt_char2 ;
      new app.pobtmaq(remoteHandle, context).execute( AV81EmprCod, AV31LecMaqCod, GXv_char12) ;
      consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
      AV84MaqDscInicial = GXt_char2 ;
      AV77LecMaqCod_To = GXutil.upper( GXutil.trim( AV83WebSession.getValue("FiltroConsultaMaquinasProduccion_LecMaqCod_To"))) ;
      AV83WebSession.remove("FiltroConsultaMaquinasProduccion_LecMaqCod_To");
      GXt_char2 = AV85MaqDscFinal ;
      GXv_char12[0] = GXt_char2 ;
      new app.pobtmaq(remoteHandle, context).execute( AV81EmprCod, AV77LecMaqCod_To, GXv_char12) ;
      consultamaquinasproduccionwwexportcsv_impl.this.GXt_char2 = GXv_char12[0] ;
      AV85MaqDscFinal = GXt_char2 ;
      AV72LecEstado = GXutil.upper( GXutil.trim( AV83WebSession.getValue("FiltroConsultaMaquinasProduccion_LecEstado"))) ;
      AV83WebSession.remove("FiltroConsultaMaquinasProduccion_LecEstado");
   }

   public void S211( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV14TextFileLine += AV79EmprNom + " " + "(" + AV119Pgmdesc + ")" ;
      AV14TextFileLine += httpContext.getMessage( "Maquina Inicial: ", "") + " " + AV31LecMaqCod + " " + AV84MaqDscInicial ;
      AV14TextFileLine += httpContext.getMessage( "Maquina Final: ", "") + " " + AV77LecMaqCod_To + " " + AV85MaqDscFinal ;
      if ( (GXutil.strcmp("", GXutil.trim( AV72LecEstado))==0) )
      {
         AV14TextFileLine += httpContext.getMessage( "Estado: ", "") + " " + httpContext.getMessage( "Todos", "") ;
      }
      else if ( GXutil.strcmp(GXutil.trim( AV72LecEstado), httpContext.getMessage( "P", "")) == 0 )
      {
         AV14TextFileLine += httpContext.getMessage( "Estado: ", "") + " " + httpContext.getMessage( "Proceso", "") ;
      }
      else if ( GXutil.strcmp(GXutil.trim( AV72LecEstado), httpContext.getMessage( "F", "")) == 0 )
      {
         AV14TextFileLine += httpContext.getMessage( "Estado: ", "") + " " + httpContext.getMessage( "Finalizadas", "") ;
      }
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(AV14TextFileLine);
         AV10TextFile.writeLine(" ");
      }
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
      A1169LecBarPar = "" ;
      A1171LecFasCod = "" ;
      A1166LecMaqCod = "" ;
      A13721LecHdr = "" ;
      A14259lecOpeNom = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      scmdbuf = "" ;
      lV35TFLecMaqCod = "" ;
      lV68TFLecHdr = "" ;
      AV36TFLecMaqCod_Sel = "" ;
      AV35TFLecMaqCod = "" ;
      AV53TFLecFec = GXutil.nullDate() ;
      AV69TFLecHdr_Sel = "" ;
      AV68TFLecHdr = "" ;
      AV31LecMaqCod = "" ;
      AV77LecMaqCod_To = "" ;
      A1174LecFec = GXutil.nullDate() ;
      AV72LecEstado = "" ;
      A13722LecEstado = "" ;
      AV71TFLecEstado_Sel = "" ;
      AV108TFlecOpeNom_Sel = "" ;
      AV107TFlecOpeNom = "" ;
      AV110TFLecFasDsc_Sel = "" ;
      AV109TFLecFasDsc = "" ;
      AV112TFLecParNom_Sel = "" ;
      AV111TFLecParNom = "" ;
      P08DE2_A13721LecHdr = new String[] {""} ;
      P08DE2_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DE2_n1174LecFec = new boolean[] {false} ;
      P08DE2_A1166LecMaqCod = new String[] {""} ;
      P08DE2_A1188LecFasOrd = new short[1] ;
      P08DE2_n1188LecFasOrd = new boolean[] {false} ;
      P08DE2_A1169LecBarPar = new String[] {""} ;
      P08DE2_n1169LecBarPar = new boolean[] {false} ;
      P08DE2_A1168LecBarReo = new byte[1] ;
      P08DE2_n1168LecBarReo = new boolean[] {false} ;
      P08DE2_A1167LecBarCod = new int[1] ;
      P08DE2_n1167LecBarCod = new boolean[] {false} ;
      P08DE2_A1170LecOpeCod = new int[1] ;
      P08DE2_n1170LecOpeCod = new boolean[] {false} ;
      P08DE2_A1171LecFasCod = new String[] {""} ;
      P08DE2_n1171LecFasCod = new boolean[] {false} ;
      P08DE2_A1172LecParCod = new short[1] ;
      P08DE2_n1172LecParCod = new boolean[] {false} ;
      P08DE2_A396EmprCod = new String[] {""} ;
      AV75MaqDsc = "" ;
      AV64OpeNom = "" ;
      P08DE3_A396EmprCod = new String[] {""} ;
      P08DE3_A656ParCod = new short[1] ;
      P08DE3_A867ParCodNom = new String[] {""} ;
      P08DE3_n867ParCodNom = new boolean[] {false} ;
      A867ParCodNom = "" ;
      AV66ParCodNom = "" ;
      AV67Texto1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int7 = new short[1] ;
      GXv_int11 = new short[1] ;
      AV81EmprCod = "" ;
      AV87CliNom = "" ;
      AV88BarSer = "" ;
      AV89BarSerDsc = "" ;
      AV90BarColNom = "" ;
      AV92HisProdti = GXutil.resetTime( GXutil.nullDate() );
      AV93HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      AV94HisProF = "" ;
      GXv_int13 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_dtime15 = new java.util.Date[1] ;
      GXv_dtime14 = new java.util.Date[1] ;
      GXv_char6 = new String[1] ;
      AV113PedidoCliente = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector17 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV80Station = "" ;
      AV79EmprNom = "" ;
      GXv_char10 = new String[1] ;
      AV82UsurCod = "" ;
      GXv_char9 = new String[1] ;
      AV83WebSession = httpContext.getWebSession();
      AV84MaqDscInicial = "" ;
      AV85MaqDscFinal = "" ;
      GXt_char2 = "" ;
      GXv_char12 = new String[1] ;
      AV119Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultamaquinasproduccionwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08DE2_A13721LecHdr, P08DE2_A1174LecFec, P08DE2_n1174LecFec, P08DE2_A1166LecMaqCod, P08DE2_A1188LecFasOrd, P08DE2_n1188LecFasOrd, P08DE2_A1169LecBarPar, P08DE2_n1169LecBarPar, P08DE2_A1168LecBarReo, P08DE2_n1168LecBarReo,
            P08DE2_A1167LecBarCod, P08DE2_n1167LecBarCod, P08DE2_A1170LecOpeCod, P08DE2_n1170LecOpeCod, P08DE2_A1171LecFasCod, P08DE2_n1171LecFasCod, P08DE2_A1172LecParCod, P08DE2_n1172LecParCod, P08DE2_A396EmprCod
            }
            , new Object[] {
            P08DE3_A396EmprCod, P08DE3_A656ParCod, P08DE3_A867ParCodNom, P08DE3_n867ParCodNom
            }
         }
      );
      AV119Pgmdesc = httpContext.getMessage( "Consulta Maquinas Produccion WWExport CSV", "") ;
      /* GeneXus formulas. */
      AV119Pgmdesc = httpContext.getMessage( "Consulta Maquinas Produccion WWExport CSV", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private byte AV117GXLvl194 ;
   private byte GXv_int5[] ;
   private short gxcookieaux ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short AV49TFLecParCod ;
   private short AV50TFLecParCod_To ;
   private short AV28OrderedBy ;
   private short A656ParCod ;
   private short GXv_int7[] ;
   private short GXv_int11[] ;
   private short Gx_err ;
   private int AV13Random ;
   private int A1167LecBarCod ;
   private int AV43TFLecOpeCod ;
   private int AV44TFLecOpeCod_To ;
   private int A1170LecOpeCod ;
   private int AV86CliCod ;
   private int AV91BarColNum ;
   private int GXv_int13[] ;
   private int GXv_int4[] ;
   private int AV118GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A1169LecBarPar ;
   private String A1171LecFasCod ;
   private String A1166LecMaqCod ;
   private String A13721LecHdr ;
   private String A14259lecOpeNom ;
   private String A14260LecFasDsc ;
   private String A14261LecParNom ;
   private String scmdbuf ;
   private String lV35TFLecMaqCod ;
   private String lV68TFLecHdr ;
   private String AV36TFLecMaqCod_Sel ;
   private String AV35TFLecMaqCod ;
   private String AV69TFLecHdr_Sel ;
   private String AV68TFLecHdr ;
   private String AV31LecMaqCod ;
   private String AV77LecMaqCod_To ;
   private String AV72LecEstado ;
   private String A13722LecEstado ;
   private String AV71TFLecEstado_Sel ;
   private String AV108TFlecOpeNom_Sel ;
   private String AV107TFlecOpeNom ;
   private String AV110TFLecFasDsc_Sel ;
   private String AV109TFLecFasDsc ;
   private String AV112TFLecParNom_Sel ;
   private String AV111TFLecParNom ;
   private String AV75MaqDsc ;
   private String AV64OpeNom ;
   private String A867ParCodNom ;
   private String AV66ParCodNom ;
   private String GXv_char3[] ;
   private String AV81EmprCod ;
   private String AV87CliNom ;
   private String AV88BarSer ;
   private String AV89BarSerDsc ;
   private String AV90BarColNom ;
   private String AV94HisProF ;
   private String GXv_char8[] ;
   private String GXv_char6[] ;
   private String AV113PedidoCliente ;
   private String AV80Station ;
   private String AV79EmprNom ;
   private String GXv_char10[] ;
   private String AV82UsurCod ;
   private String GXv_char9[] ;
   private String AV84MaqDscInicial ;
   private String AV85MaqDscFinal ;
   private String GXt_char2 ;
   private String GXv_char12[] ;
   private String AV119Pgmdesc ;
   private java.util.Date AV92HisProdti ;
   private java.util.Date AV93HisProdtf ;
   private java.util.Date GXv_dtime15[] ;
   private java.util.Date GXv_dtime14[] ;
   private java.util.Date AV53TFLecFec ;
   private java.util.Date A1174LecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n1174LecFec ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private boolean n867ParCodNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV67Texto1 ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.WebSession AV83WebSession ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08DE2_A13721LecHdr ;
   private java.util.Date[] P08DE2_A1174LecFec ;
   private boolean[] P08DE2_n1174LecFec ;
   private String[] P08DE2_A1166LecMaqCod ;
   private short[] P08DE2_A1188LecFasOrd ;
   private boolean[] P08DE2_n1188LecFasOrd ;
   private String[] P08DE2_A1169LecBarPar ;
   private boolean[] P08DE2_n1169LecBarPar ;
   private byte[] P08DE2_A1168LecBarReo ;
   private boolean[] P08DE2_n1168LecBarReo ;
   private int[] P08DE2_A1167LecBarCod ;
   private boolean[] P08DE2_n1167LecBarCod ;
   private int[] P08DE2_A1170LecOpeCod ;
   private boolean[] P08DE2_n1170LecOpeCod ;
   private String[] P08DE2_A1171LecFasCod ;
   private boolean[] P08DE2_n1171LecFasCod ;
   private short[] P08DE2_A1172LecParCod ;
   private boolean[] P08DE2_n1172LecParCod ;
   private String[] P08DE2_A396EmprCod ;
   private String[] P08DE3_A396EmprCod ;
   private short[] P08DE3_A656ParCod ;
   private String[] P08DE3_A867ParCodNom ;
   private boolean[] P08DE3_n867ParCodNom ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class consultamaquinasproduccionwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV36TFLecMaqCod_Sel ,
                                          String AV35TFLecMaqCod ,
                                          java.util.Date AV53TFLecFec ,
                                          int AV43TFLecOpeCod ,
                                          int AV44TFLecOpeCod_To ,
                                          String AV69TFLecHdr_Sel ,
                                          String AV68TFLecHdr ,
                                          short AV49TFLecParCod ,
                                          short AV50TFLecParCod_To ,
                                          String AV31LecMaqCod ,
                                          String AV77LecMaqCod_To ,
                                          String A1166LecMaqCod ,
                                          java.util.Date A1174LecFec ,
                                          int A1170LecOpeCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          short A1172LecParCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV72LecEstado ,
                                          String A13722LecEstado ,
                                          String AV71TFLecEstado_Sel ,
                                          String AV108TFlecOpeNom_Sel ,
                                          String AV107TFlecOpeNom ,
                                          String A14259lecOpeNom ,
                                          String AV110TFLecFasDsc_Sel ,
                                          String AV109TFLecFasDsc ,
                                          String A14260LecFasDsc ,
                                          String AV112TFLecParNom_Sel ,
                                          String AV111TFLecParNom ,
                                          String A14261LecParNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[11];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE( LecBarPar, '') AS LecHdr, LecFec," ;
      scmdbuf += " LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFLecMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFLecFec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! (0==AV43TFLecOpeCod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! (0==AV44TFLecOpeCod_To) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69TFLecHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFLecHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69TFLecHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (0==AV49TFLecParCod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (0==AV50TFLecParCod_To) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31LecMaqCod)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod >= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77LecMaqCod_To)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod <= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHdr" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHdr DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_P08DE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DE3", "SELECT EmprCod, ParCod, ParCodNom FROM TXPCODPAR WHERE EmprCod = ? and ParCod = ? ORDER BY EmprCod, ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
   }

}

