package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn22wwexport extends GXProcedure
{
   public ttrn22wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn22wwexport.class ), "" );
   }

   public ttrn22wwexport( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ttrn22wwexport.this.aP1 = new String[] {""};
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
      ttrn22wwexport.this.aP0 = aP0;
      ttrn22wwexport.this.aP1 = aP1;
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
      S191 ();
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
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "TTrn22WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV39TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFCliNom_Sel, GXv_char5) ;
         ttrn22wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFCliNom, GXv_char5) ;
            ttrn22wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV46TFAlbrHor) && GXutil.dateCompare(GXutil.nullDate(), AV47TFAlbrHor_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( localUtil.format( AV46TFAlbrHor, "99:99:99") );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( localUtil.format( AV47TFAlbrHor_To, "99:99:99") );
      }
      if ( ! ( (GXutil.strcmp("", AV42TFAlbRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFAlbRef_Sel, GXv_char5) ;
         ttrn22wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFAlbRef)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFAlbRef, GXv_char5) ;
            ttrn22wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV44TFAlbRefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFAlbRefDsc_Sel, GXv_char5) ;
         ttrn22wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFAlbRefDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFAlbRefDsc, GXv_char5) ;
            ttrn22wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV48TFAlbRPieEnt) && (0==AV49TFAlbRPieEnt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFAlbRPieEnt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFAlbRPieEnt_To );
      }
      if ( ! ( (0==AV50TFAlbRPieUti) && (0==AV51TFAlbRPieUti_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Utilizada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFAlbRPieUti );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFAlbRPieUti_To );
      }
      if ( ! ( (0==AV52TFAlbRPieDis) && (0==AV53TFAlbRPieDis_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFAlbRPieDis );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFAlbRPieDis_To );
      }
      if ( ! ( ( AV55TFAlbRUni_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV45i = 1 ;
         AV65GXV1 = 1 ;
         while ( AV65GXV1 <= AV55TFAlbRUni_Sels.size() )
         {
            AV56TFAlbRUni_Sel = (String)AV55TFAlbRUni_Sels.elementAt(-1+AV65GXV1) ;
            if ( AV45i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV56TFAlbRUni_Sel), httpContext.getMessage( "K", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "K", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV56TFAlbRUni_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "M", "") );
            }
            AV45i = (long)(AV45i+1) ;
            AV65GXV1 = (int)(AV65GXV1+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFAlbRUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFAlbRUniEnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFAlbRUniEnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFAlbRUniEnt_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFAlbRUniUti)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFAlbRUniUti_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Utilizada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFAlbRUniUti)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFAlbRUniUti_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFAlbRUniDis)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFAlbRUniDis_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFAlbRUniDis)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn22wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFAlbRUniDis_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "N Recepcion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Codigo", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Hora", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( httpContext.getMessage( "Codigo", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setText( httpContext.getMessage( "Entrada", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setText( httpContext.getMessage( "Utilizada", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setText( httpContext.getMessage( "Stock", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setText( httpContext.getMessage( "Unidad", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+11, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+11, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+11, 1, 1).setText( httpContext.getMessage( "Entrada", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+12, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+12, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+12, 1, 1).setText( httpContext.getMessage( "Utilizada", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+13, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+13, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+13, 1, 1).setText( httpContext.getMessage( "Stock", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+14, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+14, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+14, 1, 1).setText( httpContext.getMessage( "Estado", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV67Ttrn22wwds_1_tfclinom = AV38TFCliNom ;
      AV68Ttrn22wwds_2_tfclinom_sel = AV39TFCliNom_Sel ;
      AV69Ttrn22wwds_3_tfalbrhor = AV46TFAlbrHor ;
      AV70Ttrn22wwds_4_tfalbrhor_to = AV47TFAlbrHor_To ;
      AV71Ttrn22wwds_5_tfalbref = AV41TFAlbRef ;
      AV72Ttrn22wwds_6_tfalbref_sel = AV42TFAlbRef_Sel ;
      AV73Ttrn22wwds_7_tfalbrefdsc = AV43TFAlbRefDsc ;
      AV74Ttrn22wwds_8_tfalbrefdsc_sel = AV44TFAlbRefDsc_Sel ;
      AV75Ttrn22wwds_9_tfalbrpieent = AV48TFAlbRPieEnt ;
      AV76Ttrn22wwds_10_tfalbrpieent_to = AV49TFAlbRPieEnt_To ;
      AV77Ttrn22wwds_11_tfalbrpieuti = AV50TFAlbRPieUti ;
      AV78Ttrn22wwds_12_tfalbrpieuti_to = AV51TFAlbRPieUti_To ;
      AV79Ttrn22wwds_13_tfalbrpiedis = AV52TFAlbRPieDis ;
      AV80Ttrn22wwds_14_tfalbrpiedis_to = AV53TFAlbRPieDis_To ;
      AV81Ttrn22wwds_15_tfalbruni_sels = AV55TFAlbRUni_Sels ;
      AV82Ttrn22wwds_16_tfalbrunient = AV57TFAlbRUniEnt ;
      AV83Ttrn22wwds_17_tfalbrunient_to = AV58TFAlbRUniEnt_To ;
      AV84Ttrn22wwds_18_tfalbruniuti = AV59TFAlbRUniUti ;
      AV85Ttrn22wwds_19_tfalbruniuti_to = AV60TFAlbRUniUti_To ;
      AV86Ttrn22wwds_20_tfalbrunidis = AV61TFAlbRUniDis ;
      AV87Ttrn22wwds_21_tfalbrunidis_to = AV62TFAlbRUniDis_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV81Ttrn22wwds_15_tfalbruni_sels ,
                                           AV68Ttrn22wwds_2_tfclinom_sel ,
                                           AV67Ttrn22wwds_1_tfclinom ,
                                           AV69Ttrn22wwds_3_tfalbrhor ,
                                           AV70Ttrn22wwds_4_tfalbrhor_to ,
                                           AV72Ttrn22wwds_6_tfalbref_sel ,
                                           AV71Ttrn22wwds_5_tfalbref ,
                                           AV74Ttrn22wwds_8_tfalbrefdsc_sel ,
                                           AV73Ttrn22wwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV75Ttrn22wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV76Ttrn22wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV77Ttrn22wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV78Ttrn22wwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV79Ttrn22wwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV80Ttrn22wwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV81Ttrn22wwds_15_tfalbruni_sels.size()) ,
                                           AV82Ttrn22wwds_16_tfalbrunient ,
                                           AV83Ttrn22wwds_17_tfalbrunient_to ,
                                           AV84Ttrn22wwds_18_tfalbruniuti ,
                                           AV85Ttrn22wwds_19_tfalbruniuti_to ,
                                           AV86Ttrn22wwds_20_tfalbrunidis ,
                                           AV87Ttrn22wwds_21_tfalbrunidis_to ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV67Ttrn22wwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV67Ttrn22wwds_1_tfclinom), 30, "%") ;
      lV71Ttrn22wwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV71Ttrn22wwds_5_tfalbref), 16, "%") ;
      lV73Ttrn22wwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV73Ttrn22wwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor P0ATN2 */
      pr_default.execute(0, new Object[] {lV67Ttrn22wwds_1_tfclinom, AV68Ttrn22wwds_2_tfclinom_sel, AV69Ttrn22wwds_3_tfalbrhor, AV70Ttrn22wwds_4_tfalbrhor_to, lV71Ttrn22wwds_5_tfalbref, AV72Ttrn22wwds_6_tfalbref_sel, lV73Ttrn22wwds_7_tfalbrefdsc, AV74Ttrn22wwds_8_tfalbrefdsc_sel, Integer.valueOf(AV75Ttrn22wwds_9_tfalbrpieent), Integer.valueOf(AV76Ttrn22wwds_10_tfalbrpieent_to), Integer.valueOf(AV77Ttrn22wwds_11_tfalbrpieuti), Integer.valueOf(AV78Ttrn22wwds_12_tfalbrpieuti_to), Integer.valueOf(AV79Ttrn22wwds_13_tfalbrpiedis), Integer.valueOf(AV80Ttrn22wwds_14_tfalbrpiedis_to), AV82Ttrn22wwds_16_tfalbrunient, AV83Ttrn22wwds_17_tfalbrunient_to, AV84Ttrn22wwds_18_tfalbruniuti, AV85Ttrn22wwds_19_tfalbruniuti_to, AV86Ttrn22wwds_20_tfalbrunidis, AV87Ttrn22wwds_21_tfalbrunidis_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A56AlbRUni = P0ATN2_A56AlbRUni[0] ;
         A3613AlbRefDsc = P0ATN2_A3613AlbRefDsc[0] ;
         A45AlbRef = P0ATN2_A45AlbRef[0] ;
         A6179AlbrHor = P0ATN2_A6179AlbrHor[0] ;
         A279CliNom = P0ATN2_A279CliNom[0] ;
         A47AlbREst = P0ATN2_A47AlbREst[0] ;
         A49AlbRFen = P0ATN2_A49AlbRFen[0] ;
         A252CliCod = P0ATN2_A252CliCod[0] ;
         A44AlbRecCod = P0ATN2_A44AlbRecCod[0] ;
         A396EmprCod = P0ATN2_A396EmprCod[0] ;
         A54AlbRPieUti = P0ATN2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0ATN2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0ATN2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0ATN2_A58AlbRUniEnt[0] ;
         A279CliNom = P0ATN2_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( A44AlbRecCod );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( A252CliCod );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
         ttrn22wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( GXt_char4 );
         GXt_dtime6 = GXutil.resetTime( A49AlbRFen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( GXt_dtime6 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( localUtil.format( A6179AlbrHor, "99:99:99") );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A45AlbRef, GXv_char5) ;
         ttrn22wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3613AlbRefDsc, GXv_char5) ;
         ttrn22wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( GXt_char4 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setNumber( A52AlbRPieEnt );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setNumber( A54AlbRPieUti );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setNumber( A51AlbRPieDis );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setText( "" );
         if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "K", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setText( httpContext.getMessage( "K", "") );
         }
         else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "M", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setText( httpContext.getMessage( "M", "") );
         }
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A58AlbRUniEnt)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A60AlbRUniUti)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A57AlbRUniDis)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+14, 1, 1).setText( "" );
         if ( A47AlbREst == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+14, 1, 1).setText( httpContext.getMessage( "Abierta", "") );
         }
         else if ( A47AlbREst == 1 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+14, 1, 1).setText( httpContext.getMessage( "Cerrada", "") );
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
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

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("TTrn22WWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn22WWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("TTrn22WWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV88GXV2 = 1 ;
      while ( AV88GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV38TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV39TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV46TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            AV47TFAlbrHor_To = GXutil.resetDate(localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV41TFAlbRef = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV42TFAlbRef_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV43TFAlbRefDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV44TFAlbRefDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV48TFAlbRPieEnt = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFAlbRPieEnt_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV50TFAlbRPieUti = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFAlbRPieUti_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV52TFAlbRPieDis = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFAlbRPieDis_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV54TFAlbRUni_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFAlbRUni_Sels.fromJSonString(AV54TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV57TFAlbRUniEnt = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFAlbRUniEnt_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV59TFAlbRUniUti = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFAlbRUniUti_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV61TFAlbRUniDis = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFAlbRUniDis_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV88GXV2 = (int)(AV88GXV2+1) ;
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

   protected void cleanup( )
   {
      this.aP0[0] = ttrn22wwexport.this.AV11Filename;
      this.aP1[0] = ttrn22wwexport.this.AV12ErrorMessage;
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
      AV39TFCliNom_Sel = "" ;
      AV38TFCliNom = "" ;
      AV46TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV47TFAlbrHor_To = GXutil.resetTime( GXutil.nullDate() );
      AV42TFAlbRef_Sel = "" ;
      AV41TFAlbRef = "" ;
      AV44TFAlbRefDsc_Sel = "" ;
      AV43TFAlbRefDsc = "" ;
      AV55TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56TFAlbRUni_Sel = "" ;
      AV57TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV58TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV59TFAlbRUniUti = DecimalUtil.ZERO ;
      AV60TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV61TFAlbRUniDis = DecimalUtil.ZERO ;
      AV62TFAlbRUniDis_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A279CliNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV67Ttrn22wwds_1_tfclinom = "" ;
      AV68Ttrn22wwds_2_tfclinom_sel = "" ;
      AV69Ttrn22wwds_3_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      AV70Ttrn22wwds_4_tfalbrhor_to = GXutil.resetTime( GXutil.nullDate() );
      AV71Ttrn22wwds_5_tfalbref = "" ;
      AV72Ttrn22wwds_6_tfalbref_sel = "" ;
      AV73Ttrn22wwds_7_tfalbrefdsc = "" ;
      AV74Ttrn22wwds_8_tfalbrefdsc_sel = "" ;
      AV81Ttrn22wwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV82Ttrn22wwds_16_tfalbrunient = DecimalUtil.ZERO ;
      AV83Ttrn22wwds_17_tfalbrunient_to = DecimalUtil.ZERO ;
      AV84Ttrn22wwds_18_tfalbruniuti = DecimalUtil.ZERO ;
      AV85Ttrn22wwds_19_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV86Ttrn22wwds_20_tfalbrunidis = DecimalUtil.ZERO ;
      AV87Ttrn22wwds_21_tfalbrunidis_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV67Ttrn22wwds_1_tfclinom = "" ;
      lV71Ttrn22wwds_5_tfalbref = "" ;
      lV73Ttrn22wwds_7_tfalbrefdsc = "" ;
      P0ATN2_A56AlbRUni = new String[] {""} ;
      P0ATN2_A3613AlbRefDsc = new String[] {""} ;
      P0ATN2_A45AlbRef = new String[] {""} ;
      P0ATN2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATN2_A279CliNom = new String[] {""} ;
      P0ATN2_A47AlbREst = new byte[1] ;
      P0ATN2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATN2_A252CliCod = new int[1] ;
      P0ATN2_A44AlbRecCod = new int[1] ;
      P0ATN2_A396EmprCod = new String[] {""} ;
      P0ATN2_A54AlbRPieUti = new int[1] ;
      P0ATN2_A52AlbRPieEnt = new int[1] ;
      P0ATN2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATN2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54TFAlbRUni_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn22wwexport__default(),
         new Object[] {
             new Object[] {
            P0ATN2_A56AlbRUni, P0ATN2_A3613AlbRefDsc, P0ATN2_A45AlbRef, P0ATN2_A6179AlbrHor, P0ATN2_A279CliNom, P0ATN2_A47AlbREst, P0ATN2_A49AlbRFen, P0ATN2_A252CliCod, P0ATN2_A44AlbRecCod, P0ATN2_A396EmprCod,
            P0ATN2_A54AlbRPieUti, P0ATN2_A52AlbRPieEnt, P0ATN2_A60AlbRUniUti, P0ATN2_A58AlbRUniEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV48TFAlbRPieEnt ;
   private int AV49TFAlbRPieEnt_To ;
   private int AV50TFAlbRPieUti ;
   private int AV51TFAlbRPieUti_To ;
   private int AV52TFAlbRPieDis ;
   private int AV53TFAlbRPieDis_To ;
   private int AV65GXV1 ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV75Ttrn22wwds_9_tfalbrpieent ;
   private int AV76Ttrn22wwds_10_tfalbrpieent_to ;
   private int AV77Ttrn22wwds_11_tfalbrpieuti ;
   private int AV78Ttrn22wwds_12_tfalbrpieuti_to ;
   private int AV79Ttrn22wwds_13_tfalbrpiedis ;
   private int AV80Ttrn22wwds_14_tfalbrpiedis_to ;
   private int AV81Ttrn22wwds_15_tfalbruni_sels_size ;
   private int AV88GXV2 ;
   private long AV45i ;
   private java.math.BigDecimal AV57TFAlbRUniEnt ;
   private java.math.BigDecimal AV58TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV59TFAlbRUniUti ;
   private java.math.BigDecimal AV60TFAlbRUniUti_To ;
   private java.math.BigDecimal AV61TFAlbRUniDis ;
   private java.math.BigDecimal AV62TFAlbRUniDis_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV82Ttrn22wwds_16_tfalbrunient ;
   private java.math.BigDecimal AV83Ttrn22wwds_17_tfalbrunient_to ;
   private java.math.BigDecimal AV84Ttrn22wwds_18_tfalbruniuti ;
   private java.math.BigDecimal AV85Ttrn22wwds_19_tfalbruniuti_to ;
   private java.math.BigDecimal AV86Ttrn22wwds_20_tfalbrunidis ;
   private java.math.BigDecimal AV87Ttrn22wwds_21_tfalbrunidis_to ;
   private String AV39TFCliNom_Sel ;
   private String AV38TFCliNom ;
   private String AV42TFAlbRef_Sel ;
   private String AV41TFAlbRef ;
   private String AV44TFAlbRefDsc_Sel ;
   private String AV43TFAlbRefDsc ;
   private String AV56TFAlbRUni_Sel ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String AV67Ttrn22wwds_1_tfclinom ;
   private String AV68Ttrn22wwds_2_tfclinom_sel ;
   private String AV71Ttrn22wwds_5_tfalbref ;
   private String AV72Ttrn22wwds_6_tfalbref_sel ;
   private String AV73Ttrn22wwds_7_tfalbrefdsc ;
   private String AV74Ttrn22wwds_8_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String lV67Ttrn22wwds_1_tfclinom ;
   private String lV71Ttrn22wwds_5_tfalbref ;
   private String lV73Ttrn22wwds_7_tfalbrefdsc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV46TFAlbrHor ;
   private java.util.Date AV47TFAlbrHor_To ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV69Ttrn22wwds_3_tfalbrhor ;
   private java.util.Date AV70Ttrn22wwds_4_tfalbrhor_to ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV54TFAlbRUni_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV55TFAlbRUni_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATN2_A56AlbRUni ;
   private String[] P0ATN2_A3613AlbRefDsc ;
   private String[] P0ATN2_A45AlbRef ;
   private java.util.Date[] P0ATN2_A6179AlbrHor ;
   private String[] P0ATN2_A279CliNom ;
   private byte[] P0ATN2_A47AlbREst ;
   private java.util.Date[] P0ATN2_A49AlbRFen ;
   private int[] P0ATN2_A252CliCod ;
   private int[] P0ATN2_A44AlbRecCod ;
   private String[] P0ATN2_A396EmprCod ;
   private int[] P0ATN2_A54AlbRPieUti ;
   private int[] P0ATN2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0ATN2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0ATN2_A58AlbRUniEnt ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV81Ttrn22wwds_15_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class ttrn22wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ATN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV81Ttrn22wwds_15_tfalbruni_sels ,
                                          String AV68Ttrn22wwds_2_tfclinom_sel ,
                                          String AV67Ttrn22wwds_1_tfclinom ,
                                          java.util.Date AV69Ttrn22wwds_3_tfalbrhor ,
                                          java.util.Date AV70Ttrn22wwds_4_tfalbrhor_to ,
                                          String AV72Ttrn22wwds_6_tfalbref_sel ,
                                          String AV71Ttrn22wwds_5_tfalbref ,
                                          String AV74Ttrn22wwds_8_tfalbrefdsc_sel ,
                                          String AV73Ttrn22wwds_7_tfalbrefdsc ,
                                          int AV75Ttrn22wwds_9_tfalbrpieent ,
                                          int AV76Ttrn22wwds_10_tfalbrpieent_to ,
                                          int AV77Ttrn22wwds_11_tfalbrpieuti ,
                                          int AV78Ttrn22wwds_12_tfalbrpieuti_to ,
                                          int AV79Ttrn22wwds_13_tfalbrpiedis ,
                                          int AV80Ttrn22wwds_14_tfalbrpiedis_to ,
                                          int AV81Ttrn22wwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV82Ttrn22wwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV83Ttrn22wwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV84Ttrn22wwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV85Ttrn22wwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV86Ttrn22wwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV87Ttrn22wwds_21_tfalbrunidis_to ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[20];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T1.AlbrHor, T2.CliNom, T1.AlbREst, T1.AlbRFen, T1.CliCod, T1.AlbRecCod, T1.EmprCod, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRUniEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV68Ttrn22wwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV67Ttrn22wwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ttrn22wwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Ttrn22wwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV70Ttrn22wwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Ttrn22wwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV71Ttrn22wwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Ttrn22wwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Ttrn22wwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Ttrn22wwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Ttrn22wwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (0==AV75Ttrn22wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! (0==AV76Ttrn22wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (0==AV77Ttrn22wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (0==AV78Ttrn22wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (0==AV79Ttrn22wwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( ! (0==AV80Ttrn22wwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( AV81Ttrn22wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Ttrn22wwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Ttrn22wwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Ttrn22wwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Ttrn22wwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Ttrn22wwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int7[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Ttrn22wwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int7[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Ttrn22wwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int7[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbrHor" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbrHor DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
      }
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
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
                  return conditional_P0ATN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
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
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
      }
   }

}

