package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusstk extends GXProcedure
{
   public pbusstk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusstk.class ), "" );
   }

   public pbusstk( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 )
   {
      pbusstk.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pbusstk.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusstk.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pbusstk.this.AV15AlbRPieDis = aP2[0];
      this.aP2 = aP2;
      pbusstk.this.AV16AlbRUniDis = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P009K2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A60AlbRUniUti = P009K2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P009K2_A58AlbRUniEnt[0] ;
         A54AlbRPieUti = P009K2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P009K2_A52AlbRPieEnt[0] ;
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         AV15AlbRPieDis = A51AlbRPieDis ;
         AV16AlbRUniDis = A57AlbRUniDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusstk.this.A396EmprCod;
      this.aP1[0] = pbusstk.this.A44AlbRecCod;
      this.aP2[0] = pbusstk.this.AV15AlbRPieDis;
      this.aP3[0] = pbusstk.this.AV16AlbRUniDis;
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
      P009K2_A396EmprCod = new String[] {""} ;
      P009K2_A44AlbRecCod = new int[1] ;
      P009K2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009K2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009K2_A54AlbRPieUti = new int[1] ;
      P009K2_A52AlbRPieEnt = new int[1] ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusstk__default(),
         new Object[] {
             new Object[] {
            P009K2_A396EmprCod, P009K2_A44AlbRecCod, P009K2_A60AlbRUniUti, P009K2_A58AlbRUniEnt, P009K2_A54AlbRPieUti, P009K2_A52AlbRPieEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV15AlbRPieDis ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private java.math.BigDecimal AV16AlbRUniDis ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P009K2_A396EmprCod ;
   private int[] P009K2_A44AlbRecCod ;
   private java.math.BigDecimal[] P009K2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P009K2_A58AlbRUniEnt ;
   private int[] P009K2_A54AlbRPieUti ;
   private int[] P009K2_A52AlbRPieEnt ;
}

final  class pbusstk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P009K2", "SELECT EmprCod, AlbRecCod, AlbRUniUti, AlbRUniEnt, AlbRPieUti, AlbRPieEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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

