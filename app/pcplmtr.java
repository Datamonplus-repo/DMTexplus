package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcplmtr extends GXProcedure
{
   public pcplmtr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcplmtr.class ), "" );
   }

   public pcplmtr( int remoteHandle ,
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
      pcplmtr.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pcplmtr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcplmtr.this.A7434PLLNro = aP1[0];
      this.aP1 = aP1;
      pcplmtr.this.A7443LPLNro = aP2[0];
      this.aP2 = aP2;
      pcplmtr.this.A7459CPLCom = aP3[0];
      this.aP3 = aP3;
      pcplmtr.this.AV8CPLMtr = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Estoy en PcplMtr", "") );
      /* Optimized group. */
      /* Using cursor P02WQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7434PLLNro), Short.valueOf(A7443LPLNro), Short.valueOf(A7459CPLCom)});
      c7478PLMPieMtr = P02WQ2_A7478PLMPieMtr[0] ;
      n7478PLMPieMtr = P02WQ2_n7478PLMPieMtr[0] ;
      pr_default.close(0);
      AV8CPLMtr = AV8CPLMtr.add(c7478PLMPieMtr) ;
      /* End optimized group. */
      System.out.println( httpContext.getMessage( "Exit en PcplMtr", "") );
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
      GXv_char7[0] = AV17Pgmname ;
      GXv_int8[0] = GXt_int1 ;
      new app.ppllaeh(remoteHandle, context).execute( GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7, GXv_int8) ;
      pcplmtr.this.Gx_err = GXv_int2[0] ;
      context.globals.Gx_dbe = GXv_int3[0] ;
      context.globals.Gx_dbt = GXv_char4[0] ;
      pcplmtr.this.Gx_ope = GXv_char5[0] ;
      pcplmtr.this.Gx_etb = GXv_char6[0] ;
      pcplmtr.this.AV17Pgmname = GXv_char7[0] ;
      pcplmtr.this.GXt_int1 = GXv_int8[0] ;
      context.globals.Gx_eop = GXt_int1 ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcplmtr.this.A396EmprCod;
      this.aP1[0] = pcplmtr.this.A7434PLLNro;
      this.aP2[0] = pcplmtr.this.A7443LPLNro;
      this.aP3[0] = pcplmtr.this.A7459CPLCom;
      this.aP4[0] = pcplmtr.this.AV8CPLMtr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c7478PLMPieMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02WQ2_A7478PLMPieMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02WQ2_n7478PLMPieMtr = new boolean[] {false} ;
      GXv_int2 = new short[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      Gx_ope = "" ;
      GXv_char5 = new String[1] ;
      Gx_etb = "" ;
      GXv_char6 = new String[1] ;
      AV17Pgmname = "" ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcplmtr__default(),
         new Object[] {
             new Object[] {
            P02WQ2_A7478PLMPieMtr, P02WQ2_n7478PLMPieMtr
            }
         }
      );
      AV17Pgmname = "PCPLMtr" ;
      /* GeneXus formulas. */
      AV17Pgmname = "PCPLMtr" ;
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
   private java.math.BigDecimal AV8CPLMtr ;
   private java.math.BigDecimal c7478PLMPieMtr ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String GXv_char4[] ;
   private String Gx_ope ;
   private String GXv_char5[] ;
   private String Gx_etb ;
   private String GXv_char6[] ;
   private String AV17Pgmname ;
   private String GXv_char7[] ;
   private boolean n7478PLMPieMtr ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P02WQ2_A7478PLMPieMtr ;
   private boolean[] P02WQ2_n7478PLMPieMtr ;
}

final  class pcplmtr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02WQ2", "SELECT SUM(PLMPieMtr) FROM TXPPLLMed WHERE EmprCod = ? and PLLNro = ? and LPLNro = ? and CPLCom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

