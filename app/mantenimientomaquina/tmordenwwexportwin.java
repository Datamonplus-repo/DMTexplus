package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordenwwexportwin extends GXProcedure
{
   public tmordenwwexportwin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordenwwexportwin.class ), "" );
   }

   public tmordenwwexportwin( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmordenwwexportwin.this.aP1 = new String[] {""};
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
      tmordenwwexportwin.this.aP0 = aP0;
      tmordenwwexportwin.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmordenwwexportwin.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV16EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordenwwexportwin.this.AV16EmprCod = GXv_char2[0] ;
      tmordenwwexportwin.this.AV14EmprNom = GXv_char3[0] ;
      tmordenwwexportwin.this.AV15UsurCod = GXv_char4[0] ;
      AV25OMCod_json = AV24WebSession.getValue(httpContext.getMessage( "!&OMCod_json", "")) ;
      AV26OMCodCollection.fromJSonString(AV25OMCod_json, null);
      AV24WebSession.remove(httpContext.getMessage( "!&OMCod_json", ""));
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV11Random = (short)(GXutil.random( )*10000) ;
      AV10Filename = "TMOrdenWWExportWin-" + GXutil.trim( GXutil.str( AV11Random, 4, 0)) + ".xlsx" ;
      AV8ExcelDocument.Open(AV10Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV8ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV8ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Linea", "") );
      AV8ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Preventivo", "") );
      AV8ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Estado", "") );
      AV8ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Creacion", "") );
      AV8ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Prevista", "") );
      AV8ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV8ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV8ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Texto", "") );
      AV8ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Notas", "") );
      AV8ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Repuesto", "") );
      AV8ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV8ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV8ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV8ExcelDocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Coste", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV12Row = 2 ;
      AV31GXV1 = 1 ;
      while ( AV31GXV1 <= AV26OMCodCollection.size() )
      {
         AV27ItemOMCod = ((Number) AV26OMCodCollection.elementAt(-1+AV31GXV1)).intValue() ;
         AV28OMCod = AV27ItemOMCod ;
         /* Using cursor P0A652 */
         pr_default.execute(0, new Object[] {AV16EmprCod, Integer.valueOf(AV28OMCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A9429PMCod = P0A652_A9429PMCod[0] ;
            n9429PMCod = P0A652_n9429PMCod[0] ;
            A9445OMEst = P0A652_A9445OMEst[0] ;
            A9436OMFchCre = P0A652_A9436OMFchCre[0] ;
            A9438OMFchPre = P0A652_A9438OMFchPre[0] ;
            A9426OMMaqCod = P0A652_A9426OMMaqCod[0] ;
            A9427OMMaqDsc = P0A652_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P0A652_n9427OMMaqDsc[0] ;
            A9433OMTxt = P0A652_A9433OMTxt[0] ;
            A9464OMNot = P0A652_A9464OMNot[0] ;
            A9425OMCod = P0A652_A9425OMCod[0] ;
            A396EmprCod = P0A652_A396EmprCod[0] ;
            A9427OMMaqDsc = P0A652_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P0A652_n9427OMMaqDsc[0] ;
            AV33GXLvl64 = (byte)(0) ;
            /* Using cursor P0A653 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A9447OMRepNom = P0A653_A9447OMRepNom[0] ;
               n9447OMRepNom = P0A653_n9447OMRepNom[0] ;
               A9449OMRTpo = P0A653_A9449OMRTpo[0] ;
               A9446OMRepCod = P0A653_A9446OMRepCod[0] ;
               A9453OMRCPre = P0A653_A9453OMRCPre[0] ;
               A9452OMRCCnt = P0A653_A9452OMRCCnt[0] ;
               A9451OMRRPre = P0A653_A9451OMRRPre[0] ;
               A9450OMRRCnt = P0A653_A9450OMRRCnt[0] ;
               A9447OMRepNom = P0A653_A9447OMRepNom[0] ;
               n9447OMRepNom = P0A653_n9447OMRepNom[0] ;
               A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
               A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
               AV33GXLvl64 = (byte)(1) ;
               AV8ExcelDocument.Cells((int)(AV12Row), 1, 1, 1).setNumber( A9425OMCod );
               AV8ExcelDocument.Cells((int)(AV12Row), 2, 1, 1).setNumber( A9429PMCod );
               AV8ExcelDocument.Cells((int)(AV12Row), 3, 1, 1).setText( A9445OMEst );
               AV8ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV8ExcelDocument.Cells((int)(AV12Row), 4, 1, 1).setDate( A9436OMFchCre );
               GXt_dtime5 = GXutil.resetTime( A9438OMFchPre );
               AV8ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV8ExcelDocument.Cells((int)(AV12Row), 5, 1, 1).setDate( GXt_dtime5 );
               AV8ExcelDocument.Cells((int)(AV12Row), 6, 1, 1).setText( A9426OMMaqCod );
               AV8ExcelDocument.Cells((int)(AV12Row), 7, 1, 1).setText( A9427OMMaqDsc );
               AV8ExcelDocument.Cells((int)(AV12Row), 8, 1, 1).setText( A9433OMTxt );
               AV8ExcelDocument.Cells((int)(AV12Row), 9, 1, 1).setText( A9464OMNot );
               AV8ExcelDocument.Cells((int)(AV12Row), 10, 1, 1).setNumber( A9446OMRepCod );
               AV8ExcelDocument.Cells((int)(AV12Row), 11, 1, 1).setText( A9447OMRepNom );
               if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 )
               {
                  AV8ExcelDocument.Cells((int)(AV12Row), 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9450OMRRCnt)) );
                  AV8ExcelDocument.Cells((int)(AV12Row), 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9451OMRRPre)) );
                  AV8ExcelDocument.Cells((int)(AV12Row), 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9471OMRRCos)) );
               }
               else
               {
                  AV8ExcelDocument.Cells((int)(AV12Row), 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9452OMRCCnt)) );
                  AV8ExcelDocument.Cells((int)(AV12Row), 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9453OMRCPre)) );
                  AV8ExcelDocument.Cells((int)(AV12Row), 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A9454OMRCCos)) );
               }
               AV12Row = (long)(AV12Row+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV33GXLvl64 == 0 )
            {
               AV8ExcelDocument.Cells((int)(AV12Row), 1, 1, 1).setNumber( A9425OMCod );
               AV8ExcelDocument.Cells((int)(AV12Row), 2, 1, 1).setNumber( A9429PMCod );
               AV8ExcelDocument.Cells((int)(AV12Row), 3, 1, 1).setText( A9445OMEst );
               AV8ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV8ExcelDocument.Cells((int)(AV12Row), 4, 1, 1).setDate( A9436OMFchCre );
               GXt_dtime5 = GXutil.resetTime( A9438OMFchPre );
               AV8ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV8ExcelDocument.Cells((int)(AV12Row), 5, 1, 1).setDate( GXt_dtime5 );
               AV8ExcelDocument.Cells((int)(AV12Row), 6, 1, 1).setText( A9426OMMaqCod );
               AV8ExcelDocument.Cells((int)(AV12Row), 7, 1, 1).setText( A9427OMMaqDsc );
               AV8ExcelDocument.Cells((int)(AV12Row), 8, 1, 1).setText( A9433OMTxt );
               AV8ExcelDocument.Cells((int)(AV12Row), 9, 1, 1).setText( A9464OMNot );
               AV12Row = (long)(AV12Row+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV31GXV1 = (int)(AV31GXV1+1) ;
      }
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV8ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV8ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV8ExcelDocument.getErrCode() != 0 )
      {
         AV10Filename = "" ;
         AV9ErrorMessage = AV8ExcelDocument.getErrDescription() ;
         AV8ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = tmordenwwexportwin.this.AV10Filename;
      this.aP1[0] = tmordenwwexportwin.this.AV9ErrorMessage;
      CloseOpenCursors();
      AV8ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Filename = "" ;
      AV9ErrorMessage = "" ;
      AV13Station = "" ;
      GXt_char1 = "" ;
      AV16EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV14EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV15UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV25OMCod_json = "" ;
      AV24WebSession = httpContext.getWebSession();
      AV26OMCodCollection = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV8ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      A9445OMEst = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9438OMFchPre = GXutil.nullDate() ;
      A9426OMMaqCod = "" ;
      A9427OMMaqDsc = "" ;
      A9433OMTxt = "" ;
      A9464OMNot = "" ;
      scmdbuf = "" ;
      P0A652_A9429PMCod = new int[1] ;
      P0A652_n9429PMCod = new boolean[] {false} ;
      P0A652_A9445OMEst = new String[] {""} ;
      P0A652_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P0A652_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P0A652_A9426OMMaqCod = new String[] {""} ;
      P0A652_A9427OMMaqDsc = new String[] {""} ;
      P0A652_n9427OMMaqDsc = new boolean[] {false} ;
      P0A652_A9433OMTxt = new String[] {""} ;
      P0A652_A9464OMNot = new String[] {""} ;
      P0A652_A9425OMCod = new int[1] ;
      P0A652_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      P0A653_A396EmprCod = new String[] {""} ;
      P0A653_A9425OMCod = new int[1] ;
      P0A653_A9447OMRepNom = new String[] {""} ;
      P0A653_n9447OMRepNom = new boolean[] {false} ;
      P0A653_A9449OMRTpo = new String[] {""} ;
      P0A653_A9446OMRepCod = new int[1] ;
      P0A653_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A653_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A653_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A653_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9447OMRepNom = "" ;
      A9449OMRTpo = "" ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9471OMRRCos = DecimalUtil.ZERO ;
      A9454OMRCCos = DecimalUtil.ZERO ;
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordenwwexportwin__default(),
         new Object[] {
             new Object[] {
            P0A652_A9429PMCod, P0A652_n9429PMCod, P0A652_A9445OMEst, P0A652_A9436OMFchCre, P0A652_A9438OMFchPre, P0A652_A9426OMMaqCod, P0A652_A9427OMMaqDsc, P0A652_n9427OMMaqDsc, P0A652_A9433OMTxt, P0A652_A9464OMNot,
            P0A652_A9425OMCod, P0A652_A396EmprCod
            }
            , new Object[] {
            P0A653_A396EmprCod, P0A653_A9425OMCod, P0A653_A9447OMRepNom, P0A653_n9447OMRepNom, P0A653_A9449OMRTpo, P0A653_A9446OMRepCod, P0A653_A9453OMRCPre, P0A653_A9452OMRCCnt, P0A653_A9451OMRRPre, P0A653_A9450OMRRCnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33GXLvl64 ;
   private short AV11Random ;
   private short Gx_err ;
   private int A9429PMCod ;
   private int AV31GXV1 ;
   private int AV27ItemOMCod ;
   private int AV28OMCod ;
   private int A9425OMCod ;
   private int A9446OMRepCod ;
   private long AV12Row ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9471OMRRCos ;
   private java.math.BigDecimal A9454OMRCCos ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String AV16EmprCod ;
   private String GXv_char2[] ;
   private String AV14EmprNom ;
   private String GXv_char3[] ;
   private String AV15UsurCod ;
   private String GXv_char4[] ;
   private String A9445OMEst ;
   private String A9426OMMaqCod ;
   private String A9427OMMaqDsc ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9447OMRepNom ;
   private String A9449OMRTpo ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date GXt_dtime5 ;
   private java.util.Date A9438OMFchPre ;
   private boolean returnInSub ;
   private boolean n9429PMCod ;
   private boolean n9427OMMaqDsc ;
   private boolean n9447OMRepNom ;
   private String AV25OMCod_json ;
   private String AV10Filename ;
   private String AV9ErrorMessage ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private GXSimpleCollection<Integer> AV26OMCodCollection ;
   private com.genexus.webpanels.WebSession AV24WebSession ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P0A652_A9429PMCod ;
   private boolean[] P0A652_n9429PMCod ;
   private String[] P0A652_A9445OMEst ;
   private java.util.Date[] P0A652_A9436OMFchCre ;
   private java.util.Date[] P0A652_A9438OMFchPre ;
   private String[] P0A652_A9426OMMaqCod ;
   private String[] P0A652_A9427OMMaqDsc ;
   private boolean[] P0A652_n9427OMMaqDsc ;
   private String[] P0A652_A9433OMTxt ;
   private String[] P0A652_A9464OMNot ;
   private int[] P0A652_A9425OMCod ;
   private String[] P0A652_A396EmprCod ;
   private String[] P0A653_A396EmprCod ;
   private int[] P0A653_A9425OMCod ;
   private String[] P0A653_A9447OMRepNom ;
   private boolean[] P0A653_n9447OMRepNom ;
   private String[] P0A653_A9449OMRTpo ;
   private int[] P0A653_A9446OMRepCod ;
   private java.math.BigDecimal[] P0A653_A9453OMRCPre ;
   private java.math.BigDecimal[] P0A653_A9452OMRCCnt ;
   private java.math.BigDecimal[] P0A653_A9451OMRRPre ;
   private java.math.BigDecimal[] P0A653_A9450OMRRCnt ;
   private com.genexus.gxoffice.ExcelDoc AV8ExcelDocument ;
}

final  class tmordenwwexportwin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A652", "SELECT T1.PMCod, T1.OMEst, T1.OMFchCre, T1.OMFchPre, T1.OMMaqCod AS OMMaqCod, T2.MaqDsc AS OMMaqDsc, T1.OMTxt, T1.OMNot, T1.OMCod, T1.EmprCod FROM (TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A653", "SELECT T1.EmprCod, T1.OMCod, T2.MRNom AS OMRepNom, T1.OMRTpo, T1.OMRepCod AS OMRepCod, T1.OMRCPre, T1.OMRCCnt, T1.OMRRPre, T1.OMRRCnt FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMRepCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7);
               ((String[]) buf[9])[0] = rslt.getVarchar(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

