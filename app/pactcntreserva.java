package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactcntreserva extends GXProcedure
{
   public pactcntreserva( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactcntreserva.class ), "" );
   }

   public pactcntreserva( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 )
   {
      pactcntreserva.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      pactcntreserva.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactcntreserva.this.AV14Prdnum = aP1[0];
      this.aP1 = aP1;
      pactcntreserva.this.AV13Cant = aP2[0];
      this.aP2 = aP2;
      pactcntreserva.this.AV15OldCant = aP3[0];
      this.aP3 = aP3;
      pactcntreserva.this.AV19LavMqId = aP4[0];
      this.aP4 = aP4;
      pactcntreserva.this.Gx_mode = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Cant = ((GXutil.strcmp(Gx_mode, httpContext.getMessage( "DLT", ""))==0) ? DecimalUtil.doubleToDec(0) : AV13Cant) ;
      AV16UsurCod = " " ;
      AV17Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV18EmprNom ;
      GXv_char3[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char1, GXv_char2, GXv_char3) ;
      pactcntreserva.this.A396EmprCod = GXv_char1[0] ;
      pactcntreserva.this.AV18EmprNom = GXv_char2[0] ;
      pactcntreserva.this.AV16UsurCod = GXv_char3[0] ;
      /* Using cursor P05E62 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV14Prdnum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05E62_A719PrdNum[0] ;
         A718PrdNom = P05E62_A718PrdNom[0] ;
         A685PrdCanRes = P05E62_A685PrdCanRes[0] ;
         A707PrdFacCon = P05E62_A707PrdFacCon[0] ;
         AV21Cant2 = AV13Cant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         AV22Oldcant2 = AV15OldCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         AV20Inc_obs = httpContext.getMessage( "Reserva.Receta Lavado,Nº ", "") + GXutil.str( AV19LavMqId, 8, 0) + GXutil.newLine( ) ;
         AV20Inc_obs += httpContext.getMessage( "Producto   =", "") + GXutil.trim( AV14Prdnum) + " " + GXutil.trim( A718PrdNom) + httpContext.getMessage( " Mode ", "") + Gx_mode + GXutil.newLine( ) ;
         AV20Inc_obs += httpContext.getMessage( "Reservas   =", "") + GXutil.str( A685PrdCanRes, 12, 4) + httpContext.getMessage( " sumo ", "") + GXutil.str( AV21Cant2, 11, 5) + httpContext.getMessage( " resto ", "") + GXutil.str( AV22Oldcant2, 11, 5) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV27Pgmname, AV16UsurCod, AV17Station, AV20Inc_obs, AV19LavMqId, (byte)(0), "") ;
         A685PrdCanRes = A685PrdCanRes.add((((AV13Cant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon)).subtract((AV15OldCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))))) ;
         A685PrdCanRes = ((A685PrdCanRes.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : A685PrdCanRes) ;
         /* Using cursor P05E63 */
         pr_default.execute(1, new Object[] {A685PrdCanRes, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactcntreserva.this.A396EmprCod;
      this.aP1[0] = pactcntreserva.this.AV14Prdnum;
      this.aP2[0] = pactcntreserva.this.AV13Cant;
      this.aP3[0] = pactcntreserva.this.AV15OldCant;
      this.aP4[0] = pactcntreserva.this.AV19LavMqId;
      this.aP5[0] = pactcntreserva.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactcntreserva");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16UsurCod = "" ;
      AV17Station = "" ;
      GXv_char1 = new String[1] ;
      AV18EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05E62_A396EmprCod = new String[] {""} ;
      P05E62_A719PrdNum = new String[] {""} ;
      P05E62_A718PrdNom = new String[] {""} ;
      P05E62_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05E62_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      AV21Cant2 = DecimalUtil.ZERO ;
      AV22Oldcant2 = DecimalUtil.ZERO ;
      AV20Inc_obs = "" ;
      AV27Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactcntreserva__default(),
         new Object[] {
             new Object[] {
            P05E62_A396EmprCod, P05E62_A719PrdNum, P05E62_A718PrdNom, P05E62_A685PrdCanRes, P05E62_A707PrdFacCon
            }
            , new Object[] {
            }
         }
      );
      AV27Pgmname = "PActCntReserva" ;
      /* GeneXus formulas. */
      AV27Pgmname = "PActCntReserva" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV19LavMqId ;
   private java.math.BigDecimal AV13Cant ;
   private java.math.BigDecimal AV15OldCant ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal AV21Cant2 ;
   private java.math.BigDecimal AV22Oldcant2 ;
   private String A396EmprCod ;
   private String AV14Prdnum ;
   private String Gx_mode ;
   private String AV16UsurCod ;
   private String AV17Station ;
   private String GXv_char1[] ;
   private String AV18EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV27Pgmname ;
   private String AV20Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05E62_A396EmprCod ;
   private String[] P05E62_A719PrdNum ;
   private String[] P05E62_A718PrdNom ;
   private java.math.BigDecimal[] P05E62_A685PrdCanRes ;
   private java.math.BigDecimal[] P05E62_A707PrdFacCon ;
}

final  class pactcntreserva__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05E62", "SELECT EmprCod, PrdNum, PrdNom, PrdCanRes, PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05E63", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
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
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

