package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradarecuentos__wcexport extends GXProcedure
{
   public entradarecuentos__wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradarecuentos__wcexport.class ), "" );
   }

   public entradarecuentos__wcexport( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      entradarecuentos__wcexport.this.aP1 = new String[] {""};
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
      entradarecuentos__wcexport.this.aP0 = aP0;
      entradarecuentos__wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "EntradaRecuentos__WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      entradarecuentos__wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV20FilterFullText, GXv_char5) ;
      entradarecuentos__wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV31TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradarecuentos__wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV31TFPrdNum_Sel, GXv_char5) ;
         entradarecuentos__wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV30TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            entradarecuentos__wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV30TFPrdNum, GXv_char5) ;
            entradarecuentos__wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV33TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradarecuentos__wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV33TFPrdNom_Sel, GXv_char5) ;
         entradarecuentos__wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV32TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            entradarecuentos__wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV32TFPrdNom, GXv_char5) ;
            entradarecuentos__wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFRecExiTeo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFRecExiTeo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cant. Teo.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradarecuentos__wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV34TFRecExiTeo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         entradarecuentos__wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV35TFRecExiTeo_To)) );
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
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Cant. Teo.", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Cant. Real", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setText( httpContext.getMessage( "Dif.", "") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( httpContext.getMessage( "Lote", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV45Entradarecuentos__wcds_1_filterfulltext = AV20FilterFullText ;
      AV46Entradarecuentos__wcds_2_tfprdnum = AV30TFPrdNum ;
      AV47Entradarecuentos__wcds_3_tfprdnum_sel = AV31TFPrdNum_Sel ;
      AV48Entradarecuentos__wcds_4_tfprdnom = AV32TFPrdNom ;
      AV49Entradarecuentos__wcds_5_tfprdnom_sel = AV33TFPrdNom_Sel ;
      AV50Entradarecuentos__wcds_6_tfrecexiteo = AV34TFRecExiTeo ;
      AV51Entradarecuentos__wcds_7_tfrecexiteo_to = AV35TFRecExiTeo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV45Entradarecuentos__wcds_1_filterfulltext ,
                                           AV47Entradarecuentos__wcds_3_tfprdnum_sel ,
                                           AV46Entradarecuentos__wcds_2_tfprdnum ,
                                           AV49Entradarecuentos__wcds_5_tfprdnom_sel ,
                                           AV48Entradarecuentos__wcds_4_tfprdnom ,
                                           AV50Entradarecuentos__wcds_6_tfrecexiteo ,
                                           AV51Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           A727PrdRec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV16Emprcod ,
                                           AV17RecFec ,
                                           A396EmprCod ,
                                           A810RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV45Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV45Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV45Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV46Entradarecuentos__wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Entradarecuentos__wcds_2_tfprdnum), 6, "%") ;
      lV48Entradarecuentos__wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Entradarecuentos__wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P09LQ2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV17RecFec, lV45Entradarecuentos__wcds_1_filterfulltext, lV45Entradarecuentos__wcds_1_filterfulltext, lV45Entradarecuentos__wcds_1_filterfulltext, lV46Entradarecuentos__wcds_2_tfprdnum, AV47Entradarecuentos__wcds_3_tfprdnum_sel, lV48Entradarecuentos__wcds_4_tfprdnom, AV49Entradarecuentos__wcds_5_tfprdnom_sel, AV50Entradarecuentos__wcds_6_tfrecexiteo, AV51Entradarecuentos__wcds_7_tfrecexiteo_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13416RecEstInv = P09LQ2_A13416RecEstInv[0] ;
         A727PrdRec = P09LQ2_A727PrdRec[0] ;
         A810RecFec = P09LQ2_A810RecFec[0] ;
         A396EmprCod = P09LQ2_A396EmprCod[0] ;
         A809RecExiTeo = P09LQ2_A809RecExiTeo[0] ;
         A718PrdNom = P09LQ2_A718PrdNom[0] ;
         A719PrdNum = P09LQ2_A719PrdNum[0] ;
         A12285RecLot = P09LQ2_A12285RecLot[0] ;
         A727PrdRec = P09LQ2_A727PrdRec[0] ;
         A718PrdNom = P09LQ2_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
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
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            entradarecuentos__wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char4 );
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            entradarecuentos__wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A809RecExiTeo)) );
            AV25RecExiRea = A809RecExiTeo ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('255',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Recexirea',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Recexirea',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25RecExiRea)) );
            AV26Difer = A809RecExiTeo.subtract(AV25RecExiRea) ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('255',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Difer',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Difer',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26Difer)) );
            AV29RecLot = A12285RecLot ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('255',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Reclot',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Reclot',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV29RecLot, GXv_char5) ;
            entradarecuentos__wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+5, 1, 1).setText( GXt_char4 );
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S172 ();
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
      if ( GXutil.strcmp(AV21Session.getValue("EntradaRecuentos__WCGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntradaRecuentos__WCGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("EntradaRecuentos__WCGridState"), null, null);
      }
      AV18OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV19OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV30TFPrdNum = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV31TFPrdNum_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV32TFPrdNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV33TFPrdNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV34TFRecExiTeo = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFRecExiTeo_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV17RecFec = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
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
      this.aP0[0] = entradarecuentos__wcexport.this.AV11Filename;
      this.aP1[0] = entradarecuentos__wcexport.this.AV12ErrorMessage;
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
      AV20FilterFullText = "" ;
      AV31TFPrdNum_Sel = "" ;
      AV30TFPrdNum = "" ;
      AV33TFPrdNom_Sel = "" ;
      AV32TFPrdNom = "" ;
      AV34TFRecExiTeo = DecimalUtil.ZERO ;
      AV35TFRecExiTeo_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A12285RecLot = "" ;
      AV45Entradarecuentos__wcds_1_filterfulltext = "" ;
      AV46Entradarecuentos__wcds_2_tfprdnum = "" ;
      AV47Entradarecuentos__wcds_3_tfprdnum_sel = "" ;
      AV48Entradarecuentos__wcds_4_tfprdnom = "" ;
      AV49Entradarecuentos__wcds_5_tfprdnom_sel = "" ;
      AV50Entradarecuentos__wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV51Entradarecuentos__wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV45Entradarecuentos__wcds_1_filterfulltext = "" ;
      lV46Entradarecuentos__wcds_2_tfprdnum = "" ;
      lV48Entradarecuentos__wcds_4_tfprdnom = "" ;
      A727PrdRec = "" ;
      AV16Emprcod = "" ;
      AV17RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      P09LQ2_A13416RecEstInv = new byte[1] ;
      P09LQ2_A727PrdRec = new String[] {""} ;
      P09LQ2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LQ2_A396EmprCod = new String[] {""} ;
      P09LQ2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LQ2_A718PrdNom = new String[] {""} ;
      P09LQ2_A719PrdNum = new String[] {""} ;
      P09LQ2_A12285RecLot = new String[] {""} ;
      AV25RecExiRea = DecimalUtil.ZERO ;
      AV26Difer = DecimalUtil.ZERO ;
      AV29RecLot = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradarecuentos__wcexport__default(),
         new Object[] {
             new Object[] {
            P09LQ2_A13416RecEstInv, P09LQ2_A727PrdRec, P09LQ2_A810RecFec, P09LQ2_A396EmprCod, P09LQ2_A809RecExiTeo, P09LQ2_A718PrdNom, P09LQ2_A719PrdNum, P09LQ2_A12285RecLot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13416RecEstInv ;
   private short GXv_int3[] ;
   private short AV18OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV52GXV1 ;
   private java.math.BigDecimal AV34TFRecExiTeo ;
   private java.math.BigDecimal AV35TFRecExiTeo_To ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal AV50Entradarecuentos__wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV51Entradarecuentos__wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV25RecExiRea ;
   private java.math.BigDecimal AV26Difer ;
   private String AV31TFPrdNum_Sel ;
   private String AV30TFPrdNum ;
   private String AV33TFPrdNom_Sel ;
   private String AV32TFPrdNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A12285RecLot ;
   private String AV46Entradarecuentos__wcds_2_tfprdnum ;
   private String AV47Entradarecuentos__wcds_3_tfprdnum_sel ;
   private String AV48Entradarecuentos__wcds_4_tfprdnom ;
   private String AV49Entradarecuentos__wcds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV46Entradarecuentos__wcds_2_tfprdnum ;
   private String lV48Entradarecuentos__wcds_4_tfprdnom ;
   private String A727PrdRec ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String AV29RecLot ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV17RecFec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean AV19OrderedDsc ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV20FilterFullText ;
   private String AV45Entradarecuentos__wcds_1_filterfulltext ;
   private String lV45Entradarecuentos__wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09LQ2_A13416RecEstInv ;
   private String[] P09LQ2_A727PrdRec ;
   private java.util.Date[] P09LQ2_A810RecFec ;
   private String[] P09LQ2_A396EmprCod ;
   private java.math.BigDecimal[] P09LQ2_A809RecExiTeo ;
   private String[] P09LQ2_A718PrdNom ;
   private String[] P09LQ2_A719PrdNum ;
   private String[] P09LQ2_A12285RecLot ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class entradarecuentos__wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Entradarecuentos__wcds_1_filterfulltext ,
                                          String AV47Entradarecuentos__wcds_3_tfprdnum_sel ,
                                          String AV46Entradarecuentos__wcds_2_tfprdnum ,
                                          String AV49Entradarecuentos__wcds_5_tfprdnom_sel ,
                                          String AV48Entradarecuentos__wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV50Entradarecuentos__wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV51Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv ,
                                          String AV16Emprcod ,
                                          java.util.Date AV17RecFec ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[11];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.RecEstInv, T2.PrdRec, T1.RecFec, T1.EmprCod, T1.RecExiTeo, T2.PrdNom, T1.PrdNum, T1.RecLot FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV45Entradarecuentos__wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Entradarecuentos__wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Entradarecuentos__wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Entradarecuentos__wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Entradarecuentos__wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Entradarecuentos__wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Entradarecuentos__wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50Entradarecuentos__wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Entradarecuentos__wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
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
                  return conditional_P09LQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               return;
      }
   }

}

