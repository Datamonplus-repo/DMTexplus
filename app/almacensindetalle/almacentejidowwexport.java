package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidowwexport extends GXProcedure
{
   public almacentejidowwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidowwexport.class ), "" );
   }

   public almacentejidowwexport( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      almacentejidowwexport.this.aP1 = new String[] {""};
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
      almacentejidowwexport.this.aP0 = aP0;
      almacentejidowwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "AlmacenTejidoWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV43TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFCliNom_Sel, GXv_char5) ;
         almacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
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
            almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFCliNom, GXv_char5) ;
            almacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV46TFAlbrHor) && GXutil.dateCompare(GXutil.nullDate(), AV47TFAlbrHor_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( localUtil.format( AV46TFAlbrHor, "99:99:99") );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( localUtil.format( AV47TFAlbrHor_To, "99:99:99") );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFAlbRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFAlbRef_Sel, GXv_char5) ;
         almacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFAlbRef)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFAlbRef, GXv_char5) ;
            almacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV56TFAlbRefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFAlbRefDsc_Sel, GXv_char5) ;
         almacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFAlbRefDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFAlbRefDsc, GXv_char5) ;
            almacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV57TFAlbRPieEnt) && (0==AV58TFAlbRPieEnt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV57TFAlbRPieEnt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV58TFAlbRPieEnt_To );
      }
      if ( ! ( (0==AV59TFAlbRPieUti) && (0==AV60TFAlbRPieUti_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Utilizada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFAlbRPieUti );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFAlbRPieUti_To );
      }
      if ( ! ( (0==AV61TFAlbRPieDis) && (0==AV62TFAlbRPieDis_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV61TFAlbRPieDis );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV62TFAlbRPieDis_To );
      }
      if ( ! ( ( AV64TFAlbRUni_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV50i = 1 ;
         AV79GXV1 = 1 ;
         while ( AV79GXV1 <= AV64TFAlbRUni_Sels.size() )
         {
            AV65TFAlbRUni_Sel = (String)AV64TFAlbRUni_Sels.elementAt(-1+AV79GXV1) ;
            if ( AV50i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV65TFAlbRUni_Sel), httpContext.getMessage( "K", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "K", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV65TFAlbRUni_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "M", "") );
            }
            AV50i = (long)(AV50i+1) ;
            AV79GXV1 = (int)(AV79GXV1+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbRUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFAlbRUniEnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFAlbRUniEnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFAlbRUniEnt_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFAlbRUniUti)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFAlbRUniUti_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Utilizada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68TFAlbRUniUti)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV69TFAlbRUniUti_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFAlbRUniDis)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFAlbRUniDis_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Stock", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70TFAlbRUniDis)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV71TFAlbRUniDis_To)) );
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
      AV81Almacensindetalle_almacentejidowwds_1_tfclinom = AV42TFCliNom ;
      AV82Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV43TFCliNom_Sel ;
      AV83Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV46TFAlbrHor ;
      AV84Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV47TFAlbrHor_To ;
      AV85Almacensindetalle_almacentejidowwds_5_tfalbref = AV48TFAlbRef ;
      AV86Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV49TFAlbRef_Sel ;
      AV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV55TFAlbRefDsc ;
      AV88Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV56TFAlbRefDsc_Sel ;
      AV89Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV57TFAlbRPieEnt ;
      AV90Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV58TFAlbRPieEnt_To ;
      AV91Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV59TFAlbRPieUti ;
      AV92Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV60TFAlbRPieUti_To ;
      AV93Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV61TFAlbRPieDis ;
      AV94Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV62TFAlbRPieDis_To ;
      AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV64TFAlbRUni_Sels ;
      AV96Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV66TFAlbRUniEnt ;
      AV97Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV67TFAlbRUniEnt_To ;
      AV98Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV68TFAlbRUniUti ;
      AV99Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV100Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV70TFAlbRUniDis ;
      AV101Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                           AV82Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                           AV81Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                           AV83Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                           AV84Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                           AV86Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                           AV85Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                           AV88Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                           AV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV89Almacensindetalle_almacentejidowwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV90Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV91Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV92Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV93Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV94Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels.size()) ,
                                           AV96Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                           AV97Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                           AV98Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                           AV99Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                           AV100Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                           AV101Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                           Integer.valueOf(AV72AlbRecCod) ,
                                           AV73AlbRFenfrom ,
                                           AV74AlbRFento ,
                                           Integer.valueOf(AV75CliCod) ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV54VarAlbrEst) ,
                                           AV76EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV81Almacensindetalle_almacentejidowwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV81Almacensindetalle_almacentejidowwds_1_tfclinom), 30, "%") ;
      lV85Almacensindetalle_almacentejidowwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV85Almacensindetalle_almacentejidowwds_5_tfalbref), 16, "%") ;
      lV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor P09J02 */
      pr_default.execute(0, new Object[] {AV76EmprCod, Byte.valueOf(AV54VarAlbrEst), Byte.valueOf(AV54VarAlbrEst), lV81Almacensindetalle_almacentejidowwds_1_tfclinom, AV82Almacensindetalle_almacentejidowwds_2_tfclinom_sel, AV83Almacensindetalle_almacentejidowwds_3_tfalbrhor, AV84Almacensindetalle_almacentejidowwds_4_tfalbrhor_to, lV85Almacensindetalle_almacentejidowwds_5_tfalbref, AV86Almacensindetalle_almacentejidowwds_6_tfalbref_sel, lV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc, AV88Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel, Integer.valueOf(AV89Almacensindetalle_almacentejidowwds_9_tfalbrpieent), Integer.valueOf(AV90Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to), Integer.valueOf(AV91Almacensindetalle_almacentejidowwds_11_tfalbrpieuti), Integer.valueOf(AV92Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to), Integer.valueOf(AV93Almacensindetalle_almacentejidowwds_13_tfalbrpiedis), Integer.valueOf(AV94Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to), AV96Almacensindetalle_almacentejidowwds_16_tfalbrunient, AV97Almacensindetalle_almacentejidowwds_17_tfalbrunient_to, AV98Almacensindetalle_almacentejidowwds_18_tfalbruniuti, AV99Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to, AV100Almacensindetalle_almacentejidowwds_20_tfalbrunidis, AV101Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to, Integer.valueOf(AV72AlbRecCod), AV73AlbRFenfrom, AV74AlbRFento, Integer.valueOf(AV75CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A47AlbREst = P09J02_A47AlbREst[0] ;
         A252CliCod = P09J02_A252CliCod[0] ;
         A49AlbRFen = P09J02_A49AlbRFen[0] ;
         A44AlbRecCod = P09J02_A44AlbRecCod[0] ;
         A396EmprCod = P09J02_A396EmprCod[0] ;
         A56AlbRUni = P09J02_A56AlbRUni[0] ;
         A3613AlbRefDsc = P09J02_A3613AlbRefDsc[0] ;
         A45AlbRef = P09J02_A45AlbRef[0] ;
         A6179AlbrHor = P09J02_A6179AlbrHor[0] ;
         A279CliNom = P09J02_A279CliNom[0] ;
         A54AlbRPieUti = P09J02_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P09J02_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P09J02_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P09J02_A58AlbRUniEnt[0] ;
         A279CliNom = P09J02_A279CliNom[0] ;
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
         almacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( GXt_char4 );
         GXt_dtime6 = GXutil.resetTime( A49AlbRFen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( GXt_dtime6 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( localUtil.format( A6179AlbrHor, "99:99:99") );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A45AlbRef, GXv_char5) ;
         almacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3613AlbRefDsc, GXv_char5) ;
         almacentejidowwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.AlmacenTejidoWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV102GXV2 = 1 ;
      while ( AV102GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV42TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV43TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV46TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            AV47TFAlbrHor_To = GXutil.resetDate(localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV48TFAlbRef = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV49TFAlbRef_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV55TFAlbRefDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV56TFAlbRefDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV57TFAlbRPieEnt = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFAlbRPieEnt_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV59TFAlbRPieUti = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFAlbRPieUti_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV61TFAlbRPieDis = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFAlbRPieDis_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV63TFAlbRUni_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV64TFAlbRUni_Sels.fromJSonString(AV63TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV66TFAlbRUniEnt = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV67TFAlbRUniEnt_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV68TFAlbRUniUti = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV69TFAlbRUniUti_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV70TFAlbRUniDis = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV71TFAlbRUniDis_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV102GXV2 = (int)(AV102GXV2+1) ;
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
      this.aP0[0] = almacentejidowwexport.this.AV11Filename;
      this.aP1[0] = almacentejidowwexport.this.AV12ErrorMessage;
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
      AV43TFCliNom_Sel = "" ;
      AV42TFCliNom = "" ;
      AV46TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV47TFAlbrHor_To = GXutil.resetTime( GXutil.nullDate() );
      AV49TFAlbRef_Sel = "" ;
      AV48TFAlbRef = "" ;
      AV56TFAlbRefDsc_Sel = "" ;
      AV55TFAlbRefDsc = "" ;
      AV64TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV65TFAlbRUni_Sel = "" ;
      AV66TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV67TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV68TFAlbRUniUti = DecimalUtil.ZERO ;
      AV69TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV70TFAlbRUniDis = DecimalUtil.ZERO ;
      AV71TFAlbRUniDis_To = DecimalUtil.ZERO ;
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
      AV81Almacensindetalle_almacentejidowwds_1_tfclinom = "" ;
      AV82Almacensindetalle_almacentejidowwds_2_tfclinom_sel = "" ;
      AV83Almacensindetalle_almacentejidowwds_3_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      AV84Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = GXutil.resetTime( GXutil.nullDate() );
      AV85Almacensindetalle_almacentejidowwds_5_tfalbref = "" ;
      AV86Almacensindetalle_almacentejidowwds_6_tfalbref_sel = "" ;
      AV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = "" ;
      AV88Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = "" ;
      AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV96Almacensindetalle_almacentejidowwds_16_tfalbrunient = DecimalUtil.ZERO ;
      AV97Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = DecimalUtil.ZERO ;
      AV98Almacensindetalle_almacentejidowwds_18_tfalbruniuti = DecimalUtil.ZERO ;
      AV99Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV100Almacensindetalle_almacentejidowwds_20_tfalbrunidis = DecimalUtil.ZERO ;
      AV101Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV81Almacensindetalle_almacentejidowwds_1_tfclinom = "" ;
      lV85Almacensindetalle_almacentejidowwds_5_tfalbref = "" ;
      lV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = "" ;
      AV73AlbRFenfrom = GXutil.nullDate() ;
      AV74AlbRFento = GXutil.nullDate() ;
      AV76EmprCod = "" ;
      A396EmprCod = "" ;
      P09J02_A47AlbREst = new byte[1] ;
      P09J02_A252CliCod = new int[1] ;
      P09J02_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P09J02_A44AlbRecCod = new int[1] ;
      P09J02_A396EmprCod = new String[] {""} ;
      P09J02_A56AlbRUni = new String[] {""} ;
      P09J02_A3613AlbRefDsc = new String[] {""} ;
      P09J02_A45AlbRef = new String[] {""} ;
      P09J02_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P09J02_A279CliNom = new String[] {""} ;
      P09J02_A54AlbRPieUti = new int[1] ;
      P09J02_A52AlbRPieEnt = new int[1] ;
      P09J02_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09J02_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV63TFAlbRUni_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidowwexport__default(),
         new Object[] {
             new Object[] {
            P09J02_A47AlbREst, P09J02_A252CliCod, P09J02_A49AlbRFen, P09J02_A44AlbRecCod, P09J02_A396EmprCod, P09J02_A56AlbRUni, P09J02_A3613AlbRefDsc, P09J02_A45AlbRef, P09J02_A6179AlbrHor, P09J02_A279CliNom,
            P09J02_A54AlbRPieUti, P09J02_A52AlbRPieEnt, P09J02_A60AlbRUniUti, P09J02_A58AlbRUniEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private byte AV54VarAlbrEst ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV57TFAlbRPieEnt ;
   private int AV58TFAlbRPieEnt_To ;
   private int AV59TFAlbRPieUti ;
   private int AV60TFAlbRPieUti_To ;
   private int AV61TFAlbRPieDis ;
   private int AV62TFAlbRPieDis_To ;
   private int AV79GXV1 ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV89Almacensindetalle_almacentejidowwds_9_tfalbrpieent ;
   private int AV90Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ;
   private int AV91Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ;
   private int AV92Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ;
   private int AV93Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ;
   private int AV94Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ;
   private int AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ;
   private int AV72AlbRecCod ;
   private int AV75CliCod ;
   private int AV102GXV2 ;
   private long AV50i ;
   private java.math.BigDecimal AV66TFAlbRUniEnt ;
   private java.math.BigDecimal AV67TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV68TFAlbRUniUti ;
   private java.math.BigDecimal AV69TFAlbRUniUti_To ;
   private java.math.BigDecimal AV70TFAlbRUniDis ;
   private java.math.BigDecimal AV71TFAlbRUniDis_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV96Almacensindetalle_almacentejidowwds_16_tfalbrunient ;
   private java.math.BigDecimal AV97Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ;
   private java.math.BigDecimal AV98Almacensindetalle_almacentejidowwds_18_tfalbruniuti ;
   private java.math.BigDecimal AV99Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ;
   private java.math.BigDecimal AV100Almacensindetalle_almacentejidowwds_20_tfalbrunidis ;
   private java.math.BigDecimal AV101Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ;
   private String AV43TFCliNom_Sel ;
   private String AV42TFCliNom ;
   private String AV49TFAlbRef_Sel ;
   private String AV48TFAlbRef ;
   private String AV56TFAlbRefDsc_Sel ;
   private String AV55TFAlbRefDsc ;
   private String AV65TFAlbRUni_Sel ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String AV81Almacensindetalle_almacentejidowwds_1_tfclinom ;
   private String AV82Almacensindetalle_almacentejidowwds_2_tfclinom_sel ;
   private String AV85Almacensindetalle_almacentejidowwds_5_tfalbref ;
   private String AV86Almacensindetalle_almacentejidowwds_6_tfalbref_sel ;
   private String AV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ;
   private String AV88Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String lV81Almacensindetalle_almacentejidowwds_1_tfclinom ;
   private String lV85Almacensindetalle_almacentejidowwds_5_tfalbref ;
   private String lV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ;
   private String AV76EmprCod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV46TFAlbrHor ;
   private java.util.Date AV47TFAlbrHor_To ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV83Almacensindetalle_almacentejidowwds_3_tfalbrhor ;
   private java.util.Date AV84Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV73AlbRFenfrom ;
   private java.util.Date AV74AlbRFento ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV63TFAlbRUni_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV64TFAlbRUni_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09J02_A47AlbREst ;
   private int[] P09J02_A252CliCod ;
   private java.util.Date[] P09J02_A49AlbRFen ;
   private int[] P09J02_A44AlbRecCod ;
   private String[] P09J02_A396EmprCod ;
   private String[] P09J02_A56AlbRUni ;
   private String[] P09J02_A3613AlbRefDsc ;
   private String[] P09J02_A45AlbRef ;
   private java.util.Date[] P09J02_A6179AlbrHor ;
   private String[] P09J02_A279CliNom ;
   private int[] P09J02_A54AlbRPieUti ;
   private int[] P09J02_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P09J02_A60AlbRUniUti ;
   private java.math.BigDecimal[] P09J02_A58AlbRUniEnt ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class almacentejidowwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09J02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                          String AV82Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                          String AV81Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                          java.util.Date AV83Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                          java.util.Date AV84Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                          String AV86Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                          String AV85Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                          String AV88Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                          String AV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                          int AV89Almacensindetalle_almacentejidowwds_9_tfalbrpieent ,
                                          int AV90Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ,
                                          int AV91Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ,
                                          int AV92Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ,
                                          int AV93Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ,
                                          int AV94Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ,
                                          int AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV96Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV97Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV98Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV99Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV100Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV101Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                          int AV72AlbRecCod ,
                                          java.util.Date AV73AlbRFenfrom ,
                                          java.util.Date AV74AlbRFento ,
                                          int AV75CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          byte A47AlbREst ,
                                          byte AV54VarAlbrEst ,
                                          String AV76EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[27];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.AlbREst, T1.CliCod, T1.AlbRFen, T1.AlbRecCod, T1.EmprCod, T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T1.AlbrHor, T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRUniEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      if ( (GXutil.strcmp("", AV82Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV81Almacensindetalle_almacentejidowwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Almacensindetalle_almacentejidowwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Almacensindetalle_almacentejidowwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV85Almacensindetalle_almacentejidowwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV87Almacensindetalle_almacentejidowwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (0==AV89Almacensindetalle_almacentejidowwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( ! (0==AV92Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! (0==AV93Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      if ( ! (0==AV94Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      if ( AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV95Almacensindetalle_almacentejidowwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Almacensindetalle_almacentejidowwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int7[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Almacensindetalle_almacentejidowwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int7[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Almacensindetalle_almacentejidowwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int7[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int7[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Almacensindetalle_almacentejidowwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int7[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int7[22] = (byte)(1) ;
      }
      if ( ! (0==AV72AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int7[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73AlbRFenfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int7[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74AlbRFento)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int7[25] = (byte)(1) ;
      }
      if ( ! (0==AV75CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int7[26] = (byte)(1) ;
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
                  return conditional_P09J02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09J02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[32], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], true);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
      }
   }

}

