package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrusu extends GXProcedure
{
   public pctrusu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrusu.class ), "" );
   }

   public pctrusu( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pctrusu.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pctrusu.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrusu.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pctrusu.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrusu.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrusu.this.AV8UsurCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01XB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4837BarAudSupN = P01XB2_A4837BarAudSupN[0] ;
         n4837BarAudSupN = P01XB2_n4837BarAudSupN[0] ;
         A4837BarAudSupN = AV8UsurCod + " " + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + Gx_time ;
         n4837BarAudSupN = false ;
         /* Using cursor P01XB3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4837BarAudSupN), A4837BarAudSupN, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrusu.this.A396EmprCod;
      this.aP1[0] = pctrusu.this.A129BarCod;
      this.aP2[0] = pctrusu.this.A132BarCodReo;
      this.aP3[0] = pctrusu.this.A130BarCodPar;
      this.aP4[0] = pctrusu.this.AV8UsurCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pctrusu");
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
      P01XB2_A396EmprCod = new String[] {""} ;
      P01XB2_A129BarCod = new int[1] ;
      P01XB2_A132BarCodReo = new byte[1] ;
      P01XB2_A130BarCodPar = new String[] {""} ;
      P01XB2_A4837BarAudSupN = new String[] {""} ;
      P01XB2_n4837BarAudSupN = new boolean[] {false} ;
      A4837BarAudSupN = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrusu__default(),
         new Object[] {
             new Object[] {
            P01XB2_A396EmprCod, P01XB2_A129BarCod, P01XB2_A132BarCodReo, P01XB2_A130BarCodPar, P01XB2_A4837BarAudSupN, P01XB2_n4837BarAudSupN
            }
            , new Object[] {
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8UsurCod ;
   private String scmdbuf ;
   private String A4837BarAudSupN ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n4837BarAudSupN ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01XB2_A396EmprCod ;
   private int[] P01XB2_A129BarCod ;
   private byte[] P01XB2_A132BarCodReo ;
   private String[] P01XB2_A130BarCodPar ;
   private String[] P01XB2_A4837BarAudSupN ;
   private boolean[] P01XB2_n4837BarAudSupN ;
}

final  class pctrusu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01XB2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudSupN FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01XB3", "UPDATE TXPBARCAD SET BarAudSupN=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

