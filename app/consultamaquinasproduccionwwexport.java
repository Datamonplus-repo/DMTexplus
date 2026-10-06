package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultamaquinasproduccionwwexport extends GXProcedure
{
   public consultamaquinasproduccionwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultamaquinasproduccionwwexport.class ), "" );
   }

   public consultamaquinasproduccionwwexport( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultamaquinasproduccionwwexport.this.aP1 = new String[] {""};
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
      consultamaquinasproduccionwwexport.this.aP0 = aP0;
      consultamaquinasproduccionwwexport.this.aP1 = aP1;
      initialize();
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
         AV13CellRow = 1 ;
         AV14FirstColumn = 1 ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S211 ();
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
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'WRITEDATA' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'CLOSEDOCUMENT' */
         S201 ();
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
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S221 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S211 ();
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
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S171 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S201 ();
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultaMaquinasProduccionWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S141 ();
      if (returnInSub) return;
      if ( 1 == 0 )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
         if ( GXutil.strcmp(GXutil.trim( AV73LecEstado), httpContext.getMessage( "P", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Proceso", "") );
         }
         else if ( GXutil.strcmp(GXutil.trim( AV73LecEstado), httpContext.getMessage( "F", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Finalizadas", "") );
         }
         if ( ! ( (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFLecMaqCod_Sel, GXv_char5) ;
            consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
         else
         {
            if ( ! ( (GXutil.strcmp("", AV35TFLecMaqCod)==0) ) )
            {
               GXv_exceldoc2[0] = AV10ExcelDocument ;
               GXv_int3[0] = (short)(AV13CellRow) ;
               new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
               AV10ExcelDocument = GXv_exceldoc2[0] ;
               consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFLecMaqCod, GXv_char5) ;
               consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
            }
         }
         if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFLecFec)) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_dtime6 = GXutil.resetTime( AV53TFLecFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
         }
         if ( ! ( (0==AV43TFLecOpeCod) && (0==AV44TFLecOpeCod_To) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFLecOpeCod );
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFLecOpeCod_To );
         }
         if ( ! ( (GXutil.strcmp("", AV70TFLecHdr_Sel)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFLecHdr_Sel, GXv_char5) ;
            consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
         else
         {
            if ( ! ( (GXutil.strcmp("", AV69TFLecHdr)==0) ) )
            {
               GXv_exceldoc2[0] = AV10ExcelDocument ;
               GXv_int3[0] = (short)(AV13CellRow) ;
               new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
               AV10ExcelDocument = GXv_exceldoc2[0] ;
               consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFLecHdr, GXv_char5) ;
               consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
            }
         }
         if ( ! ( (GXutil.strcmp("", AV72TFLecEstado_Sel)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( AV72TFLecEstado_Sel), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Proceso", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV72TFLecEstado_Sel), httpContext.getMessage( "F", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Finalizadas", "") );
            }
         }
         if ( ! ( (0==AV49TFLecParCod) && (0==AV50TFLecParCod_To) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Paro", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV49TFLecParCod );
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV50TFLecParCod_To );
         }
         if ( ! ( (GXutil.strcmp("", AV113TFlecOpeNom_Sel)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV113TFlecOpeNom_Sel, GXv_char5) ;
            consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
         else
         {
            if ( ! ( (GXutil.strcmp("", AV112TFlecOpeNom)==0) ) )
            {
               GXv_exceldoc2[0] = AV10ExcelDocument ;
               GXv_int3[0] = (short)(AV13CellRow) ;
               new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
               AV10ExcelDocument = GXv_exceldoc2[0] ;
               consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV112TFlecOpeNom, GXv_char5) ;
               consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
            }
         }
         if ( ! ( (GXutil.strcmp("", AV115TFLecFasDsc_Sel)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV115TFLecFasDsc_Sel, GXv_char5) ;
            consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
         else
         {
            if ( ! ( (GXutil.strcmp("", AV114TFLecFasDsc)==0) ) )
            {
               GXv_exceldoc2[0] = AV10ExcelDocument ;
               GXv_int3[0] = (short)(AV13CellRow) ;
               new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
               AV10ExcelDocument = GXv_exceldoc2[0] ;
               consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV114TFLecFasDsc, GXv_char5) ;
               consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
            }
         }
         if ( ! ( (GXutil.strcmp("", AV117TFLecParNom_Sel)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV117TFLecParNom_Sel, GXv_char5) ;
            consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
         else
         {
            if ( ! ( (GXutil.strcmp("", AV116TFLecParNom)==0) ) )
            {
               GXv_exceldoc2[0] = AV10ExcelDocument ;
               GXv_int3[0] = (short)(AV13CellRow) ;
               new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
               AV10ExcelDocument = GXv_exceldoc2[0] ;
               consultamaquinasproduccionwwexport.this.AV13CellRow = GXv_int3[0] ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV116TFLecParNom, GXv_char5) ;
               consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
            }
         }
         AV13CellRow = (int)(AV13CellRow+2) ;
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S151( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV20Session.getValue("ConsultaMaquinasProduccionWWColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV20Session.getValue("ConsultaMaquinasProduccionWWColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S161 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV121GXV1 = 1 ;
      while ( AV121GXV1 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV121GXV1));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV121GXV1 = (int)(AV121GXV1+1) ;
      }
   }

   public void S171( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV36TFLecMaqCod_Sel ,
                                           AV35TFLecMaqCod ,
                                           AV53TFLecFec ,
                                           Integer.valueOf(AV43TFLecOpeCod) ,
                                           Integer.valueOf(AV44TFLecOpeCod_To) ,
                                           AV70TFLecHdr_Sel ,
                                           AV69TFLecHdr ,
                                           Short.valueOf(AV49TFLecParCod) ,
                                           Short.valueOf(AV50TFLecParCod_To) ,
                                           AV19LecMaqCod ,
                                           AV79LecMaqCod_To ,
                                           A1166LecMaqCod ,
                                           A1174LecFec ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Short.valueOf(A1172LecParCod) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV73LecEstado ,
                                           A13722LecEstado ,
                                           AV72TFLecEstado_Sel ,
                                           AV113TFlecOpeNom_Sel ,
                                           AV112TFlecOpeNom ,
                                           A14259lecOpeNom ,
                                           AV115TFLecFasDsc_Sel ,
                                           AV114TFLecFasDsc ,
                                           A14260LecFasDsc ,
                                           AV117TFLecParNom_Sel ,
                                           AV116TFLecParNom ,
                                           A14261LecParNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV35TFLecMaqCod = GXutil.padr( GXutil.rtrim( AV35TFLecMaqCod), 6, "%") ;
      lV69TFLecHdr = GXutil.padr( GXutil.rtrim( AV69TFLecHdr), 11, "%") ;
      /* Using cursor P08DG2 */
      pr_default.execute(0, new Object[] {lV35TFLecMaqCod, AV36TFLecMaqCod_Sel, AV53TFLecFec, Integer.valueOf(AV43TFLecOpeCod), Integer.valueOf(AV44TFLecOpeCod_To), lV69TFLecHdr, AV70TFLecHdr_Sel, Short.valueOf(AV49TFLecParCod), Short.valueOf(AV50TFLecParCod_To), AV19LecMaqCod, AV79LecMaqCod_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13721LecHdr = P08DG2_A13721LecHdr[0] ;
         A1174LecFec = P08DG2_A1174LecFec[0] ;
         n1174LecFec = P08DG2_n1174LecFec[0] ;
         A1166LecMaqCod = P08DG2_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08DG2_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08DG2_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08DG2_A1169LecBarPar[0] ;
         n1169LecBarPar = P08DG2_n1169LecBarPar[0] ;
         A1168LecBarReo = P08DG2_A1168LecBarReo[0] ;
         n1168LecBarReo = P08DG2_n1168LecBarReo[0] ;
         A1167LecBarCod = P08DG2_A1167LecBarCod[0] ;
         n1167LecBarCod = P08DG2_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08DG2_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08DG2_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08DG2_A1171LecFasCod[0] ;
         n1171LecFasCod = P08DG2_n1171LecFasCod[0] ;
         A1172LecParCod = P08DG2_A1172LecParCod[0] ;
         n1172LecParCod = P08DG2_n1172LecParCod[0] ;
         A396EmprCod = P08DG2_A396EmprCod[0] ;
         GXt_char4 = A13722LecEstado ;
         GXv_char5[0] = GXt_char4 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char5) ;
         consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
         A13722LecEstado = GXt_char4 ;
         if ( (GXutil.strcmp("", AV73LecEstado)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV73LecEstado) == 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV72TFLecEstado_Sel)==0) || ( ( GXutil.strcmp(A13722LecEstado, AV72TFLecEstado_Sel) == 0 ) ) )
            {
               GXt_char4 = A14259lecOpeNom ;
               GXv_char5[0] = GXt_char4 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char5) ;
               consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
               A14259lecOpeNom = GXt_char4 ;
               if ( ! ( (GXutil.strcmp("", AV113TFlecOpeNom_Sel)==0) && ( ! (GXutil.strcmp("", AV112TFlecOpeNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV112TFlecOpeNom) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV113TFlecOpeNom_Sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV113TFlecOpeNom_Sel) == 0 ) ) )
                  {
                     GXt_char4 = A14260LecFasDsc ;
                     GXv_char5[0] = GXt_char4 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char5) ;
                     consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
                     A14260LecFasDsc = GXt_char4 ;
                     if ( ! ( (GXutil.strcmp("", AV115TFLecFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV114TFLecFasDsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV114TFLecFasDsc) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV115TFLecFasDsc_Sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV115TFLecFasDsc_Sel) == 0 ) ) )
                        {
                           GXt_char4 = A14261LecParNom ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char5) ;
                           consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
                           A14261LecParNom = GXt_char4 ;
                           if ( ! ( (GXutil.strcmp("", AV117TFLecParNom_Sel)==0) && ( ! (GXutil.strcmp("", AV116TFLecParNom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV116TFLecParNom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV117TFLecParNom_Sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV117TFLecParNom_Sel) == 0 ) ) )
                              {
                                 AV13CellRow = (int)(AV13CellRow+1) ;
                                 /* Execute user subroutine: 'BEFOREWRITELINE' */
                                 S182 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    returnInSub = true;
                                    if (true) return;
                                 }
                                 AV32VisibleColumnCount = 0 ;
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1166LecMaqCod, GXv_char5) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = AV76MaqDsc ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A1166LecMaqCod, GXv_char5) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV76MaqDsc = GXt_char4 ;
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
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76MaqDsc, GXv_char5) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_dtime6 = GXutil.resetTime( A1174LecFec );
                                    AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A1170LecOpeCod );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = AV65OpeNom ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char5) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV65OpeNom = GXt_char4 ;
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65OpeNom, GXv_char5) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13721LecHdr, GXv_char5) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( "" );
                                    if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), httpContext.getMessage( "P", "")) == 0 )
                                    {
                                       AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Proceso", "") );
                                    }
                                    else if ( GXutil.strcmp(GXutil.trim( A13722LecEstado), httpContext.getMessage( "F", "")) == 0 )
                                    {
                                       AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Finalizadas", "") );
                                    }
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A1172LecParCod );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    AV123GXLvl283 = (byte)(0) ;
                                    /* Using cursor P08DG3 */
                                    pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod)});
                                    while ( (pr_default.getStatus(1) != 101) )
                                    {
                                       A656ParCod = P08DG3_A656ParCod[0] ;
                                       A867ParCodNom = P08DG3_A867ParCodNom[0] ;
                                       n867ParCodNom = P08DG3_n867ParCodNom[0] ;
                                       AV123GXLvl283 = (byte)(1) ;
                                       AV67ParCodNom = A867ParCodNom ;
                                       /* Exiting from a For First loop. */
                                       if (true) break;
                                    }
                                    pr_default.close(1);
                                    if ( AV123GXLvl283 == 0 )
                                    {
                                       AV67ParCodNom = " " ;
                                    }
                                    GXt_char4 = "" ;
                                    GXv_char5[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67ParCodNom, GXv_char5) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char5[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = AV68Texto1 ;
                                    GXv_char5[0] = A396EmprCod ;
                                    GXv_int7[0] = A1167LecBarCod ;
                                    GXv_int8[0] = A1168LecBarReo ;
                                    GXv_char9[0] = A1169LecBarPar ;
                                    GXv_int3[0] = A1188LecFasOrd ;
                                    GXv_char10[0] = A1171LecFasCod ;
                                    GXv_char11[0] = A1166LecMaqCod ;
                                    GXv_char12[0] = A13721LecHdr ;
                                    GXv_int13[0] = A1172LecParCod ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.procedure3(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_int8, GXv_char9, GXv_int3, GXv_char10, GXv_char11, GXv_char12, GXv_int13, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.A396EmprCod = GXv_char5[0] ;
                                    consultamaquinasproduccionwwexport.this.A1167LecBarCod = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexport.this.A1168LecBarReo = GXv_int8[0] ;
                                    consultamaquinasproduccionwwexport.this.A1169LecBarPar = GXv_char9[0] ;
                                    consultamaquinasproduccionwwexport.this.A1188LecFasOrd = GXv_int3[0] ;
                                    consultamaquinasproduccionwwexport.this.A1171LecFasCod = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexport.this.A1166LecMaqCod = GXv_char11[0] ;
                                    consultamaquinasproduccionwwexport.this.A13721LecHdr = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexport.this.A1172LecParCod = GXv_int13[0] ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV68Texto1 = GXt_char4 ;
                                    GXt_char4 = "" ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68Texto1, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int7[0] = AV91CliCod ;
                                    GXv_char14[0] = AV92CliNom ;
                                    GXv_char12[0] = AV93BarSer ;
                                    GXv_char11[0] = AV94BarSerDsc ;
                                    GXv_char10[0] = AV95BarColNom ;
                                    GXv_int15[0] = AV96BarColNum ;
                                    GXv_dtime16[0] = AV97HisProdti ;
                                    GXv_dtime17[0] = AV98HisProdtf ;
                                    GXv_char9[0] = AV99HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV83EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int7, GXv_char14, GXv_char12, GXv_char11, GXv_char10, GXv_int15, GXv_dtime16, GXv_dtime17, GXv_char9) ;
                                    consultamaquinasproduccionwwexport.this.AV91CliCod = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexport.this.AV92CliNom = GXv_char14[0] ;
                                    consultamaquinasproduccionwwexport.this.AV93BarSer = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexport.this.AV94BarSerDsc = GXv_char11[0] ;
                                    consultamaquinasproduccionwwexport.this.AV95BarColNom = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexport.this.AV96BarColNum = GXv_int15[0] ;
                                    consultamaquinasproduccionwwexport.this.AV97HisProdti = GXv_dtime16[0] ;
                                    consultamaquinasproduccionwwexport.this.AV98HisProdtf = GXv_dtime17[0] ;
                                    consultamaquinasproduccionwwexport.this.AV99HisProF = GXv_char9[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( AV91CliCod );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int15[0] = AV91CliCod ;
                                    GXv_char14[0] = AV92CliNom ;
                                    GXv_char12[0] = AV93BarSer ;
                                    GXv_char11[0] = AV94BarSerDsc ;
                                    GXv_char10[0] = AV95BarColNom ;
                                    GXv_int7[0] = AV96BarColNum ;
                                    GXv_dtime17[0] = AV97HisProdti ;
                                    GXv_dtime16[0] = AV98HisProdtf ;
                                    GXv_char9[0] = AV99HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV83EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int15, GXv_char14, GXv_char12, GXv_char11, GXv_char10, GXv_int7, GXv_dtime17, GXv_dtime16, GXv_char9) ;
                                    consultamaquinasproduccionwwexport.this.AV91CliCod = GXv_int15[0] ;
                                    consultamaquinasproduccionwwexport.this.AV92CliNom = GXv_char14[0] ;
                                    consultamaquinasproduccionwwexport.this.AV93BarSer = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexport.this.AV94BarSerDsc = GXv_char11[0] ;
                                    consultamaquinasproduccionwwexport.this.AV95BarColNom = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexport.this.AV96BarColNum = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexport.this.AV97HisProdti = GXv_dtime17[0] ;
                                    consultamaquinasproduccionwwexport.this.AV98HisProdtf = GXv_dtime16[0] ;
                                    consultamaquinasproduccionwwexport.this.AV99HisProF = GXv_char9[0] ;
                                    GXt_char4 = "" ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92CliNom, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int15[0] = AV91CliCod ;
                                    GXv_char14[0] = AV92CliNom ;
                                    GXv_char12[0] = AV93BarSer ;
                                    GXv_char11[0] = AV94BarSerDsc ;
                                    GXv_char10[0] = AV95BarColNom ;
                                    GXv_int7[0] = AV96BarColNum ;
                                    GXv_dtime17[0] = AV97HisProdti ;
                                    GXv_dtime16[0] = AV98HisProdtf ;
                                    GXv_char9[0] = AV99HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV83EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int15, GXv_char14, GXv_char12, GXv_char11, GXv_char10, GXv_int7, GXv_dtime17, GXv_dtime16, GXv_char9) ;
                                    consultamaquinasproduccionwwexport.this.AV91CliCod = GXv_int15[0] ;
                                    consultamaquinasproduccionwwexport.this.AV92CliNom = GXv_char14[0] ;
                                    consultamaquinasproduccionwwexport.this.AV93BarSer = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexport.this.AV94BarSerDsc = GXv_char11[0] ;
                                    consultamaquinasproduccionwwexport.this.AV95BarColNom = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexport.this.AV96BarColNum = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexport.this.AV97HisProdti = GXv_dtime17[0] ;
                                    consultamaquinasproduccionwwexport.this.AV98HisProdtf = GXv_dtime16[0] ;
                                    consultamaquinasproduccionwwexport.this.AV99HisProF = GXv_char9[0] ;
                                    GXt_char4 = "" ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93BarSer, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int15[0] = AV91CliCod ;
                                    GXv_char14[0] = AV92CliNom ;
                                    GXv_char12[0] = AV93BarSer ;
                                    GXv_char11[0] = AV94BarSerDsc ;
                                    GXv_char10[0] = AV95BarColNom ;
                                    GXv_int7[0] = AV96BarColNum ;
                                    GXv_dtime17[0] = AV97HisProdti ;
                                    GXv_dtime16[0] = AV98HisProdtf ;
                                    GXv_char9[0] = AV99HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV83EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int15, GXv_char14, GXv_char12, GXv_char11, GXv_char10, GXv_int7, GXv_dtime17, GXv_dtime16, GXv_char9) ;
                                    consultamaquinasproduccionwwexport.this.AV91CliCod = GXv_int15[0] ;
                                    consultamaquinasproduccionwwexport.this.AV92CliNom = GXv_char14[0] ;
                                    consultamaquinasproduccionwwexport.this.AV93BarSer = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexport.this.AV94BarSerDsc = GXv_char11[0] ;
                                    consultamaquinasproduccionwwexport.this.AV95BarColNom = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexport.this.AV96BarColNum = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexport.this.AV97HisProdti = GXv_dtime17[0] ;
                                    consultamaquinasproduccionwwexport.this.AV98HisProdtf = GXv_dtime16[0] ;
                                    consultamaquinasproduccionwwexport.this.AV99HisProF = GXv_char9[0] ;
                                    GXt_char4 = "" ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV94BarSerDsc, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int15[0] = AV91CliCod ;
                                    GXv_char14[0] = AV92CliNom ;
                                    GXv_char12[0] = AV93BarSer ;
                                    GXv_char11[0] = AV94BarSerDsc ;
                                    GXv_char10[0] = AV95BarColNom ;
                                    GXv_int7[0] = AV96BarColNum ;
                                    GXv_dtime17[0] = AV97HisProdti ;
                                    GXv_dtime16[0] = AV98HisProdtf ;
                                    GXv_char9[0] = AV99HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV83EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int15, GXv_char14, GXv_char12, GXv_char11, GXv_char10, GXv_int7, GXv_dtime17, GXv_dtime16, GXv_char9) ;
                                    consultamaquinasproduccionwwexport.this.AV91CliCod = GXv_int15[0] ;
                                    consultamaquinasproduccionwwexport.this.AV92CliNom = GXv_char14[0] ;
                                    consultamaquinasproduccionwwexport.this.AV93BarSer = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexport.this.AV94BarSerDsc = GXv_char11[0] ;
                                    consultamaquinasproduccionwwexport.this.AV95BarColNom = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexport.this.AV96BarColNum = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexport.this.AV97HisProdti = GXv_dtime17[0] ;
                                    consultamaquinasproduccionwwexport.this.AV98HisProdtf = GXv_dtime16[0] ;
                                    consultamaquinasproduccionwwexport.this.AV99HisProF = GXv_char9[0] ;
                                    GXt_char4 = "" ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV95BarColNom, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int15[0] = AV91CliCod ;
                                    GXv_char14[0] = AV92CliNom ;
                                    GXv_char12[0] = AV93BarSer ;
                                    GXv_char11[0] = AV94BarSerDsc ;
                                    GXv_char10[0] = AV95BarColNom ;
                                    GXv_int7[0] = AV96BarColNum ;
                                    GXv_dtime17[0] = AV97HisProdti ;
                                    GXv_dtime16[0] = AV98HisProdtf ;
                                    GXv_char9[0] = AV99HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV83EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int15, GXv_char14, GXv_char12, GXv_char11, GXv_char10, GXv_int7, GXv_dtime17, GXv_dtime16, GXv_char9) ;
                                    consultamaquinasproduccionwwexport.this.AV91CliCod = GXv_int15[0] ;
                                    consultamaquinasproduccionwwexport.this.AV92CliNom = GXv_char14[0] ;
                                    consultamaquinasproduccionwwexport.this.AV93BarSer = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexport.this.AV94BarSerDsc = GXv_char11[0] ;
                                    consultamaquinasproduccionwwexport.this.AV95BarColNom = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexport.this.AV96BarColNum = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexport.this.AV97HisProdti = GXv_dtime17[0] ;
                                    consultamaquinasproduccionwwexport.this.AV98HisProdtf = GXv_dtime16[0] ;
                                    consultamaquinasproduccionwwexport.this.AV99HisProF = GXv_char9[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( AV96BarColNum );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int15[0] = AV91CliCod ;
                                    GXv_char14[0] = AV92CliNom ;
                                    GXv_char12[0] = AV93BarSer ;
                                    GXv_char11[0] = AV94BarSerDsc ;
                                    GXv_char10[0] = AV95BarColNom ;
                                    GXv_int7[0] = AV96BarColNum ;
                                    GXv_dtime17[0] = AV97HisProdti ;
                                    GXv_dtime16[0] = AV98HisProdtf ;
                                    GXv_char9[0] = AV99HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV83EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int15, GXv_char14, GXv_char12, GXv_char11, GXv_char10, GXv_int7, GXv_dtime17, GXv_dtime16, GXv_char9) ;
                                    consultamaquinasproduccionwwexport.this.AV91CliCod = GXv_int15[0] ;
                                    consultamaquinasproduccionwwexport.this.AV92CliNom = GXv_char14[0] ;
                                    consultamaquinasproduccionwwexport.this.AV93BarSer = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexport.this.AV94BarSerDsc = GXv_char11[0] ;
                                    consultamaquinasproduccionwwexport.this.AV95BarColNom = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexport.this.AV96BarColNum = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexport.this.AV97HisProdti = GXv_dtime17[0] ;
                                    consultamaquinasproduccionwwexport.this.AV98HisProdtf = GXv_dtime16[0] ;
                                    consultamaquinasproduccionwwexport.this.AV99HisProF = GXv_char9[0] ;
                                    AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( AV97HisProdti );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXv_int15[0] = AV91CliCod ;
                                    GXv_char14[0] = AV92CliNom ;
                                    GXv_char12[0] = AV93BarSer ;
                                    GXv_char11[0] = AV94BarSerDsc ;
                                    GXv_char10[0] = AV95BarColNom ;
                                    GXv_int7[0] = AV96BarColNum ;
                                    GXv_dtime17[0] = AV97HisProdti ;
                                    GXv_dtime16[0] = AV98HisProdtf ;
                                    GXv_char9[0] = AV99HisProF ;
                                    new app.produccion.consultamaquinasproducciondatos_pr(remoteHandle, context).execute( AV83EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1166LecMaqCod, A1188LecFasOrd, GXv_int15, GXv_char14, GXv_char12, GXv_char11, GXv_char10, GXv_int7, GXv_dtime17, GXv_dtime16, GXv_char9) ;
                                    consultamaquinasproduccionwwexport.this.AV91CliCod = GXv_int15[0] ;
                                    consultamaquinasproduccionwwexport.this.AV92CliNom = GXv_char14[0] ;
                                    consultamaquinasproduccionwwexport.this.AV93BarSer = GXv_char12[0] ;
                                    consultamaquinasproduccionwwexport.this.AV94BarSerDsc = GXv_char11[0] ;
                                    consultamaquinasproduccionwwexport.this.AV95BarColNom = GXv_char10[0] ;
                                    consultamaquinasproduccionwwexport.this.AV96BarColNum = GXv_int7[0] ;
                                    consultamaquinasproduccionwwexport.this.AV97HisProdti = GXv_dtime17[0] ;
                                    consultamaquinasproduccionwwexport.this.AV98HisProdtf = GXv_dtime16[0] ;
                                    consultamaquinasproduccionwwexport.this.AV99HisProF = GXv_char9[0] ;
                                    AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( AV98HisProdtf );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14259lecOpeNom, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14260LecFasDsc, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = "" ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14261LecParNom, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                 {
                                    GXt_char4 = AV118PedidoCliente ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.produccion.pedidocliente_pr(remoteHandle, context).execute( AV83EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV118PedidoCliente = GXt_char4 ;
                                    GXt_char4 = "" ;
                                    GXv_char14[0] = GXt_char4 ;
                                    new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV118PedidoCliente, GXv_char14) ;
                                    consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                    AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                 }
                                 /* Execute user subroutine: 'AFTERWRITELINE' */
                                 S192 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    returnInSub = true;
                                    if (true) return;
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

   public void S201( )
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

   public void S161( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecMaqCod", "", "Máquina", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&MaqDsc", "", "Descrip.Máquina", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecFec", "", "Fecha", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecOpeCod", "", "Operario", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&OpeNom", "", "Nombre", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecHdr", "", "Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecEstado", "", "Estado", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecParCod", "", "Paro", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&ParCodNom", "", "Descripción", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&Texto1", "", "Observación", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&CliCod", "", "Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&CliNom", "", "Nombre", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarSer", "", "Artículo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarSerDsc", "", "Descrip.Artículo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarColNom", "", "Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarColNum", "", "Número", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&HisProdti", "", "Inicio", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&HisProdtf", "", "Fin", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&HisProF", "", "Fin?", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "lecOpeNom", "", "Nombre", false, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecFasDsc", "", "Descripcion", false, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "LecParNom", "", "Descripcion", false, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&PedidoCliente", "", "", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char14[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultaMaquinasProduccionWWColumnsSelector", GXv_char14) ;
      consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
      AV28UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector18[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector19[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, GXv_SdtWWPColumnsSelector19) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector18[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      }
   }

   public void S211( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("ConsultaMaquinasProduccionWWGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultaMaquinasProduccionWWGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("ConsultaMaquinasProduccionWWGridState"), null, null);
      }
      AV16OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV124GXV2 = 1 ;
      while ( AV124GXV2 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV124GXV2));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "LECESTADO") == 0 )
         {
            AV73LecEstado = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV35TFLecMaqCod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD_SEL") == 0 )
         {
            AV36TFLecMaqCod_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV53TFLecFec = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV43TFLecOpeCod = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFLecOpeCod_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR") == 0 )
         {
            AV69TFLecHdr = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR_SEL") == 0 )
         {
            AV70TFLecHdr_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV72TFLecEstado_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV49TFLecParCod = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFLecParCod_To = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV112TFlecOpeNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM_SEL") == 0 )
         {
            AV113TFlecOpeNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV114TFLecFasDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC_SEL") == 0 )
         {
            AV115TFLecFasDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV116TFLecParNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM_SEL") == 0 )
         {
            AV117TFLecParNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV124GXV2 = (int)(AV124GXV2+1) ;
      }
   }

   public void S182( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S192( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S221( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char4 = AV82Station ;
      GXv_char14[0] = GXt_char4 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char14) ;
      consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
      AV82Station = GXt_char4 ;
      GXv_char14[0] = AV83EmprCod ;
      GXv_char12[0] = AV84EmprNom ;
      GXv_char11[0] = AV85UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV82Station, GXv_char14, GXv_char12, GXv_char11) ;
      consultamaquinasproduccionwwexport.this.AV83EmprCod = GXv_char14[0] ;
      consultamaquinasproduccionwwexport.this.AV84EmprNom = GXv_char12[0] ;
      consultamaquinasproduccionwwexport.this.AV85UsurCod = GXv_char11[0] ;
      AV19LecMaqCod = GXutil.upper( GXutil.trim( AV86WebSession.getValue("FiltroConsultaMaquinasProduccion_LecMaqCod"))) ;
      AV86WebSession.remove("FiltroConsultaMaquinasProduccion_LecMaqCod");
      GXt_char4 = AV89MaqDscInicial ;
      GXv_char14[0] = GXt_char4 ;
      new app.pobtmaq(remoteHandle, context).execute( AV83EmprCod, AV19LecMaqCod, GXv_char14) ;
      consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
      AV89MaqDscInicial = GXt_char4 ;
      AV79LecMaqCod_To = GXutil.upper( GXutil.trim( AV86WebSession.getValue("FiltroConsultaMaquinasProduccion_LecMaqCod_To"))) ;
      AV86WebSession.remove("FiltroConsultaMaquinasProduccion_LecMaqCod_To");
      GXt_char4 = AV90MaqDscFinal ;
      GXv_char14[0] = GXt_char4 ;
      new app.pobtmaq(remoteHandle, context).execute( AV83EmprCod, AV79LecMaqCod_To, GXv_char14) ;
      consultamaquinasproduccionwwexport.this.GXt_char4 = GXv_char14[0] ;
      AV90MaqDscFinal = GXt_char4 ;
      AV73LecEstado = GXutil.upper( GXutil.trim( AV86WebSession.getValue("FiltroConsultaMaquinasProduccion_LecEstado"))) ;
      AV86WebSession.remove("FiltroConsultaMaquinasProduccion_LecEstado");
   }

   public void S141( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV84EmprNom+" "+"("+AV125Pgmdesc+")" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Maquina Inicial: ", "")+" "+AV19LecMaqCod+" "+AV89MaqDscInicial );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Maquina Final: ", "")+" "+AV79LecMaqCod_To+" "+AV90MaqDscFinal );
      if ( (GXutil.strcmp("", GXutil.trim( AV73LecEstado))==0) )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Estado: ", "")+" "+httpContext.getMessage( "Todos", "") );
      }
      else if ( GXutil.strcmp(GXutil.trim( AV73LecEstado), httpContext.getMessage( "P", "")) == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Estado: ", "")+" "+httpContext.getMessage( "Proceso", "") );
      }
      else if ( GXutil.strcmp(GXutil.trim( AV73LecEstado), httpContext.getMessage( "F", "")) == 0 )
      {
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Estado: ", "")+" "+httpContext.getMessage( "Finalizadas", "") );
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = consultamaquinasproduccionwwexport.this.AV11Filename;
      this.aP1[0] = consultamaquinasproduccionwwexport.this.AV12ErrorMessage;
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
      AV73LecEstado = "" ;
      AV36TFLecMaqCod_Sel = "" ;
      AV35TFLecMaqCod = "" ;
      AV53TFLecFec = GXutil.nullDate() ;
      AV70TFLecHdr_Sel = "" ;
      AV69TFLecHdr = "" ;
      AV72TFLecEstado_Sel = "" ;
      AV113TFlecOpeNom_Sel = "" ;
      AV112TFlecOpeNom = "" ;
      AV115TFLecFasDsc_Sel = "" ;
      AV114TFLecFasDsc = "" ;
      AV117TFLecParNom_Sel = "" ;
      AV116TFLecParNom = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      AV20Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
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
      lV69TFLecHdr = "" ;
      AV19LecMaqCod = "" ;
      AV79LecMaqCod_To = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A13722LecEstado = "" ;
      P08DG2_A13721LecHdr = new String[] {""} ;
      P08DG2_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DG2_n1174LecFec = new boolean[] {false} ;
      P08DG2_A1166LecMaqCod = new String[] {""} ;
      P08DG2_A1188LecFasOrd = new short[1] ;
      P08DG2_n1188LecFasOrd = new boolean[] {false} ;
      P08DG2_A1169LecBarPar = new String[] {""} ;
      P08DG2_n1169LecBarPar = new boolean[] {false} ;
      P08DG2_A1168LecBarReo = new byte[1] ;
      P08DG2_n1168LecBarReo = new boolean[] {false} ;
      P08DG2_A1167LecBarCod = new int[1] ;
      P08DG2_n1167LecBarCod = new boolean[] {false} ;
      P08DG2_A1170LecOpeCod = new int[1] ;
      P08DG2_n1170LecOpeCod = new boolean[] {false} ;
      P08DG2_A1171LecFasCod = new String[] {""} ;
      P08DG2_n1171LecFasCod = new boolean[] {false} ;
      P08DG2_A1172LecParCod = new short[1] ;
      P08DG2_n1172LecParCod = new boolean[] {false} ;
      P08DG2_A396EmprCod = new String[] {""} ;
      AV76MaqDsc = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV65OpeNom = "" ;
      P08DG3_A396EmprCod = new String[] {""} ;
      P08DG3_A656ParCod = new short[1] ;
      P08DG3_A867ParCodNom = new String[] {""} ;
      P08DG3_n867ParCodNom = new boolean[] {false} ;
      A867ParCodNom = "" ;
      AV67ParCodNom = "" ;
      AV68Texto1 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int3 = new short[1] ;
      GXv_int13 = new short[1] ;
      AV83EmprCod = "" ;
      AV92CliNom = "" ;
      AV93BarSer = "" ;
      AV94BarSerDsc = "" ;
      AV95BarColNom = "" ;
      AV97HisProdti = GXutil.resetTime( GXutil.nullDate() );
      AV98HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      AV99HisProF = "" ;
      GXv_int15 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_dtime17 = new java.util.Date[1] ;
      GXv_dtime16 = new java.util.Date[1] ;
      GXv_char9 = new String[1] ;
      AV118PedidoCliente = "" ;
      AV28UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector18 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector19 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV82Station = "" ;
      AV84EmprNom = "" ;
      GXv_char12 = new String[1] ;
      AV85UsurCod = "" ;
      GXv_char11 = new String[1] ;
      AV86WebSession = httpContext.getWebSession();
      AV89MaqDscInicial = "" ;
      AV90MaqDscFinal = "" ;
      GXt_char4 = "" ;
      GXv_char14 = new String[1] ;
      AV125Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultamaquinasproduccionwwexport__default(),
         new Object[] {
             new Object[] {
            P08DG2_A13721LecHdr, P08DG2_A1174LecFec, P08DG2_n1174LecFec, P08DG2_A1166LecMaqCod, P08DG2_A1188LecFasOrd, P08DG2_n1188LecFasOrd, P08DG2_A1169LecBarPar, P08DG2_n1169LecBarPar, P08DG2_A1168LecBarReo, P08DG2_n1168LecBarReo,
            P08DG2_A1167LecBarCod, P08DG2_n1167LecBarCod, P08DG2_A1170LecOpeCod, P08DG2_n1170LecOpeCod, P08DG2_A1171LecFasCod, P08DG2_n1171LecFasCod, P08DG2_A1172LecParCod, P08DG2_n1172LecParCod, P08DG2_A396EmprCod
            }
            , new Object[] {
            P08DG3_A396EmprCod, P08DG3_A656ParCod, P08DG3_A867ParCodNom, P08DG3_n867ParCodNom
            }
         }
      );
      AV125Pgmdesc = httpContext.getMessage( "Informe Maquinas Producción - Lector Optico", "") ;
      /* GeneXus formulas. */
      AV125Pgmdesc = httpContext.getMessage( "Informe Maquinas Producción - Lector Optico", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private byte AV123GXLvl283 ;
   private byte GXv_int8[] ;
   private short AV49TFLecParCod ;
   private short AV50TFLecParCod_To ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short AV16OrderedBy ;
   private short A656ParCod ;
   private short GXv_int3[] ;
   private short GXv_int13[] ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV43TFLecOpeCod ;
   private int AV44TFLecOpeCod_To ;
   private int AV121GXV1 ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int AV91CliCod ;
   private int AV96BarColNum ;
   private int GXv_int15[] ;
   private int GXv_int7[] ;
   private int AV124GXV2 ;
   private long AV32VisibleColumnCount ;
   private String AV73LecEstado ;
   private String AV36TFLecMaqCod_Sel ;
   private String AV35TFLecMaqCod ;
   private String AV70TFLecHdr_Sel ;
   private String AV69TFLecHdr ;
   private String AV72TFLecEstado_Sel ;
   private String AV113TFlecOpeNom_Sel ;
   private String AV112TFlecOpeNom ;
   private String AV115TFLecFasDsc_Sel ;
   private String AV114TFLecFasDsc ;
   private String AV117TFLecParNom_Sel ;
   private String AV116TFLecParNom ;
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
   private String lV69TFLecHdr ;
   private String AV19LecMaqCod ;
   private String AV79LecMaqCod_To ;
   private String A13722LecEstado ;
   private String AV76MaqDsc ;
   private String AV65OpeNom ;
   private String A867ParCodNom ;
   private String AV67ParCodNom ;
   private String GXv_char5[] ;
   private String AV83EmprCod ;
   private String AV92CliNom ;
   private String AV93BarSer ;
   private String AV94BarSerDsc ;
   private String AV95BarColNom ;
   private String AV99HisProF ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String AV118PedidoCliente ;
   private String AV82Station ;
   private String AV84EmprNom ;
   private String GXv_char12[] ;
   private String AV85UsurCod ;
   private String GXv_char11[] ;
   private String AV89MaqDscInicial ;
   private String AV90MaqDscFinal ;
   private String GXt_char4 ;
   private String GXv_char14[] ;
   private String AV125Pgmdesc ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV97HisProdti ;
   private java.util.Date AV98HisProdtf ;
   private java.util.Date GXv_dtime17[] ;
   private java.util.Date GXv_dtime16[] ;
   private java.util.Date AV53TFLecFec ;
   private java.util.Date A1174LecFec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1174LecFec ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private boolean n867ParCodNom ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV68Texto1 ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.WebSession AV86WebSession ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08DG2_A13721LecHdr ;
   private java.util.Date[] P08DG2_A1174LecFec ;
   private boolean[] P08DG2_n1174LecFec ;
   private String[] P08DG2_A1166LecMaqCod ;
   private short[] P08DG2_A1188LecFasOrd ;
   private boolean[] P08DG2_n1188LecFasOrd ;
   private String[] P08DG2_A1169LecBarPar ;
   private boolean[] P08DG2_n1169LecBarPar ;
   private byte[] P08DG2_A1168LecBarReo ;
   private boolean[] P08DG2_n1168LecBarReo ;
   private int[] P08DG2_A1167LecBarCod ;
   private boolean[] P08DG2_n1167LecBarCod ;
   private int[] P08DG2_A1170LecOpeCod ;
   private boolean[] P08DG2_n1170LecOpeCod ;
   private String[] P08DG2_A1171LecFasCod ;
   private boolean[] P08DG2_n1171LecFasCod ;
   private short[] P08DG2_A1172LecParCod ;
   private boolean[] P08DG2_n1172LecParCod ;
   private String[] P08DG2_A396EmprCod ;
   private String[] P08DG3_A396EmprCod ;
   private short[] P08DG3_A656ParCod ;
   private String[] P08DG3_A867ParCodNom ;
   private boolean[] P08DG3_n867ParCodNom ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector18[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector19[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class consultamaquinasproduccionwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV36TFLecMaqCod_Sel ,
                                          String AV35TFLecMaqCod ,
                                          java.util.Date AV53TFLecFec ,
                                          int AV43TFLecOpeCod ,
                                          int AV44TFLecOpeCod_To ,
                                          String AV70TFLecHdr_Sel ,
                                          String AV69TFLecHdr ,
                                          short AV49TFLecParCod ,
                                          short AV50TFLecParCod_To ,
                                          String AV19LecMaqCod ,
                                          String AV79LecMaqCod_To ,
                                          String A1166LecMaqCod ,
                                          java.util.Date A1174LecFec ,
                                          int A1170LecOpeCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          short A1172LecParCod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV73LecEstado ,
                                          String A13722LecEstado ,
                                          String AV72TFLecEstado_Sel ,
                                          String AV113TFlecOpeNom_Sel ,
                                          String AV112TFlecOpeNom ,
                                          String A14259lecOpeNom ,
                                          String AV115TFLecFasDsc_Sel ,
                                          String AV114TFLecFasDsc ,
                                          String A14260LecFasDsc ,
                                          String AV117TFLecParNom_Sel ,
                                          String AV116TFLecParNom ,
                                          String A14261LecParNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[11];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE( LecBarPar, '') AS LecHdr, LecFec," ;
      scmdbuf += " LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFLecMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFLecMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFLecFec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (0==AV43TFLecOpeCod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (0==AV44TFLecOpeCod_To) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70TFLecHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV69TFLecHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70TFLecHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (0==AV49TFLecParCod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (0==AV50TFLecParCod_To) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19LecMaqCod)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod >= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79LecMaqCod_To)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod <= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecOpeCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecOpeCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecHdr" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecHdr DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY LecParCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LecParCod DESC" ;
      }
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P08DG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08DG3", "SELECT EmprCod, ParCod, ParCodNom FROM TXPCODPAR WHERE EmprCod = ? and ParCod = ? ORDER BY EmprCod, ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

