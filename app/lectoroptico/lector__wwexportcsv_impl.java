package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lector__wwexportcsv_impl extends GXWebProcedure
{
   public lector__wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "Lector__WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("LectorOptico.Lector__WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("LectorOptico.Lector__WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "R", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod.Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descrip.Paro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV70Lectoroptico_lector__wwds_1_filterfulltext = AV30FilterFullText ;
      AV71Lectoroptico_lector__wwds_2_tflecmaqcod = AV34TFLecMaqCod ;
      AV72Lectoroptico_lector__wwds_3_tflecbarcod = AV36TFLecBarCod ;
      AV73Lectoroptico_lector__wwds_4_tflecbarreo = AV38TFLecBarReo ;
      AV74Lectoroptico_lector__wwds_5_tflecbarpar = AV40TFLecBarPar ;
      AV75Lectoroptico_lector__wwds_6_tflecopecod = AV42TFLecOpeCod ;
      AV76Lectoroptico_lector__wwds_7_tflecopenom = AV44TFlecOpeNom ;
      AV77Lectoroptico_lector__wwds_8_tflecfascod = AV46TFLecFasCod ;
      AV78Lectoroptico_lector__wwds_9_tflecfasdsc = AV48TFLecFasDsc ;
      AV79Lectoroptico_lector__wwds_10_tflecfasord = AV50TFLecFasOrd ;
      AV80Lectoroptico_lector__wwds_11_tflecparcod = AV52TFLecParCod ;
      AV81Lectoroptico_lector__wwds_12_tflecparnom = AV54TFLecParNom ;
      AV82Lectoroptico_lector__wwds_13_tflechor = AV56TFLecHor ;
      AV83Lectoroptico_lector__wwds_14_tflecfec = AV58TFLecFec ;
      AV84Lectoroptico_lector__wwds_15_tflecfec_to = AV59TFLecFec_To ;
      AV85Lectoroptico_lector__wwds_16_tflectipent = AV60TFLecTipEnt ;
      AV86Lectoroptico_lector__wwds_17_tflecestado_sel = AV66TFLecEstado_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV72Lectoroptico_lector__wwds_3_tflecbarcod) ,
                                           Byte.valueOf(AV73Lectoroptico_lector__wwds_4_tflecbarreo) ,
                                           AV74Lectoroptico_lector__wwds_5_tflecbarpar ,
                                           Integer.valueOf(AV75Lectoroptico_lector__wwds_6_tflecopecod) ,
                                           AV77Lectoroptico_lector__wwds_8_tflecfascod ,
                                           Short.valueOf(AV79Lectoroptico_lector__wwds_10_tflecfasord) ,
                                           Short.valueOf(AV80Lectoroptico_lector__wwds_11_tflecparcod) ,
                                           AV82Lectoroptico_lector__wwds_13_tflechor ,
                                           AV83Lectoroptico_lector__wwds_14_tflecfec ,
                                           AV84Lectoroptico_lector__wwds_15_tflecfec_to ,
                                           AV85Lectoroptico_lector__wwds_16_tflectipent ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV70Lectoroptico_lector__wwds_1_filterfulltext ,
                                           A1166LecMaqCod ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           A13722LecEstado ,
                                           AV71Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                           AV76Lectoroptico_lector__wwds_7_tflecopenom ,
                                           AV78Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                           AV81Lectoroptico_lector__wwds_12_tflecparnom ,
                                           AV86Lectoroptico_lector__wwds_17_tflecestado_sel } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV71Lectoroptico_lector__wwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV71Lectoroptico_lector__wwds_2_tflecmaqcod), 6, "%") ;
      lV74Lectoroptico_lector__wwds_5_tflecbarpar = GXutil.padr( GXutil.rtrim( AV74Lectoroptico_lector__wwds_5_tflecbarpar), 1, "%") ;
      lV77Lectoroptico_lector__wwds_8_tflecfascod = GXutil.padr( GXutil.rtrim( AV77Lectoroptico_lector__wwds_8_tflecfascod), 8, "%") ;
      lV82Lectoroptico_lector__wwds_13_tflechor = GXutil.padr( GXutil.rtrim( AV82Lectoroptico_lector__wwds_13_tflechor), 8, "%") ;
      lV85Lectoroptico_lector__wwds_16_tflectipent = GXutil.padr( GXutil.rtrim( AV85Lectoroptico_lector__wwds_16_tflectipent), 1, "%") ;
      /* Using cursor P0A372 */
      pr_default.execute(0, new Object[] {lV71Lectoroptico_lector__wwds_2_tflecmaqcod, Integer.valueOf(AV72Lectoroptico_lector__wwds_3_tflecbarcod), Byte.valueOf(AV73Lectoroptico_lector__wwds_4_tflecbarreo), lV74Lectoroptico_lector__wwds_5_tflecbarpar, Integer.valueOf(AV75Lectoroptico_lector__wwds_6_tflecopecod), lV77Lectoroptico_lector__wwds_8_tflecfascod, Short.valueOf(AV79Lectoroptico_lector__wwds_10_tflecfasord), Short.valueOf(AV80Lectoroptico_lector__wwds_11_tflecparcod), lV82Lectoroptico_lector__wwds_13_tflechor, AV83Lectoroptico_lector__wwds_14_tflecfec, AV84Lectoroptico_lector__wwds_15_tflecfec_to, lV85Lectoroptico_lector__wwds_16_tflectipent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1796LecTipEnt = P0A372_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P0A372_n1796LecTipEnt[0] ;
         A1173LecHor = P0A372_A1173LecHor[0] ;
         n1173LecHor = P0A372_n1173LecHor[0] ;
         A1166LecMaqCod = P0A372_A1166LecMaqCod[0] ;
         A1174LecFec = P0A372_A1174LecFec[0] ;
         n1174LecFec = P0A372_n1174LecFec[0] ;
         A1188LecFasOrd = P0A372_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P0A372_n1188LecFasOrd[0] ;
         A1169LecBarPar = P0A372_A1169LecBarPar[0] ;
         n1169LecBarPar = P0A372_n1169LecBarPar[0] ;
         A1168LecBarReo = P0A372_A1168LecBarReo[0] ;
         n1168LecBarReo = P0A372_n1168LecBarReo[0] ;
         A1167LecBarCod = P0A372_A1167LecBarCod[0] ;
         n1167LecBarCod = P0A372_n1167LecBarCod[0] ;
         A1170LecOpeCod = P0A372_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P0A372_n1170LecOpeCod[0] ;
         A1171LecFasCod = P0A372_A1171LecFasCod[0] ;
         n1171LecFasCod = P0A372_n1171LecFasCod[0] ;
         A1172LecParCod = P0A372_A1172LecParCod[0] ;
         n1172LecParCod = P0A372_n1172LecParCod[0] ;
         A396EmprCod = P0A372_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( (GXutil.strcmp("", AV86Lectoroptico_lector__wwds_17_tflecestado_sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV86Lectoroptico_lector__wwds_17_tflecestado_sel) == 0 ) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( (GXutil.strcmp("", AV76Lectoroptico_lector__wwds_7_tflecopenom)==0) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV76Lectoroptico_lector__wwds_7_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               GXt_char2 = A14260LecFasDsc ;
               GXv_char3[0] = GXt_char2 ;
               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
               lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               A14260LecFasDsc = GXt_char2 ;
               if ( (GXutil.strcmp("", AV78Lectoroptico_lector__wwds_9_tflecfasdsc)==0) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV78Lectoroptico_lector__wwds_9_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
               {
                  GXt_char2 = A14261LecParNom ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                  lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  A14261LecParNom = GXt_char2 ;
                  if ( (GXutil.strcmp("", AV70Lectoroptico_lector__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1167LecBarCod, 8, 0) , GXutil.padr( "%" + AV70Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1168LecBarReo, 1, 0) , GXutil.padr( "%" + AV70Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1169LecBarPar) , GXutil.padr( "%" + GXutil.upper( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV70Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV70Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV70Lectoroptico_lector__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV70Lectoroptico_lector__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                  {
                     if ( (GXutil.strcmp("", AV81Lectoroptico_lector__wwds_12_tflecparnom)==0) || ( GXutil.like( GXutil.trim( GXutil.upper( A14261LecParNom)) , GXutil.padr( "%" + GXutil.trim( GXutil.upper( AV81Lectoroptico_lector__wwds_12_tflecparnom)) , 1 , "%"),  ' ' ) ) )
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
                           lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A1167LecBarCod, 8, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A1168LecBarReo, 1, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1169LecBarPar, ";", ","), GXv_char3) ;
                           lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A1170LecOpeCod, 6, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14259lecOpeNom, ";", ","), GXv_char3) ;
                           lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1171LecFasCod, ";", ","), GXv_char3) ;
                           lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14260LecFasDsc, ";", ","), GXv_char3) ;
                           lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A1188LecFasOrd, 4, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A1172LecParCod, 4, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14261LecParNom, ";", ","), GXv_char3) ;
                           lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1173LecHor, ";", ","), GXv_char3) ;
                           lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += localUtil.dtoc( A1174LecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1796LecTipEnt, ";", ","), GXv_char3) ;
                           lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=Lector__WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecMaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecBarCod", "", "Nº Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecBarReo", "", "R", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecBarPar", "", "P", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecOpeCod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "lecOpeNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecFasCod", "", "Cod.Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecFasDsc", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecFasOrd", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecParCod", "", "Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecParNom", "", "Descrip.Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecHor", "", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecTipEnt", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LecEstado", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "LectorOptico.Lector__WWColumnsSelector", GXv_char3) ;
      lector__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("LectorOptico.Lector__WWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "LectorOptico.Lector__WWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("LectorOptico.Lector__WWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV34TFLecMaqCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARCOD") == 0 )
         {
            AV36TFLecBarCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARREO") == 0 )
         {
            AV38TFLecBarReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECBARPAR") == 0 )
         {
            AV40TFLecBarPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV42TFLecOpeCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV44TFlecOpeNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD") == 0 )
         {
            AV46TFLecFasCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV48TFLecFasDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASORD") == 0 )
         {
            AV50TFLecFasOrd = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV52TFLecParCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV54TFLecParNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR") == 0 )
         {
            AV56TFLecHor = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV58TFLecFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV59TFLecFec_To = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT") == 0 )
         {
            AV60TFLecTipEnt = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV66TFLecEstado_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV87GXV1 = (int)(AV87GXV1+1) ;
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
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A14259lecOpeNom = "" ;
      A1171LecFasCod = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      A13722LecEstado = "" ;
      AV70Lectoroptico_lector__wwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV71Lectoroptico_lector__wwds_2_tflecmaqcod = "" ;
      AV34TFLecMaqCod = "" ;
      AV74Lectoroptico_lector__wwds_5_tflecbarpar = "" ;
      AV40TFLecBarPar = "" ;
      AV76Lectoroptico_lector__wwds_7_tflecopenom = "" ;
      AV44TFlecOpeNom = "" ;
      AV77Lectoroptico_lector__wwds_8_tflecfascod = "" ;
      AV46TFLecFasCod = "" ;
      AV78Lectoroptico_lector__wwds_9_tflecfasdsc = "" ;
      AV48TFLecFasDsc = "" ;
      AV81Lectoroptico_lector__wwds_12_tflecparnom = "" ;
      AV54TFLecParNom = "" ;
      AV82Lectoroptico_lector__wwds_13_tflechor = "" ;
      AV56TFLecHor = "" ;
      AV83Lectoroptico_lector__wwds_14_tflecfec = GXutil.nullDate() ;
      AV58TFLecFec = GXutil.nullDate() ;
      AV84Lectoroptico_lector__wwds_15_tflecfec_to = GXutil.nullDate() ;
      AV59TFLecFec_To = GXutil.nullDate() ;
      AV85Lectoroptico_lector__wwds_16_tflectipent = "" ;
      AV60TFLecTipEnt = "" ;
      AV86Lectoroptico_lector__wwds_17_tflecestado_sel = "" ;
      AV66TFLecEstado_Sel = "" ;
      scmdbuf = "" ;
      lV71Lectoroptico_lector__wwds_2_tflecmaqcod = "" ;
      lV74Lectoroptico_lector__wwds_5_tflecbarpar = "" ;
      lV77Lectoroptico_lector__wwds_8_tflecfascod = "" ;
      lV82Lectoroptico_lector__wwds_13_tflechor = "" ;
      lV85Lectoroptico_lector__wwds_16_tflectipent = "" ;
      P0A372_A1796LecTipEnt = new String[] {""} ;
      P0A372_n1796LecTipEnt = new boolean[] {false} ;
      P0A372_A1173LecHor = new String[] {""} ;
      P0A372_n1173LecHor = new boolean[] {false} ;
      P0A372_A1166LecMaqCod = new String[] {""} ;
      P0A372_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A372_n1174LecFec = new boolean[] {false} ;
      P0A372_A1188LecFasOrd = new short[1] ;
      P0A372_n1188LecFasOrd = new boolean[] {false} ;
      P0A372_A1169LecBarPar = new String[] {""} ;
      P0A372_n1169LecBarPar = new boolean[] {false} ;
      P0A372_A1168LecBarReo = new byte[1] ;
      P0A372_n1168LecBarReo = new boolean[] {false} ;
      P0A372_A1167LecBarCod = new int[1] ;
      P0A372_n1167LecBarCod = new boolean[] {false} ;
      P0A372_A1170LecOpeCod = new int[1] ;
      P0A372_n1170LecOpeCod = new boolean[] {false} ;
      P0A372_A1171LecFasCod = new String[] {""} ;
      P0A372_n1171LecFasCod = new boolean[] {false} ;
      P0A372_A1172LecParCod = new short[1] ;
      P0A372_n1172LecParCod = new boolean[] {false} ;
      P0A372_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.lector__wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0A372_A1796LecTipEnt, P0A372_n1796LecTipEnt, P0A372_A1173LecHor, P0A372_n1173LecHor, P0A372_A1166LecMaqCod, P0A372_A1174LecFec, P0A372_n1174LecFec, P0A372_A1188LecFasOrd, P0A372_n1188LecFasOrd, P0A372_A1169LecBarPar,
            P0A372_n1169LecBarPar, P0A372_A1168LecBarReo, P0A372_n1168LecBarReo, P0A372_A1167LecBarCod, P0A372_n1167LecBarCod, P0A372_A1170LecOpeCod, P0A372_n1170LecOpeCod, P0A372_A1171LecFasCod, P0A372_n1171LecFasCod, P0A372_A1172LecParCod,
            P0A372_n1172LecParCod, P0A372_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private byte AV73Lectoroptico_lector__wwds_4_tflecbarreo ;
   private byte AV38TFLecBarReo ;
   private short gxcookieaux ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short AV79Lectoroptico_lector__wwds_10_tflecfasord ;
   private short AV50TFLecFasOrd ;
   private short AV80Lectoroptico_lector__wwds_11_tflecparcod ;
   private short AV52TFLecParCod ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int AV72Lectoroptico_lector__wwds_3_tflecbarcod ;
   private int AV36TFLecBarCod ;
   private int AV75Lectoroptico_lector__wwds_6_tflecopecod ;
   private int AV42TFLecOpeCod ;
   private int AV87GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A14259lecOpeNom ;
   private String A1171LecFasCod ;
   private String A14260LecFasDsc ;
   private String A14261LecParNom ;
   private String A1173LecHor ;
   private String A1796LecTipEnt ;
   private String A13722LecEstado ;
   private String AV71Lectoroptico_lector__wwds_2_tflecmaqcod ;
   private String AV34TFLecMaqCod ;
   private String AV74Lectoroptico_lector__wwds_5_tflecbarpar ;
   private String AV40TFLecBarPar ;
   private String AV76Lectoroptico_lector__wwds_7_tflecopenom ;
   private String AV44TFlecOpeNom ;
   private String AV77Lectoroptico_lector__wwds_8_tflecfascod ;
   private String AV46TFLecFasCod ;
   private String AV78Lectoroptico_lector__wwds_9_tflecfasdsc ;
   private String AV48TFLecFasDsc ;
   private String AV81Lectoroptico_lector__wwds_12_tflecparnom ;
   private String AV54TFLecParNom ;
   private String AV82Lectoroptico_lector__wwds_13_tflechor ;
   private String AV56TFLecHor ;
   private String AV85Lectoroptico_lector__wwds_16_tflectipent ;
   private String AV60TFLecTipEnt ;
   private String AV86Lectoroptico_lector__wwds_17_tflecestado_sel ;
   private String AV66TFLecEstado_Sel ;
   private String scmdbuf ;
   private String lV71Lectoroptico_lector__wwds_2_tflecmaqcod ;
   private String lV74Lectoroptico_lector__wwds_5_tflecbarpar ;
   private String lV77Lectoroptico_lector__wwds_8_tflecfascod ;
   private String lV82Lectoroptico_lector__wwds_13_tflechor ;
   private String lV85Lectoroptico_lector__wwds_16_tflectipent ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A1174LecFec ;
   private java.util.Date AV83Lectoroptico_lector__wwds_14_tflecfec ;
   private java.util.Date AV58TFLecFec ;
   private java.util.Date AV84Lectoroptico_lector__wwds_15_tflecfec_to ;
   private java.util.Date AV59TFLecFec_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n1796LecTipEnt ;
   private boolean n1173LecHor ;
   private boolean n1174LecFec ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV70Lectoroptico_lector__wwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0A372_A1796LecTipEnt ;
   private boolean[] P0A372_n1796LecTipEnt ;
   private String[] P0A372_A1173LecHor ;
   private boolean[] P0A372_n1173LecHor ;
   private String[] P0A372_A1166LecMaqCod ;
   private java.util.Date[] P0A372_A1174LecFec ;
   private boolean[] P0A372_n1174LecFec ;
   private short[] P0A372_A1188LecFasOrd ;
   private boolean[] P0A372_n1188LecFasOrd ;
   private String[] P0A372_A1169LecBarPar ;
   private boolean[] P0A372_n1169LecBarPar ;
   private byte[] P0A372_A1168LecBarReo ;
   private boolean[] P0A372_n1168LecBarReo ;
   private int[] P0A372_A1167LecBarCod ;
   private boolean[] P0A372_n1167LecBarCod ;
   private int[] P0A372_A1170LecOpeCod ;
   private boolean[] P0A372_n1170LecOpeCod ;
   private String[] P0A372_A1171LecFasCod ;
   private boolean[] P0A372_n1171LecFasCod ;
   private short[] P0A372_A1172LecParCod ;
   private boolean[] P0A372_n1172LecParCod ;
   private String[] P0A372_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class lector__wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A372( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV72Lectoroptico_lector__wwds_3_tflecbarcod ,
                                          byte AV73Lectoroptico_lector__wwds_4_tflecbarreo ,
                                          String AV74Lectoroptico_lector__wwds_5_tflecbarpar ,
                                          int AV75Lectoroptico_lector__wwds_6_tflecopecod ,
                                          String AV77Lectoroptico_lector__wwds_8_tflecfascod ,
                                          short AV79Lectoroptico_lector__wwds_10_tflecfasord ,
                                          short AV80Lectoroptico_lector__wwds_11_tflecparcod ,
                                          String AV82Lectoroptico_lector__wwds_13_tflechor ,
                                          java.util.Date AV83Lectoroptico_lector__wwds_14_tflecfec ,
                                          java.util.Date AV84Lectoroptico_lector__wwds_15_tflecfec_to ,
                                          String AV85Lectoroptico_lector__wwds_16_tflectipent ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV70Lectoroptico_lector__wwds_1_filterfulltext ,
                                          String A1166LecMaqCod ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String A13722LecEstado ,
                                          String AV71Lectoroptico_lector__wwds_2_tflecmaqcod ,
                                          String AV76Lectoroptico_lector__wwds_7_tflecopenom ,
                                          String AV78Lectoroptico_lector__wwds_9_tflecfasdsc ,
                                          String AV81Lectoroptico_lector__wwds_12_tflecparnom ,
                                          String AV86Lectoroptico_lector__wwds_17_tflecestado_sel )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecHor, LecMaqCod, LecFec, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      addWhere(sWhereString, "(RTRIM(LTRIM(LOWER(LecMaqCod))) like '%' || RTRIM(LTRIM(LOWER(?))))");
      if ( ! (0==AV72Lectoroptico_lector__wwds_3_tflecbarcod) )
      {
         addWhere(sWhereString, "(LecBarCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV73Lectoroptico_lector__wwds_4_tflecbarreo) )
      {
         addWhere(sWhereString, "(LecBarReo = ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Lectoroptico_lector__wwds_5_tflecbarpar)==0) )
      {
         addWhere(sWhereString, "(LecBarPar like '%' || RTRIM(LTRIM(LOWER(?))))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Lectoroptico_lector__wwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Lectoroptico_lector__wwds_8_tflecfascod)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(UPPER(LecFasCod))) like '%' || RTRIM(LTRIM(UPPER(?))))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV79Lectoroptico_lector__wwds_10_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV80Lectoroptico_lector__wwds_11_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Lectoroptico_lector__wwds_13_tflechor)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Lectoroptico_lector__wwds_14_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84Lectoroptico_lector__wwds_15_tflecfec_to)) )
      {
         addWhere(sWhereString, "(LecFec <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Lectoroptico_lector__wwds_16_tflectipent)==0) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY LecMaqCod, EmprCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarReo" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarReo DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecBarPar" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecBarPar DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasCod" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFasOrd" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFasOrd DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHor" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHor DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LecTipEnt" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecTipEnt DESC" ;
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
                  return conditional_P0A372(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A372", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
      }
   }

}

