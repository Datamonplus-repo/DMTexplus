package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psumxk extends GXProcedure
{
   public psumxk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psumxk.class ), "" );
   }

   public psumxk( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 )
   {
      psumxk.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      psumxk.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psumxk.this.A4882XDisCod = aP1[0];
      this.aP1 = aP1;
      psumxk.this.AV8XSumCant = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8XSumCant = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P03BK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4891XCantPdas = P03BK2_A4891XCantPdas[0] ;
         n4891XCantPdas = P03BK2_n4891XCantPdas[0] ;
         A4890XPdasNum = P03BK2_A4890XPdasNum[0] ;
         n4890XPdasNum = P03BK2_n4890XPdasNum[0] ;
         A4889XLinMan = P03BK2_A4889XLinMan[0] ;
         AV8XSumCant = AV8XSumCant.add(((DecimalUtil.doubleToDec(A4890XPdasNum).multiply(A4891XCantPdas)))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psumxk.this.A396EmprCod;
      this.aP1[0] = psumxk.this.A4882XDisCod;
      this.aP2[0] = psumxk.this.AV8XSumCant;
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
      P03BK2_A396EmprCod = new String[] {""} ;
      P03BK2_A4882XDisCod = new int[1] ;
      P03BK2_A4891XCantPdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BK2_n4891XCantPdas = new boolean[] {false} ;
      P03BK2_A4890XPdasNum = new short[1] ;
      P03BK2_n4890XPdasNum = new boolean[] {false} ;
      P03BK2_A4889XLinMan = new short[1] ;
      A4891XCantPdas = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psumxk__default(),
         new Object[] {
             new Object[] {
            P03BK2_A396EmprCod, P03BK2_A4882XDisCod, P03BK2_A4891XCantPdas, P03BK2_n4891XCantPdas, P03BK2_A4890XPdasNum, P03BK2_n4890XPdasNum, P03BK2_A4889XLinMan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4890XPdasNum ;
   private short A4889XLinMan ;
   private short Gx_err ;
   private int A4882XDisCod ;
   private java.math.BigDecimal AV8XSumCant ;
   private java.math.BigDecimal A4891XCantPdas ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n4891XCantPdas ;
   private boolean n4890XPdasNum ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03BK2_A396EmprCod ;
   private int[] P03BK2_A4882XDisCod ;
   private java.math.BigDecimal[] P03BK2_A4891XCantPdas ;
   private boolean[] P03BK2_n4891XCantPdas ;
   private short[] P03BK2_A4890XPdasNum ;
   private boolean[] P03BK2_n4890XPdasNum ;
   private short[] P03BK2_A4889XLinMan ;
}

final  class psumxk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03BK2", "SELECT EmprCod, XDisCod, XCantPdas, XPdasNum, XLinMan FROM TXPXGEHD2 WHERE EmprCod = ? and XDisCod = ? ORDER BY EmprCod, XDisCod, XLinMan ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
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

