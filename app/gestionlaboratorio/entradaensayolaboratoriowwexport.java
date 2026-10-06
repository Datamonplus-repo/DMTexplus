package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaensayolaboratoriowwexport extends GXProcedure
{
   public entradaensayolaboratoriowwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratoriowwexport.class ), "" );
   }

   public entradaensayolaboratoriowwexport( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      entradaensayolaboratoriowwexport.this.aP1 = new String[] {""};
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
      entradaensayolaboratoriowwexport.this.aP0 = aP0;
      entradaensayolaboratoriowwexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV86EmprCod = AV93Websession.getValue(httpContext.getMessage( "&EmprCod", "")) ;
      AV87Lb_FechaEfrom = localUtil.ctod( AV93Websession.getValue(httpContext.getMessage( "&Lb_FechaEfrom", "")), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV88Lb_FechaEto = localUtil.ctod( AV93Websession.getValue(httpContext.getMessage( "&Lb_FechaEto", "")), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV93Websession.remove(httpContext.getMessage( "&EmprCod", ""));
      AV93Websession.remove(httpContext.getMessage( "&Lb_FechaEfrom", ""));
      AV93Websession.remove(httpContext.getMessage( "&Lb_FechaEto", ""));
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
      AV11Filename = "./PrivateTempStorage/" + "EntradaEnsayoLaboratorioWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFLb_numero) && (0==AV35TFLb_numero_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº de Ensayo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFLb_numero );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFLb_numero_To );
      }
      if ( ! ( (0==AV36TFCliCod) && (0==AV37TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFCliNom_Sel, GXv_char5) ;
         entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
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
            entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFCliNom, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV41TFLb_ArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFLb_ArtCod_Sel, GXv_char5) ;
         entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFLb_ArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFLb_ArtCod, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFLb_ArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFLb_ArtDsc_Sel, GXv_char5) ;
         entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFLb_ArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFLb_ArtDsc, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFLb_ColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFLb_ColNom_Sel, GXv_char5) ;
         entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFLb_ColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFLb_ColNom, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV50TFLb_ColNum) && (0==AV51TFLb_ColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFLb_ColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFLb_ColNum_To );
      }
      if ( ! ( (0==AV52TFTipColCod) && (0==AV53TFTipColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFTipColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFTipColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV57TFLb_ColNomC_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFLb_ColNomC_Sel, GXv_char5) ;
         entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFLb_ColNomC)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFLb_ColNomC, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV58TFLb_ColNumC) && (0==AV59TFLb_ColNumC_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV58TFLb_ColNumC );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV59TFLb_ColNumC_To );
      }
      if ( ! ( (GXutil.strcmp("", AV61TFLb_Cartaz_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFLb_Cartaz_Sel, GXv_char5) ;
         entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV60TFLb_Cartaz)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFLb_Cartaz, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV64TFLb_HoraE) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( localUtil.format( AV64TFLb_HoraE, "99:99") );
      }
      if ( ! ( ( AV84TFLb_EstEns_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV80i = 1 ;
         AV97GXV1 = 1 ;
         while ( AV97GXV1 <= AV84TFLb_EstEns_Sels.size() )
         {
            AV85TFLb_EstEns_Sel = ((Number) AV84TFLb_EstEns_Sels.elementAt(-1+AV97GXV1)).byteValue() ;
            if ( AV80i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV85TFLb_EstEns_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pdte. Act. Txp", "") );
            }
            else if ( AV85TFLb_EstEns_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Act. en Txp", "") );
            }
            else if ( AV85TFLb_EstEns_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Cerrado", "") );
            }
            AV80i = (long)(AV80i+1) ;
            AV97GXV1 = (int)(AV97GXV1+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFLb_Rb)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFLb_Rb_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rb", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV74TFLb_Rb)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV75TFLb_Rb_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV90TFLb_Pantone_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pantone", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFLb_Pantone_Sel, GXv_char5) ;
         entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV89TFLb_Pantone)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pantone", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFLb_Pantone, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV92TFLb_PedCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "V/Pedido", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92TFLb_PedCod_Sel, GXv_char5) ;
         entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV91TFLb_PedCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "V/Pedido", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            entradaensayolaboratoriowwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91TFLb_PedCod, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV98GXV2 = 1 ;
      while ( AV98GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV98GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV98GXV2 = (int)(AV98GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = AV18FilterFullText ;
      AV101Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero = AV34TFLb_numero ;
      AV102Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to = AV35TFLb_numero_To ;
      AV103Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod = AV36TFCliCod ;
      AV104Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to = AV37TFCliCod_To ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = AV38TFCliNom ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = AV39TFCliNom_Sel ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = AV40TFLb_ArtCod ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = AV41TFLb_ArtCod_Sel ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = AV42TFLb_ArtDsc ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = AV43TFLb_ArtDsc_Sel ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = AV48TFLb_ColNom ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = AV49TFLb_ColNom_Sel ;
      AV113Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum = AV50TFLb_ColNum ;
      AV114Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to = AV51TFLb_ColNum_To ;
      AV115Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod = AV52TFTipColCod ;
      AV116Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to = AV53TFTipColCod_To ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = AV56TFLb_ColNomC ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = AV57TFLb_ColNomC_Sel ;
      AV119Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc = AV58TFLb_ColNumC ;
      AV120Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to = AV59TFLb_ColNumC_To ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = AV60TFLb_Cartaz ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = AV61TFLb_Cartaz_Sel ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = AV64TFLb_HoraE ;
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = AV84TFLb_EstEns_Sels ;
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = AV74TFLb_Rb ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = AV75TFLb_Rb_To ;
      AV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = AV89TFLb_Pantone ;
      AV128Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = AV90TFLb_Pantone_Sel ;
      AV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = AV91TFLb_PedCod ;
      AV130Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = AV92TFLb_PedCod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                           AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                           Integer.valueOf(AV101Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) ,
                                           Integer.valueOf(AV102Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV103Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) ,
                                           Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) ,
                                           AV106Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                           AV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                           AV108Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                           AV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                           AV110Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                           AV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                           AV112Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                           AV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                           Integer.valueOf(AV113Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) ,
                                           Integer.valueOf(AV114Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) ,
                                           Byte.valueOf(AV116Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) ,
                                           AV118Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                           AV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                           Integer.valueOf(AV119Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) ,
                                           Integer.valueOf(AV120Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) ,
                                           AV122Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                           AV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                           AV123Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                           Integer.valueOf(AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels.size()) ,
                                           AV125Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                           AV126Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                           AV128Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                           AV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                           AV130Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                           AV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                           AV87Lb_FechaEfrom ,
                                           AV88Lb_FechaEto ,
                                           Integer.valueOf(AV94lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5539Lb_ColNumC) ,
                                           A5540Lb_Cartaz ,
                                           A5547Lb_Rb ,
                                           A6546Lb_Pantone ,
                                           A6618Lb_PedCod ,
                                           A5542Lb_HoraE ,
                                           A5541Lb_FechaE ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV86EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext), "%", "") ;
      lV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom), 30, "%") ;
      lV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod), 16, "%") ;
      lV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc), 26, "%") ;
      lV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom), 13, "%") ;
      lV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc), 13, "%") ;
      lV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz), 20, "%") ;
      lV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = GXutil.padr( GXutil.rtrim( AV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone), 100, "%") ;
      lV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = GXutil.padr( GXutil.rtrim( AV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod), 50, "%") ;
      /* Using cursor P09OI2 */
      pr_default.execute(0, new Object[] {AV86EmprCod, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext, Integer.valueOf(AV101Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero), Integer.valueOf(AV102Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to), Integer.valueOf(AV103Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod), Integer.valueOf(AV104Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to), lV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom, AV106Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel, lV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod, AV108Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel, lV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc, AV110Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel, lV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom, AV112Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel, Integer.valueOf(AV113Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum), Integer.valueOf(AV114Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to), Byte.valueOf(AV115Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod), Byte.valueOf(AV116Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to), lV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc, AV118Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel, Integer.valueOf(AV119Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc), Integer.valueOf(AV120Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to), lV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz, AV122Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel, AV123Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae, AV125Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb, AV126Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to, lV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone, AV128Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel, lV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod, AV130Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel, AV87Lb_FechaEfrom, AV88Lb_FechaEto, Integer.valueOf(AV94lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5541Lb_FechaE = P09OI2_A5541Lb_FechaE[0] ;
         A396EmprCod = P09OI2_A396EmprCod[0] ;
         A6618Lb_PedCod = P09OI2_A6618Lb_PedCod[0] ;
         A6546Lb_Pantone = P09OI2_A6546Lb_Pantone[0] ;
         A5547Lb_Rb = P09OI2_A5547Lb_Rb[0] ;
         A5569Lb_EstEns = P09OI2_A5569Lb_EstEns[0] ;
         A5542Lb_HoraE = P09OI2_A5542Lb_HoraE[0] ;
         A5540Lb_Cartaz = P09OI2_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P09OI2_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P09OI2_A5538Lb_ColNomC[0] ;
         A831TipColCod = P09OI2_A831TipColCod[0] ;
         n831TipColCod = P09OI2_n831TipColCod[0] ;
         A5537Lb_ColNum = P09OI2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OI2_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P09OI2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P09OI2_A5533Lb_ArtCod[0] ;
         A279CliNom = P09OI2_A279CliNom[0] ;
         A252CliCod = P09OI2_A252CliCod[0] ;
         A5532Lb_numero = P09OI2_A5532Lb_numero[0] ;
         A279CliNom = P09OI2_A279CliNom[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5532Lb_numero );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5533Lb_ArtCod, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5534Lb_ArtDsc, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5536Lb_ColNom, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5537Lb_ColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A831TipColCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5538Lb_ColNomC, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5539Lb_ColNumC );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5540Lb_Cartaz, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5541Lb_FechaE );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( localUtil.format( A5542Lb_HoraE, "99:99") );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
            if ( A5569Lb_EstEns == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pdte. Act. Txp", "") );
            }
            else if ( A5569Lb_EstEns == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Act. en Txp", "") );
            }
            else if ( A5569Lb_EstEns == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Cerrado", "") );
            }
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5547Lb_Rb)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6546Lb_Pantone, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6618Lb_PedCod, GXv_char5) ;
            entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ArtDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColCod", "", "TC", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNumC", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaE", "Entrada", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_HoraE", "Entrada", "Hora", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_EstEns", "", "E", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Rb", "", "Rb", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Pantone", "", "Pantone", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_PedCod", "", "V/Pedido", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EntradaEnsayoLaboratorioWWColumnsSelector", GXv_char5) ;
      entradaensayolaboratoriowwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EntradaEnsayoLaboratorioWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("GestionLaboratorio.EntradaEnsayoLaboratorioWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV131GXV3 = 1 ;
      while ( AV131GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV131GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV34TFLb_numero = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFLb_numero_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV38TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV39TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV40TFLb_ArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV41TFLb_ArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV42TFLb_ArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV43TFLb_ArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV48TFLb_ColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV49TFLb_ColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV50TFLb_ColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFLb_ColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV52TFTipColCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFTipColCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV56TFLb_ColNomC = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV57TFLb_ColNomC_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUMC") == 0 )
         {
            AV58TFLb_ColNumC = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFLb_ColNumC_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV60TFLb_Cartaz = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV61TFLb_Cartaz_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HORAE") == 0 )
         {
            AV64TFLb_HoraE = GXutil.resetDate(localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTENS_SEL") == 0 )
         {
            AV83TFLb_EstEns_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV84TFLb_EstEns_Sels.fromJSonString(AV83TFLb_EstEns_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV74TFLb_Rb = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV75TFLb_Rb_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PANTONE") == 0 )
         {
            AV89TFLb_Pantone = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PANTONE_SEL") == 0 )
         {
            AV90TFLb_Pantone_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PEDCOD") == 0 )
         {
            AV91TFLb_PedCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PEDCOD_SEL") == 0 )
         {
            AV92TFLb_PedCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV131GXV3 = (int)(AV131GXV3+1) ;
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
      this.aP0[0] = entradaensayolaboratoriowwexport.this.AV11Filename;
      this.aP1[0] = entradaensayolaboratoriowwexport.this.AV12ErrorMessage;
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
      AV86EmprCod = "" ;
      AV93Websession = httpContext.getWebSession();
      AV87Lb_FechaEfrom = GXutil.nullDate() ;
      AV88Lb_FechaEto = GXutil.nullDate() ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV18FilterFullText = "" ;
      AV39TFCliNom_Sel = "" ;
      AV38TFCliNom = "" ;
      AV41TFLb_ArtCod_Sel = "" ;
      AV40TFLb_ArtCod = "" ;
      AV43TFLb_ArtDsc_Sel = "" ;
      AV42TFLb_ArtDsc = "" ;
      AV49TFLb_ColNom_Sel = "" ;
      AV48TFLb_ColNom = "" ;
      AV57TFLb_ColNomC_Sel = "" ;
      AV56TFLb_ColNomC = "" ;
      AV61TFLb_Cartaz_Sel = "" ;
      AV60TFLb_Cartaz = "" ;
      AV64TFLb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      AV84TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV74TFLb_Rb = DecimalUtil.ZERO ;
      AV75TFLb_Rb_To = DecimalUtil.ZERO ;
      AV90TFLb_Pantone_Sel = "" ;
      AV89TFLb_Pantone = "" ;
      AV92TFLb_PedCod_Sel = "" ;
      AV91TFLb_PedCod = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A6546Lb_Pantone = "" ;
      A6618Lb_PedCod = "" ;
      AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = "" ;
      AV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = "" ;
      AV106Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel = "" ;
      AV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = "" ;
      AV108Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel = "" ;
      AV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = "" ;
      AV110Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel = "" ;
      AV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = "" ;
      AV112Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel = "" ;
      AV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = "" ;
      AV118Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel = "" ;
      AV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = "" ;
      AV122Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel = "" ;
      AV123Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae = GXutil.resetTime( GXutil.nullDate() );
      AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV125Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb = DecimalUtil.ZERO ;
      AV126Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to = DecimalUtil.ZERO ;
      AV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = "" ;
      AV128Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel = "" ;
      AV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = "" ;
      AV130Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel = "" ;
      scmdbuf = "" ;
      lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext = "" ;
      lV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom = "" ;
      lV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod = "" ;
      lV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc = "" ;
      lV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom = "" ;
      lV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc = "" ;
      lV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz = "" ;
      lV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone = "" ;
      lV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod = "" ;
      A396EmprCod = "" ;
      P09OI2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OI2_A396EmprCod = new String[] {""} ;
      P09OI2_A6618Lb_PedCod = new String[] {""} ;
      P09OI2_A6546Lb_Pantone = new String[] {""} ;
      P09OI2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OI2_A5569Lb_EstEns = new byte[1] ;
      P09OI2_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OI2_A5540Lb_Cartaz = new String[] {""} ;
      P09OI2_A5539Lb_ColNumC = new int[1] ;
      P09OI2_A5538Lb_ColNomC = new String[] {""} ;
      P09OI2_A831TipColCod = new byte[1] ;
      P09OI2_n831TipColCod = new boolean[] {false} ;
      P09OI2_A5537Lb_ColNum = new int[1] ;
      P09OI2_A5536Lb_ColNom = new String[] {""} ;
      P09OI2_A5534Lb_ArtDsc = new String[] {""} ;
      P09OI2_A5533Lb_ArtCod = new String[] {""} ;
      P09OI2_A279CliNom = new String[] {""} ;
      P09OI2_A252CliCod = new int[1] ;
      P09OI2_A5532Lb_numero = new int[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV83TFLb_EstEns_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratoriowwexport__default(),
         new Object[] {
             new Object[] {
            P09OI2_A5541Lb_FechaE, P09OI2_A396EmprCod, P09OI2_A6618Lb_PedCod, P09OI2_A6546Lb_Pantone, P09OI2_A5547Lb_Rb, P09OI2_A5569Lb_EstEns, P09OI2_A5542Lb_HoraE, P09OI2_A5540Lb_Cartaz, P09OI2_A5539Lb_ColNumC, P09OI2_A5538Lb_ColNomC,
            P09OI2_A831TipColCod, P09OI2_n831TipColCod, P09OI2_A5537Lb_ColNum, P09OI2_A5536Lb_ColNom, P09OI2_A5534Lb_ArtDsc, P09OI2_A5533Lb_ArtCod, P09OI2_A279CliNom, P09OI2_A252CliCod, P09OI2_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV52TFTipColCod ;
   private byte AV53TFTipColCod_To ;
   private byte AV85TFLb_EstEns_Sel ;
   private byte A831TipColCod ;
   private byte A5569Lb_EstEns ;
   private byte AV115Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ;
   private byte AV116Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFLb_numero ;
   private int AV35TFLb_numero_To ;
   private int AV36TFCliCod ;
   private int AV37TFCliCod_To ;
   private int AV50TFLb_ColNum ;
   private int AV51TFLb_ColNum_To ;
   private int AV58TFLb_ColNumC ;
   private int AV59TFLb_ColNumC_To ;
   private int AV97GXV1 ;
   private int AV98GXV2 ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int A5539Lb_ColNumC ;
   private int AV101Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ;
   private int AV102Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ;
   private int AV103Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ;
   private int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ;
   private int AV113Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ;
   private int AV114Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ;
   private int AV119Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ;
   private int AV120Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ;
   private int AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ;
   private int AV94lb_numero ;
   private int AV131GXV3 ;
   private long AV80i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV74TFLb_Rb ;
   private java.math.BigDecimal AV75TFLb_Rb_To ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV125Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ;
   private java.math.BigDecimal AV126Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ;
   private String AV86EmprCod ;
   private String AV39TFCliNom_Sel ;
   private String AV38TFCliNom ;
   private String AV41TFLb_ArtCod_Sel ;
   private String AV40TFLb_ArtCod ;
   private String AV43TFLb_ArtDsc_Sel ;
   private String AV42TFLb_ArtDsc ;
   private String AV49TFLb_ColNom_Sel ;
   private String AV48TFLb_ColNom ;
   private String AV57TFLb_ColNomC_Sel ;
   private String AV56TFLb_ColNomC ;
   private String AV61TFLb_Cartaz_Sel ;
   private String AV60TFLb_Cartaz ;
   private String AV90TFLb_Pantone_Sel ;
   private String AV89TFLb_Pantone ;
   private String AV92TFLb_PedCod_Sel ;
   private String AV91TFLb_PedCod ;
   private String A279CliNom ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5540Lb_Cartaz ;
   private String A6546Lb_Pantone ;
   private String A6618Lb_PedCod ;
   private String AV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ;
   private String AV106Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ;
   private String AV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ;
   private String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ;
   private String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ;
   private String AV110Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ;
   private String AV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ;
   private String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ;
   private String AV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ;
   private String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ;
   private String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ;
   private String AV122Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ;
   private String AV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ;
   private String AV128Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ;
   private String AV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ;
   private String AV130Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ;
   private String scmdbuf ;
   private String lV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ;
   private String lV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ;
   private String lV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ;
   private String lV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ;
   private String lV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ;
   private String lV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ;
   private String lV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ;
   private String lV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV64TFLb_HoraE ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date AV123Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV87Lb_FechaEfrom ;
   private java.util.Date AV88Lb_FechaEto ;
   private java.util.Date A5541Lb_FechaE ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n831TipColCod ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV83TFLb_EstEns_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ;
   private String lV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV84TFLb_EstEns_Sels ;
   private GXSimpleCollection<Byte> AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ;
   private com.genexus.webpanels.WebSession AV93Websession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P09OI2_A5541Lb_FechaE ;
   private String[] P09OI2_A396EmprCod ;
   private String[] P09OI2_A6618Lb_PedCod ;
   private String[] P09OI2_A6546Lb_Pantone ;
   private java.math.BigDecimal[] P09OI2_A5547Lb_Rb ;
   private byte[] P09OI2_A5569Lb_EstEns ;
   private java.util.Date[] P09OI2_A5542Lb_HoraE ;
   private String[] P09OI2_A5540Lb_Cartaz ;
   private int[] P09OI2_A5539Lb_ColNumC ;
   private String[] P09OI2_A5538Lb_ColNomC ;
   private byte[] P09OI2_A831TipColCod ;
   private boolean[] P09OI2_n831TipColCod ;
   private int[] P09OI2_A5537Lb_ColNum ;
   private String[] P09OI2_A5536Lb_ColNom ;
   private String[] P09OI2_A5534Lb_ArtDsc ;
   private String[] P09OI2_A5533Lb_ArtCod ;
   private String[] P09OI2_A279CliNom ;
   private int[] P09OI2_A252CliCod ;
   private int[] P09OI2_A5532Lb_numero ;
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

final  class entradaensayolaboratoriowwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels ,
                                          String AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext ,
                                          int AV101Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero ,
                                          int AV102Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to ,
                                          int AV103Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod ,
                                          int AV104Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to ,
                                          String AV106Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel ,
                                          String AV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom ,
                                          String AV108Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel ,
                                          String AV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod ,
                                          String AV110Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel ,
                                          String AV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc ,
                                          String AV112Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel ,
                                          String AV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom ,
                                          int AV113Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum ,
                                          int AV114Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to ,
                                          byte AV115Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod ,
                                          byte AV116Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to ,
                                          String AV118Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel ,
                                          String AV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc ,
                                          int AV119Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc ,
                                          int AV120Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to ,
                                          String AV122Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel ,
                                          String AV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz ,
                                          java.util.Date AV123Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae ,
                                          int AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size ,
                                          java.math.BigDecimal AV125Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb ,
                                          java.math.BigDecimal AV126Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to ,
                                          String AV128Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel ,
                                          String AV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone ,
                                          String AV130Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel ,
                                          String AV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod ,
                                          java.util.Date AV87Lb_FechaEfrom ,
                                          java.util.Date AV88Lb_FechaEto ,
                                          int AV94lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5539Lb_ColNumC ,
                                          String A5540Lb_Cartaz ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A6546Lb_Pantone ,
                                          String A6618Lb_PedCod ,
                                          java.util.Date A5542Lb_HoraE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV86EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[48];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.Lb_FechaE, T1.EmprCod, T1.Lb_PedCod, T1.Lb_Pantone, T1.Lb_Rb, T1.Lb_EstEns, T1.Lb_HoraE, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T1.TipColCod, T1.Lb_ColNum," ;
      scmdbuf += " T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod, T1.Lb_numero FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV100Gestionlaboratorio_entradaensayolaboratoriowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNumC,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_Pantone) like '%' || UPPER(?)) or ( UPPER(T1.Lb_PedCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
         GXv_int9[12] = (byte)(1) ;
         GXv_int9[13] = (byte)(1) ;
         GXv_int9[14] = (byte)(1) ;
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV101Gestionlaboratorio_entradaensayolaboratoriowwds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV102Gestionlaboratorio_entradaensayolaboratoriowwds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV103Gestionlaboratorio_entradaensayolaboratoriowwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV104Gestionlaboratorio_entradaensayolaboratoriowwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Gestionlaboratorio_entradaensayolaboratoriowwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_entradaensayolaboratoriowwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Gestionlaboratorio_entradaensayolaboratoriowwds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Gestionlaboratorio_entradaensayolaboratoriowwds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Gestionlaboratorio_entradaensayolaboratoriowwds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Gestionlaboratorio_entradaensayolaboratoriowwds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_entradaensayolaboratoriowwds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_entradaensayolaboratoriowwds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV113Gestionlaboratorio_entradaensayolaboratoriowwds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV114Gestionlaboratorio_entradaensayolaboratoriowwds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Gestionlaboratorio_entradaensayolaboratoriowwds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Gestionlaboratorio_entradaensayolaboratoriowwds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV117Gestionlaboratorio_entradaensayolaboratoriowwds_18_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Gestionlaboratorio_entradaensayolaboratoriowwds_19_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV119Gestionlaboratorio_entradaensayolaboratoriowwds_20_tflb_colnumc) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (0==AV120Gestionlaboratorio_entradaensayolaboratoriowwds_21_tflb_colnumc_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNumC <= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_entradaensayolaboratoriowwds_22_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Gestionlaboratorio_entradaensayolaboratoriowwds_23_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Gestionlaboratorio_entradaensayolaboratoriowwds_24_tflb_horae) )
      {
         addWhere(sWhereString, "(T1.Lb_HoraE >= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV124Gestionlaboratorio_entradaensayolaboratoriowwds_25_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Gestionlaboratorio_entradaensayolaboratoriowwds_26_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Gestionlaboratorio_entradaensayolaboratoriowwds_27_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) && ( ! (GXutil.strcmp("", AV127Gestionlaboratorio_entradaensayolaboratoriowwds_28_tflb_pantone)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Pantone) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Gestionlaboratorio_entradaensayolaboratoriowwds_29_tflb_pantone_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Pantone = ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) && ( ! (GXutil.strcmp("", AV129Gestionlaboratorio_entradaensayolaboratoriowwds_30_tflb_pedcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_PedCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Gestionlaboratorio_entradaensayolaboratoriowwds_31_tflb_pedcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_PedCod = ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (0==AV94lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
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
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNumC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNumC DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_HoraE" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_HoraE DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_EstEns" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_EstEns DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Rb" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Rb DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Pantone" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Pantone DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_PedCod" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_PedCod DESC" ;
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
                  return conditional_P09OI2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , ((Boolean) dynConstraints[53]).booleanValue() , (String)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
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
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 20);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[86], true);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 50);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               return;
      }
   }

}

