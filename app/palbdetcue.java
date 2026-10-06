package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbdetcue extends GXProcedure
{
   public palbdetcue( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbdetcue.class ), "" );
   }

   public palbdetcue( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           short[] aP2 ,
                                           short[] aP3 ,
                                           String[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 )
   {
      palbdetcue.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      palbdetcue.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbdetcue.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      palbdetcue.this.A6615AlbRecPar = aP2[0];
      this.aP2 = aP2;
      palbdetcue.this.A6616AlbRecCue = aP3[0];
      this.aP3 = aP3;
      palbdetcue.this.AV15AlbRUni = aP4[0];
      this.aP4 = aP4;
      palbdetcue.this.AV13AlbRecUniO = aP5[0];
      this.aP5 = aP5;
      palbdetcue.this.AV14AlbREcUniN = aP6[0];
      this.aP6 = aP6;
      palbdetcue.this.AV12AlbRecUni = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "Suma de Cuerda", "") + GXutil.chr( (short)(13)) ;
      AV12AlbRecUni = AV14AlbREcUniN.subtract(AV13AlbRecUniO) ;
      Gx_msg += httpContext.getMessage( "Antes : ", "") + GXutil.trim( GXutil.str( AV13AlbRecUniO, 10, 2)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Ahora : ", "") + GXutil.trim( GXutil.str( AV14AlbREcUniN, 10, 2)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Inicio : ", "") + GXutil.trim( GXutil.str( AV12AlbRecUni, 10, 2)) + GXutil.chr( (short)(13)) ;
      /* Using cursor P02KQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n6615AlbRecPar), Short.valueOf(A6615AlbRecPar), Boolean.valueOf(n6616AlbRecCue), Short.valueOf(A6616AlbRecCue)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2155AlbRecKgm = P02KQ2_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = P02KQ2_A2157AlbRecMtr[0] ;
         A2159AlbRecPie = P02KQ2_A2159AlbRecPie[0] ;
         if ( GXutil.strcmp(AV15AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            AV12AlbRecUni = AV12AlbRecUni.add(A2155AlbRecKgm) ;
         }
         else
         {
            AV12AlbRecUni = AV12AlbRecUni.add(A2157AlbRecMtr) ;
         }
         Gx_msg += httpContext.getMessage( "Pieza : ", "") + A2159AlbRecPie + httpContext.getMessage( ", Total : ", "") + GXutil.trim( GXutil.str( AV12AlbRecUni, 10, 2)) + GXutil.chr( (short)(13)) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbdetcue.this.A396EmprCod;
      this.aP1[0] = palbdetcue.this.A44AlbRecCod;
      this.aP2[0] = palbdetcue.this.A6615AlbRecPar;
      this.aP3[0] = palbdetcue.this.A6616AlbRecCue;
      this.aP4[0] = palbdetcue.this.AV15AlbRUni;
      this.aP5[0] = palbdetcue.this.AV13AlbRecUniO;
      this.aP6[0] = palbdetcue.this.AV14AlbREcUniN;
      this.aP7[0] = palbdetcue.this.AV12AlbRecUni;
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
      P02KQ2_A396EmprCod = new String[] {""} ;
      P02KQ2_A44AlbRecCod = new int[1] ;
      P02KQ2_A6615AlbRecPar = new short[1] ;
      P02KQ2_n6615AlbRecPar = new boolean[] {false} ;
      P02KQ2_A6616AlbRecCue = new short[1] ;
      P02KQ2_n6616AlbRecCue = new boolean[] {false} ;
      P02KQ2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02KQ2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02KQ2_A2159AlbRecPie = new String[] {""} ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2159AlbRecPie = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbdetcue__default(),
         new Object[] {
             new Object[] {
            P02KQ2_A396EmprCod, P02KQ2_A44AlbRecCod, P02KQ2_A6615AlbRecPar, P02KQ2_n6615AlbRecPar, P02KQ2_A6616AlbRecCue, P02KQ2_n6616AlbRecCue, P02KQ2_A2155AlbRecKgm, P02KQ2_A2157AlbRecMtr, P02KQ2_A2159AlbRecPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A6615AlbRecPar ;
   private short A6616AlbRecCue ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV13AlbRecUniO ;
   private java.math.BigDecimal AV14AlbREcUniN ;
   private java.math.BigDecimal AV12AlbRecUni ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private String A396EmprCod ;
   private String AV15AlbRUni ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private boolean n6615AlbRecPar ;
   private boolean n6616AlbRecCue ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02KQ2_A396EmprCod ;
   private int[] P02KQ2_A44AlbRecCod ;
   private short[] P02KQ2_A6615AlbRecPar ;
   private boolean[] P02KQ2_n6615AlbRecPar ;
   private short[] P02KQ2_A6616AlbRecCue ;
   private boolean[] P02KQ2_n6616AlbRecCue ;
   private java.math.BigDecimal[] P02KQ2_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P02KQ2_A2157AlbRecMtr ;
   private String[] P02KQ2_A2159AlbRecPie ;
}

final  class palbdetcue__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02KQ2", "SELECT EmprCod, AlbRecCod, AlbRecPar, AlbRecCue, AlbRecKgm, AlbRecMtr, AlbRecPie FROM TXPALBDET WHERE (EmprCod = ? and AlbRecCod = ?) AND (AlbRecPar = ?) AND (AlbRecCue = ?) ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[8])[0] = rslt.getString(7, 9);
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               return;
      }
   }

}

