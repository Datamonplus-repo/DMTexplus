package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppreagre extends GXProcedure
{
   public ppreagre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppreagre.class ), "" );
   }

   public ppreagre( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 )
   {
      ppreagre.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      ppreagre.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppreagre.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppreagre.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppreagre.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppreagre.this.AV8TotUni = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03883 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P03883_A252CliCod[0] ;
         n252CliCod = P03883_n252CliCod[0] ;
         A120BarAgrEst = P03883_A120BarAgrEst[0] ;
         A184BarMtr = P03883_A184BarMtr[0] ;
         n184BarMtr = P03883_n184BarMtr[0] ;
         A184BarMtr = P03883_A184BarMtr[0] ;
         n184BarMtr = P03883_n184BarMtr[0] ;
         AV8TotUni = A184BarMtr ;
         AV9CliCod = A252CliCod ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P03884 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A119BarAgrCod = P03884_A119BarAgrCod[0] ;
               A124BarAgrReo = P03884_A124BarAgrReo[0] ;
               A122BarAgrPar = P03884_A122BarAgrPar[0] ;
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A119BarAgrCod ;
               GXv_int3[0] = A124BarAgrReo ;
               GXv_char4[0] = A122BarAgrPar ;
               GXv_int5[0] = AV9CliCod ;
               GXv_decimal6[0] = AV8TotUni ;
               new app.puniagre(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_decimal6) ;
               ppreagre.this.A396EmprCod = GXv_char1[0] ;
               ppreagre.this.A119BarAgrCod = GXv_int2[0] ;
               ppreagre.this.A124BarAgrReo = GXv_int3[0] ;
               ppreagre.this.A122BarAgrPar = GXv_char4[0] ;
               ppreagre.this.AV9CliCod = GXv_int5[0] ;
               ppreagre.this.AV8TotUni = GXv_decimal6[0] ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppreagre.this.A396EmprCod;
      this.aP1[0] = ppreagre.this.A129BarCod;
      this.aP2[0] = ppreagre.this.A132BarCodReo;
      this.aP3[0] = ppreagre.this.A130BarCodPar;
      this.aP4[0] = ppreagre.this.AV8TotUni;
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
      P03883_A396EmprCod = new String[] {""} ;
      P03883_A129BarCod = new int[1] ;
      P03883_A132BarCodReo = new byte[1] ;
      P03883_A130BarCodPar = new String[] {""} ;
      P03883_A252CliCod = new int[1] ;
      P03883_n252CliCod = new boolean[] {false} ;
      P03883_A120BarAgrEst = new String[] {""} ;
      P03883_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03883_n184BarMtr = new boolean[] {false} ;
      A120BarAgrEst = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      P03884_A396EmprCod = new String[] {""} ;
      P03884_A129BarCod = new int[1] ;
      P03884_A132BarCodReo = new byte[1] ;
      P03884_A130BarCodPar = new String[] {""} ;
      P03884_A119BarAgrCod = new int[1] ;
      P03884_A124BarAgrReo = new byte[1] ;
      P03884_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppreagre__default(),
         new Object[] {
             new Object[] {
            P03883_A396EmprCod, P03883_A129BarCod, P03883_A132BarCodReo, P03883_A130BarCodPar, P03883_A252CliCod, P03883_n252CliCod, P03883_A120BarAgrEst, P03883_A184BarMtr, P03883_n184BarMtr
            }
            , new Object[] {
            P03884_A396EmprCod, P03884_A129BarCod, P03884_A132BarCodReo, P03884_A130BarCodPar, P03884_A119BarAgrCod, P03884_A124BarAgrReo, P03884_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV9CliCod ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private java.math.BigDecimal AV8TotUni ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A122BarAgrPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private boolean n252CliCod ;
   private boolean n184BarMtr ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03883_A396EmprCod ;
   private int[] P03883_A129BarCod ;
   private byte[] P03883_A132BarCodReo ;
   private String[] P03883_A130BarCodPar ;
   private int[] P03883_A252CliCod ;
   private boolean[] P03883_n252CliCod ;
   private String[] P03883_A120BarAgrEst ;
   private java.math.BigDecimal[] P03883_A184BarMtr ;
   private boolean[] P03883_n184BarMtr ;
   private String[] P03884_A396EmprCod ;
   private int[] P03884_A129BarCod ;
   private byte[] P03884_A132BarCodReo ;
   private String[] P03884_A130BarCodPar ;
   private int[] P03884_A119BarAgrCod ;
   private byte[] P03884_A124BarAgrReo ;
   private String[] P03884_A122BarAgrPar ;
}

final  class ppreagre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03883", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CliCod, T1.BarAgrEst, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03884", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               return;
      }
   }

}

