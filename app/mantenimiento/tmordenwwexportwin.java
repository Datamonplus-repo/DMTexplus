package app.mantenimiento ;
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
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV12Row = 2 ;
      /* Using cursor P0A652 */
      pr_default.execute(0, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA652 = false ;
         A396EmprCod = P0A652_A396EmprCod[0] ;
         A9425OMCod = P0A652_A9425OMCod[0] ;
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
         A9427OMMaqDsc = P0A652_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P0A652_n9427OMMaqDsc[0] ;
         AV22Existeresponsable = (byte)(0) ;
         AV22Existeresponsable = (byte)(((0==AV23OMOpeRes) ? 1 : AV22Existeresponsable)) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A652_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A652_A9425OMCod[0] == A9425OMCod ) )
         {
            brkA652 = false ;
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
            A9427OMMaqDsc = P0A652_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P0A652_n9427OMMaqDsc[0] ;
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
            brkA652 = true ;
            pr_default.readNext(0);
         }
         if ( ! brkA652 )
         {
            brkA652 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
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
      AV8ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P0A652_A396EmprCod = new String[] {""} ;
      P0A652_A9425OMCod = new int[1] ;
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
      A396EmprCod = "" ;
      A9445OMEst = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9438OMFchPre = GXutil.nullDate() ;
      A9426OMMaqCod = "" ;
      A9427OMMaqDsc = "" ;
      A9433OMTxt = "" ;
      A9464OMNot = "" ;
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimiento.tmordenwwexportwin__default(),
         new Object[] {
             new Object[] {
            P0A652_A396EmprCod, P0A652_A9425OMCod, P0A652_A9429PMCod, P0A652_n9429PMCod, P0A652_A9445OMEst, P0A652_A9436OMFchCre, P0A652_A9438OMFchPre, P0A652_A9426OMMaqCod, P0A652_A9427OMMaqDsc, P0A652_n9427OMMaqDsc,
            P0A652_A9433OMTxt, P0A652_A9464OMNot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22Existeresponsable ;
   private short AV11Random ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int A9429PMCod ;
   private int AV23OMOpeRes ;
   private long AV12Row ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String AV16EmprCod ;
   private String GXv_char2[] ;
   private String AV14EmprNom ;
   private String GXv_char3[] ;
   private String AV15UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9445OMEst ;
   private String A9426OMMaqCod ;
   private String A9427OMMaqDsc ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date GXt_dtime5 ;
   private java.util.Date A9438OMFchPre ;
   private boolean returnInSub ;
   private boolean brkA652 ;
   private boolean n9429PMCod ;
   private boolean n9427OMMaqDsc ;
   private String AV10Filename ;
   private String AV9ErrorMessage ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A652_A396EmprCod ;
   private int[] P0A652_A9425OMCod ;
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
   private com.genexus.gxoffice.ExcelDoc AV8ExcelDocument ;
}

final  class tmordenwwexportwin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A652", "SELECT T1.EmprCod, T1.OMCod, T1.PMCod, T1.OMEst, T1.OMFchCre, T1.OMFchPre, T1.OMMaqCod AS OMMaqCod, T2.MaqDsc AS OMMaqDsc, T1.OMTxt, T1.OMNot FROM (TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               ((String[]) buf[11])[0] = rslt.getVarchar(10);
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
               return;
      }
   }

}

