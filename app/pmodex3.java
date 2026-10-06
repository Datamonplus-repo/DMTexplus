package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodex3 extends GXProcedure
{
   public pmodex3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodex3.class ), "" );
   }

   public pmodex3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            java.math.BigDecimal[] aP2 ,
                            java.math.BigDecimal[] aP3 ,
                            java.math.BigDecimal[] aP4 )
   {
      pmodex3.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 )
   {
      pmodex3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodex3.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pmodex3.this.AV18OldExis = aP2[0];
      this.aP2 = aP2;
      pmodex3.this.AV15ExiReaAlm = aP3[0];
      this.aP3 = aP3;
      pmodex3.this.AV19UniDev = aP4[0];
      this.aP4 = aP4;
      pmodex3.this.AV20PreMov = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P00VM2 */
      pr_default.execute(0, new Object[] {AV15ExiReaAlm, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodex3.this.A396EmprCod;
      this.aP1[0] = pmodex3.this.A719PrdNum;
      this.aP2[0] = pmodex3.this.AV18OldExis;
      this.aP3[0] = pmodex3.this.AV15ExiReaAlm;
      this.aP4[0] = pmodex3.this.AV19UniDev;
      this.aP5[0] = pmodex3.this.AV20PreMov;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodex3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A704PrdExiAlm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodex3__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV20PreMov ;
   private short Gx_err ;
   private java.math.BigDecimal AV18OldExis ;
   private java.math.BigDecimal AV15ExiReaAlm ;
   private java.math.BigDecimal AV19UniDev ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private short[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pmodex3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00VM2", "UPDATE TXPPRODUC SET PrdExiAlm=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

