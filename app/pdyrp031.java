package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp031 extends GXProcedure
{
   public pdyrp031( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp031.class ), "" );
   }

   public pdyrp031( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pdyrp031.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pdyrp031.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp031.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp031.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp031.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdyrp031.this.AV8usurcod = aP4[0];
      this.aP4 = aP4;
      pdyrp031.this.AV9station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09B22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P09B22_A213BarSit[0] ;
         A3870BarFecLRe = P09B22_A3870BarFecLRe[0] ;
         if ( A213BarSit < 4 )
         {
            AV10Inc_obs = httpContext.getMessage( "Cambio Situacion.", "") + GXutil.newLine( ) ;
            AV10Inc_obs += httpContext.getMessage( "Situacion Actual= ", "") + GXutil.str( A213BarSit, 2, 0) + GXutil.newLine( ) ;
            AV10Inc_obs += httpContext.getMessage( "Situacion Nueva = ", "") + "4" ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV14Pgmname, AV8usurcod, AV9station, AV10Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = (byte)(4) ;
            A3870BarFecLRe = GXutil.serverDate( context, remoteHandle, pr_default) ;
         }
         /* Using cursor P09B23 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A213BarSit), A3870BarFecLRe, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp031.this.A396EmprCod;
      this.aP1[0] = pdyrp031.this.A129BarCod;
      this.aP2[0] = pdyrp031.this.A132BarCodReo;
      this.aP3[0] = pdyrp031.this.A130BarCodPar;
      this.aP4[0] = pdyrp031.this.AV8usurcod;
      this.aP5[0] = pdyrp031.this.AV9station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdyrp031");
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
      P09B22_A396EmprCod = new String[] {""} ;
      P09B22_A129BarCod = new int[1] ;
      P09B22_A132BarCodReo = new byte[1] ;
      P09B22_A130BarCodPar = new String[] {""} ;
      P09B22_A213BarSit = new byte[1] ;
      P09B22_A3870BarFecLRe = new java.util.Date[] {GXutil.nullDate()} ;
      A3870BarFecLRe = GXutil.nullDate() ;
      AV10Inc_obs = "" ;
      AV14Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp031__default(),
         new Object[] {
             new Object[] {
            P09B22_A396EmprCod, P09B22_A129BarCod, P09B22_A132BarCodReo, P09B22_A130BarCodPar, P09B22_A213BarSit, P09B22_A3870BarFecLRe
            }
            , new Object[] {
            }
         }
      );
      AV14Pgmname = "Pdyrp031" ;
      /* GeneXus formulas. */
      AV14Pgmname = "Pdyrp031" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8usurcod ;
   private String AV9station ;
   private String scmdbuf ;
   private String AV14Pgmname ;
   private java.util.Date A3870BarFecLRe ;
   private String AV10Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09B22_A396EmprCod ;
   private int[] P09B22_A129BarCod ;
   private byte[] P09B22_A132BarCodReo ;
   private String[] P09B22_A130BarCodPar ;
   private byte[] P09B22_A213BarSit ;
   private java.util.Date[] P09B22_A3870BarFecLRe ;
}

final  class pdyrp031__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09B22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit, BarFecLRe FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09B23", "UPDATE TXPBARCAD SET BarSit=?, BarFecLRe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

