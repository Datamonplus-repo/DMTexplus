package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcdetalledeproductosanyadidasexport extends GXProcedure
{
   public wcdetalledeproductosanyadidasexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdetalledeproductosanyadidasexport.class ), "" );
   }

   public wcdetalledeproductosanyadidasexport( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcdetalledeproductosanyadidasexport.this.aP1 = new String[] {""};
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
      wcdetalledeproductosanyadidasexport.this.aP0 = aP0;
      wcdetalledeproductosanyadidasexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCDetalledeProductosAnyadidasExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV35TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFPrdNum_Sel, GXv_char5) ;
         wcdetalledeproductosanyadidasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFPrdNum, GXv_char5) ;
            wcdetalledeproductosanyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFHrdPrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFHrdPrdDsc_Sel, GXv_char5) ;
         wcdetalledeproductosanyadidasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFHrdPrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFHrdPrdDsc, GXv_char5) ;
            wcdetalledeproductosanyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFHreLanyCan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHreLanyCan_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV38TFHreLanyCan)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV39TFHreLanyCan_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHrePrdCFin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHrePrdCFin_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Adicion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFHrePrdCFin)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFHrePrdCFin_To)) );
      }
      if ( ! ( (0==AV42TFHreLanyNro) && (0==AV43TFHreLanyNro_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFHreLanyNro );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFHreLanyNro_To );
      }
      if ( ! ( (0==AV44TFHreLanyTnq) && (0==AV45TFHreLanyTnq_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tq", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFHreLanyTnq );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFHreLanyTnq_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFHreLanyUsr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFHreLanyUsr_Sel, GXv_char5) ;
         wcdetalledeproductosanyadidasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFHreLanyUsr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFHreLanyUsr, GXv_char5) ;
            wcdetalledeproductosanyadidasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV48TFHreLanyFec) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcdetalledeproductosanyadidasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV48TFHreLanyFec );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Adicion", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Nº Orden", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( httpContext.getMessage( "Tq", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( httpContext.getMessage( "Usuario", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = AV34TFPrdNum ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV36TFHrdPrdDsc ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV37TFHrdPrdDsc_Sel ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV38TFHreLanyCan ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV39TFHreLanyCan_To ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV40TFHrePrdCFin ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV41TFHrePrdCFin_To ;
      AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV42TFHreLanyNro ;
      AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV43TFHreLanyNro_To ;
      AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV44TFHreLanyTnq ;
      AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV45TFHreLanyTnq_To ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV46TFHreLanyUsr ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV47TFHreLanyUsr_Sel ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV48TFHreLanyFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                           AV60Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                           AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                           AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                           AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                           AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                           AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                           AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                           Byte.valueOf(AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro) ,
                                           Byte.valueOf(AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) ,
                                           Byte.valueOf(AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) ,
                                           Byte.valueOf(AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) ,
                                           AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                           AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                           AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A4513HreLanyCan ,
                                           A4511HrePrdCFin ,
                                           Byte.valueOf(A4514HreLanyNro) ,
                                           Byte.valueOf(A4515HreLanyTnq) ,
                                           A4580HreLanyUsr ,
                                           A4581HreLanyFec ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV51EmprCod ,
                                           Integer.valueOf(AV52HreBarCod) ,
                                           Byte.valueOf(AV53HreBarReo) ,
                                           AV54HreBarPar ,
                                           Byte.valueOf(AV55HreNumCie) ,
                                           Short.valueOf(AV56HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4508HreLinMAL) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV60Wcdetalledeproductosanyadidasds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Wcdetalledeproductosanyadidasds_1_tfprdnum), 6, "%") ;
      lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc), 26, "%") ;
      lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = GXutil.padr( GXutil.rtrim( AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr), 8, "%") ;
      /* Using cursor P08ZF2 */
      pr_default.execute(0, new Object[] {AV51EmprCod, Integer.valueOf(AV52HreBarCod), Byte.valueOf(AV53HreBarReo), AV54HreBarPar, Byte.valueOf(AV55HreNumCie), Short.valueOf(AV56HreLinMaq), lV60Wcdetalledeproductosanyadidasds_1_tfprdnum, AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel, lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc, AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel, AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan, AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to, AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin, AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to, Byte.valueOf(AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro), Byte.valueOf(AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to), Byte.valueOf(AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq), Byte.valueOf(AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to), lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr, AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel, AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4508HreLinMAL = P08ZF2_A4508HreLinMAL[0] ;
         A4495HreNumCie = P08ZF2_A4495HreNumCie[0] ;
         A4494HreBarPar = P08ZF2_A4494HreBarPar[0] ;
         A4493HreBarReo = P08ZF2_A4493HreBarReo[0] ;
         A4492HreBarCod = P08ZF2_A4492HreBarCod[0] ;
         A396EmprCod = P08ZF2_A396EmprCod[0] ;
         A4581HreLanyFec = P08ZF2_A4581HreLanyFec[0] ;
         n4581HreLanyFec = P08ZF2_n4581HreLanyFec[0] ;
         A4580HreLanyUsr = P08ZF2_A4580HreLanyUsr[0] ;
         n4580HreLanyUsr = P08ZF2_n4580HreLanyUsr[0] ;
         A4515HreLanyTnq = P08ZF2_A4515HreLanyTnq[0] ;
         n4515HreLanyTnq = P08ZF2_n4515HreLanyTnq[0] ;
         A4514HreLanyNro = P08ZF2_A4514HreLanyNro[0] ;
         n4514HreLanyNro = P08ZF2_n4514HreLanyNro[0] ;
         A4511HrePrdCFin = P08ZF2_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = P08ZF2_n4511HrePrdCFin[0] ;
         A4513HreLanyCan = P08ZF2_A4513HreLanyCan[0] ;
         n4513HreLanyCan = P08ZF2_n4513HreLanyCan[0] ;
         A4510HrdPrdDsc = P08ZF2_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P08ZF2_n4510HrdPrdDsc[0] ;
         A719PrdNum = P08ZF2_A719PrdNum[0] ;
         A4509HreNumAny = P08ZF2_A4509HreNumAny[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
         wcdetalledeproductosanyadidasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char4 );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4510HrdPrdDsc, GXv_char5) ;
         wcdetalledeproductosanyadidasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4513HreLanyCan)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4511HrePrdCFin)) );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setNumber( A4514HreLanyNro );
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setNumber( A4515HreLanyTnq );
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4580HreLanyUsr, GXv_char5) ;
         wcdetalledeproductosanyadidasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+6, 1, 1).setText( GXt_char4 );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+7, 1, 1).setDate( A4581HreLanyFec );
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
      if ( GXutil.strcmp(AV19Session.getValue("WCDetalledeProductosAnyadidasGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDetalledeProductosAnyadidasGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCDetalledeProductosAnyadidasGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC") == 0 )
         {
            AV36TFHrdPrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC_SEL") == 0 )
         {
            AV37TFHrdPrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYCAN") == 0 )
         {
            AV38TFHreLanyCan = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFHreLanyCan_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCFIN") == 0 )
         {
            AV40TFHrePrdCFin = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFHrePrdCFin_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYNRO") == 0 )
         {
            AV42TFHreLanyNro = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFHreLanyNro_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYTNQ") == 0 )
         {
            AV44TFHreLanyTnq = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFHreLanyTnq_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYUSR") == 0 )
         {
            AV46TFHreLanyUsr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYUSR_SEL") == 0 )
         {
            AV47TFHreLanyUsr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYFEC") == 0 )
         {
            AV48TFHreLanyFec = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51EmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV52HreBarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV53HreBarReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV54HreBarPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV55HreNumCie = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV56HreLinMaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
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
      this.aP0[0] = wcdetalledeproductosanyadidasexport.this.AV11Filename;
      this.aP1[0] = wcdetalledeproductosanyadidasexport.this.AV12ErrorMessage;
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
      AV35TFPrdNum_Sel = "" ;
      AV34TFPrdNum = "" ;
      AV37TFHrdPrdDsc_Sel = "" ;
      AV36TFHrdPrdDsc = "" ;
      AV38TFHreLanyCan = DecimalUtil.ZERO ;
      AV39TFHreLanyCan_To = DecimalUtil.ZERO ;
      AV40TFHrePrdCFin = DecimalUtil.ZERO ;
      AV41TFHrePrdCFin_To = DecimalUtil.ZERO ;
      AV47TFHreLanyUsr_Sel = "" ;
      AV46TFHreLanyUsr = "" ;
      AV48TFHreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A719PrdNum = "" ;
      A4510HrdPrdDsc = "" ;
      A4513HreLanyCan = DecimalUtil.ZERO ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A4580HreLanyUsr = "" ;
      A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = "" ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = "" ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = "" ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = "" ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = DecimalUtil.ZERO ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = DecimalUtil.ZERO ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = DecimalUtil.ZERO ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = DecimalUtil.ZERO ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = "" ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = "" ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV60Wcdetalledeproductosanyadidasds_1_tfprdnum = "" ;
      lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = "" ;
      lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = "" ;
      AV51EmprCod = "" ;
      AV54HreBarPar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08ZF2_A4508HreLinMAL = new short[1] ;
      P08ZF2_A4495HreNumCie = new byte[1] ;
      P08ZF2_A4494HreBarPar = new String[] {""} ;
      P08ZF2_A4493HreBarReo = new byte[1] ;
      P08ZF2_A4492HreBarCod = new int[1] ;
      P08ZF2_A396EmprCod = new String[] {""} ;
      P08ZF2_A4581HreLanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZF2_n4581HreLanyFec = new boolean[] {false} ;
      P08ZF2_A4580HreLanyUsr = new String[] {""} ;
      P08ZF2_n4580HreLanyUsr = new boolean[] {false} ;
      P08ZF2_A4515HreLanyTnq = new byte[1] ;
      P08ZF2_n4515HreLanyTnq = new boolean[] {false} ;
      P08ZF2_A4514HreLanyNro = new byte[1] ;
      P08ZF2_n4514HreLanyNro = new boolean[] {false} ;
      P08ZF2_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZF2_n4511HrePrdCFin = new boolean[] {false} ;
      P08ZF2_A4513HreLanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZF2_n4513HreLanyCan = new boolean[] {false} ;
      P08ZF2_A4510HrdPrdDsc = new String[] {""} ;
      P08ZF2_n4510HrdPrdDsc = new boolean[] {false} ;
      P08ZF2_A719PrdNum = new String[] {""} ;
      P08ZF2_A4509HreNumAny = new byte[1] ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetalledeproductosanyadidasexport__default(),
         new Object[] {
             new Object[] {
            P08ZF2_A4508HreLinMAL, P08ZF2_A4495HreNumCie, P08ZF2_A4494HreBarPar, P08ZF2_A4493HreBarReo, P08ZF2_A4492HreBarCod, P08ZF2_A396EmprCod, P08ZF2_A4581HreLanyFec, P08ZF2_n4581HreLanyFec, P08ZF2_A4580HreLanyUsr, P08ZF2_n4580HreLanyUsr,
            P08ZF2_A4515HreLanyTnq, P08ZF2_n4515HreLanyTnq, P08ZF2_A4514HreLanyNro, P08ZF2_n4514HreLanyNro, P08ZF2_A4511HrePrdCFin, P08ZF2_n4511HrePrdCFin, P08ZF2_A4513HreLanyCan, P08ZF2_n4513HreLanyCan, P08ZF2_A4510HrdPrdDsc, P08ZF2_n4510HrdPrdDsc,
            P08ZF2_A719PrdNum, P08ZF2_A4509HreNumAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV42TFHreLanyNro ;
   private byte AV43TFHreLanyNro_To ;
   private byte AV44TFHreLanyTnq ;
   private byte AV45TFHreLanyTnq_To ;
   private byte A4514HreLanyNro ;
   private byte A4515HreLanyTnq ;
   private byte AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro ;
   private byte AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ;
   private byte AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ;
   private byte AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ;
   private byte AV53HreBarReo ;
   private byte AV55HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4509HreNumAny ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short AV56HreLinMaq ;
   private short A4508HreLinMAL ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV52HreBarCod ;
   private int A4492HreBarCod ;
   private int AV75GXV1 ;
   private java.math.BigDecimal AV38TFHreLanyCan ;
   private java.math.BigDecimal AV39TFHreLanyCan_To ;
   private java.math.BigDecimal AV40TFHrePrdCFin ;
   private java.math.BigDecimal AV41TFHrePrdCFin_To ;
   private java.math.BigDecimal A4513HreLanyCan ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan ;
   private java.math.BigDecimal AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ;
   private java.math.BigDecimal AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ;
   private java.math.BigDecimal AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ;
   private String AV35TFPrdNum_Sel ;
   private String AV34TFPrdNum ;
   private String AV37TFHrdPrdDsc_Sel ;
   private String AV36TFHrdPrdDsc ;
   private String AV47TFHreLanyUsr_Sel ;
   private String AV46TFHreLanyUsr ;
   private String A719PrdNum ;
   private String A4510HrdPrdDsc ;
   private String A4580HreLanyUsr ;
   private String AV60Wcdetalledeproductosanyadidasds_1_tfprdnum ;
   private String AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ;
   private String AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ;
   private String AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ;
   private String AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ;
   private String AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ;
   private String scmdbuf ;
   private String lV60Wcdetalledeproductosanyadidasds_1_tfprdnum ;
   private String lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ;
   private String lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ;
   private String AV51EmprCod ;
   private String AV54HreBarPar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV48TFHreLanyFec ;
   private java.util.Date A4581HreLanyFec ;
   private java.util.Date AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n4581HreLanyFec ;
   private boolean n4580HreLanyUsr ;
   private boolean n4515HreLanyTnq ;
   private boolean n4514HreLanyNro ;
   private boolean n4511HrePrdCFin ;
   private boolean n4513HreLanyCan ;
   private boolean n4510HrdPrdDsc ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P08ZF2_A4508HreLinMAL ;
   private byte[] P08ZF2_A4495HreNumCie ;
   private String[] P08ZF2_A4494HreBarPar ;
   private byte[] P08ZF2_A4493HreBarReo ;
   private int[] P08ZF2_A4492HreBarCod ;
   private String[] P08ZF2_A396EmprCod ;
   private java.util.Date[] P08ZF2_A4581HreLanyFec ;
   private boolean[] P08ZF2_n4581HreLanyFec ;
   private String[] P08ZF2_A4580HreLanyUsr ;
   private boolean[] P08ZF2_n4580HreLanyUsr ;
   private byte[] P08ZF2_A4515HreLanyTnq ;
   private boolean[] P08ZF2_n4515HreLanyTnq ;
   private byte[] P08ZF2_A4514HreLanyNro ;
   private boolean[] P08ZF2_n4514HreLanyNro ;
   private java.math.BigDecimal[] P08ZF2_A4511HrePrdCFin ;
   private boolean[] P08ZF2_n4511HrePrdCFin ;
   private java.math.BigDecimal[] P08ZF2_A4513HreLanyCan ;
   private boolean[] P08ZF2_n4513HreLanyCan ;
   private String[] P08ZF2_A4510HrdPrdDsc ;
   private boolean[] P08ZF2_n4510HrdPrdDsc ;
   private String[] P08ZF2_A719PrdNum ;
   private byte[] P08ZF2_A4509HreNumAny ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class wcdetalledeproductosanyadidasexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                          String AV60Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                          String AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                          String AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                          java.math.BigDecimal AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                          java.math.BigDecimal AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                          java.math.BigDecimal AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                          java.math.BigDecimal AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                          byte AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro ,
                                          byte AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ,
                                          byte AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ,
                                          byte AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ,
                                          String AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                          String AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                          java.util.Date AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          java.math.BigDecimal A4513HreLanyCan ,
                                          java.math.BigDecimal A4511HrePrdCFin ,
                                          byte A4514HreLanyNro ,
                                          byte A4515HreLanyTnq ,
                                          String A4580HreLanyUsr ,
                                          java.util.Date A4581HreLanyFec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV51EmprCod ,
                                          int AV52HreBarCod ,
                                          byte AV53HreBarReo ,
                                          String AV54HreBarPar ,
                                          byte AV55HreNumCie ,
                                          short AV56HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4508HreLinMAL )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT HreLinMAL, HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreLanyFec, HreLanyUsr, HreLanyTnq, HreLanyNro, HrePrdCFin, HreLanyCan, HrdPrdDsc, PrdNum," ;
      scmdbuf += " HreNumAny FROM TXPHISREA" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ?)");
      if ( (GXutil.strcmp("", AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcdetalledeproductosanyadidasds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro) )
      {
         addWhere(sWhereString, "(HreLanyNro >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) )
      {
         addWhere(sWhereString, "(HreLanyNro <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) )
      {
         addWhere(sWhereString, "(HreLanyTnq >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) )
      {
         addWhere(sWhereString, "(HreLanyTnq <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLanyUsr = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec) )
      {
         addWhere(sWhereString, "(HreLanyFec >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY HreNumAny" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HrdPrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrdPrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyCan" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyCan DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdCFin" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdCFin DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyNro" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyNro DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyTnq" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyTnq DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyUsr" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyUsr DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLanyFec" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLanyFec DESC" ;
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
                  return conditional_P08ZF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 6);
               ((byte[]) buf[21])[0] = rslt.getByte(15);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               return;
      }
   }

}

