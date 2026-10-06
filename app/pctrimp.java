package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrimp extends GXProcedure
{
   public pctrimp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrimp.class ), "" );
   }

   public pctrimp( int remoteHandle ,
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
      pctrimp.this.aP4 = new String[] {""};
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
      pctrimp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrimp.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pctrimp.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrimp.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrimp.this.AV8UsurCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01XC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2836BarPle2 = P01XC2_A2836BarPle2[0] ;
         A2836BarPle2 = AV8UsurCod + " " + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + Gx_time ;
         /* Using cursor P01XC3 */
         pr_default.execute(1, new Object[] {A2836BarPle2, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrimp.this.A396EmprCod;
      this.aP1[0] = pctrimp.this.A129BarCod;
      this.aP2[0] = pctrimp.this.A132BarCodReo;
      this.aP3[0] = pctrimp.this.A130BarCodPar;
      this.aP4[0] = pctrimp.this.AV8UsurCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pctrimp");
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
      P01XC2_A396EmprCod = new String[] {""} ;
      P01XC2_A129BarCod = new int[1] ;
      P01XC2_A132BarCodReo = new byte[1] ;
      P01XC2_A130BarCodPar = new String[] {""} ;
      P01XC2_A2836BarPle2 = new String[] {""} ;
      A2836BarPle2 = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrimp__default(),
         new Object[] {
             new Object[] {
            P01XC2_A396EmprCod, P01XC2_A129BarCod, P01XC2_A132BarCodReo, P01XC2_A130BarCodPar, P01XC2_A2836BarPle2
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
   private String A2836BarPle2 ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01XC2_A396EmprCod ;
   private int[] P01XC2_A129BarCod ;
   private byte[] P01XC2_A132BarCodReo ;
   private String[] P01XC2_A130BarCodPar ;
   private String[] P01XC2_A2836BarPle2 ;
}

final  class pctrimp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01XC2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPle2 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01XC3", "UPDATE TXPBARCAD SET BarPle2=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

