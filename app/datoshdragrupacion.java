package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class datoshdragrupacion extends GXProcedure
{
   public datoshdragrupacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( datoshdragrupacion.class ), "" );
   }

   public datoshdragrupacion( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 ,
                          int[] aP7 ,
                          String[] aP8 ,
                          java.math.BigDecimal[] aP9 ,
                          java.math.BigDecimal[] aP10 )
   {
      datoshdragrupacion.this.aP11 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        int[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             int[] aP11 )
   {
      datoshdragrupacion.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      datoshdragrupacion.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      datoshdragrupacion.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      datoshdragrupacion.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      datoshdragrupacion.this.aP4 = aP4;
      datoshdragrupacion.this.aP5 = aP5;
      datoshdragrupacion.this.aP6 = aP6;
      datoshdragrupacion.this.aP7 = aP7;
      datoshdragrupacion.this.aP8 = aP8;
      datoshdragrupacion.this.aP9 = aP9;
      datoshdragrupacion.this.aP10 = aP10;
      datoshdragrupacion.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09UV3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09UV3_A252CliCod[0] ;
         n252CliCod = P09UV3_n252CliCod[0] ;
         A136BarColNum = P09UV3_A136BarColNum[0] ;
         A135BarColNom = P09UV3_A135BarColNom[0] ;
         A212BarSer = P09UV3_A212BarSer[0] ;
         A1652BarSerDsc = P09UV3_A1652BarSerDsc[0] ;
         A166BarKgm = P09UV3_A166BarKgm[0] ;
         A184BarMtr = P09UV3_A184BarMtr[0] ;
         A199BarPie1 = P09UV3_A199BarPie1[0] ;
         A365DisDes = P09UV3_A365DisDes[0] ;
         A898BarPieNDes = P09UV3_A898BarPieNDes[0] ;
         A166BarKgm = P09UV3_A166BarKgm[0] ;
         A184BarMtr = P09UV3_A184BarMtr[0] ;
         A199BarPie1 = P09UV3_A199BarPie1[0] ;
         A898BarPieNDes = P09UV3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV9CliCod = A252CliCod ;
         AV12ColNum = A136BarColNum ;
         AV11Color = A135BarColNom ;
         AV10Serie = A212BarSer ;
         AV20barserdsc = A1652BarSerDsc ;
         AV23Barpie = A198BarPie ;
         AV21barkgm = A166BarKgm ;
         AV22Barmtr = A184BarMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = datoshdragrupacion.this.A396EmprCod;
      this.aP1[0] = datoshdragrupacion.this.A129BarCod;
      this.aP2[0] = datoshdragrupacion.this.A132BarCodReo;
      this.aP3[0] = datoshdragrupacion.this.A130BarCodPar;
      this.aP4[0] = datoshdragrupacion.this.AV9CliCod;
      this.aP5[0] = datoshdragrupacion.this.AV10Serie;
      this.aP6[0] = datoshdragrupacion.this.AV11Color;
      this.aP7[0] = datoshdragrupacion.this.AV12ColNum;
      this.aP8[0] = datoshdragrupacion.this.AV20barserdsc;
      this.aP9[0] = datoshdragrupacion.this.AV21barkgm;
      this.aP10[0] = datoshdragrupacion.this.AV22Barmtr;
      this.aP11[0] = datoshdragrupacion.this.AV23Barpie;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Serie = "" ;
      AV11Color = "" ;
      AV20barserdsc = "" ;
      AV21barkgm = DecimalUtil.ZERO ;
      AV22Barmtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09UV3_A396EmprCod = new String[] {""} ;
      P09UV3_A129BarCod = new int[1] ;
      P09UV3_A132BarCodReo = new byte[1] ;
      P09UV3_A130BarCodPar = new String[] {""} ;
      P09UV3_A252CliCod = new int[1] ;
      P09UV3_n252CliCod = new boolean[] {false} ;
      P09UV3_A136BarColNum = new int[1] ;
      P09UV3_A135BarColNom = new String[] {""} ;
      P09UV3_A212BarSer = new String[] {""} ;
      P09UV3_A1652BarSerDsc = new String[] {""} ;
      P09UV3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UV3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UV3_A199BarPie1 = new short[1] ;
      P09UV3_A365DisDes = new String[] {""} ;
      P09UV3_A898BarPieNDes = new int[1] ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.datoshdragrupacion__default(),
         new Object[] {
             new Object[] {
            P09UV3_A396EmprCod, P09UV3_A129BarCod, P09UV3_A132BarCodReo, P09UV3_A130BarCodPar, P09UV3_A252CliCod, P09UV3_n252CliCod, P09UV3_A136BarColNum, P09UV3_A135BarColNom, P09UV3_A212BarSer, P09UV3_A1652BarSerDsc,
            P09UV3_A166BarKgm, P09UV3_A184BarMtr, P09UV3_A199BarPie1, P09UV3_A365DisDes, P09UV3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9CliCod ;
   private int AV12ColNum ;
   private int AV23Barpie ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private java.math.BigDecimal AV21barkgm ;
   private java.math.BigDecimal AV22Barmtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10Serie ;
   private String AV11Color ;
   private String AV20barserdsc ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A365DisDes ;
   private boolean n252CliCod ;
   private int[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P09UV3_A396EmprCod ;
   private int[] P09UV3_A129BarCod ;
   private byte[] P09UV3_A132BarCodReo ;
   private String[] P09UV3_A130BarCodPar ;
   private int[] P09UV3_A252CliCod ;
   private boolean[] P09UV3_n252CliCod ;
   private int[] P09UV3_A136BarColNum ;
   private String[] P09UV3_A135BarColNom ;
   private String[] P09UV3_A212BarSer ;
   private String[] P09UV3_A1652BarSerDsc ;
   private java.math.BigDecimal[] P09UV3_A166BarKgm ;
   private java.math.BigDecimal[] P09UV3_A184BarMtr ;
   private short[] P09UV3_A199BarPie1 ;
   private String[] P09UV3_A365DisDes ;
   private int[] P09UV3_A898BarPieNDes ;
}

final  class datoshdragrupacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UV3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CliCod, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarSerDsc, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((int[]) buf[14])[0] = rslt.getInt(14);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

