package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmsolicwwexport extends GXProcedure
{
   public tmsolicwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmsolicwwexport.class ), "" );
   }

   public tmsolicwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmsolicwwexport.this.aP1 = new String[] {""};
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
      tmsolicwwexport.this.aP0 = aP0;
      tmsolicwwexport.this.aP1 = aP1;
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
      AV11Filename = "PrivateTempStorage" + "TMSolicWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFSMCod) && (0==AV35TFSMCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nro.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFSMCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFSMCod_To );
      }
      if ( ! ( ( AV47TFSMEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV56i = 1 ;
         AV64GXV1 = 1 ;
         while ( AV64GXV1 <= AV47TFSMEst_Sels.size() )
         {
            AV48TFSMEst_Sel = (String)AV47TFSMEst_Sels.elementAt(-1+AV64GXV1) ;
            if ( AV56i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV48TFSMEst_Sel), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pendiente Generación", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV48TFSMEst_Sel), httpContext.getMessage( "G", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Generada", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV48TFSMEst_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Anulada", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV48TFSMEst_Sel), httpContext.getMessage( "C", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pendiente Calificacion", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV48TFSMEst_Sel), httpContext.getMessage( "T", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Terminada", "") );
            }
            AV56i = (long)(AV56i+1) ;
            AV64GXV1 = (int)(AV64GXV1+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV38TFSMFchCre) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Creación", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV38TFSMFchCre );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFSMUsuCre_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario Creación", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFSMUsuCre_Sel, GXv_char5) ;
         tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFSMUsuCre)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario Creación", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFSMUsuCre, GXv_char5) ;
            tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFSMMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód. Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFSMMaqCod_Sel, GXv_char5) ;
         tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFSMMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód. Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFSMMaqCod, GXv_char5) ;
            tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV54TFSMPri) && (0==AV55TFSMPri_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Prioridad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFSMPri );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFSMPri_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFSMDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFSMDsc_Sel, GXv_char5) ;
         tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFSMDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFSMDsc, GXv_char5) ;
            tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFSMMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFSMMaqDsc_Sel, GXv_char5) ;
         tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFSMMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFSMMaqDsc, GXv_char5) ;
            tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV52TFSMCal_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Calificación", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV56i = 1 ;
         AV65GXV2 = 1 ;
         while ( AV65GXV2 <= AV52TFSMCal_Sels.size() )
         {
            AV53TFSMCal_Sel = ((Number) AV52TFSMCal_Sels.elementAt(-1+AV65GXV2)).byteValue() ;
            if ( AV56i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV53TFSMCal_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pesima", "") );
            }
            else if ( AV53TFSMCal_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Mala", "") );
            }
            else if ( AV53TFSMCal_Sel == 3 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Aceptable", "") );
            }
            else if ( AV53TFSMCal_Sel == 4 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Satisfactorio", "") );
            }
            else if ( AV53TFSMCal_Sel == 5 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Excelente", "") );
            }
            AV56i = (long)(AV56i+1) ;
            AV65GXV2 = (int)(AV65GXV2+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFSMTxt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Texto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFSMTxt_Sel, GXv_char5) ;
         tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFSMTxt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Texto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmsolicwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFSMTxt, GXv_char5) ;
            tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMSolicWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("TMSolicWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV66GXV3 = 1 ;
      while ( AV66GXV3 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV66GXV3));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV66GXV3 = (int)(AV66GXV3+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV68Tmsolicwwds_1_filterfulltext = AV18FilterFullText ;
      AV69Tmsolicwwds_2_tfsmcod = AV34TFSMCod ;
      AV70Tmsolicwwds_3_tfsmcod_to = AV35TFSMCod_To ;
      AV71Tmsolicwwds_4_tfsmest_sels = AV47TFSMEst_Sels ;
      AV72Tmsolicwwds_5_tfsmfchcre = AV38TFSMFchCre ;
      AV73Tmsolicwwds_6_tfsmusucre = AV40TFSMUsuCre ;
      AV74Tmsolicwwds_7_tfsmusucre_sel = AV41TFSMUsuCre_Sel ;
      AV75Tmsolicwwds_8_tfsmmaqcod = AV42TFSMMaqCod ;
      AV76Tmsolicwwds_9_tfsmmaqcod_sel = AV43TFSMMaqCod_Sel ;
      AV77Tmsolicwwds_10_tfsmpri = AV54TFSMPri ;
      AV78Tmsolicwwds_11_tfsmpri_to = AV55TFSMPri_To ;
      AV79Tmsolicwwds_12_tfsmdsc = AV36TFSMDsc ;
      AV80Tmsolicwwds_13_tfsmdsc_sel = AV37TFSMDsc_Sel ;
      AV81Tmsolicwwds_14_tfsmmaqdsc = AV44TFSMMaqDsc ;
      AV82Tmsolicwwds_15_tfsmmaqdsc_sel = AV45TFSMMaqDsc_Sel ;
      AV83Tmsolicwwds_16_tfsmcal_sels = AV52TFSMCal_Sels ;
      AV84Tmsolicwwds_17_tfsmtxt = AV49TFSMTxt ;
      AV85Tmsolicwwds_18_tfsmtxt_sel = AV50TFSMTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV71Tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV83Tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV69Tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV70Tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV71Tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV72Tmsolicwwds_5_tfsmfchcre ,
                                           AV74Tmsolicwwds_7_tfsmusucre_sel ,
                                           AV73Tmsolicwwds_6_tfsmusucre ,
                                           AV76Tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV75Tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV77Tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV78Tmsolicwwds_11_tfsmpri_to) ,
                                           AV80Tmsolicwwds_13_tfsmdsc_sel ,
                                           AV79Tmsolicwwds_12_tfsmdsc ,
                                           AV82Tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV81Tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV83Tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV85Tmsolicwwds_18_tfsmtxt_sel ,
                                           AV84Tmsolicwwds_17_tfsmtxt ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV68Tmsolicwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV73Tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV73Tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV75Tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV75Tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV79Tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV79Tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV81Tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV81Tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV84Tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV84Tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor P08EG2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV69Tmsolicwwds_2_tfsmcod), Integer.valueOf(AV70Tmsolicwwds_3_tfsmcod_to), AV72Tmsolicwwds_5_tfsmfchcre, lV73Tmsolicwwds_6_tfsmusucre, AV74Tmsolicwwds_7_tfsmusucre_sel, lV75Tmsolicwwds_8_tfsmmaqcod, AV76Tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV77Tmsolicwwds_10_tfsmpri), Byte.valueOf(AV78Tmsolicwwds_11_tfsmpri_to), lV79Tmsolicwwds_12_tfsmdsc, AV80Tmsolicwwds_13_tfsmdsc_sel, lV81Tmsolicwwds_14_tfsmmaqdsc, AV82Tmsolicwwds_15_tfsmmaqdsc_sel, lV84Tmsolicwwds_17_tfsmtxt, AV85Tmsolicwwds_18_tfsmtxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9428SMCod = P08EG2_A9428SMCod[0] ;
         n9428SMCod = P08EG2_n9428SMCod[0] ;
         A396EmprCod = P08EG2_A396EmprCod[0] ;
         A9523SMTxt = P08EG2_A9523SMTxt[0] ;
         n9523SMTxt = P08EG2_n9523SMTxt[0] ;
         A9521SMMaqDsc = P08EG2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EG2_n9521SMMaqDsc[0] ;
         A9517SMDsc = P08EG2_A9517SMDsc[0] ;
         n9517SMDsc = P08EG2_n9517SMDsc[0] ;
         A11534SMPri = P08EG2_A11534SMPri[0] ;
         A9520SMMaqCod = P08EG2_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P08EG2_n9520SMMaqCod[0] ;
         A9519SMUsuCre = P08EG2_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P08EG2_n9519SMUsuCre[0] ;
         A9518SMFchCre = P08EG2_A9518SMFchCre[0] ;
         n9518SMFchCre = P08EG2_n9518SMFchCre[0] ;
         A9524SMCal = P08EG2_A9524SMCal[0] ;
         n9524SMCal = P08EG2_n9524SMCal[0] ;
         A9522SMEst = P08EG2_A9522SMEst[0] ;
         n9522SMEst = P08EG2_n9522SMEst[0] ;
         A9521SMMaqDsc = P08EG2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EG2_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV68Tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV68Tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente generación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "generada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "G", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente calificacion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "terminada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV68Tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pesima", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mala", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aceptable", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "satisfactorio", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "excelente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV68Tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
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
               AV31VisibleColumnCount = 0 ;
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9428SMCod );
                  AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
                  if ( GXutil.strcmp(GXutil.trim( A9522SMEst), httpContext.getMessage( "P", "")) == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente Generación", "") );
                  }
                  else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), httpContext.getMessage( "G", "")) == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Generada", "") );
                  }
                  else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), httpContext.getMessage( "A", "")) == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Anulada", "") );
                  }
                  else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), httpContext.getMessage( "C", "")) == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente Calificacion", "") );
                  }
                  else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), httpContext.getMessage( "T", "")) == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Terminada", "") );
                  }
                  AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A9518SMFchCre );
                  AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9519SMUsuCre, GXv_char5) ;
                  tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9520SMMaqCod, GXv_char5) ;
                  tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A11534SMPri );
                  AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9517SMDsc, GXv_char5) ;
                  tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  /* Using cursor P08EG3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A9425OMCod = P08EG3_A9425OMCod[0] ;
                     AV59OMCod = A9425OMCod ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV59OMCod );
                  AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  /* Using cursor P08EG4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A9445OMEst = P08EG4_A9445OMEst[0] ;
                     A9425OMCod = P08EG4_A9425OMCod[0] ;
                     AV60OMEst = A9445OMEst ;
                     pr_default.readNext(2);
                  }
                  pr_default.close(2);
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
                  if ( GXutil.strcmp(GXutil.trim( AV60OMEst), httpContext.getMessage( "P", "")) == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
                  }
                  else if ( GXutil.strcmp(GXutil.trim( AV60OMEst), httpContext.getMessage( "R", "")) == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Realizada", "") );
                  }
                  AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMCod", "", "Nro.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMFchCre", "", "Fecha Creación", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMUsuCre", "", "Usuario Creación", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMMaqCod", "", "Cód. Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMPri", "", "Prioridad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMDsc", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMMaqDsc", "", "Descripción Máquina", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&SMCal", "", "Calificación", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMCal", "", "Calificación", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "SMTxt", "", "Texto", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&OMCod", "", "Orden", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&OMEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMSolicWWColumnsSelector", GXv_char5) ;
      tmsolicwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TMSolicWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMSolicWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TMSolicWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV88GXV4 = 1 ;
      while ( AV88GXV4 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV4));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV34TFSMCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFSMCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMEST_SEL") == 0 )
         {
            AV46TFSMEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV47TFSMEst_Sels.fromJSonString(AV46TFSMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMFCHCRE") == 0 )
         {
            AV38TFSMFchCre = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE") == 0 )
         {
            AV40TFSMUsuCre = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE_SEL") == 0 )
         {
            AV41TFSMUsuCre_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD") == 0 )
         {
            AV42TFSMMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD_SEL") == 0 )
         {
            AV43TFSMMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMPRI") == 0 )
         {
            AV54TFSMPri = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFSMPri_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC") == 0 )
         {
            AV36TFSMDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC_SEL") == 0 )
         {
            AV37TFSMDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC") == 0 )
         {
            AV44TFSMMaqDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC_SEL") == 0 )
         {
            AV45TFSMMaqDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCAL_SEL") == 0 )
         {
            AV51TFSMCal_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV52TFSMCal_Sels.fromJSonString(AV51TFSMCal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT") == 0 )
         {
            AV49TFSMTxt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT_SEL") == 0 )
         {
            AV50TFSMTxt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MODO") == 0 )
         {
            AV57Modo = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV88GXV4 = (int)(AV88GXV4+1) ;
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
      this.aP0[0] = tmsolicwwexport.this.AV11Filename;
      this.aP1[0] = tmsolicwwexport.this.AV12ErrorMessage;
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
      AV47TFSMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48TFSMEst_Sel = "" ;
      AV38TFSMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV41TFSMUsuCre_Sel = "" ;
      AV40TFSMUsuCre = "" ;
      AV43TFSMMaqCod_Sel = "" ;
      AV42TFSMMaqCod = "" ;
      AV37TFSMDsc_Sel = "" ;
      AV36TFSMDsc = "" ;
      AV45TFSMMaqDsc_Sel = "" ;
      AV44TFSMMaqDsc = "" ;
      AV52TFSMCal_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV50TFSMTxt_Sel = "" ;
      AV49TFSMTxt = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9522SMEst = "" ;
      A9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9519SMUsuCre = "" ;
      A9520SMMaqCod = "" ;
      A9517SMDsc = "" ;
      AV68Tmsolicwwds_1_filterfulltext = "" ;
      AV71Tmsolicwwds_4_tfsmest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV72Tmsolicwwds_5_tfsmfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV73Tmsolicwwds_6_tfsmusucre = "" ;
      AV74Tmsolicwwds_7_tfsmusucre_sel = "" ;
      AV75Tmsolicwwds_8_tfsmmaqcod = "" ;
      AV76Tmsolicwwds_9_tfsmmaqcod_sel = "" ;
      AV79Tmsolicwwds_12_tfsmdsc = "" ;
      AV80Tmsolicwwds_13_tfsmdsc_sel = "" ;
      AV81Tmsolicwwds_14_tfsmmaqdsc = "" ;
      AV82Tmsolicwwds_15_tfsmmaqdsc_sel = "" ;
      AV83Tmsolicwwds_16_tfsmcal_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV84Tmsolicwwds_17_tfsmtxt = "" ;
      AV85Tmsolicwwds_18_tfsmtxt_sel = "" ;
      scmdbuf = "" ;
      lV68Tmsolicwwds_1_filterfulltext = "" ;
      lV73Tmsolicwwds_6_tfsmusucre = "" ;
      lV75Tmsolicwwds_8_tfsmmaqcod = "" ;
      lV79Tmsolicwwds_12_tfsmdsc = "" ;
      lV81Tmsolicwwds_14_tfsmmaqdsc = "" ;
      lV84Tmsolicwwds_17_tfsmtxt = "" ;
      A9521SMMaqDsc = "" ;
      A9523SMTxt = "" ;
      P08EG2_A9428SMCod = new int[1] ;
      P08EG2_n9428SMCod = new boolean[] {false} ;
      P08EG2_A396EmprCod = new String[] {""} ;
      P08EG2_A9523SMTxt = new String[] {""} ;
      P08EG2_n9523SMTxt = new boolean[] {false} ;
      P08EG2_A9521SMMaqDsc = new String[] {""} ;
      P08EG2_n9521SMMaqDsc = new boolean[] {false} ;
      P08EG2_A9517SMDsc = new String[] {""} ;
      P08EG2_n9517SMDsc = new boolean[] {false} ;
      P08EG2_A11534SMPri = new byte[1] ;
      P08EG2_A9520SMMaqCod = new String[] {""} ;
      P08EG2_n9520SMMaqCod = new boolean[] {false} ;
      P08EG2_A9519SMUsuCre = new String[] {""} ;
      P08EG2_n9519SMUsuCre = new boolean[] {false} ;
      P08EG2_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EG2_n9518SMFchCre = new boolean[] {false} ;
      P08EG2_A9524SMCal = new byte[1] ;
      P08EG2_n9524SMCal = new boolean[] {false} ;
      P08EG2_A9522SMEst = new String[] {""} ;
      P08EG2_n9522SMEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      P08EG3_A396EmprCod = new String[] {""} ;
      P08EG3_A9428SMCod = new int[1] ;
      P08EG3_n9428SMCod = new boolean[] {false} ;
      P08EG3_A9425OMCod = new int[1] ;
      P08EG4_A396EmprCod = new String[] {""} ;
      P08EG4_A9428SMCod = new int[1] ;
      P08EG4_n9428SMCod = new boolean[] {false} ;
      P08EG4_A9445OMEst = new String[] {""} ;
      P08EG4_A9425OMCod = new int[1] ;
      A9445OMEst = "" ;
      AV60OMEst = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46TFSMEst_SelsJson = "" ;
      AV51TFSMCal_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmsolicwwexport__default(),
         new Object[] {
             new Object[] {
            P08EG2_A9428SMCod, P08EG2_A396EmprCod, P08EG2_A9523SMTxt, P08EG2_n9523SMTxt, P08EG2_A9521SMMaqDsc, P08EG2_n9521SMMaqDsc, P08EG2_A9517SMDsc, P08EG2_n9517SMDsc, P08EG2_A11534SMPri, P08EG2_A9520SMMaqCod,
            P08EG2_n9520SMMaqCod, P08EG2_A9519SMUsuCre, P08EG2_n9519SMUsuCre, P08EG2_A9518SMFchCre, P08EG2_n9518SMFchCre, P08EG2_A9524SMCal, P08EG2_n9524SMCal, P08EG2_A9522SMEst, P08EG2_n9522SMEst
            }
            , new Object[] {
            P08EG3_A396EmprCod, P08EG3_A9428SMCod, P08EG3_n9428SMCod, P08EG3_A9425OMCod
            }
            , new Object[] {
            P08EG4_A396EmprCod, P08EG4_A9428SMCod, P08EG4_n9428SMCod, P08EG4_A9445OMEst, P08EG4_A9425OMCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV54TFSMPri ;
   private byte AV55TFSMPri_To ;
   private byte AV53TFSMCal_Sel ;
   private byte A11534SMPri ;
   private byte AV77Tmsolicwwds_10_tfsmpri ;
   private byte AV78Tmsolicwwds_11_tfsmpri_to ;
   private byte A9524SMCal ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short AV57Modo ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFSMCod ;
   private int AV35TFSMCod_To ;
   private int AV64GXV1 ;
   private int AV65GXV2 ;
   private int AV66GXV3 ;
   private int A9428SMCod ;
   private int AV69Tmsolicwwds_2_tfsmcod ;
   private int AV70Tmsolicwwds_3_tfsmcod_to ;
   private int AV71Tmsolicwwds_4_tfsmest_sels_size ;
   private int AV83Tmsolicwwds_16_tfsmcal_sels_size ;
   private int A9425OMCod ;
   private int AV59OMCod ;
   private int AV88GXV4 ;
   private long AV56i ;
   private long AV31VisibleColumnCount ;
   private String AV48TFSMEst_Sel ;
   private String AV41TFSMUsuCre_Sel ;
   private String AV40TFSMUsuCre ;
   private String AV43TFSMMaqCod_Sel ;
   private String AV42TFSMMaqCod ;
   private String AV37TFSMDsc_Sel ;
   private String AV36TFSMDsc ;
   private String AV45TFSMMaqDsc_Sel ;
   private String AV44TFSMMaqDsc ;
   private String A9522SMEst ;
   private String A9519SMUsuCre ;
   private String A9520SMMaqCod ;
   private String A9517SMDsc ;
   private String AV73Tmsolicwwds_6_tfsmusucre ;
   private String AV74Tmsolicwwds_7_tfsmusucre_sel ;
   private String AV75Tmsolicwwds_8_tfsmmaqcod ;
   private String AV76Tmsolicwwds_9_tfsmmaqcod_sel ;
   private String AV79Tmsolicwwds_12_tfsmdsc ;
   private String AV80Tmsolicwwds_13_tfsmdsc_sel ;
   private String AV81Tmsolicwwds_14_tfsmmaqdsc ;
   private String AV82Tmsolicwwds_15_tfsmmaqdsc_sel ;
   private String scmdbuf ;
   private String lV73Tmsolicwwds_6_tfsmusucre ;
   private String lV75Tmsolicwwds_8_tfsmmaqcod ;
   private String lV79Tmsolicwwds_12_tfsmdsc ;
   private String lV81Tmsolicwwds_14_tfsmmaqdsc ;
   private String A9521SMMaqDsc ;
   private String A396EmprCod ;
   private String A9445OMEst ;
   private String AV60OMEst ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV38TFSMFchCre ;
   private java.util.Date A9518SMFchCre ;
   private java.util.Date AV72Tmsolicwwds_5_tfsmfchcre ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n9428SMCod ;
   private boolean n9523SMTxt ;
   private boolean n9521SMMaqDsc ;
   private boolean n9517SMDsc ;
   private boolean n9520SMMaqCod ;
   private boolean n9519SMUsuCre ;
   private boolean n9518SMFchCre ;
   private boolean n9524SMCal ;
   private boolean n9522SMEst ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV46TFSMEst_SelsJson ;
   private String AV51TFSMCal_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV50TFSMTxt_Sel ;
   private String AV49TFSMTxt ;
   private String AV68Tmsolicwwds_1_filterfulltext ;
   private String AV84Tmsolicwwds_17_tfsmtxt ;
   private String AV85Tmsolicwwds_18_tfsmtxt_sel ;
   private String lV68Tmsolicwwds_1_filterfulltext ;
   private String lV84Tmsolicwwds_17_tfsmtxt ;
   private String A9523SMTxt ;
   private GXSimpleCollection<Byte> AV52TFSMCal_Sels ;
   private GXSimpleCollection<Byte> AV83Tmsolicwwds_16_tfsmcal_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV47TFSMEst_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P08EG2_A9428SMCod ;
   private boolean[] P08EG2_n9428SMCod ;
   private String[] P08EG2_A396EmprCod ;
   private String[] P08EG2_A9523SMTxt ;
   private boolean[] P08EG2_n9523SMTxt ;
   private String[] P08EG2_A9521SMMaqDsc ;
   private boolean[] P08EG2_n9521SMMaqDsc ;
   private String[] P08EG2_A9517SMDsc ;
   private boolean[] P08EG2_n9517SMDsc ;
   private byte[] P08EG2_A11534SMPri ;
   private String[] P08EG2_A9520SMMaqCod ;
   private boolean[] P08EG2_n9520SMMaqCod ;
   private String[] P08EG2_A9519SMUsuCre ;
   private boolean[] P08EG2_n9519SMUsuCre ;
   private java.util.Date[] P08EG2_A9518SMFchCre ;
   private boolean[] P08EG2_n9518SMFchCre ;
   private byte[] P08EG2_A9524SMCal ;
   private boolean[] P08EG2_n9524SMCal ;
   private String[] P08EG2_A9522SMEst ;
   private boolean[] P08EG2_n9522SMEst ;
   private String[] P08EG3_A396EmprCod ;
   private int[] P08EG3_A9428SMCod ;
   private boolean[] P08EG3_n9428SMCod ;
   private int[] P08EG3_A9425OMCod ;
   private String[] P08EG4_A396EmprCod ;
   private int[] P08EG4_A9428SMCod ;
   private boolean[] P08EG4_n9428SMCod ;
   private String[] P08EG4_A9445OMEst ;
   private int[] P08EG4_A9425OMCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV71Tmsolicwwds_4_tfsmest_sels ;
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

final  class tmsolicwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV71Tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV83Tmsolicwwds_16_tfsmcal_sels ,
                                          int AV69Tmsolicwwds_2_tfsmcod ,
                                          int AV70Tmsolicwwds_3_tfsmcod_to ,
                                          int AV71Tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV72Tmsolicwwds_5_tfsmfchcre ,
                                          String AV74Tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV73Tmsolicwwds_6_tfsmusucre ,
                                          String AV76Tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV75Tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV77Tmsolicwwds_10_tfsmpri ,
                                          byte AV78Tmsolicwwds_11_tfsmpri_to ,
                                          String AV80Tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV79Tmsolicwwds_12_tfsmdsc ,
                                          String AV82Tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV81Tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV83Tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV85Tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV84Tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV68Tmsolicwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.SMCod, T1.EmprCod, T1.SMTxt, T2.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMMaqCod AS SMMaqCod, T1.SMUsuCre, T1.SMFchCre, T1.SMCal, T1.SMEst FROM (TXPMSOLIC" ;
      scmdbuf += " T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV69Tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV70Tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV71Tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV73Tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV75Tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( AV83Tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV83Tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV85Tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV84Tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMEst" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMFchCre" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMFchCre DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMPri" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMPri DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCal" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCal DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMTxt" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMTxt DESC" ;
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
                  return conditional_P08EG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EG3", "SELECT EmprCod, SMCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EG4", "SELECT EmprCod, SMCod, OMEst, OMCod FROM TXPMORDEN WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

