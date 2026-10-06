package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pptaes00 extends GXProcedure
{
   public pptaes00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pptaes00.class ), "" );
   }

   public pptaes00( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            short[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            java.math.BigDecimal[] aP5 )
   {
      pptaes00.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 )
   {
      pptaes00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pptaes00.this.AV17TaesId = aP1[0];
      this.aP1 = aP1;
      pptaes00.this.AV18TaesDc = aP2[0];
      this.aP2 = aP2;
      pptaes00.this.AV19TaesLn = aP3[0];
      this.aP3 = aP3;
      pptaes00.this.AV20TaesVi = aP4[0];
      this.aP4 = aP4;
      pptaes00.this.AV21TaesVf = aP5[0];
      this.aP5 = aP5;
      pptaes00.this.AV22TaesLnP = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n11640TaesUltLnP = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04NV2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n11640TaesUltLnP), Short.valueOf(AV22TaesLnP), A396EmprCod, AV17TaesId, Short.valueOf(AV19TaesLn)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES01");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pptaes00.this.A396EmprCod;
      this.aP1[0] = pptaes00.this.AV17TaesId;
      this.aP2[0] = pptaes00.this.AV18TaesDc;
      this.aP3[0] = pptaes00.this.AV19TaesLn;
      this.aP4[0] = pptaes00.this.AV20TaesVi;
      this.aP5[0] = pptaes00.this.AV21TaesVf;
      this.aP6[0] = pptaes00.this.AV22TaesLnP;
      Application.commitDataStores(context, remoteHandle, pr_default, "pptaes00");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pptaes00__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV19TaesLn ;
   private short AV22TaesLnP ;
   private short A11640TaesUltLnP ;
   private short Gx_err ;
   private java.math.BigDecimal AV20TaesVi ;
   private java.math.BigDecimal AV21TaesVf ;
   private String A396EmprCod ;
   private String AV17TaesId ;
   private String AV18TaesDc ;
   private boolean n11640TaesUltLnP ;
   private short[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class pptaes00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04NV2", "UPDATE TXPTAES01 SET TaesUltLnP=?  WHERE EmprCod = ? and TaesId = ? and TaesLn = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTAES01")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

