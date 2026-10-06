package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class nwdpalmacentejidowwexport extends GXProcedure
{
   public nwdpalmacentejidowwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpalmacentejidowwexport.class ), "" );
   }

   public nwdpalmacentejidowwexport( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      nwdpalmacentejidowwexport.this.aP1 = new String[] {""};
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
      nwdpalmacentejidowwexport.this.aP0 = aP0;
      nwdpalmacentejidowwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "NwDPAlmacenTejidoWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54FilterFullText, GXv_char5) ;
      nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV34TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFEmprCod_Sel, GXv_char5) ;
         nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV33TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV33TFEmprCod, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV35TFDisCod) && (0==AV36TFDisCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Disposicion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFDisCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFDisCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV38TFDisDes_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Desglose", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( GXutil.strcmp(AV38TFDisDes_Sel, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( GXutil.strcmp(AV38TFDisDes_Sel, httpContext.getMessage( "N", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      if ( ! ( (0==AV39TFCliCod) && (0==AV40TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV39TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV40TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV42TFDisArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFDisArtCod_Sel, GXv_char5) ;
         nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFDisArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFDisArtCod, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV43TFDisTotRec) && (0==AV44TFDisTotRec_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Recepciones", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFDisTotRec );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFDisTotRec_To );
      }
      if ( ! ( (GXutil.strcmp("", AV46TFDisUniMed_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades Medida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFDisUniMed_Sel, GXv_char5) ;
         nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFDisUniMed)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades Medida", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFDisUniMed, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV48TFDisLoc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFDisLoc_Sel, GXv_char5) ;
         nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFDisLoc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFDisLoc, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFDisCliNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Disposicion Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFDisCliNum_Sel, GXv_char5) ;
         nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFDisCliNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Disposicion Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFDisCliNum, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV51TFDisCanRec) && (0==AV52TFDisCanRec_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reclamaciones", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFDisCanRec );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         nwdpalmacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFDisCanRec_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("NwDPAlmacenTejidoWWColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("NwDPAlmacenTejidoWWColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV57GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Nwdpalmacentejidowwds_1_filterfulltext = AV54FilterFullText ;
      AV60Nwdpalmacentejidowwds_2_tfemprcod = AV33TFEmprCod ;
      AV61Nwdpalmacentejidowwds_3_tfemprcod_sel = AV34TFEmprCod_Sel ;
      AV62Nwdpalmacentejidowwds_4_tfdiscod = AV35TFDisCod ;
      AV63Nwdpalmacentejidowwds_5_tfdiscod_to = AV36TFDisCod_To ;
      AV64Nwdpalmacentejidowwds_6_tfdisdes_sel = AV38TFDisDes_Sel ;
      AV65Nwdpalmacentejidowwds_7_tfclicod = AV39TFCliCod ;
      AV66Nwdpalmacentejidowwds_8_tfclicod_to = AV40TFCliCod_To ;
      AV67Nwdpalmacentejidowwds_9_tfdisartcod = AV41TFDisArtCod ;
      AV68Nwdpalmacentejidowwds_10_tfdisartcod_sel = AV42TFDisArtCod_Sel ;
      AV69Nwdpalmacentejidowwds_11_tfdistotrec = AV43TFDisTotRec ;
      AV70Nwdpalmacentejidowwds_12_tfdistotrec_to = AV44TFDisTotRec_To ;
      AV71Nwdpalmacentejidowwds_13_tfdisunimed = AV45TFDisUniMed ;
      AV72Nwdpalmacentejidowwds_14_tfdisunimed_sel = AV46TFDisUniMed_Sel ;
      AV73Nwdpalmacentejidowwds_15_tfdisloc = AV47TFDisLoc ;
      AV74Nwdpalmacentejidowwds_16_tfdisloc_sel = AV48TFDisLoc_Sel ;
      AV75Nwdpalmacentejidowwds_17_tfdisclinum = AV49TFDisCliNum ;
      AV76Nwdpalmacentejidowwds_18_tfdisclinum_sel = AV50TFDisCliNum_Sel ;
      AV77Nwdpalmacentejidowwds_19_tfdiscanrec = AV51TFDisCanRec ;
      AV78Nwdpalmacentejidowwds_20_tfdiscanrec_to = AV52TFDisCanRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                           AV60Nwdpalmacentejidowwds_2_tfemprcod ,
                                           Integer.valueOf(AV62Nwdpalmacentejidowwds_4_tfdiscod) ,
                                           Integer.valueOf(AV63Nwdpalmacentejidowwds_5_tfdiscod_to) ,
                                           AV64Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                           Integer.valueOf(AV65Nwdpalmacentejidowwds_7_tfclicod) ,
                                           Integer.valueOf(AV66Nwdpalmacentejidowwds_8_tfclicod_to) ,
                                           AV68Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                           AV67Nwdpalmacentejidowwds_9_tfdisartcod ,
                                           Integer.valueOf(AV69Nwdpalmacentejidowwds_11_tfdistotrec) ,
                                           Integer.valueOf(AV70Nwdpalmacentejidowwds_12_tfdistotrec_to) ,
                                           AV72Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                           AV71Nwdpalmacentejidowwds_13_tfdisunimed ,
                                           AV74Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                           AV73Nwdpalmacentejidowwds_15_tfdisloc ,
                                           AV76Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                           AV75Nwdpalmacentejidowwds_17_tfdisclinum ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           A365DisDes ,
                                           Integer.valueOf(A252CliCod) ,
                                           A335DisArtCod ,
                                           Integer.valueOf(A13733DisTotRec) ,
                                           A392DisUniMed ,
                                           A1430DisLoc ,
                                           A360DisCliNum ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV59Nwdpalmacentejidowwds_1_filterfulltext ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV77Nwdpalmacentejidowwds_19_tfdiscanrec) ,
                                           Short.valueOf(AV78Nwdpalmacentejidowwds_20_tfdiscanrec_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV59Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV59Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV59Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV59Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV59Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV59Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV59Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV59Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV59Nwdpalmacentejidowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Nwdpalmacentejidowwds_1_filterfulltext), "%", "") ;
      lV60Nwdpalmacentejidowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV60Nwdpalmacentejidowwds_2_tfemprcod), 3, "%") ;
      lV67Nwdpalmacentejidowwds_9_tfdisartcod = GXutil.padr( GXutil.rtrim( AV67Nwdpalmacentejidowwds_9_tfdisartcod), 16, "%") ;
      lV71Nwdpalmacentejidowwds_13_tfdisunimed = GXutil.padr( GXutil.rtrim( AV71Nwdpalmacentejidowwds_13_tfdisunimed), 1, "%") ;
      lV73Nwdpalmacentejidowwds_15_tfdisloc = GXutil.padr( GXutil.rtrim( AV73Nwdpalmacentejidowwds_15_tfdisloc), 10, "%") ;
      lV75Nwdpalmacentejidowwds_17_tfdisclinum = GXutil.padr( GXutil.rtrim( AV75Nwdpalmacentejidowwds_17_tfdisclinum), 8, "%") ;
      /* Using cursor P08E34 */
      pr_default.execute(0, new Object[] {AV59Nwdpalmacentejidowwds_1_filterfulltext, lV59Nwdpalmacentejidowwds_1_filterfulltext, lV59Nwdpalmacentejidowwds_1_filterfulltext, lV59Nwdpalmacentejidowwds_1_filterfulltext, lV59Nwdpalmacentejidowwds_1_filterfulltext, lV59Nwdpalmacentejidowwds_1_filterfulltext, lV59Nwdpalmacentejidowwds_1_filterfulltext, lV59Nwdpalmacentejidowwds_1_filterfulltext, lV59Nwdpalmacentejidowwds_1_filterfulltext, lV59Nwdpalmacentejidowwds_1_filterfulltext, Short.valueOf(AV77Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV77Nwdpalmacentejidowwds_19_tfdiscanrec), Short.valueOf(AV78Nwdpalmacentejidowwds_20_tfdiscanrec_to), Short.valueOf(AV78Nwdpalmacentejidowwds_20_tfdiscanrec_to), lV60Nwdpalmacentejidowwds_2_tfemprcod, AV61Nwdpalmacentejidowwds_3_tfemprcod_sel, Integer.valueOf(AV62Nwdpalmacentejidowwds_4_tfdiscod), Integer.valueOf(AV63Nwdpalmacentejidowwds_5_tfdiscod_to), AV64Nwdpalmacentejidowwds_6_tfdisdes_sel, Integer.valueOf(AV65Nwdpalmacentejidowwds_7_tfclicod), Integer.valueOf(AV66Nwdpalmacentejidowwds_8_tfclicod_to), lV67Nwdpalmacentejidowwds_9_tfdisartcod, AV68Nwdpalmacentejidowwds_10_tfdisartcod_sel, Integer.valueOf(AV69Nwdpalmacentejidowwds_11_tfdistotrec), Integer.valueOf(AV70Nwdpalmacentejidowwds_12_tfdistotrec_to), lV71Nwdpalmacentejidowwds_13_tfdisunimed, AV72Nwdpalmacentejidowwds_14_tfdisunimed_sel, lV73Nwdpalmacentejidowwds_15_tfdisloc, AV74Nwdpalmacentejidowwds_16_tfdisloc_sel, lV75Nwdpalmacentejidowwds_17_tfdisclinum, AV76Nwdpalmacentejidowwds_18_tfdisclinum_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A360DisCliNum = P08E34_A360DisCliNum[0] ;
         A1430DisLoc = P08E34_A1430DisLoc[0] ;
         A392DisUniMed = P08E34_A392DisUniMed[0] ;
         A335DisArtCod = P08E34_A335DisArtCod[0] ;
         A252CliCod = P08E34_A252CliCod[0] ;
         A365DisDes = P08E34_A365DisDes[0] ;
         A361DisCod = P08E34_A361DisCod[0] ;
         A396EmprCod = P08E34_A396EmprCod[0] ;
         A13732DisCanRec = P08E34_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E34_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E34_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E34_n13733DisTotRec[0] ;
         A13732DisCanRec = P08E34_A13732DisCanRec[0] ;
         n13732DisCanRec = P08E34_n13732DisCanRec[0] ;
         A13733DisTotRec = P08E34_A13733DisTotRec[0] ;
         n13733DisTotRec = P08E34_n13733DisTotRec[0] ;
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
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A361DisCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A365DisDes, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A335DisArtCod, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A13733DisTotRec );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A392DisUniMed, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1430DisLoc, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A360DisCliNum, GXv_char5) ;
            nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A13732DisCanRec );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
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
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprCod", "", "Código Empresa", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisCod", "", "Codigo Disposicion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisDes", "", "Desglose", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisArtCod", "", "Código Artículo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisTotRec", "", "Recepciones", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisUniMed", "", "Unidades Medida", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisLoc", "", "Localizacion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisCliNum", "", "Codigo Disposicion Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisCanRec", "", "Reclamaciones", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "NwDPAlmacenTejidoWWColumnsSelector", GXv_char5) ;
      nwdpalmacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("NwDPAlmacenTejidoWWGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "NwDPAlmacenTejidoWWGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("NwDPAlmacenTejidoWWGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV79GXV2 = 1 ;
      while ( AV79GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV33TFEmprCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV34TFEmprCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV35TFDisCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFDisCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISDES_SEL") == 0 )
         {
            AV38TFDisDes_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV39TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV41TFDisArtCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV42TFDisArtCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTOTREC") == 0 )
         {
            AV43TFDisTotRec = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFDisTotRec_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV45TFDisUniMed = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV46TFDisUniMed_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC") == 0 )
         {
            AV47TFDisLoc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISLOC_SEL") == 0 )
         {
            AV48TFDisLoc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV49TFDisCliNum = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV50TFDisCliNum_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV51TFDisCanRec = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFDisCanRec_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV79GXV2 = (int)(AV79GXV2+1) ;
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
      this.aP0[0] = nwdpalmacentejidowwexport.this.AV11Filename;
      this.aP1[0] = nwdpalmacentejidowwexport.this.AV12ErrorMessage;
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
      AV54FilterFullText = "" ;
      AV34TFEmprCod_Sel = "" ;
      AV33TFEmprCod = "" ;
      AV38TFDisDes_Sel = "" ;
      AV42TFDisArtCod_Sel = "" ;
      AV41TFDisArtCod = "" ;
      AV46TFDisUniMed_Sel = "" ;
      AV45TFDisUniMed = "" ;
      AV48TFDisLoc_Sel = "" ;
      AV47TFDisLoc = "" ;
      AV50TFDisCliNum_Sel = "" ;
      AV49TFDisCliNum = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A365DisDes = "" ;
      A335DisArtCod = "" ;
      A392DisUniMed = "" ;
      A1430DisLoc = "" ;
      A360DisCliNum = "" ;
      AV59Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      AV60Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      AV61Nwdpalmacentejidowwds_3_tfemprcod_sel = "" ;
      AV64Nwdpalmacentejidowwds_6_tfdisdes_sel = "" ;
      AV67Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      AV68Nwdpalmacentejidowwds_10_tfdisartcod_sel = "" ;
      AV71Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      AV72Nwdpalmacentejidowwds_14_tfdisunimed_sel = "" ;
      AV73Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      AV74Nwdpalmacentejidowwds_16_tfdisloc_sel = "" ;
      AV75Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      AV76Nwdpalmacentejidowwds_18_tfdisclinum_sel = "" ;
      lV59Nwdpalmacentejidowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV60Nwdpalmacentejidowwds_2_tfemprcod = "" ;
      lV67Nwdpalmacentejidowwds_9_tfdisartcod = "" ;
      lV71Nwdpalmacentejidowwds_13_tfdisunimed = "" ;
      lV73Nwdpalmacentejidowwds_15_tfdisloc = "" ;
      lV75Nwdpalmacentejidowwds_17_tfdisclinum = "" ;
      P08E34_A360DisCliNum = new String[] {""} ;
      P08E34_A1430DisLoc = new String[] {""} ;
      P08E34_A392DisUniMed = new String[] {""} ;
      P08E34_A335DisArtCod = new String[] {""} ;
      P08E34_A252CliCod = new int[1] ;
      P08E34_A365DisDes = new String[] {""} ;
      P08E34_A361DisCod = new int[1] ;
      P08E34_A396EmprCod = new String[] {""} ;
      P08E34_A13732DisCanRec = new short[1] ;
      P08E34_n13732DisCanRec = new boolean[] {false} ;
      P08E34_A13733DisTotRec = new int[1] ;
      P08E34_n13733DisTotRec = new boolean[] {false} ;
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejidowwexport__default(),
         new Object[] {
             new Object[] {
            P08E34_A360DisCliNum, P08E34_A1430DisLoc, P08E34_A392DisUniMed, P08E34_A335DisArtCod, P08E34_A252CliCod, P08E34_A365DisDes, P08E34_A361DisCod, P08E34_A396EmprCod, P08E34_A13732DisCanRec, P08E34_n13732DisCanRec,
            P08E34_A13733DisTotRec, P08E34_n13733DisTotRec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV51TFDisCanRec ;
   private short AV52TFDisCanRec_To ;
   private short GXv_int3[] ;
   private short A13732DisCanRec ;
   private short AV77Nwdpalmacentejidowwds_19_tfdiscanrec ;
   private short AV78Nwdpalmacentejidowwds_20_tfdiscanrec_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV35TFDisCod ;
   private int AV36TFDisCod_To ;
   private int AV39TFCliCod ;
   private int AV40TFCliCod_To ;
   private int AV43TFDisTotRec ;
   private int AV44TFDisTotRec_To ;
   private int AV57GXV1 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A13733DisTotRec ;
   private int AV62Nwdpalmacentejidowwds_4_tfdiscod ;
   private int AV63Nwdpalmacentejidowwds_5_tfdiscod_to ;
   private int AV65Nwdpalmacentejidowwds_7_tfclicod ;
   private int AV66Nwdpalmacentejidowwds_8_tfclicod_to ;
   private int AV69Nwdpalmacentejidowwds_11_tfdistotrec ;
   private int AV70Nwdpalmacentejidowwds_12_tfdistotrec_to ;
   private int AV79GXV2 ;
   private long AV30VisibleColumnCount ;
   private String AV34TFEmprCod_Sel ;
   private String AV33TFEmprCod ;
   private String AV38TFDisDes_Sel ;
   private String AV42TFDisArtCod_Sel ;
   private String AV41TFDisArtCod ;
   private String AV46TFDisUniMed_Sel ;
   private String AV45TFDisUniMed ;
   private String AV48TFDisLoc_Sel ;
   private String AV47TFDisLoc ;
   private String AV50TFDisCliNum_Sel ;
   private String AV49TFDisCliNum ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String A335DisArtCod ;
   private String A392DisUniMed ;
   private String A1430DisLoc ;
   private String A360DisCliNum ;
   private String AV60Nwdpalmacentejidowwds_2_tfemprcod ;
   private String AV61Nwdpalmacentejidowwds_3_tfemprcod_sel ;
   private String AV64Nwdpalmacentejidowwds_6_tfdisdes_sel ;
   private String AV67Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String AV68Nwdpalmacentejidowwds_10_tfdisartcod_sel ;
   private String AV71Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String AV72Nwdpalmacentejidowwds_14_tfdisunimed_sel ;
   private String AV73Nwdpalmacentejidowwds_15_tfdisloc ;
   private String AV74Nwdpalmacentejidowwds_16_tfdisloc_sel ;
   private String AV75Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String AV76Nwdpalmacentejidowwds_18_tfdisclinum_sel ;
   private String scmdbuf ;
   private String lV60Nwdpalmacentejidowwds_2_tfemprcod ;
   private String lV67Nwdpalmacentejidowwds_9_tfdisartcod ;
   private String lV71Nwdpalmacentejidowwds_13_tfdisunimed ;
   private String lV73Nwdpalmacentejidowwds_15_tfdisloc ;
   private String lV75Nwdpalmacentejidowwds_17_tfdisclinum ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13732DisCanRec ;
   private boolean n13733DisTotRec ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV54FilterFullText ;
   private String AV59Nwdpalmacentejidowwds_1_filterfulltext ;
   private String lV59Nwdpalmacentejidowwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08E34_A360DisCliNum ;
   private String[] P08E34_A1430DisLoc ;
   private String[] P08E34_A392DisUniMed ;
   private String[] P08E34_A335DisArtCod ;
   private int[] P08E34_A252CliCod ;
   private String[] P08E34_A365DisDes ;
   private int[] P08E34_A361DisCod ;
   private String[] P08E34_A396EmprCod ;
   private short[] P08E34_A13732DisCanRec ;
   private boolean[] P08E34_n13732DisCanRec ;
   private int[] P08E34_A13733DisTotRec ;
   private boolean[] P08E34_n13733DisTotRec ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class nwdpalmacentejidowwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08E34( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Nwdpalmacentejidowwds_3_tfemprcod_sel ,
                                          String AV60Nwdpalmacentejidowwds_2_tfemprcod ,
                                          int AV62Nwdpalmacentejidowwds_4_tfdiscod ,
                                          int AV63Nwdpalmacentejidowwds_5_tfdiscod_to ,
                                          String AV64Nwdpalmacentejidowwds_6_tfdisdes_sel ,
                                          int AV65Nwdpalmacentejidowwds_7_tfclicod ,
                                          int AV66Nwdpalmacentejidowwds_8_tfclicod_to ,
                                          String AV68Nwdpalmacentejidowwds_10_tfdisartcod_sel ,
                                          String AV67Nwdpalmacentejidowwds_9_tfdisartcod ,
                                          int AV69Nwdpalmacentejidowwds_11_tfdistotrec ,
                                          int AV70Nwdpalmacentejidowwds_12_tfdistotrec_to ,
                                          String AV72Nwdpalmacentejidowwds_14_tfdisunimed_sel ,
                                          String AV71Nwdpalmacentejidowwds_13_tfdisunimed ,
                                          String AV74Nwdpalmacentejidowwds_16_tfdisloc_sel ,
                                          String AV73Nwdpalmacentejidowwds_15_tfdisloc ,
                                          String AV76Nwdpalmacentejidowwds_18_tfdisclinum_sel ,
                                          String AV75Nwdpalmacentejidowwds_17_tfdisclinum ,
                                          String A396EmprCod ,
                                          int A361DisCod ,
                                          String A365DisDes ,
                                          int A252CliCod ,
                                          String A335DisArtCod ,
                                          int A13733DisTotRec ,
                                          String A392DisUniMed ,
                                          String A1430DisLoc ,
                                          String A360DisCliNum ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV59Nwdpalmacentejidowwds_1_filterfulltext ,
                                          short A13732DisCanRec ,
                                          short AV77Nwdpalmacentejidowwds_19_tfdiscanrec ,
                                          short AV78Nwdpalmacentejidowwds_20_tfdiscanrec_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[31];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.DisCliNum, T1.DisLoc, T1.DisUniMed, T1.DisArtCod, T1.CliCod, T1.DisDes, T1.DisCod, T1.EmprCod, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisCanRec," ;
      scmdbuf += " 0) AS DisTotRec FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod" ;
      scmdbuf += " AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT" ;
      scmdbuf += " COUNT(*) AS DisCanRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisCanRec, 0),'99999990'), 2) like '%' || ?) or ( UPPER(T1.DisUniMed) like '%' || UPPER(?)) or ( UPPER(T1.DisLoc) like '%' || UPPER(?)) or ( UPPER(T1.DisCliNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      if ( (GXutil.strcmp("", AV61Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Nwdpalmacentejidowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Nwdpalmacentejidowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV62Nwdpalmacentejidowwds_4_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV63Nwdpalmacentejidowwds_5_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Nwdpalmacentejidowwds_6_tfdisdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisDes = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV65Nwdpalmacentejidowwds_7_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV66Nwdpalmacentejidowwds_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Nwdpalmacentejidowwds_9_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Nwdpalmacentejidowwds_10_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV69Nwdpalmacentejidowwds_11_tfdistotrec) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV70Nwdpalmacentejidowwds_12_tfdistotrec_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.DisCanRec, 0) <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV71Nwdpalmacentejidowwds_13_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Nwdpalmacentejidowwds_14_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) && ( ! (GXutil.strcmp("", AV73Nwdpalmacentejidowwds_15_tfdisloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Nwdpalmacentejidowwds_16_tfdisloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisLoc = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV75Nwdpalmacentejidowwds_17_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Nwdpalmacentejidowwds_18_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisDes" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisDes DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisLoc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisLoc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P08E34(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08E34", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               return;
      }
   }

}

