package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pptaes02 extends GXProcedure
{
   public pptaes02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pptaes02.class ), "" );
   }

   public pptaes02( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           short[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 )
   {
      pptaes02.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 )
   {
      pptaes02.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pptaes02.this.AV17TaesId = aP1[0];
      this.aP1 = aP1;
      pptaes02.this.AV18TaesDc = aP2[0];
      this.aP2 = aP2;
      pptaes02.this.AV19TaesLn = aP3[0];
      this.aP3 = aP3;
      pptaes02.this.AV20TaesVi = aP4[0];
      this.aP4 = aP4;
      pptaes02.this.AV21TaesVf = aP5[0];
      this.aP5 = aP5;
      pptaes02.this.AV15Existe_p = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Existe_p = (byte)(0) ;
      /* Using cursor P04NT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV17TaesId, Short.valueOf(AV19TaesLn)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11637TaesLn = P04NT2_A11637TaesLn[0] ;
         A11634TaesId = P04NT2_A11634TaesId[0] ;
         A11641TaesLnP = P04NT2_A11641TaesLnP[0] ;
         AV15Existe_p = (byte)(1) ;
         AV22TaesLnp = A11641TaesLnP ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV15Existe_p == 1 )
      {
         n11640TaesUltLnP = false ;
         /* Optimized UPDATE. */
         /* Using cursor P04NT3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n11640TaesUltLnP), Short.valueOf(AV22TaesLnp), A396EmprCod, AV17TaesId, Short.valueOf(AV19TaesLn)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES01");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pptaes02.this.A396EmprCod;
      this.aP1[0] = pptaes02.this.AV17TaesId;
      this.aP2[0] = pptaes02.this.AV18TaesDc;
      this.aP3[0] = pptaes02.this.AV19TaesLn;
      this.aP4[0] = pptaes02.this.AV20TaesVi;
      this.aP5[0] = pptaes02.this.AV21TaesVf;
      this.aP6[0] = pptaes02.this.AV15Existe_p;
      Application.commitDataStores(context, remoteHandle, pr_default, "pptaes02");
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
      P04NT2_A396EmprCod = new String[] {""} ;
      P04NT2_A11637TaesLn = new short[1] ;
      P04NT2_A11634TaesId = new String[] {""} ;
      P04NT2_A11641TaesLnP = new short[1] ;
      A11634TaesId = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pptaes02__default(),
         new Object[] {
             new Object[] {
            P04NT2_A396EmprCod, P04NT2_A11637TaesLn, P04NT2_A11634TaesId, P04NT2_A11641TaesLnP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Existe_p ;
   private short AV19TaesLn ;
   private short A11637TaesLn ;
   private short A11641TaesLnP ;
   private short AV22TaesLnp ;
   private short A11640TaesUltLnP ;
   private short Gx_err ;
   private java.math.BigDecimal AV20TaesVi ;
   private java.math.BigDecimal AV21TaesVf ;
   private String A396EmprCod ;
   private String AV17TaesId ;
   private String AV18TaesDc ;
   private String scmdbuf ;
   private String A11634TaesId ;
   private boolean n11640TaesUltLnP ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04NT2_A396EmprCod ;
   private short[] P04NT2_A11637TaesLn ;
   private String[] P04NT2_A11634TaesId ;
   private short[] P04NT2_A11641TaesLnP ;
}

final  class pptaes02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04NT2", "SELECT EmprCod, TaesLn, TaesId, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? and TaesId = ? and TaesLn = ? ORDER BY EmprCod, TaesId, TaesLn, TaesLnP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04NT3", "UPDATE TXPTAES01 SET TaesUltLnP=?  WHERE EmprCod = ? and TaesId = ? and TaesLn = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTAES01")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
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

