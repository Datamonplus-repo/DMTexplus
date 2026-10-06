package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmqvokg extends GXProcedure
{
   public pmqvokg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmqvokg.class ), "" );
   }

   public pmqvokg( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           int[] aP3 ,
                                           int[] aP4 ,
                                           int[] aP5 )
   {
      pmqvokg.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pmqvokg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmqvokg.this.AV8Discod = aP1[0];
      this.aP1 = aP1;
      pmqvokg.this.AV9MaqCod = aP2[0];
      this.aP2 = aP2;
      pmqvokg.this.AV10MaqVolMax = aP3[0];
      this.aP3 = aP3;
      pmqvokg.this.AV12MaqVolMin = aP4[0];
      this.aP4 = aP4;
      pmqvokg.this.AV11MaqVolMed = aP5[0];
      this.aP5 = aP5;
      pmqvokg.this.AV13Kgs = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02BG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P02BG2_A602MaqCod[0] ;
         A624MaqVolMed = P02BG2_A624MaqVolMed[0] ;
         n624MaqVolMed = P02BG2_n624MaqVolMed[0] ;
         A623MaqVolMax = P02BG2_A623MaqVolMax[0] ;
         n623MaqVolMax = P02BG2_n623MaqVolMax[0] ;
         A625MaqVolMin = P02BG2_A625MaqVolMin[0] ;
         n625MaqVolMin = P02BG2_n625MaqVolMin[0] ;
         AV11MaqVolMed = A624MaqVolMed ;
         AV10MaqVolMax = A623MaqVolMax ;
         AV12MaqVolMin = A625MaqVolMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV13Kgs = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P02BG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8Discod)});
      c595Kilos = P02BG3_A595Kilos[0] ;
      pr_default.close(1);
      AV13Kgs = AV13Kgs.add(c595Kilos) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmqvokg.this.A396EmprCod;
      this.aP1[0] = pmqvokg.this.AV8Discod;
      this.aP2[0] = pmqvokg.this.AV9MaqCod;
      this.aP3[0] = pmqvokg.this.AV10MaqVolMax;
      this.aP4[0] = pmqvokg.this.AV12MaqVolMin;
      this.aP5[0] = pmqvokg.this.AV11MaqVolMed;
      this.aP6[0] = pmqvokg.this.AV13Kgs;
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
      P02BG2_A396EmprCod = new String[] {""} ;
      P02BG2_A602MaqCod = new String[] {""} ;
      P02BG2_A624MaqVolMed = new int[1] ;
      P02BG2_n624MaqVolMed = new boolean[] {false} ;
      P02BG2_A623MaqVolMax = new int[1] ;
      P02BG2_n623MaqVolMax = new boolean[] {false} ;
      P02BG2_A625MaqVolMin = new int[1] ;
      P02BG2_n625MaqVolMin = new boolean[] {false} ;
      A602MaqCod = "" ;
      c595Kilos = DecimalUtil.ZERO ;
      P02BG3_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmqvokg__default(),
         new Object[] {
             new Object[] {
            P02BG2_A396EmprCod, P02BG2_A602MaqCod, P02BG2_A624MaqVolMed, P02BG2_n624MaqVolMed, P02BG2_A623MaqVolMax, P02BG2_n623MaqVolMax, P02BG2_A625MaqVolMin, P02BG2_n625MaqVolMin
            }
            , new Object[] {
            P02BG3_A595Kilos
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Discod ;
   private int AV10MaqVolMax ;
   private int AV12MaqVolMin ;
   private int AV11MaqVolMed ;
   private int A624MaqVolMed ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private java.math.BigDecimal AV13Kgs ;
   private java.math.BigDecimal c595Kilos ;
   private String A396EmprCod ;
   private String AV9MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private boolean n624MaqVolMed ;
   private boolean n623MaqVolMax ;
   private boolean n625MaqVolMin ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BG2_A396EmprCod ;
   private String[] P02BG2_A602MaqCod ;
   private int[] P02BG2_A624MaqVolMed ;
   private boolean[] P02BG2_n624MaqVolMed ;
   private int[] P02BG2_A623MaqVolMax ;
   private boolean[] P02BG2_n623MaqVolMax ;
   private int[] P02BG2_A625MaqVolMin ;
   private boolean[] P02BG2_n625MaqVolMin ;
   private java.math.BigDecimal[] P02BG3_A595Kilos ;
}

final  class pmqvokg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BG2", "SELECT EmprCod, MaqCod, MaqVolMed, MaqVolMax, MaqVolMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02BG3", "SELECT SUM(Kilos) FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

