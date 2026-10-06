package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbdetpar extends GXProcedure
{
   public palbdetpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbdetpar.class ), "" );
   }

   public palbdetpar( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           short[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 )
   {
      palbdetpar.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      palbdetpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbdetpar.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      palbdetpar.this.A6615AlbRecPar = aP2[0];
      this.aP2 = aP2;
      palbdetpar.this.AV11AlbRUni = aP3[0];
      this.aP3 = aP3;
      palbdetpar.this.AV9AlbRecUniO = aP4[0];
      this.aP4 = aP4;
      palbdetpar.this.AV10AlbREcUniN = aP5[0];
      this.aP5 = aP5;
      palbdetpar.this.AV8AlbRecUni = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "Suma de Partida", "") + GXutil.chr( (short)(13)) ;
      AV8AlbRecUni = AV10AlbREcUniN.subtract(AV9AlbRecUniO) ;
      Gx_msg += httpContext.getMessage( "Antes : ", "") + GXutil.trim( GXutil.str( AV9AlbRecUniO, 10, 2)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Ahora : ", "") + GXutil.trim( GXutil.str( AV10AlbREcUniN, 10, 2)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Inicio : ", "") + GXutil.trim( GXutil.str( AV8AlbRecUni, 10, 2)) + GXutil.chr( (short)(13)) ;
      /* Using cursor P02KR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n6615AlbRecPar), Short.valueOf(A6615AlbRecPar)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2155AlbRecKgm = P02KR2_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = P02KR2_A2157AlbRecMtr[0] ;
         A2159AlbRecPie = P02KR2_A2159AlbRecPie[0] ;
         if ( GXutil.strcmp(AV11AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            AV8AlbRecUni = AV8AlbRecUni.add(A2155AlbRecKgm) ;
         }
         else
         {
            AV8AlbRecUni = AV8AlbRecUni.add(A2157AlbRecMtr) ;
         }
         Gx_msg += httpContext.getMessage( "Pieza : ", "") + A2159AlbRecPie + httpContext.getMessage( ", Total : ", "") + GXutil.trim( GXutil.str( AV8AlbRecUni, 10, 2)) + GXutil.chr( (short)(13)) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbdetpar.this.A396EmprCod;
      this.aP1[0] = palbdetpar.this.A44AlbRecCod;
      this.aP2[0] = palbdetpar.this.A6615AlbRecPar;
      this.aP3[0] = palbdetpar.this.AV11AlbRUni;
      this.aP4[0] = palbdetpar.this.AV9AlbRecUniO;
      this.aP5[0] = palbdetpar.this.AV10AlbREcUniN;
      this.aP6[0] = palbdetpar.this.AV8AlbRecUni;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P02KR2_A396EmprCod = new String[] {""} ;
      P02KR2_A44AlbRecCod = new int[1] ;
      P02KR2_A6615AlbRecPar = new short[1] ;
      P02KR2_n6615AlbRecPar = new boolean[] {false} ;
      P02KR2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02KR2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02KR2_A2159AlbRecPie = new String[] {""} ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2159AlbRecPie = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbdetpar__default(),
         new Object[] {
             new Object[] {
            P02KR2_A396EmprCod, P02KR2_A44AlbRecCod, P02KR2_A6615AlbRecPar, P02KR2_n6615AlbRecPar, P02KR2_A2155AlbRecKgm, P02KR2_A2157AlbRecMtr, P02KR2_A2159AlbRecPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A6615AlbRecPar ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV9AlbRecUniO ;
   private java.math.BigDecimal AV10AlbREcUniN ;
   private java.math.BigDecimal AV8AlbRecUni ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private String A396EmprCod ;
   private String AV11AlbRUni ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private boolean n6615AlbRecPar ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02KR2_A396EmprCod ;
   private int[] P02KR2_A44AlbRecCod ;
   private short[] P02KR2_A6615AlbRecPar ;
   private boolean[] P02KR2_n6615AlbRecPar ;
   private java.math.BigDecimal[] P02KR2_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P02KR2_A2157AlbRecMtr ;
   private String[] P02KR2_A2159AlbRecPie ;
}

final  class palbdetpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02KR2", "SELECT EmprCod, AlbRecCod, AlbRecPar, AlbRecKgm, AlbRecMtr, AlbRecPie FROM TXPALBDET WHERE (EmprCod = ? and AlbRecCod = ?) AND (AlbRecPar = ?) ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[6])[0] = rslt.getString(6, 9);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
      }
   }

}

