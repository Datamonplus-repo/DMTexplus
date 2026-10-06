package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class facturacionporfases_export extends GXProcedure
{
   public facturacionporfases_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturacionporfases_export.class ), "" );
   }

   public facturacionporfases_export( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String[] aP8 )
   {
      facturacionporfases_export.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      facturacionporfases_export.this.A396EmprCod = aP0;
      facturacionporfases_export.this.AV45Pfecha = aP1;
      facturacionporfases_export.this.AV46Ufecha = aP2;
      facturacionporfases_export.this.AV44PCliCod = aP3;
      facturacionporfases_export.this.AV47UCliCod = aP4;
      facturacionporfases_export.this.AV48FasCodi = aP5;
      facturacionporfases_export.this.AV49FasCod_f = aP6;
      facturacionporfases_export.this.AV50barpri = aP7;
      facturacionporfases_export.this.aP8 = aP8;
      facturacionporfases_export.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10CellRow = 3 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S141 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV12ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV12ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV12ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Periodo", "") );
      GXt_dtime1 = GXutil.resetTime( AV45Pfecha );
      AV12ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV12ExcelDocument.Cells(1, 2, 1, 1).setDate( GXt_dtime1 );
      GXt_dtime1 = GXutil.resetTime( AV46Ufecha );
      AV12ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV12ExcelDocument.Cells(1, 3, 1, 1).setDate( GXt_dtime1 );
      AV12ExcelDocument.Cells(1, 4, 1, 1).setBold( (short)(1) );
      AV12ExcelDocument.Cells(1, 4, 1, 1).setColor( 11 );
      AV12ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Clientes", "") );
      AV12ExcelDocument.Cells(1, 5, 1, 1).setNumber( AV44PCliCod );
      AV12ExcelDocument.Cells(1, 6, 1, 1).setNumber( AV47UCliCod );
      AV10CellRow = 2 ;
      AV9CellCol = 1 ;
      while ( AV9CellCol <= 50 )
      {
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setBold( (short)(1) );
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setColor( 11 );
         AV9CellCol = (int)(AV9CellCol+1) ;
      }
      AV12ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Codigo", "") );
      AV12ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV12ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV12ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV12ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Metros", "") );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53TotTotal = DecimalUtil.doubleToDec(0) ;
      AV54TotKgsT = DecimalUtil.doubleToDec(0) ;
      AV55TotMtsT = DecimalUtil.doubleToDec(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV45Pfecha ,
                                           AV46Ufecha ,
                                           Integer.valueOf(AV44PCliCod) ,
                                           Integer.valueOf(AV47UCliCod) ,
                                           AV48FasCodi ,
                                           AV49FasCod_f ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           A3397FacFasCod ,
                                           Byte.valueOf(A1153FacTipFac) ,
                                           A450FacPri ,
                                           AV50barpri ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A5V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV50barpri, AV45Pfecha, AV46Ufecha, Integer.valueOf(AV44PCliCod), Integer.valueOf(AV47UCliCod), AV48FasCodi, AV49FasCod_f});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA5V2 = false ;
         A1153FacTipFac = P0A5V2_A1153FacTipFac[0] ;
         A450FacPri = P0A5V2_A450FacPri[0] ;
         A447FacMts = P0A5V2_A447FacMts[0] ;
         A449FacPreMts = P0A5V2_A449FacPreMts[0] ;
         A444FacKgs = P0A5V2_A444FacKgs[0] ;
         A448FacPreKgs = P0A5V2_A448FacPreKgs[0] ;
         A3397FacFasCod = P0A5V2_A3397FacFasCod[0] ;
         A252CliCod = P0A5V2_A252CliCod[0] ;
         A436FacFch = P0A5V2_A436FacFch[0] ;
         A1296FacBarPar = P0A5V2_A1296FacBarPar[0] ;
         A1295FacBarReo = P0A5V2_A1295FacBarReo[0] ;
         A1294FacBarCod = P0A5V2_A1294FacBarCod[0] ;
         A427FacAlbCod = P0A5V2_A427FacAlbCod[0] ;
         A430FacCod = P0A5V2_A430FacCod[0] ;
         A446FacLin = P0A5V2_A446FacLin[0] ;
         A1153FacTipFac = P0A5V2_A1153FacTipFac[0] ;
         A450FacPri = P0A5V2_A450FacPri[0] ;
         A252CliCod = P0A5V2_A252CliCod[0] ;
         A436FacFch = P0A5V2_A436FacFch[0] ;
         AV58TotFase = DecimalUtil.doubleToDec(0) ;
         AV60TotKgs = DecimalUtil.doubleToDec(0) ;
         AV61TotMts = DecimalUtil.doubleToDec(0) ;
         AV62Kgs_Fra = DecimalUtil.doubleToDec(0) ;
         AV59FacKgs = DecimalUtil.doubleToDec(0) ;
         AV57Fac_Hdr = "" ;
         AV56LastFacHdr = "" ;
         AV51FasCod = A3397FacFasCod ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A5V2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A5V2_A3397FacFasCod[0], A3397FacFasCod) == 0 ) )
         {
            brkA5V2 = false ;
            A1153FacTipFac = P0A5V2_A1153FacTipFac[0] ;
            A450FacPri = P0A5V2_A450FacPri[0] ;
            A447FacMts = P0A5V2_A447FacMts[0] ;
            A449FacPreMts = P0A5V2_A449FacPreMts[0] ;
            A444FacKgs = P0A5V2_A444FacKgs[0] ;
            A448FacPreKgs = P0A5V2_A448FacPreKgs[0] ;
            A252CliCod = P0A5V2_A252CliCod[0] ;
            A436FacFch = P0A5V2_A436FacFch[0] ;
            A1296FacBarPar = P0A5V2_A1296FacBarPar[0] ;
            A1295FacBarReo = P0A5V2_A1295FacBarReo[0] ;
            A1294FacBarCod = P0A5V2_A1294FacBarCod[0] ;
            A427FacAlbCod = P0A5V2_A427FacAlbCod[0] ;
            A430FacCod = P0A5V2_A430FacCod[0] ;
            A446FacLin = P0A5V2_A446FacLin[0] ;
            A1153FacTipFac = P0A5V2_A1153FacTipFac[0] ;
            A450FacPri = P0A5V2_A450FacPri[0] ;
            A252CliCod = P0A5V2_A252CliCod[0] ;
            A436FacFch = P0A5V2_A436FacFch[0] ;
            if ( A1153FacTipFac == 0 )
            {
               if ( GXutil.strcmp(A450FacPri, AV50barpri) == 0 )
               {
                  if ( ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) ) || ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) ) )
                  {
                     AV58TotFase = AV58TotFase.add((GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2).add(GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2)))) ;
                     AV57Fac_Hdr = GXutil.str( A430FacCod, 8, 0) + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                     if ( GXutil.strcmp(AV57Fac_Hdr, AV56LastFacHdr) != 0 )
                     {
                        if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) )
                        {
                           AV60TotKgs = AV60TotKgs.add(A444FacKgs) ;
                        }
                        if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
                        {
                           AV61TotMts = AV61TotMts.add(A447FacMts) ;
                        }
                     }
                     AV56LastFacHdr = GXutil.str( A430FacCod, 8, 0) + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                  }
               }
            }
            brkA5V2 = true ;
            pr_default.readNext(0);
         }
         /* Execute user subroutine: 'FASPRO' */
         S132 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV12ExcelDocument.Cells(AV10CellRow, 1, 1, 1).setText( A3397FacFasCod );
         AV12ExcelDocument.Cells(AV10CellRow, 2, 1, 1).setText( AV52FasDsc );
         AV12ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TotFase)) );
         AV12ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TotKgs)) );
         AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TotMts)) );
         AV10CellRow = (int)(AV10CellRow+1) ;
         AV53TotTotal = AV53TotTotal.add(AV58TotFase) ;
         AV54TotKgsT = AV54TotKgsT.add(AV60TotKgs) ;
         AV55TotMtsT = AV55TotMtsT.add(AV61TotMts) ;
         if ( ! brkA5V2 )
         {
            brkA5V2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV10CellRow = (int)(AV10CellRow+1) ;
      AV12ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TotTotal)) );
      AV12ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54TotKgsT)) );
      AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV55TotMtsT)) );
   }

   public void S141( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV12ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV12ExcelDocument.Close();
   }

   public void S161( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV13Filename = "FacturacionporFases_Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV12ExcelDocument.Open(AV13Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV12ExcelDocument.Clear();
   }

   public void S151( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV12ExcelDocument.getErrCode() != 0 )
      {
         AV13Filename = "" ;
         AV11ErrorMessage = AV12ExcelDocument.getErrDescription() ;
         AV12ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S132( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV51FasCod)==0) )
      {
         AV52FasDsc = httpContext.getMessage( "Tinturaria", "") ;
      }
      else
      {
         AV52FasDsc = httpContext.getMessage( "Inexistente", "") ;
         /* Using cursor P0A5V3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV51FasCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A457FasCod = P0A5V3_A457FasCod[0] ;
            A460FasDsc = P0A5V3_A460FasDsc[0] ;
            AV52FasDsc = A460FasDsc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP8[0] = facturacionporfases_export.this.AV13Filename;
      this.aP9[0] = facturacionporfases_export.this.AV11ErrorMessage;
      CloseOpenCursors();
      AV12ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Filename = "" ;
      AV11ErrorMessage = "" ;
      AV12ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      AV53TotTotal = DecimalUtil.ZERO ;
      AV54TotKgsT = DecimalUtil.ZERO ;
      AV55TotMtsT = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A436FacFch = GXutil.nullDate() ;
      A3397FacFasCod = "" ;
      A450FacPri = "" ;
      P0A5V2_A396EmprCod = new String[] {""} ;
      P0A5V2_A1153FacTipFac = new byte[1] ;
      P0A5V2_A450FacPri = new String[] {""} ;
      P0A5V2_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5V2_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5V2_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5V2_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5V2_A3397FacFasCod = new String[] {""} ;
      P0A5V2_A252CliCod = new int[1] ;
      P0A5V2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5V2_A1296FacBarPar = new String[] {""} ;
      P0A5V2_A1295FacBarReo = new byte[1] ;
      P0A5V2_A1294FacBarCod = new int[1] ;
      P0A5V2_A427FacAlbCod = new long[1] ;
      P0A5V2_A430FacCod = new int[1] ;
      P0A5V2_A446FacLin = new int[1] ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      AV58TotFase = DecimalUtil.ZERO ;
      AV60TotKgs = DecimalUtil.ZERO ;
      AV61TotMts = DecimalUtil.ZERO ;
      AV62Kgs_Fra = DecimalUtil.ZERO ;
      AV59FacKgs = DecimalUtil.ZERO ;
      AV57Fac_Hdr = "" ;
      AV56LastFacHdr = "" ;
      AV51FasCod = "" ;
      AV52FasDsc = "" ;
      P0A5V3_A396EmprCod = new String[] {""} ;
      P0A5V3_A457FasCod = new String[] {""} ;
      P0A5V3_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.facturacionporfases_export__default(),
         new Object[] {
             new Object[] {
            P0A5V2_A396EmprCod, P0A5V2_A1153FacTipFac, P0A5V2_A450FacPri, P0A5V2_A447FacMts, P0A5V2_A449FacPreMts, P0A5V2_A444FacKgs, P0A5V2_A448FacPreKgs, P0A5V2_A3397FacFasCod, P0A5V2_A252CliCod, P0A5V2_A436FacFch,
            P0A5V2_A1296FacBarPar, P0A5V2_A1295FacBarReo, P0A5V2_A1294FacBarCod, P0A5V2_A427FacAlbCod, P0A5V2_A430FacCod, P0A5V2_A446FacLin
            }
            , new Object[] {
            P0A5V3_A396EmprCod, P0A5V3_A457FasCod, P0A5V3_A460FasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1153FacTipFac ;
   private byte A1295FacBarReo ;
   private short Gx_err ;
   private int AV44PCliCod ;
   private int AV47UCliCod ;
   private int AV10CellRow ;
   private int AV9CellCol ;
   private int A252CliCod ;
   private int A1294FacBarCod ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int AV15Random ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal AV53TotTotal ;
   private java.math.BigDecimal AV54TotKgsT ;
   private java.math.BigDecimal AV55TotMtsT ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal AV58TotFase ;
   private java.math.BigDecimal AV60TotKgs ;
   private java.math.BigDecimal AV61TotMts ;
   private java.math.BigDecimal AV62Kgs_Fra ;
   private java.math.BigDecimal AV59FacKgs ;
   private String A396EmprCod ;
   private String AV48FasCodi ;
   private String AV49FasCod_f ;
   private String AV50barpri ;
   private String scmdbuf ;
   private String A3397FacFasCod ;
   private String A450FacPri ;
   private String A1296FacBarPar ;
   private String AV57Fac_Hdr ;
   private String AV56LastFacHdr ;
   private String AV51FasCod ;
   private String AV52FasDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date AV45Pfecha ;
   private java.util.Date AV46Ufecha ;
   private java.util.Date A436FacFch ;
   private boolean returnInSub ;
   private boolean brkA5V2 ;
   private String AV13Filename ;
   private String AV11ErrorMessage ;
   private String[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A5V2_A396EmprCod ;
   private byte[] P0A5V2_A1153FacTipFac ;
   private String[] P0A5V2_A450FacPri ;
   private java.math.BigDecimal[] P0A5V2_A447FacMts ;
   private java.math.BigDecimal[] P0A5V2_A449FacPreMts ;
   private java.math.BigDecimal[] P0A5V2_A444FacKgs ;
   private java.math.BigDecimal[] P0A5V2_A448FacPreKgs ;
   private String[] P0A5V2_A3397FacFasCod ;
   private int[] P0A5V2_A252CliCod ;
   private java.util.Date[] P0A5V2_A436FacFch ;
   private String[] P0A5V2_A1296FacBarPar ;
   private byte[] P0A5V2_A1295FacBarReo ;
   private int[] P0A5V2_A1294FacBarCod ;
   private long[] P0A5V2_A427FacAlbCod ;
   private int[] P0A5V2_A430FacCod ;
   private int[] P0A5V2_A446FacLin ;
   private String[] P0A5V3_A396EmprCod ;
   private String[] P0A5V3_A457FasCod ;
   private String[] P0A5V3_A460FasDsc ;
   private com.genexus.gxoffice.ExcelDoc AV12ExcelDocument ;
}

final  class facturacionporfases_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A5V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV45Pfecha ,
                                          java.util.Date AV46Ufecha ,
                                          int AV44PCliCod ,
                                          int AV47UCliCod ,
                                          String AV48FasCodi ,
                                          String AV49FasCod_f ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A3397FacFasCod ,
                                          byte A1153FacTipFac ,
                                          String A450FacPri ,
                                          String AV50barpri ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.FacTipFac, T2.FacPri, T1.FacMts, T1.FacPreMts, T1.FacKgs, T1.FacPreKgs, T1.FacFasCod, T2.CliCod, T2.FacFch, T1.FacBarPar, T1.FacBarReo, T1.FacBarCod," ;
      scmdbuf += " T1.FacAlbCod, T1.FacCod, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.FacTipFac = 0)");
      addWhere(sWhereString, "(T2.FacPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45Pfecha)) )
      {
         addWhere(sWhereString, "(T2.FacFch >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46Ufecha)) )
      {
         addWhere(sWhereString, "(T2.FacFch <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV44PCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV47UCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48FasCodi)==0) )
      {
         addWhere(sWhereString, "(T1.FacFasCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49FasCod_f)==0) )
      {
         addWhere(sWhereString, "(T1.FacFasCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FacFasCod, T1.FacCod, T1.FacAlbCod, T1.FacBarCod, T1.FacBarReo, T1.FacBarPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P0A5V2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A5V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5V3", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

