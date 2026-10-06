package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodprp extends GXProcedure
{
   public pmodprp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodprp.class ), "" );
   }

   public pmodprp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          String aP2 ,
                          java.math.BigDecimal[] aP3 )
   {
      pmodprp.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 )
   {
      pmodprp.this.A396EmprCod = aP0;
      pmodprp.this.A756PrePrvNum = aP1;
      pmodprp.this.A719PrdNum = aP2;
      pmodprp.this.AV16Cantidad = aP3[0];
      this.aP3 = aP3;
      pmodprp.this.AV15PedCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P003Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A755PrePedUni = P003Y2_A755PrePedUni[0] ;
         n755PrePedUni = P003Y2_n755PrePedUni[0] ;
         A658PedCod = P003Y2_A658PedCod[0] ;
         n658PedCod = P003Y2_n658PedCod[0] ;
         A751PrePedCon = P003Y2_A751PrePedCon[0] ;
         n751PrePedCon = P003Y2_n751PrePedCon[0] ;
         A755PrePedUni = AV16Cantidad ;
         n755PrePedUni = false ;
         A658PedCod = AV15PedCod ;
         n658PedCod = false ;
         A751PrePedCon = httpContext.getMessage( "S", "") ;
         n751PrePedCon = false ;
         /* Using cursor P003Y3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n755PrePedUni), A755PrePedUni, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n751PrePedCon), A751PrePedCon, A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pmodprp.this.AV16Cantidad;
      this.aP4[0] = pmodprp.this.AV15PedCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodprp");
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
      P003Y2_A396EmprCod = new String[] {""} ;
      P003Y2_A756PrePrvNum = new int[1] ;
      P003Y2_A719PrdNum = new String[] {""} ;
      P003Y2_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Y2_n755PrePedUni = new boolean[] {false} ;
      P003Y2_A658PedCod = new int[1] ;
      P003Y2_n658PedCod = new boolean[] {false} ;
      P003Y2_A751PrePedCon = new String[] {""} ;
      P003Y2_n751PrePedCon = new boolean[] {false} ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A751PrePedCon = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodprp__default(),
         new Object[] {
             new Object[] {
            P003Y2_A396EmprCod, P003Y2_A756PrePrvNum, P003Y2_A719PrdNum, P003Y2_A755PrePedUni, P003Y2_n755PrePedUni, P003Y2_A658PedCod, P003Y2_n658PedCod, P003Y2_A751PrePedCon, P003Y2_n751PrePedCon
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A756PrePrvNum ;
   private int AV15PedCod ;
   private int A658PedCod ;
   private java.math.BigDecimal AV16Cantidad ;
   private java.math.BigDecimal A755PrePedUni ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A751PrePedCon ;
   private boolean n755PrePedUni ;
   private boolean n658PedCod ;
   private boolean n751PrePedCon ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P003Y2_A396EmprCod ;
   private int[] P003Y2_A756PrePrvNum ;
   private String[] P003Y2_A719PrdNum ;
   private java.math.BigDecimal[] P003Y2_A755PrePedUni ;
   private boolean[] P003Y2_n755PrePedUni ;
   private int[] P003Y2_A658PedCod ;
   private boolean[] P003Y2_n658PedCod ;
   private String[] P003Y2_A751PrePedCon ;
   private boolean[] P003Y2_n751PrePedCon ;
}

final  class pmodprp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003Y2", "SELECT EmprCod, PrePrvNum, PrdNum, PrePedUni, PedCod, PrePedCon FROM TXPPREPED WHERE EmprCod = ? and PrePrvNum = ? and PrdNum = ? ORDER BY EmprCod, PrePrvNum, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P003Y3", "UPDATE TXPPREPED SET PrePedUni=?, PedCod=?, PrePedCon=?  WHERE EmprCod = ? AND PrePrvNum = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREPED")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 6);
               return;
      }
   }

}

