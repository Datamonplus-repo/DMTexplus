package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuscolt extends GXProcedure
{
   public pbuscolt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuscolt.class ), "" );
   }

   public pbuscolt( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      pbuscolt.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      pbuscolt.this.A396EmprCod = aP0;
      pbuscolt.this.AV13Forcolnum = aP1;
      pbuscolt.this.AV17ToE = aP2;
      pbuscolt.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Colnum_a = GXutil.trim( GXutil.str( AV13Forcolnum, 6, 0)) ;
      AV14MatColnom = " " ;
      AV15Matcod = (short)(GXutil.lval( GXutil.substring( AV16Colnum_a, 1, 1))) ;
      /* Using cursor P032N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV15Matcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A626MatCod = P032N2_A626MatCod[0] ;
         A8013MatColNom = P032N2_A8013MatColNom[0] ;
         n8013MatColNom = P032N2_n8013MatColNom[0] ;
         AV14MatColnom = A8013MatColNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV17ToE, httpContext.getMessage( "T", "")) == 0 )
      {
         if ( GXutil.strcmp(AV14MatColnom, " ") == 0 )
         {
            Gx_msg = httpContext.getMessage( "Atencion el sistema ha detectado", "") + GXutil.newLine( ) + httpContext.getMessage( "que para la tonalidad= ", "") + GXutil.str( AV15Matcod, 3, 0) + GXutil.newLine( ) + httpContext.getMessage( "no hay asociado un Nombre de Color ¡¡¡", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pbuscolt.this.AV14MatColnom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14MatColnom = "" ;
      AV16Colnum_a = "" ;
      scmdbuf = "" ;
      P032N2_A396EmprCod = new String[] {""} ;
      P032N2_A626MatCod = new short[1] ;
      P032N2_A8013MatColNom = new String[] {""} ;
      P032N2_n8013MatColNom = new boolean[] {false} ;
      A8013MatColNom = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuscolt__default(),
         new Object[] {
             new Object[] {
            P032N2_A396EmprCod, P032N2_A626MatCod, P032N2_A8013MatColNom, P032N2_n8013MatColNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15Matcod ;
   private short A626MatCod ;
   private short Gx_err ;
   private int AV13Forcolnum ;
   private String A396EmprCod ;
   private String AV17ToE ;
   private String AV14MatColnom ;
   private String AV16Colnum_a ;
   private String scmdbuf ;
   private String A8013MatColNom ;
   private String Gx_msg ;
   private boolean n8013MatColNom ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P032N2_A396EmprCod ;
   private short[] P032N2_A626MatCod ;
   private String[] P032N2_A8013MatColNom ;
   private boolean[] P032N2_n8013MatColNom ;
}

final  class pbuscolt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P032N2", "SELECT EmprCod, MatCod, MatColNom FROM TXPMATICE WHERE EmprCod = ? and MatCod = ? ORDER BY EmprCod, MatCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

