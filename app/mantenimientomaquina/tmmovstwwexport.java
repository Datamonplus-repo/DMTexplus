package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmmovstwwexport extends GXProcedure
{
   public tmmovstwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmmovstwwexport.class ), "" );
   }

   public tmmovstwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmmovstwwexport.this.aP1 = new String[] {""};
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
      tmmovstwwexport.this.aP0 = aP0;
      tmmovstwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TMMovStWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77FilterFullText, GXv_char5) ;
      tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV52TFMMSCod) && (0==AV53TFMMSCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod. Mov Stock", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFMMSCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFMMSCod_To );
      }
      if ( ! ( ( AV55TFMMSTpo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV76i = 1 ;
         AV80GXV1 = 1 ;
         while ( AV80GXV1 <= AV55TFMMSTpo_Sels.size() )
         {
            AV56TFMMSTpo_Sel = (String)AV55TFMMSTpo_Sels.elementAt(-1+AV80GXV1) ;
            if ( AV76i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV56TFMMSTpo_Sel), httpContext.getMessage( "E", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Entrada", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV56TFMMSTpo_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Salida", "") );
            }
            AV76i = (long)(AV76i+1) ;
            AV80GXV1 = (int)(AV80GXV1+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61TFMMSFch)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV61TFMMSFch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV60TFMMSPrvNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFMMSPrvNom_Sel, GXv_char5) ;
         tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV59TFMMSPrvNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFMMSPrvNom, GXv_char5) ;
            tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV57TFMMSPrvNum) && (0==AV58TFMMSPrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV57TFMMSPrvNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV58TFMMSPrvNum_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFMMSDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFMMSDto_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "% Descuento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV74TFMMSDto)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV75TFMMSDto_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV70TFMMSNroExt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nro Externo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFMMSNroExt_Sel, GXv_char5) ;
         tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFMMSNroExt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nro Externo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFMMSNroExt, GXv_char5) ;
            tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV64TFMMSUsuCre_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario que crea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFMMSUsuCre_Sel, GXv_char5) ;
         tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFMMSUsuCre)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario que crea", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFMMSUsuCre, GXv_char5) ;
            tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV65TFMMSFchCre) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha de Creación", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV65TFMMSFchCre );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV67TFMMSFchApl) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha de Aplicación", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV67TFMMSFchApl );
      }
      if ( ! ( ( AV72TFMMSEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmmovstwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV76i = 1 ;
         AV81GXV2 = 1 ;
         while ( AV81GXV2 <= AV72TFMMSEst_Sels.size() )
         {
            AV73TFMMSEst_Sel = (String)AV72TFMMSEst_Sels.elementAt(-1+AV81GXV2) ;
            if ( AV76i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV73TFMMSEst_Sel), httpContext.getMessage( "E", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En ingreso", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV73TFMMSEst_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Aplicado", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV73TFMMSEst_Sel), httpContext.getMessage( "C", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Cancelado", "") );
            }
            AV76i = (long)(AV76i+1) ;
            AV81GXV2 = (int)(AV81GXV2+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV45VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV33Session.getValue("MantenimientoMaquina.TMMovStWWColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("MantenimientoMaquina.TMMovStWWColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV82GXV3 = 1 ;
      while ( AV82GXV3 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV82GXV3));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV82GXV3 = (int)(AV82GXV3+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext = AV77FilterFullText ;
      AV85Mantenimientomaquina_tmmovstwwds_2_tfmmscod = AV52TFMMSCod ;
      AV86Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to = AV53TFMMSCod_To ;
      AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels = AV55TFMMSTpo_Sels ;
      AV88Mantenimientomaquina_tmmovstwwds_5_tfmmsfch = AV61TFMMSFch ;
      AV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = AV59TFMMSPrvNom ;
      AV90Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel = AV60TFMMSPrvNom_Sel ;
      AV91Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum = AV57TFMMSPrvNum ;
      AV92Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to = AV58TFMMSPrvNum_To ;
      AV93Mantenimientomaquina_tmmovstwwds_10_tfmmsdto = AV74TFMMSDto ;
      AV94Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to = AV75TFMMSDto_To ;
      AV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = AV69TFMMSNroExt ;
      AV96Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel = AV70TFMMSNroExt_Sel ;
      AV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = AV63TFMMSUsuCre ;
      AV98Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel = AV64TFMMSUsuCre_Sel ;
      AV99Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre = AV65TFMMSFchCre ;
      AV100Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl = AV67TFMMSFchApl ;
      AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels = AV72TFMMSEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9413MMSTpo ,
                                           AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                           A9420MMSEst ,
                                           AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                           Integer.valueOf(AV85Mantenimientomaquina_tmmovstwwds_2_tfmmscod) ,
                                           Integer.valueOf(AV86Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) ,
                                           Integer.valueOf(AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels.size()) ,
                                           AV88Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                           AV90Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                           AV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                           Integer.valueOf(AV91Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) ,
                                           Integer.valueOf(AV92Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) ,
                                           AV93Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                           AV94Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                           AV96Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                           AV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                           AV98Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                           AV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                           AV99Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                           AV100Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                           Integer.valueOf(AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels.size()) ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9416MMSFch ,
                                           A9415MMSPrvNom ,
                                           Integer.valueOf(A9414MMSPrvNum) ,
                                           A11509MMSDto ,
                                           A9419MMSNroExt ,
                                           A9417MMSUsuCre ,
                                           A9418MMSFchCre ,
                                           A11304MMSFchApl ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = GXutil.padr( GXutil.rtrim( AV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom), 30, "%") ;
      lV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = GXutil.padr( GXutil.rtrim( AV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext), 20, "%") ;
      lV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = GXutil.padr( GXutil.rtrim( AV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre), 10, "%") ;
      /* Using cursor P08DR2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV85Mantenimientomaquina_tmmovstwwds_2_tfmmscod), Integer.valueOf(AV86Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to), AV88Mantenimientomaquina_tmmovstwwds_5_tfmmsfch, lV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom, AV90Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel, Integer.valueOf(AV91Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum), Integer.valueOf(AV92Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to), AV93Mantenimientomaquina_tmmovstwwds_10_tfmmsdto, AV94Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to, lV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext, AV96Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel, lV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre, AV98Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel, AV99Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre, AV100Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08DR2_A396EmprCod[0] ;
         A11304MMSFchApl = P08DR2_A11304MMSFchApl[0] ;
         n11304MMSFchApl = P08DR2_n11304MMSFchApl[0] ;
         A9418MMSFchCre = P08DR2_A9418MMSFchCre[0] ;
         n9418MMSFchCre = P08DR2_n9418MMSFchCre[0] ;
         A9417MMSUsuCre = P08DR2_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = P08DR2_n9417MMSUsuCre[0] ;
         A9419MMSNroExt = P08DR2_A9419MMSNroExt[0] ;
         n9419MMSNroExt = P08DR2_n9419MMSNroExt[0] ;
         A11509MMSDto = P08DR2_A11509MMSDto[0] ;
         n11509MMSDto = P08DR2_n11509MMSDto[0] ;
         A9414MMSPrvNum = P08DR2_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = P08DR2_n9414MMSPrvNum[0] ;
         A9415MMSPrvNom = P08DR2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DR2_n9415MMSPrvNom[0] ;
         A9416MMSFch = P08DR2_A9416MMSFch[0] ;
         n9416MMSFch = P08DR2_n9416MMSFch[0] ;
         A9412MMSCod = P08DR2_A9412MMSCod[0] ;
         A9420MMSEst = P08DR2_A9420MMSEst[0] ;
         n9420MMSEst = P08DR2_n9420MMSEst[0] ;
         A9413MMSTpo = P08DR2_A9413MMSTpo[0] ;
         n9413MMSTpo = P08DR2_n9413MMSTpo[0] ;
         A9415MMSPrvNom = P08DR2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DR2_n9415MMSPrvNom[0] ;
         if ( (GXutil.strcmp("", AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9412MMSCod, 8, 0) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "entrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "salida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9415MMSPrvNom) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9414MMSPrvNum, 6, 0) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11509MMSDto, 6, 2) , GXutil.padr( "%" + AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9419MMSNroExt) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9417MMSUsuCre) , GXutil.padr( "%" + GXutil.upper( AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "C", "")) == 0 ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV45VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A9412MMSCod );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A9413MMSTpo), httpContext.getMessage( "E", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Entrada", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A9413MMSTpo), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Salida", "") );
               }
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A9416MMSFch );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9415MMSPrvNom, GXv_char5) ;
               tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( A9414MMSPrvNum );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A11509MMSDto)) );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9419MMSNroExt, GXv_char5) ;
               tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9417MMSUsuCre, GXv_char5) ;
               tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setDate( A9418MMSFchCre );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setDate( A11304MMSFchApl );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), httpContext.getMessage( "E", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En ingreso", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), httpContext.getMessage( "A", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Aplicado", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), httpContext.getMessage( "C", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Cancelado", "") );
               }
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
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
      AV37ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSCod", "", "Cod. Mov Stock", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSTpo", "", "Tipo", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSFch", "", "Fecha", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSPrvNom", "", "Proveedor", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSPrvNum", "", "Cod Proveedor", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSDto", "", "% Descuento", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSNroExt", "", "Nro Externo", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSUsuCre", "", "Usuario que crea", false, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSFchCre", "", "Fecha de Creación", false, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSFchApl", "", "Fecha de Aplicación", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MMSEst", "", "Estado", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMMovStWWColumnsSelector", GXv_char5) ;
      tmmovstwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV41UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV38ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV37ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV38ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV37ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("MantenimientoMaquina.TMMovStWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMMovStWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("MantenimientoMaquina.TMMovStWWGridState"), null, null);
      }
      AV16OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV102GXV4 = 1 ;
      while ( AV102GXV4 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV4));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV77FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSCOD") == 0 )
         {
            AV52TFMMSCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFMMSCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSTPO_SEL") == 0 )
         {
            AV54TFMMSTpo_SelsJson = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFMMSTpo_Sels.fromJSonString(AV54TFMMSTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCH") == 0 )
         {
            AV61TFMMSFch = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM") == 0 )
         {
            AV59TFMMSPrvNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM_SEL") == 0 )
         {
            AV60TFMMSPrvNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNUM") == 0 )
         {
            AV57TFMMSPrvNum = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFMMSPrvNum_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSDTO") == 0 )
         {
            AV74TFMMSDto = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV75TFMMSDto_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT") == 0 )
         {
            AV69TFMMSNroExt = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT_SEL") == 0 )
         {
            AV70TFMMSNroExt_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE") == 0 )
         {
            AV63TFMMSUsuCre = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE_SEL") == 0 )
         {
            AV64TFMMSUsuCre_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHCRE") == 0 )
         {
            AV65TFMMSFchCre = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHAPL") == 0 )
         {
            AV67TFMMSFchApl = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSEST_SEL") == 0 )
         {
            AV71TFMMSEst_SelsJson = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV72TFMMSEst_Sels.fromJSonString(AV71TFMMSEst_SelsJson, null);
         }
         AV102GXV4 = (int)(AV102GXV4+1) ;
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
      this.aP0[0] = tmmovstwwexport.this.AV11Filename;
      this.aP1[0] = tmmovstwwexport.this.AV12ErrorMessage;
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
      AV77FilterFullText = "" ;
      AV55TFMMSTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56TFMMSTpo_Sel = "" ;
      AV61TFMMSFch = GXutil.nullDate() ;
      AV60TFMMSPrvNom_Sel = "" ;
      AV59TFMMSPrvNom = "" ;
      AV74TFMMSDto = DecimalUtil.ZERO ;
      AV75TFMMSDto_To = DecimalUtil.ZERO ;
      AV70TFMMSNroExt_Sel = "" ;
      AV69TFMMSNroExt = "" ;
      AV64TFMMSUsuCre_Sel = "" ;
      AV63TFMMSUsuCre = "" ;
      AV65TFMMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV67TFMMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      AV72TFMMSEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV73TFMMSEst_Sel = "" ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9413MMSTpo = "" ;
      A9416MMSFch = GXutil.nullDate() ;
      A9415MMSPrvNom = "" ;
      A11509MMSDto = DecimalUtil.ZERO ;
      A9419MMSNroExt = "" ;
      A9417MMSUsuCre = "" ;
      A9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      A9420MMSEst = "" ;
      AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext = "" ;
      AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV88Mantenimientomaquina_tmmovstwwds_5_tfmmsfch = GXutil.nullDate() ;
      AV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = "" ;
      AV90Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel = "" ;
      AV93Mantenimientomaquina_tmmovstwwds_10_tfmmsdto = DecimalUtil.ZERO ;
      AV94Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to = DecimalUtil.ZERO ;
      AV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = "" ;
      AV96Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel = "" ;
      AV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = "" ;
      AV98Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel = "" ;
      AV99Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV100Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl = GXutil.resetTime( GXutil.nullDate() );
      AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = "" ;
      lV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = "" ;
      lV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = "" ;
      P08DR2_A396EmprCod = new String[] {""} ;
      P08DR2_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P08DR2_n11304MMSFchApl = new boolean[] {false} ;
      P08DR2_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08DR2_n9418MMSFchCre = new boolean[] {false} ;
      P08DR2_A9417MMSUsuCre = new String[] {""} ;
      P08DR2_n9417MMSUsuCre = new boolean[] {false} ;
      P08DR2_A9419MMSNroExt = new String[] {""} ;
      P08DR2_n9419MMSNroExt = new boolean[] {false} ;
      P08DR2_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08DR2_n11509MMSDto = new boolean[] {false} ;
      P08DR2_A9414MMSPrvNum = new int[1] ;
      P08DR2_n9414MMSPrvNum = new boolean[] {false} ;
      P08DR2_A9415MMSPrvNom = new String[] {""} ;
      P08DR2_n9415MMSPrvNom = new boolean[] {false} ;
      P08DR2_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DR2_n9416MMSFch = new boolean[] {false} ;
      P08DR2_A9412MMSCod = new int[1] ;
      P08DR2_A9420MMSEst = new String[] {""} ;
      P08DR2_n9420MMSEst = new boolean[] {false} ;
      P08DR2_A9413MMSTpo = new String[] {""} ;
      P08DR2_n9413MMSTpo = new boolean[] {false} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54TFMMSTpo_SelsJson = "" ;
      AV71TFMMSEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmmovstwwexport__default(),
         new Object[] {
             new Object[] {
            P08DR2_A396EmprCod, P08DR2_A11304MMSFchApl, P08DR2_n11304MMSFchApl, P08DR2_A9418MMSFchCre, P08DR2_n9418MMSFchCre, P08DR2_A9417MMSUsuCre, P08DR2_n9417MMSUsuCre, P08DR2_A9419MMSNroExt, P08DR2_n9419MMSNroExt, P08DR2_A11509MMSDto,
            P08DR2_n11509MMSDto, P08DR2_A9414MMSPrvNum, P08DR2_n9414MMSPrvNum, P08DR2_A9415MMSPrvNom, P08DR2_n9415MMSPrvNom, P08DR2_A9416MMSFch, P08DR2_n9416MMSFch, P08DR2_A9412MMSCod, P08DR2_A9420MMSEst, P08DR2_n9420MMSEst,
            P08DR2_A9413MMSTpo, P08DR2_n9413MMSTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV52TFMMSCod ;
   private int AV53TFMMSCod_To ;
   private int AV80GXV1 ;
   private int AV57TFMMSPrvNum ;
   private int AV58TFMMSPrvNum_To ;
   private int AV81GXV2 ;
   private int AV82GXV3 ;
   private int A9412MMSCod ;
   private int A9414MMSPrvNum ;
   private int AV85Mantenimientomaquina_tmmovstwwds_2_tfmmscod ;
   private int AV86Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to ;
   private int AV91Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum ;
   private int AV92Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to ;
   private int AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size ;
   private int AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size ;
   private int AV102GXV4 ;
   private long AV76i ;
   private long AV45VisibleColumnCount ;
   private java.math.BigDecimal AV74TFMMSDto ;
   private java.math.BigDecimal AV75TFMMSDto_To ;
   private java.math.BigDecimal A11509MMSDto ;
   private java.math.BigDecimal AV93Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ;
   private java.math.BigDecimal AV94Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ;
   private String AV56TFMMSTpo_Sel ;
   private String AV60TFMMSPrvNom_Sel ;
   private String AV59TFMMSPrvNom ;
   private String AV70TFMMSNroExt_Sel ;
   private String AV69TFMMSNroExt ;
   private String AV64TFMMSUsuCre_Sel ;
   private String AV63TFMMSUsuCre ;
   private String AV73TFMMSEst_Sel ;
   private String A9413MMSTpo ;
   private String A9415MMSPrvNom ;
   private String A9419MMSNroExt ;
   private String A9417MMSUsuCre ;
   private String A9420MMSEst ;
   private String AV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ;
   private String AV90Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ;
   private String AV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ;
   private String AV96Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ;
   private String AV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ;
   private String AV98Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ;
   private String scmdbuf ;
   private String lV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ;
   private String lV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ;
   private String lV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV65TFMMSFchCre ;
   private java.util.Date AV67TFMMSFchApl ;
   private java.util.Date A9418MMSFchCre ;
   private java.util.Date A11304MMSFchApl ;
   private java.util.Date AV99Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ;
   private java.util.Date AV100Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV61TFMMSFch ;
   private java.util.Date A9416MMSFch ;
   private java.util.Date AV88Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n11304MMSFchApl ;
   private boolean n9418MMSFchCre ;
   private boolean n9417MMSUsuCre ;
   private boolean n9419MMSNroExt ;
   private boolean n11509MMSDto ;
   private boolean n9414MMSPrvNum ;
   private boolean n9415MMSPrvNom ;
   private boolean n9416MMSFch ;
   private boolean n9420MMSEst ;
   private boolean n9413MMSTpo ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV54TFMMSTpo_SelsJson ;
   private String AV71TFMMSEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV77FilterFullText ;
   private String AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private GXSimpleCollection<String> AV55TFMMSTpo_Sels ;
   private GXSimpleCollection<String> AV72TFMMSEst_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08DR2_A396EmprCod ;
   private java.util.Date[] P08DR2_A11304MMSFchApl ;
   private boolean[] P08DR2_n11304MMSFchApl ;
   private java.util.Date[] P08DR2_A9418MMSFchCre ;
   private boolean[] P08DR2_n9418MMSFchCre ;
   private String[] P08DR2_A9417MMSUsuCre ;
   private boolean[] P08DR2_n9417MMSUsuCre ;
   private String[] P08DR2_A9419MMSNroExt ;
   private boolean[] P08DR2_n9419MMSNroExt ;
   private java.math.BigDecimal[] P08DR2_A11509MMSDto ;
   private boolean[] P08DR2_n11509MMSDto ;
   private int[] P08DR2_A9414MMSPrvNum ;
   private boolean[] P08DR2_n9414MMSPrvNum ;
   private String[] P08DR2_A9415MMSPrvNom ;
   private boolean[] P08DR2_n9415MMSPrvNom ;
   private java.util.Date[] P08DR2_A9416MMSFch ;
   private boolean[] P08DR2_n9416MMSFch ;
   private int[] P08DR2_A9412MMSCod ;
   private String[] P08DR2_A9420MMSEst ;
   private boolean[] P08DR2_n9420MMSEst ;
   private String[] P08DR2_A9413MMSTpo ;
   private boolean[] P08DR2_n9413MMSTpo ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ;
   private GXSimpleCollection<String> AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV39ColumnsSelector_Column ;
}

final  class tmmovstwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9413MMSTpo ,
                                          GXSimpleCollection<String> AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                          String A9420MMSEst ,
                                          GXSimpleCollection<String> AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                          int AV85Mantenimientomaquina_tmmovstwwds_2_tfmmscod ,
                                          int AV86Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to ,
                                          int AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size ,
                                          java.util.Date AV88Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                          String AV90Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                          String AV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                          int AV91Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum ,
                                          int AV92Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to ,
                                          java.math.BigDecimal AV93Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                          java.math.BigDecimal AV94Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                          String AV96Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                          String AV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                          String AV98Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                          String AV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                          java.util.Date AV99Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                          java.util.Date AV100Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                          int AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size ,
                                          int A9412MMSCod ,
                                          java.util.Date A9416MMSFch ,
                                          String A9415MMSPrvNom ,
                                          int A9414MMSPrvNum ,
                                          java.math.BigDecimal A11509MMSDto ,
                                          String A9419MMSNroExt ,
                                          String A9417MMSUsuCre ,
                                          java.util.Date A9418MMSFchCre ,
                                          java.util.Date A11304MMSFchApl ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV84Mantenimientomaquina_tmmovstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[15];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MMSFchApl, T1.MMSFchCre, T1.MMSUsuCre, T1.MMSNroExt, T1.MMSDto, T1.MMSPrvNum AS MMSPrvNum, T2.PrvNom AS MMSPrvNom, T1.MMSFch, T1.MMSCod, T1.MMSEst," ;
      scmdbuf += " T1.MMSTpo FROM (TXPMMoStk T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.MMSPrvNum)" ;
      if ( ! (0==AV85Mantenimientomaquina_tmmovstwwds_2_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV86Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels, "T1.MMSTpo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Mantenimientomaquina_tmmovstwwds_5_tfmmsfch)) )
      {
         addWhere(sWhereString, "(T1.MMSFch >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Mantenimientomaquina_tmmovstwwds_10_tfmmsdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) && ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSNroExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSNroExt = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) && ( ! (GXutil.strcmp("", AV97Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSUsuCre = ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre) )
      {
         addWhere(sWhereString, "(T1.MMSFchCre >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV100Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl) )
      {
         addWhere(sWhereString, "(T1.MMSFchApl >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels, "T1.MMSEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSTpo" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSTpo DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFch" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFch DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSDto" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSDto DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSEst" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSEst DESC" ;
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
                  return conditional_P08DR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               return;
      }
   }

}

