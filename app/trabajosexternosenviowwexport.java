package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajosexternosenviowwexport extends GXProcedure
{
   public trabajosexternosenviowwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajosexternosenviowwexport.class ), "" );
   }

   public trabajosexternosenviowwexport( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      trabajosexternosenviowwexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      trabajosexternosenviowwexport.this.aP0 = aP0;
      trabajosexternosenviowwexport.this.aP1 = aP1;
      initialize();
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
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "TrabajosExternosEnvioWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFSalExtAlb) && (0==AV35TFSalExtAlb_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Documento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFSalExtAlb );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFSalExtAlb_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFManNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Manufacturador", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFManNom_Sel, GXv_char5) ;
         trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFManNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Manufacturador", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFManNom, GXv_char5) ;
            trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFManCod) && (0==AV39TFManCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Manufacturador", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFManCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFManCod_To );
      }
      if ( ! ( (0==AV40TFTrnCod) && (0==AV41TFTrnCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod Transp", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFTrnCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFTrnCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFTrnNom_Sel, GXv_char5) ;
         trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFTrnNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFTrnNom, GXv_char5) ;
            trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44TFSalExtFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV44TFSalExtFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFSalExtHor_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFSalExtHor_Sel, GXv_char5) ;
         trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFSalExtHor)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFSalExtHor, GXv_char5) ;
            trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV61TFSalSts_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFSalSts_Sel, GXv_char5) ;
         trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFSalSts)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            trabajosexternosenviowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFSalSts, GXv_char5) ;
            trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("TrabajosExternosEnvioWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TrabajosExternosEnvioWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV67GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV69Trabajosexternosenviowwds_1_filterfulltext = AV18FilterFullText ;
      AV70Trabajosexternosenviowwds_2_tfsalextalb = AV34TFSalExtAlb ;
      AV71Trabajosexternosenviowwds_3_tfsalextalb_to = AV35TFSalExtAlb_To ;
      AV72Trabajosexternosenviowwds_4_tfmannom = AV36TFManNom ;
      AV73Trabajosexternosenviowwds_5_tfmannom_sel = AV37TFManNom_Sel ;
      AV74Trabajosexternosenviowwds_6_tfmancod = AV38TFManCod ;
      AV75Trabajosexternosenviowwds_7_tfmancod_to = AV39TFManCod_To ;
      AV76Trabajosexternosenviowwds_8_tftrncod = AV40TFTrnCod ;
      AV77Trabajosexternosenviowwds_9_tftrncod_to = AV41TFTrnCod_To ;
      AV78Trabajosexternosenviowwds_10_tftrnnom = AV42TFTrnNom ;
      AV79Trabajosexternosenviowwds_11_tftrnnom_sel = AV43TFTrnNom_Sel ;
      AV80Trabajosexternosenviowwds_12_tfsalextfec = AV44TFSalExtFec ;
      AV81Trabajosexternosenviowwds_13_tfsalexthor = AV46TFSalExtHor ;
      AV82Trabajosexternosenviowwds_14_tfsalexthor_sel = AV47TFSalExtHor_Sel ;
      AV83Trabajosexternosenviowwds_15_tfsalsts = AV64TFSalSts ;
      AV84Trabajosexternosenviowwds_16_tfsalsts_sel = AV61TFSalSts_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Trabajosexternosenviowwds_1_filterfulltext ,
                                           Integer.valueOf(AV70Trabajosexternosenviowwds_2_tfsalextalb) ,
                                           Integer.valueOf(AV71Trabajosexternosenviowwds_3_tfsalextalb_to) ,
                                           AV73Trabajosexternosenviowwds_5_tfmannom_sel ,
                                           AV72Trabajosexternosenviowwds_4_tfmannom ,
                                           Short.valueOf(AV74Trabajosexternosenviowwds_6_tfmancod) ,
                                           Short.valueOf(AV75Trabajosexternosenviowwds_7_tfmancod_to) ,
                                           Short.valueOf(AV76Trabajosexternosenviowwds_8_tftrncod) ,
                                           Short.valueOf(AV77Trabajosexternosenviowwds_9_tftrncod_to) ,
                                           AV79Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                           AV78Trabajosexternosenviowwds_10_tftrnnom ,
                                           AV80Trabajosexternosenviowwds_12_tfsalextfec ,
                                           AV82Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                           AV81Trabajosexternosenviowwds_13_tfsalexthor ,
                                           AV84Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                           AV83Trabajosexternosenviowwds_15_tfsalsts ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           A2249ManNom ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A6396SalExtHor ,
                                           A10080SalSts ,
                                           A2256SalExtFec ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV69Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV69Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV69Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV69Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV69Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV69Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV69Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV72Trabajosexternosenviowwds_4_tfmannom = GXutil.padr( GXutil.rtrim( AV72Trabajosexternosenviowwds_4_tfmannom), 30, "%") ;
      lV78Trabajosexternosenviowwds_10_tftrnnom = GXutil.padr( GXutil.rtrim( AV78Trabajosexternosenviowwds_10_tftrnnom), 30, "%") ;
      lV81Trabajosexternosenviowwds_13_tfsalexthor = GXutil.padr( GXutil.rtrim( AV81Trabajosexternosenviowwds_13_tfsalexthor), 8, "%") ;
      lV83Trabajosexternosenviowwds_15_tfsalsts = GXutil.padr( GXutil.rtrim( AV83Trabajosexternosenviowwds_15_tfsalsts), 1, "%") ;
      /* Using cursor P09152 */
      pr_default.execute(0, new Object[] {lV69Trabajosexternosenviowwds_1_filterfulltext, lV69Trabajosexternosenviowwds_1_filterfulltext, lV69Trabajosexternosenviowwds_1_filterfulltext, lV69Trabajosexternosenviowwds_1_filterfulltext, lV69Trabajosexternosenviowwds_1_filterfulltext, lV69Trabajosexternosenviowwds_1_filterfulltext, lV69Trabajosexternosenviowwds_1_filterfulltext, Integer.valueOf(AV70Trabajosexternosenviowwds_2_tfsalextalb), Integer.valueOf(AV71Trabajosexternosenviowwds_3_tfsalextalb_to), lV72Trabajosexternosenviowwds_4_tfmannom, AV73Trabajosexternosenviowwds_5_tfmannom_sel, Short.valueOf(AV74Trabajosexternosenviowwds_6_tfmancod), Short.valueOf(AV75Trabajosexternosenviowwds_7_tfmancod_to), Short.valueOf(AV76Trabajosexternosenviowwds_8_tftrncod), Short.valueOf(AV77Trabajosexternosenviowwds_9_tftrncod_to), lV78Trabajosexternosenviowwds_10_tftrnnom, AV79Trabajosexternosenviowwds_11_tftrnnom_sel, AV80Trabajosexternosenviowwds_12_tfsalextfec, lV81Trabajosexternosenviowwds_13_tfsalexthor, AV82Trabajosexternosenviowwds_14_tfsalexthor_sel, lV83Trabajosexternosenviowwds_15_tfsalsts, AV84Trabajosexternosenviowwds_16_tfsalsts_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09152_A396EmprCod[0] ;
         A10080SalSts = P09152_A10080SalSts[0] ;
         A6396SalExtHor = P09152_A6396SalExtHor[0] ;
         A2256SalExtFec = P09152_A2256SalExtFec[0] ;
         A841TrnNom = P09152_A841TrnNom[0] ;
         n841TrnNom = P09152_n841TrnNom[0] ;
         A840TrnCod = P09152_A840TrnCod[0] ;
         n840TrnCod = P09152_n840TrnCod[0] ;
         A2248ManCod = P09152_A2248ManCod[0] ;
         A2249ManNom = P09152_A2249ManNom[0] ;
         n2249ManNom = P09152_n2249ManNom[0] ;
         A2253SalExtAlb = P09152_A2253SalExtAlb[0] ;
         A841TrnNom = P09152_A841TrnNom[0] ;
         n841TrnNom = P09152_n841TrnNom[0] ;
         A2249ManNom = P09152_A2249ManNom[0] ;
         n2249ManNom = P09152_n2249ManNom[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2253SalExtAlb );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2249ManNom, GXv_char5) ;
            trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2248ManCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A840TrnCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A841TrnNom, GXv_char5) ;
            trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A2256SalExtFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6396SalExtHor, GXv_char5) ;
            trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10080SalSts, GXv_char5) ;
            trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "SalExtAlb", "", "Nº Documento", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ManNom", "", "Manufacturador", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ManCod", "", "Codigo Manufacturador", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnCod", "", "Cod Transp", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnNom", "", "Transportista", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "SalExtFec", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "SalExtHor", "", "Hora", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "SalSts", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TrabajosExternosEnvioWWColumnsSelector", GXv_char5) ;
      trabajosexternosenviowwexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("TrabajosExternosEnvioWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternosEnvioWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TrabajosExternosEnvioWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV85GXV2 = 1 ;
      while ( AV85GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTALB") == 0 )
         {
            AV34TFSalExtAlb = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFSalExtAlb_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM") == 0 )
         {
            AV36TFManNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM_SEL") == 0 )
         {
            AV37TFManNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCOD") == 0 )
         {
            AV38TFManCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFManCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV40TFTrnCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFTrnCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV42TFTrnNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV43TFTrnNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTFEC") == 0 )
         {
            AV44TFSalExtFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTHOR") == 0 )
         {
            AV46TFSalExtHor = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTHOR_SEL") == 0 )
         {
            AV47TFSalExtHor_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS") == 0 )
         {
            AV64TFSalSts = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS_SEL") == 0 )
         {
            AV61TFSalSts_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV85GXV2 = (int)(AV85GXV2+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = trabajosexternosenviowwexport.this.AV11Filename;
      this.aP1[0] = trabajosexternosenviowwexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV18FilterFullText = "" ;
      AV37TFManNom_Sel = "" ;
      AV36TFManNom = "" ;
      AV43TFTrnNom_Sel = "" ;
      AV42TFTrnNom = "" ;
      AV44TFSalExtFec = GXutil.nullDate() ;
      AV47TFSalExtHor_Sel = "" ;
      AV46TFSalExtHor = "" ;
      AV61TFSalSts_Sel = "" ;
      AV64TFSalSts = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A2249ManNom = "" ;
      A841TrnNom = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A6396SalExtHor = "" ;
      A10080SalSts = "" ;
      AV69Trabajosexternosenviowwds_1_filterfulltext = "" ;
      AV72Trabajosexternosenviowwds_4_tfmannom = "" ;
      AV73Trabajosexternosenviowwds_5_tfmannom_sel = "" ;
      AV78Trabajosexternosenviowwds_10_tftrnnom = "" ;
      AV79Trabajosexternosenviowwds_11_tftrnnom_sel = "" ;
      AV80Trabajosexternosenviowwds_12_tfsalextfec = GXutil.nullDate() ;
      AV81Trabajosexternosenviowwds_13_tfsalexthor = "" ;
      AV82Trabajosexternosenviowwds_14_tfsalexthor_sel = "" ;
      AV83Trabajosexternosenviowwds_15_tfsalsts = "" ;
      AV84Trabajosexternosenviowwds_16_tfsalsts_sel = "" ;
      scmdbuf = "" ;
      lV69Trabajosexternosenviowwds_1_filterfulltext = "" ;
      lV72Trabajosexternosenviowwds_4_tfmannom = "" ;
      lV78Trabajosexternosenviowwds_10_tftrnnom = "" ;
      lV81Trabajosexternosenviowwds_13_tfsalexthor = "" ;
      lV83Trabajosexternosenviowwds_15_tfsalsts = "" ;
      P09152_A396EmprCod = new String[] {""} ;
      P09152_A10080SalSts = new String[] {""} ;
      P09152_A6396SalExtHor = new String[] {""} ;
      P09152_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09152_A841TrnNom = new String[] {""} ;
      P09152_n841TrnNom = new boolean[] {false} ;
      P09152_A840TrnCod = new short[1] ;
      P09152_n840TrnCod = new boolean[] {false} ;
      P09152_A2248ManCod = new short[1] ;
      P09152_A2249ManNom = new String[] {""} ;
      P09152_n2249ManNom = new boolean[] {false} ;
      P09152_A2253SalExtAlb = new int[1] ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenviowwexport__default(),
         new Object[] {
             new Object[] {
            P09152_A396EmprCod, P09152_A10080SalSts, P09152_A6396SalExtHor, P09152_A2256SalExtFec, P09152_A841TrnNom, P09152_n841TrnNom, P09152_A840TrnCod, P09152_n840TrnCod, P09152_A2248ManCod, P09152_A2249ManNom,
            P09152_n2249ManNom, P09152_A2253SalExtAlb
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV38TFManCod ;
   private short AV39TFManCod_To ;
   private short AV40TFTrnCod ;
   private short AV41TFTrnCod_To ;
   private short GXv_int3[] ;
   private short A2248ManCod ;
   private short A840TrnCod ;
   private short AV74Trabajosexternosenviowwds_6_tfmancod ;
   private short AV75Trabajosexternosenviowwds_7_tfmancod_to ;
   private short AV76Trabajosexternosenviowwds_8_tftrncod ;
   private short AV77Trabajosexternosenviowwds_9_tftrncod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFSalExtAlb ;
   private int AV35TFSalExtAlb_To ;
   private int AV67GXV1 ;
   private int A2253SalExtAlb ;
   private int AV70Trabajosexternosenviowwds_2_tfsalextalb ;
   private int AV71Trabajosexternosenviowwds_3_tfsalextalb_to ;
   private int AV85GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV37TFManNom_Sel ;
   private String AV36TFManNom ;
   private String AV43TFTrnNom_Sel ;
   private String AV42TFTrnNom ;
   private String AV47TFSalExtHor_Sel ;
   private String AV46TFSalExtHor ;
   private String AV61TFSalSts_Sel ;
   private String AV64TFSalSts ;
   private String A2249ManNom ;
   private String A841TrnNom ;
   private String A6396SalExtHor ;
   private String A10080SalSts ;
   private String AV72Trabajosexternosenviowwds_4_tfmannom ;
   private String AV73Trabajosexternosenviowwds_5_tfmannom_sel ;
   private String AV78Trabajosexternosenviowwds_10_tftrnnom ;
   private String AV79Trabajosexternosenviowwds_11_tftrnnom_sel ;
   private String AV81Trabajosexternosenviowwds_13_tfsalexthor ;
   private String AV82Trabajosexternosenviowwds_14_tfsalexthor_sel ;
   private String AV83Trabajosexternosenviowwds_15_tfsalsts ;
   private String AV84Trabajosexternosenviowwds_16_tfsalsts_sel ;
   private String scmdbuf ;
   private String lV72Trabajosexternosenviowwds_4_tfmannom ;
   private String lV78Trabajosexternosenviowwds_10_tftrnnom ;
   private String lV81Trabajosexternosenviowwds_13_tfsalexthor ;
   private String lV83Trabajosexternosenviowwds_15_tfsalsts ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV44TFSalExtFec ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date AV80Trabajosexternosenviowwds_12_tfsalextfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n2249ManNom ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV69Trabajosexternosenviowwds_1_filterfulltext ;
   private String lV69Trabajosexternosenviowwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09152_A396EmprCod ;
   private String[] P09152_A10080SalSts ;
   private String[] P09152_A6396SalExtHor ;
   private java.util.Date[] P09152_A2256SalExtFec ;
   private String[] P09152_A841TrnNom ;
   private boolean[] P09152_n841TrnNom ;
   private short[] P09152_A840TrnCod ;
   private boolean[] P09152_n840TrnCod ;
   private short[] P09152_A2248ManCod ;
   private String[] P09152_A2249ManNom ;
   private boolean[] P09152_n2249ManNom ;
   private int[] P09152_A2253SalExtAlb ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class trabajosexternosenviowwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09152( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Trabajosexternosenviowwds_1_filterfulltext ,
                                          int AV70Trabajosexternosenviowwds_2_tfsalextalb ,
                                          int AV71Trabajosexternosenviowwds_3_tfsalextalb_to ,
                                          String AV73Trabajosexternosenviowwds_5_tfmannom_sel ,
                                          String AV72Trabajosexternosenviowwds_4_tfmannom ,
                                          short AV74Trabajosexternosenviowwds_6_tfmancod ,
                                          short AV75Trabajosexternosenviowwds_7_tfmancod_to ,
                                          short AV76Trabajosexternosenviowwds_8_tftrncod ,
                                          short AV77Trabajosexternosenviowwds_9_tftrncod_to ,
                                          String AV79Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                          String AV78Trabajosexternosenviowwds_10_tftrnnom ,
                                          java.util.Date AV80Trabajosexternosenviowwds_12_tfsalextfec ,
                                          String AV82Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                          String AV81Trabajosexternosenviowwds_13_tfsalexthor ,
                                          String AV84Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                          String AV83Trabajosexternosenviowwds_15_tfsalsts ,
                                          int A2253SalExtAlb ,
                                          String A2249ManNom ,
                                          short A2248ManCod ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A6396SalExtHor ,
                                          String A10080SalSts ,
                                          java.util.Date A2256SalExtFec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[22];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalSts, T1.SalExtHor, T1.SalExtFec, T2.TrnNom, T1.TrnCod, T1.ManCod, T3.ManNom, T1.SalExtAlb FROM ((TXPCEXTSA T1 LEFT JOIN TXPTRANSP T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = T1.EmprCod AND T3.ManCod = T1.ManCod)" ;
      if ( ! (GXutil.strcmp("", AV69Trabajosexternosenviowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.SalExtAlb,'99999990'), 2) like '%' || ?) or ( UPPER(T3.ManNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.SalExtHor) like '%' || UPPER(?)) or ( UPPER(T1.SalSts) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV70Trabajosexternosenviowwds_2_tfsalextalb) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajosexternosenviowwds_3_tfsalextalb_to) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Trabajosexternosenviowwds_5_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV72Trabajosexternosenviowwds_4_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Trabajosexternosenviowwds_5_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ManNom = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternosenviowwds_6_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternosenviowwds_7_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV76Trabajosexternosenviowwds_8_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajosexternosenviowwds_9_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Trabajosexternosenviowwds_11_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Trabajosexternosenviowwds_10_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Trabajosexternosenviowwds_11_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Trabajosexternosenviowwds_12_tfsalextfec)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) && ( ! (GXutil.strcmp("", AV81Trabajosexternosenviowwds_13_tfsalexthor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExtHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExtHor = ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajosexternosenviowwds_16_tfsalsts_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajosexternosenviowwds_15_tfsalsts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajosexternosenviowwds_16_tfsalsts_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalSts = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalExtAlb" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalExtAlb DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ManNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ManNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalExtFec" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalExtFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalExtHor" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalExtHor DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalSts" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalSts DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P09152(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09152", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
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
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
      }
   }

}

