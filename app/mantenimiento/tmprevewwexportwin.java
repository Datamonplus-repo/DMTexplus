package app.mantenimiento ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmprevewwexportwin extends GXProcedure
{
   public tmprevewwexportwin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmprevewwexportwin.class ), "" );
   }

   public tmprevewwexportwin( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmprevewwexportwin.this.aP1 = new String[] {""};
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
      tmprevewwexportwin.this.aP0 = aP0;
      tmprevewwexportwin.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmprevewwexportwin.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmprevewwexportwin.this.A396EmprCod = GXv_char2[0] ;
      tmprevewwexportwin.this.AV20EmprNom = GXv_char3[0] ;
      tmprevewwexportwin.this.AV21UsurCod = GXv_char4[0] ;
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
      AV13Random = (short)(GXutil.random( )*10000) ;
      AV8Filename = "TMPreveWWExportWin-" + GXutil.trim( GXutil.str( AV13Random, 4, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV8Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(1, 1, 1, 1).setText( GXutil.trim( AV24Pgmdesc) );
      AV11Row = 2 ;
      AV12Col = (short)(1) ;
      while ( AV12Col <= 17 )
      {
         AV10ExcelDocument.Cells((int)(AV11Row), AV12Col, 1, 1).setBold( (short)(1) );
         AV12Col = (short)(AV12Col+1) ;
      }
      AV10ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "N Orden Prev", "") );
      AV10ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Estado", "") );
      AV10ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Creacion", "") );
      AV10ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Inicio Validez", "") );
      AV10ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Fec Ult Inst", "") );
      AV10ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV10ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Frecuencia (Dias)", "") );
      AV10ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Fec Ult Inst+Dias", "") );
      AV10ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Fecha dia - 7 dias", "") );
      AV10ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Uso Equipo", "") );
      AV10ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Horas", "") );
      AV10ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Uso Mts", "") );
      AV10ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Mts hasta Fec Ult", "") );
      AV10ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Tarea", "") );
      AV10ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(2, 17, 1, 1).setText( httpContext.getMessage( "Status", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV11Row = 3 ;
      /* Using cursor P0A5G2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9478PMEst = P0A5G2_A9478PMEst[0] ;
         n9478PMEst = P0A5G2_n9478PMEst[0] ;
         A9474PMFchCre = P0A5G2_A9474PMFchCre[0] ;
         n9474PMFchCre = P0A5G2_n9474PMFchCre[0] ;
         A9484PMIni = P0A5G2_A9484PMIni[0] ;
         n9484PMIni = P0A5G2_n9484PMIni[0] ;
         A9486PMUlt = P0A5G2_A9486PMUlt[0] ;
         n9486PMUlt = P0A5G2_n9486PMUlt[0] ;
         A9476PMMaqCod = P0A5G2_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P0A5G2_n9476PMMaqCod[0] ;
         A9473PMDsc = P0A5G2_A9473PMDsc[0] ;
         n9473PMDsc = P0A5G2_n9473PMDsc[0] ;
         A9487PMDias = P0A5G2_A9487PMDias[0] ;
         n9487PMDias = P0A5G2_n9487PMDias[0] ;
         A11454PMUso = P0A5G2_A11454PMUso[0] ;
         n11454PMUso = P0A5G2_n11454PMUso[0] ;
         A13013PMUsoMts = P0A5G2_A13013PMUsoMts[0] ;
         n13013PMUsoMts = P0A5G2_n13013PMUsoMts[0] ;
         A9429PMCod = P0A5G2_A9429PMCod[0] ;
         A396EmprCod = P0A5G2_A396EmprCod[0] ;
         /* Using cursor P0A5G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9480PMTDsc = P0A5G3_A9480PMTDsc[0] ;
            n9480PMTDsc = P0A5G3_n9480PMTDsc[0] ;
            A9479PMTCod = P0A5G3_A9479PMTCod[0] ;
            A9480PMTDsc = P0A5G3_A9480PMTDsc[0] ;
            n9480PMTDsc = P0A5G3_n9480PMTDsc[0] ;
            AV10ExcelDocument.Cells((int)(AV11Row), 1, 1, 1).setNumber( A9429PMCod );
            AV10ExcelDocument.Cells((int)(AV11Row), 2, 1, 1).setText( A9478PMEst );
            GXt_dtime5 = GXutil.resetTime( A9474PMFchCre );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells((int)(AV11Row), 3, 1, 1).setDate( GXt_dtime5 );
            GXt_dtime5 = GXutil.resetTime( A9484PMIni );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells((int)(AV11Row), 4, 1, 1).setDate( GXt_dtime5 );
            GXt_dtime5 = GXutil.resetTime( A9486PMUlt );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells((int)(AV11Row), 5, 1, 1).setDate( GXt_dtime5 );
            AV10ExcelDocument.Cells((int)(AV11Row), 6, 1, 1).setColor( ((AV15CrearOrden==0) ? 0 : 5) );
            AV10ExcelDocument.Cells((int)(AV11Row), 6, 1, 1).setText( A9476PMMaqCod );
            AV10ExcelDocument.Cells((int)(AV11Row), 7, 1, 1).setText( A9473PMDsc );
            AV10ExcelDocument.Cells((int)(AV11Row), 8, 1, 1).setNumber( A9487PMDias );
            GXt_dtime5 = GXutil.resetTime( AV16Fecha1 );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells((int)(AV11Row), 9, 1, 1).setDate( GXt_dtime5 );
            GXt_dtime5 = GXutil.resetTime( AV17Fecha2 );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells((int)(AV11Row), 10, 1, 1).setDate( GXt_dtime5 );
            AV10ExcelDocument.Cells((int)(AV11Row), 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A11454PMUso)) );
            AV10ExcelDocument.Cells((int)(AV11Row), 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18Horas)) );
            AV10ExcelDocument.Cells((int)(AV11Row), 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13013PMUsoMts)) );
            AV10ExcelDocument.Cells((int)(AV11Row), 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV14PmUsoMts)) );
            AV10ExcelDocument.Cells((int)(AV11Row), 15, 1, 1).setNumber( A9479PMTCod );
            AV10ExcelDocument.Cells((int)(AV11Row), 16, 1, 1).setText( A9480PMTDsc );
            AV10ExcelDocument.Cells((int)(AV11Row), 17, 1, 1).setNumber( AV15CrearOrden );
            AV11Row = (long)(AV11Row+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( )
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
         AV8Filename = "" ;
         AV9ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = tmprevewwexportwin.this.AV8Filename;
      this.aP1[0] = tmprevewwexportwin.this.AV9ErrorMessage;
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
      AV8Filename = "" ;
      AV9ErrorMessage = "" ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      A396EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV20EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV21UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV24Pgmdesc = "" ;
      scmdbuf = "" ;
      P0A5G2_A9478PMEst = new String[] {""} ;
      P0A5G2_n9478PMEst = new boolean[] {false} ;
      P0A5G2_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5G2_n9474PMFchCre = new boolean[] {false} ;
      P0A5G2_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5G2_n9484PMIni = new boolean[] {false} ;
      P0A5G2_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5G2_n9486PMUlt = new boolean[] {false} ;
      P0A5G2_A9476PMMaqCod = new String[] {""} ;
      P0A5G2_n9476PMMaqCod = new boolean[] {false} ;
      P0A5G2_A9473PMDsc = new String[] {""} ;
      P0A5G2_n9473PMDsc = new boolean[] {false} ;
      P0A5G2_A9487PMDias = new short[1] ;
      P0A5G2_n9487PMDias = new boolean[] {false} ;
      P0A5G2_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5G2_n11454PMUso = new boolean[] {false} ;
      P0A5G2_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5G2_n13013PMUsoMts = new boolean[] {false} ;
      P0A5G2_A9429PMCod = new int[1] ;
      P0A5G2_A396EmprCod = new String[] {""} ;
      A9478PMEst = "" ;
      A9474PMFchCre = GXutil.nullDate() ;
      A9484PMIni = GXutil.nullDate() ;
      A9486PMUlt = GXutil.nullDate() ;
      A9476PMMaqCod = "" ;
      A9473PMDsc = "" ;
      A11454PMUso = DecimalUtil.ZERO ;
      A13013PMUsoMts = DecimalUtil.ZERO ;
      P0A5G3_A396EmprCod = new String[] {""} ;
      P0A5G3_A9429PMCod = new int[1] ;
      P0A5G3_A9480PMTDsc = new String[] {""} ;
      P0A5G3_n9480PMTDsc = new boolean[] {false} ;
      P0A5G3_A9479PMTCod = new int[1] ;
      A9480PMTDsc = "" ;
      AV16Fecha1 = GXutil.nullDate() ;
      AV17Fecha2 = GXutil.nullDate() ;
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      AV18Horas = DecimalUtil.ZERO ;
      AV14PmUsoMts = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimiento.tmprevewwexportwin__default(),
         new Object[] {
             new Object[] {
            P0A5G2_A9478PMEst, P0A5G2_n9478PMEst, P0A5G2_A9474PMFchCre, P0A5G2_n9474PMFchCre, P0A5G2_A9484PMIni, P0A5G2_n9484PMIni, P0A5G2_A9486PMUlt, P0A5G2_n9486PMUlt, P0A5G2_A9476PMMaqCod, P0A5G2_n9476PMMaqCod,
            P0A5G2_A9473PMDsc, P0A5G2_n9473PMDsc, P0A5G2_A9487PMDias, P0A5G2_n9487PMDias, P0A5G2_A11454PMUso, P0A5G2_n11454PMUso, P0A5G2_A13013PMUsoMts, P0A5G2_n13013PMUsoMts, P0A5G2_A9429PMCod, P0A5G2_A396EmprCod
            }
            , new Object[] {
            P0A5G3_A396EmprCod, P0A5G3_A9429PMCod, P0A5G3_A9480PMTDsc, P0A5G3_n9480PMTDsc, P0A5G3_A9479PMTCod
            }
         }
      );
      AV24Pgmdesc = httpContext.getMessage( "Mantenimiento Preventivo", "") ;
      /* GeneXus formulas. */
      AV24Pgmdesc = httpContext.getMessage( "Mantenimiento Preventivo", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV15CrearOrden ;
   private short AV13Random ;
   private short AV12Col ;
   private short A9487PMDias ;
   private short Gx_err ;
   private int A9429PMCod ;
   private int A9479PMTCod ;
   private long AV11Row ;
   private java.math.BigDecimal A11454PMUso ;
   private java.math.BigDecimal A13013PMUsoMts ;
   private java.math.BigDecimal AV18Horas ;
   private java.math.BigDecimal AV14PmUsoMts ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String A396EmprCod ;
   private String GXv_char2[] ;
   private String AV20EmprNom ;
   private String GXv_char3[] ;
   private String AV21UsurCod ;
   private String GXv_char4[] ;
   private String AV24Pgmdesc ;
   private String scmdbuf ;
   private String A9478PMEst ;
   private String A9476PMMaqCod ;
   private String A9473PMDsc ;
   private String A9480PMTDsc ;
   private java.util.Date GXt_dtime5 ;
   private java.util.Date A9474PMFchCre ;
   private java.util.Date A9484PMIni ;
   private java.util.Date A9486PMUlt ;
   private java.util.Date AV16Fecha1 ;
   private java.util.Date AV17Fecha2 ;
   private boolean returnInSub ;
   private boolean n9478PMEst ;
   private boolean n9474PMFchCre ;
   private boolean n9484PMIni ;
   private boolean n9486PMUlt ;
   private boolean n9476PMMaqCod ;
   private boolean n9473PMDsc ;
   private boolean n9487PMDias ;
   private boolean n11454PMUso ;
   private boolean n13013PMUsoMts ;
   private boolean n9480PMTDsc ;
   private String AV8Filename ;
   private String AV9ErrorMessage ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A5G2_A9478PMEst ;
   private boolean[] P0A5G2_n9478PMEst ;
   private java.util.Date[] P0A5G2_A9474PMFchCre ;
   private boolean[] P0A5G2_n9474PMFchCre ;
   private java.util.Date[] P0A5G2_A9484PMIni ;
   private boolean[] P0A5G2_n9484PMIni ;
   private java.util.Date[] P0A5G2_A9486PMUlt ;
   private boolean[] P0A5G2_n9486PMUlt ;
   private String[] P0A5G2_A9476PMMaqCod ;
   private boolean[] P0A5G2_n9476PMMaqCod ;
   private String[] P0A5G2_A9473PMDsc ;
   private boolean[] P0A5G2_n9473PMDsc ;
   private short[] P0A5G2_A9487PMDias ;
   private boolean[] P0A5G2_n9487PMDias ;
   private java.math.BigDecimal[] P0A5G2_A11454PMUso ;
   private boolean[] P0A5G2_n11454PMUso ;
   private java.math.BigDecimal[] P0A5G2_A13013PMUsoMts ;
   private boolean[] P0A5G2_n13013PMUsoMts ;
   private int[] P0A5G2_A9429PMCod ;
   private String[] P0A5G2_A396EmprCod ;
   private String[] P0A5G3_A396EmprCod ;
   private int[] P0A5G3_A9429PMCod ;
   private String[] P0A5G3_A9480PMTDsc ;
   private boolean[] P0A5G3_n9480PMTDsc ;
   private int[] P0A5G3_A9479PMTCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
}

final  class tmprevewwexportwin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A5G2", "SELECT PMEst, PMFchCre, PMIni, PMUlt, PMMaqCod, PMDsc, PMDias, PMUso, PMUsoMts, PMCod, EmprCod FROM TXPMPREVE ORDER BY EmprCod, PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5G3", "SELECT T1.EmprCod, T1.PMCod, T2.TMDsc AS PMTDsc, T1.PMTCod AS PMTCod FROM (TXPMPrev3 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.PMTCod) WHERE T1.EmprCod = ? and T1.PMCod = ? ORDER BY T1.EmprCod, T1.PMCod, T1.PMTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

