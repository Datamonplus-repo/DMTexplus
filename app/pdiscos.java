package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdiscos extends GXProcedure
{
   public pdiscos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdiscos.class ), "" );
   }

   public pdiscos( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      pdiscos.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pdiscos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdiscos.this.A6000CRCod = aP1[0];
      this.aP1 = aP1;
      pdiscos.this.AV9PorCost = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized group. */
      /* Using cursor P02522 */
      pr_default.execute(0, new Object[] {A396EmprCod, A6000CRCod});
      cV8NMaquinas = P02522_AV8NMaquinas[0] ;
      pr_default.close(0);
      AV8NMaquinas = (short)(AV8NMaquinas+cV8NMaquinas*1) ;
      /* End optimized group. */
      AV9PorCost = GXutil.roundDecimal( DecimalUtil.doubleToDec(100/ (double) (AV8NMaquinas)), 2) ;
      AV10Resto = GXutil.roundDecimal( DecimalUtil.doubleToDec(100).subtract((AV9PorCost.multiply(DecimalUtil.doubleToDec(AV8NMaquinas)))), 2) ;
      /* Using cursor P02523 */
      pr_default.execute(1, new Object[] {A396EmprCod, A6000CRCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6006CRCosPor = P02523_A6006CRCosPor[0] ;
         n6006CRCosPor = P02523_n6006CRCosPor[0] ;
         A6005CRLin = P02523_A6005CRLin[0] ;
         A6006CRCosPor = AV9PorCost ;
         n6006CRCosPor = false ;
         AV11CRLin = A6005CRLin ;
         /* Using cursor P02524 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n6006CRCosPor), A6006CRCosPor, A396EmprCod, A6000CRCod, Short.valueOf(A6005CRLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCOSRE");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      n6006CRCosPor = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02525 */
      pr_default.execute(3, new Object[] {AV9PorCost, AV10Resto, A396EmprCod, A6000CRCod, Short.valueOf(AV11CRLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCOSRE");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdiscos.this.A396EmprCod;
      this.aP1[0] = pdiscos.this.A6000CRCod;
      this.aP2[0] = pdiscos.this.AV9PorCost;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdiscos");
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
      P02522_AV8NMaquinas = new short[1] ;
      AV10Resto = DecimalUtil.ZERO ;
      P02523_A396EmprCod = new String[] {""} ;
      P02523_A6000CRCod = new String[] {""} ;
      P02523_A6006CRCosPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02523_n6006CRCosPor = new boolean[] {false} ;
      P02523_A6005CRLin = new short[1] ;
      A6006CRCosPor = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdiscos__default(),
         new Object[] {
             new Object[] {
            P02522_AV8NMaquinas
            }
            , new Object[] {
            P02523_A396EmprCod, P02523_A6000CRCod, P02523_A6006CRCosPor, P02523_n6006CRCosPor, P02523_A6005CRLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short cV8NMaquinas ;
   private short AV8NMaquinas ;
   private short A6005CRLin ;
   private short AV11CRLin ;
   private short Gx_err ;
   private java.math.BigDecimal AV9PorCost ;
   private java.math.BigDecimal AV10Resto ;
   private java.math.BigDecimal A6006CRCosPor ;
   private String A396EmprCod ;
   private String A6000CRCod ;
   private String scmdbuf ;
   private boolean n6006CRCosPor ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P02522_AV8NMaquinas ;
   private String[] P02523_A396EmprCod ;
   private String[] P02523_A6000CRCod ;
   private java.math.BigDecimal[] P02523_A6006CRCosPor ;
   private boolean[] P02523_n6006CRCosPor ;
   private short[] P02523_A6005CRLin ;
}

final  class pdiscos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02522", "SELECT COUNT(*) FROM TXPLCOSRE WHERE EmprCod = ? and CRCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02523", "SELECT EmprCod, CRCod, CRCosPor, CRLin FROM TXPLCOSRE WHERE EmprCod = ? and CRCod = ? ORDER BY EmprCod, CRCod, CRLin DESC ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02524", "UPDATE TXPLCOSRE SET CRCosPor=?  WHERE EmprCod = ? AND CRCod = ? AND CRLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLCOSRE")
         ,new UpdateCursor("P02525", "UPDATE TXPLCOSRE SET CRCosPor=? + ?  WHERE (EmprCod = ? and CRCod = ? and CRLin = ?) AND (CRLin <> 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLCOSRE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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
               stmt.setString(2, (String)parms[1], 15);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 15);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 15);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 15);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

