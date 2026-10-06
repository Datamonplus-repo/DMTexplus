package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registrosmaquinas extends GXProcedure
{
   public registrosmaquinas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registrosmaquinas.class ), "" );
   }

   public registrosmaquinas( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           String aP1 ,
                           String aP2 ,
                           java.util.Date aP3 ,
                           java.util.Date aP4 ,
                           java.util.Date aP5 ,
                           java.util.Date aP6 )
   {
      registrosmaquinas.this.aP7 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        java.util.Date aP6 ,
                        long[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             java.util.Date aP6 ,
                             long[] aP7 )
   {
      registrosmaquinas.this.AV13EmprCod = aP0;
      registrosmaquinas.this.AV11MaqCod1 = aP1;
      registrosmaquinas.this.AV12MaqCod2 = aP2;
      registrosmaquinas.this.AV20Hisprofec1 = aP3;
      registrosmaquinas.this.AV18Horai = aP4;
      registrosmaquinas.this.AV21Hisprofec2 = aP5;
      registrosmaquinas.this.AV19Horaf = aP6;
      registrosmaquinas.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Fecha_hora = localUtil.dtoc( AV20Hisprofec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV18Horai, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV14HisProdti = localUtil.ctot( AV17Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV17Fecha_hora = localUtil.dtoc( AV21Hisprofec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV19Horaf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV15HisProdtF = localUtil.ctot( AV17Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV24CantidadRegistros = 0 ;
      /* Using cursor P0A232 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV11MaqCod1, AV14HisProdti, AV15HisProdtF, Byte.valueOf(AV16HisEstReo), Byte.valueOf(AV16HisEstReo), AV12MaqCod2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA232 = false ;
         A602MaqCod = P0A232_A602MaqCod[0] ;
         A396EmprCod = P0A232_A396EmprCod[0] ;
         A1525HisProKgr = P0A232_A1525HisProKgr[0] ;
         A3612HisProReo = P0A232_A3612HisProReo[0] ;
         A656ParCod = P0A232_A656ParCod[0] ;
         n656ParCod = P0A232_n656ParCod[0] ;
         A4441HisProDTF = P0A232_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A232_n4441HisProDTF[0] ;
         A558HisProFec = P0A232_A558HisProFec[0] ;
         A561HisProLin = P0A232_A561HisProLin[0] ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A232_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A232_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brkA232 = false ;
            A1525HisProKgr = P0A232_A1525HisProKgr[0] ;
            A558HisProFec = P0A232_A558HisProFec[0] ;
            A561HisProLin = P0A232_A561HisProLin[0] ;
            AV22HisProKgr = A1525HisProKgr ;
            brkA232 = true ;
            pr_default.readNext(0);
         }
         AV24CantidadRegistros = (long)(AV24CantidadRegistros+1) ;
         if ( ! brkA232 )
         {
            brkA232 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = registrosmaquinas.this.AV24CantidadRegistros;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Fecha_hora = "" ;
      AV14HisProdti = GXutil.resetTime( GXutil.nullDate() );
      AV15HisProdtF = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P0A232_A602MaqCod = new String[] {""} ;
      P0A232_A396EmprCod = new String[] {""} ;
      P0A232_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A232_A3612HisProReo = new byte[1] ;
      P0A232_A656ParCod = new short[1] ;
      P0A232_n656ParCod = new boolean[] {false} ;
      P0A232_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A232_n4441HisProDTF = new boolean[] {false} ;
      P0A232_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A232_A561HisProLin = new int[1] ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV22HisProKgr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.registrosmaquinas__default(),
         new Object[] {
             new Object[] {
            P0A232_A602MaqCod, P0A232_A396EmprCod, P0A232_A1525HisProKgr, P0A232_A3612HisProReo, P0A232_A656ParCod, P0A232_n656ParCod, P0A232_A4441HisProDTF, P0A232_n4441HisProDTF, P0A232_A558HisProFec, P0A232_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16HisEstReo ;
   private byte A3612HisProReo ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A561HisProLin ;
   private long AV24CantidadRegistros ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV22HisProKgr ;
   private String AV13EmprCod ;
   private String AV11MaqCod1 ;
   private String AV12MaqCod2 ;
   private String AV17Fecha_hora ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private java.util.Date AV18Horai ;
   private java.util.Date AV19Horaf ;
   private java.util.Date AV14HisProdti ;
   private java.util.Date AV15HisProdtF ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV20Hisprofec1 ;
   private java.util.Date AV21Hisprofec2 ;
   private java.util.Date A558HisProFec ;
   private boolean brkA232 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private long[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A232_A602MaqCod ;
   private String[] P0A232_A396EmprCod ;
   private java.math.BigDecimal[] P0A232_A1525HisProKgr ;
   private byte[] P0A232_A3612HisProReo ;
   private short[] P0A232_A656ParCod ;
   private boolean[] P0A232_n656ParCod ;
   private java.util.Date[] P0A232_A4441HisProDTF ;
   private boolean[] P0A232_n4441HisProDTF ;
   private java.util.Date[] P0A232_A558HisProFec ;
   private int[] P0A232_A561HisProLin ;
}

final  class registrosmaquinas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A232", "SELECT MaqCod, EmprCod, HisProKgr, HisProReo, ParCod, HisProDTF, HisProFec, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod >= ?) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) AND (MaqCod <= ?) ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
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
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
      }
   }

}

