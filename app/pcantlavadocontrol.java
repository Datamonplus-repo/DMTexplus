package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcantlavadocontrol extends GXProcedure
{
   public pcantlavadocontrol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcantlavadocontrol.class ), "" );
   }

   public pcantlavadocontrol( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           java.math.BigDecimal[] aP3 ,
                           String[] aP4 )
   {
      pcantlavadocontrol.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pcantlavadocontrol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcantlavadocontrol.this.AV13PrdNum = aP1[0];
      this.aP1 = aP1;
      pcantlavadocontrol.this.AV9PrdCant = aP2[0];
      this.aP2 = aP2;
      pcantlavadocontrol.this.AV10oldPrdCant = aP3[0];
      this.aP3 = aP3;
      pcantlavadocontrol.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      pcantlavadocontrol.this.AV17noreceta = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      /* Using cursor P05PF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV13PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05PF2_A719PrdNum[0] ;
         A685PrdCanRes = P05PF2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P05PF2_A704PrdExiAlm[0] ;
         AV11PrdCanres = A685PrdCanRes ;
         AV12PrdExialm = A704PrdExiAlm ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV18Cant = (AV11PrdCanres.subtract((AV10oldPrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))).add((AV9PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)))) ;
      if ( (AV12PrdExialm.subtract(AV18Cant)).doubleValue() <= 0 )
      {
         AV19Msg1 = ((AV17noreceta==0) ? httpContext.getMessage( "AVISO.", "") : httpContext.getMessage( "ERROR.", "")) + httpContext.getMessage( " La cantidad en Almacen ", "") + GXutil.str( AV12PrdExialm, 12, 4) + GXutil.newLine( ) ;
         AV19Msg1 += httpContext.getMessage( "menos ", "") + GXutil.str( AV18Cant, 12, 4) + httpContext.getMessage( ", es <=0", "") ;
         Gx_msg = AV19Msg1 ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcantlavadocontrol.this.A396EmprCod;
      this.aP1[0] = pcantlavadocontrol.this.AV13PrdNum;
      this.aP2[0] = pcantlavadocontrol.this.AV9PrdCant;
      this.aP3[0] = pcantlavadocontrol.this.AV10oldPrdCant;
      this.aP4[0] = pcantlavadocontrol.this.Gx_msg;
      this.aP5[0] = pcantlavadocontrol.this.AV17noreceta;
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
      P05PF2_A396EmprCod = new String[] {""} ;
      P05PF2_A719PrdNum = new String[] {""} ;
      P05PF2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PF2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      AV11PrdCanres = DecimalUtil.ZERO ;
      AV12PrdExialm = DecimalUtil.ZERO ;
      AV18Cant = DecimalUtil.ZERO ;
      AV19Msg1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcantlavadocontrol__default(),
         new Object[] {
             new Object[] {
            P05PF2_A396EmprCod, P05PF2_A719PrdNum, P05PF2_A685PrdCanRes, P05PF2_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17noreceta ;
   private short Gx_err ;
   private java.math.BigDecimal AV9PrdCant ;
   private java.math.BigDecimal AV10oldPrdCant ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV11PrdCanres ;
   private java.math.BigDecimal AV12PrdExialm ;
   private java.math.BigDecimal AV18Cant ;
   private String A396EmprCod ;
   private String AV13PrdNum ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String AV19Msg1 ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05PF2_A396EmprCod ;
   private String[] P05PF2_A719PrdNum ;
   private java.math.BigDecimal[] P05PF2_A685PrdCanRes ;
   private java.math.BigDecimal[] P05PF2_A704PrdExiAlm ;
}

final  class pcantlavadocontrol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PF2", "SELECT EmprCod, PrdNum, PrdCanRes, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

