package app.comprasquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pedidospendientes_export extends GXProcedure
{
   public pedidospendientes_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedidospendientes_export.class ), "" );
   }

   public pedidospendientes_export( int remoteHandle ,
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
                             String[] aP6 )
   {
      pedidospendientes_export.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pedidospendientes_export.this.AV32Emprcod = aP0;
      pedidospendientes_export.this.AV44PedFec = aP1;
      pedidospendientes_export.this.AV45PedFec_to = aP2;
      pedidospendientes_export.this.AV46PrvNum = aP3;
      pedidospendientes_export.this.AV47PrvNum_to = aP4;
      pedidospendientes_export.this.AV48Lindsdo0 = aP5;
      pedidospendientes_export.this.aP6 = aP6;
      pedidospendientes_export.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S151 ();
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
      S131 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV10CellRow = 1 ;
      AV9CellCol = 1 ;
      while ( AV9CellCol <= 50 )
      {
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setBold( (short)(1) );
         AV12ExcelDocument.Cells(AV10CellRow, AV9CellCol, 1, 1).setColor( 11 );
         AV9CellCol = (int)(AV9CellCol+1) ;
      }
      AV12ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Proveedor", "") );
      AV12ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV12ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Nº Pedido", "") );
      AV12ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Fecha Pedido", "") );
      AV12ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Fecha Entrega", "") );
      AV12ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV12ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV12ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Und. Pedidas", "") );
      AV12ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Und. Servidas", "") );
      AV12ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Und. Pendientes", "") );
      AV12ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV12ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Valor", "") );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      /* Using cursor P09VR2 */
      pr_default.execute(0, new Object[] {AV44PedFec, AV45PedFec_to, Integer.valueOf(AV46PrvNum), Integer.valueOf(AV47PrvNum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9VR2 = false ;
         A794PrvNom = P09VR2_A794PrvNom[0] ;
         n794PrvNom = P09VR2_n794PrvNom[0] ;
         A662PedFecEnt = P09VR2_A662PedFecEnt[0] ;
         A658PedCod = P09VR2_A658PedCod[0] ;
         A396EmprCod = P09VR2_A396EmprCod[0] ;
         A667PedSit = P09VR2_A667PedSit[0] ;
         A795PrvNum = P09VR2_A795PrvNum[0] ;
         A661PedFec = P09VR2_A661PedFec[0] ;
         A794PrvNom = P09VR2_A794PrvNom[0] ;
         n794PrvNom = P09VR2_n794PrvNom[0] ;
         AV49LisPrv = (short)(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09VR2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09VR2_A795PrvNum[0] == A795PrvNum ) )
         {
            brk9VR2 = false ;
            A794PrvNom = P09VR2_A794PrvNom[0] ;
            n794PrvNom = P09VR2_n794PrvNom[0] ;
            A662PedFecEnt = P09VR2_A662PedFecEnt[0] ;
            A658PedCod = P09VR2_A658PedCod[0] ;
            A667PedSit = P09VR2_A667PedSit[0] ;
            A661PedFec = P09VR2_A661PedFec[0] ;
            A794PrvNom = P09VR2_A794PrvNom[0] ;
            n794PrvNom = P09VR2_n794PrvNom[0] ;
            if ( (( GXutil.resetTime(A661PedFec).before( GXutil.resetTime( AV45PedFec_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(A661PedFec), GXutil.resetTime(AV45PedFec_to)) )) )
            {
               if ( (( GXutil.resetTime(A661PedFec).after( GXutil.resetTime( AV44PedFec )) ) || ( GXutil.dateCompare(GXutil.resetTime(A661PedFec), GXutil.resetTime(AV44PedFec)) )) )
               {
                  if ( A795PrvNum >= AV46PrvNum )
                  {
                     if ( A795PrvNum <= AV47PrvNum_to )
                     {
                        if ( GXutil.strcmp(A667PedSit, "N") == 0 )
                        {
                           AV52LisPrd = (short)(0) ;
                           /* Using cursor P09VR3 */
                           pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
                           while ( (pr_default.getStatus(1) != 101) )
                           {
                              A657PedCanEnt = P09VR3_A657PedCanEnt[0] ;
                              A669PedUni = P09VR3_A669PedUni[0] ;
                              A665PedPre = P09VR3_A665PedPre[0] ;
                              A659PedCum = P09VR3_A659PedCum[0] ;
                              A719PrdNum = P09VR3_A719PrdNum[0] ;
                              A718PrdNom = P09VR3_A718PrdNom[0] ;
                              A718PrdNom = P09VR3_A718PrdNom[0] ;
                              AV50UniPend = A669PedUni.subtract(A657PedCanEnt) ;
                              AV51VPend = GXutil.roundDecimal( AV50UniPend.multiply(A665PedPre), 2) ;
                              if ( ( ( GXutil.strcmp(AV48Lindsdo0, httpContext.getMessage( "I", "")) == 0 ) ) || ( ( GXutil.strcmp(AV48Lindsdo0, httpContext.getMessage( "E", "")) == 0 ) && ( AV50UniPend.doubleValue() != 0 ) && ( GXutil.strcmp(A659PedCum, httpContext.getMessage( "S", "")) != 0 ) ) )
                              {
                                 AV12ExcelDocument.Cells(AV10CellRow, 1, 1, 1).setNumber( A795PrvNum );
                                 AV12ExcelDocument.Cells(AV10CellRow, 2, 1, 1).setText( A794PrvNom );
                                 AV12ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setNumber( A658PedCod );
                                 GXt_dtime1 = GXutil.resetTime( A661PedFec );
                                 AV12ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                 AV12ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setDate( GXt_dtime1 );
                                 GXt_dtime1 = GXutil.resetTime( A662PedFecEnt );
                                 AV12ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                 AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setDate( GXt_dtime1 );
                                 AV12ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setText( A719PrdNum );
                                 AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setText( A718PrdNom );
                                 AV12ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A669PedUni)) );
                                 AV12ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A657PedCanEnt)) );
                                 AV12ExcelDocument.Cells(AV10CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50UniPend)) );
                                 AV12ExcelDocument.Cells(AV10CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A665PedPre)) );
                                 AV12ExcelDocument.Cells(AV10CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51VPend)) );
                                 AV10CellRow = (int)(AV10CellRow+1) ;
                              }
                              pr_default.readNext(1);
                           }
                           pr_default.close(1);
                        }
                     }
                  }
               }
            }
            brk9VR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk9VR2 )
         {
            brk9VR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV12ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV12ExcelDocument.Close();
   }

   public void S151( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV13Filename = "InformePedidosPendientesExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV12ExcelDocument.Open(AV13Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV12ExcelDocument.Clear();
   }

   public void S141( )
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

   protected void cleanup( )
   {
      this.aP6[0] = pedidospendientes_export.this.AV13Filename;
      this.aP7[0] = pedidospendientes_export.this.AV11ErrorMessage;
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
      scmdbuf = "" ;
      P09VR2_A794PrvNom = new String[] {""} ;
      P09VR2_n794PrvNom = new boolean[] {false} ;
      P09VR2_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09VR2_A658PedCod = new int[1] ;
      P09VR2_A396EmprCod = new String[] {""} ;
      P09VR2_A667PedSit = new String[] {""} ;
      P09VR2_A795PrvNum = new int[1] ;
      P09VR2_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      A794PrvNom = "" ;
      A662PedFecEnt = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A667PedSit = "" ;
      A661PedFec = GXutil.nullDate() ;
      P09VR3_A396EmprCod = new String[] {""} ;
      P09VR3_A658PedCod = new int[1] ;
      P09VR3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09VR3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09VR3_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09VR3_A659PedCum = new String[] {""} ;
      P09VR3_A719PrdNum = new String[] {""} ;
      P09VR3_A718PrdNom = new String[] {""} ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV50UniPend = DecimalUtil.ZERO ;
      AV51VPend = DecimalUtil.ZERO ;
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.comprasquimicos.pedidospendientes_export__default(),
         new Object[] {
             new Object[] {
            P09VR2_A794PrvNom, P09VR2_n794PrvNom, P09VR2_A662PedFecEnt, P09VR2_A658PedCod, P09VR2_A396EmprCod, P09VR2_A667PedSit, P09VR2_A795PrvNum, P09VR2_A661PedFec
            }
            , new Object[] {
            P09VR3_A396EmprCod, P09VR3_A658PedCod, P09VR3_A657PedCanEnt, P09VR3_A669PedUni, P09VR3_A665PedPre, P09VR3_A659PedCum, P09VR3_A719PrdNum, P09VR3_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV49LisPrv ;
   private short AV52LisPrd ;
   private short Gx_err ;
   private int AV46PrvNum ;
   private int AV47PrvNum_to ;
   private int AV10CellRow ;
   private int AV9CellCol ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int AV15Random ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal AV50UniPend ;
   private java.math.BigDecimal AV51VPend ;
   private String AV32Emprcod ;
   private String AV48Lindsdo0 ;
   private String scmdbuf ;
   private String A794PrvNom ;
   private String A396EmprCod ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date AV44PedFec ;
   private java.util.Date AV45PedFec_to ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date A661PedFec ;
   private boolean returnInSub ;
   private boolean brk9VR2 ;
   private boolean n794PrvNom ;
   private String AV13Filename ;
   private String AV11ErrorMessage ;
   private String[] aP7 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P09VR2_A794PrvNom ;
   private boolean[] P09VR2_n794PrvNom ;
   private java.util.Date[] P09VR2_A662PedFecEnt ;
   private int[] P09VR2_A658PedCod ;
   private String[] P09VR2_A396EmprCod ;
   private String[] P09VR2_A667PedSit ;
   private int[] P09VR2_A795PrvNum ;
   private java.util.Date[] P09VR2_A661PedFec ;
   private String[] P09VR3_A396EmprCod ;
   private int[] P09VR3_A658PedCod ;
   private java.math.BigDecimal[] P09VR3_A657PedCanEnt ;
   private java.math.BigDecimal[] P09VR3_A669PedUni ;
   private java.math.BigDecimal[] P09VR3_A665PedPre ;
   private String[] P09VR3_A659PedCum ;
   private String[] P09VR3_A719PrdNum ;
   private String[] P09VR3_A718PrdNom ;
   private com.genexus.gxoffice.ExcelDoc AV12ExcelDocument ;
}

final  class pedidospendientes_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VR2", "SELECT T2.PrvNom, T1.PedFecEnt, T1.PedCod, T1.EmprCod, T1.PedSit, T1.PrvNum, T1.PedFec FROM (TXPCPEDID T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE (T1.PedFec >= ?) AND (T1.PedFec <= ?) AND (T1.PrvNum >= ?) AND (T1.PrvNum <= ?) ORDER BY T1.EmprCod, T1.PrvNum, T1.PedFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09VR3", "SELECT T1.EmprCod, T1.PedCod, T1.PedCanEnt, T1.PedUni, T1.PedPre, T1.PedCum, T1.PrdNum, T2.PrdNom FROM (TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

