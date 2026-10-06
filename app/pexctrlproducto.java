package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexctrlproducto extends GXProcedure
{
   public pexctrlproducto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexctrlproducto.class ), "" );
   }

   public pexctrlproducto( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pexctrlproducto.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 )
   {
      pexctrlproducto.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexctrlproducto.this.AV8Prdnum = aP1[0];
      this.aP1 = aP1;
      pexctrlproducto.this.AV9Cant = aP2[0];
      this.aP2 = aP2;
      pexctrlproducto.this.AV10oldCant = aP3[0];
      this.aP3 = aP3;
      pexctrlproducto.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      /* Using cursor P05ZF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Prdnum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05ZF2_A719PrdNum[0] ;
         A704PrdExiAlm = P05ZF2_A704PrdExiAlm[0] ;
         AV11PrdExialm = A704PrdExiAlm.add(AV10oldCant) ;
         if ( DecimalUtil.compareTo(AV9Cant, AV11PrdExialm) > 0 )
         {
            Gx_msg = httpContext.getMessage( "Atencion. Cantidad introducida ", "") + GXutil.str( AV9Cant, 9, 2) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "superior a las existencias ", "") + GXutil.str( AV11PrdExialm, 12, 4) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexctrlproducto.this.A396EmprCod;
      this.aP1[0] = pexctrlproducto.this.AV8Prdnum;
      this.aP2[0] = pexctrlproducto.this.AV9Cant;
      this.aP3[0] = pexctrlproducto.this.AV10oldCant;
      this.aP4[0] = pexctrlproducto.this.Gx_msg;
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
      P05ZF2_A396EmprCod = new String[] {""} ;
      P05ZF2_A719PrdNum = new String[] {""} ;
      P05ZF2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      AV11PrdExialm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexctrlproducto__default(),
         new Object[] {
             new Object[] {
            P05ZF2_A396EmprCod, P05ZF2_A719PrdNum, P05ZF2_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV9Cant ;
   private java.math.BigDecimal AV10oldCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV11PrdExialm ;
   private String A396EmprCod ;
   private String AV8Prdnum ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05ZF2_A396EmprCod ;
   private String[] P05ZF2_A719PrdNum ;
   private java.math.BigDecimal[] P05ZF2_A704PrdExiAlm ;
}

final  class pexctrlproducto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05ZF2", "SELECT EmprCod, PrdNum, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
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
      }
   }

}

