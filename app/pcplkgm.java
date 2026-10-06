package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcplkgm extends GXProcedure
{
   public pcplkgm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcplkgm.class ), "" );
   }

   public pcplkgm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           short[] aP2 ,
                                           short[] aP3 )
   {
      pcplkgm.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pcplkgm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcplkgm.this.A7434PLLNro = aP1[0];
      this.aP1 = aP1;
      pcplkgm.this.A7443LPLNro = aP2[0];
      this.aP2 = aP2;
      pcplkgm.this.A7459CPLCom = aP3[0];
      this.aP3 = aP3;
      pcplkgm.this.AV8CPLKgm = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Estoy en Pcplkgm", "") );
      /* Optimized group. */
      /* Using cursor P02WP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7434PLLNro), Short.valueOf(A7443LPLNro), Short.valueOf(A7459CPLCom)});
      c7479PLMPieKgm = P02WP2_A7479PLMPieKgm[0] ;
      n7479PLMPieKgm = P02WP2_n7479PLMPieKgm[0] ;
      pr_default.close(0);
      AV8CPLKgm = AV8CPLKgm.add(c7479PLMPieKgm) ;
      /* End optimized group. */
      cleanup();
   }

   public void S111( )
   {
      /* 'ERRORHANDLER' Routine */
      returnInSub = false ;
      GXt_int1 = context.globals.Gx_eop ;
      GXv_int2[0] = Gx_err ;
      GXv_int3[0] = context.globals.Gx_dbe ;
      GXv_char4[0] = context.globals.Gx_dbt ;
      GXv_char5[0] = Gx_ope ;
      GXv_char6[0] = Gx_etb ;
      GXv_char7[0] = AV18Pgmname ;
      GXv_int8[0] = GXt_int1 ;
      new app.ppllaeh(remoteHandle, context).execute( GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7, GXv_int8) ;
      pcplkgm.this.Gx_err = GXv_int2[0] ;
      context.globals.Gx_dbe = GXv_int3[0] ;
      context.globals.Gx_dbt = GXv_char4[0] ;
      pcplkgm.this.Gx_ope = GXv_char5[0] ;
      pcplkgm.this.Gx_etb = GXv_char6[0] ;
      pcplkgm.this.AV18Pgmname = GXv_char7[0] ;
      pcplkgm.this.GXt_int1 = GXv_int8[0] ;
      context.globals.Gx_eop = GXt_int1 ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcplkgm.this.A396EmprCod;
      this.aP1[0] = pcplkgm.this.A7434PLLNro;
      this.aP2[0] = pcplkgm.this.A7443LPLNro;
      this.aP3[0] = pcplkgm.this.A7459CPLCom;
      this.aP4[0] = pcplkgm.this.AV8CPLKgm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c7479PLMPieKgm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02WP2_A7479PLMPieKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02WP2_n7479PLMPieKgm = new boolean[] {false} ;
      GXv_int2 = new short[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      Gx_ope = "" ;
      GXv_char5 = new String[1] ;
      Gx_etb = "" ;
      GXv_char6 = new String[1] ;
      AV18Pgmname = "" ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcplkgm__default(),
         new Object[] {
             new Object[] {
            P02WP2_A7479PLMPieKgm, P02WP2_n7479PLMPieKgm
            }
         }
      );
      AV18Pgmname = "PCPLKgm" ;
      /* GeneXus formulas. */
      AV18Pgmname = "PCPLKgm" ;
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int8[] ;
   private short A7443LPLNro ;
   private short A7459CPLCom ;
   private short Gx_err ;
   private short GXv_int2[] ;
   private int A7434PLLNro ;
   private int GXv_int3[] ;
   private java.math.BigDecimal AV8CPLKgm ;
   private java.math.BigDecimal c7479PLMPieKgm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String GXv_char4[] ;
   private String Gx_ope ;
   private String GXv_char5[] ;
   private String Gx_etb ;
   private String GXv_char6[] ;
   private String AV18Pgmname ;
   private String GXv_char7[] ;
   private boolean n7479PLMPieKgm ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P02WP2_A7479PLMPieKgm ;
   private boolean[] P02WP2_n7479PLMPieKgm ;
}

final  class pcplkgm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02WP2", "SELECT SUM(PLMPieKgm) FROM TXPPLLMed WHERE EmprCod = ? and PLLNro = ? and LPLNro = ? and CPLCom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

