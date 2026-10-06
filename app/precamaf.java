package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precamaf extends GXProcedure
{
   public precamaf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precamaf.class ), "" );
   }

   public precamaf( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      precamaf.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      precamaf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precamaf.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Texto = httpContext.getMessage( "Recalculo Precios Albaran ", "") + GXutil.str( A30AlbProCod, 10, 0) ;
      System.out.println( AV23Texto );
      /* Using cursor P02OS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A40AlbProRec = P02OS2_A40AlbProRec[0] ;
         A1264BarPreMtr = P02OS2_A1264BarPreMtr[0] ;
         A1262BarPreKgm = P02OS2_A1262BarPreKgm[0] ;
         A2761AlbBarRec = P02OS2_A2761AlbBarRec[0] ;
         A130BarCodPar = P02OS2_A130BarCodPar[0] ;
         A132BarCodReo = P02OS2_A132BarCodReo[0] ;
         A129BarCod = P02OS2_A129BarCod[0] ;
         AV20TotRec = DecimalUtil.ZERO ;
         AV17PreKgs = DecimalUtil.ZERO ;
         AV18PreMts = DecimalUtil.ZERO ;
         AV21Recar = DecimalUtil.ZERO ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal5[0] = AV17PreKgs ;
         GXv_decimal6[0] = AV18PreMts ;
         GXv_int7[0] = AV19Oper ;
         GXv_decimal8[0] = AV20TotRec ;
         GXv_decimal9[0] = AV21Recar ;
         GXv_int10[0] = A30AlbProCod ;
         new app.ppremaf(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_int10) ;
         precamaf.this.A396EmprCod = GXv_char1[0] ;
         precamaf.this.A129BarCod = GXv_int2[0] ;
         precamaf.this.A132BarCodReo = GXv_int3[0] ;
         precamaf.this.A130BarCodPar = GXv_char4[0] ;
         precamaf.this.AV17PreKgs = GXv_decimal5[0] ;
         precamaf.this.AV18PreMts = GXv_decimal6[0] ;
         precamaf.this.AV19Oper = GXv_int7[0] ;
         precamaf.this.AV20TotRec = GXv_decimal8[0] ;
         precamaf.this.AV21Recar = GXv_decimal9[0] ;
         precamaf.this.A30AlbProCod = GXv_int10[0] ;
         A40AlbProRec = AV20TotRec ;
         A1264BarPreMtr = AV18PreMts ;
         A1262BarPreKgm = AV17PreKgs ;
         A2761AlbBarRec = AV21Recar ;
         /* Using cursor P02OS3 */
         pr_default.execute(1, new Object[] {A40AlbProRec, A1264BarPreMtr, A1262BarPreKgm, A2761AlbBarRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Proceso Realizado", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = precamaf.this.A396EmprCod;
      this.aP1[0] = precamaf.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "precamaf");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23Texto = "" ;
      scmdbuf = "" ;
      P02OS2_A396EmprCod = new String[] {""} ;
      P02OS2_A30AlbProCod = new long[1] ;
      P02OS2_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OS2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OS2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OS2_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OS2_A130BarCodPar = new String[] {""} ;
      P02OS2_A132BarCodReo = new byte[1] ;
      P02OS2_A129BarCod = new int[1] ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV20TotRec = DecimalUtil.ZERO ;
      AV17PreKgs = DecimalUtil.ZERO ;
      AV18PreMts = DecimalUtil.ZERO ;
      AV21Recar = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precamaf__default(),
         new Object[] {
             new Object[] {
            P02OS2_A396EmprCod, P02OS2_A30AlbProCod, P02OS2_A40AlbProRec, P02OS2_A1264BarPreMtr, P02OS2_A1262BarPreKgm, P02OS2_A2761AlbBarRec, P02OS2_A130BarCodPar, P02OS2_A132BarCodReo, P02OS2_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private byte AV19Oper ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private long A30AlbProCod ;
   private long GXv_int10[] ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal AV20TotRec ;
   private java.math.BigDecimal AV17PreKgs ;
   private java.math.BigDecimal AV18PreMts ;
   private java.math.BigDecimal AV21Recar ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String AV23Texto ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02OS2_A396EmprCod ;
   private long[] P02OS2_A30AlbProCod ;
   private java.math.BigDecimal[] P02OS2_A40AlbProRec ;
   private java.math.BigDecimal[] P02OS2_A1264BarPreMtr ;
   private java.math.BigDecimal[] P02OS2_A1262BarPreKgm ;
   private java.math.BigDecimal[] P02OS2_A2761AlbBarRec ;
   private String[] P02OS2_A130BarCodPar ;
   private byte[] P02OS2_A132BarCodReo ;
   private int[] P02OS2_A129BarCod ;
}

final  class precamaf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02OS2", "SELECT EmprCod, AlbProCod, AlbProRec, BarPreMtr, BarPreKgm, AlbBarRec, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02OS3", "UPDATE TXPALBBAR SET AlbProRec=?, BarPreMtr=?, BarPreKgm=?, AlbBarRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
      }
   }

}

