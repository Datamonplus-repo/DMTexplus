package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdibdgb extends GXProcedure
{
   public pdibdgb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdibdgb.class ), "" );
   }

   public pdibdgb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 )
   {
      pdibdgb.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pdibdgb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdibdgb.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdibdgb.this.A1013DibCli = aP2[0];
      this.aP2 = aP2;
      pdibdgb.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      pdibdgb.this.AV9Msg_err = aP4[0];
      this.aP4 = aP4;
      pdibdgb.this.AV11Errd = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Msg_err = "" ;
      AV11Errd = (byte)(0) ;
      /* Using cursor P047S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7509DibFecBor = P047S2_A7509DibFecBor[0] ;
         n7509DibFecBor = P047S2_n7509DibFecBor[0] ;
         A10929DibAct = P047S2_A10929DibAct[0] ;
         n10929DibAct = P047S2_n10929DibAct[0] ;
         A1017DibFecEnt = P047S2_A1017DibFecEnt[0] ;
         n1017DibFecEnt = P047S2_n1017DibFecEnt[0] ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A7509DibFecBor)) && GXutil.resetTime(A7509DibFecBor).before( GXutil.resetTime( GXutil.today( ) )) )
         {
            AV9Msg_err = httpContext.getMessage( "AVISO.Dibujo DESGRABADO  ¡¡¡ ", "") + localUtil.dtoc( A7509DibFecBor, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
            AV11Errd = (byte)(1) ;
         }
         AV10Dibact = A10929DibAct ;
         if ( GXutil.strcmp(A10929DibAct, httpContext.getMessage( "N", "")) == 0 )
         {
            AV9Msg_err = httpContext.getMessage( "ERROR.Este Dibujo ESTA INACTIVO", "") ;
            AV11Errd = (byte)(1) ;
         }
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A1017DibFecEnt)) )
         {
            if ( GXutil.strcmp(AV9Msg_err, " ") != 0 )
            {
               AV9Msg_err += httpContext.getMessage( "AVISO. Dibujo no disponible para Produccion ¡¡¡", "") ;
            }
            else
            {
               AV9Msg_err = httpContext.getMessage( "AVISO. Dibujo no disponible para Produccion ¡¡¡", "") ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdibdgb.this.A396EmprCod;
      this.aP1[0] = pdibdgb.this.A252CliCod;
      this.aP2[0] = pdibdgb.this.A1013DibCli;
      this.aP3[0] = pdibdgb.this.A1014DibInt;
      this.aP4[0] = pdibdgb.this.AV9Msg_err;
      this.aP5[0] = pdibdgb.this.AV11Errd;
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
      P047S2_A396EmprCod = new String[] {""} ;
      P047S2_A1013DibCli = new String[] {""} ;
      P047S2_A252CliCod = new int[1] ;
      P047S2_A1014DibInt = new int[1] ;
      P047S2_A7509DibFecBor = new java.util.Date[] {GXutil.nullDate()} ;
      P047S2_n7509DibFecBor = new boolean[] {false} ;
      P047S2_A10929DibAct = new String[] {""} ;
      P047S2_n10929DibAct = new boolean[] {false} ;
      P047S2_A1017DibFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P047S2_n1017DibFecEnt = new boolean[] {false} ;
      A7509DibFecBor = GXutil.nullDate() ;
      A10929DibAct = "" ;
      A1017DibFecEnt = GXutil.nullDate() ;
      AV10Dibact = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdibdgb__default(),
         new Object[] {
             new Object[] {
            P047S2_A396EmprCod, P047S2_A1013DibCli, P047S2_A252CliCod, P047S2_A1014DibInt, P047S2_A7509DibFecBor, P047S2_n7509DibFecBor, P047S2_A10929DibAct, P047S2_n10929DibAct, P047S2_A1017DibFecEnt, P047S2_n1017DibFecEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Errd ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String AV9Msg_err ;
   private String scmdbuf ;
   private String A10929DibAct ;
   private String AV10Dibact ;
   private java.util.Date A7509DibFecBor ;
   private java.util.Date A1017DibFecEnt ;
   private boolean n7509DibFecBor ;
   private boolean n10929DibAct ;
   private boolean n1017DibFecEnt ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P047S2_A396EmprCod ;
   private String[] P047S2_A1013DibCli ;
   private int[] P047S2_A252CliCod ;
   private int[] P047S2_A1014DibInt ;
   private java.util.Date[] P047S2_A7509DibFecBor ;
   private boolean[] P047S2_n7509DibFecBor ;
   private String[] P047S2_A10929DibAct ;
   private boolean[] P047S2_n10929DibAct ;
   private java.util.Date[] P047S2_A1017DibFecEnt ;
   private boolean[] P047S2_n1017DibFecEnt ;
}

final  class pdibdgb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P047S2", "SELECT EmprCod, DibCli, CliCod, DibInt, DibFecBor, DibAct, DibFecEnt FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

