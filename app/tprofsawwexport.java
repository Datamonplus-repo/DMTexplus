package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprofsawwexport extends GXProcedure
{
   public tprofsawwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprofsawwexport.class ), "" );
   }

   public tprofsawwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tprofsawwexport.this.aP1 = new String[] {""};
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
      tprofsawwexport.this.aP0 = aP0;
      tprofsawwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TPROFSAWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFEmprCod_Sel, GXv_char5) ;
         tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFEmprCod, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFProCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód. Proc.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFProCod_Sel, GXv_char5) ;
         tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFProCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód. Proc.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFProCod, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFProDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proceso", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFProDsc_Sel, GXv_char5) ;
         tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFProDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proceso", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFProDsc, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFProDsc2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion II", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFProDsc2_Sel, GXv_char5) ;
         tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFProDsc2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion II", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFProDsc2, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFEmprNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFEmprNom_Sel, GXv_char5) ;
         tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFEmprNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFEmprNom, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV44TFProUltFP) && (0==AV45TFProUltFP_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ultima linea Proceso Q", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFProUltFP );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFProUltFP_To );
      }
      if ( ! ( (0==AV46TFProNumLin) && (0==AV47TFProNumLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFProNumLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFProNumLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFFasCod_Sel, GXv_char5) ;
         tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFFasCod, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFFasDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion de Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFFasDsc_Sel, GXv_char5) ;
         tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFFasDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion de Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tprofsawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFFasDsc, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPROFSAWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TPROFSAWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV55GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Tprofsawwds_1_filterfulltext = AV18FilterFullText ;
      AV58Tprofsawwds_2_tfemprcod = AV34TFEmprCod ;
      AV59Tprofsawwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV60Tprofsawwds_4_tfprocod = AV36TFProCod ;
      AV61Tprofsawwds_5_tfprocod_sel = AV37TFProCod_Sel ;
      AV62Tprofsawwds_6_tfprodsc = AV38TFProDsc ;
      AV63Tprofsawwds_7_tfprodsc_sel = AV39TFProDsc_Sel ;
      AV64Tprofsawwds_8_tfprodsc2 = AV40TFProDsc2 ;
      AV65Tprofsawwds_9_tfprodsc2_sel = AV41TFProDsc2_Sel ;
      AV66Tprofsawwds_10_tfemprnom = AV42TFEmprNom ;
      AV67Tprofsawwds_11_tfemprnom_sel = AV43TFEmprNom_Sel ;
      AV68Tprofsawwds_12_tfproultfp = AV44TFProUltFP ;
      AV69Tprofsawwds_13_tfproultfp_to = AV45TFProUltFP_To ;
      AV70Tprofsawwds_14_tfpronumlin = AV46TFProNumLin ;
      AV71Tprofsawwds_15_tfpronumlin_to = AV47TFProNumLin_To ;
      AV72Tprofsawwds_16_tffascod = AV48TFFasCod ;
      AV73Tprofsawwds_17_tffascod_sel = AV49TFFasCod_Sel ;
      AV74Tprofsawwds_18_tffasdsc = AV50TFFasDsc ;
      AV75Tprofsawwds_19_tffasdsc_sel = AV51TFFasDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Tprofsawwds_1_filterfulltext ,
                                           AV59Tprofsawwds_3_tfemprcod_sel ,
                                           AV58Tprofsawwds_2_tfemprcod ,
                                           AV61Tprofsawwds_5_tfprocod_sel ,
                                           AV60Tprofsawwds_4_tfprocod ,
                                           AV63Tprofsawwds_7_tfprodsc_sel ,
                                           AV62Tprofsawwds_6_tfprodsc ,
                                           AV65Tprofsawwds_9_tfprodsc2_sel ,
                                           AV64Tprofsawwds_8_tfprodsc2 ,
                                           AV67Tprofsawwds_11_tfemprnom_sel ,
                                           AV66Tprofsawwds_10_tfemprnom ,
                                           Short.valueOf(AV68Tprofsawwds_12_tfproultfp) ,
                                           Short.valueOf(AV69Tprofsawwds_13_tfproultfp_to) ,
                                           Short.valueOf(AV70Tprofsawwds_14_tfpronumlin) ,
                                           Short.valueOf(AV71Tprofsawwds_15_tfpronumlin_to) ,
                                           AV73Tprofsawwds_17_tffascod_sel ,
                                           AV72Tprofsawwds_16_tffascod ,
                                           AV75Tprofsawwds_19_tffasdsc_sel ,
                                           AV74Tprofsawwds_18_tffasdsc ,
                                           A396EmprCod ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A4628ProDsc2 ,
                                           A407EmprNom ,
                                           Short.valueOf(A6437ProUltFP) ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV57Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tprofsawwds_1_filterfulltext), "%", "") ;
      lV57Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tprofsawwds_1_filterfulltext), "%", "") ;
      lV57Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tprofsawwds_1_filterfulltext), "%", "") ;
      lV57Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tprofsawwds_1_filterfulltext), "%", "") ;
      lV57Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tprofsawwds_1_filterfulltext), "%", "") ;
      lV57Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tprofsawwds_1_filterfulltext), "%", "") ;
      lV57Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tprofsawwds_1_filterfulltext), "%", "") ;
      lV57Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tprofsawwds_1_filterfulltext), "%", "") ;
      lV57Tprofsawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Tprofsawwds_1_filterfulltext), "%", "") ;
      lV58Tprofsawwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV58Tprofsawwds_2_tfemprcod), 3, "%") ;
      lV60Tprofsawwds_4_tfprocod = GXutil.padr( GXutil.rtrim( AV60Tprofsawwds_4_tfprocod), 8, "%") ;
      lV62Tprofsawwds_6_tfprodsc = GXutil.padr( GXutil.rtrim( AV62Tprofsawwds_6_tfprodsc), 40, "%") ;
      lV64Tprofsawwds_8_tfprodsc2 = GXutil.padr( GXutil.rtrim( AV64Tprofsawwds_8_tfprodsc2), 100, "%") ;
      lV66Tprofsawwds_10_tfemprnom = GXutil.padr( GXutil.rtrim( AV66Tprofsawwds_10_tfemprnom), 30, "%") ;
      lV72Tprofsawwds_16_tffascod = GXutil.padr( GXutil.rtrim( AV72Tprofsawwds_16_tffascod), 8, "%") ;
      lV74Tprofsawwds_18_tffasdsc = GXutil.padr( GXutil.rtrim( AV74Tprofsawwds_18_tffasdsc), 28, "%") ;
      /* Using cursor P08ND2 */
      pr_default.execute(0, new Object[] {lV57Tprofsawwds_1_filterfulltext, lV57Tprofsawwds_1_filterfulltext, lV57Tprofsawwds_1_filterfulltext, lV57Tprofsawwds_1_filterfulltext, lV57Tprofsawwds_1_filterfulltext, lV57Tprofsawwds_1_filterfulltext, lV57Tprofsawwds_1_filterfulltext, lV57Tprofsawwds_1_filterfulltext, lV57Tprofsawwds_1_filterfulltext, lV58Tprofsawwds_2_tfemprcod, AV59Tprofsawwds_3_tfemprcod_sel, lV60Tprofsawwds_4_tfprocod, AV61Tprofsawwds_5_tfprocod_sel, lV62Tprofsawwds_6_tfprodsc, AV63Tprofsawwds_7_tfprodsc_sel, lV64Tprofsawwds_8_tfprodsc2, AV65Tprofsawwds_9_tfprodsc2_sel, lV66Tprofsawwds_10_tfemprnom, AV67Tprofsawwds_11_tfemprnom_sel, Short.valueOf(AV68Tprofsawwds_12_tfproultfp), Short.valueOf(AV69Tprofsawwds_13_tfproultfp_to), Short.valueOf(AV70Tprofsawwds_14_tfpronumlin), Short.valueOf(AV71Tprofsawwds_15_tfpronumlin_to), lV72Tprofsawwds_16_tffascod, AV73Tprofsawwds_17_tffascod_sel, lV74Tprofsawwds_18_tffasdsc, AV75Tprofsawwds_19_tffasdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A460FasDsc = P08ND2_A460FasDsc[0] ;
         A457FasCod = P08ND2_A457FasCod[0] ;
         A774ProNumLin = P08ND2_A774ProNumLin[0] ;
         A6437ProUltFP = P08ND2_A6437ProUltFP[0] ;
         A407EmprNom = P08ND2_A407EmprNom[0] ;
         n407EmprNom = P08ND2_n407EmprNom[0] ;
         A4628ProDsc2 = P08ND2_A4628ProDsc2[0] ;
         A759ProDsc = P08ND2_A759ProDsc[0] ;
         A758ProCod = P08ND2_A758ProCod[0] ;
         A396EmprCod = P08ND2_A396EmprCod[0] ;
         A407EmprNom = P08ND2_A407EmprNom[0] ;
         n407EmprNom = P08ND2_n407EmprNom[0] ;
         A460FasDsc = P08ND2_A460FasDsc[0] ;
         A4628ProDsc2 = P08ND2_A4628ProDsc2[0] ;
         A759ProDsc = P08ND2_A759ProDsc[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
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
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A396EmprCod, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A758ProCod, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A759ProDsc, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4628ProDsc2, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A407EmprNom, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A6437ProUltFP );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A774ProNumLin );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A457FasCod, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A460FasDsc, GXv_char5) ;
            tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
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
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprCod", "", "Código Empresa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProCod", "", "Cód. Proc.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProDsc", "", "Proceso", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProDsc2", "", "Descripcion II", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "EmprNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProUltFP", "", "Ultima linea Proceso Q", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProNumLin", "", "Linea", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasCod", "", "Codigo Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPROFSAWWColumnsSelector", GXv_char5) ;
      tprofsawwexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("TPROFSAWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPROFSAWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TPROFSAWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV76GXV2 = 1 ;
      while ( AV76GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV76GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV36TFProCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV37TFProCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV38TFProDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV39TFProDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2") == 0 )
         {
            AV40TFProDsc2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC2_SEL") == 0 )
         {
            AV41TFProDsc2_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV42TFEmprNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV43TFEmprNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROULTFP") == 0 )
         {
            AV44TFProUltFP = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFProUltFP_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMLIN") == 0 )
         {
            AV46TFProNumLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFProNumLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV48TFFasCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV49TFFasCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV50TFFasDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV51TFFasDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV76GXV2 = (int)(AV76GXV2+1) ;
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
      this.aP0[0] = tprofsawwexport.this.AV11Filename;
      this.aP1[0] = tprofsawwexport.this.AV12ErrorMessage;
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
      AV35TFEmprCod_Sel = "" ;
      AV34TFEmprCod = "" ;
      AV37TFProCod_Sel = "" ;
      AV36TFProCod = "" ;
      AV39TFProDsc_Sel = "" ;
      AV38TFProDsc = "" ;
      AV41TFProDsc2_Sel = "" ;
      AV40TFProDsc2 = "" ;
      AV43TFEmprNom_Sel = "" ;
      AV42TFEmprNom = "" ;
      AV49TFFasCod_Sel = "" ;
      AV48TFFasCod = "" ;
      AV51TFFasDsc_Sel = "" ;
      AV50TFFasDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      A407EmprNom = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV57Tprofsawwds_1_filterfulltext = "" ;
      AV58Tprofsawwds_2_tfemprcod = "" ;
      AV59Tprofsawwds_3_tfemprcod_sel = "" ;
      AV60Tprofsawwds_4_tfprocod = "" ;
      AV61Tprofsawwds_5_tfprocod_sel = "" ;
      AV62Tprofsawwds_6_tfprodsc = "" ;
      AV63Tprofsawwds_7_tfprodsc_sel = "" ;
      AV64Tprofsawwds_8_tfprodsc2 = "" ;
      AV65Tprofsawwds_9_tfprodsc2_sel = "" ;
      AV66Tprofsawwds_10_tfemprnom = "" ;
      AV67Tprofsawwds_11_tfemprnom_sel = "" ;
      AV72Tprofsawwds_16_tffascod = "" ;
      AV73Tprofsawwds_17_tffascod_sel = "" ;
      AV74Tprofsawwds_18_tffasdsc = "" ;
      AV75Tprofsawwds_19_tffasdsc_sel = "" ;
      scmdbuf = "" ;
      lV57Tprofsawwds_1_filterfulltext = "" ;
      lV58Tprofsawwds_2_tfemprcod = "" ;
      lV60Tprofsawwds_4_tfprocod = "" ;
      lV62Tprofsawwds_6_tfprodsc = "" ;
      lV64Tprofsawwds_8_tfprodsc2 = "" ;
      lV66Tprofsawwds_10_tfemprnom = "" ;
      lV72Tprofsawwds_16_tffascod = "" ;
      lV74Tprofsawwds_18_tffasdsc = "" ;
      P08ND2_A460FasDsc = new String[] {""} ;
      P08ND2_A457FasCod = new String[] {""} ;
      P08ND2_A774ProNumLin = new short[1] ;
      P08ND2_A6437ProUltFP = new short[1] ;
      P08ND2_A407EmprNom = new String[] {""} ;
      P08ND2_n407EmprNom = new boolean[] {false} ;
      P08ND2_A4628ProDsc2 = new String[] {""} ;
      P08ND2_A759ProDsc = new String[] {""} ;
      P08ND2_A758ProCod = new String[] {""} ;
      P08ND2_A396EmprCod = new String[] {""} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprofsawwexport__default(),
         new Object[] {
             new Object[] {
            P08ND2_A460FasDsc, P08ND2_A457FasCod, P08ND2_A774ProNumLin, P08ND2_A6437ProUltFP, P08ND2_A407EmprNom, P08ND2_n407EmprNom, P08ND2_A4628ProDsc2, P08ND2_A759ProDsc, P08ND2_A758ProCod, P08ND2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV44TFProUltFP ;
   private short AV45TFProUltFP_To ;
   private short AV46TFProNumLin ;
   private short AV47TFProNumLin_To ;
   private short GXv_int3[] ;
   private short A6437ProUltFP ;
   private short A774ProNumLin ;
   private short AV68Tprofsawwds_12_tfproultfp ;
   private short AV69Tprofsawwds_13_tfproultfp_to ;
   private short AV70Tprofsawwds_14_tfpronumlin ;
   private short AV71Tprofsawwds_15_tfpronumlin_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV55GXV1 ;
   private int AV76GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV35TFEmprCod_Sel ;
   private String AV34TFEmprCod ;
   private String AV37TFProCod_Sel ;
   private String AV36TFProCod ;
   private String AV39TFProDsc_Sel ;
   private String AV38TFProDsc ;
   private String AV41TFProDsc2_Sel ;
   private String AV40TFProDsc2 ;
   private String AV43TFEmprNom_Sel ;
   private String AV42TFEmprNom ;
   private String AV49TFFasCod_Sel ;
   private String AV48TFFasCod ;
   private String AV51TFFasDsc_Sel ;
   private String AV50TFFasDsc ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A4628ProDsc2 ;
   private String A407EmprNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV58Tprofsawwds_2_tfemprcod ;
   private String AV59Tprofsawwds_3_tfemprcod_sel ;
   private String AV60Tprofsawwds_4_tfprocod ;
   private String AV61Tprofsawwds_5_tfprocod_sel ;
   private String AV62Tprofsawwds_6_tfprodsc ;
   private String AV63Tprofsawwds_7_tfprodsc_sel ;
   private String AV64Tprofsawwds_8_tfprodsc2 ;
   private String AV65Tprofsawwds_9_tfprodsc2_sel ;
   private String AV66Tprofsawwds_10_tfemprnom ;
   private String AV67Tprofsawwds_11_tfemprnom_sel ;
   private String AV72Tprofsawwds_16_tffascod ;
   private String AV73Tprofsawwds_17_tffascod_sel ;
   private String AV74Tprofsawwds_18_tffasdsc ;
   private String AV75Tprofsawwds_19_tffasdsc_sel ;
   private String scmdbuf ;
   private String lV58Tprofsawwds_2_tfemprcod ;
   private String lV60Tprofsawwds_4_tfprocod ;
   private String lV62Tprofsawwds_6_tfprodsc ;
   private String lV64Tprofsawwds_8_tfprodsc2 ;
   private String lV66Tprofsawwds_10_tfemprnom ;
   private String lV72Tprofsawwds_16_tffascod ;
   private String lV74Tprofsawwds_18_tffasdsc ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n407EmprNom ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV57Tprofsawwds_1_filterfulltext ;
   private String lV57Tprofsawwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08ND2_A460FasDsc ;
   private String[] P08ND2_A457FasCod ;
   private short[] P08ND2_A774ProNumLin ;
   private short[] P08ND2_A6437ProUltFP ;
   private String[] P08ND2_A407EmprNom ;
   private boolean[] P08ND2_n407EmprNom ;
   private String[] P08ND2_A4628ProDsc2 ;
   private String[] P08ND2_A759ProDsc ;
   private String[] P08ND2_A758ProCod ;
   private String[] P08ND2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class tprofsawwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ND2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Tprofsawwds_1_filterfulltext ,
                                          String AV59Tprofsawwds_3_tfemprcod_sel ,
                                          String AV58Tprofsawwds_2_tfemprcod ,
                                          String AV61Tprofsawwds_5_tfprocod_sel ,
                                          String AV60Tprofsawwds_4_tfprocod ,
                                          String AV63Tprofsawwds_7_tfprodsc_sel ,
                                          String AV62Tprofsawwds_6_tfprodsc ,
                                          String AV65Tprofsawwds_9_tfprodsc2_sel ,
                                          String AV64Tprofsawwds_8_tfprodsc2 ,
                                          String AV67Tprofsawwds_11_tfemprnom_sel ,
                                          String AV66Tprofsawwds_10_tfemprnom ,
                                          short AV68Tprofsawwds_12_tfproultfp ,
                                          short AV69Tprofsawwds_13_tfproultfp_to ,
                                          short AV70Tprofsawwds_14_tfpronumlin ,
                                          short AV71Tprofsawwds_15_tfpronumlin_to ,
                                          String AV73Tprofsawwds_17_tffascod_sel ,
                                          String AV72Tprofsawwds_16_tffascod ,
                                          String AV75Tprofsawwds_19_tffasdsc_sel ,
                                          String AV74Tprofsawwds_18_tffasdsc ,
                                          String A396EmprCod ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A4628ProDsc2 ,
                                          String A407EmprNom ,
                                          short A6437ProUltFP ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.FasDsc, T1.FasCod, T1.ProNumLin, T1.ProUltFP, T2.EmprNom, T4.ProDsc2, T4.ProDsc, T1.ProCod, T1.EmprCod FROM (((TXPPROLIN T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod AND T4.ProCod" ;
      scmdbuf += " = T1.ProCod)" ;
      if ( ! (GXutil.strcmp("", AV57Tprofsawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc) like '%' || UPPER(?)) or ( UPPER(T4.ProDsc2) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProUltFP,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV59Tprofsawwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprofsawwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprofsawwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tprofsawwds_5_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV60Tprofsawwds_4_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tprofsawwds_5_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tprofsawwds_7_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Tprofsawwds_6_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tprofsawwds_7_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Tprofsawwds_9_tfprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV64Tprofsawwds_8_tfprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Tprofsawwds_9_tfprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProDsc2 = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Tprofsawwds_11_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Tprofsawwds_10_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Tprofsawwds_11_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV68Tprofsawwds_12_tfproultfp) )
      {
         addWhere(sWhereString, "(T1.ProUltFP >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV69Tprofsawwds_13_tfproultfp_to) )
      {
         addWhere(sWhereString, "(T1.ProUltFP <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV70Tprofsawwds_14_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV71Tprofsawwds_15_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Tprofsawwds_17_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV72Tprofsawwds_16_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Tprofsawwds_17_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Tprofsawwds_19_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Tprofsawwds_18_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tprofsawwds_19_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProUltFP" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProUltFP DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProDsc2" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProDsc2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProNumLin" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProNumLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.FasDsc" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.FasDsc DESC" ;
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
                  return conditional_P08ND2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ND2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 100);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 40);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 28);
               }
               return;
      }
   }

}

