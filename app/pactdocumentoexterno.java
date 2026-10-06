package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactdocumentoexterno extends GXProcedure
{
   public pactdocumentoexterno( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactdocumentoexterno.class ), "" );
   }

   public pactdocumentoexterno( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pactdocumentoexterno.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pactdocumentoexterno.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactdocumentoexterno.this.AV16SalExtAlb = aP1[0];
      this.aP1 = aP1;
      pactdocumentoexterno.this.AV19usurcod = aP2[0];
      this.aP2 = aP2;
      pactdocumentoexterno.this.AV20station = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21inc_obs = " " ;
      /* Using cursor P05ZK2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2253SalExtAlb = P05ZK2_A2253SalExtAlb[0] ;
         A396EmprCod = P05ZK2_A396EmprCod[0] ;
         A2256SalExtFec = P05ZK2_A2256SalExtFec[0] ;
         A10080SalSts = P05ZK2_A10080SalSts[0] ;
         AV21inc_obs = httpContext.getMessage( "Activo Documento ", "") + GXutil.str( A2253SalExtAlb, 8, 0) + GXutil.newLine( ) ;
         AV21inc_obs += httpContext.getMessage( "Cambio Estado ", "") + A10080SalSts + httpContext.getMessage( " por ", "") ;
         A10080SalSts = " " ;
         /* Using cursor P05ZK3 */
         pr_default.execute(1, new Object[] {A10080SalSts, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV21inc_obs, " ") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( AV15EmprCod, AV25Pgmname, AV19usurcod, AV20station, AV21inc_obs, AV16SalExtAlb, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactdocumentoexterno.this.AV15EmprCod;
      this.aP1[0] = pactdocumentoexterno.this.AV16SalExtAlb;
      this.aP2[0] = pactdocumentoexterno.this.AV19usurcod;
      this.aP3[0] = pactdocumentoexterno.this.AV20station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactdocumentoexterno");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21inc_obs = "" ;
      scmdbuf = "" ;
      P05ZK2_A2253SalExtAlb = new int[1] ;
      P05ZK2_A396EmprCod = new String[] {""} ;
      P05ZK2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05ZK2_A10080SalSts = new String[] {""} ;
      A396EmprCod = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A10080SalSts = "" ;
      AV25Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactdocumentoexterno__default(),
         new Object[] {
             new Object[] {
            P05ZK2_A2253SalExtAlb, P05ZK2_A396EmprCod, P05ZK2_A2256SalExtFec, P05ZK2_A10080SalSts
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmname = "PActDocumentoExterno" ;
      /* GeneXus formulas. */
      AV25Pgmname = "PActDocumentoExterno" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16SalExtAlb ;
   private int A2253SalExtAlb ;
   private String AV15EmprCod ;
   private String AV19usurcod ;
   private String AV20station ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A10080SalSts ;
   private String AV25Pgmname ;
   private java.util.Date A2256SalExtFec ;
   private String AV21inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P05ZK2_A2253SalExtAlb ;
   private String[] P05ZK2_A396EmprCod ;
   private java.util.Date[] P05ZK2_A2256SalExtFec ;
   private String[] P05ZK2_A10080SalSts ;
}

final  class pactdocumentoexterno__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05ZK2", "SELECT SalExtAlb, EmprCod, SalExtFec, SalSts FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05ZK3", "UPDATE TXPCEXTSA SET SalSts=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

