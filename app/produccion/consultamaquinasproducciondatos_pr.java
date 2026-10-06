package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultamaquinasproducciondatos_pr extends GXProcedure
{
   public consultamaquinasproducciondatos_pr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultamaquinasproducciondatos_pr.class ), "" );
   }

   public consultamaquinasproducciondatos_pr( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             java.util.Date[] aP12 ,
                             java.util.Date[] aP13 )
   {
      consultamaquinasproducciondatos_pr.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        java.util.Date[] aP12 ,
                        java.util.Date[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             java.util.Date[] aP12 ,
                             java.util.Date[] aP13 ,
                             String[] aP14 )
   {
      consultamaquinasproducciondatos_pr.this.AV22EmprCod = aP0;
      consultamaquinasproducciondatos_pr.this.AV20LecBarCod = aP1;
      consultamaquinasproducciondatos_pr.this.AV21LecBarReo = aP2;
      consultamaquinasproducciondatos_pr.this.AV19LecBarPar = aP3;
      consultamaquinasproducciondatos_pr.this.AV17LecMaqCod = aP4;
      consultamaquinasproducciondatos_pr.this.AV18LecFasOrd = aP5;
      consultamaquinasproducciondatos_pr.this.aP6 = aP6;
      consultamaquinasproducciondatos_pr.this.aP7 = aP7;
      consultamaquinasproducciondatos_pr.this.aP8 = aP8;
      consultamaquinasproducciondatos_pr.this.aP9 = aP9;
      consultamaquinasproducciondatos_pr.this.aP10 = aP10;
      consultamaquinasproducciondatos_pr.this.aP11 = aP11;
      consultamaquinasproducciondatos_pr.this.aP12 = aP12;
      consultamaquinasproducciondatos_pr.this.aP13 = aP13;
      consultamaquinasproducciondatos_pr.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14HisProdti = GXutil.resetTime( GXutil.nullDate() );
      AV15HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      AV16HisProF = "" ;
      /* Using cursor P0A3M2 */
      pr_default.execute(0, new Object[] {AV22EmprCod, Integer.valueOf(AV20LecBarCod), Byte.valueOf(AV21LecBarReo), AV19LecBarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0A3M2_A130BarCodPar[0] ;
         A132BarCodReo = P0A3M2_A132BarCodReo[0] ;
         A129BarCod = P0A3M2_A129BarCod[0] ;
         A396EmprCod = P0A3M2_A396EmprCod[0] ;
         A252CliCod = P0A3M2_A252CliCod[0] ;
         n252CliCod = P0A3M2_n252CliCod[0] ;
         A279CliNom = P0A3M2_A279CliNom[0] ;
         A212BarSer = P0A3M2_A212BarSer[0] ;
         A1652BarSerDsc = P0A3M2_A1652BarSerDsc[0] ;
         A135BarColNom = P0A3M2_A135BarColNom[0] ;
         A136BarColNum = P0A3M2_A136BarColNum[0] ;
         A279CliNom = P0A3M2_A279CliNom[0] ;
         AV8CliCod = A252CliCod ;
         AV10CliNom = A279CliNom ;
         AV9BarSer = A212BarSer ;
         AV11BarSerDsc = A1652BarSerDsc ;
         AV12BarColNom = A135BarColNom ;
         AV13BarColNum = A136BarColNum ;
         AV16HisProF = "-" ;
         AV14HisProdti = GXutil.resetTime( GXutil.nullDate() );
         AV15HisProdtf = GXutil.resetTime( GXutil.nullDate() );
         /* Using cursor P0A3M3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV18LecFasOrd), AV17LecMaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A602MaqCod = P0A3M3_A602MaqCod[0] ;
            A194BarOrdLin = P0A3M3_A194BarOrdLin[0] ;
            A557HisProF = P0A3M3_A557HisProF[0] ;
            A4440HisProDTI = P0A3M3_A4440HisProDTI[0] ;
            n4440HisProDTI = P0A3M3_n4440HisProDTI[0] ;
            A4441HisProDTF = P0A3M3_A4441HisProDTF[0] ;
            n4441HisProDTF = P0A3M3_n4441HisProDTF[0] ;
            A558HisProFec = P0A3M3_A558HisProFec[0] ;
            A561HisProLin = P0A3M3_A561HisProLin[0] ;
            AV16HisProF = A557HisProF ;
            AV14HisProdti = A4440HisProDTI ;
            AV15HisProdtf = A4441HisProDTF ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = consultamaquinasproducciondatos_pr.this.AV8CliCod;
      this.aP7[0] = consultamaquinasproducciondatos_pr.this.AV10CliNom;
      this.aP8[0] = consultamaquinasproducciondatos_pr.this.AV9BarSer;
      this.aP9[0] = consultamaquinasproducciondatos_pr.this.AV11BarSerDsc;
      this.aP10[0] = consultamaquinasproducciondatos_pr.this.AV12BarColNom;
      this.aP11[0] = consultamaquinasproducciondatos_pr.this.AV13BarColNum;
      this.aP12[0] = consultamaquinasproducciondatos_pr.this.AV14HisProdti;
      this.aP13[0] = consultamaquinasproducciondatos_pr.this.AV15HisProdtf;
      this.aP14[0] = consultamaquinasproducciondatos_pr.this.AV16HisProF;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10CliNom = "" ;
      AV9BarSer = "" ;
      AV11BarSerDsc = "" ;
      AV12BarColNom = "" ;
      AV14HisProdti = GXutil.resetTime( GXutil.nullDate() );
      AV15HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      AV16HisProF = "" ;
      scmdbuf = "" ;
      P0A3M2_A130BarCodPar = new String[] {""} ;
      P0A3M2_A132BarCodReo = new byte[1] ;
      P0A3M2_A129BarCod = new int[1] ;
      P0A3M2_A396EmprCod = new String[] {""} ;
      P0A3M2_A252CliCod = new int[1] ;
      P0A3M2_n252CliCod = new boolean[] {false} ;
      P0A3M2_A279CliNom = new String[] {""} ;
      P0A3M2_A212BarSer = new String[] {""} ;
      P0A3M2_A1652BarSerDsc = new String[] {""} ;
      P0A3M2_A135BarColNom = new String[] {""} ;
      P0A3M2_A136BarColNum = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      P0A3M3_A396EmprCod = new String[] {""} ;
      P0A3M3_A129BarCod = new int[1] ;
      P0A3M3_A132BarCodReo = new byte[1] ;
      P0A3M3_A130BarCodPar = new String[] {""} ;
      P0A3M3_A602MaqCod = new String[] {""} ;
      P0A3M3_A194BarOrdLin = new short[1] ;
      P0A3M3_A557HisProF = new String[] {""} ;
      P0A3M3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3M3_n4440HisProDTI = new boolean[] {false} ;
      P0A3M3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3M3_n4441HisProDTF = new boolean[] {false} ;
      P0A3M3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3M3_A561HisProLin = new int[1] ;
      A602MaqCod = "" ;
      A557HisProF = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultamaquinasproducciondatos_pr__default(),
         new Object[] {
             new Object[] {
            P0A3M2_A130BarCodPar, P0A3M2_A132BarCodReo, P0A3M2_A129BarCod, P0A3M2_A396EmprCod, P0A3M2_A252CliCod, P0A3M2_n252CliCod, P0A3M2_A279CliNom, P0A3M2_A212BarSer, P0A3M2_A1652BarSerDsc, P0A3M2_A135BarColNom,
            P0A3M2_A136BarColNum
            }
            , new Object[] {
            P0A3M3_A396EmprCod, P0A3M3_A129BarCod, P0A3M3_A132BarCodReo, P0A3M3_A130BarCodPar, P0A3M3_A602MaqCod, P0A3M3_A194BarOrdLin, P0A3M3_A557HisProF, P0A3M3_A4440HisProDTI, P0A3M3_n4440HisProDTI, P0A3M3_A4441HisProDTF,
            P0A3M3_n4441HisProDTF, P0A3M3_A558HisProFec, P0A3M3_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21LecBarReo ;
   private byte A132BarCodReo ;
   private short AV18LecFasOrd ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV20LecBarCod ;
   private int AV8CliCod ;
   private int AV13BarColNum ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A561HisProLin ;
   private String AV22EmprCod ;
   private String AV19LecBarPar ;
   private String AV17LecMaqCod ;
   private String AV10CliNom ;
   private String AV9BarSer ;
   private String AV11BarSerDsc ;
   private String AV12BarColNom ;
   private String AV16HisProF ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A602MaqCod ;
   private String A557HisProF ;
   private java.util.Date AV14HisProdti ;
   private java.util.Date AV15HisProdtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean n252CliCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String[] aP14 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private java.util.Date[] aP12 ;
   private java.util.Date[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3M2_A130BarCodPar ;
   private byte[] P0A3M2_A132BarCodReo ;
   private int[] P0A3M2_A129BarCod ;
   private String[] P0A3M2_A396EmprCod ;
   private int[] P0A3M2_A252CliCod ;
   private boolean[] P0A3M2_n252CliCod ;
   private String[] P0A3M2_A279CliNom ;
   private String[] P0A3M2_A212BarSer ;
   private String[] P0A3M2_A1652BarSerDsc ;
   private String[] P0A3M2_A135BarColNom ;
   private int[] P0A3M2_A136BarColNum ;
   private String[] P0A3M3_A396EmprCod ;
   private int[] P0A3M3_A129BarCod ;
   private byte[] P0A3M3_A132BarCodReo ;
   private String[] P0A3M3_A130BarCodPar ;
   private String[] P0A3M3_A602MaqCod ;
   private short[] P0A3M3_A194BarOrdLin ;
   private String[] P0A3M3_A557HisProF ;
   private java.util.Date[] P0A3M3_A4440HisProDTI ;
   private boolean[] P0A3M3_n4440HisProDTI ;
   private java.util.Date[] P0A3M3_A4441HisProDTF ;
   private boolean[] P0A3M3_n4441HisProDTF ;
   private java.util.Date[] P0A3M3_A558HisProFec ;
   private int[] P0A3M3_A561HisProLin ;
}

final  class consultamaquinasproducciondatos_pr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3M2", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarColNom, T1.BarColNum FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A3M3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MaqCod, BarOrdLin, HisProF, HisProDTI, HisProDTF, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and MaqCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, MaqCod, HisProFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
      }
   }

}

