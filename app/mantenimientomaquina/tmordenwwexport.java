package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordenwwexport extends GXProcedure
{
   public tmordenwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordenwwexport.class ), "" );
   }

   public tmordenwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmordenwwexport.this.aP1 = new String[] {""};
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
      tmordenwwexport.this.aP0 = aP0;
      tmordenwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TMOrdenWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV38TFOMCod) && (0==AV39TFOMCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "# Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFOMCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFOMCod_To );
      }
      if ( ! ( (0==AV50TFPMCod) && (0==AV51TFPMCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Preventivo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFPMCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFPMCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV83TFPMDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV83TFPMDsc_Sel, GXv_char5) ;
         tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV82TFPMDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFPMDsc, GXv_char5) ;
            tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFOMMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFOMMaqCod_Sel, GXv_char5) ;
         tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFOMMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFOMMaqCod, GXv_char5) ;
            tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFOMMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFOMMaqDsc_Sel, GXv_char5) ;
         tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFOMMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFOMMaqDsc, GXv_char5) ;
            tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFOMMaqCodFor_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod For", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFOMMaqCodFor_Sel, GXv_char5) ;
         tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFOMMaqCodFor)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod For", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFOMMaqCodFor, GXv_char5) ;
            tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFOMDscMqPla_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mq Planificar", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFOMDscMqPla_Sel, GXv_char5) ;
         tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFOMDscMqPla)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mq Planificar", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFOMDscMqPla, GXv_char5) ;
            tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV48TFSMCod) && (0==AV49TFSMCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Solicitud", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFSMCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFSMCod_To );
      }
      if ( ! ( ( AV75TFOMEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV79i = 1 ;
         AV86GXV1 = 1 ;
         while ( AV86GXV1 <= AV75TFOMEst_Sels.size() )
         {
            AV76TFOMEst_Sel = (String)AV75TFOMEst_Sels.elementAt(-1+AV86GXV1) ;
            if ( AV79i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV76TFOMEst_Sel), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pendiente", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV76TFOMEst_Sel), httpContext.getMessage( "R", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Realizada", "") );
            }
            AV79i = (long)(AV79i+1) ;
            AV86GXV1 = (int)(AV86GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFOMUsuCre_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFOMUsuCre_Sel, GXv_char5) ;
         tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFOMUsuCre)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFOMUsuCre, GXv_char5) ;
            tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV58TFOMFchCre) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Creación", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV58TFOMFchCre );
      }
      if ( ! ( (GXutil.strcmp("", AV53TFOMTxt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFOMTxt_Sel, GXv_char5) ;
         tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFOMTxt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFOMTxt, GXv_char5) ;
            tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFOMFchPre)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Prevista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV54TFOMFchPre );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV56TFOMFchCer) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cerrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV56TFOMFchCer );
      }
      if ( ! ( (GXutil.strcmp("", AV61TFOMDuracion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Duracion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFOMDuracion_Sel, GXv_char5) ;
         tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFOMDuracion)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Duracion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFOMDuracion, GXv_char5) ;
            tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFOMCosRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFOMCosRea_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Costo Real", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TFOMCosRea)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFOMCosRea_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFOMRRCosT)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFOMRRCosT_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Costo Total Reserva Repuesto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFOMRRCosT)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFOMRRCosT_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFOMRCCosT)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFOMRCCosT_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Costo Total Consumo Repuesto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68TFOMRCCosT)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV69TFOMRCCosT_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFOMMRCosT)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFOMMRCosT_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Costo Total Reserva Mano Obra", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70TFOMMRCosT)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV71TFOMMRCosT_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFOMMCCosT)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFOMMCCosT_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Costo Total Consumo Mano Obra", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV72TFOMMCCosT)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73TFOMMCCosT_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV78TFOMNot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nota", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFOMNot_Sel, GXv_char5) ;
         tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFOMNot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nota", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tmordenwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFOMNot, GXv_char5) ;
            tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMOrdenWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("MantenimientoMaquina.TMOrdenWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV87GXV2 = 1 ;
      while ( AV87GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV87GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV87GXV2 = (int)(AV87GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext = AV18FilterFullText ;
      AV90Mantenimientomaquina_tmordenwwds_2_tfomcod = AV38TFOMCod ;
      AV91Mantenimientomaquina_tmordenwwds_3_tfomcod_to = AV39TFOMCod_To ;
      AV92Mantenimientomaquina_tmordenwwds_4_tfpmcod = AV50TFPMCod ;
      AV93Mantenimientomaquina_tmordenwwds_5_tfpmcod_to = AV51TFPMCod_To ;
      AV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc = AV82TFPMDsc ;
      AV95Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel = AV83TFPMDsc_Sel ;
      AV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod = AV40TFOMMaqCod ;
      AV97Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel = AV41TFOMMaqCod_Sel ;
      AV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = AV44TFOMMaqDsc ;
      AV99Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel = AV45TFOMMaqDsc_Sel ;
      AV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = AV42TFOMMaqCodFor ;
      AV101Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel = AV43TFOMMaqCodFor_Sel ;
      AV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = AV46TFOMDscMqPla ;
      AV103Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel = AV47TFOMDscMqPla_Sel ;
      AV104Mantenimientomaquina_tmordenwwds_16_tfsmcod = AV48TFSMCod ;
      AV105Mantenimientomaquina_tmordenwwds_17_tfsmcod_to = AV49TFSMCod_To ;
      AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels = AV75TFOMEst_Sels ;
      AV107Mantenimientomaquina_tmordenwwds_19_tfomusucre = AV62TFOMUsuCre ;
      AV108Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel = AV63TFOMUsuCre_Sel ;
      AV109Mantenimientomaquina_tmordenwwds_21_tfomfchcre = AV58TFOMFchCre ;
      AV110Mantenimientomaquina_tmordenwwds_22_tfomtxt = AV52TFOMTxt ;
      AV111Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel = AV53TFOMTxt_Sel ;
      AV112Mantenimientomaquina_tmordenwwds_24_tfomfchpre = AV54TFOMFchPre ;
      AV113Mantenimientomaquina_tmordenwwds_25_tfomfchcer = AV56TFOMFchCer ;
      AV114Mantenimientomaquina_tmordenwwds_26_tfomduracion = AV60TFOMDuracion ;
      AV115Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel = AV61TFOMDuracion_Sel ;
      AV116Mantenimientomaquina_tmordenwwds_28_tfomcosrea = AV64TFOMCosRea ;
      AV117Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to = AV65TFOMCosRea_To ;
      AV118Mantenimientomaquina_tmordenwwds_30_tfomrrcost = AV66TFOMRRCosT ;
      AV119Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to = AV67TFOMRRCosT_To ;
      AV120Mantenimientomaquina_tmordenwwds_32_tfomrccost = AV68TFOMRCCosT ;
      AV121Mantenimientomaquina_tmordenwwds_33_tfomrccost_to = AV69TFOMRCCosT_To ;
      AV122Mantenimientomaquina_tmordenwwds_34_tfommrcost = AV70TFOMMRCosT ;
      AV123Mantenimientomaquina_tmordenwwds_35_tfommrcost_to = AV71TFOMMRCosT_To ;
      AV124Mantenimientomaquina_tmordenwwds_36_tfommccost = AV72TFOMMCCosT ;
      AV125Mantenimientomaquina_tmordenwwds_37_tfommccost_to = AV73TFOMMCCosT_To ;
      AV126Mantenimientomaquina_tmordenwwds_38_tfomnot = AV77TFOMNot ;
      AV127Mantenimientomaquina_tmordenwwds_39_tfomnot_sel = AV78TFOMNot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV90Mantenimientomaquina_tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV91Mantenimientomaquina_tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV92Mantenimientomaquina_tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV93Mantenimientomaquina_tmordenwwds_5_tfpmcod_to) ,
                                           AV95Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel ,
                                           AV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc ,
                                           AV97Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel ,
                                           AV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod ,
                                           AV99Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel ,
                                           AV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV104Mantenimientomaquina_tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV105Mantenimientomaquina_tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels.size()) ,
                                           AV108Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel ,
                                           AV107Mantenimientomaquina_tmordenwwds_19_tfomusucre ,
                                           AV109Mantenimientomaquina_tmordenwwds_21_tfomfchcre ,
                                           AV111Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel ,
                                           AV110Mantenimientomaquina_tmordenwwds_22_tfomtxt ,
                                           AV112Mantenimientomaquina_tmordenwwds_24_tfomfchpre ,
                                           AV113Mantenimientomaquina_tmordenwwds_25_tfomfchcer ,
                                           AV118Mantenimientomaquina_tmordenwwds_30_tfomrrcost ,
                                           AV119Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to ,
                                           AV120Mantenimientomaquina_tmordenwwds_32_tfomrccost ,
                                           AV121Mantenimientomaquina_tmordenwwds_33_tfomrccost_to ,
                                           AV122Mantenimientomaquina_tmordenwwds_34_tfommrcost ,
                                           AV123Mantenimientomaquina_tmordenwwds_35_tfommrcost_to ,
                                           AV124Mantenimientomaquina_tmordenwwds_36_tfommccost ,
                                           AV125Mantenimientomaquina_tmordenwwds_37_tfommccost_to ,
                                           AV127Mantenimientomaquina_tmordenwwds_39_tfomnot_sel ,
                                           AV126Mantenimientomaquina_tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV101Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ,
                                           AV103Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ,
                                           AV115Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel ,
                                           AV114Mantenimientomaquina_tmordenwwds_26_tfomduracion ,
                                           AV116Mantenimientomaquina_tmordenwwds_28_tfomcosrea ,
                                           AV117Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV107Mantenimientomaquina_tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV107Mantenimientomaquina_tmordenwwds_19_tfomusucre), 8, "%") ;
      lV110Mantenimientomaquina_tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV110Mantenimientomaquina_tmordenwwds_22_tfomtxt), "%", "") ;
      lV126Mantenimientomaquina_tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV126Mantenimientomaquina_tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08Q17 */
      pr_default.execute(0, new Object[] {AV101Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel, AV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor, lV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor, AV101Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel, AV101Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel, AV103Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel, AV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla, lV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla, AV103Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel, AV103Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV90Mantenimientomaquina_tmordenwwds_2_tfomcod), Integer.valueOf(AV91Mantenimientomaquina_tmordenwwds_3_tfomcod_to), Integer.valueOf(AV92Mantenimientomaquina_tmordenwwds_4_tfpmcod), Integer.valueOf(AV93Mantenimientomaquina_tmordenwwds_5_tfpmcod_to), lV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc, AV95Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel, lV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod, AV97Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel, lV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc, AV99Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV104Mantenimientomaquina_tmordenwwds_16_tfsmcod), Integer.valueOf(AV105Mantenimientomaquina_tmordenwwds_17_tfsmcod_to), lV107Mantenimientomaquina_tmordenwwds_19_tfomusucre, AV108Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel, AV109Mantenimientomaquina_tmordenwwds_21_tfomfchcre, lV110Mantenimientomaquina_tmordenwwds_22_tfomtxt, AV111Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel, AV112Mantenimientomaquina_tmordenwwds_24_tfomfchpre, AV113Mantenimientomaquina_tmordenwwds_25_tfomfchcer, AV118Mantenimientomaquina_tmordenwwds_30_tfomrrcost, AV119Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to, AV120Mantenimientomaquina_tmordenwwds_32_tfomrccost, AV121Mantenimientomaquina_tmordenwwds_33_tfomrccost_to, AV122Mantenimientomaquina_tmordenwwds_34_tfommrcost, AV123Mantenimientomaquina_tmordenwwds_35_tfommrcost_to, AV124Mantenimientomaquina_tmordenwwds_36_tfommccost, AV125Mantenimientomaquina_tmordenwwds_37_tfommccost_to, lV126Mantenimientomaquina_tmordenwwds_38_tfomnot, AV127Mantenimientomaquina_tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08Q17_A396EmprCod[0] ;
         A9464OMNot = P08Q17_A9464OMNot[0] ;
         A9439OMFchCer = P08Q17_A9439OMFchCer[0] ;
         A9438OMFchPre = P08Q17_A9438OMFchPre[0] ;
         A9433OMTxt = P08Q17_A9433OMTxt[0] ;
         A9436OMFchCre = P08Q17_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08Q17_A9437OMUsuCre[0] ;
         A9428SMCod = P08Q17_A9428SMCod[0] ;
         n9428SMCod = P08Q17_n9428SMCod[0] ;
         A9427OMMaqDsc = P08Q17_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08Q17_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08Q17_A9426OMMaqCod[0] ;
         A9473PMDsc = P08Q17_A9473PMDsc[0] ;
         n9473PMDsc = P08Q17_n9473PMDsc[0] ;
         A9429PMCod = P08Q17_A9429PMCod[0] ;
         n9429PMCod = P08Q17_n9429PMCod[0] ;
         A9425OMCod = P08Q17_A9425OMCod[0] ;
         A13678OMDscMqPla = P08Q17_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08Q17_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08Q17_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08Q17_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08Q17_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08Q17_A9443OMRCCosT[0] ;
         A9445OMEst = P08Q17_A9445OMEst[0] ;
         A9442OMMRCosT = P08Q17_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08Q17_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08Q17_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08Q17_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08Q17_A9473PMDsc[0] ;
         n9473PMDsc = P08Q17_n9473PMDsc[0] ;
         A9441OMMCCosT = P08Q17_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08Q17_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08Q17_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08Q17_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08Q17_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08Q17_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08Q17_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08Q17_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV115Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV114Mantenimientomaquina_tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV114Mantenimientomaquina_tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV115Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV115Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Mantenimientomaquina_tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV116Mantenimientomaquina_tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV117Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV13CellRow = (int)(AV13CellRow+1) ;
                        /* Execute user subroutine: 'BEFOREWRITELINE' */
                        S172 ();
                        if ( returnInSub )
                        {
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           returnInSub = true;
                           if (true) return;
                        }
                        AV31VisibleColumnCount = 0 ;
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9425OMCod );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A9429PMCod );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9473PMDsc, GXv_char5) ;
                           tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9426OMMaqCod, GXv_char5) ;
                           tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9427OMMaqDsc, GXv_char5) ;
                           tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
                           if ( GXutil.strcmp(GXutil.trim( A9445OMEst), httpContext.getMessage( "P", "")) == 0 )
                           {
                              AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
                           }
                           else if ( GXutil.strcmp(GXutil.trim( A9445OMEst), httpContext.getMessage( "R", "")) == 0 )
                           {
                              AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Realizada", "") );
                           }
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_char4 = "" ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9437OMUsuCre, GXv_char5) ;
                           tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A9436OMFchCre );
                           AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           GXt_dtime6 = GXutil.resetTime( A9438OMFchPre );
                           AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                           AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
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
                           pr_default.close(0);
                           pr_default.close(0);
                           pr_default.close(0);
                           returnInSub = true;
                           if (true) return;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Sel", "", "Op", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMCod", "", "# Orden", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMCod", "", "Preventivo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PMDsc", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMMaqCod", "", "Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMMaqDsc", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMMaqCodFor", "", "Cod For", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMDscMqPla", "", "Mq Planificar", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "SMCod", "", "Solicitud", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMUsuCre", "", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMFchCre", "", "Fecha Creación", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMTxt", "", "Descripcion", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMFchPre", "", "Fecha Prevista", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMFchCer", "", "Cerrada", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMDuracion", "", "Duracion", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMCosRea", "", "Costo Real", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMRRCosT", "", "Costo Total Reserva Repuesto", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMRCCosT", "", "Costo Total Consumo Repuesto", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMMRCosT", "", "Costo Total Reserva Mano Obra", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMMCCosT", "", "Costo Total Consumo Mano Obra", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "OMNot", "", "Nota", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMOrdenWWColumnsSelector", GXv_char5) ;
      tmordenwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientoMaquina.TMOrdenWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMOrdenWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("MantenimientoMaquina.TMOrdenWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV128GXV3 = 1 ;
      while ( AV128GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV128GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV38TFOMCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFOMCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMCOD") == 0 )
         {
            AV50TFPMCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFPMCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC") == 0 )
         {
            AV82TFPMDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC_SEL") == 0 )
         {
            AV83TFPMDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD") == 0 )
         {
            AV40TFOMMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD_SEL") == 0 )
         {
            AV41TFOMMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC") == 0 )
         {
            AV44TFOMMaqDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC_SEL") == 0 )
         {
            AV45TFOMMaqDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR") == 0 )
         {
            AV42TFOMMaqCodFor = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR_SEL") == 0 )
         {
            AV43TFOMMaqCodFor_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA") == 0 )
         {
            AV46TFOMDscMqPla = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA_SEL") == 0 )
         {
            AV47TFOMDscMqPla_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV48TFSMCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFSMCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMEST_SEL") == 0 )
         {
            AV74TFOMEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV75TFOMEst_Sels.fromJSonString(AV74TFOMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE") == 0 )
         {
            AV62TFOMUsuCre = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE_SEL") == 0 )
         {
            AV63TFOMUsuCre_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCRE") == 0 )
         {
            AV58TFOMFchCre = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT") == 0 )
         {
            AV52TFOMTxt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT_SEL") == 0 )
         {
            AV53TFOMTxt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHPRE") == 0 )
         {
            AV54TFOMFchPre = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCER") == 0 )
         {
            AV56TFOMFchCer = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION") == 0 )
         {
            AV60TFOMDuracion = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION_SEL") == 0 )
         {
            AV61TFOMDuracion_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOSREA") == 0 )
         {
            AV64TFOMCosRea = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFOMCosRea_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRRCOST") == 0 )
         {
            AV66TFOMRRCosT = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV67TFOMRRCosT_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRCCOST") == 0 )
         {
            AV68TFOMRCCosT = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV69TFOMRCCosT_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMRCOST") == 0 )
         {
            AV70TFOMMRCosT = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV71TFOMMRCosT_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCCOST") == 0 )
         {
            AV72TFOMMCCosT = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFOMMCCosT_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT") == 0 )
         {
            AV77TFOMNot = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT_SEL") == 0 )
         {
            AV78TFOMNot_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV128GXV3 = (int)(AV128GXV3+1) ;
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
      this.aP0[0] = tmordenwwexport.this.AV11Filename;
      this.aP1[0] = tmordenwwexport.this.AV12ErrorMessage;
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
      AV83TFPMDsc_Sel = "" ;
      AV82TFPMDsc = "" ;
      AV41TFOMMaqCod_Sel = "" ;
      AV40TFOMMaqCod = "" ;
      AV45TFOMMaqDsc_Sel = "" ;
      AV44TFOMMaqDsc = "" ;
      AV43TFOMMaqCodFor_Sel = "" ;
      AV42TFOMMaqCodFor = "" ;
      AV47TFOMDscMqPla_Sel = "" ;
      AV46TFOMDscMqPla = "" ;
      AV75TFOMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV76TFOMEst_Sel = "" ;
      AV63TFOMUsuCre_Sel = "" ;
      AV62TFOMUsuCre = "" ;
      AV58TFOMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV53TFOMTxt_Sel = "" ;
      AV52TFOMTxt = "" ;
      AV54TFOMFchPre = GXutil.nullDate() ;
      AV56TFOMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV61TFOMDuracion_Sel = "" ;
      AV60TFOMDuracion = "" ;
      AV64TFOMCosRea = DecimalUtil.ZERO ;
      AV65TFOMCosRea_To = DecimalUtil.ZERO ;
      AV66TFOMRRCosT = DecimalUtil.ZERO ;
      AV67TFOMRRCosT_To = DecimalUtil.ZERO ;
      AV68TFOMRCCosT = DecimalUtil.ZERO ;
      AV69TFOMRCCosT_To = DecimalUtil.ZERO ;
      AV70TFOMMRCosT = DecimalUtil.ZERO ;
      AV71TFOMMRCosT_To = DecimalUtil.ZERO ;
      AV72TFOMMCCosT = DecimalUtil.ZERO ;
      AV73TFOMMCCosT_To = DecimalUtil.ZERO ;
      AV78TFOMNot_Sel = "" ;
      AV77TFOMNot = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A9473PMDsc = "" ;
      A9426OMMaqCod = "" ;
      A9427OMMaqDsc = "" ;
      A9445OMEst = "" ;
      A9437OMUsuCre = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9438OMFchPre = GXutil.nullDate() ;
      AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext = "" ;
      AV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc = "" ;
      AV95Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel = "" ;
      AV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod = "" ;
      AV97Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel = "" ;
      AV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = "" ;
      AV99Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel = "" ;
      AV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = "" ;
      AV101Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel = "" ;
      AV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = "" ;
      AV103Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel = "" ;
      AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV107Mantenimientomaquina_tmordenwwds_19_tfomusucre = "" ;
      AV108Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel = "" ;
      AV109Mantenimientomaquina_tmordenwwds_21_tfomfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV110Mantenimientomaquina_tmordenwwds_22_tfomtxt = "" ;
      AV111Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel = "" ;
      AV112Mantenimientomaquina_tmordenwwds_24_tfomfchpre = GXutil.nullDate() ;
      AV113Mantenimientomaquina_tmordenwwds_25_tfomfchcer = GXutil.resetTime( GXutil.nullDate() );
      AV114Mantenimientomaquina_tmordenwwds_26_tfomduracion = "" ;
      AV115Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel = "" ;
      AV116Mantenimientomaquina_tmordenwwds_28_tfomcosrea = DecimalUtil.ZERO ;
      AV117Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to = DecimalUtil.ZERO ;
      AV118Mantenimientomaquina_tmordenwwds_30_tfomrrcost = DecimalUtil.ZERO ;
      AV119Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to = DecimalUtil.ZERO ;
      AV120Mantenimientomaquina_tmordenwwds_32_tfomrccost = DecimalUtil.ZERO ;
      AV121Mantenimientomaquina_tmordenwwds_33_tfomrccost_to = DecimalUtil.ZERO ;
      AV122Mantenimientomaquina_tmordenwwds_34_tfommrcost = DecimalUtil.ZERO ;
      AV123Mantenimientomaquina_tmordenwwds_35_tfommrcost_to = DecimalUtil.ZERO ;
      AV124Mantenimientomaquina_tmordenwwds_36_tfommccost = DecimalUtil.ZERO ;
      AV125Mantenimientomaquina_tmordenwwds_37_tfommccost_to = DecimalUtil.ZERO ;
      AV126Mantenimientomaquina_tmordenwwds_38_tfomnot = "" ;
      AV127Mantenimientomaquina_tmordenwwds_39_tfomnot_sel = "" ;
      lV89Mantenimientomaquina_tmordenwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = "" ;
      lV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = "" ;
      lV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc = "" ;
      lV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod = "" ;
      lV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = "" ;
      lV107Mantenimientomaquina_tmordenwwds_19_tfomusucre = "" ;
      lV110Mantenimientomaquina_tmordenwwds_22_tfomtxt = "" ;
      lV126Mantenimientomaquina_tmordenwwds_38_tfomnot = "" ;
      A9433OMTxt = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      A9464OMNot = "" ;
      A13679OMMaqCodFo = "" ;
      A13678OMDscMqPla = "" ;
      A13680OMDuracion = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      P08Q17_A396EmprCod = new String[] {""} ;
      P08Q17_A9464OMNot = new String[] {""} ;
      P08Q17_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q17_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q17_A9433OMTxt = new String[] {""} ;
      P08Q17_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q17_A9437OMUsuCre = new String[] {""} ;
      P08Q17_A9428SMCod = new int[1] ;
      P08Q17_n9428SMCod = new boolean[] {false} ;
      P08Q17_A9427OMMaqDsc = new String[] {""} ;
      P08Q17_n9427OMMaqDsc = new boolean[] {false} ;
      P08Q17_A9426OMMaqCod = new String[] {""} ;
      P08Q17_A9473PMDsc = new String[] {""} ;
      P08Q17_n9473PMDsc = new boolean[] {false} ;
      P08Q17_A9429PMCod = new int[1] ;
      P08Q17_n9429PMCod = new boolean[] {false} ;
      P08Q17_A9425OMCod = new int[1] ;
      P08Q17_A13678OMDscMqPla = new String[] {""} ;
      P08Q17_n13678OMDscMqPla = new boolean[] {false} ;
      P08Q17_A13679OMMaqCodFo = new String[] {""} ;
      P08Q17_n13679OMMaqCodFo = new boolean[] {false} ;
      P08Q17_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q17_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q17_A9445OMEst = new String[] {""} ;
      P08Q17_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q17_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      AV74TFOMEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordenwwexport__default(),
         new Object[] {
             new Object[] {
            P08Q17_A396EmprCod, P08Q17_A9464OMNot, P08Q17_A9439OMFchCer, P08Q17_A9438OMFchPre, P08Q17_A9433OMTxt, P08Q17_A9436OMFchCre, P08Q17_A9437OMUsuCre, P08Q17_A9428SMCod, P08Q17_n9428SMCod, P08Q17_A9427OMMaqDsc,
            P08Q17_n9427OMMaqDsc, P08Q17_A9426OMMaqCod, P08Q17_A9473PMDsc, P08Q17_n9473PMDsc, P08Q17_A9429PMCod, P08Q17_n9429PMCod, P08Q17_A9425OMCod, P08Q17_A13678OMDscMqPla, P08Q17_n13678OMDscMqPla, P08Q17_A13679OMMaqCodFo,
            P08Q17_n13679OMMaqCodFo, P08Q17_A9441OMMCCosT, P08Q17_A9443OMRCCosT, P08Q17_A9445OMEst, P08Q17_A9442OMMRCosT, P08Q17_A9444OMRRCosT
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
   private int AV38TFOMCod ;
   private int AV39TFOMCod_To ;
   private int AV50TFPMCod ;
   private int AV51TFPMCod_To ;
   private int AV48TFSMCod ;
   private int AV49TFSMCod_To ;
   private int AV86GXV1 ;
   private int AV87GXV2 ;
   private int A9425OMCod ;
   private int A9429PMCod ;
   private int AV90Mantenimientomaquina_tmordenwwds_2_tfomcod ;
   private int AV91Mantenimientomaquina_tmordenwwds_3_tfomcod_to ;
   private int AV92Mantenimientomaquina_tmordenwwds_4_tfpmcod ;
   private int AV93Mantenimientomaquina_tmordenwwds_5_tfpmcod_to ;
   private int AV104Mantenimientomaquina_tmordenwwds_16_tfsmcod ;
   private int AV105Mantenimientomaquina_tmordenwwds_17_tfsmcod_to ;
   private int AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels_size ;
   private int A9428SMCod ;
   private int AV128GXV3 ;
   private long AV79i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV64TFOMCosRea ;
   private java.math.BigDecimal AV65TFOMCosRea_To ;
   private java.math.BigDecimal AV66TFOMRRCosT ;
   private java.math.BigDecimal AV67TFOMRRCosT_To ;
   private java.math.BigDecimal AV68TFOMRCCosT ;
   private java.math.BigDecimal AV69TFOMRCCosT_To ;
   private java.math.BigDecimal AV70TFOMMRCosT ;
   private java.math.BigDecimal AV71TFOMMRCosT_To ;
   private java.math.BigDecimal AV72TFOMMCCosT ;
   private java.math.BigDecimal AV73TFOMMCCosT_To ;
   private java.math.BigDecimal AV116Mantenimientomaquina_tmordenwwds_28_tfomcosrea ;
   private java.math.BigDecimal AV117Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to ;
   private java.math.BigDecimal AV118Mantenimientomaquina_tmordenwwds_30_tfomrrcost ;
   private java.math.BigDecimal AV119Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to ;
   private java.math.BigDecimal AV120Mantenimientomaquina_tmordenwwds_32_tfomrccost ;
   private java.math.BigDecimal AV121Mantenimientomaquina_tmordenwwds_33_tfomrccost_to ;
   private java.math.BigDecimal AV122Mantenimientomaquina_tmordenwwds_34_tfommrcost ;
   private java.math.BigDecimal AV123Mantenimientomaquina_tmordenwwds_35_tfommrcost_to ;
   private java.math.BigDecimal AV124Mantenimientomaquina_tmordenwwds_36_tfommccost ;
   private java.math.BigDecimal AV125Mantenimientomaquina_tmordenwwds_37_tfommccost_to ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal A9440OMCosRea ;
   private String AV83TFPMDsc_Sel ;
   private String AV82TFPMDsc ;
   private String AV41TFOMMaqCod_Sel ;
   private String AV40TFOMMaqCod ;
   private String AV45TFOMMaqDsc_Sel ;
   private String AV44TFOMMaqDsc ;
   private String AV43TFOMMaqCodFor_Sel ;
   private String AV42TFOMMaqCodFor ;
   private String AV47TFOMDscMqPla_Sel ;
   private String AV46TFOMDscMqPla ;
   private String AV76TFOMEst_Sel ;
   private String AV63TFOMUsuCre_Sel ;
   private String AV62TFOMUsuCre ;
   private String A9473PMDsc ;
   private String A9426OMMaqCod ;
   private String A9427OMMaqDsc ;
   private String A9445OMEst ;
   private String A9437OMUsuCre ;
   private String AV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc ;
   private String AV95Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel ;
   private String AV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod ;
   private String AV97Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel ;
   private String AV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ;
   private String AV99Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel ;
   private String AV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ;
   private String AV101Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel ;
   private String AV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ;
   private String AV103Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel ;
   private String AV107Mantenimientomaquina_tmordenwwds_19_tfomusucre ;
   private String AV108Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel ;
   private String scmdbuf ;
   private String lV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ;
   private String lV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ;
   private String lV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc ;
   private String lV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod ;
   private String lV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ;
   private String lV107Mantenimientomaquina_tmordenwwds_19_tfomusucre ;
   private String A13679OMMaqCodFo ;
   private String A13678OMDscMqPla ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV58TFOMFchCre ;
   private java.util.Date AV56TFOMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date AV109Mantenimientomaquina_tmordenwwds_21_tfomfchcre ;
   private java.util.Date AV113Mantenimientomaquina_tmordenwwds_25_tfomfchcer ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV54TFOMFchPre ;
   private java.util.Date A9438OMFchPre ;
   private java.util.Date AV112Mantenimientomaquina_tmordenwwds_24_tfomfchpre ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n9428SMCod ;
   private boolean n9427OMMaqDsc ;
   private boolean n9473PMDsc ;
   private boolean n9429PMCod ;
   private boolean n13678OMDscMqPla ;
   private boolean n13679OMMaqCodFo ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV74TFOMEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV53TFOMTxt_Sel ;
   private String AV52TFOMTxt ;
   private String AV61TFOMDuracion_Sel ;
   private String AV60TFOMDuracion ;
   private String AV78TFOMNot_Sel ;
   private String AV77TFOMNot ;
   private String AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext ;
   private String AV110Mantenimientomaquina_tmordenwwds_22_tfomtxt ;
   private String AV111Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel ;
   private String AV114Mantenimientomaquina_tmordenwwds_26_tfomduracion ;
   private String AV115Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel ;
   private String AV126Mantenimientomaquina_tmordenwwds_38_tfomnot ;
   private String AV127Mantenimientomaquina_tmordenwwds_39_tfomnot_sel ;
   private String lV89Mantenimientomaquina_tmordenwwds_1_filterfulltext ;
   private String lV110Mantenimientomaquina_tmordenwwds_22_tfomtxt ;
   private String lV126Mantenimientomaquina_tmordenwwds_38_tfomnot ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String A13680OMDuracion ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV75TFOMEst_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08Q17_A396EmprCod ;
   private String[] P08Q17_A9464OMNot ;
   private java.util.Date[] P08Q17_A9439OMFchCer ;
   private java.util.Date[] P08Q17_A9438OMFchPre ;
   private String[] P08Q17_A9433OMTxt ;
   private java.util.Date[] P08Q17_A9436OMFchCre ;
   private String[] P08Q17_A9437OMUsuCre ;
   private int[] P08Q17_A9428SMCod ;
   private boolean[] P08Q17_n9428SMCod ;
   private String[] P08Q17_A9427OMMaqDsc ;
   private boolean[] P08Q17_n9427OMMaqDsc ;
   private String[] P08Q17_A9426OMMaqCod ;
   private String[] P08Q17_A9473PMDsc ;
   private boolean[] P08Q17_n9473PMDsc ;
   private int[] P08Q17_A9429PMCod ;
   private boolean[] P08Q17_n9429PMCod ;
   private int[] P08Q17_A9425OMCod ;
   private String[] P08Q17_A13678OMDscMqPla ;
   private boolean[] P08Q17_n13678OMDscMqPla ;
   private String[] P08Q17_A13679OMMaqCodFo ;
   private boolean[] P08Q17_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08Q17_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08Q17_A9443OMRCCosT ;
   private String[] P08Q17_A9445OMEst ;
   private java.math.BigDecimal[] P08Q17_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08Q17_A9444OMRRCosT ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels ;
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

final  class tmordenwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Q17( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels ,
                                          int AV90Mantenimientomaquina_tmordenwwds_2_tfomcod ,
                                          int AV91Mantenimientomaquina_tmordenwwds_3_tfomcod_to ,
                                          int AV92Mantenimientomaquina_tmordenwwds_4_tfpmcod ,
                                          int AV93Mantenimientomaquina_tmordenwwds_5_tfpmcod_to ,
                                          String AV95Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel ,
                                          String AV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc ,
                                          String AV97Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel ,
                                          String AV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod ,
                                          String AV99Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel ,
                                          String AV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ,
                                          int AV104Mantenimientomaquina_tmordenwwds_16_tfsmcod ,
                                          int AV105Mantenimientomaquina_tmordenwwds_17_tfsmcod_to ,
                                          int AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels_size ,
                                          String AV108Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel ,
                                          String AV107Mantenimientomaquina_tmordenwwds_19_tfomusucre ,
                                          java.util.Date AV109Mantenimientomaquina_tmordenwwds_21_tfomfchcre ,
                                          String AV111Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel ,
                                          String AV110Mantenimientomaquina_tmordenwwds_22_tfomtxt ,
                                          java.util.Date AV112Mantenimientomaquina_tmordenwwds_24_tfomfchpre ,
                                          java.util.Date AV113Mantenimientomaquina_tmordenwwds_25_tfomfchcer ,
                                          java.math.BigDecimal AV118Mantenimientomaquina_tmordenwwds_30_tfomrrcost ,
                                          java.math.BigDecimal AV119Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to ,
                                          java.math.BigDecimal AV120Mantenimientomaquina_tmordenwwds_32_tfomrccost ,
                                          java.math.BigDecimal AV121Mantenimientomaquina_tmordenwwds_33_tfomrccost_to ,
                                          java.math.BigDecimal AV122Mantenimientomaquina_tmordenwwds_34_tfommrcost ,
                                          java.math.BigDecimal AV123Mantenimientomaquina_tmordenwwds_35_tfommrcost_to ,
                                          java.math.BigDecimal AV124Mantenimientomaquina_tmordenwwds_36_tfommccost ,
                                          java.math.BigDecimal AV125Mantenimientomaquina_tmordenwwds_37_tfommccost_to ,
                                          String AV127Mantenimientomaquina_tmordenwwds_39_tfomnot_sel ,
                                          String AV126Mantenimientomaquina_tmordenwwds_38_tfomnot ,
                                          int A9425OMCod ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9426OMMaqCod ,
                                          String A9427OMMaqDsc ,
                                          int A9428SMCod ,
                                          String A9437OMUsuCre ,
                                          java.util.Date A9436OMFchCre ,
                                          String A9433OMTxt ,
                                          java.util.Date A9438OMFchPre ,
                                          java.util.Date A9439OMFchCer ,
                                          java.math.BigDecimal A9444OMRRCosT ,
                                          java.math.BigDecimal A9443OMRCCosT ,
                                          java.math.BigDecimal A9442OMMRCosT ,
                                          java.math.BigDecimal A9441OMMCCosT ,
                                          String A9464OMNot ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV89Mantenimientomaquina_tmordenwwds_1_filterfulltext ,
                                          String A13679OMMaqCodFo ,
                                          String A13678OMDscMqPla ,
                                          String A13680OMDuracion ,
                                          java.math.BigDecimal A9440OMCosRea ,
                                          String AV101Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel ,
                                          String AV100Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ,
                                          String AV103Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel ,
                                          String AV102Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ,
                                          String AV115Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel ,
                                          String AV114Mantenimientomaquina_tmordenwwds_26_tfomduracion ,
                                          java.math.BigDecimal AV116Mantenimientomaquina_tmordenwwds_28_tfomcosrea ,
                                          java.math.BigDecimal AV117Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[39];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV90Mantenimientomaquina_tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV91Mantenimientomaquina_tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientomaquina_tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV93Mantenimientomaquina_tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Mantenimientomaquina_tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV96Mantenimientomaquina_tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Mantenimientomaquina_tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Mantenimientomaquina_tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Mantenimientomaquina_tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Mantenimientomaquina_tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV108Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV107Mantenimientomaquina_tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV109Mantenimientomaquina_tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV110Mantenimientomaquina_tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV112Mantenimientomaquina_tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV113Mantenimientomaquina_tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Mantenimientomaquina_tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Mantenimientomaquina_tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Mantenimientomaquina_tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Mantenimientomaquina_tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Mantenimientomaquina_tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Mantenimientomaquina_tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Mantenimientomaquina_tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Mantenimientomaquina_tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV126Mantenimientomaquina_tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Mantenimientomaquina_tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PMDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PMDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMEst" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCre" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCre DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMTxt" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMTxt DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchPre" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchPre DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCer" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCer DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMNot" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMNot DESC" ;
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
                  return conditional_P08Q17(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Q17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
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
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
      }
   }

}

