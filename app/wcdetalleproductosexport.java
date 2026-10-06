package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcdetalleproductosexport extends GXProcedure
{
   public wcdetalleproductosexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdetalleproductosexport.class ), "" );
   }

   public wcdetalleproductosexport( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcdetalleproductosexport.this.aP1 = new String[] {""};
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
      wcdetalleproductosexport.this.aP0 = aP0;
      wcdetalleproductosexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCDetalleProductosExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (0==AV65TFHreRecLin) && (0==AV66TFHreRecLin_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV65TFHreRecLin );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV66TFHreRecLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV35TFHrePrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFHrePrdNum_Sel, GXv_char5) ;
         wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFHrePrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFHrePrdNum, GXv_char5) ;
            wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFHrePrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFHrePrdDsc_Sel, GXv_char5) ;
         wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFHrePrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFHrePrdDsc, GXv_char5) ;
            wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFHreFacCon)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFHreFacCon_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFHreFacCon)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50TFHreFacCon_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV52TFHrePrdUDs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFHrePrdUDs_Sel, GXv_char5) ;
         wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFHrePrdUDs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFHrePrdUDs, GXv_char5) ;
            wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFHrePrdCant)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFHrePrdCant_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Final", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFHrePrdCant)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TFHrePrdCant_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFHreCanAny)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFHreCanAny_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Añadida", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFHreCanAny)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFHreCanAny_To)) );
      }
      if ( ! ( (0==AV59TFHreForNro) && (0==AV60TFHreForNro_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFHreForNro );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFHreForNro_To );
      }
      if ( ! ( (0==AV61TFHrePrdTnq) && (0==AV62TFHrePrdTnq_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tq", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV61TFHrePrdTnq );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV62TFHrePrdTnq_To );
      }
      if ( ! ( (GXutil.strcmp("", AV64TFHreLinUsr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFHreLinUsr_Sel, GXv_char5) ;
         wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFHreLinUsr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcdetalleproductosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFHreLinUsr, GXv_char5) ;
            wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( "#" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Factor", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( httpContext.getMessage( "Teorica", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( httpContext.getMessage( "Final", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setText( httpContext.getMessage( "Añadida", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setText( "%" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setText( httpContext.getMessage( "Nº orden", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setText( httpContext.getMessage( "Tq", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+11, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+11, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+11, 1, 1).setText( httpContext.getMessage( "Usuario", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+12, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+12, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+12, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV70Wcdetalleproductosds_1_tfhrereclin = AV65TFHreRecLin ;
      AV71Wcdetalleproductosds_2_tfhrereclin_to = AV66TFHreRecLin_To ;
      AV72Wcdetalleproductosds_3_tfhreprdnum = AV34TFHrePrdNum ;
      AV73Wcdetalleproductosds_4_tfhreprdnum_sel = AV35TFHrePrdNum_Sel ;
      AV74Wcdetalleproductosds_5_tfhreprddsc = AV36TFHrePrdDsc ;
      AV75Wcdetalleproductosds_6_tfhreprddsc_sel = AV37TFHrePrdDsc_Sel ;
      AV76Wcdetalleproductosds_7_tfhrefaccon = AV49TFHreFacCon ;
      AV77Wcdetalleproductosds_8_tfhrefaccon_to = AV50TFHreFacCon_To ;
      AV78Wcdetalleproductosds_9_tfhreprduds = AV51TFHrePrdUDs ;
      AV79Wcdetalleproductosds_10_tfhreprduds_sel = AV52TFHrePrdUDs_Sel ;
      AV80Wcdetalleproductosds_11_tfhreprdcant = AV53TFHrePrdCant ;
      AV81Wcdetalleproductosds_12_tfhreprdcant_to = AV54TFHrePrdCant_To ;
      AV82Wcdetalleproductosds_13_tfhrecanany = AV57TFHreCanAny ;
      AV83Wcdetalleproductosds_14_tfhrecanany_to = AV58TFHreCanAny_To ;
      AV84Wcdetalleproductosds_15_tfhrefornro = AV59TFHreForNro ;
      AV85Wcdetalleproductosds_16_tfhrefornro_to = AV60TFHreForNro_To ;
      AV86Wcdetalleproductosds_17_tfhreprdtnq = AV61TFHrePrdTnq ;
      AV87Wcdetalleproductosds_18_tfhreprdtnq_to = AV62TFHrePrdTnq_To ;
      AV88Wcdetalleproductosds_19_tfhrelinusr = AV63TFHreLinUsr ;
      AV89Wcdetalleproductosds_20_tfhrelinusr_sel = AV64TFHreLinUsr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV70Wcdetalleproductosds_1_tfhrereclin) ,
                                           Short.valueOf(AV71Wcdetalleproductosds_2_tfhrereclin_to) ,
                                           AV73Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                           AV72Wcdetalleproductosds_3_tfhreprdnum ,
                                           AV75Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                           AV74Wcdetalleproductosds_5_tfhreprddsc ,
                                           AV76Wcdetalleproductosds_7_tfhrefaccon ,
                                           AV77Wcdetalleproductosds_8_tfhrefaccon_to ,
                                           AV79Wcdetalleproductosds_10_tfhreprduds_sel ,
                                           AV78Wcdetalleproductosds_9_tfhreprduds ,
                                           AV80Wcdetalleproductosds_11_tfhreprdcant ,
                                           AV81Wcdetalleproductosds_12_tfhreprdcant_to ,
                                           AV82Wcdetalleproductosds_13_tfhrecanany ,
                                           AV83Wcdetalleproductosds_14_tfhrecanany_to ,
                                           Byte.valueOf(AV84Wcdetalleproductosds_15_tfhrefornro) ,
                                           Byte.valueOf(AV85Wcdetalleproductosds_16_tfhrefornro_to) ,
                                           Byte.valueOf(AV86Wcdetalleproductosds_17_tfhreprdtnq) ,
                                           Byte.valueOf(AV87Wcdetalleproductosds_18_tfhreprdtnq_to) ,
                                           AV89Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                           AV88Wcdetalleproductosds_19_tfhrelinusr ,
                                           Short.valueOf(A4557HreRecLin) ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4562HreFacCon ,
                                           A4561HrePrdUDs ,
                                           A4563HrePrdCant ,
                                           A4565HreCanAny ,
                                           Byte.valueOf(A4566HreForNro) ,
                                           Byte.valueOf(A4567HrePrdTnq) ,
                                           A4582HreLinUsr ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV39EmprCod ,
                                           Integer.valueOf(AV40HreBarCod) ,
                                           Byte.valueOf(AV41HreBarReo) ,
                                           AV42HreBarPar ,
                                           Byte.valueOf(AV43HreNumCie) ,
                                           Short.valueOf(AV44HreLinMaq) ,
                                           Byte.valueOf(AV45HreLinPro) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Byte.valueOf(A4550HreLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE
                                           }
      });
      lV72Wcdetalleproductosds_3_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV72Wcdetalleproductosds_3_tfhreprdnum), 6, "%") ;
      lV74Wcdetalleproductosds_5_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV74Wcdetalleproductosds_5_tfhreprddsc), 26, "%") ;
      lV78Wcdetalleproductosds_9_tfhreprduds = GXutil.padr( GXutil.rtrim( AV78Wcdetalleproductosds_9_tfhreprduds), 5, "%") ;
      lV88Wcdetalleproductosds_19_tfhrelinusr = GXutil.padr( GXutil.rtrim( AV88Wcdetalleproductosds_19_tfhrelinusr), 8, "%") ;
      /* Using cursor P08ZC2 */
      pr_default.execute(0, new Object[] {AV39EmprCod, Integer.valueOf(AV40HreBarCod), Byte.valueOf(AV41HreBarReo), AV42HreBarPar, Byte.valueOf(AV43HreNumCie), Short.valueOf(AV44HreLinMaq), Byte.valueOf(AV45HreLinPro), Short.valueOf(AV70Wcdetalleproductosds_1_tfhrereclin), Short.valueOf(AV71Wcdetalleproductosds_2_tfhrereclin_to), lV72Wcdetalleproductosds_3_tfhreprdnum, AV73Wcdetalleproductosds_4_tfhreprdnum_sel, lV74Wcdetalleproductosds_5_tfhreprddsc, AV75Wcdetalleproductosds_6_tfhreprddsc_sel, AV76Wcdetalleproductosds_7_tfhrefaccon, AV77Wcdetalleproductosds_8_tfhrefaccon_to, lV78Wcdetalleproductosds_9_tfhreprduds, AV79Wcdetalleproductosds_10_tfhreprduds_sel, AV80Wcdetalleproductosds_11_tfhreprdcant, AV81Wcdetalleproductosds_12_tfhreprdcant_to, AV82Wcdetalleproductosds_13_tfhrecanany, AV83Wcdetalleproductosds_14_tfhrecanany_to, Byte.valueOf(AV84Wcdetalleproductosds_15_tfhrefornro), Byte.valueOf(AV85Wcdetalleproductosds_16_tfhrefornro_to), Byte.valueOf(AV86Wcdetalleproductosds_17_tfhreprdtnq), Byte.valueOf(AV87Wcdetalleproductosds_18_tfhreprdtnq_to), lV88Wcdetalleproductosds_19_tfhrelinusr, AV89Wcdetalleproductosds_20_tfhrelinusr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4550HreLinPro = P08ZC2_A4550HreLinPro[0] ;
         A4545HreLinMaq = P08ZC2_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08ZC2_A4495HreNumCie[0] ;
         A4494HreBarPar = P08ZC2_A4494HreBarPar[0] ;
         A4493HreBarReo = P08ZC2_A4493HreBarReo[0] ;
         A4492HreBarCod = P08ZC2_A4492HreBarCod[0] ;
         A396EmprCod = P08ZC2_A396EmprCod[0] ;
         A4582HreLinUsr = P08ZC2_A4582HreLinUsr[0] ;
         n4582HreLinUsr = P08ZC2_n4582HreLinUsr[0] ;
         A4567HrePrdTnq = P08ZC2_A4567HrePrdTnq[0] ;
         n4567HrePrdTnq = P08ZC2_n4567HrePrdTnq[0] ;
         A4566HreForNro = P08ZC2_A4566HreForNro[0] ;
         n4566HreForNro = P08ZC2_n4566HreForNro[0] ;
         A4565HreCanAny = P08ZC2_A4565HreCanAny[0] ;
         n4565HreCanAny = P08ZC2_n4565HreCanAny[0] ;
         A4563HrePrdCant = P08ZC2_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08ZC2_n4563HrePrdCant[0] ;
         A4561HrePrdUDs = P08ZC2_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08ZC2_n4561HrePrdUDs[0] ;
         A4562HreFacCon = P08ZC2_A4562HreFacCon[0] ;
         n4562HreFacCon = P08ZC2_n4562HreFacCon[0] ;
         A4559HrePrdDsc = P08ZC2_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08ZC2_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P08ZC2_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08ZC2_n4558HrePrdNum[0] ;
         A4557HreRecLin = P08ZC2_A4557HreRecLin[0] ;
         A4564HreCanFin = P08ZC2_A4564HreCanFin[0] ;
         n4564HreCanFin = P08ZC2_n4564HreCanFin[0] ;
         A4583HrePesFec = P08ZC2_A4583HrePesFec[0] ;
         n4583HrePesFec = P08ZC2_n4583HrePesFec[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( A4557HreRecLin );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4558HrePrdNum, GXv_char5) ;
         wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4559HrePrdDsc, GXv_char5) ;
         wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( GXt_char4 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4562HreFacCon)) );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4561HrePrdUDs, GXv_char5) ;
         wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( GXt_char4 );
         AV46HreCanFin = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A4564HreCanFin)==0) ? A4563HrePrdCant : A4564HreCanFin) ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46HreCanFin)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4563HrePrdCant)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4565HreCanAny)) );
         AV47Porc = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46HreCanFin)==0) ? DecimalUtil.doubleToDec(0) : (A4565HreCanAny.divide(AV46HreCanFin, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47Porc)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+9, 1, 1).setNumber( A4566HreForNro );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+10, 1, 1).setNumber( A4567HrePrdTnq );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4582HreLinUsr, GXv_char5) ;
         wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+11, 1, 1).setText( GXt_char4 );
         AV48FechaPes = (!(GXutil.strcmp("", A4582HreLinUsr)==0) ? localUtil.ttoc( A4583HrePesFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : "") ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48FechaPes, GXv_char5) ;
         wcdetalleproductosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+12, 1, 1).setText( GXt_char4 );
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
      if ( GXutil.strcmp(AV19Session.getValue("WCDetalleProductosGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDetalleProductosGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCDetalleProductosGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRERECLIN") == 0 )
         {
            AV65TFHreRecLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFHreRecLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV34TFHrePrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV35TFHrePrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV36TFHrePrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV37TFHrePrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFACCON") == 0 )
         {
            AV49TFHreFacCon = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFHreFacCon_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV51TFHrePrdUDs = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV52TFHrePrdUDs_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV53TFHrePrdCant = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFHrePrdCant_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECANANY") == 0 )
         {
            AV57TFHreCanAny = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFHreCanAny_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFORNRO") == 0 )
         {
            AV59TFHreForNro = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFHreForNro_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDTNQ") == 0 )
         {
            AV61TFHrePrdTnq = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFHrePrdTnq_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINUSR") == 0 )
         {
            AV63TFHreLinUsr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINUSR_SEL") == 0 )
         {
            AV64TFHreLinUsr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV39EmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV40HreBarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV41HreBarReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV42HreBarPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV43HreNumCie = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV44HreLinMaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINPRO") == 0 )
         {
            AV45HreLinPro = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV90GXV1 = (int)(AV90GXV1+1) ;
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
      this.aP0[0] = wcdetalleproductosexport.this.AV11Filename;
      this.aP1[0] = wcdetalleproductosexport.this.AV12ErrorMessage;
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
      AV35TFHrePrdNum_Sel = "" ;
      AV34TFHrePrdNum = "" ;
      AV37TFHrePrdDsc_Sel = "" ;
      AV36TFHrePrdDsc = "" ;
      AV49TFHreFacCon = DecimalUtil.ZERO ;
      AV50TFHreFacCon_To = DecimalUtil.ZERO ;
      AV52TFHrePrdUDs_Sel = "" ;
      AV51TFHrePrdUDs = "" ;
      AV53TFHrePrdCant = DecimalUtil.ZERO ;
      AV54TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV57TFHreCanAny = DecimalUtil.ZERO ;
      AV58TFHreCanAny_To = DecimalUtil.ZERO ;
      AV64TFHreLinUsr_Sel = "" ;
      AV63TFHreLinUsr = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A4564HreCanFin = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4582HreLinUsr = "" ;
      A4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
      AV72Wcdetalleproductosds_3_tfhreprdnum = "" ;
      AV73Wcdetalleproductosds_4_tfhreprdnum_sel = "" ;
      AV74Wcdetalleproductosds_5_tfhreprddsc = "" ;
      AV75Wcdetalleproductosds_6_tfhreprddsc_sel = "" ;
      AV76Wcdetalleproductosds_7_tfhrefaccon = DecimalUtil.ZERO ;
      AV77Wcdetalleproductosds_8_tfhrefaccon_to = DecimalUtil.ZERO ;
      AV78Wcdetalleproductosds_9_tfhreprduds = "" ;
      AV79Wcdetalleproductosds_10_tfhreprduds_sel = "" ;
      AV80Wcdetalleproductosds_11_tfhreprdcant = DecimalUtil.ZERO ;
      AV81Wcdetalleproductosds_12_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV82Wcdetalleproductosds_13_tfhrecanany = DecimalUtil.ZERO ;
      AV83Wcdetalleproductosds_14_tfhrecanany_to = DecimalUtil.ZERO ;
      AV88Wcdetalleproductosds_19_tfhrelinusr = "" ;
      AV89Wcdetalleproductosds_20_tfhrelinusr_sel = "" ;
      scmdbuf = "" ;
      lV72Wcdetalleproductosds_3_tfhreprdnum = "" ;
      lV74Wcdetalleproductosds_5_tfhreprddsc = "" ;
      lV78Wcdetalleproductosds_9_tfhreprduds = "" ;
      lV88Wcdetalleproductosds_19_tfhrelinusr = "" ;
      AV39EmprCod = "" ;
      AV42HreBarPar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08ZC2_A4550HreLinPro = new byte[1] ;
      P08ZC2_A4545HreLinMaq = new short[1] ;
      P08ZC2_A4495HreNumCie = new byte[1] ;
      P08ZC2_A4494HreBarPar = new String[] {""} ;
      P08ZC2_A4493HreBarReo = new byte[1] ;
      P08ZC2_A4492HreBarCod = new int[1] ;
      P08ZC2_A396EmprCod = new String[] {""} ;
      P08ZC2_A4582HreLinUsr = new String[] {""} ;
      P08ZC2_n4582HreLinUsr = new boolean[] {false} ;
      P08ZC2_A4567HrePrdTnq = new byte[1] ;
      P08ZC2_n4567HrePrdTnq = new boolean[] {false} ;
      P08ZC2_A4566HreForNro = new byte[1] ;
      P08ZC2_n4566HreForNro = new boolean[] {false} ;
      P08ZC2_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZC2_n4565HreCanAny = new boolean[] {false} ;
      P08ZC2_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZC2_n4563HrePrdCant = new boolean[] {false} ;
      P08ZC2_A4561HrePrdUDs = new String[] {""} ;
      P08ZC2_n4561HrePrdUDs = new boolean[] {false} ;
      P08ZC2_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZC2_n4562HreFacCon = new boolean[] {false} ;
      P08ZC2_A4559HrePrdDsc = new String[] {""} ;
      P08ZC2_n4559HrePrdDsc = new boolean[] {false} ;
      P08ZC2_A4558HrePrdNum = new String[] {""} ;
      P08ZC2_n4558HrePrdNum = new boolean[] {false} ;
      P08ZC2_A4557HreRecLin = new short[1] ;
      P08ZC2_A4564HreCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZC2_n4564HreCanFin = new boolean[] {false} ;
      P08ZC2_A4583HrePesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZC2_n4583HrePesFec = new boolean[] {false} ;
      AV46HreCanFin = DecimalUtil.ZERO ;
      AV47Porc = DecimalUtil.ZERO ;
      AV48FechaPes = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetalleproductosexport__default(),
         new Object[] {
             new Object[] {
            P08ZC2_A4550HreLinPro, P08ZC2_A4545HreLinMaq, P08ZC2_A4495HreNumCie, P08ZC2_A4494HreBarPar, P08ZC2_A4493HreBarReo, P08ZC2_A4492HreBarCod, P08ZC2_A396EmprCod, P08ZC2_A4582HreLinUsr, P08ZC2_n4582HreLinUsr, P08ZC2_A4567HrePrdTnq,
            P08ZC2_n4567HrePrdTnq, P08ZC2_A4566HreForNro, P08ZC2_n4566HreForNro, P08ZC2_A4565HreCanAny, P08ZC2_n4565HreCanAny, P08ZC2_A4563HrePrdCant, P08ZC2_n4563HrePrdCant, P08ZC2_A4561HrePrdUDs, P08ZC2_n4561HrePrdUDs, P08ZC2_A4562HreFacCon,
            P08ZC2_n4562HreFacCon, P08ZC2_A4559HrePrdDsc, P08ZC2_n4559HrePrdDsc, P08ZC2_A4558HrePrdNum, P08ZC2_n4558HrePrdNum, P08ZC2_A4557HreRecLin, P08ZC2_A4564HreCanFin, P08ZC2_n4564HreCanFin, P08ZC2_A4583HrePesFec, P08ZC2_n4583HrePesFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV59TFHreForNro ;
   private byte AV60TFHreForNro_To ;
   private byte AV61TFHrePrdTnq ;
   private byte AV62TFHrePrdTnq_To ;
   private byte A4566HreForNro ;
   private byte A4567HrePrdTnq ;
   private byte AV84Wcdetalleproductosds_15_tfhrefornro ;
   private byte AV85Wcdetalleproductosds_16_tfhrefornro_to ;
   private byte AV86Wcdetalleproductosds_17_tfhreprdtnq ;
   private byte AV87Wcdetalleproductosds_18_tfhreprdtnq_to ;
   private byte AV41HreBarReo ;
   private byte AV43HreNumCie ;
   private byte AV45HreLinPro ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short AV65TFHreRecLin ;
   private short AV66TFHreRecLin_To ;
   private short GXv_int3[] ;
   private short A4557HreRecLin ;
   private short AV70Wcdetalleproductosds_1_tfhrereclin ;
   private short AV71Wcdetalleproductosds_2_tfhrereclin_to ;
   private short AV16OrderedBy ;
   private short AV44HreLinMaq ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV40HreBarCod ;
   private int A4492HreBarCod ;
   private int AV90GXV1 ;
   private java.math.BigDecimal AV49TFHreFacCon ;
   private java.math.BigDecimal AV50TFHreFacCon_To ;
   private java.math.BigDecimal AV53TFHrePrdCant ;
   private java.math.BigDecimal AV54TFHrePrdCant_To ;
   private java.math.BigDecimal AV57TFHreCanAny ;
   private java.math.BigDecimal AV58TFHreCanAny_To ;
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal A4564HreCanFin ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal AV76Wcdetalleproductosds_7_tfhrefaccon ;
   private java.math.BigDecimal AV77Wcdetalleproductosds_8_tfhrefaccon_to ;
   private java.math.BigDecimal AV80Wcdetalleproductosds_11_tfhreprdcant ;
   private java.math.BigDecimal AV81Wcdetalleproductosds_12_tfhreprdcant_to ;
   private java.math.BigDecimal AV82Wcdetalleproductosds_13_tfhrecanany ;
   private java.math.BigDecimal AV83Wcdetalleproductosds_14_tfhrecanany_to ;
   private java.math.BigDecimal AV46HreCanFin ;
   private java.math.BigDecimal AV47Porc ;
   private String AV35TFHrePrdNum_Sel ;
   private String AV34TFHrePrdNum ;
   private String AV37TFHrePrdDsc_Sel ;
   private String AV36TFHrePrdDsc ;
   private String AV52TFHrePrdUDs_Sel ;
   private String AV51TFHrePrdUDs ;
   private String AV64TFHreLinUsr_Sel ;
   private String AV63TFHreLinUsr ;
   private String A4558HrePrdNum ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String A4582HreLinUsr ;
   private String AV72Wcdetalleproductosds_3_tfhreprdnum ;
   private String AV73Wcdetalleproductosds_4_tfhreprdnum_sel ;
   private String AV74Wcdetalleproductosds_5_tfhreprddsc ;
   private String AV75Wcdetalleproductosds_6_tfhreprddsc_sel ;
   private String AV78Wcdetalleproductosds_9_tfhreprduds ;
   private String AV79Wcdetalleproductosds_10_tfhreprduds_sel ;
   private String AV88Wcdetalleproductosds_19_tfhrelinusr ;
   private String AV89Wcdetalleproductosds_20_tfhrelinusr_sel ;
   private String scmdbuf ;
   private String lV72Wcdetalleproductosds_3_tfhreprdnum ;
   private String lV74Wcdetalleproductosds_5_tfhreprddsc ;
   private String lV78Wcdetalleproductosds_9_tfhreprduds ;
   private String lV88Wcdetalleproductosds_19_tfhrelinusr ;
   private String AV39EmprCod ;
   private String AV42HreBarPar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV48FechaPes ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date A4583HrePesFec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n4582HreLinUsr ;
   private boolean n4567HrePrdTnq ;
   private boolean n4566HreForNro ;
   private boolean n4565HreCanAny ;
   private boolean n4563HrePrdCant ;
   private boolean n4561HrePrdUDs ;
   private boolean n4562HreFacCon ;
   private boolean n4559HrePrdDsc ;
   private boolean n4558HrePrdNum ;
   private boolean n4564HreCanFin ;
   private boolean n4583HrePesFec ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08ZC2_A4550HreLinPro ;
   private short[] P08ZC2_A4545HreLinMaq ;
   private byte[] P08ZC2_A4495HreNumCie ;
   private String[] P08ZC2_A4494HreBarPar ;
   private byte[] P08ZC2_A4493HreBarReo ;
   private int[] P08ZC2_A4492HreBarCod ;
   private String[] P08ZC2_A396EmprCod ;
   private String[] P08ZC2_A4582HreLinUsr ;
   private boolean[] P08ZC2_n4582HreLinUsr ;
   private byte[] P08ZC2_A4567HrePrdTnq ;
   private boolean[] P08ZC2_n4567HrePrdTnq ;
   private byte[] P08ZC2_A4566HreForNro ;
   private boolean[] P08ZC2_n4566HreForNro ;
   private java.math.BigDecimal[] P08ZC2_A4565HreCanAny ;
   private boolean[] P08ZC2_n4565HreCanAny ;
   private java.math.BigDecimal[] P08ZC2_A4563HrePrdCant ;
   private boolean[] P08ZC2_n4563HrePrdCant ;
   private String[] P08ZC2_A4561HrePrdUDs ;
   private boolean[] P08ZC2_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08ZC2_A4562HreFacCon ;
   private boolean[] P08ZC2_n4562HreFacCon ;
   private String[] P08ZC2_A4559HrePrdDsc ;
   private boolean[] P08ZC2_n4559HrePrdDsc ;
   private String[] P08ZC2_A4558HrePrdNum ;
   private boolean[] P08ZC2_n4558HrePrdNum ;
   private short[] P08ZC2_A4557HreRecLin ;
   private java.math.BigDecimal[] P08ZC2_A4564HreCanFin ;
   private boolean[] P08ZC2_n4564HreCanFin ;
   private java.util.Date[] P08ZC2_A4583HrePesFec ;
   private boolean[] P08ZC2_n4583HrePesFec ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class wcdetalleproductosexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV70Wcdetalleproductosds_1_tfhrereclin ,
                                          short AV71Wcdetalleproductosds_2_tfhrereclin_to ,
                                          String AV73Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                          String AV72Wcdetalleproductosds_3_tfhreprdnum ,
                                          String AV75Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                          String AV74Wcdetalleproductosds_5_tfhreprddsc ,
                                          java.math.BigDecimal AV76Wcdetalleproductosds_7_tfhrefaccon ,
                                          java.math.BigDecimal AV77Wcdetalleproductosds_8_tfhrefaccon_to ,
                                          String AV79Wcdetalleproductosds_10_tfhreprduds_sel ,
                                          String AV78Wcdetalleproductosds_9_tfhreprduds ,
                                          java.math.BigDecimal AV80Wcdetalleproductosds_11_tfhreprdcant ,
                                          java.math.BigDecimal AV81Wcdetalleproductosds_12_tfhreprdcant_to ,
                                          java.math.BigDecimal AV82Wcdetalleproductosds_13_tfhrecanany ,
                                          java.math.BigDecimal AV83Wcdetalleproductosds_14_tfhrecanany_to ,
                                          byte AV84Wcdetalleproductosds_15_tfhrefornro ,
                                          byte AV85Wcdetalleproductosds_16_tfhrefornro_to ,
                                          byte AV86Wcdetalleproductosds_17_tfhreprdtnq ,
                                          byte AV87Wcdetalleproductosds_18_tfhreprdtnq_to ,
                                          String AV89Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                          String AV88Wcdetalleproductosds_19_tfhrelinusr ,
                                          short A4557HreRecLin ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4562HreFacCon ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          java.math.BigDecimal A4565HreCanAny ,
                                          byte A4566HreForNro ,
                                          byte A4567HrePrdTnq ,
                                          String A4582HreLinUsr ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV39EmprCod ,
                                          int AV40HreBarCod ,
                                          byte AV41HreBarReo ,
                                          String AV42HreBarPar ,
                                          byte AV43HreNumCie ,
                                          short AV44HreLinMaq ,
                                          byte AV45HreLinPro ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          byte A4550HreLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT HreLinPro, HreLinMaq, HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreLinUsr, HrePrdTnq, HreForNro, HreCanAny, HrePrdCant, HrePrdUDs, HreFacCon, HrePrdDsc," ;
      scmdbuf += " HrePrdNum, HreRecLin, HreCanFin, HrePesFec FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ?)");
      if ( ! (0==AV70Wcdetalleproductosds_1_tfhrereclin) )
      {
         addWhere(sWhereString, "(HreRecLin >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcdetalleproductosds_2_tfhrereclin_to) )
      {
         addWhere(sWhereString, "(HreRecLin <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcdetalleproductosds_4_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcdetalleproductosds_3_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcdetalleproductosds_4_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdNum = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Wcdetalleproductosds_6_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcdetalleproductosds_5_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcdetalleproductosds_6_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdDsc = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcdetalleproductosds_7_tfhrefaccon)==0) )
      {
         addWhere(sWhereString, "(HreFacCon >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcdetalleproductosds_8_tfhrefaccon_to)==0) )
      {
         addWhere(sWhereString, "(HreFacCon <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcdetalleproductosds_10_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcdetalleproductosds_9_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcdetalleproductosds_10_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Wcdetalleproductosds_11_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Wcdetalleproductosds_12_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Wcdetalleproductosds_13_tfhrecanany)==0) )
      {
         addWhere(sWhereString, "(HreCanAny >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Wcdetalleproductosds_14_tfhrecanany_to)==0) )
      {
         addWhere(sWhereString, "(HreCanAny <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV84Wcdetalleproductosds_15_tfhrefornro) )
      {
         addWhere(sWhereString, "(HreForNro >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV85Wcdetalleproductosds_16_tfhrefornro_to) )
      {
         addWhere(sWhereString, "(HreForNro <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV86Wcdetalleproductosds_17_tfhreprdtnq) )
      {
         addWhere(sWhereString, "(HrePrdTnq >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV87Wcdetalleproductosds_18_tfhreprdtnq_to) )
      {
         addWhere(sWhereString, "(HrePrdTnq <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wcdetalleproductosds_20_tfhrelinusr_sel)==0) && ( ! (GXutil.strcmp("", AV88Wcdetalleproductosds_19_tfhrelinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wcdetalleproductosds_20_tfhrelinusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLinUsr = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreRecLin" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreRecLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreFacCon" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreFacCon DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdUDs" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdUDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdCant" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdCant DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreCanAny" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreCanAny DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreForNro" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreForNro DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdTnq" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdTnq DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLinUsr" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLinUsr DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P08ZC2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(18,3);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               return;
      }
   }

}

