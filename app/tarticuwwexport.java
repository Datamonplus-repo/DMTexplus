package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticuwwexport extends GXProcedure
{
   public tarticuwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticuwwexport.class ), "" );
   }

   public tarticuwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tarticuwwexport.this.aP1 = new String[] {""};
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
      tarticuwwexport.this.aP0 = aP0;
      tarticuwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TARTICUWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV114FilterFullText, GXv_char5) ;
      tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV63TFCliCod) && (0==AV64TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV63TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV64TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV70TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFCliNom_Sel, GXv_char5) ;
         tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFCliNom, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV66TFArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFArtCod_Sel, GXv_char5) ;
         tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFArtCod, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV78TFArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFArtDsc_Sel, GXv_char5) ;
         tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFArtDsc, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV73TFTipArtCod) && (0==AV74TFTipArtCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV73TFTipArtCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV74TFTipArtCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV76TFTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFTipArtDsc_Sel, GXv_char5) ;
         tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV75TFTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFTipArtDsc, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV79TFArtPml) && (0==AV80TFArtPml_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pml", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV79TFArtPml );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV80TFArtPml_To );
      }
      if ( ! ( (0==AV115TFArtGraAca) && (0==AV116TFArtGraAca_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Grm2", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV115TFArtGraAca );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV116TFArtGraAca_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFArtRen)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFArtRen_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rdto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV91TFArtRen)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV92TFArtRen_To)) );
      }
      if ( ! ( (0==AV87TFArtAcaMin) && (0==AV88TFArtAcaMin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ancho Ac", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV87TFArtAcaMin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV88TFArtAcaMin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV120TFArtComer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo Comercial", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV120TFArtComer_Sel, GXv_char5) ;
         tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV119TFArtComer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo Comercial", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tarticuwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV119TFArtComer, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV60VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV48Session.getValue("TARTICUWWColumnsSelector"), "") != 0 )
      {
         AV55ColumnsSelectorXML = AV48Session.getValue("TARTICUWWColumnsSelector") ;
         AV52ColumnsSelector.fromxml(AV55ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV123GXV1 = 1 ;
      while ( AV123GXV1 <= AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV54ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV123GXV1));
         if ( AV54ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV54ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV54ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV54ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setColor( 11 );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         AV123GXV1 = (int)(AV123GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV125Tarticuwwds_1_filterfulltext = AV114FilterFullText ;
      AV126Tarticuwwds_2_tfclicod = AV63TFCliCod ;
      AV127Tarticuwwds_3_tfclicod_to = AV64TFCliCod_To ;
      AV128Tarticuwwds_4_tfclinom = AV69TFCliNom ;
      AV129Tarticuwwds_5_tfclinom_sel = AV70TFCliNom_Sel ;
      AV130Tarticuwwds_6_tfartcod = AV65TFArtCod ;
      AV131Tarticuwwds_7_tfartcod_sel = AV66TFArtCod_Sel ;
      AV132Tarticuwwds_8_tfartdsc = AV77TFArtDsc ;
      AV133Tarticuwwds_9_tfartdsc_sel = AV78TFArtDsc_Sel ;
      AV134Tarticuwwds_10_tftipartcod = AV73TFTipArtCod ;
      AV135Tarticuwwds_11_tftipartcod_to = AV74TFTipArtCod_To ;
      AV136Tarticuwwds_12_tftipartdsc = AV75TFTipArtDsc ;
      AV137Tarticuwwds_13_tftipartdsc_sel = AV76TFTipArtDsc_Sel ;
      AV138Tarticuwwds_14_tfartpml = AV79TFArtPml ;
      AV139Tarticuwwds_15_tfartpml_to = AV80TFArtPml_To ;
      AV140Tarticuwwds_16_tfartgraaca = AV115TFArtGraAca ;
      AV141Tarticuwwds_17_tfartgraaca_to = AV116TFArtGraAca_To ;
      AV142Tarticuwwds_18_tfartren = AV91TFArtRen ;
      AV143Tarticuwwds_19_tfartren_to = AV92TFArtRen_To ;
      AV144Tarticuwwds_20_tfartacamin = AV87TFArtAcaMin ;
      AV145Tarticuwwds_21_tfartacamin_to = AV88TFArtAcaMin_To ;
      AV146Tarticuwwds_22_tfartcomer = AV119TFArtComer ;
      AV147Tarticuwwds_23_tfartcomer_sel = AV120TFArtComer_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV125Tarticuwwds_1_filterfulltext ,
                                           Integer.valueOf(AV126Tarticuwwds_2_tfclicod) ,
                                           Integer.valueOf(AV127Tarticuwwds_3_tfclicod_to) ,
                                           AV129Tarticuwwds_5_tfclinom_sel ,
                                           AV128Tarticuwwds_4_tfclinom ,
                                           AV131Tarticuwwds_7_tfartcod_sel ,
                                           AV130Tarticuwwds_6_tfartcod ,
                                           AV133Tarticuwwds_9_tfartdsc_sel ,
                                           AV132Tarticuwwds_8_tfartdsc ,
                                           Short.valueOf(AV134Tarticuwwds_10_tftipartcod) ,
                                           Short.valueOf(AV135Tarticuwwds_11_tftipartcod_to) ,
                                           AV137Tarticuwwds_13_tftipartdsc_sel ,
                                           AV136Tarticuwwds_12_tftipartdsc ,
                                           Short.valueOf(AV138Tarticuwwds_14_tfartpml) ,
                                           Short.valueOf(AV139Tarticuwwds_15_tfartpml_to) ,
                                           Short.valueOf(AV140Tarticuwwds_16_tfartgraaca) ,
                                           Short.valueOf(AV141Tarticuwwds_17_tfartgraaca_to) ,
                                           AV142Tarticuwwds_18_tfartren ,
                                           AV143Tarticuwwds_19_tfartren_to ,
                                           Short.valueOf(AV144Tarticuwwds_20_tfartacamin) ,
                                           Short.valueOf(AV145Tarticuwwds_21_tfartacamin_to) ,
                                           AV147Tarticuwwds_23_tfartcomer_sel ,
                                           AV146Tarticuwwds_22_tfartcomer ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV125Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Tarticuwwds_1_filterfulltext), "%", "") ;
      lV128Tarticuwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV128Tarticuwwds_4_tfclinom), 30, "%") ;
      lV130Tarticuwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV130Tarticuwwds_6_tfartcod), 16, "%") ;
      lV132Tarticuwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV132Tarticuwwds_8_tfartdsc), 26, "%") ;
      lV136Tarticuwwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV136Tarticuwwds_12_tftipartdsc), 30, "%") ;
      lV146Tarticuwwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV146Tarticuwwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P08352 */
      pr_default.execute(0, new Object[] {lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, lV125Tarticuwwds_1_filterfulltext, Integer.valueOf(AV126Tarticuwwds_2_tfclicod), Integer.valueOf(AV127Tarticuwwds_3_tfclicod_to), lV128Tarticuwwds_4_tfclinom, AV129Tarticuwwds_5_tfclinom_sel, lV130Tarticuwwds_6_tfartcod, AV131Tarticuwwds_7_tfartcod_sel, lV132Tarticuwwds_8_tfartdsc, AV133Tarticuwwds_9_tfartdsc_sel, Short.valueOf(AV134Tarticuwwds_10_tftipartcod), Short.valueOf(AV135Tarticuwwds_11_tftipartcod_to), lV136Tarticuwwds_12_tftipartdsc, AV137Tarticuwwds_13_tftipartdsc_sel, Short.valueOf(AV138Tarticuwwds_14_tfartpml), Short.valueOf(AV139Tarticuwwds_15_tfartpml_to), Short.valueOf(AV140Tarticuwwds_16_tfartgraaca), Short.valueOf(AV141Tarticuwwds_17_tfartgraaca_to), AV142Tarticuwwds_18_tfartren, AV143Tarticuwwds_19_tfartren_to, Short.valueOf(AV144Tarticuwwds_20_tfartacamin), Short.valueOf(AV145Tarticuwwds_21_tfartacamin_to), lV146Tarticuwwds_22_tfartcomer, AV147Tarticuwwds_23_tfartcomer_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08352_A396EmprCod[0] ;
         A10045CliAct = P08352_A10045CliAct[0] ;
         A5741ArtComer = P08352_A5741ArtComer[0] ;
         n5741ArtComer = P08352_n5741ArtComer[0] ;
         A63ArtAcaMin = P08352_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P08352_n63ArtAcaMin[0] ;
         A95ArtRen = P08352_A95ArtRen[0] ;
         n95ArtRen = P08352_n95ArtRen[0] ;
         A1903ArtGraAca = P08352_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P08352_n1903ArtGraAca[0] ;
         A1148ArtPml = P08352_A1148ArtPml[0] ;
         n1148ArtPml = P08352_n1148ArtPml[0] ;
         A830TipArtDsc = P08352_A830TipArtDsc[0] ;
         n830TipArtDsc = P08352_n830TipArtDsc[0] ;
         A829TipArtCod = P08352_A829TipArtCod[0] ;
         A69ArtDsc = P08352_A69ArtDsc[0] ;
         n69ArtDsc = P08352_n69ArtDsc[0] ;
         A65ArtCod = P08352_A65ArtCod[0] ;
         A279CliNom = P08352_A279CliNom[0] ;
         A252CliCod = P08352_A252CliCod[0] ;
         A830TipArtDsc = P08352_A830TipArtDsc[0] ;
         n830TipArtDsc = P08352_n830TipArtDsc[0] ;
         A10045CliAct = P08352_A10045CliAct[0] ;
         A279CliNom = P08352_A279CliNom[0] ;
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
         AV60VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A65ArtCod, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A69ArtDsc, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setNumber( A829TipArtCod );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A830TipArtDsc, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setNumber( A1148ArtPml );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setNumber( A1903ArtGraAca );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A95ArtRen)) );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setNumber( A63ArtAcaMin );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV52ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5741ArtComer, GXv_char5) ;
            tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV60VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV60VisibleColumnCount = (long)(AV60VisibleColumnCount+1) ;
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
      AV52ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtCod", "", "Artículo", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtDsc", "", "Descripción", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipArtCod", "", "Tipo Artículo", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipArtDsc", "", "Descripción", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtPml", "", "Pml", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtGraAca", "", "Grm2", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtRen", "", "Rdto", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtAcaMin", "", "Ancho Ac", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&NProc", "", "#", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&ProCods", "", "Proceso", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&ProDscs", "", "Descripción", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&ArtProCod", "", "Acs", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV52ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ArtComer", "", "Artículo Comercial", true, "") ;
      AV52ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV56UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TARTICUWWColumnsSelector", GXv_char5) ;
      tarticuwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV56UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV56UserCustomValue)==0) ) )
      {
         AV53ColumnsSelectorAux.fromxml(AV56UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV53ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV52ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV53ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV52ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV48Session.getValue("TARTICUWWGridState"), "") == 0 )
      {
         AV50GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TARTICUWWGridState"), null, null);
      }
      else
      {
         AV50GridState.fromxml(AV48Session.getValue("TARTICUWWGridState"), null, null);
      }
      AV16OrderedBy = AV50GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV50GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV148GXV2 = 1 ;
      while ( AV148GXV2 <= AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV148GXV2));
         if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV114FilterFullText = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV63TFCliCod = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFCliCod_To = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV69TFCliNom = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV70TFCliNom_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV65TFArtCod = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV66TFArtCod_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV77TFArtDsc = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV78TFArtDsc_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV73TFTipArtCod = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFTipArtCod_To = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV75TFTipArtDsc = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV76TFTipArtDsc_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPML") == 0 )
         {
            AV79TFArtPml = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV80TFArtPml_To = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTGRAACA") == 0 )
         {
            AV115TFArtGraAca = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV116TFArtGraAca_To = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTREN") == 0 )
         {
            AV91TFArtRen = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV92TFArtRen_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACAMIN") == 0 )
         {
            AV87TFArtAcaMin = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV88TFArtAcaMin_To = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER") == 0 )
         {
            AV119TFArtComer = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER_SEL") == 0 )
         {
            AV120TFArtComer_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV148GXV2 = (int)(AV148GXV2+1) ;
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
      this.aP0[0] = tarticuwwexport.this.AV11Filename;
      this.aP1[0] = tarticuwwexport.this.AV12ErrorMessage;
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
      AV114FilterFullText = "" ;
      AV70TFCliNom_Sel = "" ;
      AV69TFCliNom = "" ;
      AV66TFArtCod_Sel = "" ;
      AV65TFArtCod = "" ;
      AV78TFArtDsc_Sel = "" ;
      AV77TFArtDsc = "" ;
      AV76TFTipArtDsc_Sel = "" ;
      AV75TFTipArtDsc = "" ;
      AV91TFArtRen = DecimalUtil.ZERO ;
      AV92TFArtRen_To = DecimalUtil.ZERO ;
      AV120TFArtComer_Sel = "" ;
      AV119TFArtComer = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV48Session = httpContext.getWebSession();
      AV55ColumnsSelectorXML = "" ;
      AV52ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV54ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A5741ArtComer = "" ;
      AV125Tarticuwwds_1_filterfulltext = "" ;
      AV128Tarticuwwds_4_tfclinom = "" ;
      AV129Tarticuwwds_5_tfclinom_sel = "" ;
      AV130Tarticuwwds_6_tfartcod = "" ;
      AV131Tarticuwwds_7_tfartcod_sel = "" ;
      AV132Tarticuwwds_8_tfartdsc = "" ;
      AV133Tarticuwwds_9_tfartdsc_sel = "" ;
      AV136Tarticuwwds_12_tftipartdsc = "" ;
      AV137Tarticuwwds_13_tftipartdsc_sel = "" ;
      AV142Tarticuwwds_18_tfartren = DecimalUtil.ZERO ;
      AV143Tarticuwwds_19_tfartren_to = DecimalUtil.ZERO ;
      AV146Tarticuwwds_22_tfartcomer = "" ;
      AV147Tarticuwwds_23_tfartcomer_sel = "" ;
      scmdbuf = "" ;
      lV125Tarticuwwds_1_filterfulltext = "" ;
      lV128Tarticuwwds_4_tfclinom = "" ;
      lV130Tarticuwwds_6_tfartcod = "" ;
      lV132Tarticuwwds_8_tfartdsc = "" ;
      lV136Tarticuwwds_12_tftipartdsc = "" ;
      lV146Tarticuwwds_22_tfartcomer = "" ;
      A10045CliAct = "" ;
      P08352_A396EmprCod = new String[] {""} ;
      P08352_A10045CliAct = new String[] {""} ;
      P08352_A5741ArtComer = new String[] {""} ;
      P08352_n5741ArtComer = new boolean[] {false} ;
      P08352_A63ArtAcaMin = new short[1] ;
      P08352_n63ArtAcaMin = new boolean[] {false} ;
      P08352_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08352_n95ArtRen = new boolean[] {false} ;
      P08352_A1903ArtGraAca = new short[1] ;
      P08352_n1903ArtGraAca = new boolean[] {false} ;
      P08352_A1148ArtPml = new short[1] ;
      P08352_n1148ArtPml = new boolean[] {false} ;
      P08352_A830TipArtDsc = new String[] {""} ;
      P08352_n830TipArtDsc = new boolean[] {false} ;
      P08352_A829TipArtCod = new short[1] ;
      P08352_A69ArtDsc = new String[] {""} ;
      P08352_n69ArtDsc = new boolean[] {false} ;
      P08352_A65ArtCod = new String[] {""} ;
      P08352_A279CliNom = new String[] {""} ;
      P08352_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV56UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV53ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV50GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV51GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticuwwexport__default(),
         new Object[] {
             new Object[] {
            P08352_A396EmprCod, P08352_A10045CliAct, P08352_A5741ArtComer, P08352_n5741ArtComer, P08352_A63ArtAcaMin, P08352_n63ArtAcaMin, P08352_A95ArtRen, P08352_n95ArtRen, P08352_A1903ArtGraAca, P08352_n1903ArtGraAca,
            P08352_A1148ArtPml, P08352_n1148ArtPml, P08352_A830TipArtDsc, P08352_n830TipArtDsc, P08352_A829TipArtCod, P08352_A69ArtDsc, P08352_n69ArtDsc, P08352_A65ArtCod, P08352_A279CliNom, P08352_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV73TFTipArtCod ;
   private short AV74TFTipArtCod_To ;
   private short AV79TFArtPml ;
   private short AV80TFArtPml_To ;
   private short AV115TFArtGraAca ;
   private short AV116TFArtGraAca_To ;
   private short AV87TFArtAcaMin ;
   private short AV88TFArtAcaMin_To ;
   private short GXv_int3[] ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short AV134Tarticuwwds_10_tftipartcod ;
   private short AV135Tarticuwwds_11_tftipartcod_to ;
   private short AV138Tarticuwwds_14_tfartpml ;
   private short AV139Tarticuwwds_15_tfartpml_to ;
   private short AV140Tarticuwwds_16_tfartgraaca ;
   private short AV141Tarticuwwds_17_tfartgraaca_to ;
   private short AV144Tarticuwwds_20_tfartacamin ;
   private short AV145Tarticuwwds_21_tfartacamin_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV63TFCliCod ;
   private int AV64TFCliCod_To ;
   private int AV123GXV1 ;
   private int A252CliCod ;
   private int AV126Tarticuwwds_2_tfclicod ;
   private int AV127Tarticuwwds_3_tfclicod_to ;
   private int AV148GXV2 ;
   private long AV60VisibleColumnCount ;
   private java.math.BigDecimal AV91TFArtRen ;
   private java.math.BigDecimal AV92TFArtRen_To ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal AV142Tarticuwwds_18_tfartren ;
   private java.math.BigDecimal AV143Tarticuwwds_19_tfartren_to ;
   private String AV70TFCliNom_Sel ;
   private String AV69TFCliNom ;
   private String AV66TFArtCod_Sel ;
   private String AV65TFArtCod ;
   private String AV78TFArtDsc_Sel ;
   private String AV77TFArtDsc ;
   private String AV76TFTipArtDsc_Sel ;
   private String AV75TFTipArtDsc ;
   private String AV120TFArtComer_Sel ;
   private String AV119TFArtComer ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A5741ArtComer ;
   private String AV128Tarticuwwds_4_tfclinom ;
   private String AV129Tarticuwwds_5_tfclinom_sel ;
   private String AV130Tarticuwwds_6_tfartcod ;
   private String AV131Tarticuwwds_7_tfartcod_sel ;
   private String AV132Tarticuwwds_8_tfartdsc ;
   private String AV133Tarticuwwds_9_tfartdsc_sel ;
   private String AV136Tarticuwwds_12_tftipartdsc ;
   private String AV137Tarticuwwds_13_tftipartdsc_sel ;
   private String AV146Tarticuwwds_22_tfartcomer ;
   private String AV147Tarticuwwds_23_tfartcomer_sel ;
   private String scmdbuf ;
   private String lV128Tarticuwwds_4_tfclinom ;
   private String lV130Tarticuwwds_6_tfartcod ;
   private String lV132Tarticuwwds_8_tfartdsc ;
   private String lV136Tarticuwwds_12_tftipartdsc ;
   private String lV146Tarticuwwds_22_tfartcomer ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n5741ArtComer ;
   private boolean n63ArtAcaMin ;
   private boolean n95ArtRen ;
   private boolean n1903ArtGraAca ;
   private boolean n1148ArtPml ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private String AV55ColumnsSelectorXML ;
   private String AV56UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV114FilterFullText ;
   private String AV125Tarticuwwds_1_filterfulltext ;
   private String lV125Tarticuwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV48Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08352_A396EmprCod ;
   private String[] P08352_A10045CliAct ;
   private String[] P08352_A5741ArtComer ;
   private boolean[] P08352_n5741ArtComer ;
   private short[] P08352_A63ArtAcaMin ;
   private boolean[] P08352_n63ArtAcaMin ;
   private java.math.BigDecimal[] P08352_A95ArtRen ;
   private boolean[] P08352_n95ArtRen ;
   private short[] P08352_A1903ArtGraAca ;
   private boolean[] P08352_n1903ArtGraAca ;
   private short[] P08352_A1148ArtPml ;
   private boolean[] P08352_n1148ArtPml ;
   private String[] P08352_A830TipArtDsc ;
   private boolean[] P08352_n830TipArtDsc ;
   private short[] P08352_A829TipArtCod ;
   private String[] P08352_A69ArtDsc ;
   private boolean[] P08352_n69ArtDsc ;
   private String[] P08352_A65ArtCod ;
   private String[] P08352_A279CliNom ;
   private int[] P08352_A252CliCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV50GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV51GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV52ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV53ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV54ColumnsSelector_Column ;
}

final  class tarticuwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08352( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV125Tarticuwwds_1_filterfulltext ,
                                          int AV126Tarticuwwds_2_tfclicod ,
                                          int AV127Tarticuwwds_3_tfclicod_to ,
                                          String AV129Tarticuwwds_5_tfclinom_sel ,
                                          String AV128Tarticuwwds_4_tfclinom ,
                                          String AV131Tarticuwwds_7_tfartcod_sel ,
                                          String AV130Tarticuwwds_6_tfartcod ,
                                          String AV133Tarticuwwds_9_tfartdsc_sel ,
                                          String AV132Tarticuwwds_8_tfartdsc ,
                                          short AV134Tarticuwwds_10_tftipartcod ,
                                          short AV135Tarticuwwds_11_tftipartcod_to ,
                                          String AV137Tarticuwwds_13_tftipartdsc_sel ,
                                          String AV136Tarticuwwds_12_tftipartdsc ,
                                          short AV138Tarticuwwds_14_tfartpml ,
                                          short AV139Tarticuwwds_15_tfartpml_to ,
                                          short AV140Tarticuwwds_16_tfartgraaca ,
                                          short AV141Tarticuwwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV142Tarticuwwds_18_tfartren ,
                                          java.math.BigDecimal AV143Tarticuwwds_19_tfartren_to ,
                                          short AV144Tarticuwwds_20_tfartacamin ,
                                          short AV145Tarticuwwds_21_tfartacamin_to ,
                                          String AV147Tarticuwwds_23_tfartcomer_sel ,
                                          String AV146Tarticuwwds_22_tfartcomer ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod" ;
      scmdbuf += " FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV125Tarticuwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV126Tarticuwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV127Tarticuwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tarticuwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Tarticuwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tarticuwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tarticuwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV130Tarticuwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tarticuwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tarticuwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Tarticuwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tarticuwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV134Tarticuwwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV135Tarticuwwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Tarticuwwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV136Tarticuwwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Tarticuwwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV138Tarticuwwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV139Tarticuwwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV140Tarticuwwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV141Tarticuwwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Tarticuwwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Tarticuwwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV144Tarticuwwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV145Tarticuwwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Tarticuwwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV146Tarticuwwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Tarticuwwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipArtCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtPml" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtPml DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtRen" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtRen DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtComer" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtComer DESC" ;
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
                  return conditional_P08352(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08352", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((int[]) buf[19])[0] = rslt.getInt(13);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               return;
      }
   }

}

