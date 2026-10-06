package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existenciassr extends GXProcedure
{
   public existenciassr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existenciassr.class ), "" );
   }

   public existenciassr( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.util.Date[] aP2 )
   {
      existenciassr.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      existenciassr.this.AV14Emprcod = aP0[0];
      this.aP0 = aP0;
      existenciassr.this.AV12Prdnum = aP1[0];
      this.aP1 = aP1;
      existenciassr.this.AV13RecFec = aP2[0];
      this.aP2 = aP2;
      existenciassr.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV17EntSalInv) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV14Emprcod, httpContext.getMessage( "ENSAIV", ""), GXv_int2) ;
      existenciassr.this.GXt_int1 = GXv_int2[0] ;
      AV17EntSalInv = GXt_int1 ;
      AV18Existencias = DecimalUtil.ZERO ;
      AV8Recexiteo = DecimalUtil.ZERO ;
      AV9RecExiRea = DecimalUtil.ZERO ;
      AV10RecExiTcc = DecimalUtil.ZERO ;
      AV11RecExiRcc = DecimalUtil.ZERO ;
      /* Using cursor P09412 */
      pr_default.execute(0, new Object[] {AV14Emprcod, AV12Prdnum, AV13RecFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = P09412_A810RecFec[0] ;
         A719PrdNum = P09412_A719PrdNum[0] ;
         A396EmprCod = P09412_A396EmprCod[0] ;
         A809RecExiTeo = P09412_A809RecExiTeo[0] ;
         A807RecExiRea = P09412_A807RecExiRea[0] ;
         A808RecExiTcc = P09412_A808RecExiTcc[0] ;
         A806RecExiRcc = P09412_A806RecExiRcc[0] ;
         AV8Recexiteo = A809RecExiTeo ;
         AV9RecExiRea = A807RecExiRea ;
         AV10RecExiTcc = A808RecExiTcc ;
         AV11RecExiRcc = A806RecExiRcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_char3[0] = AV14Emprcod ;
      GXv_char4[0] = AV12Prdnum ;
      GXv_date5[0] = AV13RecFec ;
      GXv_decimal6[0] = AV15ComprasInv ;
      GXv_decimal7[0] = AV16ConsumosInv ;
      new app.pprc124(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_date5, GXv_decimal6, GXv_decimal7) ;
      existenciassr.this.AV14Emprcod = GXv_char3[0] ;
      existenciassr.this.AV12Prdnum = GXv_char4[0] ;
      existenciassr.this.AV13RecFec = GXv_date5[0] ;
      existenciassr.this.AV15ComprasInv = GXv_decimal6[0] ;
      existenciassr.this.AV16ConsumosInv = GXv_decimal7[0] ;
      AV18Existencias = ((AV17EntSalInv==0) ? AV9RecExiRea : AV9RecExiRea.add(AV15ComprasInv).subtract(AV16ConsumosInv)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = existenciassr.this.AV14Emprcod;
      this.aP1[0] = existenciassr.this.AV12Prdnum;
      this.aP2[0] = existenciassr.this.AV13RecFec;
      this.aP3[0] = existenciassr.this.AV18Existencias;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Existencias = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      AV8Recexiteo = DecimalUtil.ZERO ;
      AV9RecExiRea = DecimalUtil.ZERO ;
      AV10RecExiTcc = DecimalUtil.ZERO ;
      AV11RecExiRcc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09412_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09412_A719PrdNum = new String[] {""} ;
      P09412_A396EmprCod = new String[] {""} ;
      P09412_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09412_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09412_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09412_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      AV15ComprasInv = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV16ConsumosInv = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.existenciassr__default(),
         new Object[] {
             new Object[] {
            P09412_A810RecFec, P09412_A719PrdNum, P09412_A396EmprCod, P09412_A809RecExiTeo, P09412_A807RecExiRea, P09412_A808RecExiTcc, P09412_A806RecExiRcc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV17EntSalInv ;
   private short Gx_err ;
   private java.math.BigDecimal AV18Existencias ;
   private java.math.BigDecimal AV8Recexiteo ;
   private java.math.BigDecimal AV9RecExiRea ;
   private java.math.BigDecimal AV10RecExiTcc ;
   private java.math.BigDecimal AV11RecExiRcc ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal AV15ComprasInv ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV16ConsumosInv ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String AV14Emprcod ;
   private String AV12Prdnum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private java.util.Date AV13RecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date GXv_date5[] ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P09412_A810RecFec ;
   private String[] P09412_A719PrdNum ;
   private String[] P09412_A396EmprCod ;
   private java.math.BigDecimal[] P09412_A809RecExiTeo ;
   private java.math.BigDecimal[] P09412_A807RecExiRea ;
   private java.math.BigDecimal[] P09412_A808RecExiTcc ;
   private java.math.BigDecimal[] P09412_A806RecExiRcc ;
}

final  class existenciassr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09412", "SELECT RecFec, PrdNum, EmprCod, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

