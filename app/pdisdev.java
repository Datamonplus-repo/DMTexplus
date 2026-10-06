package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisdev extends GXProcedure
{
   public pdisdev( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisdev.class ), "" );
   }

   public pdisdev( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pdisdev.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      pdisdev.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisdev.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pdisdev.this.aP2 = aP2;
      pdisdev.this.aP3 = aP3;
      pdisdev.this.aP4 = aP4;
      pdisdev.this.aP5 = aP5;
      pdisdev.this.AV19AlbRUni = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P006X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A54AlbRPieUti = P006X2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P006X2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P006X2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P006X2_A58AlbRUniEnt[0] ;
         A56AlbRUni = P006X2_A56AlbRUni[0] ;
         AV15AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV16AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         AV17AlbRPDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV18AlbRUDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         AV19AlbRUni = A56AlbRUni ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisdev.this.A396EmprCod;
      this.aP1[0] = pdisdev.this.A44AlbRecCod;
      this.aP2[0] = pdisdev.this.AV15AlbRPieDis;
      this.aP3[0] = pdisdev.this.AV16AlbRUniDis;
      this.aP4[0] = pdisdev.this.AV17AlbRPDis;
      this.aP5[0] = pdisdev.this.AV18AlbRUDis;
      this.aP6[0] = pdisdev.this.AV19AlbRUni;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16AlbRUniDis = DecimalUtil.ZERO ;
      AV18AlbRUDis = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P006X2_A396EmprCod = new String[] {""} ;
      P006X2_A44AlbRecCod = new int[1] ;
      P006X2_A54AlbRPieUti = new int[1] ;
      P006X2_A52AlbRPieEnt = new int[1] ;
      P006X2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006X2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006X2_A56AlbRUni = new String[] {""} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisdev__default(),
         new Object[] {
             new Object[] {
            P006X2_A396EmprCod, P006X2_A44AlbRecCod, P006X2_A54AlbRPieUti, P006X2_A52AlbRPieEnt, P006X2_A60AlbRUniUti, P006X2_A58AlbRUniEnt, P006X2_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV15AlbRPieDis ;
   private int AV17AlbRPDis ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private java.math.BigDecimal AV16AlbRUniDis ;
   private java.math.BigDecimal AV18AlbRUDis ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String AV19AlbRUni ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P006X2_A396EmprCod ;
   private int[] P006X2_A44AlbRecCod ;
   private int[] P006X2_A54AlbRPieUti ;
   private int[] P006X2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P006X2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P006X2_A58AlbRUniEnt ;
   private String[] P006X2_A56AlbRUni ;
}

final  class pdisdev__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006X2", "SELECT EmprCod, AlbRecCod, AlbRPieUti, AlbRPieEnt, AlbRUniUti, AlbRUniEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               return;
      }
   }

}

