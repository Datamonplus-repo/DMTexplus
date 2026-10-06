package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientofacturawwexport extends GXProcedure
{
   public mantenimientofacturawwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientofacturawwexport.class ), "" );
   }

   public mantenimientofacturawwexport( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      mantenimientofacturawwexport.this.aP1 = new String[] {""};
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
      mantenimientofacturawwexport.this.aP0 = aP0;
      mantenimientofacturawwexport.this.aP1 = aP1;
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
      AV11Filename = "MantenimientoFacturaWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFFacCod) && (0==AV35TFFacCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Factura", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFFacCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFFacCod_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFFacFch)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV36TFFacFch );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV40TFCliCod) && (0==AV41TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFCliNom_Sel, GXv_char5) ;
         mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFCliNom, GXv_char5) ;
            mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFFacPri_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFFacPri_Sel, GXv_char5) ;
         mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFFacPri)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFFacPri, GXv_char5) ;
            mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFFacImpTot)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFFacImpTot_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Total Bruto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFFacImpTot)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFFacImpTot_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFFacImpPP)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFFacImpPP_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Imp. Dto. P.P.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFFacImpPP)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFFacImpPP_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFFacBasImp)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFFacBasImp_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Base Imp.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFFacBasImp)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFFacBasImp_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFFacIVAImp)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFFacIVAImp_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Imp. IVA", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFFacIVAImp)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFFacIVAImp_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFFacTot)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFFacTot_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Total", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFFacTot)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFFacTot_To)) );
      }
      if ( ! ( ( AV56TFFacEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV44i = 1 ;
         AV62GXV1 = 1 ;
         while ( AV62GXV1 <= AV56TFFacEst_Sels.size() )
         {
            AV57TFFacEst_Sel = ((Number) AV56TFFacEst_Sels.elementAt(-1+AV62GXV1)).byteValue() ;
            if ( AV44i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV57TFFacEst_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pdte. Imp.", "") );
            }
            else if ( AV57TFFacEst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Imp.", "") );
            }
            else if ( AV57TFFacEst_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Act.", "") );
            }
            AV44i = (long)(AV44i+1) ;
            AV62GXV1 = (int)(AV62GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV59TFFacCob_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ctb", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFFacCob_Sel, GXv_char5) ;
         mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFFacCob)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ctb", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mantenimientofacturawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFFacCob, GXv_char5) ;
            mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.MantenimientoFacturaWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Facturacion.MantenimientoFacturaWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV63GXV2 = 1 ;
      while ( AV63GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV63GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV63GXV2 = (int)(AV63GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV65Facturacion_mantenimientofacturawwds_1_filterfulltext = AV18FilterFullText ;
      AV66Facturacion_mantenimientofacturawwds_2_tffaccod = AV34TFFacCod ;
      AV67Facturacion_mantenimientofacturawwds_3_tffaccod_to = AV35TFFacCod_To ;
      AV68Facturacion_mantenimientofacturawwds_4_tffacfch = AV36TFFacFch ;
      AV69Facturacion_mantenimientofacturawwds_5_tfclicod = AV40TFCliCod ;
      AV70Facturacion_mantenimientofacturawwds_6_tfclicod_to = AV41TFCliCod_To ;
      AV71Facturacion_mantenimientofacturawwds_7_tfclinom = AV42TFCliNom ;
      AV72Facturacion_mantenimientofacturawwds_8_tfclinom_sel = AV43TFCliNom_Sel ;
      AV73Facturacion_mantenimientofacturawwds_9_tffacpri = AV38TFFacPri ;
      AV74Facturacion_mantenimientofacturawwds_10_tffacpri_sel = AV39TFFacPri_Sel ;
      AV75Facturacion_mantenimientofacturawwds_11_tffacimptot = AV45TFFacImpTot ;
      AV76Facturacion_mantenimientofacturawwds_12_tffacimptot_to = AV46TFFacImpTot_To ;
      AV77Facturacion_mantenimientofacturawwds_13_tffacimppp = AV47TFFacImpPP ;
      AV78Facturacion_mantenimientofacturawwds_14_tffacimppp_to = AV48TFFacImpPP_To ;
      AV79Facturacion_mantenimientofacturawwds_15_tffacbasimp = AV49TFFacBasImp ;
      AV80Facturacion_mantenimientofacturawwds_16_tffacbasimp_to = AV50TFFacBasImp_To ;
      AV81Facturacion_mantenimientofacturawwds_17_tffacivaimp = AV51TFFacIVAImp ;
      AV82Facturacion_mantenimientofacturawwds_18_tffacivaimp_to = AV52TFFacIVAImp_To ;
      AV83Facturacion_mantenimientofacturawwds_19_tffactot = AV53TFFacTot ;
      AV84Facturacion_mantenimientofacturawwds_20_tffactot_to = AV54TFFacTot_To ;
      AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels = AV56TFFacEst_Sels ;
      AV86Facturacion_mantenimientofacturawwds_22_tffaccob = AV58TFFacCob ;
      AV87Facturacion_mantenimientofacturawwds_23_tffaccob_sel = AV59TFFacCob_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A435FacEst) ,
                                           AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels ,
                                           Integer.valueOf(AV66Facturacion_mantenimientofacturawwds_2_tffaccod) ,
                                           Integer.valueOf(AV67Facturacion_mantenimientofacturawwds_3_tffaccod_to) ,
                                           AV68Facturacion_mantenimientofacturawwds_4_tffacfch ,
                                           Integer.valueOf(AV69Facturacion_mantenimientofacturawwds_5_tfclicod) ,
                                           Integer.valueOf(AV70Facturacion_mantenimientofacturawwds_6_tfclicod_to) ,
                                           AV72Facturacion_mantenimientofacturawwds_8_tfclinom_sel ,
                                           AV71Facturacion_mantenimientofacturawwds_7_tfclinom ,
                                           AV74Facturacion_mantenimientofacturawwds_10_tffacpri_sel ,
                                           AV73Facturacion_mantenimientofacturawwds_9_tffacpri ,
                                           Integer.valueOf(AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels.size()) ,
                                           AV87Facturacion_mantenimientofacturawwds_23_tffaccob_sel ,
                                           AV86Facturacion_mantenimientofacturawwds_22_tffaccob ,
                                           AV36TFFacFch ,
                                           AV37TFFacFch_To ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A450FacPri ,
                                           A965FacCob ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV65Facturacion_mantenimientofacturawwds_1_filterfulltext ,
                                           A441FacImpTot ,
                                           A440FacImpPP ,
                                           A429FacBasImp ,
                                           A442FacIVAImp ,
                                           A455FacTot ,
                                           AV75Facturacion_mantenimientofacturawwds_11_tffacimptot ,
                                           AV76Facturacion_mantenimientofacturawwds_12_tffacimptot_to ,
                                           AV77Facturacion_mantenimientofacturawwds_13_tffacimppp ,
                                           AV78Facturacion_mantenimientofacturawwds_14_tffacimppp_to ,
                                           AV79Facturacion_mantenimientofacturawwds_15_tffacbasimp ,
                                           AV80Facturacion_mantenimientofacturawwds_16_tffacbasimp_to ,
                                           AV81Facturacion_mantenimientofacturawwds_17_tffacivaimp ,
                                           AV82Facturacion_mantenimientofacturawwds_18_tffacivaimp_to ,
                                           AV83Facturacion_mantenimientofacturawwds_19_tffactot ,
                                           AV84Facturacion_mantenimientofacturawwds_20_tffactot_to ,
                                           Byte.valueOf(A1153FacTipFac) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE
                                           }
      });
      lV71Facturacion_mantenimientofacturawwds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV71Facturacion_mantenimientofacturawwds_7_tfclinom), 30, "%") ;
      lV73Facturacion_mantenimientofacturawwds_9_tffacpri = GXutil.padr( GXutil.rtrim( AV73Facturacion_mantenimientofacturawwds_9_tffacpri), 1, "%") ;
      lV86Facturacion_mantenimientofacturawwds_22_tffaccob = GXutil.padr( GXutil.rtrim( AV86Facturacion_mantenimientofacturawwds_22_tffaccob), 1, "%") ;
      /* Using cursor P09YT7 */
      pr_default.execute(0, new Object[] {AV75Facturacion_mantenimientofacturawwds_11_tffacimptot, AV75Facturacion_mantenimientofacturawwds_11_tffacimptot, AV76Facturacion_mantenimientofacturawwds_12_tffacimptot_to, AV76Facturacion_mantenimientofacturawwds_12_tffacimptot_to, AV77Facturacion_mantenimientofacturawwds_13_tffacimppp, AV77Facturacion_mantenimientofacturawwds_13_tffacimppp, AV78Facturacion_mantenimientofacturawwds_14_tffacimppp_to, AV78Facturacion_mantenimientofacturawwds_14_tffacimppp_to, Integer.valueOf(AV66Facturacion_mantenimientofacturawwds_2_tffaccod), Integer.valueOf(AV67Facturacion_mantenimientofacturawwds_3_tffaccod_to), AV68Facturacion_mantenimientofacturawwds_4_tffacfch, Integer.valueOf(AV69Facturacion_mantenimientofacturawwds_5_tfclicod), Integer.valueOf(AV70Facturacion_mantenimientofacturawwds_6_tfclicod_to), lV71Facturacion_mantenimientofacturawwds_7_tfclinom, AV72Facturacion_mantenimientofacturawwds_8_tfclinom_sel, lV73Facturacion_mantenimientofacturawwds_9_tffacpri, AV74Facturacion_mantenimientofacturawwds_10_tffacpri_sel, lV86Facturacion_mantenimientofacturawwds_22_tffaccob, AV87Facturacion_mantenimientofacturawwds_23_tffaccob_sel, AV36TFFacFch, AV37TFFacFch_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1153FacTipFac = P09YT7_A1153FacTipFac[0] ;
         A965FacCob = P09YT7_A965FacCob[0] ;
         A435FacEst = P09YT7_A435FacEst[0] ;
         A450FacPri = P09YT7_A450FacPri[0] ;
         A279CliNom = P09YT7_A279CliNom[0] ;
         A252CliCod = P09YT7_A252CliCod[0] ;
         A436FacFch = P09YT7_A436FacFch[0] ;
         A430FacCod = P09YT7_A430FacCod[0] ;
         A396EmprCod = P09YT7_A396EmprCod[0] ;
         A11513FacRecIca = P09YT7_A11513FacRecIca[0] ;
         A8346FacRecI = P09YT7_A8346FacRecI[0] ;
         n8346FacRecI = P09YT7_n8346FacRecI[0] ;
         A7212FacRect = P09YT7_A7212FacRect[0] ;
         A453FacRECPor = P09YT7_A453FacRECPor[0] ;
         A443FacIVAPor = P09YT7_A443FacIVAPor[0] ;
         A14224FacCostFac = P09YT7_A14224FacCostFac[0] ;
         A14223FacCostKgs = P09YT7_A14223FacCostKgs[0] ;
         A14222FacCostMts = P09YT7_A14222FacCostMts[0] ;
         A433FacDtoGen = P09YT7_A433FacDtoGen[0] ;
         A3918FacImpTot1 = P09YT7_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = P09YT7_n3918FacImpTot1[0] ;
         A7209Colombia = P09YT7_A7209Colombia[0] ;
         n7209Colombia = P09YT7_n7209Colombia[0] ;
         A440FacImpPP = P09YT7_A440FacImpPP[0] ;
         n440FacImpPP = P09YT7_n440FacImpPP[0] ;
         A441FacImpTot = P09YT7_A441FacImpTot[0] ;
         n441FacImpTot = P09YT7_n441FacImpTot[0] ;
         A7209Colombia = P09YT7_A7209Colombia[0] ;
         n7209Colombia = P09YT7_n7209Colombia[0] ;
         A279CliNom = P09YT7_A279CliNom[0] ;
         A441FacImpTot = P09YT7_A441FacImpTot[0] ;
         n441FacImpTot = P09YT7_n441FacImpTot[0] ;
         A3918FacImpTot1 = P09YT7_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = P09YT7_n3918FacImpTot1[0] ;
         A440FacImpPP = P09YT7_A440FacImpPP[0] ;
         n440FacImpPP = P09YT7_n440FacImpPP[0] ;
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Facturacion_mantenimientofacturawwds_15_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV79Facturacion_mantenimientofacturawwds_15_tffacbasimp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Facturacion_mantenimientofacturawwds_16_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV80Facturacion_mantenimientofacturawwds_16_tffacbasimp_to) <= 0 ) ) )
            {
               A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
               A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                  }
                  else
                  {
                     A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                  }
                  else
                  {
                     A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                  }
                  else
                  {
                     A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Facturacion_mantenimientofacturawwds_17_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV81Facturacion_mantenimientofacturawwds_17_tffacivaimp) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Facturacion_mantenimientofacturawwds_18_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV82Facturacion_mantenimientofacturawwds_18_tffacivaimp_to) <= 0 ) ) )
                  {
                     A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     if ( A7209Colombia == 0 )
                     {
                        A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                     }
                     else
                     {
                        if ( A7209Colombia == 1 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                        }
                        else
                        {
                           A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                        }
                     }
                     A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                     if ( (GXutil.strcmp("", AV65Facturacion_mantenimientofacturawwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV65Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV65Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV65Facturacion_mantenimientofacturawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A450FacPri) , GXutil.padr( "%" + GXutil.upper( AV65Facturacion_mantenimientofacturawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A441FacImpTot, 13, 2) , GXutil.padr( "%" + AV65Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A440FacImpPP, 11, 2) , GXutil.padr( "%" + AV65Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A429FacBasImp, 13, 2) , GXutil.padr( "%" + AV65Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A442FacIVAImp, 11, 2) , GXutil.padr( "%" + AV65Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A455FacTot, 13, 2) , GXutil.padr( "%" + AV65Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A435FacEst, 1, 0) , GXutil.padr( "%" + AV65Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A965FacCob) , GXutil.padr( "%" + GXutil.upper( AV65Facturacion_mantenimientofacturawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Facturacion_mantenimientofacturawwds_19_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV83Facturacion_mantenimientofacturawwds_19_tffactot) >= 0 ) ) )
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Facturacion_mantenimientofacturawwds_20_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV84Facturacion_mantenimientofacturawwds_20_tffactot_to) <= 0 ) ) )
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
                                 returnInSub = true;
                                 if (true) return;
                              }
                              AV31VisibleColumnCount = 0 ;
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A430FacCod );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_dtime6 = GXutil.resetTime( A436FacFch );
                                 AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char5[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
                                 mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char5[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A450FacPri, GXv_char5) ;
                                 mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A441FacImpTot)) );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A440FacImpPP)) );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A429FacBasImp)) );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A442FacIVAImp)) );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A455FacTot)) );
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
                                 if ( A435FacEst == 0 )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pdte. Imp.", "") );
                                 }
                                 else if ( A435FacEst == 1 )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Imp.", "") );
                                 }
                                 else if ( A435FacEst == 2 )
                                 {
                                    AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Act.", "") );
                                 }
                                 AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_char4 = "" ;
                                 GXv_char5[0] = GXt_char4 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A965FacCob, GXv_char5) ;
                                 mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacCod", "", "Nº Factura", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacFch", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacPri", "", "P", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacImpTot", "", "Total Bruto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacImpPP", "", "Imp. Dto. P.P.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacBasImp", "", "Base Imp.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacIVAImp", "", "Imp. IVA", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacTot", "", "Total", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacEst", "", "E", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacCob", "", "Ctb", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.MantenimientoFacturaWWColumnsSelector", GXv_char5) ;
      mantenimientofacturawwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Facturacion.MantenimientoFacturaWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.MantenimientoFacturaWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Facturacion.MantenimientoFacturaWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV88GXV3 = 1 ;
      while ( AV88GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV34TFFacCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFFacCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACFCH") == 0 )
         {
            AV36TFFacFch = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV40TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV42TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV43TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACPRI") == 0 )
         {
            AV38TFFacPri = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACPRI_SEL") == 0 )
         {
            AV39TFFacPri_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPTOT") == 0 )
         {
            AV45TFFacImpTot = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFFacImpTot_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPPP") == 0 )
         {
            AV47TFFacImpPP = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFFacImpPP_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBASIMP") == 0 )
         {
            AV49TFFacBasImp = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFFacBasImp_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIVAIMP") == 0 )
         {
            AV51TFFacIVAImp = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFFacIVAImp_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACTOT") == 0 )
         {
            AV53TFFacTot = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFFacTot_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACEST_SEL") == 0 )
         {
            AV55TFFacEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV56TFFacEst_Sels.fromJSonString(AV55TFFacEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOB") == 0 )
         {
            AV58TFFacCob = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOB_SEL") == 0 )
         {
            AV59TFFacCob_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV88GXV3 = (int)(AV88GXV3+1) ;
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
      this.aP0[0] = mantenimientofacturawwexport.this.AV11Filename;
      this.aP1[0] = mantenimientofacturawwexport.this.AV12ErrorMessage;
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
      AV36TFFacFch = GXutil.nullDate() ;
      AV43TFCliNom_Sel = "" ;
      AV42TFCliNom = "" ;
      AV39TFFacPri_Sel = "" ;
      AV38TFFacPri = "" ;
      AV45TFFacImpTot = DecimalUtil.ZERO ;
      AV46TFFacImpTot_To = DecimalUtil.ZERO ;
      AV47TFFacImpPP = DecimalUtil.ZERO ;
      AV48TFFacImpPP_To = DecimalUtil.ZERO ;
      AV49TFFacBasImp = DecimalUtil.ZERO ;
      AV50TFFacBasImp_To = DecimalUtil.ZERO ;
      AV51TFFacIVAImp = DecimalUtil.ZERO ;
      AV52TFFacIVAImp_To = DecimalUtil.ZERO ;
      AV53TFFacTot = DecimalUtil.ZERO ;
      AV54TFFacTot_To = DecimalUtil.ZERO ;
      AV56TFFacEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV59TFFacCob_Sel = "" ;
      AV58TFFacCob = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A436FacFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A450FacPri = "" ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      A965FacCob = "" ;
      AV65Facturacion_mantenimientofacturawwds_1_filterfulltext = "" ;
      AV68Facturacion_mantenimientofacturawwds_4_tffacfch = GXutil.nullDate() ;
      AV71Facturacion_mantenimientofacturawwds_7_tfclinom = "" ;
      AV72Facturacion_mantenimientofacturawwds_8_tfclinom_sel = "" ;
      AV73Facturacion_mantenimientofacturawwds_9_tffacpri = "" ;
      AV74Facturacion_mantenimientofacturawwds_10_tffacpri_sel = "" ;
      AV75Facturacion_mantenimientofacturawwds_11_tffacimptot = DecimalUtil.ZERO ;
      AV76Facturacion_mantenimientofacturawwds_12_tffacimptot_to = DecimalUtil.ZERO ;
      AV77Facturacion_mantenimientofacturawwds_13_tffacimppp = DecimalUtil.ZERO ;
      AV78Facturacion_mantenimientofacturawwds_14_tffacimppp_to = DecimalUtil.ZERO ;
      AV79Facturacion_mantenimientofacturawwds_15_tffacbasimp = DecimalUtil.ZERO ;
      AV80Facturacion_mantenimientofacturawwds_16_tffacbasimp_to = DecimalUtil.ZERO ;
      AV81Facturacion_mantenimientofacturawwds_17_tffacivaimp = DecimalUtil.ZERO ;
      AV82Facturacion_mantenimientofacturawwds_18_tffacivaimp_to = DecimalUtil.ZERO ;
      AV83Facturacion_mantenimientofacturawwds_19_tffactot = DecimalUtil.ZERO ;
      AV84Facturacion_mantenimientofacturawwds_20_tffactot_to = DecimalUtil.ZERO ;
      AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV86Facturacion_mantenimientofacturawwds_22_tffaccob = "" ;
      AV87Facturacion_mantenimientofacturawwds_23_tffaccob_sel = "" ;
      lV65Facturacion_mantenimientofacturawwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV71Facturacion_mantenimientofacturawwds_7_tfclinom = "" ;
      lV73Facturacion_mantenimientofacturawwds_9_tffacpri = "" ;
      lV86Facturacion_mantenimientofacturawwds_22_tffaccob = "" ;
      AV37TFFacFch_To = GXutil.nullDate() ;
      P09YT7_A1153FacTipFac = new byte[1] ;
      P09YT7_A965FacCob = new String[] {""} ;
      P09YT7_A435FacEst = new byte[1] ;
      P09YT7_A450FacPri = new String[] {""} ;
      P09YT7_A279CliNom = new String[] {""} ;
      P09YT7_A252CliCod = new int[1] ;
      P09YT7_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09YT7_A430FacCod = new int[1] ;
      P09YT7_A396EmprCod = new String[] {""} ;
      P09YT7_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_n8346FacRecI = new boolean[] {false} ;
      P09YT7_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_A443FacIVAPor = new byte[1] ;
      P09YT7_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_n3918FacImpTot1 = new boolean[] {false} ;
      P09YT7_A7209Colombia = new byte[1] ;
      P09YT7_n7209Colombia = new boolean[] {false} ;
      P09YT7_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_n440FacImpPP = new boolean[] {false} ;
      P09YT7_A441FacImpTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YT7_n441FacImpTot = new boolean[] {false} ;
      A396EmprCod = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55TFFacEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofacturawwexport__default(),
         new Object[] {
             new Object[] {
            P09YT7_A1153FacTipFac, P09YT7_A965FacCob, P09YT7_A435FacEst, P09YT7_A450FacPri, P09YT7_A279CliNom, P09YT7_A252CliCod, P09YT7_A436FacFch, P09YT7_A430FacCod, P09YT7_A396EmprCod, P09YT7_A11513FacRecIca,
            P09YT7_A8346FacRecI, P09YT7_n8346FacRecI, P09YT7_A7212FacRect, P09YT7_A453FacRECPor, P09YT7_A443FacIVAPor, P09YT7_A14224FacCostFac, P09YT7_A14223FacCostKgs, P09YT7_A14222FacCostMts, P09YT7_A433FacDtoGen, P09YT7_A3918FacImpTot1,
            P09YT7_n3918FacImpTot1, P09YT7_A7209Colombia, P09YT7_n7209Colombia, P09YT7_A440FacImpPP, P09YT7_n440FacImpPP, P09YT7_A441FacImpTot, P09YT7_n441FacImpTot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV57TFFacEst_Sel ;
   private byte A435FacEst ;
   private byte A1153FacTipFac ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFFacCod ;
   private int AV35TFFacCod_To ;
   private int AV40TFCliCod ;
   private int AV41TFCliCod_To ;
   private int AV62GXV1 ;
   private int AV63GXV2 ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV66Facturacion_mantenimientofacturawwds_2_tffaccod ;
   private int AV67Facturacion_mantenimientofacturawwds_3_tffaccod_to ;
   private int AV69Facturacion_mantenimientofacturawwds_5_tfclicod ;
   private int AV70Facturacion_mantenimientofacturawwds_6_tfclicod_to ;
   private int AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels_size ;
   private int AV88GXV3 ;
   private long AV44i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV45TFFacImpTot ;
   private java.math.BigDecimal AV46TFFacImpTot_To ;
   private java.math.BigDecimal AV47TFFacImpPP ;
   private java.math.BigDecimal AV48TFFacImpPP_To ;
   private java.math.BigDecimal AV49TFFacBasImp ;
   private java.math.BigDecimal AV50TFFacBasImp_To ;
   private java.math.BigDecimal AV51TFFacIVAImp ;
   private java.math.BigDecimal AV52TFFacIVAImp_To ;
   private java.math.BigDecimal AV53TFFacTot ;
   private java.math.BigDecimal AV54TFFacTot_To ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV75Facturacion_mantenimientofacturawwds_11_tffacimptot ;
   private java.math.BigDecimal AV76Facturacion_mantenimientofacturawwds_12_tffacimptot_to ;
   private java.math.BigDecimal AV77Facturacion_mantenimientofacturawwds_13_tffacimppp ;
   private java.math.BigDecimal AV78Facturacion_mantenimientofacturawwds_14_tffacimppp_to ;
   private java.math.BigDecimal AV79Facturacion_mantenimientofacturawwds_15_tffacbasimp ;
   private java.math.BigDecimal AV80Facturacion_mantenimientofacturawwds_16_tffacbasimp_to ;
   private java.math.BigDecimal AV81Facturacion_mantenimientofacturawwds_17_tffacivaimp ;
   private java.math.BigDecimal AV82Facturacion_mantenimientofacturawwds_18_tffacivaimp_to ;
   private java.math.BigDecimal AV83Facturacion_mantenimientofacturawwds_19_tffactot ;
   private java.math.BigDecimal AV84Facturacion_mantenimientofacturawwds_20_tffactot_to ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private String AV43TFCliNom_Sel ;
   private String AV42TFCliNom ;
   private String AV39TFFacPri_Sel ;
   private String AV38TFFacPri ;
   private String AV59TFFacCob_Sel ;
   private String AV58TFFacCob ;
   private String A279CliNom ;
   private String A450FacPri ;
   private String A965FacCob ;
   private String AV71Facturacion_mantenimientofacturawwds_7_tfclinom ;
   private String AV72Facturacion_mantenimientofacturawwds_8_tfclinom_sel ;
   private String AV73Facturacion_mantenimientofacturawwds_9_tffacpri ;
   private String AV74Facturacion_mantenimientofacturawwds_10_tffacpri_sel ;
   private String AV86Facturacion_mantenimientofacturawwds_22_tffaccob ;
   private String AV87Facturacion_mantenimientofacturawwds_23_tffaccob_sel ;
   private String scmdbuf ;
   private String lV71Facturacion_mantenimientofacturawwds_7_tfclinom ;
   private String lV73Facturacion_mantenimientofacturawwds_9_tffacpri ;
   private String lV86Facturacion_mantenimientofacturawwds_22_tffaccob ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV36TFFacFch ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV68Facturacion_mantenimientofacturawwds_4_tffacfch ;
   private java.util.Date AV37TFFacFch_To ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n8346FacRecI ;
   private boolean n3918FacImpTot1 ;
   private boolean n7209Colombia ;
   private boolean n440FacImpPP ;
   private boolean n441FacImpTot ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV55TFFacEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV65Facturacion_mantenimientofacturawwds_1_filterfulltext ;
   private String lV65Facturacion_mantenimientofacturawwds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV56TFFacEst_Sels ;
   private GXSimpleCollection<Byte> AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09YT7_A1153FacTipFac ;
   private String[] P09YT7_A965FacCob ;
   private byte[] P09YT7_A435FacEst ;
   private String[] P09YT7_A450FacPri ;
   private String[] P09YT7_A279CliNom ;
   private int[] P09YT7_A252CliCod ;
   private java.util.Date[] P09YT7_A436FacFch ;
   private int[] P09YT7_A430FacCod ;
   private String[] P09YT7_A396EmprCod ;
   private java.math.BigDecimal[] P09YT7_A11513FacRecIca ;
   private java.math.BigDecimal[] P09YT7_A8346FacRecI ;
   private boolean[] P09YT7_n8346FacRecI ;
   private java.math.BigDecimal[] P09YT7_A7212FacRect ;
   private java.math.BigDecimal[] P09YT7_A453FacRECPor ;
   private byte[] P09YT7_A443FacIVAPor ;
   private java.math.BigDecimal[] P09YT7_A14224FacCostFac ;
   private java.math.BigDecimal[] P09YT7_A14223FacCostKgs ;
   private java.math.BigDecimal[] P09YT7_A14222FacCostMts ;
   private java.math.BigDecimal[] P09YT7_A433FacDtoGen ;
   private java.math.BigDecimal[] P09YT7_A3918FacImpTot1 ;
   private boolean[] P09YT7_n3918FacImpTot1 ;
   private byte[] P09YT7_A7209Colombia ;
   private boolean[] P09YT7_n7209Colombia ;
   private java.math.BigDecimal[] P09YT7_A440FacImpPP ;
   private boolean[] P09YT7_n440FacImpPP ;
   private java.math.BigDecimal[] P09YT7_A441FacImpTot ;
   private boolean[] P09YT7_n441FacImpTot ;
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

final  class mantenimientofacturawwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09YT7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A435FacEst ,
                                          GXSimpleCollection<Byte> AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels ,
                                          int AV66Facturacion_mantenimientofacturawwds_2_tffaccod ,
                                          int AV67Facturacion_mantenimientofacturawwds_3_tffaccod_to ,
                                          java.util.Date AV68Facturacion_mantenimientofacturawwds_4_tffacfch ,
                                          int AV69Facturacion_mantenimientofacturawwds_5_tfclicod ,
                                          int AV70Facturacion_mantenimientofacturawwds_6_tfclicod_to ,
                                          String AV72Facturacion_mantenimientofacturawwds_8_tfclinom_sel ,
                                          String AV71Facturacion_mantenimientofacturawwds_7_tfclinom ,
                                          String AV74Facturacion_mantenimientofacturawwds_10_tffacpri_sel ,
                                          String AV73Facturacion_mantenimientofacturawwds_9_tffacpri ,
                                          int AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels_size ,
                                          String AV87Facturacion_mantenimientofacturawwds_23_tffaccob_sel ,
                                          String AV86Facturacion_mantenimientofacturawwds_22_tffaccob ,
                                          java.util.Date AV36TFFacFch ,
                                          java.util.Date AV37TFFacFch_To ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A450FacPri ,
                                          String A965FacCob ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV65Facturacion_mantenimientofacturawwds_1_filterfulltext ,
                                          java.math.BigDecimal A441FacImpTot ,
                                          java.math.BigDecimal A440FacImpPP ,
                                          java.math.BigDecimal A429FacBasImp ,
                                          java.math.BigDecimal A442FacIVAImp ,
                                          java.math.BigDecimal A455FacTot ,
                                          java.math.BigDecimal AV75Facturacion_mantenimientofacturawwds_11_tffacimptot ,
                                          java.math.BigDecimal AV76Facturacion_mantenimientofacturawwds_12_tffacimptot_to ,
                                          java.math.BigDecimal AV77Facturacion_mantenimientofacturawwds_13_tffacimppp ,
                                          java.math.BigDecimal AV78Facturacion_mantenimientofacturawwds_14_tffacimppp_to ,
                                          java.math.BigDecimal AV79Facturacion_mantenimientofacturawwds_15_tffacbasimp ,
                                          java.math.BigDecimal AV80Facturacion_mantenimientofacturawwds_16_tffacbasimp_to ,
                                          java.math.BigDecimal AV81Facturacion_mantenimientofacturawwds_17_tffacivaimp ,
                                          java.math.BigDecimal AV82Facturacion_mantenimientofacturawwds_18_tffacivaimp_to ,
                                          java.math.BigDecimal AV83Facturacion_mantenimientofacturawwds_19_tffactot ,
                                          java.math.BigDecimal AV84Facturacion_mantenimientofacturawwds_20_tffactot_to ,
                                          byte A1153FacTipFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[21];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.FacTipFac, T1.FacCob, T1.FacEst, T1.FacPri, T3.CliNom, T1.CliCod, T1.FacFch, T1.FacCod, T1.EmprCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor," ;
      scmdbuf += " T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, COALESCE( T5.FacImpTot1, 0) AS FacImpTot1, T2.Colombia, COALESCE( T6.FacImpPP, 0) AS FacImpPP," ;
      scmdbuf += " COALESCE( T4.FacImpTot, 0) AS FacImpTot FROM (((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod) INNER JOIN (SELECT ROUND(COALESCE( T8.FacImpTot1, 0), 2) + ROUND(CAST(( COALESCE( T8.FacImpTot1, 0) * CAST(T7.FacEnergia AS NUMERIC(23,10)))" ;
      scmdbuf += " / 100 AS NUMERIC(27,10)), 2) AS FacImpTot, T7.EmprCod, T7.FacCod FROM (TXPCFAVEN T7 LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts" ;
      scmdbuf += " = 0) and (FacPreMts = 0) and (FacImpMan = 0) THEN 0 WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan ELSE ( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T8 ON T8.EmprCod = T7.EmprCod AND T8.FacCod = T7.FacCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod" ;
      scmdbuf += " = T1.FacCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0)" ;
      scmdbuf += " and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) THEN 0 WHEN" ;
      scmdbuf += " (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod = T1.FacCod) LEFT JOIN (SELECT CASE  WHEN COALESCE( T8.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE(" ;
      scmdbuf += " T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 2) WHEN COALESCE( T8.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T9.FacImpTot1," ;
      scmdbuf += " 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 0) END AS FacImpPP, T7.EmprCod, T7.FacCod FROM ((TXPCFAVEN T7 INNER JOIN TXPEMPRES T8 ON T8.EmprCod" ;
      scmdbuf += " = T7.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0)" ;
      scmdbuf += " and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) THEN 0 WHEN" ;
      scmdbuf += " (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T9 ON T9.EmprCod = T7.EmprCod AND T9.FacCod = T7.FacCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacTipFac = 0)");
      if ( ! (0==AV66Facturacion_mantenimientofacturawwds_2_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_mantenimientofacturawwds_3_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68Facturacion_mantenimientofacturawwds_4_tffacfch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Facturacion_mantenimientofacturawwds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Facturacion_mantenimientofacturawwds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Facturacion_mantenimientofacturawwds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV71Facturacion_mantenimientofacturawwds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Facturacion_mantenimientofacturawwds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Facturacion_mantenimientofacturawwds_10_tffacpri_sel)==0) && ( ! (GXutil.strcmp("", AV73Facturacion_mantenimientofacturawwds_9_tffacpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Facturacion_mantenimientofacturawwds_10_tffacpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacPri = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Facturacion_mantenimientofacturawwds_21_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Facturacion_mantenimientofacturawwds_23_tffaccob_sel)==0) && ( ! (GXutil.strcmp("", AV86Facturacion_mantenimientofacturawwds_22_tffaccob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacCob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Facturacion_mantenimientofacturawwds_23_tffaccob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacCob = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFFacFch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFFacFch_To)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.FacFch DESC, T1.FacCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacFch" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacFch DESC" ;
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
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacPri" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacPri DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacEst" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCob" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCob DESC" ;
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
                  return conditional_P09YT7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YT7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,3);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               return;
      }
   }

}

