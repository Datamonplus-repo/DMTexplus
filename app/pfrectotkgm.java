package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfrectotkgm extends GXProcedure
{
   public pfrectotkgm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfrectotkgm.class ), "" );
   }

   public pfrectotkgm( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 )
   {
      pfrectotkgm.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pfrectotkgm.this.A396EmprCod = aP0;
      pfrectotkgm.this.A129BarCod = aP1;
      pfrectotkgm.this.A132BarCodReo = aP2;
      pfrectotkgm.this.A130BarCodPar = aP3;
      pfrectotkgm.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8kilos = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AFP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P0AFP2_A120BarAgrEst[0] ;
         /* Optimized group. */
         /* Using cursor P0AFP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         c203BarPieKil = P0AFP3_A203BarPieKil[0] ;
         pr_default.close(1);
         AV8kilos = AV8kilos.add(c203BarPieKil) ;
         /* End optimized group. */
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P0AFP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A119BarAgrCod = P0AFP4_A119BarAgrCod[0] ;
               A124BarAgrReo = P0AFP4_A124BarAgrReo[0] ;
               A122BarAgrPar = P0AFP4_A122BarAgrPar[0] ;
               GXv_decimal1[0] = AV9KilosAgr ;
               new app.parectotkgm(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_decimal1) ;
               pfrectotkgm.this.AV9KilosAgr = GXv_decimal1[0] ;
               AV8kilos = AV8kilos.add(AV9KilosAgr) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pfrectotkgm.this.AV8kilos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8kilos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AFP2_A396EmprCod = new String[] {""} ;
      P0AFP2_A129BarCod = new int[1] ;
      P0AFP2_A132BarCodReo = new byte[1] ;
      P0AFP2_A130BarCodPar = new String[] {""} ;
      P0AFP2_A120BarAgrEst = new String[] {""} ;
      A120BarAgrEst = "" ;
      c203BarPieKil = DecimalUtil.ZERO ;
      P0AFP3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFP4_A396EmprCod = new String[] {""} ;
      P0AFP4_A129BarCod = new int[1] ;
      P0AFP4_A132BarCodReo = new byte[1] ;
      P0AFP4_A130BarCodPar = new String[] {""} ;
      P0AFP4_A119BarAgrCod = new int[1] ;
      P0AFP4_A124BarAgrReo = new byte[1] ;
      P0AFP4_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      AV9KilosAgr = DecimalUtil.ZERO ;
      GXv_decimal1 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfrectotkgm__default(),
         new Object[] {
             new Object[] {
            P0AFP2_A396EmprCod, P0AFP2_A129BarCod, P0AFP2_A132BarCodReo, P0AFP2_A130BarCodPar, P0AFP2_A120BarAgrEst
            }
            , new Object[] {
            P0AFP3_A203BarPieKil
            }
            , new Object[] {
            P0AFP4_A396EmprCod, P0AFP4_A129BarCod, P0AFP4_A132BarCodReo, P0AFP4_A130BarCodPar, P0AFP4_A119BarAgrCod, P0AFP4_A124BarAgrReo, P0AFP4_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private java.math.BigDecimal AV8kilos ;
   private java.math.BigDecimal c203BarPieKil ;
   private java.math.BigDecimal AV9KilosAgr ;
   private java.math.BigDecimal GXv_decimal1[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A122BarAgrPar ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AFP2_A396EmprCod ;
   private int[] P0AFP2_A129BarCod ;
   private byte[] P0AFP2_A132BarCodReo ;
   private String[] P0AFP2_A130BarCodPar ;
   private String[] P0AFP2_A120BarAgrEst ;
   private java.math.BigDecimal[] P0AFP3_A203BarPieKil ;
   private String[] P0AFP4_A396EmprCod ;
   private int[] P0AFP4_A129BarCod ;
   private byte[] P0AFP4_A132BarCodReo ;
   private String[] P0AFP4_A130BarCodPar ;
   private int[] P0AFP4_A119BarAgrCod ;
   private byte[] P0AFP4_A124BarAgrReo ;
   private String[] P0AFP4_A122BarAgrPar ;
}

final  class pfrectotkgm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFP2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AFP3", "SELECT SUM(BarPieKil) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFP4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 2 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

