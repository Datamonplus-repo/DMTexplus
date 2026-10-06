package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmemocant extends GXProcedure
{
   public pmemocant( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmemocant.class ), "" );
   }

   public pmemocant( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 )
   {
      pmemocant.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.util.Date[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 )
   {
      pmemocant.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmemocant.this.AV19PrdNum = aP1[0];
      this.aP1 = aP1;
      pmemocant.this.AV17FecRec = aP2[0];
      this.aP2 = aP2;
      pmemocant.this.AV15ExiReaAlm = aP3[0];
      this.aP3 = aP3;
      pmemocant.this.AV16ExiReaCC = aP4[0];
      this.aP4 = aP4;
      pmemocant.this.AV18Preco_mov = aP5[0];
      this.aP5 = aP5;
      pmemocant.this.AV20recFecHr = aP6[0];
      this.aP6 = aP6;
      pmemocant.this.AV21RecUbic = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P04FW2 */
      pr_default.execute(0, new Object[] {AV21RecUbic, AV16ExiReaCC, AV15ExiReaAlm, A396EmprCod, AV19PrdNum, AV17FecRec});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmemocant.this.A396EmprCod;
      this.aP1[0] = pmemocant.this.AV19PrdNum;
      this.aP2[0] = pmemocant.this.AV17FecRec;
      this.aP3[0] = pmemocant.this.AV15ExiReaAlm;
      this.aP4[0] = pmemocant.this.AV16ExiReaCC;
      this.aP5[0] = pmemocant.this.AV18Preco_mov;
      this.aP6[0] = pmemocant.this.AV20recFecHr;
      this.aP7[0] = pmemocant.this.AV21RecUbic;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmemocant");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A11195RecUbic = "" ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmemocant__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV15ExiReaAlm ;
   private java.math.BigDecimal AV16ExiReaCC ;
   private java.math.BigDecimal AV18Preco_mov ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A807RecExiRea ;
   private String A396EmprCod ;
   private String AV19PrdNum ;
   private String AV21RecUbic ;
   private String A11195RecUbic ;
   private java.util.Date AV20recFecHr ;
   private java.util.Date AV17FecRec ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
}

final  class pmemocant__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04FW2", "UPDATE TXPRECUEN SET RecMemCant=1, RecUbic=?, RecExiRcc=?, RecExiRea=?  WHERE EmprCod = ? and PrdNum = ? and RecFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECUEN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
      }
   }

}

