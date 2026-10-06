package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctialb extends GXProcedure
{
   public pctialb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctialb.class ), "" );
   }

   public pctialb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pctialb.this.aP1 = new long[] {0};
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
      pctialb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctialb.this.AV8AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = "011100" ;
      GXv_int3[0] = AV14ContVal ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      pctialb.this.A396EmprCod = GXv_char1[0] ;
      pctialb.this.AV14ContVal = GXv_int3[0] ;
      if ( AV14ContVal == 1 )
      {
         AV15Consumos = (byte)(1) ;
      }
      else
      {
         AV15Consumos = (byte)(0) ;
      }
      /* Using cursor P01KF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV8AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P01KF2_A30AlbProCod[0] ;
         A189BarNumAny = P01KF2_A189BarNumAny[0] ;
         A130BarCodPar = P01KF2_A130BarCodPar[0] ;
         A132BarCodReo = P01KF2_A132BarCodReo[0] ;
         A129BarCod = P01KF2_A129BarCod[0] ;
         A189BarNumAny = P01KF2_A189BarNumAny[0] ;
         AV9BarCod = A129BarCod ;
         AV11BarCodReo = A132BarCodReo ;
         AV10BarCodPar = A130BarCodPar ;
         AV16BarNumAny = A189BarNumAny ;
         /* Execute user subroutine: 'RECETA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'RECETA' Routine */
      returnInSub = false ;
      /* Using cursor P01KF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1272UltLinPro = P01KF3_A1272UltLinPro[0] ;
         A213BarSit = P01KF3_A213BarSit[0] ;
         A130BarCodPar = P01KF3_A130BarCodPar[0] ;
         A132BarCodReo = P01KF3_A132BarCodReo[0] ;
         A129BarCod = P01KF3_A129BarCod[0] ;
         A602MaqCod = P01KF3_A602MaqCod[0] ;
         A2804RecLinMaq = P01KF3_A2804RecLinMaq[0] ;
         A213BarSit = P01KF3_A213BarSit[0] ;
         AV17Texto = httpContext.getMessage( "Cerrando receta Hdr: ", "") + GXutil.str( AV9BarCod, 8, 0) + " " + GXutil.str( AV11BarCodReo, 0, 0) + " " + AV10BarCodPar ;
         System.out.println( AV17Texto );
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV9BarCod ;
         GXv_int4[0] = AV11BarCodReo ;
         GXv_char1[0] = AV10BarCodPar ;
         GXv_char5[0] = httpContext.getMessage( "A", "") ;
         GXv_int6[0] = AV15Consumos ;
         GXv_int7[0] = AV16BarNumAny ;
         GXv_int8[0] = A2804RecLinMaq ;
         GXv_char9[0] = A602MaqCod ;
         GXv_char10[0] = httpContext.getMessage( "M", "") ;
         new app.pcietin(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char1, GXv_char5, GXv_int6, GXv_int7, GXv_int8, GXv_char9, GXv_char10) ;
         pctialb.this.A396EmprCod = GXv_char2[0] ;
         pctialb.this.AV9BarCod = GXv_int3[0] ;
         pctialb.this.AV11BarCodReo = GXv_int4[0] ;
         pctialb.this.AV10BarCodPar = GXv_char1[0] ;
         pctialb.this.AV15Consumos = GXv_int6[0] ;
         pctialb.this.AV16BarNumAny = GXv_int7[0] ;
         pctialb.this.A2804RecLinMaq = GXv_int8[0] ;
         pctialb.this.A602MaqCod = GXv_char9[0] ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctialb.this.A396EmprCod;
      this.aP1[0] = pctialb.this.AV8AlbProCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01KF2_A396EmprCod = new String[] {""} ;
      P01KF2_A30AlbProCod = new long[1] ;
      P01KF2_A189BarNumAny = new short[1] ;
      P01KF2_A130BarCodPar = new String[] {""} ;
      P01KF2_A132BarCodReo = new byte[1] ;
      P01KF2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      AV10BarCodPar = "" ;
      P01KF3_A396EmprCod = new String[] {""} ;
      P01KF3_A1272UltLinPro = new byte[1] ;
      P01KF3_A213BarSit = new byte[1] ;
      P01KF3_A130BarCodPar = new String[] {""} ;
      P01KF3_A132BarCodReo = new byte[1] ;
      P01KF3_A129BarCod = new int[1] ;
      P01KF3_A602MaqCod = new String[] {""} ;
      P01KF3_A2804RecLinMaq = new short[1] ;
      A602MaqCod = "" ;
      AV17Texto = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctialb__default(),
         new Object[] {
             new Object[] {
            P01KF2_A396EmprCod, P01KF2_A30AlbProCod, P01KF2_A189BarNumAny, P01KF2_A130BarCodPar, P01KF2_A132BarCodReo, P01KF2_A129BarCod
            }
            , new Object[] {
            P01KF3_A396EmprCod, P01KF3_A1272UltLinPro, P01KF3_A213BarSit, P01KF3_A130BarCodPar, P01KF3_A132BarCodReo, P01KF3_A129BarCod, P01KF3_A602MaqCod, P01KF3_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Consumos ;
   private byte A132BarCodReo ;
   private byte AV11BarCodReo ;
   private byte A1272UltLinPro ;
   private byte A213BarSit ;
   private byte GXv_int4[] ;
   private byte GXv_int6[] ;
   private short A189BarNumAny ;
   private short AV16BarNumAny ;
   private short A2804RecLinMaq ;
   private short GXv_int7[] ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV14ContVal ;
   private int A129BarCod ;
   private int AV9BarCod ;
   private int GXv_int3[] ;
   private long AV8AlbProCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV10BarCodPar ;
   private String A602MaqCod ;
   private String AV17Texto ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private boolean returnInSub ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01KF2_A396EmprCod ;
   private long[] P01KF2_A30AlbProCod ;
   private short[] P01KF2_A189BarNumAny ;
   private String[] P01KF2_A130BarCodPar ;
   private byte[] P01KF2_A132BarCodReo ;
   private int[] P01KF2_A129BarCod ;
   private String[] P01KF3_A396EmprCod ;
   private byte[] P01KF3_A1272UltLinPro ;
   private byte[] P01KF3_A213BarSit ;
   private String[] P01KF3_A130BarCodPar ;
   private byte[] P01KF3_A132BarCodReo ;
   private int[] P01KF3_A129BarCod ;
   private String[] P01KF3_A602MaqCod ;
   private short[] P01KF3_A2804RecLinMaq ;
}

final  class pctialb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01KF2", "SELECT T1.EmprCod, T1.AlbProCod, T2.BarNumAny, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01KF3", "SELECT T1.EmprCod, T1.UltLinPro, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.MaqCod, T1.RecLinMaq FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.BarSit >= 4 or T2.BarSit = 12) AND (T1.UltLinPro <> 0) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

