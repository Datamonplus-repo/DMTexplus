package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prcrc00 extends GXProcedure
{
   public prcrc00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prcrc00.class ), "" );
   }

   public prcrc00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      prcrc00.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      prcrc00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prcrc00.this.AV8Barcodlan = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03NW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcodlan)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2509BarCodLan = P03NW2_A2509BarCodLan[0] ;
         n2509BarCodLan = P03NW2_n2509BarCodLan[0] ;
         A2124RecMolCod = P03NW2_A2124RecMolCod[0] ;
         A1032FonCod = P03NW2_A1032FonCod[0] ;
         A1056DisComCod = P03NW2_A1056DisComCod[0] ;
         A130BarCodPar = P03NW2_A130BarCodPar[0] ;
         A132BarCodReo = P03NW2_A132BarCodReo[0] ;
         A129BarCod = P03NW2_A129BarCod[0] ;
         A2524DisComLin = P03NW2_A2524DisComLin[0] ;
         A2509BarCodLan = P03NW2_A2509BarCodLan[0] ;
         n2509BarCodLan = P03NW2_n2509BarCodLan[0] ;
         Gx_msg = httpContext.getMessage( "Recalculando : ", "") + GXutil.trim( GXutil.str( A129BarCod, 10, 0)) + GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)) + GXutil.trim( A130BarCodPar) + GXutil.trim( A1056DisComCod) + GXutil.trim( A1032FonCod) + GXutil.trim( GXutil.str( A2124RecMolCod, 10, 0)) ;
         System.out.println( Gx_msg );
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = A2524DisComLin ;
         GXv_char6[0] = A1056DisComCod ;
         GXv_char7[0] = A1032FonCod ;
         GXv_int8[0] = A2124RecMolCod ;
         new app.pestrecal(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_int8) ;
         prcrc00.this.A396EmprCod = GXv_char1[0] ;
         prcrc00.this.A129BarCod = GXv_int2[0] ;
         prcrc00.this.A132BarCodReo = GXv_int3[0] ;
         prcrc00.this.A130BarCodPar = GXv_char4[0] ;
         prcrc00.this.A2524DisComLin = GXv_int5[0] ;
         prcrc00.this.A1056DisComCod = GXv_char6[0] ;
         prcrc00.this.A1032FonCod = GXv_char7[0] ;
         prcrc00.this.A2124RecMolCod = GXv_int8[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prcrc00.this.A396EmprCod;
      this.aP1[0] = prcrc00.this.AV8Barcodlan;
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
      P03NW2_A396EmprCod = new String[] {""} ;
      P03NW2_A2509BarCodLan = new int[1] ;
      P03NW2_n2509BarCodLan = new boolean[] {false} ;
      P03NW2_A2124RecMolCod = new byte[1] ;
      P03NW2_A1032FonCod = new String[] {""} ;
      P03NW2_A1056DisComCod = new String[] {""} ;
      P03NW2_A130BarCodPar = new String[] {""} ;
      P03NW2_A132BarCodReo = new byte[1] ;
      P03NW2_A129BarCod = new int[1] ;
      P03NW2_A2524DisComLin = new byte[1] ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      A130BarCodPar = "" ;
      Gx_msg = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prcrc00__default(),
         new Object[] {
             new Object[] {
            P03NW2_A396EmprCod, P03NW2_A2509BarCodLan, P03NW2_n2509BarCodLan, P03NW2_A2124RecMolCod, P03NW2_A1032FonCod, P03NW2_A1056DisComCod, P03NW2_A130BarCodPar, P03NW2_A132BarCodReo, P03NW2_A129BarCod, P03NW2_A2524DisComLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2124RecMolCod ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte GXv_int3[] ;
   private byte GXv_int5[] ;
   private byte GXv_int8[] ;
   private short Gx_err ;
   private int AV8Barcodlan ;
   private int A2509BarCodLan ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private boolean n2509BarCodLan ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03NW2_A396EmprCod ;
   private int[] P03NW2_A2509BarCodLan ;
   private boolean[] P03NW2_n2509BarCodLan ;
   private byte[] P03NW2_A2124RecMolCod ;
   private String[] P03NW2_A1032FonCod ;
   private String[] P03NW2_A1056DisComCod ;
   private String[] P03NW2_A130BarCodPar ;
   private byte[] P03NW2_A132BarCodReo ;
   private int[] P03NW2_A129BarCod ;
   private byte[] P03NW2_A2524DisComLin ;
}

final  class prcrc00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03NW2", "SELECT T1.EmprCod, T2.BarCodLan, T1.RecMolCod, T1.FonCod, T1.DisComCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisComLin FROM (TXPRECMOL T1 INNER JOIN TXPBARCOM T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.DisComLin = T1.DisComLin AND T2.DisComCod = T1.DisComCod AND T2.FonCod = T1.FonCod) WHERE T1.EmprCod = ? and T2.BarCodLan = ? ORDER BY T1.EmprCod, T2.BarCodLan ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
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
      }
   }

}

